package f0;

import kotlin.jvm.internal.AbstractC3343n;

/* loaded from: classes.dex */
public final class k extends AbstractC3343n implements tf.l {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f34776i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ o f34777j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(o oVar, int i5) {
        super(1);
        this.f34776i = i5;
        this.f34777j = oVar;
    }

    @Override // tf.l
    public final Object invoke(Object obj) {
        switch (this.f34776i) {
            case 0:
                double dDoubleValue = ((Number) obj).doubleValue();
                o oVar = this.f34777j;
                double d3 = oVar.f34797e;
                double d5 = oVar.f34796d;
                return Double.valueOf(dDoubleValue >= d3 * d5 ? (Math.pow(dDoubleValue, 1.0d / oVar.f34793a) - oVar.f34795c) / oVar.f34794b : dDoubleValue / d5);
            default:
                double dDoubleValue2 = ((Number) obj).doubleValue();
                o oVar2 = this.f34777j;
                return Double.valueOf(dDoubleValue2 >= oVar2.f34797e ? Math.pow((oVar2.f34794b * dDoubleValue2) + oVar2.f34795c, oVar2.f34793a) : dDoubleValue2 * oVar2.f34796d);
        }
    }
}
