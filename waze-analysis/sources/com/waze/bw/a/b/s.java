package com.waze.bw.a.b;

import com.waze.av.b.aa;
import com.waze.sound.df;
import h.ab;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class s extends h.c.b.a.g implements h.g.a.q {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f17604a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f17605b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ v f17606c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f17607d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    s(v vVar, h.c.e eVar, int i2) {
        super(3, eVar);
        this.f17607d = i2;
        this.f17606c = vVar;
    }

    @Override // h.g.a.q
    public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        if (this.f17607d != 0) {
            s sVar = new s(this.f17606c, (h.c.e) obj3, 1, null);
            sVar.f17604a = (com.waze.sharedui.e.c) obj;
            sVar.f17605b = (aa) obj2;
            return sVar.invokeSuspend(ab.f48028a);
        }
        s sVar2 = new s(this.f17606c, (h.c.e) obj3, 0);
        sVar2.f17604a = (List) obj;
        sVar2.f17605b = (com.waze.bw.b.a.o) obj2;
        return sVar2.invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        boolean z = false;
        z = false;
        if (this.f17607d == 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            e.b.c.b(obj);
            List list = (List) this.f17604a;
            com.waze.bw.b.a.o oVar = (com.waze.bw.b.a.o) this.f17605b;
            return h.m.k.j(h.m.k.r(h.m.k.p(h.m.k.q(h.m.k.k(h.m.k.n(h.a.i.av(list), new df(10)), new df(11)), new com.waze.car_lib.r.d.k(9)), new l(this.f17606c, oVar != null ? oVar.c() : h.a.r.j(), z ? 1 : 0)), 2));
        }
        h.c.a.a aVar2 = h.c.a.a.f48038a;
        e.b.c.b(obj);
        com.waze.sharedui.e.c cVar = (com.waze.sharedui.e.c) this.f17604a;
        aa aaVar = (aa) this.f17605b;
        if (aaVar != null && com.waze.sharedui.utils.f.a(cVar.f(), aaVar.a().d()) < this.f17606c.f17616b.c()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    s(v vVar, h.c.e eVar, int i2, byte[] bArr) {
        super(3, eVar);
        this.f17607d = i2;
        this.f17606c = vVar;
    }
}
