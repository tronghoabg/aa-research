package e.a;

import e.a.d.hl;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class bw {

    /* renamed from: a, reason: collision with root package name */
    private static final Logger f46509a = Logger.getLogger(bw.class.getName());

    /* renamed from: b, reason: collision with root package name */
    private static bw f46510b;

    /* renamed from: c, reason: collision with root package name */
    private final LinkedHashSet f46511c = new LinkedHashSet();

    /* renamed from: d, reason: collision with root package name */
    private final LinkedHashMap f46512d = new LinkedHashMap();

    public static synchronized bw b() {
        if (f46510b == null) {
            bv.class.getClassLoader();
            List<bv> listA = dw.a(bv.class, Collections.singletonList(hl.class.getDeclaredConstructor(null).newInstance(null)).iterator(), new df(1), new dh(1));
            f46510b = new bw();
            for (bv bvVar : listA) {
                f46509a.logp(Level.FINE, "io.grpc.LoadBalancerRegistry", "getDefaultRegistry", "Service loader found ".concat(String.valueOf(String.valueOf(bvVar))));
                f46510b.d(bvVar);
            }
            f46510b.e();
        }
        return f46510b;
    }

    static List c() {
        ArrayList arrayList = new ArrayList();
        try {
            arrayList.add(Class.forName("e.a.d.hl"));
        } catch (ClassNotFoundException e2) {
            f46509a.logp(Level.WARNING, "io.grpc.LoadBalancerRegistry", "getHardCodedClasses", "Unable to find pick-first LoadBalancer", (Throwable) e2);
        }
        try {
            arrayList.add(Class.forName("e.a.i.j"));
        } catch (ClassNotFoundException e3) {
            f46509a.logp(Level.FINE, "io.grpc.LoadBalancerRegistry", "getHardCodedClasses", "Unable to find round-robin LoadBalancer", (Throwable) e3);
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    private final synchronized void d(bv bvVar) {
        bvVar.e();
        com.google.d.b.an.m(true, "isAvailable() returned false");
        this.f46511c.add(bvVar);
    }

    private final synchronized void e() {
        LinkedHashMap linkedHashMap = this.f46512d;
        linkedHashMap.clear();
        Iterator it = this.f46511c.iterator();
        while (it.hasNext()) {
            bv bvVar = (bv) it.next();
            String strC = bvVar.c();
            if (((bv) linkedHashMap.get(strC)) != null) {
                bvVar.d();
            } else {
                linkedHashMap.put(strC, bvVar);
            }
        }
    }

    public final synchronized bv a(String str) {
        return (bv) this.f46512d.get(str);
    }
}
