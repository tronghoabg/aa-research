package e.a.d;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class eu extends au {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ e.a.ee f46899a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.waze.uid.f f46900b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    eu(ev evVar, com.waze.uid.f fVar, e.a.ee eeVar) {
        super(evVar.f46905e);
        this.f46900b = fVar;
        this.f46899a = eeVar;
        Objects.requireNonNull(evVar);
    }

    @Override // e.a.d.au
    public final void a() {
        this.f46900b.a(this.f46899a, new e.a.cm());
    }
}
