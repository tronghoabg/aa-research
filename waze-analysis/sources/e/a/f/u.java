package e.a.f;

import e.a.d.dm;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class u extends dm {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ac f47740a;

    u(ac acVar) {
        Objects.requireNonNull(acVar);
        this.f47740a = acVar;
    }

    @Override // e.a.d.dm
    protected final void a() {
        this.f47740a.o.a(true);
    }

    @Override // e.a.d.dm
    protected final void b() {
        this.f47740a.o.a(false);
    }
}
