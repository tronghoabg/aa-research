package e.a.d;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class z extends au {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ e.a.cm f47316a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ad f47317b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    z(ad adVar, e.a.cm cmVar) {
        super(adVar.f46590a.f46599g);
        this.f47316a = cmVar;
        Objects.requireNonNull(adVar);
        this.f47317b = adVar;
    }

    @Override // e.a.d.au
    public final void a() {
        int i2 = e.b.b.f47862a;
        ad adVar = this.f47317b;
        if (adVar.f46591b == null) {
            try {
                adVar.f46592c.u(this.f47316a);
            } catch (Throwable th) {
                ad.b(this.f47317b, e.a.ee.f47402b.f(th).g("Failed to read headers"));
            }
        }
    }
}
