package Gf;

import Ef.C0502n;
import Ef.C0505o0;
import Ef.U;
import ef.C2515C;
import java.util.concurrent.CancellationException;

/* loaded from: classes5.dex */
public final class r implements tf.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4837a;

    /* renamed from: b, reason: collision with root package name */
    public Object f4838b;

    public /* synthetic */ r() {
        this.f4837a = 1;
    }

    @Override // tf.l
    public final Object invoke(Object obj) {
        switch (this.f4837a) {
            case 0:
                C2515C c2515c = C2515C.f34653a;
                ((C0502n) this.f4838b).resumeWith(c2515c);
                break;
            case 1:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                p0.r rVar = (p0.r) this.f4838b;
                if (rVar != null) {
                    rVar.f43171c = zBooleanValue;
                }
                break;
            case 2:
                ((U) this.f4838b).dispose();
                break;
            default:
                Throwable th = (Throwable) obj;
                if (th != null) {
                    ((C0505o0) this.f4838b).r(new CancellationException(th.getMessage()));
                }
                break;
        }
        return C2515C.f34653a;
    }

    public /* synthetic */ r(Object obj, int i5) {
        this.f4837a = i5;
        this.f4838b = obj;
    }
}
