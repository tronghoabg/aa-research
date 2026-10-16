package defpackage;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class admt {
    public static final Logger a = Logger.getLogger(admt.class.getName());
    private static admt b;
    private String c = "unknown";
    private final LinkedHashSet d = new LinkedHashSet();
    private yfy e = ylx.a;

    public static synchronized admt b() {
        if (b == null) {
            adms.class.getClassLoader();
            List<adms> listB = adqq.B(adms.class, Collections.singletonList(adto.class.getDeclaredConstructor(null).newInstance(null)).iterator(), new txv(19), new adlr(2));
            if (listB.isEmpty()) {
                a.logp(Level.WARNING, "io.grpc.NameResolverRegistry", "getDefaultRegistry", "No NameResolverProviders found via ServiceLoader, including for DNS. This is probably due to a broken build. If using ProGuard, check your configuration");
            }
            b = new admt();
            for (adms admsVar : listB) {
                a.logp(Level.FINE, "io.grpc.NameResolverRegistry", "getDefaultRegistry", "Service loader found ".concat(String.valueOf(String.valueOf(admsVar))));
                b.f(admsVar);
            }
            b.g();
        }
        return b;
    }

    private final synchronized void f(adms admsVar) {
        admsVar.f();
        this.d.add(admsVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0032 A[Catch: all -> 0x004e, TryCatch #0 {, blocks: (B:3:0x0001, B:4:0x0010, B:6:0x0016, B:8:0x0028, B:11:0x0035, B:13:0x003b, B:10:0x0032, B:14:0x0044), top: B:20:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final synchronized void g() {
        /*
            r8 = this;
            monitor-enter(r8)
            java.util.HashMap r0 = new java.util.HashMap     // Catch: java.lang.Throwable -> L4e
            r0.<init>()     // Catch: java.lang.Throwable -> L4e
            java.util.LinkedHashSet r1 = r8.d     // Catch: java.lang.Throwable -> L4e
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L4e
            java.lang.String r2 = "unknown"
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
        L10:
            boolean r4 = r1.hasNext()     // Catch: java.lang.Throwable -> L4e
            if (r4 == 0) goto L44
            java.lang.Object r4 = r1.next()     // Catch: java.lang.Throwable -> L4e
            adms r4 = (defpackage.adms) r4     // Catch: java.lang.Throwable -> L4e
            java.lang.String r5 = r4.c()     // Catch: java.lang.Throwable -> L4e
            java.lang.Object r6 = r0.get(r5)     // Catch: java.lang.Throwable -> L4e
            adms r6 = (defpackage.adms) r6     // Catch: java.lang.Throwable -> L4e
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
            yfy r0 = defpackage.yfy.j(r0)     // Catch: java.lang.Throwable -> L4e
            r8.e = r0     // Catch: java.lang.Throwable -> L4e
            r8.c = r2     // Catch: java.lang.Throwable -> L4e
            monitor-exit(r8)
            return
        L4e:
            r0 = move-exception
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L4e
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.admt.g():void");
    }

    public final adms a(String str) {
        if (str == null) {
            return null;
        }
        return (adms) d().get(str.toLowerCase(Locale.US));
    }

    public final synchronized String c() {
        return this.c;
    }

    final synchronized Map d() {
        return this.e;
    }

    public final synchronized void e(adms admsVar) {
        f(admsVar);
        g();
    }
}
