package e.a.d;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class p implements gn {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ r f47290a;

    p(r rVar) {
        Objects.requireNonNull(rVar);
        this.f47290a = rVar;
    }

    @Override // e.a.d.gn
    public final void a() {
        r rVar = this.f47290a;
        if (rVar.f47293c.decrementAndGet() == 0) {
            r.f(rVar);
        }
    }
}
