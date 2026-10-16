package org.apache.commons.logging.impl;

/* JADX INFO: loaded from: classes2.dex */
public class ServletContextCleaner implements java.util.EventListener {
    private static final java.lang.Class[] RELEASE_SIGNATURE;
    static java.lang.Class class$java$lang$ClassLoader;

    static {
        java.lang.Class clsClass$ = class$java$lang$ClassLoader;
        if (clsClass$ == null) {
            clsClass$ = class$("java.lang.ClassLoader");
            class$java$lang$ClassLoader = clsClass$;
        }
        RELEASE_SIGNATURE = new java.lang.Class[]{clsClass$};
    }

    static java.lang.Class class$(java.lang.String str) {
        try {
            return java.lang.Class.forName(str);
        } catch (java.lang.ClassNotFoundException e) {
            throw new java.lang.NoClassDefFoundError(e.getMessage());
        }
    }

    public void contextDestroyed(defpackage.afal afalVar) {
        java.lang.ClassLoader contextClassLoader = java.lang.Thread.currentThread().getContextClassLoader();
        java.lang.Object[] objArr = {contextClassLoader};
        java.lang.ClassLoader parent = contextClassLoader;
        while (parent != null) {
            try {
                java.lang.Class<?> clsLoadClass = parent.loadClass(org.apache.commons.logging.LogFactory.FACTORY_PROPERTY);
                clsLoadClass.getMethod("release", RELEASE_SIGNATURE).invoke(null, objArr);
                parent = clsLoadClass.getClassLoader().getParent();
            } catch (java.lang.ClassNotFoundException unused) {
                parent = null;
            } catch (java.lang.IllegalAccessException unused2) {
                java.lang.System.err.println("LogFactory instance found which is not accessable!");
                parent = null;
            } catch (java.lang.NoSuchMethodException unused3) {
                java.lang.System.err.println("LogFactory instance found which does not support release method!");
                parent = null;
            } catch (java.lang.reflect.InvocationTargetException unused4) {
                java.lang.System.err.println("LogFactory instance release method failed!");
                parent = null;
            }
        }
        org.apache.commons.logging.LogFactory.release(contextClassLoader);
    }

    public void contextInitialized(defpackage.afal afalVar) {
    }
}
