package org.apache.commons.logging.impl;

/* JADX INFO: loaded from: classes2.dex */
public class Jdk13LumberjackLogger implements org.apache.commons.logging.Log, java.io.Serializable {
    protected static final java.util.logging.Level dummyLevel = java.util.logging.Level.FINE;
    private static final long serialVersionUID = -8649807923527610591L;
    protected transient java.util.logging.Logger logger;
    protected java.lang.String name;
    private java.lang.String sourceClassName = "unknown";
    private java.lang.String sourceMethodName = "unknown";
    private boolean classAndMethodFound = false;

    public Jdk13LumberjackLogger(java.lang.String str) {
        this.logger = null;
        this.name = str;
        this.logger = getLogger();
    }

    private void getClassAndMethod() {
        try {
            java.lang.Throwable th = new java.lang.Throwable();
            th.fillInStackTrace();
            java.io.StringWriter stringWriter = new java.io.StringWriter();
            th.printStackTrace(new java.io.PrintWriter(stringWriter));
            java.util.StringTokenizer stringTokenizer = new java.util.StringTokenizer(stringWriter.getBuffer().toString(), "\n");
            stringTokenizer.nextToken();
            java.lang.String strNextToken = stringTokenizer.nextToken();
            while (strNextToken.indexOf(getClass().getName()) == -1) {
                strNextToken = stringTokenizer.nextToken();
            }
            while (strNextToken.indexOf(getClass().getName()) >= 0) {
                strNextToken = stringTokenizer.nextToken();
            }
            java.lang.String strSubstring = strNextToken.substring(strNextToken.indexOf("at ") + 3, strNextToken.indexOf(40));
            int iLastIndexOf = strSubstring.lastIndexOf(46);
            this.sourceClassName = strSubstring.substring(0, iLastIndexOf);
            this.sourceMethodName = strSubstring.substring(iLastIndexOf + 1);
        } catch (java.lang.Exception unused) {
        }
        this.classAndMethodFound = true;
    }

    private void log(java.util.logging.Level level, java.lang.String str, java.lang.Throwable th) {
        if (getLogger().isLoggable(level)) {
            java.util.logging.LogRecord logRecord = new java.util.logging.LogRecord(level, str);
            if (!this.classAndMethodFound) {
                getClassAndMethod();
            }
            logRecord.setSourceClassName(this.sourceClassName);
            logRecord.setSourceMethodName(this.sourceMethodName);
            if (th != null) {
                logRecord.setThrown(th);
            }
            getLogger().log(logRecord);
        }
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
