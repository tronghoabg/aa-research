package com.waze.jni.protos.planned_drive;

import com.waze.jni.protos.planned_drive.FetchPlannedDriveTimeRequest;
import com.waze.jni.protos.planned_drive.FetchPlannedDriveTimeRequestKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class FetchPlannedDriveTimeRequestKtKt {
    /* renamed from: -initializefetchPlannedDriveTimeRequest, reason: not valid java name */
    public static final FetchPlannedDriveTimeRequest m28064initializefetchPlannedDriveTimeRequest(l<? super FetchPlannedDriveTimeRequestKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        FetchPlannedDriveTimeRequestKt.Dsl.Companion companion = FetchPlannedDriveTimeRequestKt.Dsl.Companion;
        FetchPlannedDriveTimeRequest.Builder builderNewBuilder = FetchPlannedDriveTimeRequest.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        FetchPlannedDriveTimeRequestKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final FetchPlannedDriveTimeRequest copy(FetchPlannedDriveTimeRequest fetchPlannedDriveTimeRequest, l<? super FetchPlannedDriveTimeRequestKt.Dsl, ab> lVar) {
        x.f(fetchPlannedDriveTimeRequest, "<this>");
        x.f(lVar, "block");
        FetchPlannedDriveTimeRequestKt.Dsl.Companion companion = FetchPlannedDriveTimeRequestKt.Dsl.Companion;
        FetchPlannedDriveTimeRequest.Builder builder = fetchPlannedDriveTimeRequest.toBuilder();
        x.e(builder, "toBuilder(...)");
        FetchPlannedDriveTimeRequestKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
