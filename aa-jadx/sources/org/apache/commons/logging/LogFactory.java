package org.apache.commons.logging;

/* JADX INFO: loaded from: classes2.dex */
public abstract class LogFactory {
    public static final java.lang.String DIAGNOSTICS_DEST_PROPERTY = "org.apache.commons.logging.diagnostics.dest";
    public static final java.lang.String FACTORY_DEFAULT = "org.apache.commons.logging.impl.LogFactoryImpl";
    public static final java.lang.String FACTORY_PROPERTIES = "commons-logging.properties";
    public static final java.lang.String FACTORY_PROPERTY = "org.apache.commons.logging.LogFactory";
    public static final java.lang.String HASHTABLE_IMPLEMENTATION_PROPERTY = "org.apache.commons.logging.LogFactory.HashtableImpl";
    public static final java.lang.String PRIORITY_KEY = "priority";
    protected static final java.lang.String SERVICE_ID = "META-INF/services/org.apache.commons.logging.LogFactory";
    public static final java.lang.String TCCL_KEY = "use_tccl";
    private static final java.lang.String WEAK_HASHTABLE_CLASSNAME = "org.apache.commons.logging.impl.WeakHashtable";
    static java.lang.Class class$org$apache$commons$logging$LogFactory;
    private static final java.lang.String diagnosticPrefix;
    private static java.io.PrintStream diagnosticsStream;
    protected static java.util.Hashtable factories;
    protected static volatile org.apache.commons.logging.LogFactory nullClassLoaderFactory;
    private static final java.lang.ClassLoader thisClassLoader;

    static {
        java.lang.String strObjectId;
        java.lang.Class clsClass$ = class$org$apache$commons$logging$LogFactory;
        if (clsClass$ == null) {
            clsClass$ = class$(FACTORY_PROPERTY);
            class$org$apache$commons$logging$LogFactory = clsClass$;
        }
        java.lang.ClassLoader classLoader = getClassLoader(clsClass$);
        thisClassLoader = classLoader;
        if (classLoader == null) {
            strObjectId = "BOOTLOADER";
        } else {
            try {
                strObjectId = objectId(classLoader);
            } catch (java.lang.SecurityException unused) {
                strObjectId = "UNKNOWN";
            }
        }
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("[LogFactory from ");
        stringBuffer.append(strObjectId);
        stringBuffer.append("] ");
        diagnosticPrefix = stringBuffer.toString();
        diagnosticsStream = initDiagnostics();
        java.lang.Class clsClass$2 = class$org$apache$commons$logging$LogFactory;
        if (clsClass$2 == null) {
            clsClass$2 = class$(FACTORY_PROPERTY);
            class$org$apache$commons$logging$LogFactory = clsClass$2;
        }
        logClassLoaderEnvironment(clsClass$2);
        factories = createFactoryStore();
        if (isDiagnosticsEnabled()) {
            logDiagnostic("BOOTSTRAP COMPLETED");
        }
    }

    protected LogFactory() {
    }

    private static void cacheFactory(java.lang.ClassLoader classLoader, org.apache.commons.logging.LogFactory logFactory) {
        if (logFactory != null) {
            if (classLoader == null) {
                nullClassLoaderFactory = logFactory;
            } else {
                factories.put(classLoader, logFactory);
            }
        }
    }

    static java.lang.Class class$(java.lang.String str) {
        try {
            return java.lang.Class.forName(str);
        } catch (java.lang.ClassNotFoundException e) {
            throw new java.lang.NoClassDefFoundError(e.getMessage());
        }
    }

