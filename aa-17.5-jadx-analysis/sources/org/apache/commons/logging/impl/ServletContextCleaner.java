package org.apache.commons.logging.impl;

import defpackage.aezl;
import java.lang.reflect.InvocationTargetException;
import java.util.EventListener;
import org.apache.commons.logging.LogFactory;

/* loaded from: classes2.dex */
public class ServletContextCleaner implements EventListener {
    private static final Class[] RELEASE_SIGNATURE;
    static Class class$java$lang$ClassLoader;

    static {
        Class clsClass$ = class$java$lang$ClassLoader;
        if (clsClass$ == null) {
            clsClass$ = class$("java.lang.ClassLoader");
            class$java$lang$ClassLoader = clsClass$;
        }
        RELEASE_SIGNATURE = new Class[]{clsClass$};
    }

    static Class class$(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError(e.getMessage());
        }
    }

    public void contextDestroyed(aezl aezlVar) throws IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        Object[] objArr = {contextClassLoader};
        ClassLoader parent = contextClassLoader;
        while (parent != null) {
            try {
                Class<?> clsLoadClass = parent.loadClass(LogFactory.FACTORY_PROPERTY);
                clsLoadClass.getMethod("release", RELEASE_SIGNATURE).invoke(null, objArr);
                parent = clsLoadClass.getClassLoader().getParent();
            } catch (ClassNotFoundException unused) {
                parent = null;
            } catch (IllegalAccessException unused2) {
                System.err.println("LogFactory instance found which is not accessable!");
                parent = null;
            } catch (NoSuchMethodException unused3) {
                System.err.println("LogFactory instance found which does not support release method!");
                parent = null;
            } catch (InvocationTargetException unused4) {
                System.err.println("LogFactory instance release method failed!");
                parent = null;
            }
        }
        LogFactory.release(contextClassLoader);
    }

    public void contextInitialized(aezl aezlVar) {
    }
}
