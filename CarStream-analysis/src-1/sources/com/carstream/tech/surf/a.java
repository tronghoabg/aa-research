package com.carstream.tech.surf;

import android.content.Context;
import android.graphics.Rect;
import android.hardware.display.VirtualDisplay;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.car.app.CarContext;
import androidx.car.app.SurfaceContainer;
import androidx.core.view.InputDeviceCompat;
import com.carstream.tech.car.CarScreen;
import defpackage.qb;
import defpackage.t7;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class a {
    public final Context a;
    public final t7 c;
    public final qb d;
    public VirtualDisplay e;
    public CarDisplay$CarPresentation f;
    public b g;
    public CarScreen h;
    public SurfaceContainer i;
    public int j;
    public int k;
    public int l;
    public Rect m;
    public float n;
    public float o;
    public long p;
    public boolean s;
    public long t;
    public float u;
    public float v;
    public final Handler b = new Handler(Looper.getMainLooper());
    public boolean q = true;
    public final float[] r = new float[2];
    public final Runnable w = new Runnable() { // from class: com.carstream.tech.surf.CarDisplay$1
        @Override // java.lang.Runnable
        public void run() {
            this.this$0.b();
        }
    };
    public final Runnable x = new Runnable() { // from class: com.carstream.tech.surf.CarDisplay$2
        @Override // java.lang.Runnable
        public void run() {
            FrameLayout frameLayout;
            int i;
            a aVar = this.this$0;
            CarDisplay$CarPresentation carDisplay$CarPresentation = aVar.f;
            if (carDisplay$CarPresentation == null || (frameLayout = carDisplay$CarPresentation.content) == null || (i = aVar.j) <= 0) {
                return;
            }
            Rect rect = aVar.m;
            if (rect == null) {
                frameLayout.setPadding(0, 0, 0, 0);
                return;
            }
            int i2 = (int) (i * 0.15f);
            int iMax = Math.max(0, rect.left);
            int iMax2 = Math.max(0, i - aVar.m.right);
            if (iMax <= i2) {
                iMax = 0;
            }
            if (iMax2 <= i2) {
                iMax2 = 0;
            }
            frameLayout.setPadding(iMax, 0, iMax2, 0);
        }
    };

    public a(CarContext carContext, qb qbVar, t7 t7Var) {
        this.a = carContext;
        this.d = qbVar;
        this.c = t7Var;
    }

    public static void e(View view, long j, long j2, int i, float f, float f2) {
        MotionEvent motionEventObtain = MotionEvent.obtain(j, j2, i, f, f2, 0);
        motionEventObtain.setSource(InputDeviceCompat.SOURCE_TOUCHSCREEN);
        try {
            view.dispatchTouchEvent(motionEventObtain);
        } catch (Throwable th) {
            try {
                String.valueOf(th);
            } finally {
                motionEventObtain.recycle();
            }
        }
    }

    public final void a() {
        this.b.removeCallbacks(this.w);
        this.s = false;
        this.p = 0L;
        this.i = null;
        VirtualDisplay virtualDisplay = this.e;
        if (virtualDisplay == null) {
            return;
        }
        try {
            virtualDisplay.setSurface(null);
        } catch (Throwable th) {
            String.valueOf(th);
        }
    }

    public final void b() {
        Window window;
        this.b.removeCallbacks(this.w);
        if (this.s) {
            this.s = false;
            float f = this.u;
            float f2 = this.v;
            this.n = f;
            this.o = f2;
            this.p = SystemClock.uptimeMillis();
            CarDisplay$CarPresentation carDisplay$CarPresentation = this.f;
            View decorView = null;
            if (carDisplay$CarPresentation != null && (window = carDisplay$CarPresentation.getWindow()) != null) {
                decorView = window.getDecorView();
            }
            View view = decorView;
            if (view == null) {
                return;
            }
            e(view, this.t, SystemClock.uptimeMillis(), 1, this.u, this.v);
        }
    }

    public final void c() {
        Runnable runnable = this.w;
        Handler handler = this.b;
        handler.removeCallbacks(runnable);
        handler.removeCallbacks(this.x);
        this.s = false;
        CarScreen carScreen = this.h;
        if (carScreen != null) {
            try {
                b bVar = this.g;
                if (bVar != null) {
                    bVar.e = true;
                }
                carScreen.onWindowFocusChanged(false, false);
                this.h.onPause();
                this.h.onStop();
                this.h.onDestroy();
            } catch (Throwable th) {
                String.valueOf(th);
            }
            this.h = null;
        }
        this.g = null;
        CarDisplay$CarPresentation carDisplay$CarPresentation = this.f;
        if (carDisplay$CarPresentation != null) {
            try {
                carDisplay$CarPresentation.dismiss();
            } catch (Throwable unused) {
            }
            this.f = null;
        }
        VirtualDisplay virtualDisplay = this.e;
        if (virtualDisplay != null) {
            virtualDisplay.release();
            this.e = null;
        }
        this.i = null;
        this.l = 0;
        this.k = 0;
        this.j = 0;
        this.m = null;
    }

    public final void d() {
        Handler handler = this.b;
        Runnable runnable = this.x;
        handler.removeCallbacks(runnable);
        handler.postDelayed(runnable, 250L);
    }

    public final Rect f(View view) {
        Rect rect = this.m != null ? new Rect(this.m) : new Rect(0, 0, view.getWidth(), view.getHeight());
        rect.inset(Math.max(8, rect.width() / 12), Math.max(8, rect.height() / 12));
        return rect;
    }
}
