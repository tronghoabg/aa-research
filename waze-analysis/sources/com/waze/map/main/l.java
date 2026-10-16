package com.waze.map.main;

import com.waze.cv;
import com.waze.map.b.cu;
import com.waze.map.gu;
import com.waze.navigate.AddressItem;
import com.waze.navigate.fj;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class l implements kotlinx.coroutines.b.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Object f29443a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f29444b;

    l(Object obj, int i2) {
        this.f29444b = i2;
        this.f29443a = obj;
    }

    /* JADX WARN: Type inference failed for: r4v14, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v16, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v18, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v20, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v22, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v24, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v26, types: [h.g.a.l, java.lang.Object] */
    @Override // kotlinx.coroutines.b.l
    public final /* synthetic */ Object emit(Object obj, h.c.e eVar) {
        switch (this.f29444b) {
            case 0:
                p.f((p) this.f29443a).a().invoke(((cu) obj).a());
                break;
            case 1:
                ((com.waze.map.bq) this.f29443a).r(((com.waze.view.popups.b.l) obj).f45260a);
                break;
            case 2:
                p.f((p) this.f29443a).a().invoke((String) obj);
                break;
            case 3:
                this.f29443a.invoke((com.waze.map.b.w) obj);
                break;
            case 4:
                this.f29443a.invoke((com.waze.map.b.y) obj);
                break;
            case 5:
                this.f29443a.invoke((com.waze.map.b.r) obj);
                break;
            case 6:
                this.f29443a.invoke((com.waze.map.b.z) obj);
                break;
            case 7:
                this.f29443a.invoke((com.waze.map.b.aa) obj);
                break;
            case 8:
                this.f29443a.invoke((com.waze.map.b.ae) obj);
                break;
            case 9:
                this.f29443a.invoke((com.waze.map.b.af) obj);
                break;
            case 10:
                ((Boolean) obj).booleanValue();
                bm bmVar = (bm) this.f29443a;
                bmVar.p.a("stop point detected, will clear popup and recenter map");
                bmVar.J();
                bmVar.f29390b.g(com.waze.map.b.q.f28364a);
                break;
            case 11:
                cv cvVar = (cv) obj;
                bm bmVar2 = (bm) this.f29443a;
                bmVar2.s = bmVar2.f29390b.b(cvVar.a(), true);
                bmVar2.K(cvVar.a(), new com.waze.view.popups.a.o(cvVar.a(), gu.f29183c));
                break;
            case 12:
                fj fjVar = (fj) obj;
                bm bmVar3 = (bm) this.f29443a;
                com.waze.shared_infra.i.e eVar2 = bmVar3.p;
                Objects.toString(fjVar);
                eVar2.a("parked here changed to ".concat(String.valueOf(fjVar)));
                if (fjVar == null && bm.c(bmVar3) == gu.f29188h) {
                    bmVar3.J();
                } else if (fjVar != null && fjVar.b()) {
                    bmVar3.K(fjVar.a(), new com.waze.view.popups.a.o(fjVar.a(), gu.f29188h));
                }
                break;
            case 13:
                ((Boolean) obj).booleanValue();
                bm bmVar4 = (bm) this.f29443a;
                bmVar4.p.a("start navigation detected, will clear popup and recenter map");
                bmVar4.J();
                bmVar4.f29390b.g(com.waze.map.b.q.f28364a);
                break;
            case 14:
                com.waze.places.f fVar = (com.waze.places.f) obj;
                bm bmVar5 = (bm) this.f29443a;
                com.waze.shared_infra.i.e eVar3 = bmVar5.p;
                Objects.toString(fVar);
                eVar3.a("start point changed to ".concat(String.valueOf(fVar)));
                if (fVar == null && bm.c(bmVar5) == gu.f29185e) {
                    bmVar5.J();
                } else if (fVar != null) {
                    bmVar5.K(fVar.b(), new com.waze.view.popups.a.o(fVar.b(), gu.f29185e));
                }
                break;
            case 15:
                AddressItem addressItem = (AddressItem) obj;
                Object obj2 = this.f29443a;
                bm bmVar6 = (bm) obj2;
                com.waze.shared_infra.i.e eVar4 = bmVar6.p;
                Objects.toString(addressItem);
                eVar4.a("venue selection changed to ".concat(String.valueOf(addressItem)));
                if (addressItem != null) {
                    ah ahVar = bmVar6.f29390b;
                    com.waze.shared_infra.h.c coordinate = addressItem.getCoordinate();
                    h.g.b.x.e(coordinate, "getCoordinate(...)");
                    com.waze.shared_infra.s.d dVarB = ahVar.b(coordinate, false);
                    com.waze.shared_infra.s.d dVar = bmVar6.s;
                    if (dVar != null) {
                        dVar.a();
                    }
                    bmVar6.s = new com.waze.car_lib.i.a.d(dVarB, obj2, 3);
                    com.waze.shared_infra.h.c coordinate2 = addressItem.getCoordinate();
                    h.g.b.x.e(coordinate2, "getCoordinate(...)");
                    bmVar6.K(coordinate2, new com.waze.view.popups.a.s(addressItem));
                }
                break;
            case 16:
                ((bm) this.f29443a).f29390b.f(com.waze.map.b.g.f28352a);
                break;
            default:
                ((bm) this.f29443a).f29390b.f(com.waze.map.b.g.f28352a);
                break;
        }
        return h.ab.f48028a;
    }
}
