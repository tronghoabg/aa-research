package A;

import kotlin.jvm.internal.AbstractC3343n;

/* loaded from: classes.dex */
public final class B extends AbstractC3343n implements tf.l {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f9i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ double f10j;
    public final /* synthetic */ double k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ double f11l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ double f12m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ B(double d3, double d5, double d10, double d11, int i5) {
        super(1);
        this.f9i = i5;
        this.f10j = d3;
        this.k = d5;
        this.f11l = d10;
        this.f12m = d11;
    }

    @Override // tf.l
    public final Object invoke(Object obj) {
        switch (this.f9i) {
            case 0:
                double dDoubleValue = ((Number) obj).doubleValue();
                return Double.valueOf((Math.exp(this.f11l * dDoubleValue) * ((this.k * dDoubleValue) + this.f10j)) + this.f12m);
            default:
                double dDoubleValue2 = ((Number) obj).doubleValue();
                double d3 = this.f10j;
                double d5 = this.k;
                double dExp = Math.exp(d5 * dDoubleValue2) * d3 * d5;
                double d10 = this.f11l;
                double d11 = this.f12m;
                return Double.valueOf((Math.exp(d11 * dDoubleValue2) * d10 * d11) + dExp);
        }
    }
}
