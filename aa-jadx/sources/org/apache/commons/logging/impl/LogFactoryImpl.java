package org.apache.commons.logging.impl;

/* JADX INFO: loaded from: classes2.dex */
public class LogFactoryImpl extends org.apache.commons.logging.LogFactory {
    public static final java.lang.String ALLOW_FLAWED_CONTEXT_PROPERTY = "org.apache.commons.logging.Log.allowFlawedContext";
    public static final java.lang.String ALLOW_FLAWED_DISCOVERY_PROPERTY = "org.apache.commons.logging.Log.allowFlawedDiscovery";
    public static final java.lang.String ALLOW_FLAWED_HIERARCHY_PROPERTY = "org.apache.commons.logging.Log.allowFlawedHierarchy";
    public static final java.lang.String LOG_PROPERTY = "org.apache.commons.logging.Log";
    protected static final java.lang.String LOG_PROPERTY_OLD = "org.apache.commons.logging.log";
    private static final java.lang.String PKG_IMPL = "org.apache.commons.logging.impl.";
    private static final int PKG_LEN = 32;
    static java.lang.Class class$java$lang$String;
    static java.lang.Class class$org$apache$commons$logging$Log;
    static java.lang.Class class$org$apache$commons$logging$LogFactory;
    static java.lang.Class class$org$apache$commons$logging$impl$LogFactoryImpl;
    private boolean allowFlawedContext;
    private boolean allowFlawedDiscovery;
    private boolean allowFlawedHierarchy;
    private java.lang.String diagnosticPrefix;
    private java.lang.String logClassName;
    protected java.lang.Class[] logConstructorSignature;
    protected java.lang.reflect.Method logMethod;
    protected java.lang.Class[] logMethodSignature;
    private static final java.lang.String LOGGING_IMPL_LOG4J_LOGGER = "org.apache.commons.logging.impl.Log4JLogger";
    private static final java.lang.String LOGGING_IMPL_JDK14_LOGGER = "org.apache.commons.logging.impl.Jdk14Logger";
    private static final java.lang.String LOGGING_IMPL_LUMBERJACK_LOGGER = "org.apache.commons.logging.impl.Jdk13LumberjackLogger";
    private static final java.lang.String LOGGING_IMPL_SIMPLE_LOGGER = "org.apache.commons.logging.impl.SimpleLog";
    private static final java.lang.String[] classesToDiscover = {LOGGING_IMPL_LOG4J_LOGGER, LOGGING_IMPL_JDK14_LOGGER, LOGGING_IMPL_LUMBERJACK_LOGGER, LOGGING_IMPL_SIMPLE_LOGGER};
    private boolean useTCCL = true;
    protected java.util.Hashtable attributes = new java.util.Hashtable();
    protected java.util.Hashtable instances = new java.util.Hashtable();
    protected java.lang.reflect.Constructor logConstructor = null;

    public LogFactoryImpl() {
        java.lang.Class clsClass$ = class$java$lang$String;
        if (clsClass$ == null) {
            clsClass$ = class$("java.lang.String");
            class$java$lang$String = clsClass$;
        }
        this.logConstructorSignature = new java.lang.Class[]{clsClass$};
        this.logMethod = null;
        java.lang.Class clsClass$2 = class$org$apache$commons$logging$LogFactory;
        if (clsClass$2 == null) {
            clsClass$2 = class$(org.apache.commons.logging.LogFactory.FACTORY_PROPERTY);
            class$org$apache$commons$logging$LogFactory = clsClass$2;
        }
        this.logMethodSignature = new java.lang.Class[]{clsClass$2};
        initDiagnostics();
        if (isDiagnosticsEnabled()) {
            logDiagnostic("Instance created.");
        }
    }

