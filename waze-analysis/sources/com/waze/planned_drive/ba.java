package com.waze.planned_drive;

import com.google.v.du;
import com.waze.hw;
import com.waze.jni.protos.planned_drive.CreatePlannedDriveRequest;
import com.waze.jni.protos.planned_drive.DeletePlannedDriveRequest;
import com.waze.jni.protos.planned_drive.FetchPlannedDriveTimeRequest;
import com.waze.jni.protos.planned_drive.LoadPlannedDriveOptionsRequest;
import com.waze.jni.protos.planned_drive.UpdatePlannedDriveRequest;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class ba implements hw {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bf f33227a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f33228b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ du f33229c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f33230d;

    public /* synthetic */ ba(bf bfVar, du duVar, int i2, int i3) {
        this.f33230d = i3;
        this.f33227a = bfVar;
        this.f33229c = duVar;
        this.f33228b = i2;
    }

    @Override // com.waze.hw
    public final Object a() {
        int i2 = this.f33230d;
        if (i2 == 0) {
            bf.fetchPlannedDriveTime$lambda$0(this.f33227a, (FetchPlannedDriveTimeRequest) this.f33229c, this.f33228b);
            return null;
        }
        if (i2 == 1) {
            bf.deletePlannedDrive$lambda$0(this.f33227a, (DeletePlannedDriveRequest) this.f33229c, this.f33228b);
            return null;
        }
        if (i2 == 2) {
            bf.updatePlannedDrive$lambda$0(this.f33227a, (UpdatePlannedDriveRequest) this.f33229c, this.f33228b);
            return null;
        }
        int i3 = this.f33228b;
        if (i2 != 3) {
            bf.createPlannedDrive$lambda$0(this.f33227a, (CreatePlannedDriveRequest) this.f33229c, i3);
            return null;
        }
        bf.loadPlannedDriveOptions$lambda$0(this.f33227a, (LoadPlannedDriveOptionsRequest) this.f33229c, i3);
        return null;
    }
}
