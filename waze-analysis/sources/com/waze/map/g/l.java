package com.waze.map.g;

import com.waze.install.ah;
import com.waze.map.b.aa;
import com.waze.map.b.ac;
import com.waze.map.b.ad;
import com.waze.map.b.ae;
import com.waze.map.b.af;
import com.waze.map.b.cu;
import com.waze.map.b.cv;
import com.waze.map.b.cw;
import com.waze.map.b.cz;
import com.waze.map.b.da;
import com.waze.map.b.db;
import com.waze.map.b.dc;
import com.waze.map.b.dd;
import com.waze.map.b.df;
import com.waze.map.b.dg;
import com.waze.map.b.dh;
import com.waze.map.b.di;
import com.waze.map.b.y;
import com.waze.map.b.z;
import h.ab;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class l implements kotlinx.coroutines.b.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ s f29072a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ h.g.a.l f29073b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f29074c;

    l(s sVar, h.g.a.l lVar, int i2) {
        this.f29074c = i2;
        this.f29072a = sVar;
        this.f29073b = lVar;
    }

    @Override // kotlinx.coroutines.b.l
    public final /* synthetic */ Object emit(Object obj, h.c.e eVar) {
        ah ahVar;
        switch (this.f29074c) {
            case 0:
                this.f29072a.f29098g.a("fallthrough (empty-area) click event from mapController");
                this.f29073b.invoke(com.waze.map.b.w.f28372a);
                return ab.f48028a;
            case 1:
                cz czVar = (cz) obj;
                com.waze.shared_infra.i.e eVar2 = this.f29072a.f29098g;
                Objects.toString(czVar);
                eVar2.a("click event from mapController: ".concat(String.valueOf(czVar)));
                this.f29073b.invoke(com.waze.map.b.t.f28368a);
                return ab.f48028a;
            case 2:
                db dbVar = (db) obj;
                com.waze.shared_infra.i.e eVar3 = this.f29072a.f29098g;
                Objects.toString(dbVar);
                eVar3.a("touch event from mapController: ".concat(String.valueOf(dbVar)));
                if (h.g.b.x.n(dbVar, dg.f28188a)) {
                    ahVar = ad.f27992a;
                } else {
                    if (!h.g.b.x.n(dbVar, df.f28187a)) {
                        throw new h.i();
                    }
                    ahVar = ac.f27991a;
                }
                this.f29073b.invoke(ahVar);
                return ab.f48028a;
            case 3:
                ((Boolean) obj).booleanValue();
                this.f29072a.f29098g.a("map event! start drag");
                this.f29073b.invoke(com.waze.map.b.ab.f27990a);
                return ab.f48028a;
            case 4:
                this.f29072a.f29098g.a("map interaction event from mapController");
                this.f29073b.invoke(com.waze.map.b.x.f28373a);
                return ab.f48028a;
            case 5:
                da daVar = (da) obj;
                com.waze.shared_infra.i.e eVar4 = this.f29072a.f29098g;
                Objects.toString(daVar);
                eVar4.a("long click event from mapController: ".concat(String.valueOf(daVar)));
                this.f29073b.invoke(new y(daVar.a()));
                return ab.f48028a;
            case 6:
                cu cuVar = (cu) obj;
                com.waze.shared_infra.i.e eVar5 = this.f29072a.f29098g;
                Objects.toString(cuVar);
                eVar5.a("Ad click event from mapController: ".concat(String.valueOf(cuVar)));
                this.f29073b.invoke(new com.waze.map.b.r(cuVar.a()));
                return ab.f48028a;
            case 7:
                cw cwVar = (cw) obj;
                com.waze.shared_infra.i.e eVar6 = this.f29072a.f29098g;
                Objects.toString(cwVar);
                eVar6.a("External poi click event from mapController: ".concat(String.valueOf(cwVar)));
                this.f29073b.invoke(new com.waze.map.b.v(cwVar.a(), cwVar.b()));
                return ab.f48028a;
            case 8:
                cv cvVar = (cv) obj;
                com.waze.shared_infra.i.e eVar7 = this.f29072a.f29098g;
                Objects.toString(cvVar);
                eVar7.a("Alert click event from mapController: ".concat(String.valueOf(cvVar)));
                this.f29073b.invoke(new com.waze.map.b.s(cvVar.a(), cvVar.b()));
                return ab.f48028a;
            case 9:
                di diVar = (di) obj;
                com.waze.shared_infra.i.e eVar8 = this.f29072a.f29098g;
                Objects.toString(diVar);
                eVar8.a("Wazer click event from mapController: ".concat(String.valueOf(diVar)));
                this.f29073b.invoke(new af(diVar.a(), diVar.b()));
                return ab.f48028a;
            case 10:
                dd ddVar = (dd) obj;
                com.waze.shared_infra.i.e eVar9 = this.f29072a.f29098g;
                Objects.toString(ddVar);
                eVar9.a("POI click event from mapController: ".concat(String.valueOf(ddVar)));
                this.f29073b.invoke(new aa(ddVar.b(), ddVar.a()));
                return ab.f48028a;
            case 11:
                dc dcVar = (dc) obj;
                com.waze.shared_infra.i.e eVar10 = this.f29072a.f29098g;
                Objects.toString(dcVar);
                eVar10.a("Parking click event from mapController: ".concat(String.valueOf(dcVar)));
                this.f29073b.invoke(new z(dcVar.a(), dcVar.b()));
                return ab.f48028a;
            default:
                dh dhVar = (dh) obj;
                com.waze.shared_infra.i.e eVar11 = this.f29072a.f29098g;
                Objects.toString(dhVar);
                eVar11.a("User location click event from mapController: ".concat(String.valueOf(dhVar)));
                this.f29073b.invoke(ae.f27993a);
                return ab.f48028a;
        }
    }
}
