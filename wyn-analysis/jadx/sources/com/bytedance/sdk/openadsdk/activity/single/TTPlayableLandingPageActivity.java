package com.bytedance.sdk.openadsdk.activity.single;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Toast;
import com.applovin.shadow.okhttp3.internal.http2.Http2Connection;
import com.applovin.shadow.okio.Segment;
import com.bykv.vk.openvk.preload.falconx.loader.ILoader;
import com.bytedance.sdk.component.utils.dhk;
import com.bytedance.sdk.component.utils.orq;
import com.bytedance.sdk.component.utils.ue;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.core.ku;
import com.bytedance.sdk.openadsdk.core.model.cp;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.core.oyt;
import com.bytedance.sdk.openadsdk.core.sy;
import com.bytedance.sdk.openadsdk.core.widget.zjm;
import com.bytedance.sdk.openadsdk.core.wk;
import com.bytedance.sdk.openadsdk.core.yo.yo;
import com.bytedance.sdk.openadsdk.moa.cq;
import com.bytedance.sdk.openadsdk.moa.yo;
import com.bytedance.sdk.openadsdk.orq.xs;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.af;
import com.bytedance.sdk.openadsdk.utils.dj;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class TTPlayableLandingPageActivity extends TTBaseLandingPageActivity implements ue.uef, com.bytedance.sdk.openadsdk.core.wk.moa.oa, com.bytedance.sdk.openadsdk.core.yo.moa {
    private static final xs.uef rl = new xs.uef() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTPlayableLandingPageActivity.1
    };

    /* renamed from: ab, reason: collision with root package name */
    private zjm f25195ab;
    private com.bytedance.sdk.openadsdk.moa.moa.lw af;
    private String bs;
    private com.bytedance.sdk.openadsdk.orq.uef.uef cop;
    private com.bytedance.sdk.openadsdk.tpx.uef.uef.yo cp;
    private com.bytedance.sdk.openadsdk.core.ivm.moa cq;
    private oyt dhk;
    private com.bytedance.sdk.openadsdk.core.ivm.moa dz;
    private String fz;
    private boolean gem;
    private String gzw;
    private com.bytedance.sdk.component.cz.ivm ivm;
    private com.bytedance.sdk.openadsdk.orq.bcc km;

    /* renamed from: oa, reason: collision with root package name */
    TTAdDislikeToast f25196oa;
    private oyt oib;
    private String orq;
    private ILoader pu;
    private boolean pz;
    private gzw rt;
    private cq sk;
    private String sy;
    private int tpx;

    /* renamed from: ue, reason: collision with root package name */
    private boolean f25197ue;
    ku uef;
    private Context wk;
    private com.bytedance.sdk.openadsdk.core.ivm.moa wrv;
    private boolean xs = true;
    private boolean bcc = false;
    private boolean dj = true;
    final AtomicBoolean yo = new AtomicBoolean(false);
    private final String gsd = "embeded_ad";
    private final ue gr = new ue(Looper.getMainLooper(), this);
    private final AtomicBoolean ku = new AtomicBoolean(false);
    private final AtomicInteger dxx = new AtomicInteger(0);
    private final AtomicInteger lz = new AtomicInteger(0);
    private final AtomicInteger oyt = new AtomicInteger(0);
    private boolean gb = false;
    int moa = -1;
    protected com.bytedance.sdk.openadsdk.cq.lw lw = new com.bytedance.sdk.openadsdk.cq.lw() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTPlayableLandingPageActivity.8
        @Override // com.bytedance.sdk.openadsdk.cq.lw
        public void uef() {
            if (!TTPlayableLandingPageActivity.this.isFinishing() && cp.cq(TTPlayableLandingPageActivity.this.rt) && cp.dz(TTPlayableLandingPageActivity.this.rt)) {
                TTPlayableLandingPageActivity.this.gr.removeMessages(2);
                TTPlayableLandingPageActivity.this.gr.sendMessage(TTPlayableLandingPageActivity.this.uef(1, 0));
            }
        }
    };
    private int swd = 1;

    private void cq() {
        int i5 = sy.moa().ue(String.valueOf(this.rt.jnk())).bs;
        if (i5 >= 0) {
            this.gr.sendEmptyMessageDelayed(1, i5 * 1000);
        } else {
            af.uef((View) this.wrv, 0);
        }
    }

    private void cz() {
        if (this.rt.ykf() == 4) {
            this.cp = com.bytedance.sdk.openadsdk.tpx.uef.uef.moa.uef(this.wk, "interaction");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dhk() {
        TTAdDislikeToast tTAdDislikeToast = this.f25196oa;
        if (tTAdDislikeToast != null) {
            tTAdDislikeToast.show(TTAdDislikeToast.getDislikeSendTip());
        }
    }

    private void dz() {
        com.bytedance.sdk.openadsdk.core.ivm.moa moaVar = this.wrv;
        if (moaVar != null) {
            moaVar.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTPlayableLandingPageActivity.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (TTPlayableLandingPageActivity.this.af != null) {
                        TTPlayableLandingPageActivity.this.af.xs();
                    }
                    TTPlayableLandingPageActivity.this.gr.sendMessage(TTPlayableLandingPageActivity.this.uef(4, 0));
                    TTPlayableLandingPageActivity.this.uef("playable_close");
                    TTPlayableLandingPageActivity.this.finish();
                }
            });
        }
        com.bytedance.sdk.openadsdk.core.ivm.moa moaVar2 = this.cq;
        if (moaVar2 != null) {
            moaVar2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTPlayableLandingPageActivity.3
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    TTPlayableLandingPageActivity.this.oa();
                }
            });
        }
        com.bytedance.sdk.openadsdk.core.ivm.moa moaVar3 = this.dz;
        if (moaVar3 != null) {
            moaVar3.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTPlayableLandingPageActivity.4
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    TTPlayableLandingPageActivity.this.gb = !r2.gb;
                    TTPlayableLandingPageActivity tTPlayableLandingPageActivity = TTPlayableLandingPageActivity.this;
                    tTPlayableLandingPageActivity.ivm(tTPlayableLandingPageActivity.gb);
                    if (TTPlayableLandingPageActivity.this.km != null) {
                        TTPlayableLandingPageActivity.this.km.uef(TTPlayableLandingPageActivity.this.gb);
                    }
                }
            });
        }
    }

    private void oib() {
        TTAdDislikeToast tTAdDislikeToast = this.f25196oa;
        if (tTAdDislikeToast != null) {
            tTAdDislikeToast.show(TTAdDislikeToast.getDislikeTip());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void orq() {
        com.bytedance.sdk.openadsdk.core.cp.uef().oa(this.rt);
    }

    private void sy() {
        super.onBackPressed();
        com.bytedance.sdk.openadsdk.moa.moa.lw lwVar = this.af;
        if (lwVar != null) {
            lwVar.xs();
        }
    }

    private void tpx() {
        com.bytedance.sdk.openadsdk.core.yo.uef uefVar = new com.bytedance.sdk.openadsdk.core.yo.uef(this, this.rt, "embeded_ad", this.tpx) { // from class: com.bytedance.sdk.openadsdk.activity.single.TTPlayableLandingPageActivity.6
            @Override // com.bytedance.sdk.openadsdk.core.yo.uef, com.bytedance.sdk.openadsdk.core.yo.oa, com.bytedance.sdk.openadsdk.core.yo.yo
            public void uef(View view, float f10, float f11, float f12, float f13, SparseArray<yo.uef> sparseArray, boolean z2) throws JSONException {
                gzw gzwVar = ((com.bytedance.sdk.openadsdk.core.yo.oa) this).ivm;
                if (gzwVar == null || gzwVar.vjj() != 1 || z2) {
                    super.uef(view, f10, f11, f12, f13, sparseArray, z2);
                    TTPlayableLandingPageActivity.this.orq();
                    TTPlayableLandingPageActivity.this.f25197ue = true;
                    TTPlayableLandingPageActivity.this.pz = true;
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("playable_url", TTPlayableLandingPageActivity.this.orq);
                    } catch (JSONException e7) {
                        dhk.uef("TTPWPActivity", "onClick JSON ERROR", e7);
                    }
                    com.bytedance.sdk.openadsdk.moa.yo.oa(TTPlayableLandingPageActivity.this.rt, ((com.bytedance.sdk.openadsdk.core.yo.oa) this).xs, "click_playable_download_button_loading", jSONObject);
                }
            }
        };
        uefVar.uef(this.cp);
        com.bytedance.sdk.openadsdk.orq.uef.uef uefVar2 = this.cop;
        if (uefVar2 != null) {
            uefVar2.uef(uefVar);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity
    public void a_() {
        sy();
    }

    @Override // com.bytedance.sdk.openadsdk.core.wk.moa.oa
    public View ab() {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.core.wk.moa.oa
    public void bs() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.wk.moa.oa
    public void dj() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.wk.moa.oa
    public void hg() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.wk.moa.oa
    public void hts() {
        orq();
    }

    @Override // com.bytedance.sdk.openadsdk.core.wk.moa.oa
    public void ku() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.wk.moa.oa
    public void lw() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.wk.moa.oa
    public void lz() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.wk.moa.oa
    public void moa(boolean z2) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.wk.moa.oa
    public void nkh() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.wk.moa.oa
    public void oa(int i5) {
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        sy();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void onCreate(Bundle bundle) throws JSONException {
        super.onCreate(bundle);
        if (!wk.lw()) {
            finish();
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        try {
            requestWindowFeature(1);
            getWindow().addFlags(Segment.SHARE_MINIMUM);
            getWindow().addFlags(Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
            sy.oa(this);
            ivm();
        } catch (Throwable unused) {
        }
        oa(bundle);
        gzw gzwVar = this.rt;
        if (gzwVar == null) {
            return;
        }
        this.gem = gzwVar.geh();
        int iWk = cp.wk(this.rt);
        if (iWk == 0) {
            setRequestedOrientation(14);
        } else if (iWk == 1) {
            setRequestedOrientation(1);
        } else if (iWk == 2) {
            setRequestedOrientation(0);
            this.swd = 2;
        }
        this.wk = this;
        try {
            setContentView(bcc());
            dz();
            cz();
            tpx();
            this.cop.uef(this);
            this.cop.uef(false, (com.bytedance.sdk.openadsdk.cq.xs) null);
            cq();
            yo.uef.uef(SystemClock.elapsedRealtime() - jElapsedRealtime, this.rt, "embeded_ad", this.pu, this.fz);
            com.bytedance.sdk.openadsdk.orq.uef.uef uefVar = this.cop;
            if (uefVar != null) {
                uefVar.uef();
            }
        } catch (Throwable unused2) {
            finish();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseLandingPageActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.bytedance.sdk.openadsdk.core.cp.uef().yo(this.rt);
        com.bytedance.sdk.openadsdk.orq.uef.uef uefVar = this.cop;
        if (uefVar != null) {
            uefVar.moa();
        }
        com.bytedance.sdk.openadsdk.moa.moa.lw lwVar = this.af;
        if (lwVar != null) {
            lwVar.uef(true);
            this.af.dj();
        }
        this.gr.removeCallbacksAndMessages(null);
        try {
            if (getWindow() != null) {
                ((ViewGroup) getWindow().getDecorView()).removeAllViews();
            }
        } catch (Throwable unused) {
        }
        if (!TextUtils.isEmpty(this.fz)) {
            yo.uef.uef(this.lz.get(), this.dxx.get(), this.rt);
        }
        com.bytedance.sdk.openadsdk.xs.oa.uef().uef(this.pu);
        com.bytedance.sdk.component.cz.ivm ivmVar = this.ivm;
        if (ivmVar != null) {
            com.bytedance.sdk.openadsdk.core.af.uef(ivmVar.getWebView());
            this.ivm.ab();
        }
        this.ivm = null;
        oyt oytVar = this.oib;
        if (oytVar != null) {
            oytVar.wrv();
        }
        oyt oytVar2 = this.dhk;
        if (oytVar2 != null) {
            oytVar2.wrv();
        }
        com.bytedance.sdk.openadsdk.orq.bcc bccVar = this.km;
        if (bccVar != null) {
            bccVar.km();
        }
        cq cqVar = this.sk;
        if (cqVar != null) {
            cqVar.moa(true);
        }
        ku kuVar = this.uef;
        if (kuVar != null) {
            kuVar.oa();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseLandingPageActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void onPause() throws IllegalAccessException, JSONException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        super.onPause();
        oyt oytVar = this.oib;
        if (oytVar != null) {
            oytVar.uef(false);
        }
        com.bytedance.sdk.openadsdk.orq.bcc bccVar = this.km;
        if (bccVar != null) {
            bccVar.uef(true);
            this.km.yo(false);
        }
        com.bytedance.sdk.openadsdk.orq.uef.uef uefVar = this.cop;
        if (uefVar != null) {
            uefVar.yo();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseLandingPageActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void onResume() throws IllegalAccessException, JSONException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        super.onResume();
        oyt oytVar = this.oib;
        if (oytVar != null) {
            oytVar.dj();
            com.bytedance.sdk.component.cz.ivm ivmVar = this.ivm;
            if (ivmVar != null) {
                this.oib.uef(ivmVar.getVisibility() == 0);
            }
        }
        oyt oytVar2 = this.dhk;
        if (oytVar2 != null) {
            oytVar2.dj();
        }
        com.bytedance.sdk.openadsdk.orq.bcc bccVar = this.km;
        if (bccVar != null) {
            bccVar.yo(true);
        }
        cq cqVar = this.sk;
        if (cqVar != null) {
            cqVar.xs();
        }
        if (DeviceUtils.xs() == 0) {
            this.gb = true;
        }
        ivm(this.gb);
        com.bytedance.sdk.openadsdk.orq.uef.uef uefVar = this.cop;
        if (uefVar != null) {
            uefVar.oa();
        }
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        try {
            int iUef = this.rt != null ? com.bytedance.sdk.openadsdk.core.cp.uef().uef(this.rt) : -1;
            this.moa = iUef;
            bundle.putInt("meta_index", iUef);
        } catch (Throwable unused) {
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        if (this.moa >= 0) {
            com.bytedance.sdk.openadsdk.core.cp.uef().yo(this.moa);
            this.moa = -1;
        }
        com.bytedance.sdk.openadsdk.moa.moa.lw lwVar = this.af;
        if (lwVar != null) {
            lwVar.cz();
        }
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        com.bytedance.sdk.openadsdk.moa.moa.lw lwVar = this.af;
        if (lwVar != null) {
            lwVar.bcc();
        }
        cq cqVar = this.sk;
        if (cqVar != null) {
            cqVar.bcc();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.wk.moa.oa
    public void oyt() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.wk.moa.oa
    public void uef(Bundle bundle) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.wk.moa.oa
    public void wk() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.wk.moa.oa
    public void wrv() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.wk.moa.oa
    public void zjm() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.wk.moa.oa
    public List<gzw> zou() {
        return null;
    }

    private View bcc() {
        com.bytedance.sdk.openadsdk.core.ivm.yo yoVar = new com.bytedance.sdk.openadsdk.core.ivm.yo(this);
        yoVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.cop = new com.bytedance.sdk.openadsdk.orq.uef.uef(this.wk, this.rt, this.swd, this.gb, yoVar, true);
        int iOa = af.oa(this, 5.0f);
        this.dz = new com.bytedance.sdk.openadsdk.core.ivm.moa(this);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(af.oa(this, 28.0f), af.oa(this, 28.0f));
        layoutParams.rightMargin = af.oa(this, 56.0f);
        layoutParams.topMargin = af.oa(this, 20.0f);
        layoutParams.gravity = 8388661;
        this.dz.setLayoutParams(layoutParams);
        this.dz.setPadding(iOa, iOa, iOa, iOa);
        this.dz.setBackground(com.bytedance.sdk.openadsdk.core.widget.moa.uef());
        com.bytedance.sdk.openadsdk.core.ivm.moa moaVar = this.dz;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        moaVar.setScaleType(scaleType);
        this.dz.setImageDrawable(dj.uef(this, "tt_unmute_wrapper"));
        com.bytedance.sdk.openadsdk.core.ivm.moa moaVar2 = new com.bytedance.sdk.openadsdk.core.ivm.moa(this);
        this.cq = moaVar2;
        moaVar2.setPadding(iOa, iOa, iOa, iOa);
        this.cq.setScaleType(scaleType);
        this.cq.setBackground(com.bytedance.sdk.openadsdk.core.widget.moa.uef());
        this.cq.setImageResource(orq.moa(sy.uef(), "tt_reward_full_feedback"));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(af.oa(this, 28.0f), af.oa(this, 28.0f));
        layoutParams2.gravity = 8388661;
        layoutParams2.rightMargin = af.oa(this, 16.0f);
        layoutParams2.topMargin = af.oa(this, 20.0f);
        this.cq.setLayoutParams(layoutParams2);
        this.wrv = new com.bytedance.sdk.openadsdk.core.ivm.moa(this);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(af.oa(this, 28.0f), af.oa(this, 28.0f));
        layoutParams3.gravity = 8388659;
        layoutParams3.topMargin = af.oa(this, 20.0f);
        layoutParams3.leftMargin = af.oa(this, 16.0f);
        this.wrv.setLayoutParams(layoutParams3);
        this.wrv.setPadding(iOa, iOa, iOa, iOa);
        this.wrv.setScaleType(ImageView.ScaleType.FIT_XY);
        this.wrv.setBackground(com.bytedance.sdk.openadsdk.core.widget.moa.uef());
        this.wrv.setImageDrawable(orq.yo(this, "tt_white_lefterbackicon_titlebar"));
        this.wrv.setVisibility(0);
        yoVar.addView(this.dz);
        yoVar.addView(this.cq);
        yoVar.addView(this.wrv);
        return yoVar;
    }

    public void ivm(boolean z2) {
        try {
            this.gb = z2;
            this.dz.setImageDrawable(z2 ? dj.uef(this.wk, "tt_mute_wrapper") : dj.uef(this.wk, "tt_unmute_wrapper"));
            com.bytedance.sdk.openadsdk.orq.bcc bccVar = this.km;
            if (bccVar != null) {
                bccVar.uef(z2);
            }
            com.bytedance.sdk.openadsdk.orq.uef.uef uefVar = this.cop;
            if (uefVar != null) {
                uefVar.uef(z2);
            }
        } catch (Exception e7) {
            dhk.yo("TTPWPActivity", e7.getMessage());
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity
    public boolean moa() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.core.wk.moa.oa
    public void oa(boolean z2) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.wk.moa.oa
    public void uef(String str, JSONObject jSONObject) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.yo.moa
    public void lw(boolean z2) {
        com.bytedance.sdk.openadsdk.tpx.uef.uef.yo yoVar;
        this.f25197ue = true;
        this.pz = z2;
        if (!z2) {
            try {
                Toast.makeText(this.wk, "Download later", 0).show();
            } catch (Throwable unused) {
            }
        }
        if (!this.pz || (yoVar = this.cp) == null) {
            return;
        }
        yoVar.uef(this.rt);
    }

    @Override // com.bytedance.sdk.openadsdk.core.wk.moa.oa
    public void uef(boolean z2) {
    }

    public void yo() {
        gzw gzwVar = this.rt;
        if (gzwVar != null) {
            this.uef = new com.bytedance.sdk.openadsdk.yo.yo(this, gzwVar.em(), this.rt.tkg(), this.rt);
        }
        if (this.f25196oa == null) {
            this.f25196oa = new TTAdDislikeToast(this);
            ((FrameLayout) findViewById(R.id.content)).addView(this.f25196oa);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.wk.moa.oa
    public boolean uef(long j8, boolean z2) {
        return false;
    }

    private void oa(Bundle bundle) {
        Intent intent = getIntent();
        if (intent != null) {
            gzw gzwVarUef = com.bytedance.sdk.openadsdk.core.cp.uef().uef(com.bytedance.sdk.openadsdk.core.cp.uef(intent));
            this.rt = gzwVarUef;
            if (gzwVarUef != null) {
                this.orq = gzwVarUef.dj();
                this.tpx = this.rt.cq();
                this.f25197ue = this.rt.wk();
                this.bs = this.rt.iou();
                this.sy = this.rt.em();
                this.fz = this.rt.vup();
                this.gzw = this.rt.xw();
            }
        }
        if (bundle != null) {
            try {
                gzw gzwVarUef2 = com.bytedance.sdk.openadsdk.core.cp.uef().uef(bundle.getInt("meta_index", -1));
                this.rt = gzwVarUef2;
                if (gzwVarUef2 != null) {
                    this.bs = gzwVarUef2.iou();
                    this.sy = this.rt.em();
                    this.fz = this.rt.vup();
                    this.gzw = this.rt.xw();
                    this.orq = this.rt.dj();
                    this.tpx = this.rt.cq();
                    this.f25197ue = this.rt.wk();
                }
            } catch (Throwable unused) {
            }
        }
        if (this.rt == null) {
            finish();
            return;
        }
        try {
            this.gb = sy.moa().sy(this.rt.cl().getCodeId());
        } catch (Throwable th) {
            dhk.yo("TTPWPActivity", th.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Message uef(int i5, int i10) {
        Message messageObtain = Message.obtain();
        messageObtain.what = 2;
        messageObtain.arg1 = i5;
        if (i5 == 3) {
            messageObtain.arg2 = i10;
        }
        return messageObtain;
    }

    public void ivm() {
        af.uef((Activity) this);
        getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTPlayableLandingPageActivity.7
            @Override // android.view.View.OnSystemUiVisibilityChangeListener
            public void onSystemUiVisibilityChange(int i5) {
                if (i5 == 0) {
                    try {
                        if (TTPlayableLandingPageActivity.this.isFinishing()) {
                            return;
                        }
                        TTPlayableLandingPageActivity.this.getWindow().getDecorView().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTPlayableLandingPageActivity.7.1
                            @Override // java.lang.Runnable
                            public void run() {
                                af.uef((Activity) TTPlayableLandingPageActivity.this);
                            }
                        }, 2500L);
                    } catch (Exception e7) {
                        dhk.yo("TTPWPActivity", e7.getMessage());
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void uef(String str) {
        com.bytedance.sdk.openadsdk.moa.yo.uef(System.currentTimeMillis(), this.rt, "embeded_ad", str);
    }

    @Override // com.bytedance.sdk.component.utils.ue.uef
    public void uef(Message message) throws JSONException {
        int i5 = message.what;
        if (i5 == 1) {
            af.uef((View) this.wrv, 0);
            return;
        }
        if (i5 != 2) {
            return;
        }
        zjm zjmVar = this.f25195ab;
        if (zjmVar == null || !zjmVar.moa()) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("remove_loading_page_type", message.arg1);
                int i10 = message.arg2;
                if (i10 != 0) {
                    jSONObject.put("remove_loading_page_reason", i10);
                }
                jSONObject.put("playable_url", this.orq);
                zjm zjmVar2 = this.f25195ab;
                jSONObject.put("duration", zjmVar2 != null ? zjmVar2.getDisplayDuration() : 0L);
            } catch (JSONException e7) {
                dhk.uef("TTPWPActivity", "handleMsg json error", e7);
            }
            com.bytedance.sdk.openadsdk.moa.yo.oa(this.rt, "embeded_ad", "remove_loading_page", jSONObject);
            this.gr.removeMessages(2);
            zjm zjmVar3 = this.f25195ab;
            if (zjmVar3 != null) {
                zjmVar3.yo();
            }
        }
    }

    public void oa() {
        if (this.rt == null || isFinishing()) {
            return;
        }
        if (this.yo.get()) {
            oib();
            return;
        }
        if (this.uef == null) {
            yo();
        }
        this.uef.uef(new ku.uef() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTPlayableLandingPageActivity.5
            @Override // com.bytedance.sdk.openadsdk.core.ku.uef
            public void uef() {
            }

            @Override // com.bytedance.sdk.openadsdk.core.ku.uef
            public void uef(int i5, String str) {
                if (TTPlayableLandingPageActivity.this.yo.get() || TextUtils.isEmpty(str)) {
                    return;
                }
                TTPlayableLandingPageActivity.this.yo.set(true);
                TTPlayableLandingPageActivity.this.dhk();
            }
        });
        ku kuVar = this.uef;
        if (kuVar != null) {
            kuVar.uef();
        }
    }
}
