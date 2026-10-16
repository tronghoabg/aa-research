package com.bytedance.sdk.openadsdk.api.banner;

import android.content.Context;
import com.bytedance.sdk.openadsdk.utils.yo;
import com.vungle.ads.internal.protos.Sdk;

/* loaded from: classes3.dex */
public final class PAGBannerSize {
    private int moa;

    /* renamed from: oa, reason: collision with root package name */
    private int f25270oa;
    private int uef;
    private int yo = 1;
    public static final PAGBannerSize BANNER_W_320_H_50 = new PAGBannerSize(Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 50);
    public static final PAGBannerSize BANNER_W_300_H_250 = new PAGBannerSize(300, 250);
    public static final PAGBannerSize BANNER_W_728_H_90 = new PAGBannerSize(728, 90);

    public PAGBannerSize(int i5, int i10) {
        this.uef = i5;
        this.f25270oa = i10;
    }

    public static PAGBannerSize getCurrentOrientationAnchoredAdaptiveBannerAdSize(Context context, int i5) {
        int iUef = yo.uef(context, i5, 0);
        if (iUef == yo.uef) {
            return new PAGBannerSize(-1, -1);
        }
        PAGBannerSize pAGBannerSize = new PAGBannerSize(i5, iUef);
        pAGBannerSize.yo = 2;
        return pAGBannerSize;
    }

    public static PAGBannerSize getCurrentOrientationInlineAdaptiveBannerAdSize(Context context, int i5) {
        int iUef = yo.uef(context, 0);
        if (iUef == yo.uef) {
            return new PAGBannerSize(-1, -1);
        }
        PAGBannerSize pAGBannerSize = new PAGBannerSize(i5, 0);
        pAGBannerSize.moa = iUef;
        pAGBannerSize.yo = 3;
        return pAGBannerSize;
    }

    public static PAGBannerSize getInlineAdaptiveBannerAdSize(int i5, int i10) {
        PAGBannerSize pAGBannerSize = new PAGBannerSize(i5, 0);
        pAGBannerSize.moa = i10;
        pAGBannerSize.yo = 3;
        return pAGBannerSize;
    }

    public int getHeight() {
        return this.f25270oa;
    }

    public int getMaxHeight() {
        return this.moa;
    }

    public int getType() {
        return this.yo;
    }

    public int getWidth() {
        return this.uef;
    }
}
