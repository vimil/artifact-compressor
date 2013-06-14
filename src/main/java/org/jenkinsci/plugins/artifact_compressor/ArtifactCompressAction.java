package org.jenkinsci.plugins.artifact_compressor;

import hudson.model.AbstractBuild;
import hudson.model.AbstractProject;
import hudson.model.ArtifactAction;
import hudson.model.BuildListener;
import hudson.model.InvisibleAction;
import hudson.model.Run;

import java.io.File;

import net.java.truevfs.access.TFile;

public class ArtifactCompressAction extends InvisibleAction implements ArtifactAction {

	public ArtifactCompressAction(AbstractBuild<?, ?> build, BuildListener listener) {}

	public ArtifactCompressAction(AbstractProject<?, ?> project) {

	}

	public File getArtifactsDir(Run<?, ?> run) {
		TFile tfile = new TFile(new File(new File(run.getRootDir(), "archive"), "artifacts.zip"));
		return new FileAdapter(tfile);
	}

}
