package org.apache.commons.logging.impl;

/* JADX INFO: loaded from: classes2.dex */
public class Jdk14Logger implements org.apache.commons.logging.Log, java.io.Serializable {
    protected static final java.util.logging.Level dummyLevel = java.util.logging.Level.FINE;
    private static final long serialVersionUID = 4784713551416303804L;
    protected transient java.util.logging.Logger logger;
    protected java.lang.String name;

    public Jdk14Logger(java.lang.String str) {
        this.logger = null;
        this.name = str;
        this.logger = getLogger();
    }

    @Override // org.apache.commons.logging.Log
    public void debug(java.lang.Object obj) {
        log(java.util.logging.Level.FINE, java.lang.String.valueOf(obj), null);
    }

    @Override // org.apache.commons.logging.Log
    public void error(java.lang.Object obj) {
        log(java.util.logging.Level.SEVERE, java.lang.String.valueOf(obj), null);
    }

    @Override // org.apache.commons.logging.Log
    public void fatal(java.lang.Object obj) {
        log(java.util.logging.Level.SEVERE, java.lang.String.valueOf(obj), null);
    }

    public java.util.logging.Logger getLogger() {
        java.util.logging.Logger logger = this.logger;
        if (logger != null) {
            return logger;
        }
        java.util.logging.Logger logger2 = java.util.logging.Logger.getLogger(this.name);
        this.logger = logger2;
        return logger2;
    }

    @Override // org.apache.commons.logging.Log
    public void info(java.lang.Object obj) {
        log(java.util.logging.Level.INFO, java.lang.String.valueOf(obj), null);
    }

    @Override // org.apache.commons.logging.Log
    public boolean isDebugEnabled() {
        return getLogger().isLoggable(java.util.logging.Level.FINE);
    }

    @Override // org.apache.commons.logging.Log
    public boolean isErrorEnabled() {
        return getLogger().isLoggable(java.util.logging.Level.SEVERE);
    }

    @Override // org.apache.commons.logging.Log
    public boolean isFatalEnabled() {
        return getLogger().isLoggable(java.util.logging.Level.SEVERE);
    }

    @Override // org.apache.commons.logging.Log
    public boolean isInfoEnabled() {
        return getLogger().isLoggable(java.util.logging.Level.INFO);
    }

    @Override // org.apache.commons.logging.Log
    public boolean isTraceEnabled() {
        return getLogger().isLoggable(java.util.logging.Level.FINEST);
    }

    @Override // org.apache.commons.logging.Log
    public boolean isWarnEnabled() {
        return getLogger().isLoggable(java.util.logging.Level.WARNING);
    }

    protected void log(java.util.logging.Level level, java.lang.String str, java.lang.Throwable th) {
        java.util.logging.Logger logger = getLogger();
        if (logger.isLoggable(level)) {
            java.lang.StackTraceElement[] stackTrace = new java.lang.Throwable().getStackTrace();
            java.lang.String str2 = this.name;
            java.lang.String methodName = (stackTrace == null || stackTrace.length <= 2) ? "unknown" : stackTrace[2].getMethodName();
            if (th == null) {
                logger.logp(level, str2, methodName, str);
            } else {
                logger.logp(level, str2, methodName, str, th);
            }
        }
    }

    @Override // org.apache.commons.logging.Log
    public void trace(java.lang.Object obj) {
        log(java.util.logging.Level.FINEST, java.lang.String.valueOf(obj), null);
    }

    @Override // org.apache.commons.logging.Log
    public void warn(java.lang.Object obj) {
        log(java.util.logging.Level.WARNING, java.lang.String.valueOf(obj), null);
    }

    @Override // org.apache.commons.logging.Log
    public void debug(java.lang.Object obj, java.lang.Throwable th) {
        log(java.util.logging.Level.FINE, java.lang.String.valueOf(obj), th);
    }

    @Override // org.apache.commons.logging.Log
    public void error(java.lang.Object obj, java.lang.Throwable th) {
        log(java.util.logging.Level.SEVERE, java.lang.String.valueOf(obj), th);
    }

    @Override // org.apache.commons.logging.Log
    public void fatal(java.lang.Object obj, java.lang.Throwable th) {
        log(java.util.logging.Level.SEVERE, java.lang.String.valueOf(obj), th);
    }

    @Override // org.apache.commons.logging.Log
    public void info(java.lang.Object obj, java.lang.Throwable th) {
        log(java.util.logging.Level.INFO, java.lang.String.valueOf(obj), th);
    }

    @Override // org.apache.commons.logging.Log
    public void trace(java.lang.Object obj, java.lang.Throwable th) {
        log(java.util.logging.Level.FINEST, java.lang.String.valueOf(obj), th);
    }

    @Override // org.apache.commons.logging.Log
    public void warn(java.lang.Object obj, java.lang.Throwable th) {
        log(java.util.logging.Level.WARNING, java.lang.String.valueOf(obj), th);
    }
}
