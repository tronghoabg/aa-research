package j$.time.temporal;

/* loaded from: classes2.dex */
public final /* synthetic */ class n implements m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37691a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f37692b;

    public /* synthetic */ n(int i5, int i10) {
        this.f37691a = i10;
        this.f37692b = i5;
    }

    @Override // j$.time.temporal.m
    public final Temporal D(Temporal temporal) {
        switch (this.f37691a) {
            case 0:
                int iQ = temporal.q(a.DAY_OF_WEEK);
                int i5 = this.f37692b;
                if (iQ == i5) {
                    return temporal;
                }
                return temporal.e(iQ - i5 >= 0 ? 7 - r0 : -r0, ChronoUnit.DAYS);
            default:
                int iQ2 = temporal.q(a.DAY_OF_WEEK);
                int i10 = this.f37692b;
                if (iQ2 == i10) {
                    return temporal;
                }
                return temporal.o(i10 - iQ2 >= 0 ? 7 - r1 : -r1, ChronoUnit.DAYS);
        }
    }
}
