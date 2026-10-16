package com.waze.jni.protos.location;

import com.waze.jni.protos.location.NativeRotationVectors;
import com.waze.jni.protos.location.NativeRotationVectorsKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class NativeRotationVectorsKtKt {
    /* renamed from: -initializenativeRotationVectors, reason: not valid java name */
    public static final NativeRotationVectors m26343initializenativeRotationVectors(l<? super NativeRotationVectorsKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        NativeRotationVectorsKt.Dsl.Companion companion = NativeRotationVectorsKt.Dsl.Companion;
        NativeRotationVectors.Builder builderNewBuilder = NativeRotationVectors.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        NativeRotationVectorsKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final NativeRotationVectors copy(NativeRotationVectors nativeRotationVectors, l<? super NativeRotationVectorsKt.Dsl, ab> lVar) {
        x.f(nativeRotationVectors, "<this>");
        x.f(lVar, "block");
        NativeRotationVectorsKt.Dsl.Companion companion = NativeRotationVectorsKt.Dsl.Companion;
        NativeRotationVectors.Builder builder = nativeRotationVectors.toBuilder();
        x.e(builder, "toBuilder(...)");
        NativeRotationVectorsKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final Vector3 getGravityOrNull(NativeRotationVectorsOrBuilder nativeRotationVectorsOrBuilder) {
        x.f(nativeRotationVectorsOrBuilder, "<this>");
        if (nativeRotationVectorsOrBuilder.hasGravity()) {
            return nativeRotationVectorsOrBuilder.getGravity();
        }
        return null;
    }

    public static /* synthetic */ void getGravityOrNull$annotations(NativeRotationVectorsOrBuilder nativeRotationVectorsOrBuilder) {
    }

    public static final Vector3 getMagneticFieldOrNull(NativeRotationVectorsOrBuilder nativeRotationVectorsOrBuilder) {
        x.f(nativeRotationVectorsOrBuilder, "<this>");
        if (nativeRotationVectorsOrBuilder.hasMagneticField()) {
            return nativeRotationVectorsOrBuilder.getMagneticField();
        }
        return null;
    }

    public static /* synthetic */ void getMagneticFieldOrNull$annotations(NativeRotationVectorsOrBuilder nativeRotationVectorsOrBuilder) {
    }

    public static final Quaternion getRotationOrNull(NativeRotationVectorsOrBuilder nativeRotationVectorsOrBuilder) {
        x.f(nativeRotationVectorsOrBuilder, "<this>");
        if (nativeRotationVectorsOrBuilder.hasRotation()) {
            return nativeRotationVectorsOrBuilder.getRotation();
        }
        return null;
    }

    public static /* synthetic */ void getRotationOrNull$annotations(NativeRotationVectorsOrBuilder nativeRotationVectorsOrBuilder) {
    }
}
