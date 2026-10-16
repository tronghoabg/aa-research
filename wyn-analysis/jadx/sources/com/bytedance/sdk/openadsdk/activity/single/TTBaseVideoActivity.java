package com.bytedance.sdk.openadsdk.activity.single;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.bykv.vk.openvk.uef.uef.uef.moa.yo;
import com.bytedance.sdk.component.utils.dhk;
import com.bytedance.sdk.component.utils.ue;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.api.reward.BackupConstant;
import com.bytedance.sdk.openadsdk.common.ab;
import com.bytedance.sdk.openadsdk.common.dz;
import com.bytedance.sdk.openadsdk.common.uef;
import com.bytedance.sdk.openadsdk.component.reward.uef.bs;
import com.bytedance.sdk.openadsdk.component.reward.uef.dj;
import com.bytedance.sdk.openadsdk.component.reward.uef.wrv;
import com.bytedance.sdk.openadsdk.core.gb;
import com.bytedance.sdk.openadsdk.core.model.cp;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.core.model.ku;
import com.bytedance.sdk.openadsdk.core.sy;
import com.bytedance.sdk.openadsdk.core.wk;
import com.bytedance.sdk.openadsdk.moa.oa;
import com.bytedance.sdk.openadsdk.moa.zjm;
import com.bytedance.sdk.openadsdk.utils.af;
import com.bytedance.sdk.openadsdk.utils.dxx;
import com.bytedance.sdk.openadsdk.utils.pz;
import j$.util.Objects;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public abstract class TTBaseVideoActivity extends TTBaseActivity implements ue.uef, com.bytedance.sdk.openadsdk.core.wk.moa.oa {

    /* renamed from: ab, reason: collision with root package name */
    private final AtomicBoolean f25163ab;
    int bcc;
    private boolean bs;
    protected boolean cq;
    private int dhk;
    protected boolean dj;
    protected long dz;
    boolean ivm;
    int lw;
    final ue moa;

    /* renamed from: oa, reason: collision with root package name */
    com.bytedance.sdk.openadsdk.component.reward.uef.oa f25164oa;
    private final wrv.oa oib;
    private int sy;
    public final String uef;
    protected boolean wk;
    protected boolean wrv;
    protected dxx xs;
    protected com.bytedance.sdk.openadsdk.component.reward.oa.oa yo;

    public TTBaseVideoActivity() {
        this.uef = rt() ? "rewarded_video" : "fullscreen_interstitial_ad";
        this.f25163ab = new AtomicBoolean(false);
        this.moa = new ue(Looper.getMainLooper(), this);
        this.bs = false;
        this.sy = 0;
        this.bcc = 1;
        this.oib = new wrv.oa();
        this.dj = false;
        this.dhk = -1;
    }

    private void af() {
        com.bytedance.sdk.openadsdk.core.dz.moa moaVarUef;
        this.yo.gsd();
        this.lw = (int) this.f25164oa.tpx.gb();
        if (this.wk) {
            com.bytedance.sdk.openadsdk.common.uef.oa(new dz.uef(this.f25164oa, "TTAD.BVA", new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity.1
                @Override // java.lang.Runnable
                public void run() {
                    TTBaseVideoActivity.this.finish();
                }
            }, new uef.oa() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity.2
                @Override // com.bytedance.sdk.openadsdk.common.uef.oa
                public void uef(boolean z2, int i5) {
                    TTBaseVideoActivity.this.uef(z2, i5);
                }

                @Override // com.bytedance.sdk.openadsdk.common.uef.oa
                public void uef() {
                    TTBaseVideoActivity.this.finish();
                }
            }).uef(cz()).uef(cq()).uef());
        } else {
            gsd();
        }
        sy();
        com.bytedance.sdk.openadsdk.core.model.moa moaVarOdd = this.f25164oa.f25412oa.odd();
        if (moaVarOdd == null || (moaVarUef = moaVarOdd.uef()) == null) {
            return;
        }
        moaVarUef.uef(0L);
    }

    private boolean rl() {
        if ((this instanceof TTFullScreenExpressVideoActivity) || (this instanceof TTRewardExpressVideoActivity)) {
            return this.f25164oa.cz.get();
        }
        return true;
    }

    private void sk() {
        com.bytedance.sdk.openadsdk.component.reward.oa.oa oaVar;
        if (this.f25164oa == null || (oaVar = this.yo) == null) {
            super.onBackPressed();
        } else {
            oaVar.dhk();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity
    public void a_() {
        sk();
    }

    @Override // com.bytedance.sdk.openadsdk.core.wk.moa.oa
    public View ab() {
        return this.f25164oa.tpx.sk();
    }

    public void bcc() {
        if (com.bytedance.sdk.openadsdk.gzw.lw.bcc() && isChangingConfigurations()) {
            dhk.uef("BVA", "callback close is invoke by config change.");
            return;
        }
        if (this.ivm) {
            dhk.uef("BVA", "invoke callback onAdClose has already been called ");
            return;
        }
        this.ivm = true;
        com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar = this.f25164oa;
        gzw gzwVar = oaVar != null ? oaVar.f25412oa : null;
        if (gzwVar != null && !gzwVar.swd()) {
            long jCz = gzwVar.cz();
            if (jCz > 0) {
                long jElapsedRealtime = SystemClock.elapsedRealtime() - jCz;
                if (jElapsedRealtime > 0) {
                    gzwVar.oa(jElapsedRealtime);
                }
            }
            this.f25164oa.uef(BackupConstant.CLOSE_NOT_SHOW_CODE, BackupConstant.CLOSE_NOT_SHOW_CODE_MSG, BackupConstant.SCENE_CLOSED_WITHOUT_SHOW);
            this.f25164oa.gr.uef();
        }
        ivm();
        yo();
    }

    @Override // com.bytedance.sdk.openadsdk.core.wk.moa.oa
    public void bs() {
    }

    public void cp() {
    }

    public abstract ab cq();

    public boolean cz() {
        return !rt();
    }

    public void dhk() {
        if (ue() && !this.bs) {
            this.bs = true;
            getWindow().getDecorView().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity.3
                @Override // java.lang.Runnable
                public void run() {
                    TTBaseVideoActivity tTBaseVideoActivity = TTBaseVideoActivity.this;
                    com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar = tTBaseVideoActivity.f25164oa;
                    oaVar.f25414ue.uef(oaVar.rt.uef(tTBaseVideoActivity.bcc));
                    TTBaseVideoActivity.this.tpx();
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.wk.moa.oa
    public void dj() {
        com.bytedance.sdk.openadsdk.component.reward.oa.oa oaVar = this.yo;
        if (oaVar == null) {
            return;
        }
        oaVar.dj();
    }

    public abstract FrameLayout dxx();

    public abstract void dz();

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void finish() {
        super.finish();
        if (this.f25164oa == null) {
            return;
        }
        if (pz.ivm()) {
            af.oa((Activity) this);
        }
        if (!cp.lw(this.f25164oa.f25412oa) || this.f25164oa.gzw.moa(com.bytedance.sdk.openadsdk.component.reward.uef.cz.f25398oa)) {
            return;
        }
        ApmHelper.reportCustomError("invalid finish", "playable", new RuntimeException());
    }

    public void fz() {
    }

    public Map<String, Object> gb() {
        return null;
    }

    public abstract boolean gr();

    public abstract void gsd();

    public void gzw() {
        this.moa.removeMessages(400);
    }

    @Override // com.bytedance.sdk.openadsdk.core.wk.moa.oa
    public void hg() {
        this.f25164oa.gr.uef();
    }

    public abstract void ivm();

    public void km() {
        if (!this.f25164oa.f25412oa.uqx()) {
            if (!gzw.lw(this.f25164oa.f25412oa)) {
                this.f25164oa.tpx.uef("skip", true);
            }
            finish();
        } else if (!this.f25164oa.f25412oa.ivm()) {
            this.f25164oa.dxx.yo();
        } else if (this.f25164oa.gsd.dj() == 1) {
            this.f25164oa.dxx.yo();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.wk.moa.oa
    public void ku() {
        this.dj = true;
    }

    @Override // com.bytedance.sdk.openadsdk.core.wk.moa.oa
    public void lw() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.wk.moa.oa
    public void moa(boolean z2) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.wk.moa.oa
    public void nkh() {
    }

    public void oa(boolean z2, boolean z10) {
    }

    public abstract void oib();

    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar = this.f25164oa;
        if (oaVar == null) {
            return;
        }
        oaVar.rt.uef();
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        sk();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.wrv = bundle != null ? bundle.getBoolean("enable_new_arch", false) : getIntent() != null && getIntent().getBooleanExtra("enable_new_arch", false);
        this.dz = SystemClock.elapsedRealtime();
        sy.oa(getApplicationContext());
        if (!wk.lw()) {
            finish();
            return;
        }
        gzw gzwVarUef = com.bytedance.sdk.openadsdk.component.reward.uef.yo.uef(getIntent(), bundle, this);
        if (gzwVarUef == null) {
            finish();
            return;
        }
        this.wk = com.bytedance.sdk.openadsdk.gzw.lw.zjm();
        com.bytedance.sdk.openadsdk.utils.oa.uef(gzwVarUef);
        this.cq = com.bytedance.sdk.openadsdk.gzw.lw.uef("adapt_decor_size", 0) == 1;
        gzwVarUef.pu(String.valueOf(hashCode()));
        this.bcc = gzwVarUef.cgg();
        uef(gzwVarUef, bundle);
        if (bundle != null) {
            zjm.uef(gzwVarUef, "activity_recreate", gzwVarUef.lw(), "activity_recreate", null);
        }
        try {
            xs();
            oa();
            af();
        } catch (Throwable th) {
            dhk.uef("TTAD.BVA", "onCreate: ", th);
            zjm.uef(gzwVarUef, "show_ad_fail", this.uef, "init_view_crash");
            finish();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void onDestroy() {
        gzw gzwVar;
        super.onDestroy();
        toString();
        com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar = this.f25164oa;
        if (oaVar == null || this.yo == null) {
            return;
        }
        if (oaVar.hts > 0 && (gzwVar = oaVar.f25412oa) != null && gzwVar.swd()) {
            String strValueOf = String.valueOf(SystemClock.elapsedRealtime() - this.f25164oa.hts);
            com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar2 = this.f25164oa;
            com.bytedance.sdk.openadsdk.moa.yo.uef(strValueOf, oaVar2.f25412oa, this.uef, oaVar2.tpx.lw());
            this.f25164oa.hts = 0L;
        }
        this.f25164oa.pz.oa();
        this.moa.removeCallbacksAndMessages(null);
        this.yo.oib();
        com.bytedance.sdk.openadsdk.gsd.oa.lw.uef(this.f25164oa.f25412oa);
        com.bytedance.sdk.openadsdk.gsd.uef.yo.oa(this.f25164oa.f25412oa);
        AdSlot adSlotCl = this.f25164oa.f25412oa.cl();
        if (!this.f25164oa.tpx.lz() && adSlotCl != null && TextUtils.isEmpty(adSlotCl.getBidAdm()) && !this.f25164oa.f25412oa.tpq() && !gzw.ivm(this.f25164oa.f25412oa)) {
            wk.oa().post(new com.bytedance.sdk.openadsdk.component.reward.dz(rt(), adSlotCl));
        }
        com.bytedance.sdk.openadsdk.utils.ab.uef();
        dxx dxxVar = this.xs;
        if (dxxVar != null) {
            dxxVar.lw();
            this.xs = null;
        }
        this.oib.uef(this);
        gb.uef().uef(String.valueOf(hashCode()));
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        toString();
        com.bytedance.sdk.openadsdk.component.reward.oa.oa oaVar = this.yo;
        if (oaVar == null) {
            return;
        }
        oaVar.bs();
    }

    @Override // android.app.Activity
    public void onRestart() {
        gzw gzwVar;
        super.onRestart();
        com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar = this.f25164oa;
        if (oaVar == null || (gzwVar = oaVar.f25412oa) == null) {
            return;
        }
        if (this.cz && !gzwVar.zyw() && !TextUtils.isEmpty(gzw.uef(this, gzwVar))) {
            finish();
        }
        if (gzwVar.zyw()) {
            gzwVar.wk(false);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void onResume() {
        com.bytedance.sdk.openadsdk.component.reward.oa.oa oaVar;
        super.onResume();
        toString();
        if (this.f25164oa == null || (oaVar = this.yo) == null) {
            return;
        }
        oaVar.wk();
        com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar2 = this.f25164oa;
        oaVar2.cop = true;
        this.oib.uef(this, oaVar2.etd, oaVar2.uqx, this.cq);
        if (rl()) {
            com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar3 = this.f25164oa;
            oaVar3.dxx.uef(oaVar3.f25412oa.lox());
        }
        this.f25164oa.oyt.wk();
        this.f25164oa.ku.bs();
        this.f25164oa.gzw.lw();
        if (this.yo.oa()) {
            this.f25164oa.tpx.uef(this.yo);
            this.f25164oa.tpx.uef(false, this, this.sy != 0);
        }
        this.sy++;
        dhk();
        com.bytedance.sdk.openadsdk.component.reward.view.cz czVar = this.f25164oa.gsd;
        if (czVar != null) {
            czVar.xs();
        }
        this.f25164oa.rt.uef(this.moa);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        if (this.f25164oa == null) {
            super.onSaveInstanceState(bundle);
            return;
        }
        if (!TextUtils.isEmpty(this.zjm)) {
            bundle.putString("single_process_listener_key", this.zjm);
        }
        bundle.putBoolean("enable_new_arch", this.wrv);
        gzw gzwVar = this.f25164oa.f25412oa;
        int iUef = gzwVar != null ? com.bytedance.sdk.openadsdk.core.cp.uef().uef(gzwVar) : -1;
        this.dhk = iUef;
        com.bytedance.sdk.openadsdk.component.reward.uef.yo.uef(this.f25164oa, bundle, iUef);
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        toString();
        if (this.dhk >= 0) {
            com.bytedance.sdk.openadsdk.core.cp.uef().yo(this.dhk);
            this.dhk = -1;
        }
        com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar = this.f25164oa;
        if (oaVar == null) {
            return;
        }
        oaVar.ku.rt();
        com.bytedance.sdk.openadsdk.utils.moa.uef(this, this.f25164oa.f25412oa);
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        toString();
        com.bytedance.sdk.openadsdk.component.reward.oa.oa oaVar = this.yo;
        if (oaVar == null) {
            return;
        }
        oaVar.sy();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z2) {
        dj djVar;
        super.onWindowFocusChanged(z2);
        com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar = this.f25164oa;
        if (oaVar == null || (djVar = oaVar.gr) == null) {
            return;
        }
        djVar.oa(z2);
        this.f25164oa.gr.yo(z2);
    }

    public void orq() {
        Message message = new Message();
        message.what = 400;
        if (rt()) {
            oa(10000);
        }
        this.moa.sendMessageDelayed(message, 2000L);
    }

    public boolean pu() {
        com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar = this.f25164oa;
        if (oaVar != null) {
            return oaVar.vyg;
        }
        return false;
    }

    public void pz() {
        gzw gzwVar;
        ku kuVarBbb;
        com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar = this.f25164oa;
        if (oaVar == null || (gzwVar = oaVar.f25412oa) == null || (kuVarBbb = gzwVar.bbb()) == null) {
            return;
        }
        if (kuVarBbb.oa() == 1 || kuVarBbb.oa() == 2) {
            com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar2 = this.f25164oa;
            dxx dxxVar = new dxx(oaVar2, oaVar2.f25412oa);
            this.xs = dxxVar;
            bs bsVar = this.f25164oa.tpx;
            if (bsVar != null) {
                bsVar.uef(dxxVar);
            }
        }
    }

    public abstract boolean rt();

    public void sy() {
        if (cp.yo(this.f25164oa.f25412oa)) {
            uef(false, oa.C0124oa.yo);
            return;
        }
        com.bytedance.sdk.openadsdk.component.reward.oa.oa oaVar = this.yo;
        if (oaVar != null) {
            oaVar.uef(this.f25164oa.oyt.ivm());
            this.yo.gzw();
        }
    }

    public void tpx() {
    }

    public boolean ue() {
        return false;
    }

    public abstract void uef(long j8, long j10);

    @Override // com.bytedance.sdk.openadsdk.core.wk.moa.oa
    public void uef(boolean z2) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.wk.moa.oa
    public void wk() {
        this.f25164oa.tpx.af();
    }

    @Override // com.bytedance.sdk.openadsdk.core.wk.moa.oa
    public void wrv() {
        dj();
    }

    public abstract void yo();

    @Override // com.bytedance.sdk.openadsdk.core.wk.moa.oa
    public final void zjm() {
        gzw gzwVar;
        com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar = this.f25164oa;
        if (oaVar == null || (gzwVar = oaVar.f25412oa) == null || gzwVar.af()) {
            return;
        }
        toString();
        this.f25164oa.f25412oa.bcc(true);
        oib();
    }

    @Override // com.bytedance.sdk.openadsdk.core.wk.moa.oa
    public List<gzw> zou() {
        return this.f25164oa.f25412oa.at();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity
    public boolean moa() {
        return true;
    }

    public void oa() {
        setContentView(this.f25164oa.km);
        this.f25164oa.km.uef(this.yo);
        this.yo.uef(this, this.moa);
        this.yo.zjm();
    }

    private void uef(gzw gzwVar, Bundle bundle) {
        com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar = new com.bytedance.sdk.openadsdk.component.reward.uef.oa(this, this.moa, gzwVar, this, 0, this.cq);
        this.f25164oa = oaVar;
        com.bytedance.sdk.openadsdk.component.reward.uef.yo.uef(oaVar, getIntent(), bundle);
        Intent intent = getIntent();
        if (intent != null) {
            uef(intent);
            gzwVar.uef(intent.getLongExtra("start_show_time", 0L));
        }
        if (bundle != null && this.f25164oa.nkh) {
            dz();
        }
        com.bytedance.sdk.openadsdk.component.reward.oa.oa oaVarUef = com.bytedance.sdk.openadsdk.component.reward.oa.ivm.uef(this.f25164oa);
        this.yo = oaVarUef;
        com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar2 = this.f25164oa;
        oaVar2.f25410hg = oaVarUef;
        com.bytedance.sdk.openadsdk.utils.ab.uef(gzwVar, oaVar2.af, oaVar2.lw, oaVar2.gb);
        Objects.toString(this.yo);
    }

    @Override // com.bytedance.sdk.openadsdk.core.wk.moa.oa
    public void uef(Bundle bundle) {
        if (this.wrv) {
            if (bundle != null) {
                this.zjm = bundle.getString("single_process_listener_key");
            } else if (getIntent() != null) {
                this.zjm = getIntent().getStringExtra("single_process_listener_key");
            } else {
                this.zjm = "";
            }
        }
    }

    public void uef(Intent intent) {
        this.f25164oa.vyg = intent.getBooleanExtra("back_up", false);
    }

    public void uef(boolean z2, int i5) {
        uef(z2, false, i5);
    }

    public void uef(boolean z2, boolean z10, int i5) {
        com.bytedance.sdk.openadsdk.component.reward.oa.oa oaVar = this.yo;
        if (oaVar == null) {
            return;
        }
        oaVar.uef(z2, z10, false, i5);
    }

    public void uef(boolean z2, boolean z10) {
        if (!this.wrv || TextUtils.isEmpty(this.zjm)) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.cp.uef().uef(this.zjm, z2, z10);
    }

    @Override // com.bytedance.sdk.component.utils.ue.uef
    public void uef(Message message) {
        com.bytedance.sdk.openadsdk.component.reward.oa.oa oaVar = this.yo;
        if (oaVar == null) {
            return;
        }
        oaVar.uef(message);
    }

    @Override // com.bytedance.sdk.openadsdk.core.wk.moa.oa
    public boolean uef(long j8, boolean z2) {
        com.bytedance.sdk.openadsdk.component.reward.view.dj djVar;
        com.bytedance.sdk.openadsdk.core.model.dhk dhkVar;
        if (this.f25164oa == null) {
            return false;
        }
        this.f25163ab.set(false);
        com.bytedance.sdk.openadsdk.moa.xs xsVarBcc = this.f25164oa.bcc();
        FrameLayout frameLayoutDxx = dxx();
        if (frameLayoutDxx == null) {
            return false;
        }
        this.f25164oa.tpx.uef(frameLayoutDxx, xsVarBcc);
        Map<String, Object> mapGb = gb();
        yo.uef uefVar = new yo.uef() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTBaseVideoActivity.4
            @Override // com.bykv.vk.openvk.uef.uef.uef.moa.yo.uef
            public void oa(long j10, int i5) {
                com.bytedance.sdk.openadsdk.core.model.dhk dhkVar2;
                TTBaseVideoActivity.this.f25164oa.tpx.dj();
                com.bytedance.sdk.openadsdk.component.reward.view.dj djVar2 = TTBaseVideoActivity.this.f25164oa.oyt;
                if (djVar2 != null && (dhkVar2 = djVar2.wk) != null) {
                    dhkVar2.zjm();
                }
                if (TTBaseVideoActivity.this.f25164oa.tpx.ivm()) {
                    TTBaseVideoActivity.this.orq();
                    return;
                }
                TTBaseVideoActivity.this.f25164oa.tpx.dhk();
                TTBaseVideoActivity.this.cp();
                if (TTBaseVideoActivity.this.f25164oa.f25412oa.ivm()) {
                    TTBaseVideoActivity.this.f25164oa.gsd.uef(true);
                }
                TTBaseVideoActivity tTBaseVideoActivity = TTBaseVideoActivity.this;
                if (!tTBaseVideoActivity.f25164oa.yo) {
                    tTBaseVideoActivity.finish();
                    return;
                }
                tTBaseVideoActivity.uef(false, true, 3);
                bs bsVar = TTBaseVideoActivity.this.f25164oa.tpx;
                bsVar.uef(1 ^ (bsVar.pu() ? 1 : 0), 2);
            }

            @Override // com.bykv.vk.openvk.uef.uef.uef.moa.yo.uef
            public void uef(long j10, int i5) {
                com.bytedance.sdk.openadsdk.utils.dz dzVar;
                com.bytedance.sdk.openadsdk.utils.dz dzVar2;
                TTBaseVideoActivity.this.f25163ab.get();
                if (TTBaseVideoActivity.this.f25163ab.getAndSet(true)) {
                    return;
                }
                TTBaseVideoActivity.this.f25163ab.set(true);
                TTBaseVideoActivity.this.gzw();
                TTBaseVideoActivity.this.cp();
                TTBaseVideoActivity.this.f25164oa.tpx.uef(j10, j10);
                if (TTBaseVideoActivity.this.ue()) {
                    TTBaseVideoActivity.this.f25164oa.gsd.oa(true);
                } else {
                    TTBaseVideoActivity.this.f25164oa.f25409ab.set(true);
                }
                TTBaseVideoActivity.this.fz();
                if (TTBaseVideoActivity.this.f25164oa.f25412oa.wxf() == 36) {
                    com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar = TTBaseVideoActivity.this.f25164oa;
                    if (oaVar.yo) {
                        oaVar.orq.yo().uef(TTBaseVideoActivity.this.f25164oa.f25412oa);
                        com.bytedance.sdk.openadsdk.utils.ab.oa();
                    }
                }
                if (!TTBaseVideoActivity.this.ue() && TTBaseVideoActivity.this.f25164oa.f25412oa.hpb()) {
                    TTBaseVideoActivity.this.f25164oa.f25412oa.dor(1);
                    TTBaseVideoActivity.this.f25164oa.oyt.bs();
                }
                if (TTBaseVideoActivity.this.f25164oa.f25412oa.wxf() == 21 && !TTBaseVideoActivity.this.f25164oa.f25412oa.oib()) {
                    TTBaseVideoActivity.this.f25164oa.f25412oa.lw(true);
                    TTBaseVideoActivity.this.f25164oa.oyt.bs();
                }
                TTBaseVideoActivity tTBaseVideoActivity = TTBaseVideoActivity.this;
                if (tTBaseVideoActivity.dj && tTBaseVideoActivity.f25164oa.gsd.wrv()) {
                    return;
                }
                if (!TTBaseVideoActivity.this.ue()) {
                    if (com.bytedance.sdk.openadsdk.core.model.dhk.moa(TTBaseVideoActivity.this.f25164oa.f25412oa) || com.bytedance.sdk.openadsdk.core.model.dhk.oa(TTBaseVideoActivity.this.f25164oa.f25412oa) || com.bytedance.sdk.openadsdk.core.model.dhk.xs(TTBaseVideoActivity.this.f25164oa.f25412oa)) {
                        TTBaseVideoActivity.this.uef(false, 5);
                        if (!com.bytedance.sdk.openadsdk.core.model.dhk.oa(TTBaseVideoActivity.this.f25164oa.f25412oa) || (dzVar2 = TTBaseVideoActivity.this.f25164oa.hnk) == null) {
                            return;
                        }
                        dzVar2.uef(0L);
                        return;
                    }
                    if (com.bytedance.sdk.openadsdk.core.model.dhk.uef(TTBaseVideoActivity.this.f25164oa.f25412oa) && !TTBaseVideoActivity.this.f25164oa.cq.get()) {
                        TTBaseVideoActivity.this.f25164oa.uef(true);
                        TTBaseVideoActivity.this.f25164oa.dxx.lw(true);
                        return;
                    }
                }
                TTBaseVideoActivity tTBaseVideoActivity2 = TTBaseVideoActivity.this;
                com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar2 = tTBaseVideoActivity2.f25164oa;
                if (!oaVar2.yo) {
                    tTBaseVideoActivity2.km();
                    return;
                }
                if (oaVar2.f25412oa.uqx()) {
                    if (!TTBaseVideoActivity.this.ue()) {
                        TTBaseVideoActivity.this.f25164oa.dxx.yo();
                        return;
                    } else {
                        if (TTBaseVideoActivity.this.f25164oa.gsd.dj() == 1) {
                            TTBaseVideoActivity.this.f25164oa.dxx.yo();
                            return;
                        }
                        return;
                    }
                }
                TTBaseVideoActivity.this.uef(false, 5);
                if (!TTBaseVideoActivity.this.ue() && com.bytedance.sdk.openadsdk.core.model.dhk.oa(TTBaseVideoActivity.this.f25164oa.f25412oa) && (dzVar = TTBaseVideoActivity.this.f25164oa.hnk) != null) {
                    dzVar.uef(0L);
                }
                if (gzw.lw(TTBaseVideoActivity.this.f25164oa.f25412oa)) {
                    return;
                }
                TTBaseVideoActivity.this.f25164oa.tpx.uef("skip", true);
            }

            @Override // com.bykv.vk.openvk.uef.uef.uef.moa.yo.uef
            public void uef() {
                TTBaseVideoActivity.this.f25164oa.tpx.dj();
                TTBaseVideoActivity.this.gzw();
                TTBaseVideoActivity.this.cp();
                TTBaseVideoActivity tTBaseVideoActivity = TTBaseVideoActivity.this;
                if (tTBaseVideoActivity.f25164oa.yo) {
                    tTBaseVideoActivity.uef(false, true, 6);
                } else {
                    tTBaseVideoActivity.finish();
                }
                bs bsVar = TTBaseVideoActivity.this.f25164oa.tpx;
                bsVar.uef(!bsVar.pu() ? 1 : 0, 1 ^ (TTBaseVideoActivity.this.f25164oa.tpx.pu() ? 1 : 0));
                TTBaseVideoActivity.this.f25164oa.tpx.dhk();
            }

            @Override // com.bykv.vk.openvk.uef.uef.uef.moa.yo.uef
            public void uef(long j10, long j11) {
                com.bytedance.sdk.openadsdk.component.reward.uef.oa oaVar = TTBaseVideoActivity.this.f25164oa;
                if (!oaVar.cop && oaVar.tpx.ivm()) {
                    TTBaseVideoActivity.this.f25164oa.tpx.orq();
                }
                if (TTBaseVideoActivity.this.f25164oa.cz.get()) {
                    return;
                }
                if (j10 != TTBaseVideoActivity.this.f25164oa.tpx.dz()) {
                    TTBaseVideoActivity.this.gzw();
                }
                if (TTBaseVideoActivity.this.ue() && !TTBaseVideoActivity.this.f25164oa.tpx.ivm()) {
                    TTBaseVideoActivity.this.moa.removeMessages(300);
                    return;
                }
                TTBaseVideoActivity.this.f25164oa.tpx.uef(j10, j11);
                TTBaseVideoActivity tTBaseVideoActivity = TTBaseVideoActivity.this;
                long j12 = j10 / 1000;
                tTBaseVideoActivity.lw = (int) (tTBaseVideoActivity.f25164oa.tpx.gb() - j12);
                int i5 = (int) j12;
                if ((TTBaseVideoActivity.this.f25164oa.bs.get() || TTBaseVideoActivity.this.f25164oa.zjm.get()) && TTBaseVideoActivity.this.f25164oa.tpx.ivm()) {
                    TTBaseVideoActivity.this.f25164oa.tpx.orq();
                }
                if (TTBaseVideoActivity.this.rt()) {
                    TTBaseVideoActivity.this.f25164oa.oyt.lw(i5);
                }
                if (TTBaseVideoActivity.this.gr()) {
                    if (TTBaseVideoActivity.this.f25164oa.tpx.moa()) {
                        dxx dxxVar = TTBaseVideoActivity.this.xs;
                        if (dxxVar != null) {
                            dxxVar.uef(j10);
                            return;
                        }
                        return;
                    }
                    dxx dxxVar2 = TTBaseVideoActivity.this.xs;
                    if (dxxVar2 == null || !dxxVar2.uef()) {
                        TTBaseVideoActivity.this.uef(j10, j11);
                        return;
                    }
                    return;
                }
                TTBaseVideoActivity.this.uef(j10, j11);
            }
        };
        this.f25164oa.tpx.uef(uefVar);
        if (!this.f25164oa.f25412oa.ivm() && (djVar = this.f25164oa.oyt) != null && (dhkVar = djVar.wk) != null) {
            dhkVar.uef(uefVar);
        }
        boolean zUef = this.f25164oa.tpx.uef(j8, z2, mapGb, this.yo);
        oa(zUef, z2);
        return zUef;
    }
}
