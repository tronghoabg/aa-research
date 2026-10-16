package com.bytedance.sdk.openadsdk.component.reward.uef;

import android.app.Activity;
import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.activity.single.moa;
import com.bytedance.sdk.openadsdk.core.model.cp;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.core.oyt;
import com.bytedance.sdk.openadsdk.core.ue;
import com.bytedance.sdk.openadsdk.core.widget.sy;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class zjm {

    /* renamed from: ab, reason: collision with root package name */
    protected boolean f25437ab;
    protected volatile boolean bcc;
    protected FrameLayout bs;
    protected boolean cq;
    protected final Activity cz;
    protected final String dj;
    protected boolean dz;

    /* renamed from: oa, reason: collision with root package name */
    private moa.ivm f25438oa;
    protected AtomicBoolean oib = new AtomicBoolean(false);
    protected com.bytedance.sdk.openadsdk.orq.uef.uef sy;
    private com.bytedance.sdk.openadsdk.core.widget.sy uef;
    protected boolean wk;
    protected final oa wrv;
    private boolean yo;
    protected final gzw zjm;

    public zjm(oa oaVar) {
        this.wrv = oaVar;
        this.cz = oaVar.pu;
        this.dj = oaVar.lw;
        gzw gzwVar = oaVar.f25412oa;
        this.zjm = gzwVar;
        this.dz = cp.lw(gzwVar);
    }

    private void ab() {
        if (this.wrv.f25412oa.nl()) {
            com.bytedance.sdk.openadsdk.core.widget.sy syVar = new com.bytedance.sdk.openadsdk.core.widget.sy(this.wrv, new sy.uef() { // from class: com.bytedance.sdk.openadsdk.component.reward.uef.zjm.1
                @Override // com.bytedance.sdk.openadsdk.core.widget.sy.uef
                public void ivm() {
                    zjm.this.moa(false);
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.sy.uef
                public void lw() {
                    zjm.this.bs();
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.sy.uef
                public int moa() {
                    zjm zjmVar = zjm.this;
                    return zjmVar.wrv.vjj ? zjmVar.wrv() : zjmVar.bcc();
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.sy.uef
                public void oa() {
                    oyt oytVarXs = zjm.this.sy.xs();
                    if (oytVarXs != null) {
                        oytVarXs.uef("popupDidDismiss", (JSONObject) null);
                    }
                    zjm.this.moa(true);
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.sy.uef
                public void uef() {
                    zjm.this.wrv.gb.uef("skipToNextAd", (JSONObject) null);
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.sy.uef
                public void yo() {
                    com.bytedance.sdk.openadsdk.activity.single.bcc bccVar;
                    com.bytedance.sdk.openadsdk.activity.single.oa oaVarSk;
                    oyt oytVarXs = zjm.this.sy.xs();
                    if (oytVarXs != null) {
                        oytVarXs.uef("popupDidShow", (JSONObject) null);
                    }
                    oa oaVar = zjm.this.wrv;
                    if (!oaVar.vjj || (bccVar = oaVar.sw) == null || (oaVarSk = bccVar.sk()) == null) {
                        return;
                    }
                    oaVarSk.fz();
                }
            });
            this.uef = syVar;
            syVar.uef(this.wrv.km);
            oyt oytVarXs = this.sy.xs();
            if (oytVarXs != null) {
                oytVarXs.uef(new ue() { // from class: com.bytedance.sdk.openadsdk.component.reward.uef.zjm.2
                    @Override // com.bytedance.sdk.openadsdk.core.ue
                    public void n_() throws JSONException {
                        if (zjm.this.uef != null) {
                            zjm.this.uef.uef(zjm.this.wrv.pu);
                        }
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.ue
                    public void o_() {
                        if (zjm.this.uef != null) {
                            zjm.this.uef.o_();
                        }
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.ue
                    public int p_() {
                        zjm zjmVar = zjm.this;
                        return zjmVar.wrv.vjj ? zjmVar.wrv() : zjmVar.bcc();
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.ue
                    public void q_() {
                        zjm.this.bs();
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.ue
                    public void r_() {
                        zjm.this.moa(false);
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.ue
                    public void s_() {
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bs() {
        com.bytedance.sdk.openadsdk.activity.single.oa oaVarSk;
        oa oaVar = this.wrv;
        if (oaVar.vjj) {
            com.bytedance.sdk.openadsdk.activity.single.bcc bccVar = oaVar.sw;
            if (bccVar == null || (oaVarSk = bccVar.sk()) == null) {
                return;
            }
            oaVarSk.uef(2);
            return;
        }
        if (this instanceof bcc) {
            cz();
        } else {
            moa.ivm ivmVar = this.f25438oa;
            if (ivmVar != null) {
                ivmVar.oa();
            }
        }
        this.yo = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void moa(boolean z2) {
        com.bytedance.sdk.openadsdk.activity.single.oa oaVarSk;
        oa oaVar = this.wrv;
        if (!oaVar.vjj) {
            if (this instanceof bcc) {
                uef(0L);
            } else {
                moa.ivm ivmVar = this.f25438oa;
                if (ivmVar != null) {
                    ivmVar.yo();
                }
            }
            this.yo = false;
            return;
        }
        com.bytedance.sdk.openadsdk.activity.single.bcc bccVar = oaVar.sw;
        if (bccVar == null || (oaVarSk = bccVar.sk()) == null) {
            return;
        }
        if (z2) {
            oaVarSk.ku();
        }
        oaVarSk.uef(1);
    }

    private void sy() {
        int iRy = this.zjm.ry();
        if (iRy == -1) {
            if (cp.xs(this.zjm)) {
                com.bytedance.sdk.openadsdk.orq.uef.uef uefVar = this.sy;
                if (uefVar == null || !uefVar.lw()) {
                    this.wrv.f25410hg.tpx();
                    return;
                } else {
                    this.wrv.f25409ab.set(true);
                    this.wrv.f25410hg.cq();
                }
            } else {
                this.wrv.f25409ab.set(true);
                this.wrv.f25410hg.cq();
            }
        } else {
            if (iRy < 0) {
                return;
            }
            this.wrv.dxx.moa(false);
            if (cp.xs(this.zjm)) {
                com.bytedance.sdk.openadsdk.orq.uef.uef uefVar2 = this.sy;
                if (uefVar2 == null || !uefVar2.lw()) {
                    moa.ivm ivmVar = new moa.ivm(iRy) { // from class: com.bytedance.sdk.openadsdk.component.reward.uef.zjm.5
                        @Override // com.bytedance.sdk.openadsdk.activity.single.moa.ivm
                        public void uef() {
                            zjm.this.wrv.sk.sendEmptyMessage(1);
                        }
                    };
                    this.f25438oa = ivmVar;
                    ivmVar.lw();
                    return;
                } else {
                    moa.ivm ivmVar2 = new moa.ivm(iRy) { // from class: com.bytedance.sdk.openadsdk.component.reward.uef.zjm.4
                        @Override // com.bytedance.sdk.openadsdk.activity.single.moa.ivm
                        public void uef() {
                            zjm.this.wrv.sk.sendEmptyMessage(600);
                        }
                    };
                    this.f25438oa = ivmVar2;
                    ivmVar2.lw();
                }
            } else {
                moa.ivm ivmVar3 = new moa.ivm(iRy) { // from class: com.bytedance.sdk.openadsdk.component.reward.uef.zjm.6
                    @Override // com.bytedance.sdk.openadsdk.activity.single.moa.ivm
                    public void uef() {
                        zjm.this.wrv.sk.sendEmptyMessage(600);
                    }
                };
                this.f25438oa = ivmVar3;
                ivmVar3.lw();
            }
        }
        oa oaVar = this.wrv;
        if (oaVar.hnk == null || !oaVar.xs()) {
            return;
        }
        this.wrv.hnk.uef(iRy);
    }

    public int bcc() {
        moa.ivm ivmVar = this.f25438oa;
        if (ivmVar != null) {
            return (int) (ivmVar.ivm() / 1000);
        }
        return 0;
    }

    public boolean cq() {
        return this.bcc;
    }

    public void cz() {
        moa.ivm ivmVar = this.f25438oa;
        if (ivmVar != null) {
            ivmVar.oa();
        }
    }

    public boolean dj() {
        return !this.yo;
    }

    public void dz() throws JSONException {
        if (!this.oib.compareAndSet(false, true)) {
            this.wrv.ku.xs();
            return;
        }
        com.bytedance.sdk.openadsdk.orq.uef.uef uefVar = this.sy;
        if (uefVar != null) {
            uefVar.uef(true);
        }
        this.wrv.ku.xs(true);
        oa oaVar = this.wrv;
        oaVar.lz.uef(true, oaVar.f25410hg);
        if (this.wrv.lz.lw()) {
            this.wrv.hnk.uef(r0.xs);
            return;
        }
        oa oaVar2 = this.wrv;
        oaVar2.ku.uef(oaVar2.gem, true);
        this.wrv.ku.yo(true);
        this.wrv.ku.oa(true);
        this.wrv.sk.removeMessages(600);
    }

    public void ivm() {
        if (this.dz && !this.f25437ab) {
            this.f25437ab = true;
            com.bytedance.sdk.openadsdk.orq.uef.uef uefVar = this.sy;
            if (uefVar != null) {
                uefVar.moa();
            }
            FrameLayout frameLayout = this.bs;
            if (frameLayout != null) {
                frameLayout.setVisibility(8);
            }
            com.bytedance.sdk.openadsdk.core.widget.sy syVar = this.uef;
            if (syVar != null) {
                syVar.bcc();
                this.uef = null;
            }
            moa.ivm ivmVar = this.f25438oa;
            if (ivmVar != null) {
                ivmVar.moa();
                this.f25438oa = null;
            }
        }
    }

    public void lw() {
        if (!this.dz || this.oib.get()) {
            return;
        }
        com.bytedance.sdk.openadsdk.orq.uef.uef uefVar = this.sy;
        if (uefVar != null) {
            uefVar.yo();
        }
        moa.ivm ivmVar = this.f25438oa;
        if (ivmVar != null) {
            ivmVar.oa();
        }
    }

    public void uef(int i5) {
    }

    public boolean wk() {
        com.bytedance.sdk.openadsdk.core.widget.sy syVar = this.uef;
        if (syVar != null) {
            return syVar.cz();
        }
        return false;
    }

    public int wrv() {
        com.bytedance.sdk.openadsdk.activity.single.oa oaVarSk;
        com.bytedance.sdk.openadsdk.activity.single.bcc bccVar = this.wrv.sw;
        if (bccVar == null || (oaVarSk = bccVar.sk()) == null) {
            return 0;
        }
        return oaVarSk.dxx();
    }

    public int xs() {
        return 0;
    }

    public void yo() {
        if (this.dz) {
            this.bcc = true;
            yo(this.wrv.gem);
            this.sy.uef();
            sy();
            if (cp.bcc(this.zjm)) {
                this.wrv.ku.ivm();
            }
        }
    }

    public boolean zjm() {
        return false;
    }

    public void oa(boolean z2) {
        if (this.dz) {
            oa oaVar = this.wrv;
            if (oaVar.rl) {
                this.bs = (FrameLayout) oaVar.km.findViewById(com.bytedance.sdk.openadsdk.utils.bs.ksq);
                uef(z2);
                ab();
            }
        }
    }

    public void uef() {
        if (this.dz && !this.cq) {
            this.cq = true;
        }
    }

    public com.bytedance.sdk.openadsdk.cq.xs oa() {
        return new com.bytedance.sdk.openadsdk.cq.xs() { // from class: com.bytedance.sdk.openadsdk.component.reward.uef.zjm.3
            @Override // com.bytedance.sdk.openadsdk.cq.xs
            public void uef() {
                zjm.this.wrv.gb.oa(false);
            }
        };
    }

    public void uef(boolean z2) {
        FrameLayout frameLayout = this.bs;
        if (frameLayout != null) {
            oa oaVar = this.wrv;
            Context context = oaVar.af;
            gzw gzwVar = this.zjm;
            int i5 = oaVar.etd;
            com.bytedance.sdk.openadsdk.activity.single.bcc bccVar = oaVar.sw;
            com.bytedance.sdk.openadsdk.orq.uef.uef uefVar = new com.bytedance.sdk.openadsdk.orq.uef.uef(context, gzwVar, i5, z2, frameLayout, false, bccVar != null ? bccVar.af() : 0);
            this.sy = uefVar;
            uefVar.uef(this.wrv.gb);
            this.sy.uef(true, oa());
        }
    }

    public void yo(boolean z2) {
        if (this.dz && this.sy != null && this.bcc) {
            this.sy.uef(z2);
        }
    }

    public void moa() throws JSONException {
        if (!this.dz || this.oib.get()) {
            return;
        }
        com.bytedance.sdk.openadsdk.orq.uef.uef uefVar = this.sy;
        if (uefVar != null) {
            uefVar.oa();
        }
        if (this.f25438oa == null || !dj()) {
            return;
        }
        this.f25438oa.yo();
    }

    public void uef(long j8) {
        moa.ivm ivmVar = this.f25438oa;
        if (ivmVar != null) {
            ivmVar.yo();
        }
    }

    public void uef(com.bytedance.sdk.openadsdk.core.yo.lw lwVar) {
        com.bytedance.sdk.openadsdk.orq.uef.uef uefVar;
        if (this.dz && (uefVar = this.sy) != null) {
            uefVar.uef(lwVar);
        }
    }
}
