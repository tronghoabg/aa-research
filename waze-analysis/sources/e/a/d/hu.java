package e.a.d;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class hu implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ hv f47118a;

    /* synthetic */ hu(hv hvVar) {
        Objects.requireNonNull(hvVar);
        this.f47118a = hvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        hv hvVar = this.f47118a;
        hvVar.f47120b.execute(new ht(hvVar));
    }
}
