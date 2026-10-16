package org.apache.commons.logging.impl;

/* JADX INFO: loaded from: classes2.dex */
public class NoOpLog implements org.apache.commons.logging.Log, java.io.Serializable {
    private static final long serialVersionUID = 561423906191706148L;

    public NoOpLog() {
    }

    @Override // org.apache.commons.logging.Log
    public final boolean isDebugEnabled() {
        return false;
    }

    @Override // org.apache.commons.logging.Log
    public final boolean isErrorEnabled() {
        return false;
    }

    @Override // org.apache.commons.logging.Log
    public final boolean isFatalEnabled() {
        return false;
    }

    @Override // org.apache.commons.logging.Log
    public final boolean isInfoEnabled() {
        return false;
    }

    @Override // org.apache.commons.logging.Log
    public final boolean isTraceEnabled() {
        return false;
    }

    @Override // org.apache.commons.logging.Log
    public final boolean isWarnEnabled() {
        return false;
    }

    @Override // org.apache.commons.logging.Log
    public void debug(java.lang.Object obj, java.lang.Throwable th) {
    }

    @Override // org.apache.commons.logging.Log
    public void error(java.lang.Object obj, java.lang.Throwable th) {
    }

    @Override // org.apache.commons.logging.Log
    public void fatal(java.lang.Object obj, java.lang.Throwable th) {
    }

    @Override // org.apache.commons.logging.Log
    public void info(java.lang.Object obj, java.lang.Throwable th) {
    }

    @Override // org.apache.commons.logging.Log
    public void trace(java.lang.Object obj, java.lang.Throwable th) {
    }

    @Override // org.apache.commons.logging.Log
    public void warn(java.lang.Object obj, java.lang.Throwable th) {
    }

    public NoOpLog(java.lang.String str) {
    }

    @Override // org.apache.commons.logging.Log
    public void debug(java.lang.Object obj) {
    }

    @Override // org.apache.commons.logging.Log
    public void error(java.lang.Object obj) {
    }

    @Override // org.apache.commons.logging.Log
    public void fatal(java.lang.Object obj) {
    }

    @Override // org.apache.commons.logging.Log
    public void info(java.lang.Object obj) {
    }

    @Override // org.apache.commons.logging.Log
    public void trace(java.lang.Object obj) {
    }

    @Override // org.apache.commons.logging.Log
    public void warn(java.lang.Object obj) {
    }
}
