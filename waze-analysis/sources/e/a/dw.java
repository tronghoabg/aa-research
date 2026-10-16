package e.a;

import j$.time.Duration;
import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class dw {
    /* synthetic */ dw(dy dyVar, Map map) {
        DesugarCollections.unmodifiableMap(new HashMap(map));
    }

    public static List a(Class cls, Iterator it, com.google.d.b.aj ajVar, ea eaVar) {
        if (!(it instanceof ListIterator)) {
            if (b(cls.getClassLoader())) {
                Iterable<Class> iterable = (Iterable) ajVar.get();
                ArrayList arrayList = new ArrayList();
                for (Class cls2 : iterable) {
                    Object objNewInstance = null;
                    try {
                        objNewInstance = cls2.asSubclass(cls).getConstructor(null).newInstance(null);
                    } catch (ClassCastException unused) {
                    } catch (Throwable th) {
                        throw new ServiceConfigurationError(String.format("Provider %s could not be instantiated %s", cls2.getName(), th), th);
                    }
                    if (objNewInstance != null) {
                        arrayList.add(objNewInstance);
                    }
                }
                it = arrayList.iterator();
            } else if (!it.hasNext()) {
                it = ServiceLoader.load(cls).iterator();
            }
        }
        ArrayList arrayList2 = new ArrayList();
        while (it.hasNext()) {
            Object next = it.next();
            eaVar.b(next);
            arrayList2.add(next);
        }
        Collections.sort(arrayList2, Collections.reverseOrder(new dz(eaVar)));
        return DesugarCollections.unmodifiableList(arrayList2);
    }

    static boolean b(ClassLoader classLoader) throws ClassNotFoundException {
        try {
            Class.forName("android.app.Application", false, classLoader);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    static long c(Duration duration) {
        try {
            return duration.toNanos();
        } catch (ArithmeticException unused) {
            return duration.isNegative() ? Long.MIN_VALUE : Long.MAX_VALUE;
        }
    }

    public static org.a.d.b.a e() {
        return org.a.d.b.a.f56372a;
    }

    public static Map f() {
        return new ConcurrentHashMap();
    }

    public static void g(Object obj, h.g.a.a aVar) {
        h.g.b.x.f(obj, "lock");
        h.g.b.x.f(aVar, "block");
        synchronized (obj) {
            aVar.invoke();
        }
    }

    public static /* synthetic */ com.waze.sharedui.d.a.b h(l.a.dx dxVar) {
        h.g.b.x.f(dxVar, "builder");
        return new com.waze.sharedui.d.a.b(dxVar);
    }

    public static /* synthetic */ com.waze.sharedui.web.as i(l.a.eo eoVar) {
        h.g.b.x.f(eoVar, "builder");
        return new com.waze.sharedui.web.as(eoVar);
    }

    public static /* synthetic */ com.waze.sharedui.d.a.b j(l.a.df dfVar) {
        h.g.b.x.f(dfVar, "builder");
        return new com.waze.sharedui.d.a.b(dfVar);
    }

    public void d(long j2) {
    }

    public dw() {
    }
}
