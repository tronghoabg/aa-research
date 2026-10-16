package com.waze.map.g;

import com.waze.modules.c.eb;
import h.ab;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class i extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f29062a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ s f29063b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f29064c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i(s sVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f29064c = i2;
        this.f29063b = sVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        if (this.f29064c != 0) {
            i iVar = new i(this.f29063b, eVar, 1, null);
            iVar.f29062a = obj;
            return iVar;
        }
        i iVar2 = new i(this.f29063b, eVar, 0);
        iVar2.f29062a = obj;
        return iVar2;
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        return this.f29064c != 0 ? ((i) create((eb) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a) : ((i) create((com.waze.map.e.a) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        if (this.f29064c != 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            e.b.c.b(obj);
            if (((eb) this.f29062a) != null) {
                s sVar = this.f29063b;
                sVar.f29098g.a("Reroute detected, recentering on user location.");
                s.t(sVar, true, sVar.o.g());
            }
            return ab.f48028a;
        }
        h.c.a.a aVar2 = h.c.a.a.f48038a;
        e.b.c.b(obj);
        com.waze.map.e.a aVar3 = (com.waze.map.e.a) this.f29062a;
        aVar3.d().g(com.waze.map.b.d.f28176b);
        com.waze.shared_infra.s.d dVarA = this.f29063b.f29093b.a(aVar3.c());
        aVar3.d().g(com.waze.map.b.d.f28178d);
        aVar3.d().h(new com.waze.car_lib.e.d(dVarA, aVar3, 15));
        return ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i(s sVar, h.c.e eVar, int i2, byte[] bArr) {
        super(2, eVar);
        this.f29064c = i2;
        this.f29063b = sVar;
    }
}
