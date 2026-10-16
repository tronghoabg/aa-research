package com.waze.jni.protos;

import com.waze.jni.protos.IntPositionKt;
import com.waze.jni.protos.Position;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class IntPositionKtKt {
    /* renamed from: -initializeintPosition, reason: not valid java name */
    public static final Position.IntPosition m25197initializeintPosition(l<? super IntPositionKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        IntPositionKt.Dsl.Companion companion = IntPositionKt.Dsl.Companion;
        Position.IntPosition.Builder builderNewBuilder = Position.IntPosition.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        IntPositionKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final Position.IntPosition copy(Position.IntPosition intPosition, l<? super IntPositionKt.Dsl, ab> lVar) {
        x.f(intPosition, "<this>");
        x.f(lVar, "block");
        IntPositionKt.Dsl.Companion companion = IntPositionKt.Dsl.Companion;
        Position.IntPosition.Builder builder = intPosition.toBuilder();
        x.e(builder, "toBuilder(...)");
        IntPositionKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
