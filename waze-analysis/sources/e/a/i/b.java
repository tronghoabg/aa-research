package e.a.i;

import e.a.bl;
import e.a.br;
import e.a.w;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class b extends a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ c f47811a;

    protected b(c cVar) {
        Objects.requireNonNull(cVar);
        this.f47811a = cVar;
    }

    @Override // e.a.i.a, e.a.bl
    public void f(w wVar, br brVar) {
        c cVar = this.f47811a;
        if (cVar.f47815d == w.f47855e) {
            return;
        }
        cVar.f47815d = wVar;
        cVar.f47816e = brVar;
        e eVar = cVar.f47812a;
        if (eVar.f47821f) {
            return;
        }
        eVar.k();
    }

    @Override // e.a.i.a
    protected final bl g() {
        return this.f47811a.f47812a.f47825l;
    }
}
