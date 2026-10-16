package com.waze.jni.protos;

import com.waze.jni.protos.MapAdObject;
import com.waze.jni.protos.MapAdObjectKt;
import com.waze.jni.protos.Position;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class MapAdObjectKtKt {
    /* renamed from: -initializemapAdObject, reason: not valid java name */
    public static final MapAdObject m25238initializemapAdObject(l<? super MapAdObjectKt.Dsl, ab> lVar) {
        x.f(lVar, "block");
        MapAdObjectKt.Dsl.Companion companion = MapAdObjectKt.Dsl.Companion;
        MapAdObject.Builder builderNewBuilder = MapAdObject.newBuilder();
        x.e(builderNewBuilder, "newBuilder(...)");
        MapAdObjectKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final MapAdObject copy(MapAdObject mapAdObject, l<? super MapAdObjectKt.Dsl, ab> lVar) {
        x.f(mapAdObject, "<this>");
        x.f(lVar, "block");
        MapAdObjectKt.Dsl.Companion companion = MapAdObjectKt.Dsl.Companion;
        MapAdObject.Builder builder = mapAdObject.toBuilder();
        x.e(builder, "toBuilder(...)");
        MapAdObjectKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final Position.IntPosition getPositionOrNull(MapAdObjectOrBuilder mapAdObjectOrBuilder) {
        x.f(mapAdObjectOrBuilder, "<this>");
        if (mapAdObjectOrBuilder.hasPosition()) {
            return mapAdObjectOrBuilder.getPosition();
        }
        return null;
    }

    public static /* synthetic */ void getPositionOrNull$annotations(MapAdObjectOrBuilder mapAdObjectOrBuilder) {
    }
}
