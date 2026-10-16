package f0;

import kotlin.jvm.internal.AbstractC3343n;

/* loaded from: classes.dex */
public final class l extends AbstractC3343n implements tf.l {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f34778i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ double f34779j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(double d3, int i5) {
        super(1);
        this.f34778i = i5;
        this.f34779j = d3;
    }

    @Override // tf.l
    public final Object invoke(Object obj) {
        switch (this.f34778i) {
            case 0:
                double dDoubleValue = ((Number) obj).doubleValue();
                if (dDoubleValue < 0.0d) {
                    dDoubleValue = 0.0d;
                }
                return Double.valueOf(Math.pow(dDoubleValue, 1.0d / this.f34779j));
            default:
                double dDoubleValue2 = ((Number) obj).doubleValue();
                if (dDoubleValue2 < 0.0d) {
                    dDoubleValue2 = 0.0d;
                }
                return Double.valueOf(Math.pow(dDoubleValue2, this.f34779j));
        }
    }
}