    protected static java.lang.Object createFactory(java.lang.String str, java.lang.ClassLoader classLoader) {
        java.lang.Class<?> clsLoadClass = null;
        try {
            if (classLoader != null) {
                try {
                    try {
                        clsLoadClass = classLoader.loadClass(str);
                        java.lang.Class clsClass$ = class$org$apache$commons$logging$LogFactory;
                        if (clsClass$ == null) {
                            clsClass$ = class$(FACTORY_PROPERTY);
                            class$org$apache$commons$logging$LogFactory = clsClass$;
                        }
                        if (clsClass$.isAssignableFrom(clsLoadClass)) {
                            if (isDiagnosticsEnabled()) {
                                java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Loaded class ");
                                stringBuffer.append(clsLoadClass.getName());
                                stringBuffer.append(" from classloader ");
                                stringBuffer.append(objectId(classLoader));
                                logDiagnostic(stringBuffer.toString());
                            }
                        } else if (isDiagnosticsEnabled()) {
                            java.lang.StringBuffer stringBuffer2 = new java.lang.StringBuffer("Factory class ");
                            stringBuffer2.append(clsLoadClass.getName());
                            stringBuffer2.append(" loaded from classloader ");
                            stringBuffer2.append(objectId(clsLoadClass.getClassLoader()));
                            stringBuffer2.append(" does not extend '");
                            java.lang.Class clsClass$2 = class$org$apache$commons$logging$LogFactory;
                            if (clsClass$2 == null) {
                                clsClass$2 = class$(FACTORY_PROPERTY);
                                class$org$apache$commons$logging$LogFactory = clsClass$2;
                            }
                            stringBuffer2.append(clsClass$2.getName());
                            stringBuffer2.append("' as loaded by this classloader.");
                            logDiagnostic(stringBuffer2.toString());
                            logHierarchy("[BAD CL TREE] ", classLoader);
                        }
                        return (org.apache.commons.logging.LogFactory) clsLoadClass.newInstance();
                    } catch (java.lang.ClassNotFoundException e) {
                        if (classLoader == thisClassLoader) {
                            if (isDiagnosticsEnabled()) {
                                java.lang.StringBuffer stringBuffer3 = new java.lang.StringBuffer("Unable to locate any class called '");
                                stringBuffer3.append(str);
                                stringBuffer3.append("' via classloader ");
                                stringBuffer3.append(objectId(classLoader));
                                logDiagnostic(stringBuffer3.toString());
                            }
                            throw e;
                        }
                    }
                } catch (java.lang.ClassCastException unused) {
                    if (classLoader == thisClassLoader) {
                        boolean zImplementsLogFactory = implementsLogFactory(clsLoadClass);
                        java.lang.StringBuffer stringBuffer4 = new java.lang.StringBuffer("The application has specified that a custom LogFactory implementation should be used but Class '");
                        stringBuffer4.append(str);
                        stringBuffer4.append("' cannot be converted to '");
                        java.lang.Class clsClass$3 = class$org$apache$commons$logging$LogFactory;
                        if (clsClass$3 == null) {
                            clsClass$3 = class$(FACTORY_PROPERTY);
                            class$org$apache$commons$logging$LogFactory = clsClass$3;
                        }
                        stringBuffer4.append(clsClass$3.getName());
                        stringBuffer4.append("'. ");
                        if (zImplementsLogFactory) {
                            stringBuffer4.append("The conflict is caused by the presence of multiple LogFactory classes in incompatible classloaders. Background can be found in http://commons.apache.org/logging/tech.html. If you have not explicitly specified a custom LogFactory then it is likely that the container has set one without your knowledge. In this case, consider using the commons-logging-adapters.jar file or specifying the standard LogFactory from the command line. ");
                        } else {
                            stringBuffer4.append("Please check the custom implementation. ");
                        }
                        stringBuffer4.append("Help can be found @http://commons.apache.org/logging/troubleshooting.html.");
                        if (isDiagnosticsEnabled()) {
                            logDiagnostic(stringBuffer4.toString());
                        }
                        throw new java.lang.ClassCastException(stringBuffer4.toString());
                    }
                } catch (java.lang.NoClassDefFoundError e2) {
                    if (classLoader == thisClassLoader) {
                        if (isDiagnosticsEnabled()) {
                            java.lang.StringBuffer stringBuffer5 = new java.lang.StringBuffer("Class '");
                            stringBuffer5.append(str);
                            stringBuffer5.append("' cannot be loaded via classloader ");
                            stringBuffer5.append(objectId(classLoader));
                            stringBuffer5.append(" - it depends on some other class that cannot be found.");
                            logDiagnostic(stringBuffer5.toString());
                        }
                        throw e2;
                    }
                }
            }
            if (isDiagnosticsEnabled()) {
                java.lang.StringBuffer stringBuffer6 = new java.lang.StringBuffer("Unable to load factory class via classloader ");
                stringBuffer6.append(objectId(classLoader));
                stringBuffer6.append(" - trying the classloader associated with this LogFactory.");
                logDiagnostic(stringBuffer6.toString());
            }
            return (org.apache.commons.logging.LogFactory) java.lang.Class.forName(str).newInstance();
        } catch (java.lang.Exception e3) {
            if (isDiagnosticsEnabled()) {
                logDiagnostic("Unable to create LogFactory instance.");
            }
            if (clsLoadClass != null) {
                java.lang.Class clsClass$4 = class$org$apache$commons$logging$LogFactory;
                if (clsClass$4 == null) {
                    clsClass$4 = class$(FACTORY_PROPERTY);
                    class$org$apache$commons$logging$LogFactory = clsClass$4;
                }
                if (!clsClass$4.isAssignableFrom(clsLoadClass)) {
                    return new org.apache.commons.logging.LogConfigurationException("The chosen LogFactory implementation does not extend LogFactory. Please check your configuration.", e3);
                }
            }
            return new org.apache.commons.logging.LogConfigurationException(e3);
        }
    }

    private static final java.util.Hashtable createFactoryStore() {
        java.lang.String systemProperty;
        java.util.Hashtable hashtable = null;
        try {
            systemProperty = getSystemProperty(HASHTABLE_IMPLEMENTATION_PROPERTY, null);
        } catch (java.lang.SecurityException unused) {
            systemProperty = null;
        }
        if (systemProperty == null) {
            systemProperty = WEAK_HASHTABLE_CLASSNAME;
        }
        try {
            hashtable = (java.util.Hashtable) java.lang.Class.forName(systemProperty).newInstance();
        } catch (java.lang.Throwable th) {
            handleThrowable(th);
            if (!WEAK_HASHTABLE_CLASSNAME.equals(systemProperty)) {
                if (isDiagnosticsEnabled()) {
                    logDiagnostic("[ERROR] LogFactory: Load of custom hashtable failed");
                } else {
                    java.lang.System.err.println("[ERROR] LogFactory: Load of custom hashtable failed");
                }
            }
        }
        return hashtable == null ? new java.util.Hashtable() : hashtable;
    }

