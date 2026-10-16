package com.bytedance.sdk.openadsdk.common;

import com.bytedance.sdk.openadsdk.core.model.cp;
import com.bytedance.sdk.openadsdk.core.widget.oa;
import com.google.android.gms.common.api.f;

/* loaded from: classes3.dex */
public abstract class ab {
    protected String ivm;
    protected String lw;
    protected String moa;

    /* renamed from: oa, reason: collision with root package name */
    protected String f25298oa;
    protected final com.bytedance.sdk.openadsdk.component.reward.uef.oa xs;
    protected String yo;

    public ab(com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar) {
        this.xs = oaVar;
        lw();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean bcc() {
        if (!cp.bcc(this.xs.f25412oa)) {
            return false;
        }
        this.xs.gzw.cz();
        return true;
    }

    private boolean cz() {
        return !this.xs.f25412oa.gem() && cp.bcc(this.xs.f25412oa) && this.xs.ku.bcc().getVisibility() == 0;
    }

    private boolean ivm() {
        com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar = this.xs;
        return !oaVar.vjj && oaVar.cz.get();
    }

    private void lw() {
        if (this.f25298oa != null) {
            return;
        }
        try {
            this.f25298oa = com.bytedance.sdk.component.utils.orq.uef(this.xs.af, "tt_reward_msg");
            this.yo = com.bytedance.sdk.component.utils.orq.uef(this.xs.af, "tt_msgPlayable");
            this.ivm = com.bytedance.sdk.component.utils.orq.uef(this.xs.af, "tt_negtiveBtnBtnText");
            this.moa = com.bytedance.sdk.component.utils.orq.uef(this.xs.af, "tt_postiveBtnText");
            this.lw = com.bytedance.sdk.component.utils.orq.uef(this.xs.af, "tt_postiveBtnTextPlayable");
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.dhk.yo("RewardTipDialogHelper", "init res text failed：" + th.getMessage());
        }
    }

    private boolean oa(boolean z2, boolean z10, Runnable runnable) {
        if ((z2 || !ivm() || !bcc()) && runnable == null) {
            if (z10) {
                yo();
                return true;
            }
            moa();
        }
        return false;
    }

    private boolean xs() {
        return com.bytedance.sdk.openadsdk.core.sy.moa().bcc(String.valueOf(this.xs.ivm));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void yo(boolean z2) {
        this.xs.tpx.tpx();
        if (z2) {
            this.xs.gzw.uef(1000);
        }
        this.xs.bs.set(false);
    }

    public void moa() {
        com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar = this.xs;
        if (oaVar == null) {
            com.bytedance.sdk.component.utils.dhk.yo("execSkipTaskBaseImpl adContext is null", new Object[0]);
            return;
        }
        com.bytedance.sdk.openadsdk.activity.single.bcc bccVar = oaVar.sw;
        if (bccVar == null || !(bccVar instanceof com.bytedance.sdk.openadsdk.activity.single.lw)) {
            oaVar.tpx.dxx();
            uef.uef(this.xs);
            uef(this.xs);
        } else {
            if (((com.bytedance.sdk.openadsdk.activity.single.lw) bccVar).bcc()) {
                return;
            }
            yo();
        }
    }

    public abstract boolean oa();

    public abstract void uef(com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar);

    public abstract void uef(boolean z2);

    public abstract boolean uef();

    public abstract void yo();

    public final boolean uef(boolean z2, boolean z10, Runnable runnable) {
        com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar = this.xs;
        if (oaVar.sw instanceof com.bytedance.sdk.openadsdk.activity.single.lw) {
            if (!oaVar.moa || oa() || (this.xs.sw.sk() != null && this.xs.sw.sk().bs())) {
                return false;
            }
            if (!z10 && uef()) {
                return false;
            }
            if (!xs()) {
                if (!z10) {
                    return false;
                }
                if (runnable == null && z2) {
                    yo();
                    return true;
                }
            }
        } else {
            if (uef(z10, runnable)) {
                return false;
            }
            if (!xs()) {
                return oa(z10, z2, runnable);
            }
            if (oa()) {
                oa(z2, runnable);
                return false;
            }
            if (cz()) {
                this.xs.gzw.cz();
                return false;
            }
        }
        yo(z2, runnable);
        return true;
    }

    private void oa(boolean z2, Runnable runnable) {
        if (!(ivm() && bcc()) && runnable == null) {
            if (z2) {
                yo();
            } else {
                moa();
            }
        }
    }

    private void yo(final boolean z2, final Runnable runnable) {
        oa(z2);
        com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar = this.xs;
        if (oaVar != null && !oaVar.pu.isFinishing() && !this.xs.pu.isDestroyed()) {
            final com.bytedance.sdk.openadsdk.core.widget.oa oaVar2 = new com.bytedance.sdk.openadsdk.core.widget.oa(this.xs.pu);
            com.bytedance.sdk.openadsdk.component.reward.oa.oa oaVar3 = this.xs.f25410hg;
            if (oaVar3 == null) {
                com.bytedance.sdk.component.utils.dhk.yo("RewardTipDialogHelper", "adContext or  adType == null");
                return;
            }
            oaVar3.wrv = oaVar2;
            if (z2) {
                oaVar2.uef(this.yo).yo(this.lw).moa(this.ivm);
            } else {
                oaVar2.uef(this.f25298oa).yo(this.moa).moa(this.ivm);
            }
            oaVar2.uef(new oa.InterfaceC0102oa() { // from class: com.bytedance.sdk.openadsdk.common.ab.1
                @Override // com.bytedance.sdk.openadsdk.core.widget.oa.InterfaceC0102oa
                public void oa() {
                    oaVar2.dismiss();
                    ab.this.uef(true);
                    ab.this.xs.bs.set(false);
                    ab.this.xs.gzw.oa(f.API_PRIORITY_OTHER);
                    Runnable runnable2 = runnable;
                    if (runnable2 != null) {
                        runnable2.run();
                        return;
                    }
                    if (!z2) {
                        ab.this.moa();
                        return;
                    }
                    ab abVar = ab.this;
                    if (abVar.xs.vjj || !abVar.bcc()) {
                        ab.this.xs.gr.ivm();
                        ab.this.yo();
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.oa.InterfaceC0102oa
                public void uef() {
                    ab.this.yo(z2);
                    oaVar2.dismiss();
                }
            }).show();
            return;
        }
        com.bytedance.sdk.component.utils.dhk.yo("RewardTipDialogHelper", "adContext or activity is null");
    }

    private void oa(boolean z2) {
        this.xs.tpx.orq();
        if (z2) {
            this.xs.gzw.ivm();
        }
        this.xs.bs.set(true);
    }

    private boolean uef(boolean z2, Runnable runnable) {
        if (z2 || !uef()) {
            return false;
        }
        if (!this.xs.vjj) {
            if (ivm()) {
                return bcc();
            }
            return false;
        }
        if (runnable != null) {
            return true;
        }
        moa();
        return true;
    }
}
