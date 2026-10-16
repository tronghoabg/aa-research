package N;

import O.C0783a;
import android.os.Trace;
import ef.C2527k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.AbstractC3340k;
import q.s1;
import x.C4420m;
import x.C4421n;
import x.C4422o;
import x.C4424q;
import x.C4425r;

/* renamed from: N.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0744s implements InterfaceC0742p {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0743q f7904a;

    /* renamed from: b, reason: collision with root package name */
    public final E9.c f7905b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReference f7906c = new AtomicReference(null);

    /* renamed from: d, reason: collision with root package name */
    public final Object f7907d = new Object();

    /* renamed from: e, reason: collision with root package name */
    public final C4424q f7908e;

    /* renamed from: f, reason: collision with root package name */
    public final w0 f7909f;

    /* renamed from: g, reason: collision with root package name */
    public final Y9.c f7910g;

    /* renamed from: h, reason: collision with root package name */
    public final C4425r f7911h;

    /* renamed from: i, reason: collision with root package name */
    public final C4425r f7912i;

    /* renamed from: j, reason: collision with root package name */
    public final Y9.c f7913j;
    public final C0783a k;

    /* renamed from: l, reason: collision with root package name */
    public final C0783a f7914l;

    /* renamed from: m, reason: collision with root package name */
    public final Y9.c f7915m;

    /* renamed from: n, reason: collision with root package name */
    public Y9.c f7916n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f7917o;

    /* renamed from: p, reason: collision with root package name */
    public final P f7918p;

    /* renamed from: q, reason: collision with root package name */
    public final C0740o f7919q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f7920r;

    public C0744s(AbstractC0743q abstractC0743q, E9.c cVar) {
        this.f7904a = abstractC0743q;
        this.f7905b = cVar;
        C4424q c4424q = new C4424q(new C4425r());
        this.f7908e = c4424q;
        w0 w0Var = new w0();
        if (abstractC0743q.c()) {
            w0Var.f7953j = new C4420m();
        }
        if (abstractC0743q.e()) {
            w0Var.c();
        }
        this.f7909f = w0Var;
        this.f7910g = new Y9.c(20);
        this.f7911h = new C4425r();
        this.f7912i = new C4425r();
        this.f7913j = new Y9.c(20);
        C0783a c0783a = new C0783a();
        this.k = c0783a;
        C0783a c0783a2 = new C0783a();
        this.f7914l = c0783a2;
        this.f7915m = new Y9.c(20);
        this.f7916n = new Y9.c(20);
        this.f7918p = new P(6);
        C0740o c0740o = new C0740o(cVar, abstractC0743q, w0Var, c4424q, c0783a, c0783a2, this);
        abstractC0743q.k(c0740o);
        this.f7919q = c0740o;
        boolean z2 = abstractC0743q instanceof p0;
        V.d dVar = AbstractC0728i.f7783a;
    }

    @Override // N.InterfaceC0742p
    public final boolean a() {
        return this.f7920r;
    }

    @Override // N.InterfaceC0742p
    public final void b(V.d dVar) {
        if (this.f7920r) {
            C0718d.P("The composition is disposed");
            throw null;
        }
        this.f7904a.a(this, dVar);
    }

    public final void c() {
        this.f7906c.set(null);
        this.k.f8708b.X();
        this.f7914l.f8708b.X();
        C4424q c4424q = this.f7908e;
        if (c4424q.f47551a.g()) {
            return;
        }
        new ArrayList();
        new ArrayList();
        new ArrayList();
        new ArrayList();
        if (c4424q.f47551a.g()) {
            return;
        }
        Trace.beginSection("Compose:abandons");
        try {
            Iterator it = c4424q.iterator();
            while (true) {
                Af.i iVar = (Af.i) it;
                if (!iVar.hasNext()) {
                    return;
                }
                q0 q0Var = (q0) iVar.next();
                iVar.remove();
                q0Var.j();
            }
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(java.lang.Object r21, boolean r22) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            Y9.c r2 = r0.f7910g
            java.lang.Object r2 = r2.f16739b
            x.o r2 = (x.C4422o) r2
            java.lang.Object r2 = r2.e(r1)
            if (r2 == 0) goto L9f
            boolean r3 = r2 instanceof x.C4425r
            r4 = 1
            x.r r5 = r0.f7911h
            x.r r6 = r0.f7912i
            Y9.c r7 = r0.f7915m
            if (r3 == 0) goto L84
            x.r r2 = (x.C4425r) r2
            java.lang.Object[] r3 = r2.f47554b
            long[] r2 = r2.f47553a
            int r8 = r2.length
            int r8 = r8 + (-2)
            if (r8 < 0) goto L9f
            r10 = 0
        L27:
            r11 = r2[r10]
            long r13 = ~r11
            r15 = 7
            long r13 = r13 << r15
            long r13 = r13 & r11
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r13 = r13 & r15
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 == 0) goto L7f
            int r13 = r10 - r8
            int r13 = ~r13
            int r13 = r13 >>> 31
            r14 = 8
            int r13 = 8 - r13
            r15 = 0
        L41:
            if (r15 >= r13) goto L7c
            r16 = 255(0xff, double:1.26E-321)
            long r16 = r11 & r16
            r18 = 128(0x80, double:6.3E-322)
            int r16 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r16 >= 0) goto L73
            int r16 = r10 << 3
            int r16 = r16 + r15
            r16 = r3[r16]
            r9 = r16
            N.i0 r9 = (N.C0729i0) r9
            boolean r16 = r7.n(r1, r9)
            if (r16 != 0) goto L73
            r16 = r14
            int r14 = r9.c(r1)
            if (r14 == r4) goto L75
            x.o r14 = r9.f7791g
            if (r14 == 0) goto L6f
            if (r22 != 0) goto L6f
            r6.a(r9)
            goto L75
        L6f:
            r5.a(r9)
            goto L75
        L73:
            r16 = r14
        L75:
            long r11 = r11 >> r16
            int r15 = r15 + 1
            r14 = r16
            goto L41
        L7c:
            r9 = r14
            if (r13 != r9) goto L9f
        L7f:
            if (r10 == r8) goto L9f
            int r10 = r10 + 1
            goto L27
        L84:
            N.i0 r2 = (N.C0729i0) r2
            boolean r3 = r7.n(r1, r2)
            if (r3 != 0) goto L9f
            int r1 = r2.c(r1)
            if (r1 == r4) goto L9f
            x.o r1 = r2.f7791g
            if (r1 == 0) goto L9c
            if (r22 != 0) goto L9c
            r6.a(r2)
            return
        L9c:
            r5.a(r2)
        L9f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: N.C0744s.d(java.lang.Object, boolean):void");
    }

    @Override // N.InterfaceC0742p
    public final void dispose() {
        synchronized (this.f7907d) {
            try {
                C0740o c0740o = this.f7919q;
                if (c0740o.f7834E) {
                    C0718d.P("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.");
                    throw null;
                }
                if (!this.f7920r) {
                    this.f7920r = true;
                    V.d dVar = AbstractC0728i.f7784b;
                    C0783a c0783a = c0740o.f7840K;
                    if (c0783a != null) {
                        g(c0783a);
                    }
                    boolean z2 = this.f7909f.f7945b > 0;
                    if (z2 || !this.f7908e.f47551a.g()) {
                        s1 s1Var = new s1(this.f7908e);
                        if (z2) {
                            y0 y0VarE = this.f7909f.e();
                            try {
                                C0718d.J(y0VarE, s1Var);
                                y0VarE.e(true);
                                this.f7905b.c();
                                this.f7905b.p();
                                s1Var.f();
                            } catch (Throwable th) {
                                y0VarE.e(false);
                                throw th;
                            }
                        }
                        s1Var.e();
                    }
                    this.f7919q.l();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f7904a.o(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x018b A[EDGE_INSN: B:73:0x018b->B:224:0x0126 BREAK  A[LOOP:13: B:63:0x0159->B:74:0x018d]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(java.util.Set r35, boolean r36) {
        /*
            Method dump skipped, instructions count: 957
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: N.C0744s.e(java.util.Set, boolean):void");
    }

    public final void f() {
        synchronized (this.f7907d) {
            try {
                g(this.k);
                m();
            } catch (Throwable th) {
                try {
                    try {
                        if (!this.f7908e.f47551a.g()) {
                            C4424q c4424q = this.f7908e;
                            new ArrayList();
                            new ArrayList();
                            new ArrayList();
                            new ArrayList();
                            if (!c4424q.f47551a.g()) {
                                Trace.beginSection("Compose:abandons");
                                try {
                                    Iterator it = c4424q.iterator();
                                    while (((Af.l) ((Af.i) it).f1308c).hasNext()) {
                                        q0 q0Var = (q0) ((Af.l) ((Af.i) it).f1308c).next();
                                        ((Af.i) it).remove();
                                        q0Var.j();
                                    }
                                    Trace.endSection();
                                } catch (Throwable th2) {
                                    Trace.endSection();
                                    throw th2;
                                }
                            }
                        }
                        throw th;
                    } catch (Exception e7) {
                        c();
                        throw e7;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x011a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(O.C0783a r33) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: N.C0744s.g(O.a):void");
    }

    public final void h() {
        synchronized (this.f7907d) {
            try {
                if (this.f7914l.f8708b.a0()) {
                    g(this.f7914l);
                }
            } catch (Throwable th) {
                try {
                    try {
                        if (!this.f7908e.f47551a.g()) {
                            C4424q c4424q = this.f7908e;
                            new ArrayList();
                            new ArrayList();
                            new ArrayList();
                            new ArrayList();
                            if (!c4424q.f47551a.g()) {
                                Trace.beginSection("Compose:abandons");
                                try {
                                    Iterator it = c4424q.iterator();
                                    while (((Af.l) ((Af.i) it).f1308c).hasNext()) {
                                        q0 q0Var = (q0) ((Af.l) ((Af.i) it).f1308c).next();
                                        ((Af.i) it).remove();
                                        q0Var.j();
                                    }
                                    Trace.endSection();
                                } catch (Throwable th2) {
                                    Trace.endSection();
                                    throw th2;
                                }
                            }
                        }
                        throw th;
                    } catch (Exception e7) {
                        c();
                        throw e7;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    public final void i() {
        synchronized (this.f7907d) {
            try {
                this.f7919q.f7864u = null;
                if (!this.f7908e.f47551a.g()) {
                    C4424q c4424q = this.f7908e;
                    new ArrayList();
                    new ArrayList();
                    new ArrayList();
                    new ArrayList();
                    if (!c4424q.f47551a.g()) {
                        Trace.beginSection("Compose:abandons");
                        try {
                            Iterator it = c4424q.iterator();
                            while (true) {
                                Af.i iVar = (Af.i) it;
                                if (!iVar.hasNext()) {
                                    break;
                                }
                                q0 q0Var = (q0) iVar.next();
                                iVar.remove();
                                q0Var.j();
                            }
                            Trace.endSection();
                        } finally {
                        }
                    }
                }
            } catch (Throwable th) {
                try {
                    try {
                        if (!this.f7908e.f47551a.g()) {
                            C4424q c4424q2 = this.f7908e;
                            new ArrayList();
                            new ArrayList();
                            new ArrayList();
                            new ArrayList();
                            if (!c4424q2.f47551a.g()) {
                                Trace.beginSection("Compose:abandons");
                                try {
                                    Iterator it2 = c4424q2.iterator();
                                    while (true) {
                                        Af.i iVar2 = (Af.i) it2;
                                        if (!iVar2.hasNext()) {
                                            break;
                                        }
                                        q0 q0Var2 = (q0) iVar2.next();
                                        iVar2.remove();
                                        q0Var2.j();
                                    }
                                    Trace.endSection();
                                } finally {
                                }
                            }
                        }
                        throw th;
                    } catch (Exception e7) {
                        c();
                        throw e7;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j() {
        /*
            Method dump skipped, instructions count: 397
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: N.C0744s.j():void");
    }

    public final void k(V.d dVar) throws Exception {
        try {
            synchronized (this.f7907d) {
                l();
                Y9.c cVar = this.f7916n;
                this.f7916n = new Y9.c(20);
                try {
                    this.f7918p.getClass();
                    C0740o c0740o = this.f7919q;
                    if (!c0740o.f7849e.f8708b.Z()) {
                        C0718d.v("Expected applyChanges() to have been called");
                        throw null;
                    }
                    c0740o.m(cVar, dVar);
                } catch (Exception e7) {
                    this.f7916n = cVar;
                    throw e7;
                }
            }
        } catch (Throwable th) {
            try {
                if (!this.f7908e.f47551a.g()) {
                    C4424q c4424q = this.f7908e;
                    new ArrayList();
                    new ArrayList();
                    new ArrayList();
                    new ArrayList();
                    if (!c4424q.f47551a.g()) {
                        Trace.beginSection("Compose:abandons");
                        try {
                            Iterator it = c4424q.iterator();
                            while (((Af.l) ((Af.i) it).f1308c).hasNext()) {
                                q0 q0Var = (q0) ((Af.l) ((Af.i) it).f1308c).next();
                                ((Af.i) it).remove();
                                q0Var.j();
                            }
                            Trace.endSection();
                        } catch (Throwable th2) {
                            Trace.endSection();
                            throw th2;
                        }
                    }
                }
                throw th;
            } catch (Exception e10) {
                c();
                throw e10;
            }
        }
    }

    public final void l() {
        AtomicReference atomicReference = this.f7906c;
        Object obj = C0718d.f7759g;
        Object andSet = atomicReference.getAndSet(obj);
        if (andSet != null) {
            if (andSet.equals(obj)) {
                C0718d.w("pending composition has not been applied");
                throw null;
            }
            if (andSet instanceof Set) {
                e((Set) andSet, true);
                return;
            }
            if (!(andSet instanceof Object[])) {
                C0718d.w("corrupt pendingModifications drain: " + atomicReference);
                throw null;
            }
            for (Set set : (Set[]) andSet) {
                e(set, true);
            }
        }
    }

    public final void m() {
        AtomicReference atomicReference = this.f7906c;
        Object andSet = atomicReference.getAndSet(null);
        if (AbstractC3340k.a(andSet, C0718d.f7759g)) {
            return;
        }
        if (andSet instanceof Set) {
            e((Set) andSet, false);
            return;
        }
        if (andSet instanceof Object[]) {
            for (Set set : (Set[]) andSet) {
                e(set, false);
            }
            return;
        }
        if (andSet == null) {
            C0718d.w("calling recordModificationsOf and applyChanges concurrently is not supported");
            throw null;
        }
        C0718d.w("corrupt pendingModifications drain: " + atomicReference);
        throw null;
    }

    public final void n(ArrayList arrayList) throws Exception {
        if (arrayList.size() > 0) {
            ((T) ((C2527k) arrayList.get(0)).f34671a).getClass();
            throw null;
        }
        C0718d.K(true);
        try {
            C0740o c0740o = this.f7919q;
            c0740o.getClass();
            try {
                c0740o.y(arrayList);
                c0740o.h();
            } catch (Throwable th) {
                c0740o.a();
                throw th;
            }
        } catch (Throwable th2) {
            C4424q c4424q = this.f7908e;
            try {
                if (!c4424q.f47551a.g()) {
                    new ArrayList();
                    new ArrayList();
                    new ArrayList();
                    new ArrayList();
                    if (!c4424q.f47551a.g()) {
                        Trace.beginSection("Compose:abandons");
                        try {
                            Iterator it = c4424q.iterator();
                            while (true) {
                                Af.i iVar = (Af.i) it;
                                if (!iVar.hasNext()) {
                                    break;
                                }
                                q0 q0Var = (q0) iVar.next();
                                iVar.remove();
                                q0Var.j();
                            }
                            Trace.endSection();
                        } catch (Throwable th3) {
                            Trace.endSection();
                            throw th3;
                        }
                    }
                }
                throw th2;
            } catch (Exception e7) {
                c();
                throw e7;
            }
        }
    }

    public final int o(C0729i0 c0729i0, Object obj) {
        int iL;
        int i5 = c0729i0.f7785a;
        if ((i5 & 2) != 0) {
            c0729i0.f7785a = i5 | 4;
        }
        C0716c c0716c = c0729i0.f7787c;
        if (c0716c != null && c0716c.a()) {
            w0 w0Var = this.f7909f;
            w0Var.getClass();
            if (!(c0716c.a() && (iL = C0718d.L(w0Var.f7951h, c0716c.f7752a, w0Var.f7945b)) >= 0 && AbstractC3340k.a(w0Var.f7951h.get(iL), c0716c))) {
                synchronized (this.f7907d) {
                }
                return 1;
            }
            if (c0729i0.f7788d != null) {
                return q(c0729i0, c0716c, obj);
            }
        }
        return 1;
    }

    public final void p() {
        C0744s c0744s;
        synchronized (this.f7907d) {
            try {
                for (Object obj : this.f7909f.f7946c) {
                    C0729i0 c0729i0 = obj instanceof C0729i0 ? (C0729i0) obj : null;
                    if (c0729i0 != null && (c0744s = c0729i0.f7786b) != null) {
                        c0744s.o(c0729i0, null);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d5 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int q(N.C0729i0 r21, N.C0716c r22, java.lang.Object r23) {
        /*
            Method dump skipped, instructions count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: N.C0744s.q(N.i0, N.c, java.lang.Object):int");
    }

    public final void r(Object obj) {
        Object objE = ((C4422o) this.f7910g.f16739b).e(obj);
        if (objE == null) {
            return;
        }
        boolean z2 = objE instanceof C4425r;
        Y9.c cVar = this.f7915m;
        if (!z2) {
            C0729i0 c0729i0 = (C0729i0) objE;
            if (c0729i0.c(obj) == 4) {
                cVar.b(obj, c0729i0);
                return;
            }
            return;
        }
        C4425r c4425r = (C4425r) objE;
        Object[] objArr = c4425r.f47554b;
        long[] jArr = c4425r.f47553a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i5 = 0;
        while (true) {
            long j8 = jArr[i5];
            if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i10 = 8 - ((~(i5 - length)) >>> 31);
                for (int i11 = 0; i11 < i10; i11++) {
                    if ((255 & j8) < 128) {
                        C0729i0 c0729i02 = (C0729i0) objArr[(i5 << 3) + i11];
                        if (c0729i02.c(obj) == 4) {
                            cVar.b(obj, c0729i02);
                        }
                    }
                    j8 >>= 8;
                }
                if (i10 != 8) {
                    return;
                }
            }
            if (i5 == length) {
                return;
            } else {
                i5++;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x005a, code lost:
    
        return true;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean s(java.util.Set r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            boolean r2 = r1 instanceof P.f
            Y9.c r3 = r0.f7913j
            Y9.c r4 = r0.f7910g
            r5 = 0
            r6 = 1
            if (r2 == 0) goto L66
            P.f r1 = (P.f) r1
            x.r r1 = r1.f8983a
            java.lang.Object[] r2 = r1.f47554b
            long[] r1 = r1.f47553a
            int r7 = r1.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L8b
            r8 = r5
        L1c:
            r9 = r1[r8]
            long r11 = ~r9
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 == 0) goto L61
            int r11 = r8 - r7
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = r5
        L36:
            if (r13 >= r11) goto L5f
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.3E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L5b
            int r14 = r8 << 3
            int r14 = r14 + r13
            r14 = r2[r14]
            java.lang.Object r15 = r4.f16739b
            x.o r15 = (x.C4422o) r15
            boolean r15 = r15.b(r14)
            if (r15 != 0) goto L5a
            java.lang.Object r15 = r3.f16739b
            x.o r15 = (x.C4422o) r15
            boolean r14 = r15.b(r14)
            if (r14 == 0) goto L5b
        L5a:
            return r6
        L5b:
            long r9 = r9 >> r12
            int r13 = r13 + 1
            goto L36
        L5f:
            if (r11 != r12) goto L8b
        L61:
            if (r8 == r7) goto L8b
            int r8 = r8 + 1
            goto L1c
        L66:
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L6c:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L8b
            java.lang.Object r2 = r1.next()
            java.lang.Object r7 = r4.f16739b
            x.o r7 = (x.C4422o) r7
            boolean r7 = r7.b(r2)
            if (r7 != 0) goto L8a
            java.lang.Object r7 = r3.f16739b
            x.o r7 = (x.C4422o) r7
            boolean r2 = r7.b(r2)
            if (r2 == 0) goto L6c
        L8a:
            return r6
        L8b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: N.C0744s.s(java.util.Set):boolean");
    }

    public final boolean t() {
        boolean zB;
        synchronized (this.f7907d) {
            try {
                l();
                try {
                    Y9.c cVar = this.f7916n;
                    this.f7916n = new Y9.c(20);
                    try {
                        this.f7918p.getClass();
                        zB = this.f7919q.B(cVar);
                        if (!zB) {
                            m();
                        }
                    } catch (Exception e7) {
                        this.f7916n = cVar;
                        throw e7;
                    }
                } catch (Throwable th) {
                    try {
                        if (!this.f7908e.f47551a.g()) {
                            C4424q c4424q = this.f7908e;
                            new ArrayList();
                            new ArrayList();
                            new ArrayList();
                            new ArrayList();
                            if (!c4424q.f47551a.g()) {
                                Trace.beginSection("Compose:abandons");
                                try {
                                    Iterator it = c4424q.iterator();
                                    while (((Af.l) ((Af.i) it).f1308c).hasNext()) {
                                        q0 q0Var = (q0) ((Af.l) ((Af.i) it).f1308c).next();
                                        ((Af.i) it).remove();
                                        q0Var.j();
                                    }
                                    Trace.endSection();
                                } catch (Throwable th2) {
                                    Trace.endSection();
                                    throw th2;
                                }
                            }
                        }
                        throw th;
                    } catch (Exception e10) {
                        c();
                        throw e10;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return zB;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.util.Set[]] */
    public final void u(P.f fVar) {
        P.f fVar2;
        while (true) {
            Object obj = this.f7906c.get();
            if (obj == null ? true : obj.equals(C0718d.f7759g)) {
                fVar2 = fVar;
            } else if (obj instanceof Set) {
                fVar2 = new Set[]{obj, fVar};
            } else {
                if (!(obj instanceof Object[])) {
                    throw new IllegalStateException(("corrupt pendingModifications: " + this.f7906c).toString());
                }
                AbstractC3340k.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.collections.Set<kotlin.Any>>");
                Set[] setArr = (Set[]) obj;
                AbstractC3340k.e(setArr, "<this>");
                int length = setArr.length;
                ?? CopyOf = Arrays.copyOf(setArr, length + 1);
                CopyOf[length] = fVar;
                fVar2 = CopyOf;
            }
            AtomicReference atomicReference = this.f7906c;
            while (!atomicReference.compareAndSet(obj, fVar2)) {
                if (atomicReference.get() != obj) {
                    break;
                }
            }
            if (obj == null) {
                synchronized (this.f7907d) {
                    m();
                }
                return;
            }
            return;
        }
    }

    public final void v(Object obj) {
        C0729i0 c0729i0V;
        boolean z2;
        boolean z10;
        int i5;
        int i10;
        C0740o c0740o = this.f7919q;
        if (c0740o.f7869z <= 0 && (c0729i0V = c0740o.v()) != null) {
            boolean z11 = true;
            int i11 = c0729i0V.f7785a | 1;
            c0729i0V.f7785a = i11;
            if ((i11 & 32) == 0) {
                C4421n c4421n = c0729i0V.f7790f;
                if (c4421n == null) {
                    c4421n = new C4421n();
                    c0729i0V.f7790f = c4421n;
                }
                int i12 = c0729i0V.f7789e;
                int iB = c4421n.b(obj);
                if (iB < 0) {
                    iB = ~iB;
                    i10 = -1;
                } else {
                    i10 = c4421n.f47530c[iB];
                }
                c4421n.f47529b[iB] = obj;
                c4421n.f47530c[iB] = i12;
                if (i10 == c0729i0V.f7789e) {
                    return;
                }
            }
            if (obj instanceof X.z) {
                ((X.z) obj).h(1);
            }
            this.f7910g.b(obj, c0729i0V);
            if (obj instanceof C0751z) {
                C0751z c0751z = (C0751z) obj;
                C0749x c0749xJ = c0751z.j();
                Y9.c cVar = this.f7913j;
                cVar.p(obj);
                C4421n c4421n2 = c0749xJ.f7957e;
                Object[] objArr = c4421n2.f47529b;
                long[] jArr = c4421n2.f47528a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i13 = 0;
                    while (true) {
                        long j8 = jArr[i13];
                        if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i14 = 8;
                            int i15 = 8 - ((~(i13 - length)) >>> 31);
                            int i16 = 0;
                            while (i16 < i15) {
                                if ((j8 & 255) < 128) {
                                    i5 = i14;
                                    X.y yVar = (X.y) objArr[(i13 << 3) + i16];
                                    if (yVar instanceof X.z) {
                                        z10 = true;
                                        ((X.z) yVar).h(1);
                                    } else {
                                        z10 = true;
                                    }
                                    cVar.b(yVar, obj);
                                } else {
                                    z10 = z11;
                                    i5 = i14;
                                }
                                j8 >>= i5;
                                i16++;
                                z11 = z10;
                                i14 = i5;
                            }
                            z2 = z11;
                            if (i15 != i14) {
                                break;
                            }
                        } else {
                            z2 = z11;
                        }
                        if (i13 == length) {
                            break;
                        }
                        i13++;
                        z11 = z2;
                    }
                }
                Object obj2 = c0749xJ.f7958f;
                C4422o c4422o = c0729i0V.f7791g;
                if (c4422o == null) {
                    c4422o = new C4422o();
                    c0729i0V.f7791g = c4422o;
                }
                c4422o.j(c0751z, obj2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void w(java.lang.Object r15) {
        /*
            r14 = this;
            java.lang.Object r0 = r14.f7907d
            monitor-enter(r0)
            r14.r(r15)     // Catch: java.lang.Throwable -> L53
            Y9.c r1 = r14.f7913j     // Catch: java.lang.Throwable -> L53
            java.lang.Object r1 = r1.f16739b     // Catch: java.lang.Throwable -> L53
            x.o r1 = (x.C4422o) r1     // Catch: java.lang.Throwable -> L53
            java.lang.Object r15 = r1.e(r15)     // Catch: java.lang.Throwable -> L53
            if (r15 == 0) goto L65
            boolean r1 = r15 instanceof x.C4425r     // Catch: java.lang.Throwable -> L53
            if (r1 == 0) goto L60
            x.r r15 = (x.C4425r) r15     // Catch: java.lang.Throwable -> L53
            java.lang.Object[] r1 = r15.f47554b     // Catch: java.lang.Throwable -> L53
            long[] r15 = r15.f47553a     // Catch: java.lang.Throwable -> L53
            int r2 = r15.length     // Catch: java.lang.Throwable -> L53
            int r2 = r2 + (-2)
            if (r2 < 0) goto L65
            r3 = 0
            r4 = r3
        L23:
            r5 = r15[r4]     // Catch: java.lang.Throwable -> L53
            long r7 = ~r5     // Catch: java.lang.Throwable -> L53
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L5b
            int r7 = r4 - r2
            int r7 = ~r7     // Catch: java.lang.Throwable -> L53
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L3d:
            if (r9 >= r7) goto L59
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L55
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r1[r10]     // Catch: java.lang.Throwable -> L53
            N.z r10 = (N.C0751z) r10     // Catch: java.lang.Throwable -> L53
            r14.r(r10)     // Catch: java.lang.Throwable -> L53
            goto L55
        L53:
            r15 = move-exception
            goto L67
        L55:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L3d
        L59:
            if (r7 != r8) goto L65
        L5b:
            if (r4 == r2) goto L65
            int r4 = r4 + 1
            goto L23
        L60:
            N.z r15 = (N.C0751z) r15     // Catch: java.lang.Throwable -> L53
            r14.r(r15)     // Catch: java.lang.Throwable -> L53
        L65:
            monitor-exit(r0)
            return
        L67:
            monitor-exit(r0)
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: N.C0744s.w(java.lang.Object):void");
    }
}
