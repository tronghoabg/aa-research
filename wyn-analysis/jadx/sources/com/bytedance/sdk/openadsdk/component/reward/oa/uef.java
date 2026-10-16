package com.bytedance.sdk.openadsdk.component.reward.oa;

import android.widget.FrameLayout;
import com.bytedance.sdk.component.utils.ue;
import com.bytedance.sdk.openadsdk.component.reward.uef.bs;
import com.bytedance.sdk.openadsdk.component.reward.uef.cq;
import com.bytedance.sdk.openadsdk.component.reward.uef.sy;
import com.bytedance.sdk.openadsdk.component.reward.view.dj;
import com.bytedance.sdk.openadsdk.core.model.cp;
import com.bytedance.sdk.openadsdk.core.model.dhk;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;

/* loaded from: classes3.dex */
public class uef {
    protected final cq bcc;
    protected com.bytedance.sdk.openadsdk.core.wk.moa.oa cz;
    protected final dj ivm;
    protected final bs lw;
    protected int moa;

    /* renamed from: oa, reason: collision with root package name */
    protected gzw f25384oa;
    protected com.bytedance.sdk.openadsdk.component.reward.uef.oa uef;
    protected final sy xs;
    protected int yo;
    protected ue zjm;

    public uef(com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar) {
        this.uef = oaVar;
        this.f25384oa = oaVar.f25412oa;
        this.yo = oaVar.rj;
        this.moa = oaVar.dv;
        this.lw = oaVar.tpx;
        this.ivm = oaVar.oyt;
        this.xs = oaVar.ku;
        this.bcc = oaVar.dxx;
    }

    public boolean oa() {
        com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar = this.uef;
        boolean z2 = oaVar.sw == null;
        boolean zXs = oaVar.tpx.xs();
        boolean z10 = dhk.yo(this.uef.f25412oa) || !gzw.lw(this.uef.f25412oa);
        if (z2 && zXs && z10) {
            return false;
        }
        boolean zOa = dhk.oa(this.uef.f25412oa);
        boolean z11 = this.uef.f25409ab.get();
        if (zOa && z11) {
            FrameLayout frameLayoutIvm = this.uef.oyt.ivm();
            frameLayoutIvm.setVisibility(4);
            frameLayoutIvm.setVisibility(0);
            return false;
        }
        boolean z12 = this.uef.cz.get();
        boolean z13 = this.uef.zjm.get();
        if (z12 || z13) {
            return false;
        }
        return this.uef.tpx.cz() || this.uef.tpx.fz();
    }

    public void uef(com.bytedance.sdk.openadsdk.core.wk.moa.oa oaVar, ue ueVar) {
        this.cz = oaVar;
        this.zjm = ueVar;
    }

    public void yo() {
        if (cp.oa(this.uef.f25412oa) && DeviceUtils.xs() == 0) {
            this.uef.gem = true;
        }
        com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar = this.uef;
        oaVar.dxx.oa(oaVar.gem);
    }

    public boolean uef() {
        return this.uef.f25412oa.ebe() || this.uef.f25412oa.hw() == 15 || this.uef.f25412oa.hw() == 5 || this.uef.f25412oa.hw() == 50;
    }

    public void uef(boolean z2) {
        if (this.uef.cz.get()) {
            return;
        }
        gzw gzwVar = this.f25384oa;
        if (gzwVar != null && gzwVar.ib()) {
            this.bcc.yo(false);
            this.bcc.uef(true);
            this.uef.oyt.oa(8);
            this.uef.oyt.moa(8);
            return;
        }
        if (!z2) {
            this.bcc.yo(false);
            this.bcc.uef(false);
            this.bcc.moa(false);
            this.uef.oyt.ivm(8);
        } else {
            this.bcc.uef(this.uef.f25412oa.lox());
            if (uef()) {
                this.bcc.yo(true);
            }
            if (!uef() && (!(this instanceof xs) || !this.uef.f25412oa.ivm())) {
                this.bcc.lw();
                this.uef.oyt.ivm(0);
            } else {
                this.bcc.moa(true);
            }
        }
        if (z2) {
            com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar = this.uef;
            if (oaVar.uqx != com.bytedance.sdk.openadsdk.component.reward.view.yo.uef) {
                oaVar.oyt.oa(8);
                this.uef.oyt.moa(8);
                return;
            } else {
                oaVar.oyt.oa(0);
                this.uef.oyt.yo(0);
                this.uef.oyt.moa(0);
                return;
            }
        }
        this.uef.oyt.oa(4);
        this.uef.oyt.yo(8);
        this.uef.oyt.moa(8);
    }
}
