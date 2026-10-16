package com.waze.car_lib.c;

import com.waze.ix;
import h.g.b.x;
import i.b.a.o;
import i.b.a.p;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class a implements org.a.d.a.a {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.sharedui.b.d f19215a;

    public a(com.waze.sharedui.b.d dVar) {
        x.f(dVar, "auditReporter");
        this.f19215a = dVar;
    }

    public static final void c(boolean z, List list) {
        x.f(list, "strings");
        ix.i(z, list);
    }

    public final void b(boolean z, List list) {
        x.f(list, "strings");
        this.f19215a.reportAuditEvent(new com.waze.sharedui.b.a(p.WAZE_TRIP_SUGGESTIONS, i.b.a.m.POP_UP, z ? o.ENABLED : o.DISABLED, "", list));
    }

    @Override // org.a.d.a.a
    public final /* synthetic */ org.a.d.a getKoin() {
        return org.a.b.b.d.e();
    }
}
