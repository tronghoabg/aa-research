package j$.time.temporal;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final /* synthetic */ class l implements k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f50063a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f50064b;

    public /* synthetic */ l(int i2, int i3) {
        this.f50063a = i3;
        this.f50064b = i2;
    }

    @Override // j$.time.temporal.k
    public final Temporal m(Temporal temporal) {
        int i2 = this.f50063a;
        int i3 = this.f50064b;
        switch (i2) {
            case 0:
                int iF = temporal.f(a.DAY_OF_WEEK);
                if (iF == i3) {
                    return temporal;
                }
                return temporal.b(iF - i3 >= 0 ? 7 - r0 : -r0, ChronoUnit.DAYS);
            default:
                int iF2 = temporal.f(a.DAY_OF_WEEK);
                if (iF2 == i3) {
                    return temporal;
                }
                return temporal.z(i3 - iF2 >= 0 ? 7 - r2 : -r2, ChronoUnit.DAYS);
        }
    }
}
