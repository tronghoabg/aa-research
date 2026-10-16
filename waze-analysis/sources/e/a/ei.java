package e.a;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ei implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ej f47419a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Runnable f47420b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ el f47421c;

    ei(el elVar, ej ejVar, Runnable runnable) {
        this.f47419a = ejVar;
        this.f47420b = runnable;
        Objects.requireNonNull(elVar);
        this.f47421c = elVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f47421c.execute(this.f47419a);
    }

    public final String toString() {
        return String.valueOf(this.f47420b.toString()).concat("(scheduled in SynchronizationContext)");
    }
}
