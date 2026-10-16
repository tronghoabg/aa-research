package com.bytedance.sdk.openadsdk.activity.single;

import android.app.Activity;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import com.bytedance.sdk.component.utils.dhk;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.activity.single.oa;
import com.bytedance.sdk.openadsdk.api.reward.BackupConstant;
import com.bytedance.sdk.openadsdk.common.ab;
import com.bytedance.sdk.openadsdk.common.dz;
import com.bytedance.sdk.openadsdk.common.uef;
import com.bytedance.sdk.openadsdk.component.reward.wrv;
import com.bytedance.sdk.openadsdk.core.gsd;
import com.bytedance.sdk.openadsdk.core.gzw;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.core.widget.sy;
import com.bytedance.sdk.openadsdk.moa.zjm;
import com.bytedance.sdk.openadsdk.utils.gb;
import com.bytedance.sdk.openadsdk.utils.ue;
import j$.util.Objects;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class bcc implements com.bytedance.sdk.openadsdk.core.wk.moa.oa {
    public boolean bs;
    public boolean cq;
    protected com.bytedance.sdk.openadsdk.component.reward.uef.oa cz;
    public int dj;
    public String dz;
    protected gzw ivm;

    /* renamed from: oa, reason: collision with root package name */
    private boolean f25226oa;
    protected ab oib;
    protected boolean sy;
    private boolean uef;
    public String wk;
    public boolean wrv;
    protected final oa xs;
    private sy yo;
    public int zjm;
    protected final AtomicBoolean bcc = new AtomicBoolean(false);

    /* renamed from: ab, reason: collision with root package name */
    public boolean f25225ab = false;

    public bcc(oa oaVar, gzw gzwVar, int i5, int i10, boolean z2) {
        this.xs = oaVar;
        this.ivm = gzwVar;
        this.zjm = i5;
        this.dj = i10;
        this.bs = z2;
    }

    private ab bcc() {
        return new ab(this.cz) { // from class: com.bytedance.sdk.openadsdk.activity.single.bcc.1
            @Override // com.bytedance.sdk.openadsdk.common.ab
            public boolean oa() {
                return bcc.this.xs.wrv().getBoolean("reward_verify", false) || bcc.this.xs.bs();
            }

            @Override // com.bytedance.sdk.openadsdk.common.ab
            public boolean uef() {
                return bcc.this.xs.cq();
            }

            @Override // com.bytedance.sdk.openadsdk.common.ab
            public void yo() {
                bcc.this.swd();
            }

            @Override // com.bytedance.sdk.openadsdk.common.ab
            public void uef(boolean z2) {
                bcc.this.xs.oa(z2);
            }

            @Override // com.bytedance.sdk.openadsdk.common.ab
            public void uef(com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar) {
                bcc.this.uef(oaVar);
            }
        };
    }

    private uef.oa gzw() {
        return new uef.oa() { // from class: com.bytedance.sdk.openadsdk.activity.single.bcc.3
            @Override // com.bytedance.sdk.openadsdk.common.uef.oa
            public void uef(boolean z2, int i5) {
                bcc bccVar = bcc.this;
                if (bccVar instanceof uef) {
                    ((uef) bccVar).uef(z2, i5);
                } else if (bccVar instanceof lw) {
                    bccVar.dj();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.common.uef.oa
            public void uef() {
                bcc.this.swd();
            }
        };
    }

    private uef.InterfaceC0076uef pz() {
        return new uef.InterfaceC0076uef() { // from class: com.bytedance.sdk.openadsdk.activity.single.bcc.4
            @Override // com.bytedance.sdk.openadsdk.common.uef.InterfaceC0076uef
            public void uef(com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar, View view) {
                bcc.this.oa(oaVar);
            }
        };
    }

    private Runnable tpx() {
        return new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.bcc.2
            @Override // java.lang.Runnable
            public void run() {
                bcc.this.swd();
            }
        };
    }

    public int af() {
        return this.dj;
    }

    public void au() {
        oa oaVar = this.xs;
        if (oaVar == null || oaVar.oib()) {
            return;
        }
        this.xs.ab();
        this.xs.tpx();
    }

    public void b_() {
        com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar;
        oa oaVar2 = this.xs;
        boolean z2 = oaVar2 != null && oaVar2.yo();
        if (z2 && (oaVar = this.cz) != null && !(oaVar.sw instanceof ivm)) {
            this.oib = bcc();
        }
        if (z2) {
            uef(this.oib);
        }
    }

    public boolean c_() {
        return false;
    }

    public void cop() {
        com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar;
        wrv wrvVar;
        if (!d_() || (oaVar = this.cz) == null || (wrvVar = oaVar.xvp) == null) {
            return;
        }
        wrvVar.moa();
    }

    public void cq() {
    }

    public abstract boolean d_();

    public void dhk() {
    }

    public final void dor() {
        this.xs.dz();
    }

    public boolean dv() {
        return this.f25226oa;
    }

    public boolean dxx() {
        return false;
    }

    public void dz() {
    }

    public abstract String e_();

    public void etd() {
        yo(0);
    }

    public abstract void f_();

    public boolean fz() {
        return false;
    }

    public abstract boolean g_();

    public boolean gb() {
        return this.bs;
    }

    public boolean gem() {
        gzw gzwVarUef = this.xs.uef();
        if (gzwVarUef != null) {
            List<gzw> listAt = gzwVarUef.at();
            for (int i5 = 0; i5 < listAt.size(); i5++) {
                gzw gzwVar = listAt.get(i5);
                if (gzwVar != null && gzwVar.swd()) {
                    return true;
                }
            }
        }
        return false;
    }

    public abstract com.bytedance.sdk.openadsdk.component.reward.uef.oa gsd();

    @Override // com.bytedance.sdk.openadsdk.core.wk.moa.oa
    public void hg() {
        if (gsd() != null) {
            gsd().gr.uef();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.wk.moa.oa
    public final void hts() {
        gzw gzwVar;
        dor();
        com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar = this.cz;
        if (oaVar == null || (gzwVar = oaVar.f25412oa) == null) {
            return;
        }
        gzwVar.puz();
        this.cz.f25412oa.moa(true);
        if (gzw.lw(this.cz.f25412oa)) {
            com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar2 = this.cz;
            gzw gzwVar2 = oaVar2.f25412oa;
            com.bytedance.sdk.openadsdk.moa.yo.oa(gzwVar2, oaVar2.lw, gzwVar2.wzm());
        }
    }

    public void ivm(boolean z2) {
        this.sy = z2;
    }

    public void km() {
    }

    public void lw(boolean z2) {
        this.f25226oa = z2;
    }

    @Override // com.bytedance.sdk.openadsdk.core.wk.moa.oa
    public void lz() {
        dor();
    }

    public void moa() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.wk.moa.oa
    public void nkh() {
        oa oaVar = this.xs;
        if (oaVar != null) {
            oaVar.uef(this, true);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.wk.moa.oa
    public void oa(int i5) {
    }

    public void oib() {
        sy syVar = this.yo;
        if (syVar != null) {
            syVar.bcc();
            this.yo = null;
        }
        this.uef = false;
    }

    public abstract boolean orq();

    @Override // com.bytedance.sdk.openadsdk.core.wk.moa.oa
    public void oyt() {
        yo(2);
    }

    public boolean pu() {
        oa oaVar = this.xs;
        return oaVar != null && oaVar.uef(this, this.zjm);
    }

    public void rj() {
        com.bytedance.sdk.openadsdk.core.wk.uef.oa oaVarUef = gzw.uef(CacheDirFactory.getICacheDir(this.ivm.wg()).uef(), this.ivm);
        oaVarUef.uef("material_meta", this.ivm);
        oaVarUef.uef("ad_slot", this.ivm.cl());
        com.bytedance.sdk.openadsdk.core.wk.lw.uef.uef(oaVarUef, new com.bykv.vk.openvk.uef.uef.uef.lw.oa() { // from class: com.bytedance.sdk.openadsdk.activity.single.bcc.6
            @Override // com.bykv.vk.openvk.uef.uef.uef.lw.uef.InterfaceC0032uef
            public void uef(com.bykv.vk.openvk.uef.uef.uef.yo.yo yoVar, int i5) {
            }

            @Override // com.bykv.vk.openvk.uef.uef.uef.lw.uef.InterfaceC0032uef
            public void uef(com.bykv.vk.openvk.uef.uef.uef.yo.yo yoVar, int i5, String str) {
            }
        });
    }

    public Activity rl() {
        return this.xs.bcc();
    }

    public boolean rt() {
        return false;
    }

    public oa sk() {
        return this.xs;
    }

    public void swd() {
        if (this.ivm != null) {
            com.bytedance.sdk.openadsdk.ivm.oa.uef().uef("videoForceBreak", this.ivm);
        }
        this.xs.xs();
    }

    public void ue() {
    }

    public abstract com.bytedance.sdk.openadsdk.component.reward.view.bcc uef();

    public void uef(Activity activity) {
    }

    public abstract void uef(Activity activity, oa.lw lwVar);

    public abstract void uef(String str);

    public JSONObject uqx() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("oversea_version_type", 1);
            jSONObject.put("sdk_version", BuildConfig.VERSION_NAME);
            jSONObject.put("media_extra", this.wk);
            jSONObject.put("play_start_ts", 0);
            jSONObject.put("play_end_ts", 0);
            jSONObject.put("user_id", this.dz);
            jSONObject.put("trans_id", ue.uef().replace("-", ""));
            if (gsd() != null) {
                com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVarGsd = gsd();
                jSONObject.put("duration", (int) oaVarGsd.tpx.ue());
                jSONObject.put("reward_name", oaVarGsd.f25412oa.ot());
                jSONObject.put("reward_amount", oaVarGsd.f25412oa.jkf());
                jSONObject.put("network", com.bytedance.sdk.component.utils.sy.yo(oaVarGsd.af));
                JSONObject jSONObjectZec = oaVarGsd.f25412oa.zec();
                jSONObjectZec.put("gaid", com.bytedance.sdk.openadsdk.tpx.uef.oa.uef.uef().oa());
                jSONObject.put("extra", jSONObjectZec);
                jSONObject.put("video_duration", oaVarGsd.f25412oa.nj().ivm());
                String strMoa = "unKnow";
                int iUs = oaVarGsd.f25412oa.us();
                if (iUs == 2) {
                    strMoa = gb.oa();
                } else if (iUs == 1) {
                    strMoa = gb.moa();
                }
                jSONObject.put("user_agent", strMoa);
            }
            return jSONObject;
        } catch (Throwable th) {
            dhk.uef("Scene", "", th);
            return null;
        }
    }

    public boolean vyg() {
        com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVarGsd;
        sy syVar;
        if (gb() || (oaVarGsd = gsd()) == null || !oaVarGsd.f25412oa.nl() || (syVar = this.yo) == null) {
            return false;
        }
        return syVar.uef(oaVarGsd.pu);
    }

    public void wxf() {
        if (gb() || gsd() == null || gsd().km == null || !gsd().f25412oa.nl()) {
            return;
        }
        sy syVar = new sy(gsd(), new sy.uef() { // from class: com.bytedance.sdk.openadsdk.activity.single.bcc.7
            @Override // com.bytedance.sdk.openadsdk.core.widget.sy.uef
            public void ivm() {
                bcc.this.moa(1);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.sy.uef
            public void lw() {
                bcc.this.moa(2);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.sy.uef
            public int moa() {
                oa oaVar = bcc.this.xs;
                if (oaVar != null) {
                    return oaVar.dxx();
                }
                return 0;
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.sy.uef
            public void oa() {
                oa oaVar = bcc.this.xs;
                if (oaVar != null) {
                    oaVar.ku();
                }
                bcc.this.moa(1);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.sy.uef
            public void uef() {
                bcc bccVar = bcc.this;
                bccVar.yo(bccVar.gsd());
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.sy.uef
            public void yo() {
                oa oaVar = bcc.this.xs;
                if (oaVar != null) {
                    oaVar.fz();
                }
                bcc.this.moa(2);
            }
        });
        this.yo = syVar;
        syVar.uef(gsd().km);
    }

    public void yo() {
    }

    public abstract void yo(boolean z2);

    @Override // com.bytedance.sdk.openadsdk.core.wk.moa.oa
    public void zjm() {
        toString();
        au();
    }

    @Override // com.bytedance.sdk.openadsdk.core.wk.moa.oa
    public List<gzw> zou() {
        return this.xs.pz();
    }

    public void moa(int i5) {
        oa oaVar = this.xs;
        if (oaVar != null) {
            oaVar.uef(i5);
        }
    }

    public final void oa(Activity activity, oa.lw lwVar) {
        if (this.uef) {
            return;
        }
        this.uef = true;
        uef(activity, lwVar);
    }

    public void uef(Activity activity, Bundle bundle) {
    }

    public void yo(final int i5) {
        if (!this.xs.wrv().getBoolean("reward_verify", false) && !this.xs.bs() && !this.xs.cq()) {
            this.xs.wrv().putBoolean("reward_verify", true);
            if (gsd() != null) {
                com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVarGsd = gsd();
                if (com.bytedance.sdk.openadsdk.core.sy.moa().bs(String.valueOf(oaVarGsd.ivm))) {
                    uef(true, oaVarGsd.f25412oa.jkf(), oaVarGsd.f25412oa.ot(), 0, "", i5);
                } else {
                    com.bytedance.sdk.openadsdk.core.sy.yo().uef(uqx(), new gzw.oa() { // from class: com.bytedance.sdk.openadsdk.activity.single.bcc.5
                        @Override // com.bytedance.sdk.openadsdk.core.gzw.oa
                        public void uef(int i10, String str) {
                            bcc.this.uef(false, 0, "", i10, str, i5);
                        }

                        @Override // com.bytedance.sdk.openadsdk.core.gzw.oa
                        public void uef(gsd.oa oaVar) {
                            bcc.this.uef(oaVar.f25626oa, oaVar.yo.uef(), oaVar.yo.oa(), 0, "", i5);
                        }
                    });
                }
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.wk.moa.oa
    public void uef(Bundle bundle) {
    }

    public void uef(bcc bccVar, bcc bccVar2, oa.lw lwVar) {
    }

    public void oa(Activity activity) {
        if (com.bytedance.sdk.openadsdk.gzw.lw.bcc() && activity != null && activity.isChangingConfigurations()) {
            oa oaVar = this.xs;
            if (oaVar == null || oaVar.uef() == null) {
                return;
            }
            zjm.uef(this.xs.uef(), "close_interception_config_change", this.xs.uef().lw(), (String) null);
            return;
        }
        Objects.toString(this.xs);
        if (!this.xs.oib() && !gem()) {
            long jCz = this.xs.uef().cz();
            if (jCz > 0) {
                long jElapsedRealtime = SystemClock.elapsedRealtime() - jCz;
                if (jElapsedRealtime > 0) {
                    this.ivm.oa(jElapsedRealtime);
                }
            }
            com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVarGsd = gsd();
            if (oaVarGsd != null) {
                oaVarGsd.uef(BackupConstant.CLOSE_NOT_SHOW_ONE_TO_N_CODE, BackupConstant.CLOSE_NOT_SHOW_CODE_MSG, 1004);
                oaVarGsd.gr.uef();
            }
        }
        cop();
        this.xs.wk();
    }

    public void uef(com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar) {
    }

    public void uef(Map<String, Object> map, float f10, float f11) {
    }

    private void uef(ab abVar) {
        com.bytedance.sdk.openadsdk.common.uef.oa(new dz.uef(this.cz, "BVA", tpx(), gzw()).uef(c_()).uef(abVar).uef(pz()).uef());
    }

    public void yo(com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar) {
        if (pu()) {
            return;
        }
        oa.lw lwVar = new oa.lw(8, oaVar);
        lwVar.moa = oaVar.gem;
        oa oaVar2 = this.xs;
        if (oaVar2 != null) {
            oaVar2.oa(this, lwVar);
        }
    }

    public void uef(boolean z2, boolean z10, boolean z11, int i5) {
        this.xs.uef(this, z2, z10, z11, i5);
    }

    public final void uef(boolean z2, int i5, String str, int i10, String str2, int i11) {
        if (this.xs.bs()) {
            return;
        }
        this.xs.uef(this, z2, i5, str, i10, str2, i11);
        wrv.uef(this.ivm, z2, i11);
    }

    public void oa(com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar) {
        if (oaVar == null) {
            return;
        }
        try {
            int iDxx = this.xs.dxx();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("click_countdown_remaining", Math.max(iDxx, 0));
            com.bytedance.sdk.openadsdk.moa.yo.lw(this.ivm, oaVar.lw, jSONObject);
        } catch (Throwable unused) {
        }
        yo(oaVar);
    }

    public void uef(com.bytedance.sdk.openadsdk.core.model.gzw gzwVar, int i5, int i10) {
        this.ivm = gzwVar;
        this.zjm = i5;
        this.dj = i10;
    }
}
