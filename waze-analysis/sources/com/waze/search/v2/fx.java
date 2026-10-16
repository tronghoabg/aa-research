package com.waze.search.v2;

import com.waze.jni.protos.navigate.DriveTo;
import com.waze.navigate.AddressItem;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class fx implements ft {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.search.b.d f36565a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.search.bd f36566b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.navigate.fl f36567c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.shared_infra.o.a f36568d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.bf f36569e;

    /* renamed from: f, reason: collision with root package name */
    private final com.waze.ev.n f36570f;

    /* renamed from: g, reason: collision with root package name */
    private final com.waze.av.a.b f36571g;

    /* renamed from: h, reason: collision with root package name */
    private final com.waze.location.o f36572h;

    /* renamed from: i, reason: collision with root package name */
    private final com.waze.shared_infra.q.r f36573i;

    public fx(com.waze.search.b.d dVar, com.waze.search.bd bdVar, com.waze.navigate.fl flVar, com.waze.shared_infra.o.a aVar, com.waze.bf bfVar, com.waze.ev.n nVar, p pVar, com.waze.av.a.b bVar, com.waze.location.o oVar, com.waze.shared_infra.q.r rVar) {
        h.g.b.x.f(dVar, "venueProductsSource");
        h.g.b.x.f(bdVar, "searchOperation");
        h.g.b.x.f(flVar, "parkingManager");
        h.g.b.x.f(aVar, "stringProvider");
        h.g.b.x.f(bfVar, "dangerZoneProvider");
        h.g.b.x.f(nVar, "evRepository");
        h.g.b.x.f(pVar, "config");
        h.g.b.x.f(bVar, "genericPlaceRepository");
        h.g.b.x.f(oVar, "locationSensorListener");
        h.g.b.x.f(rVar, "timeUtil");
        this.f36565a = dVar;
        this.f36566b = bdVar;
        this.f36567c = flVar;
        this.f36568d = aVar;
        this.f36569e = bfVar;
        this.f36570f = nVar;
        this.f36571g = bVar;
        this.f36572h = oVar;
        this.f36573i = rVar;
    }

    @Override // com.waze.search.v2.ft
    public final com.waze.destination_cell.c.b a(String str) {
        h.g.b.x.f(str, "venueId");
        com.waze.av.b.n nVarA = this.f36571g.a(new com.waze.car_lib.r.fl(str, 17));
        if (nVarA == null) {
            return null;
        }
        h.g.b.x.f(nVarA, "<this>");
        if (!(nVarA instanceof com.waze.av.b.k)) {
            if (nVarA instanceof com.waze.av.b.j) {
                return com.waze.destination_cell.c.b.f23527c;
            }
            if (nVarA instanceof com.waze.av.b.l) {
                return com.waze.destination_cell.c.b.f23525a;
            }
            if (nVarA instanceof com.waze.av.b.m) {
                return com.waze.destination_cell.c.b.f23527c;
            }
            throw new h.i();
        }
        com.waze.av.b.i iVarF = ((com.waze.av.b.k) nVarA).f();
        com.waze.av.b.i iVar = com.waze.av.b.i.f15955a;
        com.waze.destination_cell.c.b bVar = com.waze.destination_cell.c.b.f23525a;
        com.waze.destination_cell.c.a aVar = com.waze.destination_cell.c.a.f23513a;
        com.waze.destination_cell.c.c cVar = com.waze.destination_cell.c.c.f23531a;
        int iOrdinal = iVarF.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return com.waze.destination_cell.c.b.f23528d;
            }
            if (iOrdinal == 2) {
                return com.waze.destination_cell.c.b.f23529e;
            }
            if (iOrdinal != 3) {
                throw new h.i();
            }
        }
        return com.waze.destination_cell.c.b.f23526b;
    }

    @Override // com.waze.search.v2.ft
    public final com.waze.navigate.location_preview.ay b(com.waze.av.d.k kVar, com.waze.av.d.k kVar2, com.waze.navigate.location_preview.bo boVar, int i2, String str, boolean z, com.waze.ads.a.f fVar, String str2, boolean z2) {
        String str3;
        String str4;
        String strA;
        String strB;
        h.g.b.x.f(kVar, "venue");
        boolean z3 = false;
        if (kVar2 == null) {
            List listD = kVar.D();
            if ((listD instanceof Collection) && listD.isEmpty()) {
                z3 = true;
            } else {
                Iterator it = listD.iterator();
                while (it.hasNext()) {
                    if (this.f36567c.isVenueCategoryWithImplicitParking((String) it.next())) {
                        break;
                    }
                }
                z3 = true;
            }
        }
        com.waze.ev.n nVar = this.f36570f;
        com.waze.location.o oVar = this.f36572h;
        AddressItem addressItemJ = gb.j(kVar, i2, str, z, 1);
        com.waze.shared_infra.h.c cVar = new com.waze.shared_infra.h.c(kVar.h().c(), kVar.h().d());
        String strO = kVar.o();
        String strW = kVar.w();
        String str5 = strW == null ? "" : strW;
        String strC = kVar.C();
        String str6 = strC == null ? "" : strC;
        boolean zJ = kVar.J();
        boolean zN = kVar.N();
        String strA2 = kVar.A();
        if (str2 == null) {
            String strB2 = kVar.B();
            str3 = strB2 == null ? "" : strB2;
        } else {
            str3 = str2;
        }
        com.waze.av.a.a aVarA = kVar.a();
        String strU = kVar.u();
        String strG = df.g(kVar, this.f36568d, new com.waze.bi.a(oVar, 20));
        String str7 = strG == null ? "" : strG;
        com.waze.navigate.location_preview.c cVarD = gb.d(kVar, nVar);
        com.waze.av.d.q qVarD = kVar.d();
        String strZ = kVar.z();
        DriveTo.DangerZoneType dangerZoneType = DriveTo.DangerZoneType.NOT_DANGER_ZONE;
        List<com.waze.av.d.o> listG = kVar.G();
        ArrayList arrayList = new ArrayList(h.a.i.q(listG, 10));
        for (com.waze.av.d.o oVar2 : listG) {
            String strC2 = oVar2.c();
            String strB3 = oVar2.b();
            String str8 = strB3 == null ? "" : strB3;
            com.waze.av.d.u uVarA = oVar2.a();
            String str9 = (uVarA == null || (strB = uVarA.b()) == null) ? "" : strB;
            com.waze.av.d.u uVarA2 = oVar2.a();
            arrayList.add(new com.waze.ui.m.x(strC2, str8, str9, (uVarA2 == null || (strA = uVarA2.a()) == null) ? "" : strA, oVar2.d()));
        }
        ArrayList arrayList2 = arrayList;
        String strV = kVar.v();
        if (strV != null) {
            String str10 = strV;
            if (str10.length() == 0) {
                str10 = null;
            }
            str4 = str10;
        } else {
            str4 = null;
        }
        com.waze.realtime_report_feedback.c cVar2 = kVar.I().contains("PARKING_FOR_CUSTOMERS") ? com.waze.navigate.location_preview.bs.f31687a : z3 ? com.waze.navigate.location_preview.bq.f31685a : com.waze.navigate.location_preview.bt.f31688a;
        List listI = kVar.I();
        String strS = kVar.s();
        com.waze.av.d.u uVarF = kVar.f();
        com.waze.navigate.location_preview.a aVarA2 = uVarF != null ? gb.a(uVarF) : null;
        com.waze.av.d.u uVarG = kVar.g();
        return new com.waze.navigate.location_preview.ay(addressItemJ, cVar, i2, 3, strO, kVar.D(), z, str5, str6, zJ, zN, (String) null, strA2, false, str3, aVarA, strU, str7, boVar, cVarD, qVarD, (com.waze.navigate.location_preview.f) null, dangerZoneType, (List) arrayList2, str4, cVar2, listI, strS, aVarA2, uVarG != null ? gb.a(uVarG) : null, false, kVar.i(), kVar.j(), kVar.k(), kVar.x(), kVar.c(), strZ, kVar.L(), kVar.b(), fVar != null ? com.waze.navigate.et.i(fVar) : null, z2, (com.waze.modules.navigation.ah) null, 136839168, 16396);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.waze.search.v2.ft
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(com.waze.navigate.location_preview.ay r7, h.c.e r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.waze.search.v2.fu
            if (r0 == 0) goto L13
            r0 = r8
            com.waze.search.v2.fu r0 = (com.waze.search.v2.fu) r0
            int r1 = r0.f36557c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f36557c = r1
            goto L18
        L13:
            com.waze.search.v2.fu r0 = new com.waze.search.v2.fu
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f36555a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f36557c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            e.b.c.b(r8)
            goto L52
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            e.b.c.b(r8)
            com.waze.shared_infra.h.c r7 = r7.o()
            com.waze.bf r6 = r6.f36569e
            com.waze.config.c r8 = com.waze.config.ConfigValues.CONFIG_VALUE_DANGER_ZONE_TILE_DOWNLOAD_TIMEOUT_MS
            java.lang.Long r8 = r8.b()
            java.lang.String r2 = "getValue(...)"
            h.g.b.x.e(r8, r2)
            java.lang.Number r8 = (java.lang.Number) r8
            long r4 = r8.longValue()
            r0.f36557c = r3
            java.lang.Object r8 = com.waze.navigate.ax.b(r7, r6, r4, r0)
            if (r8 != r1) goto L52
            return r1
        L52:
            r6 = r8
            com.waze.jni.protos.navigate.DriveTo$DangerZoneType r6 = (com.waze.jni.protos.navigate.DriveTo.DangerZoneType) r6
            com.waze.shared_infra.i.e r7 = com.waze.search.v2.bt.a()
            java.util.Objects.toString(r6)
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r0 = "getDangerZone returning "
            java.lang.String r6 = r0.concat(r6)
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            r7.a(r6)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.search.v2.fx.c(com.waze.navigate.location_preview.ay, h.c.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.waze.search.v2.ft
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(com.waze.av.d.k r5, h.c.e r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.waze.search.v2.fv
            if (r0 == 0) goto L13
            r0 = r6
            com.waze.search.v2.fv r0 = (com.waze.search.v2.fv) r0
            int r1 = r0.f36560c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f36560c = r1
            goto L18
        L13:
            com.waze.search.v2.fv r0 = new com.waze.search.v2.fv
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f36558a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f36560c
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            com.waze.av.d.k r5 = r0.f36561d
            r4 = r5
            com.waze.av.d.k r4 = (com.waze.av.d.k) r4
            e.b.c.b(r6)
            goto L48
        L2c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L34:
            e.b.c.b(r6)
            com.waze.search.bd r4 = r4.f36566b
            java.util.List r6 = h.a.i.d(r5)
            r0.f36561d = r5
            r0.f36560c = r3
            java.lang.Object r6 = r4.b(r6, r0)
            if (r6 != r1) goto L48
            return r1
        L48:
            java.util.Map r6 = (java.util.Map) r6
            java.lang.String r4 = r5.A()
            java.lang.Object r4 = r6.get(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.search.v2.fx.d(com.waze.av.d.k, h.c.e):java.lang.Object");
    }

    @Override // com.waze.search.v2.ft
    public final Object e(com.waze.av.d.k kVar, h.c.e eVar) {
        return com.waze.av.d.t.c(kVar, this.f36565a, p.a(), this.f36573i, this.f36568d, true, eVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // com.waze.search.v2.ft
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(com.waze.navigate.location_preview.ay r50, h.c.e r51) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.search.v2.fx.f(com.waze.navigate.location_preview.ay, h.c.e):java.lang.Object");
    }
}
