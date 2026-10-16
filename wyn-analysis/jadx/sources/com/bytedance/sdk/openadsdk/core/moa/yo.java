package com.bytedance.sdk.openadsdk.core.moa;

import android.content.Context;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdWrapperListener;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.core.zjm.dhk;
import com.bytedance.sdk.openadsdk.core.zjm.tpx;
import com.bytedance.sdk.openadsdk.gsd.oa.lw;

/* loaded from: classes3.dex */
public class yo extends moa {
    private com.bytedance.sdk.openadsdk.uef.uef.oa bcc;
    private int cz;
    private int zjm;

    public yo(Context context, gzw gzwVar, AdSlot adSlot, boolean z2) {
        super(context, gzwVar, adSlot, z2);
        this.cz = 1;
        this.zjm = -1;
    }

    public com.bytedance.sdk.openadsdk.oib.yo.uef getVideoModel() {
        tpx tpxVar = this.f25644oa;
        if (tpxVar != null) {
            return ((dhk) tpxVar).getVideoModel();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.core.moa.moa
    public void moa() {
        com.bytedance.sdk.openadsdk.core.wk.oa.yo videoController;
        tpx tpxVar = this.f25644oa;
        if ((tpxVar instanceof dhk) && (videoController = ((dhk) tpxVar).getVideoController()) != null) {
            this.cz = videoController.gb();
        }
        super.moa();
    }

    @Override // com.bytedance.sdk.openadsdk.core.moa.moa
    public void yo() {
        dhk dhkVar = new dhk(this.uef, this.yo, this.moa, this.ivm, this.xs) { // from class: com.bytedance.sdk.openadsdk.core.moa.yo.1
            @Override // com.bytedance.sdk.openadsdk.core.zjm.tpx
            public lw.uef yo(int i5) {
                return yo.this.uef(super.yo(i5));
            }
        };
        this.f25644oa = dhkVar;
        com.bytedance.sdk.openadsdk.core.wk.oa.yo videoController = dhkVar.getVideoController();
        if (videoController != null) {
            videoController.moa(this.cz);
        }
        addView(this.f25644oa, new ViewGroup.LayoutParams(-1, -1));
        PAGBannerAdWrapperListener pAGBannerAdWrapperListener = this.lw;
        if (pAGBannerAdWrapperListener != null) {
            setExpressInteractionListener(pAGBannerAdWrapperListener);
        }
        tpx tpxVar = this.f25644oa;
        if (tpxVar != null) {
            ((dhk) tpxVar).setVideoAdListener(new com.bytedance.sdk.openadsdk.uef.oa.yo() { // from class: com.bytedance.sdk.openadsdk.core.moa.yo.2
                @Override // com.bytedance.sdk.openadsdk.uef.oa.yo
                public void oa(PAGNativeAd pAGNativeAd) {
                }

                @Override // com.bytedance.sdk.openadsdk.uef.oa.yo
                public void uef(int i5, int i10) {
                }

                @Override // com.bytedance.sdk.openadsdk.uef.oa.yo
                public void yo(PAGNativeAd pAGNativeAd) {
                    if (yo.this.bcc != null) {
                        yo.this.bcc.uef();
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.uef.oa.yo
                public void uef(PAGNativeAd pAGNativeAd) {
                    if (yo.this.zjm == 3) {
                        yo yoVar = yo.this;
                        yoVar.uef(yoVar.bcc);
                    } else if (yo.this.zjm == 2) {
                        yo.this.uef();
                    }
                }
            });
        }
    }

    public void oa() {
        tpx tpxVar = this.f25644oa;
        if (tpxVar != null) {
            ((dhk) tpxVar).sy();
        }
    }

    public void uef(com.bytedance.sdk.openadsdk.uef.uef.oa oaVar) {
        tpx tpxVar = this.f25644oa;
        if (tpxVar != null) {
            ((dhk) tpxVar).bs();
            this.bcc = oaVar;
            this.zjm = 3;
        }
    }

    public void uef() {
        tpx tpxVar = this.f25644oa;
        if (tpxVar != null) {
            ((dhk) tpxVar).ab();
            this.zjm = 2;
        }
    }
}
