package com.waze.br.b;

import kotlinx.coroutines.ab;
import kotlinx.coroutines.ae;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.av;
import kotlinx.coroutines.cj;
import kotlinx.coroutines.e.ac;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class s implements p {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.br.a.t f17343a;

    /* renamed from: b, reason: collision with root package name */
    private final x f17344b;

    /* renamed from: c, reason: collision with root package name */
    private final b f17345c;

    /* renamed from: d, reason: collision with root package name */
    private final h.c.j f17346d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f17347e;

    /* renamed from: f, reason: collision with root package name */
    private final h.f f17348f;

    public s(com.waze.br.a.t tVar, x xVar, b bVar, h.c.j jVar, com.waze.shared_infra.i.e eVar) {
        h.g.b.x.f(tVar, "config");
        h.g.b.x.f(xVar, "starterFactory");
        h.g.b.x.f(bVar, "actionHandlerFactory");
        h.g.b.x.f(jVar, "coroutineContext");
        h.g.b.x.f(eVar, "logger");
        this.f17343a = tVar;
        this.f17344b = xVar;
        this.f17345c = bVar;
        this.f17346d = jVar;
        this.f17347e = eVar;
        this.f17348f = h.g.a(new r(this, 0));
    }

    static final w b(s sVar) {
        c cVarA = sVar.f17345c.a();
        h.c.j jVarPlus = sVar.f17346d.plus(new ae("SearchMateController")).plus(aj.Q());
        h.c.h hVar = jVarPlus.get(h.c.g.f48059a);
        if ((hVar instanceof ab ? (ab) hVar : null) == null) {
            int i2 = av.f51370a;
            cj cjVar = ac.f51860a;
        }
        x xVar = sVar.f17344b;
        int i3 = av.f51370a;
        cj cjVar2 = ac.f51860a;
        com.waze.shared_infra.i.e eVar = sVar.f17347e;
        return new w(xVar.a(cjVar2, eVar), cVarA, eVar, jVarPlus);
    }

    @Override // com.waze.br.b.p
    public final w a() {
        if (this.f17343a.a()) {
            return (w) this.f17348f.getValue();
        }
        return null;
    }
}
