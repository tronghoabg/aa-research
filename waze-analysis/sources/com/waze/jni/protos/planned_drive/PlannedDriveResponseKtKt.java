package com.waze.jni.protos.planned_drive;

import com.waze.jni.protos.planned_drive.PlannedDriveResponse;
import com.waze.jni.protos.planned_drive.PlannedDriveResponseKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class PlannedDriveResponseKtKt {
    /* renamed from: -initializeplannedDriveResponse, reason: not valid java name */
    public static final PlannedDriveResponse m28106initializeplannedDriveResponse(l<? super PlannedDriveResponseKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        PlannedDriveResponseKt.Dsl.Companion companion = PlannedDriveResponseKt.Dsl.Companion;
        PlannedDriveResponse.Builder builderNewBuilder = PlannedDriveResponse.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        PlannedDriveResponseKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final PlannedDriveResponse copy(PlannedDriveResponse plannedDriveResponse, l<? super PlannedDriveResponseKt.Dsl, ab> lVar) {
        x.f(plannedDriveResponse, "<this>");
        x.f(lVar, "block");
        PlannedDriveResponseKt.Dsl.Companion companion = PlannedDriveResponseKt.Dsl.Companion;
        PlannedDriveResponse.Builder builder = plannedDriveResponse.toBuilder();
        x.e(builder, "toBuilder(...)");
        PlannedDriveResponseKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
