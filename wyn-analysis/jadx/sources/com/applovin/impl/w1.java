package com.applovin.impl;

import Va.M6;
import android.app.Activity;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.database.ContentObserver;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.provider.Settings;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.applovin.adview.AppLovinAdView;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.applovin.adview.AppLovinFullscreenImmersiveActivity;
import com.applovin.impl.AbstractC1654o0;
import com.applovin.impl.C1640h0;
import com.applovin.impl.adview.a;
import com.applovin.impl.adview.e;
import com.applovin.impl.e6;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.i;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinSdkUtils;
import com.unity3d.services.ads.adunit.AdUnitActivity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class w1 implements AppLovinBroadcastManager.Receiver, a.b {

    /* renamed from: A, reason: collision with root package name */
    protected int f23416A;

    /* renamed from: B, reason: collision with root package name */
    protected boolean f23417B;

    /* renamed from: C, reason: collision with root package name */
    private ContentObserver f23418C;

    /* renamed from: D, reason: collision with root package name */
    private Float f23419D;

    /* renamed from: E, reason: collision with root package name */
    protected AppLovinAdClickListener f23420E;

    /* renamed from: F, reason: collision with root package name */
    protected AppLovinAdDisplayListener f23421F;

    /* renamed from: G, reason: collision with root package name */
    protected AppLovinAdVideoPlaybackListener f23422G;

    /* renamed from: H, reason: collision with root package name */
    protected h7 f23423H;

    /* renamed from: I, reason: collision with root package name */
    protected h7 f23424I;

    /* renamed from: J, reason: collision with root package name */
    protected boolean f23425J;

    /* renamed from: K, reason: collision with root package name */
    private final C1640h0 f23426K;
    private boolean L;

    /* renamed from: a, reason: collision with root package name */
    protected final com.applovin.impl.sdk.ad.b f23427a;

    /* renamed from: b, reason: collision with root package name */
    protected final com.applovin.impl.sdk.k f23428b;

    /* renamed from: c, reason: collision with root package name */
    protected final com.applovin.impl.sdk.o f23429c;

    /* renamed from: d, reason: collision with root package name */
    protected Activity f23430d;

    /* renamed from: e, reason: collision with root package name */
    private final int f23431e;

    /* renamed from: f, reason: collision with root package name */
    private final Handler f23432f;

    /* renamed from: g, reason: collision with root package name */
    private final AbstractC1626b f23433g;

    /* renamed from: h, reason: collision with root package name */
    private final i.a f23434h;

    /* renamed from: i, reason: collision with root package name */
    private AppLovinAdView f23435i;

    /* renamed from: j, reason: collision with root package name */
    protected com.applovin.impl.adview.k f23436j;
    protected final com.applovin.impl.adview.g k;

    /* renamed from: l, reason: collision with root package name */
    protected final com.applovin.impl.adview.g f23437l;

    /* renamed from: m, reason: collision with root package name */
    protected final long f23438m;

    /* renamed from: n, reason: collision with root package name */
    private final AtomicBoolean f23439n;

    /* renamed from: o, reason: collision with root package name */
    private final AtomicBoolean f23440o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f23441p;

    /* renamed from: q, reason: collision with root package name */
    protected long f23442q;

    /* renamed from: r, reason: collision with root package name */
    protected long f23443r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f23444s;

    /* renamed from: t, reason: collision with root package name */
    protected boolean f23445t;

    /* renamed from: u, reason: collision with root package name */
    protected int f23446u;

    /* renamed from: v, reason: collision with root package name */
    protected boolean f23447v;

    /* renamed from: w, reason: collision with root package name */
    private int f23448w;

    /* renamed from: x, reason: collision with root package name */
    private final ArrayList f23449x;

    /* renamed from: y, reason: collision with root package name */
    protected int f23450y;

    /* renamed from: z, reason: collision with root package name */
    protected int f23451z;

    public class a implements AppLovinAdDisplayListener {
        public a() {
        }

        @Override // com.applovin.sdk.AppLovinAdDisplayListener
        public void adDisplayed(AppLovinAd appLovinAd) {
            com.applovin.impl.sdk.o oVar = w1.this.f23429c;
            if (com.applovin.impl.sdk.o.a()) {
                w1.this.f23429c.a("AppLovinFullscreenActivity", "Web content rendered");
            }
        }

        @Override // com.applovin.sdk.AppLovinAdDisplayListener
        public void adHidden(AppLovinAd appLovinAd) {
            com.applovin.impl.sdk.o oVar = w1.this.f23429c;
            if (com.applovin.impl.sdk.o.a()) {
                w1.this.f23429c.a("AppLovinFullscreenActivity", "Closing from WebView");
            }
            w1.this.a("web_view");
        }
    }

    public class b implements i.a {
        public b() {
        }

        @Override // com.applovin.impl.sdk.i.a
        public void a(int i5) {
            w1 w1Var = w1.this;
            if (w1Var.f23416A != com.applovin.impl.sdk.i.f22975h) {
                w1Var.f23417B = true;
            }
            com.applovin.impl.adview.b bVarF = w1Var.f23435i.getController().f();
            if (bVarF == null) {
                com.applovin.impl.sdk.o oVar = w1.this.f23429c;
                if (com.applovin.impl.sdk.o.a()) {
                    w1.this.f23429c.k("AppLovinFullscreenActivity", "Unable to handle ringer mode change: no valid web view.");
                }
            } else if (com.applovin.impl.sdk.i.a(i5) && !com.applovin.impl.sdk.i.a(w1.this.f23416A)) {
                bVarF.a("javascript:al_muteSwitchOn();");
            } else if (i5 == 2) {
                bVarF.a("javascript:al_muteSwitchOff();");
            }
            w1.this.f23416A = i5;
        }
    }

    public class c extends AbstractC1626b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.applovin.impl.sdk.k f23454a;

        public c(com.applovin.impl.sdk.k kVar) {
            this.f23454a = kVar;
        }

        private boolean a(Activity activity) {
            return activity.getClass().getName().equals(o7.a(activity.getApplicationContext(), "AppLovinFullscreenActivity", this.f23454a));
        }

        @Override // com.applovin.impl.AbstractC1626b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (!w1.this.z() && a(activity)) {
                w1.this.d();
            }
        }

        @Override // com.applovin.impl.AbstractC1626b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            if (w1.this.z() && a(activity)) {
                w1.this.d();
            }
        }
    }

    public class d extends ContentObserver {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.applovin.impl.sdk.k f23456a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Handler handler, com.applovin.impl.sdk.k kVar) {
            super(handler);
            this.f23456a = kVar;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z2) {
            Float fB = this.f23456a.p().b();
            if (fB == null || w1.this.f23419D == null || fB.equals(w1.this.f23419D)) {
                return;
            }
            String str = fB.floatValue() > w1.this.f23419D.floatValue() ? "volume_up" : "volume_down";
            JSONObject jSONObject = new JSONObject();
            JsonUtils.putDouble(jSONObject, "volume", fB.floatValue());
            w1.this.e("javascript:al_onVolumeChangedEvent('" + str + "'," + jSONObject + ");");
            w1.this.f23419D = fB;
        }
    }

    public class e extends AbstractC1626b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ t4 f23458a;

        public e(t4 t4Var) {
            this.f23458a = t4Var;
        }

        @Override // com.applovin.impl.AbstractC1626b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            if (activity instanceof AppLovinFullscreenActivity) {
                this.f23458a.b(null);
                w1.this.f23428b.e().b(this);
            }
        }
    }

    public interface g {
        void a(w1 w1Var);

        void a(String str, Throwable th);
    }

    public class h implements AppLovinAdClickListener, View.OnClickListener {
        private h() {
        }

        @Override // com.applovin.sdk.AppLovinAdClickListener
        public void adClicked(AppLovinAd appLovinAd) {
            com.applovin.impl.sdk.o oVar = w1.this.f23429c;
            if (com.applovin.impl.sdk.o.a()) {
                w1.this.f23429c.a("AppLovinFullscreenActivity", "Clicking through graphic");
            }
            t2.a(w1.this.f23420E, appLovinAd);
            w1.this.f23451z++;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            w1 w1Var = w1.this;
            if (view != w1Var.k || !((Boolean) w1Var.f23428b.a(y4.f23767c2)).booleanValue()) {
                com.applovin.impl.sdk.o oVar = w1.this.f23429c;
                if (com.applovin.impl.sdk.o.a()) {
                    w1.this.f23429c.b("AppLovinFullscreenActivity", "Unhandled click on widget: " + view);
                    return;
                }
                return;
            }
            w1.f(w1.this);
            if (w1.this.f23427a.O0()) {
                w1.this.e("javascript:al_onCloseButtonTapped(" + w1.this.f23448w + "," + w1.this.f23450y + "," + w1.this.f23451z + ");");
            }
            List listF = w1.this.f23427a.F();
            com.applovin.impl.sdk.o oVar2 = w1.this.f23429c;
            if (com.applovin.impl.sdk.o.a()) {
                w1.this.f23429c.a("AppLovinFullscreenActivity", "Handling close button tap " + w1.this.f23448w + " with multi close delay: " + listF);
            }
            if (listF == null || listF.size() <= w1.this.f23448w) {
                w1.this.a("native_close_button");
                return;
            }
            w1.this.f23449x.add(Long.valueOf(SystemClock.elapsedRealtime() - w1.this.f23442q));
            List listD = w1.this.f23427a.D();
            if (listD != null && listD.size() > w1.this.f23448w) {
                w1 w1Var2 = w1.this;
                w1Var2.k.a((e.a) listD.get(w1Var2.f23448w));
            }
            com.applovin.impl.sdk.o oVar3 = w1.this.f23429c;
            if (com.applovin.impl.sdk.o.a()) {
                w1.this.f23429c.a("AppLovinFullscreenActivity", "Scheduling next close button with delay: " + listF.get(w1.this.f23448w));
            }
            w1.this.k.setVisibility(8);
            w1 w1Var3 = w1.this;
            w1Var3.a(w1Var3.k, ((Integer) listF.get(w1Var3.f23448w)).intValue(), new D0(this, 2));
        }

        public /* synthetic */ h(w1 w1Var, a aVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a() {
            w1.this.f23442q = SystemClock.elapsedRealtime();
        }
    }

    public w1(com.applovin.impl.sdk.ad.b bVar, Activity activity, Map map, com.applovin.impl.sdk.k kVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        Handler handler = new Handler(Looper.getMainLooper());
        this.f23432f = handler;
        this.f23438m = SystemClock.elapsedRealtime();
        this.f23439n = new AtomicBoolean();
        this.f23440o = new AtomicBoolean();
        this.f23442q = -1L;
        this.f23448w = 0;
        this.f23449x = new ArrayList();
        this.f23450y = 0;
        this.f23451z = 0;
        this.f23416A = com.applovin.impl.sdk.i.f22975h;
        this.L = false;
        this.f23427a = bVar;
        this.f23428b = kVar;
        this.f23429c = kVar.O();
        this.f23430d = activity;
        this.f23431e = bVar.R();
        this.f23420E = appLovinAdClickListener;
        this.f23421F = appLovinAdDisplayListener;
        this.f23422G = appLovinAdVideoPlaybackListener;
        this.f23426K = new C1640h0(kVar);
        h hVar = new h(this, null);
        if (((Boolean) kVar.a(y4.f23901s2)).booleanValue()) {
            AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.render_process_gone"));
        }
        if (((Boolean) kVar.a(y4.f23943y2)).booleanValue()) {
            AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.al_onPoststitialShow_evaluation_error"));
        }
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.custom_tabs_shown"));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.custom_tabs_hidden"));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.custom_tabs_failure"));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.custom_intent_launch_success"));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.custom_intent_launch_failure"));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.external_redirect_success"));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.external_redirect_failure"));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.preload_success"));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.preload_failure"));
        u1 u1Var = new u1(kVar.z0(), AppLovinAdSize.INTERSTITIAL, activity);
        this.f23435i = u1Var;
        u1Var.setAdClickListener(hVar);
        this.f23435i.setAdDisplayListener(new a());
        bVar.h().putString("ad_view_address", f8.a(this.f23435i));
        this.f23435i.getController().a(this);
        c2 c2Var = new c2(map, kVar);
        if (c2Var.c()) {
            this.f23436j = new com.applovin.impl.adview.k(c2Var, activity);
        }
        kVar.k().trackImpression(bVar);
        List listF = bVar.F();
        if (bVar.r() >= 0 || listF != null) {
            com.applovin.impl.adview.g gVar = new com.applovin.impl.adview.g(bVar.p(), activity);
            this.k = gVar;
            gVar.setVisibility(8);
            gVar.setOnClickListener(hVar);
        } else {
            this.k = null;
        }
        com.applovin.impl.adview.g gVar2 = new com.applovin.impl.adview.g(e.a.WHITE_ON_TRANSPARENT, activity);
        this.f23437l = gVar2;
        gVar2.setOnClickListener(new K(this, 2));
        if (bVar.V0()) {
            this.f23434h = new b();
        } else {
            this.f23434h = null;
        }
        this.f23433g = new c(kVar);
        if (bVar.R0()) {
            this.f23419D = kVar.p().b();
            this.f23418C = new d(handler, kVar);
            activity.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI.buildUpon().appendPath("volume_music_speaker").build(), false, this.f23418C);
        }
    }

    private void B() {
        if (this.f23434h != null) {
            this.f23428b.p().a(this.f23434h);
        }
        if (this.f23433g != null) {
            this.f23428b.e().a(this.f23433g);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean z() {
        return a() >= 0;
    }

    public abstract void A();

    public abstract void a(ViewGroup viewGroup);

    public abstract void b(long j8);

    public void l() {
        if (!this.f23441p && this.f23440o.compareAndSet(false, true)) {
            t2.b(this.f23421F, this.f23427a);
            this.f23428b.H().b(this.f23427a);
            HashMap map = new HashMap();
            com.applovin.impl.sdk.ad.b bVar = this.f23427a;
            if (bVar != null) {
                CollectionUtils.putStringIfValid("source", bVar.v(), map);
                CollectionUtils.putStringIfValid("details", f2.b(this.f23427a), map);
            }
            this.f23428b.g().a(d2.f21265F, this.f23427a, map);
        }
    }

    public abstract void m();

    public void n() {
        h7 h7Var = this.f23423H;
        if (h7Var != null) {
            h7Var.d();
        }
    }

    public void o() {
        h7 h7Var = this.f23423H;
        if (h7Var != null) {
            h7Var.e();
        }
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        String action = intent.getAction();
        if (action == null) {
            return;
        }
        switch (action) {
            case "com.applovin.al_onPoststitialShow_evaluation_error":
                e();
                break;
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
            case "com.applovin.render_process_gone":
                if (!this.f23445t) {
                    f();
                    break;
                }
                break;
            case "com.applovin.preload_success":
            case "com.applovin.preload_failure":
                d(action, map);
                break;
        }
    }

    public void p() {
        com.applovin.impl.adview.b bVarF;
        if (this.f23435i == null || !this.f23427a.t0() || (bVarF = this.f23435i.getController().f()) == null) {
            return;
        }
        this.f23426K.a(bVarF, new f());
    }

    public void q() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f23429c.d("AppLovinFullscreenActivity", "onBackPressed()");
        }
        if (this.L) {
            a("back_button");
        }
        if (this.f23427a.O0()) {
            e("javascript:onBackPressed();");
        }
    }

    public void r() {
        AppLovinAdView appLovinAdView = this.f23435i;
        if (appLovinAdView != null) {
            ViewParent parent = appLovinAdView.getParent();
            this.f23435i.destroy();
            this.f23435i = null;
            if ((parent instanceof ViewGroup) && i()) {
                ((ViewGroup) parent).removeAllViews();
            }
        }
        m();
        l();
        this.f23420E = null;
        this.f23421F = null;
        this.f23422G = null;
        this.f23430d = null;
        AppLovinBroadcastManager.unregisterReceiver(this);
    }

    public void s() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f23429c.d("AppLovinFullscreenActivity", "onPause()");
        }
        d("javascript:al_onAppPaused();");
        n();
    }

    public void t() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f23429c.d("AppLovinFullscreenActivity", "onResume()");
        }
        d("javascript:al_onAppResumed();");
        o();
    }

    public void u() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f23429c.d("AppLovinFullscreenActivity", "onStop()");
        }
    }

    public abstract void v();

    public abstract void w();

    public void x() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f23429c.d("AppLovinFullscreenActivity", "Setting ad fully watched");
        }
        this.f23425J = true;
    }

    public boolean y() {
        return this.f23441p;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(String str) {
        com.applovin.impl.sdk.o.h("AppLovinFullscreenActivity", "Dismissing on-screen ad due to " + str);
        try {
            a(str);
        } catch (Throwable th) {
            com.applovin.impl.sdk.o.c("AppLovinFullscreenActivity", "Failed to dismiss ad.", th);
            try {
                l();
            } catch (Throwable unused) {
            }
        }
    }

    public static /* synthetic */ int f(w1 w1Var) {
        int i5 = w1Var.f23448w;
        w1Var.f23448w = i5 + 1;
        return i5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j() {
        if (this.f23427a.R() <= this.f23431e && !AbstractC1631d.d(this.f23430d)) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f23429c.d("AppLovinFullscreenActivity", "Ad reshow timed out. Will attempt to bring existing ad activity to front.");
            }
            this.f23441p = false;
            long jC = this.f23427a.c();
            if (jC > 0) {
                a(jC).a(t4.f23286h, new G(this, 6));
            } else {
                f("app_relaunch_reshow_timed_out");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k() {
        if (this.f23427a.z0().getAndSet(true)) {
            return;
        }
        this.f23428b.r0().a((j5) new n6(this.f23427a, this.f23428b), e6.b.OTHER);
    }

    public boolean h() {
        return AppLovinAdType.INCENTIVIZED == this.f23427a.getType();
    }

    public boolean i() {
        return this.f23430d instanceof AppLovinFullscreenActivity;
    }

    private void f(String str) {
        if (this.f23440o.get()) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new W0(this, str, 0));
    }

    public AppLovinAdView b() {
        return this.f23435i;
    }

    public void d(boolean z2) {
        this.f23441p = z2;
    }

    public void e(String str) {
        a(str, 0L);
    }

    public boolean g() {
        return this.f23444s;
    }

    public class f implements C1640h0.c {
        public f() {
        }

        @Override // com.applovin.impl.C1640h0.c
        public void a(int i5, int i10) {
            Map mapA = f2.a((AppLovinAdImpl) w1.this.f23427a);
            mapA.putAll(f2.a(w1.this.f23427a));
            mapA.put("details", "detection_count=" + i5 + ",total_checks=" + i10);
            w1.this.f23428b.D().d(d2.f21276K0, mapA);
        }

        @Override // com.applovin.impl.C1640h0.c
        public void a(int i5, int i10, int i11) {
            Map mapA = f2.a((AppLovinAdImpl) w1.this.f23427a);
            mapA.putAll(f2.a(w1.this.f23427a));
            mapA.put("details", "detections_to_report=" + i5 + ",detection_count=" + i10 + ",total_checks=" + i11);
            w1.this.f23428b.D().d(d2.f21277L0, mapA);
            if (((Boolean) w1.this.f23428b.a(y4.f23905s6)).booleanValue()) {
                w1.this.x();
            }
            if (((Boolean) w1.this.f23428b.a(y4.f23704U0)).booleanValue()) {
                w1.this.f23428b.G().c(w1.this.f23427a, com.applovin.impl.sdk.k.o());
            }
            if (((Boolean) w1.this.f23428b.a(y4.f23872o6)).booleanValue()) {
                w1.this.a("black_view_auto_dismiss");
                return;
            }
            w1 w1Var = w1.this;
            w1Var.L = ((Boolean) w1Var.f23428b.a(y4.f23880p6)).booleanValue();
            if (((Boolean) w1.this.f23428b.a(y4.f23888q6)).booleanValue()) {
                w1.this.A();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        if (z()) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f23429c.d("AppLovinFullscreenActivity", "App relaunch detected with launcher activity. Will attempt to re-show the ad");
            }
            this.f23441p = true;
            long jF = this.f23427a.f();
            if (jF < 0) {
                return;
            }
            a(new X0(this, 1), jF);
            return;
        }
        f("app_relaunch");
    }

    public void b(boolean z2) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f23429c.d("AppLovinFullscreenActivity", "onWindowFocusChanged(boolean) - " + z2);
        }
        d("javascript:al_onWindowFocusChanged( " + z2 + " );");
        h7 h7Var = this.f23424I;
        if (h7Var != null) {
            if (z2) {
                h7Var.e();
            } else {
                h7Var.d();
            }
        }
    }

    public void e() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f23429c.d("AppLovinFullscreenActivity", "Handling al_onPoststitialShow evaluation error");
        }
    }

    public static void a(com.applovin.impl.sdk.ad.b bVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, Map map, com.applovin.impl.sdk.k kVar, Activity activity, g gVar) {
        w1 z1Var;
        if (bVar instanceof p7) {
            try {
                z1Var = new z1(bVar, activity, map, kVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
            } catch (Throwable th) {
                gVar.a("Failed to create FullscreenVastVideoAdPresenter with sdk: " + kVar + " and throwable: " + th.getMessage(), th);
                return;
            }
        } else if (bVar.hasVideoUrl()) {
            try {
                z1Var = new a2(bVar, activity, map, kVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
            } catch (Throwable th2) {
                gVar.a("Failed to create FullscreenVideoAdPresenter with sdk: " + kVar + " and throwable: " + th2.getMessage(), th2);
                return;
            }
        } else {
            try {
                z1Var = new x1(bVar, activity, map, kVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
            } catch (Throwable th3) {
                gVar.a("Failed to create FullscreenGraphicAdPresenter with sdk: " + kVar + " and throwable: " + th3.getMessage(), th3);
                return;
            }
        }
        z1Var.B();
        gVar.a(z1Var);
    }

    public void f() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f23429c.d("AppLovinFullscreenActivity", "Handling render process crash");
        }
        this.f23445t = true;
    }

    public void c(boolean z2) {
        a(z2, ((Long) this.f23428b.a(y4.f23893r2)).longValue());
        if (!this.f23427a.s0()) {
            t2.a(this.f23421F, this.f23427a);
        }
        this.f23428b.H().a(this.f23427a);
        if (!this.f23427a.s0() && (this.f23427a.hasVideoUrl() || h())) {
            t2.a(this.f23422G, this.f23427a);
        }
        new n4(this.f23430d).a(this.f23427a);
        this.f23427a.setHasShown(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(String str) {
        com.applovin.impl.adview.b bVarF;
        AppLovinAdView appLovinAdView = this.f23435i;
        if (appLovinAdView == null || (bVarF = appLovinAdView.getController().f()) == null) {
            return;
        }
        bVarF.a(str);
    }

    public void d(String str) {
        if (this.f23427a.v0()) {
            a(str, 0L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(com.applovin.impl.adview.g gVar, Runnable runnable) {
        f8.a(gVar, 400L, new V0(gVar, runnable, 1));
    }

    private void d(String str, Map map) {
        e(p8.d(str, map));
    }

    private void b(String str, Map map) {
        e(p8.b(str, map));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        a("backup_close_button");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void c(com.applovin.impl.adview.g gVar, Runnable runnable) {
        AppLovinSdkUtils.runOnUiThread(new V0(gVar, runnable, 0));
    }

    public long a() {
        com.applovin.impl.sdk.ad.b bVar = this.f23427a;
        if (bVar == null) {
            return -1L;
        }
        return bVar.g();
    }

    public int c() {
        int iT = this.f23427a.t();
        return (iT <= 0 && ((Boolean) this.f23428b.a(y4.f23885q2)).booleanValue()) ? this.f23446u + 1 : iT;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(boolean z2, Void r22, Void r32) {
        if (z2) {
            return;
        }
        f("app_relaunch_bring_to_front_failed");
    }

    private t4 a(long j8) {
        t4 t4Var = new t4("bringAdActivityToFront");
        e eVar = new e(t4Var);
        this.f23428b.e().a(eVar);
        Intent intent = new Intent(this.f23430d, (Class<?>) (this.f23427a.L0() ? AppLovinFullscreenImmersiveActivity.class : AppLovinFullscreenActivity.class));
        intent.setFlags(131072);
        this.f23430d.startActivity(intent);
        a(new com.applovin.impl.mediation.ads.f(this, eVar, t4Var, 7), j8);
        return t4Var;
    }

    public void c(long j8) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f23429c.a("AppLovinFullscreenActivity", "Scheduling report reward in " + TimeUnit.MILLISECONDS.toSeconds(j8) + " seconds...");
        }
        this.f23423H = h7.a(j8, this.f23428b, new X0(this, 0));
    }

    private void c(String str, Map map) {
        e(p8.c(str, map));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(AbstractC1626b abstractC1626b, t4 t4Var) {
        this.f23428b.e().b(abstractC1626b);
        if (t4Var.c()) {
            return;
        }
        t4Var.a((Object) null);
    }

    public boolean a(boolean z2) {
        List listA = o7.a(z2, this.f23427a, this.f23428b, this.f23430d);
        if (listA.isEmpty()) {
            return false;
        }
        if (((Boolean) this.f23428b.a(y4.f23758b1)).booleanValue() && !o7.a(listA, this.f23427a)) {
            a(listA, (com.applovin.impl.sdk.ad.a) this.f23427a);
            return false;
        }
        String str = "Missing ad resources: " + listA;
        Map mapA = f2.a((AppLovinAdImpl) this.f23427a);
        if (((Boolean) this.f23428b.a(y4.f23709U5)).booleanValue()) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f23429c.b("AppLovinFullscreenActivity", "Dismissing ad due to missing resources: " + listA);
            }
            if (((Boolean) this.f23428b.a(y4.f23733X5)).booleanValue()) {
                AppLovinAdDisplayListener appLovinAdDisplayListener = this.f23421F;
                if (appLovinAdDisplayListener instanceof l2) {
                    t2.a(appLovinAdDisplayListener, "Missing ad resources");
                }
            } else {
                n2.a(this.f23427a, this.f23421F, "Missing ad resources", (Throwable) null, (AppLovinFullscreenActivity) null);
            }
            a("missing_ad_resources");
            a(str, "Failing ad display", mapA);
            HashMap<String, String> mapHashMap = CollectionUtils.hashMap("source", "missingCachedAdResources");
            CollectionUtils.putStringIfValid("error_message", str, mapHashMap);
            this.f23428b.g().a(d2.f21263E, this.f23427a, mapHashMap);
            return ((Boolean) this.f23428b.a(y4.f23725W5)).booleanValue();
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f23429c.b("AppLovinFullscreenActivity", "Streaming ad due to missing ad resources: " + listA);
        }
        this.f23427a.E0();
        a(str, "Streaming ad", mapA);
        return false;
    }

    private void a(List list, com.applovin.impl.sdk.ad.a aVar) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f23429c.a("AppLovinFullscreenActivity", "Restoring original URLs for missing non-required cached resources: " + list);
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        aVar.a(list);
        HashMap<String, String> mapHashMap = CollectionUtils.hashMap("duration_ms", String.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
        CollectionUtils.putStringIfValid("details", list.toString(), mapHashMap);
        this.f23428b.g().a(d2.f21273J, aVar, mapHashMap);
    }

    public void a(AbstractC1654o0.a aVar, AbstractC1654o0.a aVar2, AbstractC1654o0.a aVar3) {
        if (((Boolean) this.f23428b.a(y4.f23624J4)).booleanValue()) {
            HashMap map = new HashMap();
            map.put(AdUnitActivity.EXTRA_ORIENTATION, o7.b(this.f23430d));
            if (aVar != null) {
                map.put("display_cutout_insets", aVar.e());
            }
            if (aVar2 != null) {
                map.put("status_bar_insets", aVar2.e());
            }
            if (aVar3 != null) {
                map.put("nav_bar_insets", aVar3.e());
            }
            e(p8.a(map));
        }
    }

    public void a(String str) {
        this.f23444s = true;
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f23438m;
        if (com.applovin.impl.sdk.o.a()) {
            this.f23429c.d("AppLovinFullscreenActivity", "Dismissing ad after " + TimeUnit.MILLISECONDS.toSeconds(jElapsedRealtime) + " seconds from source: " + str);
        }
        com.applovin.impl.sdk.ad.b bVar = this.f23427a;
        if (bVar != null) {
            bVar.getAdEventTracker().f();
        }
        this.f23432f.removeCallbacksAndMessages(null);
        a("javascript:al_onPoststitialDismiss();", this.f23427a != null ? r0.w() : 0L);
        if (((Boolean) this.f23428b.a(y4.f23679Q6)).booleanValue()) {
            com.applovin.impl.sdk.ad.b bVar2 = this.f23427a;
            if (bVar2 != null) {
                bVar2.a(str);
            }
            m();
        }
        l();
        this.f23426K.b();
        if (this.f23434h != null) {
            this.f23428b.p().b(this.f23434h);
        }
        if (this.f23433g != null) {
            this.f23428b.e().b(this.f23433g);
        }
        if (this.f23418C != null) {
            this.f23430d.getContentResolver().unregisterContentObserver(this.f23418C);
            this.f23418C = null;
        }
        if (i()) {
            this.f23430d.finish();
            return;
        }
        this.f23428b.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f23428b.O().a("AppLovinFullscreenActivity", "Fullscreen ad shown in container view dismissed, destroying the presenter.");
        }
        r();
    }

    public void a(Configuration configuration) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f23429c.d("AppLovinFullscreenActivity", "onConfigurationChanged(Configuration) -  " + configuration);
        }
    }

    public void a(int i5, KeyEvent keyEvent) {
        if (this.f23429c == null || !com.applovin.impl.sdk.o.a()) {
            return;
        }
        this.f23429c.d("AppLovinFullscreenActivity", "onKeyDown(int, KeyEvent) -  " + i5 + ", " + keyEvent);
    }

    public void a(String str, long j8) {
        if (j8 < 0 || !StringUtils.isValidString(str)) {
            return;
        }
        a(new W0(this, str, 1), j8);
    }

    public void a(com.applovin.impl.adview.g gVar, long j8, Runnable runnable) {
        if (j8 >= ((Long) this.f23428b.a(y4.f23759b2)).longValue()) {
            return;
        }
        this.f23424I = h7.a(TimeUnit.SECONDS.toMillis(j8), this.f23428b, new V0(gVar, runnable, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(com.applovin.impl.adview.g gVar, Runnable runnable) {
        gVar.bringToFront();
        runnable.run();
    }

    public void a(int i5, boolean z2, boolean z10, long j8) {
        if (!this.f23441p && this.f23439n.compareAndSet(false, true)) {
            if (this.f23427a.hasVideoUrl() || h()) {
                t2.a(this.f23422G, this.f23427a, i5, z10);
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f23438m;
            this.f23428b.k().trackVideoEnd(this.f23427a, TimeUnit.MILLISECONDS.toSeconds(jElapsedRealtime), i5, z2);
            long jElapsedRealtime2 = this.f23442q != -1 ? SystemClock.elapsedRealtime() - this.f23442q : -1L;
            this.f23428b.k().trackFullScreenAdClosed(this.f23427a, jElapsedRealtime2, this.f23449x, j8, this.f23417B, this.f23416A);
            if (com.applovin.impl.sdk.o.a()) {
                com.applovin.impl.sdk.o oVar = this.f23429c;
                StringBuilder sb2 = new StringBuilder("Video ad ended at percent: ");
                sb2.append(i5);
                sb2.append("%, elapsedTime: ");
                sb2.append(jElapsedRealtime);
                M6.A(sb2, "ms, skipTimeMillis: ", j8, "ms, closeTimeMillis: ");
                oVar.a("AppLovinFullscreenActivity", M6.s(sb2, jElapsedRealtime2, "ms"));
            }
        }
    }

    private void a(String str, String str2, Map map) {
        HashMap map2 = new HashMap(map);
        CollectionUtils.putStringIfValid("error_message", str, map2);
        CollectionUtils.putStringIfValid("details", str2, map2);
        this.f23428b.D().a(d2.f21279M0, "missingCachedAdResources", map2);
    }

    @Override // com.applovin.impl.adview.a.b
    public void a(com.applovin.impl.adview.a aVar) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f23429c.a("AppLovinFullscreenActivity", "Fully watched from ad web view...");
        }
        this.f23425J = true;
    }

    public void a(boolean z2, long j8) {
        if (this.f23427a.H0()) {
            a(z2 ? "javascript:al_mute();" : "javascript:al_unmute();", j8);
        }
    }

    private void a(String str, Map map) {
        e(p8.a(str, map));
    }

    public void a(Runnable runnable, long j8) {
        AppLovinSdkUtils.runOnUiThreadDelayed(runnable, j8, this.f23432f);
    }
}
