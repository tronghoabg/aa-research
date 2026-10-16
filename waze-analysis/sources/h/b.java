package h;

import h.g.b.au;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class b implements h.c.e {

    /* renamed from: a, reason: collision with root package name */
    private h.g.a.q f48031a;

    /* renamed from: b, reason: collision with root package name */
    private Object f48032b;

    /* renamed from: c, reason: collision with root package name */
    private h.c.e f48033c;

    /* renamed from: d, reason: collision with root package name */
    private Object f48034d;

    public b(h.g.a.q qVar, Object obj) {
        h.g.b.x.f(qVar, "block");
        this.f48031a = qVar;
        this.f48032b = obj;
        this.f48033c = this;
        this.f48034d = a.f47922b;
    }

    public final Object a(Object obj, h.c.e eVar) {
        this.f48033c = eVar;
        this.f48032b = obj;
        h.c.a.a aVar = h.c.a.a.f48038a;
        h.d.b.c(eVar);
        return aVar;
    }

    public final Object b() {
        Object objInvoke;
        while (true) {
            Object obj = this.f48034d;
            h.c.e eVar = this.f48033c;
            if (eVar == null) {
                e.b.c.b(obj);
                return obj;
            }
            if (h.g.b.x.n(a.f47922b, obj)) {
                try {
                    h.g.a.q qVar = this.f48031a;
                    Object obj2 = this.f48032b;
                    if (qVar instanceof h.c.b.a.a) {
                        au.h(qVar, 3);
                        objInvoke = qVar.invoke(this, obj2, eVar);
                    } else {
                        objInvoke = h.c.a.h.b(qVar, this, obj2, eVar);
                    }
                    if (objInvoke != h.c.a.a.f48038a) {
                        eVar.resumeWith(objInvoke);
                    }
                } catch (Throwable th) {
                    eVar.resumeWith(e.b.c.a(th));
                }
            } else {
                this.f48034d = a.f47922b;
                eVar.resumeWith(obj);
            }
        }
    }

    @Override // h.c.e
    public final h.c.j getContext() {
        return h.c.k.f48060a;
    }

    @Override // h.c.e
    public final void resumeWith(Object obj) {
        this.f48033c = null;
        this.f48034d = obj;
    }

    private b() {
        throw null;
    }
}
