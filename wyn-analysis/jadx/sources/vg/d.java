package vg;

import A.AbstractC0213f;
import a9.C1341a;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.concurrent.LinkedBlockingQueue;
import od.K;
import xg.e;
import xg.f;
import xg.g;

/* loaded from: classes5.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static volatile int f47244a;

    /* renamed from: b, reason: collision with root package name */
    public static final xg.c f47245b = new xg.c(1);

    /* renamed from: c, reason: collision with root package name */
    public static final xg.c f47246c = new xg.c(0);

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f47247d;

    /* renamed from: e, reason: collision with root package name */
    public static volatile xg.c f47248e;

    /* renamed from: f, reason: collision with root package name */
    public static final String[] f47249f;

    static {
        String property;
        try {
            property = System.getProperty("slf4j.detectLoggerNameMismatch");
        } catch (SecurityException unused) {
            property = null;
        }
        f47247d = property == null ? false : property.equalsIgnoreCase("true");
        f47249f = new String[]{"2.0"};
    }

    public static ArrayList a() {
        ArrayList arrayList = new ArrayList();
        final ClassLoader classLoader = d.class.getClassLoader();
        String property = System.getProperty("slf4j.provider");
        xg.c cVar = null;
        if (property != null && !property.isEmpty()) {
            try {
                String str = "Attempting to load provider \"" + property + "\" specified via \"slf4j.provider\" system property";
                int i5 = xg.d.f47901a;
                if (AbstractC0213f.f(2) >= AbstractC0213f.f(xg.d.f47902b)) {
                    xg.d.b().println("SLF4J(I): " + str);
                }
                cVar = (xg.c) classLoader.loadClass(property).getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (ClassCastException e7) {
                xg.d.a("Specified SLF4JServiceProvider (" + property + ") does not implement SLF4JServiceProvider interface", e7);
            } catch (ClassNotFoundException e10) {
                e = e10;
                xg.d.a("Failed to instantiate the specified SLF4JServiceProvider (" + property + ")", e);
            } catch (IllegalAccessException e11) {
                e = e11;
                xg.d.a("Failed to instantiate the specified SLF4JServiceProvider (" + property + ")", e);
            } catch (InstantiationException e12) {
                e = e12;
                xg.d.a("Failed to instantiate the specified SLF4JServiceProvider (" + property + ")", e);
            } catch (NoSuchMethodException e13) {
                e = e13;
                xg.d.a("Failed to instantiate the specified SLF4JServiceProvider (" + property + ")", e);
            } catch (InvocationTargetException e14) {
                e = e14;
                xg.d.a("Failed to instantiate the specified SLF4JServiceProvider (" + property + ")", e);
            }
        }
        if (cVar != null) {
            arrayList.add(cVar);
            return arrayList;
        }
        Iterator it = (System.getSecurityManager() == null ? ServiceLoader.load(xg.c.class, classLoader) : (ServiceLoader) AccessController.doPrivileged(new PrivilegedAction() { // from class: vg.c
            @Override // java.security.PrivilegedAction
            public final Object run() {
                return ServiceLoader.load(xg.c.class, classLoader);
            }
        })).iterator();
        while (it.hasNext()) {
            try {
                arrayList.add((xg.c) it.next());
            } catch (ServiceConfigurationError e15) {
                String str2 = "A service provider failed to instantiate:\n" + e15.getMessage();
                xg.d.b().println("SLF4J(E): " + str2);
            }
        }
        return arrayList;
    }

    public static b b(Class cls) {
        int i5;
        b bVarC = c(cls.getName());
        if (f47247d) {
            f fVar = g.f47910a;
            Class cls2 = null;
            if (fVar == null) {
                if (g.f47911b) {
                    fVar = null;
                } else {
                    try {
                        fVar = new f();
                    } catch (SecurityException unused) {
                        fVar = null;
                    }
                    g.f47910a = fVar;
                    g.f47911b = true;
                }
            }
            if (fVar != null) {
                Class[] classContext = fVar.getClassContext();
                String name = g.class.getName();
                int i10 = 0;
                while (i10 < classContext.length && !name.equals(classContext[i10].getName())) {
                    i10++;
                }
                if (i10 >= classContext.length || (i5 = i10 + 2) >= classContext.length) {
                    throw new IllegalStateException("Failed to find org.slf4j.helpers.Util or its caller in the stack; this should not happen");
                }
                cls2 = classContext[i5];
            }
            if (cls2 != null && !cls2.isAssignableFrom(cls)) {
                xg.d.c("Detected logger name mismatch. Given name: \"" + bVarC.getName() + "\"; computed name: \"" + cls2.getName() + "\".");
                xg.d.c("See https://www.slf4j.org/codes.html#loggerNameMismatch for an explanation");
            }
        }
        return bVarC;
    }

    public static b c(String str) {
        xg.c cVar;
        a aVar;
        if (f47244a == 0) {
            synchronized (d.class) {
                try {
                    if (f47244a == 0) {
                        f47244a = 1;
                        d();
                    }
                } finally {
                }
            }
        }
        int i5 = f47244a;
        if (i5 == 1) {
            cVar = f47245b;
        } else {
            if (i5 == 2) {
                throw new IllegalStateException("org.slf4j.LoggerFactory in failed state. Original exception was thrown EARLIER. See also https://www.slf4j.org/codes.html#unsuccessfulInit");
            }
            if (i5 == 3) {
                cVar = f47248e;
            } else {
                if (i5 != 4) {
                    throw new IllegalStateException("Unreachable code");
                }
                cVar = f47246c;
            }
        }
        switch (cVar.f47899a) {
            case 0:
                aVar = (C1341a) cVar.f47900b;
                break;
            default:
                aVar = (K) cVar.f47900b;
                break;
        }
        return aVar.c(str);
    }

    public static final void d() {
        try {
            ArrayList arrayListA = a();
            h(arrayListA);
            if (arrayListA.isEmpty()) {
                f47244a = 4;
                xg.d.c("No SLF4J providers were found.");
                xg.d.c("Defaulting to no-operation (NOP) logger implementation");
                xg.d.c("See https://www.slf4j.org/codes.html#noProviders for further details.");
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                try {
                    ClassLoader classLoader = d.class.getClassLoader();
                    Enumeration<URL> systemResources = classLoader == null ? ClassLoader.getSystemResources("org/slf4j/impl/StaticLoggerBinder.class") : classLoader.getResources("org/slf4j/impl/StaticLoggerBinder.class");
                    while (systemResources.hasMoreElements()) {
                        linkedHashSet.add(systemResources.nextElement());
                    }
                } catch (IOException e7) {
                    xg.d.a("Error getting resources from path", e7);
                }
                g(linkedHashSet);
            } else {
                f47248e = (xg.c) arrayListA.get(0);
                f47248e.getClass();
                f47248e.getClass();
                f47244a = 3;
                f(arrayListA);
            }
            e();
            if (f47244a == 3) {
                try {
                    switch (f47248e.f47899a) {
                        case 0:
                            boolean z2 = false;
                            for (String str : f47249f) {
                                if ("2.0.99".startsWith(str)) {
                                    z2 = true;
                                }
                            }
                            if (z2) {
                                return;
                            }
                            xg.d.c("The requested version 2.0.99 by your slf4j provider is not compatible with " + Arrays.asList(f47249f).toString());
                            xg.d.c("See https://www.slf4j.org/codes.html#version_mismatch for further details.");
                            return;
                        default:
                            throw new UnsupportedOperationException();
                    }
                } catch (Throwable th) {
                    xg.d.a("Unexpected problem occurred during version sanity check", th);
                }
            }
        } catch (Exception e10) {
            f47244a = 2;
            xg.d.a("Failed to instantiate SLF4J LoggerFactory", e10);
            throw new IllegalStateException("Unexpected initialization failure", e10);
        }
    }

    public static void e() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        xg.c cVar = f47245b;
        synchronized (cVar) {
            try {
                ((K) cVar.f47900b).f41615a = true;
                K k = (K) cVar.f47900b;
                k.getClass();
                Iterator it = new ArrayList(((ConcurrentHashMap) k.f41616b).values()).iterator();
                while (it.hasNext()) {
                    e eVar = (e) it.next();
                    eVar.f47904b = c(eVar.f47903a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        LinkedBlockingQueue linkedBlockingQueue = (LinkedBlockingQueue) ((K) f47245b.f47900b).f41617c;
        int size = linkedBlockingQueue.size();
        ArrayList arrayList = new ArrayList(128);
        int i5 = 0;
        while (linkedBlockingQueue.drainTo(arrayList, 128) != 0) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                wg.c cVar2 = (wg.c) it2.next();
                if (cVar2 != null) {
                    e eVar2 = cVar2.f47488b;
                    String str = eVar2.f47903a;
                    if (eVar2.f47904b == null) {
                        throw new IllegalStateException("Delegate logger cannot be null at this state.");
                    }
                    if (!(eVar2.f47904b instanceof xg.b)) {
                        if (!eVar2.x()) {
                            xg.d.c(str);
                        } else if (eVar2.t(cVar2.f47487a) && eVar2.x()) {
                            try {
                                eVar2.f47906d.invoke(eVar2.f47904b, cVar2);
                            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
                            }
                        }
                    }
                }
                int i10 = i5 + 1;
                if (i5 == 0) {
                    if (cVar2.f47488b.x()) {
                        xg.d.c("A number (" + size + ") of logging calls during the initialization phase have been intercepted and are");
                        xg.d.c("now being replayed. These are subject to the filtering rules of the underlying logging system.");
                        xg.d.c("See also https://www.slf4j.org/codes.html#replay");
                    } else if (!(cVar2.f47488b.f47904b instanceof xg.b)) {
                        xg.d.c("The following set of substitute loggers may have been accessed");
                        xg.d.c("during the initialization phase. Logging calls during this");
                        xg.d.c("phase were not honored. However, subsequent logging calls to these");
                        xg.d.c("loggers will work as normally expected.");
                        xg.d.c("See also https://www.slf4j.org/codes.html#substituteLogger");
                    }
                }
                i5 = i10;
            }
            arrayList.clear();
        }
        K k5 = (K) f47245b.f47900b;
        ((ConcurrentHashMap) k5.f41616b).clear();
        ((LinkedBlockingQueue) k5.f41617c).clear();
    }

    public static void f(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            throw new IllegalStateException("No providers were found which is impossible after successful initialization.");
        }
        if (arrayList.size() > 1) {
            String str = "Actual provider is of type [" + arrayList.get(0) + "]";
            int i5 = xg.d.f47901a;
            if (AbstractC0213f.f(2) >= AbstractC0213f.f(xg.d.f47902b)) {
                xg.d.b().println("SLF4J(I): " + str);
                return;
            }
            return;
        }
        String str2 = "Connected with provider of type [" + ((xg.c) arrayList.get(0)).getClass().getName() + "]";
        int i10 = xg.d.f47901a;
        if (AbstractC0213f.f(1) >= AbstractC0213f.f(xg.d.f47902b)) {
            xg.d.b().println("SLF4J(D): " + str2);
        }
    }

    public static void g(LinkedHashSet linkedHashSet) {
        if (linkedHashSet.isEmpty()) {
            return;
        }
        xg.d.c("Class path contains SLF4J bindings targeting slf4j-api versions 1.7.x or earlier.");
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            xg.d.c("Ignoring binding found at [" + ((URL) it.next()) + "]");
        }
        xg.d.c("See https://www.slf4j.org/codes.html#ignoredBindings for an explanation.");
    }

    public static void h(ArrayList arrayList) {
        if (arrayList.size() > 1) {
            xg.d.c("Class path contains multiple SLF4J providers.");
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                xg.d.c("Found provider [" + ((xg.c) it.next()) + "]");
            }
            xg.d.c("See https://www.slf4j.org/codes.html#multiple_bindings for an explanation.");
        }
    }
}
