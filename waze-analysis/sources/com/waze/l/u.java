package com.waze.l;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class u {
    public static /* synthetic */ v a(h.g.a.a aVar, h.g.a.a aVar2, h.g.a.l lVar, h.g.a.a aVar3, h.g.a.l lVar2, h.g.a.a aVar4, h.g.a.p pVar) {
        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("WazeBluetoothPermissionsStateHolder");
        x.e(eVarD, "create(...)");
        x.f(aVar, "isOptedOut");
        x.f(aVar2, "shouldTurnOnBluetooth");
        x.f(lVar, "onSetOptedOut");
        x.f(aVar3, "onPermissionsRequested");
        x.f(lVar2, "onPermissionsResponded");
        x.f(aVar4, "onPopupShown");
        x.f(pVar, "onPopupClicked");
        x.f(eVarD, "logger");
        return new v(aVar, aVar2, lVar, aVar3, lVar2, aVar4, pVar, eVarD);
    }
}
