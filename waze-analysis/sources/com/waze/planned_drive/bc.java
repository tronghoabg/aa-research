package com.waze.planned_drive;

import com.google.v.du;
import com.waze.jni.protos.planned_drive.FetchPlannedDriveTimeResponse;
import com.waze.jni.protos.planned_drive.LoadPlannedDriveOptionsResponse;
import com.waze.jni.protos.planned_drive.PlannedDriveResponse;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class bc implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bf f33233a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f33234b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ du f33235c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f33236d;

    public /* synthetic */ bc(bf bfVar, du duVar, int i2, int i3) {
        this.f33236d = i3;
        this.f33233a = bfVar;
        this.f33235c = duVar;
        this.f33234b = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f33236d;
        if (i2 == 0) {
            bf.onPlannedDriveOptionsLoadedJNI$lambda$0(this.f33233a, (LoadPlannedDriveOptionsResponse) this.f33235c, this.f33234b);
            return;
        }
        if (i2 == 1) {
            bf.onPlannedDriveTimeFetchedJNI$lambda$0(this.f33233a, (FetchPlannedDriveTimeResponse) this.f33235c, this.f33234b);
        } else {
            if (i2 == 2) {
                bf.onPlannedDriveCreatedJNI$lambda$0(this.f33233a, (PlannedDriveResponse) this.f33235c, this.f33234b);
                return;
            }
            int i3 = this.f33234b;
            if (i2 != 3) {
                bf.onPlannedDriveUpdatedJNI$lambda$0(this.f33233a, (PlannedDriveResponse) this.f33235c, i3);
            } else {
                bf.onPlannedDriveDeletedJNI$lambda$0(this.f33233a, (PlannedDriveResponse) this.f33235c, i3);
            }
        }
    }
}
