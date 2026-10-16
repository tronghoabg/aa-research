package com.waze.br.a;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class r implements a {

    /* renamed from: a, reason: collision with root package name */
    private final ab f17307a;

    public r(ab abVar) {
        h.g.b.x.f(abVar, "searchMateService");
        this.f17307a = abVar;
    }

    @Override // com.waze.t.a.b
    public final kotlinx.coroutines.b.k b(String str, com.waze.t.a.e eVar) {
        w wVar;
        h.g.b.x.f(str, "conversationId");
        h.g.b.x.f(eVar, "message");
        if (eVar instanceof com.waze.t.a.c) {
            wVar = new v((m) ((com.waze.t.a.c) eVar).a());
        } else {
            if (!(eVar instanceof com.waze.t.a.d)) {
                throw new h.i();
            }
            wVar = new w(((com.waze.t.a.d) eVar).a());
        }
        return new q(this.f17307a.a(str, wVar), 1);
    }

    @Override // com.waze.t.a.b
    public final kotlinx.coroutines.b.k c(com.waze.t.a.h hVar) {
        h.g.b.x.f(hVar, "trigger");
        return new q(this.f17307a.b(hVar), 0);
    }
}
