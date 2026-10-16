package com.waze.jni.protos;

import com.waze.jni.protos.NativeManagerDefinitions;
import com.waze.jni.protos.NativeManagerDefinitionsKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class NativeManagerDefinitionsKtKt {
    /* renamed from: -initializenativeManagerDefinitions, reason: not valid java name */
    public static final NativeManagerDefinitions m25256initializenativeManagerDefinitions(l<? super NativeManagerDefinitionsKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        NativeManagerDefinitionsKt.Dsl.Companion companion = NativeManagerDefinitionsKt.Dsl.Companion;
        NativeManagerDefinitions.Builder builderNewBuilder = NativeManagerDefinitions.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        NativeManagerDefinitionsKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final NativeManagerDefinitions copy(NativeManagerDefinitions nativeManagerDefinitions, l<? super NativeManagerDefinitionsKt.Dsl, ab> lVar) {
        x.f(nativeManagerDefinitions, "<this>");
        x.f(lVar, "block");
        NativeManagerDefinitionsKt.Dsl.Companion companion = NativeManagerDefinitionsKt.Dsl.Companion;
        NativeManagerDefinitions.Builder builder = nativeManagerDefinitions.toBuilder();
        x.e(builder, "toBuilder(...)");
        NativeManagerDefinitionsKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
