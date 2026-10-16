package com.waze.jni.protos.planned_drive;

import com.waze.jni.protos.Position;
import com.waze.jni.protos.VenueData;
import com.waze.jni.protos.planned_drive.LoadPlannedDriveOptionsRequest;
import com.waze.jni.protos.planned_drive.LoadPlannedDriveOptionsRequestKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class LoadPlannedDriveOptionsRequestKtKt {
    /* renamed from: -initializeloadPlannedDriveOptionsRequest, reason: not valid java name */
    public static final LoadPlannedDriveOptionsRequest m28081initializeloadPlannedDriveOptionsRequest(l<? super LoadPlannedDriveOptionsRequestKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        LoadPlannedDriveOptionsRequestKt.Dsl.Companion companion = LoadPlannedDriveOptionsRequestKt.Dsl.Companion;
        LoadPlannedDriveOptionsRequest.Builder builderNewBuilder = LoadPlannedDriveOptionsRequest.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        LoadPlannedDriveOptionsRequestKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final LoadPlannedDriveOptionsRequest copy(LoadPlannedDriveOptionsRequest loadPlannedDriveOptionsRequest, l<? super LoadPlannedDriveOptionsRequestKt.Dsl, ab> lVar) {
        x.f(loadPlannedDriveOptionsRequest, "<this>");
        x.f(lVar, "block");
        LoadPlannedDriveOptionsRequestKt.Dsl.Companion companion = LoadPlannedDriveOptionsRequestKt.Dsl.Companion;
        LoadPlannedDriveOptionsRequest.Builder builder = loadPlannedDriveOptionsRequest.toBuilder();
        x.e(builder, "toBuilder(...)");
        LoadPlannedDriveOptionsRequestKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final VenueData getDestinationOrNull(LoadPlannedDriveOptionsRequestOrBuilder loadPlannedDriveOptionsRequestOrBuilder) {
        x.f(loadPlannedDriveOptionsRequestOrBuilder, "<this>");
        if (loadPlannedDriveOptionsRequestOrBuilder.hasDestination()) {
            return loadPlannedDriveOptionsRequestOrBuilder.getDestination();
        }
        return null;
    }

    public static /* synthetic */ void getDestinationOrNull$annotations(LoadPlannedDriveOptionsRequestOrBuilder loadPlannedDriveOptionsRequestOrBuilder) {
    }

    public static final Position.IntPosition getOriginOrNull(LoadPlannedDriveOptionsRequestOrBuilder loadPlannedDriveOptionsRequestOrBuilder) {
        x.f(loadPlannedDriveOptionsRequestOrBuilder, "<this>");
        if (loadPlannedDriveOptionsRequestOrBuilder.hasOrigin()) {
            return loadPlannedDriveOptionsRequestOrBuilder.getOrigin();
        }
        return null;
    }

    public static /* synthetic */ void getOriginOrNull$annotations(LoadPlannedDriveOptionsRequestOrBuilder loadPlannedDriveOptionsRequestOrBuilder) {
    }
}
