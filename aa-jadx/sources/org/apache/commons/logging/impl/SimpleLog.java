package org.apache.commons.logging.impl;

/* JADX INFO: loaded from: classes2.dex */
public class SimpleLog implements org.apache.commons.logging.Log, java.io.Serializable {
    protected static final java.lang.String DEFAULT_DATE_TIME_FORMAT = "yyyy/MM/dd HH:mm:ss:SSS zzz";
    public static final int LOG_LEVEL_ALL = 0;
    public static final int LOG_LEVEL_DEBUG = 2;
    public static final int LOG_LEVEL_ERROR = 5;
    public static final int LOG_LEVEL_FATAL = 6;
    public static final int LOG_LEVEL_INFO = 3;
    public static final int LOG_LEVEL_OFF = 7;
    public static final int LOG_LEVEL_TRACE = 1;
    public static final int LOG_LEVEL_WARN = 4;
    static java.lang.Class class$java$lang$Thread = null;
    static java.lang.Class class$org$apache$commons$logging$impl$SimpleLog = null;
    protected static java.text.DateFormat dateFormatter = null;
    protected static volatile java.lang.String dateTimeFormat = null;
    private static final long serialVersionUID = 136942970684951178L;
    protected static volatile boolean showDateTime = false;
    protected static volatile boolean showLogName = false;
    protected static volatile boolean showShortName = false;
    protected static final java.util.Properties simpleLogProps;
    protected static final java.lang.String systemPrefix = "org.apache.commons.logging.simplelog.";
    protected volatile int currentLogLevel;
    protected volatile java.lang.String logName;
    private volatile java.lang.String shortLogName = null;

    static {
        java.util.Properties properties = new java.util.Properties();
        simpleLogProps = properties;
        showLogName = false;
        showShortName = true;
        showDateTime = false;
        dateTimeFormat = DEFAULT_DATE_TIME_FORMAT;
        dateFormatter = null;
        java.io.InputStream resourceAsStream = getResourceAsStream("simplelog.properties");
        if (resourceAsStream != null) {
            try {
                properties.load(resourceAsStream);
                resourceAsStream.close();
            } catch (java.io.IOException unused) {
            }
        }
        showLogName = getBooleanProperty("org.apache.commons.logging.simplelog.showlogname", showLogName);
        showShortName = getBooleanProperty("org.apache.commons.logging.simplelog.showShortLogname", showShortName);
        showDateTime = getBooleanProperty("org.apache.commons.logging.simplelog.showdatetime", showDateTime);
        if (showDateTime) {
            dateTimeFormat = getStringProperty("org.apache.commons.logging.simplelog.dateTimeFormat", dateTimeFormat);
            try {
                dateFormatter = new java.text.SimpleDateFormat(dateTimeFormat);
            } catch (java.lang.IllegalArgumentException unused2) {
                dateTimeFormat = DEFAULT_DATE_TIME_FORMAT;
                dateFormatter = new java.text.SimpleDateFormat(dateTimeFormat);
            }
        }
    }

    public SimpleLog(java.lang.String str) {
        this.logName = null;
        this.logName = str;
        setLevel(3);
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("org.apache.commons.logging.simplelog.log.");
        stringBuffer.append(this.logName);
        java.lang.String stringProperty = getStringProperty(stringBuffer.toString());
        int iLastIndexOf = java.lang.String.valueOf(str).lastIndexOf(".");
        while (stringProperty == null && iLastIndexOf >= 0) {
            str = str.substring(0, iLastIndexOf);
            java.lang.StringBuffer stringBuffer2 = new java.lang.StringBuffer("org.apache.commons.logging.simplelog.log.");
            stringBuffer2.append(str);
            stringProperty = getStringProperty(stringBuffer2.toString());
            iLastIndexOf = java.lang.String.valueOf(str).lastIndexOf(".");
        }
        stringProperty = stringProperty == null ? getStringProperty("org.apache.commons.logging.simplelog.defaultlog") : stringProperty;
        if ("all".equalsIgnoreCase(stringProperty)) {
            setLevel(0);
            return;
        }
        if ("trace".equalsIgnoreCase(stringProperty)) {
            setLevel(1);
            return;
        }
        if ("debug".equalsIgnoreCase(stringProperty)) {
            setLevel(2);
            return;
        }
        if ("info".equalsIgnoreCase(stringProperty)) {
            setLevel(3);
            return;
        }
        if ("warn".equalsIgnoreCase(stringProperty)) {
            setLevel(4);
            return;
        }
        if ("error".equalsIgnoreCase(stringProperty)) {
            setLevel(5);
        } else if ("fatal".equalsIgnoreCase(stringProperty)) {
            setLevel(6);
        } else if ("off".equalsIgnoreCase(stringProperty)) {
            setLevel(7);
        }
    }

