package e.a.d;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class bw implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ce f46705a;

    bw(ce ceVar) {
        Objects.requireNonNull(ceVar);
        this.f46705a = ceVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f46705a.f46730d.d();
    }
}
