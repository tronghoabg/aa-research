package z;

import com.unity3d.services.UnityAdsConstants;
import ef.C2515C;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;

/* renamed from: z.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4607l extends AbstractC3343n implements tf.l {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ r0.t f48234i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ long f48235j;
    public final /* synthetic */ long k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4607l(r0.t tVar, long j8, long j10) {
        super(1);
        this.f48234i = tVar;
        this.f48235j = j8;
        this.k = j10;
    }

    @Override // tf.l
    public final Object invoke(Object obj) {
        r0.s layout = (r0.s) obj;
        AbstractC3340k.e(layout, "$this$layout");
        int i5 = L0.g.f6803c;
        long j8 = this.f48235j;
        long j10 = this.k;
        r0.s.a(this.f48234i, ((int) (j8 >> 32)) + ((int) (j10 >> 32)), ((int) (j8 & 4294967295L)) + ((int) (j10 & 4294967295L)), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        return C2515C.f34653a;
    }
}
