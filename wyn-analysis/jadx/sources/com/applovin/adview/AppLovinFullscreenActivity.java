package com.applovin.adview;

import T3.r;
import android.R;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Insets;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.WindowInsets;
import android.webkit.WebView;
import android.window.OnBackInvokedCallback;
import com.applovin.impl.AbstractC1631d;
import com.applovin.impl.AbstractC1637g;
import com.applovin.impl.AbstractC1654o0;
import com.applovin.impl.C1633e;
import com.applovin.impl.C1638g0;
import com.applovin.impl.a5;
import com.applovin.impl.adview.activity.FullscreenAdService;
import com.applovin.impl.d2;
import com.applovin.impl.f2;
import com.applovin.impl.f8;
import com.applovin.impl.n1;
import com.applovin.impl.n2;
import com.applovin.impl.o7;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.w1;
import com.applovin.impl.y4;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.shadow.okhttp3.internal.http2.Http2Connection;
import com.applovin.shadow.okio.Segment;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class AppLovinFullscreenActivity extends Activity implements n1 {

    /* renamed from: h, reason: collision with root package name */
    private static final Set f20705h = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: i, reason: collision with root package name */
    private static final Object f20706i = new Object();
    public static n2 parentInterstitialWrapper;

    /* renamed from: a, reason: collision with root package name */
    private k f20707a;

    /* renamed from: b, reason: collision with root package name */
    private w1 f20708b;

    /* renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f20709c = new AtomicBoolean(true);

    /* renamed from: d, reason: collision with root package name */
    private com.applovin.impl.adview.activity.a f20710d;

    /* renamed from: e, reason: collision with root package name */
    private c f20711e;

    /* renamed from: f, reason: collision with root package name */
    private C1638g0 f20712f;

    /* renamed from: g, reason: collision with root package name */
    private long f20713g;

    public class a implements View.OnApplyWindowInsetsListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Boolean f20714a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f20715b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.applovin.impl.sdk.ad.b f20716c;

        public a(Boolean bool, boolean z2, com.applovin.impl.sdk.ad.b bVar) {
            this.f20714a = bool;
            this.f20715b = z2;
            this.f20716c = bVar;
        }

        @Override // android.view.View.OnApplyWindowInsetsListener
        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            if (this.f20714a.booleanValue()) {
                AppLovinFullscreenActivity.this.a(windowInsets);
            }
            if (!this.f20715b) {
                Insets insets = windowInsets.getInsets(((Integer) AppLovinFullscreenActivity.this.f20707a.a(y4.z2)).intValue());
                view.setPadding(insets.left, insets.top, insets.right, insets.bottom);
                return windowInsets;
            }
            int iIntValue = ((Integer) AppLovinFullscreenActivity.this.f20707a.a(y4.z2)).intValue();
            Insets insets2 = windowInsets.getInsets(this.f20716c.F0() ? iIntValue & (~WindowInsets.Type.displayCutout()) : iIntValue | WindowInsets.Type.displayCutout());
            view.setPadding(insets2.left, insets2.top, insets2.right, insets2.bottom);
            return windowInsets;
        }
    }

    public static class c implements OnBackInvokedCallback {

        /* renamed from: a, reason: collision with root package name */
        private final Runnable f20719a;

        public c(Runnable runnable) {
            this.f20719a = runnable;
        }

        public void onBackInvoked() {
            this.f20719a.run();
        }
    }

    @Override // com.applovin.impl.n1
    public void dismiss(String str) {
        if (AbstractC1654o0.k() && this.f20711e != null) {
            getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(this.f20711e);
            this.f20711e = null;
        }
        w1 w1Var = this.f20708b;
        if (w1Var != null) {
            w1Var.a(str);
        } else {
            finish();
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        c();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        w1 w1Var = this.f20708b;
        if (w1Var != null) {
            w1Var.a(configuration);
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null && parentInterstitialWrapper == null) {
            o.j("AppLovinFullscreenActivity", "Dismissing ad. Activity was destroyed while in background.");
            dismiss("activity_destroyed_while_in_background");
            return;
        }
        try {
            requestWindowFeature(1);
        } catch (Throwable th) {
            o.c("AppLovinFullscreenActivity", "Failed to request window feature", th);
        }
        getWindow().addFlags(Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
        getWindow().addFlags(128);
        View viewFindViewById = findViewById(R.id.content);
        viewFindViewById.setBackgroundColor(-16777216);
        if (TextUtils.isEmpty(getIntent().getStringExtra("com.applovin.interstitial.sdk_key"))) {
            n2 n2Var = parentInterstitialWrapper;
            if (n2Var != null && n2Var.f() != null) {
                n2.a(parentInterstitialWrapper.f(), parentInterstitialWrapper.c(), "Empty SDK key", (Throwable) null, this);
            }
            finish();
            return;
        }
        this.f20707a = AppLovinSdk.getInstance(this).a();
        n2 n2Var2 = parentInterstitialWrapper;
        com.applovin.impl.sdk.ad.b bVarF = n2Var2 != null ? n2Var2.f() : null;
        Boolean bool = (Boolean) this.f20707a.a(y4.f23624J4);
        boolean z2 = bVarF != null && bVarF.L0();
        if (AbstractC1654o0.b() && (bool.booleanValue() || z2)) {
            getWindow().setDecorFitsSystemWindows(false);
            viewFindViewById.setOnApplyWindowInsetsListener(new a(bool, z2, bVarF));
            a(bVarF);
        } else {
            viewFindViewById.setFitsSystemWindows(true);
            if (AbstractC1654o0.b()) {
                f8.a(viewFindViewById, this.f20707a);
            }
            a(bVarF);
        }
        if (bVarF != null && bVarF.r0()) {
            AbstractC1637g.a(bVarF, this, this.f20707a);
        }
        if (AbstractC1654o0.k() && ((Boolean) this.f20707a.a(y4.f23812h6)).booleanValue()) {
            this.f20711e = new c(new com.applovin.adview.a(this, 0));
            getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, this.f20711e);
        }
        a();
        b();
        Integer num = (Integer) this.f20707a.a(y4.f23618I6);
        if (num.intValue() > 0) {
            synchronized (f20706i) {
                Set set = f20705h;
                set.add(this);
                o7.a("AppLovinFullscreenActivity", set.size(), num.intValue(), this.f20707a.D());
            }
        }
        n2 n2Var3 = parentInterstitialWrapper;
        if (n2Var3 != null) {
            w1.a(n2Var3.f(), parentInterstitialWrapper.b(), parentInterstitialWrapper.c(), parentInterstitialWrapper.d(), parentInterstitialWrapper.h(), this.f20707a, this, new b());
            return;
        }
        Intent intent = new Intent(this, (Class<?>) FullscreenAdService.class);
        com.applovin.impl.adview.activity.a aVar = new com.applovin.impl.adview.activity.a(this, this.f20707a);
        this.f20710d = aVar;
        bindService(intent, aVar, 1);
        if (AbstractC1654o0.i()) {
            String str = this.f20707a.o0().getExtraParameters().get("disable_set_data_dir_suffix");
            if (StringUtils.isValidString(str) && Boolean.parseBoolean(str)) {
                return;
            }
            try {
                WebView.setDataDirectorySuffix(String.valueOf(Process.myPid()));
            } catch (Throwable unused) {
            }
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        k kVar = this.f20707a;
        if (kVar != null && ((Boolean) kVar.a(y4.f23568C2)).booleanValue()) {
            this.f20707a.q0().b(a5.f20943N);
            this.f20707a.q0().b(a5.f20945P);
            this.f20707a.q0().b(a5.f20946Q);
        }
        if (this.f20712f != null) {
            this.f20707a.q0().b(a5.f20944O);
            this.f20712f.a();
            this.f20712f = null;
        }
        com.applovin.impl.adview.activity.a aVar = this.f20710d;
        if (aVar != null) {
            try {
                unbindService(aVar);
            } catch (Throwable unused) {
            }
        }
        w1 w1Var = this.f20708b;
        if (w1Var != null) {
            if (w1Var.g()) {
                this.f20708b.r();
            } else {
                long jA = this.f20708b.a();
                if (jA >= 0) {
                    if (jA == 0) {
                        this.f20708b.d(true);
                    }
                    AppLovinSdkUtils.runOnUiThreadDelayed(new r(26, this, parentInterstitialWrapper), jA);
                } else {
                    a(this.f20708b, false, false);
                }
            }
        }
        parentInterstitialWrapper = null;
        super.onDestroy();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i5, KeyEvent keyEvent) {
        w1 w1Var = this.f20708b;
        if (w1Var != null) {
            w1Var.a(i5, keyEvent);
        }
        return super.onKeyDown(i5, keyEvent);
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        w1 w1Var = this.f20708b;
        if (w1Var != null) {
            w1Var.s();
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        w1 w1Var;
        try {
            super.onResume();
            if (this.f20709c.get() || (w1Var = this.f20708b) == null) {
                return;
            }
            w1Var.t();
        } catch (IllegalArgumentException e7) {
            this.f20707a.O();
            if (o.a()) {
                this.f20707a.O().a("AppLovinFullscreenActivity", "Error was encountered in onResume().", e7);
            }
            this.f20707a.D().a("AppLovinFullscreenActivity", "onResume", e7);
            dismiss("activity_on_resume_error");
        }
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        w1 w1Var = this.f20708b;
        if (w1Var != null) {
            w1Var.u();
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z2) {
        if (this.f20708b != null) {
            if (!this.f20709c.getAndSet(false)) {
                this.f20708b.b(z2);
            }
            if (z2) {
                n2 n2Var = parentInterstitialWrapper;
                a(n2Var != null ? n2Var.f() : null);
            }
        }
        super.onWindowFocusChanged(z2);
    }

    public void setPresenter(w1 w1Var) {
        this.f20708b = w1Var;
    }

    public class b implements w1.g {
        public b() {
        }

        @Override // com.applovin.impl.w1.g
        public void a(w1 w1Var) {
            AppLovinFullscreenActivity.this.f20708b = w1Var;
            w1Var.w();
        }

        @Override // com.applovin.impl.w1.g
        public void a(String str, Throwable th) {
            com.applovin.impl.sdk.ad.b bVarF = AppLovinFullscreenActivity.parentInterstitialWrapper.f();
            n2.a(bVarF, AppLovinFullscreenActivity.parentInterstitialWrapper.c(), str, th, AppLovinFullscreenActivity.this);
            HashMap<String, String> mapHashMap = CollectionUtils.hashMap("source", "createAppLovinFullscreenActivity");
            CollectionUtils.putStringIfValid("error_message", str, mapHashMap);
            CollectionUtils.putStringIfValid("top_main_method", th.toString(), mapHashMap);
            AppLovinFullscreenActivity.this.f20707a.g().a(d2.f21263E, bVarF, mapHashMap);
        }
    }

    private void b() {
        k kVar = this.f20707a;
        if (kVar == null || !((Boolean) kVar.a(y4.f23575D2)).booleanValue()) {
            return;
        }
        Long l10 = (Long) this.f20707a.a(y4.f23583E2);
        this.f20712f = C1638g0.a(l10.longValue(), true, this.f20707a, new r(25, this, l10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        w1 w1Var = this.f20708b;
        if (w1Var != null) {
            w1Var.q();
        }
        if (o7.g(getApplicationContext())) {
            super.onBackPressed();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(WindowInsets windowInsets) {
        AbstractC1654o0.a aVarA = AbstractC1654o0.a(windowInsets, this.f20707a);
        AbstractC1654o0.a aVarC = AbstractC1654o0.c(windowInsets, this.f20707a);
        AbstractC1654o0.a aVarB = AbstractC1654o0.b(windowInsets, this.f20707a);
        String strB = o7.b(this);
        AbstractC1654o0.a(aVarA, strB);
        AbstractC1654o0.c(aVarC, strB);
        AbstractC1654o0.b(aVarB, strB);
        w1 w1Var = this.f20708b;
        if (w1Var != null) {
            w1Var.a(aVarA, aVarC, aVarB);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(n2 n2Var) {
        boolean zY = this.f20708b.y();
        boolean zI = (n2Var == null || !zY) ? false : n2Var.i();
        if (!zI) {
            this.f20708b.d(false);
        }
        a(this.f20708b, zY, zI);
    }

    private void a(w1 w1Var, boolean z2, boolean z10) {
        w1Var.a("activity_destroyed_by_app_relaunch");
        if (this.f20707a != null) {
            HashMap<String, String> mapHashMap = CollectionUtils.hashMap("source", "onDestroyAppLovinFullScreenActivity");
            n2 n2Var = parentInterstitialWrapper;
            com.applovin.impl.sdk.ad.b bVarF = n2Var != null ? n2Var.f() : null;
            mapHashMap.putAll(f2.a((AppLovinAdImpl) bVarF));
            JSONObject jSONObject = new JSONObject();
            JsonUtils.putBoolean(jSONObject, "reshow_attempted", z2);
            JsonUtils.putBoolean(jSONObject, "reshow_success", z10);
            if (bVarF != null) {
                JsonUtils.putInt(jSONObject, "reshow_count", bVarF.R());
            }
            mapHashMap.put("details", jSONObject.toString());
            this.f20707a.D().d(d2.B0, mapHashMap);
        }
        w1Var.r();
    }

    private void a() {
        n2 n2Var;
        k kVar = this.f20707a;
        if (kVar == null || !((Boolean) kVar.a(y4.f23568C2)).booleanValue() || (n2Var = parentInterstitialWrapper) == null || n2Var.f() == null) {
            return;
        }
        com.applovin.impl.sdk.ad.b bVarF = parentInterstitialWrapper.f();
        List listJ = bVarF.j();
        if (CollectionUtils.isEmpty(listJ)) {
            return;
        }
        C1633e c1633e = (C1633e) listJ.get(0);
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putStringIfValid(jSONObject, "app_killed_postback_url", c1633e.c());
        JsonUtils.putStringIfValid(jSONObject, "app_killed_postback_backup_url", c1633e.a());
        this.f20707a.q0().b(a5.f20945P, jSONObject.toString());
        this.f20707a.q0().b(a5.f20943N, Long.valueOf(System.currentTimeMillis()));
        this.f20707a.q0().b(a5.f20946Q, CollectionUtils.toJsonString(f2.a((AppLovinAdImpl) bVarF), JsonUtils.EMPTY_JSON));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Long l10) {
        this.f20713g = l10.longValue() + this.f20713g;
        this.f20707a.q0().b(a5.f20944O, Long.valueOf(this.f20713g));
    }

    private void a(com.applovin.impl.sdk.ad.b bVar) {
        if (AbstractC1654o0.b() && bVar != null && bVar.L0()) {
            getWindow().getAttributes().layoutInDisplayCutoutMode = 1;
            if (bVar.U0() && bVar.S0()) {
                AbstractC1631d.c(this);
                return;
            } else if (bVar.U0()) {
                AbstractC1631d.b((Activity) this);
                return;
            } else {
                if (bVar.S0()) {
                    AbstractC1631d.a((Activity) this);
                    return;
                }
                return;
            }
        }
        getWindow().setFlags(Segment.SHARE_MINIMUM, Segment.SHARE_MINIMUM);
        AbstractC1631d.c(this);
    }
}
