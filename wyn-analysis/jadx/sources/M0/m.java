package M0;

import android.view.View;
import ef.C2515C;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import x0.C4437g;

/* loaded from: classes.dex */
public final class m extends AbstractC3343n implements tf.l {

    /* renamed from: j, reason: collision with root package name */
    public static final m f7280j = new m(1, 0);
    public static final m k = new m(1, 1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f7281i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(int i5, int i10) {
        super(i5);
        this.f7281i = i10;
    }

    @Override // tf.l
    public final Object invoke(Object obj) {
        switch (this.f7281i) {
            case 0:
                C4437g semantics = (C4437g) obj;
                AbstractC3340k.e(semantics, "$this$semantics");
                break;
            default:
                AbstractC3340k.e((View) obj, "$this$null");
                break;
        }
        return C2515C.f34653a;
    }
}
