package e.a.d;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class l extends e.a.bt {

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ m f47278f;

    /* renamed from: g, reason: collision with root package name */
    private final e.a.bl f47279g;

    /* renamed from: h, reason: collision with root package name */
    private e.a.bt f47280h;

    /* renamed from: i, reason: collision with root package name */
    private e.a.bv f47281i;

    l(m mVar, e.a.bl blVar) {
        Objects.requireNonNull(mVar);
        this.f47278f = mVar;
        this.f47279g = blVar;
        e.a.bv bvVar = mVar.f47283b;
        this.f47281i = bvVar;
        this.f47280h = bvVar.a(blVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    @Override // e.a.bt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final e.a.ee a(e.a.bp r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r9.b()
            e.a.d.jl r0 = (e.a.d.jl) r0
            if (r0 != 0) goto L15
            e.a.d.m r0 = r8.f47278f
            e.a.d.jl r1 = new e.a.d.jl
            e.a.bv r0 = e.a.d.m.f(r0)
            r2 = 0
            r1.<init>(r0, r2)
            r0 = r1
        L15:
            e.a.bv r1 = r8.f47281i
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2b
            e.a.bv r4 = r0.f47233a
            java.lang.String r1 = r1.c()
            java.lang.String r4 = r4.c()
            boolean r1 = r4.equals(r1)
            if (r1 != 0) goto L6e
        L2b:
            e.a.bl r1 = r8.f47279g
            e.a.w r4 = e.a.w.f47851a
            e.a.bk r5 = new e.a.bk
            e.a.bn r6 = e.a.bn.c()
            r5.<init>(r6)
            r1.f(r4, r5)
            e.a.bt r4 = r8.f47280h
            r4.d()
            e.a.bv r4 = r0.f47233a
            r8.f47281i = r4
            e.a.bt r5 = r8.f47280h
            e.a.bt r4 = r4.a(r1)
            r8.f47280h = r4
            e.a.j r1 = r1.a()
            java.lang.Class r4 = r5.getClass()
            java.lang.String r4 = r4.getSimpleName()
            e.a.bt r5 = r8.f47280h
            java.lang.Class r5 = r5.getClass()
            java.lang.String r5 = r5.getSimpleName()
            r6 = 2
            java.lang.Object[] r7 = new java.lang.Object[r6]
            r7[r2] = r4
            r7[r3] = r5
            java.lang.String r4 = "Load balancer changed from {0} to {1}"
            r1.b(r6, r4, r7)
        L6e:
            java.lang.Object r0 = r0.f47234b
            if (r0 == 0) goto L81
            e.a.bl r1 = r8.f47279g
            e.a.j r1 = r1.a()
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r4[r2] = r0
            java.lang.String r2 = "Load-balancing config: {0}"
            r1.b(r3, r2, r4)
        L81:
            e.a.bt r8 = r8.f47280h
            e.a.da r1 = e.a.bp.d()
            java.util.List r2 = r9.c()
            r1.f(r2)
            e.a.c r9 = r9.a()
            r1.g(r9)
            r1.h(r0)
            e.a.bp r9 = r1.e()
            e.a.ee r8 = r8.a(r9)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: e.a.d.l.a(e.a.bp):e.a.ee");
    }

    @Override // e.a.bt
    public final void b(e.a.ee eeVar) {
        this.f47280h.b(eeVar);
    }

    @Override // e.a.bt
    public final void c() {
        this.f47280h.c();
    }

    @Override // e.a.bt
    public final void d() {
        this.f47280h.d();
        this.f47280h = null;
    }
}
