package com.waze.main_screen.c;

import kotlinx.coroutines.b.bq;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class y extends h.c.b.a.g implements h.g.a.q {

    /* renamed from: a, reason: collision with root package name */
    int f26296a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f26297b;

    /* renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f26298c;

    public y(h.c.e eVar) {
        super(3, eVar);
    }

    @Override // h.g.a.q
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        y yVar = new y((h.c.e) obj3);
        yVar.f26298c = (kotlinx.coroutines.b.l) obj;
        yVar.f26297b = obj2;
        return yVar.invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        bq bqVarA;
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f26296a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            kotlinx.coroutines.b.l lVar = (kotlinx.coroutines.b.l) this.f26298c;
            y yVar = this;
            com.waze.nav_connect.b.j jVar = (com.waze.nav_connect.b.j) this.f26297b;
            bq bqVarC = (jVar == null || (bqVarA = jVar.a()) == null) ? kotlinx.coroutines.b.ai.C() : bqVarA;
            this.f26296a = 1;
            if (kotlinx.coroutines.b.ai.g(lVar, bqVarC, yVar) == aVar) {
                return aVar;
            }
        }
        return h.ab.f48028a;
    }
}
