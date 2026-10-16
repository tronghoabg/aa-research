package android.support.v7.app;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class u implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ an f632a;

    u(an anVar) {
        this.f632a = anVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        an anVar = this.f632a;
        if ((anVar.t & 1) != 0) {
            anVar.M(0);
        }
        if ((anVar.t & 4096) != 0) {
            anVar.M(108);
        }
        anVar.s = false;
        anVar.t = 0;
    }
}
