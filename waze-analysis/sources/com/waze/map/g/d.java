package com.waze.map.g;

import com.waze.map.b.Cdo;
import com.waze.map.b.ag;
import com.waze.map.b.bf;
import com.waze.map.b.cn;
import com.waze.map.b.cr;
import com.waze.map.canvas.bj;
import h.ab;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class d implements kotlinx.coroutines.b.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ s f29049a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f29050b;

    d(s sVar, int i2) {
        this.f29050b = i2;
        this.f29049a = sVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.b.l
    public final /* synthetic */ Object emit(Object obj, h.c.e eVar) {
        Cdo cdo;
        Object[] objArr = 0;
        switch (this.f29050b) {
            case 0:
                s sVar = this.f29049a;
                sVar.f29098g.a("PlatformAutoRecenter: Recived auto-recenter event, will recenter to user location.");
                s.t(sVar, true, sVar.o.g());
                return ab.f48028a;
            case 1:
                ((Boolean) obj).booleanValue();
                s sVar2 = this.f29049a;
                sVar2.m.f(bj.f28599a, bj.f28600b);
                sVar2.m.f(bj.f28601c, bj.f28603e);
                return ab.f48028a;
            case 2:
                this.f29049a.v(new e(s.x((String) obj), objArr == true ? 1 : 0));
                return ab.f48028a;
            case 3:
                com.waze.an.c.q qVar = (com.waze.an.c.q) obj;
                if (h.g.b.x.n(qVar, com.waze.map.b.g.f28352a)) {
                    this.f29049a.f29092a.y(null);
                } else if (h.g.b.x.n(qVar, com.waze.map.b.e.f28236a)) {
                    com.waze.shared_infra.i.h.c("showDarkOverlay not supported yet");
                } else {
                    if (!(qVar instanceof com.waze.map.b.f)) {
                        throw new h.i();
                    }
                    this.f29049a.f29092a.y(((com.waze.map.b.f) qVar).d());
                }
                return ab.f48028a;
            case 4:
                bf bfVar = (bf) obj;
                if (!h.g.b.x.n(bfVar, com.waze.map.b.k.f28355a) && !h.g.b.x.n(bfVar, com.waze.map.b.l.f28356a) && !(bfVar instanceof com.waze.map.b.m)) {
                    if (!h.g.b.x.n(bfVar, com.waze.map.b.i.f28353a) && !h.g.b.x.n(bfVar, com.waze.map.b.j.f28354a)) {
                        throw new h.i();
                    }
                    this.f29049a.f29098g.g("immediate-request " + bfVar + " not supported yet in WazeMap");
                }
                return ab.f48028a;
            case 5:
                t tVar = (t) obj;
                if (tVar instanceof v) {
                    this.f29049a.f29092a.E(((v) tVar).a());
                } else {
                    if (!(tVar instanceof u)) {
                        throw new h.i();
                    }
                    s sVar3 = this.f29049a;
                    sVar3.v(new com.waze.car_lib.r.a.a(sVar3.m.d() == bj.f28601c, new cn(s.y(sVar3.f29097f), ((u) tVar).c()), cr.f28163a, tVar, 2));
                }
                return ab.f48028a;
            case 6:
                Object objC = this.f29049a.o.c(((Boolean) obj).booleanValue(), eVar);
                return objC == h.c.a.a.f48038a ? objC : ab.f48028a;
            case 7:
                w wVar = this.f29049a.o;
                Cdo cdo2 = Cdo.f28213a;
                ag agVar = ag.f27996a;
                int iOrdinal = ((ag) obj).ordinal();
                if (iOrdinal == 0) {
                    cdo = Cdo.f28215c;
                } else {
                    if (iOrdinal != 1) {
                        throw new h.i();
                    }
                    cdo = Cdo.f28213a;
                }
                Object objD = wVar.d(cdo, eVar);
                return objD == h.c.a.a.f48038a ? objD : ab.f48028a;
            default:
                Object objE = this.f29049a.o.e(((Number) obj).intValue(), eVar);
                return objE == h.c.a.a.f48038a ? objE : ab.f48028a;
        }
    }
}
