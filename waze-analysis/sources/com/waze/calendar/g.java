package com.waze.calendar;

import h.g.b.ar;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class g implements org.a.d.a.a {
    public final CalendarNativeManager a() {
        org.a.d.k.b bVarC;
        h.g.b.m mVar;
        g gVar = this;
        if (gVar instanceof org.a.d.a.b) {
            bVarC = ((org.a.d.a.b) gVar).l();
            int i2 = ar.f48106a;
            mVar = new h.g.b.m(CalendarNativeManager.class);
        } else {
            bVarC = gVar.getKoin().a().c();
            int i3 = ar.f48106a;
            mVar = new h.g.b.m(CalendarNativeManager.class);
        }
        return (CalendarNativeManager) bVarC.a(mVar, null, null);
    }

    @Override // org.a.d.a.a
    public final /* synthetic */ org.a.d.a getKoin() {
        return org.a.b.b.d.e();
    }
}
