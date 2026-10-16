package E;

import com.unity3d.services.UnityAdsConstants;
import ef.C2515C;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import vf.AbstractC4345a;

/* loaded from: classes.dex */
public final class A extends AbstractC3343n implements tf.l {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f2662i = 1;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f2663j;
    public final /* synthetic */ r0.t k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f2664l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(int i5, r0.t tVar, int i10) {
        super(1);
        this.f2663j = i5;
        this.k = tVar;
        this.f2664l = i10;
    }

    @Override // tf.l
    public final Object invoke(Object obj) {
        switch (this.f2662i) {
            case 0:
                r0.s layout = (r0.s) obj;
                AbstractC3340k.e(layout, "$this$layout");
                r0.s.a(this.k, this.f2663j, this.f2664l, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                break;
            default:
                r0.s layout2 = (r0.s) obj;
                AbstractC3340k.e(layout2, "$this$layout");
                r0.s.a(this.k, AbstractC4345a.H((this.f2663j - r5.f44307a) / 2.0f), AbstractC4345a.H((this.f2664l - r5.f44308b) / 2.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                break;
        }
        return C2515C.f34653a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(r0.t tVar, int i5, int i10) {
        super(1);
        this.k = tVar;
        this.f2663j = i5;
        this.f2664l = i10;
    }
}
