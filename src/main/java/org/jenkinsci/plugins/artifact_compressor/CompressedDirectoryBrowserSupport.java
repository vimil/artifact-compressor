/*
 * The MIT License
 * 
 * Copyright (c) 2004-2010, Sun Microsystems, Inc., Kohsuke Kawaguchi, Erik Ramfelt
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package org.jenkinsci.plugins.artifact_compressor;

import hudson.model.ModelObject;

import java.io.File;
import java.io.IOException;

import javax.servlet.ServletException;

import net.java.truevfs.access.TFile;

import org.kohsuke.stapler.HttpResponse;
import org.kohsuke.stapler.StaplerRequest;
import org.kohsuke.stapler.StaplerResponse;

/**
 * Has convenience methods to serve file system.
 * <p>
 * This object can be used in a mix-in style to provide a directory browsing capability to a {@link ModelObject}.
 * 
 * @author Kohsuke Kawaguchi
 */
public class CompressedDirectoryBrowserSupport implements HttpResponse {
	public static void main(String[] args) throws Exception {
		TFile zipFile = new TFile(new File("C:/temp/test.zip"));
		System.out.println(zipFile.getUri());
	}

	public void generateResponse(StaplerRequest req, StaplerResponse rsp, Object node) throws IOException, ServletException {
		// TODO Auto-generated method stub

	}
}
