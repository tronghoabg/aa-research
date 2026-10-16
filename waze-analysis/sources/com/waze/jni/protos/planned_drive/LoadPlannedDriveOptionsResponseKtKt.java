package com.waze.jni.protos.planned_drive;

import com.waze.jni.protos.planned_drive.LoadPlannedDriveOptionsResponse;
import com.waze.jni.protos.planned_drive.LoadPlannedDriveOptionsResponseKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class LoadPlannedDriveOptionsResponseKtKt {
    /* renamed from: -initializeloadPlannedDriveOptionsResponse, reason: not valid java name */
    public static final LoadPlannedDriveOptionsResponse m28096initializeloadPlannedDriveOptionsResponse(l<? super LoadPlannedDriveOptionsResponseKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        LoadPlannedDriveOptionsResponseKt.Dsl.Companion companion = LoadPlannedDriveOptionsResponseKt.Dsl.Companion;
        LoadPlannedDriveOptionsResponse.Builder builderNewBuilder = LoadPlannedDriveOptionsResponse.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        LoadPlannedDriveOptionsResponseKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final LoadPlannedDriveOptionsResponse copy(LoadPlannedDriveOptionsResponse loadPlannedDriveOptionsResponse, l<? super LoadPlannedDriveOptionsResponseKt.Dsl, ab> lVar) {
        x.f(loadPlannedDriveOptionsResponse, "<this>");
        x.f(lVar, "block");
        LoadPlannedDriveOptionsResponseKt.Dsl.Companion companion = LoadPlannedDriveOptionsResponseKt.Dsl.Companion;
        LoadPlannedDriveOptionsResponse.Builder builder = loadPlannedDriveOptionsResponse.toBuilder();
        x.e(builder, "toBuilder(...)");
        LoadPlannedDriveOptionsResponseKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
