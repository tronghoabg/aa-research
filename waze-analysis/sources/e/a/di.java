package e.a;

import androidx.core.os.EnvironmentCompat;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class di {

    /* renamed from: a, reason: collision with root package name */
    private static final Logger f47328a = Logger.getLogger(di.class.getName());

    /* renamed from: b, reason: collision with root package name */
    private static di f47329b;

    /* renamed from: c, reason: collision with root package name */
    private String f47330c;

    /* renamed from: d, reason: collision with root package name */
    private final LinkedHashSet f47331d;

    /* renamed from: e, reason: collision with root package name */
    private com.google.d.d.bs f47332e;

    public di() {
        new dg(this);
        this.f47330c = EnvironmentCompat.MEDIA_UNKNOWN;
        this.f47331d = new LinkedHashSet();
        this.f47332e = com.google.d.d.bs.f();
    }

    public static synchronized di b() {
        if (f47329b == null) {
            de.class.getClassLoader();
            List<de> listA = dw.a(de.class, Collections.singletonList(e.a.d.cp.class.getDeclaredConstructor(null).newInstance(null)).iterator(), new df(0), new dh(0));
            if (listA.isEmpty()) {
                f47328a.logp(Level.WARNING, "io.grpc.NameResolverRegistry", "getDefaultRegistry", "No NameResolverProviders found via ServiceLoader, including for DNS. This is probably due to a broken build. If using ProGuard, check your configuration");
            }
            f47329b = new di();
            for (de deVar : listA) {
                f47328a.logp(Level.FINE, "io.grpc.NameResolverRegistry", "getDefaultRegistry", "Service loader found ".concat(String.valueOf(String.valueOf(deVar))));
                f47329b.g(deVar);
            }
            f47329b.h();
        }
        return f47329b;
    }

    static List d() {
        ArrayList arrayList = new ArrayList();
        try {
            arrayList.add(Class.forName("e.a.d.cp"));
        } catch (ClassNotFoundException e2) {
            f47328a.logp(Level.FINE, "io.grpc.NameResolverRegistry", "getHardCodedClasses", "Unable to find DNS NameResolver", (Throwable) e2);
        }
        try {
            arrayList.add(Class.forName("e.a.b.a.z"));
        } catch (ClassNotFoundException e3) {
            f47328a.logp(Level.FINE, "io.grpc.NameResolverRegistry", "getHardCodedClasses", "Unable to find IntentNameResolverProvider", (Throwable) e3);
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    private final synchronized void g(de deVar) {
        deVar.f();
        com.google.d.b.an.m(true, "isAvailable() returned false");
        this.f47331d.add(deVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0032 A[Catch: all -> 0x004e, TryCatch #0 {, blocks: (B:3:0x0001, B:4:0x0010, B:6:0x0016, B:8:0x0028, B:11:0x0035, B:13:0x003b, B:10:0x0032, B:14:0x0044), top: B:20:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final synchronized void h() {
        /*
            r8 = this;
            monitor-enter(r8)
            java.util.HashMap r0 = new java.util.HashMap     // Catch: java.lang.Throwable -> L4e
            r0.<init>()     // Catch: java.lang.Throwable -> L4e
            java.util.LinkedHashSet r1 = r8.f47331d     // Catch: java.lang.Throwable -> L4e
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L4e
            java.lang.String r2 = "unknown"
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
        L10:
            boolean r4 = r1.hasNext()     // Catch: java.lang.Throwable -> L4e
            if (r4 == 0) goto L44
            java.lang.Object r4 = r1.next()     // Catch: java.lang.Throwable -> L4e
            e.a.de r4 = (e.a.de) r4     // Catch: java.lang.Throwable -> L4e
            java.lang.String r5 = r4.c()     // Catch: java.lang.Throwable -> L4e
            java.lang.Object r6 = r0.get(r5)     // Catch: java.lang.Throwable -> L4e
            e.a.de r6 = (e.a.de) r6     // Catch: java.lang.Throwable -> L4e
            if (r6 == 0) goto L32
            int r7 = r4.d()     // Catch: java.lang.Throwable -> L4e
            int r6 = r6.d()     // Catch: java.lang.Throwable -> L4e
            if (r6 >= r7) goto L35
        L32:
            r0.put(r5, r4)     // Catch: java.lang.Throwable -> L4e
        L35:
            int r5 = r4.d()     // Catch: java.lang.Throwable -> L4e
            if (r3 >= r5) goto L10
            int r3 = r4.d()     // Catch: java.lang.Throwable -> L4e
            java.lang.String r2 = r4.c()     // Catch: java.lang.Throwable -> L4e
            goto L10
        L44:
            com.google.d.d.bs r0 = com.google.d.d.bs.e(r0)     // Catch: java.lang.Throwable -> L4e
            r8.f47332e = r0     // Catch: java.lang.Throwable -> L4e
            r8.f47330c = r2     // Catch: java.lang.Throwable -> L4e
            monitor-exit(r8)
            return
        L4e:
            r0 = move-exception
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L4e
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e.a.di.h():void");
    }

    public final de a(String str) {
        if (str == null) {
            return null;
        }
        return (de) e().get(str.toLowerCase(Locale.US));
    }

    public final synchronized String c() {
        return this.f47330c;
    }

    final synchronized Map e() {
        return this.f47332e;
    }

    public final synchronized void f(de deVar) {
        g(deVar);
        h();
    }
}
