package com.waze.jni.protos.planned_drive;

import com.waze.jni.protos.planned_drive.UpdatePlannedDriveRequest;
import com.waze.jni.protos.planned_drive.UpdatePlannedDriveRequestKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class UpdatePlannedDriveRequestKtKt {
    /* renamed from: -initializeupdatePlannedDriveRequest, reason: not valid java name */
    public static final UpdatePlannedDriveRequest m28113initializeupdatePlannedDriveRequest(l<? super UpdatePlannedDriveRequestKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        UpdatePlannedDriveRequestKt.Dsl.Companion companion = UpdatePlannedDriveRequestKt.Dsl.Companion;
        UpdatePlannedDriveRequest.Builder builderNewBuilder = UpdatePlannedDriveRequest.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        UpdatePlannedDriveRequestKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final UpdatePlannedDriveRequest copy(UpdatePlannedDriveRequest updatePlannedDriveRequest, l<? super UpdatePlannedDriveRequestKt.Dsl, ab> lVar) {
        x.f(updatePlannedDriveRequest, "<this>");
        x.f(lVar, "block");
        UpdatePlannedDriveRequestKt.Dsl.Companion companion = UpdatePlannedDriveRequestKt.Dsl.Companion;
        UpdatePlannedDriveRequest.Builder builder = updatePlannedDriveRequest.toBuilder();
        x.e(builder, "toBuilder(...)");
        UpdatePlannedDriveRequestKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
