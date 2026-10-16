package androidx.activity;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;

/* loaded from: classes.dex */
public final class l implements k, ViewTreeObserver.OnDrawListener, Runnable {

    /* renamed from: b, reason: collision with root package name */
    public Runnable f17715b;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ComponentActivity f17717d;

    /* renamed from: a, reason: collision with root package name */
    public final long f17714a = SystemClock.uptimeMillis() + 10000;

    /* renamed from: c, reason: collision with root package name */
    public boolean f17716c = false;

    public l(ComponentActivity componentActivity) {
        this.f17717d = componentActivity;
    }

    @Override // androidx.activity.k
    public final void a(View view) {
        if (this.f17716c) {
            return;
        }
        this.f17716c = true;
        view.getViewTreeObserver().addOnDrawListener(this);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f17715b = runnable;
        View decorView = this.f17717d.getWindow().getDecorView();
        if (!this.f17716c) {
            decorView.postOnAnimation(new C8.g(this, 26));
        } else if (Looper.myLooper() == Looper.getMainLooper()) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z2;
        Runnable runnable = this.f17715b;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.f17714a) {
                this.f17716c = false;
                this.f17717d.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.f17715b = null;
        n nVar = this.f17717d.mFullyDrawnReporter;
        synchronized (nVar.f17721a) {
            z2 = nVar.f17722b;
        }
        if (z2) {
            this.f17716c = false;
            this.f17717d.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f17717d.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
