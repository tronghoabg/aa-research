package com.waze.jni.protos.navigate;

import com.waze.jni.protos.navigate.AverageSpeedCameraZoneUpdate;
import com.waze.jni.protos.navigate.AverageSpeedCameraZoneUpdateKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class AverageSpeedCameraZoneUpdateKtKt {
    /* renamed from: -initializeaverageSpeedCameraZoneUpdate, reason: not valid java name */
    public static final AverageSpeedCameraZoneUpdate m27140initializeaverageSpeedCameraZoneUpdate(l<? super AverageSpeedCameraZoneUpdateKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        AverageSpeedCameraZoneUpdateKt.Dsl.Companion companion = AverageSpeedCameraZoneUpdateKt.Dsl.Companion;
        AverageSpeedCameraZoneUpdate.Builder builderNewBuilder = AverageSpeedCameraZoneUpdate.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        AverageSpeedCameraZoneUpdateKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final AverageSpeedCameraZoneUpdate copy(AverageSpeedCameraZoneUpdate averageSpeedCameraZoneUpdate, l<? super AverageSpeedCameraZoneUpdateKt.Dsl, ab> lVar) {
        x.f(averageSpeedCameraZoneUpdate, "<this>");
        x.f(lVar, "block");
        AverageSpeedCameraZoneUpdateKt.Dsl.Companion companion = AverageSpeedCameraZoneUpdateKt.Dsl.Companion;
        AverageSpeedCameraZoneUpdate.Builder builder = averageSpeedCameraZoneUpdate.toBuilder();
        x.e(builder, "toBuilder(...)");
        AverageSpeedCameraZoneUpdateKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
