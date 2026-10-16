package com.waze.main_screen.t;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class ae extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ am f27461a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f27462b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f27463c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ae(am amVar, h.g.a.l lVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f27463c = i2;
        this.f27461a = amVar;
        this.f27462b = lVar;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlinx.coroutines.af] */
    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        return this.f27463c != 0 ? new ae(this.f27461a, (kotlinx.coroutines.af) this.f27462b, eVar, 1) : new ae(this.f27461a, (h.g.a.l) this.f27462b, eVar, 0);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        return this.f27463c != 0 ? ((ae) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((ae) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, kotlinx.coroutines.af] */
    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        if (this.f27463c != 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            e.b.c.b(obj);
            am amVar = this.f27461a;
            if (amVar.m().m()) {
                kotlinx.coroutines.aj.z(this.f27462b, null, null, new q(amVar, (h.c.e) null, 0), 3);
            }
            return h.ab.f48028a;
        }
        h.c.a.a aVar2 = h.c.a.a.f48038a;
        e.b.c.b(obj);
        com.waze.reports_v2.presentation.a.au auVarC = this.f27461a.m().c();
        if (auVarC != null) {
            this.f27462b.invoke(auVarC);
        }
        return h.ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ae(am amVar, kotlinx.coroutines.af afVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f27463c = i2;
        this.f27461a = amVar;
        this.f27462b = afVar;
    }
}
