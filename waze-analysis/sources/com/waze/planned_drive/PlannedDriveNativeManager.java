package com.waze.planned_drive;

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
public class PlannedDriveNativeManager extends bf {
    private static PlannedDriveNativeManager instance;
    private final com.waze.native_managers.c<FetchPlannedDriveTimeResponse> fetchPlannedDriveTimeCallbackWrapper = new com.waze.native_managers.c<>();
    private final com.waze.native_managers.c<LoadPlannedDriveOptionsResponse> loadPlannedDriveOptionsResponseCallbackWrapper = new com.waze.native_managers.c<>();
    private final com.waze.native_managers.c<PlannedDriveResponse> plannedDriveResponseCallbackWrapper = new com.waze.native_managers.c<>();
    private final kotlinx.coroutines.b.bm<o> plannedDriveEventMutableSharedFlow = kotlinx.coroutines.b.bu.c(0, 1, kotlinx.coroutines.a.a.f51273c);

    private PlannedDriveNativeManager() {
    }

    private void emitEvent(o oVar) {
        this.plannedDriveEventMutableSharedFlow.c(oVar);
    }

    public static synchronized PlannedDriveNativeManager getInstance() {
        PlannedDriveNativeManager plannedDriveNativeManager;
        plannedDriveNativeManager = instance;
        if (plannedDriveNativeManager == null) {
            plannedDriveNativeManager = new PlannedDriveNativeManager();
            instance = plannedDriveNativeManager;
        }
        return plannedDriveNativeManager;
    }

    private native void initNativeLayerNTV();

    static /* synthetic */ h.ab lambda$createPlannedDrive$0(com.waze.jni.a aVar, PlannedDriveResponse plannedDriveResponse) {
        aVar.a(plannedDriveResponse);
        return h.ab.f48028a;
    }

    static /* synthetic */ h.ab lambda$deletePlannedDrive$0(com.waze.jni.a aVar, PlannedDriveResponse plannedDriveResponse) {
        aVar.a(plannedDriveResponse);
        return h.ab.f48028a;
    }

    static /* synthetic */ h.ab lambda$fetchPlannedDriveTime$0(com.waze.jni.a aVar, FetchPlannedDriveTimeResponse fetchPlannedDriveTimeResponse) {
        aVar.a(fetchPlannedDriveTimeResponse);
        return h.ab.f48028a;
    }

    static /* synthetic */ h.ab lambda$loadPlannedDriveOptions$0(com.waze.jni.a aVar, LoadPlannedDriveOptionsResponse loadPlannedDriveOptionsResponse) {
        aVar.a(loadPlannedDriveOptionsResponse);
        return h.ab.f48028a;
    }

    static /* synthetic */ h.ab lambda$updatePlannedDrive$0(com.waze.jni.a aVar, PlannedDriveResponse plannedDriveResponse) {
        aVar.a(plannedDriveResponse);
        return h.ab.f48028a;
    }

    public void createPlannedDrive(CreatePlannedDriveRequest createPlannedDriveRequest, com.waze.jni.a<PlannedDriveResponse> aVar) {
        createPlannedDrive(createPlannedDriveRequest, this.plannedDriveResponseCallbackWrapper.a(new az(aVar, 4)));
    }

    protected native void createPlannedDriveNTV(byte[] bArr, int i2);

    public void deletePlannedDrive(DeletePlannedDriveRequest deletePlannedDriveRequest, com.waze.jni.a<PlannedDriveResponse> aVar) {
        deletePlannedDrive(deletePlannedDriveRequest, this.plannedDriveResponseCallbackWrapper.a(new az(aVar, 2)));
    }

    protected native void deletePlannedDriveNTV(byte[] bArr, int i2);

    public void fetchPlannedDriveTime(FetchPlannedDriveTimeRequest fetchPlannedDriveTimeRequest, com.waze.jni.a<FetchPlannedDriveTimeResponse> aVar) {
        fetchPlannedDriveTime(fetchPlannedDriveTimeRequest, this.fetchPlannedDriveTimeCallbackWrapper.a(new az(aVar, 1)));
    }

    protected native void fetchPlannedDriveTimeNTV(byte[] bArr, int i2);

    public kotlinx.coroutines.b.bq<o> getPlannedDriveEvents() {
        return this.plannedDriveEventMutableSharedFlow;
    }

    protected native int getUpcomingDrivesCountNTV();

    public void initialize() {
        initNativeLayerNTV();
    }

    public void loadPlannedDriveOptions(LoadPlannedDriveOptionsRequest loadPlannedDriveOptionsRequest, com.waze.jni.a<LoadPlannedDriveOptionsResponse> aVar) {
        loadPlannedDriveOptions(loadPlannedDriveOptionsRequest, this.loadPlannedDriveOptionsResponseCallbackWrapper.a(new az(aVar, 3)));
    }

    protected native void loadPlannedDriveOptionsNTV(byte[] bArr, int i2);

    void onPlannedDriveCreated(PlannedDriveResponse plannedDriveResponse, int i2) {
        h.g.a.l lVarB = this.plannedDriveResponseCallbackWrapper.b(i2);
        if (lVarB != null) {
            lVarB.invoke(plannedDriveResponse);
        }
        emitEvent(com.waze.perf.tracer.a.b(plannedDriveResponse));
    }

    void onPlannedDriveDeleted(PlannedDriveResponse plannedDriveResponse, int i2) {
        h.g.a.l lVarB = this.plannedDriveResponseCallbackWrapper.b(i2);
        if (lVarB != null) {
            lVarB.invoke(plannedDriveResponse);
        }
        emitEvent(com.waze.perf.tracer.a.c(plannedDriveResponse));
    }

    void onPlannedDriveOptionsLoaded(LoadPlannedDriveOptionsResponse loadPlannedDriveOptionsResponse, int i2) {
        h.g.a.l lVarB = this.loadPlannedDriveOptionsResponseCallbackWrapper.b(i2);
        if (lVarB != null) {
            lVarB.invoke(loadPlannedDriveOptionsResponse);
        }
    }

    void onPlannedDriveTimeFetched(FetchPlannedDriveTimeResponse fetchPlannedDriveTimeResponse, int i2) {
        h.g.a.l lVarB = this.fetchPlannedDriveTimeCallbackWrapper.b(i2);
        if (lVarB != null) {
            lVarB.invoke(fetchPlannedDriveTimeResponse);
        }
    }

    void onPlannedDriveUpdated(PlannedDriveResponse plannedDriveResponse, int i2) {
        h.g.a.l lVarB = this.plannedDriveResponseCallbackWrapper.b(i2);
        if (lVarB != null) {
            lVarB.invoke(plannedDriveResponse);
        }
        emitEvent(com.waze.perf.tracer.a.d(plannedDriveResponse));
    }

    void openPlannedDrivePage(boolean z) {
        int i2 = ay.f33212a;
        com.waze.realtime_report_feedback.e.f(com.waze.app_nav.w.f15441a.a(), z);
    }

    public void updatePlannedDrive(UpdatePlannedDriveRequest updatePlannedDriveRequest, com.waze.jni.a<PlannedDriveResponse> aVar) {
        updatePlannedDrive(updatePlannedDriveRequest, this.plannedDriveResponseCallbackWrapper.a(new az(aVar, 0)));
    }

    protected native void updatePlannedDriveNTV(byte[] bArr, int i2);
}
