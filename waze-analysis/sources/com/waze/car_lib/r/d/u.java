package com.waze.car_lib.r.d;

import com.waze.map.b.de;
import h.ab;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class u implements kotlinx.coroutines.b.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ x f21327a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f21328b;

    u(x xVar, int i2) {
        this.f21328b = i2;
        this.f21327a = xVar;
    }

    @Override // kotlinx.coroutines.b.l
    public final /* synthetic */ Object emit(Object obj, h.c.e eVar) {
        int i2 = this.f21328b;
        if (i2 == 0) {
            x.t(this.f21327a, ((de) obj).a());
            return ab.f48028a;
        }
        if (i2 == 1) {
            Object objO = x.O(this.f21327a, (com.waze.t.c.n) obj, eVar);
            return objO == h.c.a.a.f48038a ? objO : ab.f48028a;
        }
        this.f21327a.S();
        return ab.f48028a;
    }
}
