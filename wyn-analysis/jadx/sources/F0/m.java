package f0;

import kotlin.jvm.internal.AbstractC3343n;

/* loaded from: classes.dex */
public final class m extends AbstractC3343n implements tf.l {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f34780i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ n f34781j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(n nVar, int i5) {
        super(1);
        this.f34780i = i5;
        this.f34781j = nVar;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [kotlin.jvm.internal.n, tf.l] */
    /* JADX WARN: Type inference failed for: r6v0, types: [kotlin.jvm.internal.n, tf.l] */
    @Override // tf.l
    public final Object invoke(Object obj) {
        switch (this.f34780i) {
            case 0:
                double dDoubleValue = ((Number) obj).doubleValue();
                return (Double) this.f34781j.f34790m.invoke(Double.valueOf(android.support.v4.media.session.b.Q(dDoubleValue, r8.f34783e, r8.f34784f)));
            default:
                double dDoubleValue2 = ((Number) obj).doubleValue();
                return Double.valueOf(android.support.v4.media.session.b.Q(((Number) this.f34781j.k.invoke(Double.valueOf(dDoubleValue2))).doubleValue(), r8.f34783e, r8.f34784f));
        }
    }
}
