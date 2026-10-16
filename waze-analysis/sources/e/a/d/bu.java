package e.a.d;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class bu implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ce f46702a;

    bu(ce ceVar) {
        Objects.requireNonNull(ceVar);
        this.f46702a = ceVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f46702a.q();
    }
}
