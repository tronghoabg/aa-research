package e.a.d;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class bo implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ce f46691a;

    bo(ce ceVar) {
        Objects.requireNonNull(ceVar);
        this.f46691a = ceVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f46691a.f46730d.f();
    }
}
