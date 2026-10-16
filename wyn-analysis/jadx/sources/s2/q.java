package s2;

/* loaded from: classes.dex */
public class q implements w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44914a;

    /* renamed from: b, reason: collision with root package name */
    public final long f44915b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f44916c;

    public /* synthetic */ q(Object obj, long j8, int i5) {
        this.f44914a = i5;
        this.f44916c = obj;
        this.f44915b = j8;
    }

    @Override // s2.w
    public final v c(long j8) {
        switch (this.f44914a) {
            case 0:
                J5.p pVar = (J5.p) this.f44916c;
                Q1.k.h((Y2.B) pVar.f5669l);
                Y2.B b5 = (Y2.B) pVar.f5669l;
                long[] jArr = (long[]) b5.f16383b;
                int iE = Q1.x.e(jArr, Q1.x.j((pVar.f5664f * j8) / 1000000, 0L, pVar.k - 1), false);
                long j10 = iE == -1 ? 0L : jArr[iE];
                long[] jArr2 = (long[]) b5.f16384c;
                long j11 = iE != -1 ? jArr2[iE] : 0L;
                int i5 = pVar.f5664f;
                long j12 = (j10 * 1000000) / i5;
                long j13 = this.f44915b;
                x xVar = new x(j12, j11 + j13);
                if (j12 == j8 || iE == jArr.length - 1) {
                    return new v(xVar, xVar);
                }
                int i10 = iE + 1;
                return new v(xVar, new x((jArr[i10] * 1000000) / i5, j13 + jArr2[i10]));
            case 1:
                return (v) this.f44916c;
            default:
                u2.b bVar = (u2.b) this.f44916c;
                v vVarB = bVar.f46532i[0].b(j8);
                int i11 = 1;
                while (true) {
                    u2.e[] eVarArr = bVar.f46532i;
                    if (i11 >= eVarArr.length) {
                        return vVarB;
                    }
                    v vVarB2 = eVarArr[i11].b(j8);
                    if (vVarB2.f44935a.f44939b < vVarB.f44935a.f44939b) {
                        vVarB = vVarB2;
                    }
                    i11++;
                }
        }
    }

    @Override // s2.w
    public final boolean e() {
        switch (this.f44914a) {
            case 0:
                return true;
            case 1:
                return false;
            default:
                return true;
        }
    }

    @Override // s2.w
    public final long f() {
        switch (this.f44914a) {
        }
        return this.f44915b;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public q(long j8) {
        this(j8, 0L);
        this.f44914a = 1;
    }

    public q(long j8, long j10) {
        this.f44914a = 1;
        this.f44915b = j8;
        x xVar = j10 == 0 ? x.f44937c : new x(0L, j10);
        this.f44916c = new v(xVar, xVar);
    }
}
