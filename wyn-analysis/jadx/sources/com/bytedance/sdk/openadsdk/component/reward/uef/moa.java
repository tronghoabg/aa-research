package com.bytedance.sdk.openadsdk.component.reward.uef;

import android.R;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.common.bs;
import com.bytedance.sdk.openadsdk.core.model.cp;
import com.bytedance.sdk.openadsdk.core.model.dhk;

/* loaded from: classes3.dex */
public class moa {

    /* renamed from: oa, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.common.bs f25407oa;
    private final oa uef;
    private TTAdDislikeToast yo;

    public moa(oa oaVar) {
        this.uef = oaVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void moa() {
        TTAdDislikeToast tTAdDislikeToast = this.yo;
        if (tTAdDislikeToast != null) {
            tTAdDislikeToast.show(TTAdDislikeToast.getDislikeSendTip());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean yo() {
        return this.uef.dh;
    }

    public void oa() {
        TTAdDislikeToast tTAdDislikeToast = this.yo;
        if (tTAdDislikeToast != null) {
            tTAdDislikeToast.onDestroy();
        }
    }

    public void uef(com.bytedance.sdk.openadsdk.component.reward.oa.oa oaVar) {
        com.bytedance.sdk.openadsdk.activity.single.bcc bccVar;
        if (this.uef.pu.isFinishing()) {
            return;
        }
        oa oaVar2 = this.uef;
        com.bytedance.sdk.openadsdk.activity.single.bcc bccVar2 = oaVar2.sw;
        boolean z2 = (bccVar2 instanceof com.bytedance.sdk.openadsdk.activity.single.lw) && ((com.bytedance.sdk.openadsdk.activity.single.lw) bccVar2).uef;
        if (oaVar2.dj.get() || !((bccVar = this.uef.sw) == null || !bccVar.sk().ue() || z2)) {
            if (this.yo == null) {
                this.yo = new TTAdDislikeToast(this.uef.pu);
                ((FrameLayout) this.uef.pu.findViewById(R.id.content)).addView(this.yo);
            }
            this.yo.show(TTAdDislikeToast.getDislikeTip());
            this.uef.dj.set(true);
            return;
        }
        if (this.f25407oa == null) {
            try {
                oa(oaVar);
            } catch (Throwable th) {
                ApmHelper.reportCustomError("initDislike error", "RewardFullDislikeManager", th);
            }
        }
        com.bytedance.sdk.openadsdk.common.bs bsVar = this.f25407oa;
        if (bsVar != null) {
            bsVar.uef();
        }
    }

    private void oa(final com.bytedance.sdk.openadsdk.component.reward.oa.oa oaVar) {
        if (this.f25407oa == null) {
            oa oaVar2 = this.uef;
            com.bytedance.sdk.openadsdk.common.bs bsVar = new com.bytedance.sdk.openadsdk.common.bs(oaVar2.pu, oaVar2.f25412oa);
            this.f25407oa = bsVar;
            bsVar.setCallback(new bs.uef() { // from class: com.bytedance.sdk.openadsdk.component.reward.uef.moa.1
                @Override // com.bytedance.sdk.openadsdk.common.bs.uef
                public void oa(View view) {
                    moa.this.uef.zjm.set(false);
                    if (moa.this.uef.tpx.lw) {
                        if (moa.this.uef.gsd != null) {
                            moa.this.uef.gsd.uef(0, true);
                            return;
                        }
                        return;
                    }
                    moa.this.uef.tpx.uef(oaVar);
                    if (moa.this.uef.tpx.cz()) {
                        moa.this.uef.tpx.tpx();
                    }
                    if (moa.this.yo()) {
                        moa.this.uef.sw.sk().oa(moa.this.uef.sw, 1);
                    }
                    com.bytedance.sdk.openadsdk.gsd.uef.yo.uef(moa.this.uef.f25412oa, 4);
                    moa.this.uef.gzw.uef(0);
                    moa.this.uef.gzw.lw();
                    if (moa.this.uef.hnk != null) {
                        moa.this.uef.hnk.uef();
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.common.bs.uef
                public void uef(View view) {
                    moa.this.uef.zjm.set(true);
                    String str = "landing_page";
                    if (!dhk.oa(moa.this.uef.f25412oa) && !dhk.moa(moa.this.uef.f25412oa) && !dhk.ivm(moa.this.uef.f25412oa) && !dhk.xs(moa.this.uef.f25412oa)) {
                        if (!moa.this.uef.cz.get()) {
                            str = "video_player";
                        } else if (cp.oa(moa.this.uef.f25412oa)) {
                            str = "playable";
                        } else if (!moa.this.uef.f25412oa.fjj()) {
                            str = "endcard";
                        }
                    }
                    moa.this.f25407oa.setDislikeSource(str);
                    if (moa.this.uef.tpx.lw) {
                        if (moa.this.uef.gsd != null) {
                            moa.this.uef.gsd.uef(8, false);
                            return;
                        }
                        return;
                    }
                    oaVar.dz();
                    if (moa.this.uef.tpx.ivm()) {
                        moa.this.uef.tpx.orq();
                    }
                    if (moa.this.yo()) {
                        moa.this.uef.sw.sk().oa(moa.this.uef.sw, 2);
                    }
                    com.bytedance.sdk.openadsdk.gsd.uef.yo.uef(moa.this.uef.f25412oa, 8);
                    moa.this.uef.gzw.ivm();
                    moa.this.uef.gzw.bcc();
                    if (moa.this.uef.hnk != null) {
                        moa.this.uef.hnk.oa();
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.common.bs.uef
                public void uef(FilterWord filterWord) {
                    if (moa.this.uef.dj.get() || filterWord == null || filterWord.hasSecondOptions()) {
                        return;
                    }
                    moa.this.uef.dj.set(true);
                    if (moa.this.uef.sw != null) {
                        moa.this.uef.sw.sk().yo(true);
                    }
                    moa.this.moa();
                }
            });
            ((FrameLayout) this.uef.pu.findViewById(R.id.content)).addView(this.f25407oa);
        }
        if (this.yo == null) {
            this.yo = new TTAdDislikeToast(this.uef.pu);
            ((FrameLayout) this.uef.pu.findViewById(R.id.content)).addView(this.yo);
        }
    }

    public void uef() {
        TTAdDislikeToast tTAdDislikeToast = this.yo;
        if (tTAdDislikeToast != null) {
            tTAdDislikeToast.hide();
        }
    }
}
