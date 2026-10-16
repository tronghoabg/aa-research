package com.waze.jni.protos;

import com.waze.jni.protos.Position;
import com.waze.shared_infra.h.c;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ConversionExtensionsKt {
    public static final Position.IntPosition toIntPosition(c cVar) {
        x.f(cVar, "<this>");
        Position.IntPosition.Builder builderNewBuilder = Position.IntPosition.newBuilder();
        builderNewBuilder.setLatitude(cVar.c());
        builderNewBuilder.setLongitude(cVar.d());
        Position.IntPosition intPositionBuild = builderNewBuilder.build();
        x.e(intPositionBuild, "build(...)");
        return intPositionBuild;
    }
}
