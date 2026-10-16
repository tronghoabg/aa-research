package j$.time.temporal;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class m implements l {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;

    public /* synthetic */ m(int i, byte b) {
        this.a = b;
        this.b = i;
    }

    @Override // j$.time.temporal.l
    public final Temporal p(Temporal temporal) {
        byte b = this.a;
        int i = this.b;
        switch (b) {
            case 0:
                int iH = temporal.h(a.DAY_OF_WEEK);
                if (iH == i) {
                    return temporal;
                }
                return temporal.b(iH - i >= 0 ? 7 - r0 : -r0, ChronoUnit.DAYS);
            default:
                int iH2 = temporal.h(a.DAY_OF_WEEK);
                if (iH2 == i) {
                    return temporal;
                }
                return temporal.y(i - iH2 >= 0 ? 7 - r2 : -r2, ChronoUnit.DAYS);
        }
    }
}
