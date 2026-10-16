package com.bytedance.sdk.openadsdk.uef.oa;

import android.content.Context;
import android.util.Pair;
import android.view.View;
import com.bykv.vk.openvk.uef.uef.uef.moa.yo;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.core.bs;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.core.sy;
import com.bytedance.sdk.openadsdk.core.wk.oa.ivm;
import com.bytedance.sdk.openadsdk.oib.yo.uef;
import com.bytedance.sdk.openadsdk.utils.gb;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import java.util.List;

/* loaded from: classes3.dex */
public class oa extends bcc implements yo.moa, yo.InterfaceC0033yo, uef.InterfaceC0131uef {
    private yo bcc;
    private long cq;
    private final com.bytedance.sdk.openadsdk.oib.yo.uef cz;
    private boolean dj;
    private AdSlot wrv;
    private boolean zjm;

    public oa(Context context, gzw gzwVar, int i5, AdSlot adSlot) {
        super(context, gzwVar, i5, true);
        this.zjm = false;
        this.dj = true;
        this.lw = i5;
        this.wrv = adSlot;
        this.cz = new com.bytedance.sdk.openadsdk.oib.yo.uef();
        uef(this.ivm);
        uef("embeded_ad");
        this.moa.uef(this);
    }

    @Override // com.bykv.vk.openvk.uef.uef.uef.moa.yo.InterfaceC0033yo
    public void h_() {
        yo yoVar = this.bcc;
        if (yoVar != null) {
            yoVar.uef(this);
        }
    }

    @Override // com.bykv.vk.openvk.uef.uef.uef.moa.yo.InterfaceC0033yo
    public void i_() {
        yo yoVar = this.bcc;
        if (yoVar != null) {
            yoVar.oa(this);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.oib.yo.uef.InterfaceC0131uef
    public com.bytedance.sdk.openadsdk.oib.yo.uef ivm() {
        return this.cz;
    }

    @Override // com.bykv.vk.openvk.uef.uef.uef.moa.yo.InterfaceC0033yo
    public void j_() {
    }

    @Override // com.bykv.vk.openvk.uef.uef.uef.moa.yo.InterfaceC0033yo
    public void k_() {
        yo yoVar = this.bcc;
        if (yoVar != null) {
            yoVar.yo(this);
        }
    }

    public View lw() {
        com.bytedance.sdk.openadsdk.core.wk.oa.ivm ivmVar;
        gzw gzwVar = this.f26109oa;
        if (gzwVar != null && this.yo != null) {
            if (gzw.lw(gzwVar)) {
                try {
                    ivmVar = new com.bytedance.sdk.openadsdk.core.wk.oa.ivm(this.yo, this.f26109oa, this.uef.uef());
                    gzw gzwVar2 = this.f26109oa;
                    if (gzwVar2 != null && gzwVar2.ebe()) {
                        com.bytedance.sdk.openadsdk.core.dz.ivm ivmVarUef = ivmVar.uef((List<Pair<View, FriendlyObstructionPurpose>>) null);
                        uef uefVar = this.moa;
                        if (uefVar != null) {
                            uefVar.uef(ivmVarUef);
                        }
                    }
                    this.uef.uef(ivmVar.getNativeVideoController());
                    uef uefVar2 = this.moa;
                    if (uefVar2 != null) {
                        uefVar2.uef(ivmVar);
                    }
                    ivmVar.setVideoAdClickListenerTTNativeAd(this);
                    ivmVar.setAdCreativeClickListener(new ivm.uef() { // from class: com.bytedance.sdk.openadsdk.uef.oa.oa.1
                        @Override // com.bytedance.sdk.openadsdk.core.wk.oa.ivm.uef
                        public void uef(View view, int i5) {
                            bs bsVar = oa.this.uef;
                            if (bsVar != null) {
                                bsVar.uef(view, i5);
                            }
                        }
                    });
                    ivmVar.setControllerStatusCallBack(new ivm.oa() { // from class: com.bytedance.sdk.openadsdk.uef.oa.oa.2
                        @Override // com.bytedance.sdk.openadsdk.core.wk.oa.ivm.oa
                        public void uef(boolean z2, long j8, long j10, long j11, boolean z10) {
                            oa.this.cz.uef = z2;
                            oa.this.cz.lw = j8;
                            oa.this.cz.ivm = j10;
                            oa.this.cz.xs = j11;
                            oa.this.cz.moa = z10;
                        }
                    });
                    ivmVar.setVideoAdLoadListener(this);
                    ivmVar.setVideoAdInteractionListener(this);
                    if (5 == this.lw) {
                        ivmVar.setIsAutoPlay(this.zjm ? this.wrv.isAutoPlay() : this.dj);
                    } else {
                        ivmVar.setIsAutoPlay(this.dj);
                    }
                    ivmVar.uef(sy.moa().yo(String.valueOf(this.ivm)), "feedGetAdView");
                } catch (Exception e7) {
                    ApmHelper.reportCustomError("", "getAdView null", e7);
                }
                if (!gzw.lw(this.f26109oa) && ivmVar != null && ivmVar.uef(0L, true, false)) {
                    return ivmVar;
                }
                ApmHelper.reportCustomError(this.f26109oa.hw() + "," + ivmVar, "getAdView null", new RuntimeException());
            } else {
                ivmVar = null;
                if (!gzw.lw(this.f26109oa)) {
                }
                ApmHelper.reportCustomError(this.f26109oa.hw() + "," + ivmVar, "getAdView null", new RuntimeException());
            }
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.uef.oa.bcc, com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd
    public void showPrivacyActivity() {
        uef uefVar = this.moa;
        if (uefVar != null) {
            uefVar.wrv();
        }
    }

    private void uef(int i5) {
        int iOa = sy.moa().oa(i5);
        int iYo = com.bytedance.sdk.component.utils.sy.yo(sy.uef());
        if (3 == iOa) {
            this.zjm = false;
            this.dj = false;
        } else {
            if (1 == iOa && gb.moa(iYo)) {
                this.zjm = false;
            } else if (2 == iOa) {
                if (gb.lw(iYo) || gb.moa(iYo) || gb.ivm(iYo)) {
                    this.zjm = false;
                }
            } else if (4 == iOa) {
                this.zjm = true;
            } else if (5 == iOa && (gb.moa(iYo) || gb.ivm(iYo))) {
            }
            this.dj = true;
        }
        uef uefVar = this.moa;
        if (uefVar != null) {
            uefVar.uef(this.zjm);
        }
    }

    public oa(Context context, gzw gzwVar, int i5, AdSlot adSlot, uef uefVar, bs bsVar) {
        super(context, gzwVar, i5, false);
        this.zjm = false;
        this.dj = true;
        this.moa = uefVar;
        this.uef = bsVar;
        this.lw = i5;
        this.wrv = adSlot;
        this.cz = new com.bytedance.sdk.openadsdk.oib.yo.uef();
        uef(this.ivm);
        uef("embeded_ad");
        uefVar.uef(this);
    }

    public void uef(yo yoVar) {
        this.bcc = yoVar;
    }

    @Override // com.bykv.vk.openvk.uef.uef.uef.moa.yo.moa
    public void uef(int i5, int i10) {
        yo yoVar = this.bcc;
        if (yoVar != null) {
            yoVar.uef(i5, i10);
        }
    }

    @Override // com.bykv.vk.openvk.uef.uef.uef.moa.yo.InterfaceC0033yo
    public void uef(long j8, long j10) {
        this.cq = j8;
    }

    @Override // com.bytedance.sdk.openadsdk.uef.oa.bcc
    public void uef(String str) {
        super.uef(str);
    }
}