    protected static java.lang.ClassLoader directGetContextClassLoader() throws org.apache.commons.logging.LogConfigurationException {
        try {
            return java.lang.Thread.currentThread().getContextClassLoader();
        } catch (java.lang.SecurityException unused) {
            return null;
        }
    }

    private static org.apache.commons.logging.LogFactory getCachedFactory(java.lang.ClassLoader classLoader) {
        return classLoader == null ? nullClassLoaderFactory : (org.apache.commons.logging.LogFactory) factories.get(classLoader);
    }

    protected static java.lang.ClassLoader getClassLoader(java.lang.Class cls) {
        try {
            return cls.getClassLoader();
        } catch (java.lang.SecurityException e) {
            if (isDiagnosticsEnabled()) {
                java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Unable to get classloader for class '");
                stringBuffer.append(cls);
                stringBuffer.append("' due to security restrictions - ");
                stringBuffer.append(e.getMessage());
                logDiagnostic(stringBuffer.toString());
            }
            throw e;
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00ec A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:45:0x0105  */
    private static final java.util.Properties getConfigurationFile(java.lang.ClassLoader classLoader, java.lang.String str) {
        java.net.URL url;
        java.util.Properties properties = null;
        try {
            java.util.Enumeration resources = getResources(classLoader, str);
            if (resources == null) {
                return null;
            }
            url = null;
            double d = 0.0d;
            while (resources.hasMoreElements()) {
                try {
                    java.net.URL url2 = (java.net.URL) resources.nextElement();
                    java.util.Properties properties2 = getProperties(url2);
                    if (properties2 != null) {
                        if (properties == null) {
                            try {
                                java.lang.String property = properties2.getProperty(PRIORITY_KEY);
                                d = property != null ? java.lang.Double.parseDouble(property) : 0.0d;
                                if (isDiagnosticsEnabled()) {
                                    java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
                                    stringBuffer.append("[LOOKUP] Properties file found at '");
                                    stringBuffer.append(url2);
                                    stringBuffer.append("'");
                                    stringBuffer.append(" with priority ");
                                    stringBuffer.append(d);
                                    logDiagnostic(stringBuffer.toString());
                                }
                                url = url2;
                                properties = properties2;
                            } catch (java.lang.SecurityException unused) {
                                url = url2;
                                properties = properties2;
                                if (isDiagnosticsEnabled()) {
                                    logDiagnostic("SecurityException thrown while trying to find/read config files.");
                                }
                                if (isDiagnosticsEnabled()) {
                                    if (properties == null) {
                                        java.lang.StringBuffer stringBuffer2 = new java.lang.StringBuffer("[LOOKUP] No properties file of name '");
                                        stringBuffer2.append(str);
                                        stringBuffer2.append("' found.");
                                        logDiagnostic(stringBuffer2.toString());
                                    } else {
                                        java.lang.StringBuffer stringBuffer3 = new java.lang.StringBuffer("[LOOKUP] Properties file of name '");
                                        stringBuffer3.append(str);
                                        stringBuffer3.append("' found at '");
                                        stringBuffer3.append(url);
                                        stringBuffer3.append('\"');
                                        logDiagnostic(stringBuffer3.toString());
                                    }
                                }
                                return properties;
                            }
                        } else {
                            java.lang.String property2 = properties2.getProperty(PRIORITY_KEY);
                            double d2 = property2 != null ? java.lang.Double.parseDouble(property2) : 0.0d;
                            if (d2 > d) {
                                if (isDiagnosticsEnabled()) {
                                    java.lang.StringBuffer stringBuffer4 = new java.lang.StringBuffer();
                                    stringBuffer4.append("[LOOKUP] Properties file at '");
                                    stringBuffer4.append(url2);
                                    stringBuffer4.append("'");
                                    stringBuffer4.append(" with priority ");
                                    stringBuffer4.append(d2);
                                    stringBuffer4.append(" overrides file at '");
                                    stringBuffer4.append(url);
                                    stringBuffer4.append("'");
                                    stringBuffer4.append(" with priority ");
                                    stringBuffer4.append(d);
                                    logDiagnostic(stringBuffer4.toString());
                                }
                                url = url2;
                                properties = properties2;
                                d = d2;
                            } else if (isDiagnosticsEnabled()) {
                                java.lang.StringBuffer stringBuffer5 = new java.lang.StringBuffer();
                                stringBuffer5.append("[LOOKUP] Properties file at '");
                                stringBuffer5.append(url2);
                                stringBuffer5.append("'");
                                stringBuffer5.append(" with priority ");
                                stringBuffer5.append(d2);
                                stringBuffer5.append(" does not override file at '");
                                stringBuffer5.append(url);
                                stringBuffer5.append("'");
                                stringBuffer5.append(" with priority ");
                                stringBuffer5.append(d);
                                logDiagnostic(stringBuffer5.toString());
                            }
                        }
                    }
                } catch (java.lang.SecurityException unused2) {
                }
            }
            if (isDiagnosticsEnabled()) {
                if (properties == null) {
                    java.lang.StringBuffer stringBuffer6 = new java.lang.StringBuffer("[LOOKUP] No properties file of name '");
                    stringBuffer6.append(str);
                    stringBuffer6.append("' found.");
                    logDiagnostic(stringBuffer6.toString());
                } else {
                    java.lang.StringBuffer stringBuffer7 = new java.lang.StringBuffer("[LOOKUP] Properties file of name '");
                    stringBuffer7.append(str);
                    stringBuffer7.append("' found at '");
                    stringBuffer7.append(url);
                    stringBuffer7.append('\"');
                    logDiagnostic(stringBuffer7.toString());
                }
            }
            return properties;
        } catch (java.lang.SecurityException unused3) {
            url = null;
        }
    }

    protected static java.lang.ClassLoader getContextClassLoader() throws org.apache.commons.logging.LogConfigurationException {
        return directGetContextClassLoader();
    }

    private static java.lang.ClassLoader getContextClassLoaderInternal() throws org.apache.commons.logging.LogConfigurationException {
        return (java.lang.ClassLoader) java.security.AccessController.doPrivileged(new java.security.PrivilegedAction() { // from class: org.apache.commons.logging.LogFactory.1
            @Override // java.security.PrivilegedAction
            public java.lang.Object run() {
                return org.apache.commons.logging.LogFactory.directGetContextClassLoader();
            }
        });
    }

    public static org.apache.commons.logging.LogFactory getFactory() throws org.apache.commons.logging.LogConfigurationException {
        java.io.BufferedReader bufferedReader;
        java.lang.String property;
        java.lang.ClassLoader contextClassLoaderInternal = getContextClassLoaderInternal();
        if (contextClassLoaderInternal == null && isDiagnosticsEnabled()) {
            logDiagnostic("Context classloader is null.");
        }
        org.apache.commons.logging.LogFactory cachedFactory = getCachedFactory(contextClassLoaderInternal);
        if (cachedFactory != null) {
            return cachedFactory;
        }
        if (isDiagnosticsEnabled()) {
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("[LOOKUP] LogFactory implementation requested for the first time for context classloader ");
            stringBuffer.append(objectId(contextClassLoaderInternal));
            logDiagnostic(stringBuffer.toString());
            logHierarchy("[LOOKUP] ", contextClassLoaderInternal);
        }
        java.util.Properties configurationFile = getConfigurationFile(contextClassLoaderInternal, FACTORY_PROPERTIES);
        java.lang.ClassLoader classLoader = (configurationFile == null || (property = configurationFile.getProperty(TCCL_KEY)) == null || java.lang.Boolean.valueOf(property).booleanValue()) ? contextClassLoaderInternal : thisClassLoader;
        if (isDiagnosticsEnabled()) {
            logDiagnostic("[LOOKUP] Looking for system property [org.apache.commons.logging.LogFactory] to define the LogFactory subclass to use...");
        }
        try {
            java.lang.String systemProperty = getSystemProperty(FACTORY_PROPERTY, null);
            if (systemProperty != null) {
                if (isDiagnosticsEnabled()) {
                    java.lang.StringBuffer stringBuffer2 = new java.lang.StringBuffer("[LOOKUP] Creating an instance of LogFactory class '");
                    stringBuffer2.append(systemProperty);
                    stringBuffer2.append("' as specified by system property org.apache.commons.logging.LogFactory");
                    logDiagnostic(stringBuffer2.toString());
                }
                cachedFactory = newFactory(systemProperty, classLoader, contextClassLoaderInternal);
            } else if (isDiagnosticsEnabled()) {
                logDiagnostic("[LOOKUP] No system property [org.apache.commons.logging.LogFactory] defined.");
            }
        } catch (java.lang.SecurityException e) {
            if (isDiagnosticsEnabled()) {
                java.lang.StringBuffer stringBuffer3 = new java.lang.StringBuffer("[LOOKUP] A security exception occurred while trying to create an instance of the custom factory class: [");
                stringBuffer3.append(trim(e.getMessage()));
                stringBuffer3.append("]. Trying alternative implementations...");
                logDiagnostic(stringBuffer3.toString());
            }
        } catch (java.lang.RuntimeException e2) {
            if (isDiagnosticsEnabled()) {
                java.lang.StringBuffer stringBuffer4 = new java.lang.StringBuffer("[LOOKUP] An exception occurred while trying to create an instance of the custom factory class: [");
                stringBuffer4.append(trim(e2.getMessage()));
                stringBuffer4.append("] as specified by a system property.");
                logDiagnostic(stringBuffer4.toString());
            }
            throw e2;
        }
        if (cachedFactory == null) {
            if (isDiagnosticsEnabled()) {
                logDiagnostic("[LOOKUP] Looking for a resource file of name [META-INF/services/org.apache.commons.logging.LogFactory] to define the LogFactory subclass to use...");
            }
            try {
                java.io.InputStream resourceAsStream = getResourceAsStream(contextClassLoaderInternal, SERVICE_ID);
                if (resourceAsStream != null) {
                    try {
                        bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(resourceAsStream, com.google.android.libraries.handwriting.networkrecognizer.CloudRecognizerProtocolStrings.OUTPUT_ENCODING_VALUE));
                    } catch (java.io.UnsupportedEncodingException unused) {
                        bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(resourceAsStream));
                    }
                    java.lang.String line = bufferedReader.readLine();
                    bufferedReader.close();
                    if (line != null && !"".equals(line)) {
                        if (isDiagnosticsEnabled()) {
                            java.lang.StringBuffer stringBuffer5 = new java.lang.StringBuffer("[LOOKUP]  Creating an instance of LogFactory class ");
                            stringBuffer5.append(line);
                            stringBuffer5.append(" as specified by file 'META-INF/services/org.apache.commons.logging.LogFactory' which was present in the path of the context classloader.");
                            logDiagnostic(stringBuffer5.toString());
                        }
                        cachedFactory = newFactory(line, classLoader, contextClassLoaderInternal);
                    }
                } else if (isDiagnosticsEnabled()) {
                    logDiagnostic("[LOOKUP] No resource file with name 'META-INF/services/org.apache.commons.logging.LogFactory' found.");
                }
            } catch (java.lang.Exception e3) {
                if (isDiagnosticsEnabled()) {
                    java.lang.StringBuffer stringBuffer6 = new java.lang.StringBuffer("[LOOKUP] A security exception occurred while trying to create an instance of the custom factory class: [");
                    stringBuffer6.append(trim(e3.getMessage()));
                    stringBuffer6.append("]. Trying alternative implementations...");
                    logDiagnostic(stringBuffer6.toString());
                }
            }
        }
        if (cachedFactory == null) {
            if (configurationFile != null) {
                if (isDiagnosticsEnabled()) {
                    logDiagnostic("[LOOKUP] Looking in properties file for entry with key 'org.apache.commons.logging.LogFactory' to define the LogFactory subclass to use...");
                }
                java.lang.String property2 = configurationFile.getProperty(FACTORY_PROPERTY);
                if (property2 != null) {
                    if (isDiagnosticsEnabled()) {
                        java.lang.StringBuffer stringBuffer7 = new java.lang.StringBuffer("[LOOKUP] Properties file specifies LogFactory subclass '");
                        stringBuffer7.append(property2);
                        stringBuffer7.append("'");
                        logDiagnostic(stringBuffer7.toString());
                    }
                    cachedFactory = newFactory(property2, classLoader, contextClassLoaderInternal);
                } else if (isDiagnosticsEnabled()) {
                    logDiagnostic("[LOOKUP] Properties file has no entry specifying LogFactory subclass.");
                }
            } else if (isDiagnosticsEnabled()) {
                logDiagnostic("[LOOKUP] No properties file available to determine LogFactory subclass from..");
            }
        }
        if (cachedFactory == null) {
            if (isDiagnosticsEnabled()) {
                logDiagnostic("[LOOKUP] Loading the default LogFactory implementation 'org.apache.commons.logging.impl.LogFactoryImpl' via the same classloader that loaded this LogFactory class (ie not looking in the context classloader).");
            }
            cachedFactory = newFactory(FACTORY_DEFAULT, thisClassLoader, contextClassLoaderInternal);
        }
        if (cachedFactory != null) {
            cacheFactory(contextClassLoaderInternal, cachedFactory);
            if (configurationFile != null) {
                java.util.Enumeration<?> enumerationPropertyNames = configurationFile.propertyNames();
                while (enumerationPropertyNames.hasMoreElements()) {
                    java.lang.String str = (java.lang.String) enumerationPropertyNames.nextElement();
                    cachedFactory.setAttribute(str, configurationFile.getProperty(str));
                }
            }
        }
        return cachedFactory;
    }

