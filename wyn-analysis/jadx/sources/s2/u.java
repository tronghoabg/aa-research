package s2;

/* loaded from: classes.dex */
public final class u implements w {

    /* renamed from: a, reason: collision with root package name */
    public final Q1.l f44932a;

    /* renamed from: b, reason: collision with root package name */
    public final Q1.l f44933b;

    /* renamed from: c, reason: collision with root package name */
    public long f44934c;

    public u(long[] jArr, long[] jArr2, long j8) {
        Q1.k.c(jArr.length == jArr2.length);
        int length = jArr2.length;
        if (length <= 0 || jArr2[0] <= 0) {
            this.f44932a = new Q1.l(length);
            this.f44933b = new Q1.l(length);
        } else {
            int i5 = length + 1;
            Q1.l lVar = new Q1.l(i5);
            this.f44932a = lVar;
            Q1.l lVar2 = new Q1.l(i5);
            this.f44933b = lVar2;
            lVar.a(0L);
            lVar2.a(0L);
        }
        this.f44932a.b(jArr);
        this.f44933b.b(jArr2);
        this.f44934c = j8;
    }

    public final void a(long j8, long j10) {
        Q1.l lVar = this.f44933b;
        int i5 = lVar.f9690b;
        Q1.l lVar2 = this.f44932a;
        if (i5 == 0 && j8 > 0) {
            lVar2.a(0L);
            lVar.a(0L);
        }
        lVar2.a(j10);
        lVar.a(j8);
    }

    @Override // s2.w
    public final v c(long j8) {
        Q1.l lVar = this.f44933b;
        if (lVar.f9690b == 0) {
            x xVar = x.f44937c;
            return new v(xVar, xVar);
        }
        int iB = Q1.x.b(lVar, j8);
        long jC = lVar.c(iB);
        Q1.l lVar2 = this.f44932a;
        x xVar2 = new x(jC, lVar2.c(iB));
        if (jC == j8 || iB == lVar.f9690b - 1) {
            return new v(xVar2, xVar2);
        }
        int i5 = iB + 1;
        return new v(xVar2, new x(lVar.c(i5), lVar2.c(i5)));
    }

    @Override // s2.w
    public final boolean e() {
        return this.f44933b.f9690b > 0;
    }

    @Override // s2.w
    public final long f() {
        return this.f44934c;
    }
}
