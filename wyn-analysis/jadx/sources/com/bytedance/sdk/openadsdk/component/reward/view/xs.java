package com.bytedance.sdk.openadsdk.component.reward.view;

import android.view.View;
import com.bytedance.sdk.openadsdk.component.reward.uef.oib;
import com.bytedance.sdk.openadsdk.utils.af;
import com.bytedance.sdk.openadsdk.utils.bs;

/* loaded from: classes3.dex */
public class xs {
    private boolean lw;
    private oib moa;

    /* renamed from: oa, reason: collision with root package name */
    private RFEndCardBackUpLayout f25452oa;
    private final com.bytedance.sdk.openadsdk.component.reward.uef.oa uef;
    private boolean yo;

    public xs(com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar) {
        this.uef = oaVar;
    }

    public boolean lw() {
        return this.lw;
    }

    public void moa() {
        oib oibVar = this.moa;
        if (oibVar != null) {
            oibVar.oa();
        }
    }

    public void oa() {
        this.lw = true;
        af.uef((View) this.f25452oa, 0);
    }

    public void uef() {
        if (this.yo) {
            return;
        }
        this.yo = true;
        RFEndCardBackUpLayout rFEndCardBackUpLayout = (RFEndCardBackUpLayout) this.uef.km.findViewById(bs.qn);
        this.f25452oa = rFEndCardBackUpLayout;
        if (rFEndCardBackUpLayout != null) {
            rFEndCardBackUpLayout.init(this.uef);
        }
        if (this.uef.f25412oa.ebe()) {
            this.moa = new oib(this.uef);
        }
    }

    public void yo() {
        oib oibVar = this.moa;
        if (oibVar != null) {
            oibVar.uef();
        }
    }

    public void uef(com.bytedance.sdk.openadsdk.core.yo.lw lwVar) {
        RFEndCardBackUpLayout rFEndCardBackUpLayout = this.f25452oa;
        if (rFEndCardBackUpLayout == null) {
            return;
        }
        af.uef(rFEndCardBackUpLayout, new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.xs.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        }, "TTBaseVideoActivity#mFLEndCardBackupContainer");
        oib oibVar = this.moa;
        if (oibVar != null) {
            oibVar.uef(lwVar);
        }
    }

    public boolean uef(com.bytedance.sdk.openadsdk.component.reward.uef.bs bsVar) {
        this.lw = true;
        oib oibVar = this.moa;
        if (oibVar == null || !oibVar.uef(bsVar)) {
            return false;
        }
        af.uef((View) this.f25452oa, 0);
        return true;
    }

    public void uef(int i5) {
        RFEndCardBackUpLayout rFEndCardBackUpLayout = this.f25452oa;
        if (rFEndCardBackUpLayout == null) {
            return;
        }
        rFEndCardBackUpLayout.setShownAdCount(i5);
    }
}
