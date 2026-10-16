package kotlinx.coroutines.a;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class u extends kotlinx.coroutines.e.e {

    /* renamed from: b, reason: collision with root package name */
    private final k f51324b;

    /* renamed from: c, reason: collision with root package name */
    private final e.a.f.a.e f51325c;

    public u(long j2, u uVar, k kVar, int i2) {
        super(j2, uVar, i2);
        this.f51324b = kVar;
        int i3 = m.f51305a;
        this.f51325c = new e.a.f.a.e(i3 + i3);
    }

    private final void y(int i2, Object obj) {
        this.f51325c.d(i2 + i2).c(obj);
    }

    @Override // kotlinx.coroutines.e.e
    public final int a() {
        return m.f51305a;
    }

    public final Object b(int i2, Object obj) {
        return this.f51325c.d(i2 + i2 + 1).a(obj);
    }

    public final Object c(int i2) {
        return this.f51325c.d(i2 + i2).b();
    }

    public final Object d(int i2) {
        return this.f51325c.d(i2 + i2 + 1).b();
    }

    public final Object e(int i2) {
        Object objC = c(i2);
        g(i2);
        return objC;
    }

    public final k f() {
        k kVar = this.f51324b;
        h.g.b.x.c(kVar);
        return kVar;
    }

    public final void g(int i2) {
        y(i2, null);
    }

    public final void h(int i2, boolean z) {
        if (z) {
            f().u((this.f51893a * m.f51305a) + i2);
        }
        u();
    }

    public final void i(int i2, Object obj) {
        this.f51325c.d(i2 + i2 + 1).d(obj);
    }

    public final void j(int i2, Object obj) {
        y(i2, obj);
    }

    public final boolean k(int i2, Object obj, Object obj2) {
        return this.f51325c.d(i2 + i2 + 1).e(obj, obj2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0058, code lost:
    
        g(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x005b, code lost:
    
        if (r1 == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x005d, code lost:
    
        r4 = f().f51293a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0063, code lost:
    
        if (r4 == null) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0065, code lost:
    
        kotlinx.coroutines.e.al.k(r4, r0, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0068, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:?, code lost:
    
        return;
     */
    @Override // kotlinx.coroutines.e.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(int r5, h.c.j r6) {
        /*
            r4 = this;
            int r0 = kotlinx.coroutines.a.m.f51305a
            if (r5 < r0) goto L6
            r1 = 1
            goto L7
        L6:
            r1 = 0
        L7:
            if (r1 == 0) goto La
            int r5 = r5 - r0
        La:
            java.lang.Object r0 = r4.c(r5)
        Le:
            java.lang.Object r2 = r4.d(r5)
            boolean r3 = r2 instanceof kotlinx.coroutines.dl
            if (r3 != 0) goto L69
            boolean r3 = r2 instanceof kotlinx.coroutines.a.ah
            if (r3 == 0) goto L1b
            goto L69
        L1b:
            kotlinx.coroutines.e.ak r3 = kotlinx.coroutines.a.m.k()
            if (r2 == r3) goto L58
            kotlinx.coroutines.e.ak r3 = kotlinx.coroutines.a.m.j()
            if (r2 != r3) goto L28
            goto L58
        L28:
            kotlinx.coroutines.e.ak r3 = kotlinx.coroutines.a.m.p()
            if (r2 == r3) goto Le
            kotlinx.coroutines.e.ak r3 = kotlinx.coroutines.a.m.q()
            if (r2 == r3) goto Le
            kotlinx.coroutines.e.ak r4 = kotlinx.coroutines.a.m.h()
            if (r2 == r4) goto L8f
            kotlinx.coroutines.e.ak r4 = kotlinx.coroutines.a.m.f51306b
            if (r2 == r4) goto L8f
            kotlinx.coroutines.e.ak r4 = kotlinx.coroutines.a.m.t()
            if (r2 != r4) goto L45
            goto L8f
        L45:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.util.Objects.toString(r2)
            java.lang.String r5 = java.lang.String.valueOf(r2)
            java.lang.String r6 = "unexpected state: "
            java.lang.String r5 = r6.concat(r5)
            r4.<init>(r5)
            throw r4
        L58:
            r4.g(r5)
            if (r1 == 0) goto L8f
            kotlinx.coroutines.a.k r4 = r4.f()
            h.g.a.l r4 = r4.f51293a
            if (r4 == 0) goto L8f
            kotlinx.coroutines.e.al.k(r4, r0, r6)
            return
        L69:
            if (r1 == 0) goto L70
            kotlinx.coroutines.e.ak r3 = kotlinx.coroutines.a.m.k()
            goto L74
        L70:
            kotlinx.coroutines.e.ak r3 = kotlinx.coroutines.a.m.j()
        L74:
            boolean r2 = r4.k(r5, r2, r3)
            if (r2 == 0) goto Le
            r4.g(r5)
            r2 = r1 ^ 1
            r4.h(r5, r2)
            if (r1 == 0) goto L8f
            kotlinx.coroutines.a.k r4 = r4.f()
            h.g.a.l r4 = r4.f51293a
            if (r4 == 0) goto L8f
            kotlinx.coroutines.e.al.k(r4, r0, r6)
        L8f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.a.u.l(int, h.c.j):void");
    }
}
