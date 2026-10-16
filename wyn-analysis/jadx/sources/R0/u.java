package r0;

import e0.C2439B;
import ef.C2515C;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;

/* loaded from: classes.dex */
public final class u extends AbstractC3343n implements tf.l {

    /* renamed from: j, reason: collision with root package name */
    public static final u f44311j = new u(1, 0);
    public static final u k = new u(1, 1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f44312i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(int i5, int i10) {
        super(i5);
        this.f44312i = i10;
    }

    @Override // tf.l
    public final Object invoke(Object obj) {
        switch (this.f44312i) {
            case 0:
                AbstractC3340k.e((C2439B) obj, "$this$null");
                break;
            default:
                s layout = (s) obj;
                AbstractC3340k.e(layout, "$this$layout");
                break;
        }
        return C2515C.f34653a;
    }
}
