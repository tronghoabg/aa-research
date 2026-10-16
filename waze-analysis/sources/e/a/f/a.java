package e.a.f;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class a extends e {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ f f47465a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    a(f fVar) {
        super(fVar);
        Objects.requireNonNull(fVar);
        this.f47465a = fVar;
        int i2 = e.b.b.f47862a;
    }

    @Override // e.a.f.e
    public final void a() {
        int i2;
        k.h hVar = new k.h();
        int i3 = e.b.b.f47862a;
        f fVar = this.f47465a;
        synchronized (fVar.f47669a) {
            hVar.l(fVar.f47670b, fVar.f47670b.i());
            fVar.f47673e = false;
            i2 = fVar.f47680l;
        }
        f fVar2 = this.f47465a;
        fVar2.f47676h.l(hVar, hVar.q());
        synchronized (fVar2.f47669a) {
            fVar2.f47680l -= i2;
        }
    }
}
