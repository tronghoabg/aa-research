package com.waze.navigate;

import com.waze.planned_drive.PlannedDriveNativeManager;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class k implements j {

    /* renamed from: b, reason: collision with root package name */
    private final DriveToNativeManager f31470b;

    /* renamed from: c, reason: collision with root package name */
    private final kotlinx.coroutines.b.bn f31471c;

    public k(DriveToNativeManager driveToNativeManager) {
        h.g.b.x.f(driveToNativeManager, "driveToNativeManager");
        this.f31470b = driveToNativeManager;
        this.f31471c = kotlinx.coroutines.b.ck.b(h.a.i.h());
    }

    static final h.ab c(k kVar, AddressItem[] addressItemArr) {
        kotlinx.coroutines.b.bn bnVar;
        Object objD;
        List listR;
        do {
            bnVar = kVar.f31471c;
            objD = bnVar.d();
            listR = (List) objD;
            if (addressItemArr != null) {
                listR = h.a.c.R(addressItemArr);
            }
        } while (!bnVar.f(objD, listR));
        return h.ab.f48028a;
    }

    @Override // com.waze.navigate.j
    public final void a() {
        PlannedDriveNativeManager.getInstance().getUpcomingDrivesCount(new g(this, 3));
    }
}
