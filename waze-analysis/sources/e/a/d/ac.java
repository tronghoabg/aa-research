package e.a.d;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ac extends au {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ad f46589a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ac(ad adVar) {
        super(adVar.f46590a.f46599g);
        Objects.requireNonNull(adVar);
        this.f46589a = adVar;
    }

    @Override // e.a.d.au
    public final void a() {
        int i2 = e.b.b.f47862a;
        ad adVar = this.f46589a;
        if (adVar.f46591b == null) {
            try {
                adVar.f46592c.i();
            } catch (Throwable th) {
                ad.b(this.f46589a, e.a.ee.f47402b.f(th).g("Failed to call onReady."));
            }
        }
    }
}
