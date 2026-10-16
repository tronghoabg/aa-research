package e.a.h;

import e.a.dt;
import e.a.du;
import e.a.dv;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ac implements dv {

    /* renamed from: a, reason: collision with root package name */
    private final aa f47770a;

    ac(aa aaVar) {
        this.f47770a = aaVar;
    }

    @Override // e.a.dv
    public final dt a(du duVar) {
        this.f47770a.invoke(new w(duVar));
        duVar.b();
        return new ab(this);
    }
}
