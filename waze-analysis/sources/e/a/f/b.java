package e.a.f;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class b extends e {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ f f47665a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(f fVar) {
        super(fVar);
        Objects.requireNonNull(fVar);
        this.f47665a = fVar;
        int i2 = e.b.b.f47862a;
    }

    @Override // e.a.f.e
    public final void a() {
        k.h hVar = new k.h();
        int i2 = e.b.b.f47862a;
        f fVar = this.f47665a;
        synchronized (fVar.f47669a) {
            hVar.l(fVar.f47670b, fVar.f47670b.q());
            fVar.f47674f = false;
        }
        f fVar2 = this.f47665a;
        fVar2.f47676h.l(hVar, hVar.q());
        fVar2.f47676h.flush();
    }
}
