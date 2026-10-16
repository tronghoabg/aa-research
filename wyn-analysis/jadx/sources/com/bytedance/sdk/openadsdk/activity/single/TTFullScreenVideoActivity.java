package com.bytedance.sdk.openadsdk.activity.single;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.utils.orq;
import com.bytedance.sdk.openadsdk.common.ab;
import com.bytedance.sdk.openadsdk.core.model.cp;
import com.bytedance.sdk.openadsdk.core.model.dhk;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.core.pz;
import com.bytedance.sdk.openadsdk.core.sy;
import com.bytedance.sdk.openadsdk.moa.lw.oa.wk;
import com.bytedance.sdk.openadsdk.moa.zjm;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class TTFullScreenVideoActivity extends TTBaseVideoActivity {
    private static com.bytedance.sdk.openadsdk.uef.yo.oa bs;

    /* renamed from: ab, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.uef.yo.oa f25169ab;
    private boolean sy;

    /* JADX INFO: Access modifiers changed from: private */
    public void af() {
        toString();
        com.bytedance.sdk.openadsdk.uef.yo.oa oaVar = this.f25169ab;
        if (oaVar != null) {
            oaVar.onAdClicked();
        }
    }

    private void yo(int i5) {
        this.f25164oa.dxx.uef(null, String.format(orq.uef(sy.uef(), "tt_skip_ad_time_text"), Integer.valueOf(i5)));
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    public ab cq() {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    public FrameLayout dxx() {
        return this.f25164oa.oyt.ivm();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void dz() {
        /*
            r3 = this;
            com.bytedance.sdk.openadsdk.component.reward.uef.oa r0 = r3.f25164oa
            com.bytedance.sdk.openadsdk.core.model.gzw r0 = r0.f25412oa
            boolean r0 = com.bytedance.sdk.openadsdk.core.model.gzw.lw(r0)
            r1 = 0
            if (r0 != 0) goto L19
            com.bytedance.sdk.openadsdk.component.reward.uef.oa r0 = r3.f25164oa
            boolean r2 = r0.yo
            if (r2 != 0) goto L19
            com.bytedance.sdk.openadsdk.component.reward.uef.cq r0 = r0.dxx
            java.lang.String r2 = "X"
            r0.uef(r1, r2)
            goto L24
        L19:
            com.bytedance.sdk.openadsdk.component.reward.uef.oa r0 = r3.f25164oa
            com.bytedance.sdk.openadsdk.component.reward.uef.cq r0 = r0.dxx
            java.lang.String r2 = com.bytedance.sdk.openadsdk.common.TTAdDislikeToast.getSkipText()
            r0.uef(r1, r2)
        L24:
            com.bytedance.sdk.openadsdk.component.reward.uef.oa r0 = r3.f25164oa
            com.bytedance.sdk.openadsdk.component.reward.uef.cq r0 = r0.dxx
            r1 = 1
            r0.lw(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.activity.single.TTFullScreenVideoActivity.dz():void");
    }

    public void finalize() throws Throwable {
        super.finalize();
        if (this.wrv) {
            return;
        }
        bs = null;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void finish() {
        if (this.f25164oa != null) {
            com.bytedance.sdk.openadsdk.ivm.oa.uef().uef("videoForceBreak", this.f25164oa.f25412oa);
        }
        try {
            bcc();
        } catch (Exception unused) {
        }
        super.finish();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    public boolean gr() {
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    public void gsd() {
        final View viewZjm = this.f25164oa.oyt.zjm();
        if (viewZjm != null) {
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTFullScreenVideoActivity.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (TTFullScreenVideoActivity.this.f25164oa.ku.dhk() && TTFullScreenVideoActivity.this.f25164oa.cz.get()) {
                        boolean zCq = TTFullScreenVideoActivity.this.f25164oa.fz.cq();
                        TTFullScreenVideoActivity.this.f25164oa.ku.ivm(zCq);
                        TTFullScreenVideoActivity.this.f25164oa.oyt.ivm(8);
                        View view2 = viewZjm;
                        if (view2 instanceof com.bytedance.sdk.openadsdk.core.ivm.moa) {
                            ((com.bytedance.sdk.openadsdk.core.ivm.moa) view2).setImageResource(orq.moa(TTFullScreenVideoActivity.this.f25164oa.af, "tt_close_btn"));
                        }
                        TTFullScreenVideoActivity.this.f25164oa.sk.sendEmptyMessageDelayed(600, 5000L);
                        if (!gzw.yo(TTFullScreenVideoActivity.this.f25164oa.f25412oa)) {
                            return;
                        }
                        if (gzw.yo(TTFullScreenVideoActivity.this.f25164oa.f25412oa) && zCq) {
                            return;
                        }
                    }
                    TTFullScreenVideoActivity.this.f25164oa.ku.tpx();
                    TTFullScreenVideoActivity.this.f25164oa.fz.dj();
                    TTFullScreenVideoActivity.this.f25164oa.gr.ivm();
                    TTFullScreenVideoActivity.this.finish();
                }
            };
            viewZjm.setOnClickListener(onClickListener);
            viewZjm.setTag(viewZjm.getId(), onClickListener);
        }
        this.f25164oa.dxx.uef(new com.bytedance.sdk.openadsdk.component.reward.top.oa() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTFullScreenVideoActivity.3
            @Override // com.bytedance.sdk.openadsdk.component.reward.top.oa
            public void moa(View view) {
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.oa
            public void oa(View view) {
                TTFullScreenVideoActivity tTFullScreenVideoActivity = TTFullScreenVideoActivity.this;
                tTFullScreenVideoActivity.f25164oa.pz.uef(tTFullScreenVideoActivity.yo);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.oa
            public void uef(View view) {
                com.bytedance.sdk.openadsdk.core.model.moa moaVarOdd;
                com.bytedance.sdk.openadsdk.core.dz.moa moaVarUef;
                com.bytedance.sdk.openadsdk.component.reward.view.yo yoVarUef;
                if (cp.ivm(TTFullScreenVideoActivity.this.f25164oa.f25412oa) || (cp.lw(TTFullScreenVideoActivity.this.f25164oa.f25412oa) && TTFullScreenVideoActivity.this.f25164oa.gzw.moa(com.bytedance.sdk.openadsdk.component.reward.uef.cz.f25398oa))) {
                    if (cp.bcc(TTFullScreenVideoActivity.this.f25164oa.f25412oa)) {
                        TTFullScreenVideoActivity.this.f25164oa.gzw.cz();
                        return;
                    }
                    View view2 = viewZjm;
                    if (view2 != null) {
                        view2.performClick();
                        return;
                    } else {
                        TTFullScreenVideoActivity.this.finish();
                        return;
                    }
                }
                if (dhk.uef(TTFullScreenVideoActivity.this.f25164oa.f25412oa) && !TTFullScreenVideoActivity.this.f25164oa.cq.get()) {
                    TTFullScreenVideoActivity.this.finish();
                    return;
                }
                wk.uef uefVar = new wk.uef();
                uefVar.oa(TTFullScreenVideoActivity.this.f25164oa.tpx.cq());
                uefVar.moa(TTFullScreenVideoActivity.this.f25164oa.tpx.gr());
                uefVar.yo(TTFullScreenVideoActivity.this.f25164oa.tpx.bs());
                uefVar.yo(3);
                uefVar.moa(TTFullScreenVideoActivity.this.f25164oa.tpx.rt());
                uefVar.uef(TTFullScreenVideoActivity.this.f25164oa.tpx.oa());
                com.bytedance.sdk.openadsdk.moa.lw.uef.uef.uef(TTFullScreenVideoActivity.this.f25164oa.tpx.bcc(), uefVar, TTFullScreenVideoActivity.this.f25164oa.tpx.lw());
                pz.yo(TTFullScreenVideoActivity.this.f25164oa.ivm);
                TTFullScreenVideoActivity.this.f25164oa.tpx.uef("skip", false);
                TTFullScreenVideoActivity.this.f25164oa.dxx.moa(false);
                com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar = TTFullScreenVideoActivity.this.f25164oa;
                if (!oaVar.yo || (dhk.yo(oaVar.f25412oa) && (yoVarUef = TTFullScreenVideoActivity.this.f25164oa.gsd.uef()) != null && yoVarUef.moa == 0)) {
                    TTFullScreenVideoActivity.this.finish();
                } else {
                    TTFullScreenVideoActivity.this.uef(true, 4);
                }
                gzw gzwVar = TTFullScreenVideoActivity.this.f25164oa.f25412oa;
                if (gzwVar != null && (moaVarOdd = gzwVar.odd()) != null && (moaVarUef = moaVarOdd.uef()) != null) {
                    moaVarUef.ivm(TTFullScreenVideoActivity.this.f25164oa.tpx.cq());
                    moaVarUef.lw(TTFullScreenVideoActivity.this.f25164oa.tpx.cq());
                }
                com.bytedance.sdk.openadsdk.gsd.oa.lw.uef(TTFullScreenVideoActivity.this.f25164oa.f25412oa, 5);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.oa
            public void yo(View view) {
                View view2 = viewZjm;
                if (view2 != null) {
                    view2.performClick();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.oa
            public void uef(View view, String str) {
                com.bytedance.sdk.openadsdk.core.model.moa moaVarOdd;
                com.bytedance.sdk.openadsdk.core.dz.moa moaVarUef;
                com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar = TTFullScreenVideoActivity.this.f25164oa;
                boolean z2 = !oaVar.gem;
                oaVar.gem = z2;
                oaVar.tpx.uef(z2, str);
                if (!cp.ab(TTFullScreenVideoActivity.this.f25164oa.f25412oa) || TTFullScreenVideoActivity.this.f25164oa.cz.get()) {
                    com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar2 = TTFullScreenVideoActivity.this.f25164oa;
                    oaVar2.ku.lw(oaVar2.gem);
                    com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar3 = TTFullScreenVideoActivity.this.f25164oa;
                    oaVar3.gzw.oa(oaVar3.gem);
                    gzw gzwVar = TTFullScreenVideoActivity.this.f25164oa.f25412oa;
                    if (gzwVar == null || (moaVarOdd = gzwVar.odd()) == null || (moaVarUef = moaVarOdd.uef()) == null) {
                        return;
                    }
                    com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar4 = TTFullScreenVideoActivity.this.f25164oa;
                    if (oaVar4.gem) {
                        moaVarUef.bcc(oaVar4.tpx.cq());
                    } else {
                        moaVarUef.cz(oaVar4.tpx.cq());
                    }
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.wk.moa.oa
    public void hts() {
        af();
        this.f25164oa.f25412oa.puz();
        this.f25164oa.f25412oa.moa(true);
        if (this.f25164oa.cz.get() || !gzw.lw(this.f25164oa.f25412oa)) {
            return;
        }
        com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar = this.f25164oa;
        gzw gzwVar = oaVar.f25412oa;
        com.bytedance.sdk.openadsdk.moa.yo.oa(gzwVar, oaVar.lw, gzwVar.wzm());
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    public void ivm() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.wk.moa.oa
    public void lz() {
        if (this.f25164oa.f25412oa.gze() != 100.0f) {
            this.sy = true;
        }
        af();
    }

    @Override // com.bytedance.sdk.openadsdk.core.wk.moa.oa
    public void oa(int i5) {
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    public void oib() {
        com.bytedance.sdk.openadsdk.uef.yo.oa oaVar = this.f25169ab;
        if (oaVar != null) {
            oaVar.uef();
        } else {
            com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar2 = this.f25164oa;
            zjm.uef(oaVar2 != null ? oaVar2.f25412oa : null, "show", 0);
        }
        if (ue()) {
            this.f25164oa.gsd.cq();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar = this.f25164oa;
        if (oaVar == null || gzw.lw(oaVar.f25412oa)) {
            return;
        }
        com.bykv.vk.openvk.uef.uef.uef.yo.oa oaVarNj = this.f25164oa.f25412oa.nj();
        if (oaVarNj == null) {
            com.bykv.vk.openvk.uef.uef.uef.yo.oa oaVar2 = new com.bykv.vk.openvk.uef.uef.uef.yo.oa();
            oaVar2.uef(10.0d);
            this.f25164oa.f25412oa.uef(oaVar2);
        } else if (oaVarNj.ivm() <= 0.0d) {
            oaVarNj.uef(10.0d);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        bcc();
        uef(isFinishing(), isChangingConfigurations());
        if (this.wrv) {
            return;
        }
        this.f25169ab = null;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (!this.wrv) {
            bs = this.f25169ab;
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar = this.f25164oa;
        if (oaVar == null || !oa(oaVar.f25412oa) || uef(this.f25164oa.f25412oa)) {
            return;
        }
        if (this.sy) {
            this.sy = false;
            finish();
        } else if (this.f25164oa.ku.gr()) {
            finish();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.wk.moa.oa
    public void oyt() {
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    public boolean rt() {
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    public void tpx() {
        com.bytedance.sdk.openadsdk.component.reward.view.yo yoVarUef;
        super.tpx();
        com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar = this.f25164oa;
        if (oaVar == null || (yoVarUef = oaVar.gsd.uef()) == null) {
            return;
        }
        yoVarUef.setJsbLandingPageOpenListener(new com.bytedance.sdk.openadsdk.core.widget.lw() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTFullScreenVideoActivity.1
            @Override // com.bytedance.sdk.openadsdk.core.widget.lw
            public void uef() {
                TTFullScreenVideoActivity.this.af();
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.wk.moa.oa
    public void uef(String str, JSONObject jSONObject) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.wk.moa.oa
    public void oa(boolean z2) {
    }

    private boolean oa(gzw gzwVar) {
        if (gzwVar == null) {
            return false;
        }
        return sy.moa().tpx(String.valueOf(this.f25164oa.ivm));
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    public void uef(Intent intent) {
        super.uef(intent);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    public void yo() {
        toString();
        com.bytedance.sdk.openadsdk.uef.yo.oa oaVar = this.f25169ab;
        if (oaVar != null) {
            oaVar.oa();
        } else {
            com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar2 = this.f25164oa;
            zjm.uef(oaVar2 != null ? oaVar2.f25412oa : null, "close", 0);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.core.wk.moa.oa
    public void uef(Bundle bundle) {
        if (this.wrv) {
            super.uef(bundle);
            this.f25169ab = (com.bytedance.sdk.openadsdk.uef.yo.oa) com.bytedance.sdk.openadsdk.core.cp.uef().uef(this.zjm, com.bytedance.sdk.openadsdk.uef.yo.oa.class);
            return;
        }
        com.bytedance.sdk.openadsdk.uef.yo.oa oaVarYo = com.bytedance.sdk.openadsdk.core.cp.uef().yo();
        this.f25169ab = oaVarYo;
        if (oaVarYo != null || bundle == null) {
            return;
        }
        this.f25169ab = bs;
        bs = null;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity
    public void uef(long j8, long j10) {
        uef((int) (j8 / 1000));
        int i5 = this.lw;
        if (i5 >= 0) {
            this.f25164oa.dxx.uef(String.valueOf(i5), null);
        }
    }

    public void uef(int i5) {
        int iQe = this.f25164oa.f25412oa.qe();
        if (!sy.moa().ivm(String.valueOf(this.f25164oa.ivm)) || (!gzw.lw(this.f25164oa.f25412oa) && !this.f25164oa.yo)) {
            if (i5 >= iQe) {
                com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar = this.f25164oa;
                if (!oaVar.nkh) {
                    oaVar.uef(true);
                }
                dz();
                return;
            }
            return;
        }
        com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar2 = this.f25164oa;
        if (!oaVar2.nkh) {
            oaVar2.uef(true);
        }
        if (i5 <= iQe) {
            yo(iQe - i5);
            this.f25164oa.dxx.lw(false);
        } else {
            dz();
        }
    }

    private boolean uef(gzw gzwVar) {
        return gzwVar == null || gzwVar.gze() == 100.0f;
    }
}
