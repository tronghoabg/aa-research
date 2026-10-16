package com.waze.t.b;

import kotlinx.coroutines.b.ch;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class y extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f40828a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f40829b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Object f40830c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Object f40831d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ int f40832e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    y(ag agVar, bb bbVar, com.waze.t.a.s sVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f40832e = i2;
        this.f40831d = agVar;
        this.f40830c = bbVar;
        this.f40829b = sVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        if (this.f40832e != 0) {
            Object obj2 = this.f40831d;
            return new y((ag) obj2, (bb) this.f40830c, (com.waze.t.a.s) this.f40829b, eVar, 1);
        }
        Object obj3 = this.f40829b;
        return new y((ag) obj3, (h.g.b.am) this.f40830c, (h.g.b.am) this.f40831d, eVar, 0);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        return this.f40832e != 0 ? ((y) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((y) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        if (this.f40832e == 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            if (this.f40828a == 0) {
                e.b.c.b(obj);
                ag agVar = (ag) this.f40829b;
                ch chVarG = agVar.y.g();
                h.g.b.am amVar = (h.g.b.am) this.f40830c;
                this.f40828a = 1;
                if (chVarG.collect(new x(amVar, agVar, (h.g.b.am) this.f40831d), this) == aVar) {
                    return aVar;
                }
            } else {
                e.b.c.b(obj);
            }
            throw new h.e();
        }
        h.c.a.a aVar2 = h.c.a.a.f48038a;
        if (this.f40828a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            Object obj2 = this.f40831d;
            ag agVar2 = (ag) obj2;
            agVar2.f40679l.d((bb) this.f40830c);
            Object obj3 = this.f40829b;
            this.f40828a = 1;
            obj = agVar2.f40674g.b(((com.waze.t.a.s) obj3).a(), agVar2.a(), this);
            if (obj == aVar2) {
                return aVar2;
            }
        }
        Object obj4 = this.f40831d;
        cb cbVar = (cb) obj;
        ag agVar3 = (ag) obj4;
        bb bbVar = (bb) this.f40830c;
        agVar3.f40679l.c(bbVar, cbVar.e());
        agVar3.P(bq.e(ag.W(agVar3.b()), null, false, new al(cbVar), null, 11), true);
        agVar3.Y(new be(bbVar), new com.waze.t.a.c(cbVar));
        return h.ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    y(ag agVar, h.g.b.am amVar, h.g.b.am amVar2, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f40832e = i2;
        this.f40829b = agVar;
        this.f40830c = amVar;
        this.f40831d = amVar2;
    }
}
