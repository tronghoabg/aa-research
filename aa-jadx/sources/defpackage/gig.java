package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class gig extends java.util.TimerTask {
    final /* synthetic */ defpackage.gih a;

    public gig(defpackage.gih gihVar) {
        this.a = gihVar;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [afer, java.lang.Object] */
    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        this.a.a.invoke();
    }
}
