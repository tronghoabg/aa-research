package com.applovin.impl.adview;

import A7.AbstractC0279p0;
import E5.RunnableC0443c;
import R8.v;
import Va.M6;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.applovin.adview.AppLovinAdView;
import com.applovin.adview.AppLovinAdViewDisplayErrorCode;
import com.applovin.adview.AppLovinAdViewEventListener;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.AbstractC1637g;
import com.applovin.impl.AbstractC1660s;
import com.applovin.impl.a5;
import com.applovin.impl.adview.k;
import com.applovin.impl.c2;
import com.applovin.impl.d2;
import com.applovin.impl.e6;
import com.applovin.impl.f2;
import com.applovin.impl.f4;
import com.applovin.impl.f8;
import com.applovin.impl.h4;
import com.applovin.impl.l2;
import com.applovin.impl.n1;
import com.applovin.impl.o7;
import com.applovin.impl.p8;
import com.applovin.impl.s6;
import com.applovin.impl.sdk.AppLovinAdServiceImpl;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.SessionTracker;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.ad.b;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.t2;
import com.applovin.impl.u4;
import com.applovin.impl.v2;
import com.applovin.impl.y4;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a implements AppLovinCommunicatorSubscriber, AppLovinBroadcastManager.Receiver {

    /* renamed from: A, reason: collision with root package name */
    private volatile AppLovinAdLoadListener f20998A;

    /* renamed from: B, reason: collision with root package name */
    private volatile AppLovinAdDisplayListener f20999B;

    /* renamed from: C, reason: collision with root package name */
    private volatile AppLovinAdViewEventListener f21000C;

    /* renamed from: D, reason: collision with root package name */
    private volatile AppLovinAdClickListener f21001D;

    /* renamed from: a, reason: collision with root package name */
    private Context f21002a;

    /* renamed from: b, reason: collision with root package name */
    private ViewGroup f21003b;

    /* renamed from: c, reason: collision with root package name */
    private com.applovin.impl.sdk.k f21004c;

    /* renamed from: d, reason: collision with root package name */
    private AppLovinAdServiceImpl f21005d;

    /* renamed from: e, reason: collision with root package name */
    private com.applovin.impl.sdk.o f21006e;

    /* renamed from: f, reason: collision with root package name */
    private AppLovinCommunicator f21007f;

    /* renamed from: g, reason: collision with root package name */
    private b f21008g;

    /* renamed from: i, reason: collision with root package name */
    private AppLovinAdSize f21010i;

    /* renamed from: j, reason: collision with root package name */
    private String f21011j;
    private u.n k;

    /* renamed from: l, reason: collision with root package name */
    private com.applovin.impl.adview.c f21012l;

    /* renamed from: m, reason: collision with root package name */
    private e f21013m;

    /* renamed from: n, reason: collision with root package name */
    private com.applovin.impl.adview.b f21014n;

    /* renamed from: o, reason: collision with root package name */
    private WebView f21015o;

    /* renamed from: p, reason: collision with root package name */
    private k f21016p;

    /* renamed from: q, reason: collision with root package name */
    private Runnable f21017q;

    /* renamed from: r, reason: collision with root package name */
    private Runnable f21018r;

    /* renamed from: h, reason: collision with root package name */
    private final Map f21009h = M6.v();

    /* renamed from: s, reason: collision with root package name */
    private volatile com.applovin.impl.sdk.ad.b f21019s = null;

    /* renamed from: t, reason: collision with root package name */
    private volatile AppLovinAd f21020t = null;

    /* renamed from: u, reason: collision with root package name */
    private f f21021u = null;

    /* renamed from: v, reason: collision with root package name */
    private f f21022v = null;

    /* renamed from: w, reason: collision with root package name */
    private final AtomicReference f21023w = new AtomicReference();

    /* renamed from: x, reason: collision with root package name */
    private final AtomicBoolean f21024x = new AtomicBoolean();

    /* renamed from: y, reason: collision with root package name */
    private volatile boolean f21025y = false;

    /* renamed from: z, reason: collision with root package name */
    private volatile boolean f21026z = false;

    /* renamed from: com.applovin.impl.adview.a$a, reason: collision with other inner class name */
    public class C0004a extends u4 {
        public C0004a() {
        }

        @Override // com.applovin.impl.u4
        public Map a() {
            return CollectionUtils.hashMap(MediationMetaData.KEY_NAME, "AdViewController:GAWebView");
        }
    }

    public interface b {
        void a(a aVar);
    }

    public class c implements Runnable {
        private c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a.this.f21014n != null) {
                a.this.f21014n.setVisibility(8);
            }
        }

        public /* synthetic */ c(a aVar, C0004a c0004a) {
            this();
        }
    }

    public class d implements Runnable {

        /* renamed from: com.applovin.impl.adview.a$d$a, reason: collision with other inner class name */
        public class C0005a implements k.a {
            public C0005a() {
            }

            @Override // com.applovin.impl.adview.k.a
            public void a() {
                a.this.f21014n.addView(a.this.f21016p, new ViewGroup.LayoutParams(-1, -1));
            }

            @Override // com.applovin.impl.adview.k.a
            public void b() {
                com.applovin.impl.sdk.o unused = a.this.f21006e;
                if (com.applovin.impl.sdk.o.a()) {
                    a.this.f21006e.b("AppLovinAdView", "Watermark failed to render.");
                }
            }
        }

        private d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a.this.f21019s != null) {
                if (a.this.f21014n == null) {
                    com.applovin.impl.sdk.o.h("AppLovinAdView", "Unable to render advertisement for ad #" + a.this.f21019s.getAdIdNumber() + ". Please make sure you are not calling AppLovinAdView.destroy() prematurely.");
                    t2.a(a.this.f21000C, a.this.f21019s, (AppLovinAdView) null, AppLovinAdViewDisplayErrorCode.WEBVIEW_NOT_FOUND);
                    HashMap<String, String> mapHashMap = CollectionUtils.hashMap("source", "renderTask");
                    CollectionUtils.putStringIfValid("error_message", "Ad view failed to render due to null adView", mapHashMap);
                    a.this.f21004c.g().a(d2.f21263E, a.this.f21019s, mapHashMap);
                    return;
                }
                a.this.v();
                com.applovin.impl.sdk.o unused = a.this.f21006e;
                if (com.applovin.impl.sdk.o.a()) {
                    a.this.f21006e.a("AppLovinAdView", "Rendering advertisement ad for #" + a.this.f21019s.getAdIdNumber() + "...");
                }
                a.b(a.this.f21014n, a.this.f21019s.getSize());
                if (a.this.f21016p != null) {
                    f8.c(a.this.f21016p);
                    a.this.f21016p = null;
                }
                c2 c2Var = new c2(a.this.f21009h, a.this.f21004c);
                if (c2Var.c()) {
                    a.this.f21016p = new k(c2Var, a.this.f21002a);
                    a.this.f21016p.a(new C0005a());
                }
                a.this.f21014n.setAdHtmlLoaded(false);
                a.this.f21014n.a(a.this.f21019s);
                if (a.this.f21019s.getSize() == AppLovinAdSize.INTERSTITIAL || a.this.f21026z) {
                    return;
                }
                a.this.f21019s.setHasShown(true);
            }
        }

        public /* synthetic */ d(a aVar, C0004a c0004a) {
            this();
        }
    }

    public static class e implements AppLovinAdLoadListener {

        /* renamed from: a, reason: collision with root package name */
        private final a f21031a;

        public e(a aVar, com.applovin.impl.sdk.k kVar) {
            if (aVar == null) {
                throw new IllegalArgumentException("No view specified");
            }
            if (kVar == null) {
                throw new IllegalArgumentException("No sdk specified");
            }
            this.f21031a = aVar;
        }

        private a a() {
            return this.f21031a;
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void adReceived(AppLovinAd appLovinAd) {
            a aVarA = a();
            if (aVarA != null) {
                aVarA.b(appLovinAd);
            } else {
                com.applovin.impl.sdk.o.h("AppLovinAdView", "Ad view has been garbage collected by the time an ad was received");
            }
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void failedToReceiveAd(int i5) {
            a aVarA = a();
            if (aVarA != null) {
                aVarA.b(i5);
            }
        }
    }

    private void E() {
        if (this.f21006e != null && com.applovin.impl.sdk.o.a() && com.applovin.impl.sdk.o.a()) {
            this.f21006e.a("AppLovinAdView", "Destroying...");
        }
        p8.b(this.f21014n);
        this.f21014n = null;
        p8.b(this.f21015o);
        this.f21015o = null;
        this.k = null;
        this.f20998A = null;
        this.f20999B = null;
        this.f21001D = null;
        this.f21000C = null;
        AppLovinBroadcastManager.unregisterReceiver(this);
        this.f21026z = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v() {
        com.applovin.impl.sdk.ad.b bVar = this.f21019s;
        v2 v2Var = new v2();
        v2Var.a().a(bVar).a(i());
        if (!o7.a(bVar.getSize())) {
            v2Var.a().a("Fullscreen Ad Properties").b(bVar);
        }
        v2Var.a(this.f21004c);
        v2Var.a();
        if (com.applovin.impl.sdk.o.a()) {
            this.f21006e.a("AppLovinAdView", v2Var.toString());
        }
    }

    private void x() {
        if (this.f21019s.P0()) {
            int iC = this.f21004c.p().c();
            if (com.applovin.impl.sdk.i.a(iC)) {
                this.f21014n.a("javascript:al_muteSwitchOn();");
            } else if (iC == 2) {
                this.f21014n.a("javascript:al_muteSwitchOff();");
            }
        }
    }

    private void y() {
        if (o7.a(this.f21010i)) {
            if (((Boolean) this.f21004c.a(y4.f23621J1)).booleanValue()) {
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
            }
            if (((Boolean) this.f21004c.a(y4.f23629K1)).booleanValue()) {
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.custom_tabs_shown"));
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.custom_tabs_hidden"));
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.custom_tabs_failure"));
            }
            AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.custom_intent_launch_success"));
            AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.custom_intent_launch_failure"));
            if (((Boolean) this.f21004c.a(y4.f23636L1)).booleanValue()) {
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.external_redirect_success"));
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.external_redirect_failure"));
            }
            if (((Boolean) this.f21004c.a(y4.f23644M1)).booleanValue()) {
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.preload_success"));
                AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.preload_failure"));
            }
        }
    }

    public void A() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f21006e.a("AppLovinAdView", "AdView fully watched...");
        }
        b bVar = this.f21008g;
        if (bVar != null) {
            bVar.a(this);
        }
    }

    public void B() {
        y();
        if (this.f21019s != null && this.f21019s.r0()) {
            AbstractC1637g.a(this.f21014n, this.f21004c);
        }
        b("javascript:al_onAttachedToWindow();");
    }

    public void C() {
        if (this.f21025y) {
            if (this.f21019s == null || !this.f21019s.Z0()) {
                t2.b(this.f20999B, this.f21019s);
            }
            if (this.f21019s != null && this.f21019s.isOpenMeasurementEnabled() && o7.a(this.f21019s.getSize())) {
                this.f21019s.getAdEventTracker().f();
            }
            if (this.f21014n != null && this.f21021u != null) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f21006e.a("AppLovinAdView", "onDetachedFromWindowCalled with expanded ad present");
                }
                c();
            } else if (com.applovin.impl.sdk.o.a()) {
                this.f21006e.a("AppLovinAdView", "onDetachedFromWindowCalled without an expanded ad present");
            }
            b("javascript:al_onDetachedFromWindow();");
        }
    }

    public void D() {
        if (!this.f21025y || this.f21026z) {
            return;
        }
        this.f21026z = true;
    }

    public void F() {
        if (this.f21025y) {
            AppLovinAd appLovinAd = (AppLovinAd) this.f21023w.getAndSet(null);
            if (appLovinAd != null) {
                c(appLovinAd);
            }
            this.f21026z = false;
        }
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return "a";
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if ("crash_applovin_ad_webview".equals(appLovinCommunicatorMessage.getTopic())) {
            a(new o(this, 4));
        }
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        String action = intent.getAction();
        if (action == null) {
            return;
        }
        switch (action) {
            case "com.applovin.custom_intent_launch_failure":
            case "com.applovin.custom_intent_launch_success":
                a(action, map);
                break;
            case "com.applovin.external_redirect_success":
            case "com.applovin.external_redirect_failure":
                c(action, map);
                break;
            case "com.applovin.custom_tabs_failure":
            case "com.applovin.custom_tabs_hidden":
            case "com.applovin.custom_tabs_shown":
                b(action, map);
                break;
            case "com.applovin.application_paused":
                m();
                break;
            case "com.applovin.application_resumed":
                n();
                break;
            case "com.applovin.preload_success":
            case "com.applovin.preload_failure":
                d(action, map);
                break;
        }
    }

    public void w() {
        if ((this.f21002a instanceof n1) && this.f21019s != null && this.f21019s.K() == b.EnumC0020b.DISMISS) {
            ((n1) this.f21002a).dismiss("postitial_click");
        }
    }

    public void z() {
        if (this.f21021u != null || this.f21022v != null) {
            a();
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f21006e.a("AppLovinAdView", "Ad: " + this.f21019s + " closed.");
        }
        a(this.f21018r);
        t2.b(this.f20999B, this.f21019s);
        this.f21019s = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(View view, AppLovinAdSize appLovinAdSize) {
        if (view == null) {
            return;
        }
        DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
        AppLovinAdSize appLovinAdSize2 = AppLovinAdSize.INTERSTITIAL;
        int iApplyDimension = -1;
        int iApplyDimension2 = (appLovinAdSize == appLovinAdSize2 || appLovinAdSize == AppLovinAdSize.BANNER) ? -1 : appLovinAdSize.getWidth() == -1 ? displayMetrics.widthPixels : (int) TypedValue.applyDimension(1, appLovinAdSize.getWidth(), displayMetrics);
        if (appLovinAdSize != appLovinAdSize2 && appLovinAdSize != AppLovinAdSize.BANNER) {
            iApplyDimension = appLovinAdSize.getHeight() == -1 ? displayMetrics.heightPixels : (int) TypedValue.applyDimension(1, appLovinAdSize.getHeight(), displayMetrics);
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        }
        layoutParams.width = iApplyDimension2;
        layoutParams.height = iApplyDimension;
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            ((RelativeLayout.LayoutParams) layoutParams).addRule(13);
        }
        view.setLayoutParams(layoutParams);
    }

    private void c() {
        a(new o(this, 2));
    }

    private void m() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f21006e.a("AppLovinAdView", "handleApplicationPaused()");
        }
        b("javascript:al_onAppPaused();");
    }

    private void n() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f21006e.a("AppLovinAdView", "handleApplicationResumed()");
        }
        b("javascript:al_onAppResumed();");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o() {
        this.f21014n.loadDataWithBaseURL("/", "<html></html>", "text/html", null, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p() {
        com.applovin.impl.adview.b bVar;
        d();
        if (this.f21003b == null || (bVar = this.f21014n) == null || bVar.getParent() != null) {
            return;
        }
        this.f21003b.addView(this.f21014n);
        b(this.f21014n, this.f21019s.getSize());
        if (this.f21019s.isOpenMeasurementEnabled()) {
            this.f21019s.getAdEventTracker().a((View) this.f21014n);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q() {
        if (this.f21014n != null && this.f21021u != null) {
            a();
        }
        E();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r() {
        if (this.f21021u != null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f21006e.a("AppLovinAdView", "Detaching expanded ad: " + this.f21021u.b());
            }
            this.f21022v = this.f21021u;
            this.f21021u = null;
            a(this.f21010i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s() {
        com.applovin.impl.sdk.ad.a aVarB;
        f fVar = this.f21022v;
        if (fVar == null && this.f21021u == null) {
            return;
        }
        if (fVar != null) {
            aVarB = fVar.b();
            this.f21022v.dismiss();
            this.f21022v = null;
        } else {
            aVarB = this.f21021u.b();
            this.f21021u.dismiss();
            this.f21021u = null;
        }
        t2.a(this.f21000C, aVarB, (AppLovinAdView) this.f21003b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t() {
        f().loadUrl("chrome://crash");
    }

    public AppLovinAdViewEventListener e() {
        return this.f21000C;
    }

    public com.applovin.impl.adview.b f() {
        return this.f21014n;
    }

    public com.applovin.impl.sdk.ad.b g() {
        return this.f21019s;
    }

    public u.n h() {
        return this.k;
    }

    public AppLovinAdView i() {
        return (AppLovinAdView) this.f21003b;
    }

    public com.applovin.impl.sdk.k j() {
        return this.f21004c;
    }

    public AppLovinAdSize k() {
        return this.f21010i;
    }

    public String l() {
        return this.f21011j;
    }

    public void u() {
        if (this.f21004c == null || this.f21013m == null || this.f21002a == null || !this.f21025y) {
            com.applovin.impl.sdk.o.i("AppLovinAdView", "Unable to load next ad: AppLovinAdView is not initialized.");
        } else {
            this.f21005d.loadNextAd(this.f21011j, this.f21010i, this.f21013m);
        }
    }

    private void d() {
        a(new o(this, 0));
    }

    public void c(int i5) {
        String strA = f8.a(i5);
        if (com.applovin.impl.sdk.o.a()) {
            this.f21006e.a("AppLovinAdView", "onWindowVisibilityChanged( " + strA + " )");
        }
        b(AbstractC0279p0.l("javascript:al_onWindowVisibilityChanged( ", strA, " );"));
    }

    private void d(String str, Map map) {
        a(p8.d(str, map));
    }

    public void a(AppLovinAdLoadListener appLovinAdLoadListener) {
        this.f20998A = appLovinAdLoadListener;
    }

    public void a(AppLovinAdDisplayListener appLovinAdDisplayListener) {
        this.f20999B = appLovinAdDisplayListener;
    }

    public void a(AppLovinAdViewEventListener appLovinAdViewEventListener) {
        this.f21000C = appLovinAdViewEventListener;
    }

    public void a(AppLovinAdClickListener appLovinAdClickListener) {
        this.f21001D = appLovinAdClickListener;
    }

    private void a(AppLovinAdView appLovinAdView, com.applovin.impl.sdk.k kVar, AppLovinAdSize appLovinAdSize, String str, Context context) {
        if (appLovinAdView == null) {
            throw new IllegalArgumentException("No parent view specified");
        }
        if (kVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        if (appLovinAdSize != null) {
            this.f21004c = kVar;
            this.f21005d = kVar.k();
            this.f21006e = kVar.O();
            this.f21007f = AppLovinCommunicator.getInstance(context);
            this.f21010i = appLovinAdSize;
            this.f21011j = str;
            if (!(context instanceof AppLovinFullscreenActivity)) {
                context = context.getApplicationContext();
            }
            this.f21002a = context;
            this.f21003b = appLovinAdView;
            this.f21012l = new com.applovin.impl.adview.c(this, kVar);
            C0004a c0004a = null;
            this.f21018r = new c(this, c0004a);
            this.f21017q = new d(this, c0004a);
            this.f21013m = new e(this, kVar);
            a(appLovinAdSize);
            return;
        }
        throw new IllegalArgumentException("No ad size specified");
    }

    public void c(AppLovinAd appLovinAd) {
        a(appLovinAd, (String) null);
    }

    public void c(WebView webView) {
        a(webView, (String) null);
    }

    private void c(String str, Map map) {
        a(p8.c(str, map));
    }

    public void b() {
        a(new o(this, 3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(WebView webView) {
        this.f21019s.getAdEventTracker().c(webView);
        k kVar = this.f21016p;
        if (kVar != null && kVar.a()) {
            f4 adEventTracker = this.f21019s.getAdEventTracker();
            k kVar2 = this.f21016p;
            adEventTracker.b(webView, Collections.singletonList(new h4(kVar2, FriendlyObstructionPurpose.NOT_VISIBLE, kVar2.getIdentifier())));
        } else {
            this.f21019s.getAdEventTracker().a((View) webView);
        }
        this.f21019s.getAdEventTracker().h();
        this.f21019s.getAdEventTracker().g();
    }

    public void a(AppLovinAdSize appLovinAdSize) {
        try {
            com.applovin.impl.adview.b bVar = new com.applovin.impl.adview.b(this.f21012l, this.f21004c, this.f21002a);
            this.f21014n = bVar;
            bVar.setBackgroundColor(0);
            this.f21014n.setWillNotCacheDrawing(false);
            this.f21003b.setBackgroundColor(0);
            this.f21003b.addView(this.f21014n);
            b(this.f21014n, appLovinAdSize);
            if (!this.f21025y) {
                a(this.f21018r);
            }
            a(new o(this, 5));
            this.f21025y = true;
        } catch (Throwable th) {
            com.applovin.impl.sdk.o.c("AppLovinAdView", "Failed to initialize AdWebView", th);
            this.f21004c.D().a("AppLovinAdView", "initAdWebView", th);
            this.f21024x.set(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(MotionEvent motionEvent) {
        a aVar;
        if (this.f21021u == null && (this.f21019s instanceof com.applovin.impl.sdk.ad.a) && this.f21014n != null) {
            com.applovin.impl.sdk.ad.a aVar2 = (com.applovin.impl.sdk.ad.a) this.f21019s;
            Context context = this.f21002a;
            Activity activityB = context instanceof Activity ? (Activity) context : f8.b(this.f21014n, this.f21004c);
            if (activityB != null && !activityB.isFinishing()) {
                ViewGroup viewGroup = this.f21003b;
                if (viewGroup != null) {
                    viewGroup.removeView(this.f21014n);
                }
                f fVar = new f(aVar2, this.f21014n, activityB, this.f21004c);
                this.f21021u = fVar;
                fVar.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.applovin.impl.adview.p
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        this.f21100a.a(dialogInterface);
                    }
                });
                this.f21021u.show();
                t2.c(this.f21000C, this.f21019s, (AppLovinAdView) this.f21003b);
                if (this.f21019s.isOpenMeasurementEnabled()) {
                    this.f21019s.getAdEventTracker().a((View) this.f21021u.c());
                    return;
                }
                return;
            }
            com.applovin.impl.sdk.o.h("AppLovinAdView", "Unable to expand ad. No Activity found.");
            Uri uriE1 = aVar2.e1();
            if (uriE1 != null) {
                aVar = this;
                this.f21005d.trackAndLaunchClick(aVar2, i(), aVar, uriE1, motionEvent);
            } else {
                aVar = this;
            }
            aVar.f21014n.a("javascript:al_onFailedExpand();");
        }
    }

    public void a(AppLovinAdView appLovinAdView, Context context, AppLovinAdSize appLovinAdSize, String str, AppLovinSdk appLovinSdk, AttributeSet attributeSet) {
        if (appLovinAdView == null) {
            throw new IllegalArgumentException("No parent view specified");
        }
        if (context == null) {
            com.applovin.impl.sdk.o.h("AppLovinAdView", "Unable to build AppLovinAdView: no context provided. Please use a different constructor for this view.");
            return;
        }
        if (appLovinAdSize == null && (appLovinAdSize = AbstractC1660s.a(attributeSet)) == null) {
            appLovinAdSize = AppLovinAdSize.BANNER;
        }
        AppLovinAdSize appLovinAdSize2 = appLovinAdSize;
        if (appLovinSdk == null) {
            appLovinSdk = AppLovinSdk.getInstance(context);
        }
        if (appLovinSdk != null) {
            a(appLovinAdView, appLovinSdk.a(), appLovinAdSize2, str, context);
            if (AbstractC1660s.b(attributeSet)) {
                u();
            }
        }
    }

    public void b(AppLovinAd appLovinAd) {
        if (appLovinAd != null) {
            if (!this.f21026z) {
                c(appLovinAd);
            } else {
                this.f21023w.set(appLovinAd);
                if (com.applovin.impl.sdk.o.a()) {
                    this.f21006e.a("AppLovinAdView", "Ad view has paused when an ad was received, ad saved for later");
                }
            }
            a(new T3.r(29, this, appLovinAd));
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f21006e.b("AppLovinAdView", "No provided when to the view controller");
        }
        b(-1);
    }

    public void a(String str, Object obj) {
        this.f21009h.put(str, obj);
    }

    public void a(boolean z2) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f21006e.a("AppLovinAdView", "onWindowFocusChanged( " + z2 + " )");
        }
        b("javascript:al_onWindowFocusChanged( " + z2 + " );");
    }

    public void a(AppLovinAd appLovinAd, String str) {
        if (appLovinAd != null) {
            o7.b(appLovinAd, this.f21004c);
            if (this.f21025y) {
                if (appLovinAd.getSize() != AppLovinAdSize.INTERSTITIAL) {
                    Map mapA = f2.a((AppLovinAdImpl) appLovinAd);
                    CollectionUtils.putStringIfValid("source", "renderAd", mapA);
                    this.f21004c.g().d(d2.f21258B, mapA);
                }
                com.applovin.impl.sdk.ad.b bVar = (com.applovin.impl.sdk.ad.b) o7.a(appLovinAd, this.f21004c);
                if (bVar == null) {
                    com.applovin.impl.sdk.o.h("AppLovinAdView", "Unable to retrieve the loaded ad: " + appLovinAd);
                    t2.a(this.f20999B, "Unable to retrieve the loaded ad");
                    Map mapA2 = f2.a((AppLovinAdImpl) appLovinAd);
                    CollectionUtils.putStringIfValid("source", "noAdToRender", mapA2);
                    CollectionUtils.putStringIfValid("error_message", "Unable to retrieve the loaded ad", mapA2);
                    this.f21004c.g().d(d2.f21263E, mapA2);
                    return;
                }
                if (bVar == this.f21019s) {
                    com.applovin.impl.sdk.o.h("AppLovinAdView", "Attempting to show ad again: " + bVar);
                    if (((Boolean) this.f21004c.a(y4.f23651N1)).booleanValue()) {
                        if (this.f20999B instanceof l2) {
                            t2.a(this.f20999B, "Attempting to show ad again");
                        } else if (!o7.c(this.f21004c)) {
                            this.f21004c.g().a(d2.f21291S0, bVar, CollectionUtils.hashMap("source", "attemptingAdReRender"));
                        } else {
                            throw new IllegalStateException("Attempting to show ad again");
                        }
                    }
                    HashMap<String, String> mapHashMap = CollectionUtils.hashMap("source", "attemptingAdReRender");
                    CollectionUtils.putStringIfValid("error_message", "Attempting to show ad again", mapHashMap);
                    this.f21004c.g().a(d2.f21263E, bVar, mapHashMap);
                    return;
                }
                if (com.applovin.impl.sdk.o.a()) {
                    this.f21006e.a("AppLovinAdView", "Rendering ad #" + bVar.getAdIdNumber() + " (" + bVar.getSize() + ")");
                }
                t2.b(this.f20999B, this.f21019s);
                if (this.f21019s != null && this.f21019s.isOpenMeasurementEnabled()) {
                    this.f21019s.getAdEventTracker().f();
                }
                this.f21023w.set(null);
                this.f21020t = null;
                this.f21019s = bVar;
                if (this.f21019s.isCustomTabsEnabled()) {
                    this.k = this.f21004c.z().a(this);
                    this.f21004c.z().b(this.f21019s.getCustomTabsWarmupUrls(), this.k);
                }
                if (!this.f21026z && o7.a(this.f21010i)) {
                    this.f21004c.k().trackImpression(bVar);
                }
                if (this.f21021u != null) {
                    c();
                }
                a(this.f21017q);
                return;
            }
            com.applovin.impl.sdk.o.i("AppLovinAdView", "Unable to render ad: AppLovinAdView is not initialized.");
            return;
        }
        throw new IllegalArgumentException("No ad specified");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i5) {
        if (!this.f21026z) {
            a(this.f21018r);
        }
        a(new RunnableC0443c(this, i5, 4));
    }

    private void b(String str) {
        if (((Boolean) this.f21004c.a(y4.f23621J1)).booleanValue()) {
            a(str);
        }
    }

    private void b(String str, Map map) {
        a(p8.b(str, map));
    }

    public void b(Uri uri) {
        if (this.f21019s != null && this.f21019s.w0() && this.f21015o == null) {
            String queryParameter = uri.getQueryParameter("tracking_id");
            if (TextUtils.isEmpty(queryParameter)) {
                this.f21004c.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f21004c.O().b("AppLovinAdView", "Invalid tracking id. Cannot initialize GA");
                    return;
                }
                return;
            }
            WebView webView = new WebView(this.f21002a);
            this.f21015o = webView;
            webView.setWebViewClient(new C0004a());
            this.f21015o.getSettings().setJavaScriptEnabled(true);
            this.f21015o.loadDataWithBaseURL((String) this.f21004c.a(y4.f23864n7), "<html><head><link rel=\"icon\" href=\"data:,\"><G-SCRIPT_TAG></head><body></body></html>".replace("<G-SCRIPT_TAG>", "<script src='https://www.googletagmanager.com/gtag/js?id=<G-TRACKING_ID>'></script><script>window.dataLayer = window.dataLayer || [];function gtag(){dataLayer.push(arguments);}gtag('js', new Date());gtag('config', '<G-TRACKING_ID>')</script>".replace("<G-TRACKING_ID>", queryParameter)), "text/html", "UTF-8", null);
        }
    }

    public void a(WebView webView, String str) {
        if (this.f21019s == null) {
            return;
        }
        a(new s(webView, 2));
        if (!((Boolean) this.f21004c.a(y4.f23954z6)).booleanValue() || (str != null && str.startsWith(this.f21019s.k()))) {
            try {
                if (this.f21019s != this.f21020t) {
                    this.f21020t = this.f21019s;
                    x();
                    this.f21014n.setAdHtmlLoaded(true);
                    if (this.f20999B != null) {
                        this.f21004c.y().d(this.f21019s);
                        if (this.f21019s.s0()) {
                            this.f21004c.g().a(d2.f21261D, this.f21019s, CollectionUtils.hashMap("details", f2.b(this.f21019s)));
                        } else {
                            this.f21004c.g().a(d2.f21259C, this.f21019s, CollectionUtils.hashMap("duration_ms", String.valueOf(SystemClock.elapsedRealtime() - this.f21019s.z())));
                            t2.a(this.f20999B, this.f21019s);
                        }
                        if (this.f21019s.Q0()) {
                            String str2 = (String) this.f21004c.q0().a(a5.f20949T, "");
                            JSONObject jSONObject = new JSONObject();
                            JsonUtils.putString(jSONObject, "template_browser_package_name", str2);
                            this.f21014n.a("javascript:al_onAdViewRendered(" + jSONObject + ");");
                        } else {
                            this.f21014n.a("javascript:al_onAdViewRendered();");
                        }
                        if (this.f21019s.s0()) {
                            this.f21014n.a("javascript:al_onAdRestored( '" + this.f21019s.X() + "' );");
                        }
                    }
                    if ((this.f21019s instanceof com.applovin.impl.sdk.ad.a) && this.f21019s.isOpenMeasurementEnabled()) {
                        this.f21004c.r0().a(new s6(this.f21004c, "StartOMSDK", new T3.r(28, this, webView)), e6.b.OTHER, 500L);
                    }
                }
            } catch (Throwable th) {
                com.applovin.impl.sdk.o.c("AppLovinAdView", "Exception while notifying ad display listener", th);
                com.applovin.impl.sdk.k kVar = this.f21004c;
                if (kVar != null) {
                    kVar.D().a("AppLovinAdView", "onAdHtmlLoaded", th);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(WebView webView) {
        webView.setVisibility(0);
    }

    public void a(MotionEvent motionEvent) {
        a(new T3.r(27, this, motionEvent));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(DialogInterface dialogInterface) {
        a();
    }

    public void a() {
        a(new o(this, 1));
    }

    public void a(com.applovin.impl.sdk.ad.b bVar, AppLovinAdView appLovinAdView, Uri uri, MotionEvent motionEvent) {
        a aVar;
        com.applovin.impl.sdk.ad.b bVar2;
        if (appLovinAdView != null) {
            aVar = this;
            bVar2 = bVar;
            this.f21005d.trackAndLaunchClick(bVar2, appLovinAdView, aVar, uri, motionEvent);
        } else {
            aVar = this;
            bVar2 = bVar;
            if (com.applovin.impl.sdk.o.a()) {
                aVar.f21006e.b("AppLovinAdView", "Unable to process ad click - AppLovinAdView destroyed prematurely");
            }
        }
        t2.a(aVar.f21001D, bVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(AppLovinAd appLovinAd) {
        if (this.f21024x.compareAndSet(true, false)) {
            a(this.f21010i);
        }
        try {
            if (this.f20998A != null) {
                this.f20998A.adReceived(appLovinAd);
            }
        } catch (Throwable th) {
            com.applovin.impl.sdk.o.h("AppLovinAdView", "Exception while running ad load callback: " + th.getMessage());
            com.applovin.impl.sdk.k kVar = this.f21004c;
            if (kVar != null) {
                kVar.D().a("AppLovinAdView", "notifyAdLoadedCallback", th);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(int i5) {
        try {
            if (this.f20998A != null) {
                this.f20998A.failedToReceiveAd(i5);
            }
        } catch (Throwable th) {
            com.applovin.impl.sdk.o.c("AppLovinAdView", "Exception while running app load callback", th);
            com.applovin.impl.sdk.k kVar = this.f21004c;
            if (kVar != null) {
                kVar.D().a("AppLovinAdView", "notifyAdLoadFailedCallback", th);
            }
        }
    }

    private void a(Runnable runnable) {
        AppLovinSdkUtils.runOnUiThread(runnable);
    }

    public void a(b bVar) {
        this.f21008g = bVar;
    }

    private void a(String str, Map map) {
        a(p8.a(str, map));
    }

    private void a(String str) {
        if (this.f21019s == null || this.f21014n == null || !o7.a(this.f21019s.getSize()) || !StringUtils.isValidString(str)) {
            return;
        }
        this.f21014n.a(str);
    }

    public void a(Uri uri) {
        if (this.f21019s == null || !this.f21019s.w0()) {
            return;
        }
        if (this.f21015o == null) {
            this.f21004c.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f21004c.O().a("AppLovinAdView", "GA is not initialized. Cannot fire GA event");
                return;
            }
            return;
        }
        String queryParameter = uri.getQueryParameter("event_name");
        String queryParameter2 = uri.getQueryParameter("event_params_json");
        if (TextUtils.isEmpty(queryParameter)) {
            this.f21004c.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f21004c.O().a("AppLovinAdView", "Invalid GA event name. Cannot fire GA event");
                return;
            }
            return;
        }
        a(new Ab.a(this, queryParameter2, queryParameter, 20));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, String str2) {
        String strL;
        if (StringUtils.isValidString(str)) {
            strL = v.g("gtag('event', '", str2, "', ", str, ");");
        } else {
            strL = AbstractC0279p0.l("gtag('event', '", str2, "')");
        }
        if (((Boolean) this.f21004c.a(y4.f23714V2)).booleanValue()) {
            p8.a(this.f21015o, strL, this.f21004c);
        } else {
            p8.a(this.f21015o, strL);
        }
    }
}
