package e.a.a;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ c f46221a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ e f46222b;

    a(e eVar, c cVar) {
        this.f46221a = cVar;
        Objects.requireNonNull(eVar);
        this.f46222b = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f46222b.f46229c.unregisterNetworkCallback(this.f46221a);
    }
}
