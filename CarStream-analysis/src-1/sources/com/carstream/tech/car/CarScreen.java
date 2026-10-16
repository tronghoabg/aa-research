package com.carstream.tech.car;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.speech.SpeechRecognizer;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.car.app.CarContext;
import androidx.core.view.GravityCompat;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.carstream.tech.R;
import com.carstream.tech.car.ui.CarEditText;
import com.carstream.tech.core.speed.SpeedBubble;
import com.carstream.tech.core.ui.SplashView;
import com.carstream.tech.core.web.BackgroundWebView;
import com.carstream.tech.core.web.KeepAliveFrame;
import com.carstream.tech.launcher.LuoiApp;
import com.carstream.tech.launcher.Ui;
import com.carstream.tech.media.ControllerService;
import com.carstream.tech.media.PlaybackService;
import com.google.android.gms.car.CarNavigationStatusManager;
import com.google.android.gms.car.input.InputManager;
import defpackage.a6;
import defpackage.a8;
import defpackage.ab;
import defpackage.ad;
import defpackage.b8;
import defpackage.c1;
import defpackage.c5;
import defpackage.c8;
import defpackage.cb;
import defpackage.cd;
import defpackage.d8;
import defpackage.dd;
import defpackage.e0;
import defpackage.ec;
import defpackage.f1;
import defpackage.f7;
import defpackage.fa;
import defpackage.fb;
import defpackage.fd;
import defpackage.g6;
import defpackage.h2;
import defpackage.j1;
import defpackage.j2;
import defpackage.k1;
import defpackage.l0;
import defpackage.l3;
import defpackage.l7;
import defpackage.m1;
import defpackage.n4;
import defpackage.p9;
import defpackage.q4;
import defpackage.r1;
import defpackage.r6;
import defpackage.rc;
import defpackage.s2;
import defpackage.sb;
import defpackage.t0;
import defpackage.t3;
import defpackage.t7;
import defpackage.t9;
import defpackage.u1;
import defpackage.u2;
import defpackage.u5;
import defpackage.u6;
import defpackage.u9;
import defpackage.v2;
import defpackage.v9;
import defpackage.vb;
import defpackage.w0;
import defpackage.w1;
import defpackage.w5;
import defpackage.w6;
import defpackage.w7;
import defpackage.w9;
import defpackage.wc;
import defpackage.x0;
import defpackage.x4;
import defpackage.x5;
import defpackage.xc;
import defpackage.y;
import defpackage.y1;
import defpackage.y4;
import defpackage.y6;
import defpackage.z;
import defpackage.z4;
import defpackage.z6;
import defpackage.z7;
import defpackage.za;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public class CarScreen extends CarActivityBase {
    private static final int APP_BAR_DP = 84;
    private static final long COI_NHU_HET_MS = 5000;
    private static final String DATA_SAVER_JS = "(function(){if(window.__cntSaverLoop){return;}window.__cntSaverLoop=setInterval(function(){  if(!window.__cntDataSaver){return;}  var p=document.getElementById('movie_player');  if(!p||typeof p.getPlaybackQuality!=='function'){return;}  try{    if(p.getPlaybackQuality()==='tiny'){return;}    if(typeof p.setPlaybackQualityRange==='function'){      p.setPlaybackQualityRange('tiny','tiny');}    if(typeof p.setPlaybackQuality==='function'){p.setPlaybackQuality('tiny');}    if(window.CntBridge&&window.CntBridge.webLog){      window.CntBridge.webLog('TIET KIEM: ep ve 144p');}  }catch(e){}},3000);})();";
    private static final boolean DEBUG = false;
    private static final long HOME_TICK_MS = 1000;
    private static final long LICENSE_TICK_MS = 60000;
    private static final String TAG = "CNMedia";
    private static final int TOOLBAR_BTN_DP = 38;
    static final String TRANG_NHA = "file:///android_asset/";
    private static final String VIDEO_FIT_JS = "(function(){var SID='__cnt_fit_style';if(!window.__cntApplyFit){window.__cntApplyFit=function(){var s=document.getElementById(SID),on=window.__cntVideoFit==='cover';if(on&&!s){s=document.createElement('style');s.id=SID;(document.head||document.documentElement).appendChild(s);s.textContent=':fullscreen video,video:fullscreen,:-webkit-full-screen video,video:-webkit-full-screen{position:fixed!important;top:0!important;left:0!important;width:100vw!important;height:100vh!important;object-fit:cover!important;}';}else if(!on&&s){s.parentNode.removeChild(s);}};}if(!window.__cntFitTimer){window.__cntFitTimer=setInterval(window.__cntApplyFit,2000);}window.__cntApplyFit();})();";
    private static final int WEB_LOG_CHARS = 300;
    private static final int WEB_LOG_PER_SEC = 20;
    private CarEditText addressBox;
    c autoOpen;
    private View backBtn;
    private boolean barTicking;
    private BackgroundWebView bgWeb;
    r1 callBar;
    j2 carHud;
    private boolean codecApplied;
    private View contentColumn;
    l3 controlBar;
    dd currentApp;
    private boolean dangPhatKhiRoiDi;
    private boolean dangQuetMedia;
    private String defaultUa;
    private View forwardBtn;
    boolean fullSurface;
    private WebChromeClient.CustomViewCallback fullscreenCallback;
    private KeepAliveFrame fullscreenHolder;
    private View fullscreenView;
    q4 games;
    boolean gamesShowing;
    private z4 home;
    private boolean homeShowing;
    boolean keepAliveWanted;
    u keeper;
    x5 launcher;
    boolean locked;
    private long lucQuetMediaXong;
    private a8 nutTim;
    boolean onDevice;
    boolean onScreen;
    boolean pageControlsShown;
    boolean pageOverlayShown;
    boolean pendingCommandedOpen;
    private View placeholder;
    private a rail;
    private boolean resumed;
    private FrameLayout rootLayout;
    t9 searchBar;
    private View searchOverlayView;
    fa settingsPanel;
    private boolean settingsShowing;
    c8 sheet;
    za speedOverlay;
    private boolean splashShowing;
    private boolean started;
    private View toolbar;
    private ImageView uaBtn;
    WebView web;
    private LinearLayout webColumn;
    private fd webInput;
    private boolean webLogDropped;
    private int webLogInWindow;
    private long webLogWindowAt;
    private boolean launcherShowing = false;
    private boolean controlsRevealed = true;
    private final Runnable hideControls = new f(this, 2);
    private String lastScript = "";
    final Handler debounce = new Handler(Looper.getMainLooper());
    final u6 carHooks = new e(this, 5);
    final y6 webPlayer = new e(this, 8);
    private final Map<Integer, String> rawCache = new HashMap();
    private final Runnable licenseTicker = new f(this, 0);
    private final w5 launcherActions = new e0();
    private final n4 gameActions = new s2(this);
    private final x4 homeActions = new s2(this);
    private final Runnable homeTicker = new f(this, 3);
    private final Runnable barTicker = new f(this, 4);
    private final x0 railActions = new s2(this);
    private int lastCardLimit = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
    private final d keys = new d(this);

    /* JADX INFO: Access modifiers changed from: private */
    public void afterCommandedOpen(String str) {
        if (this.pendingCommandedOpen) {
            this.pendingCommandedOpen = false;
            if (this.autoOpen.e(str)) {
                this.debounce.postDelayed(new f(this, 5), 900L);
            }
        }
    }

    private boolean allowAutoFullscreen(boolean z) {
        dd ddVar;
        return z && (ddVar = this.currentApp) != null && ddVar.h && getApplicationContext().getSharedPreferences("CanhNhatTube", 0).getBoolean(xc.h("autoFullscreen"), true);
    }

    private void applyDataSaver(WebView webView) {
        if (webView == null) {
            return;
        }
        webView.evaluateJavascript("window.__cntDataSaver=" + (getApplicationContext().getSharedPreferences("CanhNhatTube", 0).getBoolean(xc.h("ytDataSaver"), false) ? "true" : "false") + ";(function(){if(window.__cntSaverLoop){return;}window.__cntSaverLoop=setInterval(function(){  if(!window.__cntDataSaver){return;}  var p=document.getElementById('movie_player');  if(!p||typeof p.getPlaybackQuality!=='function'){return;}  try{    if(p.getPlaybackQuality()==='tiny'){return;}    if(typeof p.setPlaybackQualityRange==='function'){      p.setPlaybackQualityRange('tiny','tiny');}    if(typeof p.setPlaybackQuality==='function'){p.setPlaybackQuality('tiny');}    if(window.CntBridge&&window.CntBridge.webLog){      window.CntBridge.webLog('TIET KIEM: ep ve 144p');}  }catch(e){}},3000);})();", null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void applyRail() {
        dd ddVar;
        if (this.rail == null || this.splashShowing) {
            return;
        }
        boolean zIsFullscreen = isFullscreen();
        if (zIsFullscreen) {
            a aVar = this.rail;
            LinearLayout linearLayout = aVar.c;
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
                aVar.d.setVisibility(8);
                aVar.e.setVisibility(8);
            }
        } else {
            this.rail.i();
        }
        int iG = zIsFullscreen ? 0 : this.rail.g();
        this.contentColumn.setPadding(iG, 0, 0, 0);
        fa faVar = this.settingsPanel;
        if (faVar != null && this.settingsShowing) {
            View viewL = faVar.l();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewL.getLayoutParams();
            if (layoutParams.leftMargin != iG) {
                layoutParams.leftMargin = iG;
                viewL.setLayoutParams(layoutParams);
            }
        }
        l3 l3Var = this.controlBar;
        View view = l3Var == null ? null : l3Var.c;
        if (view != null && (ddVar = this.currentApp) != null && ddVar.i.b == 1 && (view.getLayoutParams() instanceof FrameLayout.LayoutParams)) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) view.getLayoutParams();
            int i = (iG / 2) + this.controlBar.b(this.currentApp.i).leftMargin;
            if (layoutParams2.leftMargin != i) {
                layoutParams2.leftMargin = i;
                view.setLayoutParams(layoutParams2);
            }
        }
        r1 r1Var = this.callBar;
        if (r1Var != null) {
            r1Var.a(iG);
        }
        if (zIsFullscreen) {
            return;
        }
        syncRailSelection();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void applyUserAgent(defpackage.dd r5) {
        /*
            r4 = this;
            android.webkit.WebView r0 = r4.web
            if (r0 != 0) goto L6
            goto L9b
        L6:
            android.webkit.WebSettings r0 = r0.getSettings()
            java.lang.String r1 = r4.defaultUa
            if (r1 != 0) goto L14
            java.lang.String r1 = r0.getUserAgentString()
            r4.defaultUa = r1
        L14:
            if (r5 == 0) goto L7f
            java.lang.String r1 = "web"
            java.lang.String r2 = r5.a
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L7f
            boolean r5 = r4.laMayTinh()
            if (r5 == 0) goto L7c
            java.lang.String r5 = r4.defaultUa
            r1 = 1
            if (r5 != 0) goto L2c
            goto L41
        L2c:
            java.lang.String r2 = "AppleWebKit/([0-9.]+)"
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2)
            java.util.regex.Matcher r2 = r2.matcher(r5)
            boolean r3 = r2.find()
            if (r3 == 0) goto L41
            java.lang.String r2 = r2.group(r1)
            goto L43
        L41:
            java.lang.String r2 = "537.36"
        L43:
            if (r5 != 0) goto L46
            goto L5b
        L46:
            java.lang.String r3 = "Chrome/([0-9.]+)"
            java.util.regex.Pattern r3 = java.util.regex.Pattern.compile(r3)
            java.util.regex.Matcher r5 = r3.matcher(r5)
            boolean r3 = r5.find()
            if (r3 == 0) goto L5b
            java.lang.String r5 = r5.group(r1)
            goto L5d
        L5b:
            java.lang.String r5 = "151.0.0.0"
        L5d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/"
            r1.<init>(r3)
            r1.append(r2)
            java.lang.String r3 = " (KHTML, like Gecko) Chrome/"
            r1.append(r3)
            r1.append(r5)
            java.lang.String r5 = " Safari/"
            r1.append(r5)
            r1.append(r2)
            java.lang.String r5 = r1.toString()
            goto L8e
        L7c:
            java.lang.String r5 = r4.defaultUa
            goto L8e
        L7f:
            if (r5 == 0) goto L8c
            boolean r5 = r5.g
            if (r5 == 0) goto L8c
            java.lang.String r5 = r4.defaultUa
            java.lang.String r5 = defpackage.w1.i(r5)
            goto L8e
        L8c:
            java.lang.String r5 = r4.defaultUa
        L8e:
            java.lang.String r1 = r0.getUserAgentString()
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto L9b
            r0.setUserAgentString(r5)
        L9b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carstream.tech.car.CarScreen.applyUserAgent(dd):void");
    }

    private void applyVideoFit(WebView webView) {
        if (webView == null) {
            return;
        }
        webView.evaluateJavascript("window.__cntVideoFit='" + (getApplicationContext().getSharedPreferences("CanhNhatTube", 0).getBoolean(xc.h("videoCrop"), false) ? "cover" : "contain") + "';", null);
        webView.evaluateJavascript(VIDEO_FIT_JS, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void baoTrangTuVePhim() {
        a aVar = this.rail;
        js("if(window.__cntWebPhim){window.__cntWebPhim(true," + (aVar != null ? aVar.g() : 0) + ");}");
    }

    private LinearLayout.LayoutParams barItem(int i, int i2) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i, i);
        layoutParams.leftMargin = i2;
        return layoutParams;
    }

    private static String baseDomain(String str) {
        String[] strArrSplit = str.split("\\.");
        if (strArrSplit.length < 2) {
            return str;
        }
        return strArrSplit[strArrSplit.length - 2] + "." + strArrSplit[strArrSplit.length - 1];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void buildEverything() {
        int i;
        int iB = d8.b(700);
        k1.s(getApplicationContext());
        k1.i(this);
        who();
        Context applicationContext = getApplicationContext();
        String str = a6.a;
        int i2 = 5;
        if (ec.j(applicationContext)) {
            a6.a(applicationContext, new c1(applicationContext, i2));
        }
        this.searchBar = new t9(new e(this, 6), this.debounce);
        s2 s2Var = new s2(this);
        Handler handler = this.debounce;
        this.autoOpen = new c(s2Var, handler);
        this.keeper = new u(new s2(this), handler);
        k kVar = new k(this, this);
        kVar.setBackgroundColor(d8.e());
        kVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(1);
        View viewBuildToolbar = buildToolbar();
        this.toolbar = viewBuildToolbar;
        linearLayout.addView(viewBuildToolbar);
        int iG = 0;
        linearLayout.addView(buildWebView(), new LinearLayout.LayoutParams(-1, 0, 1.0f));
        this.webColumn = linearLayout;
        z4 z4Var = new z4(this, this.homeActions);
        this.home = z4Var;
        if (z4Var.c == null) {
            LinearLayout linearLayout2 = new LinearLayout(this);
            linearLayout2.setOrientation(1);
            linearLayout2.setBackgroundColor(d8.e());
            linearLayout2.setPadding(d8.g(this, 40), d8.g(this, 22), d8.g(this, 44), 0);
            LinearLayout linearLayout3 = new LinearLayout(this);
            linearLayout3.setOrientation(1);
            LinearLayout linearLayout4 = new LinearLayout(this);
            linearLayout4.setOrientation(1);
            TextView textView = new TextView(this);
            int i3 = Calendar.getInstance().get(11);
            textView.setText(i3 < 11 ? "Chào buổi sáng" : i3 < 14 ? "Chào buổi trưa" : i3 < 18 ? "Chào buổi chiều" : "Chào buổi tối");
            textView.setTypeface(d8.i(this));
            textView.setTextSize(0, d8.m(this, 28.0f));
            textView.setTextColor(d8.o());
            textView.setIncludeFontPadding(false);
            linearLayout4.addView(textView);
            linearLayout3.addView(linearLayout4);
            linearLayout3.addView(z4Var.a("XEM TIẾP"), z4.b(-1, -2, d8.g(this, 16), 0, d8.g(this, 12)));
            LinearLayout linearLayout5 = new LinearLayout(this);
            z4Var.d = linearLayout5;
            linearLayout5.setOrientation(0);
            HorizontalScrollView horizontalScrollView = new HorizontalScrollView(this);
            horizontalScrollView.setHorizontalScrollBarEnabled(false);
            horizontalScrollView.addView(z4Var.d, new FrameLayout.LayoutParams(-2, -2));
            linearLayout3.addView(horizontalScrollView, new LinearLayout.LayoutParams(-1, -2));
            linearLayout2.addView(linearLayout3, new LinearLayout.LayoutParams(-1, 0, 1.0f));
            LinearLayout linearLayout6 = new LinearLayout(this);
            linearLayout6.setOrientation(0);
            linearLayout6.setGravity(16);
            linearLayout6.setBackground(k1.t(d8.n(), d8.g(this, Ui.R_PILL)));
            linearLayout6.setPadding(d8.g(this, 12), d8.g(this, 10), d8.g(this, 14), d8.g(this, 10));
            ImageView imageView = new ImageView(this);
            z4Var.g = imageView;
            imageView.setBackground(k1.c(d8.j(400)));
            z4Var.g.setClipToOutline(true);
            z4Var.g.setScaleType(ImageView.ScaleType.CENTER_CROP);
            linearLayout6.addView(z4Var.g, new LinearLayout.LayoutParams(d8.g(this, 46), d8.g(this, 46)));
            LinearLayout linearLayout7 = new LinearLayout(this);
            linearLayout7.setOrientation(1);
            TextView textViewA = z4Var.a("ĐANG PHÁT NỀN");
            textViewA.setTextSize(0, d8.m(this, 13.0f));
            textViewA.setTextColor(iB);
            linearLayout7.addView(textViewA);
            TextView textView2 = new TextView(this);
            z4Var.e = textView2;
            textView2.setTypeface(d8.f(this, 1));
            z4Var.e.setTextSize(0, d8.m(this, 18.0f));
            z4Var.e.setTextColor(d8.o());
            z4Var.e.setText("Chưa phát gì");
            z4Var.e.setSingleLine(true);
            z4Var.e.setEllipsize(TextUtils.TruncateAt.END);
            linearLayout7.addView(z4Var.e);
            FrameLayout frameLayout = new FrameLayout(this);
            frameLayout.setBackground(k1.t(d8.j(WEB_LOG_CHARS), d8.g(this, Ui.R_PILL)));
            LinearLayout linearLayout8 = new LinearLayout(this);
            linearLayout8.setOrientation(0);
            View view = new View(this);
            z4Var.h = view;
            view.setBackground(k1.t(d8.a(), d8.g(this, Ui.R_PILL)));
            linearLayout8.addView(z4Var.h, new LinearLayout.LayoutParams(0, -1, 0.0f));
            View view2 = new View(this);
            z4Var.i = view2;
            linearLayout8.addView(view2, new LinearLayout.LayoutParams(0, -1, 100.0f));
            frameLayout.addView(linearLayout8, new FrameLayout.LayoutParams(-1, -1));
            linearLayout7.addView(frameLayout, z4.b(-1, d8.g(this, 5), d8.g(this, 8), 0, d8.g(this, 2)));
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2, 1.0f);
            layoutParams.leftMargin = d8.g(this, 14);
            linearLayout6.addView(linearLayout7, layoutParams);
            int iA = d8.a();
            int iK = d8.k();
            o oVar = new o(z4Var, iG);
            ImageView imageView2 = new ImageView(this);
            imageView2.setImageResource(R.drawable.ic_play);
            imageView2.setColorFilter(iK);
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView2.setScaleType(scaleType);
            k1.B(imageView2, iA, true, 0);
            imageView2.setOnClickListener(oVar);
            z4Var.f = imageView2;
            linearLayout6.addView(imageView2, new LinearLayout.LayoutParams(d8.g(this, 60), d8.g(this, 60)));
            int iE = d8.e();
            int iO = d8.o();
            o oVar2 = new o(z4Var, 1);
            ImageView imageView3 = new ImageView(this);
            imageView3.setImageResource(R.drawable.ic_skip_next);
            imageView3.setColorFilter(iO);
            imageView3.setScaleType(scaleType);
            k1.B(imageView3, iE, true, 0);
            imageView3.setOnClickListener(oVar2);
            linearLayout6.addView(imageView3, z4.b(d8.g(this, 60), d8.g(this, 60), 0, d8.g(this, 10), 0));
            i = -1;
            linearLayout2.addView(linearLayout6, z4.b(-1, -2, d8.g(this, 10), 0, d8.g(this, 16)));
            z4Var.c = linearLayout2;
        } else {
            i = -1;
        }
        this.placeholder = z4Var.c;
        FrameLayout frameLayout2 = new FrameLayout(this);
        frameLayout2.addView(linearLayout, new FrameLayout.LayoutParams(i, i));
        frameLayout2.addView(this.placeholder, new FrameLayout.LayoutParams(i, i));
        kVar.addView(frameLayout2, new FrameLayout.LayoutParams(i, i));
        this.rootLayout = kVar;
        this.contentColumn = frameLayout2;
        q4 q4Var = new q4(this, this.gameActions);
        this.games = q4Var;
        frameLayout2.addView(q4Var.f(), new FrameLayout.LayoutParams(i, i));
        this.games.f().setVisibility(8);
        x5 x5Var = new x5(this);
        this.launcher = x5Var;
        frameLayout2.addView(x5Var.c(), new FrameLayout.LayoutParams(i, i));
        this.launcher.c().setVisibility(8);
        a aVar = new a(this, this.railActions);
        this.rail = aVar;
        aVar.c = aVar.c();
        CarScreen carScreen = aVar.a;
        View view3 = new View(carScreen);
        aVar.d = view3;
        view3.setBackgroundColor(1495277085);
        aVar.d.setVisibility(8);
        aVar.d.setOnClickListener(new t0(aVar, 1));
        kVar.addView(aVar.d, new FrameLayout.LayoutParams(-1, -1));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(d8.h(carScreen, 90), -1);
        layoutParams2.gravity = GravityCompat.START;
        kVar.addView(aVar.c, layoutParams2);
        FrameLayout frameLayout3 = new FrameLayout(carScreen);
        GradientDrawable gradientDrawableT = k1.t(d8.a(), 0);
        float fH = d8.h(carScreen, Ui.R_PILL);
        gradientDrawableT.setCornerRadii(new float[]{0.0f, 0.0f, fH, fH, fH, fH, 0.0f, 0.0f});
        frameLayout3.setBackground(gradientDrawableT);
        frameLayout3.setElevation(d8.h(carScreen, 6));
        frameLayout3.setOnClickListener(new t0(aVar, iG));
        ImageView imageView4 = new ImageView(carScreen);
        imageView4.setImageResource(R.drawable.ic_nav_forward);
        imageView4.setColorFilter(d8.k());
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(d8.h(carScreen, 26), d8.h(carScreen, 26));
        layoutParams3.gravity = 17;
        frameLayout3.addView(imageView4, layoutParams3);
        aVar.e = frameLayout3;
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(d8.h(carScreen, 40), d8.h(carScreen, 120));
        layoutParams4.gravity = 8388627;
        kVar.addView(aVar.e, layoutParams4);
        aVar.i();
        applyRail();
        a8 a8Var = new a8(new e(this, 7));
        this.nutTim = a8Var;
        ImageView imageViewM = k1.m(this, R.drawable.ic_search, new t3(a8Var, 1));
        a8Var.b = imageViewM;
        k1.B(imageViewM, d8.a(), true, 0);
        a8Var.b.setElevation(k1.g(this, 6.0f));
        View view4 = a8Var.b;
        int iG2 = k1.g(this, 68.0f);
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(iG2, iG2);
        layoutParams5.gravity = 8388693;
        int iG3 = k1.g(this, 20.0f);
        layoutParams5.setMarginEnd(iG3);
        layoutParams5.bottomMargin = iG3;
        kVar.addView(view4, layoutParams5);
        a8Var.b.setOnTouchListener(new z7(a8Var, this.rootLayout, ViewConfiguration.get(this).getScaledTouchSlop(), this));
        FrameLayout frameLayout4 = this.rootLayout;
        ImageView imageView5 = a8Var.b;
        if (imageView5 != null && frameLayout4 != null) {
            imageView5.post(new defpackage.h(11, a8Var, frameLayout4));
        }
        kVar.addOnLayoutChangeListener(new y1(this, 1));
        l3 l3Var = new l3(this, new e(this, iG));
        this.controlBar = l3Var;
        cd cdVar = cd.f;
        kVar.addView(l3Var.a(cdVar), this.controlBar.b(cdVar));
        syncControlBar(null);
        t9 t9Var = this.searchBar;
        CarScreen carScreen2 = t9Var.b.b;
        w9 w9Var = new w9(carScreen2, t9Var.h);
        t9Var.e = w9Var;
        if (w9Var.c == null) {
            w9Var.f = carScreen2.getResources().getDisplayMetrics().widthPixels;
            FrameLayout frameLayout5 = new FrameLayout(carScreen2);
            frameLayout5.setBackgroundColor(-1725948387);
            frameLayout5.setClickable(true);
            frameLayout5.setOnClickListener(new u9(w9Var, iG));
            LinearLayout linearLayout9 = new LinearLayout(carScreen2);
            w9Var.d = linearLayout9;
            linearLayout9.setOrientation(1);
            w9Var.d.setBackground(w9.a(k1.h ? -13884127 : -520, w9.b(), w9Var.d(2), w9Var.d(34)));
            w9Var.d.setElevation(w9Var.d(20));
            int iD = w9Var.d(30);
            w9Var.d.setPadding(iD, w9Var.d(26), iD, w9Var.d(26));
            w9Var.d.setClickable(true);
            LinearLayout linearLayout10 = w9Var.d;
            LinearLayout linearLayout11 = new LinearLayout(carScreen2);
            linearLayout11.setOrientation(0);
            linearLayout11.setGravity(16);
            LinearLayout linearLayout12 = new LinearLayout(carScreen2);
            linearLayout12.setOrientation(0);
            linearLayout12.setGravity(16);
            linearLayout12.setBackground(w9.a(k1.h ? -15265265 : -990000, w9.b(), w9Var.d(2), w9Var.d(Ui.R_PILL)));
            linearLayout12.setPadding(w9Var.d(24), 0, w9Var.d(24), 0);
            ImageView imageView6 = new ImageView(carScreen2);
            imageView6.setImageResource(R.drawable.ic_search);
            imageView6.setColorFilter(d8.a());
            int iMax = Math.max(w9Var.d(28), d8.g(carScreen2, 18));
            linearLayout12.addView(imageView6, new LinearLayout.LayoutParams(iMax, iMax));
            CarEditText carEditText = new CarEditText(carScreen2);
            w9Var.g = carEditText;
            carEditText.setHint("Nhập từ khoá");
            w9Var.g.setHintTextColor(d8.j(k1.h ? 500 : 600));
            w9Var.g.setTextColor(d8.o());
            w9Var.g.setTypeface(d8.d(0, carScreen2, "fonts/BeVietnamPro-Regular.ttf"));
            w9Var.g.setTextSize(2, w9Var.e(24.0f));
            w9Var.g.setSingleLine(true);
            w9Var.g.setBackground(null);
            w9Var.g.setImeOptions(3);
            w9Var.g.setOnEditorActionListener(new defpackage.n(w9Var, 2));
            LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(0, -1, 1.0f);
            layoutParams6.leftMargin = w9Var.d(14);
            linearLayout12.addView(w9Var.g, layoutParams6);
            linearLayout11.addView(linearLayout12, new LinearLayout.LayoutParams(0, -1, 1.0f));
            ImageView imageView7 = new ImageView(carScreen2);
            w9Var.j = imageView7;
            imageView7.setImageResource(android.R.drawable.ic_btn_speak_now);
            w9Var.j.setColorFilter(d8.k());
            w9Var.j.setScaleType(ImageView.ScaleType.CENTER);
            k1.B(w9Var.j, d8.a(), true, 0);
            w9Var.j.setOnClickListener(new u9(w9Var, 1));
            View view5 = w9Var.j;
            int iC = w9Var.c();
            int iC2 = w9Var.c();
            int iD2 = w9Var.d(14);
            LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(iC, iC2);
            layoutParams7.topMargin = 0;
            layoutParams7.leftMargin = iD2;
            linearLayout11.addView(view5, layoutParams7);
            TextView textView3 = new TextView(carScreen2);
            textView3.setText("Đóng");
            textView3.setGravity(17);
            textView3.setTypeface(d8.f(carScreen2, 1));
            int i4 = 2;
            textView3.setTextSize(2, w9Var.e(20.0f));
            textView3.setTextColor(d8.o());
            textView3.setPadding(w9Var.d(28), 0, w9Var.d(28), 0);
            textView3.setBackground(w9.a(k1.h ? -15265265 : -990000, w9.b(), w9Var.d(2), w9Var.d(Ui.R_PILL)));
            textView3.setOnClickListener(new u9(w9Var, i4));
            int iC3 = w9Var.c();
            int iD3 = w9Var.d(14);
            LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(-2, iC3);
            layoutParams8.topMargin = 0;
            layoutParams8.leftMargin = iD3;
            linearLayout11.addView(textView3, layoutParams8);
            linearLayout10.addView(linearLayout11, new LinearLayout.LayoutParams(-1, w9Var.c()));
            TextView textView4 = new TextView(carScreen2);
            w9Var.i = textView4;
            textView4.setTypeface(d8.f(carScreen2, 1));
            w9Var.i.setTextSize(2, w9Var.e(18.0f));
            w9Var.i.setTextColor(iB);
            w9Var.i.setVisibility(8);
            LinearLayout linearLayout13 = w9Var.d;
            TextView textView5 = w9Var.i;
            int iD4 = w9Var.d(14);
            LinearLayout.LayoutParams layoutParams9 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams9.topMargin = iD4;
            layoutParams9.leftMargin = 0;
            linearLayout13.addView(textView5, layoutParams9);
            v9 v9Var = new v9(carScreen2, w9Var.d(12));
            w9Var.h = v9Var;
            LinearLayout linearLayout14 = w9Var.d;
            int iD5 = w9Var.d(12);
            LinearLayout.LayoutParams layoutParams10 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams10.topMargin = iD5;
            layoutParams10.leftMargin = 0;
            linearLayout14.addView(v9Var, layoutParams10);
            FrameLayout.LayoutParams layoutParams11 = new FrameLayout.LayoutParams(Math.round(w9Var.f * 0.54f), -2);
            w9Var.e = layoutParams11;
            layoutParams11.gravity = 49;
            layoutParams11.topMargin = w9Var.d(64);
            frameLayout5.addView(w9Var.d, w9Var.e);
            w9Var.c = frameLayout5;
        }
        t9Var.d = w9Var.c;
        CarEditText carEditText2 = t9Var.e.g;
        t9Var.f = carEditText2;
        carEditText2.addTextChangedListener(new defpackage.m(t9Var, 2));
        FrameLayout frameLayout6 = t9Var.d;
        this.searchOverlayView = frameLayout6;
        frameLayout6.setVisibility(8);
        kVar.addView(this.searchOverlayView);
        fd fdVar = new fd(new e(this, 1));
        this.webInput = fdVar;
        kVar.addView(fdVar.c());
        c8 c8Var = new c8(this, new e(this, 2));
        this.sheet = c8Var;
        FrameLayout frameLayout7 = new FrameLayout(this);
        frameLayout7.setBackgroundColor(k1.h ? -436207616 : -1289482231);
        frameLayout7.setClickable(true);
        frameLayout7.setOnClickListener(new t3(c8Var, 2));
        LinearLayout linearLayout15 = new LinearLayout(this);
        linearLayout15.setOrientation(1);
        GradientDrawable gradientDrawableT2 = k1.t(-232776163, k1.g(this, 26.0f));
        gradientDrawableT2.setStroke(k1.g(this, 1.0f), 704247021);
        linearLayout15.setBackground(gradientDrawableT2);
        int iG4 = k1.g(this, 12.0f);
        linearLayout15.setPadding(iG4, iG4, iG4, iG4);
        linearLayout15.setClickable(true);
        linearLayout15.setElevation(k1.g(this, 14.0f));
        TextView textView6 = new TextView(this);
        c8Var.g = textView6;
        textView6.setTextColor(-4147547);
        c8Var.g.setTextSize(0, d8.m(this, 14.0f));
        c8Var.g.setLetterSpacing(0.1f);
        c8Var.g.setAllCaps(true);
        c8Var.g.setTypeface(d8.f(this, 1));
        c8Var.g.setIncludeFontPadding(true);
        c8Var.g.setPadding(k1.g(this, 6.0f), k1.g(this, 4.0f), 0, k1.g(this, 10.0f));
        linearLayout15.addView(c8Var.g);
        LinearLayout linearLayout16 = new LinearLayout(this);
        c8Var.f = linearLayout16;
        linearLayout16.setOrientation(1);
        ScrollView scrollView = new ScrollView(this);
        c8Var.e = scrollView;
        scrollView.addView(c8Var.f);
        linearLayout15.addView(c8Var.e, new LinearLayout.LayoutParams(-1, -2));
        FrameLayout.LayoutParams layoutParams12 = new FrameLayout.LayoutParams(k1.g(this, 520.0f), -2);
        layoutParams12.gravity = 81;
        layoutParams12.topMargin = k1.g(this, 16.0f);
        layoutParams12.bottomMargin = k1.g(this, 100.0f);
        frameLayout7.addView(linearLayout15, layoutParams12);
        c8Var.d = linearLayout15;
        c8Var.c = frameLayout7;
        frameLayout7.setVisibility(8);
        kVar.addView(frameLayout7);
        za zaVar = new za(new e(this, 3), this.debounce);
        this.speedOverlay = zaVar;
        zaVar.d(xc.g(this, "speedStyle", "pill"));
        FrameLayout frameLayout8 = this.rootLayout;
        if (frameLayout8 != null) {
            frameLayout8.addOnLayoutChangeListener(zaVar.e);
        }
        r1 r1Var = new r1(new s2(this));
        this.callBar = r1Var;
        if (r1Var.b == null) {
            r1Var.b = new FrameLayout(this);
            FrameLayout.LayoutParams layoutParams13 = new FrameLayout.LayoutParams(-1, -2, 49);
            layoutParams13.topMargin = r1Var.c(22);
            r1Var.b.setClickable(false);
            r1Var.b.setFocusable(false);
            r1Var.b.setClipChildren(false);
            r1Var.b.setClipToPadding(false);
            this.rootLayout.addView(r1Var.b, layoutParams13);
            m1 m1Var = r1Var.e;
            CopyOnWriteArrayList copyOnWriteArrayList = u1.b;
            if (!copyOnWriteArrayList.contains(m1Var)) {
                copyOnWriteArrayList.add(m1Var);
            }
            r1Var.f();
        }
        r1 r1Var2 = this.callBar;
        if (this.rail != null && !isFullscreen()) {
            iG = this.rail.g();
        }
        r1Var2.a(iG);
        setContentView(kVar);
        kVar.post(new defpackage.h(2, this, kVar));
        kVar.addOnLayoutChangeListener(new w0(this, kVar, 1));
        u6 u6Var = this.carHooks;
        y6 y6Var = this.webPlayer;
        ControllerService controllerService = z6.a;
        if (u6Var != null && y6Var != null) {
            if (z6.g(u6Var) == null) {
                z6.e.add(new w6(u6Var, z6.f.incrementAndGet()));
            }
            w6 w6VarG = z6.g(u6Var);
            if (w6VarG != null) {
                w6VarG.b = y6Var;
            }
            y6 y6VarN = z6.n();
            String str2 = z6.c;
            z6.c = null;
            if (str2 != null && y6VarN != null) {
                if (SystemClock.elapsedRealtime() - z6.d > 120000) {
                    "".equals(str2);
                } else if ("".equals(str2)) {
                    ((e) y6VarN).t();
                } else {
                    ((e) y6VarN).A(str2);
                }
            }
        }
        PlaybackService.start(this);
        this.speedOverlay.c();
        j2 j2Var = new j2(this, this.debounce);
        this.carHud = j2Var;
        j2Var.a(host());
        showHome();
        showSplash();
    }

    private View buildLockedScreen() {
        return new g6(this, this.fullSurface, this.onDevice);
    }

    private View buildToolbar() {
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.setBackgroundColor(d8.n());
        int iG = k1.g(this, 4.0f);
        linearLayout.setPadding(iG, iG, iG, iG);
        int iG2 = k1.g(this, 38.0f);
        int iG3 = k1.g(this, 4.0f);
        this.backBtn = k1.m(this, R.drawable.ic_nav_back, new v2(this, 0));
        this.forwardBtn = k1.m(this, R.drawable.ic_nav_forward, new v2(this, 1));
        ImageView imageViewM = k1.m(this, R.drawable.ic_nav_home, new v2(this, 2));
        int iG4 = k1.g(this, 8.0f);
        this.backBtn.setPadding(iG4, iG4, iG4, iG4);
        this.forwardBtn.setPadding(iG4, iG4, iG4, iG4);
        imageViewM.setPadding(iG4, iG4, iG4, iG4);
        linearLayout.addView(this.backBtn, barItem(iG2, 0));
        linearLayout.addView(this.forwardBtn, barItem(iG2, iG3));
        linearLayout.addView(imageViewM, barItem(iG2, iG3));
        CarEditText carEditText = new CarEditText(this);
        this.addressBox = carEditText;
        carEditText.setSingleLine(true);
        this.addressBox.setHint("Địa chỉ hoặc từ khoá");
        this.addressBox.setHintTextColor(d8.p());
        this.addressBox.setTextColor(d8.o());
        this.addressBox.setTextSize(2, 16.0f);
        this.addressBox.setBackground(k1.t(d8.e(), k1.g(this, 999.0f)));
        this.addressBox.setPadding(k1.g(this, 16.0f), k1.g(this, 6.0f), k1.g(this, 16.0f), k1.g(this, 6.0f));
        this.addressBox.setImeOptions(2);
        this.addressBox.setVisibility(8);
        this.addressBox.setFocusable(false);
        this.addressBox.setFocusableInTouchMode(false);
        this.addressBox.setOnClickListener(new v2(this, 3));
        this.addressBox.setOnEditorActionListener(new defpackage.n(this, 1));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, iG2, 1.0f);
        layoutParams.leftMargin = iG3;
        linearLayout.addView(this.addressBox, layoutParams);
        ImageView imageViewM2 = k1.m(this, R.drawable.ic_nav_mobile, new v2(this, 4));
        this.uaBtn = imageViewM2;
        imageViewM2.setPadding(iG4, iG4, iG4, iG4);
        this.uaBtn.setVisibility(8);
        linearLayout.addView(this.uaBtn, barItem(iG2, iG3));
        syncNutUa();
        LinearLayout linearLayout2 = new LinearLayout(this);
        linearLayout2.setOrientation(1);
        linearLayout2.addView(linearLayout, new LinearLayout.LayoutParams(-1, -2));
        View view = new View(this);
        view.setBackgroundColor(k1.x());
        linearLayout2.addView(view, new LinearLayout.LayoutParams(-1, k1.g(this, 1.0f)));
        return linearLayout2;
    }

    private View buildWebView() {
        BackgroundWebView backgroundWebView = new BackgroundWebView(nightContext());
        this.bgWeb = backgroundWebView;
        this.web = backgroundWebView;
        CookieManager cookieManager = CookieManager.getInstance();
        cookieManager.setAcceptCookie(true);
        cookieManager.setAcceptThirdPartyCookies(this.web, true);
        WebSettings settings = this.web.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setAllowFileAccess(choDocFile(this.currentApp));
        settings.setAllowContentAccess(false);
        settings.setAllowUniversalAccessFromFileURLs(true);
        settings.setDomStorageEnabled(true);
        settings.setMediaPlaybackRequiresUserGesture(false);
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        if (Build.VERSION.SDK_INT >= 33) {
            try {
                settings.setAlgorithmicDarkeningAllowed(true);
            } catch (Throwable unused) {
            }
        }
        int i = getResources().getConfiguration().uiMode;
        int i2 = this.web.getContext().getResources().getConfiguration().uiMode;
        this.web.addJavascriptInterface(new t(this), "CntBridge");
        this.web.setWebViewClient(new i(this));
        this.web.setWebChromeClient(new j(this));
        return this.web;
    }

    private static boolean choDocFile(dd ddVar) {
        return ddVar != null && "media".equals(ddVar.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean controlsAutoHide() {
        dd ddVar = this.currentApp;
        if (ddVar == null || this.settingsShowing || this.homeShowing || this.pageOverlayShown) {
            return false;
        }
        int i = ddVar.i.a;
        if (i == 3) {
            return true;
        }
        return i == 4 ? isFullscreen() : i == 5 && isFullscreen() && !this.pageControlsShown;
    }

    private void datQuyenDocFile(dd ddVar) {
        if (this.web == null) {
            return;
        }
        boolean zChoDocFile = choDocFile(ddVar);
        try {
            WebSettings settings = this.web.getSettings();
            if (settings.getAllowFileAccess() != zChoDocFile) {
                settings.setAllowFileAccess(zChoDocFile);
            }
        } catch (Throwable th) {
            String.valueOf(th);
        }
    }

    private void dayDanhSachIptv(WebView webView) {
        dd ddVar = this.currentApp;
        if (ddVar == null || !"iptv".equals(ddVar.a) || webView == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            ArrayList arrayListZ = w1.z(this);
            jSONObject.put("url", arrayListZ.isEmpty() ? "" : arrayListZ.get(0));
            jSONObject.put("channels", new JSONArray(w1.f(this)));
            jSONObject.put("luu", xc.l(this).getString(xc.h("iptvSaved"), ""));
            webView.evaluateJavascript("window.__cntIptvData=" + String.valueOf(jSONObject) + ";if(window.__cntIptvSet){window.__cntIptvSet(window.__cntIptvData);}", null);
        } catch (Throwable th) {
            String.valueOf(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doiCheDoUa() {
        xc.m(this, "webDesktop", !laMayTinh());
        syncNutUa();
        if (this.web == null) {
            return;
        }
        applyUserAgent(this.currentApp);
        String url = this.web.getUrl();
        if (url == null || url.isEmpty()) {
            this.web.reload();
        } else {
            this.web.loadUrl(url);
        }
    }

    private void evalScript(WebView webView, int i) throws Resources.NotFoundException, IOException {
        String strRawScript = rawScript(i);
        if (strRawScript.isEmpty()) {
            return;
        }
        webView.evaluateJavascript(strRawScript, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ghiCoMan(FrameLayout frameLayout) {
        int width = frameLayout.getWidth();
        int height = frameLayout.getHeight();
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        if (this.onDevice || width <= 0 || height <= 0) {
            return;
        }
        boolean z = this.fullSurface;
        String str = z ? "carFullW" : "carW";
        String str2 = z ? "carFullH" : "carH";
        String str3 = z ? "carFullDensity" : "carDensity";
        int iRound = Math.round(displayMetrics.density * 1000.0f);
        if (getApplicationContext().getSharedPreferences("CanhNhatTube", 0).getInt(xc.h(str), 0) != width || getApplicationContext().getSharedPreferences("CanhNhatTube", 0).getInt(xc.h(str2), 0) != height || getApplicationContext().getSharedPreferences("CanhNhatTube", 0).getInt(xc.h(str3), 0) != iRound) {
            xc.n(width, this, str);
            xc.n(height, this, str2);
            xc.n(iRound, this, str3);
            int i = getResources().getConfiguration().screenWidthDp;
            d8.l(this, 0.7f);
        }
        xc.m(this, "carLastFull", this.fullSurface);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void giuTrenCung() {
        FrameLayout frameLayout;
        za zaVar = this.speedOverlay;
        SpeedBubble speedBubble = zaVar.c;
        if (speedBubble != null && speedBubble.getVisibility() == 0) {
            zaVar.c.post(new t7(zaVar, 5));
        }
        r1 r1Var = this.callBar;
        if (r1Var == null || (frameLayout = r1Var.b) == null) {
            return;
        }
        frameLayout.post(new defpackage.f(r1Var, 8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void goForward() {
        WebView webView = this.web;
        if (webView == null || !webView.canGoForward()) {
            return;
        }
        this.web.goForward();
        syncNav();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void goHome() {
        dd ddVar;
        WebView webView = this.web;
        if (webView == null || (ddVar = this.currentApp) == null) {
            return;
        }
        webView.loadUrl(ddVar.d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hideSettings() {
        if (this.settingsShowing) {
            setSettingsVisible(false);
        }
    }

    private boolean highCodec() {
        return getApplicationContext().getSharedPreferences("CanhNhatTube", 0).getBoolean(xc.h("ytHighCodec"), false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean hitsChrome(MotionEvent motionEvent) {
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        if (pointInView(this.toolbar, rawX, rawY)) {
            return true;
        }
        a8 a8Var = this.nutTim;
        if (a8Var != null && pointInView(a8Var.b, rawX, rawY)) {
            return true;
        }
        a aVar = this.rail;
        if (aVar != null) {
            return a.f(aVar.c, rawX, rawY) || a.f(aVar.e, rawX, rawY);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void injectScripts(WebView webView) throws Resources.NotFoundException, IOException {
        int[] iArr;
        if (webView == null) {
            return;
        }
        evalScript(webView, R.raw.playstate);
        evalScript(webView, R.raw.dpad);
        dd ddVar = this.currentApp;
        if (ddVar == null || (iArr = ddVar.m) == null) {
            return;
        }
        for (int i : iArr) {
            if (i != R.raw.yt_prefer_h264 || !highCodec()) {
                evalScript(webView, i);
            }
        }
        this.codecApplied = highCodec();
        boolean z = this.onScreen;
        webView.evaluateJavascript("window.__cntAutoFullscreen=" + (allowAutoFullscreen(z) ? "true" : "false") + ";window.__cntCanResume=" + (z ? "true" : "false") + ";", null);
        applyVideoFit(webView);
        applyDataSaver(webView);
        dayDanhSachIptv(webView);
        datQuyenDocFile(this.currentApp);
        dayDanhSachMedia(webView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void keepBarAboveFullscreen() {
        if (this.fullscreenView == null || this.rootLayout == null) {
            return;
        }
        giuTrenCung();
        l3 l3Var = this.controlBar;
        View view = l3Var == null ? null : l3Var.c;
        if (view == null || view.getVisibility() != 0) {
            return;
        }
        int iIndexOfChild = this.rootLayout.indexOfChild(view);
        int iIndexOfChild2 = this.rootLayout.indexOfChild(this.fullscreenView);
        if (iIndexOfChild < 0 || iIndexOfChild2 < 0 || iIndexOfChild > iIndexOfChild2) {
            return;
        }
        view.bringToFront();
        View view2 = this.searchOverlayView;
        if (view2 != null && view2.getVisibility() == 0) {
            this.searchOverlayView.bringToFront();
        }
        giuTrenCung();
    }

    private boolean laMayTinh() {
        return getApplicationContext().getSharedPreferences("CanhNhatTube", 0).getBoolean(xc.h("webDesktop"), false);
    }

    private void leaveHome() {
        if (this.homeShowing) {
            this.homeShowing = false;
            this.placeholder.setVisibility(8);
            this.webColumn.setVisibility(0);
            syncSearchFab();
            syncControlBar(this.currentApp);
            applyRail();
        }
    }

    private String leftLabel(wc wcVar) {
        long j = wcVar.f;
        if (j <= 0) {
            return "đã xem";
        }
        long j2 = wcVar.e;
        if (j2 < 0 || j - j2 < COI_NHU_HET_MS) {
            return "đã xem";
        }
        long j3 = (j - j2) / HOME_TICK_MS;
        long j4 = j3 / 60;
        long j5 = j3 % 60;
        return "còn " + j4 + ":" + (j5 < 10 ? "0" : "") + j5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lockAllNow(String str) {
        lockNow(str);
        z6.j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lockNow(String str) {
        if (this.locked) {
            return;
        }
        stopLicenseWatch();
        tearDown();
        this.locked = true;
        setContentView(buildLockedScreen());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean lopPhuDangMo() {
        t9 t9Var;
        c8 c8Var;
        FrameLayout frameLayout;
        if (this.settingsShowing || this.homeShowing || this.pageOverlayShown || (((t9Var = this.searchBar) != null && t9Var.e()) || !((c8Var = this.sheet) == null || (frameLayout = c8Var.c) == null || frameLayout.getVisibility() != 0))) {
            return true;
        }
        q4 q4Var = this.games;
        return (q4Var == null || q4Var.f() == null || this.games.f().getVisibility() != 0) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void moDiaChi(String str) {
        String strTrim = str == null ? "" : str.trim();
        if (strTrim.isEmpty()) {
            return;
        }
        InputManager inputManager = host() != null ? host().getInputManager() : null;
        if (inputManager != null && inputManager.isInputActive()) {
            inputManager.stopInput();
        }
        this.addressBox.clearFocus();
        traTieuDiemVeTrang();
        if (strTrim.contains(" ") || !strTrim.contains(".")) {
            try {
                moTrongTrang("https://www.google.com/search?q=%s".replace("%s", URLEncoder.encode(strTrim, "UTF-8").replace("+", "%20")));
                return;
            } catch (Exception e) {
                String.valueOf(e);
                return;
            }
        }
        if (!strTrim.startsWith("http://") && !strTrim.startsWith("https://")) {
            strTrim = "https://".concat(strTrim);
        }
        moTrongTrang(strTrim);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void moTrongTrang(String str) {
        leaveHome();
        leaveGames();
        leaveLauncher();
        hideSettings();
        this.keeper.a(20000L);
        leaveFullscreenForCommand();
        WebView webView = this.web;
        if (webView != null) {
            webView.loadUrl(str);
        }
    }

    private Context nightContext() {
        k1.s(getApplicationContext());
        boolean z = k1.h;
        Configuration configuration = new Configuration(getResources().getConfiguration());
        configuration.uiMode = (configuration.uiMode & (-49)) | (z ? 32 : 16);
        return new ContextThemeWrapper(createConfigurationContext(configuration), z ? android.R.style.Theme.DeviceDefault : android.R.style.Theme.DeviceDefault.Light);
    }

    private static boolean pointInView(View view, float f, float f2) {
        if (view != null && view.getVisibility() == 0 && view.isShown()) {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            if (f >= iArr[0] && f < view.getWidth() + r2) {
                if (f2 >= iArr[1] && f2 < view.getHeight() + r1) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String rawScript(int i) throws Resources.NotFoundException, IOException {
        String string;
        String str = this.rawCache.get(Integer.valueOf(i));
        if (str != null) {
            return str;
        }
        try {
            string = p9.f(this, getResources().getResourceEntryName(i));
        } catch (Throwable unused) {
            string = null;
        }
        if (string == null) {
            try {
                InputStream inputStreamOpenRawResource = getResources().openRawResource(i);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[4096];
                while (true) {
                    int i2 = inputStreamOpenRawResource.read(bArr);
                    if (i2 == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, i2);
                }
                inputStreamOpenRawResource.close();
                string = byteArrayOutputStream.toString("UTF-8");
            } catch (Exception e) {
                e.getMessage();
                string = "";
            }
        }
        if (string != null && !string.isEmpty()) {
            this.rawCache.put(Integer.valueOf(i), string);
        }
        return string;
    }

    private void recreateWebView() {
        if (this.webColumn == null) {
            return;
        }
        WebView webView = this.web;
        if (webView != null) {
            webView.stopLoading();
            this.webColumn.removeView(this.web);
            this.web.destroy();
            this.web = null;
            this.bgWeb = null;
        }
        this.webColumn.addView(buildWebView(), new LinearLayout.LayoutParams(-1, 0, 1.0f));
        this.keepAliveWanted = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void refreshCardIfLimitChanged() {
        int iG;
        if (getApplicationContext().getSharedPreferences("CanhNhatTube", 0).getBoolean(xc.h("showSpeed"), false) && (iG = w7.g()) != this.lastCardLimit) {
            this.lastCardLimit = iG;
            ControllerService controllerService = z6.a;
            if (controllerService != null) {
                controllerService.publishNowPlaying();
            }
        }
    }

    private void refreshHome() {
        if (this.home == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(xc.l(this).getString(xc.h("watchHistory"), "[]"));
            for (int i = 0; i < jSONArray.length() && arrayList.size() < 12; i++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null) {
                    String strOptString = jSONObjectOptJSONObject.optString("s");
                    jSONObjectOptJSONObject.optString("k");
                    String strOptString2 = jSONObjectOptJSONObject.optString("t");
                    String strOptString3 = jSONObjectOptJSONObject.optString("th");
                    String strOptString4 = jSONObjectOptJSONObject.optString("u");
                    long jOptLong = jSONObjectOptJSONObject.optLong("p");
                    long jOptLong2 = jSONObjectOptJSONObject.optLong("d");
                    jSONObjectOptJSONObject.optLong("at");
                    arrayList.add(new wc(strOptString, strOptString2, strOptString3, strOptString4, jOptLong, jOptLong2));
                }
            }
        } catch (Exception unused) {
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            wc wcVar = (wc) obj;
            if (arrayList2.size() >= 4) {
                break;
            }
            String str = wcVar.a;
            String str2 = wcVar.c;
            if (!"tiktok".equals(str)) {
                String str3 = wcVar.d;
                if (str3 == null) {
                    str3 = "";
                }
                if (str3.contains("/watch") || str3.contains("/shorts/")) {
                    dd ddVarA = l0.a(str);
                    if (ddVarA != null) {
                        str = ddVarA.b;
                    }
                    String str4 = str;
                    int i3 = ddVarA != null ? ddVarA.c : 0;
                    long j = wcVar.f;
                    y4 y4Var = new y4(wcVar.a, str4, wcVar.b, leftLabel(wcVar), j > 0 ? (int) ((wcVar.e * 100) / j) : 0, resumeUrl(wcVar), i3);
                    y4Var.h = vb.a(str2);
                    arrayList2.add(y4Var);
                    arrayList3.add(str2);
                }
            }
        }
        this.home.c(arrayList2);
        for (int i4 = 0; i4 < arrayList2.size(); i4++) {
            y4 y4Var2 = (y4) arrayList2.get(i4);
            String str5 = (String) arrayList3.get(i4);
            if (y4Var2.h == null && str5 != null && !str5.isEmpty()) {
                vb.c(this, str5, new u2(this, y4Var2, arrayList2));
            }
        }
    }

    private void refullscreenOnResume() {
        String url;
        if (this.web == null || this.currentApp == null || isFullscreen() || this.homeShowing || this.settingsShowing || this.gamesShowing || (url = this.web.getUrl()) == null || !this.autoOpen.e(url)) {
            return;
        }
        this.debounce.postDelayed(new f(this, 6), 700L);
    }

    private String reopenUrl(dd ddVar, String str, String str2) {
        return (!"youtube".equals(ddVar.a) || str == null || str.length() < 6 || !str.matches("[A-Za-z0-9_-]+")) ? (str2 == null || !str2.startsWith("http")) ? ddVar.d : str2 : "https://m.youtube.com/watch?v=".concat(str);
    }

    private String resumeUrl(wc wcVar) {
        String str = wcVar.d;
        if (str == null) {
            return null;
        }
        if ("youtube".equals(wcVar.a) && str.contains("/watch")) {
            long j = wcVar.e;
            if (j > COI_NHU_HET_MS) {
                long j2 = wcVar.f;
                if (j2 <= 0 || j < j2 - 10000) {
                    long j3 = j / HOME_TICK_MS;
                    return str + (str.contains("?") ? "&" : "?") + "t=" + j3 + "s";
                }
            }
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void revealControls() {
        this.controlsRevealed = true;
        this.debounce.removeCallbacks(this.hideControls);
        this.debounce.postDelayed(this.hideControls, 3000L);
        syncControlBar(this.currentApp);
    }

    private static boolean sameSite(String str, String str2) {
        if (str == null || str2 == null) {
            return false;
        }
        String lowerCase = str.toLowerCase();
        String lowerCase2 = str2.toLowerCase();
        if (lowerCase.equals(lowerCase2)) {
            return true;
        }
        String strBaseDomain = baseDomain(lowerCase2);
        if (!lowerCase.equals(strBaseDomain)) {
            if (!lowerCase.endsWith("." + strBaseDomain)) {
                return false;
            }
        }
        return true;
    }

    private void setEnabledLook(View view, boolean z) {
        if (view == null) {
            return;
        }
        view.setEnabled(z);
        view.setAlpha(z ? 1.0f : 0.35f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSettingsVisible(boolean z) {
        if (this.settingsPanel == null) {
            this.settingsPanel = new fa(this, this.onDevice, new e(this, 4));
            this.rootLayout.addView(this.settingsPanel.l(), new FrameLayout.LayoutParams(-1, -1));
            this.settingsPanel.l().setVisibility(8);
        }
        if (z) {
            leaveGames();
            leaveLauncher();
            this.settingsPanel.f();
            this.settingsPanel.l().bringToFront();
            giuTrenCung();
        }
        this.settingsShowing = z;
        this.settingsPanel.l().setVisibility(z ? 0 : 8);
        syncControlBar(this.currentApp);
        syncSearchFab();
        applyRail();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSheetWatching(boolean z) {
        js("window.__cntSheetOn=" + (z ? "true" : "false") + ";");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showGames() {
        WebView webView;
        if (this.gamesShowing) {
            return;
        }
        leaveHome();
        leaveLauncher();
        this.gamesShowing = true;
        this.webColumn.setVisibility(8);
        this.placeholder.setVisibility(8);
        this.games.f().setVisibility(0);
        this.games.f().bringToFront();
        giuTrenCung();
        q4 q4Var = this.games;
        if (q4Var.j != null && (webView = q4Var.i) != null) {
            webView.onResume();
            q4Var.i.evaluateJavascript("window.dispatchEvent(new Event('cargame:resume'))", null);
        }
        syncSearchFab();
        syncControlBar(this.currentApp);
        applyRail();
    }

    private void showSplash() {
        LinearLayout linearLayout;
        SplashView splashView = new SplashView(this, true, this.fullSurface);
        this.rootLayout.addView(splashView, new FrameLayout.LayoutParams(-1, -1));
        this.splashShowing = true;
        a aVar = this.rail;
        if (aVar != null && (linearLayout = aVar.c) != null) {
            linearLayout.setVisibility(8);
            aVar.d.setVisibility(8);
            aVar.e.setVisibility(8);
        }
        splashView.d();
        splashView.postDelayed(new fb(splashView, new f(this, 1), 1), 1680L);
    }

    private void startBarTicker() {
        if (this.barTicking) {
            return;
        }
        this.barTicking = true;
        this.debounce.post(this.barTicker);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startLicenseWatch() {
        this.debounce.removeCallbacks(this.licenseTicker);
        this.debounce.postDelayed(this.licenseTicker, LICENSE_TICK_MS);
    }

    private void stopLicenseWatch() {
        this.debounce.removeCallbacks(this.licenseTicker);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void syncNav() {
        WebView webView = this.web;
        if (webView == null) {
            return;
        }
        setEnabledLook(this.backBtn, webView.canGoBack());
        setEnabledLook(this.forwardBtn, this.web.canGoForward());
        syncUrl(this.web.getUrl());
    }

    private void syncNutUa() {
        if (this.uaBtn == null) {
            return;
        }
        boolean zLaMayTinh = laMayTinh();
        this.uaBtn.setImageResource(zLaMayTinh ? R.drawable.ic_nav_desktop : R.drawable.ic_nav_mobile);
        this.uaBtn.setContentDescription(zLaMayTinh ? "Đang xem bản máy tính" : "Đang xem bản điện thoại");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void syncRailSelection() {
        int i;
        if (this.rail == null) {
            return;
        }
        dd[] ddVarArrB = l0.b(this);
        int length = ddVarArrB.length;
        boolean z = xc.l(this).getBoolean(xc.h("gamesEnabled"), true);
        boolean z2 = xc.l(this).getBoolean(xc.h("launcherEnabled"), false);
        if (this.gamesShowing) {
            i = length + 1;
        } else if (this.launcherShowing) {
            i = length + 1 + (z ? 1 : 0);
        } else if (this.settingsShowing) {
            i = length + 2 + (z ? 1 : 0) + (z2 ? 1 : 0);
        } else if (this.homeShowing || this.currentApp == null) {
            i = 0;
        } else {
            for (int i2 = 0; i2 < length; i2++) {
                if (ddVarArrB[i2].a.equals(this.currentApp.a)) {
                    i = i2 + 1;
                    break;
                }
            }
            i = 0;
        }
        a aVar = this.rail;
        ArrayList arrayList = aVar.i;
        LinearLayout linearLayout = aVar.c;
        if (linearLayout == null) {
            return;
        }
        linearLayout.setBackgroundColor(d8.n());
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            View view = (View) arrayList.get(i3);
            if (view instanceof LinearLayout) {
                Object[] objArr = i3 == i;
                k1.B(view, objArr != false ? d8.a() : 0, false, d8.h(aVar.a, 28));
                LinearLayout linearLayout2 = (LinearLayout) view;
                int iK = objArr != false ? d8.k() : d8.o();
                if (!CarContext.APP_SERVICE.equals(view.getTag())) {
                    ((ImageView) linearLayout2.getChildAt(0)).setColorFilter(iK);
                }
                ((TextView) linearLayout2.getChildAt(1)).setTextColor(iK);
            }
            i3++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void syncSearchFab() {
        ImageView imageView;
        dd ddVar;
        boolean z = (this.settingsShowing || this.homeShowing || this.launcherShowing || isFullscreen() || (ddVar = this.currentApp) == null || ddVar.e == null) ? false : true;
        a8 a8Var = this.nutTim;
        if (a8Var == null || (imageView = a8Var.b) == null) {
            return;
        }
        imageView.setVisibility(z ? 0 : 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void syncUrl(String str) {
        if (this.addressBox == null) {
            return;
        }
        dd ddVar = this.currentApp;
        boolean z = ddVar != null && "web".equals(ddVar.a);
        this.addressBox.setVisibility(z ? 0 : 8);
        ImageView imageView = this.uaBtn;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
        if (!z || this.addressBox.hasFocus()) {
            return;
        }
        CarEditText carEditText = this.addressBox;
        if (str == null || "about:blank".equals(str)) {
            str = "";
        }
        carEditText.setText(str);
    }

    private void tearDown() {
        ab abVar;
        w6 w6VarG;
        exitFullscreen();
        t9 t9Var = this.searchBar;
        t9Var.b();
        rc rcVar = t9Var.g;
        if (rcVar != null) {
            rcVar.d = false;
            SpeechRecognizer speechRecognizer = rcVar.c;
            if (speechRecognizer != null) {
                try {
                    speechRecognizer.destroy();
                } catch (Exception unused) {
                }
                rcVar.c = null;
            }
            t9Var.g = null;
        }
        u6 u6Var = this.carHooks;
        w6 w6VarG2 = z6.g(u6Var);
        if (w6VarG2 != null) {
            w6VarG2.b = null;
            w6VarG2.c = false;
            w6VarG2.d = false;
        }
        if (z6.e() == null && (w6VarG = z6.g(u6Var)) != null) {
            w6VarG.m = "";
            w6VarG.n = "";
            w6VarG.o = 0;
        }
        if (z6.n() == null) {
            PlaybackService.stop(this);
        }
        za zaVar = this.speedOverlay;
        if (zaVar != null) {
            h2 h2Var = zaVar.f;
            CopyOnWriteArrayList copyOnWriteArrayList = cb.e;
            copyOnWriteArrayList.remove(h2Var);
            if (copyOnWriteArrayList.isEmpty() && cb.f.isEmpty()) {
                LocationManager locationManager = cb.h;
                if (locationManager != null && (abVar = cb.i) != null) {
                    try {
                        locationManager.removeUpdates(abVar);
                    } catch (Throwable unused2) {
                    }
                }
                cb.i = null;
            }
            w7.l.remove(zaVar.g);
            FrameLayout frameLayout = zaVar.a.b.rootLayout;
            if (frameLayout != null) {
                frameLayout.removeOnLayoutChangeListener(zaVar.e);
            }
        }
        j2 j2Var = this.carHud;
        if (j2Var != null) {
            j2Var.c();
            this.carHud = null;
        }
        q4 q4Var = this.games;
        if (q4Var != null) {
            WebView webView = q4Var.i;
            if (webView != null) {
                webView.stopLoading();
                q4Var.i.destroy();
                q4Var.i = null;
            }
            q4Var.j = null;
        }
        x5 x5Var = this.launcher;
        if (x5Var != null) {
            x5Var.b();
            sb.a(x5Var.a, false);
            u5.d("BoChieu.roiO");
            k1.c = false;
            l7 l7Var = k1.g;
            if (l7Var != null && l7Var.d()) {
                l7Var.c('X');
            }
            synchronized (k1.class) {
                try {
                    r6 r6Var = k1.b;
                    if (r6Var != null) {
                        r6Var.b();
                    }
                    l7 l7Var2 = k1.a;
                    if (l7Var2 != null) {
                        try {
                            l7Var2.c('X');
                            new Thread(new f7(l7Var2, 0), "mirror-tat").start();
                        } catch (Throwable unused3) {
                        }
                        try {
                            l7Var2.f = true;
                            try {
                                ServerSocket serverSocket = l7Var2.b;
                                if (serverSocket != null) {
                                    serverSocket.close();
                                }
                            } catch (Exception unused4) {
                            }
                            u5.d("SOCKET: tra lai cong 5299 ngay (giu socket du lieu cho 'X')");
                        } catch (Throwable unused5) {
                        }
                        new Thread(new j1(l7Var2, 0), "dong-kenh").start();
                        if (k1.g == l7Var2) {
                            k1.g = null;
                        }
                    }
                    k1.a = null;
                    k1.b = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
            LuoiApp luoiApp = x5Var.h;
            if (luoiApp != null) {
                try {
                    luoiApp.thaRa();
                } catch (Throwable unused6) {
                }
                x5Var.h = null;
            }
            x5Var.c = null;
            x5Var.d = null;
            x5Var.f = null;
            x5Var.e = false;
            x5Var.b = null;
        }
        WebView webView2 = this.web;
        if (webView2 != null) {
            webView2.destroy();
            this.web = null;
        }
        this.backBtn = null;
        this.forwardBtn = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void traTieuDiemVeTrang() {
        if (this.web == null) {
            return;
        }
        t9 t9Var = this.searchBar;
        if (t9Var == null || !t9Var.e()) {
            fd fdVar = this.webInput;
            if (fdVar == null || !fdVar.e) {
                this.addressBox.setFocusable(false);
                this.addressBox.setFocusableInTouchMode(false);
                this.web.requestFocus();
            }
        }
    }

    private String who() {
        return this.onDevice ? "[tren may] " : this.fullSurface ? "[toan man hinh] " : "[ban chieu] ";
    }

    public void applyDataSaverLive() {
        js("window.__cntDataSaver=" + (getApplicationContext().getSharedPreferences("CanhNhatTube", 0).getBoolean(xc.h("ytDataSaver"), false) ? "true" : "false") + ";");
    }

    public void applyVideoFitLive() {
        js("window.__cntVideoFit='" + (getApplicationContext().getSharedPreferences("CanhNhatTube", 0).getBoolean(xc.h("videoCrop"), false) ? "cover" : "contain") + "';if(window.__cntApplyFit)window.__cntApplyFit();");
    }

    public boolean choPhepBaoTrangThaiPhat() {
        if (pageTrusted()) {
            return true;
        }
        dd ddVar = this.currentApp;
        return ddVar != null && "web".equals(ddVar.a);
    }

    public void dayDanhSachMedia(WebView webView) {
        if (webView == null) {
            webView = this.web;
        }
        dd ddVar = this.currentApp;
        if (ddVar == null || !"media".equals(ddVar.a) || webView == null) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.dangQuetMedia || jElapsedRealtime - this.lucQuetMediaXong < 1500) {
            return;
        }
        this.dangQuetMedia = true;
        new Thread(new y(this, this, webView, 4), "quet-media").start();
    }

    public void dongOnhapTrang() {
        js("if(window.__cntWebDangNhap){window.__cntWebDangNhap(false);}");
        fd fdVar = this.webInput;
        if (fdVar != null && fdVar.e) {
            fdVar.a();
        }
        traTieuDiemVeTrang();
    }

    public void exitFullscreen() {
        View view = this.fullscreenView;
        if (view == null) {
            return;
        }
        this.rootLayout.removeView(view);
        this.fullscreenView = null;
        this.fullscreenHolder = null;
        this.contentColumn.setVisibility(0);
        applyRail();
        syncSearchFab();
        setSheetWatching(false);
        FrameLayout frameLayout = this.sheet.c;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        js("window.__cntFullWatch=false;");
        this.pageControlsShown = false;
        syncControlBar(this.currentApp);
        WebChromeClient.CustomViewCallback customViewCallback = this.fullscreenCallback;
        if (customViewCallback != null) {
            try {
                customViewCallback.onCustomViewHidden();
            } catch (Exception unused) {
            }
            this.fullscreenCallback = null;
        }
    }

    public void goBack() {
        WebView webView = this.web;
        if (webView == null || !webView.canGoBack()) {
            return;
        }
        this.web.goBack();
        syncNav();
    }

    public boolean hitsSpeedBubble(float f, float f2) {
        SpeedBubble speedBubble;
        za zaVar = this.speedOverlay;
        if (zaVar != null && (speedBubble = zaVar.c) != null && speedBubble.getVisibility() == 0 && speedBubble.getWidth() != 0 && speedBubble.getHeight() != 0) {
            int[] iArr = new int[2];
            speedBubble.getLocationOnScreen(iArr);
            if (f >= iArr[0] && f < speedBubble.getWidth() + r3) {
                if (f2 >= iArr[1] && f2 < speedBubble.getHeight() + r2) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isFullscreen() {
        return this.fullscreenView != null;
    }

    public void js(String str) {
        WebView webView = this.web;
        if (webView == null) {
            return;
        }
        webView.post(new defpackage.h(webView, str, 3, false));
    }

    public void leaveFullscreenForCommand() {
        if (isFullscreen()) {
            exitFullscreen();
        }
    }

    public void leaveGames() {
        if (this.gamesShowing) {
            this.gamesShowing = false;
            this.games.d();
            this.games.f().setVisibility(8);
            applyRail();
        }
    }

    public void leaveLauncher() {
        if (this.launcherShowing) {
            this.launcherShowing = false;
            x5 x5Var = this.launcher;
            x5Var.getClass();
            u5.d("O UNG DUNG: ROI o");
            CarScreen carScreen = x5Var.a;
            sb.a(carScreen, false);
            x5Var.b();
            u5.d("BoChieu.roiO");
            k1.c = false;
            l7 l7Var = k1.g;
            if (l7Var != null && l7Var.d()) {
                l7Var.c('X');
            }
            new Thread(new y(carScreen.getApplicationContext(), "roi o", "roi_o"), "cs-nop-chieu").start();
            this.launcher.c().setVisibility(8);
            applyRail();
        }
    }

    public void markFullSurface() {
        this.fullSurface = true;
    }

    public void markOnDevice() {
        this.onDevice = true;
    }

    public void moOnhapTrang(String str, boolean z) {
        fd fdVar = this.webInput;
        if (fdVar == null || fdVar.e) {
            return;
        }
        InputManager inputManager = host() != null ? host().getInputManager() : null;
        if (inputManager == null || !inputManager.isValid()) {
            baoTrangTuVePhim();
            return;
        }
        js("if(window.__cntWebDangNhap){window.__cntWebDangNhap(true);}");
        fd fdVar2 = this.webInput;
        CarScreen carScreen = fdVar2.a.b;
        fdVar2.c();
        fdVar2.f = true;
        CarEditText carEditText = fdVar2.d;
        if (str == null) {
            str = "";
        }
        carEditText.setText(str);
        CarEditText carEditText2 = fdVar2.d;
        carEditText2.setSelection(carEditText2.getText().length());
        fdVar2.f = false;
        fdVar2.d.setSingleLine(!z);
        a aVar = carScreen.rail;
        ((FrameLayout.LayoutParams) fdVar2.c.getLayoutParams()).leftMargin = k1.g(carScreen, 14) + (aVar != null ? aVar.g() : 0);
        fdVar2.c.requestLayout();
        fdVar2.b.setVisibility(0);
        fdVar2.b.bringToFront();
        fdVar2.e = true;
        fdVar2.b.post(new t7(fdVar2, 13));
    }

    @Override // com.carstream.tech.car.CarActivityBase, com.google.android.gms.car.CarActivityHost.HostedCarActivity
    public void onConfigurationChanged(Configuration configuration) {
        if (this.locked) {
            return;
        }
        int i = configuration.screenWidthDp;
    }

    @Override // com.carstream.tech.car.CarActivityBase, com.google.android.gms.car.CarActivityHost.HostedCarActivity
    public void onCreate(Bundle bundle) {
        WebView.setWebContentsDebuggingEnabled(false);
        c5.d(getApplicationContext());
        u6 u6Var = this.carHooks;
        if (u6Var == null) {
            ControllerService controllerService = z6.a;
        } else if (z6.g(u6Var) == null) {
            z6.e.add(new w6(u6Var, z6.f.incrementAndGet()));
        }
        u6 u6Var2 = this.carHooks;
        boolean z = this.onDevice;
        w6 w6VarG = z6.g(u6Var2);
        if (w6VarG != null) {
            w6VarG.l = z;
        }
        if (ec.j(this)) {
            p9.i(this);
            buildEverything();
        } else {
            this.locked = true;
            setContentView(buildLockedScreen());
        }
    }

    @Override // com.carstream.tech.car.CarActivityBase, com.google.android.gms.car.CarActivityHost.HostedCarActivity
    public void onDestroy() {
        w6 w6VarG = z6.g(this.carHooks);
        if (w6VarG != null) {
            z6.e.remove(w6VarG);
        }
        if (this.locked) {
            return;
        }
        tearDown();
    }

    @Override // com.carstream.tech.car.CarActivityBase, com.google.android.gms.car.CarActivityHost.HostedCarActivity
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        d dVar = this.keys;
        CarScreen carScreen = dVar.a;
        if (carScreen.locked) {
            return false;
        }
        KeyEvent.keyCodeToString(i);
        keyEvent.getRepeatCount();
        Integer.toHexString(keyEvent.getSource());
        keyEvent.getDeviceId();
        if (i == 4) {
            if (carScreen.isFullscreen()) {
                carScreen.exitFullscreen();
                return true;
            }
            if (carScreen.searchBar.e()) {
                carScreen.searchBar.c();
                return true;
            }
            if (!carScreen.gamesShowing) {
                WebView webView = carScreen.web;
                if (webView == null || !webView.canGoBack()) {
                    return false;
                }
                carScreen.goBack();
                return true;
            }
            q4 q4Var = carScreen.games;
            if (q4Var.j != null) {
                q4Var.e();
                return true;
            }
            carScreen.leaveGames();
            carScreen.showHome();
            return true;
        }
        if (i != 66) {
            if (i != 79) {
                if (i != 160) {
                    if (i != 231) {
                        if (i == 126) {
                            ((e) carScreen.webPlayer).t();
                            return true;
                        }
                        if (i != 127) {
                            switch (i) {
                                case 19:
                                    return dVar.a("up");
                                case 20:
                                    return dVar.a("down");
                                case 21:
                                    return dVar.a("left");
                                case 22:
                                    return dVar.a("right");
                                case 23:
                                    break;
                                default:
                                    switch (i) {
                                        case APP_BAR_DP /* 84 */:
                                            break;
                                        case 85:
                                            break;
                                        case 86:
                                            break;
                                        default:
                                            switch (i) {
                                                case 268:
                                                case 270:
                                                    return dVar.a("up");
                                                case 269:
                                                case 271:
                                                    return dVar.a("down");
                                                default:
                                                    return false;
                                            }
                                    }
                            }
                        }
                        ((e) carScreen.webPlayer).r();
                        return true;
                    }
                    carScreen.searchBar.f(true);
                    return true;
                }
            }
            carScreen.js("var v=(window.__cntVideo&&window.__cntVideo())||document.querySelector('video');if(v){ if(v.paused){ v.play(); } else if(!(window.__cntPause&&window.__cntPause())){ v.pause(); } }");
            return true;
        }
        if (carScreen.searchBar.e()) {
            return false;
        }
        carScreen.js("if(window.__cntTap){window.__cntTap();}");
        return true;
    }

    @Override // com.carstream.tech.car.CarActivityBase, com.google.android.gms.car.CarActivityHost.HostedCarActivity
    public boolean onKeyLongPress(int i, KeyEvent keyEvent) {
        if (this.keys.a.locked) {
            return false;
        }
        KeyEvent.keyCodeToString(i);
        return false;
    }

    @Override // com.carstream.tech.car.CarActivityBase, com.google.android.gms.car.CarActivityHost.HostedCarActivity
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (this.keys.a.locked) {
            return false;
        }
        KeyEvent.keyCodeToString(i);
        return false;
    }

    @Override // com.carstream.tech.car.CarActivityBase, com.google.android.gms.car.CarActivityHost.HostedCarActivity
    public void onPause() {
        boolean z = this.resumed;
        this.resumed = false;
        if (!this.locked && z) {
            who();
            this.dangPhatKhiRoiDi = this.keepAliveWanted;
            this.onScreen = false;
            syncScreenFlags(false);
        }
    }

    @Override // com.carstream.tech.car.CarActivityBase, com.google.android.gms.car.CarActivityHost.HostedCarActivity
    public void onResume() {
        CarNavigationStatusManager carNavigationStatusManager;
        if (this.resumed) {
            return;
        }
        this.resumed = true;
        if (this.locked) {
            return;
        }
        who();
        k1.s(getApplicationContext());
        applyRail();
        this.speedOverlay.c();
        j2 j2Var = this.carHud;
        if (j2Var != null && j2Var.d && j2Var.e && (carNavigationStatusManager = j2Var.c) != null) {
            try {
                carNavigationStatusManager.sendNavigationStatus(1);
                j2Var.e = false;
                j2Var.f = "";
                j2Var.b();
            } catch (Throwable th) {
                String.valueOf(th);
            }
        }
        this.keeper.d();
        if (this.dangPhatKhiRoiDi) {
            this.debounce.postDelayed(new defpackage.f(this, 14), 400L);
        }
        this.onScreen = true;
        syncScreenFlags(true);
        refullscreenOnResume();
    }

    @Override // com.carstream.tech.car.CarActivityBase, com.google.android.gms.car.CarActivityHost.HostedCarActivity
    public void onStart() {
        q4 q4Var;
        WebView webView;
        if (this.started) {
            return;
        }
        this.started = true;
        if (this.locked) {
            return;
        }
        if (!ec.j(this)) {
            lockAllNow("het han / thu hoi");
            return;
        }
        a6.c(getApplicationContext());
        startLicenseWatch();
        who();
        if (this.gamesShowing && (q4Var = this.games) != null && q4Var.j != null && (webView = q4Var.i) != null) {
            webView.onResume();
            q4Var.i.evaluateJavascript("window.dispatchEvent(new Event('cargame:resume'))", null);
        }
        z6.v(this.carHooks, true);
    }

    @Override // com.carstream.tech.car.CarActivityBase, com.google.android.gms.car.CarActivityHost.HostedCarActivity
    public void onStop() {
        q4 q4Var;
        boolean z = this.started;
        this.started = false;
        if (!this.locked && z) {
            stopLicenseWatch();
            who();
            if (this.gamesShowing && (q4Var = this.games) != null) {
                q4Var.d();
            }
            z6.v(this.carHooks, false);
        }
    }

    @Override // com.carstream.tech.car.CarActivityBase, com.google.android.gms.car.CarActivityHost.HostedCarActivity
    public void onWindowFocusChanged(boolean z, boolean z2) {
        if (this.locked) {
            return;
        }
        u uVar = this.keeper;
        boolean z3 = uVar.a.a.keepAliveWanted;
        if (!z) {
            uVar.c = System.currentTimeMillis();
            return;
        }
        long jCurrentTimeMillis = uVar.c > 0 ? System.currentTimeMillis() - uVar.c : 0L;
        uVar.c = 0L;
        if (jCurrentTimeMillis < 800) {
            return;
        }
        uVar.d();
    }

    public void openApp(dd ddVar) {
        openApp(ddVar, null);
    }

    public boolean pageTrusted() {
        WebView webView = this.web;
        if (webView != null && this.currentApp != null) {
            String strValueOf = String.valueOf(webView.getUrl());
            String str = this.currentApp.d;
            if (str != null && str.startsWith(TRANG_NHA) && strValueOf.startsWith(TRANG_NHA)) {
                return true;
            }
            try {
                return sameSite(Uri.parse(String.valueOf(this.web.getUrl())).getHost(), Uri.parse(this.currentApp.d).getHost());
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    public void pauseNow() {
        try {
            ((e) this.webPlayer).r();
        } catch (Throwable th) {
            String.valueOf(th);
        }
    }

    public void railAfterSettingChange() {
        ViewGroup viewGroup;
        a aVar = this.rail;
        if (aVar == null || this.splashShowing) {
            return;
        }
        LinearLayout linearLayout = aVar.c;
        if (linearLayout != null && (viewGroup = (ViewGroup) linearLayout.getParent()) != null) {
            int iIndexOfChild = viewGroup.indexOfChild(aVar.c);
            ViewGroup.LayoutParams layoutParams = aVar.c.getLayoutParams();
            boolean z = aVar.h;
            viewGroup.removeView(aVar.c);
            LinearLayout linearLayoutC = aVar.c();
            aVar.c = linearLayoutC;
            viewGroup.addView(linearLayoutC, iIndexOfChild, layoutParams);
            aVar.h = z;
            aVar.i();
        }
        applyRail();
        syncRailSelection();
    }

    public void rebuildControlBar() {
        l3 l3Var;
        String str;
        if (this.rootLayout == null || this.currentApp == null || (str = (l3Var = this.controlBar).e) == null || str.equals(xc.g(l3Var.a, "playerStyle", "pill"))) {
            return;
        }
        this.rootLayout.removeView(this.controlBar.c);
        this.rootLayout.addView(this.controlBar.a(this.currentApp.i), this.controlBar.b(this.currentApp.i));
        giuTrenCung();
        revealControls();
    }

    public void recordWatch(String str, String str2, String str3, long j, long j2) {
        dd ddVar = this.currentApp;
        if (ddVar == null || str2 == null || str2.trim().isEmpty() || "tiktok".equals(ddVar.a) || str == null || str.trim().isEmpty()) {
            return;
        }
        if (j2 <= 0 || j2 >= COI_NHU_HET_MS) {
            WebView webView = this.web;
            String strReopenUrl = reopenUrl(ddVar, str, webView != null ? webView.getUrl() : null);
            if ((str3 == null || str3.isEmpty()) && "youtube".equals(ddVar.a) && str.matches("[A-Za-z0-9_-]{6,}")) {
                str3 = ad.d("https://i.ytimg.com/vi/", str, "/hqdefault.jpg");
            }
            String str4 = ddVar.a;
            synchronized (xc.class) {
                if (str4 != null) {
                    try {
                        if (!str2.trim().isEmpty()) {
                            if (str.isEmpty()) {
                                str = strReopenUrl;
                            }
                            if (str != null && !str.isEmpty()) {
                                try {
                                    JSONArray jSONArray = new JSONArray(xc.l(this).getString(xc.h("watchHistory"), "[]"));
                                    JSONObject jSONObject = new JSONObject();
                                    jSONObject.put("s", str4);
                                    jSONObject.put("k", str);
                                    jSONObject.put("t", str2);
                                    if (str3 == null) {
                                        str3 = "";
                                    }
                                    jSONObject.put("th", str3);
                                    if (strReopenUrl == null) {
                                        strReopenUrl = "";
                                    }
                                    jSONObject.put("u", strReopenUrl);
                                    jSONObject.put("p", j);
                                    jSONObject.put("d", j2);
                                    jSONObject.put("at", System.currentTimeMillis());
                                    JSONArray jSONArray2 = new JSONArray();
                                    jSONArray2.put(jSONObject);
                                    for (int i = 0; i < jSONArray.length() && jSONArray2.length() < 12; i++) {
                                        JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                                        if (jSONObjectOptJSONObject != null && (!str4.equals(jSONObjectOptJSONObject.optString("s")) || !str.equals(jSONObjectOptJSONObject.optString("k")))) {
                                            jSONArray2.put(jSONObjectOptJSONObject);
                                        }
                                    }
                                    xc.p(this, "watchHistory", jSONArray2.toString());
                                } catch (Exception unused) {
                                }
                            }
                        }
                    } finally {
                    }
                }
            }
            if (this.homeShowing) {
                refreshHome();
            }
        }
    }

    public void reloadIfCodecChanged() {
        if (this.web == null || this.currentApp == null || this.codecApplied == highCodec()) {
            return;
        }
        this.web.reload();
    }

    public void showHome() {
        leaveGames();
        leaveLauncher();
        this.homeShowing = true;
        this.webColumn.setVisibility(8);
        this.placeholder.setVisibility(0);
        refreshHome();
        tickHome();
        this.debounce.removeCallbacks(this.homeTicker);
        this.debounce.postDelayed(this.homeTicker, HOME_TICK_MS);
        syncSearchFab();
        syncControlBar(this.currentApp);
        applyRail();
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x017d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void showLauncher() {
        /*
            Method dump skipped, instructions count: 420
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carstream.tech.car.CarScreen.showLauncher():void");
    }

    public void showSheet(String str) {
        int i;
        if (!isFullscreen() || this.sheet == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(str);
            int i2 = 0;
            while (true) {
                String str2 = "1";
                if (i2 >= jSONArray.length()) {
                    break;
                }
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i2);
                if (jSONObjectOptJSONObject != null) {
                    String strOptString = jSONObjectOptJSONObject.optString("label");
                    if (!jSONObjectOptJSONObject.optBoolean("on")) {
                        str2 = "0";
                    }
                    arrayList.add(new String[]{strOptString, str2});
                }
                i2++;
            }
            c8 c8Var = this.sheet;
            FrameLayout frameLayout = this.rootLayout;
            int height = frameLayout == null ? 0 : frameLayout.getHeight();
            CarScreen carScreen = c8Var.a;
            if (c8Var.c == null || arrayList.isEmpty()) {
                return;
            }
            c8Var.f.removeAllViews();
            LinearLayout linearLayout = null;
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                int i4 = i3 % 3;
                if (i4 == 0) {
                    linearLayout = new LinearLayout(carScreen);
                    linearLayout.setOrientation(0);
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                    layoutParams.bottomMargin = k1.g(carScreen, 8.0f);
                    c8Var.f.addView(linearLayout, layoutParams);
                }
                String[] strArr = (String[]) arrayList.get(i3);
                String str3 = strArr[0];
                boolean zEquals = "1".equals(strArr[1]);
                LinearLayout linearLayout2 = new LinearLayout(carScreen);
                linearLayout2.setOrientation(1);
                linearLayout2.setGravity(17);
                linearLayout2.setMinimumHeight(k1.g(carScreen, 76.0f));
                int iG = k1.g(carScreen, 10.0f);
                linearLayout2.setPadding(iG, iG, iG, iG);
                k1.B(linearLayout2, zEquals ? -14683 : 536474861, false, k1.g(carScreen, 18.0f));
                linearLayout2.setOnClickListener(new b8(i3, c8Var, 0));
                TextView textView = new TextView(carScreen);
                textView.setText(str3);
                textView.setGravity(17);
                textView.setTextColor(zEquals ? -14672355 : -396051);
                textView.setTypeface(d8.f(carScreen, 1));
                textView.setTextSize(0, d8.m(carScreen, 20.0f));
                textView.setIncludeFontPadding(true);
                linearLayout2.addView(textView);
                String str4 = "";
                if (str3 != null) {
                    String lowerCase = str3.toLowerCase();
                    if (lowerCase.contains("auto") || lowerCase.contains("tự động") || lowerCase.contains("tu dong")) {
                        str4 = "theo mạng";
                    } else if (lowerCase.contains("1080")) {
                        str4 = "~3,0 GB/h";
                    } else if (lowerCase.contains("1440") || lowerCase.contains("2160") || lowerCase.contains("4k")) {
                        str4 = "~6,0 GB/h";
                    } else if (lowerCase.contains("720")) {
                        str4 = "~1,5 GB/h";
                    } else if (lowerCase.contains("480") || lowerCase.contains("large")) {
                        str4 = "~660 MB/h";
                    } else if (lowerCase.contains("360") || lowerCase.contains("medium")) {
                        str4 = "~370 MB/h";
                    } else if (lowerCase.contains("240") || lowerCase.contains("small")) {
                        str4 = "~180 MB/h";
                    } else if (lowerCase.contains("144") || lowerCase.contains("tiny")) {
                        str4 = "chỉ nghe";
                    }
                }
                if (str4.isEmpty()) {
                    i = -2;
                } else {
                    TextView textView2 = new TextView(carScreen);
                    textView2.setText(str4);
                    textView2.setGravity(17);
                    textView2.setTypeface(Typeface.MONOSPACE);
                    textView2.setTextColor(zEquals ? -1289740771 : -4147547);
                    textView2.setTextSize(0, d8.m(carScreen, 13.0f));
                    i = -2;
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams2.topMargin = k1.g(carScreen, 2.0f);
                    linearLayout2.addView(textView2, layoutParams2);
                }
                LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(0, i, 1.0f);
                if (i4 != 0) {
                    layoutParams3.leftMargin = k1.g(carScreen, 8.0f);
                }
                linearLayout2.setLayoutParams(layoutParams3);
                linearLayout.addView(linearLayout2);
            }
            int size = arrayList.size() % 3;
            if (size != 0 && linearLayout != null) {
                while (size < 3) {
                    View view = new View(carScreen);
                    LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(0, 1, 1.0f);
                    layoutParams4.leftMargin = k1.g(carScreen, 8.0f);
                    linearLayout.addView(view, layoutParams4);
                    size++;
                }
            }
            c8Var.g.setText("Chất lượng");
            LinearLayout linearLayout3 = c8Var.d;
            if (linearLayout3 != null && c8Var.e != null && height > 0) {
                FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) linearLayout3.getLayoutParams();
                layoutParams5.height = -2;
                c8Var.d.setLayoutParams(layoutParams5);
                int iMin = Math.min((height - layoutParams5.topMargin) - layoutParams5.bottomMargin, (int) (height * 0.65f));
                int iG2 = k1.g(carScreen, 68.0f);
                int iG3 = k1.g(carScreen, 64.0f);
                int childCount = c8Var.f.getChildCount() * iG2;
                int iMax = Math.max(iG2, iMin - iG3);
                ViewGroup.LayoutParams layoutParams6 = c8Var.e.getLayoutParams();
                layoutParams6.height = childCount > iMax ? iMax : -2;
                c8Var.e.setLayoutParams(layoutParams6);
            }
            c8Var.c.setVisibility(0);
            c8Var.c.bringToFront();
            arrayList.size();
        } catch (JSONException e) {
            e.getMessage();
        }
    }

    public boolean speedBubbleCenter(float[] fArr) {
        SpeedBubble speedBubble;
        za zaVar = this.speedOverlay;
        if (zaVar == null || (speedBubble = zaVar.c) == null || speedBubble.getVisibility() != 0 || speedBubble.getWidth() == 0 || speedBubble.getHeight() == 0) {
            return false;
        }
        speedBubble.getLocationOnScreen(new int[2]);
        fArr[0] = (speedBubble.getWidth() / 2.0f) + r2[0];
        fArr[1] = (speedBubble.getHeight() / 2.0f) + r2[1];
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void syncControlBar(defpackage.dd r7) {
        /*
            r6 = this;
            boolean r0 = r6.settingsShowing
            r1 = 8
            if (r0 != 0) goto L7f
            boolean r0 = r6.homeShowing
            if (r0 != 0) goto L7f
            boolean r0 = r6.pageOverlayShown
            if (r0 == 0) goto L10
            goto L7f
        L10:
            l3 r0 = r6.controlBar
            com.carstream.tech.car.e r2 = r0.b
            com.carstream.tech.car.CarScreen r2 = r2.b
            android.view.View r3 = r0.c
            if (r3 != 0) goto L1b
            goto L5f
        L1b:
            r3 = 0
            if (r7 == 0) goto L32
            cd r7 = r7.i
            int r7 = r7.a
            int r7 = defpackage.ad.h(r7)
            r4 = 1
            if (r7 == r4) goto L50
            r5 = 2
            if (r7 == r5) goto L4e
            r5 = 3
            if (r7 == r5) goto L43
            r5 = 4
            if (r7 == r5) goto L34
        L32:
            r4 = r3
            goto L50
        L34:
            boolean r7 = r2.isFullscreen()
            if (r7 == 0) goto L32
            boolean r7 = r2.pageControlsShown
            if (r7 != 0) goto L32
            boolean r7 = r2.controlsRevealed
            if (r7 == 0) goto L32
            goto L50
        L43:
            boolean r7 = r2.isFullscreen()
            if (r7 == 0) goto L32
            boolean r7 = r2.controlsRevealed
            if (r7 == 0) goto L32
            goto L50
        L4e:
            boolean r4 = r2.controlsRevealed
        L50:
            android.view.View r7 = r0.c
            if (r4 == 0) goto L55
            r1 = r3
        L55:
            r7.setVisibility(r1)
            if (r4 == 0) goto L5f
            android.view.View r7 = r0.c
            r7.bringToFront()
        L5f:
            l3 r7 = r6.controlBar
            boolean r0 = r6.isFullscreen()
            s8 r7 = r7.d
            if (r7 == 0) goto L6c
            r7.d(r0)
        L6c:
            l3 r7 = r6.controlBar
            android.view.View r7 = r7.c
            if (r7 == 0) goto L88
            int r7 = r7.getVisibility()
            if (r7 != 0) goto L88
            r6.keepBarAboveFullscreen()
            r6.startBarTicker()
            return
        L7f:
            l3 r7 = r6.controlBar
            android.view.View r7 = r7.c
            if (r7 == 0) goto L88
            r7.setVisibility(r1)
        L88:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carstream.tech.car.CarScreen.syncControlBar(dd):void");
    }

    public void syncScreenFlags(boolean z) {
        js("window.__cntAutoFullscreen=" + (allowAutoFullscreen(z) ? "true" : "false") + ";window.__cntCanResume=" + (z ? "true" : "false") + ";");
    }

    public void tickHome() {
        if (this.home == null || !this.homeShowing) {
            return;
        }
        String strM = z6.m().isEmpty() ? null : z6.m();
        z4 z4Var = this.home;
        TextView textView = z4Var.e;
        if (textView != null) {
            if (strM == null) {
                strM = "Chưa phát gì";
            }
            textView.setText(strM);
        }
        ImageView imageView = z4Var.f;
        if (imageView != null) {
            w6 w6VarG = z6.g(((s2) z4Var.b).a.carHooks);
            imageView.setImageResource((w6VarG == null || !w6VarG.d) ? R.drawable.ic_play : R.drawable.ic_pause);
        }
        long jK = z6.k();
        z4 z4Var2 = this.home;
        int iO = jK > 0 ? (int) ((z6.o(z6.l()) * 100) / jK) : 0;
        if (z4Var2.h != null && z4Var2.i != null) {
            int iMax = Math.max(0, Math.min(100, iO));
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) z4Var2.h.getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) z4Var2.i.getLayoutParams();
            layoutParams.weight = iMax;
            layoutParams2.weight = 100 - iMax;
            z4Var2.h.setLayoutParams(layoutParams);
            z4Var2.i.setLayoutParams(layoutParams2);
        }
        String strX = z6.x();
        if (strX == null) {
            ImageView imageView2 = this.home.g;
            if (imageView2 != null) {
                imageView2.setImageBitmap(null);
                return;
            }
            return;
        }
        Bitmap bitmapA = vb.a(strX);
        if (bitmapA == null) {
            vb.c(this, strX, new z(this, strX));
            return;
        }
        ImageView imageView3 = this.home.g;
        if (imageView3 != null) {
            imageView3.setImageBitmap(bitmapA);
        }
    }

    public void toggleFullscreen() {
        if (isFullscreen()) {
            exitFullscreen();
            return;
        }
        c cVar = this.autoOpen;
        cVar.f();
        cVar.b.postDelayed(new f1(cVar, 1), 200L);
    }

    public synchronized String webLogLine(String str, String str2) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (jUptimeMillis - this.webLogWindowAt > HOME_TICK_MS) {
            this.webLogWindowAt = jUptimeMillis;
            this.webLogInWindow = 0;
            if (this.webLogDropped) {
                this.webLogDropped = false;
                return str + " (da bo bot dong: trang ghi qua day)";
            }
        }
        int i = this.webLogInWindow + 1;
        this.webLogInWindow = i;
        if (i > 20) {
            this.webLogDropped = true;
            return null;
        }
        if (str2 == null) {
            str2 = "null";
        }
        if (str2.length() > WEB_LOG_CHARS) {
            str2 = str2.substring(0, WEB_LOG_CHARS) + "...(cat)";
        }
        return str + str2;
    }

    public void openApp(dd ddVar, String str) {
        c cVar;
        WebView webView;
        if (ddVar == null) {
            return;
        }
        cd cdVar = ddVar.i;
        String str2 = ddVar.a;
        String str3 = (str == null || str.isEmpty()) ? ddVar.d : str;
        hideSettings();
        leaveGames();
        leaveLauncher();
        this.homeShowing = false;
        dd ddVar2 = this.currentApp;
        boolean z = ddVar2 != null && ddVar2.a.equals(str2);
        this.currentApp = ddVar;
        datQuyenDocFile(ddVar);
        applyUserAgent(ddVar);
        this.placeholder.setVisibility(8);
        this.webColumn.setVisibility(0);
        syncSearchFab();
        this.rootLayout.removeView(this.controlBar.c);
        this.rootLayout.addView(this.controlBar.a(cdVar), this.controlBar.b(cdVar));
        giuTrenCung();
        this.pageControlsShown = false;
        this.pageOverlayShown = false;
        syncControlBar(ddVar);
        applyRail();
        if (controlsAutoHide()) {
            revealControls();
        }
        syncUrl(str3);
        if (str != null || !z || (webView = this.web) == null || TextUtils.isEmpty(webView.getUrl())) {
            leaveFullscreenForCommand();
            u6 u6Var = this.carHooks;
            String str4 = ddVar.b;
            int i = ddVar.c;
            w6 w6VarG = z6.g(u6Var);
            if (w6VarG != null) {
                if (str2 == null) {
                    str2 = "";
                }
                w6VarG.m = str2;
                if (str4 == null) {
                    str4 = "";
                }
                w6VarG.n = str4;
                w6VarG.o = i;
            }
            z6.t(this.carHooks, "", "", 0L, 0L, false);
            t9 t9Var = this.searchBar;
            defpackage.h hVar = t9Var.k;
            if (hVar != null) {
                t9Var.c.removeCallbacks(hVar);
                t9Var.k = null;
            }
            t9Var.g(null);
            u uVar = this.keeper;
            h hVar2 = uVar.d;
            if (hVar2 != null) {
                uVar.b.removeCallbacks(hVar2);
                uVar.d = null;
            }
            uVar.e = 0L;
            uVar.c(false);
            this.keepAliveWanted = false;
            z6.u(this.carHooks, false);
            WebView webView2 = this.web;
            if (webView2 != null) {
                webView2.stopLoading();
                this.web.clearHistory();
                this.web.clearCache(false);
            }
            recreateWebView();
            applyUserAgent(ddVar);
            WebView webView3 = this.web;
            if (webView3 != null) {
                webView3.loadUrl(str3);
            }
            if (str == null || (cVar = this.autoOpen) == null || !cVar.e(str3)) {
                return;
            }
            this.autoOpen.d = true;
        }
    }

    @Override // com.carstream.tech.car.CarActivityBase, com.google.android.gms.car.CarActivityHost.HostedCarActivity
    public void onFrameRateChange(int i) {
    }

    @Override // com.carstream.tech.car.CarActivityBase, com.google.android.gms.car.CarActivityHost.HostedCarActivity
    public void onPowerStateChange(int i) {
    }
}
