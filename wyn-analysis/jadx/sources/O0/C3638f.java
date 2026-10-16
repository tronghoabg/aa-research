package o0;

import A0.p;
import Ef.E;
import M0.n;
import N.C0718d;
import N.P;
import N.Y;
import Va.M6;
import Z.k;
import a2.v;
import d0.C2384c;
import kotlin.jvm.internal.AbstractC3340k;
import s0.InterfaceC3987a;

/* renamed from: o0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3638f implements InterfaceC3987a, s0.b {

    /* renamed from: a, reason: collision with root package name */
    public final C3635c f41259a;

    /* renamed from: b, reason: collision with root package name */
    public final n f41260b;

    /* renamed from: c, reason: collision with root package name */
    public final Y f41261c;

    public C3638f(C3635c c3635c, n nVar) {
        this.f41259a = c3635c;
        this.f41260b = nVar;
        c3635c.f41245a = new p(this, 27);
        this.f41261c = C0718d.G(null, P.f7730f);
    }

    public final E a() {
        C3638f c3638fB = b();
        if (c3638fB != null) {
            return c3638fB.a();
        }
        Kd.a aVar = this.f41259a.f41246b;
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }

    public final C3638f b() {
        return (C3638f) this.f41261c.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(long r10, long r12, lf.AbstractC3464c r14) {
        /*
            r9 = this;
            boolean r0 = r14 instanceof o0.C3636d
            if (r0 == 0) goto L14
            r0 = r14
            o0.d r0 = (o0.C3636d) r0
            int r1 = r0.f41253f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f41253f = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            o0.d r0 = new o0.d
            r0.<init>(r9, r14)
            goto L12
        L1a:
            java.lang.Object r14 = r6.f41251d
            kf.a r0 = kf.a.f39711a
            int r1 = r6.f41253f
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L41
            if (r1 == r3) goto L37
            if (r1 != r2) goto L2f
            long r10 = r6.f41249b
            Fe.e.U(r14)
            goto La2
        L2f:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L37:
            long r12 = r6.f41250c
            long r10 = r6.f41249b
            o0.f r1 = r6.f41248a
            Fe.e.U(r14)
            goto L5c
        L41:
            Fe.e.U(r14)
            r6.f41248a = r9
            r6.f41249b = r10
            r6.f41250c = r12
            r6.f41253f = r3
            M0.n r14 = r9.f41260b
            r14.getClass()
            long r3 = L0.l.f6813b
            L0.l r14 = new L0.l
            r14.<init>(r3)
            if (r14 != r0) goto L5b
            goto La0
        L5b:
            r1 = r9
        L5c:
            L0.l r14 = (L0.l) r14
            long r7 = r14.f6815a
            o0.f r1 = r1.b()
            if (r1 == 0) goto La8
            long r10 = L0.l.a(r10, r7)
            r14 = 32
            long r3 = r12 >> r14
            int r3 = (int) r3
            float r3 = java.lang.Float.intBitsToFloat(r3)
            long r4 = r7 >> r14
            int r14 = (int) r4
            float r14 = java.lang.Float.intBitsToFloat(r14)
            float r3 = r3 - r14
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r12 = r12 & r4
            int r12 = (int) r12
            float r12 = java.lang.Float.intBitsToFloat(r12)
            long r13 = r7 & r4
            int r13 = (int) r13
            float r13 = java.lang.Float.intBitsToFloat(r13)
            float r12 = r12 - r13
            long r4 = Fe.c.d(r3, r12)
            r12 = 0
            r6.f41248a = r12
            r6.f41249b = r7
            r6.f41253f = r2
            r2 = r10
            java.lang.Object r14 = r1.c(r2, r4, r6)
            if (r14 != r0) goto La1
        La0:
            return r0
        La1:
            r10 = r7
        La2:
            L0.l r14 = (L0.l) r14
            long r12 = r14.f6815a
            r7 = r10
            goto Laa
        La8:
            long r12 = L0.l.f6813b
        Laa:
            long r10 = L0.l.a(r7, r12)
            L0.l r12 = new L0.l
            r12.<init>(r10)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: o0.C3638f.c(long, long, lf.c):java.lang.Object");
    }

    public final long d(int i5, long j8, long j10) {
        long j11 = C2384c.f33931b;
        C3638f c3638fB = b();
        return C2384c.f(j11, c3638fB != null ? c3638fB.d(i5, C2384c.f(j8, j11), C2384c.e(j10, j11)) : j11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x009c, code lost:
    
        if (r14 != r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(long r12, lf.AbstractC3464c r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof o0.C3637e
            if (r0 == 0) goto L13
            r0 = r14
            o0.e r0 = (o0.C3637e) r0
            int r1 = r0.f41258e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f41258e = r1
            goto L18
        L13:
            o0.e r0 = new o0.e
            r0.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r0.f41256c
            kf.a r1 = kf.a.f39711a
            int r2 = r0.f41258e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            long r12 = r0.f41255b
            Fe.e.U(r14)
            goto L9f
        L2d:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L35:
            long r12 = r0.f41255b
            o0.f r2 = r0.f41254a
            Fe.e.U(r14)
            goto L54
        L3d:
            Fe.e.U(r14)
            o0.f r14 = r11.b()
            if (r14 == 0) goto L5c
            r0.f41254a = r11
            r0.f41255b = r12
            r0.f41258e = r4
            java.lang.Object r14 = r14.f(r12, r0)
            if (r14 != r1) goto L53
            goto L9e
        L53:
            r2 = r11
        L54:
            L0.l r14 = (L0.l) r14
            long r4 = r14.f6815a
        L58:
            r9 = r4
            r4 = r12
            r12 = r9
            goto L60
        L5c:
            long r4 = L0.l.f6813b
            r2 = r11
            goto L58
        L60:
            M0.n r14 = r2.f41260b
            int r2 = L0.l.f6814c
            r2 = 32
            long r6 = r4 >> r2
            int r6 = (int) r6
            float r6 = java.lang.Float.intBitsToFloat(r6)
            long r7 = r12 >> r2
            int r2 = (int) r7
            float r2 = java.lang.Float.intBitsToFloat(r2)
            float r6 = r6 - r2
            r7 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r4 = r4 & r7
            int r2 = (int) r4
            float r2 = java.lang.Float.intBitsToFloat(r2)
            long r4 = r12 & r7
            int r4 = (int) r4
            float r4 = java.lang.Float.intBitsToFloat(r4)
            float r2 = r2 - r4
            Fe.c.d(r6, r2)
            r2 = 0
            r0.f41254a = r2
            r0.f41255b = r12
            r0.f41258e = r3
            r14.getClass()
            long r2 = L0.l.f6813b
            L0.l r14 = new L0.l
            r14.<init>(r2)
            if (r14 != r1) goto L9f
        L9e:
            return r1
        L9f:
            L0.l r14 = (L0.l) r14
            long r0 = r14.f6815a
            long r12 = L0.l.a(r12, r0)
            L0.l r14 = new L0.l
            r14.<init>(r12)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: o0.C3638f.f(long, lf.c):java.lang.Object");
    }

    @Override // Z.k
    public final /* synthetic */ k g(k kVar) {
        return M6.f(this, kVar);
    }

    @Override // s0.b
    public final v getKey() {
        return h.f41263a;
    }

    @Override // Z.k
    public final Object h(Object obj, tf.p pVar) {
        return pVar.invoke(this, obj);
    }

    public final long i(int i5, long j8) {
        C3638f c3638fB = b();
        long jI = c3638fB != null ? c3638fB.i(i5, j8) : C2384c.f33931b;
        C2384c.e(j8, jI);
        return C2384c.f(jI, C2384c.f33931b);
    }

    @Override // s0.InterfaceC3987a
    public final void o(s0.c scope) {
        AbstractC3340k.e(scope, "scope");
        this.f41261c.setValue((C3638f) scope.a(h.f41263a));
        this.f41259a.f41247c = b();
    }

    @Override // Z.k
    public final Object p(Object obj, tf.p pVar) {
        return pVar.invoke(obj, this);
    }

    @Override // Z.k
    public final /* synthetic */ boolean v() {
        return M6.a(this, Z.h.f16921i);
    }

    @Override // s0.b
    public final Object getValue() {
        return this;
    }
}
