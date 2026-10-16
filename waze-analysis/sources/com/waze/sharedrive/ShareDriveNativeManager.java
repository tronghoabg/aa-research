package com.waze.sharedrive;

import com.waze.sharedrive.d.aq;
import h.g.b.ar;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ShareDriveNativeManager extends y {
    public static final int $stable = 0;
    public static final ShareDriveNativeManager INSTANCE = new ShareDriveNativeManager();

    private ShareDriveNativeManager() {
    }

    public final native void initNativeLayerNTV();

    @Override // com.waze.sharedrive.y
    public boolean isShareDriveV2Enabled() {
        org.a.d.k.b bVarC = com.waze.web.r.k().a().c();
        int i2 = ar.f48106a;
        com.waze.sharedrive.b.a aVar = (com.waze.sharedrive.b.a) bVarC.b(new h.g.b.m(com.waze.sharedrive.b.a.class), null, null);
        if (aVar == null) {
            return false;
        }
        return aVar.b();
    }

    @Override // com.waze.sharedrive.y
    public boolean isSharingLocation() {
        aq aqVarA;
        org.a.d.k.b bVarC = com.waze.web.r.k().a().c();
        int i2 = ar.f48106a;
        com.waze.sharedrive.d.a aVar = (com.waze.sharedrive.d.a) bVarC.b(new h.g.b.m(com.waze.sharedrive.d.a.class), null, null);
        if (aVar == null || (aqVarA = aVar.a()) == null) {
            return false;
        }
        return aqVarA.M();
    }

    public final native void updateMapSharingDisplayNTV(boolean z);
}
