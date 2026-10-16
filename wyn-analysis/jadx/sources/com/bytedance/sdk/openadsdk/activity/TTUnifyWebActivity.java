package com.bytedance.sdk.openadsdk.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.dhk;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity;
import com.bytedance.sdk.openadsdk.component.reward.dz;
import com.bytedance.sdk.openadsdk.component.reward.uef.wrv;
import com.bytedance.sdk.openadsdk.component.reward.yo.lw;
import com.bytedance.sdk.openadsdk.component.reward.yo.oa;
import com.bytedance.sdk.openadsdk.core.cp;
import com.bytedance.sdk.openadsdk.core.gb;
import com.bytedance.sdk.openadsdk.core.ivm.yo;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.core.sy;
import com.bytedance.sdk.openadsdk.core.wk;
import com.bytedance.sdk.openadsdk.moa.zjm;
import com.bytedance.sdk.openadsdk.utils.af;
import com.bytedance.sdk.openadsdk.utils.moa;
import com.bytedance.sdk.openadsdk.utils.pz;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public abstract class TTUnifyWebActivity extends TTBaseActivity implements lw {
    private yo bcc;
    private int dj;
    private final wrv.oa ivm;
    protected gzw lw;
    protected oa moa;

    /* renamed from: oa, reason: collision with root package name */
    protected boolean f25156oa;
    public final String uef;
    private Context wrv;
    private final AtomicBoolean xs;
    int yo;

    public TTUnifyWebActivity() {
        this.uef = uef() ? "rewarded_video" : "fullscreen_interstitial_ad";
        this.yo = 1;
        this.ivm = new wrv.oa();
        this.xs = new AtomicBoolean(false);
        this.dj = -1;
    }

    private void uef(gzw gzwVar, Bundle bundle) {
        Intent intent = getIntent();
        if (intent != null) {
            z = intent.getIntExtra("orientation_angle", 0) == 3;
            gzwVar.uef(intent.getLongExtra("start_show_time", 0L));
        }
        this.wrv = sy.uef();
        yo yoVar = new yo(this);
        this.bcc = yoVar;
        oa oaVarUef = uef(this, this.wrv, gzwVar, this.uef, yoVar, this.zjm);
        this.moa = oaVarUef;
        oaVarUef.yo(bundle);
        cp.uef().lw();
        com.bytedance.sdk.openadsdk.component.reward.uef.yo.uef(this.moa, intent, bundle);
        oa oaVar = this.moa;
        oaVar.f25461oa = z;
        oaVar.uef(bundle);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void finish() {
        super.finish();
        if (pz.ivm()) {
            af.oa((Activity) this);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity
    public boolean moa() {
        return true;
    }

    public void oa() {
        finish();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        oa oaVar = this.moa;
        if (oaVar != null) {
            oaVar.bcc();
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
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
        com.bytedance.sdk.openadsdk.utils.oa.uef(gzwVarUef);
        this.f25156oa = com.bytedance.sdk.openadsdk.gzw.lw.uef("adapt_decor_size", 0) == 1;
        dhk.uef("BVA", "activity onCreate isAdaptDecorSize =" + this.f25156oa);
        gzwVarUef.pu(String.valueOf(hashCode()));
        this.yo = gzwVarUef.cgg();
        this.lw = gzwVarUef;
        uef(gzwVarUef, bundle);
        if (bundle != null) {
            if (gzwVarUef.af()) {
                this.xs.set(true);
            }
            zjm.uef(gzwVarUef, "activity_recreate", gzwVarUef.lw(), "activity_recreate", null);
        }
        try {
            yo();
        } catch (Throwable th) {
            dhk.uef("TTUnifyWebActivity", "onCreate: ", th);
            zjm.uef(gzwVarUef, "show_ad_fail", this.uef, "init_view_crash");
            finish();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        dhk.uef("BVA", "onDestroy ".concat(String.valueOf(this)));
        oa oaVar = this.moa;
        if (oaVar == null) {
            return;
        }
        oaVar.xs();
        AdSlot adSlotCl = this.lw.cl();
        if (!this.moa.dz() && adSlotCl != null && TextUtils.isEmpty(adSlotCl.getBidAdm()) && !this.lw.tpq()) {
            wk.oa().post(new dz(uef(), adSlotCl));
        }
        this.ivm.uef(this);
        gb.uef().uef(String.valueOf(hashCode()));
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void onPause() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        super.onPause();
        dhk.uef("BVA", "onPause ".concat(String.valueOf(this)));
        oa oaVar = this.moa;
        if (oaVar != null) {
            oaVar.ivm();
        }
    }

    @Override // android.app.Activity
    public void onRestart() {
        super.onRestart();
        gzw gzwVar = this.lw;
        if (gzwVar != null) {
            if (this.cz && !gzwVar.zyw() && !TextUtils.isEmpty(gzw.uef(this, this.lw))) {
                finish();
            }
            if (this.lw.zyw()) {
                this.lw.wk(false);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void onResume() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        super.onResume();
        dhk.uef("BVA", "onResume ".concat(String.valueOf(this)));
        if (this.moa == null) {
            return;
        }
        this.ivm.uef(this, this.yo, this.lw.gze(), this.f25156oa);
        this.moa.yo();
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        oa oaVar = this.moa;
        if (oaVar == null) {
            super.onSaveInstanceState(bundle);
            return;
        }
        oaVar.oa(bundle);
        if (!TextUtils.isEmpty(this.zjm)) {
            bundle.putString("single_process_listener_key", this.zjm);
        }
        int iUef = this.lw != null ? cp.uef().uef(this.lw) : -1;
        this.dj = iUef;
        com.bytedance.sdk.openadsdk.component.reward.uef.yo.uef(this.moa, bundle, iUef);
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        dhk.uef("BVA", "onStart mMetaIndex =" + this.dj + " this =" + this);
        if (this.dj >= 0) {
            cp.uef().yo(this.dj);
            this.dj = -1;
        }
        if (this.moa != null) {
            moa.uef(this, this.lw);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z2) {
        super.onWindowFocusChanged(z2);
        oa oaVar = this.moa;
        if (oaVar != null) {
            oaVar.uef(z2);
        }
    }

    public abstract oa uef(Activity activity, Context context, gzw gzwVar, String str, yo yoVar, String str2);

    public abstract boolean uef();

    public void yo() {
        setContentView(this.bcc);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.yo.lw
    public void uef(Bundle bundle) {
        if (bundle != null) {
            this.zjm = bundle.getString("single_process_listener_key");
        } else if (getIntent() != null) {
            this.zjm = getIntent().getStringExtra("single_process_listener_key");
        } else {
            this.zjm = "";
        }
    }
}
