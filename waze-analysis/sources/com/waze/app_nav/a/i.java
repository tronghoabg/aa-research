package com.waze.app_nav.a;

import com.waze.mo;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class i extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f15147a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f15148b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f15149c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i(ae aeVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f15149c = i2;
        this.f15148b = aeVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        int i2 = this.f15149c;
        if (i2 == 0) {
            return new i((k) this.f15148b, eVar, 0);
        }
        if (i2 == 1) {
            return new i((e) this.f15148b, eVar, 1);
        }
        if (i2 == 2) {
            return new i((e) this.f15148b, eVar, 2, null);
        }
        Object obj2 = this.f15148b;
        return i2 != 3 ? new i((ag) obj2, eVar, 4) : new i((ae) obj2, eVar, 3);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i2 = this.f15149c;
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? ((i) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((i) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((i) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((i) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((i) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        int i2 = this.f15149c;
        if (i2 == 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            if (this.f15147a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                Object obj2 = this.f15148b;
                this.f15147a = 1;
                if (new h(((k) obj2).f15150a.b()).collect(new af((com.waze.shared_infra.coordinators.s) obj2, 1), this) == aVar) {
                    return aVar;
                }
            }
            return h.ab.f48028a;
        }
        if (i2 == 1) {
            h.c.a.a aVar2 = h.c.a.a.f48038a;
            if (this.f15147a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                Object obj3 = this.f15148b;
                e eVar = (e) obj3;
                if (eVar.f15138b) {
                    eVar.f15140e.clear();
                    return h.ab.f48028a;
                }
                eVar.f15138b = true;
                com.waze.shared_infra.coordinators.o oVar = (com.waze.shared_infra.coordinators.o) obj3;
                org.a.d.k.b bVarA = s.a();
                int i3 = h.g.b.ar.f48106a;
                az azVar = (az) bVarA.a(new h.g.b.m(ae.class), null, null);
                azVar.E(ay.f15122a);
                this.f15147a = 1;
                if (oVar.x(azVar, new com.waze.perf.p(11), this) == aVar2) {
                    return aVar2;
                }
            }
            ((e) this.f15148b).f15138b = false;
            return h.ab.f48028a;
        }
        if (i2 == 2) {
            h.c.a.a aVar3 = h.c.a.a.f48038a;
            if (this.f15147a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                Object obj4 = this.f15148b;
                this.f15147a = 1;
                if (((com.waze.shared_infra.coordinators.o) obj4).v(this) == aVar3) {
                    return aVar3;
                }
            }
            return h.ab.f48028a;
        }
        if (i2 != 3) {
            h.c.a.a aVar4 = h.c.a.a.f48038a;
            if (this.f15147a == 0) {
                e.b.c.b(obj);
                Object obj5 = this.f15148b;
                this.f15147a = 1;
                if (((ag) obj5).d().b().collect(new af((com.waze.shared_infra.coordinators.s) obj5, 0), this) == aVar4) {
                    return aVar4;
                }
            } else {
                e.b.c.b(obj);
            }
            throw new h.e();
        }
        h.c.a.a aVar5 = h.c.a.a.f48038a;
        if (this.f15147a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            Object obj6 = this.f15148b;
            org.a.d.k.b bVarA2 = s.a();
            int i4 = h.g.b.ar.f48106a;
            az azVar2 = (az) bVarA2.a(new h.g.b.m(u.class), null, null);
            azVar2.E(ay.f15122a);
            this.f15147a = 1;
            obj = ((ae) obj6).x(azVar2, new mo(2), this);
            if (obj == aVar5) {
                return aVar5;
            }
        }
        com.waze.settings.tree.a.d dVar = (com.waze.settings.tree.a.d) obj;
        if (dVar instanceof com.waze.shared_infra.coordinators.d) {
            y yVar = (y) ((com.waze.shared_infra.coordinators.d) dVar).f();
            if (!h.g.b.x.n(yVar, w.f15163a)) {
                if (!h.g.b.x.n(yVar, x.f15164a)) {
                    throw new h.i();
                }
                ((ae) this.f15148b).a().b();
            }
        } else if (!(dVar instanceof com.waze.shared_infra.coordinators.e)) {
            throw new h.i();
        }
        return h.ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i(ag agVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f15149c = i2;
        this.f15148b = agVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i(e eVar, h.c.e eVar2, int i2) {
        super(2, eVar2);
        this.f15149c = i2;
        this.f15148b = eVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i(e eVar, h.c.e eVar2, int i2, byte[] bArr) {
        super(2, eVar2);
        this.f15149c = i2;
        this.f15148b = eVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i(k kVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f15149c = i2;
        this.f15148b = kVar;
    }
}
