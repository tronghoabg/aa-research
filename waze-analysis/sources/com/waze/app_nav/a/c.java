package com.waze.app_nav.a;

import com.waze.iv;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class c extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f15129a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f15130b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Object f15131c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f15132d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(e eVar, r rVar, h.c.e eVar2, int i2) {
        super(2, eVar2);
        this.f15132d = i2;
        this.f15130b = eVar;
        this.f15131c = rVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        int i2 = this.f15132d;
        if (i2 == 0) {
            return new c((e) this.f15130b, (r) this.f15131c, eVar, 0);
        }
        if (i2 != 1) {
            return new c((com.waze.asks.ab) this.f15131c, (k) this.f15130b, eVar, 2);
        }
        return new c((e) this.f15130b, (r) this.f15131c, eVar, 1, null);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i2 = this.f15132d;
        return i2 != 0 ? i2 != 1 ? ((c) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((c) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((c) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        int i2 = this.f15132d;
        if (i2 == 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            if (this.f15129a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                Object obj2 = this.f15130b;
                this.f15129a = 1;
                if (e.c((e) obj2, (p) this.f15131c, this) == aVar) {
                    return aVar;
                }
            }
            return h.ab.f48028a;
        }
        if (i2 != 1) {
            h.c.a.a aVar2 = h.c.a.a.f48038a;
            if (this.f15129a == 0) {
                e.b.c.b(obj);
                this.f15129a = 1;
                if (((com.waze.asks.ab) this.f15131c).a().collect(new j(), this) == aVar2) {
                    return aVar2;
                }
            } else {
                e.b.c.b(obj);
            }
            throw new h.e();
        }
        h.c.a.a aVar3 = h.c.a.a.f48038a;
        if (this.f15129a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            Object obj3 = this.f15130b;
            org.a.d.k.b bVarA = s.a();
            int i3 = h.g.b.ar.f48106a;
            az azVar = (az) bVarA.a(new h.g.b.m(u.class), null, null);
            azVar.E(ay.f15122a);
            this.f15129a = 1;
            obj = ((e) obj3).x(azVar, new iv(this.f15131c, 2), this);
            if (obj == aVar3) {
                return aVar3;
            }
        }
        com.waze.settings.tree.a.d dVar = (com.waze.settings.tree.a.d) obj;
        if (dVar instanceof com.waze.shared_infra.coordinators.d) {
            y yVar = (y) ((com.waze.shared_infra.coordinators.d) dVar).f();
            if (!h.g.b.x.n(yVar, w.f15163a)) {
                if (!h.g.b.x.n(yVar, x.f15164a)) {
                    throw new h.i();
                }
                ((e) this.f15130b).a().c();
            }
        } else if (!(dVar instanceof com.waze.shared_infra.coordinators.e)) {
            throw new h.i();
        }
        return h.ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(e eVar, r rVar, h.c.e eVar2, int i2, byte[] bArr) {
        super(2, eVar2);
        this.f15132d = i2;
        this.f15130b = eVar;
        this.f15131c = rVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(com.waze.asks.ab abVar, k kVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f15132d = i2;
        this.f15131c = abVar;
        this.f15130b = kVar;
    }
}
