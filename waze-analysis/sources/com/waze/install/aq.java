package com.waze.install;

import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.ck;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class aq implements x {

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f24763b;

    /* renamed from: c, reason: collision with root package name */
    private final bn f24764c;

    /* renamed from: d, reason: collision with root package name */
    private final bn f24765d;

    /* renamed from: e, reason: collision with root package name */
    private final kotlinx.coroutines.b.k f24766e;

    public aq(com.waze.shared_infra.i.e eVar) {
        h.g.b.x.f(eVar, "logger");
        this.f24763b = eVar;
        bn bnVarB = ck.b(h.a.r.j());
        this.f24764c = bnVarB;
        this.f24765d = ck.b(e.c.d.a.p());
        this.f24766e = kotlinx.coroutines.b.ai.y(new ap(bnVarB));
    }

    @Override // com.waze.install.x
    public final kotlinx.coroutines.b.k a() {
        return this.f24766e;
    }

    @Override // com.waze.install.x
    public final kotlinx.coroutines.b.k b(h.l.c cVar) {
        h.g.b.x.f(cVar, "requirementClass");
        return kotlinx.coroutines.b.ai.y(new al(this.f24764c, cVar, 1));
    }

    @Override // com.waze.install.x
    public final kotlinx.coroutines.b.k c(h.l.c cVar) {
        h.g.b.x.f(cVar, "requirementClass");
        return kotlinx.coroutines.b.ai.y(new al(this.f24764c, cVar, 0));
    }

    @Override // com.waze.install.x
    public final kotlinx.coroutines.b.k d(h.l.c cVar) {
        h.g.b.x.f(cVar, "requirementClass");
        return kotlinx.coroutines.b.ai.y(new al(this.f24765d, cVar, 2));
    }

    @Override // com.waze.install.x
    public final void e(w wVar) {
        bn bnVar;
        Object objD;
        Class<?> cls;
        h.g.b.x.f(wVar, "requirement");
        Objects.toString(wVar);
        this.f24763b.a("adding requirement: requirement=".concat(wVar.toString()));
        do {
            bnVar = this.f24764c;
            objD = bnVar.d();
            cls = wVar.getClass();
            int i2 = h.g.b.ar.f48106a;
        } while (!bnVar.f(objD, h.a.r.p((Map) objD, new h.k(new h.g.b.m(cls), wVar))));
    }

    @Override // com.waze.install.x
    public final void f(h.l.c cVar) {
        bn bnVar;
        Object objD;
        Object objD2;
        h.g.b.x.f(cVar, "requirementClass");
        Objects.toString(cVar);
        this.f24763b.a("removing requirement: requirementClass=".concat(cVar.toString()));
        do {
            bnVar = this.f24764c;
            objD = bnVar.d();
        } while (!bnVar.f(objD, h.a.r.l((Map) objD, cVar)));
        bn bnVar2 = this.f24765d;
        do {
            objD2 = bnVar2.d();
        } while (!bnVar2.f(objD2, e.c.d.a.w((Set) objD2, cVar)));
    }
}
