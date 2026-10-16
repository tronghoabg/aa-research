package defpackage;

import com.google.android.libraries.handwriting.networkrecognizer.CloudRecognizerProtocolStrings;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* loaded from: classes2.dex */
public final class frf implements Closeable, Flushable {
    private static final aisp i = new aisp("[a-z0-9_-]{1,120}");
    public final ajnr a;
    public ajmz b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public final fre h;
    private final long j;
    private final ajnr k;
    private final ajnr l;
    private final ajnr m;
    private final LinkedHashMap n;
    private final aitx o;
    private long p;
    private int q;

    public frf(ajnf ajnfVar, ajnr ajnrVar, long j) {
        this.a = ajnrVar;
        this.j = j;
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.k = ajnrVar.h("journal");
        this.l = ajnrVar.h("journal.tmp");
        this.m = ajnrVar.h("journal.bkp");
        this.n = new LinkedHashMap(0, 0.75f, true);
        this.o = ahni.b(affa.v(new aiwh(null), ajdq.a.g(1)));
        this.h = new fre(ajnfVar);
    }

    private final ajmz i() {
        return ahfm.a(new frg(this.h.c.j(this.k), new ewm(this, 19)));
    }

    private final void j() {
        if (this.e) {
            throw new IllegalStateException("cache is closed");
        }
    }

