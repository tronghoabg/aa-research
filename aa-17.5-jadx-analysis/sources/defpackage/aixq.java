package defpackage;

/* loaded from: classes2.dex */
public final class aixq extends ajbv {
    private final aixh c;
    private final lds d;

    public aixq(long j, aixq aixqVar, aixh aixhVar, int i) {
        super(j, aixqVar, i);
        this.c = aixhVar;
        int i2 = aixj.b;
        this.d = new lds(i2 + i2);
    }

    @Override // defpackage.ajbv
    public final int a() {
        return aixj.b;
    }

    public final Object b(int i, Object obj) {
        return this.d.m(i + i + 1).a(obj);
    }

    public final Object c(int i) {
        return this.d.m(i + i).a;
    }

    public final Object d(int i) {
        return this.d.m(i + i + 1).a;
    }

    public final Object e(int i) {
        Object objC = c(i);
        h(i, null);
        return objC;
    }

    public final aixh f() {
        aixh aixhVar = this.c;
        aixhVar.getClass();
        return aixhVar;
    }

    public final void g(int i, boolean z) {
        if (z) {
            f().t((this.b * aixj.b) + i);
        }
        r();
    }

    public final void h(int i, Object obj) {
        this.d.m(i + i).b(obj);
    }

    public final void i(int i, Object obj) {
        this.d.m(i + i + 1).c(obj);
    }

    public final boolean j(int i, Object obj, Object obj2) {
        return this.d.m(i + i + 1).d(obj, obj2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x004c, code lost:
    
        h(r5, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x004f, code lost:
    
        if (r1 == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0051, code lost:
    
        f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0054, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:?, code lost:
    
        return;
     */
    @Override // defpackage.ajbv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(int r5) {
        /*
            r4 = this;
            int r0 = defpackage.aixj.b
            if (r5 < r0) goto L6
            r1 = 1
            goto L7
        L6:
            r1 = 0
        L7:
            if (r1 == 0) goto La
            int r5 = r5 - r0
        La:
            r4.c(r5)
        Ld:
            java.lang.Object r0 = r4.d(r5)
            boolean r2 = r0 instanceof defpackage.aiwr
            r3 = 0
            if (r2 != 0) goto L55
            boolean r2 = r0 instanceof defpackage.aixz
            if (r2 == 0) goto L1b
            goto L55
        L1b:
            ajcz r2 = defpackage.aixj.j
            if (r0 == r2) goto L4c
            ajcz r2 = defpackage.aixj.k
            if (r0 != r2) goto L24
            goto L4c
        L24:
            ajcz r2 = defpackage.aixj.g
            if (r0 == r2) goto Ld
            ajcz r2 = defpackage.aixj.f
            if (r0 == r2) goto Ld
            ajcz r4 = defpackage.aixj.i
            if (r0 == r4) goto L6f
            ajcz r4 = defpackage.aixj.d
            if (r0 == r4) goto L6f
            ajcz r4 = defpackage.aixj.l
            if (r0 != r4) goto L39
            goto L6f
        L39:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.util.Objects.toString(r0)
            java.lang.String r5 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "unexpected state: "
            java.lang.String r5 = r0.concat(r5)
            r4.<init>(r5)
            throw r4
        L4c:
            r4.h(r5, r3)
            if (r1 == 0) goto L6f
            r4.f()
            return
        L55:
            if (r1 == 0) goto L5a
            ajcz r2 = defpackage.aixj.j
            goto L5c
        L5a:
            ajcz r2 = defpackage.aixj.k
        L5c:
            boolean r0 = r4.j(r5, r0, r2)
            if (r0 == 0) goto Ld
            r4.h(r5, r3)
            r0 = r1 ^ 1
            r4.g(r5, r0)
            if (r1 == 0) goto L6f
            r4.f()
        L6f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aixq.k(int):void");
    }
}
