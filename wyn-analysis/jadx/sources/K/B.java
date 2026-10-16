package K;

import ef.C2515C;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import x0.C4437g;

/* loaded from: classes.dex */
public final class B extends AbstractC3343n implements tf.l {

    /* renamed from: j, reason: collision with root package name */
    public static final B f6150j = new B(1, 0);
    public static final B k = new B(1, 1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f6151i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ B(int i5, int i10) {
        super(i5);
        this.f6151i = i10;
    }

    @Override // tf.l
    public final Object invoke(Object obj) {
        switch (this.f6151i) {
            case 0:
                C4437g semantics = (C4437g) obj;
                AbstractC3340k.e(semantics, "$this$semantics");
                break;
            default:
                z0.n it = (z0.n) obj;
                AbstractC3340k.e(it, "it");
                break;
        }
        return C2515C.f34653a;
    }
}
