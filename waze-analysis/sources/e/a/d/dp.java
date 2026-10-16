package e.a.d;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class dp extends dm {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ eh f46822a;

    dp(eh ehVar) {
        Objects.requireNonNull(ehVar);
        this.f46822a = ehVar;
    }

    @Override // e.a.d.dm
    protected final void a() {
        eh ehVar = this.f46822a;
        ehVar.f46868c.f46853b.f46994j.f46952e.c(ehVar, true);
    }

    @Override // e.a.d.dm
    protected final void b() {
        eh ehVar = this.f46822a;
        ehVar.f46868c.f46853b.f46994j.f46952e.c(ehVar, false);
    }
}
