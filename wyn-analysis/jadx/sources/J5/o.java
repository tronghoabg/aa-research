package J5;

import u6.AbstractC4256a;

/* loaded from: classes3.dex */
public class o implements t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5656a;

    /* renamed from: b, reason: collision with root package name */
    public final long f5657b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f5658c;

    public /* synthetic */ o(Object obj, long j8, int i5) {
        this.f5656a = i5;
        this.f5658c = obj;
        this.f5657b = j8;
    }

    @Override // J5.t
    public final s c(long j8) {
        switch (this.f5656a) {
            case 0:
                p pVar = (p) this.f5658c;
                AbstractC4256a.j((S3.e) pVar.f5669l);
                S3.e eVar = (S3.e) pVar.f5669l;
                long[] jArr = (long[]) eVar.f10941b;
                int iE = u6.v.e(jArr, u6.v.i((pVar.f5664f * j8) / 1000000, 0L, pVar.k - 1), false);
                long j10 = iE == -1 ? 0L : jArr[iE];
                long[] jArr2 = (long[]) eVar.f10942c;
                long j11 = iE != -1 ? jArr2[iE] : 0L;
                int i5 = pVar.f5664f;
                long j12 = (j10 * 1000000) / i5;
                long j13 = this.f5657b;
                u uVar = new u(j12, j11 + j13);
                if (j12 == j8 || iE == jArr.length - 1) {
                    return new s(uVar, uVar);
                }
                int i10 = iE + 1;
                return new s(uVar, new u((jArr[i10] * 1000000) / i5, j13 + jArr2[i10]));
            case 1:
                return (s) this.f5658c;
            default:
                L5.b bVar = (L5.b) this.f5658c;
                s sVarB = bVar.f6946g[0].b(j8);
                int i11 = 1;
                while (true) {
                    L5.e[] eVarArr = bVar.f6946g;
                    if (i11 >= eVarArr.length) {
                        return sVarB;
                    }
                    s sVarB2 = eVarArr[i11].b(j8);
                    if (sVarB2.f5678a.f5682b < sVarB.f5678a.f5682b) {
                        sVarB = sVarB2;
                    }
                    i11++;
                }
        }
    }

    @Override // J5.t
    public final boolean e() {
        switch (this.f5656a) {
            case 0:
                return true;
            case 1:
                return false;
            default:
                return true;
        }
    }

    @Override // J5.t
    public final long f() {
        switch (this.f5656a) {
        }
        return this.f5657b;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public o(long j8) {
        this(j8, 0L);
        this.f5656a = 1;
    }

    public o(long j8, long j10) {
        this.f5656a = 1;
        this.f5657b = j8;
        u uVar = j10 == 0 ? u.f5680c : new u(0L, j10);
        this.f5658c = new s(uVar, uVar);
    }
}
