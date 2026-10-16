package com.waze.planned_drive;

import com.google.v.eu;
import com.waze.NativeManager;
import com.waze.hw;
import com.waze.jni.protos.planned_drive.CreatePlannedDriveRequest;
import com.waze.jni.protos.planned_drive.DeletePlannedDriveRequest;
import com.waze.jni.protos.planned_drive.FetchPlannedDriveTimeRequest;
import com.waze.jni.protos.planned_drive.FetchPlannedDriveTimeResponse;
import com.waze.jni.protos.planned_drive.LoadPlannedDriveOptionsRequest;
import com.waze.jni.protos.planned_drive.LoadPlannedDriveOptionsResponse;
import com.waze.jni.protos.planned_drive.PlannedDriveResponse;
import com.waze.jni.protos.planned_drive.UpdatePlannedDriveRequest;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public class bf {
    public static final int $stable = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void createPlannedDrive$default(bf bfVar, CreatePlannedDriveRequest createPlannedDriveRequest, int i2, h.g.a.l lVar, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createPlannedDrive");
        }
        if ((i3 & 4) != 0) {
            lVar = null;
        }
        bfVar.createPlannedDrive(createPlannedDriveRequest, i2, lVar);
    }

    static final h.ab createPlannedDrive$lambda$0(bf bfVar, CreatePlannedDriveRequest createPlannedDriveRequest, int i2) {
        h.g.b.x.d(bfVar, "null cannot be cast to non-null type com.waze.planned_drive.PlannedDriveNativeManager");
        ((PlannedDriveNativeManager) bfVar).createPlannedDriveNTV(createPlannedDriveRequest != null ? createPlannedDriveRequest.toByteArray() : null, i2);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void deletePlannedDrive$default(bf bfVar, DeletePlannedDriveRequest deletePlannedDriveRequest, int i2, h.g.a.l lVar, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: deletePlannedDrive");
        }
        if ((i3 & 4) != 0) {
            lVar = null;
        }
        bfVar.deletePlannedDrive(deletePlannedDriveRequest, i2, lVar);
    }

    static final h.ab deletePlannedDrive$lambda$0(bf bfVar, DeletePlannedDriveRequest deletePlannedDriveRequest, int i2) {
        h.g.b.x.d(bfVar, "null cannot be cast to non-null type com.waze.planned_drive.PlannedDriveNativeManager");
        ((PlannedDriveNativeManager) bfVar).deletePlannedDriveNTV(deletePlannedDriveRequest != null ? deletePlannedDriveRequest.toByteArray() : null, i2);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void fetchPlannedDriveTime$default(bf bfVar, FetchPlannedDriveTimeRequest fetchPlannedDriveTimeRequest, int i2, h.g.a.l lVar, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchPlannedDriveTime");
        }
        if ((i3 & 4) != 0) {
            lVar = null;
        }
        bfVar.fetchPlannedDriveTime(fetchPlannedDriveTimeRequest, i2, lVar);
    }

    static final h.ab fetchPlannedDriveTime$lambda$0(bf bfVar, FetchPlannedDriveTimeRequest fetchPlannedDriveTimeRequest, int i2) {
        h.g.b.x.d(bfVar, "null cannot be cast to non-null type com.waze.planned_drive.PlannedDriveNativeManager");
        ((PlannedDriveNativeManager) bfVar).fetchPlannedDriveTimeNTV(fetchPlannedDriveTimeRequest != null ? fetchPlannedDriveTimeRequest.toByteArray() : null, i2);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void getUpcomingDrivesCount$default(bf bfVar, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getUpcomingDrivesCount");
        }
        if (1 == (i2 & 1)) {
            lVar = null;
        }
        bfVar.getUpcomingDrivesCount(lVar);
    }

    static final Integer getUpcomingDrivesCount$lambda$0(bf bfVar) {
        h.g.b.x.d(bfVar, "null cannot be cast to non-null type com.waze.planned_drive.PlannedDriveNativeManager");
        return Integer.valueOf(((PlannedDriveNativeManager) bfVar).getUpcomingDrivesCountNTV());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void loadPlannedDriveOptions$default(bf bfVar, LoadPlannedDriveOptionsRequest loadPlannedDriveOptionsRequest, int i2, h.g.a.l lVar, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadPlannedDriveOptions");
        }
        if ((i3 & 4) != 0) {
            lVar = null;
        }
        bfVar.loadPlannedDriveOptions(loadPlannedDriveOptionsRequest, i2, lVar);
    }

    static final h.ab loadPlannedDriveOptions$lambda$0(bf bfVar, LoadPlannedDriveOptionsRequest loadPlannedDriveOptionsRequest, int i2) {
        h.g.b.x.d(bfVar, "null cannot be cast to non-null type com.waze.planned_drive.PlannedDriveNativeManager");
        ((PlannedDriveNativeManager) bfVar).loadPlannedDriveOptionsNTV(loadPlannedDriveOptionsRequest != null ? loadPlannedDriveOptionsRequest.toByteArray() : null, i2);
        return null;
    }

    static final void onPlannedDriveCreatedJNI$lambda$0(bf bfVar, PlannedDriveResponse plannedDriveResponse, int i2) {
        h.g.b.x.d(bfVar, "null cannot be cast to non-null type com.waze.planned_drive.PlannedDriveNativeManager");
        ((PlannedDriveNativeManager) bfVar).onPlannedDriveCreated(plannedDriveResponse, i2);
    }

    static final void onPlannedDriveDeletedJNI$lambda$0(bf bfVar, PlannedDriveResponse plannedDriveResponse, int i2) {
        h.g.b.x.d(bfVar, "null cannot be cast to non-null type com.waze.planned_drive.PlannedDriveNativeManager");
        ((PlannedDriveNativeManager) bfVar).onPlannedDriveDeleted(plannedDriveResponse, i2);
    }

    static final void onPlannedDriveOptionsLoadedJNI$lambda$0(bf bfVar, LoadPlannedDriveOptionsResponse loadPlannedDriveOptionsResponse, int i2) {
        h.g.b.x.d(bfVar, "null cannot be cast to non-null type com.waze.planned_drive.PlannedDriveNativeManager");
        ((PlannedDriveNativeManager) bfVar).onPlannedDriveOptionsLoaded(loadPlannedDriveOptionsResponse, i2);
    }

    static final void onPlannedDriveTimeFetchedJNI$lambda$0(bf bfVar, FetchPlannedDriveTimeResponse fetchPlannedDriveTimeResponse, int i2) {
        h.g.b.x.d(bfVar, "null cannot be cast to non-null type com.waze.planned_drive.PlannedDriveNativeManager");
        ((PlannedDriveNativeManager) bfVar).onPlannedDriveTimeFetched(fetchPlannedDriveTimeResponse, i2);
    }

    static final void onPlannedDriveUpdatedJNI$lambda$0(bf bfVar, PlannedDriveResponse plannedDriveResponse, int i2) {
        h.g.b.x.d(bfVar, "null cannot be cast to non-null type com.waze.planned_drive.PlannedDriveNativeManager");
        ((PlannedDriveNativeManager) bfVar).onPlannedDriveUpdated(plannedDriveResponse, i2);
    }

    static final void openPlannedDrivePageJNI$lambda$0(bf bfVar, boolean z) {
        h.g.b.x.d(bfVar, "null cannot be cast to non-null type com.waze.planned_drive.PlannedDriveNativeManager");
        ((PlannedDriveNativeManager) bfVar).openPlannedDrivePage(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void updatePlannedDrive$default(bf bfVar, UpdatePlannedDriveRequest updatePlannedDriveRequest, int i2, h.g.a.l lVar, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updatePlannedDrive");
        }
        if ((i3 & 4) != 0) {
            lVar = null;
        }
        bfVar.updatePlannedDrive(updatePlannedDriveRequest, i2, lVar);
    }

    static final h.ab updatePlannedDrive$lambda$0(bf bfVar, UpdatePlannedDriveRequest updatePlannedDriveRequest, int i2) {
        h.g.b.x.d(bfVar, "null cannot be cast to non-null type com.waze.planned_drive.PlannedDriveNativeManager");
        ((PlannedDriveNativeManager) bfVar).updatePlannedDriveNTV(updatePlannedDriveRequest != null ? updatePlannedDriveRequest.toByteArray() : null, i2);
        return null;
    }

    public void createPlannedDrive(CreatePlannedDriveRequest createPlannedDriveRequest, int i2, h.g.a.l<? super h.ab, h.ab> lVar) {
        NativeManager.runNativeTask(new ba(this, createPlannedDriveRequest, i2, 4), lVar != null ? new bb(lVar, 6) : null);
    }

    public void deletePlannedDrive(DeletePlannedDriveRequest deletePlannedDriveRequest, int i2, h.g.a.l<? super h.ab, h.ab> lVar) {
        NativeManager.runNativeTask(new ba(this, deletePlannedDriveRequest, i2, 1), lVar != null ? new bb(lVar, 3) : null);
    }

    public void fetchPlannedDriveTime(FetchPlannedDriveTimeRequest fetchPlannedDriveTimeRequest, int i2, h.g.a.l<? super h.ab, h.ab> lVar) {
        int i3 = 0;
        NativeManager.runNativeTask(new ba(this, fetchPlannedDriveTimeRequest, i2, i3), lVar != null ? new bb(lVar, i3) : null);
    }

    public void getUpcomingDrivesCount(h.g.a.l<? super Integer, h.ab> lVar) {
        NativeManager.runNativeTask(new hw() { // from class: com.waze.planned_drive.bd
            @Override // com.waze.hw
            public final Object a() {
                return bf.getUpcomingDrivesCount$lambda$0(this.f33237a);
            }
        }, lVar != null ? new bb(lVar, 5) : null);
    }

    public void loadPlannedDriveOptions(LoadPlannedDriveOptionsRequest loadPlannedDriveOptionsRequest, int i2, h.g.a.l<? super h.ab, h.ab> lVar) {
        NativeManager.runNativeTask(new ba(this, loadPlannedDriveOptionsRequest, i2, 3), lVar != null ? new bb(lVar, 4) : null);
    }

    protected final void onPlannedDriveCreatedJNI(byte[] bArr, int i2) {
        h.g.b.x.f(bArr, "response");
        try {
            NativeManager.runMainThreadTask(new bc(this, (PlannedDriveResponse) PlannedDriveResponse.parser().c(bArr), i2, 2));
        } catch (eu unused) {
        }
    }

    protected final void onPlannedDriveDeletedJNI(byte[] bArr, int i2) {
        h.g.b.x.f(bArr, "response");
        try {
            NativeManager.runMainThreadTask(new bc(this, (PlannedDriveResponse) PlannedDriveResponse.parser().c(bArr), i2, 3));
        } catch (eu unused) {
        }
    }

    protected final void onPlannedDriveOptionsLoadedJNI(byte[] bArr, int i2) {
        h.g.b.x.f(bArr, "response");
        try {
            NativeManager.runMainThreadTask(new bc(this, (LoadPlannedDriveOptionsResponse) LoadPlannedDriveOptionsResponse.parser().c(bArr), i2, 0));
        } catch (eu unused) {
        }
    }

    protected final void onPlannedDriveTimeFetchedJNI(byte[] bArr, int i2) {
        h.g.b.x.f(bArr, "response");
        try {
            NativeManager.runMainThreadTask(new bc(this, (FetchPlannedDriveTimeResponse) FetchPlannedDriveTimeResponse.parser().c(bArr), i2, 1));
        } catch (eu unused) {
        }
    }

    protected final void onPlannedDriveUpdatedJNI(byte[] bArr, int i2) {
        h.g.b.x.f(bArr, "response");
        try {
            NativeManager.runMainThreadTask(new bc(this, (PlannedDriveResponse) PlannedDriveResponse.parser().c(bArr), i2, 4));
        } catch (eu unused) {
        }
    }

    protected final void openPlannedDrivePageJNI(final boolean z) {
        NativeManager.runMainThreadTask(new Runnable() { // from class: com.waze.planned_drive.be
            @Override // java.lang.Runnable
            public final void run() {
                bf.openPlannedDrivePageJNI$lambda$0(this.f33238a, z);
            }
        });
    }

    public void updatePlannedDrive(UpdatePlannedDriveRequest updatePlannedDriveRequest, int i2, h.g.a.l<? super h.ab, h.ab> lVar) {
        int i3 = 2;
        NativeManager.runNativeTask(new ba(this, updatePlannedDriveRequest, i2, i3), lVar != null ? new bb(lVar, i3) : null);
    }

    public final void fetchPlannedDriveTime(FetchPlannedDriveTimeRequest fetchPlannedDriveTimeRequest, int i2) {
        fetchPlannedDriveTime$default(this, fetchPlannedDriveTimeRequest, i2, null, 4, null);
    }

    public final void getUpcomingDrivesCount() {
        getUpcomingDrivesCount$default(this, null, 1, null);
    }

    public final void updatePlannedDrive(UpdatePlannedDriveRequest updatePlannedDriveRequest, int i2) {
        updatePlannedDrive$default(this, updatePlannedDriveRequest, i2, null, 4, null);
    }

    public final void createPlannedDrive(CreatePlannedDriveRequest createPlannedDriveRequest, int i2) {
        createPlannedDrive$default(this, createPlannedDriveRequest, i2, null, 4, null);
    }

    public final void deletePlannedDrive(DeletePlannedDriveRequest deletePlannedDriveRequest, int i2) {
        deletePlannedDrive$default(this, deletePlannedDriveRequest, i2, null, 4, null);
    }

    public final void loadPlannedDriveOptions(LoadPlannedDriveOptionsRequest loadPlannedDriveOptionsRequest, int i2) {
        loadPlannedDriveOptions$default(this, loadPlannedDriveOptionsRequest, i2, null, 4, null);
    }
}
