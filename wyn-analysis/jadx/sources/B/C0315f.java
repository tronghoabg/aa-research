package B;

import com.unity3d.services.UnityAdsConstants;
import e0.AbstractC2461m;
import ef.C2515C;
import g0.AbstractC2662c;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;

/* renamed from: B.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0315f extends AbstractC3343n implements tf.l {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ AbstractC2461m f1421i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ long f1422j;
    public final /* synthetic */ long k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AbstractC2662c f1423l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0315f(AbstractC2461m abstractC2461m, long j8, long j10, AbstractC2662c abstractC2662c) {
        super(1);
        this.f1421i = abstractC2461m;
        this.f1422j = j8;
        this.k = j10;
        this.f1423l = abstractC2662c;
    }

    @Override // tf.l
    public final Object invoke(Object obj) {
        t0.v onDrawWithContent = (t0.v) obj;
        AbstractC3340k.e(onDrawWithContent, "$this$onDrawWithContent");
        onDrawWithContent.a();
        com.google.android.gms.internal.consent_sdk.a.f(onDrawWithContent, this.f1421i, this.f1422j, this.k, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.f1423l, 104);
        return C2515C.f34653a;
    }
}