    public static org.apache.commons.logging.Log getLog(java.lang.Class cls) throws org.apache.commons.logging.LogConfigurationException {
        return getFactory().getInstance(cls);
    }

    private static java.util.Properties getProperties(java.net.URL url) {
        return (java.util.Properties) java.security.AccessController.doPrivileged(new java.security.PrivilegedAction(url) { // from class: org.apache.commons.logging.LogFactory.5
            private final java.net.URL val$url;

            {
                this.val$url = url;
            }

            /* JADX WARN: Code duplicated, block: B:32:0x005d A[EXC_TOP_SPLITTER, SYNTHETIC] */
            @Override // java.security.PrivilegedAction
            public java.lang.Object run() throws java.lang.Throwable {
                java.io.InputStream inputStream;
                java.io.InputStream inputStream2 = null;
                try {
                    java.net.URLConnection uRLConnectionOpenConnection = this.val$url.openConnection();
                    uRLConnectionOpenConnection.setUseCaches(false);
                    inputStream = uRLConnectionOpenConnection.getInputStream();
                    if (inputStream != null) {
                        try {
                            try {
                                java.util.Properties properties = new java.util.Properties();
                                properties.load(inputStream);
                                inputStream.close();
                                return properties;
                            } catch (java.io.IOException unused) {
                                if (org.apache.commons.logging.LogFactory.isDiagnosticsEnabled()) {
                                    java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Unable to read URL ");
                                    stringBuffer.append(this.val$url);
                                    org.apache.commons.logging.LogFactory.logDiagnostic(stringBuffer.toString());
                                }
                                if (inputStream != null) {
                                    try {
                                        inputStream.close();
                                    } catch (java.io.IOException unused2) {
                                        if (org.apache.commons.logging.LogFactory.isDiagnosticsEnabled()) {
                                            java.lang.StringBuffer stringBuffer2 = new java.lang.StringBuffer("Unable to close stream for URL ");
                                            stringBuffer2.append(this.val$url);
                                            org.apache.commons.logging.LogFactory.logDiagnostic(stringBuffer2.toString());
                                        }
                                    }
                                }
                                return null;
                            }
                        } catch (java.lang.Throwable th) {
                            th = th;
                            inputStream2 = inputStream;
                            if (inputStream2 != null) {
                                try {
                                    inputStream2.close();
                                } catch (java.io.IOException unused3) {
                                    if (org.apache.commons.logging.LogFactory.isDiagnosticsEnabled()) {
                                        java.lang.StringBuffer stringBuffer3 = new java.lang.StringBuffer("Unable to close stream for URL ");
                                        stringBuffer3.append(this.val$url);
                                        org.apache.commons.logging.LogFactory.logDiagnostic(stringBuffer3.toString());
                                    }
                                }
                            }
                            throw th;
                        }
                    }
                } catch (java.io.IOException unused4) {
                    inputStream = null;
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    if (inputStream2 != null) {
                        inputStream2.close();
                    }
                    throw th;
                }
                return null;
            }
        });
    }

