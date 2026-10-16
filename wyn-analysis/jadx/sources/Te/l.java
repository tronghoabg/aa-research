package Te;

import J9.U;

/* loaded from: classes5.dex */
public final class l extends He.a implements Oe.b {

    /* renamed from: a, reason: collision with root package name */
    public final c f11884a;

    /* renamed from: b, reason: collision with root package name */
    public final U f11885b;

    public l(c cVar, U u10) {
        this.f11884a = cVar;
        this.f11885b = u10;
    }

    @Override // Oe.b
    public final He.i a() {
        return new c(this.f11884a, this.f11885b, 2);
    }

    @Override // He.a
    public final void e(He.b bVar) {
        this.f11884a.c(new k(bVar, this.f11885b));
    }
}
