package com.bytedance.sdk.openadsdk.uef.oa;

import android.view.View;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGImageItem;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData;
import com.bytedance.sdk.openadsdk.core.model.gzw;

/* loaded from: classes3.dex */
public class moa implements PAGNativeAdData {
    private final uef uef;

    public moa(uef uefVar) {
        this.uef = uefVar;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData
    public View getAdChoicesView() {
        uef uefVar = this.uef;
        if (uefVar != null) {
            return uefVar.dj();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData
    public View getAdLogoView() {
        uef uefVar = this.uef;
        if (uefVar != null) {
            return uefVar.zjm();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData
    public String getButtonText() {
        uef uefVar = this.uef;
        if (uefVar != null) {
            return uefVar.ivm();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData
    public String getDescription() {
        uef uefVar = this.uef;
        if (uefVar != null) {
            return uefVar.lw();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData
    public PAGImageItem getIcon() {
        uef uefVar = this.uef;
        if (uefVar != null) {
            return uefVar.yo();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData
    public PAGNativeAdData.PAGNativeMediaType getMediaType() {
        return gzw.lw(this.uef.uef) ? PAGNativeAdData.PAGNativeMediaType.PAGNativeMediaTypeVideo : PAGNativeAdData.PAGNativeMediaType.PAGNativeMediaTypeImage;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData
    public PAGMediaView getMediaView() {
        uef uefVar = this.uef;
        if (uefVar != null) {
            return uefVar.xs();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData
    public String getTitle() {
        uef uefVar = this.uef;
        if (uefVar != null) {
            return uefVar.moa();
        }
        return null;
    }
}
