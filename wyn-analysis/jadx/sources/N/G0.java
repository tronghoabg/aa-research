package N;

import ef.C2515C;
import kotlin.jvm.internal.AbstractC3343n;
import x.C4425r;

/* loaded from: classes.dex */
public final class G0 extends AbstractC3343n implements tf.l {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f7694i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C4425r f7695j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ G0(C4425r c4425r, int i5) {
        super(1);
        this.f7694i = i5;
        this.f7695j = c4425r;
    }

    @Override // tf.l
    public final Object invoke(Object obj) {
        switch (this.f7694i) {
            case 0:
                if (obj instanceof X.z) {
                    ((X.z) obj).h(4);
                }
                this.f7695j.a(obj);
                return C2515C.f34653a;
            default:
                return obj == this.f7695j ? "(this)" : String.valueOf(obj);
        }
    }
}
