package com.waze.map;

import com.waze.jni.protos.map.GenerateMapObjectsPositionResult;
import com.waze.jni.protos.map.RouteEtaLabelPositionAndAlignment;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class j implements h.g.a.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.k f29284a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ GenericCanvasNativeManager f29285b;

    j(kotlinx.coroutines.k kVar, GenericCanvasNativeManager genericCanvasNativeManager) {
        this.f29284a = kVar;
        this.f29285b = genericCanvasNativeManager;
    }

    @Override // h.g.a.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Map<Long, RouteEtaLabelPositionAndAlignment> resultMap;
        GenerateMapObjectsPositionResult generateMapObjectsPositionResult = (GenerateMapObjectsPositionResult) obj;
        this.f29284a.resumeWith((generateMapObjectsPositionResult == null || (resultMap = generateMapObjectsPositionResult.getResultMap()) == null) ? h.a.r.j() : this.f29285b.toRouteDataMap(resultMap));
        return h.ab.f48028a;
    }
}
