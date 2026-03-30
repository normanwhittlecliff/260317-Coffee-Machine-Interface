package com.normanwhittlecliff.coffeeLib.core;

public class Version {
	// =================================================================================================================
	/*
	 * Pre-Alpha
	 * Alpha
	 * Beta
	 * Release Candidate
	 * Release
	 * */
	private String stage;
	private int major;
	private int minor;
	private int patch;
	// =================================================================================================================
	/**
	 * Constructs a Version object with the specified semantic version components.
	 *
	 * <p>This constructor initializes the version using the standard semantic
	 * versioning format: <strong>major.minor.patch-stage</strong>.</p>
	 *
	 * <ul>
	 *   <li><b>major</b>: Represents significant or breaking changes</li>
	 *   <li><b>minor</b>: Represents backward-compatible feature additions</li>
	 *   <li><b>patch</b>: Represents backward-compatible bug fixes</li>
	 *   <li><b>stage</b>: Represents the development stage (e.g., "alpha", "beta", "release")</li>
	 * </ul>
	 * @param major the major version number
	 * @param minor the minor version number
	 * @param patch the patch version number
	 * @param stage the development stage identifier of the version
	 * @author Norman Whittlecliff (Norman Santos)
	 */
	public Version(int major, int minor, int patch, String stage) {
		super();
		this.major = major;
		this.minor = minor;
		this.patch = patch;
		this.stage = stage;
	}
	// =================================================================================================================
	// Full semantic version
    public String getVersion() {
        return major + "." + minor + "." + patch;
    }
    // =================================================================================================================
    // Full version with stage
    public String getFullVersion() {
        return getVersion() + "-" + stage;
    }
    // =================================================================================================================
    @Override
    public String toString() {
        return getFullVersion();
    }
    // =================================================================================================================
	public String getStage() {
		return stage;
	}
	public void setStage(String stage) {
		this.stage = stage;
	}
	public int getMajor() {
		return major;
	}
	public void setMajor(int major) {
		this.major = major;
	}
	public int getMinor() {
		return minor;
	}
	public void setMinor(int minor) {
		this.minor = minor;
	}
	public int getPatch() {
		return patch;
	}
	public void setPatch(int patch) {
		this.patch = patch;
	}
    // =================================================================================================================
}
