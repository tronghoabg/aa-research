package e.a.f;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class d extends i {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ f f47667a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar, e.a.f.a.a.d dVar) {
        super(dVar);
        Objects.requireNonNull(fVar);
        this.f47667a = fVar;
    }

    @Override // e.a.f.i, e.a.f.a.a.d
    public final void a(e.a.f.a.a.p pVar) {
        this.f47667a.f47679k++;
        super.a(pVar);
    }

    @Override // e.a.f.i, e.a.f.a.a.d
    public final void b(boolean z, int i2, int i3) {
        if (z) {
            this.f47667a.f47679k++;
        }
        super.b(z, i2, i3);
    }

    @Override // e.a.f.i, e.a.f.a.a.d
    public final void c(int i2, e.a.f.a.a.a aVar) {
        this.f47667a.f47679k++;
        super.c(i2, aVar);
    }
}
