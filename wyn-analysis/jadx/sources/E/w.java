package E;

import com.unity3d.services.UnityAdsConstants;
import ef.C2515C;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;

/* loaded from: classes.dex */
public final class w extends AbstractC3343n implements tf.l {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f2775i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ r0.t f2776j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(r0.t tVar, int i5) {
        super(1);
        this.f2775i = i5;
        this.f2776j = tVar;
    }

    @Override // tf.l
    public final Object invoke(Object obj) {
        switch (this.f2775i) {
            case 0:
                r0.s layout = (r0.s) obj;
                AbstractC3340k.e(layout, "$this$layout");
                r0.s.c(layout, this.f2776j, 0, 0);
                break;
            case 1:
                r0.s layout2 = (r0.s) obj;
                AbstractC3340k.e(layout2, "$this$layout");
                r0.s.c(layout2, this.f2776j, 0, 0);
                break;
            case 2:
                r0.s layout3 = (r0.s) obj;
                AbstractC3340k.e(layout3, "$this$layout");
                r0.s.c(layout3, this.f2776j, 0, 0);
                break;
            case 3:
                r0.t tVar = this.f2776j;
                ((r0.s) obj).getClass();
                r0.s.a(tVar, 0, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                break;
            case 4:
                r0.s.c((r0.s) obj, this.f2776j, 0, 0);
                break;
            case 5:
                r0.s layout4 = (r0.s) obj;
                AbstractC3340k.e(layout4, "$this$layout");
                r0.s.c(layout4, this.f2776j, 0, 0);
                break;
            case 6:
                r0.s layout5 = (r0.s) obj;
                AbstractC3340k.e(layout5, "$this$layout");
                r0.s.d(layout5, this.f2776j);
                break;
            default:
                r0.s layout6 = (r0.s) obj;
                AbstractC3340k.e(layout6, "$this$layout");
                r0.s.c(layout6, this.f2776j, 0, 0);
                break;
        }
        return C2515C.f34653a;
    }
}
