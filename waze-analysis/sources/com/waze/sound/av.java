package com.waze.sound;

import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class av extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f39472a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f39473b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f39474c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    av(ah ahVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f39474c = i2;
        this.f39473b = ahVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        int i2 = this.f39474c;
        if (i2 == 0) {
            av avVar = new av((ax) this.f39473b, eVar, 0);
            avVar.f39472a = obj;
            return avVar;
        }
        Object obj2 = this.f39473b;
        if (i2 != 1) {
            av avVar2 = new av((bt) obj2, eVar, 2);
            avVar2.f39472a = obj;
            return avVar2;
        }
        av avVar3 = new av((ah) obj2, eVar, 1);
        avVar3.f39472a = obj;
        return avVar3;
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i2 = this.f39474c;
        return i2 != 0 ? i2 != 1 ? ((av) create((bp) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((av) create((h.a.ag) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((av) create((com.waze.c.e.cl) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        int i2 = this.f39474c;
        if (i2 == 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            e.b.c.b(obj);
            com.waze.c.e.cl clVar = (com.waze.c.e.cl) this.f39472a;
            ax axVar = (ax) this.f39473b;
            if (axVar.f39485i.d().getClass() != clVar.getClass()) {
                com.waze.shared_infra.i.e eVar = axVar.f39481e;
                Objects.toString(clVar);
                eVar.a("setStateTo: ".concat(String.valueOf(clVar)));
            }
            return h.ab.f48028a;
        }
        if (i2 == 1) {
            h.c.a.a aVar2 = h.c.a.a.f48038a;
            e.b.c.b(obj);
            h.a.ag agVar = (h.a.ag) this.f39472a;
            int iA = agVar.a();
            ab abVar = (ab) agVar.c();
            ((ah) this.f39473b).f39418a.a((iA == 0 ? "got first" : "switching") + " recording source: " + abVar);
            return h.ab.f48028a;
        }
        h.c.a.a aVar3 = h.c.a.a.f48038a;
        e.b.c.b(obj);
        bp bpVar = (bp) this.f39472a;
        bt btVar = (bt) this.f39473b;
        btVar.f39570e.e(bpVar);
        btVar.f39567b.e("Available Modes: " + btVar.a() + " Selected mode: " + bpVar);
        return h.ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    av(ax axVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f39474c = i2;
        this.f39473b = axVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    av(bt btVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f39474c = i2;
        this.f39473b = btVar;
    }
}
