package com.waze.map;

import android.os.Handler;
import android.os.Looper;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class bw implements br {

    /* renamed from: a, reason: collision with root package name */
    private final v f28449a;

    public bw(cb cbVar, v vVar) {
        h.g.b.x.f(cbVar, "nativeManagerFactory");
        h.g.b.x.f(vVar, "renderThread");
        this.f28449a = vVar;
    }

    @Override // com.waze.map.br
    public final bz a(Cdo cdo) {
        h.g.b.x.f(cdo, "mapState");
        com.waze.ae.e eVarK = cdo.k();
        if (eVarK instanceof ab) {
            return null;
        }
        if (!(eVarK instanceof ac)) {
            throw new h.i();
        }
        kotlinx.coroutines.ab abVarB = this.f28449a.b();
        Handler handler = new Handler(Looper.getMainLooper());
        ac acVar = (ac) eVarK;
        String strI = acVar.i();
        h.g.b.x.f(strI, "mapId");
        MapPositionTrackerNativeManager mapPositionTrackerNativeManager = new MapPositionTrackerNativeManager(strI);
        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("MapPositionTracker(" + acVar.i() + ")");
        h.g.b.x.e(eVarD, "create(...)");
        return new bz(abVarB, mapPositionTrackerNativeManager, handler, eVarD);
    }
}
