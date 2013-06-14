package org.jenkinsci.plugins.artifact_compressor;

import hudson.Extension;
import hudson.Launcher;
import hudson.model.AbstractBuild;
import hudson.model.AbstractProject;
import hudson.model.Action;
import hudson.model.BuildListener;
import hudson.tasks.BuildStepDescriptor;
import hudson.tasks.BuildStepMonitor;
import hudson.tasks.Publisher;
import hudson.tasks.Recorder;

import java.io.IOException;
import java.io.Serializable;

import net.sf.json.JSONObject;

import org.kohsuke.stapler.StaplerRequest;

public class ArtifactCompressor extends Recorder implements Serializable {
	private static final long serialVersionUID = 4383716427396710604L;

	public BuildStepMonitor getRequiredMonitorService() {
		return BuildStepMonitor.BUILD;
	}

	@Override
	public boolean perform(AbstractBuild<?, ?> build, Launcher launcher, BuildListener listener) throws InterruptedException, IOException {
		ArtifactCompressAction action = new ArtifactCompressAction(build, listener);
		CompressDirectory.compress(build.getArtifactsDir());
		build.addAction(action);
		return true;
	}

	@Override
	public Action getProjectAction(AbstractProject<?, ?> project) {
		return new ArtifactCompressAction(project);
	}

	@Extension
	public static class DescriptorImpl extends BuildStepDescriptor<Publisher> {

		@Override
		public String getDisplayName() {
			return "Compress Archived Artifacts";
		}

		@Override
		public boolean isApplicable(@SuppressWarnings("rawtypes") Class<? extends AbstractProject> jobType) {
			return true;
		}

		@Override
		public Publisher newInstance(StaplerRequest req, JSONObject formData) throws hudson.model.Descriptor.FormException {
			return new ArtifactCompressor();
		}
	}
}
