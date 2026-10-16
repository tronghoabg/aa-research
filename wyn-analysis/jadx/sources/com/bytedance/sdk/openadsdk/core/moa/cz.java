package com.bytedance.sdk.openadsdk.core.moa;

import android.content.Context;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bykv.vk.openvk.uef.uef.uef.moa.yo;
import com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract;
import com.bytedance.sdk.openadsdk.activity.single.TTDelegateActivity;
import com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.model.ab;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.core.sy;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.wrv;
import com.bytedance.sdk.openadsdk.core.wk.oa.ivm;
import com.bytedance.sdk.openadsdk.core.zjm.oib;
import com.bytedance.sdk.openadsdk.core.zjm.tpx;
import com.bytedance.sdk.openadsdk.utils.af;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public class cz extends com.bytedance.sdk.openadsdk.core.zjm.uef implements yo.moa, yo.InterfaceC0033yo {

    /* renamed from: ab, reason: collision with root package name */
    private long f25640ab;
    private PAGBannerAdWrapperListener bs;
    private com.bytedance.sdk.openadsdk.tpx.uef.uef.yo cq;
    private com.bytedance.sdk.openadsdk.core.wk.oa.ivm dz;
    public boolean uef;
    private String wk;
    private tpx wrv;

    public static class uef {
        public com.bytedance.sdk.openadsdk.core.ivm.moa lw;
        public PAGLogoView moa;

        /* renamed from: oa, reason: collision with root package name */
        public wrv f25641oa;
        public FrameLayout uef;
        public com.bytedance.sdk.openadsdk.core.ivm.moa yo;

        private uef() {
        }
    }

    public cz(Context context) {
        super(context);
        this.uef = true;
        this.f25872oa = context;
    }

    private void lw() {
        oib oibVarUef = oa.uef(this.wrv.getExpectExpressWidth(), this.wrv.getExpectExpressHeight());
        if (this.wrv.getExpectExpressWidth() <= 0 || this.wrv.getExpectExpressHeight() <= 0) {
            int iYo = af.yo(this.f25872oa);
            this.xs = iYo;
            this.bcc = Float.valueOf(iYo / oibVarUef.f25864oa).intValue();
        } else {
            this.xs = af.oa(this.f25872oa, this.wrv.getExpectExpressWidth());
            this.bcc = af.oa(this.f25872oa, this.wrv.getExpectExpressHeight());
        }
        int i5 = this.xs;
        if (i5 > 0 && i5 > af.yo(this.f25872oa)) {
            this.xs = af.yo(this.f25872oa);
            this.bcc = Float.valueOf(this.bcc * (af.yo(this.f25872oa) / this.xs)).intValue();
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(this.xs, this.bcc);
        }
        layoutParams.width = this.xs;
        layoutParams.height = this.bcc;
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            ((FrameLayout.LayoutParams) layoutParams).gravity = 17;
        }
        setLayoutParams(layoutParams);
        uef(oibVarUef);
    }

    public long getVideoProgress() {
        return this.f25640ab;
    }

    @Override // com.bykv.vk.openvk.uef.uef.uef.moa.yo.InterfaceC0033yo
    public void h_() {
    }

    @Override // com.bykv.vk.openvk.uef.uef.uef.moa.yo.InterfaceC0033yo
    public void i_() {
    }

    @Override // com.bykv.vk.openvk.uef.uef.uef.moa.yo.InterfaceC0033yo
    public void j_() {
    }

    @Override // com.bykv.vk.openvk.uef.uef.uef.moa.yo.InterfaceC0033yo
    public void k_() {
    }

    public void setAdInteractionListener(PAGBannerAdWrapperListener pAGBannerAdWrapperListener) {
        this.bs = pAGBannerAdWrapperListener;
    }

    public void setClosedListenerKey(String str) {
        this.wk = str;
    }

    @Override // com.bykv.vk.openvk.uef.uef.uef.moa.yo.moa
    public void uef(int i5, int i10) {
    }

    private uef oa(oib oibVar) {
        uef uefVar = new uef();
        uefVar.uef = new FrameLayout(this.f25872oa);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -2);
        layoutParams.width = -1;
        layoutParams.height = -1;
        uefVar.uef.setLayoutParams(layoutParams);
        uefVar.f25641oa = new wrv(this.f25872oa);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -1);
        layoutParams2.gravity = 17;
        uefVar.f25641oa.setLayoutParams(layoutParams2);
        uefVar.uef.addView(uefVar.f25641oa);
        int iOa = af.oa(this.f25872oa, 5.0f);
        if (oibVar == null || oibVar.uef != 1) {
            uefVar.yo = com.bytedance.sdk.openadsdk.core.widget.ivm.oa(getContext());
        } else {
            uefVar.yo = com.bytedance.sdk.openadsdk.core.widget.ivm.uef(getContext());
        }
        uefVar.yo.setId(520093697);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 8388613;
        layoutParams3.setMargins(iOa, iOa, iOa, iOa);
        uefVar.yo.setLayoutParams(layoutParams3);
        uefVar.uef.addView(uefVar.yo);
        uefVar.moa = PAGLogoView.createPAGLogoViewByMaterial(this.f25872oa, this.yo);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams4.gravity = 8388691;
        layoutParams4.setMargins(iOa, iOa, iOa, iOa);
        uefVar.moa.setLayoutParams(layoutParams4);
        uefVar.uef.addView(uefVar.moa);
        uefVar.lw = new com.bytedance.sdk.openadsdk.core.ivm.moa(this.f25872oa);
        int iOa2 = af.oa(this.f25872oa, 11.0f);
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(iOa2, iOa2);
        layoutParams5.gravity = 8388693;
        layoutParams5.rightMargin = iOa;
        layoutParams5.bottomMargin = iOa;
        uefVar.lw.setVisibility(8);
        uefVar.lw.setScaleType(ImageView.ScaleType.FIT_CENTER);
        uefVar.lw.setLayoutParams(layoutParams5);
        uefVar.uef.addView(uefVar.lw);
        return uefVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.zjm.uef
    public void uef(View view, int i5, ab abVar) {
        tpx tpxVar = this.wrv;
        if (tpxVar != null) {
            tpxVar.uef(view, i5, abVar);
            com.bytedance.sdk.openadsdk.core.wk.oa.ivm ivmVar = this.dz;
            if (ivmVar == null || !(ivmVar.getNativeVideoController() instanceof com.bytedance.sdk.openadsdk.core.wk.oa.yo)) {
                return;
            }
            this.dz.getNativeVideoController().km();
        }
    }

    public void uef(gzw gzwVar, tpx tpxVar, com.bytedance.sdk.openadsdk.tpx.uef.uef.yo yoVar) {
        setBackgroundColor(-16777216);
        this.yo = gzwVar;
        this.wrv = tpxVar;
        this.cq = yoVar;
        this.ivm = "banner_ad";
        tpxVar.addView(this, new ViewGroup.LayoutParams(-2, -2));
        lw();
    }

    private void uef(oib oibVar) {
        View view;
        gzw gzwVar = this.yo;
        if (gzwVar != null) {
            int iHw = gzwVar.hw();
            uef uefVarOa = oa(oibVar);
            if (uefVarOa == null || (view = uefVarOa.uef) == null) {
                return;
            }
            addView(view);
            com.bytedance.sdk.openadsdk.core.ivm.moa moaVar = uefVarOa.yo;
            PAGLogoView pAGLogoView = uefVarOa.moa;
            com.bytedance.sdk.openadsdk.core.ivm.moa moaVar2 = uefVarOa.lw;
            if (moaVar2 != null && this.yo.gzw()) {
                af.uef((View) moaVar2, 0);
                com.bytedance.sdk.openadsdk.dhk.oa.oa().uef((int) af.uef(sy.uef(), 11.0f, true), moaVar2, this.yo);
            }
            com.bytedance.sdk.openadsdk.core.wk.oa.ivm videoView = getVideoView();
            if (videoView instanceof com.bytedance.sdk.openadsdk.core.wk.oa.ivm) {
                this.dz = videoView;
                videoView.setVideoAdLoadListener(this);
                this.dz.setVideoAdInteractionListener(this);
                ArrayList arrayList = new ArrayList();
                arrayList.add(new Pair(moaVar, FriendlyObstructionPurpose.CLOSE_AD));
                FriendlyObstructionPurpose friendlyObstructionPurpose = FriendlyObstructionPurpose.OTHER;
                arrayList.add(new Pair(pAGLogoView, friendlyObstructionPurpose));
                arrayList.add(new Pair(moaVar2, friendlyObstructionPurpose));
                this.dz.uef(arrayList);
                this.dz.setAdCreativeClickListener(new ivm.uef() { // from class: com.bytedance.sdk.openadsdk.core.moa.cz.1
                    @Override // com.bytedance.sdk.openadsdk.core.wk.oa.ivm.uef
                    public void uef(View view2, int i5) {
                        if (cz.this.bs != null) {
                            cz.this.bs.onAdClicked();
                        }
                    }
                });
            }
            if (pAGLogoView != null) {
                pAGLogoView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.moa.cz.2
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        TTWebsiteActivity.uef(((com.bytedance.sdk.openadsdk.core.zjm.uef) cz.this).f25872oa, ((com.bytedance.sdk.openadsdk.core.zjm.uef) cz.this).yo, ((com.bytedance.sdk.openadsdk.core.zjm.uef) cz.this).ivm);
                    }
                });
            }
            if (moaVar != null) {
                moaVar.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.moa.cz.3
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        cz.this.uef();
                    }
                });
            }
            wrv wrvVar = uefVarOa.f25641oa;
            gzw gzwVar2 = this.yo;
            if (gzwVar2 != null && gzwVar2.nkc() != null && wrvVar != null) {
                int iZjm = this.yo.nkc().zjm();
                float fDj = this.yo.nkc().dj();
                if (iZjm > 0 && fDj > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    wrvVar.setRatio(iZjm / fDj);
                } else if (iHw == 15) {
                    wrvVar.setRatio(0.5625f);
                } else if (iHw == 5) {
                    wrvVar.setRatio(1.7777778f);
                } else {
                    wrvVar.setRatio(1.0f);
                }
            }
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            if (videoView != null && wrvVar != null) {
                wrvVar.addView(videoView, layoutParams);
                videoView.setTag(520093762, Boolean.TRUE);
            }
            uef((View) videoView, true);
            uef((View) this, true);
            uef(wrvVar);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.zjm.uef
    public void uef() {
        TTDislikeDialogAbstract tTDislikeDialogAbstract = this.lw;
        if (tTDislikeDialogAbstract != null) {
            tTDislikeDialogAbstract.show();
            return;
        }
        com.bytedance.sdk.openadsdk.yo.yo yoVar = this.moa;
        if (yoVar != null) {
            yoVar.uef();
        } else {
            TTDelegateActivity.uef(this.yo, this.wk);
        }
    }

    @Override // com.bykv.vk.openvk.uef.uef.uef.moa.yo.InterfaceC0033yo
    public void uef(long j8, long j10) {
        this.f25640ab = j8;
    }
}
