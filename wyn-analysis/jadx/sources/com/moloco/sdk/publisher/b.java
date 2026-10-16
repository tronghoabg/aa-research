package com.moloco.sdk.publisher;

import android.widget.FrameLayout;
import com.moloco.sdk.publisher.MolocoAdError;
import tf.p;

/* loaded from: classes4.dex */
public final /* synthetic */ class b implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29815a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FrameLayout f29816b;

    public /* synthetic */ b(FrameLayout frameLayout, int i5) {
        this.f29815a = i5;
        this.f29816b = frameLayout;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        Banner banner = (Banner) obj;
        MolocoAdError.AdCreateError adCreateError = (MolocoAdError.AdCreateError) obj2;
        switch (this.f29815a) {
            case 0:
                return MolocoSamplesKt.MolocoCreateMREC$lambda$4(this.f29816b, banner, adCreateError);
            case 1:
                return MolocoSamplesKt.MolocoCreateBanner$lambda$2(this.f29816b, banner, adCreateError);
            default:
                return MolocoSamplesKt.MolocoCreateBannerTablet$lambda$3(this.f29816b, banner, adCreateError);
        }
    }
}
