package org.jenkinsci.plugins.artifact_compressor;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.nio.file.Path;

import net.java.truevfs.access.TFile;
import net.java.truevfs.access.TFileInputStream;
import net.java.truevfs.access.TFileOutputStream;

public class FileAdapter extends File {
	private final TFile delegate;
	private static final long serialVersionUID = -942501846976679335L;

	public FileAdapter(TFile delegate) {
		super("dummy");
		this.delegate = delegate;
	}

	public FileAdapter(File parent, String child) {
		super("dummy");
		this.delegate = new TFile(parent, child);
	}

	public FileAdapter(String parent, String child) {
		super("dummy");
		this.delegate = new TFile(parent, child);
	}

	public FileAdapter(String path) {
		super("dummy");
		this.delegate = new TFile(path);
		// TODO Auto-generated constructor stub
	}

	public FileAdapter(URI uri) {
		super("dummy");
		this.delegate = new TFile(uri);
	}

	@Override
	public String getName() {
		return delegate.getName();
	}

	@Override
	public String getParent() {
		return delegate.getParent();
	}

	@Override
	public File getParentFile() {
		return delegate.getParentFile();
	}

	@Override
	public String getPath() {
		return delegate.getPath();
	}

	@Override
	public boolean isAbsolute() {
		return delegate.isAbsolute();
	}

	@Override
	public String getAbsolutePath() {
		return delegate.getAbsolutePath();
	}

	@Override
	public File getAbsoluteFile() {
		return delegate.getAbsoluteFile();
	}

	@Override
	public String getCanonicalPath() throws IOException {
		return delegate.getCanonicalPath();
	}

	@Override
	public File getCanonicalFile() throws IOException {
		return delegate.getCanonicalFile();
	}

	@Override
	public URL toURL() throws MalformedURLException {
		return delegate.toURL();
	}

	@Override
	public URI toURI() {
		return delegate.toURI();
	}

	@Override
	public boolean canRead() {
		return delegate.canRead();
	}

	@Override
	public boolean canWrite() {
		return delegate.canWrite();
	}

	@Override
	public boolean exists() {
		return delegate.exists();
	}

	@Override
	public boolean isDirectory() {
		return delegate.isDirectory();
	}

	@Override
	public boolean isFile() {
		return delegate.isFile();
	}

	@Override
	public boolean isHidden() {
		return delegate.isHidden();
	}

	@Override
	public long lastModified() {
		return delegate.lastModified();
	}

	@Override
	public long length() {
		return delegate.length();
	}

	@Override
	public boolean createNewFile() throws IOException {
		return delegate.createNewFile();
	}

	@Override
	public boolean delete() {
		return delegate.delete();
	}

	@Override
	public void deleteOnExit() {
		delegate.deleteOnExit();
	}

	@Override
	public String[] list() {
		return delegate.list();
	}

	@Override
	public String[] list(FilenameFilter paramFilenameFilter) {
		return delegate.list(paramFilenameFilter);
	}

	@Override
	public File[] listFiles() {
		return delegate.listFiles();
	}

	@Override
	public File[] listFiles(FilenameFilter paramFilenameFilter) {
		return delegate.listFiles(paramFilenameFilter);
	}

	@Override
	public File[] listFiles(FileFilter paramFileFilter) {
		return delegate.listFiles(paramFileFilter);
	}

	@Override
	public boolean mkdir() {
		return delegate.mkdir();
	}

	@Override
	public boolean mkdirs() {
		return delegate.mkdirs();
	}

	@Override
	public boolean renameTo(File paramFile) {
		return delegate.renameTo(paramFile);
	}

	@Override
	public boolean setLastModified(long paramLong) {
		return delegate.setLastModified(paramLong);
	}

	@Override
	public boolean setReadOnly() {
		return delegate.setReadOnly();
	}

	@Override
	public boolean setWritable(boolean paramBoolean1, boolean paramBoolean2) {
		return delegate.setWritable(paramBoolean1, paramBoolean2);
	}

	@Override
	public boolean setWritable(boolean paramBoolean) {
		return delegate.setWritable(paramBoolean);
	}

	@Override
	public boolean setReadable(boolean paramBoolean1, boolean paramBoolean2) {
		return delegate.setReadable(paramBoolean1, paramBoolean2);
	}

	@Override
	public boolean setReadable(boolean paramBoolean) {
		return delegate.setReadable(paramBoolean);
	}

	@Override
	public boolean setExecutable(boolean paramBoolean1, boolean paramBoolean2) {
		return delegate.setExecutable(paramBoolean1, paramBoolean2);
	}

	@Override
	public boolean setExecutable(boolean paramBoolean) {
		return delegate.setExecutable(paramBoolean);
	}

	@Override
	public boolean canExecute() {
		return delegate.canExecute();
	}

	@Override
	public long getTotalSpace() {
		return delegate.getTotalSpace();
	}

	@Override
	public long getFreeSpace() {
		return delegate.getFreeSpace();
	}

	@Override
	public long getUsableSpace() {
		return delegate.getUsableSpace();
	}

	@Override
	public int compareTo(File paramFile) {
		return delegate.compareTo(paramFile);
	}

	@Override
	public boolean equals(Object paramObject) {
		return delegate.equals(paramObject);
	}

	@Override
	public int hashCode() {
		return delegate.hashCode();
	}

	@Override
	public String toString() {
		return delegate.toString();
	}

	@Override
	public Path toPath() {
		return delegate.toPath();
	}

	public InputStream getInputStream() throws IOException {
		return new TFileInputStream(delegate);
	}

	public OutputStream getOutputStream() throws IOException {
		return new TFileOutputStream(delegate);
	}
}