    static java.lang.Class class$(java.lang.String str) {
        try {
            return java.lang.Class.forName(str);
        } catch (java.lang.ClassNotFoundException e) {
            throw new java.lang.NoClassDefFoundError(e.getMessage());
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0155 A[LOOP:0: B:6:0x0034->B:46:0x0155, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:73:0x01b0 A[SYNTHETIC] */
    private org.apache.commons.logging.Log createLogFromClass(java.lang.String str, java.lang.String str2, boolean z) throws org.apache.commons.logging.LogConfigurationException {
        org.apache.commons.logging.Log log;
        java.lang.Class<?> cls;
        java.net.URL systemResource;
        if (isDiagnosticsEnabled()) {
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Attempting to instantiate '");
            stringBuffer.append(str);
            stringBuffer.append("'");
            logDiagnostic(stringBuffer.toString());
        }
        java.lang.Object[] objArr = {str2};
        java.lang.ClassLoader baseClassLoader = getBaseClassLoader();
        java.lang.Class<?> cls2 = null;
        java.lang.reflect.Constructor<?> constructor = null;
        while (true) {
            java.lang.StringBuffer stringBuffer2 = new java.lang.StringBuffer("Trying to load '");
            stringBuffer2.append(str);
            stringBuffer2.append("' from classloader ");
            stringBuffer2.append(objectId(baseClassLoader));
            logDiagnostic(stringBuffer2.toString());
            try {
                try {
                    if (isDiagnosticsEnabled()) {
                        java.lang.StringBuffer stringBuffer3 = new java.lang.StringBuffer();
                        stringBuffer3.append(str.replace('.', '/'));
                        stringBuffer3.append(".class");
                        java.lang.String string = stringBuffer3.toString();
                        if (baseClassLoader != null) {
                            systemResource = baseClassLoader.getResource(string);
                        } else {
                            java.lang.StringBuffer stringBuffer4 = new java.lang.StringBuffer();
                            stringBuffer4.append(string);
                            stringBuffer4.append(".class");
                            systemResource = java.lang.ClassLoader.getSystemResource(stringBuffer4.toString());
                        }
                        if (systemResource == null) {
                            java.lang.StringBuffer stringBuffer5 = new java.lang.StringBuffer();
                            stringBuffer5.append("Class '");
                            stringBuffer5.append(str);
                            stringBuffer5.append("' [");
                            stringBuffer5.append(string);
                            stringBuffer5.append("] cannot be found.");
                            logDiagnostic(stringBuffer5.toString());
                        } else {
                            java.lang.StringBuffer stringBuffer6 = new java.lang.StringBuffer();
                            stringBuffer6.append("Class '");
                            stringBuffer6.append(str);
                            stringBuffer6.append("' was found at '");
                            stringBuffer6.append(systemResource);
                            stringBuffer6.append("'");
                            logDiagnostic(stringBuffer6.toString());
                        }
                    }
                    try {
                        cls = java.lang.Class.forName(str, true, baseClassLoader);
                    } catch (java.lang.ClassNotFoundException e) {
                        java.lang.String message = e.getMessage();
                        java.lang.StringBuffer stringBuffer7 = new java.lang.StringBuffer();
                        stringBuffer7.append("The log adapter '");
                        stringBuffer7.append(str);
                        stringBuffer7.append("' is not available via classloader ");
                        stringBuffer7.append(objectId(baseClassLoader));
                        stringBuffer7.append(": ");
                        stringBuffer7.append(message.trim());
                        logDiagnostic(stringBuffer7.toString());
                        try {
                            cls = java.lang.Class.forName(str);
                        } catch (java.lang.ClassNotFoundException e2) {
                            java.lang.String message2 = e2.getMessage();
                            java.lang.StringBuffer stringBuffer8 = new java.lang.StringBuffer();
                            stringBuffer8.append("The log adapter '");
                            stringBuffer8.append(str);
                            stringBuffer8.append("' is not available via the LogFactoryImpl class classloader: ");
                            stringBuffer8.append(message2.trim());
                            logDiagnostic(stringBuffer8.toString());
                        }
                    }
                    java.lang.Class<?> cls3 = cls;
                    constructor = cls3.getConstructor(this.logConstructorSignature);
                    java.lang.Object objNewInstance = constructor.newInstance(objArr);
                    if (objNewInstance instanceof org.apache.commons.logging.Log) {
                        try {
                            log = (org.apache.commons.logging.Log) objNewInstance;
                            cls2 = cls3;
                            break;
                        } catch (java.lang.ExceptionInInitializerError e3) {
                            e = e3;
                            cls2 = cls3;
                            java.lang.String message3 = e.getMessage();
                            java.lang.StringBuffer stringBuffer9 = new java.lang.StringBuffer("The log adapter '");
                            stringBuffer9.append(str);
                            stringBuffer9.append("' is unable to initialize itself when loaded via classloader ");
                            stringBuffer9.append(objectId(baseClassLoader));
                            stringBuffer9.append(": ");
                            stringBuffer9.append(message3.trim());
                            logDiagnostic(stringBuffer9.toString());
                            log = null;
                            break;
                        } catch (java.lang.NoClassDefFoundError e4) {
                            e = e4;
                            cls2 = cls3;
                            java.lang.String message4 = e.getMessage();
                            java.lang.StringBuffer stringBuffer10 = new java.lang.StringBuffer("The log adapter '");
                            stringBuffer10.append(str);
                            stringBuffer10.append("' is missing dependencies when loaded via classloader ");
                            stringBuffer10.append(objectId(baseClassLoader));
                            stringBuffer10.append(": ");
                            stringBuffer10.append(message4.trim());
                            logDiagnostic(stringBuffer10.toString());
                            log = null;
                            break;
                        } catch (java.lang.Throwable th) {
                            th = th;
                            cls2 = cls3;
                            handleThrowable(th);
                            handleFlawedDiscovery(str, baseClassLoader, th);
                            if (baseClassLoader == null) {
                                log = null;
                                break;
                            }
                            baseClassLoader = getParentClassLoader(baseClassLoader);
                        }
                    } else {
                        handleFlawedHierarchy(baseClassLoader, cls3);
                        if (baseClassLoader == null) {
                            log = null;
                            break;
                        }
                        baseClassLoader = getParentClassLoader(baseClassLoader);
                    }
                } catch (org.apache.commons.logging.LogConfigurationException e5) {
                    throw e5;
                }
            } catch (java.lang.ExceptionInInitializerError e6) {
                e = e6;
            } catch (java.lang.NoClassDefFoundError e7) {
                e = e7;
            } catch (java.lang.Throwable th2) {
                th = th2;
            }
        }
        if (cls2 != null && z) {
            this.logClassName = str;
            this.logConstructor = constructor;
            try {
                this.logMethod = cls2.getMethod("setLogFactory", this.logMethodSignature);
                java.lang.StringBuffer stringBuffer11 = new java.lang.StringBuffer();
                stringBuffer11.append("Found method setLogFactory(LogFactory) in '");
                stringBuffer11.append(str);
                stringBuffer11.append("'");
                logDiagnostic(stringBuffer11.toString());
            } catch (java.lang.Throwable th3) {
                handleThrowable(th3);
                this.logMethod = null;
                java.lang.StringBuffer stringBuffer12 = new java.lang.StringBuffer("[INFO] '");
                stringBuffer12.append(str);
                stringBuffer12.append("' from classloader ");
                stringBuffer12.append(objectId(baseClassLoader));
                stringBuffer12.append(" does not declare optional method setLogFactory(LogFactory)");
                logDiagnostic(stringBuffer12.toString());
            }
            java.lang.StringBuffer stringBuffer13 = new java.lang.StringBuffer("Log adapter '");
            stringBuffer13.append(str);
            stringBuffer13.append("' from classloader ");
            stringBuffer13.append(objectId(cls2.getClassLoader()));
            stringBuffer13.append(" has been selected for use.");
            logDiagnostic(stringBuffer13.toString());
        }
        return log;
    }

    private org.apache.commons.logging.Log discoverLogImplementation(java.lang.String str) throws org.apache.commons.logging.LogConfigurationException {
        if (isDiagnosticsEnabled()) {
            logDiagnostic("Discovering a Log implementation...");
        }
        initConfiguration();
        java.lang.String strFindUserSpecifiedLogClassName = findUserSpecifiedLogClassName();
        if (strFindUserSpecifiedLogClassName == null) {
            org.apache.commons.logging.Log logCreateLogFromClass = null;
            int i = 0;
            if (isDiagnosticsEnabled()) {
                logDiagnostic("No user-specified Log implementation; performing discovery using the standard supported logging implementations...");
            }
            while (true) {
                java.lang.String[] strArr = classesToDiscover;
                if (i >= strArr.length || logCreateLogFromClass != null) {
                    break;
                }
                logCreateLogFromClass = createLogFromClass(strArr[i], str, true);
                i++;
            }
            if (logCreateLogFromClass != null) {
                return logCreateLogFromClass;
            }
            throw new org.apache.commons.logging.LogConfigurationException("No suitable Log implementation");
        }
        if (isDiagnosticsEnabled()) {
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Attempting to load user-specified log class '");
            stringBuffer.append(strFindUserSpecifiedLogClassName);
            stringBuffer.append("'...");
            logDiagnostic(stringBuffer.toString());
        }
        org.apache.commons.logging.Log logCreateLogFromClass2 = createLogFromClass(strFindUserSpecifiedLogClassName, str, true);
        if (logCreateLogFromClass2 != null) {
            return logCreateLogFromClass2;
        }
        java.lang.StringBuffer stringBuffer2 = new java.lang.StringBuffer("User-specified log class '");
        stringBuffer2.append(strFindUserSpecifiedLogClassName);
        stringBuffer2.append("' cannot be found or is not useable.");
        informUponSimilarName(stringBuffer2, strFindUserSpecifiedLogClassName, LOGGING_IMPL_LOG4J_LOGGER);
        informUponSimilarName(stringBuffer2, strFindUserSpecifiedLogClassName, LOGGING_IMPL_JDK14_LOGGER);
        informUponSimilarName(stringBuffer2, strFindUserSpecifiedLogClassName, LOGGING_IMPL_LUMBERJACK_LOGGER);
        informUponSimilarName(stringBuffer2, strFindUserSpecifiedLogClassName, LOGGING_IMPL_SIMPLE_LOGGER);
        throw new org.apache.commons.logging.LogConfigurationException(stringBuffer2.toString());
    }

    private java.lang.String findUserSpecifiedLogClassName() {
        if (isDiagnosticsEnabled()) {
            logDiagnostic("Trying to get log class from attribute 'org.apache.commons.logging.Log'");
        }
        java.lang.String systemProperty = (java.lang.String) getAttribute(LOG_PROPERTY);
        if (systemProperty == null) {
            if (isDiagnosticsEnabled()) {
                logDiagnostic("Trying to get log class from attribute 'org.apache.commons.logging.log'");
            }
            systemProperty = (java.lang.String) getAttribute(LOG_PROPERTY_OLD);
        }
        if (systemProperty == null) {
            if (isDiagnosticsEnabled()) {
                logDiagnostic("Trying to get log class from system property 'org.apache.commons.logging.Log'");
            }
            try {
                systemProperty = getSystemProperty(LOG_PROPERTY, null);
            } catch (java.lang.SecurityException e) {
                if (isDiagnosticsEnabled()) {
                    java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("No access allowed to system property 'org.apache.commons.logging.Log' - ");
                    stringBuffer.append(e.getMessage());
                    logDiagnostic(stringBuffer.toString());
                }
            }
        }
        if (systemProperty == null) {
            if (isDiagnosticsEnabled()) {
                logDiagnostic("Trying to get log class from system property 'org.apache.commons.logging.log'");
            }
            try {
                systemProperty = getSystemProperty(LOG_PROPERTY_OLD, null);
            } catch (java.lang.SecurityException e2) {
                if (isDiagnosticsEnabled()) {
                    java.lang.StringBuffer stringBuffer2 = new java.lang.StringBuffer("No access allowed to system property 'org.apache.commons.logging.log' - ");
                    stringBuffer2.append(e2.getMessage());
                    logDiagnostic(stringBuffer2.toString());
                }
            }
        }
        if (systemProperty != null) {
            return systemProperty.trim();
        }
        return null;
    }

    private java.lang.ClassLoader getBaseClassLoader() throws org.apache.commons.logging.LogConfigurationException {
        java.lang.Class clsClass$ = class$org$apache$commons$logging$impl$LogFactoryImpl;
        if (clsClass$ == null) {
            clsClass$ = class$(org.apache.commons.logging.LogFactory.FACTORY_DEFAULT);
            class$org$apache$commons$logging$impl$LogFactoryImpl = clsClass$;
        }
        java.lang.ClassLoader classLoader = getClassLoader(clsClass$);
        if (!this.useTCCL) {
            return classLoader;
        }
        java.lang.ClassLoader contextClassLoaderInternal = getContextClassLoaderInternal();
        java.lang.ClassLoader lowestClassLoader = getLowestClassLoader(contextClassLoaderInternal, classLoader);
        if (lowestClassLoader == null) {
            if (!this.allowFlawedContext) {
                throw new org.apache.commons.logging.LogConfigurationException("Bad classloader hierarchy; LogFactoryImpl was loaded via a classloader that is not related to the current context classloader.");
            }
            if (isDiagnosticsEnabled()) {
                logDiagnostic("[WARNING] the context classloader is not part of a parent-child relationship with the classloader that loaded LogFactoryImpl.");
            }
            return contextClassLoaderInternal;
        }
        if (lowestClassLoader != contextClassLoaderInternal) {
            if (!this.allowFlawedContext) {
                throw new org.apache.commons.logging.LogConfigurationException("Bad classloader hierarchy; LogFactoryImpl was loaded via a classloader that is not related to the current context classloader.");
            }
            if (isDiagnosticsEnabled()) {
                logDiagnostic("Warning: the context classloader is an ancestor of the classloader that loaded LogFactoryImpl; it should be the same or a descendant. The application using commons-logging should ensure the context classloader is used correctly.");
                return lowestClassLoader;
            }
        }
        return lowestClassLoader;
    }

    private boolean getBooleanConfiguration(java.lang.String str, boolean z) {
        java.lang.String configurationValue = getConfigurationValue(str);
        return configurationValue == null ? z : java.lang.Boolean.valueOf(configurationValue).booleanValue();
    }

    protected static java.lang.ClassLoader getClassLoader(java.lang.Class cls) {
        return org.apache.commons.logging.LogFactory.getClassLoader(cls);
    }

    private java.lang.String getConfigurationValue(java.lang.String str) {
        if (isDiagnosticsEnabled()) {
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("[ENV] Trying to get configuration for item ");
            stringBuffer.append(str);
            logDiagnostic(stringBuffer.toString());
        }
        java.lang.Object attribute = getAttribute(str);
        if (attribute != null) {
            if (isDiagnosticsEnabled()) {
                java.lang.StringBuffer stringBuffer2 = new java.lang.StringBuffer("[ENV] Found LogFactory attribute [");
                stringBuffer2.append(attribute);
                stringBuffer2.append("] for ");
                stringBuffer2.append(str);
                logDiagnostic(stringBuffer2.toString());
            }
            return attribute.toString();
        }
        if (isDiagnosticsEnabled()) {
            java.lang.StringBuffer stringBuffer3 = new java.lang.StringBuffer("[ENV] No LogFactory attribute found for ");
            stringBuffer3.append(str);
            logDiagnostic(stringBuffer3.toString());
        }
        try {
            java.lang.String systemProperty = getSystemProperty(str, null);
            if (systemProperty != null) {
                if (isDiagnosticsEnabled()) {
                    java.lang.StringBuffer stringBuffer4 = new java.lang.StringBuffer("[ENV] Found system property [");
                    stringBuffer4.append(systemProperty);
                    stringBuffer4.append("] for ");
                    stringBuffer4.append(str);
                    logDiagnostic(stringBuffer4.toString());
                }
                return systemProperty;
            }
            if (isDiagnosticsEnabled()) {
                java.lang.StringBuffer stringBuffer5 = new java.lang.StringBuffer("[ENV] No system property found for property ");
                stringBuffer5.append(str);
                logDiagnostic(stringBuffer5.toString());
            }
            if (isDiagnosticsEnabled()) {
                java.lang.StringBuffer stringBuffer6 = new java.lang.StringBuffer("[ENV] No configuration defined for item ");
                stringBuffer6.append(str);
                logDiagnostic(stringBuffer6.toString());
            }
            return null;
        } catch (java.lang.SecurityException unused) {
            if (isDiagnosticsEnabled()) {
                java.lang.StringBuffer stringBuffer7 = new java.lang.StringBuffer("[ENV] Security prevented reading system property ");
                stringBuffer7.append(str);
                logDiagnostic(stringBuffer7.toString());
            }
        }
    }

    protected static java.lang.ClassLoader getContextClassLoader() throws org.apache.commons.logging.LogConfigurationException {
        return org.apache.commons.logging.LogFactory.getContextClassLoader();
    }

    private static java.lang.ClassLoader getContextClassLoaderInternal() throws org.apache.commons.logging.LogConfigurationException {
        return (java.lang.ClassLoader) java.security.AccessController.doPrivileged(new java.security.PrivilegedAction() { // from class: org.apache.commons.logging.impl.LogFactoryImpl.1
            @Override // java.security.PrivilegedAction
            public java.lang.Object run() {
                return org.apache.commons.logging.impl.LogFactoryImpl.directGetContextClassLoader();
            }
        });
    }

    private java.lang.ClassLoader getLowestClassLoader(java.lang.ClassLoader classLoader, java.lang.ClassLoader classLoader2) {
        if (classLoader != null) {
            if (classLoader2 != null) {
                java.lang.ClassLoader parentClassLoader = classLoader;
                while (parentClassLoader != null) {
                    if (parentClassLoader != classLoader2) {
                        parentClassLoader = getParentClassLoader(parentClassLoader);
                    }
                }
                java.lang.ClassLoader parentClassLoader2 = classLoader2;
                while (parentClassLoader2 != null) {
                    if (parentClassLoader2 != classLoader) {
                        parentClassLoader2 = getParentClassLoader(parentClassLoader2);
                    }
                }
                return null;
            }
            return classLoader;
        }
        return classLoader2;
    }

    private java.lang.ClassLoader getParentClassLoader(java.lang.ClassLoader classLoader) {
        try {
            return (java.lang.ClassLoader) java.security.AccessController.doPrivileged(new java.security.PrivilegedAction(this, classLoader) { // from class: org.apache.commons.logging.impl.LogFactoryImpl.3
                private final org.apache.commons.logging.impl.LogFactoryImpl this$0;
                private final java.lang.ClassLoader val$cl;

                {
                    this.this$0 = this;
                    this.val$cl = classLoader;
                }

                @Override // java.security.PrivilegedAction
                public java.lang.Object run() {
                    return this.val$cl.getParent();
                }
            });
        } catch (java.lang.SecurityException unused) {
            logDiagnostic("[SECURITY] Unable to obtain parent classloader");
            return null;
        }
    }

    private static java.lang.String getSystemProperty(java.lang.String str, java.lang.String str2) throws java.lang.SecurityException {
        return (java.lang.String) java.security.AccessController.doPrivileged(new java.security.PrivilegedAction(str, str2) { // from class: org.apache.commons.logging.impl.LogFactoryImpl.2
            private final java.lang.String val$def;
            private final java.lang.String val$key;

            {
                this.val$key = str;
                this.val$def = str2;
            }

            @Override // java.security.PrivilegedAction
            public java.lang.Object run() {
                return java.lang.System.getProperty(this.val$key, this.val$def);
            }
        });
    }

    private void handleFlawedDiscovery(java.lang.String str, java.lang.ClassLoader classLoader, java.lang.Throwable th) {
        java.lang.Throwable targetException;
        java.lang.Throwable exception;
        if (isDiagnosticsEnabled()) {
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Could not instantiate Log '");
            stringBuffer.append(str);
            stringBuffer.append("' -- ");
            stringBuffer.append(th.getClass().getName());
            stringBuffer.append(": ");
            stringBuffer.append(th.getLocalizedMessage());
            logDiagnostic(stringBuffer.toString());
            if ((th instanceof java.lang.reflect.InvocationTargetException) && (targetException = ((java.lang.reflect.InvocationTargetException) th).getTargetException()) != null) {
                java.lang.StringBuffer stringBuffer2 = new java.lang.StringBuffer("... InvocationTargetException: ");
                stringBuffer2.append(targetException.getClass().getName());
                stringBuffer2.append(": ");
                stringBuffer2.append(targetException.getLocalizedMessage());
                logDiagnostic(stringBuffer2.toString());
                if ((targetException instanceof java.lang.ExceptionInInitializerError) && (exception = ((java.lang.ExceptionInInitializerError) targetException).getException()) != null) {
                    java.io.StringWriter stringWriter = new java.io.StringWriter();
                    exception.printStackTrace(new java.io.PrintWriter((java.io.Writer) stringWriter, true));
                    java.lang.StringBuffer stringBuffer3 = new java.lang.StringBuffer("... ExceptionInInitializerError: ");
                    stringBuffer3.append(stringWriter.toString());
                    logDiagnostic(stringBuffer3.toString());
                }
            }
        }
        if (!this.allowFlawedDiscovery) {
            throw new org.apache.commons.logging.LogConfigurationException(th);
        }
    }

    private void handleFlawedHierarchy(java.lang.ClassLoader classLoader, java.lang.Class cls) throws org.apache.commons.logging.LogConfigurationException {
        java.lang.Class clsClass$ = class$org$apache$commons$logging$Log;
        if (clsClass$ == null) {
            clsClass$ = class$(LOG_PROPERTY);
            class$org$apache$commons$logging$Log = clsClass$;
        }
        java.lang.String name = clsClass$.getName();
        for (java.lang.Class<?> cls2 : cls.getInterfaces()) {
            if (name.equals(cls2.getName())) {
                if (isDiagnosticsEnabled()) {
                    try {
                        java.lang.Class clsClass$2 = class$org$apache$commons$logging$Log;
                        if (clsClass$2 == null) {
                            clsClass$2 = class$(LOG_PROPERTY);
                            class$org$apache$commons$logging$Log = clsClass$2;
                        }
                        java.lang.ClassLoader classLoader2 = getClassLoader(clsClass$2);
                        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
                        stringBuffer.append("Class '");
                        stringBuffer.append(cls.getName());
                        stringBuffer.append("' was found in classloader ");
                        stringBuffer.append(objectId(classLoader));
                        stringBuffer.append(". It is bound to a Log interface which is not");
                        stringBuffer.append(" the one loaded from classloader ");
                        stringBuffer.append(objectId(classLoader2));
                        logDiagnostic(stringBuffer.toString());
                    } catch (java.lang.Throwable th) {
                        handleThrowable(th);
                        java.lang.StringBuffer stringBuffer2 = new java.lang.StringBuffer("Error while trying to output diagnostics about bad class '");
                        stringBuffer2.append(cls);
                        stringBuffer2.append("'");
                        logDiagnostic(stringBuffer2.toString());
                    }
                }
                if (!this.allowFlawedHierarchy) {
                    java.lang.StringBuffer stringBuffer3 = new java.lang.StringBuffer("Terminating logging for this context due to bad log hierarchy. You have more than one version of '");
                    java.lang.Class clsClass$3 = class$org$apache$commons$logging$Log;
                    if (clsClass$3 == null) {
                        clsClass$3 = class$(LOG_PROPERTY);
                        class$org$apache$commons$logging$Log = clsClass$3;
                    }
                    stringBuffer3.append(clsClass$3.getName());
                    stringBuffer3.append("' visible.");
                    if (isDiagnosticsEnabled()) {
                        logDiagnostic(stringBuffer3.toString());
                    }
                    throw new org.apache.commons.logging.LogConfigurationException(stringBuffer3.toString());
                }
                if (isDiagnosticsEnabled()) {
                    java.lang.StringBuffer stringBuffer4 = new java.lang.StringBuffer("Warning: bad log hierarchy. You have more than one version of '");
                    java.lang.Class clsClass$4 = class$org$apache$commons$logging$Log;
                    if (clsClass$4 == null) {
                        clsClass$4 = class$(LOG_PROPERTY);
                        class$org$apache$commons$logging$Log = clsClass$4;
                    }
                    stringBuffer4.append(clsClass$4.getName());
                    stringBuffer4.append("' visible.");
                    logDiagnostic(stringBuffer4.toString());
                    return;
                }
                return;
            }
        }
        if (!this.allowFlawedDiscovery) {
            java.lang.StringBuffer stringBuffer5 = new java.lang.StringBuffer("Terminating logging for this context. Log class '");
            stringBuffer5.append(cls.getName());
            stringBuffer5.append("' does not implement the Log interface.");
            if (isDiagnosticsEnabled()) {
                logDiagnostic(stringBuffer5.toString());
            }
            throw new org.apache.commons.logging.LogConfigurationException(stringBuffer5.toString());
        }
        if (isDiagnosticsEnabled()) {
            java.lang.StringBuffer stringBuffer6 = new java.lang.StringBuffer("[WARNING] Log class '");
            stringBuffer6.append(cls.getName());
            stringBuffer6.append("' does not implement the Log interface.");
            logDiagnostic(stringBuffer6.toString());
        }
    }

    private void informUponSimilarName(java.lang.StringBuffer stringBuffer, java.lang.String str, java.lang.String str2) {
        if (!str.equals(str2) && str.regionMatches(true, 0, str2, 0, PKG_LEN + 5)) {
            stringBuffer.append(" Did you mean '");
            stringBuffer.append(str2);
            stringBuffer.append("'?");
        }
    }

    private void initConfiguration() {
        this.allowFlawedContext = getBooleanConfiguration(ALLOW_FLAWED_CONTEXT_PROPERTY, true);
        this.allowFlawedDiscovery = getBooleanConfiguration(ALLOW_FLAWED_DISCOVERY_PROPERTY, true);
        this.allowFlawedHierarchy = getBooleanConfiguration(ALLOW_FLAWED_HIERARCHY_PROPERTY, true);
    }

    private void initDiagnostics() {
        java.lang.String strObjectId;
        java.lang.ClassLoader classLoader = getClassLoader(getClass());
        if (classLoader == null) {
            strObjectId = "BOOTLOADER";
        } else {
            try {
                strObjectId = objectId(classLoader);
            } catch (java.lang.SecurityException unused) {
                strObjectId = "UNKNOWN";
            }
        }
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("[LogFactoryImpl@");
        stringBuffer.append(java.lang.System.identityHashCode(this));
        stringBuffer.append(" from ");
        stringBuffer.append(strObjectId);
        stringBuffer.append("] ");
        this.diagnosticPrefix = stringBuffer.toString();
    }

    protected static boolean isDiagnosticsEnabled() {
        return org.apache.commons.logging.LogFactory.isDiagnosticsEnabled();
    }

    private boolean isLogLibraryAvailable(java.lang.String str, java.lang.String str2) {
        if (isDiagnosticsEnabled()) {
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Checking for '");
            stringBuffer.append(str);
            stringBuffer.append("'.");
            logDiagnostic(stringBuffer.toString());
        }
        try {
            if (createLogFromClass(str2, getClass().getName(), false) == null) {
                if (isDiagnosticsEnabled()) {
                    java.lang.StringBuffer stringBuffer2 = new java.lang.StringBuffer("Did not find '");
                    stringBuffer2.append(str);
                    stringBuffer2.append("'.");
                    logDiagnostic(stringBuffer2.toString());
                }
                return false;
            }
            if (!isDiagnosticsEnabled()) {
                return true;
            }
            java.lang.StringBuffer stringBuffer3 = new java.lang.StringBuffer("Found '");
            stringBuffer3.append(str);
            stringBuffer3.append("'.");
            logDiagnostic(stringBuffer3.toString());
            return true;
        } catch (org.apache.commons.logging.LogConfigurationException unused) {
            if (isDiagnosticsEnabled()) {
                java.lang.StringBuffer stringBuffer4 = new java.lang.StringBuffer("Logging system '");
                stringBuffer4.append(str);
                stringBuffer4.append("' is available but not useable.");
                logDiagnostic(stringBuffer4.toString());
            }
            return false;
        }
    }

    @Override // org.apache.commons.logging.LogFactory
    public java.lang.Object getAttribute(java.lang.String str) {
        return this.attributes.get(str);
    }

    @Override // org.apache.commons.logging.LogFactory
    public java.lang.String[] getAttributeNames() {
        java.util.Hashtable hashtable = this.attributes;
        return (java.lang.String[]) j$.util.DesugarCollections.bridge_synchronizedSet(hashtable.keySet(), hashtable).toArray(new java.lang.String[this.attributes.size()]);
    }

    @Override // org.apache.commons.logging.LogFactory
    public org.apache.commons.logging.Log getInstance(java.lang.String str) throws org.apache.commons.logging.LogConfigurationException {
        org.apache.commons.logging.Log log = (org.apache.commons.logging.Log) this.instances.get(str);
        if (log != null) {
            return log;
        }
        org.apache.commons.logging.Log logNewInstance = newInstance(str);
        this.instances.put(str, logNewInstance);
        return logNewInstance;
    }

    protected java.lang.String getLogClassName() {
        if (this.logClassName == null) {
            discoverLogImplementation(getClass().getName());
        }
        return this.logClassName;
    }

    protected java.lang.reflect.Constructor getLogConstructor() throws org.apache.commons.logging.LogConfigurationException {
        if (this.logConstructor == null) {
            discoverLogImplementation(getClass().getName());
        }
        return this.logConstructor;
    }

    protected boolean isJdk13LumberjackAvailable() {
        return isLogLibraryAvailable("Jdk13Lumberjack", LOGGING_IMPL_LUMBERJACK_LOGGER);
    }

    protected boolean isJdk14Available() {
        return isLogLibraryAvailable("Jdk14", LOGGING_IMPL_JDK14_LOGGER);
    }

    protected boolean isLog4JAvailable() {
        return isLogLibraryAvailable("Log4J", LOGGING_IMPL_LOG4J_LOGGER);
    }

    protected void logDiagnostic(java.lang.String str) {
        if (isDiagnosticsEnabled()) {
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
            stringBuffer.append(this.diagnosticPrefix);
            stringBuffer.append(str);
            logRawDiagnostic(stringBuffer.toString());
        }
    }

    protected org.apache.commons.logging.Log newInstance(java.lang.String str) throws org.apache.commons.logging.LogConfigurationException {
        try {
            java.lang.reflect.Constructor constructor = this.logConstructor;
            org.apache.commons.logging.Log logDiscoverLogImplementation = constructor == null ? discoverLogImplementation(str) : (org.apache.commons.logging.Log) constructor.newInstance(str);
            java.lang.reflect.Method method = this.logMethod;
            if (method != null) {
                method.invoke(logDiscoverLogImplementation, this);
            }
            return logDiscoverLogImplementation;
        } catch (java.lang.reflect.InvocationTargetException e) {
            e = e;
            java.lang.Throwable targetException = e.getTargetException();
            if (targetException != null) {
                e = targetException;
            }
            throw new org.apache.commons.logging.LogConfigurationException(e);
        } catch (org.apache.commons.logging.LogConfigurationException e2) {
            throw e2;
        } catch (java.lang.Throwable th) {
            handleThrowable(th);
            throw new org.apache.commons.logging.LogConfigurationException(th);
        }
    }

    @Override // org.apache.commons.logging.LogFactory
    public void release() {
        logDiagnostic("Releasing all known loggers");
        this.instances.clear();
    }

    @Override // org.apache.commons.logging.LogFactory
    public void removeAttribute(java.lang.String str) {
        this.attributes.remove(str);
    }

    @Override // org.apache.commons.logging.LogFactory
    public void setAttribute(java.lang.String str, java.lang.Object obj) {
        if (this.logConstructor != null) {
            logDiagnostic("setAttribute: call too late; configuration already performed.");
        }
        java.util.Hashtable hashtable = this.attributes;
        if (obj == null) {
            hashtable.remove(str);
        } else {
            hashtable.put(str, obj);
        }
        if (str.equals(org.apache.commons.logging.LogFactory.TCCL_KEY)) {
            boolean z = false;
            if (obj != null && java.lang.Boolean.valueOf(obj.toString()).booleanValue()) {
                z = true;
            }
            this.useTCCL = z;
        }
    }

    @Override // org.apache.commons.logging.LogFactory
    public org.apache.commons.logging.Log getInstance(java.lang.Class cls) throws org.apache.commons.logging.LogConfigurationException {
        return getInstance(cls.getName());
    }
}
