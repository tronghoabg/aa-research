package com.waze;

import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.window.SplashScreen$OnExitAnimationListener;
import android.window.SplashScreenView;
import androidx.core.content.ContextCompat;
import androidx.core.view.WindowCompat;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.airbnb.lottie.LottieAnimationView;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class FreeMapAppActivity extends bx {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f13551f = 0;

    /* JADX INFO: Access modifiers changed from: private */
    public final void n(cd cdVar, FrameLayout frameLayout, Runnable runnable) {
        cdVar.f();
        bz bzVar = cdVar.f22131a;
        LottieAnimationView lottieAnimationView = new LottieAnimationView(this);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        frameLayout.addView(lottieAnimationView, layoutParams);
        lottieAnimationView.setScaleX(1.18f);
        lottieAnimationView.setScaleY(1.18f);
        lottieAnimationView.setScaleType(ImageView.ScaleType.FIT_XY);
        lottieAnimationView.bringToFront();
        lottieAnimationView.k(R.raw.splash_final_default_height_312);
        lottieAnimationView.e(new bw(this, cdVar, runnable));
        lottieAnimationView.h();
    }

    @Override // com.waze.sharedui.a.e
    protected final void h() {
        getWindow().setNavigationBarColor(ContextCompat.getColor(this, R.color.brand_waze));
    }

    @Override // com.waze.sharedui.a.e
    protected final void i() {
        ContextCompat.getColor(this, R.color.brand_waze);
    }

    @Override // com.waze.app_nav.hub.af
    protected final boolean j() {
        return false;
    }

    @Override // com.waze.app_nav.hub.af
    public final boolean k() {
        return false;
    }

    @Override // com.waze.ifs.ui.a, com.waze.sharedui.a.e, com.waze.app_nav.hub.af, android.support.v4.app.av, androidx.activity.ComponentActivity, android.support.v4.app.dd, android.app.Activity
    public final void onCreate(Bundle bundle) {
        WindowCompat.setDecorFitsSystemWindows(getWindow(), false);
        aE();
        super.onCreate(bundle);
        FreeMapAppActivity freeMapAppActivity = this;
        ViewModelStore viewModelStore = freeMapAppActivity.getViewModelStore();
        CreationExtras defaultViewModelCreationExtras = freeMapAppActivity.getDefaultViewModelCreationExtras();
        org.a.d.k.b bVarD = org.chromium.support_lib_boundary.a.b.d(freeMapAppActivity);
        int i2 = h.g.b.ar.f48106a;
        final cd cdVar = (cd) org.a.b.c.a.a(new h.g.b.m(cd.class), viewModelStore, defaultViewModelCreationExtras, bVarD, null);
        int i3 = 1;
        kotlinx.coroutines.aj.z(ViewModelKt.getViewModelScope(cdVar), null, null, new ck(cdVar, (h.c.e) null, 1), 3);
        try {
            new WebView(this);
        } catch (Exception unused) {
            Log.w("FreeMap", "failed to create WebView (DarkModeBugWorkaround)");
        }
        if (!NativeManager.isAppStarted()) {
            getWindow().setSoftInputMode(3);
        }
        getWindow().getAttributes().layoutInDisplayCutoutMode = 1;
        if (cdVar.g()) {
            if (Build.VERSION.SDK_INT >= 31) {
                getSplashScreen().setOnExitAnimationListener(new SplashScreen$OnExitAnimationListener() { // from class: com.waze.bu
                    public final void onSplashScreenExit(SplashScreenView splashScreenView) {
                        this.f17474a.n(cdVar, splashScreenView, new android.support.v7.app.p(splashScreenView.getIconView(), 18));
                    }
                });
            } else {
                FrameLayout frameLayout = new FrameLayout(this);
                setContentView(frameLayout);
                n(cdVar, frameLayout, null);
            }
        } else if (Build.VERSION.SDK_INT > 30) {
            findViewById(android.R.id.content).getViewTreeObserver().addOnPreDrawListener(new bv());
        }
        cdVar.f22132b.observe(this, new cz(this, i3));
    }
}
