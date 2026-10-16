package com.waze.jni.protos;

import com.waze.jni.protos.IntAreaKt;
import com.waze.jni.protos.Position;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class IntAreaKtKt {
    /* renamed from: -initializeintArea, reason: not valid java name */
    public static final Position.IntArea m25196initializeintArea(l<? super IntAreaKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        IntAreaKt.Dsl.Companion companion = IntAreaKt.Dsl.Companion;
        Position.IntArea.Builder builderNewBuilder = Position.IntArea.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        IntAreaKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final Position.IntArea copy(Position.IntArea intArea, l<? super IntAreaKt.Dsl, ab> lVar) {
        x.f(intArea, "<this>");
        x.f(lVar, "block");
        IntAreaKt.Dsl.Companion companion = IntAreaKt.Dsl.Companion;
        Position.IntArea.Builder builder = intArea.toBuilder();
        x.e(builder, "toBuilder(...)");
        IntAreaKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
