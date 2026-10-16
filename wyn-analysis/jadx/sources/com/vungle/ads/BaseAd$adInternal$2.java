package com.vungle.ads;

import com.vungle.ads.internal.s;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3343n;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/vungle/ads/internal/s;", "invoke", "()Lcom/vungle/ads/internal/s;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
/* loaded from: classes5.dex */
public final class BaseAd$adInternal$2 extends AbstractC3343n implements tf.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BaseAd f32787a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseAd$adInternal$2(BaseAd baseAd) {
        super(0);
        this.f32787a = baseAd;
    }

    @Override // tf.a
    @NotNull
    public final s invoke() {
        BaseAd baseAd = this.f32787a;
        s sVarConstructAdInternal$vungle_ads_release = baseAd.constructAdInternal$vungle_ads_release(baseAd.getContext());
        sVarConstructAdInternal$vungle_ads_release.f33625m = this.f32787a.getLogEntry();
        return sVarConstructAdInternal$vungle_ads_release;
    }
}
