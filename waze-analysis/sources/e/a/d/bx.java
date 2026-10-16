package e.a.d;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class bx implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ e.a.ee f46706a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ce f46707b;

    bx(ce ceVar, e.a.ee eeVar) {
        this.f46706a = eeVar;
        Objects.requireNonNull(ceVar);
        this.f46707b = ceVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f46707b.f46730d.c(this.f46706a);
    }
}
