package com.bytedance.sdk.openadsdk.activity.single;

import android.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.view.DisplayCutout;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.applovin.shadow.okio.Segment;
import com.bytedance.sdk.component.utils.dhk;
import com.bytedance.sdk.component.utils.orq;
import com.bytedance.sdk.component.utils.ue;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.common.bs;
import com.bytedance.sdk.openadsdk.core.cp;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.core.pz;
import com.bytedance.sdk.openadsdk.core.settings.dj;
import com.bytedance.sdk.openadsdk.core.sy;
import com.bytedance.sdk.openadsdk.core.wk;
import com.bytedance.sdk.openadsdk.core.wk.moa.uef;
import com.bytedance.sdk.openadsdk.core.zjm.cq;
import com.bytedance.sdk.openadsdk.gsd.oa.lw;
import com.bytedance.sdk.openadsdk.utils.af;
import com.bytedance.sdk.openadsdk.utils.cz;
import com.bytedance.sdk.openadsdk.utils.dz;
import com.bytedance.sdk.openadsdk.utils.pu;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class TTAppOpenAdActivity extends TTBaseActivity implements ue.uef, uef.InterfaceC0105uef {
    private static com.bytedance.sdk.openadsdk.uef.moa.oa dj;
    protected boolean bcc;
    private boolean cp;
    private com.bytedance.sdk.openadsdk.component.ivm.oa cq;
    private float dhk;
    private bs dz;
    private AdSlot fz;
    private int gr;
    private com.bytedance.sdk.openadsdk.uef.moa.oa gsd;
    private gzw gzw;
    private boolean km;
    private com.bytedance.sdk.openadsdk.component.yo ku;
    private long lz;
    private float oib;
    private int orq;
    private ImageView oyt;
    private dz pu;
    private FrameLayout pz;
    private com.bytedance.sdk.openadsdk.moa.xs sy;
    private boolean tpx;

    /* renamed from: ue, reason: collision with root package name */
    private int f25160ue;
    private TTAdDislikeToast wk;
    protected final AtomicBoolean uef = new AtomicBoolean(false);

    /* renamed from: oa, reason: collision with root package name */
    protected final ue f25159oa = new ue(Looper.getMainLooper(), this);
    final AtomicBoolean yo = new AtomicBoolean(false);
    final AtomicBoolean moa = new AtomicBoolean(false);
    private final com.bytedance.sdk.openadsdk.component.bcc.uef wrv = new com.bytedance.sdk.openadsdk.component.bcc.uef();
    protected boolean lw = false;

    /* renamed from: ab, reason: collision with root package name */
    private final AtomicBoolean f25158ab = new AtomicBoolean(false);
    private pu bs = pu.yo();
    private final AtomicBoolean rt = new AtomicBoolean(false);
    long ivm = 0;
    private volatile boolean dxx = false;
    int xs = -1;
    private final com.bytedance.sdk.openadsdk.component.uef gb = new com.bytedance.sdk.openadsdk.component.uef() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTAppOpenAdActivity.1
        @Override // com.bytedance.sdk.openadsdk.component.uef
        public void lw() {
            TTAppOpenAdActivity.this.gzw();
        }

        @Override // com.bytedance.sdk.openadsdk.component.uef
        public void moa() {
            TTAppOpenAdActivity.this.finish();
        }

        @Override // com.bytedance.sdk.openadsdk.component.uef, com.bykv.vk.openvk.uef.uef.uef.moa.yo.uef
        public void oa(long j8, int i5) {
            com.bytedance.sdk.openadsdk.component.bcc.yo yoVarXs;
            StringBuilder sb2 = new StringBuilder("onError() called with: totalPlayTime = [");
            sb2.append(j8);
            sb2.append("], percent = [");
            sb2.append(i5);
            sb2.append("]");
            if (TTAppOpenAdActivity.this.ku != null && (yoVarXs = TTAppOpenAdActivity.this.ku.xs()) != null) {
                TTAppOpenAdActivity.this.pz();
                yoVarXs.uef(true);
            }
            TTAppOpenAdActivity.this.gsd();
            TTAppOpenAdActivity.this.finish();
        }

        @Override // com.bytedance.sdk.openadsdk.component.uef, com.bykv.vk.openvk.uef.uef.uef.moa.yo.uef
        public void uef() {
            TTAppOpenAdActivity.this.pz();
            TTAppOpenAdActivity.this.gsd();
            TTAppOpenAdActivity.this.finish();
        }

        @Override // com.bytedance.sdk.openadsdk.component.uef
        public void yo() {
            TTAppOpenAdActivity.this.bcc();
            TTAppOpenAdActivity.this.bs.lw();
            TTAppOpenAdActivity.this.dhk();
            if (TTAppOpenAdActivity.this.tpx) {
                TTAppOpenAdActivity.this.dz();
            }
            if (TTAppOpenAdActivity.this.ku.xs() == null || TTAppOpenAdActivity.this.ku.xs().oa() == null) {
                return;
            }
            TTAppOpenAdActivity.this.ku.xs().oa().uef(TTAppOpenAdActivity.this);
        }

        @Override // com.bytedance.sdk.openadsdk.component.uef, com.bykv.vk.openvk.uef.uef.uef.moa.yo.uef
        public void uef(long j8, long j10) {
            TTAppOpenAdActivity.this.wrv.yo(j8);
            TTAppOpenAdActivity tTAppOpenAdActivity = TTAppOpenAdActivity.this;
            if (!tTAppOpenAdActivity.lw && tTAppOpenAdActivity.ku != null && TTAppOpenAdActivity.this.ku.xs() != null && TTAppOpenAdActivity.this.ku.xs().lw()) {
                TTAppOpenAdActivity.this.ku.xs().bcc();
            }
            TTAppOpenAdActivity.this.wk();
            if (TTAppOpenAdActivity.this.ku instanceof com.bytedance.sdk.openadsdk.component.oa) {
                ((com.bytedance.sdk.openadsdk.component.oa) TTAppOpenAdActivity.this.ku).uef(j8, j10);
            }
        }

        @Override // com.bytedance.sdk.openadsdk.component.uef, com.bytedance.sdk.openadsdk.component.ivm.uef
        public void oa(View view) {
            TTAppOpenAdActivity.this.oa();
        }

        @Override // com.bytedance.sdk.openadsdk.component.uef, com.bytedance.sdk.openadsdk.component.ivm.uef
        public void oa() {
            TTAppOpenAdActivity.this.dxx = true;
            if (com.bytedance.sdk.openadsdk.gzw.lw.uef("splash_auto_close_switch", 0) == 0) {
                TTAppOpenAdActivity.this.cz();
                TTAppOpenAdActivity.this.finish();
            }
        }

        @Override // com.bytedance.sdk.openadsdk.component.uef, com.bytedance.sdk.openadsdk.component.ivm.uef
        public void uef(View view) throws JSONException {
            TTAppOpenAdActivity.this.rt();
        }

        @Override // com.bytedance.sdk.openadsdk.component.uef, com.bytedance.sdk.openadsdk.component.ivm.uef
        public void uef(int i5, boolean z2) {
            if (TTAppOpenAdActivity.this.ku != null) {
                TTAppOpenAdActivity.this.ku.uef(i5, z2);
            }
            if (TTAppOpenAdActivity.this.tpx || !(TTAppOpenAdActivity.this.ku instanceof com.bytedance.sdk.openadsdk.component.oa)) {
                return;
            }
            ((com.bytedance.sdk.openadsdk.component.oa) TTAppOpenAdActivity.this.ku).uef(TTAppOpenAdActivity.this.wrv.yo(), (long) (TTAppOpenAdActivity.this.wrv.oa() * 1000.0f));
        }
    };
    private final Runnable af = new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTAppOpenAdActivity.5
        @Override // java.lang.Runnable
        public void run() throws JSONException {
            com.bytedance.sdk.openadsdk.core.model.moa moaVarOdd;
            com.bytedance.sdk.openadsdk.core.dz.moa moaVarUef;
            if (TTAppOpenAdActivity.this.f25158ab.get()) {
                return;
            }
            if (TTAppOpenAdActivity.this.gzw != null && (moaVarOdd = TTAppOpenAdActivity.this.gzw.odd()) != null && (moaVarUef = moaVarOdd.uef()) != null) {
                moaVarUef.uef(0L);
            }
            TTAppOpenAdActivity.this.sy = new com.bytedance.sdk.openadsdk.moa.xs();
            TTAppOpenAdActivity.this.sy.uef(System.currentTimeMillis(), 1.0f);
            TTAppOpenAdActivity.this.bs.lw();
            if (TTAppOpenAdActivity.this.cq != null) {
                TTAppOpenAdActivity.this.cq.oa();
            }
            if (TTAppOpenAdActivity.this.ku != null) {
                TTAppOpenAdActivity.this.ku.lw();
            }
            TTAppOpenAdActivity.this.orq();
            View viewFindViewById = TTAppOpenAdActivity.this.findViewById(R.id.content);
            JSONObject jSONObject = new JSONObject();
            if (viewFindViewById != null) {
                try {
                    jSONObject.put("width", viewFindViewById.getWidth());
                    jSONObject.put("height", viewFindViewById.getHeight());
                    jSONObject.put("alpha", viewFindViewById.getAlpha());
                } catch (JSONException e7) {
                    Log.e("TTAppOpenAdActivity", "run: ", e7);
                    TTAppOpenAdActivity.this.finish();
                    return;
                }
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("root_view", jSONObject.toString());
            jSONObject2.put("ad_root", TTAppOpenAdActivity.this.gr);
            jSONObject2.put("openad_creative_type", TTAppOpenAdActivity.this.tpx ? "video_normal_ad" : "image_normal_ad");
            if (com.bytedance.sdk.openadsdk.component.cz.bcc.yo() == null) {
                jSONObject2.put("appicon_acquirefail", UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
            }
            if (TTAppOpenAdActivity.this.cp || TTAppOpenAdActivity.this.gzw.tv()) {
                if (TTAppOpenAdActivity.this.tpx() || com.bytedance.sdk.openadsdk.component.xs.uef.dj()) {
                    jSONObject2.put("dynamic_show_type", TTAppOpenAdActivity.this.oib());
                } else {
                    jSONObject2.put("dynamic_show_type", 1);
                }
                TTAppOpenAdActivity.this.uef(jSONObject2);
            }
            jSONObject2.put("is_icon_only", TTAppOpenAdActivity.this.gzw.ku() ? 1 : 0);
            JSONObject jSONObject3 = new JSONObject();
            if (TTAppOpenAdActivity.this.gr == 1) {
                jSONObject3.putOpt("cache_duration", Long.valueOf(System.currentTimeMillis() - TTAppOpenAdActivity.this.lz));
            }
            if (TTAppOpenAdActivity.this.gzw != null) {
                int iZjm = TTAppOpenAdActivity.this.gzw.zjm();
                jSONObject3.putOpt("start_type", Integer.valueOf(iZjm == 1 ? 1 : 2));
                jSONObject3.putOpt("load_index", Integer.valueOf(iZjm));
            }
            jSONObject3.putOpt("start_type_backup", Integer.valueOf(com.bytedance.sdk.openadsdk.component.xs.uef.moa()));
            jSONObject3.putOpt("app_running_time", Long.valueOf(com.bytedance.sdk.openadsdk.component.xs.uef.oa()));
            com.bytedance.sdk.openadsdk.moa.yo.uef(TTAppOpenAdActivity.this.gzw, "open_ad", jSONObject2, jSONObject3);
            com.bytedance.sdk.openadsdk.gsd.oa.lw.uef(TTAppOpenAdActivity.this.findViewById(R.id.content), TTAppOpenAdActivity.this.gzw, new lw.uef(TTAppOpenAdActivity.this.oib()));
            com.bytedance.sdk.openadsdk.gsd.uef.yo.uef(TTAppOpenAdActivity.this.gzw);
            TTAppOpenAdActivity.this.f25158ab.set(true);
        }
    };

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity
    public void a_() throws JSONException {
        sy();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity
    public boolean moa() {
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        af.uef((Activity) this);
        getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTAppOpenAdActivity.6
            @Override // android.view.View.OnSystemUiVisibilityChangeListener
            public void onSystemUiVisibilityChange(int i5) {
                if (i5 == 0) {
                    try {
                        if (TTAppOpenAdActivity.this.isFinishing()) {
                            return;
                        }
                        TTAppOpenAdActivity.this.getWindow().getDecorView().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTAppOpenAdActivity.6.1
                            @Override // java.lang.Runnable
                            public void run() {
                                af.uef((Activity) TTAppOpenAdActivity.this);
                            }
                        }, 2500L);
                    } catch (Exception e7) {
                        dhk.yo("TTAppOpenAdActivity", e7.getMessage());
                    }
                }
            }
        });
    }

    @Override // android.app.Activity
    public void onBackPressed() throws JSONException {
        sy();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        gzw gzwVar;
        super.onCreate(bundle);
        sy.oa(getApplicationContext());
        boolean z2 = false;
        if (bundle != null) {
            z2 = bundle.getBoolean("enable_new_arch", false);
        } else if (getIntent() != null && getIntent().getBooleanExtra("enable_new_arch", false)) {
            z2 = true;
        }
        this.km = z2;
        dhk.uef("BVA", "onCreate: isEnableNewArch = " + this.km);
        if (!oa(bundle)) {
            finish();
            return;
        }
        if (!wk.lw()) {
            finish();
            return;
        }
        if (bundle != null) {
            com.bytedance.sdk.openadsdk.moa.yo.oa(this.gzw, "open_ad", (JSONObject) null, (JSONObject) null);
        }
        this.tpx = gzw.lw(this.gzw);
        new StringBuilder("onCreate: isVideo is ").append(this.tpx);
        if (!this.tpx || (gzwVar = this.gzw) == null) {
            this.wrv.uef(sy.moa().gsd(String.valueOf(this.orq)));
        } else {
            this.wrv.uef((float) gzwVar.nj().ivm());
        }
        com.bytedance.sdk.openadsdk.component.ivm.oa oaVar = new com.bytedance.sdk.openadsdk.component.ivm.oa(this.wrv);
        this.cq = oaVar;
        oaVar.uef(this.gb);
        zjm();
        FrameLayout frameLayout = new FrameLayout(this);
        this.pz = frameLayout;
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        try {
            xs();
            setContentView(this.pz);
            this.pz.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTAppOpenAdActivity.2
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (TTAppOpenAdActivity.this.gzw == null) {
                            TTAppOpenAdActivity.this.finish();
                            return;
                        }
                        int iIx = TTAppOpenAdActivity.this.gzw.ix();
                        if (com.bytedance.sdk.openadsdk.component.xs.uef.dj()) {
                            TTAppOpenAdActivity.this.cp = iIx != 1;
                            TTAppOpenAdActivity tTAppOpenAdActivity = TTAppOpenAdActivity.this;
                            tTAppOpenAdActivity.ku = new com.bytedance.sdk.openadsdk.component.oa(tTAppOpenAdActivity, tTAppOpenAdActivity.gzw, TTAppOpenAdActivity.this.pz, TTAppOpenAdActivity.this.gb, TTAppOpenAdActivity.this.f25160ue, TTAppOpenAdActivity.this.tpx, TTAppOpenAdActivity.this.wrv, TTAppOpenAdActivity.this.cq);
                            if (!TTAppOpenAdActivity.this.cp || !TTAppOpenAdActivity.this.tpx()) {
                                TTAppOpenAdActivity.this.gzw.sy(1);
                                TTAppOpenAdActivity.this.gzw.oib(1);
                            }
                        } else {
                            TTAppOpenAdActivity tTAppOpenAdActivity2 = TTAppOpenAdActivity.this;
                            if (tTAppOpenAdActivity2.gzw.ggp() == 2 && iIx != 1) {
                                z = true;
                            }
                            tTAppOpenAdActivity2.cp = z;
                            if (TTAppOpenAdActivity.this.cp && TTAppOpenAdActivity.this.tpx()) {
                                TTAppOpenAdActivity tTAppOpenAdActivity3 = TTAppOpenAdActivity.this;
                                tTAppOpenAdActivity3.ku = new com.bytedance.sdk.openadsdk.component.oa(tTAppOpenAdActivity3, tTAppOpenAdActivity3.gzw, TTAppOpenAdActivity.this.pz, TTAppOpenAdActivity.this.gb, TTAppOpenAdActivity.this.f25160ue, TTAppOpenAdActivity.this.tpx, TTAppOpenAdActivity.this.wrv, TTAppOpenAdActivity.this.cq);
                            } else {
                                TTAppOpenAdActivity tTAppOpenAdActivity4 = TTAppOpenAdActivity.this;
                                tTAppOpenAdActivity4.ku = new com.bytedance.sdk.openadsdk.component.yo(tTAppOpenAdActivity4, tTAppOpenAdActivity4.gzw, TTAppOpenAdActivity.this.pz, TTAppOpenAdActivity.this.gb, TTAppOpenAdActivity.this.f25160ue, TTAppOpenAdActivity.this.tpx, TTAppOpenAdActivity.this.wrv);
                                TTAppOpenAdActivity.this.ku.uef(TTAppOpenAdActivity.this.dhk, TTAppOpenAdActivity.this.oib);
                            }
                        }
                        TTAppOpenAdActivity.this.ku.uef((ViewGroup) TTAppOpenAdActivity.this.pz);
                        TTAppOpenAdActivity.this.ku.uef();
                        TTAppOpenAdActivity.this.ku.oa();
                    } catch (Throwable th) {
                        TTAppOpenAdActivity.this.finish();
                        dhk.yo("TTAppOpenAdActivity", th.getMessage());
                    }
                }
            });
            try {
                final View decorView = getWindow().getDecorView();
                if (Build.VERSION.SDK_INT >= 35) {
                    this.bcc = true;
                    decorView.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTAppOpenAdActivity.3
                        @Override // android.view.View.OnApplyWindowInsetsListener
                        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                            List boundingRects;
                            try {
                                DisplayCutout displayCutout = windowInsets.getDisplayCutout();
                                if (displayCutout != null && (boundingRects = displayCutout.getBoundingRects()) != null && !boundingRects.isEmpty()) {
                                    decorView.setPadding(displayCutout.getSafeInsetLeft(), displayCutout.getSafeInsetTop(), displayCutout.getSafeInsetRight(), displayCutout.getSafeInsetBottom());
                                }
                            } catch (Throwable unused) {
                            }
                            return windowInsets;
                        }
                    });
                }
            } catch (Throwable unused) {
            }
            gr();
        } catch (Throwable unused2) {
            com.bytedance.sdk.openadsdk.ab.moa.oa();
            finish();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void onDestroy() throws JSONException {
        AdSlot adSlot;
        super.onDestroy();
        if (this.gzw != null) {
            com.bytedance.sdk.openadsdk.ivm.oa.uef().uef("videoForceBreak", this.gzw);
        }
        this.f25159oa.removeCallbacksAndMessages(null);
        com.bytedance.sdk.openadsdk.component.ivm.oa oaVar = this.cq;
        if (oaVar != null) {
            oaVar.lw();
        }
        dz dzVar = this.pu;
        if (dzVar != null) {
            dzVar.yo();
        }
        com.bytedance.sdk.openadsdk.gsd.oa.lw.uef(this.gzw);
        com.bytedance.sdk.openadsdk.gsd.uef.yo.oa(this.gzw);
        if (this.tpx) {
            com.bytedance.sdk.openadsdk.component.moa.uef.uef(this.gzw, this.wrv.moa(), this.wrv.oa(), true);
        } else {
            com.bytedance.sdk.openadsdk.component.moa.uef.uef(this.gzw, -1L, this.wrv.oa(), false);
        }
        if (this.bs.ivm() && this.f25158ab.get()) {
            com.bytedance.sdk.openadsdk.moa.yo.uef(String.valueOf(this.bs.moa()), this.gzw, "open_ad", this.sy);
            this.bs = pu.yo();
        }
        com.bytedance.sdk.openadsdk.component.yo yoVar = this.ku;
        if (yoVar != null) {
            yoVar.yo();
        }
        cz();
        dj = null;
        if (this.km && !TextUtils.isEmpty(this.zjm)) {
            cp.uef().uef(this.zjm, isFinishing(), isChangingConfigurations());
        }
        this.gsd = null;
        bs bsVar = this.dz;
        if (bsVar != null) {
            bsVar.setCallback(null);
        }
        gzw gzwVar = this.gzw;
        if (gzwVar == null || gzw.ivm(gzwVar) || this.gzw.tpq() || (adSlot = this.fz) == null) {
            return;
        }
        adSlot.setCacheScene(1);
        com.bytedance.sdk.openadsdk.component.ivm.uef(sy.uef()).uef(this.fz);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void onPause() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        super.onPause();
        this.lw = false;
        lw();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void onResume() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        com.bytedance.sdk.openadsdk.component.yo yoVar;
        super.onResume();
        this.lw = true;
        if (this.uef.getAndSet(true)) {
            if (!this.rt.get()) {
                yo();
                return;
            }
            gsd();
            if (this.tpx && (yoVar = this.ku) != null && yoVar.xs() != null) {
                pz();
                this.ku.xs().uef(3);
            }
            finish();
        }
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        try {
            this.xs = this.gzw != null ? cp.uef().uef(this.gzw) : -1;
            if (!TextUtils.isEmpty(this.zjm)) {
                bundle.putString("single_process_listener_key", this.zjm);
            }
            bundle.putBoolean("enable_new_arch", this.km);
            bundle.putInt("meta_index", this.xs);
            bundle.putInt("ad_source", this.gr);
            bundle.putLong("start_show_time", this.ivm);
            bundle.putLong("cache_time", this.lz);
        } catch (Throwable th) {
            dhk.yo("TTAppOpenAdActivity", th.getMessage());
        }
        if (!this.km) {
            dj = this.gsd;
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        if (this.xs >= 0) {
            cp.uef().yo(this.xs);
            this.xs = -1;
        }
        com.bytedance.sdk.openadsdk.utils.moa.uef(this, this.gzw);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z2) {
        super.onWindowFocusChanged(z2);
        if (z2) {
            if (!this.cp) {
                this.bs.lw();
            }
            gzw gzwVar = this.gzw;
            if (gzwVar != null && gzwVar.vxo() && !this.gzw.ue()) {
                this.gzw.xs(true);
                gzw gzwVar2 = this.gzw;
                com.bytedance.sdk.openadsdk.moa.yo.uef(gzwVar2, "open_ad", gzwVar2.lu());
            }
        } else if (this.f25158ab.get()) {
            if (this.bs.ivm()) {
                com.bytedance.sdk.openadsdk.moa.yo.uef(String.valueOf(this.bs.moa()), this.gzw, "open_ad", this.sy);
            }
            this.bs = pu.yo();
        }
        com.bytedance.sdk.openadsdk.gsd.oa.lw.uef(this.gzw, z2 ? 4 : 8);
        com.bytedance.sdk.openadsdk.gsd.uef.yo.uef(this.gzw, z2);
    }

    private void ab() {
        this.wk.show(TTAdDislikeToast.getDislikeTip());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bcc() {
        Log.d("TTAppOpenAdActivity", "startCountDownTimer() called");
        int iUe = ue();
        this.cq.uef(this.wrv.oa());
        this.cq.oa(iUe);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bs() {
        this.wk.show(TTAdDislikeToast.getDislikeSendTip());
    }

    private void cq() {
        if (this.dz == null) {
            bs bsVar = new bs(this, this.gzw);
            this.dz = bsVar;
            bsVar.setDislikeSource("video_player");
            this.dz.setCallback(new bs.uef() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTAppOpenAdActivity.4
                @Override // com.bytedance.sdk.openadsdk.common.bs.uef
                public void oa(View view) {
                    TTAppOpenAdActivity.this.yo.set(false);
                    TTAppOpenAdActivity.this.yo();
                    com.bytedance.sdk.openadsdk.gsd.uef.yo.uef(TTAppOpenAdActivity.this.gzw, 4);
                }

                @Override // com.bytedance.sdk.openadsdk.common.bs.uef
                public void uef(View view) {
                    TTAppOpenAdActivity.this.yo.set(true);
                    TTAppOpenAdActivity.this.lw();
                    com.bytedance.sdk.openadsdk.gsd.uef.yo.uef(TTAppOpenAdActivity.this.gzw, 8);
                }

                @Override // com.bytedance.sdk.openadsdk.common.bs.uef
                public void uef(FilterWord filterWord) {
                    if (TTAppOpenAdActivity.this.moa.get() || filterWord == null || filterWord.hasSecondOptions()) {
                        return;
                    }
                    TTAppOpenAdActivity.this.moa.set(true);
                    TTAppOpenAdActivity.this.bs();
                }
            });
        }
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.content);
        frameLayout.addView(this.dz);
        if (this.wk == null) {
            TTAdDislikeToast tTAdDislikeToast = new TTAdDislikeToast(this);
            this.wk = tTAdDislikeToast;
            frameLayout.addView(tTAdDislikeToast);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cz() {
        dhk.uef("TTAppOpenAdActivity", "invoke callback onAdDismiss, ".concat(String.valueOf(this)));
        com.bytedance.sdk.openadsdk.uef.moa.oa oaVar = this.gsd;
        if (oaVar != null) {
            oaVar.yo();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dhk() {
        if (this.f25158ab.get()) {
            return;
        }
        try {
            getWindow().getDecorView().post(this.af);
        } catch (Throwable unused) {
            finish();
        }
    }

    private void dj() {
        int iMin;
        int iMax;
        new StringBuilder("changeScreenOrientation: mOrientation=").append(this.f25160ue);
        int i5 = Build.VERSION.SDK_INT;
        if (i5 != 26) {
            if (i5 == 27) {
                try {
                    wrv();
                } catch (Throwable th) {
                    dhk.yo("TTAppOpenAdActivity", th.getMessage());
                    return;
                }
            } else {
                wrv();
            }
        }
        Pair<Integer, Integer> pairDj = af.dj(getApplicationContext());
        if (this.f25160ue == 2) {
            iMin = Math.max(((Integer) pairDj.first).intValue(), ((Integer) pairDj.second).intValue());
            iMax = Math.min(((Integer) pairDj.first).intValue(), ((Integer) pairDj.second).intValue());
        } else {
            iMin = Math.min(((Integer) pairDj.first).intValue(), ((Integer) pairDj.second).intValue());
            iMax = Math.max(((Integer) pairDj.first).intValue(), ((Integer) pairDj.second).intValue());
        }
        this.oib = iMax;
        this.dhk = iMin;
        float fUef = af.uef();
        if (af.yo((Activity) this)) {
            int i10 = this.f25160ue;
            if (i10 == 1) {
                this.oib -= fUef;
            } else if (i10 == 2) {
                this.dhk -= fUef;
            }
        }
        com.bytedance.sdk.openadsdk.component.yo yoVar = this.ku;
        if (yoVar != null) {
            yoVar.uef(this.dhk, this.oib);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dz() {
        if (!this.tpx || this.gzw.ku() || this.dxx) {
            return;
        }
        this.f25159oa.sendEmptyMessageDelayed(100, 5000L);
    }

    private void gr() {
        if (com.bytedance.sdk.openadsdk.gzw.lw.uef("aoa_force_show_close_enable", false)) {
            com.bytedance.sdk.openadsdk.core.widget.ivm ivmVar = new com.bytedance.sdk.openadsdk.core.widget.ivm(this, 33, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            this.oyt = ivmVar;
            ivmVar.setImageDrawable(orq.yo(this, "tt_ad_close_backup"));
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 8388661;
            layoutParams.topMargin = af.oa(this, 27.0f);
            layoutParams.rightMargin = af.oa(this, 9.0f);
            this.oyt.setVisibility(8);
            this.pz.addView(this.oyt, layoutParams);
            this.oyt.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTAppOpenAdActivity.7
                @Override // android.view.View.OnClickListener
                public void onClick(View view) throws JSONException {
                    TTAppOpenAdActivity.this.rt();
                }
            });
            dz dzVarUef = com.bytedance.sdk.openadsdk.utils.cz.uef(this, new cz.uef() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTAppOpenAdActivity.8
                @Override // com.bytedance.sdk.openadsdk.utils.cz.uef
                public void oa() {
                }

                @Override // com.bytedance.sdk.openadsdk.utils.cz.uef
                public View uef() {
                    return TTAppOpenAdActivity.this.oyt;
                }
            });
            this.pu = dzVarUef;
            dzVarUef.uef(com.bytedance.sdk.openadsdk.gzw.lw.uef("aoa_force_close_delay_time", 5000));
            this.pu.uef(new com.bytedance.sdk.openadsdk.utils.wk() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTAppOpenAdActivity.9
                @Override // com.bytedance.sdk.openadsdk.utils.wk
                public void uef() throws JSONException {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        if (TTAppOpenAdActivity.this.gzw != null) {
                            jSONObject.putOpt("render_sequence", Integer.valueOf(TTAppOpenAdActivity.this.gzw.ix()));
                        }
                        if (TTAppOpenAdActivity.this.ku != null) {
                            jSONObject.putOpt("dynamic_show_type", Integer.valueOf(TTAppOpenAdActivity.this.ku.moa()));
                        }
                    } catch (JSONException e7) {
                        dhk.yo("TTAppOpenAdActivity", e7.getMessage());
                    }
                    com.bytedance.sdk.openadsdk.component.moa.uef.uef(TTAppOpenAdActivity.this.gzw, jSONObject);
                }
            });
            this.pu.uef((long) (Math.min(ue(), this.wrv.oa()) * 1000.0f));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void gsd() {
        com.bytedance.sdk.openadsdk.uef.moa.oa oaVar = this.gsd;
        if (oaVar != null) {
            oaVar.oa();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void gzw() {
        com.bytedance.sdk.openadsdk.component.bcc.yo yoVarXs;
        com.bytedance.sdk.openadsdk.uef.moa.oa oaVar = this.gsd;
        if (oaVar != null) {
            oaVar.onAdClicked();
        }
        if (dj.oa().rt(String.valueOf(this.orq))) {
            this.rt.set(true);
        }
        com.bytedance.sdk.openadsdk.component.yo yoVar = this.ku;
        if (yoVar == null || (yoVarXs = yoVar.xs()) == null) {
            return;
        }
        yoVarXs.ab();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int oib() {
        if (this.gzw.tv()) {
            return 5;
        }
        if (this.cp) {
            return this.ku.moa();
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void orq() {
        com.bytedance.sdk.openadsdk.uef.moa.oa oaVar = this.gsd;
        if (oaVar != null) {
            oaVar.uef();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pz() {
        gzw gzwVar;
        try {
            if (this.cq == null || (gzwVar = this.gzw) == null || gzwVar.bbb() == null) {
                return;
            }
            int iOa = this.gzw.bbb().oa();
            if (iOa == 1 || iOa == 2) {
                this.cq.uef(iOa, this.gzw.bbb().uef(), false);
                com.bytedance.sdk.openadsdk.component.yo yoVar = this.ku;
                if (yoVar == null || yoVar.xs() == null) {
                    return;
                }
                this.ku.xs().oa().uef(this.wrv.uef());
                this.ku.xs().oa().uef(1.0f);
            }
        } catch (Throwable th) {
            dhk.yo("TTAppOpenAdActivity", th.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void rt() throws JSONException {
        com.bytedance.sdk.openadsdk.core.model.moa moaVarOdd;
        com.bytedance.sdk.openadsdk.core.dz.moa moaVarUef;
        com.bytedance.sdk.openadsdk.component.yo yoVar;
        pz.yo(this.orq);
        gsd();
        if (this.tpx && (yoVar = this.ku) != null && yoVar.xs() != null) {
            pz();
            this.ku.xs().uef(4);
        }
        com.bytedance.sdk.openadsdk.component.moa.uef.uef(this.gzw, (int) this.wrv.yo(), this.cq.uef(), this.wrv.oa());
        gzw gzwVar = this.gzw;
        if (gzwVar != null && (moaVarOdd = gzwVar.odd()) != null && (moaVarUef = moaVarOdd.uef()) != null) {
            com.bytedance.sdk.openadsdk.component.yo yoVar2 = this.ku;
            long jCq = (yoVar2 == null || yoVar2.xs() == null) ? 0L : this.ku.xs().cq();
            moaVarUef.ivm(jCq);
            moaVarUef.lw(jCq);
        }
        finish();
    }

    private void sy() throws JSONException {
        if (sy.moa().orq(String.valueOf(this.orq)) == 1) {
            if (this.wrv.yo() >= sy.moa().gzw(String.valueOf(this.orq)) * 1000) {
                rt();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean tpx() {
        if (!this.gzw.dxx()) {
            return false;
        }
        int iIx = this.gzw.ix();
        return ((iIx == 0 || iIx == 9) && (com.bytedance.sdk.component.adexpress.uef.oa.yo.uef(cq.yo(), "3.1.78") || com.bytedance.sdk.component.adexpress.uef.oa.yo.uef(cq.moa(), "3.1.78"))) ? false : true;
    }

    private int ue() {
        gzw gzwVar = this.gzw;
        return (gzwVar == null || gzwVar.oa() < 0) ? sy.moa().gzw(String.valueOf(this.orq)) : this.gzw.oa();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void wk() {
        if (!this.tpx || this.gzw.ku()) {
            return;
        }
        this.f25159oa.removeMessages(100);
    }

    private void wrv() {
        if (this.f25160ue != 2) {
            setRequestedOrientation(1);
        } else if (ivm()) {
            setRequestedOrientation(8);
        } else {
            setRequestedOrientation(0);
        }
        if (this.f25160ue == 2 || !af.yo((Activity) this)) {
            getWindow().addFlags(Segment.SHARE_MINIMUM);
        }
    }

    private void zjm() {
        if (26 != Build.VERSION.SDK_INT) {
            this.f25160ue = this.gzw.cgg();
        } else if (getResources().getConfiguration().orientation == 1) {
            this.f25160ue = 1;
        } else {
            this.f25160ue = 2;
        }
        dj();
    }

    public boolean ivm() {
        try {
            return getIntent().getIntExtra("orientation_angle", 0) == 3;
        } catch (Exception e7) {
            dhk.yo("TTAppOpenAdActivity", e7.getMessage());
            return false;
        }
    }

    public void lw() {
        if (this.tpx) {
            com.bytedance.sdk.openadsdk.component.yo yoVar = this.ku;
            if (yoVar != null && yoVar.xs() != null && this.ku.xs().lw()) {
                this.ku.xs().bcc();
            }
            wk();
        }
        com.bytedance.sdk.openadsdk.component.ivm.oa oaVar = this.cq;
        if (oaVar != null) {
            oaVar.moa();
        }
        dz dzVar = this.pu;
        if (dzVar != null) {
            dzVar.oa();
        }
    }

    public void yo() {
        if (this.yo.get()) {
            return;
        }
        if (this.tpx) {
            com.bytedance.sdk.openadsdk.component.yo yoVar = this.ku;
            if (yoVar != null && yoVar.xs() != null && this.ku.xs().ivm()) {
                this.ku.xs().dj();
            }
            dz();
        }
        com.bytedance.sdk.openadsdk.component.ivm.oa oaVar = this.cq;
        if (oaVar != null) {
            oaVar.yo();
        }
        dz dzVar = this.pu;
        if (dzVar != null) {
            dzVar.uef();
        }
    }

    public void oa() {
        if (isFinishing()) {
            return;
        }
        if (this.moa.get()) {
            ab();
            return;
        }
        if (this.dz == null) {
            try {
                cq();
            } catch (Throwable th) {
                ApmHelper.reportCustomError("initDislike error", "TTAppOpenAdActivity", th);
            }
        }
        bs bsVar = this.dz;
        if (bsVar != null) {
            bsVar.uef();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject uef(JSONObject jSONObject) {
        if (oib() == 0) {
            return this.ku.uef(jSONObject);
        }
        return null;
    }

    public void uef(Intent intent) {
        if (intent != null) {
            this.gr = intent.getIntExtra("ad_source", 0);
            this.lz = intent.getLongExtra("cache_time", 0L);
            this.ivm = intent.getLongExtra("start_show_time", 0L);
        }
    }

    private boolean oa(Bundle bundle) {
        String stringExtra;
        this.gzw = cp.uef().uef(cp.uef(getIntent()));
        if (this.km) {
            if (bundle != null) {
                stringExtra = bundle.getString("single_process_listener_key");
            } else {
                stringExtra = getIntent() != null ? getIntent().getStringExtra("single_process_listener_key") : null;
            }
            this.zjm = stringExtra;
            this.gsd = (com.bytedance.sdk.openadsdk.uef.moa.oa) cp.uef().uef(this.zjm, com.bytedance.sdk.openadsdk.uef.moa.oa.class);
        } else {
            this.gsd = cp.uef().moa();
        }
        cp.uef().lw();
        uef(getIntent());
        uef(bundle);
        gzw gzwVar = this.gzw;
        if (gzwVar == null) {
            finish();
            return false;
        }
        this.fz = gzwVar.cl();
        this.gzw.uef(this.ivm);
        this.orq = this.gzw.jnk();
        com.bytedance.sdk.openadsdk.utils.oa.uef(this.gzw);
        return true;
    }

    public void uef(Bundle bundle) {
        if (bundle != null) {
            if (!this.km && this.gsd == null) {
                this.gsd = dj;
                dj = null;
            }
            try {
                int i5 = bundle.getInt("meta_index", -1);
                this.gr = bundle.getInt("ad_source", 0);
                this.ivm = bundle.getLong("start_show_time", 0L);
                this.lz = bundle.getLong("cache_time", 0L);
                this.gzw = cp.uef().uef(i5);
            } catch (Throwable th) {
                dhk.yo("TTAppOpenAdActivity", th.getMessage());
            }
        }
    }

    @Override // com.bytedance.sdk.component.utils.ue.uef
    public void uef(Message message) {
        com.bytedance.sdk.openadsdk.core.model.moa moaVarOdd;
        com.bytedance.sdk.openadsdk.core.dz.moa moaVarUef;
        com.bytedance.sdk.openadsdk.component.yo yoVar;
        if (message.what == 100) {
            if (this.tpx && (yoVar = this.ku) != null && yoVar.xs() != null) {
                pz();
                this.ku.xs().uef(1);
            }
            gzw gzwVar = this.gzw;
            if (gzwVar != null && (moaVarOdd = gzwVar.odd()) != null && (moaVarUef = moaVarOdd.uef()) != null) {
                moaVarUef.uef(com.bytedance.sdk.openadsdk.core.dz.uef.uef.GENERAL_LINEAR_AD_ERROR);
            }
            gsd();
            finish();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.wk.moa.uef.InterfaceC0105uef
    public void uef(int i5) {
        if (i5 == 2 || i5 == 3 || i5 == 4) {
            pz();
        }
    }
}
