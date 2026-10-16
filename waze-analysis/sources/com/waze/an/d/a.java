package com.waze.an.d;

import com.waze.an.a.u;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class a implements b {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.alerters.a.i f14832a;

    public a(com.waze.alerters.a.i iVar) {
        x.f(iVar, "alertsService");
        this.f14832a = iVar;
    }

    private static final com.waze.k c(u uVar) {
        String strName = uVar.b().name();
        String strC = uVar.c();
        return new com.waze.k(strName, strC, strName + ":" + strC);
    }

    @Override // com.waze.an.d.b
    public final void a(u uVar) {
        x.f(uVar, "notificationInsightId");
        this.f14832a.b(c(uVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e5  */
    @Override // com.waze.an.d.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(com.waze.an.a.u r43, com.waze.an.a.k r44, h.g.a.a r45, h.g.a.a r46, h.g.a.a r47) {
        /*
            Method dump skipped, instructions count: 540
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.an.d.a.b(com.waze.an.a.u, com.waze.an.a.k, h.g.a.a, h.g.a.a, h.g.a.a):boolean");
    }
}
