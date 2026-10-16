package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.view.SurfaceView;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import com.carstream.tech.car.CarScreen;
import com.carstream.tech.launcher.LuoiApp;
import java.io.OutputStream;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class x5 {
    public final CarScreen a;
    public FrameLayout b;
    public View c;
    public r6 d;
    public TextView f;
    public LuoiApp h;
    public PowerManager.WakeLock j;
    public boolean e = false;
    public final Handler g = new Handler(Looper.getMainLooper());
    public volatile boolean i = false;
    public int k = 0;

    public x5(CarScreen carScreen) {
        this.a = carScreen;
    }

    public final void a() {
        LuoiApp luoiApp;
        boolean zF = k1.f();
        this.e = zF;
        View view = this.c;
        if (view != null) {
            view.setVisibility(zF ? 8 : 0);
            if (!zF && (luoiApp = this.h) != null) {
                luoiApp.capNhatLyDo();
            }
        }
        CarScreen carScreen = this.a;
        if (zF) {
            sb.a(carScreen, false);
        } else {
            sb.a(carScreen, true);
        }
    }

    public final synchronized void b() {
        this.k = 0;
        if (this.i) {
            this.i = false;
            l7 l7Var = k1.g;
            if (l7Var != null) {
                l7Var.c('n');
            }
            try {
                PowerManager.WakeLock wakeLock = this.j;
                if (wakeLock != null && wakeLock.isHeld()) {
                    this.j.release();
                }
            } catch (Throwable unused) {
            }
            this.j = null;
        }
    }

    public final FrameLayout c() {
        FrameLayout frameLayout = this.b;
        if (frameLayout != null) {
            return frameLayout;
        }
        this.b = new FrameLayout(this.a);
        CarScreen carScreen = this.a;
        r6 r6Var = new r6(carScreen, new c1(this, 4));
        this.d = r6Var;
        FrameLayout frameLayout2 = this.b;
        FrameLayout frameLayout3 = r6Var.b;
        if (frameLayout3 == null) {
            FrameLayout frameLayout4 = new FrameLayout(carScreen);
            r6Var.b = frameLayout4;
            frameLayout4.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
            SurfaceView surfaceView = new SurfaceView(carScreen);
            r6Var.c = surfaceView;
            surfaceView.getHolder().addCallback(new o6(r6Var));
            r6Var.b.addView(r6Var.c, new FrameLayout.LayoutParams(-1, -1));
            r6Var.b.setOnTouchListener(new p6(r6Var));
            frameLayout3 = r6Var.b;
        }
        frameLayout2.addView(frameLayout3, new FrameLayout.LayoutParams(-1, -1));
        LuoiApp luoiApp = new LuoiApp(this.a, new v5(this));
        this.h = luoiApp;
        View view = luoiApp.view();
        this.c = view;
        this.b.addView(view, new FrameLayout.LayoutParams(-1, -1));
        TextView textView = new TextView(this.a);
        this.f = textView;
        textView.setTextColor(-1);
        this.f.setBackgroundColor(-436207616);
        this.f.setGravity(17);
        int i = (int) (this.a.getResources().getDisplayMetrics().density * 12.0f);
        this.f.setPadding(i, i, i, i);
        this.f.setVisibility(8);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 80;
        this.b.addView(this.f, layoutParams);
        b();
        l7 l7Var = k1.g;
        if (l7Var == null) {
            u5.d("VE LAUNCHER: khong co bo chieu de bao");
        } else {
            try {
                OutputStream outputStream = l7Var.d;
                if (outputStream != null) {
                    new Thread(new g7(l7Var, null, 0, outputStream), "mirror-pane-app").start();
                }
            } catch (Throwable th) {
                u5.d("VE LAUNCHER: !! bao bo chieu HONG (" + th.getClass().getSimpleName() + ") — no van giu ten app cu, nut Dong co the tat nham app");
            }
        }
        a();
        return this.b;
    }
}
