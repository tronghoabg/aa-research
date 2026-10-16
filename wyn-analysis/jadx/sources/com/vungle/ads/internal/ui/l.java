package com.vungle.ads.internal.ui;

import A7.AbstractC0279p0;
import G6.T;
import a.AbstractC1304a;
import ad.L;
import android.R;
import android.app.Activity;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import android.window.OnBackInvokedCallback;
import b1.C1494c;
import com.applovin.shadow.okhttp3.internal.http2.Http2Connection;
import com.moloco.sdk.internal.publisher.H;
import com.vungle.ads.AdCantPlayWithoutWebView;
import com.vungle.ads.AdConfig;
import com.vungle.ads.AdNotLoadedCantPlay;
import com.vungle.ads.ConcurrentPlaybackUnsupported;
import com.vungle.ads.VungleError;
import com.vungle.ads.internal.AnalyticsClient;
import com.vungle.ads.internal.m2;
import com.vungle.ads.internal.model.h0;
import com.vungle.ads.internal.model.i3;
import com.vungle.ads.internal.model.r3;
import com.vungle.ads.internal.presenter.e0;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.y0;
import ef.EnumC2526j;
import ef.InterfaceC2525i;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import k1.J;
import k1.S;
import k1.v0;
import k1.w0;
import k1.x0;
import ka.AbstractC3256n;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public abstract class l extends Activity {

    /* renamed from: h, reason: collision with root package name */
    public static volatile y0 f33730h;

    /* renamed from: i, reason: collision with root package name */
    public static volatile com.vungle.ads.internal.presenter.a f33731i;

    /* renamed from: a, reason: collision with root package name */
    public com.vungle.ads.internal.presenter.r f33732a;

    /* renamed from: b, reason: collision with root package name */
    public r3 f33733b;

    /* renamed from: c, reason: collision with root package name */
    public Object f33734c;

    /* renamed from: e, reason: collision with root package name */
    public com.vungle.ads.internal.util.s f33736e;

    /* renamed from: d, reason: collision with root package name */
    public final com.vungle.ads.internal.util.w f33735d = new com.vungle.ads.internal.util.w();

    /* renamed from: f, reason: collision with root package name */
    public final b f33737f = new b(this);

    /* renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f33738g = new AtomicBoolean(false);

    static {
        new a();
    }

    public static final void b(l this$0) {
        AbstractC3340k.e(this$0, "this$0");
        com.vungle.ads.internal.presenter.r rVar = this$0.f33732a;
        if (rVar != null) {
            rVar.d();
        }
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i5, int i10, Intent intent) throws Throwable {
        super.onActivityResult(i5, i10, intent);
        boolean z2 = com.vungle.ads.internal.util.u.f33874a;
        com.vungle.ads.internal.util.t.a("AdActivity", new c(i5, i10, intent));
        if (i5 == 10001) {
            this.f33738g.set(false);
            com.vungle.ads.internal.presenter.r rVar = this.f33732a;
            if (rVar != null) {
                String strG = AbstractC3256n.g(i10, "onActivityResultCode=");
                m2 m2Var = new m2(Sdk.SDKMetric.SDKMetricType.INLINE_INSTALL_STATUS);
                m2Var.f33080c = 1L;
                AnalyticsClient.INSTANCE.a(m2Var, rVar.b(), strG);
            }
        }
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        com.vungle.ads.internal.presenter.r rVar = this.f33732a;
        if (rVar != null) {
            rVar.d();
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration newConfig) {
        AbstractC3340k.e(newConfig, "newConfig");
        try {
            super.onConfigurationChanged(newConfig);
            int i5 = newConfig.orientation;
            if (i5 == 2) {
                boolean z2 = com.vungle.ads.internal.util.u.f33874a;
                com.vungle.ads.internal.util.t.a("AdActivity", "landscape");
            } else if (i5 == 1) {
                boolean z10 = com.vungle.ads.internal.util.u.f33874a;
                com.vungle.ads.internal.util.t.a("AdActivity", "portrait");
            }
            com.vungle.ads.internal.presenter.r rVar = this.f33732a;
            if (rVar != null) {
                rVar.f();
            }
        } catch (Exception e7) {
            boolean z11 = com.vungle.ads.internal.util.u.f33874a;
            StringBuilder sbA = com.iab.omid.library.vungle.internal.l.a("onConfigurationChanged: ");
            sbA.append(e7.getLocalizedMessage());
            com.vungle.ads.internal.util.t.b("AdActivity", sbA.toString());
        }
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) throws Throwable {
        H x0Var;
        String watermark$vungle_ads_release;
        View decorView;
        super.onCreate(bundle);
        requestWindowFeature(1);
        getWindow().setFlags(Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE, Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
        y0 y0Var = f33730h;
        com.vungle.ads.internal.presenter.a aVar = f33731i;
        if (y0Var == null) {
            Intent intent = getIntent();
            AbstractC3340k.d(intent, "intent");
            String strB = a.b(intent);
            if (strB == null) {
                strB = "";
            }
            if (aVar != null) {
                aVar.a(new AdNotLoadedCantPlay(AbstractC0279p0.l("Can not play fullscreen ad. placement=", strB, " pendingData is null")).setLogEntry$vungle_ads_release(this.f33736e).logError$vungle_ads_release(), strB);
            }
            finish();
            return;
        }
        h0 h0VarA = y0Var.a();
        i3 i3VarB = y0Var.b();
        com.vungle.ads.internal.presenter.z zVarC = y0Var.c();
        this.f33736e = h0VarA.q();
        try {
            com.vungle.ads.internal.ui.view.k kVar = new com.vungle.ads.internal.ui.view.k(this, h0VarA.h());
            AbstractC1304a.I(getWindow(), false);
            long j8 = getIntent().getBooleanExtra("ad_invisible_logged", false) ? 3L : 2L;
            AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
            m2 m2Var = new m2(Sdk.SDKMetric.SDKMetricType.AD_VISIBILITY);
            m2Var.a(Long.valueOf(j8));
            AnalyticsClient.a(analyticsClient, m2Var, this.f33736e, 4);
            boolean z2 = com.vungle.ads.internal.util.u.f33874a;
            com.vungle.ads.internal.util.t.a("AdActivity", "Log metric AD_VISIBILITY: " + j8);
            EnumC2526j enumC2526j = EnumC2526j.f34667a;
            InterfaceC2525i interfaceC2525iY = Fe.c.y(enumC2526j, new d(this));
            Intent intent2 = getIntent();
            AbstractC3340k.d(intent2, "intent");
            String strA = a.a(intent2);
            FrameLayout frameLayout = null;
            r3 r3Var = strA != null ? new r3(strA) : null;
            this.f33733b = r3Var;
            if (r3Var != null) {
                ((com.vungle.ads.internal.signals.j) interfaceC2525iY.getValue()).a(r3Var);
            }
            kVar.setCloseDelegate(new h(this, interfaceC2525iY));
            kVar.setOnViewTouchListener(new i(this));
            kVar.setOrientationDelegate(new j(this));
            InterfaceC2525i interfaceC2525iY2 = Fe.c.y(enumC2526j, new e(this));
            InterfaceC2525i interfaceC2525iY3 = Fe.c.y(enumC2526j, new f(this));
            com.vungle.ads.internal.executor.j jVarF = ((com.vungle.ads.internal.executor.d) ((com.vungle.ads.internal.executor.a) interfaceC2525iY2.getValue())).f();
            ReentrantLock reentrantLock = e0.f33519a;
            z zVarA = e0.a(h0VarA, i3VarB, jVarF, (com.vungle.ads.internal.platform.f) interfaceC2525iY3.getValue());
            com.vungle.ads.internal.omsdk.d dVar = (com.vungle.ads.internal.omsdk.d) Fe.c.y(enumC2526j, new g(this)).getValue();
            boolean zC = h0VarA.C();
            dVar.getClass();
            com.vungle.ads.internal.omsdk.e eVarA = com.vungle.ads.internal.omsdk.d.a(zC);
            com.vungle.ads.internal.executor.j jVarD = ((com.vungle.ads.internal.executor.d) ((com.vungle.ads.internal.executor.a) interfaceC2525iY2.getValue())).d();
            zVarA.a(eVarA);
            this.f33735d.a(zVarA);
            com.vungle.ads.internal.presenter.r rVar = new com.vungle.ads.internal.presenter.r(kVar, h0VarA, i3VarB, zVarA, jVarD, eVarA, (com.vungle.ads.internal.platform.f) interfaceC2525iY3.getValue());
            rVar.a(aVar);
            rVar.a(zVarC);
            rVar.a(new k(this));
            rVar.g();
            setContentView(kVar, kVar.getLayoutParams());
            try {
                getWindow().getDecorView().setBackgroundColor(-16777216);
            } catch (Throwable th) {
                Fe.e.z(th);
            }
            B8.b bVar = new B8.b(this, 17);
            WeakHashMap weakHashMap = S.f38779a;
            J.l(kVar, bVar);
            Window window = getWindow();
            L l10 = new L(getWindow().getDecorView());
            int i5 = Build.VERSION.SDK_INT;
            if (i5 >= 35) {
                x0Var = new k1.y0(window, l10, 1);
            } else if (i5 >= 30) {
                x0Var = new w0(window, l10, 1);
            } else {
                x0Var = i5 >= 26 ? new x0(window, l10, 0) : new w0(window, l10, 0);
            }
            x0Var.s0();
            x0Var.Z();
            AdConfig adConfigJ = h0VarA.j();
            if (adConfigJ != null && (watermark$vungle_ads_release = adConfigJ.getWatermark$vungle_ads_release()) != null) {
                Window window2 = getWindow();
                if (window2 != null && (decorView = window2.getDecorView()) != null) {
                    frameLayout = (FrameLayout) decorView.findViewById(R.id.content);
                }
                if (frameLayout != null) {
                    a0 a0Var = new a0(this, watermark$vungle_ads_release);
                    frameLayout.addView(a0Var);
                    a0Var.bringToFront();
                }
            }
            this.f33732a = rVar;
            if (Build.VERSION.SDK_INT >= 33) {
                a();
            }
            com.vungle.ads.internal.util.d dVar2 = com.vungle.ads.internal.util.d.f33838f;
            com.vungle.ads.internal.util.a.a(this.f33737f);
            try {
                registerReceiver(this.f33735d, new IntentFilter("android.media.RINGER_MODE_CHANGED"));
            } catch (Throwable th2) {
                Fe.e.z(th2);
            }
        } catch (InstantiationException e7) {
            if (aVar != null) {
                aVar.a(new AdCantPlayWithoutWebView(e7.getMessage()).setLogEntry$vungle_ads_release(this.f33736e).logError$vungle_ads_release(), i3VarB.b());
            }
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        if (Build.VERSION.SDK_INT >= 33) {
            Object obj = this.f33734c;
            OnBackInvokedCallback onBackInvokedCallbackI = T.y(obj) ? ea.T.i(obj) : null;
            if (onBackInvokedCallbackI != null) {
                getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(onBackInvokedCallbackI);
            }
            this.f33734c = null;
        }
        com.vungle.ads.internal.presenter.r rVar = this.f33732a;
        if (rVar != null) {
            rVar.a((isChangingConfigurations() ? 1 : 0) | 2);
        }
        com.vungle.ads.internal.presenter.r rVar2 = this.f33732a;
        if (rVar2 != null) {
            rVar2.a((k) null);
        }
        com.vungle.ads.internal.util.d dVar = com.vungle.ads.internal.util.d.f33838f;
        com.vungle.ads.internal.util.a.b(this.f33737f);
        try {
            unregisterReceiver(this.f33735d);
        } catch (Throwable th) {
            Fe.e.z(th);
        }
        this.f33732a = null;
        f33731i = null;
        f33730h = null;
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        AbstractC3340k.e(intent, "intent");
        super.onNewIntent(intent);
        Intent intent2 = getIntent();
        AbstractC3340k.d(intent2, "getIntent()");
        String strB = a.b(intent2);
        String strB2 = a.b(intent);
        Intent intent3 = getIntent();
        AbstractC3340k.d(intent3, "getIntent()");
        String strA = a.a(intent3);
        String strA2 = a.a(intent);
        if ((strB == null || strB2 == null || strB.equals(strB2)) && (strA == null || strA2 == null || strA.equals(strA2))) {
            return;
        }
        boolean z2 = com.vungle.ads.internal.util.u.f33874a;
        com.vungle.ads.internal.util.t.a("AdActivity", "Tried to play another placement " + strB2 + " while playing " + strB);
        VungleError vungleErrorLogError$vungle_ads_release = new ConcurrentPlaybackUnsupported(R8.v.g("Trying to show ", strB2, " but ", strB, " is already showing")).setLogEntry$vungle_ads_release(this.f33736e).logError$vungle_ads_release();
        com.vungle.ads.internal.presenter.a aVar = f33731i;
        if (aVar != null) {
            aVar.a(vungleErrorLogError$vungle_ads_release, strB2);
        }
        StringBuilder sbA = com.iab.omid.library.vungle.internal.l.a("onConcurrentPlaybackError: ");
        sbA.append(vungleErrorLogError$vungle_ads_release.getLocalizedMessage());
        com.vungle.ads.internal.util.t.b("AdActivity", sbA.toString());
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
        com.vungle.ads.internal.presenter.r rVar = this.f33732a;
        if (rVar != null) {
            boolean z2 = com.vungle.ads.internal.util.u.f33874a;
            com.vungle.ads.internal.util.t.a("MRAIDPresenter", "stop()");
            rVar.f33540a.b();
            rVar.f33543d.b(false);
        }
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        com.vungle.ads.internal.presenter.r rVar = this.f33732a;
        if (rVar != null) {
            boolean z2 = com.vungle.ads.internal.util.u.f33874a;
            com.vungle.ads.internal.util.t.a("MRAIDPresenter", "start()");
            rVar.f33540a.d();
            rVar.f33543d.b(true);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z2) {
        super.onWindowFocusChanged(z2);
        if (z2) {
            Window window = getWindow();
            L l10 = new L(getWindow().getDecorView());
            int i5 = Build.VERSION.SDK_INT;
            H y0Var = i5 >= 35 ? new k1.y0(window, l10, 1) : i5 >= 30 ? new w0(window, l10, 1) : i5 >= 26 ? new x0(window, l10, 0) : new w0(window, l10, 0);
            y0Var.s0();
            y0Var.Z();
        }
    }

    @Override // android.app.Activity
    public final void setRequestedOrientation(int i5) {
        super.setRequestedOrientation(i5);
    }

    public static final com.vungle.ads.internal.signals.j a(InterfaceC2525i interfaceC2525i) {
        return (com.vungle.ads.internal.signals.j) interfaceC2525i.getValue();
    }

    public static final v0 a(l this$0, View v2, v0 insets) {
        AbstractC3340k.e(this$0, "this$0");
        AbstractC3340k.e(v2, "v");
        AbstractC3340k.e(insets, "insets");
        if (!this$0.f33738g.get()) {
            C1494c c1494cF = insets.f38877a.f(647);
            AbstractC3340k.d(c1494cF, "insets.getInsets(\n      …t()\n                    )");
            v2.setPadding(c1494cF.f19121a, c1494cF.f19122b, c1494cF.f19123c, c1494cF.f19124d);
        }
        return insets;
    }

    public final void a() {
        Kb.a aVar = new Kb.a(this, 0);
        this.f33734c = aVar;
        getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, aVar);
    }
}
