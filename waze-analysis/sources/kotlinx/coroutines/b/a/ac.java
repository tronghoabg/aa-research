package kotlinx.coroutines.b.a;

import com.waze.navigate.location_preview.an;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ac<T> extends h.c.b.a.c implements kotlinx.coroutines.b.l, h.c.b.a.d {

    /* renamed from: a, reason: collision with root package name */
    public final kotlinx.coroutines.b.l f51386a;

    /* renamed from: b, reason: collision with root package name */
    public final h.c.j f51387b;

    /* renamed from: c, reason: collision with root package name */
    public final int f51388c;

    /* renamed from: d, reason: collision with root package name */
    private h.c.j f51389d;

    /* renamed from: e, reason: collision with root package name */
    private h.c.e f51390e;

    public ac(kotlinx.coroutines.b.l lVar, h.c.j jVar) {
        super(z.f51458a, h.c.k.f48060a);
        this.f51386a = lVar;
        this.f51387b = jVar;
        this.f51388c = ((Number) jVar.fold(0, new com.waze.cf.j(9))).intValue();
    }

    @Override // kotlinx.coroutines.b.l
    public final Object emit(T t, h.c.e<? super h.ab> eVar) {
        try {
            h.c.j context = eVar.getContext();
            h.g.b.o.f(context);
            h.c.j jVar = this.f51389d;
            if (jVar != context) {
                if (jVar instanceof u) {
                    throw new IllegalStateException(h.n.o.c("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((u) jVar).f51455a + ", but then emission attempt of value '" + t + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            "));
                }
                if (((Number) context.fold(0, new an(this, 8))).intValue() != this.f51388c) {
                    throw new IllegalStateException("Flow invariant is violated:\n\t\tFlow was collected in " + this.f51387b + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead");
                }
                this.f51389d = context;
            }
            this.f51390e = eVar;
            h.g.a.q qVar = ae.f51392a;
            kotlinx.coroutines.b.l lVar = this.f51386a;
            h.g.b.x.d(lVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
            Object objInvoke = qVar.invoke(lVar, t, this);
            if (!h.g.b.x.n(objInvoke, h.c.a.a.f48038a)) {
                this.f51390e = null;
            }
            h.c.a.a aVar = h.c.a.a.f48038a;
            if (objInvoke == aVar) {
                h.d.b.c(eVar);
            }
            return objInvoke == aVar ? objInvoke : h.ab.f48028a;
        } catch (Throwable th) {
            this.f51389d = new u(th, eVar.getContext());
            throw th;
        }
    }

    @Override // h.c.b.a.a, h.c.b.a.d
    public final h.c.b.a.d getCallerFrame() {
        h.c.e eVar = this.f51390e;
        if (eVar instanceof h.c.b.a.d) {
            return (h.c.b.a.d) eVar;
        }
        return null;
    }

    @Override // h.c.b.a.c, h.c.e
    public final h.c.j getContext() {
        h.c.j jVar = this.f51389d;
        return jVar == null ? h.c.k.f48060a : jVar;
    }

    @Override // h.c.b.a.a, h.c.b.a.d
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // h.c.b.a.a
    protected final Object invokeSuspend(Object obj) {
        Throwable thC = h.m.c(obj);
        if (thC != null) {
            this.f51389d = new u(thC, getContext());
        }
        h.c.e eVar = this.f51390e;
        if (eVar != null) {
            eVar.resumeWith(obj);
        }
        return h.c.a.a.f48038a;
    }

    @Override // h.c.b.a.c, h.c.b.a.a
    public final void releaseIntercepted() {
        super.releaseIntercepted();
    }
}
