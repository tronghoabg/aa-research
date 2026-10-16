package com.bytedance.sdk.openadsdk.uef.oa.uef;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView;
import com.bytedance.sdk.openadsdk.core.cq.lw;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.core.zjm.dhk;
import com.bytedance.sdk.openadsdk.core.zjm.tpx;
import com.bytedance.sdk.openadsdk.uef.oa.bcc;
import com.bytedance.sdk.openadsdk.utils.af;

/* loaded from: classes3.dex */
public class yo extends bcc {
    protected final Context bcc;
    protected AdSlot cz;
    protected String dj;
    private boolean wrv;
    protected tpx zjm;

    public yo(Context context, gzw gzwVar, AdSlot adSlot) {
        super(context, gzwVar, 5, true);
        this.dj = "embeded_ad";
        this.wrv = false;
        this.f26109oa.oib(1);
        this.moa.uef(this);
        this.bcc = context;
        this.cz = adSlot;
        uef();
        oa();
    }

    private void oa() {
        tpx tpxVar = this.zjm;
        if (tpxVar != null) {
            tpxVar.setBackupListener(new com.bytedance.sdk.component.adexpress.oa.yo() { // from class: com.bytedance.sdk.openadsdk.uef.oa.uef.yo.1
                @Override // com.bytedance.sdk.component.adexpress.oa.yo
                public boolean uef(ViewGroup viewGroup, int i5) {
                    uef uefVar = new uef(yo.this.zjm.getContext());
                    uefVar.setExtraFuncationHelper(((bcc) yo.this).moa);
                    uefVar.uef(yo.this.zjm);
                    return true;
                }
            });
        }
    }

    public void lw() {
        tpx tpxVar = this.zjm;
        if (tpxVar != null) {
            tpxVar.tpx();
        }
    }

    public tpx moa() {
        return this.zjm;
    }

    public void yo() {
        tpx tpxVar = this.zjm;
        if (tpxVar != null) {
            tpxVar.setExpressInteractionListener(new PAGExpressAdWrapperListener() { // from class: com.bytedance.sdk.openadsdk.uef.oa.uef.yo.2
                @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
                public void onAdClicked() {
                }

                @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
                public void onAdDismissed() {
                }

                @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
                public void onAdShow(View view, int i5) {
                }

                @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
                public void onRenderFail(View view, String str, int i5) {
                }

                @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
                public void onRenderSuccess(View view, float f10, float f11) {
                    if (!yo.this.zjm.gzw()) {
                        yo.this.uef(f10, f11);
                        if (yo.this.wrv) {
                            yo.this.zjm.oib();
                            return;
                        }
                        return;
                    }
                    yo yoVar = yo.this;
                    Context context = yoVar.bcc;
                    gzw gzwVar = ((bcc) yoVar).f26109oa;
                    yo yoVar2 = yo.this;
                    com.bytedance.sdk.openadsdk.uef.oa.oa oaVar = new com.bytedance.sdk.openadsdk.uef.oa.oa(context, gzwVar, 5, yoVar2.cz, ((bcc) yoVar2).moa, ((bcc) yo.this).uef);
                    yo yoVar3 = yo.this;
                    if (yoVar3 instanceof oa) {
                        oaVar.uef(((dhk) yoVar3.moa()).getVideoAdListener());
                    }
                    ((bcc) yo.this).moa.uef((com.bytedance.sdk.openadsdk.core.yo.uef) yo.this.zjm.getClickCreativeListener());
                    PAGMediaView pAGMediaViewCz = ((bcc) yo.this).moa.cz();
                    if (pAGMediaViewCz == null) {
                        pAGMediaViewCz = new PAGMediaView(yo.this.bcc);
                    }
                    yo.this.zjm.addView(pAGMediaViewCz);
                }
            });
        }
    }

    public void uef() {
        this.zjm = new tpx(this.bcc, this.f26109oa, this.cz, this.dj);
        yo();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void uef(float f10, float f11) {
        tpx tpxVar = this.zjm;
        if (tpxVar != null && lw.uef(tpxVar.getDynamicShowType())) {
            ViewGroup.LayoutParams layoutParams = this.zjm.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new ViewGroup.LayoutParams(-1, -1);
            } else {
                layoutParams.width = -1;
                layoutParams.height = -1;
            }
            this.zjm.setLayoutParams(layoutParams);
            return;
        }
        int iOa = af.oa(this.bcc, f10);
        int iOa2 = af.oa(this.bcc, f11);
        ViewGroup.LayoutParams layoutParams2 = this.zjm.getLayoutParams();
        if (layoutParams2 == null) {
            layoutParams2 = new ViewGroup.LayoutParams(iOa, iOa2);
        } else {
            layoutParams2.width = iOa;
            layoutParams2.height = iOa2;
        }
        this.zjm.setLayoutParams(layoutParams2);
    }

    public void uef(boolean z2) {
        this.wrv = z2;
    }
}
