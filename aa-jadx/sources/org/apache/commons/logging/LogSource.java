package org.apache.commons.logging;

/* JADX INFO: loaded from: classes2.dex */
public class LogSource {
    protected static boolean jdk14IsAvailable;
    protected static boolean log4jIsAvailable;
    protected static java.util.Hashtable logs = new java.util.Hashtable();
    protected static java.lang.reflect.Constructor logImplctor = null;

    static {
        log4jIsAvailable = false;
        jdk14IsAvailable = false;
        java.lang.String property = null;
        boolean z = true;
        try {
            log4jIsAvailable = java.lang.Class.forName("org.apache.log4j.Logger") != null;
        } catch (java.lang.Throwable unused) {
            log4jIsAvailable = false;
        }
        try {
            if (java.lang.Class.forName("java.util.logging.Logger") == null || java.lang.Class.forName("org.apache.commons.logging.impl.Jdk14Logger") == null) {
                z = false;
            }
            jdk14IsAvailable = z;
        } catch (java.lang.Throwable unused2) {
            jdk14IsAvailable = false;
        }
        try {
            property = java.lang.System.getProperty("org.apache.commons.logging.log");
            if (property == null) {
                property = java.lang.System.getProperty(org.apache.commons.logging.impl.LogFactoryImpl.LOG_PROPERTY);
            }
        } catch (java.lang.Throwable unused3) {
        }
        try {
            if (property != null) {
                try {
                    setLogImplementation(property);
                } catch (java.lang.Throwable unused4) {
                    setLogImplementation("org.apache.commons.logging.impl.NoOpLog");
                }
            } else {
                try {
                    if (log4jIsAvailable) {
                        setLogImplementation("org.apache.commons.logging.impl.Log4JLogger");
                    } else if (jdk14IsAvailable) {
                        setLogImplementation("org.apache.commons.logging.impl.Jdk14Logger");
                    } else {
                        setLogImplementation("org.apache.commons.logging.impl.NoOpLog");
                    }
                } catch (java.lang.Throwable unused5) {
                    setLogImplementation("org.apache.commons.logging.impl.NoOpLog");
                }
            }
        } catch (java.lang.Throwable unused6) {
        }
    }

    private LogSource() {
    }

    public static org.apache.commons.logging.Log getInstance(java.lang.String str) {
        org.apache.commons.logging.Log log = (org.apache.commons.logging.Log) logs.get(str);
        if (log != null) {
            return log;
        }
        org.apache.commons.logging.Log logMakeNewLogInstance = makeNewLogInstance(str);
        logs.put(str, logMakeNewLogInstance);
        return logMakeNewLogInstance;
    }

    public static java.lang.String[] getLogNames() {
        java.util.Hashtable hashtable = logs;
        return (java.lang.String[]) j$.util.DesugarCollections.bridge_synchronizedSet(hashtable.keySet(), hashtable).toArray(new java.lang.String[logs.size()]);
    }

    public static org.apache.commons.logging.Log makeNewLogInstance(java.lang.String str) {
        org.apache.commons.logging.Log log;
        try {
            log = (org.apache.commons.logging.Log) logImplctor.newInstance(str);
        } catch (java.lang.Throwable unused) {
            log = null;
        }
        return log == null ? new org.apache.commons.logging.impl.NoOpLog(str) : log;
    }

    public static void setLogImplementation(java.lang.String str) throws java.lang.LinkageError, java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.ClassNotFoundException {
        try {
            logImplctor = java.lang.Class.forName(str).getConstructor("".getClass());
        } catch (java.lang.Throwable unused) {
            logImplctor = null;
        }
    }

    public static org.apache.commons.logging.Log getInstance(java.lang.Class cls) {
        return getInstance(cls.getName());
    }

    public static void setLogImplementation(java.lang.Class cls) throws java.lang.LinkageError, java.lang.NoSuchMethodException, java.lang.SecurityException {
        logImplctor = cls.getConstructor("".getClass());
    }
}
