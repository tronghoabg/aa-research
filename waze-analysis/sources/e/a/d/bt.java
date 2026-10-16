package e.a.d;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class bt implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ e.a.ad f46700a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ce f46701b;

    bt(ce ceVar, e.a.ad adVar) {
        this.f46700a = adVar;
        Objects.requireNonNull(ceVar);
        this.f46701b = ceVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f46701b.f46730d.i(this.f46700a);
    }
}
