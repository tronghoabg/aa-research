package z;

import com.unity3d.services.UnityAdsConstants;
import ef.C2515C;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;

/* loaded from: classes.dex */
public final class u extends AbstractC3343n implements tf.l {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ v f48257i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ r0.t f48258j;
    public final /* synthetic */ long k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(v vVar, r0.t tVar, long j8) {
        super(1);
        this.f48257i = vVar;
        this.f48258j = tVar;
        this.k = j8;
    }

    @Override // tf.l
    public final Object invoke(Object obj) {
        r0.s layout = (r0.s) obj;
        AbstractC3340k.e(layout, "$this$layout");
        v vVar = this.f48257i;
        long j8 = ((L0.g) vVar.f48259a.a(vVar.f48262d, new t(vVar, this.k)).getValue()).f6804a;
        int i5 = r0.v.f44314b;
        r0.s.f(this.f48258j, j8, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, r0.u.f44311j);
        return C2515C.f34653a;
    }
}
