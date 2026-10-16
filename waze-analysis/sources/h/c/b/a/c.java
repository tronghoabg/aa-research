package h.c.b.a;

import h.c.h;
import h.c.j;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public abstract class c extends a {
    private final j _context;
    private transient h.c.e<Object> intercepted;

    public c(h.c.e<Object> eVar) {
        this(eVar, eVar != null ? eVar.getContext() : null);
    }

    @Override // h.c.e
    public j getContext() {
        j jVar = this._context;
        x.c(jVar);
        return jVar;
    }

    public final h.c.e<Object> intercepted() {
        c cVarInterceptContinuation = this.intercepted;
        if (cVarInterceptContinuation == null) {
            h.c.g gVar = (h.c.g) getContext().get(h.c.g.f48059a);
            cVarInterceptContinuation = gVar != null ? gVar.interceptContinuation(this) : this;
            this.intercepted = cVarInterceptContinuation;
        }
        return cVarInterceptContinuation;
    }

    @Override // h.c.b.a.a
    protected void releaseIntercepted() {
        h.c.e<?> eVar = this.intercepted;
        if (eVar != null && eVar != this) {
            h hVar = getContext().get(h.c.g.f48059a);
            x.c(hVar);
            ((h.c.g) hVar).releaseInterceptedContinuation(eVar);
        }
        this.intercepted = b.f48054a;
    }

    public c(h.c.e<Object> eVar, j jVar) {
        super(eVar);
        this._context = jVar;
    }
}
