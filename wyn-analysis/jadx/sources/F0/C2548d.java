package f0;

import kotlin.jvm.internal.AbstractC3343n;

/* renamed from: f0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2548d extends AbstractC3343n implements tf.l {

    /* renamed from: j, reason: collision with root package name */
    public static final C2548d f34741j = new C2548d(1, 0);
    public static final C2548d k = new C2548d(1, 1);

    /* renamed from: l, reason: collision with root package name */
    public static final C2548d f34742l = new C2548d(1, 2);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f34743i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2548d(int i5, int i10) {
        super(i5);
        this.f34743i = i10;
    }

    @Override // tf.l
    public final Object invoke(Object obj) {
        double d3;
        switch (this.f34743i) {
            case 0:
                double dDoubleValue = ((Number) obj).doubleValue();
                double dPow = dDoubleValue < 0.0d ? -dDoubleValue : dDoubleValue;
                if (dPow >= 0.0031308049535603718d) {
                    dPow = Math.pow(dPow, 0.4166666666666667d) - 0.05213270142180095d;
                    d3 = 0.9478672985781991d;
                } else {
                    d3 = 0.07739938080495357d;
                }
                return Double.valueOf(Math.copySign(dPow / d3, dDoubleValue));
            case 1:
                double dDoubleValue2 = ((Number) obj).doubleValue();
                double d5 = dDoubleValue2 < 0.0d ? -dDoubleValue2 : dDoubleValue2;
                return Double.valueOf(Math.copySign(d5 >= 0.04045d ? Math.pow((0.9478672985781991d * d5) + 0.05213270142180095d, 2.4d) : d5 * 0.07739938080495357d, dDoubleValue2));
            default:
                return Double.valueOf(((Number) obj).doubleValue());
        }
    }
}
