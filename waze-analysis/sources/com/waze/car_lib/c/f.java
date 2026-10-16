package com.waze.car_lib.c;

import com.waze.car_lib.i.b.r;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final Object f19227a;

    public f(com.waze.view.navbar.e eVar) {
        x.f(eVar, "trafficBarStatsSender");
        this.f19227a = eVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.waze.view.navbar.e, java.lang.Object] */
    public final void a(boolean z, long j2) {
        this.f19227a.b(z, j2);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.waze.view.navbar.e, java.lang.Object] */
    public final void b(int i2, List list) {
        x.f(list, "jams");
        this.f19227a.d(i2, list);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.waze.view.navbar.e, java.lang.Object] */
    public final void c(boolean z, int i2, List list) {
        x.f(list, "jams");
        this.f19227a.e(z, i2, list);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.waze.car_lib.i.b.r, java.lang.Object] */
    public final r d() {
        return this.f19227a;
    }

    public f(r rVar) {
        x.f(rVar, "mapPresenter");
        this.f19227a = rVar;
    }
}
