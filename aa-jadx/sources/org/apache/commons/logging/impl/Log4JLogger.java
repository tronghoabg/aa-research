package org.apache.commons.logging.impl;

/* JADX INFO: loaded from: classes2.dex */
public class Log4JLogger implements org.apache.commons.logging.Log, java.io.Serializable {
    private static final java.lang.String FQCN;
    static java.lang.Class class$org$apache$commons$logging$impl$Log4JLogger = null;
    static java.lang.Class class$org$apache$log4j$Level = null;
    static java.lang.Class class$org$apache$log4j$Priority = null;
    private static final long serialVersionUID = 5160705895411730424L;
    private static final org.apache.log4j.Priority traceLevel;
    private volatile transient org.apache.log4j.Logger logger;
    private final java.lang.String name;

    static {
        org.apache.log4j.Priority priority;
        java.lang.Class clsClass$ = class$org$apache$commons$logging$impl$Log4JLogger;
        if (clsClass$ == null) {
            clsClass$ = class$("org.apache.commons.logging.impl.Log4JLogger");
            class$org$apache$commons$logging$impl$Log4JLogger = clsClass$;
        }
        FQCN = clsClass$.getName();
        java.lang.Class clsClass$2 = class$org$apache$log4j$Priority;
        if (clsClass$2 == null) {
            clsClass$2 = class$("org.apache.log4j.Priority");
            class$org$apache$log4j$Priority = clsClass$2;
        }
        java.lang.Class<?> clsClass$3 = class$org$apache$log4j$Level;
        if (clsClass$3 == null) {
            clsClass$3 = class$("org.apache.log4j.Level");
            class$org$apache$log4j$Level = clsClass$3;
        }
        if (!clsClass$2.isAssignableFrom(clsClass$3)) {
            throw new java.lang.InstantiationError("Log4J 1.2 not available");
        }
        try {
            java.lang.Class clsClass$4 = class$org$apache$log4j$Level;
            if (clsClass$4 == null) {
                clsClass$4 = class$("org.apache.log4j.Level");
                class$org$apache$log4j$Level = clsClass$4;
            }
            priority = (org.apache.log4j.Priority) clsClass$4.getDeclaredField("TRACE").get(null);
        } catch (java.lang.Exception unused) {
            priority = org.apache.log4j.Level.DEBUG;
        }
        traceLevel = priority;
    }

    public Log4JLogger(org.apache.log4j.Logger logger) {
        this.logger = null;
        if (logger == null) {
            throw new java.lang.IllegalArgumentException("Warning - null logger in constructor; possible log4j misconfiguration.");
        }
        this.name = logger.getName();
        this.logger = logger;
    }

    static java.lang.Class class$(java.lang.String str) {
        try {
            return java.lang.Class.forName(str);
        } catch (java.lang.ClassNotFoundException e) {
            throw new java.lang.NoClassDefFoundError(e.getMessage());
        }
    }

    @Override // org.apache.commons.logging.Log
    public void debug(java.lang.Object obj) {
        getLogger().log(FQCN, org.apache.log4j.Level.DEBUG, obj, (java.lang.Throwable) null);
    }

    @Override // org.apache.commons.logging.Log
    public void error(java.lang.Object obj) {
        getLogger().log(FQCN, org.apache.log4j.Level.ERROR, obj, (java.lang.Throwable) null);
    }

    @Override // org.apache.commons.logging.Log
    public void fatal(java.lang.Object obj) {
        getLogger().log(FQCN, org.apache.log4j.Level.FATAL, obj, (java.lang.Throwable) null);
    }

    public org.apache.log4j.Logger getLogger() {
        org.apache.log4j.Logger logger;
        org.apache.log4j.Logger logger2 = this.logger;
        if (logger2 != null) {
            return logger2;
        }
        synchronized (this) {
            logger = this.logger;
            if (logger == null) {
                logger = org.apache.log4j.Logger.getLogger(this.name);
                this.logger = logger;
            }
        }
        return logger;
    }

    @Override // org.apache.commons.logging.Log
    public void info(java.lang.Object obj) {
        getLogger().log(FQCN, org.apache.log4j.Level.INFO, obj, (java.lang.Throwable) null);
    }

    @Override // org.apache.commons.logging.Log
    public boolean isDebugEnabled() {
        return getLogger().isDebugEnabled();
    }

    @Override // org.apache.commons.logging.Log
    public boolean isErrorEnabled() {
        return getLogger().isEnabledFor(org.apache.log4j.Level.ERROR);
    }

    @Override // org.apache.commons.logging.Log
    public boolean isFatalEnabled() {
        return getLogger().isEnabledFor(org.apache.log4j.Level.FATAL);
    }

    @Override // org.apache.commons.logging.Log
    public boolean isInfoEnabled() {
        return getLogger().isInfoEnabled();
    }

    @Override // org.apache.commons.logging.Log
    public boolean isTraceEnabled() {
        return getLogger().isEnabledFor(traceLevel);
    }

    @Override // org.apache.commons.logging.Log
    public boolean isWarnEnabled() {
        return getLogger().isEnabledFor(org.apache.log4j.Level.WARN);
    }

    @Override // org.apache.commons.logging.Log
    public void trace(java.lang.Object obj) {
        getLogger().log(FQCN, traceLevel, obj, (java.lang.Throwable) null);
    }

    @Override // org.apache.commons.logging.Log
    public void warn(java.lang.Object obj) {
        getLogger().log(FQCN, org.apache.log4j.Level.WARN, obj, (java.lang.Throwable) null);
    }

    @Override // org.apache.commons.logging.Log
    public void trace(java.lang.Object obj, java.lang.Throwable th) {
        getLogger().log(FQCN, traceLevel, obj, th);
    }

    @Override // org.apache.commons.logging.Log
    public void debug(java.lang.Object obj, java.lang.Throwable th) {
        getLogger().log(FQCN, org.apache.log4j.Level.DEBUG, obj, th);
    }

    @Override // org.apache.commons.logging.Log
    public void error(java.lang.Object obj, java.lang.Throwable th) {
        getLogger().log(FQCN, org.apache.log4j.Level.ERROR, obj, th);
    }

    @Override // org.apache.commons.logging.Log
    public void fatal(java.lang.Object obj, java.lang.Throwable th) {
        getLogger().log(FQCN, org.apache.log4j.Level.FATAL, obj, th);
    }

    @Override // org.apache.commons.logging.Log
    public void info(java.lang.Object obj, java.lang.Throwable th) {
        getLogger().log(FQCN, org.apache.log4j.Level.INFO, obj, th);
    }

    @Override // org.apache.commons.logging.Log
    public void warn(java.lang.Object obj, java.lang.Throwable th) {
        getLogger().log(FQCN, org.apache.log4j.Level.WARN, obj, th);
    }

    public Log4JLogger(java.lang.String str) {
        this.logger = null;
        this.name = str;
        this.logger = getLogger();
    }

    public Log4JLogger() {
        this.logger = null;
        this.name = null;
    }
}
