package org.apache.commons.logging.impl;

/* JADX INFO: loaded from: classes2.dex */
public class LogKitLogger implements org.apache.commons.logging.Log, java.io.Serializable {
    private static final long serialVersionUID = 3768538055836059519L;
    protected volatile transient org.apache.log.Logger logger;
    protected java.lang.String name;

    public LogKitLogger(java.lang.String str) {
        this.logger = null;
        this.name = str;
        this.logger = getLogger();
    }

    @Override // org.apache.commons.logging.Log
    public void debug(java.lang.Object obj) {
        if (obj != null) {
            getLogger().debug(obj.toString());
        }
    }

    @Override // org.apache.commons.logging.Log
    public void error(java.lang.Object obj) {
        if (obj != null) {
            getLogger().error(obj.toString());
        }
    }

    @Override // org.apache.commons.logging.Log
    public void fatal(java.lang.Object obj) {
        if (obj != null) {
            getLogger().fatalError(obj.toString());
        }
    }

    public org.apache.log.Logger getLogger() {
        org.apache.log.Logger loggerFor;
        org.apache.log.Logger logger = this.logger;
        if (logger != null) {
            return logger;
        }
        synchronized (this) {
            loggerFor = this.logger;
            if (loggerFor == null) {
                loggerFor = org.apache.log.Hierarchy.getDefaultHierarchy().getLoggerFor(this.name);
                this.logger = loggerFor;
            }
        }
        return loggerFor;
    }

    @Override // org.apache.commons.logging.Log
    public void info(java.lang.Object obj) {
        if (obj != null) {
            getLogger().info(obj.toString());
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
        debug(obj);
    }

    @Override // org.apache.commons.logging.Log
    public void warn(java.lang.Object obj) {
        if (obj != null) {
            getLogger().warn(obj.toString());
        }
    }

    @Override // org.apache.commons.logging.Log
    public void trace(java.lang.Object obj, java.lang.Throwable th) {
        debug(obj, th);
    }

    @Override // org.apache.commons.logging.Log
    public void debug(java.lang.Object obj, java.lang.Throwable th) {
        if (obj != null) {
            getLogger().debug(obj.toString(), th);
        }
    }

    @Override // org.apache.commons.logging.Log
    public void error(java.lang.Object obj, java.lang.Throwable th) {
        if (obj != null) {
            getLogger().error(obj.toString(), th);
        }
    }

    @Override // org.apache.commons.logging.Log
    public void fatal(java.lang.Object obj, java.lang.Throwable th) {
        if (obj != null) {
            getLogger().fatalError(obj.toString(), th);
        }
    }

    @Override // org.apache.commons.logging.Log
    public void info(java.lang.Object obj, java.lang.Throwable th) {
        if (obj != null) {
            getLogger().info(obj.toString(), th);
        }
    }

    @Override // org.apache.commons.logging.Log
    public void warn(java.lang.Object obj, java.lang.Throwable th) {
        if (obj != null) {
            getLogger().warn(obj.toString(), th);
        }
    }
}
