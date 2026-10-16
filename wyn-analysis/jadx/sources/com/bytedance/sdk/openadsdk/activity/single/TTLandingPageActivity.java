package com.bytedance.sdk.openadsdk.activity.single;

import android.R;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.DownloadListener;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import cb.AbstractC1593a;
import com.bykv.vk.openvk.preload.falconx.loader.ILoader;
import com.bykv.vk.openvk.preload.geckox.model.WebResourceResponseModel;
import com.bytedance.sdk.component.cz.ivm;
import com.bytedance.sdk.component.utils.orq;
import com.bytedance.sdk.component.utils.pz;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.common.bs;
import com.bytedance.sdk.openadsdk.common.cq;
import com.bytedance.sdk.openadsdk.common.tpx;
import com.bytedance.sdk.openadsdk.common.wk;
import com.bytedance.sdk.openadsdk.common.wrv;
import com.bytedance.sdk.openadsdk.common.zjm;
import com.bytedance.sdk.openadsdk.core.cp;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.core.oyt;
import com.bytedance.sdk.openadsdk.core.sy;
import com.bytedance.sdk.openadsdk.core.widget.uef.ivm;
import com.bytedance.sdk.openadsdk.moa.yo;
import com.bytedance.sdk.openadsdk.utils.af;
import com.bytedance.sdk.openadsdk.utils.cz;
import com.bytedance.sdk.openadsdk.utils.dhk;
import com.bytedance.sdk.openadsdk.utils.dj;
import com.bytedance.sdk.openadsdk.utils.dz;
import com.bytedance.sdk.openadsdk.utils.gb;
import com.bytedance.sdk.openadsdk.utils.km;
import com.bytedance.sdk.openadsdk.utils.tpx;
import com.qonversion.android.sdk.internal.Constants;
import com.unity3d.services.UnityAdsConstants;
import j$.util.Objects;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class TTLandingPageActivity extends TTBaseLandingPageActivity {

    /* renamed from: ab, reason: collision with root package name */
    private String f25185ab;
    private ImageView af;
    private com.bytedance.sdk.openadsdk.dz.uef.uef au;
    private TextView bcc;
    private oyt bs;
    private int cp;
    private Button cq;
    private gzw dhk;
    private Context dj;
    private dz dxx;
    private com.bytedance.sdk.openadsdk.core.ivm.ivm dz;
    private wrv fz;
    private boolean gem;
    private String gsd;
    private com.bytedance.sdk.component.cz.ivm ivm;
    private com.bytedance.sdk.openadsdk.core.widget.uef.lw km;
    private ivm.uef lz;

    /* renamed from: oa, reason: collision with root package name */
    bs f25186oa;
    private String oib;
    private String orq;
    private com.bytedance.sdk.openadsdk.common.lw oyt;
    private boolean pu;
    private int pz;
    private ImageView rl;
    private ILoader rt;
    private ImageView sk;
    private cq swd;
    private int sy;
    private com.bytedance.sdk.openadsdk.tpx.uef.uef.yo tpx;
    com.bytedance.sdk.openadsdk.moa.cq uef;
    private String wk;
    private wk wrv;
    private ImageView xs;
    TTAdDislikeToast yo;
    private final AtomicBoolean gzw = new AtomicBoolean(true);
    private final AtomicInteger gr = new AtomicInteger(0);

    /* renamed from: ue, reason: collision with root package name */
    private final AtomicInteger f25187ue = new AtomicInteger(0);
    private final AtomicInteger ku = new AtomicInteger(0);
    final AtomicBoolean moa = new AtomicBoolean(false);
    final AtomicBoolean lw = new AtomicBoolean(false);
    private boolean gb = false;
    private long cop = 0;
    private String dor = "DOWNLOAD";

    public static class oa implements View.OnScrollChangeListener {
        private final WeakReference<com.bytedance.sdk.openadsdk.moa.cq> uef;

        public oa(com.bytedance.sdk.openadsdk.moa.cq cqVar) {
            this.uef = new WeakReference<>(cqVar);
        }

        @Override // android.view.View.OnScrollChangeListener
        public void onScrollChange(View view, int i5, int i10, int i11, int i12) {
            com.bytedance.sdk.openadsdk.moa.cq cqVar = this.uef.get();
            if (cqVar != null) {
                cqVar.oa(i10);
            }
        }
    }

    public static class uef implements com.bytedance.sdk.openadsdk.moa.wrv {
        private final WeakReference<TTLandingPageActivity> moa;

        /* renamed from: oa, reason: collision with root package name */
        private final gzw f25193oa;
        private final int uef;
        private final String yo;

        public uef(int i5, gzw gzwVar, String str, TTLandingPageActivity tTLandingPageActivity) {
            this.uef = i5;
            this.f25193oa = gzwVar;
            this.yo = str;
            this.moa = new WeakReference<>(tTLandingPageActivity);
        }

        @Override // com.bytedance.sdk.openadsdk.moa.wrv
        public void uef(int i5) {
            TTLandingPageActivity tTLandingPageActivity = this.moa.get();
            if (tTLandingPageActivity != null) {
                yo.uef.uef(this.uef, tTLandingPageActivity.f25187ue.get(), tTLandingPageActivity.ku.get(), tTLandingPageActivity.gr.get() - tTLandingPageActivity.ku.get(), this.f25193oa, this.yo, i5);
            }
        }
    }

    public static class yo implements View.OnTouchListener {

        /* renamed from: oa, reason: collision with root package name */
        private final WeakReference<com.bytedance.sdk.openadsdk.common.lw> f25194oa;
        private final WeakReference<com.bytedance.sdk.openadsdk.moa.cq> uef;

        public yo(com.bytedance.sdk.openadsdk.moa.cq cqVar, com.bytedance.sdk.openadsdk.common.lw lwVar) {
            this.uef = new WeakReference<>(cqVar);
            this.f25194oa = new WeakReference<>(lwVar);
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            com.bytedance.sdk.openadsdk.moa.cq cqVar = this.uef.get();
            if (cqVar != null) {
                cqVar.uef(motionEvent);
            }
            com.bytedance.sdk.openadsdk.common.lw lwVar = this.f25194oa.get();
            if (lwVar == null) {
                return false;
            }
            lwVar.uef(motionEvent);
            return false;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity
    public void a_() throws JSONException {
        zjm();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity
    public boolean moa() {
        return true;
    }

    @Override // android.app.Activity
    public void onBackPressed() throws JSONException {
        zjm();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        try {
            super.onConfigurationChanged(configuration);
        } catch (Throwable unused) {
        }
        lw();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void onCreate(Bundle bundle) throws JSONException {
        super.onCreate(bundle);
        if (!com.bytedance.sdk.openadsdk.core.wk.lw()) {
            finish();
            return;
        }
        try {
            sy.oa(this);
        } catch (Throwable unused) {
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        gzw gzwVarUef = cp.uef().uef(cp.uef(getIntent()));
        this.dhk = gzwVarUef;
        if (gzwVarUef != null) {
            this.pu = gzwVarUef.dz();
            this.dhk.hg(0);
            if (com.bytedance.sdk.openadsdk.gzw.lw.uef("lp_cache_enable", false)) {
                tpx.uef(this.dhk);
            }
        }
        com.bytedance.sdk.openadsdk.dz.oa.uef(this);
        this.orq = "";
        uef(4);
        gzw gzwVar = this.dhk;
        if (gzwVar != null) {
            this.wk = gzwVar.iou();
            this.f25185ab = this.dhk.em();
            this.gsd = this.dhk.vup();
            this.orq = this.dhk.dj();
            this.sy = this.dhk.cq();
            this.oib = this.dhk.wrv();
        }
        try {
            setContentView(uef(this.orq));
            if (this.dhk == null) {
                finish();
                return;
            }
            if (com.bytedance.sdk.openadsdk.gzw.lw.uef("lp_cache_enable", false)) {
                yo();
            }
            bcc();
            if (!TextUtils.isEmpty(this.gsd)) {
                this.rt = com.bytedance.sdk.openadsdk.xs.oa.uef().oa();
                int iUef = com.bytedance.sdk.openadsdk.xs.oa.uef().uef(this.rt, this.gsd);
                this.pz = iUef;
                this.cp = iUef > 0 ? 2 : 0;
            }
            this.dj = this;
            if (this.ivm != null) {
                com.bytedance.sdk.openadsdk.core.widget.uef.yo.uef(this).uef(false).oa(false).uef(this.ivm.getWebView());
            }
            if (this.gem) {
                this.swd.uef(true);
            }
            com.bytedance.sdk.component.cz.ivm ivmVar = this.ivm;
            if (ivmVar != null && ivmVar.getWebView() != null) {
                com.bytedance.sdk.openadsdk.moa.cq cqVarOa = new com.bytedance.sdk.openadsdk.moa.cq(this.dhk, this.ivm.getWebView(), new uef(this.pz, this.dhk, "landingpage", this), this.cp).oa(true);
                this.uef = cqVarOa;
                this.lz = cqVarOa.uef;
                this.oyt = gb.uef(this.dhk, this.ivm, this.dj, this.oib);
                this.uef.lw(this.gb);
                this.dhk.oib(this.gb);
            }
            cz();
            com.bytedance.sdk.component.cz.ivm ivmVar2 = this.ivm;
            if (ivmVar2 != null) {
                ivmVar2.setLandingPage(true);
                this.ivm.setTag("landingpage");
                this.ivm.setMaterialMeta(this.dhk.cuu());
            }
            com.bytedance.sdk.openadsdk.core.widget.uef.lw lwVar = new com.bytedance.sdk.openadsdk.core.widget.uef.lw(this.dj, this.bs, this.wk, this.oyt, this.uef, true) { // from class: com.bytedance.sdk.openadsdk.activity.single.TTLandingPageActivity.1
                @Override // com.bytedance.sdk.openadsdk.core.widget.uef.lw, android.webkit.WebViewClient
                public void onPageFinished(WebView webView, String str) {
                    super.onPageFinished(webView, str);
                    try {
                        if (TTLandingPageActivity.this.dz != null && !TTLandingPageActivity.this.isFinishing()) {
                            TTLandingPageActivity.this.dz.setVisibility(8);
                        }
                    } catch (Throwable unused2) {
                    }
                    if (TTLandingPageActivity.this.fz != null) {
                        TTLandingPageActivity.this.fz.oa();
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.uef.lw, android.webkit.WebViewClient
                public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                    super.onPageStarted(webView, str, bitmap);
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.uef.lw, android.webkit.WebViewClient
                public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
                    try {
                        if (TextUtils.isEmpty(TTLandingPageActivity.this.gsd)) {
                            return super.shouldInterceptRequest(webView, str);
                        }
                        TTLandingPageActivity.this.gr.incrementAndGet();
                        WebResourceResponseModel webResourceResponseModelUef = com.bytedance.sdk.openadsdk.xs.oa.uef().uef(TTLandingPageActivity.this.rt, TTLandingPageActivity.this.gsd, str);
                        if (webResourceResponseModelUef != null && webResourceResponseModelUef.getWebResourceResponse() != null) {
                            TTLandingPageActivity.this.ku.incrementAndGet();
                            return webResourceResponseModelUef.getWebResourceResponse();
                        }
                        if (webResourceResponseModelUef != null && webResourceResponseModelUef.getMsg() == 2) {
                            TTLandingPageActivity.this.f25187ue.incrementAndGet();
                        }
                        return super.shouldInterceptRequest(webView, str);
                    } catch (Throwable unused2) {
                        return super.shouldInterceptRequest(webView, str);
                    }
                }
            };
            this.km = lwVar;
            lwVar.uef(this.dhk);
            this.km.uef("landingpage");
            com.bytedance.sdk.component.cz.ivm ivmVar3 = this.ivm;
            if (ivmVar3 != null) {
                ivmVar3.setWebViewClient(this.km);
                com.bytedance.sdk.component.cz.ivm ivmVar4 = this.ivm;
                if (ivmVar4 != null) {
                    ivmVar4.setUserAgentString(dhk.uef(ivmVar4.getWebView(), BuildConfig.VERSION_CODE));
                }
                com.bytedance.sdk.component.cz.ivm ivmVar5 = this.ivm;
                if (ivmVar5 != null) {
                    ivmVar5.setMixedContentMode(0);
                }
            }
            com.bytedance.sdk.openadsdk.moa.yo.uef(this.dhk, "landingpage", this.cp);
            if (this.ivm != null) {
                if (com.bytedance.sdk.openadsdk.gzw.lw.uef("lp_cache_enable", false) && this.gb) {
                    com.bytedance.sdk.openadsdk.moa.cq cqVar = this.uef;
                    if (cqVar != null) {
                        cqVar.yo(this.orq);
                        this.uef.moa(this.orq);
                        this.uef.uef(this.orq, 0L);
                    }
                    wrv wrvVar = this.fz;
                    if (wrvVar != null) {
                        wrvVar.oa();
                    }
                } else {
                    com.bytedance.sdk.openadsdk.utils.gzw.uef(this.ivm, this.orq);
                }
                this.ivm.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.uef.moa(this.bs, this.uef, this.oyt) { // from class: com.bytedance.sdk.openadsdk.activity.single.TTLandingPageActivity.12
                    @Override // com.bytedance.sdk.openadsdk.core.widget.uef.moa, android.webkit.WebChromeClient
                    public void onProgressChanged(WebView webView, int i5) {
                        super.onProgressChanged(webView, i5);
                        if (TTLandingPageActivity.this.fz != null) {
                            TTLandingPageActivity.this.fz.uef(i5);
                        }
                        if (TTLandingPageActivity.this.dz != null && !TTLandingPageActivity.this.isFinishing()) {
                            if (i5 == 100 && TTLandingPageActivity.this.dz.isShown()) {
                                TTLandingPageActivity.this.dz.setVisibility(8);
                            } else {
                                TTLandingPageActivity.this.dz.setProgress(i5);
                            }
                        }
                        if (!TTLandingPageActivity.this.gem || TTLandingPageActivity.this.swd == null) {
                            return;
                        }
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        if (jCurrentTimeMillis - TTLandingPageActivity.this.cop >= 200 || i5 == 100) {
                            TTLandingPageActivity.this.swd.uef(webView, TTLandingPageActivity.this.lz);
                            TTLandingPageActivity.this.cop = jCurrentTimeMillis;
                        }
                    }

                    @Override // android.webkit.WebChromeClient
                    public void onReceivedTitle(WebView webView, String str) {
                        super.onReceivedTitle(webView, str);
                        if (!TTLandingPageActivity.this.gem) {
                            if (TTLandingPageActivity.this.bcc != null) {
                                TextView textView = TTLandingPageActivity.this.bcc;
                                if (TextUtils.isEmpty(str)) {
                                    str = orq.uef(TTLandingPageActivity.this, "tt_web_title_default");
                                }
                                textView.setText(str);
                                return;
                            }
                            return;
                        }
                        TTLandingPageActivity.this.swd.uef(str);
                        TTLandingPageActivity.this.swd.oa(webView.getUrl());
                        if (com.bytedance.sdk.openadsdk.gzw.lw.uef("lp_iab_history", true)) {
                            try {
                                if (TextUtils.isEmpty(str)) {
                                    str = TTLandingPageActivity.this.orq;
                                }
                                TTLandingPageActivity.this.au = new com.bytedance.sdk.openadsdk.dz.uef.uef();
                                TTLandingPageActivity.this.au.oa(TTLandingPageActivity.this.dhk.moa().oa());
                                TTLandingPageActivity.this.au.yo(String.valueOf(System.currentTimeMillis()));
                                TTLandingPageActivity.this.au.lw(webView.getUrl());
                                TTLandingPageActivity.this.au.oa(TTLandingPageActivity.this.dhk.bn());
                                TTLandingPageActivity.this.au.uef(com.bytedance.sdk.openadsdk.dz.uef.uef.yo.uef().yo(TTLandingPageActivity.this.dhk.cd()));
                                TTLandingPageActivity.this.au.moa(str);
                                com.bytedance.sdk.openadsdk.dz.uef.uef.yo.uef().uef(TTLandingPageActivity.this.au);
                            } catch (Exception unused2) {
                                TTLandingPageActivity.this.dhk.bn();
                                Objects.toString(TTLandingPageActivity.this.au);
                            }
                        }
                    }
                });
                if (this.ivm.getWebView() != null) {
                    this.ivm.getWebView().setOnScrollChangeListener(new oa(this.uef));
                    this.ivm.getWebView().setOnTouchListener(new yo(this.uef, this.oyt) { // from class: com.bytedance.sdk.openadsdk.activity.single.TTLandingPageActivity.13
                        private long lw;
                        private float moa;
                        private float yo;

                        /* renamed from: oa, reason: collision with root package name */
                        private final int f25189oa = sy.oa();
                        private float ivm = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        private float xs = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;

                        @Override // com.bytedance.sdk.openadsdk.activity.single.TTLandingPageActivity.yo, android.view.View.OnTouchListener
                        public boolean onTouch(View view, MotionEvent motionEvent) {
                            if (!TTLandingPageActivity.this.gem) {
                                return super.onTouch(view, motionEvent);
                            }
                            try {
                                int actionMasked = motionEvent.getActionMasked();
                                if (actionMasked == 0) {
                                    this.yo = motionEvent.getRawX();
                                    this.moa = motionEvent.getRawY();
                                    this.lw = System.currentTimeMillis();
                                } else if (actionMasked == 2) {
                                    float rawX = motionEvent.getRawX();
                                    float rawY = motionEvent.getRawY();
                                    if (Math.abs(rawX - this.yo) < this.f25189oa) {
                                        Math.abs(rawY - this.moa);
                                    }
                                    this.ivm += Math.abs(motionEvent.getX() - this.yo);
                                    this.xs += Math.abs(motionEvent.getY() - this.moa);
                                    System.currentTimeMillis();
                                    if (rawY - this.moa > this.f25189oa) {
                                        TTLandingPageActivity.this.swd.uef();
                                    }
                                    if (rawY - this.moa < (-this.f25189oa)) {
                                        TTLandingPageActivity.this.swd.oa();
                                    }
                                }
                            } catch (Throwable th) {
                                Log.e("TTAD.LandingPageAct", "TouchRecordTool onTouch error", th);
                            }
                            return super.onTouch(view, motionEvent);
                        }
                    });
                }
                this.ivm.setDownloadListener(new DownloadListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTLandingPageActivity.14
                    @Override // android.webkit.DownloadListener
                    public void onDownloadStart(String str, String str2, String str3, String str4, long j8) {
                        if (TTLandingPageActivity.this.tpx != null) {
                            TTLandingPageActivity.this.tpx.uef(TTLandingPageActivity.this.dhk);
                        }
                    }
                });
            }
            lw();
            dz dzVarUef = com.bytedance.sdk.openadsdk.utils.cz.uef(this, new cz.uef() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTLandingPageActivity.15
                @Override // com.bytedance.sdk.openadsdk.utils.cz.uef
                public void oa() {
                }

                @Override // com.bytedance.sdk.openadsdk.utils.cz.uef
                public View uef() {
                    return TTLandingPageActivity.this.xs;
                }
            });
            this.dxx = dzVarUef;
            dzVarUef.uef(0L);
            yo.uef.uef(SystemClock.elapsedRealtime() - jElapsedRealtime, this.dhk, "landingpage", this.rt, this.gsd);
        } catch (Throwable unused2) {
            finish();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseLandingPageActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void onDestroy() {
        com.bytedance.sdk.component.cz.ivm ivmVar;
        com.bytedance.sdk.component.cz.ivm ivmVar2;
        super.onDestroy();
        if (com.bytedance.sdk.openadsdk.gzw.lw.uef("lp_cache_enable", false)) {
            gzw gzwVar = this.dhk;
            if (gzwVar != null) {
                gzwVar.hg(0);
            }
            com.bytedance.sdk.openadsdk.moa.cq cqVar = this.uef;
            if (cqVar != null && (ivmVar2 = this.ivm) != null) {
                cqVar.uef(ivmVar2);
            }
            if (this.ivm == null || TextUtils.isEmpty(this.orq)) {
                com.bytedance.sdk.component.cz.ivm ivmVar3 = this.ivm;
                if (ivmVar3 != null) {
                    pz.uef(ivmVar3);
                }
            } else {
                Bundle bundle = new Bundle();
                if (this.ivm.getWebView() != null) {
                    this.ivm.getWebView().saveState(bundle);
                }
                tpx.uef(System.identityHashCode(this.dhk) + Constants.USER_ID_SEPARATOR + this.orq, this.ivm, bundle);
            }
            this.ivm = null;
        } else {
            com.bytedance.sdk.openadsdk.moa.cq cqVar2 = this.uef;
            if (cqVar2 != null && (ivmVar = this.ivm) != null) {
                cqVar2.uef(ivmVar);
            }
        }
        try {
            if (getWindow() != null) {
                ((ViewGroup) getWindow().getDecorView()).removeAllViews();
            }
        } catch (Throwable unused) {
        }
        if (!com.bytedance.sdk.openadsdk.gzw.lw.uef("lp_cache_enable", false)) {
            com.bytedance.sdk.component.cz.ivm ivmVar4 = this.ivm;
            if (ivmVar4 != null) {
                pz.uef(ivmVar4);
            }
            this.ivm = null;
        }
        oyt oytVar = this.bs;
        if (oytVar != null) {
            oytVar.wrv();
        }
        com.bytedance.sdk.openadsdk.moa.cq cqVar3 = this.uef;
        if (cqVar3 != null) {
            cqVar3.moa(true);
        }
        if (!TextUtils.isEmpty(this.gsd)) {
            yo.uef.uef(this.ku.get(), this.gr.get(), this.dhk);
        }
        com.bytedance.sdk.openadsdk.xs.oa.uef().uef(this.rt);
        dz dzVar = this.dxx;
        if (dzVar != null) {
            dzVar.yo();
        }
        if (com.bytedance.sdk.openadsdk.gzw.lw.uef("lp_iab_history", true) && this.gem) {
            com.bytedance.sdk.openadsdk.dz.uef.uef.yo.uef().oa();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseLandingPageActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void onPause() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        super.onPause();
        dz dzVar = this.dxx;
        if (dzVar != null) {
            dzVar.oa();
        }
        gzw gzwVar = this.dhk;
        if (gzwVar != null) {
            gzwVar.xs(SystemClock.elapsedRealtime());
            this.dhk.hg(0);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseLandingPageActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void onResume() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        super.onResume();
        gzw gzwVar = this.dhk;
        if (gzwVar != null) {
            gzwVar.hg(1);
        }
        oyt oytVar = this.bs;
        if (oytVar != null) {
            oytVar.dj();
        }
        com.bytedance.sdk.openadsdk.moa.cq cqVar = this.uef;
        if (cqVar != null) {
            cqVar.xs();
        }
        dz dzVar = this.dxx;
        if (dzVar != null) {
            dzVar.uef();
        }
        com.bytedance.sdk.component.cz.ivm ivmVar = this.ivm;
        if (ivmVar != null) {
            ivmVar.cq();
            final com.bytedance.sdk.component.cz.ivm ivmVar2 = this.ivm;
            if (ivmVar2 != null) {
                ivmVar2.postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTLandingPageActivity.8
                    @Override // java.lang.Runnable
                    public void run() {
                        ivmVar2.scrollBy(0, 1);
                        ivmVar2.postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTLandingPageActivity.8.1
                            @Override // java.lang.Runnable
                            public void run() {
                                AnonymousClass8 anonymousClass8 = AnonymousClass8.this;
                                if (ivmVar2 == null || TTLandingPageActivity.this.isFinishing()) {
                                    return;
                                }
                                ivmVar2.scrollBy(0, -1);
                            }
                        }, 10L);
                    }
                }, 200L);
            }
        }
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        com.bytedance.sdk.openadsdk.utils.moa.uef(this, this.dhk);
        gzw gzwVar = this.dhk;
        if (gzwVar != null) {
            gzwVar.hg(1);
        }
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        gzw gzwVar = this.dhk;
        if (gzwVar != null) {
            gzwVar.hg(0);
        }
        com.bytedance.sdk.openadsdk.moa.cq cqVar = this.uef;
        if (cqVar != null) {
            cqVar.bcc();
        }
    }

    private void bcc() {
        com.bytedance.sdk.component.cz.ivm ivmVar = (com.bytedance.sdk.component.cz.ivm) findViewById(com.bytedance.sdk.openadsdk.utils.bs.au);
        this.ivm = ivmVar;
        gb.uef(this.dhk, ivmVar);
        this.wrv = (wk) findViewById(com.bytedance.sdk.openadsdk.utils.bs.hts);
        wk wkVar = (wk) findViewById(com.bytedance.sdk.openadsdk.utils.bs.wxf);
        wrv wrvVar = (wrv) findViewById(520093721);
        this.fz = wrvVar;
        if (wrvVar != null) {
            wrvVar.uef(this.dhk);
            this.fz.uef();
        }
        if (wkVar != null) {
            wkVar.setVisibility(0);
        }
        if (this.gem) {
            this.af = (ImageView) findViewById(com.bytedance.sdk.openadsdk.utils.bs.hdd);
        } else {
            this.af = (ImageView) findViewById(520093720);
        }
        ImageView imageView = this.af;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTLandingPageActivity.3
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (TTLandingPageActivity.this.ivm != null) {
                        if (TTLandingPageActivity.this.lz != null) {
                            TTLandingPageActivity.this.lz.uef();
                        }
                        if (!TTLandingPageActivity.this.ivm.cz()) {
                            if (TTLandingPageActivity.this.gem) {
                                return;
                            }
                            TTLandingPageActivity.this.finish();
                            return;
                        }
                        TTLandingPageActivity.this.ivm.zjm();
                        if (!TTLandingPageActivity.this.gem || TTLandingPageActivity.this.swd == null) {
                            return;
                        }
                        WebView webView = TTLandingPageActivity.this.ivm.getWebView();
                        if (TTLandingPageActivity.this.swd == null || webView == null) {
                            return;
                        }
                        TTLandingPageActivity.this.swd.uef(webView, TTLandingPageActivity.this.lz);
                    }
                }
            });
        }
        ImageView imageView2 = (ImageView) findViewById(com.bytedance.sdk.openadsdk.utils.bs.f26138tc);
        this.sk = imageView2;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTLandingPageActivity.4
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (TTLandingPageActivity.this.ivm == null || !TTLandingPageActivity.this.ivm.dj()) {
                        return;
                    }
                    TTLandingPageActivity.this.ivm.wrv();
                    if (!TTLandingPageActivity.this.gem || TTLandingPageActivity.this.swd == null) {
                        return;
                    }
                    WebView webView = TTLandingPageActivity.this.ivm.getWebView();
                    if (TTLandingPageActivity.this.swd == null || webView == null) {
                        return;
                    }
                    TTLandingPageActivity.this.swd.uef(webView, TTLandingPageActivity.this.lz);
                }
            });
        }
        ImageView imageView3 = (ImageView) findViewById(520093716);
        this.xs = imageView3;
        if (imageView3 != null) {
            imageView3.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTLandingPageActivity.5
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    TTLandingPageActivity.this.finish();
                }
            });
        }
        this.bcc = (TextView) findViewById(com.bytedance.sdk.openadsdk.utils.bs.uu);
        com.bytedance.sdk.openadsdk.core.ivm.ivm ivmVar2 = (com.bytedance.sdk.openadsdk.core.ivm.ivm) findViewById(com.bytedance.sdk.openadsdk.utils.bs.ix);
        this.dz = ivmVar2;
        if (ivmVar2 != null) {
            ivmVar2.setVisibility(0);
        }
        this.rl = (ImageView) findViewById(520093740);
        if (this.gem) {
            final com.bytedance.sdk.openadsdk.common.tpx tpxVar = new com.bytedance.sdk.openadsdk.common.tpx(this, false);
            ImageView imageView4 = this.rl;
            if (imageView4 != null) {
                imageView4.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTLandingPageActivity.6
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        tpxVar.setOnMenuItemClickListener(new tpx.uef() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTLandingPageActivity.6.1
                            @Override // com.bytedance.sdk.openadsdk.common.tpx.uef
                            public void ivm() throws JSONException {
                                TTLandingPageActivity.this.yo("onSelectPrivacy");
                                TTLandingPageActivity tTLandingPageActivity = TTLandingPageActivity.this;
                                TTWebsiteActivity.uef(tTLandingPageActivity, tTLandingPageActivity.dhk, TTLandingPageActivity.this.oib);
                                tpxVar.uef();
                            }

                            @Override // com.bytedance.sdk.openadsdk.common.tpx.uef
                            public void lw() throws JSONException {
                                TTLandingPageActivity.this.oa();
                                TTLandingPageActivity.this.yo("onSelectReport");
                                tpxVar.uef();
                            }

                            @Override // com.bytedance.sdk.openadsdk.common.tpx.uef
                            public void moa() throws JSONException {
                                if (TTLandingPageActivity.this.ivm != null) {
                                    Intent intent = new Intent("android.intent.action.VIEW");
                                    String url = TTLandingPageActivity.this.ivm.getUrl();
                                    if (!TextUtils.isEmpty(url)) {
                                        intent.setData(Uri.parse(url));
                                        com.bytedance.sdk.component.utils.oa.uef(TTLandingPageActivity.this, intent, null);
                                    }
                                    TTLandingPageActivity.this.yo("onSelectOpenInBrowser");
                                    tpxVar.uef();
                                }
                            }

                            @Override // com.bytedance.sdk.openadsdk.common.tpx.uef
                            public void oa() throws JSONException {
                                com.bytedance.sdk.component.cz.ivm ivmVar3 = TTLandingPageActivity.this.ivm;
                                if (ivmVar3 == null || ivmVar3.getUrl() == null) {
                                    return;
                                }
                                if (TTLandingPageActivity.this.dz != null) {
                                    TTLandingPageActivity.this.dz.setVisibility(0);
                                    TTLandingPageActivity.this.dz.setProgress(0);
                                }
                                ivmVar3.xs();
                                String url = ivmVar3.getUrl();
                                if (url != null) {
                                    ivmVar3.a_(url);
                                }
                                TTLandingPageActivity.this.yo("onSelectRetry");
                                tpxVar.uef();
                            }

                            @Override // com.bytedance.sdk.openadsdk.common.tpx.uef
                            public void uef() throws JSONException {
                                if (TTLandingPageActivity.this.dhk != null) {
                                    com.bytedance.sdk.openadsdk.dz.uef.uef.yo.uef().uef(TTLandingPageActivity.this.dhk);
                                }
                                com.bytedance.sdk.component.utils.oa.uef(TTLandingPageActivity.this, new Intent(TTLandingPageActivity.this, (Class<?>) TTHistoryActivity.class), null);
                                TTLandingPageActivity.this.yo("onSelectHistory");
                                tpxVar.uef();
                            }

                            @Override // com.bytedance.sdk.openadsdk.common.tpx.uef
                            public void yo() throws JSONException {
                                ClipboardManager clipboardManager;
                                if (TTLandingPageActivity.this.ivm != null) {
                                    String url = TTLandingPageActivity.this.ivm.getUrl();
                                    if (!TextUtils.isEmpty(url) && (clipboardManager = (ClipboardManager) TTLandingPageActivity.this.getSystemService("clipboard")) != null) {
                                        clipboardManager.setPrimaryClip(ClipData.newPlainText("URL", url));
                                    }
                                }
                                TTLandingPageActivity.this.yo("onSelectCopyLink");
                                tpxVar.uef();
                            }
                        });
                        tpxVar.uef(view);
                    }
                });
            }
        }
        View viewFindViewById = findViewById(com.bytedance.sdk.openadsdk.utils.bs.vep);
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTLandingPageActivity.7
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    TTLandingPageActivity.this.oa();
                }
            });
        }
    }

    private void cq() {
        try {
            if (this.f25186oa == null) {
                bs bsVar = new bs(this.dj, this.dhk);
                this.f25186oa = bsVar;
                bsVar.setDislikeSource("landing_page");
                this.f25186oa.setCallback(new bs.uef() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTLandingPageActivity.10
                    @Override // com.bytedance.sdk.openadsdk.common.bs.uef
                    public void oa(View view) {
                        TTLandingPageActivity.this.moa.set(false);
                    }

                    @Override // com.bytedance.sdk.openadsdk.common.bs.uef
                    public void uef(View view) {
                        TTLandingPageActivity.this.moa.set(true);
                    }

                    @Override // com.bytedance.sdk.openadsdk.common.bs.uef
                    public void uef(FilterWord filterWord) {
                        if (TTLandingPageActivity.this.lw.get() || filterWord == null || filterWord.hasSecondOptions()) {
                            return;
                        }
                        TTLandingPageActivity.this.lw.set(true);
                        TTLandingPageActivity.this.wk();
                    }
                });
            }
            FrameLayout frameLayout = (FrameLayout) findViewById(R.id.content);
            frameLayout.addView(this.f25186oa);
            if (this.yo == null) {
                TTAdDislikeToast tTAdDislikeToast = new TTAdDislikeToast(this.dj);
                this.yo = tTAdDislikeToast;
                frameLayout.addView(tTAdDislikeToast);
            }
        } catch (Throwable th) {
            ApmHelper.reportCustomError("initDislike error", "LandingPageActivity", th);
        }
    }

    private void cz() {
        oyt oytVar = new oyt(this);
        this.bs = oytVar;
        oytVar.oa(this.ivm).yo(this.wk).moa(this.f25185ab).uef(this.dhk).oa(this.sy).uef(this.dhk.us()).lw(this.dhk.kid()).uef(this.ivm).oa("landingpage");
    }

    private boolean dj() {
        return !TextUtils.isEmpty(this.orq) && this.orq.contains("__luban_sdk");
    }

    private void dz() {
        TTAdDislikeToast tTAdDislikeToast = this.yo;
        if (tTAdDislikeToast == null) {
            return;
        }
        tTAdDislikeToast.show(TTAdDislikeToast.getDislikeTip());
    }

    private String ivm() {
        gzw gzwVar = this.dhk;
        if (gzwVar != null && !TextUtils.isEmpty(gzwVar.kik())) {
            this.dor = this.dhk.kik();
        }
        return this.dor;
    }

    private void lw() {
        gzw gzwVar = this.dhk;
        if (gzwVar == null || gzwVar.ykf() != 4) {
            return;
        }
        wk wkVar = this.wrv;
        if (wkVar != null) {
            wkVar.setVisibility(0);
        }
        Button button = (Button) findViewById(com.bytedance.sdk.openadsdk.utils.bs.us);
        this.cq = button;
        if (button != null) {
            oa(ivm());
            if (this.tpx == null) {
                this.tpx = com.bytedance.sdk.openadsdk.tpx.uef.uef.moa.uef(this, TextUtils.isEmpty(this.oib) ? gb.oa(this.sy) : this.oib);
            }
            com.bytedance.sdk.openadsdk.core.yo.uef uefVar = new com.bytedance.sdk.openadsdk.core.yo.uef(this, this.dhk, this.oib, this.sy);
            uefVar.uef(false);
            this.cq.setOnClickListener(uefVar);
            this.cq.setOnTouchListener(uefVar);
            uefVar.yo(true);
            uefVar.uef(this.tpx);
        }
    }

    private void oa(String str) {
        if (TextUtils.isEmpty(str) || this.cq == null || isFinishing()) {
            return;
        }
        this.cq.setText(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void wk() {
        TTAdDislikeToast tTAdDislikeToast;
        if (isFinishing() || (tTAdDislikeToast = this.yo) == null) {
            return;
        }
        tTAdDislikeToast.show(TTAdDislikeToast.getDislikeSendTip());
    }

    private void wrv() throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("isBackIntercept", true);
            this.bs.uef("temai_back_event", jSONObject);
        } catch (Exception unused) {
        }
    }

    private void yo() {
        if (TextUtils.isEmpty(this.orq)) {
            return;
        }
        com.bytedance.sdk.openadsdk.sy.yo.uef(new com.bytedance.sdk.openadsdk.sy.moa() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTLandingPageActivity.16
            @Override // com.bytedance.sdk.openadsdk.sy.moa
            public com.bytedance.sdk.openadsdk.sy.oa.uef uef() {
                com.bytedance.sdk.openadsdk.sy.oa.uef uefVarF = AbstractC1593a.f("lp_reuse");
                uefVarF.moa(TTLandingPageActivity.this.oib);
                uefVarF.uef(BuildConfig.VERSION_NAME);
                return uefVarF;
            }
        });
        if (!this.gb) {
            this.gb = false;
            com.bytedance.sdk.openadsdk.ab.moa.uef(false);
            com.bytedance.sdk.openadsdk.sy.yo.yo(new com.bytedance.sdk.openadsdk.sy.moa() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTLandingPageActivity.18
                @Override // com.bytedance.sdk.openadsdk.sy.moa
                public com.bytedance.sdk.openadsdk.sy.oa.uef uef() {
                    com.bytedance.sdk.openadsdk.sy.oa.uef uefVarF = AbstractC1593a.f("lp_reuse");
                    uefVarF.moa(TTLandingPageActivity.this.oib);
                    uefVarF.uef(BuildConfig.VERSION_NAME);
                    return uefVarF;
                }
            });
        } else {
            com.bytedance.sdk.openadsdk.moa.cq cqVar = this.uef;
            if (cqVar != null) {
                cqVar.lw(true);
                this.dhk.oib(true);
            }
            com.bytedance.sdk.openadsdk.sy.yo.oa(new com.bytedance.sdk.openadsdk.sy.moa() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTLandingPageActivity.17
                @Override // com.bytedance.sdk.openadsdk.sy.moa
                public com.bytedance.sdk.openadsdk.sy.oa.uef uef() {
                    com.bytedance.sdk.openadsdk.sy.oa.uef uefVarF = AbstractC1593a.f("lp_reuse");
                    uefVarF.moa(TTLandingPageActivity.this.oib);
                    uefVarF.uef(BuildConfig.VERSION_NAME);
                    return uefVarF;
                }
            });
            com.bytedance.sdk.openadsdk.ab.moa.uef(true);
        }
    }

    private void zjm() throws JSONException {
        if (dj() && !this.gzw.getAndSet(true)) {
            wrv();
            uef(0);
        } else {
            try {
                super.onBackPressed();
            } catch (Throwable th) {
                th.getMessage();
            }
        }
    }

    private View uef(String str) {
        Bundle bundleUef;
        com.bytedance.sdk.component.cz.ivm ivmVar;
        com.bytedance.sdk.openadsdk.core.ivm.yo yoVar = new com.bytedance.sdk.openadsdk.core.ivm.yo(this);
        if (Build.VERSION.SDK_INT >= 35) {
            yoVar.setFitsSystemWindows(true);
        }
        com.bytedance.sdk.openadsdk.core.ivm.lw lwVar = new com.bytedance.sdk.openadsdk.core.ivm.lw(this);
        lwVar.setOrientation(1);
        yoVar.addView(lwVar, new FrameLayout.LayoutParams(-1, -1));
        boolean zKu = sy.moa().ku();
        this.gem = zKu;
        gzw gzwVar = this.dhk;
        if (gzwVar != null && zKu) {
            this.swd = new cq(this, gzwVar, this.oib, false);
        }
        View wkVar = new wk(this, new wk.uef() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTLandingPageActivity.19
            @Override // com.bytedance.sdk.openadsdk.common.wk.uef
            public View uef(Context context) {
                return (TTLandingPageActivity.this.dhk == null || !TTLandingPageActivity.this.gem) ? new zjm(context) : TTLandingPageActivity.this.swd.moa();
            }
        });
        wkVar.setId(com.bytedance.sdk.openadsdk.utils.bs.wxf);
        lwVar.addView(wkVar, new LinearLayout.LayoutParams(-1, this.gem ? -2 : af.oa(this, 44.0f)));
        com.bytedance.sdk.openadsdk.core.ivm.yo yoVar2 = new com.bytedance.sdk.openadsdk.core.ivm.yo(this);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
        layoutParams.weight = 1.0f;
        lwVar.addView(yoVar2, layoutParams);
        if (!com.bytedance.sdk.openadsdk.gzw.lw.uef("lp_cache_enable", false) || TextUtils.isEmpty(str)) {
            bundleUef = null;
            ivmVar = null;
        } else {
            String str2 = System.identityHashCode(this.dhk) + Constants.USER_ID_SEPARATOR + str;
            ivmVar = com.bytedance.sdk.openadsdk.utils.tpx.uef(this, str2);
            bundleUef = com.bytedance.sdk.openadsdk.utils.tpx.uef(str2);
        }
        if (ivmVar == null) {
            ivmVar = new com.bytedance.sdk.component.cz.ivm(this, ivm.yo.LANDING_PAGE);
        } else {
            if (bundleUef != null && ivmVar.getWebView() != null) {
                ivmVar.getWebView().restoreState(bundleUef);
            }
            this.gb = true;
        }
        ivmVar.setId(com.bytedance.sdk.openadsdk.utils.bs.au);
        yoVar2.addView(ivmVar, new FrameLayout.LayoutParams(-1, -1));
        wk wkVar2 = new wk(this, new wk.uef() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTLandingPageActivity.2
            @Override // com.bytedance.sdk.openadsdk.common.wk.uef
            public View uef(Context context) {
                return new com.bytedance.sdk.openadsdk.common.bcc(context);
            }
        });
        wkVar2.setId(com.bytedance.sdk.openadsdk.utils.bs.hts);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams2.gravity = 81;
        yoVar2.addView(wkVar2, layoutParams2);
        com.bytedance.sdk.openadsdk.core.ivm.ivm ivmVar2 = new com.bytedance.sdk.openadsdk.core.ivm.ivm(this, null, R.style.Widget.ProgressBar.Horizontal);
        ivmVar2.setId(com.bytedance.sdk.openadsdk.utils.bs.ix);
        ivmVar2.setProgress(1);
        ivmVar2.setVisibility(8);
        ivmVar2.setProgressDrawable(dj.uef(this, "tt_browser_progress_style"));
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, af.oa(this, 3.0f));
        layoutParams3.gravity = 49;
        yoVar2.addView(ivmVar2, layoutParams3);
        wrv wrvVar = new wrv(this);
        wrvVar.setOnlyLoading(this.pu);
        wrvVar.setId(520093721);
        yoVar.addView(wrvVar, new FrameLayout.LayoutParams(-1, -1));
        return yoVar;
    }

    public void oa() {
        if (isFinishing()) {
            return;
        }
        if (this.lw.get()) {
            dz();
            return;
        }
        if (this.f25186oa == null) {
            cq();
        }
        bs bsVar = this.f25186oa;
        if (bsVar != null) {
            bsVar.uef();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void yo(String str) throws JSONException {
        try {
            final JSONObject jSONObject = new JSONObject();
            jSONObject.put("scene", str);
            com.bytedance.sdk.openadsdk.ab.moa.uef("iab_more_options", false, new com.bytedance.sdk.openadsdk.ab.oa() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTLandingPageActivity.11
                @Override // com.bytedance.sdk.openadsdk.ab.oa
                public com.bytedance.sdk.openadsdk.ab.uef.yo uef() throws Exception {
                    return com.bytedance.sdk.openadsdk.ab.uef.moa.oa().uef("iab_more_options").oa(jSONObject.toString());
                }
            });
        } catch (JSONException e7) {
            com.bytedance.sdk.component.utils.dhk.uef("TTAD.LandingPageAct", "Failed to put iab_click_time into JSON", e7);
        }
    }

    private void uef(final int i5) {
        if (this.xs == null || !dj()) {
            return;
        }
        km.uef(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTLandingPageActivity.9
            @Override // java.lang.Runnable
            public void run() {
                af.uef((View) TTLandingPageActivity.this.xs, i5);
            }
        });
    }
}
