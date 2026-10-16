package com.waze.jni.protos.planned_drive;

import com.waze.jni.protos.planned_drive.DeletePlannedDriveRequest;
import com.waze.jni.protos.planned_drive.DeletePlannedDriveRequestKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class DeletePlannedDriveRequestKtKt {
    /* renamed from: -initializedeletePlannedDriveRequest, reason: not valid java name */
    public static final DeletePlannedDriveRequest m28059initializedeletePlannedDriveRequest(l<? super DeletePlannedDriveRequestKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        DeletePlannedDriveRequestKt.Dsl.Companion companion = DeletePlannedDriveRequestKt.Dsl.Companion;
        DeletePlannedDriveRequest.Builder builderNewBuilder = DeletePlannedDriveRequest.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        DeletePlannedDriveRequestKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final DeletePlannedDriveRequest copy(DeletePlannedDriveRequest deletePlannedDriveRequest, l<? super DeletePlannedDriveRequestKt.Dsl, ab> lVar) {
        x.f(deletePlannedDriveRequest, "<this>");
        x.f(lVar, "block");
        DeletePlannedDriveRequestKt.Dsl.Companion companion = DeletePlannedDriveRequestKt.Dsl.Companion;
        DeletePlannedDriveRequest.Builder builder = deletePlannedDriveRequest.toBuilder();
        x.e(builder, "toBuilder(...)");
        DeletePlannedDriveRequestKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
