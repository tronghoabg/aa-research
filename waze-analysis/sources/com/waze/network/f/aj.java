package com.waze.network.f;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class aj extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f32288a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ag f32289b;

    /* renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f32290c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    aj(ag agVar, h.c.e eVar) {
        super(2, eVar);
        this.f32289b = agVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        aj ajVar = new aj(this.f32289b, eVar);
        ajVar.f32290c = obj;
        return ajVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((aj) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        Object objA;
        h.c.a.a aVar = h.c.a.a.f48038a;
        try {
            try {
                if (this.f32288a != 0) {
                    e.b.c.b(obj);
                } else {
                    e.b.c.b(obj);
                    ag agVar = this.f32289b;
                    com.waze.authentication.x xVar = new com.waze.authentication.x(false);
                    this.f32288a = 1;
                    obj = agVar.a(xVar, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                objA = (af) obj;
            } catch (Exception e2) {
                com.waze.shared_infra.i.h.j("getOrFetchAccessToken failed due to " + e2);
                if (e2 instanceof com.waze.authentication.o) {
                    com.waze.shared_infra.i.h.j("Credentials are invalid InstallationRequirements");
                    ((com.waze.install.x) com.waze.web.r.m(com.waze.install.x.class)).e(com.waze.install.v.f24796a);
                }
                throw e2;
            }
        } catch (Throwable th) {
            objA = e.b.c.a(th);
        }
        Throwable thC = h.m.c(objA);
        if (thC != null) {
            com.waze.shared_infra.i.h.j("failed to get token: ".concat(String.valueOf(thC.getMessage())));
        }
        return h.ab.f48028a;
    }
}
