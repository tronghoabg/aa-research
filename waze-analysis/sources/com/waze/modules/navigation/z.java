package com.waze.modules.navigation;

import kotlinx.coroutines.CompletableDeferred;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class z extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f30509a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ long f30510b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ CompletableDeferred f30511c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ h.g.a.l f30512d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ com.waze.app_nav.hub.b.e f30513e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    z(long j2, CompletableDeferred completableDeferred, h.g.a.l lVar, com.waze.app_nav.hub.b.e eVar, h.c.e eVar2) {
        super(2, eVar2);
        this.f30510b = j2;
        this.f30511c = completableDeferred;
        this.f30512d = lVar;
        this.f30513e = eVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new z(this.f30510b, this.f30511c, this.f30512d, this.f30513e, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((z) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f30509a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            this.f30509a = 1;
            if (kotlinx.coroutines.aj.q(this.f30510b, this) == aVar) {
                return aVar;
            }
        }
        this.f30511c.a(this.f30512d.invoke(true));
        this.f30513e.b(false);
        return h.ab.f48028a;
    }
}
