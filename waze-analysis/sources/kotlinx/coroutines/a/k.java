package kotlinx.coroutines.a;

import androidx.collection.SieveCacheKt;
import h.g.b.au;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.ai;
import kotlinx.coroutines.bo;
import kotlinx.coroutines.dl;
import kotlinx.coroutines.e.aj;
import kotlinx.coroutines.e.ak;
import kotlinx.coroutines.e.al;
import kotlinx.coroutines.e.av;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class k implements o {

    /* renamed from: a, reason: collision with root package name */
    public final h.g.a.l f51293a;

    /* renamed from: c, reason: collision with root package name */
    private final int f51294c;

    /* renamed from: d, reason: collision with root package name */
    private final kotlinx.a.c f51295d;

    /* renamed from: e, reason: collision with root package name */
    private final kotlinx.a.c f51296e;

    /* renamed from: f, reason: collision with root package name */
    private final kotlinx.a.c f51297f;

    /* renamed from: g, reason: collision with root package name */
    private final kotlinx.a.c f51298g;

    /* renamed from: h, reason: collision with root package name */
    private final kotlinx.a.d f51299h;

    /* renamed from: i, reason: collision with root package name */
    private final kotlinx.a.d f51300i;

    /* renamed from: j, reason: collision with root package name */
    private final kotlinx.a.d f51301j;

    /* renamed from: k, reason: collision with root package name */
    private final h.g.a.q f51302k;

    /* renamed from: l, reason: collision with root package name */
    private final kotlinx.a.d f51303l;
    private final kotlinx.a.d m;

    public k(int i2, h.g.a.l lVar) {
        this.f51294c = i2;
        this.f51293a = lVar;
        if (i2 < 0) {
            throw new IllegalArgumentException("Invalid channel capacity: " + i2 + ", should be >=0");
        }
        this.f51295d = h.e.b.g(0L);
        this.f51296e = h.e.b.g(0L);
        int i3 = m.f51305a;
        this.f51297f = h.e.b.g(i2 != 0 ? i2 != Integer.MAX_VALUE ? i2 : Long.MAX_VALUE : 0L);
        this.f51298g = h.e.b.g(J());
        u uVar = new u(0L, null, this, 3);
        this.f51299h = h.e.b.h(uVar);
        this.f51300i = h.e.b.h(uVar);
        if (ac()) {
            uVar = m.f51307c;
            h.g.b.x.d(uVar, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.f51301j = h.e.b.h(uVar);
        this.f51302k = lVar != null ? new com.waze.main_screen.c.d.a(this, 19) : null;
        this.f51303l = h.e.b.h(m.s);
        this.m = h.e.b.h(null);
    }

    public static final /* synthetic */ void D(k kVar, kotlinx.coroutines.g.l lVar) {
        u uVar;
        k kVar2;
        kotlinx.coroutines.g.l lVar2;
        int i2;
        u uVar2 = (u) kVar.f51300i.b();
        while (!kVar.x()) {
            long jC = kVar.f51296e.c();
            long j2 = m.f51305a;
            long j3 = jC / j2;
            int i3 = (int) (jC % j2);
            if (uVar2.f51893a != j3) {
                u uVarP = kVar.P(j3, uVar2);
                if (uVarP != null) {
                    uVar = uVarP;
                    lVar2 = lVar;
                    i2 = i3;
                    kVar2 = kVar;
                } else {
                    continue;
                }
            } else {
                uVar = uVar2;
                kVar2 = kVar;
                lVar2 = lVar;
                i2 = i3;
            }
            Object objM = kVar2.M(uVar, i2, jC, lVar2);
            uVar2 = uVar;
            if (objM == m.m) {
                dl dlVar = lVar2 instanceof dl ? (dl) lVar2 : null;
                if (dlVar != null) {
                    ah(dlVar, uVar2, i2);
                    return;
                }
                return;
            }
            if (objM != m.o) {
                if (objM == m.n) {
                    throw new IllegalStateException("unexpected");
                }
                uVar2.p();
                lVar2.i(objM);
                return;
            }
            if (jC < kVar2.b()) {
                uVar2.p();
            }
            kVar = kVar2;
            lVar = lVar2;
        }
        lVar.i(m.t());
    }

    public static final /* synthetic */ void G(k kVar, Object obj) throws Throwable {
        if (obj == m.t()) {
            throw kVar.N();
        }
    }

    private final int H(u uVar, int i2, Object obj, long j2, Object obj2, boolean z) {
        uVar.j(i2, obj);
        if (z) {
            return I(uVar, i2, obj, j2, obj2, true);
        }
        Object objD = uVar.d(i2);
        if (objD == null) {
            if (Y(j2)) {
                if (uVar.k(i2, null, m.f51306b)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (uVar.k(i2, null, obj2)) {
                    return 2;
                }
            }
        } else if (objD instanceof dl) {
            uVar.g(i2);
            if (ad(objD, obj)) {
                uVar.i(i2, m.f51313i);
                return 0;
            }
            if (uVar.b(i2, m.f51315k) == m.f51315k) {
                return 5;
            }
            uVar.h(i2, true);
            return 5;
        }
        return I(uVar, i2, obj, j2, obj2, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0033 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0000 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int I(kotlinx.coroutines.a.u r6, int r7, java.lang.Object r8, long r9, java.lang.Object r11, boolean r12) {
        /*
            r5 = this;
        L0:
            java.lang.Object r0 = r6.d(r7)
            r1 = 4
            r2 = 0
            r3 = 1
            if (r0 != 0) goto L37
            boolean r0 = r5.Y(r9)
            r4 = 0
            if (r0 == 0) goto L1b
            if (r12 != 0) goto L29
            kotlinx.coroutines.e.ak r0 = kotlinx.coroutines.a.m.f51306b
            boolean r0 = r6.k(r7, r4, r0)
            if (r0 == 0) goto L0
            return r3
        L1b:
            if (r12 != 0) goto L29
            if (r11 != 0) goto L21
            r5 = 3
            return r5
        L21:
            boolean r0 = r6.k(r7, r4, r11)
            if (r0 == 0) goto L0
            r5 = 2
            return r5
        L29:
            kotlinx.coroutines.e.ak r0 = kotlinx.coroutines.a.m.k()
            boolean r0 = r6.k(r7, r4, r0)
            if (r0 == 0) goto L0
            r6.h(r7, r2)
            return r1
        L37:
            kotlinx.coroutines.e.ak r4 = kotlinx.coroutines.a.m.l()
            if (r0 != r4) goto L46
            kotlinx.coroutines.e.ak r1 = kotlinx.coroutines.a.m.f51306b
            boolean r0 = r6.k(r7, r0, r1)
            if (r0 == 0) goto L0
            return r3
        L46:
            kotlinx.coroutines.e.ak r9 = kotlinx.coroutines.a.m.j()
            r10 = 5
            if (r0 != r9) goto L51
            r6.g(r7)
            return r10
        L51:
            kotlinx.coroutines.e.ak r9 = kotlinx.coroutines.a.m.o()
            if (r0 != r9) goto L5b
            r6.g(r7)
            return r10
        L5b:
            kotlinx.coroutines.e.ak r9 = kotlinx.coroutines.a.m.t()
            if (r0 != r9) goto L68
            r6.g(r7)
            r5.y()
            return r1
        L68:
            int r9 = kotlinx.coroutines.ai.f51347a
            r6.g(r7)
            boolean r9 = r0 instanceof kotlinx.coroutines.a.ah
            if (r9 == 0) goto L75
            kotlinx.coroutines.a.ah r0 = (kotlinx.coroutines.a.ah) r0
            kotlinx.coroutines.dl r0 = r0.f51277a
        L75:
            boolean r5 = r5.ad(r0, r8)
            if (r5 == 0) goto L83
            kotlinx.coroutines.e.ak r5 = kotlinx.coroutines.a.m.h()
            r6.i(r7, r5)
            return r2
        L83:
            kotlinx.coroutines.e.ak r5 = kotlinx.coroutines.a.m.j()
            java.lang.Object r5 = r6.b(r7, r5)
            kotlinx.coroutines.e.ak r8 = kotlinx.coroutines.a.m.j()
            if (r5 != r8) goto L92
            return r10
        L92:
            r6.h(r7, r3)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.a.k.I(kotlinx.coroutines.a.u, int, java.lang.Object, long, java.lang.Object, boolean):int");
    }

    private final long J() {
        return this.f51297f.d();
    }

    private final Object K(Object obj, h.c.e eVar) {
        av avVarJ;
        kotlinx.coroutines.l lVar = new kotlinx.coroutines.l(h.c.a.h.d(eVar), 1);
        lVar.u();
        kotlinx.coroutines.l lVar2 = lVar;
        h.g.a.l lVar3 = this.f51293a;
        if (lVar3 == null || (avVarJ = al.j(lVar3, obj, null)) == null) {
            kotlinx.coroutines.l lVar4 = lVar2;
            Throwable thM = m();
            if (ai.c() && (lVar4 instanceof h.c.b.a.d)) {
                thM = aj.a(thM, lVar4);
            }
            lVar4.resumeWith(e.b.c.a(thM));
        } else {
            av avVarA = avVarJ;
            e.a.h.ad.c(avVarA, m());
            kotlinx.coroutines.l lVar5 = lVar2;
            if (ai.c() && (lVar5 instanceof h.c.b.a.d)) {
                avVarA = aj.a(avVarA, lVar5);
            }
            lVar5.resumeWith(e.b.c.a(avVarA));
        }
        Object objJ = lVar.j();
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (objJ == aVar) {
            h.d.b.c(eVar);
        }
        return objJ == aVar ? objJ : h.ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object L(kotlinx.coroutines.a.u r10, int r11, long r12, h.c.e r14) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.a.k.L(kotlinx.coroutines.a.u, int, long, h.c.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object M(u uVar, int i2, long j2, Object obj) {
        Object objD = uVar.d(i2);
        if (objD == null) {
            if (j2 >= (this.f51295d.d() & 1152921504606846975L)) {
                if (obj == null) {
                    return m.n;
                }
                if (uVar.k(i2, null, obj)) {
                    R();
                    return m.m;
                }
            }
        } else if (objD == m.f51306b && uVar.k(i2, objD, m.f51313i)) {
            R();
            return uVar.e(i2);
        }
        while (true) {
            Object objD2 = uVar.d(i2);
            if (objD2 == null || objD2 == m.f51309e) {
                if (j2 < (this.f51295d.d() & 1152921504606846975L)) {
                    if (uVar.k(i2, objD2, m.f51312h)) {
                        R();
                        return m.o;
                    }
                } else {
                    if (obj == null) {
                        return m.n;
                    }
                    if (uVar.k(i2, objD2, obj)) {
                        R();
                        return m.m;
                    }
                }
            } else {
                if (objD2 != m.f51306b) {
                    if (objD2 != m.f51314j && objD2 != m.f51312h) {
                        if (objD2 == m.t()) {
                            R();
                            return m.o;
                        }
                        if (objD2 != m.f51311g && uVar.k(i2, objD2, m.f51310f)) {
                            boolean z = objD2 instanceof ah;
                            if (z) {
                                objD2 = ((ah) objD2).f51277a;
                            }
                            if (ae(objD2, uVar, i2)) {
                                uVar.i(i2, m.f51313i);
                                R();
                                return uVar.e(i2);
                            }
                            uVar.i(i2, m.f51314j);
                            uVar.h(i2, false);
                            if (z) {
                                R();
                            }
                            return m.o;
                        }
                    }
                    return m.o;
                }
                if (uVar.k(i2, objD2, m.f51313i)) {
                    R();
                    return uVar.e(i2);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Throwable N() {
        Throwable thL = l();
        return thL == null ? new w() : thL;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0075, code lost:
    
        r1 = (kotlinx.coroutines.a.u) r1.o();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final kotlinx.coroutines.a.u O(long r13) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.a.k.O(long):kotlinx.coroutines.a.u");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final u P(long j2, u uVar) {
        Object objC;
        long j3;
        long jD;
        u uVar2 = uVar;
        h.g.a.p pVar = (h.g.a.p) m.d();
        loop0: while (true) {
            objC = kotlinx.coroutines.e.d.c(uVar2, j2, pVar);
            if (!kotlinx.coroutines.e.ai.a(objC)) {
                kotlinx.coroutines.e.e eVarB = kotlinx.coroutines.e.ai.b(objC);
                while (true) {
                    kotlinx.a.d dVar = this.f51300i;
                    kotlinx.coroutines.e.e eVar = (kotlinx.coroutines.e.e) dVar.b();
                    if (eVar.f51893a >= eVarB.f51893a) {
                        break loop0;
                    }
                    if (!eVarB.x()) {
                        break;
                    }
                    if (dVar.e(eVar, eVarB)) {
                        if (eVar.v()) {
                            eVar.q();
                        }
                    } else if (eVarB.v()) {
                        eVarB.q();
                    }
                }
            } else {
                break;
            }
        }
        if (kotlinx.coroutines.e.ai.a(objC)) {
            y();
            if (uVar.f51893a * m.f51305a >= b()) {
                return null;
            }
            uVar.p();
            return null;
        }
        u uVar3 = (u) kotlinx.coroutines.e.ai.b(objC);
        if (!ac() && j2 <= J() / m.f51305a) {
            kotlinx.a.d dVar2 = this.f51301j;
            u uVar4 = uVar3;
            while (true) {
                kotlinx.coroutines.e.e eVar2 = (kotlinx.coroutines.e.e) dVar2.b();
                if (eVar2.f51893a >= uVar4.f51893a || !uVar4.x()) {
                    break;
                }
                if (dVar2.e(eVar2, uVar4)) {
                    if (eVar2.v()) {
                        eVar2.q();
                    }
                } else if (uVar4.v()) {
                    uVar4.q();
                }
            }
        }
        long j4 = uVar3.f51893a;
        if (j4 <= j2) {
            int i2 = ai.f51347a;
            return uVar3;
        }
        long j5 = m.f51305a;
        kotlinx.a.c cVar = this.f51296e;
        do {
            j3 = j4 * j5;
            jD = cVar.d();
            if (jD >= j3) {
                break;
            }
        } while (!cVar.g(jD, j3));
        if (j3 >= b()) {
            return null;
        }
        uVar3.p();
        return null;
    }

    private final u Q(long j2, u uVar) {
        Object objC;
        long j3;
        long jD;
        long j4;
        u uVar2 = uVar;
        h.g.a.p pVar = (h.g.a.p) m.d();
        loop0: while (true) {
            objC = kotlinx.coroutines.e.d.c(uVar2, j2, pVar);
            if (!kotlinx.coroutines.e.ai.a(objC)) {
                kotlinx.coroutines.e.e eVarB = kotlinx.coroutines.e.ai.b(objC);
                while (true) {
                    kotlinx.a.d dVar = this.f51299h;
                    kotlinx.coroutines.e.e eVar = (kotlinx.coroutines.e.e) dVar.b();
                    if (eVar.f51893a >= eVarB.f51893a) {
                        break loop0;
                    }
                    if (!eVarB.x()) {
                        break;
                    }
                    if (dVar.e(eVar, eVarB)) {
                        if (eVar.v()) {
                            eVar.q();
                        }
                    } else if (eVarB.v()) {
                        eVarB.q();
                    }
                }
            } else {
                break;
            }
        }
        if (kotlinx.coroutines.e.ai.a(objC)) {
            y();
            if (uVar.f51893a * m.f51305a >= a()) {
                return null;
            }
            uVar.p();
            return null;
        }
        u uVar3 = (u) kotlinx.coroutines.e.ai.b(objC);
        long j5 = uVar3.f51893a;
        if (j5 <= j2) {
            int i2 = ai.f51347a;
            return uVar3;
        }
        long j6 = m.f51305a;
        kotlinx.a.c cVar = this.f51295d;
        do {
            j3 = j5 * j6;
            jD = cVar.d();
            j4 = 1152921504606846975L & jD;
            if (j4 >= j3) {
                break;
            }
        } while (!cVar.g(jD, m.c(j4, (int) (jD >> 60))));
        if (j3 >= a()) {
            return null;
        }
        uVar3.p();
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x019c, code lost:
    
        S(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x019f, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x00c8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0011 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void R() {
        /*
            Method dump skipped, instructions count: 416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.a.k.R():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void S(long j2) {
        kotlinx.a.c cVar = this.f51298g;
        if ((cVar.a(j2) & SieveCacheKt.NodeVisitedBit) != 0) {
            while ((cVar.d() & SieveCacheKt.NodeVisitedBit) != 0) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0011, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void T(long r6, kotlinx.coroutines.a.u r8) {
        /*
            r5 = this;
        L0:
            long r0 = r8.f51893a
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 >= 0) goto L11
            kotlinx.coroutines.e.e r0 = r8.n()
            kotlinx.coroutines.a.u r0 = (kotlinx.coroutines.a.u) r0
            if (r0 != 0) goto Lf
            goto L11
        Lf:
            r8 = r0
            goto L0
        L11:
            boolean r6 = r8.w()
            if (r6 == 0) goto L22
            kotlinx.coroutines.e.e r6 = r8.n()
            kotlinx.coroutines.a.u r6 = (kotlinx.coroutines.a.u) r6
            if (r6 != 0) goto L20
            goto L22
        L20:
            r8 = r6
            goto L11
        L22:
            kotlinx.a.d r6 = r5.f51301j
            r7 = r8
            kotlinx.coroutines.e.e r7 = (kotlinx.coroutines.e.e) r7
        L27:
            java.lang.Object r0 = r6.b()
            kotlinx.coroutines.e.e r0 = (kotlinx.coroutines.e.e) r0
            long r1 = r0.f51893a
            long r3 = r7.f51893a
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 < 0) goto L36
            return
        L36:
            boolean r1 = r7.x()
            if (r1 != 0) goto L3d
            goto L11
        L3d:
            boolean r1 = r6.e(r0, r7)
            if (r1 == 0) goto L4d
            boolean r5 = r0.v()
            if (r5 == 0) goto L4c
            r0.q()
        L4c:
            return
        L4d:
            boolean r0 = r7.v()
            if (r0 == 0) goto L27
            r7.q()
            goto L27
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.a.k.T(long, kotlinx.coroutines.a.u):void");
    }

    private final void U(Object obj, kotlinx.coroutines.k kVar) {
        h.g.a.l lVar = this.f51293a;
        if (lVar != null) {
            al.k(lVar, obj, kVar.getContext());
        }
        kotlinx.coroutines.k kVar2 = kVar;
        Throwable thM = m();
        if (ai.c() && (kVar2 instanceof h.c.b.a.d)) {
            thM = aj.a(thM, (h.c.b.a.d) kVar2);
        }
        kVar2.resumeWith(e.b.c.a(thM));
    }

    private final void V(dl dlVar) {
        X(dlVar, true);
    }

    private final void W(dl dlVar) {
        X(dlVar, false);
    }

    private final void X(dl dlVar, boolean z) {
        if (dlVar instanceof c) {
            throw null;
        }
        if (dlVar instanceof kotlinx.coroutines.k) {
            ((h.c.e) dlVar).resumeWith(e.b.c.a(z ? N() : m()));
            return;
        }
        if (dlVar instanceof ae) {
            ((ae) dlVar).f51276a.resumeWith(t.f(new r(l())));
            return;
        }
        if (dlVar instanceof b) {
            ((b) dlVar).c();
        } else if (dlVar instanceof kotlinx.coroutines.g.l) {
            ((kotlinx.coroutines.g.l) dlVar).j(this, m.t());
        } else {
            Objects.toString(dlVar);
            throw new IllegalStateException("Unexpected waiter: ".concat(String.valueOf(dlVar)));
        }
    }

    private final boolean Y(long j2) {
        return j2 < J() || j2 < a() + ((long) this.f51294c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x00c8, code lost:
    
        r12 = (kotlinx.coroutines.a.u) r12.o();
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0140, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean Z(long r12, boolean r14) {
        /*
            Method dump skipped, instructions count: 416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.a.k.Z(long, boolean):boolean");
    }

    private final boolean aa(long j2) {
        return Z(j2, true);
    }

    private final boolean ab(long j2) {
        return Z(j2, false);
    }

    private final boolean ac() {
        long J = J();
        return J == 0 || J == Long.MAX_VALUE;
    }

    private final boolean ad(Object obj, Object obj2) {
        if (obj instanceof kotlinx.coroutines.g.l) {
            return ((kotlinx.coroutines.g.l) obj).j(this, obj2);
        }
        if (obj instanceof ae) {
            h.g.b.x.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveCatching<E of kotlinx.coroutines.channels.BufferedChannel>");
            return m.w(((ae) obj).f51276a, t.f(obj2), (h.g.a.q) (this.f51293a != null ? ag() : null));
        }
        if (obj instanceof b) {
            h.g.b.x.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
            return ((b) obj).d(obj2);
        }
        if (obj instanceof kotlinx.coroutines.k) {
            h.g.b.x.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
            return m.w((kotlinx.coroutines.k) obj, obj2, (h.g.a.q) (this.f51293a != null ? af() : null));
        }
        Objects.toString(obj);
        throw new IllegalStateException("Unexpected receiver type: ".concat(String.valueOf(obj)));
    }

    private final boolean ae(Object obj, u uVar, int i2) {
        if (obj instanceof kotlinx.coroutines.k) {
            h.g.b.x.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            return m.w((kotlinx.coroutines.k) obj, h.ab.f48028a, null);
        }
        if (obj instanceof kotlinx.coroutines.g.l) {
            h.g.b.x.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
            kotlinx.coroutines.g.o oVarF = ((kotlinx.coroutines.g.k) obj).f(this, h.ab.f48028a);
            if (oVarF == kotlinx.coroutines.g.o.f52012b) {
                uVar.g(i2);
            }
            return oVarF == kotlinx.coroutines.g.o.f52011a;
        }
        if (obj instanceof c) {
            throw null;
        }
        Objects.toString(obj);
        throw new IllegalStateException("Unexpected waiter: ".concat(String.valueOf(obj)));
    }

    private final h.l.f af() {
        return new d(this, 1, null);
    }

    private final h.l.f ag() {
        return new d(this, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ah(dl dlVar, u uVar, int i2) {
        dlVar.z(uVar, i2);
    }

    private static final void ai(dl dlVar, u uVar, int i2) {
        dlVar.z(uVar, i2 + m.f51305a);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ java.lang.Object f(kotlinx.coroutines.a.k r13, h.c.e r14) {
        /*
            boolean r0 = r14 instanceof kotlinx.coroutines.a.i
            if (r0 == 0) goto L13
            r0 = r14
            kotlinx.coroutines.a.i r0 = (kotlinx.coroutines.a.i) r0
            int r1 = r0.f51288c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f51288c = r1
            goto L18
        L13:
            kotlinx.coroutines.a.i r0 = new kotlinx.coroutines.a.i
            r0.<init>(r13, r14)
        L18:
            r6 = r0
            java.lang.Object r14 = r6.f51286a
            h.c.a.a r0 = h.c.a.a.f48038a
            int r1 = r6.f51288c
            r2 = 1
            if (r1 == 0) goto L36
            if (r1 != r2) goto L2e
            e.b.c.b(r14)
            kotlinx.coroutines.a.t r14 = (kotlinx.coroutines.a.t) r14
            java.lang.Object r13 = r14.b()
            return r13
        L2e:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L36:
            e.b.c.b(r14)
            kotlinx.a.d r14 = r13.f51300i
            java.lang.Object r14 = r14.b()
            kotlinx.coroutines.a.u r14 = (kotlinx.coroutines.a.u) r14
        L41:
            boolean r1 = r13.x()
            if (r1 == 0) goto L51
            java.lang.Throwable r13 = r13.l()
            kotlinx.coroutines.a.r r14 = new kotlinx.coroutines.a.r
            r14.<init>(r13)
            return r14
        L51:
            kotlinx.a.c r1 = r13.f51296e
            long r4 = r1.c()
            int r1 = kotlinx.coroutines.a.m.f51305a
            long r7 = (long) r1
            long r9 = r4 / r7
            long r7 = r4 % r7
            int r3 = (int) r7
            long r7 = r14.f51893a
            int r1 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r1 == 0) goto L6d
            kotlinx.coroutines.a.u r1 = r13.P(r9, r14)
            if (r1 == 0) goto L41
            r8 = r1
            goto L6e
        L6d:
            r8 = r14
        L6e:
            r12 = 0
            r7 = r13
            r9 = r3
            r10 = r4
            java.lang.Object r13 = r7.M(r8, r9, r10, r12)
            r1 = r7
            kotlinx.coroutines.e.ak r14 = kotlinx.coroutines.a.m.r()
            if (r13 == r14) goto La6
            kotlinx.coroutines.e.ak r14 = kotlinx.coroutines.a.m.i()
            if (r13 != r14) goto L91
            long r13 = r1.b()
            int r13 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r13 >= 0) goto L8e
            r8.p()
        L8e:
            r13 = r1
            r14 = r8
            goto L41
        L91:
            kotlinx.coroutines.e.ak r14 = kotlinx.coroutines.a.m.s()
            if (r13 != r14) goto La2
            r6.f51288c = r2
            r2 = r8
            java.lang.Object r13 = r1.L(r2, r3, r4, r6)
            if (r13 != r0) goto La1
            return r0
        La1:
            return r13
        La2:
            r8.p()
            return r13
        La6:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "unexpected"
            r13.<init>(r14)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.a.k.f(kotlinx.coroutines.a.k, h.c.e):java.lang.Object");
    }

    @Override // kotlinx.coroutines.a.af
    public final kotlinx.coroutines.g.e A() {
        e eVar = e.f51282a;
        au.h(eVar, 3);
        f fVar = f.f51283a;
        au.h(fVar, 3);
        return new kotlinx.coroutines.g.e(this, eVar, fVar, this.f51302k);
    }

    @Override // kotlinx.coroutines.a.af
    public final kotlinx.coroutines.g.e B() {
        g gVar = g.f51284a;
        au.h(gVar, 3);
        h hVar = h.f51285a;
        au.h(hVar, 3);
        return new kotlinx.coroutines.g.e(this, gVar, hVar, this.f51302k);
    }

    public final long a() {
        return this.f51296e.d();
    }

    public final long b() {
        return this.f51295d.d() & 1152921504606846975L;
    }

    @Override // kotlinx.coroutines.a.af
    public final Object d(h.c.e eVar) throws Throwable {
        h.l.f fVarAf;
        k kVar = this;
        kotlinx.a.d dVar = kVar.f51300i;
        u uVar = (u) dVar.b();
        while (!kVar.x()) {
            kotlinx.a.c cVar = kVar.f51296e;
            long jC = cVar.c();
            long j2 = m.f51305a;
            long j3 = jC / j2;
            int i2 = (int) (jC % j2);
            if (uVar.f51893a != j3) {
                u uVarP = kVar.P(j3, uVar);
                if (uVarP != null) {
                    uVar = uVarP;
                } else {
                    continue;
                }
            }
            Object objM = kVar.M(uVar, i2, jC, null);
            if (objM == m.m) {
                throw new IllegalStateException("unexpected");
            }
            if (objM != m.o) {
                if (objM != m.n) {
                    uVar.p();
                    return objM;
                }
                kotlinx.coroutines.l lVarK = bo.k(h.c.a.h.d(eVar));
                try {
                    kotlinx.coroutines.l lVar = lVarK;
                    Object objM2 = M(uVar, i2, jC, lVar);
                    if (objM2 == m.m) {
                        ah(lVar, uVar, i2);
                    } else {
                        if (objM2 == m.o) {
                            if (jC < b()) {
                                uVar.p();
                            }
                            u uVar2 = (u) dVar.b();
                            while (true) {
                                if (x()) {
                                    lVarK.resumeWith(e.b.c.a(N()));
                                    break;
                                }
                                long jC2 = cVar.c();
                                long j4 = jC2 / j2;
                                int i3 = (int) (jC2 % j2);
                                if (uVar2.f51893a != j4) {
                                    u uVarP2 = P(j4, uVar2);
                                    if (uVarP2 != null) {
                                        uVar2 = uVarP2;
                                    } else {
                                        continue;
                                    }
                                }
                                objM2 = M(uVar2, i3, jC2, lVar);
                                if (objM2 == m.m) {
                                    ah(lVar, uVar2, i3);
                                    break;
                                }
                                if (objM2 == m.o) {
                                    if (jC2 < b()) {
                                        uVar2.p();
                                    }
                                } else {
                                    if (objM2 == m.n) {
                                        throw new IllegalStateException("unexpected");
                                    }
                                    uVar2.p();
                                    fVarAf = this.f51293a != null ? af() : null;
                                }
                            }
                        } else {
                            uVar.p();
                            fVarAf = this.f51293a != null ? af() : null;
                        }
                        lVarK.d(objM2, (h.g.a.q) fVarAf);
                    }
                    Object objJ = lVarK.j();
                    if (objJ == h.c.a.a.f48038a) {
                        h.d.b.c(eVar);
                    }
                    return objJ;
                } catch (Throwable th) {
                    lVarK.x();
                    throw th;
                }
            }
            if (jC < b()) {
                uVar.p();
            }
            kVar = this;
        }
        throw aj.b(kVar.N());
    }

    @Override // kotlinx.coroutines.a.af
    public final Object e(h.c.e eVar) {
        return f(this, eVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0147 A[RETURN] */
    @Override // kotlinx.coroutines.a.ag
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object g(java.lang.Object r24, h.c.e r25) {
        /*
            Method dump skipped, instructions count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.a.k.g(java.lang.Object, h.c.e):java.lang.Object");
    }

    @Override // kotlinx.coroutines.a.af
    public final Object h() {
        u uVar;
        kotlinx.a.c cVar = this.f51296e;
        long jD = cVar.d();
        long jD2 = this.f51295d.d();
        if (aa(jD2)) {
            return new r(l());
        }
        if (jD >= (jD2 & 1152921504606846975L)) {
            return t.f51322a;
        }
        kotlinx.a.d dVar = this.f51300i;
        ak akVar = m.f51315k;
        u uVar2 = (u) dVar.b();
        while (!this.x()) {
            long jC = cVar.c();
            long j2 = m.f51305a;
            long j3 = jC / j2;
            int i2 = (int) (jC % j2);
            if (uVar2.f51893a != j3) {
                u uVarP = this.P(j3, uVar2);
                if (uVarP != null) {
                    uVar = uVarP;
                } else {
                    continue;
                }
            } else {
                uVar = uVar2;
            }
            k kVar = this;
            Object objM = kVar.M(uVar, i2, jC, akVar);
            uVar2 = uVar;
            if (objM == m.m) {
                kVar.u(jC);
                uVar2.u();
                return t.f51322a;
            }
            if (objM != m.o) {
                if (objM == m.n) {
                    throw new IllegalStateException("unexpected");
                }
                uVar2.p();
                return objM;
            }
            if (jC < kVar.b()) {
                uVar2.p();
            }
            this = kVar;
        }
        return new r(this.l());
    }

    @Override // kotlinx.coroutines.a.ag
    public Object i(Object obj) {
        u uVar;
        kotlinx.a.c cVar = this.f51295d;
        long jD = cVar.d();
        if (!ab(jD) && !Y(jD & 1152921504606846975L)) {
            return t.f51322a;
        }
        kotlinx.a.d dVar = this.f51299h;
        ak akVar = m.f51314j;
        u uVar2 = (u) dVar.b();
        while (true) {
            long jC = cVar.c();
            long j2 = jC & 1152921504606846975L;
            boolean zAb = this.ab(jC);
            long j3 = m.f51305a;
            long j4 = j2 / j3;
            int i2 = (int) (j2 % j3);
            if (uVar2.f51893a != j4) {
                u uVarQ = this.Q(j4, uVar2);
                if (uVarQ != null) {
                    uVar = uVarQ;
                } else if (zAb) {
                    return new r(this.m());
                }
            } else {
                uVar = uVar2;
            }
            k kVar = this;
            Object obj2 = obj;
            int iH = kVar.H(uVar, i2, obj2, j2, akVar, zAb);
            uVar2 = uVar;
            if (iH == 0) {
                uVar2.p();
                return h.ab.f48028a;
            }
            if (iH == 1) {
                return h.ab.f48028a;
            }
            if (iH == 2) {
                if (zAb) {
                    uVar2.u();
                    return new r(kVar.m());
                }
                uVar2.u();
                return t.f51322a;
            }
            if (iH == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (iH == 4) {
                if (j2 < kVar.a()) {
                    uVar2.p();
                }
                return new r(kVar.m());
            }
            uVar2.p();
            this = kVar;
            obj = obj2;
        }
    }

    protected final Object j(Object obj) {
        u uVar;
        k kVar;
        Object obj2;
        kotlinx.a.d dVar = this.f51299h;
        ak akVar = m.f51306b;
        u uVar2 = (u) dVar.b();
        while (true) {
            long jC = this.f51295d.c();
            long j2 = jC & 1152921504606846975L;
            boolean zAb = this.ab(jC);
            long j3 = m.f51305a;
            long j4 = j2 / j3;
            int i2 = (int) (j2 % j3);
            if (uVar2.f51893a != j4) {
                u uVarQ = this.Q(j4, uVar2);
                if (uVarQ != null) {
                    uVar = uVarQ;
                    obj2 = obj;
                    kVar = this;
                } else if (zAb) {
                    kVar = this;
                    break;
                }
            } else {
                uVar = uVar2;
                kVar = this;
                obj2 = obj;
            }
            int iH = kVar.H(uVar, i2, obj2, j2, akVar, zAb);
            uVar2 = uVar;
            if (iH == 0) {
                uVar2.p();
                return h.ab.f48028a;
            }
            if (iH == 1) {
                return h.ab.f48028a;
            }
            if (iH == 2) {
                if (zAb) {
                    uVar2.u();
                    return new r(kVar.m());
                }
                kVar.r((uVar2.f51893a * j3) + i2);
                return h.ab.f48028a;
            }
            if (iH == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (iH != 4) {
                uVar2.p();
                this = kVar;
                obj = obj2;
            } else if (j2 < kVar.a()) {
                uVar2.p();
            }
        }
        return new r(kVar.m());
    }

    protected final Throwable l() {
        return (Throwable) this.f51303l.b();
    }

    protected final Throwable m() {
        Throwable thL = l();
        return thL == null ? new x("Channel was closed") : thL;
    }

    @Override // kotlinx.coroutines.a.af
    public final q p() {
        return new b(this);
    }

    protected final void r(long j2) {
        u uVar;
        av avVarJ;
        int i2 = ai.f51347a;
        u uVar2 = (u) this.f51300i.b();
        while (true) {
            kotlinx.a.c cVar = this.f51296e;
            int i3 = this.f51294c;
            long jD = cVar.d();
            if (j2 < Math.max(i3 + jD, this.J())) {
                return;
            }
            if (cVar.g(jD, 1 + jD)) {
                long j3 = m.f51305a;
                long j4 = jD / j3;
                int i4 = (int) (jD % j3);
                if (uVar2.f51893a != j4) {
                    u uVarP = this.P(j4, uVar2);
                    if (uVarP != null) {
                        uVar = uVarP;
                    }
                } else {
                    uVar = uVar2;
                }
                k kVar = this;
                Object objM = kVar.M(uVar, i4, jD, null);
                if (objM != m.o) {
                    uVar.p();
                    h.g.a.l lVar = kVar.f51293a;
                    if (lVar != null && (avVarJ = al.j(lVar, objM, null)) != null) {
                        throw avVarJ;
                    }
                } else if (jD < kVar.b()) {
                    uVar.p();
                }
                this = kVar;
                uVar2 = uVar;
            }
            this = this;
        }
    }

    @Override // kotlinx.coroutines.a.af
    public final void s(CancellationException cancellationException) {
        CancellationException cancellationException2 = cancellationException;
        if (cancellationException2 == null) {
            cancellationException2 = new CancellationException("Channel was cancelled");
        }
        w(cancellationException2, true);
    }

    @Override // kotlinx.coroutines.a.ag
    public final void t(h.g.a.l lVar) {
        kotlinx.a.d dVar = this.m;
        if (dVar.e(null, lVar)) {
            return;
        }
        do {
            Object objB = dVar.b();
            if (objB != m.q) {
                if (objB == m.r) {
                    throw new IllegalStateException("Another handler was already registered and successfully invoked");
                }
                Objects.toString(objB);
                throw new IllegalStateException("Another handler is already registered: ".concat(String.valueOf(objB)));
            }
        } while (!dVar.e(m.q, m.r));
        lVar.invoke(l());
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x01cd, code lost:
    
        r3 = (kotlinx.coroutines.a.u) r3.n();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 512
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.a.k.toString():java.lang.String");
    }

    public final void u(long j2) {
        long jD;
        long jD2;
        if (ac()) {
            return;
        }
        while (J() <= j2) {
        }
        int i2 = m.f51308d;
        for (int i3 = 0; i3 < i2; i3++) {
            long J = J();
            if (J == (4611686018427387903L & this.f51298g.d()) && J == J()) {
                return;
            }
        }
        kotlinx.a.c cVar = this.f51298g;
        do {
            jD = cVar.d();
        } while (!cVar.g(jD, m.b(jD & 4611686018427387903L, true)));
        while (true) {
            long J2 = J();
            long jD3 = cVar.d();
            long j3 = jD3 & 4611686018427387903L;
            long j4 = SieveCacheKt.NodeVisitedBit & jD3;
            if (J2 == j3 && J2 == J()) {
                break;
            } else if (j4 == 0) {
                cVar.g(jD3, m.b(j3, true));
            }
        }
        do {
            jD2 = cVar.d();
        } while (!cVar.g(jD2, m.b(jD2 & 4611686018427387903L, false)));
    }

    @Override // kotlinx.coroutines.a.ag
    public final boolean v(Throwable th) {
        return w(th, false);
    }

    protected final boolean w(Throwable th, boolean z) {
        long jD;
        long jC;
        Object objB;
        long jD2;
        long jD3;
        if (z) {
            kotlinx.a.c cVar = this.f51295d;
            do {
                jD3 = cVar.d();
                if (((int) (jD3 >> 60)) != 0) {
                    break;
                }
            } while (!cVar.g(jD3, m.c(jD3 & 1152921504606846975L, 1)));
        }
        boolean zE = this.f51303l.e(m.s, th);
        kotlinx.a.c cVar2 = this.f51295d;
        if (z) {
            do {
                jD2 = cVar2.d();
            } while (!cVar2.g(jD2, m.c(jD2 & 1152921504606846975L, 3)));
        } else {
            do {
                jD = cVar2.d();
                int i2 = (int) (jD >> 60);
                if (i2 == 0) {
                    jC = m.c(jD & 1152921504606846975L, 2);
                } else {
                    if (i2 != 1) {
                        break;
                    }
                    jC = m.c(jD & 1152921504606846975L, 3);
                }
            } while (!cVar2.g(jD, jC));
        }
        y();
        if (zE) {
            kotlinx.a.d dVar = this.m;
            do {
                objB = dVar.b();
            } while (!dVar.e(objB, objB == null ? m.q : m.r));
            if (objB != null) {
                au.h(objB, 1);
                ((h.g.a.l) objB).invoke(l());
                return true;
            }
        }
        return zE;
    }

    public final boolean x() {
        return aa(this.f51295d.d());
    }

    @Override // kotlinx.coroutines.a.ag
    public final boolean y() {
        return ab(this.f51295d.d());
    }

    protected boolean z() {
        return false;
    }
}
