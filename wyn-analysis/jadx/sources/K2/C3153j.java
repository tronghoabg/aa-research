package k2;

import N1.C0765n;
import java.io.IOException;

/* renamed from: k2.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3153j implements M, Z1.e {

    /* renamed from: a, reason: collision with root package name */
    public final Object f39092a;

    /* renamed from: b, reason: collision with root package name */
    public Z1.d f39093b;

    /* renamed from: c, reason: collision with root package name */
    public Z1.d f39094c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AbstractC3155l f39095d;

    public C3153j(AbstractC3155l abstractC3155l, Object obj) {
        this.f39095d = abstractC3155l;
        this.f39093b = abstractC3155l.a(null);
        this.f39094c = new Z1.d(abstractC3155l.f39019d.f16928c, 0, null);
        this.f39092a = obj;
    }

    @Override // k2.M
    public final void B(int i5, H h10, h2.g gVar) {
        if (a(i5, h10)) {
            Z1.d dVar = this.f39093b;
            h2.g gVarB = b(gVar, h10);
            H h11 = dVar.f16927b;
            h11.getClass();
            dVar.a(new A5.g(dVar, h11, gVarB, 16));
        }
    }

    @Override // k2.M
    public final void D(int i5, H h10, C3168z c3168z, h2.g gVar) {
        if (a(i5, h10)) {
            Z1.d dVar = this.f39093b;
            h2.g gVarB = b(gVar, h10);
            dVar.getClass();
            dVar.a(new J(dVar, c3168z, gVarB, 2));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(int r4, k2.H r5) {
        /*
            r3 = this;
            k2.l r0 = r3.f39095d
            java.lang.Object r1 = r3.f39092a
            if (r5 == 0) goto Le
            k2.H r5 = r0.t(r1, r5)
            if (r5 != 0) goto Lf
            r4 = 0
            return r4
        Le:
            r5 = 0
        Lf:
            int r4 = r0.v(r4, r1)
            Z1.d r1 = r3.f39093b
            int r2 = r1.f16926a
            if (r2 != r4) goto L23
            int r2 = Q1.x.f9724a
            k2.H r1 = r1.f16927b
            boolean r1 = j$.util.Objects.equals(r1, r5)
            if (r1 != 0) goto L2e
        L23:
            Z1.d r1 = new Z1.d
            Z1.d r2 = r0.f39018c
            java.util.concurrent.CopyOnWriteArrayList r2 = r2.f16928c
            r1.<init>(r2, r4, r5)
            r3.f39093b = r1
        L2e:
            Z1.d r1 = r3.f39094c
            int r2 = r1.f16926a
            if (r2 != r4) goto L3e
            int r2 = Q1.x.f9724a
            k2.H r1 = r1.f16927b
            boolean r1 = j$.util.Objects.equals(r1, r5)
            if (r1 != 0) goto L49
        L3e:
            Z1.d r1 = new Z1.d
            Z1.d r0 = r0.f39019d
            java.util.concurrent.CopyOnWriteArrayList r0 = r0.f16928c
            r1.<init>(r0, r4, r5)
            r3.f39094c = r1
        L49:
            r4 = 1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: k2.C3153j.a(int, k2.H):boolean");
    }

    public final h2.g b(h2.g gVar, H h10) {
        AbstractC3155l abstractC3155l = this.f39095d;
        Object obj = this.f39092a;
        long j8 = gVar.f36022d;
        long jU = abstractC3155l.u(j8, obj);
        long j10 = gVar.f36023e;
        long jU2 = abstractC3155l.u(j10, obj);
        if (jU == j8 && jU2 == j10) {
            return gVar;
        }
        return new h2.g(gVar.f36019a, gVar.f36020b, (C0765n) gVar.f36024f, gVar.f36021c, gVar.f36025g, jU, jU2);
    }

    @Override // k2.M
    public final void q(int i5, H h10, h2.g gVar) {
        if (a(i5, h10)) {
            Z1.d dVar = this.f39093b;
            h2.g gVarB = b(gVar, h10);
            dVar.getClass();
            dVar.a(new aa.f(11, dVar, gVarB));
        }
    }

    @Override // k2.M
    public final void r(int i5, H h10, C3168z c3168z, h2.g gVar) {
        if (a(i5, h10)) {
            Z1.d dVar = this.f39093b;
            h2.g gVarB = b(gVar, h10);
            dVar.getClass();
            dVar.a(new J(dVar, c3168z, gVarB, 1));
        }
    }

    @Override // k2.M
    public final void s(int i5, H h10, C3168z c3168z, h2.g gVar, IOException iOException, boolean z2) {
        if (a(i5, h10)) {
            Z1.d dVar = this.f39093b;
            h2.g gVarB = b(gVar, h10);
            dVar.getClass();
            dVar.a(new K(dVar, c3168z, gVarB, iOException, z2));
        }
    }

    @Override // k2.M
    public final void y(int i5, H h10, C3168z c3168z, h2.g gVar) {
        if (a(i5, h10)) {
            Z1.d dVar = this.f39093b;
            h2.g gVarB = b(gVar, h10);
            dVar.getClass();
            dVar.a(new J(dVar, c3168z, gVarB, 0));
        }
    }
}
