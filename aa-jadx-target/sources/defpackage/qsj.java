package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class qsj implements java.util.concurrent.Executor, android.view.ViewTreeObserver.OnDrawListener, java.lang.Runnable {
    public java.lang.Runnable b;
    public final /* synthetic */ defpackage.qsk d;
    final long a = android.os.SystemClock.uptimeMillis() + 10000;
    boolean c = false;

    public qsj(defpackage.qsk qskVar) {
        this.d = qskVar;
    }

    public final void a(android.view.View view) {
        if (this.c) {
            return;
        }
        this.c = true;
        view.getViewTreeObserver().addOnDrawListener(this);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        this.b = runnable;
        android.view.View decorView = this.d.C().getDecorView();
        if (!this.c) {
            decorView.postOnAnimation(new defpackage.qjo(this, 19, null));
        } else if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        java.lang.Runnable runnable = this.b;
        if (runnable == null) {
            if (android.os.SystemClock.uptimeMillis() > this.a) {
                this.c = false;
                this.d.C().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.b = null;
        defpackage.qsk qskVar = this.d;
        if (qskVar.j.c()) {
            this.c = false;
            qskVar.C().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.d.C().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
