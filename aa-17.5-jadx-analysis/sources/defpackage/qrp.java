package defpackage;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class qrp implements Executor, ViewTreeObserver.OnDrawListener, Runnable {
    public Runnable b;
    public final /* synthetic */ qrq d;
    final long a = SystemClock.uptimeMillis() + 10000;
    boolean c = false;

    public qrp(qrq qrqVar) {
        this.d = qrqVar;
    }

    public final void a(View view) {
        if (this.c) {
            return;
        }
        this.c = true;
        view.getViewTreeObserver().addOnDrawListener(this);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.b = runnable;
        View decorView = this.d.C().getDecorView();
        if (!this.c) {
            decorView.postOnAnimation(new qjv(this, 14, null));
        } else if (Looper.myLooper() == Looper.getMainLooper()) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        Runnable runnable = this.b;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.a) {
                this.c = false;
                this.d.C().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.b = null;
        qrq qrqVar = this.d;
        if (qrqVar.j.c()) {
            this.c = false;
            qrqVar.C().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.d.C().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
