package e.a;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ej implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final Runnable f47422a;

    /* renamed from: b, reason: collision with root package name */
    boolean f47423b;

    /* renamed from: c, reason: collision with root package name */
    boolean f47424c;

    ej(Runnable runnable) {
        this.f47422a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f47423b) {
            return;
        }
        this.f47424c = true;
        this.f47422a.run();
    }
}
