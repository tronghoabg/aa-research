package com.google.android.gms.internal.ads;

import A7.AbstractC0279p0;
import A7.CallableC0305y0;
import D6.C0392q;
import D6.C0395s;
import G6.C0537a;
import G6.U;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.internal.ads.zzbic;
import com.unity3d.ads.BuildConfig;
import com.unity3d.ads.adplayer.AndroidWebViewClient;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.di.ServiceProvider;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import ka.AbstractC3256n;
import n7.InterfaceC3600e;
import org.json.JSONException;
import org.json.JSONObject;
import x3.AbstractC4467j;
import y3.AbstractC4557o;

/* loaded from: classes3.dex */
final class zzcme extends WebView implements DownloadListener, ViewTreeObserver.OnGlobalLayoutListener, zzclb {
    public static final /* synthetic */ int zza = 0;
    private final String zzA;
    private zzcmh zzB;
    private boolean zzC;
    private boolean zzD;
    private zzbly zzE;
    private zzblv zzF;
    private zzbgk zzG;
    private int zzH;
    private int zzI;
    private zzbjj zzJ;
    private final zzbjj zzK;
    private zzbjj zzL;
    private final zzbjk zzM;
    private int zzN;
    private F6.l zzO;
    private boolean zzP;
    private final G6.K zzQ;
    private int zzR;
    private int zzS;
    private int zzT;
    private int zzU;
    private int zzV;
    private Map zzW;
    private final WindowManager zzX;
    private final zzbhw zzY;
    private boolean zzZ;
    private final zzcnd zzb;
    private final zzbaw zzc;
    private final zzflk zzd;
    private final zzbke zze;
    private final H6.a zzf;
    private C6.h zzg;
    private final C6.a zzh;
    private final DisplayMetrics zzi;
    private final float zzj;
    private zzfkn zzk;
    private zzfkq zzl;
    private boolean zzm;
    private boolean zzn;
    private zzclm zzo;
    private F6.l zzp;
    private zzelv zzq;
    private zzelt zzr;
    private zzcnl zzs;
    private final String zzt;
    private boolean zzu;
    private boolean zzv;
    private boolean zzw;
    private boolean zzx;
    private Boolean zzy;
    private boolean zzz;

