package com.bytedance.sdk.openadsdk.activity.single;

import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.component.reward.view.dj;
import com.bytedance.sdk.openadsdk.core.model.dhk;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.core.pz;
import com.bytedance.sdk.openadsdk.core.sy;
import com.bytedance.sdk.openadsdk.moa.lw.oa.wk;

/* loaded from: classes3.dex */
public class ivm extends uef {
    private boolean dhk;

    public ivm(oa oaVar, gzw gzwVar, int i5, int i10, boolean z2) {
        super(oaVar, gzwVar, i5, i10, z2);
    }

    private boolean uef(gzw gzwVar) {
        return gzwVar == null || gzwVar.gze() == 100.0f;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.bcc
    public void b_() {
        oa oaVar = this.xs;
        if (oaVar != null && oaVar.yo()) {
            super.b_();
            return;
        }
        final View viewZjm = this.cz.oyt.zjm();
        if (viewZjm != null) {
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.ivm.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (ivm.this.cz.ku.dhk() && ivm.this.cz.cz.get()) {
                        boolean zCq = ivm.this.cz.fz.cq();
                        ivm.this.cz.ku.ivm(zCq);
                        ivm.this.cz.oyt.ivm(8);
                        ivm.this.cz.sk.sendEmptyMessageDelayed(600, 5000L);
                        if (!gzw.yo(ivm.this.cz.f25412oa)) {
                            return;
                        }
                        if (gzw.yo(ivm.this.cz.f25412oa) && zCq) {
                            return;
                        }
                    }
                    ivm.this.cz.ku.tpx();
                    ivm.this.cz.fz.dj();
                    ivm.this.cz.gr.ivm();
                    ivm.this.swd();
                }
            };
            viewZjm.setOnClickListener(onClickListener);
            viewZjm.setTag(viewZjm.getId(), onClickListener);
        }
        this.cz.dxx.uef(new com.bytedance.sdk.openadsdk.component.reward.top.oa() { // from class: com.bytedance.sdk.openadsdk.activity.single.ivm.2
            @Override // com.bytedance.sdk.openadsdk.component.reward.top.oa
            public void moa(View view) {
                ivm ivmVar = ivm.this;
                ivmVar.oa(ivmVar.cz);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.oa
            public void oa(View view) {
                ivm.this.f_();
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.oa
            public void uef(View view) {
                com.bytedance.sdk.openadsdk.core.dz.moa moaVarUef;
                if (dhk.uef(ivm.this.cz.f25412oa) && !ivm.this.cz.cq.get()) {
                    ivm.this.swd();
                    return;
                }
                ivm.this.cz.tpx.dxx();
                wk.uef uefVar = new wk.uef();
                uefVar.oa(ivm.this.cz.tpx.cq());
                uefVar.moa(ivm.this.cz.tpx.gr());
                uefVar.yo(ivm.this.cz.tpx.bs());
                uefVar.yo(3);
                uefVar.moa(ivm.this.cz.tpx.rt());
                uefVar.uef(ivm.this.cz.tpx.oa());
                com.bytedance.sdk.openadsdk.moa.lw.uef.uef.uef(ivm.this.cz.tpx.bcc(), uefVar, ivm.this.cz.tpx.lw());
                pz.yo(ivm.this.cz.ivm);
                ivm.this.cz.tpx.uef("skip", false);
                ivm.this.cz.dxx.moa(false);
                ivm ivmVar = ivm.this;
                if (ivmVar.cz.yo) {
                    ivmVar.uef(true, 4);
                } else {
                    ivmVar.swd();
                }
                gzw gzwVar = ivm.this.cz.f25412oa;
                if (gzwVar != null && gzwVar.odd() != null) {
                    com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar2 = ivm.this.cz;
                    if (oaVar2.tpx != null && (moaVarUef = oaVar2.f25412oa.odd().uef()) != null) {
                        moaVarUef.ivm(ivm.this.cz.tpx.cq());
                        moaVarUef.lw(ivm.this.cz.tpx.cq());
                    }
                }
                com.bytedance.sdk.openadsdk.gsd.oa.lw.uef(ivm.this.cz.f25412oa, 5);
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
                ivm.this.uef(str);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.bcc
    public boolean c_() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.bcc
    public boolean d_() {
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.bcc
    public String e_() {
        return "fullscreen_interstitial_ad";
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.bcc
    public void f_() {
        this.cz.pz.uef(((uef) this).f25260oa);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.bcc
    public boolean g_() {
        return this.cz.gem;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.bcc
    public void km() {
        super.km();
        this.lw = false;
        this.cz.gsd.oa(false);
        this.cz.tpx.gem();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.bcc, com.bytedance.sdk.openadsdk.core.wk.moa.oa
    public void lz() {
        if (this.cz.f25412oa.gze() != 100.0f) {
            this.dhk = true;
        }
        super.lz();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.uef, com.bytedance.sdk.openadsdk.activity.single.bcc
    public void moa() {
        super.moa();
        com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar = this.cz;
        if (oaVar == null || !oa(oaVar.f25412oa) || uef(this.cz.f25412oa)) {
            return;
        }
        if (this.dhk) {
            this.dhk = false;
            swd();
        } else if (this.cz.ku.gr()) {
            swd();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    @Override // com.bytedance.sdk.openadsdk.activity.single.uef
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void oa() {
        /*
            r3 = this;
            com.bytedance.sdk.openadsdk.component.reward.uef.oa r0 = r3.cz
            com.bytedance.sdk.openadsdk.core.model.gzw r0 = r0.f25412oa
            boolean r0 = com.bytedance.sdk.openadsdk.core.model.gzw.lw(r0)
            r1 = 0
            if (r0 != 0) goto L19
            com.bytedance.sdk.openadsdk.component.reward.uef.oa r0 = r3.cz
            boolean r2 = r0.yo
            if (r2 != 0) goto L19
            com.bytedance.sdk.openadsdk.component.reward.uef.cq r0 = r0.dxx
            java.lang.String r2 = "X"
            r0.uef(r1, r2)
            goto L24
        L19:
            com.bytedance.sdk.openadsdk.component.reward.uef.oa r0 = r3.cz
            com.bytedance.sdk.openadsdk.component.reward.uef.cq r0 = r0.dxx
            java.lang.String r2 = com.bytedance.sdk.openadsdk.common.TTAdDislikeToast.getSkipText()
            r0.uef(r1, r2)
        L24:
            com.bytedance.sdk.openadsdk.component.reward.uef.oa r0 = r3.cz
            com.bytedance.sdk.openadsdk.component.reward.uef.cq r0 = r0.dxx
            r1 = 1
            r0.lw(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.activity.single.ivm.oa():void");
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.bcc, com.bytedance.sdk.openadsdk.core.wk.moa.oa
    public void oyt() {
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.uef
    public FrameLayout xs() {
        dj djVar;
        com.bytedance.sdk.openadsdk.component.reward.view.cz czVar;
        if (this.ivm.ivm()) {
            com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar = this.cz;
            if (oaVar == null || (czVar = oaVar.gsd) == null) {
                return null;
            }
            return czVar.oa();
        }
        com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar2 = this.cz;
        if (oaVar2 == null || (djVar = oaVar2.oyt) == null) {
            return null;
        }
        return djVar.ivm();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.bcc
    public void uef(String str) {
        com.bytedance.sdk.openadsdk.core.model.moa moaVarOdd;
        com.bytedance.sdk.openadsdk.core.dz.moa moaVarUef;
        com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar = this.cz;
        oaVar.gem = !oaVar.gem;
        com.bytedance.sdk.openadsdk.component.reward.view.cz czVar = oaVar.gsd;
        if (czVar != null && czVar.uef() != null) {
            this.cz.gsd.uef().setSoundMute(this.cz.gem);
        }
        com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar2 = this.cz;
        oaVar2.tpx.uef(oaVar2.gem, str);
        com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar3 = this.cz;
        oaVar3.ku.lw(oaVar3.gem);
        gzw gzwVar = this.cz.f25412oa;
        if (gzwVar == null || (moaVarOdd = gzwVar.odd()) == null || (moaVarUef = moaVarOdd.uef()) == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar4 = this.cz;
        if (oaVar4.gem) {
            moaVarUef.bcc(oaVar4.tpx.cq());
        } else {
            moaVarUef.cz(oaVar4.tpx.cq());
        }
    }

    private boolean oa(gzw gzwVar) {
        if (gzwVar == null) {
            return false;
        }
        return sy.moa().tpx(String.valueOf(this.cz.ivm));
    }
}
