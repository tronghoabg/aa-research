package j$.time.temporal;

/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class l implements j$.time.temporal.k {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;

    public /* synthetic */ l(int i, byte b) {
        this.a = b;
        this.b = i;
    }

    @Override // j$.time.temporal.k
    public final j$.time.temporal.Temporal p(j$.time.temporal.Temporal temporal) {
        byte b = this.a;
        int i = this.b;
        switch (b) {
            case 0:
                int iH = temporal.h(j$.time.temporal.a.DAY_OF_WEEK);
                if (iH == i) {
                    return temporal;
                }
                int i2 = iH - i;
                return temporal.b(i2 >= 0 ? 7 - i2 : -i2, j$.time.temporal.ChronoUnit.DAYS);
            default:
                int iH2 = temporal.h(j$.time.temporal.a.DAY_OF_WEEK);
                if (iH2 == i) {
                    return temporal;
                }
                int i3 = i - iH2;
                return temporal.y(i3 >= 0 ? 7 - i3 : -i3, j$.time.temporal.ChronoUnit.DAYS);
        }
    }
}
