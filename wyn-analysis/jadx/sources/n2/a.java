package N2;

import java.math.BigInteger;
import s2.v;
import s2.w;
import s2.x;

/* loaded from: classes.dex */
public final class a implements w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f8331a;

    public a(b bVar) {
        this.f8331a = bVar;
    }

    @Override // s2.w
    public final v c(long j8) {
        b bVar = this.f8331a;
        BigInteger bigIntegerValueOf = BigInteger.valueOf((((i) bVar.f8343m).f8370f * j8) / 1000000);
        long j10 = bVar.f8334c;
        long j11 = bVar.f8333b;
        x xVar = new x(j8, Q1.x.j((bigIntegerValueOf.multiply(BigInteger.valueOf(j10 - j11)).divide(BigInteger.valueOf(bVar.f8336e)).longValue() + j11) - 30000, bVar.f8333b, j10 - 1));
        return new v(xVar, xVar);
    }

    @Override // s2.w
    public final boolean e() {
        return true;
    }

    @Override // s2.w
    public final long f() {
        return (this.f8331a.f8336e * 1000000) / ((i) r0.f8343m).f8370f;
    }
}
