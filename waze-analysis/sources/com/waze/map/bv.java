package com.waze.map;

import com.waze.jni.protos.NavigationSegment;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public class bv {
    public /* synthetic */ bv(byte[] bArr) {
    }

    public static NavigationSegment b(com.waze.shared_infra.l.a aVar) {
        h.g.b.x.f(aVar, "<this>");
        NavigationSegment.Builder builderNewBuilder = NavigationSegment.newBuilder();
        builderNewBuilder.setTileId(aVar.c());
        builderNewBuilder.setLineId(aVar.b());
        builderNewBuilder.setFromNode(aVar.a());
        builderNewBuilder.setToNode(aVar.d());
        builderNewBuilder.setIsReversed(aVar.g());
        NavigationSegment navigationSegmentBuild = builderNewBuilder.build();
        h.g.b.x.e(navigationSegmentBuild, "build(...)");
        return navigationSegmentBuild;
    }

    private bv() {
        throw null;
    }
}
