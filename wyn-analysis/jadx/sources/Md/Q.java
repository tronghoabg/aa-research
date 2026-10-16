package md;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import od.C3706m1;

/* loaded from: classes5.dex */
public final class Q {

    /* renamed from: c, reason: collision with root package name */
    public static final Logger f40596c;

    /* renamed from: d, reason: collision with root package name */
    public static Q f40597d;

    /* renamed from: e, reason: collision with root package name */
    public static final List f40598e;

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f40599a = new LinkedHashSet();

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f40600b = new LinkedHashMap();

    static {
        Logger logger = Logger.getLogger(Q.class.getName());
        f40596c = logger;
        ArrayList arrayList = new ArrayList();
        try {
            boolean z2 = C3706m1.f42015a;
            arrayList.add(C3706m1.class);
        } catch (ClassNotFoundException e7) {
            logger.log(Level.WARNING, "Unable to find pick-first LoadBalancer", (Throwable) e7);
        }
        try {
            arrayList.add(vd.w.class);
        } catch (ClassNotFoundException e10) {
            logger.log(Level.FINE, "Unable to find round-robin LoadBalancer", (Throwable) e10);
        }
        f40598e = DesugarCollections.unmodifiableList(arrayList);
    }

    public static synchronized Q b() {
        try {
            if (f40597d == null) {
                List<P> listF = AbstractC3537e.f(P.class, f40598e, P.class.getClassLoader(), new C3542j(6));
                f40597d = new Q();
                for (P p10 : listF) {
                    f40596c.fine("Service loader found " + p10);
                    f40597d.a(p10);
                }
                f40597d.d();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f40597d;
    }

    public final synchronized void a(P p10) {
        p10.getClass();
        this.f40599a.add(p10);
    }

    public final synchronized P c(String str) {
        LinkedHashMap linkedHashMap;
        linkedHashMap = this.f40600b;
        Fe.e.t(str, "policy");
        return (P) linkedHashMap.get(str);
    }

    public final synchronized void d() {
        this.f40600b.clear();
        Iterator it = this.f40599a.iterator();
        while (it.hasNext()) {
            P p10 = (P) it.next();
            String strA = p10.a();
            if (((P) this.f40600b.get(strA)) == null) {
                this.f40600b.put(strA, p10);
            }
        }
    }
}
