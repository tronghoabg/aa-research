package e.a.d;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class bp implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ e.a.s f46692a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ce f46693b;

    bp(ce ceVar, e.a.s sVar) {
        this.f46692a = sVar;
        Objects.requireNonNull(ceVar);
        this.f46693b = ceVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f46693b.f46730d.h(this.f46692a);
    }
}
