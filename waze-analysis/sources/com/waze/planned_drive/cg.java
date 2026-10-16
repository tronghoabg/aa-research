package com.waze.planned_drive;

import com.waze.jni.protos.planned_drive.CreatePlannedDriveRequest;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final /* synthetic */ class cg extends h.g.b.u implements h.g.a.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ch f33305a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ CreatePlannedDriveRequest f33306b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    cg(ch chVar, CreatePlannedDriveRequest createPlannedDriveRequest) {
        super(1, h.g.b.w.class, "onResult", "createPlannedDrive$onResult(Lcom/waze/planned_drive/PlannedDriveViewModel;Lcom/waze/jni/protos/planned_drive/CreatePlannedDriveRequest;Lcom/waze/planned_drive/PlannedDriveViewModel$ScreenStateEnum$ConfirmDangerZone$ConfirmationResult;)V", 0);
        this.f33305a = chVar;
        this.f33306b = createPlannedDriveRequest;
    }

    @Override // h.g.a.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ca caVar = (ca) obj;
        h.g.b.x.f(caVar, "p0");
        ch.o(this.f33305a, this.f33306b, caVar);
        return h.ab.f48028a;
    }
}