    private final void k() {
        ahnc.d(this.o, null, 0, new dxi(this, (afck) null, 9), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01a8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void l() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.frf.l():void");
    }

    private static final void m(String str) {
        if (!i.f(str)) {
            throw new IllegalArgumentException(a.bq(str, "keys must match regex [a-z0-9_-]{1,120}: \"", "\""));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0054 A[Catch: all -> 0x007e, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x0015, B:23:0x0054, B:25:0x0077, B:8:0x001b, B:10:0x001f, B:13:0x0024, B:15:0x002f, B:17:0x003d, B:20:0x0044), top: B:36:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized defpackage.frd a(java.lang.String r9) {
        /*
            r8 = this;
            monitor-enter(r8)
            r8.j()     // Catch: java.lang.Throwable -> L7e
            m(r9)     // Catch: java.lang.Throwable -> L7e
            r8.b()     // Catch: java.lang.Throwable -> L7e
            java.util.LinkedHashMap r0 = r8.n     // Catch: java.lang.Throwable -> L7e
            java.lang.Object r0 = r0.get(r9)     // Catch: java.lang.Throwable -> L7e
            frc r0 = (defpackage.frc) r0     // Catch: java.lang.Throwable -> L7e
            r1 = 0
            if (r0 == 0) goto L7c
            boolean r2 = r0.e     // Catch: java.lang.Throwable -> L7e
            if (r2 != 0) goto L1b
        L19:
            r3 = r1
            goto L51
        L1b:
            nbu r2 = r0.i     // Catch: java.lang.Throwable -> L7e
            if (r2 != 0) goto L19
            boolean r2 = r0.f     // Catch: java.lang.Throwable -> L7e
            if (r2 == 0) goto L24
            goto L19
        L24:
            java.util.ArrayList r2 = r0.c     // Catch: java.lang.Throwable -> L7e
            frf r3 = r0.h     // Catch: java.lang.Throwable -> L7e
            int r4 = r2.size()     // Catch: java.lang.Throwable -> L7e
            r5 = 0
        L2d:
            if (r5 >= r4) goto L44
            java.lang.Object r6 = r2.get(r5)     // Catch: java.lang.Throwable -> L7e
            ajnr r6 = (defpackage.ajnr) r6     // Catch: java.lang.Throwable -> L7e
            fre r7 = r3.h     // Catch: java.lang.Throwable -> L7e
            boolean r6 = r7.i(r6)     // Catch: java.lang.Throwable -> L7e
            if (r6 != 0) goto L41
            r3.f(r0)     // Catch: java.io.IOException -> L19 java.lang.Throwable -> L7e
            goto L19
        L41:
            int r5 = r5 + 1
            goto L2d
        L44:
            int r2 = r0.g     // Catch: java.lang.Throwable -> L7e
            int r2 = r2 + 1
            r0.g = r2     // Catch: java.lang.Throwable -> L7e
            frf r2 = r0.h     // Catch: java.lang.Throwable -> L7e
            frd r3 = new frd     // Catch: java.lang.Throwable -> L7e
            r3.<init>(r2, r0)     // Catch: java.lang.Throwable -> L7e
        L51:
            if (r3 != 0) goto L54
            goto L7c
        L54:
            int r0 = r8.q     // Catch: java.lang.Throwable -> L7e
            int r0 = r0 + 1
            r8.q = r0     // Catch: java.lang.Throwable -> L7e
            ajmz r0 = r8.b     // Catch: java.lang.Throwable -> L7e
            r0.getClass()     // Catch: java.lang.Throwable -> L7e
            java.lang.String r1 = "READ"
            r0.Z(r1)     // Catch: java.lang.Throwable -> L7e
            r1 = 32
            r0.W(r1)     // Catch: java.lang.Throwable -> L7e
            r0.Z(r9)     // Catch: java.lang.Throwable -> L7e
            r9 = 10
            r0.W(r9)     // Catch: java.lang.Throwable -> L7e
            boolean r9 = r8.e()     // Catch: java.lang.Throwable -> L7e
            if (r9 == 0) goto L7a
            r8.k()     // Catch: java.lang.Throwable -> L7e
        L7a:
            monitor-exit(r8)
            return r3
        L7c:
            monitor-exit(r8)
            return r1
        L7e:
            r9 = move-exception
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L7e
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.frf.a(java.lang.String):frd");
    }

    public final synchronized void b() {
        if (this.d) {
            return;
        }
        fre freVar = this.h;
        freVar.h(this.l);
        ajnr ajnrVar = this.m;
        if (freVar.i(ajnrVar)) {
            ajnr ajnrVar2 = this.k;
            if (freVar.i(ajnrVar2)) {
                freVar.h(ajnrVar);
            } else {
                freVar.g(ajnrVar, ajnrVar2);
            }
        }
        if (freVar.i(this.k)) {
            try {
                try {
                    l();
                    Iterator it = this.n.values().iterator();
                    long j = 0;
                    while (it.hasNext()) {
                        Object next = it.next();
                        next.getClass();
                        frc frcVar = (frc) next;
                        if (frcVar.i == null) {
                            for (int i2 = 0; i2 < 2; i2++) {
                                j += frcVar.b[i2];
                            }
                        } else {
                            frcVar.i = null;
                            for (int i3 = 0; i3 < 2; i3++) {
                                Object obj = frcVar.c.get(i3);
                                obj.getClass();
                                freVar.h((ajnr) obj);
                                Object obj2 = frcVar.d.get(i3);
                                obj2.getClass();
                                freVar.h((ajnr) obj2);
                            }
                            it.remove();
                        }
                    }
                    this.p = j;
                    this.d = true;
                    return;
                } catch (Throwable th) {
                    this.e = false;
                    throw th;
                }
            } catch (IOException unused) {
                close();
                a.bb(this.h, this.a);
                this.e = false;
            }
        }
        d();
        this.d = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
    
        f(r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c() throws java.io.IOException {
        /*
            r4 = this;
        L0:
            long r0 = r4.p
            long r2 = r4.j
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L2a
            java.util.LinkedHashMap r0 = r4.n
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L12:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L29
            java.lang.Object r1 = r0.next()
            r1.getClass()
            frc r1 = (defpackage.frc) r1
            boolean r2 = r1.f
            if (r2 != 0) goto L12
            r4.f(r1)
            goto L0
        L29:
            return
        L2a:
            r0 = 0
            r4.f = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.frf.c():void");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.d && !this.e) {
            Collection collectionValues = this.n.values();
            collectionValues.getClass();
            for (frc frcVar : (frc[]) collectionValues.toArray(new frc[0])) {
                frcVar.getClass();
                nbu nbuVar = frcVar.i;
                if (nbuVar != null) {
                    Object obj = nbuVar.b;
                    if (affa.f(((frc) obj).i, nbuVar)) {
                        ((frc) obj).c();
                    }
                }
            }
            c();
            ahni.e(this.o, null);
            ajmz ajmzVar = this.b;
            ajmzVar.getClass();
            ajmzVar.close();
            this.b = null;
            this.e = true;
            return;
        }
        this.e = true;
    }

    public final synchronized void d() {
        Throwable th;
        ajmz ajmzVar = this.b;
        if (ajmzVar != null) {
            ajmzVar.close();
        }
        ajmz ajmzVarA = ahfm.a(this.h.a(this.l));
        try {
            ajmzVarA.Z("libcore.io.DiskLruCache");
            ajmzVarA.W(10);
            ajmzVarA.Z(CloudRecognizerProtocolStrings.CLIENT_SOURCE_VALUE);
            ajmzVarA.W(10);
            ajmzVarA.Y(1L);
            ajmzVarA.W(10);
            ajmzVarA.Y(2L);
            ajmzVarA.W(10);
            ajmzVarA.W(10);
            for (Object obj : this.n.values()) {
                obj.getClass();
                frc frcVar = (frc) obj;
                if (frcVar.i != null) {
                    ajmzVarA.Z("DIRTY");
                    ajmzVarA.W(32);
                    ajmzVarA.Z(frcVar.a);
                    ajmzVarA.W(10);
                } else {
                    ajmzVarA.Z("CLEAN");
                    ajmzVarA.W(32);
                    ajmzVarA.Z(frcVar.a);
                    frcVar.a(ajmzVarA);
                    ajmzVarA.W(10);
                }
            }
            try {
                ajmzVarA.close();
                th = null;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            try {
                ajmzVarA.close();
            } catch (Throwable th4) {
                adqs.y(th3, th4);
            }
            th = th3;
        }
        if (th != null) {
            throw th;
        }
        fre freVar = this.h;
        ajnr ajnrVar = this.k;
        if (freVar.i(ajnrVar)) {
            ajnr ajnrVar2 = this.m;
            freVar.g(ajnrVar, ajnrVar2);
            freVar.g(this.l, ajnrVar);
            freVar.h(ajnrVar2);
        } else {
            freVar.g(this.l, ajnrVar);
        }
        this.b = i();
        this.q = 0;
        this.c = false;
        this.g = false;
    }

    public final boolean e() {
        return this.q >= 2000;
    }

    public final void f(frc frcVar) throws IOException {
        ajmz ajmzVar;
        if (frcVar.g > 0 && (ajmzVar = this.b) != null) {
            ajmzVar.Z("DIRTY");
            ajmzVar.W(32);
            ajmzVar.Z(frcVar.a);
            ajmzVar.W(10);
            ajmzVar.flush();
        }
        if (frcVar.g > 0 || frcVar.i != null) {
            frcVar.c();
            return;
        }
        for (int i2 = 0; i2 < 2; i2++) {
            fre freVar = this.h;
            Object obj = frcVar.c.get(i2);
            obj.getClass();
            freVar.h((ajnr) obj);
            long j = this.p;
            long[] jArr = frcVar.b;
            this.p = j - jArr[i2];
            jArr[i2] = 0;
        }
        this.q++;
        ajmz ajmzVar2 = this.b;
        if (ajmzVar2 != null) {
            ajmzVar2.Z("REMOVE");
            ajmzVar2.W(32);
            ajmzVar2.Z(frcVar.a);
            ajmzVar2.W(10);
        }
        this.n.remove(frcVar.a);
        if (e()) {
            k();
        }
    }

    @Override // java.io.Flushable
    public final synchronized void flush() {
        if (this.d) {
            j();
            c();
            ajmz ajmzVar = this.b;
            ajmzVar.getClass();
            ajmzVar.flush();
        }
    }

    public final synchronized nbu g(String str) {
        j();
        m(str);
        b();
        LinkedHashMap linkedHashMap = this.n;
        frc frcVar = (frc) linkedHashMap.get(str);
        if ((frcVar != null ? frcVar.i : null) == null && (frcVar == null || frcVar.g == 0)) {
            if (!this.f && !this.g) {
                ajmz ajmzVar = this.b;
                ajmzVar.getClass();
                ajmzVar.Z("DIRTY");
                ajmzVar.W(32);
                ajmzVar.Z(str);
                ajmzVar.W(10);
                ajmzVar.flush();
                if (!this.c) {
                    if (frcVar == null) {
                        frcVar = new frc(this, str);
                        linkedHashMap.put(str, frcVar);
                    }
                    nbu nbuVar = new nbu(this, frcVar);
                    frcVar.i = nbuVar;
                    return nbuVar;
                }
            }
            k();
            return null;
        }
        return null;
    }

    public final synchronized void h(nbu nbuVar, boolean z) {
        Object obj = nbuVar.b;
        if (!affa.f(((frc) obj).i, nbuVar)) {
            throw new IllegalStateException("Check failed.");
        }
        int i2 = 0;
        if (!z || ((frc) obj).f) {
            while (i2 < 2) {
                fre freVar = this.h;
                Object obj2 = ((frc) obj).d.get(i2);
                obj2.getClass();
                freVar.h((ajnr) obj2);
                i2++;
            }
        } else {
            for (int i3 = 0; i3 < 2; i3++) {
                if (((boolean[]) nbuVar.c)[i3]) {
                    fre freVar2 = this.h;
                    Object obj3 = ((frc) obj).d.get(i3);
                    obj3.getClass();
                    if (!freVar2.i((ajnr) obj3)) {
                        nbuVar.g(false);
                        return;
                    }
                }
            }
            while (i2 < 2) {
                Object obj4 = ((frc) obj).d.get(i2);
                obj4.getClass();
                ArrayList arrayList = ((frc) obj).c;
                ajnr ajnrVar = (ajnr) obj4;
                Object obj5 = arrayList.get(i2);
                obj5.getClass();
                fre freVar3 = this.h;
                ajnr ajnrVar2 = (ajnr) obj5;
                if (freVar3.i(ajnrVar)) {
                    freVar3.g(ajnrVar, ajnrVar2);
                } else {
                    Object obj6 = arrayList.get(i2);
                    obj6.getClass();
                    a.ba(freVar3, (ajnr) obj6);
                }
                long[] jArr = ((frc) obj).b;
                long j = jArr[i2];
                Long l = freVar3.d(ajnrVar2).d;
                long jLongValue = l != null ? l.longValue() : 0L;
                jArr[i2] = jLongValue;
                this.p = (this.p - j) + jLongValue;
                i2++;
            }
        }
        ((frc) obj).i = null;
        if (((frc) obj).f) {
            f((frc) obj);
            return;
        }
        this.q++;
        ajmz ajmzVar = this.b;
        ajmzVar.getClass();
        if (z || ((frc) obj).e) {
            ((frc) obj).b();
            ajmzVar.Z("CLEAN");
            ajmzVar.W(32);
            ajmzVar.Z(((frc) obj).a);
            ((frc) obj).a(ajmzVar);
            ajmzVar.W(10);
        } else {
            LinkedHashMap linkedHashMap = this.n;
            String str = ((frc) obj).a;
            linkedHashMap.remove(str);
            ajmzVar.Z("REMOVE");
            ajmzVar.W(32);
            ajmzVar.Z(str);
            ajmzVar.W(10);
        }
        ajmzVar.flush();
        if (this.p > this.j || e()) {
            k();
        }
    }
}
