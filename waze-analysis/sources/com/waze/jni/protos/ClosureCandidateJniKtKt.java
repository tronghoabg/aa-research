package com.waze.jni.protos;

import com.waze.jni.protos.ClosureCandidateJni;
import com.waze.jni.protos.ClosureCandidateJniKt;
import com.waze.jni.protos.Position;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ClosureCandidateJniKtKt {
    /* renamed from: -initializeclosureCandidateJni, reason: not valid java name */
    public static final ClosureCandidateJni m25007initializeclosureCandidateJni(l<? super ClosureCandidateJniKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        ClosureCandidateJniKt.Dsl.Companion companion = ClosureCandidateJniKt.Dsl.Companion;
        ClosureCandidateJni.Builder builderNewBuilder = ClosureCandidateJni.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        ClosureCandidateJniKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final ClosureCandidateJni copy(ClosureCandidateJni closureCandidateJni, l<? super ClosureCandidateJniKt.Dsl, ab> lVar) {
        x.f(closureCandidateJni, "<this>");
        x.f(lVar, "block");
        ClosureCandidateJniKt.Dsl.Companion companion = ClosureCandidateJniKt.Dsl.Companion;
        ClosureCandidateJni.Builder builder = closureCandidateJni.toBuilder();
        x.e(builder, "toBuilder(...)");
        ClosureCandidateJniKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final Position.IntPosition getFromCoordinateOrNull(ClosureCandidateJniOrBuilder closureCandidateJniOrBuilder) {
        x.f(closureCandidateJniOrBuilder, "<this>");
        if (closureCandidateJniOrBuilder.hasFromCoordinate()) {
            return closureCandidateJniOrBuilder.getFromCoordinate();
        }
        return null;
    }

    public static /* synthetic */ void getFromCoordinateOrNull$annotations(ClosureCandidateJniOrBuilder closureCandidateJniOrBuilder) {
    }

    public static final Position.IntPosition getToCoordinateOrNull(ClosureCandidateJniOrBuilder closureCandidateJniOrBuilder) {
        x.f(closureCandidateJniOrBuilder, "<this>");
        if (closureCandidateJniOrBuilder.hasToCoordinate()) {
            return closureCandidateJniOrBuilder.getToCoordinate();
        }
        return null;
    }

    public static /* synthetic */ void getToCoordinateOrNull$annotations(ClosureCandidateJniOrBuilder closureCandidateJniOrBuilder) {
    }
}
