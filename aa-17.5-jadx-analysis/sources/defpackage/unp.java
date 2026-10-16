package defpackage;

import j$.time.Duration;
import j$.util.Objects;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class unp implements uoa {
    public static final yob a = yob.c("com/google/android/libraries/geo/mapcore/internal/store/GlobalStyleTablesFetcher");
    private static final upz l;
    private static final upz m;
    private static final Duration n;
    private static final Duration o;
    private volatile abfu A;
    private final zgt B;
    private zwm C;
    private final gjv E;
    public final ackk b;
    public final zgt c;
    public final tmb d;
    public final achh g;
    final unl i;
    private final ackk p;
    private final ackk q;
    private final int t;
    private final plb u;
    private final plb v;
    private final plb w;
    public final yig e = new yca(12, 3);
    public final yig f = new yca(12, 3);
    private boolean r = false;
    private boolean s = true;
    private final Object x = new Object();
    private final Object y = new Object();
    public final Map h = new HashMap();
    private int z = 0;
    public final uno j = new uno();
    private final adpb D = new adpb(n, o);
    public final AtomicBoolean k = new AtomicBoolean(false);

    static {
        upz upzVar = upz.a;
        l = upzVar;
        abnp abnpVarN = upzVar.n();
        abnpVarN.t();
        upz upzVar2 = (upz) abnpVarN.b;
        upzVar2.b |= 2;
        upzVar2.d = true;
        m = (upz) abnpVarN.q();
        n = Duration.ofSeconds(1L);
        o = Duration.ofSeconds(20L);
    }

    public unp(tmb tmbVar, ackk ackkVar, ackk ackkVar2, ackk ackkVar3, zgt zgtVar, zgt zgtVar2, plb plbVar, ackk ackkVar4, achh achhVar, gjv gjvVar) {
        vaq.d();
        this.i = new unl(this, ackkVar4);
        this.d = tmbVar;
        this.p = ackkVar;
        this.q = ackkVar2;
        this.b = ackkVar3;
        this.c = zgtVar;
        this.B = zgtVar2;
        int i = achhVar.d;
        this.t = i;
        this.u = new plb(i, null, null, null);
        this.v = new plb(i + i, null, null, null);
        this.w = plbVar;
        this.g = achhVar;
        this.E = gjvVar;
    }

    private final rhj A(String str) {
        try {
            uok uokVarA = this.i.a();
            if (uokVarA != null) {
                return uokVarA.b(str, this.E.r());
            }
        } catch (IOException | OutOfMemoryError unused) {
        }
        return null;
    }

    static final boolean s(ujk ujkVar, String str, Map map) {
        return !Objects.equals(str, "") && map != null && map.containsKey(str) && ((Map) map.get(str)).containsKey(ujkVar);
    }

    private final ukh x(String str) {
        try {
            uok uokVarA = this.i.a();
            if (uokVarA != null) {
                return uokVarA.a(str);
            }
        } catch (IOException | OutOfMemoryError unused) {
        }
        return null;
    }

    private static String y(String str, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            if (((unq) entry.getValue()).a.containsValue(str)) {
                Iterator it = ((unq) entry.getValue()).a.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry2 = (Map.Entry) it.next();
                    if (((String) entry2.getValue()).equals(str)) {
                        return String.valueOf(entry2.getKey()) + " epoch " + String.valueOf(entry.getKey());
                    }
                }
            }
            if (str.equals(((unq) entry.getValue()).b)) {
                return "commonStyleData epoch ".concat(String.valueOf(String.valueOf(entry.getKey())));
            }
        }
        return "unknown type";
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void z(int r11, defpackage.abft r12, defpackage.unq r13, defpackage.ujk r14, java.lang.String r15, java.lang.String r16) {
        /*
            r10 = this;
            zwm r2 = r10.C
            boolean r3 = r14.M
            r8 = 0
            r9 = 1
            if (r2 == 0) goto L26
            tqz r5 = defpackage.zwm.f()
            boolean r5 = r5.c
            if (r5 == 0) goto L26
            if (r3 != 0) goto L25
            abgx r3 = r14.L
            qsb r2 = r2.h()
            java.lang.Object r2 = r2.b
            ygr r2 = (defpackage.ygr) r2
            boolean r2 = r2.contains(r3)
            if (r2 == 0) goto L23
            goto L25
        L23:
            r3 = r8
            goto L26
        L25:
            r3 = r9
        L26:
            if (r3 == 0) goto L8f
            boolean r5 = r10.m(r15, r11, r14)
            if (r5 != 0) goto L8f
            vky r5 = new vky
            java.lang.String r6 = "GlobalStyleTables.prefetchNextMissingStyleTable"
            r5.<init>(r6)
            vky r6 = new vky
            java.lang.String r7 = ""
            r6.<init>(r7)
            defpackage.vky.a(r5, r6)
            unw r2 = new unw
            r3 = r11
            r6 = r12
            r4 = r14
            r5 = r15
            r7 = r16
            r2.<init>(r3, r4, r5, r6, r7)
            upz r3 = r10.a()
            abnp r6 = r3.K()
            java.util.Map r3 = r13.g
            boolean r3 = s(r14, r7, r3)
            if (r3 == 0) goto L68
            r6.t()
            abnv r3 = r6.b
            upz r3 = (defpackage.upz) r3
            int r4 = r3.b
            r4 = r4 | r9
            r3.b = r4
            r3.c = r9
        L68:
            java.lang.String r7 = r2.d
            unk r3 = new unk
            r4 = r3
            und r3 = new und
            r3.<init>(r10, r2, r13, r8)
            r5 = r4
            une r4 = new une
            r4.<init>(r10, r2, r13, r8)
            abnv r0 = r6.q()
            upz r0 = (defpackage.upz) r0
            r1 = r5
            r5 = r0
            r0 = r1
            r1 = r10
            r2 = r15
            r0.<init>(r1, r2, r3, r4, r5)
            abnv r2 = r6.q()
            upz r2 = (defpackage.upz) r2
            r10.u(r7, r0, r8, r2)
        L8f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.unp.z(int, abft, unq, ujk, java.lang.String, java.lang.String):void");
    }

    public final upz a() {
        zwm zwmVar = this.C;
        return (zwmVar == null || !zwmVar.c().U) ? l : m;
    }

    @Override // defpackage.uoa
    public final abfu b(int i) {
        abfu abfuVar;
        pjv pjvVarB;
        byte[] bArrD;
        abfu abfuVar2 = this.A;
        if (abfuVar2 != null && abfuVar2.b == i) {
            return abfuVar2;
        }
        try {
            uok uokVarA = this.i.a();
            if (uokVarA != null) {
                vaq.d();
                abnp abnpVarN = pjw.a.n();
                String strBp = a.bp(i, "ER");
                abnpVarN.t();
                pjw pjwVar = (pjw) abnpVarN.b;
                pjwVar.b |= 2;
                pjwVar.d = strBp;
                abnpVarN.t();
                pjw pjwVar2 = (pjw) abnpVarN.b;
                pjwVar2.c = 5;
                pjwVar2.b |= 1;
                pjw pjwVar3 = (pjw) abnpVarN.q();
                try {
                    pjvVarB = ((upc) uokVarA).c.b(pjwVar3);
                } catch (IOException e) {
                    ((ynz) ((ynz) ((ynz) upc.a.g()).p(e)).ai(9544)).w("Failed to get epoch resources %s", i);
                }
                if (pjvVarB != null) {
                    try {
                        bArrD = pjvVarB.c.D();
                    } catch (IOException e2) {
                        ((ynz) ((ynz) ((ynz) upc.a.g()).p(e2)).ai(9542)).w("Failed to unpack epoch resources %s", i);
                    }
                    if (bArrD.length > 0) {
                        abfuVar = (abfu) abnv.B(abfu.a, bArrD, abnj.a());
                    } else {
                        try {
                            ((upc) uokVarA).c.e(pjwVar3);
                        } catch (uox e3) {
                            ((ynz) ((ynz) ((ynz) upc.a.g()).p(e3)).ai(9543)).w("Failed to delete resource %s :", i);
                        }
                        abfuVar = null;
                    }
                }
                abfuVar = null;
                if (abfuVar != null) {
                    this.A = abfuVar;
                }
                return abfuVar;
            }
        } catch (IOException e4) {
            ((ynz) ((ynz) ((ynz) a.g()).p(e4)).ai((char) 9457)).u("Disk cache get epoch resources failed.");
        }
        return null;
    }

    @Override // defpackage.uoa
    public final Iterable c() {
        Collection collectionJ;
        synchronized (this.x) {
            collectionJ = this.u.j();
        }
        return collectionJ;
    }

    public final void d() {
        this.s = false;
        synchronized (this.x) {
            this.u.k(this.t + 2);
        }
        synchronized (this.y) {
            this.w.k(this.t + 1);
        }
    }

    @Override // defpackage.uoa
    public final void e(String str, PrintWriter printWriter, Map map) {
        printWriter.println(str.concat("GlobalStyleTablesFetcher"));
        String string = this.j.toString();
        StringBuilder sb = new StringBuilder();
        String strConcat = str.concat("  ");
        sb.append(strConcat);
        sb.append("Stats: ");
        sb.append(string);
        printWriter.println(sb.toString());
        printWriter.println(strConcat.concat("Tables currently in memory:"));
        synchronized (this.x) {
            plb plbVar = this.u;
            pla plaVarE = plbVar.e();
            while (plaVarE.hasNext()) {
                ogz next = plaVarE.next();
                String str2 = (String) next.a;
                String str3 = (String) this.v.g(str2);
                String strY = y(str2, map);
                String str4 = ((zgp) next.b).isDone() ? "" : "(future pending)";
                if (str3 == null) {
                    str3 = "unknown";
                }
                printWriter.println(strConcat + "  " + str2 + " [" + strY + str4 + " source: " + str3 + "]");
            }
            if (plbVar.s()) {
                printWriter.println(a.bK(strConcat, "  None"));
            }
        }
        printWriter.println(strConcat.concat("Common style data currently in memory:"));
        synchronized (this.y) {
            plb plbVar2 = this.w;
            pla plaVarE2 = plbVar2.e();
            while (plaVarE2.hasNext()) {
                ogz next2 = plaVarE2.next();
                String str5 = (String) next2.a;
                String str6 = (String) this.v.g(str5);
                String strY2 = y(str5, map);
                String str7 = ((zgp) next2.b).isDone() ? "" : "(future pending)";
                if (str6 == null) {
                    str6 = "unknown";
                }
                printWriter.println(strConcat + "  " + str5 + " [" + strY2 + str7 + " source: " + str6 + "]");
            }
            if (plbVar2.s()) {
                printWriter.println(a.bK(strConcat, "  None"));
            }
        }
        printWriter.println(strConcat.concat("Data currently pending fetch:"));
        Map map2 = this.h;
        for (Map.Entry entry : map2.entrySet()) {
            String str8 = (String) entry.getKey();
            printWriter.println(strConcat + "  " + str8 + " [" + y(str8, map) + "] tried " + String.valueOf(entry.getValue()) + " times");
        }
        if (map2.isEmpty()) {
            printWriter.println(strConcat.concat("  None"));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x006c, code lost:
    
        if (r15.m((defpackage.pjw) r0.q()) != false) goto L16;
     */
    @Override // defpackage.uoa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(defpackage.unq r13, int r14, defpackage.uny r15) {
        /*
            r12 = this;
            vky r5 = new vky
            java.lang.String r0 = "GlobalStyleTables.fetchCommonStyleData"
            r5.<init>(r0)
            uno r0 = r12.j
            java.util.concurrent.atomic.AtomicInteger r0 = r0.g
            r0.incrementAndGet()
            yig r1 = r12.f
            java.lang.String r2 = r13.b
            monitor-enter(r1)
            acjs r0 = new acjs     // Catch: java.lang.Throwable -> Lbc
            r0.<init>(r15, r14)     // Catch: java.lang.Throwable -> Lbc
            r1.t(r2, r0)     // Catch: java.lang.Throwable -> Lbc
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lbc
            unx r3 = new unx
            r3.<init>(r14, r2)
            r14 = 2
            if (r2 == 0) goto L9a
            plb r15 = r12.w
            java.lang.Object r15 = r15.g(r2)
            zgp r15 = (defpackage.zgp) r15
            if (r15 == 0) goto L2f
            goto L6e
        L2f:
            unl r15 = r12.i
            uok r15 = r15.a()
            if (r15 != 0) goto L3a
        L37:
            r1 = r12
            r4 = r13
            goto L8d
        L3a:
            upc r15 = (defpackage.upc) r15     // Catch: java.io.IOException -> L7c
            uoz r15 = r15.c     // Catch: java.io.IOException -> L7c
            pjw r0 = defpackage.pjw.a     // Catch: java.io.IOException -> L7c
            abnp r0 = r0.n()     // Catch: java.io.IOException -> L7c
            r0.t()     // Catch: java.io.IOException -> L7c
            abnv r1 = r0.b     // Catch: java.io.IOException -> L7c
            pjw r1 = (defpackage.pjw) r1     // Catch: java.io.IOException -> L7c
            r4 = 4
            r1.c = r4     // Catch: java.io.IOException -> L7c
            int r4 = r1.b     // Catch: java.io.IOException -> L7c
            r4 = r4 | 1
            r1.b = r4     // Catch: java.io.IOException -> L7c
            r0.t()     // Catch: java.io.IOException -> L7c
            abnv r1 = r0.b     // Catch: java.io.IOException -> L7c
            pjw r1 = (defpackage.pjw) r1     // Catch: java.io.IOException -> L7c
            int r4 = r1.b     // Catch: java.io.IOException -> L7c
            r4 = r4 | r14
            r1.b = r4     // Catch: java.io.IOException -> L7c
            r1.d = r2     // Catch: java.io.IOException -> L7c
            abnv r0 = r0.q()     // Catch: java.io.IOException -> L7c
            pjw r0 = (defpackage.pjw) r0     // Catch: java.io.IOException -> L7c
            boolean r15 = r15.m(r0)     // Catch: java.io.IOException -> L7c
            if (r15 == 0) goto L37
        L6e:
            zgt r14 = r12.c
            twk r0 = new twk
            r6 = 2
            r1 = r12
            r4 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r14.execute(r0)
            return
        L7c:
            r0 = move-exception
            r1 = r12
            r4 = r13
            r12 = r0
            yob r13 = defpackage.upc.a
            yop r13 = r13.g()
            java.lang.String r15 = "Failed to check for style table %s"
            r0 = 9551(0x254f, float:1.3384E-41)
            defpackage.a.cg(r13, r15, r2, r0, r12)
        L8d:
            ackk r12 = r1.q
            java.lang.Object r12 = r12.a()
            pke r12 = (defpackage.pke) r12
            r13 = 0
            r12.b(r13, r13)
            goto L9c
        L9a:
            r1 = r12
            r4 = r13
        L9c:
            java.lang.String r12 = r3.d
            unk r6 = new unk
            und r9 = new und
            r9.<init>(r1, r3, r4, r14)
            une r10 = new une
            r10.<init>(r1, r3, r4, r14)
            upz r11 = r1.a()
            r7 = r1
            r8 = r2
            r6.<init>(r7, r8, r9, r10, r11)
            r13 = 0
            upz r14 = r1.a()
            r1.u(r12, r6, r13, r14)
            return
        Lbc:
            r0 = move-exception
            r12 = r0
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lbc
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.unp.f(unq, int, uny):void");
    }

    final void g(int i, abft abftVar, unq unqVar) {
        if (this.s && this.k.get()) {
            Map map = this.h;
            synchronized (map) {
                if (map.isEmpty()) {
                    Iterator it = unqVar.a.entrySet().iterator();
                    while (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        z(i, abftVar, unqVar, (ujk) entry.getKey(), (String) entry.getValue(), "");
                    }
                    for (Map.Entry entry2 : unqVar.g.entrySet()) {
                        String str = (String) entry2.getKey();
                        for (Map.Entry entry3 : ((Map) entry2.getValue()).entrySet()) {
                            z(i, abftVar, unqVar, (ujk) entry3.getKey(), (String) entry3.getValue(), str);
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, uiv] */
    final void h(unw unwVar, unq unqVar, ukh ukhVar, String str) {
        List listG;
        Iterator it;
        boolean z;
        boolean zEquals;
        Iterator it2;
        String str2;
        yig yigVar = this.e;
        synchronized (yigVar) {
            listG = yigVar.g(unwVar.d);
        }
        Iterator it3 = listG.iterator();
        while (true) {
            boolean z2 = true;
            if (!it3.hasNext()) {
                this.r = true;
                g(unwVar.e, unwVar.c, unqVar);
                return;
            }
            acjs acjsVar = (acjs) it3.next();
            Object obj = acjsVar.b;
            int i = acjsVar.a;
            ujk ujkVar = unwVar.b;
            String str3 = unwVar.a;
            String str4 = unwVar.d;
            ArrayList arrayList = new ArrayList();
            Set set = ((uns) obj).e;
            synchronized (set) {
                ((uns) obj).f++;
                Iterator it4 = set.iterator();
                while (it4.hasNext()) {
                    xa xaVar = (xa) it4.next();
                    Object obj2 = xaVar.c;
                    if (((unr) obj2).b == ujkVar && ((unr) obj2).a == i) {
                        zEquals = z2;
                        z = zEquals;
                    } else {
                        z = z2;
                        zEquals = false;
                    }
                    if (zwm.f().c && (str2 = ((unr) obj2).d) != null) {
                        zEquals &= str2.equals(str4);
                    }
                    if (zEquals) {
                        if (str == null) {
                            ((unr) obj2).c = str3;
                            ((unr) obj2).e = ukhVar;
                            it2 = it3;
                        } else {
                            it2 = it3;
                            ((unr) obj2).c = "";
                            ((unr) obj2).e = null;
                            ((unr) obj2).h = null;
                            ((ynz) ((ynz) uns.a.f()).ai(9477)).y("Reporting error because of %s for StyleTable", str);
                            ((uns) obj).i++;
                        }
                        if ((((unr) obj2).e != null && ((unr) obj2).h != null) || str != null) {
                            it4.remove();
                            arrayList.add(xaVar);
                            ((uns) obj).h++;
                        }
                        z2 = z;
                        it3 = it2;
                    } else {
                        z2 = z;
                    }
                }
                it = it3;
            }
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                xa xaVar2 = (xa) arrayList.get(i2);
                xaVar2.b.H(((unr) xaVar2.c).a());
            }
            this.j.i.incrementAndGet();
            it3 = it;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i(unw unwVar, unq unqVar, zgp zgpVar) {
        try {
            h(unwVar, unqVar, (ukh) zgpVar.get(), null);
        } catch (InterruptedException | ExecutionException e) {
            h(unwVar, unqVar, null, e.toString());
        }
    }

    final void j(final unw unwVar, final byte[] bArr, final unq unqVar) {
        final boolean zS;
        ujj ujjVarL;
        vaq.b(new unf(0));
        final abft abftVar = unwVar.c;
        yig yigVar = this.e;
        synchronized (yigVar) {
            zS = yigVar.s(unwVar.d);
        }
        if (zS) {
            zhc zhcVar = new zhc();
            try {
                synchronized (this.x) {
                    this.u.n(unwVar.d, zhcVar);
                }
                ynz ynzVar = (ynz) ((ynz) a.f()).ai(9468);
                Integer numValueOf = Integer.valueOf(unwVar.e);
                ujk ujkVar = unwVar.b;
                String str = unwVar.d;
                ynzVar.R("styleTableCache inserted: %s %s %s", numValueOf, ujkVar, str);
                ujjVarL = ukh.l(bArr, unwVar.c, this.g);
                zhcVar.o(ujjVarL);
                this.j.j.incrementAndGet();
                this.v.n(str, "network");
            } catch (IOException e) {
                ((ynz) ((ynz) ((ynz) a.g()).p(e)).ai(9469)).u("IOException processing legend resource");
                Map map = this.h;
                synchronized (map) {
                    map.remove(unwVar.d);
                    synchronized (this.x) {
                        plb plbVar = this.u;
                        String str2 = unwVar.d;
                        if (((zgp) plbVar.h(str2)) == zhcVar) {
                        }
                        zhcVar.p(e);
                        this.j.k.incrementAndGet();
                        h(unwVar, unqVar, null, "Parse Error " + e.getMessage());
                        return;
                    }
                }
            }
        } else {
            ujjVarL = null;
        }
        final uok uokVarA = this.i.a();
        if (uokVarA == null) {
            d();
            Map map2 = this.h;
            synchronized (map2) {
                map2.remove(unwVar.d);
            }
            h(unwVar, unqVar, ujjVarL, null);
            return;
        }
        this.B.execute(new Runnable() { // from class: ung
            /* JADX WARN: Can't wrap try/catch for region: R(12:0|2|36|3|33|4|(1:(1:(4:8|17|21|(4:23|118|27|28)(1:32))(1:9))(1:10))(1:11)|12|37|13|21|(0)(0)) */
            /* JADX WARN: Code restructure failed: missing block: B:15:0x00e0, code lost:
            
                r0 = move-exception;
             */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x00e1, code lost:
            
                ((defpackage.ynz) ((defpackage.ynz) ((defpackage.ynz) defpackage.upc.a.g()).p(r0)).ai(9556)).u("Failed to insert resource:");
             */
            /* JADX WARN: Removed duplicated region for block: B:23:0x0116  */
            /* JADX WARN: Removed duplicated region for block: B:32:0x0129 A[RETURN] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 298
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.ung.run():void");
            }
        });
        if (zS) {
            Map map3 = this.h;
            synchronized (map3) {
                map3.remove(unwVar.d);
            }
            h(unwVar, unqVar, ujjVarL, null);
        }
    }

    @Override // defpackage.uoa
    public final void k(int i, abft abftVar, unq unqVar) {
        this.k.set(true);
        g(i, abftVar, unqVar);
    }

    @Override // defpackage.uoa
    public final void l(int i, abfu abfuVar) {
        this.A = abfuVar;
        try {
            uok uokVarA = this.i.a();
            if (uokVarA != null) {
                byte[] bArrH = abfuVar.h();
                vaq.d();
                abnp abnpVarN = pjx.a.n();
                abnp abnpVarN2 = pjw.a.n();
                abnpVarN2.t();
                pjw pjwVar = (pjw) abnpVarN2.b;
                pjwVar.c = 5;
                pjwVar.b |= 1;
                String strBp = a.bp(i, "ER");
                abnpVarN2.t();
                pjw pjwVar2 = (pjw) abnpVarN2.b;
                pjwVar2.b |= 2;
                pjwVar2.d = strBp;
                abnpVarN.t();
                pjx pjxVar = (pjx) abnpVarN.b;
                pjw pjwVar3 = (pjw) abnpVarN2.q();
                pjwVar3.getClass();
                pjxVar.c = pjwVar3;
                pjxVar.b |= 1;
                long epochMilli = ((upc) uokVarA).d.f().toEpochMilli() + upc.b;
                abnpVarN.t();
                pjx pjxVar2 = (pjx) abnpVarN.b;
                pjxVar2.b |= 8;
                pjxVar2.e = epochMilli;
                abnpVarN.t();
                pjx pjxVar3 = (pjx) abnpVarN.b;
                pjxVar3.g = aclh.c(3);
                pjxVar3.b |= 32;
                try {
                    ((upc) uokVarA).c.h((pjx) abnpVarN.q(), bArrH);
                } catch (IOException e) {
                    ((ynz) ((ynz) ((ynz) upc.a.g()).p(e)).ai(9554)).u("Failed to insert resource:");
                }
            }
        } catch (IOException e2) {
            ((ynz) ((ynz) ((ynz) a.g()).p(e2)).ai((char) 9471)).u("Disk cache insertion for epoch resources failed.");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0049, code lost:
    
        if (r0.m((defpackage.pjw) r2.q()) != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m(java.lang.String r7, int r8, defpackage.ujk r9) {
        /*
            r6 = this;
            plb r0 = r6.u
            java.lang.Object r0 = r0.g(r7)
            zgp r0 = (defpackage.zgp) r0
            r1 = 1
            if (r0 == 0) goto Lc
            goto L4b
        Lc:
            unl r0 = r6.i
            uok r0 = r0.a()
            if (r0 != 0) goto L15
            goto L5a
        L15:
            upc r0 = (defpackage.upc) r0     // Catch: java.io.IOException -> L4c
            uoz r0 = r0.c     // Catch: java.io.IOException -> L4c
            pjw r2 = defpackage.pjw.a     // Catch: java.io.IOException -> L4c
            abnp r2 = r2.n()     // Catch: java.io.IOException -> L4c
            r2.t()     // Catch: java.io.IOException -> L4c
            abnv r3 = r2.b     // Catch: java.io.IOException -> L4c
            pjw r3 = (defpackage.pjw) r3     // Catch: java.io.IOException -> L4c
            r4 = 2
            r3.c = r4     // Catch: java.io.IOException -> L4c
            int r5 = r3.b     // Catch: java.io.IOException -> L4c
            r5 = r5 | r1
            r3.b = r5     // Catch: java.io.IOException -> L4c
            r2.t()     // Catch: java.io.IOException -> L4c
            abnv r3 = r2.b     // Catch: java.io.IOException -> L4c
            pjw r3 = (defpackage.pjw) r3     // Catch: java.io.IOException -> L4c
            r7.getClass()     // Catch: java.io.IOException -> L4c
            int r5 = r3.b     // Catch: java.io.IOException -> L4c
            r4 = r4 | r5
            r3.b = r4     // Catch: java.io.IOException -> L4c
            r3.d = r7     // Catch: java.io.IOException -> L4c
            abnv r2 = r2.q()     // Catch: java.io.IOException -> L4c
            pjw r2 = (defpackage.pjw) r2     // Catch: java.io.IOException -> L4c
            boolean r7 = r0.m(r2)     // Catch: java.io.IOException -> L4c
            if (r7 == 0) goto L5a
        L4b:
            return r1
        L4c:
            r0 = move-exception
            yob r1 = defpackage.upc.a
            yop r1 = r1.g()
            java.lang.String r2 = "Failed to check for style table %s"
            r3 = 9552(0x2550, float:1.3385E-41)
            defpackage.a.cg(r1, r2, r7, r3, r0)
        L5a:
            ackk r6 = r6.q
            java.lang.Object r6 = r6.a()
            pke r6 = (defpackage.pke) r6
            java.lang.Integer r7 = java.lang.Integer.valueOf(r8)
            r6.b(r7, r9)
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.unp.m(java.lang.String, int, ujk):boolean");
    }

    public final boolean n(String str, upz upzVar, unk unkVar) {
        boolean zS;
        Duration durationOfMillis;
        boolean zS2;
        yig yigVar = this.e;
        synchronized (yigVar) {
            zS = yigVar.s(str);
        }
        if (!zS) {
            yig yigVar2 = this.f;
            synchronized (yigVar2) {
                zS2 = yigVar2.s(str);
            }
            if (!zS2) {
                return false;
            }
        }
        Map map = this.h;
        synchronized (map) {
            Integer num = (Integer) map.get(str);
            if (num == null) {
                ((ynz) ((ynz) a.h()).ai(9470)).y("Retry attempted for %s but was not in fetching set", str);
                return false;
            }
            if (num.intValue() > 5) {
                return false;
            }
            adpb adpbVar = this.D;
            int iIntValue = num.intValue();
            if (iIntValue <= 0) {
                durationOfMillis = Duration.ZERO;
            } else {
                Object obj = adpbVar.b;
                int i = adpbVar.a;
                Duration duration = (Duration) obj;
                long millis = duration.toMillis();
                if (iIntValue <= i) {
                    millis = ((Duration) adpbVar.d).toMillis() << (iIntValue - 1);
                    long millis2 = duration.toMillis();
                    if (millis > millis2) {
                        millis = millis2;
                    }
                }
                durationOfMillis = Duration.ofMillis((long) (((Random) adpbVar.c).nextDouble() * millis));
            }
            zgt zgtVar = this.c;
            lws.M(zgtVar.schedule(new saq(this, str, unkVar, upzVar, 7), durationOfMillis.toMillis(), TimeUnit.MILLISECONDS), zgtVar);
            return true;
        }
    }

    @Override // defpackage.uoa
    public final void o(zwm zwmVar) {
        this.C = zwmVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void p(unx unxVar, zgp zgpVar, unq unqVar) {
        try {
            w(unxVar, unqVar, (rhj) zgpVar.get(), null);
        } catch (InterruptedException | ExecutionException e) {
            w(unxVar, unqVar, null, e.toString());
        }
    }

    /* JADX WARN: Finally extract failed */
    public final void q(unx unxVar, byte[] bArr, unq unqVar) {
        unp unpVar;
        unx unxVar2;
        unp unpVar2;
        unx unxVar3;
        vaq.d();
        zhc zhcVar = new zhc();
        try {
            synchronized (this.y) {
                try {
                    this.w.n(unxVar.d, zhcVar);
                } catch (Throwable th) {
                    th = th;
                    unpVar = this;
                    unxVar2 = unxVar;
                    while (true) {
                        try {
                            try {
                                throw th;
                            } catch (abon e) {
                                e = e;
                                abon abonVar = e;
                                ((ynz) ((ynz) ((ynz) a.g()).p(abonVar)).ai(9467)).u("InvalidProtocolBufferException processing common resource");
                                Map map = unpVar.h;
                                synchronized (map) {
                                    map.remove(unxVar2.d);
                                }
                                synchronized (unpVar.y) {
                                    plb plbVar = unpVar.w;
                                    String str = unxVar2.d;
                                    if (((zgp) plbVar.h(str)) == zhcVar) {
                                    }
                                }
                                zhcVar.p(abonVar);
                                unpVar.j.k.incrementAndGet();
                                unpVar.w(unxVar2, unqVar, null, "Parse Error " + abonVar.getMessage());
                                return;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                }
            }
            rhj rhjVarN = rhj.n(bArr, this.E.r());
            zhcVar.o(rhjVarN);
            this.j.j.incrementAndGet();
            uok uokVarA = this.i.a();
            if (uokVarA != null) {
                unpVar2 = this;
                unxVar3 = unxVar;
                unpVar2.B.execute(new saq(unpVar2, (Object) uokVarA, (Object) unxVar3, (Object) bArr, 10));
            } else {
                unpVar2 = this;
                unxVar3 = unxVar;
                unpVar2.d();
            }
            Map map2 = unpVar2.h;
            synchronized (map2) {
                map2.remove(unxVar3.d);
            }
            unpVar2.w(unxVar3, unqVar, rhjVarN, null);
        } catch (abon e2) {
            e = e2;
            unpVar = this;
            unxVar2 = unxVar;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x007d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.zgp r(java.lang.String r8) {
        /*
            Method dump skipped, instructions count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.unp.r(java.lang.String):zgp");
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00de A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.zgp t(java.lang.String r7, int r8, defpackage.ujk r9) {
        /*
            Method dump skipped, instructions count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.unp.t(java.lang.String, int, ujk):zgp");
    }

    public final void u(String str, final unk unkVar, boolean z, upz upzVar) {
        Map map = this.h;
        synchronized (map) {
            this.z++;
            Integer num = (Integer) map.get(str);
            if (num == null || z) {
                map.put(str, num == null ? 1 : Integer.valueOf(num.intValue() + 1));
                ((ynz) ((ynz) a.d()).ai(9451)).y("Requesting style resource %s", str);
                String[] strArr = vaq.a;
                upy upyVarD = ((upr) this.p.a()).d(str, "GlobalStyleTablesFetcher#fetchResource", new upw() { // from class: unc
                    @Override // defpackage.upw
                    public final void a(upy upyVar) {
                        yob yobVar = unp.a;
                        String[] strArr2 = vaq.a;
                        unkVar.a(upyVar);
                    }
                }, true, upzVar);
                if (upyVarD.l()) {
                    unkVar.a(upyVarD);
                    this.j.d.incrementAndGet();
                } else {
                    upyVarD.e(new uni(this, str));
                    zgt zgtVar = this.c;
                    lws.M(zgtVar.schedule(new rdz((Object) this, str, (Object) upyVarD, 19), 60L, TimeUnit.SECONDS), zgtVar);
                    this.j.c.incrementAndGet();
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uoa
    public final void v(final unq unqVar, final int i, abft abftVar, final ujk ujkVar, unz unzVar, String str) {
        String str2;
        final vky vkyVarA = vky.a(new vky("GlobalStyleTables.fetchStyleTables"), new vky(""));
        abnp abnpVarK = a().K();
        if (s(ujkVar, str, unqVar.g)) {
            abnpVarK.t();
            upz upzVar = (upz) abnpVarK.b;
            upzVar.b |= 1;
            upzVar.c = true;
        }
        final upz upzVar2 = (upz) abnpVarK.q();
        if (unqVar.g.containsKey(str) && ((Map) unqVar.g.get(str)).containsKey(ujkVar)) {
            str2 = (String) ((Map) unqVar.g.get(str)).get(ujkVar);
        } else {
            zwm zwmVar = this.C;
            zwmVar.getClass();
            qsb qsbVarH = zwmVar.h();
            str2 = (qsbVarH.p(str) || Objects.equals(str, "") || unqVar.g.containsKey(str) || !qsbVarH.q(ujkVar.L)) ? (String) unqVar.a.get(ujkVar) : null;
        }
        final String str3 = str2;
        if (str3 == null) {
            ((ynz) ((ynz) a.h()).ai((char) 9452)).y("legendUrl was null for legend %s", ujkVar);
            this.j.h.incrementAndGet();
            return;
        }
        this.j.g.incrementAndGet();
        yig yigVar = this.e;
        synchronized (yigVar) {
            yigVar.t(str3, new acjs(unzVar, i));
        }
        final unw unwVar = new unw(i, ujkVar, str3, abftVar, str);
        if (m(str3, i, ujkVar)) {
            this.c.execute(new Runnable() { // from class: unh
                @Override // java.lang.Runnable
                public final void run() {
                    unp unpVar = this.a;
                    String str4 = str3;
                    unw unwVar2 = unwVar;
                    int i2 = i;
                    unq unqVar2 = unqVar;
                    zgp zgpVarT = unpVar.t(str4, i2, ujkVar);
                    if (zgpVarT == null) {
                        upz upzVar3 = upzVar2;
                        unpVar.u(unwVar2.d, new unk(unpVar, str4, new und(unpVar, unwVar2, unqVar2, 1), new une(unpVar, unwVar2, unqVar2, 1), upzVar3), false, upzVar3);
                    } else if (zgpVarT.isDone()) {
                        unpVar.i(unwVar2, unqVar2, zgpVarT);
                    } else {
                        zgpVarT.c(new saq(unpVar, (Object) unwVar2, (Object) unqVar2, (Object) zgpVarT, 8), unpVar.c);
                    }
                }
            });
        } else {
            u(unwVar.d, new unk(this, str3, new und(this, unwVar, unqVar, 4), new une(this, unwVar, unqVar, 4), upzVar2), false, upzVar2);
        }
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, uiv] */
    final void w(unx unxVar, unq unqVar, rhj rhjVar, String str) {
        List<acjs> listG;
        yig yigVar = this.f;
        synchronized (yigVar) {
            listG = yigVar.g(unxVar.d);
        }
        for (acjs acjsVar : listG) {
            Object obj = acjsVar.b;
            int i = acjsVar.a;
            ArrayList arrayList = new ArrayList();
            Set set = ((uns) obj).e;
            synchronized (set) {
                ((uns) obj).g++;
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    xa xaVar = (xa) it.next();
                    Object obj2 = xaVar.c;
                    if (((unr) obj2).a == i) {
                        if (str == null) {
                            ((unr) obj2).h = rhjVar;
                        } else {
                            ((unr) obj2).e = null;
                            ((unr) obj2).h = null;
                            ((ynz) ((ynz) uns.a.f()).ai(9476)).y("Reporting error because of %s for CommonStyleData", str);
                            ((uns) obj).i++;
                        }
                        if ((((unr) obj2).e != null && ((unr) obj2).h != null) || str != null) {
                            it.remove();
                            arrayList.add(xaVar);
                            ((uns) obj).h++;
                        }
                    }
                }
            }
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                xa xaVar2 = (xa) arrayList.get(i2);
                xaVar2.b.H(((unr) xaVar2.c).a());
            }
            this.j.i.incrementAndGet();
        }
        g(unxVar.e, unqVar.f, unqVar);
    }
}
