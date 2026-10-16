package org.apache.commons.logging.impl;

/* JADX INFO: loaded from: classes2.dex */
public class AvalonLogger implements org.apache.commons.logging.Log {
    private static volatile org.apache.avalon.framework.logger.Logger defaultLogger;
    private final transient org.apache.avalon.framework.logger.Logger logger;

    public AvalonLogger(java.lang.String str) {
        if (defaultLogger == null) {
            throw new java.lang.NullPointerException("default logger has to be specified if this constructor is used!");
        }
        this.logger = defaultLogger.getChildLogger(str);
    }

    public static void setDefaultLogger(org.apache.avalon.framework.logger.Logger logger) {
        defaultLogger = logger;
    }

    @Override // org.apache.commons.logging.Log
    public void debug(java.lang.Object obj) {
        if (getLogger().isDebugEnabled()) {
            getLogger().debug(java.lang.String.valueOf(obj));
        }
    }

    @Override // org.apache.commons.logging.Log
    public void error(java.lang.Object obj) {
        if (getLogger().isErrorEnabled()) {
            getLogger().error(java.lang.String.valueOf(obj));
        }
    }

    @Override // org.apache.commons.logging.Log
    public void fatal(java.lang.Object obj) {
        if (getLogger().isFatalErrorEnabled()) {
            getLogger().fatalError(java.lang.String.valueOf(obj));
        }
    }

    public org.apache.avalon.framework.logger.Logger getLogger() {
        return this.logger;
    }

    @Override // org.apache.commons.logging.Log
    public void info(java.lang.Object obj) {
        if (getLogger().isInfoEnabled()) {
            getLogger().info(java.lang.String.valueOf(obj));
        }
    }

    @Override // org.apache.commons.logging.Log
    public boolean isDebugEnabled() {
        return getLogger().isDebugEnabled();
    }

    @Override // org.apache.commons.logging.Log
    public boolean isErrorEnabled() {
        return getLogger().isErrorEnabled();
    }

    @Override // org.apache.commons.logging.Log
    public boolean isFatalEnabled() {
        return getLogger().isFatalErrorEnabled();
    }

    @Override // org.apache.commons.logging.Log
    public boolean isInfoEnabled() {
        return getLogger().isInfoEnabled();
    }

    @Override // org.apache.commons.logging.Log
    public boolean isTraceEnabled() {
        return getLogger().isDebugEnabled();
    }

    @Override // org.apache.commons.logging.Log
    public boolean isWarnEnabled() {
        return getLogger().isWarnEnabled();
    }

    @Override // org.apache.commons.logging.Log
    public void trace(java.lang.Object obj) {
        if (getLogger().isDebugEnabled()) {
            getLogger().debug(java.lang.String.valueOf(obj));
        }
    }

    @Override // org.apache.commons.logging.Log
    public void warn(java.lang.Object obj) {
        if (getLogger().isWarnEnabled()) {
            getLogger().warn(java.lang.String.valueOf(obj));
        }
    }

    @Override // org.apache.commons.logging.Log
    public void debug(java.lang.Object obj, java.lang.Throwable th) {
        if (getLogger().isDebugEnabled()) {
            getLogger().debug(java.lang.String.valueOf(obj), th);
        }
    }

    @Override // org.apache.commons.logging.Log
    public void error(java.lang.Object obj, java.lang.Throwable th) {
        if (getLogger().isErrorEnabled()) {
            getLogger().error(java.lang.String.valueOf(obj), th);
        }
    }

    @Override // org.apache.commons.logging.Log
    public void fatal(java.lang.Object obj, java.lang.Throwable th) {
        if (getLogger().isFatalErrorEnabled()) {
            getLogger().fatalError(java.lang.String.valueOf(obj), th);
        }
    }

    @Override // org.apache.commons.logging.Log
    public void info(java.lang.Object obj, java.lang.Throwable th) {
        if (getLogger().isInfoEnabled()) {
            getLogger().info(java.lang.String.valueOf(obj), th);
        }
    }

    @Override // org.apache.commons.logging.Log
    public void trace(java.lang.Object obj, java.lang.Throwable th) {
        if (getLogger().isDebugEnabled()) {
            getLogger().debug(java.lang.String.valueOf(obj), th);
        }
    }

    @Override // org.apache.commons.logging.Log
    public void warn(java.lang.Object obj, java.lang.Throwable th) {
        if (getLogger().isWarnEnabled()) {
            getLogger().warn(java.lang.String.valueOf(obj), th);
        }
    }

    public AvalonLogger(org.apache.avalon.framework.logger.Logger logger) {
        this.logger = logger;
    }
}
