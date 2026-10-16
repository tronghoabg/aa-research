package r0;

import a.AbstractC1304a;

/* renamed from: r0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3901f implements InterfaceC3903h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44295a;

    @Override // r0.InterfaceC3903h
    public final long a(long j8, long j10) {
        switch (this.f44295a) {
            case 0:
                float fMax = Math.max(d0.f.d(j10) / d0.f.d(j8), d0.f.b(j10) / d0.f.b(j8));
                return AbstractC1304a.g(fMax, fMax);
            case 1:
                float fMin = Math.min(d0.f.d(j10) / d0.f.d(j8), d0.f.b(j10) / d0.f.b(j8));
                return AbstractC1304a.g(fMin, fMin);
            default:
                if (d0.f.d(j8) <= d0.f.d(j10) && d0.f.b(j8) <= d0.f.b(j10)) {
                    return AbstractC1304a.g(1.0f, 1.0f);
                }
                float fMin2 = Math.min(d0.f.d(j10) / d0.f.d(j8), d0.f.b(j10) / d0.f.b(j8));
                return AbstractC1304a.g(fMin2, fMin2);
        }
    }
}
