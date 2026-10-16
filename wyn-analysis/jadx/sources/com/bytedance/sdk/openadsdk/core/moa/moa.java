package com.bytedance.sdk.openadsdk.core.moa;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.core.zjm;
import com.bytedance.sdk.openadsdk.core.zjm.tpx;
import com.bytedance.sdk.openadsdk.gsd.oa.lw;
import com.bytedance.sdk.openadsdk.utils.af;

/* loaded from: classes3.dex */
public class moa extends com.bytedance.sdk.openadsdk.core.ivm.yo {
    private int bcc;
    private boolean cz;
    protected String ivm;
    protected PAGBannerAdWrapperListener lw;
    protected AdSlot moa;

    /* renamed from: oa, reason: collision with root package name */
    protected tpx f25644oa;
    protected final Context uef;
    protected boolean xs;
    protected gzw yo;

    public moa(Context context, gzw gzwVar, AdSlot adSlot, boolean z2) {
        super(context);
        this.ivm = "banner_ad";
        this.xs = false;
        this.bcc = -1;
        this.cz = false;
        if (gzwVar != null && gzwVar.ggp() != 2) {
            gzwVar.oib(1);
        }
        this.xs = z2;
        this.uef = context;
        this.yo = gzwVar;
        this.moa = adSlot;
        yo();
        AdSlot adSlot2 = this.moa;
        if (adSlot2 != null) {
            uef(adSlot2.getExpressViewAcceptedWidth(), this.moa.getExpressViewAcceptedHeight());
        }
    }

    public tpx getCurView() {
        return this.f25644oa;
    }

    public void lw() {
        tpx tpxVar = this.f25644oa;
        if (tpxVar != null) {
            tpxVar.tpx();
        }
    }

    public void moa() {
        if (this.f25644oa != null) {
            zjm.oa().ivm(this.f25644oa.getClosedListenerKey());
            removeView(this.f25644oa);
            this.f25644oa.cq();
            this.f25644oa = null;
        }
        zjm.oa().oib();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f25644oa == null) {
            yo();
        }
        com.bytedance.sdk.openadsdk.utils.moa.uef(this, this.yo);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public void setCurrentIndex(int i5) {
        this.bcc = i5;
    }

    public void setExpressInteractionListener(PAGBannerAdWrapperListener pAGBannerAdWrapperListener) {
        this.lw = pAGBannerAdWrapperListener;
        tpx tpxVar = this.f25644oa;
        if (tpxVar != null) {
            tpxVar.setJsbLandingPageOpenListener(new com.bytedance.sdk.openadsdk.core.widget.lw() { // from class: com.bytedance.sdk.openadsdk.core.moa.moa.2
                @Override // com.bytedance.sdk.openadsdk.core.widget.lw
                public void uef() {
                    moa.this.lw.onAdClicked();
                }
            });
            this.f25644oa.setExpressInteractionListener(new PAGExpressAdWrapperListener() { // from class: com.bytedance.sdk.openadsdk.core.moa.moa.3
                @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
                public void onAdClicked() {
                    PAGBannerAdWrapperListener pAGBannerAdWrapperListener2;
                    gzw gzwVar = moa.this.yo;
                    if (gzwVar == null || !gzwVar.tv() || (pAGBannerAdWrapperListener2 = moa.this.lw) == null) {
                        return;
                    }
                    pAGBannerAdWrapperListener2.onAdClicked();
                }

                @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
                public void onAdDismissed() {
                }

                @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
                public void onAdShow(View view, int i5) {
                }

                @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
                public void onRenderFail(View view, String str, int i5) {
                    moa moaVar = moa.this;
                    PAGBannerAdWrapperListener pAGBannerAdWrapperListener2 = moaVar.lw;
                    if (pAGBannerAdWrapperListener2 != null) {
                        pAGBannerAdWrapperListener2.onRenderFail(moaVar, str, i5);
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
                public void onRenderSuccess(View view, float f10, float f11) {
                    tpx tpxVar2 = moa.this.f25644oa;
                    if (tpxVar2 != null) {
                        tpxVar2.setSoundMute(true);
                        if (com.bytedance.sdk.openadsdk.core.cq.lw.uef(moa.this.f25644oa.getDynamicShowType())) {
                            moa moaVar = moa.this;
                            AdSlot adSlot = moaVar.moa;
                            if (adSlot != null) {
                                moaVar.uef(adSlot.getExpressViewAcceptedWidth(), moa.this.moa.getExpressViewAcceptedHeight());
                            }
                        } else {
                            moa.this.uef(f10, f11);
                        }
                    }
                    if (moa.this.cz) {
                        moa.this.f25644oa.oib();
                    }
                    moa moaVar2 = moa.this;
                    PAGBannerAdWrapperListener pAGBannerAdWrapperListener2 = moaVar2.lw;
                    if (pAGBannerAdWrapperListener2 != null) {
                        pAGBannerAdWrapperListener2.onRenderSuccess(moaVar2, f10, f11);
                    }
                }
            });
        }
    }

    public void setIsShow(boolean z2) {
        this.cz = z2;
    }

    public void yo() {
        tpx tpxVar = new tpx(this.uef, this.yo, this.moa, this.ivm) { // from class: com.bytedance.sdk.openadsdk.core.moa.moa.1
            @Override // com.bytedance.sdk.openadsdk.core.zjm.tpx
            public lw.uef yo(int i5) {
                return moa.this.uef(super.yo(i5));
            }
        };
        this.f25644oa = tpxVar;
        addView(tpxVar, new ViewGroup.LayoutParams(-1, -1));
        PAGBannerAdWrapperListener pAGBannerAdWrapperListener = this.lw;
        if (pAGBannerAdWrapperListener != null) {
            setExpressInteractionListener(pAGBannerAdWrapperListener);
        }
    }

    public lw.uef uef(lw.uef uefVar) {
        int i5;
        if (this.xs && (i5 = this.bcc) >= 0) {
            uefVar.f25909oa = i5;
        }
        return uefVar;
    }

    public void uef(float f10, float f11) {
        int iOa = af.oa(this.uef, f10);
        int iOa2 = af.oa(this.uef, f11);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(iOa, iOa2);
        }
        layoutParams.width = iOa;
        layoutParams.height = iOa2;
        setLayoutParams(layoutParams);
    }
}
