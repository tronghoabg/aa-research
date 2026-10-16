package A;

import ef.C2515C;
import kotlin.jvm.internal.AbstractC3343n;

/* loaded from: classes.dex */
public final class P extends AbstractC3343n implements tf.l {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ U f69i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ float f70j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P(U u10, float f10) {
        super(1);
        this.f69i = u10;
        this.f70j = f10;
    }

    @Override // tf.l
    public final Object invoke(Object obj) {
        long jLongValue = ((Number) obj).longValue();
        U u10 = this.f69i;
        if (!u10.d()) {
            u10.e(jLongValue, this.f70j);
        }
        return C2515C.f34653a;
    }
}