    static java.lang.Class class$(java.lang.String str) {
        try {
            return java.lang.Class.forName(str);
        } catch (java.lang.ClassNotFoundException e) {
            throw new java.lang.NoClassDefFoundError(e.getMessage());
        }
    }

    private static boolean getBooleanProperty(java.lang.String str, boolean z) {
        java.lang.String stringProperty = getStringProperty(str);
        return stringProperty == null ? z : "true".equalsIgnoreCase(stringProperty);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.lang.ClassLoader getContextClassLoader() {
        java.lang.ClassLoader classLoader = null;
        try {
            java.lang.Class clsClass$ = class$java$lang$Thread;
            if (clsClass$ == null) {
                clsClass$ = class$("java.lang.Thread");
                class$java$lang$Thread = clsClass$;
            }
            try {
                classLoader = (java.lang.ClassLoader) clsClass$.getMethod("getContextClassLoader", null).invoke(java.lang.Thread.currentThread(), null);
            } catch (java.lang.reflect.InvocationTargetException e) {
                if (!(e.getTargetException() instanceof java.lang.SecurityException)) {
                    throw new org.apache.commons.logging.LogConfigurationException("Unexpected InvocationTargetException", e.getTargetException());
                }
            }
        } catch (java.lang.IllegalAccessException | java.lang.NoSuchMethodException unused) {
        }
        if (classLoader != null) {
            return classLoader;
        }
        java.lang.Class clsClass$2 = class$org$apache$commons$logging$impl$SimpleLog;
        if (clsClass$2 == null) {
            clsClass$2 = class$("org.apache.commons.logging.impl.SimpleLog");
            class$org$apache$commons$logging$impl$SimpleLog = clsClass$2;
        }
        return clsClass$2.getClassLoader();
    }

    private static java.io.InputStream getResourceAsStream(java.lang.String str) {
        return (java.io.InputStream) java.security.AccessController.doPrivileged(new java.security.PrivilegedAction(str) { // from class: org.apache.commons.logging.impl.SimpleLog.1
            private final java.lang.String val$name;

            {
                this.val$name = str;
            }

            @Override // java.security.PrivilegedAction
            public java.lang.Object run() {
                java.lang.ClassLoader contextClassLoader = org.apache.commons.logging.impl.SimpleLog.getContextClassLoader();
                java.lang.String str2 = this.val$name;
                return contextClassLoader != null ? contextClassLoader.getResourceAsStream(str2) : java.lang.ClassLoader.getSystemResourceAsStream(str2);
            }
        });
    }

    private static java.lang.String getStringProperty(java.lang.String str) {
        java.lang.String property;
        try {
            property = java.lang.System.getProperty(str);
        } catch (java.lang.SecurityException unused) {
            property = null;
        }
        return property == null ? simpleLogProps.getProperty(str) : property;
    }

    @Override // org.apache.commons.logging.Log
    public final void debug(java.lang.Object obj) {
        if (isLevelEnabled(2)) {
            log(2, obj, null);
        }
    }

    @Override // org.apache.commons.logging.Log
    public final void error(java.lang.Object obj) {
        if (isLevelEnabled(5)) {
            log(5, obj, null);
        }
    }

    @Override // org.apache.commons.logging.Log
    public final void fatal(java.lang.Object obj) {
        if (isLevelEnabled(6)) {
            log(6, obj, null);
        }
    }

    public int getLevel() {
        return this.currentLogLevel;
    }

    @Override // org.apache.commons.logging.Log
    public final void info(java.lang.Object obj) {
        if (isLevelEnabled(3)) {
            log(3, obj, null);
        }
    }

    @Override // org.apache.commons.logging.Log
    public final boolean isDebugEnabled() {
        return isLevelEnabled(2);
    }

    @Override // org.apache.commons.logging.Log
    public final boolean isErrorEnabled() {
        return isLevelEnabled(5);
    }

    @Override // org.apache.commons.logging.Log
    public final boolean isFatalEnabled() {
        return isLevelEnabled(6);
    }

    @Override // org.apache.commons.logging.Log
    public final boolean isInfoEnabled() {
        return isLevelEnabled(3);
    }

    protected boolean isLevelEnabled(int i) {
        return i >= this.currentLogLevel;
    }

    @Override // org.apache.commons.logging.Log
    public final boolean isTraceEnabled() {
        return isLevelEnabled(1);
    }

    @Override // org.apache.commons.logging.Log
    public final boolean isWarnEnabled() {
        return isLevelEnabled(4);
    }

    protected void log(int i, java.lang.Object obj, java.lang.Throwable th) {
        java.lang.String str;
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        if (showDateTime) {
            java.util.Date date = new java.util.Date();
            synchronized (dateFormatter) {
                str = dateFormatter.format(date);
            }
            stringBuffer.append(str);
            stringBuffer.append(" ");
        }
        switch (i) {
            case 1:
                stringBuffer.append("[TRACE] ");
                break;
            case 2:
                stringBuffer.append("[DEBUG] ");
                break;
            case 3:
                stringBuffer.append("[INFO] ");
                break;
            case 4:
                stringBuffer.append("[WARN] ");
                break;
            case 5:
                stringBuffer.append("[ERROR] ");
                break;
            case 6:
                stringBuffer.append("[FATAL] ");
                break;
        }
        if (showShortName) {
            if (this.shortLogName == null) {
                java.lang.String strSubstring = this.logName.substring(this.logName.lastIndexOf(".") + 1);
                this.shortLogName = strSubstring.substring(strSubstring.lastIndexOf("/") + 1);
            }
            stringBuffer.append(java.lang.String.valueOf(this.shortLogName));
            stringBuffer.append(" - ");
        } else if (showLogName) {
            stringBuffer.append(java.lang.String.valueOf(this.logName));
            stringBuffer.append(" - ");
        }
        stringBuffer.append(java.lang.String.valueOf(obj));
        if (th != null) {
            stringBuffer.append(" <");
            stringBuffer.append(th.toString());
            stringBuffer.append(">");
            java.io.StringWriter stringWriter = new java.io.StringWriter(1024);
            java.io.PrintWriter printWriter = new java.io.PrintWriter(stringWriter);
            th.printStackTrace(printWriter);
            printWriter.close();
            stringBuffer.append(stringWriter.toString());
        }
        write(stringBuffer);
    }

    public void setLevel(int i) {
        this.currentLogLevel = i;
    }

    @Override // org.apache.commons.logging.Log
    public final void trace(java.lang.Object obj) {
        if (isLevelEnabled(1)) {
            log(1, obj, null);
        }
    }

    @Override // org.apache.commons.logging.Log
    public final void warn(java.lang.Object obj) {
        if (isLevelEnabled(4)) {
            log(4, obj, null);
        }
    }

    protected void write(java.lang.StringBuffer stringBuffer) {
        java.lang.System.err.println(stringBuffer.toString());
    }

    @Override // org.apache.commons.logging.Log
    public final void debug(java.lang.Object obj, java.lang.Throwable th) {
        if (isLevelEnabled(2)) {
            log(2, obj, th);
        }
    }

    @Override // org.apache.commons.logging.Log
    public final void error(java.lang.Object obj, java.lang.Throwable th) {
        if (isLevelEnabled(5)) {
            log(5, obj, th);
        }
    }

    @Override // org.apache.commons.logging.Log
    public final void fatal(java.lang.Object obj, java.lang.Throwable th) {
        if (isLevelEnabled(6)) {
            log(6, obj, th);
        }
    }

    @Override // org.apache.commons.logging.Log
    public final void info(java.lang.Object obj, java.lang.Throwable th) {
        if (isLevelEnabled(3)) {
            log(3, obj, th);
        }
    }

    @Override // org.apache.commons.logging.Log
    public final void trace(java.lang.Object obj, java.lang.Throwable th) {
        if (isLevelEnabled(1)) {
            log(1, obj, th);
        }
    }

    @Override // org.apache.commons.logging.Log
    public final void warn(java.lang.Object obj, java.lang.Throwable th) {
        if (isLevelEnabled(4)) {
            log(4, obj, th);
        }
    }

    private static java.lang.String getStringProperty(java.lang.String str, java.lang.String str2) {
        java.lang.String stringProperty = getStringProperty(str);
        return stringProperty == null ? str2 : stringProperty;
    }
}
