package e.a.d;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class bb extends au {

    /* renamed from: a, reason: collision with root package name */
    final e.a.ee f46641a;

    /* renamed from: b, reason: collision with root package name */
    final com.waze.uid.f f46642b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bb(bh bhVar, com.waze.uid.f fVar, e.a.ee eeVar) {
        super(bhVar.f46660e);
        Objects.requireNonNull(bhVar);
        this.f46642b = fVar;
        this.f46641a = eeVar;
    }

    @Override // e.a.d.au
    public final void a() {
        this.f46642b.a(this.f46641a, new e.a.cm());
    }
}
