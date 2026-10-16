package com.waze.jni.protos.map;

import com.waze.jni.protos.map.MapConfiguration;
import com.waze.jni.protos.map.MapConfigurationKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class MapConfigurationKtKt {
    /* renamed from: -initializemapConfiguration, reason: not valid java name */
    public static final MapConfiguration m26594initializemapConfiguration(l<? super MapConfigurationKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        MapConfigurationKt.Dsl.Companion companion = MapConfigurationKt.Dsl.Companion;
        MapConfiguration.Builder builderNewBuilder = MapConfiguration.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        MapConfigurationKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final MapConfiguration.CameraConfiguration copy(MapConfiguration.CameraConfiguration cameraConfiguration, l<? super MapConfigurationKt.CameraConfigurationKt.Dsl, ab> lVar) {
        x.f(cameraConfiguration, "<this>");
        x.f(lVar, "block");
        MapConfigurationKt.CameraConfigurationKt.Dsl.Companion companion = MapConfigurationKt.CameraConfigurationKt.Dsl.Companion;
        MapConfiguration.CameraConfiguration.Builder builder = cameraConfiguration.toBuilder();
        x.e(builder, "toBuilder(...)");
        MapConfigurationKt.CameraConfigurationKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final MapConfiguration.CameraConfiguration getCameraOrNull(MapConfigurationOrBuilder mapConfigurationOrBuilder) {
        x.f(mapConfigurationOrBuilder, "<this>");
        if (mapConfigurationOrBuilder.hasCamera()) {
            return mapConfigurationOrBuilder.getCamera();
        }
        return null;
    }

    public static /* synthetic */ void getCameraOrNull$annotations(MapConfigurationOrBuilder mapConfigurationOrBuilder) {
    }

    public static final MapConfiguration copy(MapConfiguration mapConfiguration, l<? super MapConfigurationKt.Dsl, ab> lVar) {
        x.f(mapConfiguration, "<this>");
        x.f(lVar, "block");
        MapConfigurationKt.Dsl.Companion companion = MapConfigurationKt.Dsl.Companion;
        MapConfiguration.Builder builder = mapConfiguration.toBuilder();
        x.e(builder, "toBuilder(...)");
        MapConfigurationKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
