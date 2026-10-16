package com.bytedance.sdk.openadsdk.activity.single;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import com.bytedance.sdk.component.utils.orq;
import com.bytedance.sdk.component.utils.ue;
import com.bytedance.sdk.openadsdk.activity.single.oa;
import com.bytedance.sdk.openadsdk.common.ab;
import com.bytedance.sdk.openadsdk.component.reward.uef.dj;
import com.bytedance.sdk.openadsdk.core.model.cp;
import com.bytedance.sdk.openadsdk.core.model.dhk;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.core.sy;
import com.bytedance.sdk.openadsdk.core.widget.oa;
import com.bytedance.sdk.openadsdk.utils.gb;
import com.google.android.gms.common.api.f;
import j$.util.Objects;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class lw extends bcc implements ue.uef {
    private static String dhk;
    private static String lw;
    private static String moa;
    private static String orq;
    private static String tpx;
    private JSONObject cp;
    private boolean fz;
    private boolean gr;
    private int gsd;
    private Bundle gzw;
    private int ku;

    /* renamed from: oa, reason: collision with root package name */
    protected final ue f25231oa;
    private long pz;
    private oa.lw rt;

    /* renamed from: ue, reason: collision with root package name */
    private boolean f25232ue;
    public boolean uef;
    protected com.bytedance.sdk.openadsdk.component.reward.oa.oa yo;

    public lw(oa oaVar, gzw gzwVar, int i5, int i10, boolean z2, boolean z10, boolean z11) {
        super(oaVar, gzwVar, i5, i10, z10);
        this.f25231oa = new ue(Looper.getMainLooper(), this);
        this.gsd = 0;
        this.fz = true;
        this.f25225ab = z2;
        this.cq = oaVar.lw();
        this.uef = z11;
        uef(gzwVar, this.gzw);
    }

    private void cp() {
        if (this.gr) {
            return;
        }
        this.gr = true;
        if (this.cq) {
            this.xs.uef(uef(), pu());
        } else {
            this.xs.uef(uef());
        }
        this.yo.gsd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hnk() {
        oa.lw lwVar = new oa.lw(7, this.cz);
        lwVar.moa = this.cz.gem;
        this.xs.oa(this, lwVar);
    }

    private boolean ou() {
        if (this.ivm.ivm()) {
            return this.cz.cz.get();
        }
        return true;
    }

    private void pz() {
        if (this.f25232ue) {
            return;
        }
        this.f25232ue = true;
        if (!this.uef) {
            this.cz.ggp = this.xs.gsd();
        }
        this.cz.km.uef(this.yo);
        this.yo.uef(this, this.f25231oa);
        this.yo.zjm();
    }

    private void vjj() {
        try {
            pz();
        } catch (Throwable unused) {
            swd();
        }
        cp();
        if (!dhk.ivm(this.ivm) || this.uef) {
            return;
        }
        wxf();
    }

    @Override // com.bytedance.sdk.openadsdk.core.wk.moa.oa
    public final View ab() {
        return null;
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
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.lw.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (lw.this.cz.ku.dhk()) {
                        boolean zCq = lw.this.cz.fz.cq();
                        lw.this.cz.ku.ivm(zCq);
                        lw.this.cz.oyt.ivm(8);
                        View view2 = viewZjm;
                        if (view2 instanceof com.bytedance.sdk.openadsdk.core.ivm.moa) {
                            ((com.bytedance.sdk.openadsdk.core.ivm.moa) view2).setImageResource(orq.moa(lw.this.cz.af, "tt_close_btn"));
                        }
                        lw.this.cz.sk.sendEmptyMessageDelayed(600, 5000L);
                        if (!gzw.yo(lw.this.cz.f25412oa)) {
                            return;
                        }
                        if (gzw.yo(lw.this.cz.f25412oa) && zCq) {
                            return;
                        }
                    }
                    lw.this.cz.ku.tpx();
                    lw.this.cz.fz.dj();
                    lw.this.cz.gr.ivm();
                    if (cp.moa(lw.this.cz.f25412oa) && lw.this.uef(true, true, (Runnable) null)) {
                        return;
                    }
                    lw.this.swd();
                }
            };
            viewZjm.setOnClickListener(onClickListener);
            viewZjm.setTag(viewZjm.getId(), onClickListener);
        }
        this.cz.dxx.uef(new com.bytedance.sdk.openadsdk.component.reward.top.oa() { // from class: com.bytedance.sdk.openadsdk.activity.single.lw.2
            @Override // com.bytedance.sdk.openadsdk.component.reward.top.oa
            public void moa(View view) {
                lw lwVar = lw.this;
                lwVar.oa(lwVar.cz);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.oa
            public void oa(View view) {
                lw.this.f_();
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.oa
            public void uef(View view) {
                lw lwVar = lw.this;
                if (lwVar.uef(cp.yo(lwVar.cz.f25412oa), false, (Runnable) null) || lw.this.bcc()) {
                    return;
                }
                if (!cp.lw(lw.this.cz.f25412oa)) {
                    if (!dhk.uef(lw.this.cz.f25412oa) || lw.this.cz.cq.get()) {
                        lw.this.swd();
                        return;
                    } else {
                        lw.this.swd();
                        return;
                    }
                }
                if (cp.bcc(lw.this.cz.f25412oa)) {
                    lw.this.cz.gzw.cz();
                    return;
                }
                View view2 = viewZjm;
                if (view2 != null) {
                    view2.performClick();
                } else {
                    lw.this.swd();
                }
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
                lw.this.uef(str);
            }
        });
    }

    public boolean bcc() {
        oa oaVar;
        if (this.uef || (oaVar = this.xs) == null || !oaVar.dhk()) {
            return false;
        }
        try {
            com.bytedance.sdk.openadsdk.moa.yo.uef(System.currentTimeMillis(), this.ivm, this.cz.lw, "skip", new com.bytedance.sdk.openadsdk.ab.oa.uef() { // from class: com.bytedance.sdk.openadsdk.activity.single.lw.3
                @Override // com.bytedance.sdk.openadsdk.ab.oa.uef, com.bytedance.sdk.openadsdk.ab.oa.oa
                public JSONObject oa() {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("duration", lw.this.pz);
                        jSONObject.put("percent", lw.this.ku);
                    } catch (Throwable unused) {
                    }
                    return jSONObject;
                }

                @Override // com.bytedance.sdk.openadsdk.ab.oa.uef, com.bytedance.sdk.openadsdk.ab.oa.oa
                public JSONObject uef() {
                    if (lw.this.cp != null) {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("scene_type", lw.this.cz.uef);
                            return jSONObject;
                        } catch (Throwable unused) {
                        }
                    }
                    return null;
                }
            });
        } catch (Throwable unused) {
        }
        this.xs.uef(this, true, false, false, 4);
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.core.wk.moa.oa
    public void bs() {
        etd();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.bcc
    public boolean c_() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.bcc
    public final void cq() {
        super.cq();
        if (this.cz == null || com.bytedance.sdk.component.utils.oa.uef(rl())) {
            return;
        }
        this.cz.ku.rt();
        com.bytedance.sdk.openadsdk.utils.moa.uef(rl(), this.cz.f25412oa);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.bcc
    public boolean d_() {
        return this.cz.moa;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.bcc
    public void dhk() {
        super.dhk();
        com.bytedance.sdk.openadsdk.component.reward.oa.oa oaVar = this.yo;
        if (oaVar != null) {
            oaVar.dhk();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.wk.moa.oa
    public final void dj() {
        if (this.xs == null) {
            return;
        }
        this.cz.lz.uef(this.rt.uef.getBoolean("isSkip", false), this.rt.uef.getBoolean("force", false), this.rt.uef.getBoolean("isFromLandingPage", false), this.yo, this.rt.f25256oa);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.bcc
    public final void dz() {
        super.dz();
        com.bytedance.sdk.openadsdk.component.reward.oa.oa oaVar = this.yo;
        if (oaVar == null) {
            return;
        }
        oaVar.bs();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.bcc
    public String e_() {
        return this.cz.lw;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.bcc
    public void f_() {
        this.cz.pz.uef(this.yo);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.bcc
    public boolean g_() {
        return this.cz.gem;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.bcc
    public com.bytedance.sdk.openadsdk.component.reward.uef.oa gsd() {
        return this.cz;
    }

    public boolean gzw() {
        return this.cz.ku.ue();
    }

    @Override // com.bytedance.sdk.openadsdk.core.wk.moa.oa
    public void ku() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.wk.moa.oa
    public void lw() {
        com.bytedance.sdk.component.utils.dhk.uef("TTAD.EndCardScene", "onPlayableLoadingDismiss()---" + this.zjm + ",scene = " + this);
        oa oaVar = this.xs;
        if (oaVar != null) {
            oaVar.uef(this);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.wk.moa.oa
    public void moa(boolean z2) {
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.bcc
    public void oib() {
        super.oib();
        com.bytedance.sdk.openadsdk.component.reward.oa.oa oaVar = this.yo;
        if (oaVar == null) {
            return;
        }
        oaVar.oib();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.bcc
    public boolean orq() {
        com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar = this.cz;
        return oaVar != null && oaVar.tpx.lz();
    }

    public void tpx() {
        if (pu()) {
            return;
        }
        oa.lw lwVar = new oa.lw(8, this.cz);
        lwVar.moa = this.cz.gem;
        oa oaVar = this.xs;
        if (oaVar != null) {
            oaVar.uef(this, lwVar);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.wk.moa.oa
    public boolean uef(long j8, boolean z2) {
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.core.wk.moa.oa
    public final void wk() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.wk.moa.oa
    public void wrv() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.wk.moa.oa
    public void oa(boolean z2) {
        if (!z2 || this.cz.vjj) {
            return;
        }
        etd();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.bcc
    public final void yo() {
        com.bytedance.sdk.openadsdk.component.reward.oa.oa oaVar;
        super.yo();
        if (this.cz == null || (oaVar = this.yo) == null) {
            return;
        }
        oaVar.wk();
        this.cz.cop = true;
        if (ou()) {
            com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar2 = this.cz;
            oaVar2.dxx.uef(oaVar2.f25412oa.lox());
        }
        this.cz.oyt.wk();
        this.cz.ku.bs();
        this.cz.gzw.lw();
        if (this.yo.oa()) {
            this.cz.tpx.uef(this.yo);
            this.cz.tpx.uef(false, this, this.gsd != 0);
        }
        this.gsd++;
        com.bytedance.sdk.openadsdk.component.reward.view.cz czVar = this.cz.gsd;
        if (czVar != null) {
            czVar.xs();
        }
        this.cz.rt.uef(this.f25231oa);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.bcc
    public void moa() {
        super.moa();
        com.bytedance.sdk.openadsdk.component.reward.oa.oa oaVar = this.yo;
        if (oaVar == null) {
            return;
        }
        oaVar.sy();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.bcc
    public final void uef(Activity activity, Bundle bundle) {
        this.gzw = bundle;
        super.uef(activity, bundle);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.bcc
    public final com.bytedance.sdk.openadsdk.component.reward.view.bcc uef() {
        return this.cz.km;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.sdk.openadsdk.activity.single.bcc
    public void uef(Activity activity, oa.lw lwVar) {
        oa oaVar;
        oa oaVar2;
        com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar3;
        this.rt = lwVar;
        Intent intent = activity.getIntent();
        this.wk = intent.getStringExtra("media_extra");
        this.dz = intent.getStringExtra("user_id");
        try {
            if (tpx == null) {
                tpx = orq.uef(this.cz.af, "tt_reward_msg");
                moa = orq.uef(this.cz.af, "tt_msgPlayable");
                dhk = orq.uef(this.cz.af, "tt_negtiveBtnBtnText");
                orq = orq.uef(this.cz.af, "tt_postiveBtnText");
                lw = orq.uef(this.cz.af, "tt_postiveBtnTextPlayable");
            }
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.dhk.yo("TTAD.EndCardScene", th.getMessage());
        }
        if (lwVar != null && (oaVar3 = lwVar.yo) != null) {
            com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar4 = this.cz;
            oaVar4.hts = oaVar3.hts;
            oaVar4.gem = oaVar3.gem;
            if ((this.cq || this.f25225ab) && !pu()) {
                this.cz.dj.set(oaVar3.dj.get());
            }
            this.cz.tpx.uef(oaVar3.tpx.lw());
            uef(this.cz, oaVar3);
        }
        if (this.cq || this.f25225ab) {
            try {
                pz();
            } catch (Throwable unused) {
                swd();
            }
        }
        com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar5 = this.cz;
        if (oaVar5 != null && (oaVar2 = this.xs) != null) {
            oaVar5.xvp = oaVar2.uef;
        }
        cp();
        b_();
        dj();
        if (!this.uef || (oaVar = this.xs) == null || oaVar.uef() == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar6 = this.cz;
        this.xs.uef().lw(oaVar6 != null ? oaVar6.cz.get() : -1);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.bcc
    public void yo(boolean z2) {
        dj djVar;
        long j8 = this.fz ? this.cz.hts : 0L;
        com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar = this.cz;
        if (oaVar != null && (djVar = oaVar.gr) != null) {
            djVar.oa(z2);
            this.cz.gr.yo(z2);
            if (z2 && j8 > 0) {
                this.cz.hts = j8;
            }
        }
        if (z2) {
            this.fz = false;
        }
    }

    private void uef(com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar, com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar2) {
        if (!this.cq || pu() || oaVar == null || oaVar2 == null) {
            return;
        }
        try {
            this.pz = oaVar2.tpx.dz();
            if (this.ivm.uqx()) {
                this.pz = oaVar2.ivm();
            }
            this.ku = oaVar2.tpx.gsd();
            this.cp = gb.uef(this.ivm, oaVar2.tpx.bs(), oaVar2.tpx.sy());
        } catch (Throwable unused) {
        }
    }

    private void uef(gzw gzwVar, Bundle bundle) {
        Activity activityRl = rl();
        com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar = new com.bytedance.sdk.openadsdk.component.reward.uef.oa(activityRl, this.f25231oa, gzwVar, this, 2, this.xs.oa());
        this.cz = oaVar;
        oaVar.vj = this.f25225ab;
        boolean z2 = this.uef;
        oaVar.f25411ne = z2;
        oaVar.dh = oaVar.vjj && !z2;
        oaVar.vjj = this.xs.ivm();
        com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar2 = this.cz;
        oaVar2.ot = this.cq;
        oaVar2.jkf = this.xs.moa();
        if (!this.uef) {
            this.cz.ggp = this.xs.gsd();
        }
        com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar3 = this.cz;
        oaVar3.sw = this;
        oaVar3.cp = this.xs.orq();
        com.bytedance.sdk.openadsdk.component.reward.uef.yo.uef(this.cz, activityRl.getIntent(), bundle);
        com.bytedance.sdk.openadsdk.component.reward.oa.oa oaVarUef = com.bytedance.sdk.openadsdk.component.reward.oa.ivm.uef(this.cz);
        this.yo = oaVarUef;
        this.cz.f25410hg = oaVarUef;
        Objects.toString(oaVarUef);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.bcc
    public void uef(String str) {
        this.cz.gem = !r0.gem;
        StringBuilder sb2 = new StringBuilder("will set is Mute ");
        sb2.append(this.cz.gem);
        sb2.append(" mLastVolume=");
        sb2.append(this.cz.cp.uef());
        com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar = this.cz;
        oaVar.tpx.uef(oaVar.gem, str);
        com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar2 = this.cz;
        oaVar2.ku.lw(oaVar2.gem);
        com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar3 = this.cz;
        oaVar3.gzw.oa(oaVar3.gem);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.bcc
    public void uef(Activity activity) {
        super.uef(activity);
        com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar = this.cz;
        if (oaVar == null) {
            return;
        }
        oaVar.rt.uef();
    }

    @Override // com.bytedance.sdk.component.utils.ue.uef
    public final void uef(Message message) {
        com.bytedance.sdk.openadsdk.component.reward.oa.oa oaVar = this.yo;
        if (oaVar == null) {
            return;
        }
        oaVar.uef(message);
    }

    @Override // com.bytedance.sdk.openadsdk.core.wk.moa.oa
    public void uef(String str, JSONObject jSONObject) {
        if (str == null || !"skipToNextAd".equals(str) || this.xs == null || pu()) {
            return;
        }
        oa oaVar = this.xs;
        if (oaVar != null && oaVar.rt() == null) {
            if (this.xs.yo()) {
                ab abVar = this.oib;
                if (abVar != null && abVar.uef(cp.yo(this.cz.f25412oa), false, new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.lw.4
                    @Override // java.lang.Runnable
                    public void run() {
                        lw.this.hnk();
                    }
                })) {
                    return;
                }
            } else if (uef(cp.yo(this.cz.f25412oa), false, new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.lw.5
                @Override // java.lang.Runnable
                public void run() {
                    lw.this.hnk();
                }
            })) {
                return;
            }
        }
        hnk();
    }

    @Override // com.bytedance.sdk.openadsdk.core.wk.moa.oa
    public void uef(boolean z2) {
        oa oaVar = this.xs;
        if (oaVar != null) {
            oaVar.uef(this, z2);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.bcc
    public void uef(bcc bccVar, bcc bccVar2, oa.lw lwVar) {
        com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar;
        super.uef(bccVar, bccVar2, lwVar);
        com.bytedance.sdk.component.utils.dhk.uef("TTAD.EndCardScene", "【onActiveSceneChanged】" + this.zjm + ",scene = " + this + ",newScene = " + bccVar2 + ",oldScene = " + bccVar + ",isPlayable = " + this.f25225ab);
        boolean z2 = this.zjm == bccVar2.zjm + 1;
        if (bccVar != null && (oaVar = this.cz) != null) {
            oaVar.gem = lwVar.moa;
        }
        if (z2) {
            com.bytedance.sdk.component.utils.dhk.uef("TTAD.EndCardScene", "preload index =" + this.zjm + ",new index =" + bccVar2.zjm + ",isPlayableProxy = " + this.f25225ab);
            vjj();
        }
        if (bccVar == null && this.uef) {
            com.bytedance.sdk.component.utils.dhk.uef("TTAD.EndCardScene", "preload agg-endcard =" + this.zjm + ",new index =" + bccVar2.zjm + ",isPlayableProxy = " + this.f25225ab);
            vjj();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean uef(final boolean z2, boolean z10, final Runnable runnable) {
        if (!this.cz.moa || this.xs.bs()) {
            return false;
        }
        if (!z10 && this.xs.cq()) {
            return false;
        }
        if (!sy.moa().bcc(String.valueOf(this.cz.ivm))) {
            if (!z10) {
                return false;
            }
            if (runnable == null && z2) {
                swd();
                return true;
            }
        }
        this.cz.bs.set(true);
        if (z2) {
            this.cz.gzw.ivm();
        }
        final com.bytedance.sdk.openadsdk.core.widget.oa oaVar = new com.bytedance.sdk.openadsdk.core.widget.oa(this.cz.pu);
        this.yo.wrv = oaVar;
        if (z2) {
            oaVar.uef(moa).yo(lw).moa(dhk);
        } else {
            oaVar.uef(tpx).yo(orq).moa(dhk);
        }
        this.yo.wrv.uef(new oa.InterfaceC0102oa() { // from class: com.bytedance.sdk.openadsdk.activity.single.lw.6
            @Override // com.bytedance.sdk.openadsdk.core.widget.oa.InterfaceC0102oa
            public void oa() {
                oaVar.dismiss();
                lw.this.xs.oa(true);
                lw.this.cz.bs.set(false);
                lw.this.cz.gzw.oa(f.API_PRIORITY_OTHER);
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                } else if (!z2) {
                    lw.this.bcc();
                } else {
                    lw.this.cz.gr.ivm();
                    lw.this.swd();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.oa.InterfaceC0102oa
            public void uef() {
                if (z2) {
                    lw.this.cz.gzw.uef(1000);
                }
                oaVar.dismiss();
                lw.this.cz.bs.set(false);
            }
        }).show();
        return true;
    }
}
