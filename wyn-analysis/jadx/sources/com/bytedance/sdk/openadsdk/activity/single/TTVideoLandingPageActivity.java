package com.bytedance.sdk.openadsdk.activity.single;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.DownloadListener;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.applovin.shadow.okhttp3.internal.http2.Http2Connection;
import com.bykv.vk.openvk.preload.falconx.loader.ILoader;
import com.bykv.vk.openvk.preload.geckox.model.WebResourceResponseModel;
import com.bykv.vk.openvk.uef.uef.uef.moa.yo;
import com.bytedance.sdk.component.lw.ab;
import com.bytedance.sdk.component.lw.dj;
import com.bytedance.sdk.component.utils.dhk;
import com.bytedance.sdk.component.utils.gr;
import com.bytedance.sdk.component.utils.orq;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.common.wk;
import com.bytedance.sdk.openadsdk.core.cp;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.core.oyt;
import com.bytedance.sdk.openadsdk.core.sy;
import com.bytedance.sdk.openadsdk.core.widget.uef.ivm;
import com.bytedance.sdk.openadsdk.moa.cq;
import com.bytedance.sdk.openadsdk.moa.wrv;
import com.bytedance.sdk.openadsdk.moa.yo;
import com.bytedance.sdk.openadsdk.utils.af;
import com.bytedance.sdk.openadsdk.utils.bs;
import com.bytedance.sdk.openadsdk.utils.gb;
import com.bytedance.sdk.openadsdk.utils.km;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class TTVideoLandingPageActivity extends TTBaseLandingPageActivity implements com.bytedance.sdk.openadsdk.dj.moa {

    /* renamed from: ab, reason: collision with root package name */
    protected gzw f25206ab;
    protected cq af;
    protected oyt bcc;
    protected com.bytedance.sdk.openadsdk.tpx.uef.uef.yo cp;
    protected int dj;
    private ILoader dor;
    private int dv;
    protected com.bytedance.sdk.openadsdk.core.wk.oa.ivm dz;
    protected String fz;
    protected com.bytedance.sdk.openadsdk.oib.yo.uef gb;
    protected ivm.uef gem;
    protected TextView gr;
    protected com.bytedance.sdk.openadsdk.core.widget.uef gsd;
    protected TextView gzw;
    protected String ivm;
    protected Context lw;
    protected TextView moa;

    /* renamed from: oa, reason: collision with root package name */
    protected ImageView f25207oa;
    protected RelativeLayout orq;
    protected int pu;
    protected Button pz;
    protected TextView rt;
    protected String swd;

    /* renamed from: ue, reason: collision with root package name */
    protected wk f25208ue;
    protected com.bytedance.sdk.component.cz.ivm uef;
    protected long wk;
    protected FrameLayout wrv;
    protected String xs;
    protected ImageView yo;
    private int zou;
    protected int cq = -1;
    protected int bs = 0;
    protected int sy = 0;
    protected int oib = 0;
    protected int dhk = 0;
    protected String tpx = "ダウンロード";
    protected boolean ku = false;
    protected boolean dxx = false;
    protected boolean lz = true;
    protected boolean oyt = false;
    protected String km = null;
    protected AtomicBoolean sk = new AtomicBoolean(true);
    protected JSONArray rl = null;
    private final AtomicInteger etd = new AtomicInteger(0);
    private final AtomicInteger uqx = new AtomicInteger(0);
    private final AtomicInteger rj = new AtomicInteger(0);
    int cop = -1;
    protected com.bytedance.sdk.openadsdk.core.yo.uef au = null;
    private final yo.oa nkh = new yo.oa() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity.11
        @Override // com.bykv.vk.openvk.uef.uef.uef.moa.yo.oa
        public void uef(boolean z2) {
            TTVideoLandingPageActivity tTVideoLandingPageActivity = TTVideoLandingPageActivity.this;
            tTVideoLandingPageActivity.ku = z2;
            if (tTVideoLandingPageActivity.isFinishing()) {
                return;
            }
            if (!z2) {
                af.uef((View) TTVideoLandingPageActivity.this.uef, 0);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) TTVideoLandingPageActivity.this.wrv.getLayoutParams();
                TTVideoLandingPageActivity tTVideoLandingPageActivity2 = TTVideoLandingPageActivity.this;
                marginLayoutParams.width = tTVideoLandingPageActivity2.oib;
                marginLayoutParams.height = tTVideoLandingPageActivity2.dhk;
                marginLayoutParams.leftMargin = tTVideoLandingPageActivity2.sy;
                marginLayoutParams.topMargin = tTVideoLandingPageActivity2.bs;
                tTVideoLandingPageActivity2.wrv.setLayoutParams(marginLayoutParams);
                return;
            }
            af.uef((View) TTVideoLandingPageActivity.this.uef, 8);
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) TTVideoLandingPageActivity.this.wrv.getLayoutParams();
            TTVideoLandingPageActivity tTVideoLandingPageActivity3 = TTVideoLandingPageActivity.this;
            tTVideoLandingPageActivity3.sy = marginLayoutParams2.leftMargin;
            tTVideoLandingPageActivity3.bs = marginLayoutParams2.topMargin;
            tTVideoLandingPageActivity3.oib = marginLayoutParams2.width;
            tTVideoLandingPageActivity3.dhk = marginLayoutParams2.height;
            marginLayoutParams2.width = -1;
            marginLayoutParams2.height = -1;
            marginLayoutParams2.topMargin = 0;
            marginLayoutParams2.leftMargin = 0;
            tTVideoLandingPageActivity3.wrv.setLayoutParams(marginLayoutParams2);
        }
    };
    private final gr.uef hts = new gr.uef() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity.2
        @Override // com.bytedance.sdk.component.utils.gr.uef
        public void uef(Context context, Intent intent, boolean z2, final int i5) {
            km.uef(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity.2.1
                @Override // java.lang.Runnable
                public void run() {
                    uef(i5);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void uef(int i5) {
            com.bytedance.sdk.component.cz.ivm ivmVar;
            String str;
            TTVideoLandingPageActivity tTVideoLandingPageActivity = TTVideoLandingPageActivity.this;
            if (tTVideoLandingPageActivity.pu == 0 && i5 != 0 && (ivmVar = tTVideoLandingPageActivity.uef) != null && (str = tTVideoLandingPageActivity.km) != null) {
                ivmVar.a_(str);
            }
            com.bytedance.sdk.openadsdk.core.wk.oa.ivm ivmVar2 = TTVideoLandingPageActivity.this.dz;
            if (ivmVar2 != null && ivmVar2.getNativeVideoController() != null) {
                TTVideoLandingPageActivity tTVideoLandingPageActivity2 = TTVideoLandingPageActivity.this;
                if (!tTVideoLandingPageActivity2.dxx && tTVideoLandingPageActivity2.pu != i5) {
                    tTVideoLandingPageActivity2.dz.getNativeVideoController().yo(i5);
                }
            }
            TTVideoLandingPageActivity.this.pu = i5;
        }
    };

    public static class uef extends AsyncTask<Void, Void, Drawable> {

        /* renamed from: oa, reason: collision with root package name */
        private final WeakReference<com.bykv.vk.openvk.uef.uef.uef.moa.oa> f25212oa;
        private final Bitmap uef;

        @Override // android.os.AsyncTask
        /* renamed from: uef, reason: merged with bridge method [inline-methods] */
        public Drawable doInBackground(Void... voidArr) {
            try {
                Bitmap bitmapUef = com.bytedance.sdk.component.adexpress.moa.uef.uef(sy.uef(), this.uef, 25);
                if (bitmapUef == null) {
                    return null;
                }
                return new BitmapDrawable(sy.uef().getResources(), bitmapUef);
            } catch (Throwable th) {
                dhk.yo("TTVideoLandingPage", th.getMessage());
                return null;
            }
        }

        private uef(Bitmap bitmap, com.bykv.vk.openvk.uef.uef.uef.moa.oa oaVar) {
            this.uef = bitmap;
            this.f25212oa = new WeakReference<>(oaVar);
        }

        @Override // android.os.AsyncTask
        /* renamed from: uef, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Drawable drawable) {
            WeakReference<com.bykv.vk.openvk.uef.uef.uef.moa.oa> weakReference;
            if (drawable == null || (weakReference = this.f25212oa) == null || weakReference.get() == null) {
                return;
            }
            this.f25212oa.get().uef(drawable);
        }
    }

    private void ab() {
        oyt oytVar = new oyt(this);
        this.bcc = oytVar;
        oytVar.oa(this.uef).yo(this.ivm).moa(this.xs).oa(this.dj).uef(this.f25206ab).uef(this.f25206ab.us()).uef(this.uef).oa("landingpage_split_screen").lw(this.f25206ab.kid());
    }

    private void bs() throws JSONException {
        com.bytedance.sdk.openadsdk.core.wk.oa.ivm ivmVar;
        if (this.ku && (ivmVar = this.dz) != null && ivmVar.getNativeVideoController() != null) {
            this.dz.getNativeVideoController().lw(null, null);
            this.ku = false;
        } else if (!tpx() || this.sk.getAndSet(true)) {
            super.onBackPressed();
        } else {
            orq();
            uef(0);
        }
    }

    private boolean dhk() {
        com.bytedance.sdk.openadsdk.core.wk.oa.ivm ivmVar = this.dz;
        if (ivmVar == null || ivmVar.getNativeVideoController() == null) {
            return true;
        }
        return this.dz.getNativeVideoController().cq();
    }

    private void oib() {
        if (this.dz == null || dhk()) {
            return;
        }
        this.dz.dz();
    }

    private void orq() throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("isBackIntercept", true);
            this.bcc.uef("temai_back_event", jSONObject);
        } catch (Exception unused) {
        }
    }

    private void sy() {
        com.bytedance.sdk.openadsdk.core.wk.oa.ivm ivmVar = this.dz;
        if (ivmVar == null || ivmVar.getNativeVideoController() == null || dhk()) {
            return;
        }
        this.dz.dz();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean tpx() {
        return !TextUtils.isEmpty(this.km) && this.km.contains("__luban_sdk");
    }

    private void wk() {
        gzw gzwVar = this.f25206ab;
        if (gzwVar == null || gzwVar.ykf() != 4) {
            return;
        }
        this.f25208ue.setVisibility(0);
        Button button = (Button) findViewById(bs.us);
        this.pz = button;
        if (button != null) {
            uef(yo());
            this.pz.setOnClickListener(this.au);
            this.pz.setOnTouchListener(this.au);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity
    public void a_() throws JSONException {
        bs();
    }

    public abstract boolean bcc();

    public void cq() {
        gr.uef(this.hts, this.lw);
    }

    public long cz() {
        com.bytedance.sdk.openadsdk.core.wk.oa.ivm ivmVar = this.dz;
        if (ivmVar == null || ivmVar.getNativeVideoController() == null) {
            return 0L;
        }
        return this.dz.getNativeVideoController().cz();
    }

    public void dj() {
        gzw gzwVar = this.f25206ab;
        if (gzwVar == null || gzwVar.ykf() != 4) {
            return;
        }
        af.uef((View) this.orq, 0);
        String strXw = !TextUtils.isEmpty(this.f25206ab.xw()) ? this.f25206ab.xw() : !TextUtils.isEmpty(this.f25206ab.az()) ? this.f25206ab.az() : !TextUtils.isEmpty(this.f25206ab.jp()) ? this.f25206ab.jp() : "";
        if (this.f25206ab.ifk() != null && this.f25206ab.ifk().uef() != null) {
            af.uef((View) this.gsd, 0);
            af.uef((View) this.gzw, 4);
            com.bytedance.sdk.openadsdk.dhk.oa.oa().uef(this.f25206ab.ifk(), this.gsd, this.f25206ab);
        } else if (!TextUtils.isEmpty(strXw)) {
            af.uef((View) this.gsd, 4);
            af.uef((View) this.gzw, 0);
            this.gzw.setText(strXw.substring(0, 1));
        }
        if (!TextUtils.isEmpty(this.f25206ab.kik())) {
            this.gr.setText(this.f25206ab.kik());
        }
        if (!TextUtils.isEmpty(strXw)) {
            this.rt.setText(strXw);
        }
        af.uef((View) this.rt, 0);
        af.uef((View) this.gr, 0);
    }

    public void dz() {
        try {
            gr.uef(this.hts);
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity
    public boolean moa() {
        return true;
    }

    public abstract View oa();

    @Override // android.app.Activity
    public void onBackPressed() throws JSONException {
        bs();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        wk();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        String strXw;
        super.onCreate(bundle);
        if (!com.bytedance.sdk.openadsdk.core.wk.lw()) {
            finish();
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        try {
            getWindow().addFlags(Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
        } catch (Throwable unused) {
        }
        try {
            sy.oa(this);
        } catch (Throwable unused2) {
        }
        this.pu = com.bytedance.sdk.component.utils.sy.yo(getApplicationContext());
        try {
            setContentView(oa());
            this.lw = this;
            Intent intent = getIntent();
            this.oyt = intent.getBooleanExtra("video_is_auto_play", true);
            if (bundle != null && bundle.getLong("video_play_position") > 0) {
                this.wk = bundle.getLong("video_play_position", 0L);
            }
            String stringExtra = intent.getStringExtra(TTAdConstant.MULTI_PROCESS_DATA);
            gzw gzwVarUef = cp.uef().uef(cp.uef(intent));
            this.f25206ab = gzwVarUef;
            if (gzwVarUef != null) {
                this.cq = gzwVarUef.hw();
                this.ivm = this.f25206ab.iou();
                this.xs = this.f25206ab.em();
                strXw = this.f25206ab.xw();
                this.swd = this.f25206ab.vup();
                this.km = this.f25206ab.dj();
                this.dj = this.f25206ab.cq();
                this.fz = this.f25206ab.wrv();
            } else {
                strXw = null;
            }
            String strUef = strXw;
            if (this.f25206ab == null) {
                finish();
                return;
            }
            if (!TextUtils.isEmpty(this.swd)) {
                this.dor = com.bytedance.sdk.openadsdk.xs.oa.uef().oa();
                int iUef = com.bytedance.sdk.openadsdk.xs.oa.uef().uef(this.dor, this.swd);
                this.dv = iUef;
                this.zou = iUef > 0 ? 2 : 0;
            }
            if (stringExtra != null) {
                try {
                    this.gb = com.bytedance.sdk.openadsdk.oib.yo.uef.uef(new JSONObject(stringExtra));
                } catch (Exception unused3) {
                }
                com.bytedance.sdk.openadsdk.oib.yo.uef uefVar = this.gb;
                if (uefVar != null) {
                    this.wk = uefVar.xs;
                }
            }
            if (bundle != null) {
                this.f25206ab = cp.uef().uef(bundle.getInt("meta_index", -1));
                long j8 = bundle.getLong("video_play_position");
                if (j8 > 0) {
                    this.wk = j8;
                }
            }
            lw();
            wrv();
            ab();
            uef(4);
            if (this.uef != null) {
                com.bytedance.sdk.openadsdk.core.widget.uef.yo.uef(this.lw).uef(true).oa(false).uef(this.uef.getWebView());
                cq cqVarOa = new cq(this.f25206ab, this.uef.getWebView(), new wrv() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity.1
                    @Override // com.bytedance.sdk.openadsdk.moa.wrv
                    public void uef(int i5) {
                        yo.uef.uef(TTVideoLandingPageActivity.this.dv, TTVideoLandingPageActivity.this.rj.get(), TTVideoLandingPageActivity.this.uqx.get(), TTVideoLandingPageActivity.this.etd.get() - TTVideoLandingPageActivity.this.uqx.get(), TTVideoLandingPageActivity.this.f25206ab, "landingpage_split_screen", i5);
                    }
                }, this.zou).oa(true);
                this.af = cqVarOa;
                this.gem = cqVarOa.uef;
                cqVarOa.uef("landingpage_split_screen");
            }
            com.bytedance.sdk.component.cz.ivm ivmVar = this.uef;
            if (ivmVar != null) {
                ivmVar.setLandingPage(true);
                this.uef.setTag("landingpage_split_screen");
                this.uef.setMaterialMeta(this.f25206ab.cuu());
                this.uef.setWebViewClient(new com.bytedance.sdk.openadsdk.core.widget.uef.lw(this.lw, this.bcc, this.ivm, this.af, true) { // from class: com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity.4
                    @Override // com.bytedance.sdk.openadsdk.core.widget.uef.lw, android.webkit.WebViewClient
                    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
                        try {
                            if (TextUtils.isEmpty(TTVideoLandingPageActivity.this.swd)) {
                                return super.shouldInterceptRequest(webView, str);
                            }
                            TTVideoLandingPageActivity.this.etd.incrementAndGet();
                            WebResourceResponseModel webResourceResponseModelUef = com.bytedance.sdk.openadsdk.xs.oa.uef().uef(TTVideoLandingPageActivity.this.dor, TTVideoLandingPageActivity.this.swd, str);
                            if (webResourceResponseModelUef != null && webResourceResponseModelUef.getWebResourceResponse() != null) {
                                TTVideoLandingPageActivity.this.uqx.incrementAndGet();
                                return webResourceResponseModelUef.getWebResourceResponse();
                            }
                            if (webResourceResponseModelUef != null && webResourceResponseModelUef.getMsg() == 2) {
                                TTVideoLandingPageActivity.this.rj.incrementAndGet();
                            }
                            return super.shouldInterceptRequest(webView, str);
                        } catch (Throwable th) {
                            dhk.uef("TTVideoLandingPage", "shouldInterceptRequest url error", th);
                            return super.shouldInterceptRequest(webView, str);
                        }
                    }
                });
                com.bytedance.sdk.component.cz.ivm ivmVar2 = this.uef;
                ivmVar2.setUserAgentString(com.bytedance.sdk.openadsdk.utils.dhk.uef(ivmVar2.getWebView(), BuildConfig.VERSION_CODE));
            }
            com.bytedance.sdk.component.cz.ivm ivmVar3 = this.uef;
            if (ivmVar3 != null) {
                ivmVar3.setMixedContentMode(0);
            }
            com.bytedance.sdk.openadsdk.moa.yo.uef(this.f25206ab, "landingpage_split_screen", this.zou);
            com.bytedance.sdk.openadsdk.utils.gzw.uef(this.uef, this.km);
            this.uef.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.uef.moa(this.bcc, this.af) { // from class: com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity.5
                @Override // com.bytedance.sdk.openadsdk.core.widget.uef.moa, android.webkit.WebChromeClient
                public void onProgressChanged(WebView webView, int i5) {
                    super.onProgressChanged(webView, i5);
                }
            });
            this.uef.setDownloadListener(new DownloadListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity.6
                @Override // android.webkit.DownloadListener
                public void onDownloadStart(String str, String str2, String str3, String str4, long j10) {
                    TTVideoLandingPageActivity tTVideoLandingPageActivity = TTVideoLandingPageActivity.this;
                    com.bytedance.sdk.openadsdk.tpx.uef.uef.yo yoVar = tTVideoLandingPageActivity.cp;
                    if (yoVar != null) {
                        yoVar.uef(tTVideoLandingPageActivity.f25206ab);
                    }
                }
            });
            TextView textView = this.moa;
            if (textView != null) {
                if (TextUtils.isEmpty(strUef)) {
                    strUef = orq.uef(this, "tt_web_title_default");
                }
                textView.setText(strUef);
            }
            cq();
            ivm();
            wk();
            yo.uef.uef(SystemClock.elapsedRealtime() - jElapsedRealtime, this.f25206ab, "landingpage_split_screen", this.dor, this.swd);
        } catch (Throwable unused4) {
            finish();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseLandingPageActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        dz();
        try {
            if (getWindow() != null) {
                ((ViewGroup) getWindow().getDecorView()).removeAllViews();
            }
            this.f25206ab.dz(false);
        } catch (Throwable unused) {
        }
        com.bytedance.sdk.component.cz.ivm ivmVar = this.uef;
        if (ivmVar != null) {
            com.bytedance.sdk.openadsdk.core.af.uef(ivmVar.getWebView());
        }
        this.uef = null;
        oyt oytVar = this.bcc;
        if (oytVar != null) {
            oytVar.wrv();
        }
        com.bytedance.sdk.openadsdk.core.wk.oa.ivm ivmVar2 = this.dz;
        if (ivmVar2 != null && ivmVar2.getNativeVideoController() != null) {
            this.dz.getNativeVideoController().lw();
        }
        this.dz = null;
        this.f25206ab = null;
        cq cqVar = this.af;
        if (cqVar != null) {
            cqVar.moa(true);
        }
        if (!TextUtils.isEmpty(this.swd)) {
            yo.uef.uef(this.uqx.get(), this.etd.get(), this.f25206ab);
        }
        com.bytedance.sdk.openadsdk.xs.oa.uef().uef(this.dor);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseLandingPageActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void onPause() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        super.onPause();
        oib();
        com.bytedance.sdk.openadsdk.core.wk.oa.ivm ivmVar = this.dz;
        if (ivmVar == null || ivmVar.getNativeVideoController() == null) {
            return;
        }
        uef(this.dz.getNativeVideoController());
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseLandingPageActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void onResume() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        super.onResume();
        if (!this.lz) {
            sy();
        }
        this.lz = false;
        oyt oytVar = this.bcc;
        if (oytVar != null) {
            oytVar.dj();
        }
        cq cqVar = this.af;
        if (cqVar != null) {
            cqVar.xs();
        }
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        int iUef = this.f25206ab != null ? cp.uef().uef(this.f25206ab) : -1;
        this.cop = iUef;
        bundle.putInt("meta_index", iUef);
        bundle.putLong("video_play_position", this.wk);
        bundle.putBoolean("is_complete", this.dxx);
        long jIvm = this.wk;
        com.bytedance.sdk.openadsdk.core.wk.oa.ivm ivmVar = this.dz;
        if (ivmVar != null && ivmVar.getNativeVideoController() != null) {
            jIvm = this.dz.getNativeVideoController().ivm();
        }
        bundle.putLong("video_play_position", jIvm);
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        if (this.cop >= 0) {
            cp.uef().yo(this.cop);
            this.cop = -1;
        }
        com.bytedance.sdk.openadsdk.utils.moa.uef(this, this.f25206ab);
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        cq cqVar = this.af;
        if (cqVar != null) {
            cqVar.bcc();
        }
    }

    public void wrv() {
        if (this.f25206ab == null) {
            return;
        }
        this.cp = com.bytedance.sdk.openadsdk.tpx.uef.uef.moa.uef(this, this.fz);
        com.bytedance.sdk.openadsdk.core.yo.uef uefVar = new com.bytedance.sdk.openadsdk.core.yo.uef(this, this.f25206ab, this.fz, this.dj);
        this.au = uefVar;
        uefVar.uef(false);
        this.au.yo(true);
        this.gr.setOnClickListener(this.au);
        this.gr.setOnTouchListener(this.au);
        this.au.uef(this.cp);
    }

    public int zjm() {
        com.bytedance.sdk.openadsdk.core.wk.oa.ivm ivmVar = this.dz;
        if (ivmVar == null || ivmVar.getNativeVideoController() == null) {
            return 0;
        }
        return this.dz.getNativeVideoController().zjm();
    }

    private void uef(final String str) {
        Button button;
        if (TextUtils.isEmpty(str) || (button = this.pz) == null) {
            return;
        }
        button.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity.7
            @Override // java.lang.Runnable
            public void run() {
                TTVideoLandingPageActivity tTVideoLandingPageActivity = TTVideoLandingPageActivity.this;
                if (tTVideoLandingPageActivity.pz == null || tTVideoLandingPageActivity.isFinishing()) {
                    return;
                }
                TTVideoLandingPageActivity.this.pz.setText(str);
            }
        });
    }

    public void ivm() {
        if (bcc()) {
            try {
                com.bytedance.sdk.openadsdk.core.wk.oa.ivm ivmVar = new com.bytedance.sdk.openadsdk.core.wk.oa.ivm(this.lw, this.f25206ab, true, null);
                this.dz = ivmVar;
                if (ivmVar.getNativeVideoController() != null) {
                    this.dz.getNativeVideoController().uef(false);
                }
                if (this.dxx) {
                    this.wrv.setVisibility(0);
                    this.wrv.removeAllViews();
                    this.wrv.addView(this.dz);
                    this.dz.oa(true);
                } else {
                    if (!this.oyt) {
                        this.wk = 0L;
                    }
                    if (this.gb != null && this.dz.getNativeVideoController() != null) {
                        this.dz.getNativeVideoController().yo(this.gb.xs);
                        this.dz.getNativeVideoController().moa(this.gb.lw);
                        this.dz.uef(sy.moa().yo(String.valueOf(this.f25206ab.jnk())), "landingPageInit");
                    }
                    if (this.dz.uef(this.wk, this.lz, this.dxx)) {
                        this.wrv.setVisibility(0);
                        this.wrv.removeAllViews();
                        this.wrv.addView(this.dz);
                    }
                    if (this.dz.getNativeVideoController() != null) {
                        this.dz.getNativeVideoController().uef(false);
                        this.dz.getNativeVideoController().uef(this.nkh);
                    }
                }
                String strUef = this.f25206ab.lpy().get(0).uef();
                com.bytedance.sdk.openadsdk.zjm.moa.uef().uef(strUef).uef(this.f25206ab.lpy().get(0).oa()).oa(this.f25206ab.lpy().get(0).yo()).lw(af.lw(sy.uef())).moa(af.yo(sy.uef())).yo(2).uef(new com.bytedance.sdk.openadsdk.zjm.oa(this.f25206ab, strUef, new ab() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity.10
                    @Override // com.bytedance.sdk.component.lw.ab
                    public void uef(int i5, String str, Throwable th) {
                    }

                    @Override // com.bytedance.sdk.component.lw.ab
                    public void uef(dj djVar) {
                        try {
                            Object objOa = djVar.oa();
                            if (objOa instanceof Bitmap) {
                                new uef((Bitmap) objOa, TTVideoLandingPageActivity.this.dz.getNativeVideoController().wrv()).execute(new Void[0]);
                            }
                        } catch (Exception unused) {
                        }
                    }
                }), 4);
                this.dz.findViewById(520093726).setOnTouchListener(null);
                this.dz.findViewById(520093726).setOnClickListener(null);
            } catch (Exception e7) {
                dhk.yo("TTVideoLandingPage", e7.getMessage());
                if (this.dz == null) {
                    ApmHelper.reportCustomError("mNativeVideoTsView is null", "FUNCTION EXCEPTION", e7);
                }
            }
            if (this.pu == 0) {
                try {
                    Toast.makeText(this, orq.uef(this, "tt_no_network"), 0).show();
                } catch (Throwable unused) {
                }
            }
        }
    }

    public void lw() {
        this.f25208ue = (wk) findViewById(bs.hts);
        this.uef = (com.bytedance.sdk.component.cz.ivm) findViewById(bs.au);
        ImageView imageView = (ImageView) findViewById(520093720);
        this.f25207oa = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity.8
                @Override // android.view.View.OnClickListener
                public void onClick(View view) throws JSONException {
                    JSONObject jSONObjectUef;
                    TTVideoLandingPageActivity tTVideoLandingPageActivity = TTVideoLandingPageActivity.this;
                    if (tTVideoLandingPageActivity.uef != null) {
                        ivm.uef uefVar = tTVideoLandingPageActivity.gem;
                        if (uefVar != null) {
                            uefVar.uef();
                        }
                        if (TTVideoLandingPageActivity.this.uef.cz()) {
                            TTVideoLandingPageActivity.this.uef.zjm();
                            return;
                        }
                        if (TTVideoLandingPageActivity.this.tpx()) {
                            TTVideoLandingPageActivity.this.onBackPressed();
                            return;
                        }
                        com.bytedance.sdk.openadsdk.core.wk.oa.ivm ivmVar = TTVideoLandingPageActivity.this.dz;
                        if (ivmVar == null || ivmVar.getNativeVideoController() == null) {
                            jSONObjectUef = null;
                        } else {
                            TTVideoLandingPageActivity tTVideoLandingPageActivity2 = TTVideoLandingPageActivity.this;
                            jSONObjectUef = gb.uef(tTVideoLandingPageActivity2.f25206ab, tTVideoLandingPageActivity2.dz.getNativeVideoController().xs(), TTVideoLandingPageActivity.this.dz.getNativeVideoController().dj());
                        }
                        JSONObject jSONObject = jSONObjectUef;
                        TTVideoLandingPageActivity tTVideoLandingPageActivity3 = TTVideoLandingPageActivity.this;
                        com.bytedance.sdk.openadsdk.moa.yo.uef(tTVideoLandingPageActivity3.f25206ab, "embeded_ad", "detail_back", tTVideoLandingPageActivity3.cz(), TTVideoLandingPageActivity.this.zjm(), jSONObject, (com.bytedance.sdk.openadsdk.moa.xs) null);
                        TTVideoLandingPageActivity.this.finish();
                    }
                }
            });
        }
        com.bytedance.sdk.openadsdk.core.wk.oa.ivm ivmVar = this.dz;
        if (ivmVar != null) {
            ivmVar.setIsAutoPlay(this.oyt);
        }
        ImageView imageView2 = (ImageView) findViewById(bs.af);
        this.yo = imageView2;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity.9
                @Override // android.view.View.OnClickListener
                public void onClick(View view) throws JSONException {
                    JSONObject jSONObjectUef;
                    com.bytedance.sdk.openadsdk.core.wk.oa.ivm ivmVar2 = TTVideoLandingPageActivity.this.dz;
                    if (ivmVar2 != null) {
                        if (ivmVar2.getNativeVideoController() != null) {
                            TTVideoLandingPageActivity tTVideoLandingPageActivity = TTVideoLandingPageActivity.this;
                            jSONObjectUef = gb.uef(tTVideoLandingPageActivity.f25206ab, tTVideoLandingPageActivity.dz.getNativeVideoController().xs(), TTVideoLandingPageActivity.this.dz.getNativeVideoController().dj());
                        } else {
                            jSONObjectUef = null;
                        }
                        JSONObject jSONObject = jSONObjectUef;
                        TTVideoLandingPageActivity tTVideoLandingPageActivity2 = TTVideoLandingPageActivity.this;
                        com.bytedance.sdk.openadsdk.moa.yo.uef(tTVideoLandingPageActivity2.f25206ab, "embeded_ad", "detail_skip", tTVideoLandingPageActivity2.cz(), TTVideoLandingPageActivity.this.zjm(), jSONObject, (com.bytedance.sdk.openadsdk.moa.xs) null);
                    }
                    TTVideoLandingPageActivity.this.finish();
                }
            });
        }
        this.moa = (TextView) findViewById(bs.uu);
        this.wrv = (FrameLayout) findViewById(bs.gb);
        this.orq = (RelativeLayout) findViewById(bs.sk);
        this.gzw = (TextView) findViewById(bs.swd);
        this.rt = (TextView) findViewById(bs.gem);
        this.gr = (TextView) findViewById(bs.cop);
        this.gsd = (com.bytedance.sdk.openadsdk.core.widget.uef) findViewById(bs.rl);
        dj();
    }

    public String yo() {
        gzw gzwVar = this.f25206ab;
        if (gzwVar != null && !TextUtils.isEmpty(gzwVar.kik())) {
            this.tpx = this.f25206ab.kik();
        }
        return this.tpx;
    }

    private void uef(com.bykv.vk.openvk.uef.uef.uef.moa.yo yoVar) {
        this.dxx = this.dxx || yoVar.cq();
        Boolean bool = Boolean.TRUE;
        com.bytedance.sdk.openadsdk.oib.moa.uef.uef("sp_multi_native_video_data", "key_video_is_update_flag", bool);
        com.bytedance.sdk.openadsdk.oib.moa.uef.uef("sp_multi_native_video_data", "key_video_isfromvideodetailpage", bool);
        com.bytedance.sdk.openadsdk.oib.moa.uef.uef("sp_multi_native_video_data", "key_native_video_complete", Boolean.valueOf(this.dxx));
        com.bytedance.sdk.openadsdk.oib.moa.uef.uef("sp_multi_native_video_data", "key_video_current_play_position", Long.valueOf(yoVar.ivm()));
        com.bytedance.sdk.openadsdk.oib.moa.uef.uef("sp_multi_native_video_data", "key_video_total_play_duration", Long.valueOf(yoVar.xs() + yoVar.cz()));
        com.bytedance.sdk.openadsdk.oib.moa.uef.uef("sp_multi_native_video_data", "key_video_duration", Long.valueOf(yoVar.cz()));
    }

    private void uef(final int i5) {
        if (this.yo == null || !tpx()) {
            return;
        }
        km.uef(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTVideoLandingPageActivity.3
            @Override // java.lang.Runnable
            public void run() {
                af.uef((View) TTVideoLandingPageActivity.this.yo, i5);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.dj.moa
    public void uef(boolean z2, JSONArray jSONArray) {
        if (!z2 || jSONArray == null || jSONArray.length() <= 0) {
            return;
        }
        this.rl = jSONArray;
    }
}
