package com.waze.modules.c;

import com.waze.jni.protos.navigate.DriveTo;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class dh implements df {

    /* renamed from: a, reason: collision with root package name */
    private final cz f30063a;

    /* renamed from: b, reason: collision with root package name */
    private final al f30064b;

    public dh(cz czVar, al alVar) {
        h.g.b.x.f(czVar, "routingParamsDataSource");
        h.g.b.x.f(alVar, "overrideRoutingParamsDataSource");
        this.f30063a = czVar;
        this.f30064b = alVar;
    }

    private final db c(String str) {
        String str2 = str;
        if (str2 == null || h.n.o.G(str2)) {
            str = this.f30063a.a();
        }
        if (h.n.o.G(str)) {
            return db.f30043c;
        }
        db dbVar = db.f30041a;
        if (h.g.b.x.n(str, dbVar.a())) {
            return dbVar;
        }
        db dbVar2 = db.f30042b;
        return h.g.b.x.n(str, dbVar2.a()) ? dbVar2 : db.f30043c;
    }

    private final boolean d() {
        cz czVar = this.f30063a;
        return czVar.k() ? czVar.l() : czVar.i();
    }

    private final boolean e(DriveTo.DangerZoneType dangerZoneType) {
        return d() && this.f30063a.q() && dangerZoneType != DriveTo.DangerZoneType.NOT_DANGER_ZONE;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.waze.modules.c.df
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.waze.modules.c.aj r11, h.c.e r12) {
        /*
            Method dump skipped, instructions count: 494
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.modules.c.dh.a(com.waze.modules.c.aj, h.c.e):java.lang.Object");
    }

    @Override // com.waze.modules.c.df
    public final boolean b() {
        return this.f30063a.g();
    }
}
