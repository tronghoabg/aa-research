package A;

import kotlin.jvm.internal.AbstractC3343n;

/* loaded from: classes.dex */
public final class C extends AbstractC3343n implements tf.l {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ double f13i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ double f14j;
    public final /* synthetic */ double k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(double d3, double d5, double d10) {
        super(1);
        this.f13i = d3;
        this.f14j = d5;
        this.k = d10;
    }

    @Override // tf.l
    public final Object invoke(Object obj) {
        double dDoubleValue = ((Number) obj).doubleValue();
        double d3 = this.f14j;
        double d5 = dDoubleValue * d3;
        return Double.valueOf(Math.exp(d5) * ((this.k * d3) + ((1 + d5) * this.f13i)));
    }
}