    private static java.io.InputStream getResourceAsStream(java.lang.ClassLoader classLoader, java.lang.String str) {
        return (java.io.InputStream) java.security.AccessController.doPrivileged(new java.security.PrivilegedAction(classLoader, str) { // from class: org.apache.commons.logging.LogFactory.3
            private final java.lang.ClassLoader val$loader;
            private final java.lang.String val$name;

            {
                this.val$loader = classLoader;
                this.val$name = str;
            }

            @Override // java.security.PrivilegedAction
            public java.lang.Object run() {
                java.lang.ClassLoader classLoader2 = this.val$loader;
                java.lang.String str2 = this.val$name;
                return classLoader2 != null ? classLoader2.getResourceAsStream(str2) : java.lang.ClassLoader.getSystemResourceAsStream(str2);
            }
        });
    }

    private static java.util.Enumeration getResources(java.lang.ClassLoader classLoader, java.lang.String str) {
        return (java.util.Enumeration) java.security.AccessController.doPrivileged(new java.security.PrivilegedAction(classLoader, str) { // from class: org.apache.commons.logging.LogFactory.4
            private final java.lang.ClassLoader val$loader;
            private final java.lang.String val$name;

            {
                this.val$loader = classLoader;
                this.val$name = str;
            }

            @Override // java.security.PrivilegedAction
            public java.lang.Object run() {
                try {
                    java.lang.ClassLoader classLoader2 = this.val$loader;
                    java.lang.String str2 = this.val$name;
                    return classLoader2 != null ? classLoader2.getResources(str2) : java.lang.ClassLoader.getSystemResources(str2);
                } catch (java.io.IOException e) {
                    if (org.apache.commons.logging.LogFactory.isDiagnosticsEnabled()) {
                        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Exception while trying to find configuration file ");
                        stringBuffer.append(this.val$name);
                        stringBuffer.append(":");
                        stringBuffer.append(e.getMessage());
                        org.apache.commons.logging.LogFactory.logDiagnostic(stringBuffer.toString());
                    }
                    return null;
                } catch (java.lang.NoSuchMethodError unused) {
                    return null;
                }
            }
        });
    }

