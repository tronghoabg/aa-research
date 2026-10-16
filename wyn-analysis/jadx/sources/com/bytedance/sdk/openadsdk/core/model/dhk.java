package com.bytedance.sdk.openadsdk.core.model;

import A0.j;
import N0.a;
import android.R;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.http.SslError;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.DownloadListener;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bykv.vk.openvk.preload.falconx.loader.ILoader;
import com.bykv.vk.openvk.preload.geckox.model.WebResourceResponseModel;
import com.bykv.vk.openvk.uef.uef.uef.moa.yo;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.activity.single.TTCeilingLandingPageActivity;
import com.bytedance.sdk.openadsdk.core.oyt;
import com.bytedance.sdk.openadsdk.moa.yo;
import com.bytedance.sdk.openadsdk.utils.af;
import com.bytedance.sdk.openadsdk.utils.gb;
import com.bytedance.sdk.openadsdk.utils.km;
import com.unity3d.services.UnityAdsConstants;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public class dhk implements Handler.Callback {

    /* renamed from: ab, reason: collision with root package name */
    private View f25666ab;
    private boolean af;
    FrameLayout bcc;
    private View bs;
    private ILoader cop;
    private long cp;
    com.bytedance.sdk.openadsdk.core.yo.uef cq;
    ObjectAnimator cz;
    private com.bytedance.sdk.openadsdk.core.widget.bs dhk;
    ObjectAnimator dj;
    private com.bytedance.sdk.openadsdk.common.lw dv;
    private String dxx;
    com.bytedance.sdk.openadsdk.core.yo.oa dz;
    private final Activity fz;
    private com.bytedance.sdk.openadsdk.moa.cq gb;
    private String gem;
    private ValueAnimator ggp;
    private View gr;
    private FrameLayout gsd;
    private com.bytedance.sdk.component.cz.ivm gzw;

    /* renamed from: hg, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.core.widget.bs f25667hg;
    private LinearLayout.LayoutParams hnk;
    private FrameLayout hts;
    RelativeLayout ivm;
    private oa jkf;
    private int km;
    View lw;
    private final com.bytedance.sdk.openadsdk.core.wk.moa.oa lz;
    FrameLayout moa;
    private com.bytedance.sdk.openadsdk.core.zjm.tpx nkh;

    /* renamed from: oa, reason: collision with root package name */
    FrameLayout f25668oa;
    private TextView oib;
    private oyt orq;
    private com.bytedance.sdk.openadsdk.core.ivm.bcc ou;
    private final View oyt;
    private com.bytedance.sdk.openadsdk.tpx.uef.uef.yo pu;
    private View pz;
    private int rj;
    private boolean rl;
    private com.bytedance.sdk.openadsdk.common.wrv rt;
    private com.bytedance.sdk.openadsdk.core.widget.uef.lw swd;
    private TextView sy;
    private TextView tpx;

    /* renamed from: ue, reason: collision with root package name */
    private ImageView f25669ue;
    ImageView uef;
    private int uqx;
    private final boolean vj;
    private Handler wk;
    yo.uef wrv;
    private AtomicBoolean wxf;
    final gzw xs;
    TextView yo;
    ValueAnimator zjm;
    private com.bytedance.sdk.openadsdk.core.ivm.moa zou;
    private final AtomicBoolean ku = new AtomicBoolean(false);
    private final AtomicBoolean sk = new AtomicBoolean(false);
    private volatile int au = 0;
    private volatile int dor = 0;
    private volatile int etd = 0;
    private float vyg = -1.0f;
    private final AtomicBoolean vjj = new AtomicBoolean(false);
    private long ot = -1;
    private final AtomicBoolean sw = new AtomicBoolean(false);
    private long xvp = 0;

    public static class oa implements com.bytedance.sdk.openadsdk.moa.wrv {
        private final WeakReference<dhk> moa;

        /* renamed from: oa, reason: collision with root package name */
        private final gzw f25672oa;
        private final int uef;
        private final String yo;

        public oa(int i5, gzw gzwVar, String str, dhk dhkVar) {
            this.uef = i5;
            this.f25672oa = gzwVar;
            this.yo = str;
            this.moa = new WeakReference<>(dhkVar);
        }

        @Override // com.bytedance.sdk.openadsdk.moa.wrv
        public void uef(int i5) {
            dhk dhkVar = this.moa.get();
            if (dhkVar != null) {
                yo.uef.uef(this.uef, dhkVar.etd, dhkVar.dor, dhkVar.au - dhkVar.dor, this.f25672oa, this.yo, i5);
            }
        }
    }

    public static class uef implements com.bytedance.sdk.component.lw.bcc {
        @Override // com.bytedance.sdk.component.lw.bcc
        public Bitmap uef(Bitmap bitmap) {
            return com.bytedance.sdk.component.adexpress.moa.uef.uef(com.bytedance.sdk.openadsdk.core.sy.uef(), bitmap, 25);
        }
    }

    public dhk(Activity activity, final gzw gzwVar, String str, FrameLayout frameLayout, com.bytedance.sdk.openadsdk.core.wk.moa.oa oaVar, View view) {
        this.fz = activity;
        this.xs = gzwVar;
        this.dxx = str;
        this.lz = oaVar;
        this.oyt = view;
        this.km = gb.uef(str);
        if (gzwVar != null) {
            this.gem = gzwVar.vup();
        }
        this.vj = gzwVar.gem() && lw(gzwVar);
        if (!TextUtils.isEmpty(this.gem)) {
            this.cop = com.bytedance.sdk.openadsdk.xs.oa.uef().oa();
            int iUef = com.bytedance.sdk.openadsdk.xs.oa.uef().uef(this.cop, this.gem);
            this.uqx = iUef;
            this.rj = iUef > 0 ? 2 : 0;
        }
        boolean zMoa = moa(gzwVar);
        boolean zXs = xs(gzwVar);
        boolean zOa = oa(gzwVar);
        if (zOa) {
            this.dxx = "landingpage_split_screen";
        } else if (zMoa) {
            this.dxx = "landingpage_direct";
        } else if (zXs) {
            this.dxx = "aggregate_page";
        } else if (yo(gzwVar)) {
            this.dxx = "landingpage_split_ceiling";
        }
        this.cq = new com.bytedance.sdk.openadsdk.core.yo.uef(com.bytedance.sdk.openadsdk.core.sy.uef(), gzwVar, this.dxx, gb.uef(str));
        HashMap map = new HashMap();
        map.put("click_scence", 1);
        this.cq.uef(map);
        View viewFindViewById = activity.findViewById(R.id.content);
        this.cq.oa(viewFindViewById);
        com.bytedance.sdk.openadsdk.core.yo.oa oaVar2 = new com.bytedance.sdk.openadsdk.core.yo.oa(activity, gzwVar, this.dxx, gb.uef(str), true) { // from class: com.bytedance.sdk.openadsdk.core.model.dhk.1
            @Override // com.bytedance.sdk.openadsdk.core.yo.oa
            public boolean uef(wrv wrvVar, Map<String, Object> map2) {
                if (dhk.zjm(gzwVar) && dhk.this.swd != null) {
                    dhk.this.swd.uef(wrvVar);
                    dhk.this.swd.uef(map2);
                    if (dhk.cz(dhk.this.xs) || dhk.this.rl) {
                        return true;
                    }
                }
                return super.uef(wrvVar, map2);
            }
        };
        this.dz = oaVar2;
        oaVar2.uef(map);
        this.dz.oa(viewFindViewById);
        this.bcc = frameLayout;
        if (zOa || zMoa || zXs) {
            try {
                this.wk = new Handler(Looper.getMainLooper(), this);
            } catch (Exception e7) {
                Log.e("LandingPageModel", "LandingPageModel: ", e7);
                return;
            }
        }
        if (gzwVar.gem()) {
            return;
        }
        if (zMoa || zXs) {
            Handler handler = this.wk;
            handler.sendMessage(handler.obtainMessage(100, 0, 0));
        }
    }

    public static /* synthetic */ int dz(dhk dhkVar) {
        int i5 = dhkVar.dor;
        dhkVar.dor = i5 + 1;
        return i5;
    }

    public static /* synthetic */ int wk(dhk dhkVar) {
        int i5 = dhkVar.etd;
        dhkVar.etd = i5 + 1;
        return i5;
    }

    public static /* synthetic */ int wrv(dhk dhkVar) {
        int i5 = dhkVar.au;
        dhkVar.au = i5 + 1;
        return i5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean yo(int i5) {
        return i5 == 1 || i5 == 2 || i5 == 4 || i5 == 5;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        gzw gzwVar;
        gzw gzwVar2;
        int i5 = message.what;
        if (i5 == 100) {
            int i10 = message.arg1;
            long jMoa = (!moa(this.xs) || (gzwVar2 = this.xs) == null || gzwVar2.gsd() == null) ? (!xs(this.xs) || (gzwVar = this.xs) == null || gzwVar.gsd() == null) ? 20L : this.xs.gsd().moa() : this.xs.gsd().oa();
            yo.uef uefVar = this.wrv;
            if (uefVar != null) {
                uefVar.uef(i10 * 1000, jMoa * 1000);
            }
            long j8 = i10;
            if (j8 >= jMoa) {
                yo.uef uefVar2 = this.wrv;
                if (uefVar2 != null) {
                    uefVar2.uef(jMoa * 1000, 100);
                }
            } else if (j8 < jMoa && this.wk != null) {
                Message messageObtain = Message.obtain();
                messageObtain.what = 100;
                messageObtain.arg1 = i10 + 1;
                this.wk.sendMessageDelayed(messageObtain, 1000L);
            }
        } else if (i5 == 101) {
            zjm();
        }
        return true;
    }

    private void ab() {
        if ((moa(this.xs) || xs(this.xs)) && (this.fz instanceof com.bytedance.sdk.openadsdk.core.wk.moa.oa)) {
            this.lz.hg();
            this.lz.bs();
        }
    }

    public static boolean bcc(gzw gzwVar) {
        return moa(gzwVar) && !dj(gzwVar);
    }

    private void bs() {
        com.bytedance.sdk.openadsdk.common.dj loadingStyle;
        com.bytedance.sdk.openadsdk.common.wrv wrvVar = this.rt;
        if (wrvVar != null && (loadingStyle = wrvVar.getLoadingStyle()) != null) {
            this.f25667hg = loadingStyle.oa();
            this.ou = loadingStyle.yo();
        }
        com.bytedance.sdk.openadsdk.core.ivm.moa moaVar = this.zou;
        if (moaVar != null) {
            moaVar.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.model.dhk.3
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (dhk.this.zou.getTag() != null) {
                        if (dhk.this.zou.getTag().equals(1)) {
                            dhk.this.oa(3);
                        } else if (dhk.this.zou.getTag().equals(2)) {
                            dhk.this.oa(4);
                        }
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cq() {
        this.ku.get();
        this.sk.get();
        if (this.ku.get() || this.sk.get()) {
            return;
        }
        this.ku.set(true);
        uef(0);
        long jElapsedRealtime = this.ot == -1 ? 0L : SystemClock.elapsedRealtime() - this.ot;
        if (yo(this.xs)) {
            com.bytedance.sdk.openadsdk.moa.yo.yo(this.xs, this.dxx, jElapsedRealtime);
        }
        com.bytedance.sdk.openadsdk.moa.yo.uef(this.xs, this.dxx, System.currentTimeMillis() - this.cp, true);
        dz();
    }

    public static boolean cz(gzw gzwVar) {
        return (gzwVar == null || gzwVar.vl() == 1 || !zjm(gzwVar)) ? false : true;
    }

    private void dhk() {
        com.bytedance.sdk.component.cz.ivm ivmVar = this.gzw;
        if (ivmVar == null || ivmVar.getWebView() == null) {
            return;
        }
        this.au = this.gzw.uef;
        this.dor = this.gzw.f24972oa;
        this.etd = this.gzw.yo;
        if (this.gzw.oa()) {
            this.lz.hg();
            this.cp = System.currentTimeMillis();
        }
        if (this.gzw.moa()) {
            cq();
        }
        if (this.gzw.yo()) {
            cq();
            int iUef = gb.uef(this.gzw.getWebView());
            oa oaVar = this.jkf;
            if (oaVar != null) {
                oaVar.uef(iUef != 1 ? 0 : 1);
            }
        }
    }

    private void dj() {
        dhk dhkVar;
        com.bytedance.sdk.component.cz.ivm ivmVar = this.gzw;
        if (ivmVar == null || ivmVar.getWebView() == null) {
            dhkVar = this;
        } else {
            com.bytedance.sdk.openadsdk.core.widget.uef.yo.uef(com.bytedance.sdk.openadsdk.core.sy.uef()).uef(false).oa(false).uef(this.gzw.getWebView());
            com.bytedance.sdk.component.cz.ivm ivmVar2 = this.gzw;
            if (ivmVar2 != null && ivmVar2.getWebView() != null) {
                this.jkf = new oa(this.uqx, this.xs, this.dxx, this);
                if (this.gzw.l_() && (this.gzw.getWebViewClient() instanceof com.bytedance.sdk.openadsdk.core.widget.uef.lw)) {
                    com.bytedance.sdk.openadsdk.moa.cq cqVarOa = ((com.bytedance.sdk.openadsdk.core.widget.uef.lw) this.gzw.getWebViewClient()).oa();
                    this.gb = cqVarOa;
                    if (cqVarOa != null) {
                        cqVarOa.uef(this.jkf);
                        this.gb.oa(true);
                    }
                } else {
                    this.gb = new com.bytedance.sdk.openadsdk.moa.cq(this.xs, this.gzw.getWebView(), this.jkf, this.rj).oa(true);
                }
                this.gb.uef(this.dxx);
                com.bytedance.sdk.openadsdk.common.lw lwVarUef = gb.uef(this.xs, this.gzw, this.fz, this.dxx);
                this.dv = lwVarUef;
                if (lwVarUef != null) {
                    lwVarUef.uef(this.dxx);
                }
                gb.uef(this.xs, this.gzw);
            }
            wrv();
            if (this.gzw.l_()) {
                dhk();
            }
            this.gzw.setLandingPage(true);
            this.gzw.setTag(this.dxx);
            this.gzw.setMaterialMeta(this.xs.cuu());
            dhkVar = this;
            com.bytedance.sdk.openadsdk.core.widget.uef.lw lwVar = new com.bytedance.sdk.openadsdk.core.widget.uef.lw(com.bytedance.sdk.openadsdk.core.sy.uef(), this.orq, this.xs.iou(), this.dv, this.gb, true) { // from class: com.bytedance.sdk.openadsdk.core.model.dhk.12
                @Override // com.bytedance.sdk.openadsdk.core.widget.uef.lw, android.webkit.WebViewClient
                public void onPageFinished(WebView webView, String str) {
                    super.onPageFinished(webView, str);
                    dhk.this.cq();
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.uef.lw, android.webkit.WebViewClient
                public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                    super.onPageStarted(webView, str, bitmap);
                    dhk.this.lz.hg();
                    dhk.this.cp = System.currentTimeMillis();
                    if (!dhk.oa(dhk.this.xs) || dhk.this.wk == null || gzw.lw(dhk.this.xs)) {
                        return;
                    }
                    dhk.this.wk.sendEmptyMessageDelayed(101, 2000L);
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.uef.lw, android.webkit.WebViewClient
                public void onReceivedError(WebView webView, int i5, String str, String str2) {
                    super.onReceivedError(webView, i5, str, str2);
                    String strMoa = com.bytedance.sdk.openadsdk.core.widget.uef.lw.moa(str2);
                    boolean z2 = false;
                    if (this.ivm != null) {
                        this.ivm.uef(webView, i5, str, str2, com.bytedance.sdk.openadsdk.core.widget.uef.lw.moa(str2), (webView == null || str2 == null || !str2.equals(webView.getUrl())) ? false : true);
                    }
                    boolean z10 = strMoa != null && strMoa.startsWith("image");
                    if (strMoa != null && strMoa.startsWith("mp4")) {
                        z2 = true;
                    }
                    if (z10 || z2 || dhk.this.ku.get()) {
                        return;
                    }
                    dhk.this.wk();
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.uef.lw, android.webkit.WebViewClient
                public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
                    if (sslErrorHandler != null) {
                        dhk.this.wk();
                    }
                    super.onReceivedSslError(webView, sslErrorHandler, sslError);
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.uef.lw, android.webkit.WebViewClient
                public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
                    try {
                        if (TextUtils.isEmpty(dhk.this.gem)) {
                            return super.shouldInterceptRequest(webView, str);
                        }
                        dhk.wrv(dhk.this);
                        WebResourceResponseModel webResourceResponseModelUef = com.bytedance.sdk.openadsdk.xs.oa.uef().uef(dhk.this.cop, dhk.this.gem, str);
                        if (webResourceResponseModelUef != null && webResourceResponseModelUef.getWebResourceResponse() != null) {
                            dhk.dz(dhk.this);
                            return webResourceResponseModelUef.getWebResourceResponse();
                        }
                        if (webResourceResponseModelUef != null && webResourceResponseModelUef.getMsg() == 2) {
                            dhk.wk(dhk.this);
                        }
                        return super.shouldInterceptRequest(webView, str);
                    } catch (Throwable th) {
                        com.bytedance.sdk.component.utils.dhk.uef("LandingPageModel", "shouldInterceptRequest url error", th);
                        return super.shouldInterceptRequest(webView, str);
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.uef.lw, android.webkit.WebViewClient
                public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                    if (!dhk.yo(dhk.this.xs) || gb.uef(webView) != 1) {
                        return super.shouldOverrideUrlLoading(webView, str);
                    }
                    Intent intent = new Intent(dhk.this.fz, (Class<?>) TTCeilingLandingPageActivity.class);
                    dhk.this.xs.lw(str);
                    intent.putExtra("meta_index", com.bytedance.sdk.openadsdk.core.cp.uef().uef(dhk.this.xs));
                    com.bytedance.sdk.component.utils.oa.uef(this.moa, intent, null);
                    return true;
                }
            };
            dhkVar.swd = lwVar;
            dhkVar.gzw.setWebViewClient(lwVar);
            dhkVar.swd.uef(dhkVar.xs);
            dhkVar.swd.uef(dhkVar.dxx);
            dhkVar.swd.uef(dhkVar.lz);
            dhkVar.gzw.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.uef.moa(dhkVar.orq, dhkVar.gb, dhkVar.dv) { // from class: com.bytedance.sdk.openadsdk.core.model.dhk.13
                @Override // com.bytedance.sdk.openadsdk.core.widget.uef.moa, android.webkit.WebChromeClient
                public void onProgressChanged(WebView webView, int i5) {
                    super.onProgressChanged(webView, i5);
                    if (dhk.this.fz != null && !dhk.this.fz.isFinishing() && i5 == 100) {
                        dhk.this.cq();
                    }
                    if (dhk.this.rt != null) {
                        dhk.this.rt.uef(i5);
                    }
                }
            });
            if (dhkVar.pu == null) {
                dhkVar.pu = com.bytedance.sdk.openadsdk.tpx.uef.uef.moa.uef(com.bytedance.sdk.openadsdk.core.sy.uef(), dhkVar.dxx);
            }
            dhkVar.gzw.setDownloadListener(new DownloadListener() { // from class: com.bytedance.sdk.openadsdk.core.model.dhk.14
                @Override // android.webkit.DownloadListener
                public void onDownloadStart(String str, String str2, String str3, String str4, long j8) {
                    if (dhk.this.pu != null) {
                        dhk.this.pu.uef(dhk.this.xs);
                    }
                }
            });
            com.bytedance.sdk.component.cz.ivm ivmVar3 = dhkVar.gzw;
            ivmVar3.setUserAgentString(com.bytedance.sdk.openadsdk.utils.dhk.uef(ivmVar3.getWebView(), BuildConfig.VERSION_CODE));
            dhkVar.gzw.setMixedContentMode(0);
            dhkVar.gzw.getWebView().setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: com.bytedance.sdk.openadsdk.core.model.dhk.15
                @Override // android.view.View.OnScrollChangeListener
                public void onScrollChange(View view, int i5, int i10, int i11, int i12) {
                    if (dhk.this.gb != null) {
                        dhk.this.gb.oa(i10);
                    }
                }
            });
            dhkVar.gzw.getWebView().setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.core.model.dhk.16
                @Override // android.view.View.OnTouchListener
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    if (dhk.this.cz()) {
                        int action = motionEvent.getAction();
                        if (action == 0) {
                            dhk.this.vyg = motionEvent.getY();
                        } else if (action == 1) {
                            if (af.uef(dhk.this.vyg, motionEvent.getY(), dhk.this.fz)) {
                                dhk.this.oa(5);
                            }
                        } else if (action == 2) {
                            motionEvent.setAction(3);
                        }
                    }
                    if (dhk.this.vj && motionEvent.getAction() == 1 && dhk.this.lz != null) {
                        dhk.this.uef(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.model.dhk.16.1
                            @Override // java.lang.Runnable
                            public void run() {
                                dhk.this.lz.nkh();
                            }
                        });
                    }
                    if ((!dhk.this.rl || dhk.zjm(dhk.this.xs)) && !dhk.xs(dhk.this.xs)) {
                        dhk.this.dz.onTouch(view, motionEvent);
                    }
                    if ((!dhk.this.rl || dhk.zjm(dhk.this.xs)) && !dhk.xs(dhk.this.xs) && motionEvent.getAction() == 1 && dhk.this.dz.ivm()) {
                        dhk.this.gzw.getWebView().performClick();
                        dhk.this.rl = true;
                    }
                    if (dhk.this.gb != null) {
                        dhk.this.gb.uef(motionEvent);
                    }
                    if (dhk.this.dv == null) {
                        return false;
                    }
                    dhk.this.dv.uef(motionEvent);
                    return false;
                }
            });
            dhkVar.gzw.getWebView().setOnClickListener(dhkVar.dz);
            com.bytedance.sdk.openadsdk.moa.yo.uef(dhkVar.xs, dhkVar.dxx, dhkVar.rj);
            if (!dhkVar.gzw.l_()) {
                com.bytedance.sdk.component.utils.dhk.uef("LandingPageModel", "loadUrlWithRefer url  = " + dhkVar.xs.cc());
                com.bytedance.sdk.openadsdk.utils.gzw.uef(dhkVar.gzw, dhkVar.xs.cc());
            }
            dhkVar.af = true;
        }
        com.bytedance.sdk.component.cz.ivm ivmVar4 = dhkVar.gzw;
        if (ivmVar4 == null || dhkVar.rt == null || ivmVar4.yo()) {
            return;
        }
        dhkVar.rt.uef();
    }

    private void dz() {
        this.ivm.setVisibility(8);
        if (moa(this.xs) || xs(this.xs) || !moa() || yo(this.xs)) {
            return;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "timeVisible", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        this.dj = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(100L);
        this.dj.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.core.model.dhk.18
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) dhk.this.gsd.getLayoutParams();
                layoutParams.weight = (float) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 0.25d);
                dhk.this.uef((float) (1.0d - (((Float) valueAnimator.getAnimatedValue()).floatValue() * 0.2d)));
                dhk.this.gsd.setLayoutParams(layoutParams);
            }
        });
        this.dj.start();
    }

    public static boolean ivm(gzw gzwVar) {
        gr grVarHzk;
        return (gzwVar == null || (grVarHzk = gzwVar.hzk()) == null || grVarHzk.uef() != 2) ? false : true;
    }

    public static boolean lw(gzw gzwVar) {
        gr grVarHzk;
        return gzwVar != null && gzwVar.ykf() == 3 && !cp.oa(gzwVar) && (gzwVar.gze() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || gzwVar.gze() == 100.0f) && (grVarHzk = gzwVar.hzk()) != null && grVarHzk.uef() == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean oib() {
        return gzw.lw(this.xs);
    }

    private void sy() {
        if (moa()) {
            this.gr.setVisibility(0);
            ObjectAnimator duration = ObjectAnimator.ofFloat(this.f25669ue, "translationY", 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration(500L);
            this.cz = duration;
            duration.setRepeatMode(2);
            this.cz.setRepeatCount(-1);
            this.cz.start();
            this.gr.setClickable(true);
            this.gr.setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.core.model.dhk.5
                @Override // android.view.View.OnTouchListener
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    if (!dhk.this.rl) {
                        dhk.this.dz.onTouch(view, motionEvent);
                    }
                    if (motionEvent.getAction() != 3 && motionEvent.getAction() != 1) {
                        return false;
                    }
                    dhk.this.zjm = ObjectAnimator.ofFloat(this, "timeSlide", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
                    dhk.this.zjm.setDuration(200L);
                    dhk.this.zjm.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.core.model.dhk.5.1
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public void onAnimationUpdate(ValueAnimator valueAnimator) {
                            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) dhk.this.gsd.getLayoutParams();
                            layoutParams.weight = (float) ((((Float) valueAnimator.getAnimatedValue()).floatValue() * 2.07f) + 0.25d);
                            dhk.this.uef((float) (0.800000011920929d - (((Float) valueAnimator.getAnimatedValue()).floatValue() * 0.5d)));
                            dhk.this.gsd.setLayoutParams(layoutParams);
                        }
                    });
                    if (dhk.this.dz.ivm()) {
                        dhk.this.gr.performClick();
                        dhk.this.rl = true;
                    }
                    dhk.this.zjm.start();
                    dhk.this.gr.setVisibility(8);
                    return true;
                }
            });
            this.gr.setOnClickListener(this.dz);
        }
        if (!oib()) {
            this.bcc.setVisibility(8);
            this.f25668oa.setVisibility(0);
            this.uef.setScaleType(ImageView.ScaleType.FIT_CENTER);
            this.uef.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.model.dhk.6
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    dhk dhkVar = dhk.this;
                    com.bytedance.sdk.openadsdk.moa.yo.oa(dhkVar.xs, dhkVar.dxx);
                }
            });
            gzw gzwVar = this.xs;
            if (gzwVar != null && gzwVar.lpy() != null && this.xs.lpy().size() > 0 && this.xs.lpy().get(0) != null && !TextUtils.isEmpty(this.xs.lpy().get(0).uef())) {
                com.bytedance.sdk.openadsdk.dhk.oa.oa().uef(this.xs.lpy().get(0), this.uef, this.xs, new com.bytedance.sdk.component.lw.ab() { // from class: com.bytedance.sdk.openadsdk.core.model.dhk.7
                    @Override // com.bytedance.sdk.component.lw.ab
                    public void uef(com.bytedance.sdk.component.lw.dj djVar) {
                        if (dhk.this.wk != null) {
                            dhk.this.wk.removeMessages(101);
                        }
                    }

                    @Override // com.bytedance.sdk.component.lw.ab
                    public void uef(int i5, String str, Throwable th) {
                        if (dhk.this.wk != null) {
                            dhk.this.wk.removeMessages(101);
                        }
                        dhk.this.zjm();
                    }
                });
            }
        }
        try {
            String strUef = this.xs.lpy().get(0).uef();
            com.bytedance.sdk.openadsdk.zjm.moa.uef().uef(strUef).uef(this.xs.lpy().get(0).oa()).oa(this.xs.lpy().get(0).yo()).lw(af.lw(com.bytedance.sdk.openadsdk.core.sy.uef())).moa(af.yo(com.bytedance.sdk.openadsdk.core.sy.uef())).yo(1).uef(new uef()).uef(new com.bytedance.sdk.openadsdk.zjm.oa(this.xs, strUef, new com.bytedance.sdk.component.lw.ab() { // from class: com.bytedance.sdk.openadsdk.core.model.dhk.8
                @Override // com.bytedance.sdk.component.lw.ab
                public void uef(int i5, String str, Throwable th) {
                }

                @Override // com.bytedance.sdk.component.lw.ab
                public void uef(com.bytedance.sdk.component.lw.dj djVar) {
                    Drawable bitmapDrawable;
                    try {
                        Object objOa = djVar.oa();
                        if (objOa != null && djVar.yo() != null) {
                            if (objOa instanceof Bitmap) {
                                bitmapDrawable = new BitmapDrawable(com.bytedance.sdk.openadsdk.core.sy.uef().getResources(), (Bitmap) objOa);
                            } else if (objOa instanceof Drawable) {
                                if (Build.VERSION.SDK_INT >= 28 && j.B(objOa)) {
                                    j.k(objOa).start();
                                }
                                bitmapDrawable = (Drawable) objOa;
                            } else {
                                bitmapDrawable = null;
                            }
                            if (!dhk.this.oib()) {
                                dhk.this.f25668oa.setBackground(bitmapDrawable);
                                return;
                            }
                            dhk.this.moa.setBackground(bitmapDrawable);
                            View viewAb = dhk.this.lz.ab();
                            if (viewAb == null || !(viewAb.getParent() instanceof View)) {
                                return;
                            }
                            ((View) viewAb.getParent()).setBackground(bitmapDrawable);
                        }
                    } catch (Exception unused) {
                    }
                }
            }));
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void wk() {
        LinearLayout.LayoutParams layoutParams;
        if (this.ku.get()) {
            return;
        }
        ab();
        this.sk.set(true);
        uef(-1);
        this.lz.wrv();
        com.bytedance.sdk.openadsdk.common.wrv wrvVar = this.rt;
        if (wrvVar != null) {
            wrvVar.oa();
        }
        if (xs(this.xs)) {
            com.bytedance.sdk.openadsdk.moa.yo.uef(System.currentTimeMillis(), this.xs, this.dxx, "show_agg_backup");
            View view = this.bs;
            if (view != null) {
                view.setVisibility(0);
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.bs.getLayoutParams();
                layoutParams2.addRule(13);
                layoutParams2.addRule(10, 0);
                this.bs.setLayoutParams(layoutParams2);
                RelativeLayout relativeLayout = this.ivm;
                if (relativeLayout != null) {
                    relativeLayout.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.model.dhk.2
                        @Override // android.view.View.OnClickListener
                        public void onClick(View view2) {
                        }
                    });
                    return;
                }
                return;
            }
            return;
        }
        this.f25666ab.setVisibility(0);
        RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) this.f25666ab.getLayoutParams();
        layoutParams3.addRule(13);
        layoutParams3.addRule(10, 0);
        this.f25666ab.setLayoutParams(layoutParams3);
        if (this.xs.ifk() != null && !TextUtils.isEmpty(this.xs.ifk().uef())) {
            com.bytedance.sdk.openadsdk.dhk.oa.oa().uef(this.xs.ifk().uef(), this.xs.ifk().oa(), this.xs.ifk().yo(), this.dhk, this.xs);
        }
        this.sy.setText(this.xs.jp());
        this.oib.setText(this.xs.az());
        if (this.tpx != null) {
            oa();
            this.tpx.setClickable(true);
            this.tpx.setOnClickListener(this.cq);
            this.tpx.setOnTouchListener(this.cq);
        }
        if (!yo(this.xs) || (layoutParams = this.hnk) == null) {
            return;
        }
        if (layoutParams.weight < 30.0f) {
            moa(8);
        } else {
            moa(0);
        }
    }

    private void wrv() {
        oyt oytVar = new oyt(this.fz);
        this.orq = oytVar;
        oytVar.uef(this.lz);
        this.orq.oa(this.gzw).uef(com.bytedance.sdk.openadsdk.core.zjm.oa.yo.uef(this.xs)).yo(this.xs.iou()).moa(this.xs.em()).uef(this.xs).oa(xs(this.xs) ? this.km : -1).uef(this.xs.us()).oa(this.dxx).lw(this.xs.kid()).uef(this.gzw).uef(new com.bytedance.sdk.openadsdk.core.widget.lw() { // from class: com.bytedance.sdk.openadsdk.core.model.dhk.17
            @Override // com.bytedance.sdk.openadsdk.core.widget.lw
            public void uef() {
                if (dhk.xs(dhk.this.xs) && (dhk.this.fz instanceof com.bytedance.sdk.openadsdk.core.wk.moa.oa)) {
                    ((com.bytedance.sdk.openadsdk.core.wk.moa.oa) dhk.this.fz).lz();
                } else if (dhk.this.swd != null) {
                    dhk.this.swd.yo();
                }
            }
        });
    }

    public static boolean xs(gzw gzwVar) {
        return gzwVar != null && gzwVar.wxf() == 33;
    }

    public static boolean zjm(gzw gzwVar) {
        if (gzwVar != null) {
            return gzwVar.wxf() == 19 || gzwVar.wxf() == 20;
        }
        return false;
    }

    public boolean moa() {
        return this.xs.hw() == 15 || this.xs.hw() == 16;
    }

    public void bcc() {
        com.bytedance.sdk.openadsdk.moa.cq cqVar = this.gb;
        if (cqVar != null) {
            cqVar.bcc();
        }
    }

    public void oa() {
        gzw gzwVar = this.xs;
        if (gzwVar == null || TextUtils.isEmpty(gzwVar.kik())) {
            return;
        }
        this.tpx.setText(this.xs.kik());
    }

    public void xs() {
        oyt oytVar = this.orq;
        if (oytVar != null) {
            oytVar.dj();
        }
        com.bytedance.sdk.openadsdk.moa.cq cqVar = this.gb;
        if (cqVar != null) {
            cqVar.xs();
        }
    }

    public void yo() {
        if (oib()) {
            try {
                String strZjm = this.xs.nj().zjm();
                com.bytedance.sdk.openadsdk.zjm.moa.uef().uef(strZjm).uef(this.xs.nj().yo()).oa(this.xs.nj().oa()).lw(af.lw(com.bytedance.sdk.openadsdk.core.sy.uef())).moa(af.yo(com.bytedance.sdk.openadsdk.core.sy.uef())).yo(2).uef(new uef()).uef(new com.bytedance.sdk.openadsdk.zjm.oa(this.xs, strZjm, new com.bytedance.sdk.component.lw.ab() { // from class: com.bytedance.sdk.openadsdk.core.model.dhk.4
                    @Override // com.bytedance.sdk.component.lw.ab
                    public void uef(int i5, String str, Throwable th) {
                    }

                    @Override // com.bytedance.sdk.component.lw.ab
                    public void uef(com.bytedance.sdk.component.lw.dj djVar) {
                        try {
                            Object objOa = djVar.oa();
                            if (objOa != null && djVar.yo() != null) {
                                BitmapDrawable bitmapDrawable = objOa instanceof Bitmap ? new BitmapDrawable(com.bytedance.sdk.openadsdk.core.sy.uef().getResources(), (Bitmap) objOa) : null;
                                View viewAb = dhk.this.lz.ab();
                                if (bitmapDrawable == null || viewAb == null || !(viewAb.getParent() instanceof View)) {
                                    return;
                                }
                                ((View) viewAb.getParent()).setBackground(bitmapDrawable);
                            }
                        } catch (Throwable th) {
                            com.bytedance.sdk.component.utils.dhk.yo("LandingPageModel", th.getMessage());
                        }
                    }
                }));
            } catch (Exception unused) {
            }
        }
    }

    public static boolean moa(gzw gzwVar) {
        if (gzwVar == null) {
            return false;
        }
        if (dj(gzwVar)) {
            return true;
        }
        return gzwVar.ykf() == 3 && (gzwVar.wxf() == 5 || lw(gzwVar)) && !cp.oa(gzwVar) && (gzwVar.gze() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || gzwVar.gze() == 100.0f);
    }

    public boolean cz() {
        AtomicBoolean atomicBoolean;
        return (!yo(this.xs) || (atomicBoolean = this.wxf) == null || atomicBoolean.get()) ? false : true;
    }

    public void ivm() {
        com.bytedance.sdk.component.cz.ivm ivmVar;
        com.bytedance.sdk.openadsdk.moa.cq cqVar = this.gb;
        if (cqVar != null && (ivmVar = this.gzw) != null) {
            cqVar.uef(ivmVar);
        }
        Handler handler = this.wk;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        ValueAnimator valueAnimator = this.ggp;
        if (valueAnimator != null) {
            valueAnimator.removeAllUpdateListeners();
            this.ggp.cancel();
        }
        ValueAnimator valueAnimator2 = this.zjm;
        if (valueAnimator2 != null) {
            valueAnimator2.removeAllUpdateListeners();
            this.zjm.cancel();
        }
        ObjectAnimator objectAnimator = this.dj;
        if (objectAnimator != null) {
            objectAnimator.removeAllUpdateListeners();
            this.dj.cancel();
        }
        com.bytedance.sdk.openadsdk.common.wrv wrvVar = this.rt;
        if (wrvVar != null) {
            wrvVar.oa();
        }
        ObjectAnimator objectAnimator2 = this.cz;
        if (objectAnimator2 != null) {
            objectAnimator2.cancel();
        }
        com.bytedance.sdk.component.cz.ivm ivmVar2 = this.gzw;
        if (ivmVar2 != null) {
            com.bytedance.sdk.openadsdk.core.af.uef(ivmVar2.getWebView());
        }
        this.gzw = null;
        oyt oytVar = this.orq;
        if (oytVar != null) {
            oytVar.wrv();
        }
        com.bytedance.sdk.openadsdk.moa.cq cqVar2 = this.gb;
        if (cqVar2 != null) {
            cqVar2.moa(true);
        }
        if (!TextUtils.isEmpty(this.gem) && this.af) {
            yo.uef.uef(this.dor, this.au, this.xs);
        }
        com.bytedance.sdk.openadsdk.xs.oa.uef().uef(this.cop);
    }

    public void zjm() {
        if ("landingpage_split_screen".equals(this.dxx) && com.bytedance.sdk.openadsdk.gzw.lw.uef("default_split_style", false) && this.sw.compareAndSet(false, true)) {
            km.uef(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.model.dhk.10
                @Override // java.lang.Runnable
                public void run() {
                    dhk.this.ggp = ValueAnimator.ofFloat(1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    dhk.this.ggp.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.core.model.dhk.10.1
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public void onAnimationUpdate(ValueAnimator valueAnimator) {
                            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            if (dhk.this.pz != null) {
                                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) dhk.this.pz.getLayoutParams();
                                layoutParams.weight = fFloatValue;
                                dhk.this.pz.setLayoutParams(layoutParams);
                            }
                        }
                    });
                    dhk.this.ggp.setDuration(500L);
                    dhk.this.ggp.start();
                    if (dhk.this.gr != null) {
                        dhk.this.gr.setVisibility(8);
                    }
                }
            });
        }
    }

    public static boolean oa(gzw gzwVar) {
        return gzwVar != null && gzwVar.ykf() == 3 && gzwVar.wxf() == 6 && !cp.oa(gzwVar) && gzwVar.cgg() == 1 && (gzwVar.gze() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || gzwVar.gze() == 100.0f);
    }

    public void lw() {
        FrameLayout frameLayout = this.gsd;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
            View view = this.pz;
            if (view != null) {
                view.setVisibility(0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void moa(int i5) {
        af.uef((View) this.f25667hg, i5);
        af.uef((View) this.ou, i5);
        if (this.sk.get()) {
            af.uef((View) this.sy, i5);
            af.uef((View) this.oib, i5);
            af.uef((View) this.dhk, i5);
            af.uef((View) this.tpx, 0);
        }
    }

    public void uef(yo.uef uefVar) {
        this.wrv = uefVar;
    }

    public void oa(int i5) {
        com.bytedance.sdk.openadsdk.core.zjm.tpx tpxVar = this.nkh;
        if (tpxVar != null) {
            tpxVar.lw(i5);
        }
    }

    public void uef() {
        long jUef;
        View view;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        com.bytedance.sdk.component.cz.ivm ivmVar = (com.bytedance.sdk.component.cz.ivm) this.oyt.findViewById(com.bytedance.sdk.openadsdk.utils.bs.orq);
        this.gzw = ivmVar;
        if (ivmVar != null && !gzw.uef(this.xs)) {
            if (!this.gzw.l_()) {
                this.gzw.lw();
            }
        } else {
            af.uef((View) this.gzw, 8);
        }
        this.gsd = (FrameLayout) this.oyt.findViewById(com.bytedance.sdk.openadsdk.utils.bs.tpx);
        this.rt = (com.bytedance.sdk.openadsdk.common.wrv) this.oyt.findViewById(com.bytedance.sdk.openadsdk.utils.bs.gr);
        this.gr = this.oyt.findViewById(com.bytedance.sdk.openadsdk.utils.bs.gzw);
        this.f25669ue = (ImageView) this.oyt.findViewById(com.bytedance.sdk.openadsdk.utils.bs.gsd);
        this.pz = this.oyt.findViewById(com.bytedance.sdk.openadsdk.utils.bs.oyt);
        this.f25668oa = (FrameLayout) this.oyt.findViewById(com.bytedance.sdk.openadsdk.utils.bs.oib);
        this.uef = (ImageView) this.oyt.findViewById(com.bytedance.sdk.openadsdk.utils.bs.dhk);
        this.ivm = (RelativeLayout) this.oyt.findViewById(com.bytedance.sdk.openadsdk.utils.bs.rt);
        this.yo = (TextView) this.oyt.findViewById(com.bytedance.sdk.openadsdk.utils.bs.gv);
        this.moa = (FrameLayout) this.oyt.findViewById(com.bytedance.sdk.openadsdk.utils.bs.wrv);
        View viewFindViewById = this.oyt.findViewById(com.bytedance.sdk.openadsdk.utils.bs.f26139ue);
        this.f25666ab = viewFindViewById;
        if (viewFindViewById == null) {
            this.f25666ab = this.oyt.findViewById(com.bytedance.sdk.openadsdk.utils.bs.pu);
        }
        this.bs = this.fz.findViewById(com.bytedance.sdk.openadsdk.utils.bs.pz);
        this.sy = (TextView) this.oyt.findViewById(com.bytedance.sdk.openadsdk.utils.bs.ku);
        this.oib = (TextView) this.oyt.findViewById(com.bytedance.sdk.openadsdk.utils.bs.fz);
        this.dhk = (com.bytedance.sdk.openadsdk.core.widget.bs) this.oyt.findViewById(com.bytedance.sdk.openadsdk.utils.bs.cp);
        this.tpx = (TextView) this.oyt.findViewById(com.bytedance.sdk.openadsdk.utils.bs.dxx);
        if (this.yo != null && this.xs.gsd() != null) {
            this.yo.setText(this.xs.gsd().lw());
        }
        this.lw = this.oyt.findViewById(com.bytedance.sdk.openadsdk.utils.bs.lz);
        this.zou = (com.bytedance.sdk.openadsdk.core.ivm.moa) this.oyt.findViewById(com.bytedance.sdk.openadsdk.utils.bs.hq);
        if ((moa(this.xs) || oa(this.xs) || xs(this.xs) || yo(this.xs)) && this.xs.gsd() != null) {
            View view2 = this.lw;
            if (view2 != null) {
                view2.setVisibility(8);
            }
            if (xs(this.xs)) {
                jUef = this.xs.gsd().yo();
            } else {
                jUef = this.xs.gsd().uef();
            }
            com.bytedance.sdk.openadsdk.core.wk.yo().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.model.dhk.11
                @Override // java.lang.Runnable
                public void run() {
                    if (dhk.this.ku.get()) {
                        return;
                    }
                    dhk dhkVar = dhk.this;
                    com.bytedance.sdk.openadsdk.moa.yo.uef(dhkVar.xs, dhkVar.dxx, System.currentTimeMillis() - dhk.this.cp, false);
                    dhk.this.wk();
                }
            }, jUef * 1000);
        }
        dj();
        if (oa(this.xs)) {
            sy();
            if (!moa()) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.gsd.getLayoutParams();
                layoutParams.weight = 2.33f;
                this.gsd.setLayoutParams(layoutParams);
            }
        }
        if ((moa(this.xs) || xs(this.xs)) && (view = this.pz) != null) {
            view.setVisibility(8);
        }
        com.bytedance.sdk.openadsdk.common.wrv wrvVar = this.rt;
        if (wrvVar != null) {
            wrvVar.uef(this.xs);
        }
        if (yo(this.xs)) {
            bs();
        }
        yo.uef.uef(SystemClock.elapsedRealtime() - jElapsedRealtime, this.xs, this.dxx, this.cop, this.gem);
    }

    public static boolean yo(gzw gzwVar) {
        return gzwVar != null && gzwVar.ykf() == 3 && gzwVar.hg() == 38 && gzwVar.cgg() == 1;
    }

    public static boolean cq(gzw gzwVar) {
        if (gzwVar != null) {
            return lw(gzwVar) || ivm(gzwVar);
        }
        return false;
    }

    public static boolean wrv(gzw gzwVar) {
        return gzwVar != null && gzwVar.wxf() == 8 && gzwVar.ou() == 1;
    }

    public static boolean dj(gzw gzwVar) {
        return gzwVar != null && gzwVar.wxf() == 19;
    }

    public static boolean uef(gzw gzwVar) {
        if (gzwVar == null || dj(gzwVar) || ivm(gzwVar) || lw(gzwVar)) {
            return false;
        }
        return moa(gzwVar) || oa(gzwVar) || xs(gzwVar);
    }

    public void uef(int i5) {
        com.bytedance.sdk.openadsdk.core.wk.moa.oa oaVar = this.lz;
        if (oaVar != null) {
            oaVar.lw();
        }
    }

    public void uef(float f10) {
        try {
            this.lz.wk();
        } catch (Throwable unused) {
        }
    }

    public void uef(com.bytedance.sdk.openadsdk.core.zjm.tpx tpxVar, FrameLayout frameLayout) {
        this.nkh = tpxVar;
        this.hts = frameLayout;
    }

    public void uef(final int i5, com.bytedance.sdk.component.adexpress.oa.dz dzVar) {
        float f10;
        int iIvm;
        if ((i5 != 3 && !yo(i5)) || this.hts == null || dzVar == null) {
            return;
        }
        AtomicBoolean atomicBoolean = this.wxf;
        if (atomicBoolean != null) {
            if (i5 == 1) {
                return;
            }
            if (i5 == 5 && atomicBoolean.get()) {
                return;
            }
        }
        final LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.pz.getLayoutParams();
        this.hnk = (LinearLayout.LayoutParams) this.gsd.getLayoutParams();
        final float f11 = layoutParams.weight;
        oib oibVarGr = this.xs.gr();
        if (yo(i5)) {
            if (oibVarGr != null) {
                iIvm = oibVarGr.lw();
                f10 = iIvm;
            } else {
                f10 = 30.0f;
            }
        } else if (oibVarGr != null) {
            iIvm = oibVarGr.ivm();
            f10 = iIvm;
        } else {
            f10 = 70.0f;
        }
        final float f12 = f10;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.hts.getLayoutParams();
        if (layoutParams2 == null) {
            layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        }
        final FrameLayout.LayoutParams layoutParams3 = layoutParams2;
        final int i10 = layoutParams3.height;
        final int i11 = layoutParams3.width;
        final int i12 = layoutParams3.leftMargin;
        final int i13 = layoutParams3.topMargin;
        final int iOa = af.oa(this.fz, (float) dzVar.xs());
        final int iOa2 = af.oa(this.fz, (float) dzVar.bcc());
        final int iOa3 = af.oa(this.fz, (float) dzVar.lw());
        final int iOa4 = af.oa(this.fz, (float) dzVar.ivm());
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        this.zjm = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.zjm.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.core.model.dhk.9
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                LinearLayout.LayoutParams layoutParams4 = layoutParams;
                float f13 = f11;
                layoutParams4.weight = a.b(f12, f13, fFloatValue, f13);
                dhk.this.hnk.weight = 100.0f - layoutParams.weight;
                if (dhk.this.pz != null) {
                    dhk.this.pz.setLayoutParams(layoutParams);
                }
                if (dhk.this.gsd != null) {
                    dhk.this.gsd.setLayoutParams(dhk.this.hnk);
                }
                if (dhk.this.hnk.weight < 30.0f) {
                    dhk.this.moa(8);
                } else {
                    dhk.this.moa(0);
                }
                FrameLayout.LayoutParams layoutParams5 = layoutParams3;
                layoutParams5.width = i11 + ((int) ((iOa - r2) * fFloatValue));
                layoutParams5.height = i10 + ((int) ((iOa2 - r2) * fFloatValue));
                layoutParams5.leftMargin = i12 + ((int) ((iOa3 - r2) * fFloatValue));
                layoutParams5.topMargin = i13 + ((int) ((iOa4 - r2) * fFloatValue));
                if (dhk.this.hts != null) {
                    dhk.this.hts.setLayoutParams(layoutParams3);
                }
                dhk.this.uef(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                if (fFloatValue == 1.0f) {
                    if (dhk.this.zou != null) {
                        af.uef((View) dhk.this.zou, 0);
                        if (dhk.this.yo(i5)) {
                            dhk.this.zou.setImageDrawable(com.bytedance.sdk.component.utils.orq.yo(dhk.this.fz, "tt_ad_zoom_down"));
                            dhk.this.zou.setTag(1);
                        } else {
                            dhk.this.zou.setImageDrawable(com.bytedance.sdk.component.utils.orq.yo(dhk.this.fz, "tt_ad_zoom_up"));
                            dhk.this.zou.setTag(2);
                        }
                    }
                    if (dhk.this.wxf == null) {
                        dhk.this.wxf = new AtomicBoolean();
                    }
                    dhk.this.wxf.set(dhk.this.yo(i5));
                }
            }
        });
        com.bytedance.sdk.openadsdk.moa.yo.moa(this.xs, this.dxx, i5);
        this.zjm.start();
        if (this.vjj.compareAndSet(false, true)) {
            this.ot = SystemClock.elapsedRealtime();
        }
        com.bytedance.sdk.openadsdk.moa.cq cqVar = this.gb;
        if (cqVar != null) {
            cqVar.uef(true, SystemClock.elapsedRealtime());
        }
        af.uef((View) this.zou, 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean uef(Runnable runnable) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.xvp < 100) {
            return false;
        }
        this.xvp = jCurrentTimeMillis;
        if (runnable == null) {
            return true;
        }
        runnable.run();
        return true;
    }
}
