package e.a.d;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class bq implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ e.a.ag f46694a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ce f46695b;

    bq(ce ceVar, e.a.ag agVar) {
        this.f46694a = agVar;
        Objects.requireNonNull(ceVar);
        this.f46695b = ceVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f46695b.f46730d.j(this.f46694a);
    }
}
