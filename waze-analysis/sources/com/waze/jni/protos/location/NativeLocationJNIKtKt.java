package com.waze.jni.protos.location;

import com.waze.jni.protos.Position;
import com.waze.jni.protos.location.NativeLocationJNI;
import com.waze.jni.protos.location.NativeLocationJNIKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class NativeLocationJNIKtKt {
    /* renamed from: -initializenativeLocationJNI, reason: not valid java name */
    public static final NativeLocationJNI m26324initializenativeLocationJNI(l<? super NativeLocationJNIKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        NativeLocationJNIKt.Dsl.Companion companion = NativeLocationJNIKt.Dsl.Companion;
        NativeLocationJNI.Builder builderNewBuilder = NativeLocationJNI.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        NativeLocationJNIKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final NativeLocationJNI copy(NativeLocationJNI nativeLocationJNI, l<? super NativeLocationJNIKt.Dsl, ab> lVar) {
        x.f(nativeLocationJNI, "<this>");
        x.f(lVar, "block");
        NativeLocationJNIKt.Dsl.Companion companion = NativeLocationJNIKt.Dsl.Companion;
        NativeLocationJNI.Builder builder = nativeLocationJNI.toBuilder();
        x.e(builder, "toBuilder(...)");
        NativeLocationJNIKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final Vector3 getAccelerometerOrNull(NativeLocationJNIOrBuilder nativeLocationJNIOrBuilder) {
        x.f(nativeLocationJNIOrBuilder, "<this>");
        if (nativeLocationJNIOrBuilder.hasAccelerometer()) {
            return nativeLocationJNIOrBuilder.getAccelerometer();
        }
        return null;
    }

    public static /* synthetic */ void getAccelerometerOrNull$annotations(NativeLocationJNIOrBuilder nativeLocationJNIOrBuilder) {
    }

    public static final Vector3 getCompassOrNull(NativeLocationJNIOrBuilder nativeLocationJNIOrBuilder) {
        x.f(nativeLocationJNIOrBuilder, "<this>");
        if (nativeLocationJNIOrBuilder.hasCompass()) {
            return nativeLocationJNIOrBuilder.getCompass();
        }
        return null;
    }

    public static /* synthetic */ void getCompassOrNull$annotations(NativeLocationJNIOrBuilder nativeLocationJNIOrBuilder) {
    }

    public static final Vector3 getGyroscopeOrNull(NativeLocationJNIOrBuilder nativeLocationJNIOrBuilder) {
        x.f(nativeLocationJNIOrBuilder, "<this>");
        if (nativeLocationJNIOrBuilder.hasGyroscope()) {
            return nativeLocationJNIOrBuilder.getGyroscope();
        }
        return null;
    }

    public static /* synthetic */ void getGyroscopeOrNull$annotations(NativeLocationJNIOrBuilder nativeLocationJNIOrBuilder) {
    }

    public static final Position.IntPosition getPositionOrNull(NativeLocationJNIOrBuilder nativeLocationJNIOrBuilder) {
        x.f(nativeLocationJNIOrBuilder, "<this>");
        if (nativeLocationJNIOrBuilder.hasPosition()) {
            return nativeLocationJNIOrBuilder.getPosition();
        }
        return null;
    }

    public static /* synthetic */ void getPositionOrNull$annotations(NativeLocationJNIOrBuilder nativeLocationJNIOrBuilder) {
    }
}
