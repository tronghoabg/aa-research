package com.bytedance.sdk.component.cz;

import android.content.Context;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.DownloadListener;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AbsListView;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ScrollView;
import com.bytedance.sdk.component.cz.uef;
import com.bytedance.sdk.component.utils.gsd;
import com.bytedance.sdk.component.utils.pz;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ivm extends FrameLayout {
    private static moa sk;

    /* renamed from: ab, reason: collision with root package name */
    private uef.InterfaceC0059uef f24971ab;
    private lw af;
    private float bcc;
    private com.bytedance.sdk.component.cz.uef bs;
    private float cp;
    private boolean cq;
    private float cz;
    private boolean dhk;
    private long dj;
    private gsd dxx;
    private volatile WebView dz;
    private oa fz;
    private AtomicBoolean gb;
    private yo gr;
    private boolean gsd;
    private boolean gzw;
    private JSONObject ivm;
    private AtomicBoolean km;
    private int ku;
    private String lw;
    private AttributeSet lz;
    private com.bytedance.sdk.component.cz.oa.uef moa;

    /* renamed from: oa, reason: collision with root package name */
    public int f24972oa;
    private com.bytedance.sdk.component.cz.moa oib;
    private boolean orq;
    private Context oyt;
    private AtomicBoolean pu;
    private float pz;
    private long rl;
    private WebViewClient rt;
    private long swd;
    private List<String> sy;
    private boolean tpx;

    /* renamed from: ue, reason: collision with root package name */
    private float f24973ue;
    public int uef;
    private View wk;
    private long wrv;
    private boolean xs;
    public int yo;
    private long zjm;

    public interface lw {
    }

    public interface moa {
        WebView uef(Context context, AttributeSet attributeSet, int i5, yo yoVar);
    }

    public interface oa {
    }

    public static class uef extends WebViewClient {
        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(final WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            if (Build.VERSION.SDK_INT < 26) {
                return super.onRenderProcessGone(webView, renderProcessGoneDetail);
            }
            if (webView == null) {
                return true;
            }
            webView.post(new Runnable() { // from class: com.bytedance.sdk.component.cz.ivm.uef.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        ViewGroup viewGroup = (ViewGroup) webView.getParent();
                        if (viewGroup != null) {
                            viewGroup.removeView(webView);
                        }
                        webView.destroy();
                    } catch (Exception unused) {
                    }
                }
            });
            return true;
        }
    }

    public enum yo {
        ADS("ads"),
        ADS_V3("ads_v3"),
        ADS_V4("ads_v4"),
        ENDCARD("endcard"),
        USER_AGENT("ua"),
        PLAYABLE("playable"),
        DSP("dsp"),
        PRIVACY("privacy"),
        VAST_ENDCARD("vast_endcard"),
        EASY_PLAYABLE("easy_playable"),
        LANDING_PAGE("landing_page"),
        LANDING_PAGE_LOADING("lp_loading"),
        LANDING_PAGE_PRE_RENDER("lp_pre_render");

        public final String dz;

        yo(String str) {
            this.dz = str;
        }
    }

    public ivm(Context context, yo yoVar) {
        this(uef(context), false, yoVar);
    }

    private void dhk() {
        try {
            WebSettings settings = this.dz.getSettings();
            if (settings != null) {
                settings.setSavePassword(false);
            }
        } catch (Throwable unused) {
        }
    }

    private void oib() {
        if (this.dz == null) {
            return;
        }
        try {
            this.dz.removeJavascriptInterface("searchBoxJavaBridge_");
            this.dz.removeJavascriptInterface("accessibility");
            this.dz.removeJavascriptInterface("accessibilityTraversal");
        } catch (Throwable unused) {
        }
    }

    public static void setDataDirectorySuffix(String str) {
        if (Build.VERSION.SDK_INT >= 28) {
            WebView.setDataDirectorySuffix(str);
        }
    }

    public static void setWebViewProvider(moa moaVar) {
        sk = moaVar;
    }

    private void tpx() {
        if (this.dxx == null) {
            this.gb.set(false);
            this.dxx = new gsd(getContext());
        }
        new Object() { // from class: com.bytedance.sdk.component.cz.ivm.1
        };
        this.gb.set(true);
    }

    private static Context uef(Context context) {
        return context;
    }

    private static void yo(Context context) {
    }

    public void a_(String str) {
        try {
            setJavaScriptEnabled(str);
            this.dz.loadUrl(str);
        } catch (Throwable unused) {
        }
    }

    public void ab() {
        if (this.dz == null) {
            return;
        }
        yo yoVar = this.gr;
        if (yoVar != yo.ADS && yoVar != yo.ADS_V3 && yoVar != yo.ADS_V4) {
            pz.uef(this);
        } else {
            try {
                this.dz.destroy();
            } catch (Throwable unused) {
            }
        }
    }

    public void b_(String str) {
        try {
            this.dz.removeJavascriptInterface(str);
        } catch (Throwable unused) {
        }
    }

    public void bcc() {
        try {
            this.dz.reload();
        } catch (Throwable unused) {
        }
    }

    public void bs() {
        try {
            this.dz.clearView();
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.dz == null) {
            return;
        }
        try {
            this.dz.computeScroll();
        } catch (Throwable unused) {
        }
    }

    public void cq() {
        if (this.dz != null) {
            this.dz.onResume();
        }
    }

    public boolean cz() {
        if (this.dz == null) {
            return false;
        }
        try {
            return this.dz.canGoBack();
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        try {
            return super.dispatchTouchEvent(motionEvent);
        } catch (Exception unused) {
            return false;
        }
    }

    public boolean dj() {
        if (this.dz == null) {
            return false;
        }
        try {
            return this.dz.canGoForward();
        } catch (Throwable unused) {
            return false;
        }
    }

    public void dz() {
        try {
            this.dz.clearHistory();
        } catch (Throwable unused) {
        }
    }

    public View getArbitrageLoadingView() {
        return this.wk;
    }

    public int getContentHeight() {
        if (this.dz == null) {
            return 0;
        }
        try {
            return this.dz.getContentHeight();
        } catch (Throwable unused) {
            return 1;
        }
    }

    public long getLandingPageClickBegin() {
        return this.rl;
    }

    public long getLandingPageClickEnd() {
        return this.swd;
    }

    public com.bytedance.sdk.component.cz.oa.uef getMaterialMeta() {
        return this.moa;
    }

    public String getOriginalUrl() {
        String url;
        if (this.dz == null) {
            return null;
        }
        try {
            String originalUrl = this.dz.getOriginalUrl();
            if (originalUrl != null && originalUrl.startsWith("data:text/html") && (url = this.dz.getUrl()) != null) {
                if (url.startsWith("file://")) {
                    return url;
                }
            }
            return originalUrl;
        } catch (Throwable unused) {
            return null;
        }
    }

    public int getProgress() {
        if (this.dz == null) {
            return 0;
        }
        try {
            return this.dz.getProgress();
        } catch (Throwable unused) {
            return 100;
        }
    }

    public yo getScene() {
        return this.gr;
    }

    public String getUrl() {
        if (this.dz == null) {
            return null;
        }
        try {
            return this.dz.getUrl();
        } catch (Throwable unused) {
            return null;
        }
    }

    public String getUserAgentString() {
        if (this.dz == null) {
            return "";
        }
        try {
            return this.dz.getSettings().getUserAgentString();
        } catch (Throwable unused) {
            return "";
        }
    }

    public WebView getWebView() {
        return this.dz;
    }

    public WebViewClient getWebViewClient() {
        return this.rt;
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return false;
    }

    public void ivm() {
        if (this.dz != null) {
            removeAllViews();
            setBackground(null);
            try {
                this.dz.setId(520093704);
            } catch (Throwable unused) {
            }
            addView(this.dz, new FrameLayout.LayoutParams(-1, -1));
        }
    }

    public boolean l_() {
        return this.dhk;
    }

    public void lw() {
        try {
            if (this.dz == null) {
                this.dz = uef(this.lz, 0);
            }
            ivm();
            oa(uef(this.oyt));
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public boolean moa() {
        return this.gzw;
    }

    public boolean oa() {
        return this.tpx;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.km.set(true);
        if (!this.pu.get() || this.gb.get()) {
            return;
        }
        tpx();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.km.set(false);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ViewParent viewParentUef;
        try {
            uef(motionEvent);
            boolean zOnInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
            if ((motionEvent.getActionMasked() == 2 || motionEvent.getActionMasked() == 0) && this.cq && (viewParentUef = uef(this)) != null) {
                viewParentUef.requestDisallowInterceptTouchEvent(true);
            }
            return zOnInterceptTouchEvent;
        } catch (Throwable unused) {
            return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z2) {
    }

    @Override // android.view.ViewGroup
    public void removeAllViews() {
        try {
            this.dz.removeAllViews();
        } catch (Throwable unused) {
        }
    }

    public void setAllowFileAccess(boolean z2) {
        try {
            this.dz.getSettings().setAllowFileAccess(z2);
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.View
    public void setAlpha(float f10) {
        try {
            super.setAlpha(f10);
            this.dz.setAlpha(f10);
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i5) {
        try {
            this.dz.setBackgroundColor(i5);
        } catch (Throwable unused) {
        }
    }

    public void setBuiltInZoomControls(boolean z2) {
        try {
            this.dz.getSettings().setBuiltInZoomControls(z2);
        } catch (Throwable unused) {
        }
    }

    public void setCacheMode(int i5) {
        try {
            this.dz.getSettings().setCacheMode(i5);
        } catch (Throwable unused) {
        }
    }

    public void setCalculationMethod(int i5) {
        this.ku = i5;
    }

    public void setDatabaseEnabled(boolean z2) {
        try {
            this.dz.getSettings().setDatabaseEnabled(z2);
        } catch (Throwable unused) {
        }
    }

    public void setDeepShakeValue(float f10) {
        this.pz = f10;
    }

    public void setDefaultFontSize(int i5) {
        try {
            this.dz.getSettings().setDefaultFontSize(i5);
        } catch (Throwable unused) {
        }
    }

    public void setDefaultTextEncodingName(String str) {
        try {
            this.dz.getSettings().setDefaultTextEncodingName(str);
        } catch (Throwable unused) {
        }
    }

    public void setDisplayZoomControls(boolean z2) {
        try {
            this.dz.getSettings().setDisplayZoomControls(z2);
        } catch (Throwable unused) {
        }
    }

    public void setDomStorageEnabled(boolean z2) {
        try {
            this.dz.getSettings().setDomStorageEnabled(z2);
        } catch (Throwable unused) {
        }
    }

    public void setDownloadListener(DownloadListener downloadListener) {
        try {
            this.dz.setDownloadListener(downloadListener);
        } catch (Throwable unused) {
        }
    }

    public void setIsPreventTouchEvent(boolean z2) {
        this.cq = z2;
    }

    public void setJavaScriptCanOpenWindowsAutomatically(boolean z2) {
        try {
            this.dz.getSettings().setJavaScriptCanOpenWindowsAutomatically(z2);
        } catch (Throwable unused) {
        }
    }

    public void setJavaScriptEnabled(boolean z2) {
        try {
            this.dz.getSettings().setJavaScriptEnabled(z2);
        } catch (Throwable unused) {
        }
    }

    public void setLandingPage(boolean z2) {
        this.xs = z2;
    }

    public void setLandingPageClickBegin(long j8) {
        this.rl = j8;
    }

    public void setLandingPageClickEnd(long j8) {
        this.swd = j8;
    }

    @Override // android.view.View
    public void setLayerType(int i5, Paint paint) {
        try {
            if (this.dz != null) {
                this.dz.setLayerType(i5, paint);
            }
        } catch (Throwable unused) {
        }
    }

    public void setLayoutAlgorithm(WebSettings.LayoutAlgorithm layoutAlgorithm) {
        try {
            this.dz.getSettings().setLayoutAlgorithm(layoutAlgorithm);
        } catch (Throwable unused) {
        }
    }

    public void setLoadWithOverviewMode(boolean z2) {
        try {
            this.dz.getSettings().setLoadWithOverviewMode(z2);
        } catch (Throwable unused) {
        }
    }

    public void setLpPreRender(boolean z2) {
        this.dhk = z2;
    }

    public void setMaterialMeta(com.bytedance.sdk.component.cz.oa.uef uefVar) {
        this.moa = uefVar;
    }

    public void setMixedContentMode(int i5) {
        try {
            this.dz.getSettings().setMixedContentMode(i5);
        } catch (Throwable unused) {
        }
    }

    public void setNetworkAvailable(boolean z2) {
        try {
            this.dz.setNetworkAvailable(z2);
        } catch (Throwable unused) {
        }
    }

    public void setOnShakeListener(oa oaVar) {
        this.fz = oaVar;
    }

    @Override // android.view.View
    public void setOverScrollMode(int i5) {
        try {
            if (this.dz != null) {
                this.dz.setOverScrollMode(i5);
            }
            super.setOverScrollMode(i5);
        } catch (Throwable unused) {
        }
    }

    public void setPreError(boolean z2) {
        this.gsd = z2;
    }

    public void setPreFinish(boolean z2) {
        this.orq = z2;
    }

    public void setPreProgressHundred(boolean z2) {
        this.gzw = z2;
    }

    public void setPreStart(boolean z2) {
        this.tpx = z2;
    }

    public void setRecycler(boolean z2) {
        if (this.dz == null || !(this.dz instanceof com.bytedance.sdk.component.cz.lw)) {
            return;
        }
        ((com.bytedance.sdk.component.cz.lw) this.dz).setRecycler(z2);
    }

    public void setShakeValue(float f10) {
        this.f24973ue = f10;
    }

    public void setSupportZoom(boolean z2) {
        try {
            this.dz.getSettings().setSupportZoom(z2);
        } catch (Throwable unused) {
        }
    }

    public void setTag(String str) {
        this.lw = str;
        com.bytedance.sdk.component.cz.uef uefVar = this.bs;
        if (uefVar != null) {
            uefVar.uef(str);
        }
        com.bytedance.sdk.component.cz.moa moaVar = this.oib;
        if (moaVar != null) {
            moaVar.uef(str);
        }
    }

    public void setTouchStateListener(lw lwVar) {
        this.af = lwVar;
    }

    public void setUseWideViewPort(boolean z2) {
        try {
            this.dz.getSettings().setUseWideViewPort(z2);
        } catch (Throwable unused) {
        }
    }

    public void setUserAgentString(String str) {
        try {
            this.dz.getSettings().setUserAgentString(str);
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.View
    public void setVisibility(int i5) {
        try {
            super.setVisibility(i5);
            if (this.dz != null) {
                this.dz.setVisibility(i5);
            }
        } catch (Throwable unused) {
        }
    }

    public void setWebChromeClient(WebChromeClient webChromeClient) {
        try {
            this.dz.setWebChromeClient(webChromeClient);
        } catch (Throwable unused) {
        }
    }

    public void setWebView(WebView webView) {
        this.dz = webView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setWebViewClient(WebViewClient webViewClient) {
        try {
            if (webViewClient instanceof lw) {
                setTouchStateListener((lw) webViewClient);
            } else {
                setTouchStateListener(null);
            }
            if (webViewClient == 0) {
                webViewClient = new uef();
            }
            this.rt = webViewClient;
            this.dz.setWebViewClient(new xs(this.f24971ab, webViewClient, this.sy));
        } catch (Throwable unused) {
        }
    }

    public void setWriggleValue(float f10) {
        this.cp = f10;
    }

    public void sy() {
        try {
            this.dz.pauseTimers();
        } catch (Throwable unused) {
        }
    }

    public void wk() {
        if (this.dz == null) {
            return;
        }
        try {
            this.dz.onPause();
        } catch (Throwable unused) {
        }
    }

    public void wrv() {
        try {
            this.dz.goForward();
        } catch (Throwable unused) {
        }
    }

    public void xs() {
        try {
            this.dz.stopLoading();
        } catch (Throwable unused) {
        }
    }

    public void zjm() {
        try {
            this.dz.goBack();
        } catch (Throwable unused) {
        }
    }

    public ivm(Context context, boolean z2, yo yoVar) {
        super(uef(context));
        this.bcc = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.cz = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.zjm = 0L;
        this.dj = 0L;
        this.wrv = 0L;
        this.cq = false;
        this.f24973ue = 20.0f;
        this.cp = 50.0f;
        this.km = new AtomicBoolean();
        this.pu = new AtomicBoolean();
        this.gb = new AtomicBoolean();
        this.oyt = context;
        this.gr = yoVar;
        if (z2) {
            return;
        }
        try {
            this.dz = uef((AttributeSet) null, 0);
            ivm();
        } catch (Throwable unused) {
        }
        oa(uef(context));
    }

    private void oa(Context context) {
        yo(context);
        dhk();
        oib();
    }

    private void setJavaScriptEnabled(String str) {
        WebSettings settings;
        try {
            if (!TextUtils.isEmpty(str) && (settings = this.dz.getSettings()) != null) {
                if (Uri.parse(str).getScheme().equalsIgnoreCase("file")) {
                    settings.setJavaScriptEnabled(false);
                } else {
                    settings.setJavaScriptEnabled(true);
                }
            }
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.View
    public String getTag() {
        return this.lw;
    }

    public void uef(boolean z2, int i5, int i10, List<Integer> list, int i11, List<String> list2) {
        if (z2 && this.dz != null && (this.dz instanceof com.bytedance.sdk.component.cz.lw)) {
            this.bs = new com.bytedance.sdk.component.cz.uef(this.oyt, i5, i10, list, i11);
            this.sy = list2;
            if (!TextUtils.isEmpty(this.lw)) {
                this.bs.uef(this.lw);
            }
            ((com.bytedance.sdk.component.cz.lw) this.dz).setTouchListenerProxy(this.bs);
            this.f24971ab = this.bs.uef();
        }
    }

    public boolean yo() {
        return this.orq;
    }

    private static boolean yo(View view) {
        try {
            Class<?> clsLoadClass = view.getClass().getClassLoader().loadClass("android.support.v4.view.ScrollingView");
            if (clsLoadClass != null) {
                if (clsLoadClass.isInstance(view)) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        try {
            Class<?> clsLoadClass2 = view.getClass().getClassLoader().loadClass("androidx.core.view.ScrollingView");
            if (clsLoadClass2 != null) {
                return clsLoadClass2.isInstance(view);
            }
            return false;
        } catch (Throwable unused2) {
            return false;
        }
    }

    private static boolean oa(View view) {
        try {
            Class<?> clsLoadClass = view.getClass().getClassLoader().loadClass("android.support.v4.view.ViewPager");
            if (clsLoadClass != null) {
                if (clsLoadClass.isInstance(view)) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        try {
            Class<?> clsLoadClass2 = view.getClass().getClassLoader().loadClass("androidx.viewpager.widget.ViewPager");
            if (clsLoadClass2 != null) {
                return clsLoadClass2.isInstance(view);
            }
            return false;
        } catch (Throwable unused2) {
            return false;
        }
    }

    public void uef(int i5, long j8) {
        if (this.dz == null || !(this.dz instanceof com.bytedance.sdk.component.cz.lw)) {
            return;
        }
        this.oib = new com.bytedance.sdk.component.cz.moa(this.oyt, this.bs, i5, j8, this);
        if (!TextUtils.isEmpty(this.lw)) {
            this.oib.uef(this.lw);
        }
        ((com.bytedance.sdk.component.cz.lw) this.dz).setTouchListenerProxy(this.oib);
    }

    public void uef(boolean z2, View view) {
        if (z2) {
            this.wk = view;
            view.setVisibility(8);
            View view2 = this.wk;
            if (view2 == null || view2.getParent() != null) {
                return;
            }
            addView(this.wk, new FrameLayout.LayoutParams(-1, -1));
        }
    }

    private WebView uef(AttributeSet attributeSet, int i5) {
        moa moaVar = sk;
        if (moaVar != null) {
            return moaVar.uef(getContext(), attributeSet, i5, this.gr);
        }
        if (attributeSet == null) {
            return new WebView(uef(this.oyt));
        }
        return new WebView(uef(this.oyt), attributeSet);
    }

    public void uef(String str, Map<String, String> map) {
        try {
            setJavaScriptEnabled(str);
            this.dz.loadUrl(str, map);
        } catch (Throwable unused) {
        }
    }

    public void uef(String str, String str2, String str3, String str4, String str5) {
        try {
            setJavaScriptEnabled(str);
            this.dz.loadDataWithBaseURL(str, str2, str3, str4, str5);
        } catch (Throwable unused) {
        }
    }

    public void uef(boolean z2) {
        try {
            this.dz.clearCache(z2);
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ViewParent uef(View view) {
        ViewParent parent = view.getParent();
        if ((parent instanceof AbsListView) || (parent instanceof ScrollView) || (parent instanceof HorizontalScrollView) || !(parent instanceof View)) {
            return parent;
        }
        View view2 = (View) parent;
        return (oa(view2) || yo(view2)) ? parent : uef(view2);
    }

    public void uef(Object obj, String str) {
        try {
            this.dz.addJavascriptInterface(obj, str);
        } catch (Throwable unused) {
        }
    }

    private void uef(MotionEvent motionEvent) {
        if (!this.xs || this.moa == null) {
            return;
        }
        if ((this.lw == null && this.ivm == null) || motionEvent == null) {
            return;
        }
        try {
            int action = motionEvent.getAction();
            if (action == 0) {
                this.bcc = motionEvent.getRawX();
                this.cz = motionEvent.getRawY();
                this.zjm = System.currentTimeMillis();
                this.ivm = new JSONObject();
                if (this.dz != null) {
                    this.rl = this.zjm;
                    return;
                }
                return;
            }
            if (action == 1 || action == 3) {
                this.ivm.put("start_x", String.valueOf(this.bcc));
                this.ivm.put("start_y", String.valueOf(this.cz));
                this.ivm.put("offset_x", String.valueOf(motionEvent.getRawX() - this.bcc));
                this.ivm.put("offset_y", String.valueOf(motionEvent.getRawY() - this.cz));
                this.ivm.put("url", String.valueOf(getUrl()));
                this.ivm.put("tag", "");
                this.dj = System.currentTimeMillis();
                if (this.dz != null) {
                    this.swd = this.dj;
                }
                this.ivm.put("down_time", this.zjm);
                this.ivm.put("up_time", this.dj);
                if (com.bytedance.sdk.component.cz.uef.uef.uef().oa() != null) {
                    long j8 = this.wrv;
                    long j10 = this.zjm;
                    if (j8 != j10) {
                        this.wrv = j10;
                        com.bytedance.sdk.component.cz.uef.uef.uef().oa().uef(this.moa, this.lw, "in_web_click", this.ivm, this.dj - this.zjm);
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }
}
