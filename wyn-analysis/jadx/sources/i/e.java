package I;

import ef.C2515C;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import tf.l;
import z0.n;

/* loaded from: classes.dex */
public final class e extends AbstractC3343n implements l {

    /* renamed from: j, reason: collision with root package name */
    public static final e f5251j = new e(1, 0);
    public static final e k = new e(1, 1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f5252i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i5, int i10) {
        super(i5);
        this.f5252i = i10;
    }

    @Override // tf.l
    public final Object invoke(Object obj) {
        switch (this.f5252i) {
            case 0:
                return Long.valueOf(((Number) obj).longValue());
            default:
                n it = (n) obj;
                AbstractC3340k.e(it, "it");
                return C2515C.f34653a;
        }
    }
}
