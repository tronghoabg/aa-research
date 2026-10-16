package com.waze.closure.domain;

import com.waze.reports.WazeReportNativeManager;
import com.waze.reports.ek;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    private final WazeReportNativeManager f22497a;

    public b(WazeReportNativeManager wazeReportNativeManager) {
        x.f(wazeReportNativeManager, "reportNativeManager");
        this.f22497a = wazeReportNativeManager;
    }

    @Override // com.waze.closure.domain.a
    public final void a(com.waze.shared_infra.h.c cVar, int i2, int i3) {
        x.f(cVar, "fromCoordinate");
        ek.reportClosure$default(this.f22497a, cVar.c(), cVar.d(), i2, i3, null, 16, null);
    }
}
