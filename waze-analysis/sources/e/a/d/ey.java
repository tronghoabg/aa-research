package e.a.d;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ey extends dm {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ fp f46911a;

    /* synthetic */ ey(fp fpVar) {
        Objects.requireNonNull(fpVar);
        this.f46911a = fpVar;
    }

    @Override // e.a.d.dm
    protected final void a() {
        this.f46911a.U();
    }

    @Override // e.a.d.dm
    protected final void b() {
        fp fpVar = this.f46911a;
        if (fpVar.M.get()) {
            return;
        }
        fpVar.al();
    }
}
