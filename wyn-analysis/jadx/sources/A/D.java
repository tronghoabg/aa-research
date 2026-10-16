package A;

import kotlin.jvm.internal.AbstractC3343n;

/* loaded from: classes.dex */
public final class D extends AbstractC3343n implements tf.l {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ double f15i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ double f16j;
    public final /* synthetic */ double k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ double f17l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ double f18m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(double d3, double d5, double d10, double d11, double d12) {
        super(1);
        this.f15i = d3;
        this.f16j = d5;
        this.k = d10;
        this.f17l = d11;
        this.f18m = d12;
    }

    @Override // tf.l
    public final Object invoke(Object obj) {
        double dDoubleValue = ((Number) obj).doubleValue();
        return Double.valueOf((Math.exp(this.f17l * dDoubleValue) * this.k) + (Math.exp(this.f16j * dDoubleValue) * this.f15i) + this.f18m);
    }
}
