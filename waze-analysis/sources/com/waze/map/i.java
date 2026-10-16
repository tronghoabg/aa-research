package com.waze.map;

import com.waze.jni.protos.map.MapLineIntersectionMetadata;
import com.waze.jni.protos.map.MapNorthLockChanged;
import com.waze.jni.protos.map.ScreenPoint;
import kotlinx.coroutines.CompletableDeferred;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class i implements h.g.a.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f29195a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f29196b;

    public /* synthetic */ i(Object obj, int i2) {
        this.f29196b = i2;
        this.f29195a = obj;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlinx.coroutines.CompletableDeferred] */
    /* JADX WARN: Type inference failed for: r1v11, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object, kotlinx.coroutines.CompletableDeferred] */
    /* JADX WARN: Type inference failed for: r1v15, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v17, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v19, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlinx.coroutines.CompletableDeferred] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, kotlinx.coroutines.CompletableDeferred] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, kotlinx.coroutines.CompletableDeferred] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, kotlinx.coroutines.CompletableDeferred] */
    @Override // h.g.a.l
    public final Object invoke(Object obj) {
        switch (this.f29196b) {
            case 0:
                return GenericCanvasNativeManager.setShowMapLoader$lambda$0(this.f29195a, (h.ab) obj);
            case 1:
                return GenericCanvasNativeManager.updateMapContent$lambda$0(this.f29195a, (h.ab) obj);
            case 2:
                return GenericCanvasNativeManager.updateMapBounds$lambda$0(this.f29195a, (h.ab) obj);
            case 3:
                return GenericCanvasNativeManager.performZoomIn$lambda$0((CompletableDeferred) this.f29195a, (h.ab) obj);
            case 4:
                return GenericCanvasNativeManager.performZoomOut$lambda$0((CompletableDeferred) this.f29195a, (h.ab) obj);
            case 5:
                return u.generateEtaLabelPositions$lambda$1(this.f29195a, (byte[]) obj);
            case 6:
                return MapLineResolverNativeManager.findIntersectionMetadata_gIAlu_s$lambda$0(this.f29195a, (MapLineIntersectionMetadata) obj);
            case 7:
                return ao.findIntersectionMetadata$lambda$1(this.f29195a, (byte[]) obj);
            case 8:
                return ao.findNearestLine$lambda$1(this.f29195a, (byte[]) obj);
            case 9:
                return ao.resolveSegmentToLine$lambda$1(this.f29195a, (byte[]) obj);
            case 10:
                return WazeMapNativeManager.updateMapContent$lambda$0((com.waze.map.b.dx) this.f29195a, (com.waze.map.canvas.a.c) obj);
            case 11:
                return WazeMapNativeManager.onLongClick$lambda$0((com.waze.shared_infra.h.c) this.f29195a, (com.waze.map.canvas.a.c) obj);
            case 12:
                return WazeMapNativeManager.onMapMovementStateChanged$lambda$0((com.waze.map.b.dk) this.f29195a, (com.waze.map.canvas.a.c) obj);
            case 13:
                return WazeMapNativeManager.onAdClicked$lambda$0((String) this.f29195a, (com.waze.map.canvas.a.c) obj);
            case 14:
                return WazeMapNativeManager.onMapNorthLockBehaviorChanged$lambda$0((MapNorthLockChanged) this.f29195a, (com.waze.map.canvas.a.c) obj);
            case 15:
                return WazeMapNativeManager.onMarkerClicked$lambda$0((String) this.f29195a, (com.waze.map.canvas.a.c) obj);
            case 16:
                return WazeMapNativeManager.onMapFallthroughClick$lambda$0((ScreenPoint) this.f29195a, (com.waze.map.canvas.a.c) obj);
            case 17:
                return WazeMapNativeManager.onMapVisibleAreaChanged$lambda$0((com.waze.map.b.dm) this.f29195a, (com.waze.map.canvas.a.c) obj);
            default:
                return WazeMapNativeManager.onPolylineClicked$lambda$0((String) this.f29195a, (com.waze.map.canvas.a.c) obj);
        }
    }
}
