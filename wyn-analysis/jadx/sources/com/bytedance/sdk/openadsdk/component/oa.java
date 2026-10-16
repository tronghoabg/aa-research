package com.bytedance.sdk.openadsdk.component;

import android.app.Activity;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.core.yo.oa;
import com.bytedance.sdk.openadsdk.core.zjm.cz;
import com.bytedance.sdk.openadsdk.core.zjm.tpx;
import com.bytedance.sdk.openadsdk.core.zjm.zjm;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class oa extends yo {
    private final com.bytedance.sdk.openadsdk.component.ivm.oa cq;
    private com.bytedance.sdk.openadsdk.component.cz.oa dz;
    private boolean wk;

    public oa(Activity activity, gzw gzwVar, FrameLayout frameLayout, uef uefVar, int i5, boolean z2, com.bytedance.sdk.openadsdk.component.bcc.uef uefVar2, com.bytedance.sdk.openadsdk.component.ivm.oa oaVar) {
        super(activity, gzwVar, frameLayout, uefVar, i5, z2, uefVar2);
        this.cq = oaVar;
    }

    @Override // com.bytedance.sdk.openadsdk.component.yo
    public void lw() {
        com.bytedance.sdk.openadsdk.component.cz.oa oaVar = this.dz;
        if (oaVar != null) {
            oaVar.oib();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.yo
    public int moa() {
        return this.dz.getDynamicShowType();
    }

    @Override // com.bytedance.sdk.openadsdk.component.yo
    public void oa() {
        this.dz.tpx();
    }

    @Override // com.bytedance.sdk.openadsdk.component.yo
    public void yo() {
        super.yo();
        com.bytedance.sdk.openadsdk.component.cz.oa oaVar = this.dz;
        if (oaVar != null) {
            oaVar.cq();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.yo
    public void uef(ViewGroup viewGroup) {
        Pair<Float, Float> pairUef = com.bytedance.sdk.openadsdk.core.zjm.oa.uef.uef(this.uef.getWindow(), this.xs);
        com.bytedance.sdk.openadsdk.component.cz.oa oaVar = new com.bytedance.sdk.openadsdk.component.cz.oa(this.uef, this.f25485oa, new AdSlot.Builder().setCodeId(String.valueOf(this.f25485oa.jnk())).setExpressViewAcceptedSize(((Float) pairUef.first).floatValue(), ((Float) pairUef.second).floatValue()).build(), "open_ad", this.lw, this.cq, this.wrv);
        this.dz = oaVar;
        oaVar.setTopListener(this.lw);
        this.dz.setExpressVideoListenerProxy(this.lw);
        this.dz.setExpressInteractionListener(new PAGExpressAdWrapperListener() { // from class: com.bytedance.sdk.openadsdk.component.oa.1
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
                oa.this.lw.moa();
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public void onRenderSuccess(View view, float f10, float f11) {
                if (oa.this.dz.gzw()) {
                    oa.this.wk = true;
                    oa oaVar2 = oa.this;
                    oa.super.uef((ViewGroup) oaVar2.moa);
                    oa.super.uef();
                    oa.super.oa();
                    return;
                }
                if (oa.this.f25485oa.ku()) {
                    oa.this.lw.yo();
                    return;
                }
                oa oaVar3 = oa.this;
                if (!oaVar3.yo) {
                    oaVar3.lw.yo();
                } else if (!oaVar3.uef(oaVar3.dz.getVideoFrameLayout())) {
                    oa.this.lw.moa();
                } else {
                    oa.this.dz.setVideoManager(oa.this.xs());
                    oa.this.lw.yo();
                }
            }
        });
        this.f25485oa.oib(1);
        this.moa.addView(this.dz, new FrameLayout.LayoutParams(-1, -1));
    }

    @Override // com.bytedance.sdk.openadsdk.component.yo
    public void uef() {
        zjm zjmVarUef = com.bytedance.sdk.openadsdk.component.uef.oa.uef(this.f25485oa, this.uef, this.wrv, this.dz);
        zjmVarUef.uef(new oa.uef() { // from class: com.bytedance.sdk.openadsdk.component.oa.2
            @Override // com.bytedance.sdk.openadsdk.core.yo.oa.uef
            public void uef(View view, int i5) {
                oa.this.lw.lw();
            }
        });
        this.dz.setClickListener(zjmVarUef);
        cz czVarOa = com.bytedance.sdk.openadsdk.component.uef.oa.oa(this.f25485oa, this.uef, this.wrv, this.dz);
        this.dz.setClickCreativeListener(czVarOa);
        czVarOa.uef(new oa.uef() { // from class: com.bytedance.sdk.openadsdk.component.oa.3
            @Override // com.bytedance.sdk.openadsdk.core.yo.oa.uef
            public void uef(View view, int i5) {
                oa.this.lw.lw();
            }
        });
        this.dz.setBackupListener(new com.bytedance.sdk.component.adexpress.oa.yo() { // from class: com.bytedance.sdk.openadsdk.component.oa.4
            @Override // com.bytedance.sdk.component.adexpress.oa.yo
            public boolean uef(ViewGroup viewGroup, int i5) {
                StringBuilder sb2 = new StringBuilder("isUseBackup() called with: view = [");
                sb2.append(viewGroup);
                sb2.append("], errCode = [");
                sb2.append(i5);
                sb2.append("]");
                try {
                    ((tpx) viewGroup).orq();
                    new com.bytedance.sdk.openadsdk.component.cz.uef(oa.this.uef).uef((tpx) oa.this.dz);
                    return true;
                } catch (Exception e7) {
                    Log.e("AppOpenAdExpressManager", "", e7);
                    return false;
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.component.yo
    public void uef(int i5, boolean z2) throws NumberFormatException {
        super.uef(i5, z2);
        com.bytedance.sdk.openadsdk.component.cz.oa oaVar = this.dz;
        if (oaVar != null) {
            oaVar.setTime(String.valueOf(i5), (int) (this.wrv.yo() / 1000), i5, false);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.yo
    public JSONObject uef(JSONObject jSONObject) {
        return this.dz.uef(jSONObject, this.f25485oa);
    }

    public void uef(long j8, long j10) {
        com.bytedance.sdk.openadsdk.component.cz.oa oaVar = this.dz;
        if (oaVar != null) {
            oaVar.uef(j8, j10);
        }
    }
}
