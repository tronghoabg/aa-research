package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class rcl implements java.lang.Runnable {
    public final java.lang.Runnable a;
    public final android.os.Handler b;
    final /* synthetic */ defpackage.rcm c;

    public rcl(defpackage.rcm rcmVar, java.lang.Runnable runnable, android.os.Handler handler) {
        this.c = rcmVar;
        this.a = runnable;
        this.b = handler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.e.post(new defpackage.qth(this, 8));
        this.a.run();
    }
}
