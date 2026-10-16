package S5;

import J5.s;
import J5.t;
import J5.u;
import N2.i;
import u6.v;

/* loaded from: classes3.dex */
public final class a implements t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ N2.b f11011a;

    public a(N2.b bVar) {
        this.f11011a = bVar;
    }

    @Override // J5.t
    public final s c(long j8) {
        N2.b bVar = this.f11011a;
        long j10 = bVar.f8334c;
        long j11 = bVar.f8333b;
        u uVar = new u(j8, v.i(((((j10 - j11) * ((((i) bVar.f8343m).f8370f * j8) / 1000000)) / bVar.f8336e) + j11) - 30000, j11, j10 - 1));
        return new s(uVar, uVar);
    }

    @Override // J5.t
    public final boolean e() {
        return true;
    }

    @Override // J5.t
    public final long f() {
        return (this.f11011a.f8336e * 1000000) / ((i) r0.f8343m).f8370f;
    }
}
