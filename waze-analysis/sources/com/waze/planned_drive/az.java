package com.waze.planned_drive;

import com.waze.jni.protos.planned_drive.FetchPlannedDriveTimeResponse;
import com.waze.jni.protos.planned_drive.LoadPlannedDriveOptionsResponse;
import com.waze.jni.protos.planned_drive.PlannedDriveResponse;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class az implements h.g.a.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.waze.jni.a f33224a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f33225b;

    public /* synthetic */ az(com.waze.jni.a aVar, int i2) {
        this.f33225b = i2;
        this.f33224a = aVar;
    }

    @Override // h.g.a.l
    public final Object invoke(Object obj) {
        int i2 = this.f33225b;
        if (i2 == 0) {
            return PlannedDriveNativeManager.lambda$updatePlannedDrive$0(this.f33224a, (PlannedDriveResponse) obj);
        }
        if (i2 == 1) {
            return PlannedDriveNativeManager.lambda$fetchPlannedDriveTime$0(this.f33224a, (FetchPlannedDriveTimeResponse) obj);
        }
        if (i2 == 2) {
            return PlannedDriveNativeManager.lambda$deletePlannedDrive$0(this.f33224a, (PlannedDriveResponse) obj);
        }
        if (i2 != 3) {
            return PlannedDriveNativeManager.lambda$createPlannedDrive$0(this.f33224a, (PlannedDriveResponse) obj);
        }
        return PlannedDriveNativeManager.lambda$loadPlannedDriveOptions$0(this.f33224a, (LoadPlannedDriveOptionsResponse) obj);
    }
}
