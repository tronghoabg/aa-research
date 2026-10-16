package com.waze.reports_v2;

import com.waze.reports_v2.c.ao;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final d[] f34598a;

    public e(com.waze.bl.c.c.c cVar, ao aoVar) {
        x.f(cVar, "reportAgentConfig");
        x.f(aoVar, "bardinioConfig");
        this.f34598a = new d[]{new c(cVar), new a(aoVar)};
    }

    public final d a() {
        d dVar;
        int i2 = 0;
        while (true) {
            if (i2 >= 2) {
                dVar = null;
                break;
            }
            dVar = this.f34598a[i2];
            if (dVar.a().h()) {
                break;
            }
            i2++;
        }
        return dVar == null ? b.f34001a : dVar;
    }

    public final d b() {
        d dVar;
        int i2 = 0;
        while (true) {
            if (i2 >= 2) {
                dVar = null;
                break;
            }
            dVar = this.f34598a[i2];
            if (dVar.a().l()) {
                break;
            }
            i2++;
        }
        return dVar == null ? b.f34001a : dVar;
    }

    public final d c() {
        d dVar;
        int i2 = 0;
        while (true) {
            if (i2 >= 2) {
                dVar = null;
                break;
            }
            dVar = this.f34598a[i2];
            if (dVar.a().m()) {
                break;
            }
            i2++;
        }
        return dVar == null ? b.f34001a : dVar;
    }
}
