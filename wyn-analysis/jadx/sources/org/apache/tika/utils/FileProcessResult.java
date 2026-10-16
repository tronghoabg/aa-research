package org.apache.tika.utils;

import A7.AbstractC0279p0;
import Va.M6;

/* loaded from: classes5.dex */
public class FileProcessResult {
    String stderr = "";
    String stdout = "";
    int exitValue = -1;
    long processTimeMillis = -1;
    boolean isTimeout = false;
    long stdoutLength = -1;
    long stderrLength = -1;
    boolean stderrTruncated = false;
    boolean stdoutTruncated = false;

    public int getExitValue() {
        return this.exitValue;
    }

    public long getProcessTimeMillis() {
        return this.processTimeMillis;
    }

    public String getStderr() {
        return this.stderr;
    }

    public long getStderrLength() {
        return this.stderrLength;
    }

    public String getStdout() {
        return this.stdout;
    }

    public long getStdoutLength() {
        return this.stdoutLength;
    }

    public boolean isStderrTruncated() {
        return this.stderrTruncated;
    }

    public boolean isStdoutTruncated() {
        return this.stdoutTruncated;
    }

    public boolean isTimeout() {
        return this.isTimeout;
    }

    public void setExitValue(int i5) {
        this.exitValue = i5;
    }

    public void setProcessTimeMillis(long j8) {
        this.processTimeMillis = j8;
    }

    public void setStderr(String str) {
        this.stderr = str;
    }

    public void setStderrLength(long j8) {
        this.stderrLength = j8;
    }

    public void setStderrTruncated(boolean z2) {
        this.stderrTruncated = z2;
    }

    public void setStdout(String str) {
        this.stdout = str;
    }

    public void setStdoutLength(long j8) {
        this.stdoutLength = j8;
    }

    public void setStdoutTruncated(boolean z2) {
        this.stdoutTruncated = z2;
    }

    public void setTimeout(boolean z2) {
        this.isTimeout = z2;
    }

    public String toString() {
        String str = this.stderr;
        String str2 = this.stdout;
        int i5 = this.exitValue;
        long j8 = this.processTimeMillis;
        boolean z2 = this.isTimeout;
        long j10 = this.stdoutLength;
        long j11 = this.stderrLength;
        boolean z10 = this.stderrTruncated;
        boolean z11 = this.stdoutTruncated;
        StringBuilder sbR = AbstractC0279p0.r("FileProcessResult{stderr='", str, "', stdout='", str2, "', exitValue=");
        sbR.append(i5);
        sbR.append(", processTimeMillis=");
        sbR.append(j8);
        sbR.append(", isTimeout=");
        sbR.append(z2);
        sbR.append(", stdoutLength=");
        sbR.append(j10);
        M6.A(sbR, ", stderrLength=", j11, ", stderrTruncated=");
        sbR.append(z10);
        sbR.append(", stdoutTruncated=");
        sbR.append(z11);
        sbR.append("}");
        return sbR.toString();
    }
}
