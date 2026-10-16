package e.a.a;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ d f46223a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ e f46224b;

    b(e eVar, d dVar) {
        this.f46223a = dVar;
        Objects.requireNonNull(eVar);
        this.f46224b = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f46224b.f46228b.unregisterReceiver(this.f46223a);
    }
}
