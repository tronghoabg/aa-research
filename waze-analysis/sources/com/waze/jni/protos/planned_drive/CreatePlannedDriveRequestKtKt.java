package com.waze.jni.protos.planned_drive;

import com.waze.jni.protos.VenueData;
import com.waze.jni.protos.planned_drive.CreatePlannedDriveRequest;
import com.waze.jni.protos.planned_drive.CreatePlannedDriveRequestKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class CreatePlannedDriveRequestKtKt {
    /* renamed from: -initializecreatePlannedDriveRequest, reason: not valid java name */
    public static final CreatePlannedDriveRequest m28054initializecreatePlannedDriveRequest(l<? super CreatePlannedDriveRequestKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        CreatePlannedDriveRequestKt.Dsl.Companion companion = CreatePlannedDriveRequestKt.Dsl.Companion;
        CreatePlannedDriveRequest.Builder builderNewBuilder = CreatePlannedDriveRequest.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        CreatePlannedDriveRequestKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final CreatePlannedDriveRequest copy(CreatePlannedDriveRequest createPlannedDriveRequest, l<? super CreatePlannedDriveRequestKt.Dsl, ab> lVar) {
        x.f(createPlannedDriveRequest, "<this>");
        x.f(lVar, "block");
        CreatePlannedDriveRequestKt.Dsl.Companion companion = CreatePlannedDriveRequestKt.Dsl.Companion;
        CreatePlannedDriveRequest.Builder builder = createPlannedDriveRequest.toBuilder();
        x.e(builder, "toBuilder(...)");
        CreatePlannedDriveRequestKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final VenueData getDestinationOrNull(CreatePlannedDriveRequestOrBuilder createPlannedDriveRequestOrBuilder) {
        x.f(createPlannedDriveRequestOrBuilder, "<this>");
        if (createPlannedDriveRequestOrBuilder.hasDestination()) {
            return createPlannedDriveRequestOrBuilder.getDestination();
        }
        return null;
    }

    public static /* synthetic */ void getDestinationOrNull$annotations(CreatePlannedDriveRequestOrBuilder createPlannedDriveRequestOrBuilder) {
    }

    public static final VenueData getOriginOrNull(CreatePlannedDriveRequestOrBuilder createPlannedDriveRequestOrBuilder) {
        x.f(createPlannedDriveRequestOrBuilder, "<this>");
        if (createPlannedDriveRequestOrBuilder.hasOrigin()) {
            return createPlannedDriveRequestOrBuilder.getOrigin();
        }
        return null;
    }

    public static /* synthetic */ void getOriginOrNull$annotations(CreatePlannedDriveRequestOrBuilder createPlannedDriveRequestOrBuilder) {
    }
}
