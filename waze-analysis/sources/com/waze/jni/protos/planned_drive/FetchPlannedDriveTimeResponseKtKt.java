package com.waze.jni.protos.planned_drive;

import com.waze.jni.protos.planned_drive.FetchPlannedDriveTimeResponse;
import com.waze.jni.protos.planned_drive.FetchPlannedDriveTimeResponseKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class FetchPlannedDriveTimeResponseKtKt {
    /* renamed from: -initializefetchPlannedDriveTimeResponse, reason: not valid java name */
    public static final FetchPlannedDriveTimeResponse m28071initializefetchPlannedDriveTimeResponse(l<? super FetchPlannedDriveTimeResponseKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        FetchPlannedDriveTimeResponseKt.Dsl.Companion companion = FetchPlannedDriveTimeResponseKt.Dsl.Companion;
        FetchPlannedDriveTimeResponse.Builder builderNewBuilder = FetchPlannedDriveTimeResponse.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        FetchPlannedDriveTimeResponseKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final FetchPlannedDriveTimeResponse copy(FetchPlannedDriveTimeResponse fetchPlannedDriveTimeResponse, l<? super FetchPlannedDriveTimeResponseKt.Dsl, ab> lVar) {
        x.f(fetchPlannedDriveTimeResponse, "<this>");
        x.f(lVar, "block");
        FetchPlannedDriveTimeResponseKt.Dsl.Companion companion = FetchPlannedDriveTimeResponseKt.Dsl.Companion;
        FetchPlannedDriveTimeResponse.Builder builder = fetchPlannedDriveTimeResponse.toBuilder();
        x.e(builder, "toBuilder(...)");
        FetchPlannedDriveTimeResponseKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