    private static java.lang.String getSystemProperty(java.lang.String str, java.lang.String str2) throws java.lang.SecurityException {
        return (java.lang.String) java.security.AccessController.doPrivileged(new java.security.PrivilegedAction(str, str2) { // from class: org.apache.commons.logging.LogFactory.6
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

    protected static void handleThrowable(java.lang.Throwable th) {
        if (th instanceof java.lang.ThreadDeath) {
            throw ((java.lang.ThreadDeath) th);
        }
        if (th instanceof java.lang.VirtualMachineError) {
            throw ((java.lang.VirtualMachineError) th);
        }
    }

    private static boolean implementsLogFactory(java.lang.Class cls) {
        if (cls != null) {
            try {
                java.lang.ClassLoader classLoader = cls.getClassLoader();
                if (classLoader == null) {
                    logDiagnostic("[CUSTOM LOG FACTORY] was loaded by the boot classloader");
                    return false;
                }
                logHierarchy("[CUSTOM LOG FACTORY] ", classLoader);
                boolean zIsAssignableFrom = java.lang.Class.forName(FACTORY_PROPERTY, false, classLoader).isAssignableFrom(cls);
                if (zIsAssignableFrom) {
                    java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("[CUSTOM LOG FACTORY] ");
                    stringBuffer.append(cls.getName());
                    stringBuffer.append(" implements LogFactory but was loaded by an incompatible classloader.");
                    logDiagnostic(stringBuffer.toString());
                    return zIsAssignableFrom;
                }
                java.lang.StringBuffer stringBuffer2 = new java.lang.StringBuffer("[CUSTOM LOG FACTORY] ");
                stringBuffer2.append(cls.getName());
                stringBuffer2.append(" does not implement LogFactory.");
                logDiagnostic(stringBuffer2.toString());
                return zIsAssignableFrom;
            } catch (java.lang.ClassNotFoundException unused) {
                logDiagnostic("[CUSTOM LOG FACTORY] LogFactory class cannot be loaded by classloader which loaded the custom LogFactory implementation. Is the custom factory in the right classloader?");
            } catch (java.lang.LinkageError e) {
                java.lang.StringBuffer stringBuffer3 = new java.lang.StringBuffer("[CUSTOM LOG FACTORY] LinkageError thrown whilst trying to determine whether the compatibility was caused by a classloader conflict: ");
                stringBuffer3.append(e.getMessage());
                logDiagnostic(stringBuffer3.toString());
            } catch (java.lang.SecurityException e2) {
                java.lang.StringBuffer stringBuffer4 = new java.lang.StringBuffer("[CUSTOM LOG FACTORY] SecurityException thrown whilst trying to determine whether the compatibility was caused by a classloader conflict: ");
                stringBuffer4.append(e2.getMessage());
                logDiagnostic(stringBuffer4.toString());
            }
        }
        return false;
    }

    private static java.io.PrintStream initDiagnostics() {
        try {
            java.lang.String systemProperty = getSystemProperty(DIAGNOSTICS_DEST_PROPERTY, null);
            if (systemProperty != null) {
                if (systemProperty.equals("STDOUT")) {
                    return java.lang.System.out;
                }
                return systemProperty.equals("STDERR") ? java.lang.System.err : new java.io.PrintStream(new java.io.FileOutputStream(systemProperty, true));
            }
        } catch (java.io.IOException | java.lang.SecurityException unused) {
        }
        return null;
    }

    protected static boolean isDiagnosticsEnabled() {
        return diagnosticsStream != null;
    }

    private static void logClassLoaderEnvironment(java.lang.Class cls) {
        if (isDiagnosticsEnabled()) {
            try {
                java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("[ENV] Extension directories (java.ext.dir): ");
                stringBuffer.append(java.lang.System.getProperty("java.ext.dir"));
                logDiagnostic(stringBuffer.toString());
                java.lang.StringBuffer stringBuffer2 = new java.lang.StringBuffer("[ENV] Application classpath (java.class.path): ");
                stringBuffer2.append(java.lang.System.getProperty("java.class.path"));
                logDiagnostic(stringBuffer2.toString());
            } catch (java.lang.SecurityException unused) {
                logDiagnostic("[ENV] Security setting prevent interrogation of system classpaths.");
            }
            java.lang.String name = cls.getName();
            try {
                java.lang.ClassLoader classLoader = getClassLoader(cls);
                java.lang.StringBuffer stringBuffer3 = new java.lang.StringBuffer("[ENV] Class ");
                stringBuffer3.append(name);
                stringBuffer3.append(" was loaded via classloader ");
                stringBuffer3.append(objectId(classLoader));
                logDiagnostic(stringBuffer3.toString());
                java.lang.StringBuffer stringBuffer4 = new java.lang.StringBuffer("[ENV] Ancestry of classloader which loaded ");
                stringBuffer4.append(name);
                stringBuffer4.append(" is ");
                logHierarchy(stringBuffer4.toString(), classLoader);
            } catch (java.lang.SecurityException unused2) {
                java.lang.StringBuffer stringBuffer5 = new java.lang.StringBuffer("[ENV] Security forbids determining the classloader for ");
                stringBuffer5.append(name);
                logDiagnostic(stringBuffer5.toString());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void logDiagnostic(java.lang.String str) {
        java.io.PrintStream printStream = diagnosticsStream;
        if (printStream != null) {
            printStream.print(diagnosticPrefix);
            diagnosticsStream.println(str);
            diagnosticsStream.flush();
        }
    }

    private static void logHierarchy(java.lang.String str, java.lang.ClassLoader classLoader) {
        if (isDiagnosticsEnabled()) {
            if (classLoader != null) {
                java.lang.String string = classLoader.toString();
                java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
                stringBuffer.append(str);
                stringBuffer.append(objectId(classLoader));
                stringBuffer.append(" == '");
                stringBuffer.append(string);
                stringBuffer.append("'");
                logDiagnostic(stringBuffer.toString());
            }
            try {
                java.lang.ClassLoader systemClassLoader = java.lang.ClassLoader.getSystemClassLoader();
                if (classLoader != null) {
                    java.lang.StringBuffer stringBuffer2 = new java.lang.StringBuffer();
                    stringBuffer2.append(str);
                    stringBuffer2.append("ClassLoader tree:");
                    java.lang.StringBuffer stringBuffer3 = new java.lang.StringBuffer(stringBuffer2.toString());
                    do {
                        stringBuffer3.append(objectId(classLoader));
                        if (classLoader == systemClassLoader) {
                            stringBuffer3.append(" (SYSTEM) ");
                        }
                        try {
                            classLoader = classLoader.getParent();
                            stringBuffer3.append(" --> ");
                        } catch (java.lang.SecurityException unused) {
                            stringBuffer3.append(" --> SECRET");
                        }
                    } while (classLoader != null);
                    stringBuffer3.append("BOOT");
                    logDiagnostic(stringBuffer3.toString());
                }
            } catch (java.lang.SecurityException unused2) {
                java.lang.StringBuffer stringBuffer4 = new java.lang.StringBuffer();
                stringBuffer4.append(str);
                stringBuffer4.append("Security forbids determining the system classloader.");
                logDiagnostic(stringBuffer4.toString());
            }
        }
    }

    protected static final void logRawDiagnostic(java.lang.String str) {
        java.io.PrintStream printStream = diagnosticsStream;
        if (printStream != null) {
            printStream.println(str);
            diagnosticsStream.flush();
        }
    }

    protected static org.apache.commons.logging.LogFactory newFactory(java.lang.String str, java.lang.ClassLoader classLoader, java.lang.ClassLoader classLoader2) throws org.apache.commons.logging.LogConfigurationException {
        java.lang.Object objDoPrivileged = java.security.AccessController.doPrivileged((java.security.PrivilegedAction<java.lang.Object>) new java.security.PrivilegedAction(str, classLoader) { // from class: org.apache.commons.logging.LogFactory.2
            private final java.lang.ClassLoader val$classLoader;
            private final java.lang.String val$factoryClass;

            {
                this.val$factoryClass = str;
                this.val$classLoader = classLoader;
            }

            @Override // java.security.PrivilegedAction
            public java.lang.Object run() {
                return org.apache.commons.logging.LogFactory.createFactory(this.val$factoryClass, this.val$classLoader);
            }
        });
        if (objDoPrivileged instanceof org.apache.commons.logging.LogConfigurationException) {
            org.apache.commons.logging.LogConfigurationException logConfigurationException = (org.apache.commons.logging.LogConfigurationException) objDoPrivileged;
            if (!isDiagnosticsEnabled()) {
                throw logConfigurationException;
            }
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("An error occurred while loading the factory class:");
            stringBuffer.append(logConfigurationException.getMessage());
            logDiagnostic(stringBuffer.toString());
            throw logConfigurationException;
        }
        if (isDiagnosticsEnabled()) {
            java.lang.StringBuffer stringBuffer2 = new java.lang.StringBuffer("Created object ");
            stringBuffer2.append(objectId(objDoPrivileged));
            stringBuffer2.append(" to manage classloader ");
            stringBuffer2.append(objectId(classLoader2));
            logDiagnostic(stringBuffer2.toString());
        }
        return (org.apache.commons.logging.LogFactory) objDoPrivileged;
    }

    public static java.lang.String objectId(java.lang.Object obj) {
        if (obj == null) {
            return "null";
        }
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(obj.getClass().getName());
        stringBuffer.append("@");
        stringBuffer.append(java.lang.System.identityHashCode(obj));
        return stringBuffer.toString();
    }

    public static void release(java.lang.ClassLoader classLoader) {
        if (isDiagnosticsEnabled()) {
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Releasing factory for classloader ");
            stringBuffer.append(objectId(classLoader));
            logDiagnostic(stringBuffer.toString());
        }
        java.util.Hashtable hashtable = factories;
        synchronized (hashtable) {
            try {
                if (classLoader != null) {
                    org.apache.commons.logging.LogFactory logFactory = (org.apache.commons.logging.LogFactory) hashtable.get(classLoader);
                    if (logFactory != null) {
                        logFactory.release();
                        hashtable.remove(classLoader);
                    }
                } else if (nullClassLoaderFactory != null) {
                    nullClassLoaderFactory.release();
                    nullClassLoaderFactory = null;
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public static void releaseAll() {
        if (isDiagnosticsEnabled()) {
            logDiagnostic("Releasing factory for all classloaders.");
        }
        java.util.Hashtable hashtable = factories;
        synchronized (hashtable) {
            java.util.Enumeration enumerationElements = hashtable.elements();
            while (enumerationElements.hasMoreElements()) {
                ((org.apache.commons.logging.LogFactory) enumerationElements.nextElement()).release();
            }
            hashtable.clear();
            if (nullClassLoaderFactory != null) {
                nullClassLoaderFactory.release();
                nullClassLoaderFactory = null;
            }
        }
    }

    private static java.lang.String trim(java.lang.String str) {
        if (str == null) {
            return null;
        }
        return str.trim();
    }

    public abstract java.lang.Object getAttribute(java.lang.String str);

    public abstract java.lang.String[] getAttributeNames();

    public abstract org.apache.commons.logging.Log getInstance(java.lang.Class cls) throws org.apache.commons.logging.LogConfigurationException;

    public abstract org.apache.commons.logging.Log getInstance(java.lang.String str) throws org.apache.commons.logging.LogConfigurationException;

    public abstract void release();

    public abstract void removeAttribute(java.lang.String str);

    public abstract void setAttribute(java.lang.String str, java.lang.Object obj);

    public static org.apache.commons.logging.Log getLog(java.lang.String str) throws org.apache.commons.logging.LogConfigurationException {
        return getFactory().getInstance(str);
    }

    protected static org.apache.commons.logging.LogFactory newFactory(java.lang.String str, java.lang.ClassLoader classLoader) {
        return newFactory(str, classLoader, null);
    }
}
