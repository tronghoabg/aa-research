package com.waze.perf;

import com.google.v.du;
import h.ab;
import kotlinx.coroutines.af;
import l.a.bas;
import l.a.brf;
import l.a.bri;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class i extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ j f33047a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ du f33048b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f33049c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i(j jVar, bri briVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f33049c = i2;
        this.f33047a = jVar;
        this.f33048b = briVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        if (this.f33049c == 0) {
            return new i(this.f33047a, (bri) this.f33048b, eVar, 0);
        }
        return new i((brf) this.f33048b, this.f33047a, eVar, 1);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        return this.f33049c != 0 ? ((i) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a) : ((i) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        if (this.f33049c == 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            e.b.c.b(obj);
            com.waze.main_screen.p.a.b.b.r rVar = this.f33047a.f33055f;
            if (rVar != null) {
                rVar.c((bri) this.f33048b);
            }
            return ab.f48028a;
        }
        h.c.a.a aVar2 = h.c.a.a.f48038a;
        e.b.c.b(obj);
        brf brfVar = (brf) this.f33048b;
        if (brfVar.getNetworkStatsWrapper().getServerRequestResult().hasGenericResponseData()) {
            j jVar = this.f33047a;
            bas genericResponseData = brfVar.getNetworkStatsWrapper().getServerRequestResult().getGenericResponseData();
            h.g.b.x.e(genericResponseData, "getGenericResponseData(...)");
            j.a(jVar, genericResponseData);
        }
        com.waze.main_screen.p.a.b.b.r rVar2 = this.f33047a.f33055f;
        if (rVar2 != null) {
            rVar2.b(brfVar);
        }
        return ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i(brf brfVar, j jVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f33049c = i2;
        this.f33048b = brfVar;
        this.f33047a = jVar;
    }
}