    public zzcme(zzcnd zzcndVar, zzcnl zzcnlVar, String str, boolean z2, boolean z10, zzbaw zzbawVar, zzbke zzbkeVar, H6.a aVar, zzbjm zzbjmVar, C6.h hVar, C6.a aVar2, zzbhw zzbhwVar, zzfkn zzfknVar, zzfkq zzfkqVar, zzflk zzflkVar) throws PackageManager.NameNotFoundException {
        zzfkq zzfkqVar2;
        super(zzcndVar);
        boolean z11 = false;
        this.zzm = false;
        this.zzn = false;
        this.zzz = true;
        this.zzA = "";
        this.zzR = -1;
        this.zzS = -1;
        this.zzT = -1;
        this.zzU = -1;
        this.zzV = -1;
        this.zzb = zzcndVar;
        this.zzs = zzcnlVar;
        this.zzt = str;
        this.zzw = z2;
        this.zzc = zzbawVar;
        this.zzd = zzflkVar;
        this.zze = zzbkeVar;
        this.zzf = aVar;
        this.zzg = hVar;
        this.zzh = aVar2;
        WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
        this.zzX = windowManager;
        U u10 = C6.n.f1857D.f1863c;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        this.zzi = displayMetrics;
        this.zzj = displayMetrics.density;
        this.zzY = zzbhwVar;
        this.zzk = zzfknVar;
        this.zzl = zzfkqVar;
        this.zzQ = new G6.K(zzcndVar.zzb(), this, this);
        this.zzZ = false;
        setBackgroundColor(0);
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zznm)).booleanValue()) {
            setSoundEffectsEnabled(false);
        }
        WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        try {
            settings.setJavaScriptEnabled(true);
        } catch (NullPointerException e7) {
            int i5 = G6.L.f4523b;
            H6.l.d("Unable to enable Javascript.", e7);
        }
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        zzbio zzbioVar = zzbix.zznl;
        C0395s c0395s = C0395s.f2489e;
        if (((Boolean) c0395s.f2492c.zzd(zzbioVar)).booleanValue()) {
            settings.setMixedContentMode(1);
        } else {
            settings.setMixedContentMode(2);
        }
        zzbio zzbioVar2 = zzbix.zzoS;
        zzbiv zzbivVar = c0395s.f2492c;
        if (((Boolean) zzbivVar.zzd(zzbioVar2)).booleanValue()) {
            settings.setGeolocationEnabled(false);
        }
        C6.n nVar = C6.n.f1857D;
        settings.setUserAgentString(nVar.f1863c.E(zzcndVar, aVar.f4927a));
        Context context = getContext();
        S3.f.R(context, new CallableC0305y0(settings, z11, context, 6));
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setMediaPlaybackRequiresUserGesture(false);
        setDownloadListener(this);
        zzbc();
        addJavascriptInterface(new zzcmm(this, new zzcml() { // from class: com.google.android.gms.internal.ads.zzcmk
            @Override // com.google.android.gms.internal.ads.zzcml
            public final /* synthetic */ void zza(Uri uri) {
                zzclm zzclmVarZzaS = ((zzcme) this).zzaS();
                if (zzclmVarZzaS != null) {
                    zzclmVarZzaS.zzQ(uri);
                } else {
                    int i10 = G6.L.f4523b;
                    H6.l.c("Unable to pass GMSG, no AdWebViewClient for AdWebView!");
                }
            }
        }), "googleAdsJsInterface");
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
        zzbh();
        zzbjk zzbjkVar = new zzbjk(new zzbjm(true, "make_wv", this.zzt));
        this.zzM = zzbjkVar;
        Context contextCreatePackageContext = null;
        zzbjkVar.zzc().zza(null);
        if (((Boolean) zzbivVar.zzd(zzbix.zzcG)).booleanValue() && (zzfkqVar2 = this.zzl) != null && zzfkqVar2.zzb != null) {
            zzbjkVar.zzc().zzd("gqi", this.zzl.zzb);
        }
        zzbjkVar.zzc();
        zzbjj zzbjjVarZzf = zzbjm.zzf();
        this.zzK = zzbjjVarZzf;
        zzbjkVar.zza("native:view_create", zzbjjVarZzf);
        this.zzL = null;
        this.zzJ = null;
        if (B8.e.f1611c == null) {
            B8.e.f1611c = new B8.e();
        }
        B8.e eVar = B8.e.f1611c;
        eVar.getClass();
        G6.L.k("Updating user agent.");
        String defaultUserAgent = WebSettings.getDefaultUserAgent(zzcndVar);
        if (!defaultUserAgent.equals(eVar.f1613b)) {
            int i10 = d7.i.f34135e;
            try {
                contextCreatePackageContext = zzcndVar.createPackageContext("com.google.android.gms", 3);
            } catch (PackageManager.NameNotFoundException unused) {
            }
            if (contextCreatePackageContext == null) {
                zzcndVar.getSharedPreferences("admob_user_agent", 0).edit().putString("user_agent", WebSettings.getDefaultUserAgent(zzcndVar)).apply();
            }
            eVar.f1613b = defaultUserAgent;
        }
        G6.L.k("User agent is updated.");
        nVar.f1868h.zzk();
    }

    private final synchronized void zzaZ(String str) {
        final String str2 = AndroidWebViewClient.BLANK_PAGE;
        try {
            U.f4562l.post(new Runnable(str2) { // from class: com.google.android.gms.internal.ads.zzcmb
                private final /* synthetic */ String zzb = AndroidWebViewClient.BLANK_PAGE;

                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzaW(this.zzb);
                }
            });
        } catch (Throwable th) {
            C6.n.f1857D.f1868h.zzh(th, "AdWebViewImpl.loadUrlUnsafe");
            int i5 = G6.L.f4523b;
            H6.l.g("Could not call loadUrl in destroy(). ", th);
        }
    }

    private final synchronized void zzba() {
        Boolean boolZzc = C6.n.f1857D.f1868h.zzc();
        this.zzy = boolZzc;
        if (boolZzc == null) {
            try {
                evaluateJavascript("(function(){})()", null);
                zzaQ(Boolean.TRUE);
            } catch (IllegalStateException unused) {
                zzaQ(Boolean.FALSE);
            }
        }
    }

    private final void zzbb() {
        zzbje.zza(this.zzM.zzc(), this.zzK, "aeh2");
    }

    private final synchronized void zzbc() {
        zzfkn zzfknVar = this.zzk;
        if (zzfknVar != null && zzfknVar.zzam) {
            int i5 = G6.L.f4523b;
            H6.l.a("Disabling hardware acceleration on an overlay.");
            zzbd();
            return;
        }
        if (!this.zzw && !this.zzs.zzg()) {
            int i10 = G6.L.f4523b;
            H6.l.a("Enabling hardware acceleration on an AdView.");
            zzbe();
            return;
        }
        int i11 = G6.L.f4523b;
        H6.l.a("Enabling hardware acceleration on an overlay.");
        zzbe();
    }

    private final synchronized void zzbd() {
        try {
            if (!this.zzx) {
                setLayerType(1, null);
            }
            this.zzx = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized void zzbe() {
        try {
            if (this.zzx) {
                setLayerType(0, null);
            }
            this.zzx = false;
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized void zzbf() {
        if (this.zzP) {
            return;
        }
        this.zzP = true;
        C6.n.f1857D.f1868h.zzl();
    }

    private final synchronized void zzbg() {
        try {
            Map map = this.zzW;
            if (map != null) {
                Iterator it = map.values().iterator();
                while (it.hasNext()) {
                    ((zzcjh) it.next()).release();
                }
            }
            this.zzW = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    private final void zzbh() {
        zzbjk zzbjkVar = this.zzM;
        if (zzbjkVar == null) {
            return;
        }
        zzbjm zzbjmVarZzc = zzbjkVar.zzc();
        zzbjc zzbjcVarZza = C6.n.f1857D.f1868h.zza();
        if (zzbjcVarZza != null) {
            zzbjcVarZza.zzb(zzbjmVarZzc);
        }
    }

    private final void zzbi(boolean z2) {
        HashMap map = new HashMap();
        map.put("isVisible", true != z2 ? "0" : UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
        zze("onAdVisibilityChanged", map);
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzclb
    public final synchronized void destroy() {
        View decorView;
        try {
            zzbh();
            G6.K k = this.zzQ;
            k.f4521e = false;
            Activity activity = k.f4518b;
            if (activity != null && k.f4519c) {
                Window window = activity.getWindow();
                ViewTreeObserver viewTreeObserver = (window == null || (decorView = window.getDecorView()) == null) ? null : decorView.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(k.f4522f);
                }
                k.f4519c = false;
            }
            F6.l lVar = this.zzp;
            if (lVar != null) {
                lVar.zzb();
                this.zzp.zzq();
                this.zzp = null;
            }
            this.zzq = null;
            this.zzr = null;
            this.zzo.zzF();
            this.zzG = null;
            this.zzg = null;
            setOnClickListener(null);
            setOnTouchListener(null);
            if (this.zzv) {
                return;
            }
            C6.n.f1857D.f1859B.zza(this);
            zzbg();
            this.zzv = true;
            if (!((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzmt)).booleanValue()) {
                G6.L.k("Destroying the WebView immediately...");
                zzY();
                return;
            }
            Activity activityZzb = this.zzb.zzb();
            if (activityZzb != null && activityZzb.isDestroyed()) {
                G6.L.k("Destroying the WebView immediately...");
                zzY();
            } else {
                G6.L.k("Initiating WebView self destruct sequence in 3...");
                G6.L.k("Loading blank page in WebView, 2...");
                zzaZ(AndroidWebViewClient.BLANK_PAGE);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.webkit.WebView
    public final synchronized void evaluateJavascript(final String str, final ValueCallback valueCallback) {
        if (zzX()) {
            int i5 = G6.L.f4523b;
            H6.l.i("#004 The webview is destroyed. Ignoring action.", null);
            if (valueCallback != null) {
                valueCallback.onReceiveValue(null);
                return;
            }
            return;
        }
        if (!((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzmu)).booleanValue() || Looper.getMainLooper().getThread() == Thread.currentThread()) {
            super.evaluateJavascript(str, valueCallback);
        } else {
            zzcfy.zzf.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcmd
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzaU(str, valueCallback);
                }
            });
        }
    }

    public final void finalize() throws Throwable {
        try {
            synchronized (this) {
                try {
                    if (!this.zzv) {
                        this.zzo.zzF();
                        C6.n.f1857D.f1859B.zza(this);
                        zzbg();
                        zzbf();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } finally {
            super.finalize();
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzclb
    public final synchronized void loadData(String str, String str2, String str3) {
        if (!zzX()) {
            super.loadData(str, str2, str3);
        } else {
            int i5 = G6.L.f4523b;
            H6.l.f("#004 The webview is destroyed. Ignoring action.");
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzclb
    public final synchronized void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) throws Throwable {
        try {
            try {
                if (!zzX()) {
                    super.loadDataWithBaseURL(str, str2, str3, str4, str5);
                } else {
                    int i5 = G6.L.f4523b;
                    H6.l.f("#004 The webview is destroyed. Ignoring action.");
                }
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzclb
    public final synchronized void loadUrl(final String str) {
        if (zzX()) {
            int i5 = G6.L.f4523b;
            H6.l.f("#004 The webview is destroyed. Ignoring action.");
            return;
        }
        try {
            U.f4562l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcma
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzaV(str);
                }
            });
        } catch (Throwable th) {
            C6.n.f1857D.f1868h.zzh(th, "AdWebViewImpl.loadUrl");
            int i10 = G6.L.f4523b;
            H6.l.g("Could not call loadUrl. ", th);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzclb, D6.InterfaceC0358a
    public final void onAdClicked() {
        zzclm zzclmVar = this.zzo;
        if (zzclmVar != null) {
            zzclmVar.onAdClicked();
        }
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public final synchronized void onAttachedToWindow() {
        try {
            super.onAttachedToWindow();
            boolean z2 = true;
            if (!zzX()) {
                G6.K k = this.zzQ;
                k.f4520d = true;
                if (k.f4521e) {
                    k.a();
                }
            }
            if (this.zzZ) {
                onResume();
                this.zzZ = false;
            }
            boolean z10 = this.zzC;
            zzclm zzclmVar = this.zzo;
            if (zzclmVar == null || !zzclmVar.zzl()) {
                z2 = z10;
            } else {
                if (!this.zzD) {
                    this.zzo.zzo();
                    this.zzo.zzp();
                    this.zzD = true;
                }
                zzaM();
            }
            zzbi(z2);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        zzclm zzclmVar;
        View decorView;
        synchronized (this) {
            try {
                if (!zzX()) {
                    G6.K k = this.zzQ;
                    k.f4520d = false;
                    Activity activity = k.f4518b;
                    if (activity != null && k.f4519c) {
                        Window window = activity.getWindow();
                        ViewTreeObserver viewTreeObserver = (window == null || (decorView = window.getDecorView()) == null) ? null : decorView.getViewTreeObserver();
                        if (viewTreeObserver != null) {
                            viewTreeObserver.removeOnGlobalLayoutListener(k.f4522f);
                        }
                        k.f4519c = false;
                    }
                }
                super.onDetachedFromWindow();
                if (this.zzD && (zzclmVar = this.zzo) != null && zzclmVar.zzl() && getViewTreeObserver() != null && getViewTreeObserver().isAlive()) {
                    this.zzo.zzo();
                    this.zzo.zzp();
                    this.zzD = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        zzbi(false);
    }

    @Override // android.webkit.DownloadListener
    public final void onDownloadStart(String str, String str2, String str3, String str4, long j8) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.parse(str), str4);
            if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzmI)).booleanValue() && getContext() != null) {
                intent.setPackage(getContext().getPackageName());
            }
            U u10 = C6.n.f1857D.f1863c;
            U.s(getContext(), intent);
        } catch (ActivityNotFoundException e7) {
            String strH = AbstractC3256n.h(new StringBuilder(String.valueOf(str).length() + 51 + String.valueOf(str4).length()), "Couldn't find an Activity to view url/mimetype: ", str, " / ", str4);
            int i5 = G6.L.f4523b;
            H6.l.a(strH);
            C6.n.f1857D.f1868h.zzh(e7, "AdWebViewImpl.onDownloadStart: ".concat(String.valueOf(str)));
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onDraw(Canvas canvas) {
        if (zzX()) {
            return;
        }
        super.onDraw(canvas);
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float axisValue = motionEvent.getAxisValue(9);
        float axisValue2 = motionEvent.getAxisValue(10);
        if (motionEvent.getActionMasked() == 8) {
            if (axisValue > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && !canScrollVertically(-1)) {
                return false;
            }
            if (axisValue < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && !canScrollVertically(1)) {
                return false;
            }
            if (axisValue2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && !canScrollHorizontally(-1)) {
                return false;
            }
            if (axisValue2 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && !canScrollHorizontally(1)) {
                return false;
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() throws JSONException {
        boolean zZzaM = zzaM();
        F6.l lVarZzL = zzL();
        if (lVarZzL != null && zZzaM && lVarZzL.f3981l) {
            lVarZzL.f3981l = false;
            lVarZzL.f3973c.zzI();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008d  */
    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void onMeasure(int r9, int r10) {
        /*
            Method dump skipped, instructions count: 527
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcme.onMeasure(int, int):void");
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzclb
    public final void onPause() {
        if (zzX()) {
            return;
        }
        try {
            super.onPause();
            if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzom)).booleanValue() && com.moloco.sdk.internal.publisher.H.b0("MUTE_AUDIO")) {
                int i5 = G6.L.f4523b;
                H6.l.a("Muting webview");
                boolean z2 = AbstractC4467j.f47677a;
                if (!AbstractC4557o.k.b()) {
                    throw AbstractC4557o.a();
                }
                AbstractC4467j.c(this).f48020a.setAudioMuted(true);
            }
        } catch (Exception e7) {
            int i10 = G6.L.f4523b;
            H6.l.d("Could not pause webview.", e7);
            if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzop)).booleanValue()) {
                C6.n.f1857D.f1868h.zzh(e7, "AdWebViewImpl.onPause");
            }
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzclb
    public final void onResume() {
        if (zzX()) {
            return;
        }
        try {
            super.onResume();
            if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzom)).booleanValue() && com.moloco.sdk.internal.publisher.H.b0("MUTE_AUDIO")) {
                int i5 = G6.L.f4523b;
                H6.l.a("Unmuting webview");
                boolean z2 = AbstractC4467j.f47677a;
                if (!AbstractC4557o.k.b()) {
                    throw AbstractC4557o.a();
                }
                AbstractC4467j.c(this).f48020a.setAudioMuted(false);
            }
        } catch (Exception e7) {
            int i10 = G6.L.f4523b;
            H6.l.d("Could not resume webview.", e7);
            if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzop)).booleanValue()) {
                C6.n.f1857D.f1868h.zzh(e7, "AdWebViewImpl.onResume");
            }
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z2 = ((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzeA)).booleanValue() && this.zzo.zzm();
        if ((!this.zzo.zzl() || this.zzo.zzn()) && !z2) {
            zzbaw zzbawVar = this.zzc;
            if (zzbawVar != null) {
                zzbawVar.zzc(motionEvent);
            }
            zzbke zzbkeVar = this.zze;
            if (zzbkeVar != null) {
                zzbkeVar.zza(motionEvent);
            }
        } else {
            synchronized (this) {
                try {
                    zzbly zzblyVar = this.zzE;
                    if (zzblyVar != null) {
                        zzblyVar.zzb(motionEvent);
                    }
                } finally {
                }
            }
        }
        if (zzX()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzclb
    public final void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        if (webViewClient instanceof zzclm) {
            this.zzo = (zzclm) webViewClient;
        }
    }

    @Override // android.webkit.WebView
    public final void stopLoading() {
        if (zzX()) {
            return;
        }
        try {
            super.stopLoading();
        } catch (Exception e7) {
            int i5 = G6.L.f4523b;
            H6.l.d("Could not stop loading webview.", e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchu
    public final void zzA(int i5) {
    }

    @Override // com.google.android.gms.internal.ads.zzchu
    public final void zzB(int i5) {
    }

    @Override // com.google.android.gms.internal.ads.zzclb, com.google.android.gms.internal.ads.zzcks
    public final zzfkn zzC() {
        return this.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final WebView zzD() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzclb, com.google.android.gms.internal.ads.zzcmw
    public final View zzE() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final List zzF() {
        return new ArrayList();
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final void zzG() {
        zzbb();
        HashMap map = new HashMap(1);
        map.put("version", this.zzf.f4927a);
        zze("onhide", map);
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final void zzH(int i5) {
        if (i5 == 0) {
            zzbjk zzbjkVar = this.zzM;
            zzbje.zza(zzbjkVar.zzc(), this.zzK, "aebb2");
        }
        zzbb();
        zzbjk zzbjkVar2 = this.zzM;
        zzbjkVar2.zzc();
        zzbjkVar2.zzc().zzd("close_type", String.valueOf(i5));
        HashMap map = new HashMap(2);
        map.put("closetype", String.valueOf(i5));
        map.put("version", this.zzf.f4927a);
        zze("onhide", map);
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final void zzI() {
        if (this.zzJ == null) {
            zzbjk zzbjkVar = this.zzM;
            zzbje.zza(zzbjkVar.zzc(), this.zzK, "aes2");
            zzbjkVar.zzc();
            zzbjj zzbjjVarZzf = zzbjm.zzf();
            this.zzJ = zzbjjVarZzf;
            zzbjkVar.zza("native:view_show", zzbjjVarZzf);
        }
        HashMap map = new HashMap(1);
        map.put("version", this.zzf.f4927a);
        zze("onshow", map);
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final void zzJ() {
        HashMap map = new HashMap(3);
        C6.n nVar = C6.n.f1857D;
        map.put("app_muted", String.valueOf(nVar.f1869i.d()));
        map.put("app_volume", String.valueOf(nVar.f1869i.b()));
        map.put("device_volume", String.valueOf(C0537a.e(getContext())));
        zze("volume", map);
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final Context zzK() {
        return this.zzb.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final synchronized F6.l zzL() {
        return this.zzp;
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final synchronized F6.l zzM() {
        return this.zzO;
    }

    @Override // com.google.android.gms.internal.ads.zzclb, com.google.android.gms.internal.ads.zzcmt
    public final synchronized zzcnl zzN() {
        return this.zzs;
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final synchronized String zzO() {
        return this.zzt;
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final /* synthetic */ zzcmz zzP() {
        return this.zzo;
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final WebViewClient zzQ() {
        return this.zzo;
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final synchronized boolean zzR() {
        return this.zzu;
    }

    @Override // com.google.android.gms.internal.ads.zzclb, com.google.android.gms.internal.ads.zzcmu
    public final zzbaw zzS() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final zzflk zzT() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final synchronized zzelv zzU() {
        return this.zzq;
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final synchronized zzelt zzV() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final synchronized boolean zzW() {
        return this.zzw;
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final synchronized boolean zzX() {
        return this.zzv;
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final synchronized void zzY() {
        G6.L.k("Destroying WebView!");
        zzbf();
        U.f4562l.post(new zzclz(this));
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final synchronized boolean zzZ() {
        return this.zzz;
    }

    @Override // com.google.android.gms.internal.ads.zzbtf
    public final void zza(String str) {
        zzaP(str);
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final boolean zzaA(final boolean z2, final int i5) {
        destroy();
        zzbhv zzbhvVar = new zzbhv() { // from class: com.google.android.gms.internal.ads.zzcmc
            @Override // com.google.android.gms.internal.ads.zzbhv
            public final /* synthetic */ void zza(zzbic.zzt.zza zzaVar) {
                int i10 = zzcme.zza;
                zzbic.zzbl.zza zzaVarZzq = zzbic.zzbl.zzq();
                boolean zZzb = zzaVarZzq.zzb();
                boolean z10 = z2;
                if (zZzb != z10) {
                    zzaVarZzq.zzc(z10);
                }
                zzaVarZzq.zzg(i5);
                zzaVar.zzal(zzaVarZzq.zzbu());
            }
        };
        zzbhw zzbhwVar = this.zzY;
        zzbhwVar.zzb(zzbhvVar);
        zzbhwVar.zzc(10003);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final boolean zzaB() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzclb, com.google.android.gms.internal.ads.zzcmi
    public final zzfkq zzaC() {
        return this.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final void zzaD(zzfkn zzfknVar, zzfkq zzfkqVar) {
        this.zzk = zzfknVar;
        this.zzl = zzfkqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final synchronized void zzaE(boolean z2, int i5) {
        if (z2) {
            try {
                setBackgroundColor(0);
            } catch (Throwable th) {
                throw th;
            }
        }
        F6.l lVar = this.zzp;
        if (lVar != null) {
            lVar.X(i5, z2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final p8.p zzaF() {
        zzbke zzbkeVar = this.zze;
        return zzbkeVar == null ? zzhcf.zza(null) : zzbkeVar.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final void zzaG(boolean z2) {
        this.zzZ = true;
    }

    @Override // com.google.android.gms.internal.ads.zzcmr
    public final void zzaH(F6.e eVar, boolean z2, boolean z10, String str) {
        this.zzo.zzv(eVar, z2, z10, str);
    }

    @Override // com.google.android.gms.internal.ads.zzcmr
    public final void zzaI(boolean z2, int i5, boolean z10) {
        this.zzo.zzx(z2, i5, z10);
    }

    @Override // com.google.android.gms.internal.ads.zzcmr
    public final void zzaJ(boolean z2, int i5, String str, boolean z10, boolean z11) {
        this.zzo.zzy(z2, i5, str, z10, z11);
    }

    @Override // com.google.android.gms.internal.ads.zzcmr
    public final void zzaK(boolean z2, int i5, String str, String str2, boolean z10) {
        this.zzo.zzz(z2, i5, str, str2, z10);
    }

    @Override // com.google.android.gms.internal.ads.zzcmr
    public final void zzaL(String str, String str2, int i5) {
        this.zzo.zzw(str, str2, 14);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0095, code lost:
    
        if (r11.zzV != r10) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzaM() throws org.json.JSONException {
        /*
            r11 = this;
            com.google.android.gms.internal.ads.zzclm r0 = r11.zzo
            boolean r0 = r0.zzk()
            r1 = 0
            if (r0 != 0) goto L13
            com.google.android.gms.internal.ads.zzclm r0 = r11.zzo
            boolean r0 = r0.zzl()
            if (r0 != 0) goto L13
            goto L98
        L13:
            D6.q r0 = D6.C0392q.f2477g
            H6.f r2 = r0.f2478a
            android.util.DisplayMetrics r2 = r11.zzi
            int r3 = r2.widthPixels
            float r3 = (float) r3
            float r4 = r2.density
            float r3 = r3 / r4
            int r5 = java.lang.Math.round(r3)
            H6.f r3 = r0.f2478a
            int r3 = r2.heightPixels
            float r3 = (float) r3
            float r4 = r2.density
            float r3 = r3 / r4
            int r6 = java.lang.Math.round(r3)
            com.google.android.gms.internal.ads.zzcnd r3 = r11.zzb
            android.app.Activity r3 = r3.zzb()
            r4 = 1
            if (r3 == 0) goto L61
            android.view.Window r7 = r3.getWindow()
            if (r7 != 0) goto L3f
            goto L61
        L3f:
            C6.n r7 = C6.n.f1857D
            G6.U r7 = r7.f1863c
            int[] r3 = G6.U.p(r3)
            H6.f r7 = r0.f2478a
            r7 = r3[r1]
            float r7 = (float) r7
            float r8 = r2.density
            float r7 = r7 / r8
            int r7 = java.lang.Math.round(r7)
            H6.f r0 = r0.f2478a
            r0 = r3[r4]
            float r0 = (float) r0
            float r3 = r2.density
            float r0 = r0 / r3
            int r0 = java.lang.Math.round(r0)
            r8 = r0
            goto L63
        L61:
            r7 = r5
            r8 = r6
        L63:
            C6.n r0 = C6.n.f1857D
            G6.U r0 = r0.f1863c
            android.view.WindowManager r0 = r11.zzX
            android.view.Display r0 = r0.getDefaultDisplay()
            int r10 = r0.getRotation()
            int r0 = r11.zzS
            if (r0 != r5) goto L99
            int r0 = r11.zzR
            if (r0 != r6) goto L99
            int r0 = r11.zzT
            if (r0 != r7) goto L99
            int r0 = r11.zzU
            if (r0 != r8) goto L99
            com.google.android.gms.internal.ads.zzbio r0 = com.google.android.gms.internal.ads.zzbix.zzaK
            D6.s r3 = D6.C0395s.f2489e
            com.google.android.gms.internal.ads.zzbiv r3 = r3.f2492c
            java.lang.Object r0 = r3.zzd(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L98
            int r0 = r11.zzV
            if (r0 == r10) goto L98
            goto L99
        L98:
            return r1
        L99:
            int r0 = r11.zzS
            if (r0 != r5) goto Lb7
            int r0 = r11.zzR
            if (r0 != r6) goto Lb7
            com.google.android.gms.internal.ads.zzbio r0 = com.google.android.gms.internal.ads.zzbix.zzaK
            D6.s r3 = D6.C0395s.f2489e
            com.google.android.gms.internal.ads.zzbiv r3 = r3.f2492c
            java.lang.Object r0 = r3.zzd(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto Lb8
            int r0 = r11.zzV
            if (r0 == r10) goto Lb8
        Lb7:
            r1 = r4
        Lb8:
            r11.zzS = r5
            r11.zzR = r6
            r11.zzT = r7
            r11.zzU = r8
            r11.zzV = r10
            com.google.android.gms.internal.ads.zzbyn r4 = new com.google.android.gms.internal.ads.zzbyn
            java.lang.String r0 = ""
            r4.<init>(r11, r0)
            float r9 = r2.density
            r4.zzl(r5, r6, r7, r8, r9, r10)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcme.zzaM():boolean");
    }

    public final synchronized void zzaN(String str) {
        if (!zzX()) {
            loadUrl(str);
        } else {
            int i5 = G6.L.f4523b;
            H6.l.f("#004 The webview is destroyed. Ignoring action.");
        }
    }

    public final synchronized void zzaO(String str, ValueCallback valueCallback) {
        if (!zzX()) {
            evaluateJavascript(str, null);
        } else {
            int i5 = G6.L.f4523b;
            H6.l.f("#004 The webview is destroyed. Ignoring action.");
        }
    }

    public final void zzaP(String str) {
        if (zzaR() == null) {
            zzba();
        }
        if (zzaR().booleanValue()) {
            zzaO(str, null);
        } else {
            zzaN("javascript:".concat(str));
        }
    }

    public final void zzaQ(Boolean bool) {
        synchronized (this) {
            this.zzy = bool;
        }
        C6.n.f1857D.f1868h.zzb(bool);
    }

    public final synchronized Boolean zzaR() {
        return this.zzy;
    }

    public final zzclm zzaS() {
        return this.zzo;
    }

    public final /* synthetic */ void zzaU(String str, ValueCallback valueCallback) {
        super.evaluateJavascript(str, valueCallback);
    }

    public final /* synthetic */ void zzaV(String str) {
        super.loadUrl(str);
    }

    public final /* synthetic */ void zzaW(String str) {
        super.loadUrl(AndroidWebViewClient.BLANK_PAGE);
    }

    public final /* synthetic */ int zzaX() {
        return this.zzI;
    }

    public final /* synthetic */ void zzaY(int i5) {
        this.zzI = i5;
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final synchronized boolean zzaa() {
        return this.zzH > 0;
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final void zzab(String str, zzbpx zzbpxVar) {
        zzclm zzclmVar = this.zzo;
        if (zzclmVar != null) {
            zzclmVar.zzB(str, zzbpxVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final void zzac(String str, zzbpx zzbpxVar) {
        zzclm zzclmVar = this.zzo;
        if (zzclmVar != null) {
            zzclmVar.zzC(str, zzbpxVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final void zzad(String str, InterfaceC3600e interfaceC3600e) {
        zzclm zzclmVar = this.zzo;
        if (zzclmVar != null) {
            zzclmVar.zzE(str, interfaceC3600e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final synchronized void zzae(F6.l lVar) {
        this.zzp = lVar;
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final synchronized void zzaf(zzcnl zzcnlVar) {
        this.zzs = zzcnlVar;
        requestLayout();
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final synchronized void zzag(boolean z2) {
        try {
            boolean z10 = this.zzw;
            this.zzw = z2;
            zzbc();
            if (z2 != z10) {
                if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzaI)).booleanValue()) {
                    if (!this.zzs.zzg()) {
                    }
                }
                new zzbyn(this, "").zzk(true != z2 ? BuildConfig.FLAVOR : "expanded");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final void zzah() {
        G6.K k = this.zzQ;
        k.f4521e = true;
        if (k.f4520d) {
            k.a();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final void zzai(Context context) {
        zzcnd zzcndVar = this.zzb;
        zzcndVar.setBaseContext(context);
        this.zzQ.f4518b = zzcndVar.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final synchronized void zzaj(boolean z2) {
        F6.l lVar = this.zzp;
        if (lVar != null) {
            lVar.W(this.zzo.zzk(), z2);
        } else {
            this.zzu = z2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final synchronized void zzak(zzelv zzelvVar) {
        this.zzq = zzelvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final synchronized void zzal(zzelt zzeltVar) {
        this.zzr = zzeltVar;
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final synchronized void zzam(int i5) {
        F6.l lVar = this.zzp;
        if (lVar != null) {
            lVar.Y(i5);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final synchronized void zzan(F6.l lVar) {
        this.zzO = lVar;
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final synchronized void zzao(boolean z2) {
        this.zzz = z2;
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final void zzap() {
        if (this.zzL == null) {
            zzbjk zzbjkVar = this.zzM;
            zzbjkVar.zzc();
            zzbjj zzbjjVarZzf = zzbjm.zzf();
            this.zzL = zzbjjVarZzf;
            zzbjkVar.zza("native:view_load", zzbjjVarZzf);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final synchronized void zzaq(zzbly zzblyVar) {
        this.zzE = zzblyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final synchronized zzbly zzar() {
        return this.zzE;
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final synchronized void zzas(boolean z2) {
        F6.l lVar;
        int i5 = this.zzH + (true != z2 ? -1 : 1);
        this.zzH = i5;
        if (i5 > 0 || (lVar = this.zzp) == null) {
            return;
        }
        lVar.T();
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final void zzat() {
        setBackgroundColor(0);
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final synchronized void zzau(String str, String str2, String str3) throws Throwable {
        Throwable th;
        String str4;
        try {
            try {
                if (zzX()) {
                    int i5 = G6.L.f4523b;
                    H6.l.f("#004 The webview is destroyed. Ignoring action.");
                    return;
                }
                String str5 = (String) C0395s.f2489e.f2492c.zzd(zzbix.zzaH);
                JSONObject jSONObject = new JSONObject();
                try {
                    try {
                        jSONObject.put("version", str5);
                        jSONObject.put(ServiceProvider.NAMED_SDK, "Google Mobile Ads");
                        jSONObject.put("sdkVersion", "12.4.51-000");
                        str4 = "<script>Object.defineProperty(window,'MRAID_ENV',{get:function(){return " + jSONObject.toString() + "}});</script>";
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                } catch (JSONException e7) {
                    int i10 = G6.L.f4523b;
                    H6.l.g("Unable to build MRAID_ENV", e7);
                    str4 = null;
                }
                super.loadDataWithBaseURL(str, zzcms.zza(str2, str4), "text/html", "UTF-8", null);
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final void zzav() {
        G6.L.k("Cannot add text view to inner AdWebView");
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final void zzaw(boolean z2) {
        this.zzo.zzO(z2);
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final synchronized void zzax(zzblv zzblvVar) {
        this.zzF = zzblvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final synchronized void zzay(zzbgk zzbgkVar) {
        this.zzG = zzbgkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final synchronized zzbgk zzaz() {
        return this.zzG;
    }

    @Override // com.google.android.gms.internal.ads.zzbtf
    public final void zzb(String str, JSONObject jSONObject) {
        zzc(str, jSONObject.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzbtf
    public final void zzc(String str, String str2) {
        zzaP(AbstractC3256n.h(new StringBuilder(AbstractC0279p0.g(1, String.valueOf(str2).length(), str) + 2), str, "(", str2, ");"));
    }

    @Override // com.google.android.gms.internal.ads.zzbst
    public final void zzd(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        StringBuilder sbR = AbstractC0279p0.r("(window.AFMA_ReceiveMessage || function() {})('", str, "',", jSONObject.toString(), ");");
        String string = sbR.toString();
        int i5 = G6.L.f4523b;
        H6.l.a("Dispatching AFMA event: ".concat(string));
        zzaP(sbR.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzdlg
    public final void zzdR() {
        zzclm zzclmVar = this.zzo;
        if (zzclmVar != null) {
            zzclmVar.zzdR();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbex
    public final void zzdj(zzbew zzbewVar) {
        boolean z2;
        synchronized (this) {
            z2 = zzbewVar.zzj;
            this.zzC = z2;
        }
        zzbi(z2);
    }

    @Override // com.google.android.gms.internal.ads.zzclb, C6.h
    public final synchronized void zzdk() {
        C6.h hVar = this.zzg;
        if (hVar != null) {
            hVar.zzdk();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzclb, C6.h
    public final synchronized void zzdl() {
        C6.h hVar = this.zzg;
        if (hVar != null) {
            hVar.zzdl();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchu
    public final zzchj zzdm() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzchu
    public final void zzdn(boolean z2) {
        this.zzo.zzM(false);
    }

    @Override // com.google.android.gms.internal.ads.zzdlg
    public final void zzdu() {
        zzclm zzclmVar = this.zzo;
        if (zzclmVar != null) {
            zzclmVar.zzdu();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbst
    public final void zze(String str, Map map) {
        try {
            zzd(str, C0392q.f2477g.f2478a.l(map));
        } catch (JSONException unused) {
            int i5 = G6.L.f4523b;
            H6.l.f("Could not convert parameters to JSON.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzclb, com.google.android.gms.internal.ads.zzchu
    public final synchronized zzcmh zzh() {
        return this.zzB;
    }

    @Override // com.google.android.gms.internal.ads.zzchu
    public final zzbjj zzi() {
        return this.zzK;
    }

    @Override // com.google.android.gms.internal.ads.zzclb, com.google.android.gms.internal.ads.zzcmn, com.google.android.gms.internal.ads.zzchu
    public final Activity zzj() {
        return this.zzb.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzclb, com.google.android.gms.internal.ads.zzchu
    public final C6.a zzk() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzchu
    public final void zzl() {
        F6.l lVarZzL = zzL();
        if (lVarZzL != null) {
            lVarZzL.k.f3967b = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchu
    public final synchronized String zzm() {
        return this.zzA;
    }

    @Override // com.google.android.gms.internal.ads.zzchu
    public final synchronized String zzn() {
        zzfkq zzfkqVar = this.zzl;
        if (zzfkqVar == null) {
            return null;
        }
        return zzfkqVar.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzchu
    public final synchronized void zzo(int i5) {
        this.zzN = i5;
    }

    @Override // com.google.android.gms.internal.ads.zzchu
    public final synchronized int zzp() {
        return this.zzN;
    }

    @Override // com.google.android.gms.internal.ads.zzclb, com.google.android.gms.internal.ads.zzchu
    public final zzbjk zzq() {
        return this.zzM;
    }

    @Override // com.google.android.gms.internal.ads.zzchu
    public final synchronized zzcjh zzr(String str) {
        Map map = this.zzW;
        if (map == null) {
            return null;
        }
        return (zzcjh) map.get(str);
    }

    @Override // com.google.android.gms.internal.ads.zzclb, com.google.android.gms.internal.ads.zzcmv, com.google.android.gms.internal.ads.zzchu
    public final H6.a zzs() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzclb, com.google.android.gms.internal.ads.zzchu
    public final synchronized void zzt(String str, zzcjh zzcjhVar) {
        try {
            if (this.zzW == null) {
                this.zzW = new HashMap();
            }
            this.zzW.put(str, zzcjhVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchu
    public final void zzu(boolean z2, long j8) {
        HashMap map = new HashMap(2);
        map.put("success", true != z2 ? "0" : UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
        map.put("duration", Long.toString(j8));
        zze("onCacheAccessComplete", map);
    }

    @Override // com.google.android.gms.internal.ads.zzchu
    public final void zzv(int i5) {
    }

    @Override // com.google.android.gms.internal.ads.zzclb, com.google.android.gms.internal.ads.zzchu
    public final synchronized void zzw(zzcmh zzcmhVar) {
        if (this.zzB == null) {
            this.zzB = zzcmhVar;
        } else {
            int i5 = G6.L.f4523b;
            H6.l.c("Attempt to create multiple AdWebViewVideoControllers.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchu
    public final int zzx() {
        return getMeasuredHeight();
    }

    @Override // com.google.android.gms.internal.ads.zzchu
    public final int zzy() {
        return getMeasuredWidth();
    }

    @Override // com.google.android.gms.internal.ads.zzchu
    public final synchronized void zzz() {
        zzblv zzblvVar = this.zzF;
        if (zzblvVar != null) {
            zzblvVar.zza();
        }
    }
}
