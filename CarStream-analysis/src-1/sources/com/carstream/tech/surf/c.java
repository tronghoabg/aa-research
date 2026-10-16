package com.carstream.tech.surf;

import android.content.Context;
import android.graphics.Rect;
import android.hardware.display.DisplayManager;
import android.hardware.display.VirtualDisplay;
import android.os.Handler;
import android.os.SystemClock;
import android.view.View;
import android.view.Window;
import androidx.car.app.AppManager;
import androidx.car.app.CarContext;
import androidx.car.app.Screen;
import androidx.car.app.SurfaceCallback;
import androidx.car.app.SurfaceContainer;
import androidx.car.app.model.Action;
import androidx.car.app.model.ActionStrip;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.Template;
import androidx.car.app.navigation.model.NavigationTemplate;
import androidx.core.graphics.drawable.IconCompat;
import com.carstream.tech.R;
import com.carstream.tech.car.CarScreen;
import defpackage.b3;
import defpackage.ib;
import defpackage.jb;
import defpackage.lb;
import defpackage.qb;
import defpackage.t7;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class c extends Screen implements SurfaceCallback {
    public final a a;
    public final lb b;

    public c(CarContext carContext) {
        super(carContext);
        this.b = new lb(carContext);
        this.a = new a(carContext, new qb(carContext), new t7(this, 7));
        ((AppManager) carContext.getCarService(AppManager.class)).setSurfaceCallback(this);
        getLifecycle().addObserver(new ib(this));
    }

    @Override // androidx.car.app.SurfaceCallback
    public final void onClick(float f, float f2) {
        Window window;
        a aVar = this.a;
        if (aVar.f == null) {
            return;
        }
        aVar.b();
        aVar.n = f;
        aVar.o = f2;
        aVar.p = SystemClock.uptimeMillis();
        CarScreen carScreen = aVar.h;
        aVar.q = carScreen != null && carScreen.hitsSpeedBubble(f, f2);
        CarDisplay$CarPresentation carDisplay$CarPresentation = aVar.f;
        View decorView = null;
        if (carDisplay$CarPresentation != null && (window = carDisplay$CarPresentation.getWindow()) != null) {
            decorView = window.getDecorView();
        }
        View view = decorView;
        if (view == null) {
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        a.e(view, jUptimeMillis, jUptimeMillis, 0, f, f2);
        a.e(view, jUptimeMillis, jUptimeMillis + 60, 1, f, f2);
    }

    @Override // androidx.car.app.SurfaceCallback
    public final void onFling(float f, float f2) {
        this.a.getClass();
    }

    @Override // androidx.car.app.Screen
    public final Template onGetTemplate() {
        return new NavigationTemplate.Builder().setActionStrip(new ActionStrip.Builder().addAction(new Action.Builder().setIcon(new CarIcon.Builder(IconCompat.createWithResource(getCarContext(), R.drawable.ic_back)).build()).setOnClickListener(new jb(this)).build()).build()).build();
    }

    @Override // androidx.car.app.SurfaceCallback
    public final void onScale(float f, float f2, float f3) {
        a aVar = this.a;
        aVar.n = f;
        aVar.o = f2;
        aVar.p = SystemClock.uptimeMillis();
        CarScreen carScreen = aVar.h;
        aVar.q = carScreen != null && carScreen.hitsSpeedBubble(f, f2);
    }

    @Override // androidx.car.app.SurfaceCallback
    public final void onScroll(float f, float f2) {
        Window window;
        long j;
        CarScreen carScreen;
        a aVar = this.a;
        Runnable runnable = aVar.w;
        Handler handler = aVar.b;
        float[] fArr = aVar.r;
        CarDisplay$CarPresentation carDisplay$CarPresentation = aVar.f;
        View decorView = null;
        if (carDisplay$CarPresentation != null && (window = carDisplay$CarPresentation.getWindow()) != null) {
            decorView = window.getDecorView();
        }
        View view = decorView;
        if (view == null) {
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (!aVar.s) {
            aVar.s = true;
            aVar.t = jUptimeMillis;
            if (aVar.p == 0 || SystemClock.uptimeMillis() - aVar.p >= 2500) {
                int i = 0;
                if (aVar.q && (carScreen = aVar.h) != null && carScreen.speedBubbleCenter(fArr)) {
                    aVar.u = fArr[0];
                    aVar.v = fArr[1];
                } else {
                    if (aVar.m != null) {
                        aVar.u = r3.centerX();
                        aVar.v = aVar.m.centerY();
                    } else {
                        aVar.u = view.getWidth() / 2.0f;
                        aVar.v = view.getHeight() / 2.0f;
                    }
                    if (aVar.h != null) {
                        Rect rect = aVar.m;
                        int i2 = rect != null ? rect.left : 0;
                        int iWidth = rect != null ? rect.width() : aVar.j;
                        if (iWidth > 0) {
                            float f3 = iWidth / 8.0f;
                            while (true) {
                                if (i >= 6 || !aVar.h.hitsSpeedBubble(aVar.u, aVar.v)) {
                                    break;
                                }
                                float f4 = aVar.u - f3;
                                aVar.u = f4;
                                float f5 = i2 + f3;
                                if (f4 < f5) {
                                    aVar.u = f5;
                                    break;
                                }
                                i++;
                            }
                        }
                    }
                }
            } else {
                aVar.u = aVar.n;
                aVar.v = aVar.o;
            }
            a.e(view, jUptimeMillis, jUptimeMillis, 0, aVar.u, aVar.v);
        }
        aVar.p = jUptimeMillis;
        float f6 = aVar.u - f;
        aVar.u = f6;
        float f7 = aVar.v - f2;
        aVar.v = f7;
        Rect rectF = aVar.f(view);
        if (rectF.width() <= 0 || rectF.height() <= 0 || f6 < rectF.left || f6 > rectF.right || f7 < rectF.top || f7 > rectF.bottom) {
            Rect rectF2 = aVar.f(view);
            long j2 = aVar.t;
            float f8 = aVar.u;
            float f9 = rectF2.left;
            float f10 = rectF2.right;
            float f11 = f8 < f9 ? f9 : f8 > f10 ? f10 : f8;
            float f12 = aVar.v;
            float f13 = rectF2.top;
            float f14 = rectF2.bottom;
            a.e(view, j2, jUptimeMillis, 1, f11, f12 < f13 ? f13 : f12 > f14 ? f14 : f12);
            aVar.u = f > 0.0f ? rectF2.right - (rectF2.width() / 4.0f) : f < 0.0f ? rectF2.left + (rectF2.width() / 4.0f) : rectF2.centerX();
            float fHeight = f2 > 0.0f ? rectF2.bottom - (rectF2.height() / 4.0f) : f2 < 0.0f ? rectF2.top + (rectF2.height() / 4.0f) : rectF2.centerY();
            aVar.v = fHeight;
            aVar.t = jUptimeMillis;
            j = jUptimeMillis;
            a.e(view, jUptimeMillis, j, 0, aVar.u, fHeight);
        } else {
            j = jUptimeMillis;
        }
        a.e(view, aVar.t, j, 2, aVar.u, aVar.v);
        handler.removeCallbacks(runnable);
        handler.postDelayed(runnable, 220L);
    }

    @Override // androidx.car.app.SurfaceCallback
    public final void onStableAreaChanged(Rect rect) {
        rect.toShortString();
    }

    @Override // androidx.car.app.SurfaceCallback
    public final void onSurfaceAvailable(SurfaceContainer surfaceContainer) {
        a aVar = this.a;
        Context context = aVar.a;
        if (surfaceContainer == null || surfaceContainer.getSurface() == null) {
            aVar.a();
            return;
        }
        if (aVar.e != null && aVar.f != null) {
            SurfaceContainer surfaceContainer2 = aVar.i;
            boolean z = false;
            boolean z2 = surfaceContainer2 != null && surfaceContainer2.getSurface() == surfaceContainer.getSurface();
            if (aVar.j == surfaceContainer.getWidth() && aVar.k == surfaceContainer.getHeight() && aVar.l == surfaceContainer.getDpi()) {
                z = true;
            }
            if (z2 && z) {
                return;
            }
            try {
                aVar.e.setSurface(surfaceContainer.getSurface());
                aVar.e.resize(surfaceContainer.getWidth(), surfaceContainer.getHeight(), surfaceContainer.getDpi());
                aVar.i = surfaceContainer;
                aVar.j = surfaceContainer.getWidth();
                aVar.k = surfaceContainer.getHeight();
                int dpi = surfaceContainer.getDpi();
                aVar.l = dpi;
                b3.c(aVar.j, aVar.k, dpi);
                aVar.d();
                CarScreen carScreen = aVar.h;
                if (carScreen != null) {
                    carScreen.onConfigurationChanged(aVar.f.getContext().getResources().getConfiguration());
                    return;
                }
                return;
            } catch (Throwable th) {
                String.valueOf(th);
            }
        }
        aVar.c();
        aVar.i = surfaceContainer;
        aVar.j = surfaceContainer.getWidth();
        aVar.k = surfaceContainer.getHeight();
        int dpi2 = surfaceContainer.getDpi();
        aVar.l = dpi2;
        b3.c(aVar.j, aVar.k, dpi2);
        aVar.p = 0L;
        aVar.q = true;
        aVar.m = null;
        VirtualDisplay virtualDisplayCreateVirtualDisplay = ((DisplayManager) context.getSystemService("display")).createVirtualDisplay("CarSurface", aVar.j, aVar.k, aVar.l, surfaceContainer.getSurface(), 2);
        aVar.e = virtualDisplayCreateVirtualDisplay;
        if (virtualDisplayCreateVirtualDisplay == null) {
            return;
        }
        try {
            CarDisplay$CarPresentation carDisplay$CarPresentation = new CarDisplay$CarPresentation(context, aVar.e.getDisplay());
            aVar.f = carDisplay$CarPresentation;
            carDisplay$CarPresentation.show();
            try {
                CarScreen carScreen2 = new CarScreen();
                aVar.h = carScreen2;
                carScreen2.markFullSurface();
                CarDisplay$CarPresentation carDisplay$CarPresentation2 = aVar.f;
                aVar.g = new b(carDisplay$CarPresentation2, aVar, aVar.d, aVar.c);
                aVar.h.setContext(carDisplay$CarPresentation2.getContext());
                aVar.h.attach(aVar.g);
                aVar.h.onCreate(null);
                aVar.h.onStart();
                aVar.h.onResume();
                aVar.h.onWindowFocusChanged(true, true);
            } catch (Throwable th2) {
                String.valueOf(th2);
            }
        } catch (Throwable th3) {
            String.valueOf(th3);
            aVar.c();
        }
    }

    @Override // androidx.car.app.SurfaceCallback
    public final void onSurfaceDestroyed(SurfaceContainer surfaceContainer) {
        this.a.a();
    }

    @Override // androidx.car.app.SurfaceCallback
    public final void onVisibleAreaChanged(Rect rect) {
        rect.toShortString();
        a aVar = this.a;
        aVar.getClass();
        aVar.m = rect.isEmpty() ? null : new Rect(rect);
        aVar.d();
    }
}
