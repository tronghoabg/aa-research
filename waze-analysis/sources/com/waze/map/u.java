package com.waze.map;

import androidx.core.app.NotificationCompat;
import com.waze.jni.protos.map.DisplayRects;
import com.waze.jni.protos.map.GenerateMapObjectsPositionRequest;
import com.waze.jni.protos.map.GenerateMapObjectsPositionResult;
import com.waze.jni.protos.map.MapBounds;
import com.waze.jni.protos.map.MapContent;
import com.waze.jni.protos.map.MapMovementChanged;
import com.waze.jni.protos.map.MapVisibleAreaChanged;
import com.waze.jni.protos.map.ScreenPoint;
import com.waze.native_managers.WazeNativeLooperDispatcher;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public class u {
    private final com.waze.native_managers.j wazeMainLooperDispatcher;
    private final WazeNativeLooperDispatcher wazeNativeLooperDispatcher;

    public u(com.waze.native_managers.j jVar, WazeNativeLooperDispatcher wazeNativeLooperDispatcher) {
        h.g.b.x.f(jVar, "wazeMainLooperDispatcher");
        h.g.b.x.f(wazeNativeLooperDispatcher, "wazeNativeLooperDispatcher");
        this.wazeMainLooperDispatcher = jVar;
        this.wazeNativeLooperDispatcher = wazeNativeLooperDispatcher;
    }

    static final void OnFallthroughClickOnMapJNI$lambda$0(u uVar, ScreenPoint screenPoint) {
        h.g.b.x.d(uVar, "null cannot be cast to non-null type com.waze.map.GenericCanvasNativeManager");
        h.g.b.x.c(screenPoint);
        ((GenericCanvasNativeManager) uVar).OnFallthroughClickOnMap$third_party_waze_client_android_project_map_canvas_src_main_generic_canvas_native_manager(screenPoint);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void UpdateMapBounds$default(u uVar, String str, MapBounds mapBounds, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: UpdateMapBounds");
        }
        if ((i2 & 4) != 0) {
            lVar = null;
        }
        uVar.UpdateMapBounds(str, mapBounds, lVar);
    }

    static final h.ab UpdateMapBounds$lambda$0(u uVar, String str, MapBounds mapBounds) {
        h.g.b.x.d(uVar, "null cannot be cast to non-null type com.waze.map.GenericCanvasNativeManager");
        ((GenericCanvasNativeManager) uVar).UpdateMapBoundsNTV(str, mapBounds != null ? mapBounds.toByteArray() : null);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void cleanupAndClose$default(u uVar, String str, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cleanupAndClose");
        }
        if ((i2 & 2) != 0) {
            lVar = null;
        }
        uVar.cleanupAndClose(str, lVar);
    }

    static final h.ab cleanupAndClose$lambda$0(u uVar, String str) {
        h.g.b.x.d(uVar, "null cannot be cast to non-null type com.waze.map.GenericCanvasNativeManager");
        ((GenericCanvasNativeManager) uVar).cleanupAndCloseNTV(str);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void generateEtaLabelPositions$default(u uVar, String str, GenerateMapObjectsPositionRequest generateMapObjectsPositionRequest, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: generateEtaLabelPositions");
        }
        if ((i2 & 4) != 0) {
            lVar = null;
        }
        uVar.generateEtaLabelPositions(str, generateMapObjectsPositionRequest, lVar);
    }

    static final byte[] generateEtaLabelPositions$lambda$0(u uVar, String str, GenerateMapObjectsPositionRequest generateMapObjectsPositionRequest) {
        h.g.b.x.d(uVar, "null cannot be cast to non-null type com.waze.map.GenericCanvasNativeManager");
        byte[] byteArray = generateMapObjectsPositionRequest.toByteArray();
        h.g.b.x.e(byteArray, "toByteArray(...)");
        return ((GenericCanvasNativeManager) uVar).generateEtaLabelPositionsNTV(str, byteArray);
    }

    static final h.ab generateEtaLabelPositions$lambda$1(h.g.a.l lVar, byte[] bArr) {
        GenerateMapObjectsPositionResult generateMapObjectsPositionResult;
        h.g.b.x.f(bArr, "resultBytes");
        try {
            generateMapObjectsPositionResult = (GenerateMapObjectsPositionResult) GenerateMapObjectsPositionResult.parser().c(bArr);
        } catch (com.google.v.eu unused) {
            generateMapObjectsPositionResult = null;
        }
        if (lVar != null) {
            lVar.invoke(generateMapObjectsPositionResult);
        }
        return h.ab.f48028a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void initNativeLayer$default(u uVar, String str, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: initNativeLayer");
        }
        if ((i2 & 2) != 0) {
            lVar = null;
        }
        uVar.initNativeLayer(str, lVar);
    }

    static final h.ab initNativeLayer$lambda$0(u uVar, String str) {
        h.g.b.x.d(uVar, "null cannot be cast to non-null type com.waze.map.GenericCanvasNativeManager");
        ((GenericCanvasNativeManager) uVar).initNativeLayerNTV(str);
        return null;
    }

    static final void onCanvasCreatedJNI$lambda$0(u uVar, String str) {
        h.g.b.x.d(uVar, "null cannot be cast to non-null type com.waze.map.GenericCanvasNativeManager");
        ((GenericCanvasNativeManager) uVar).onCanvasCreated$third_party_waze_client_android_project_map_canvas_src_main_generic_canvas_native_manager(str);
    }

    static final void onCanvasDestroyedJNI$lambda$0(u uVar, String str) {
        h.g.b.x.d(uVar, "null cannot be cast to non-null type com.waze.map.GenericCanvasNativeManager");
        ((GenericCanvasNativeManager) uVar).onCanvasDestroyed$third_party_waze_client_android_project_map_canvas_src_main_generic_canvas_native_manager(str);
    }

    static final void onMapDataShownJNI$lambda$0(u uVar, DisplayRects displayRects) {
        h.g.b.x.d(uVar, "null cannot be cast to non-null type com.waze.map.GenericCanvasNativeManager");
        h.g.b.x.c(displayRects);
        ((GenericCanvasNativeManager) uVar).onMapDataShown$third_party_waze_client_android_project_map_canvas_src_main_generic_canvas_native_manager(displayRects);
    }

    static final void onMapMovementStateChangedJNI$lambda$0(u uVar, MapMovementChanged mapMovementChanged) {
        h.g.b.x.d(uVar, "null cannot be cast to non-null type com.waze.map.GenericCanvasNativeManager");
        h.g.b.x.c(mapMovementChanged);
        ((GenericCanvasNativeManager) uVar).onMapMovementStateChanged$third_party_waze_client_android_project_map_canvas_src_main_generic_canvas_native_manager(mapMovementChanged);
    }

    static final void onMapVisibleAreaChangedJNI$lambda$0(u uVar, MapVisibleAreaChanged mapVisibleAreaChanged) {
        h.g.b.x.d(uVar, "null cannot be cast to non-null type com.waze.map.GenericCanvasNativeManager");
        h.g.b.x.c(mapVisibleAreaChanged);
        ((GenericCanvasNativeManager) uVar).onMapVisibleAreaChanged$third_party_waze_client_android_project_map_canvas_src_main_generic_canvas_native_manager(mapVisibleAreaChanged);
    }

    static final void onMarkerSelectedJNI$lambda$0(u uVar, String str) {
        h.g.b.x.d(uVar, "null cannot be cast to non-null type com.waze.map.GenericCanvasNativeManager");
        ((GenericCanvasNativeManager) uVar).onMarkerSelected$third_party_waze_client_android_project_map_canvas_src_main_generic_canvas_native_manager(str);
    }

    static final void onRouteSelectedFromMapJNI$lambda$0(u uVar, int i2) {
        h.g.b.x.d(uVar, "null cannot be cast to non-null type com.waze.map.GenericCanvasNativeManager");
        ((GenericCanvasNativeManager) uVar).onRouteSelectedFromMap$third_party_waze_client_android_project_map_canvas_src_main_generic_canvas_native_manager(i2);
    }

    static final void onSkinChangedJNI$lambda$0(u uVar, boolean z) {
        h.g.b.x.d(uVar, "null cannot be cast to non-null type com.waze.map.GenericCanvasNativeManager");
        ((GenericCanvasNativeManager) uVar).onSkinChanged$third_party_waze_client_android_project_map_canvas_src_main_generic_canvas_native_manager(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void performZoomIn$default(u uVar, String str, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: performZoomIn");
        }
        if ((i2 & 2) != 0) {
            lVar = null;
        }
        uVar.performZoomIn(str, lVar);
    }

    static final h.ab performZoomIn$lambda$0(u uVar, String str) {
        h.g.b.x.d(uVar, "null cannot be cast to non-null type com.waze.map.GenericCanvasNativeManager");
        ((GenericCanvasNativeManager) uVar).performZoomInNTV(str);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void performZoomOut$default(u uVar, String str, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: performZoomOut");
        }
        if ((i2 & 2) != 0) {
            lVar = null;
        }
        uVar.performZoomOut(str, lVar);
    }

    static final h.ab performZoomOut$lambda$0(u uVar, String str) {
        h.g.b.x.d(uVar, "null cannot be cast to non-null type com.waze.map.GenericCanvasNativeManager");
        ((GenericCanvasNativeManager) uVar).performZoomOutNTV(str);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setShowMapLoader$default(u uVar, String str, boolean z, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setShowMapLoader");
        }
        if ((i2 & 4) != 0) {
            lVar = null;
        }
        uVar.setShowMapLoader(str, z, lVar);
    }

    static final h.ab setShowMapLoader$lambda$0(u uVar, String str, boolean z) {
        h.g.b.x.d(uVar, "null cannot be cast to non-null type com.waze.map.GenericCanvasNativeManager");
        ((GenericCanvasNativeManager) uVar).setShowMapLoaderNTV(str, z);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void updateMapContent$default(u uVar, String str, MapContent mapContent, h.g.a.l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateMapContent");
        }
        if ((i2 & 4) != 0) {
            lVar = null;
        }
        uVar.updateMapContent(str, mapContent, lVar);
    }

    static final h.ab updateMapContent$lambda$0(u uVar, String str, MapContent mapContent) {
        h.g.b.x.d(uVar, "null cannot be cast to non-null type com.waze.map.GenericCanvasNativeManager");
        ((GenericCanvasNativeManager) uVar).updateMapContentNTV(str, mapContent != null ? mapContent.toByteArray() : null);
        return null;
    }

    protected final void OnFallthroughClickOnMapJNI(byte[] bArr) {
        h.g.b.x.f(bArr, NotificationCompat.CATEGORY_EVENT);
        try {
            this.wazeMainLooperDispatcher.post(new p(this, (ScreenPoint) ScreenPoint.parser().c(bArr), 2));
        } catch (com.google.v.eu unused) {
        }
    }

    public void UpdateMapBounds(String str, MapBounds mapBounds, h.g.a.l<? super h.ab, h.ab> lVar) {
        h.g.b.x.f(str, "canvasId");
        com.waze.aj.b.c(this.wazeNativeLooperDispatcher, new q(this, str, mapBounds, 0), lVar);
    }

    public void cleanupAndClose(String str, h.g.a.l<? super h.ab, h.ab> lVar) {
        h.g.b.x.f(str, "canvasId");
        com.waze.aj.b.c(this.wazeNativeLooperDispatcher, new r(this, str, 2), lVar);
    }

    public void generateEtaLabelPositions(String str, GenerateMapObjectsPositionRequest generateMapObjectsPositionRequest, h.g.a.l<? super GenerateMapObjectsPositionResult, h.ab> lVar) {
        h.g.b.x.f(str, "canvasId");
        h.g.b.x.f(generateMapObjectsPositionRequest, "request");
        com.waze.aj.b.c(this.wazeNativeLooperDispatcher, new q(this, str, generateMapObjectsPositionRequest, 1), new i(lVar, 5));
    }

    public final com.waze.native_managers.j getWazeMainLooperDispatcher() {
        return this.wazeMainLooperDispatcher;
    }

    public final WazeNativeLooperDispatcher getWazeNativeLooperDispatcher() {
        return this.wazeNativeLooperDispatcher;
    }

    public void initNativeLayer(String str, h.g.a.l<? super h.ab, h.ab> lVar) {
        h.g.b.x.f(str, "canvasId");
        com.waze.aj.b.c(this.wazeNativeLooperDispatcher, new r(this, str, 0), lVar);
    }

    protected final void onCanvasCreatedJNI(String str) {
        h.g.b.x.f(str, "canvasId");
        this.wazeMainLooperDispatcher.post(new p(this, str, 1));
    }

    protected final void onCanvasDestroyedJNI(String str) {
        h.g.b.x.f(str, "canvasId");
        this.wazeMainLooperDispatcher.post(new p(this, str, 5));
    }

    protected final void onMapDataShownJNI(byte[] bArr) {
        h.g.b.x.f(bArr, "displayRects");
        try {
            this.wazeMainLooperDispatcher.post(new p(this, (DisplayRects) DisplayRects.parser().c(bArr), 0));
        } catch (com.google.v.eu unused) {
        }
    }

    protected final void onMapMovementStateChangedJNI(byte[] bArr) {
        h.g.b.x.f(bArr, "protoEvent");
        try {
            this.wazeMainLooperDispatcher.post(new p(this, (MapMovementChanged) MapMovementChanged.parser().c(bArr), 6));
        } catch (com.google.v.eu unused) {
        }
    }

    protected final void onMapVisibleAreaChangedJNI(byte[] bArr) {
        h.g.b.x.f(bArr, NotificationCompat.CATEGORY_EVENT);
        try {
            this.wazeMainLooperDispatcher.post(new p(this, (MapVisibleAreaChanged) MapVisibleAreaChanged.parser().c(bArr), 4));
        } catch (com.google.v.eu unused) {
        }
    }

    protected final void onMarkerSelectedJNI(String str) {
        h.g.b.x.f(str, "markerId");
        this.wazeMainLooperDispatcher.post(new p(this, str, 3));
    }

    protected final void onRouteSelectedFromMapJNI(final int i2) {
        this.wazeMainLooperDispatcher.post(new Runnable() { // from class: com.waze.map.t
            @Override // java.lang.Runnable
            public final void run() {
                u.onRouteSelectedFromMapJNI$lambda$0(this.f29599a, i2);
            }
        });
    }

    protected final void onSkinChangedJNI(boolean z) {
        this.wazeMainLooperDispatcher.post(new bf(this, z, 1));
    }

    public void performZoomIn(String str, h.g.a.l<? super h.ab, h.ab> lVar) {
        h.g.b.x.f(str, "canvasId");
        com.waze.aj.b.c(this.wazeNativeLooperDispatcher, new r(this, str, 1), lVar);
    }

    public void performZoomOut(String str, h.g.a.l<? super h.ab, h.ab> lVar) {
        h.g.b.x.f(str, "canvasId");
        com.waze.aj.b.c(this.wazeNativeLooperDispatcher, new r(this, str, 3), lVar);
    }

    public void setShowMapLoader(final String str, final boolean z, h.g.a.l<? super h.ab, h.ab> lVar) {
        h.g.b.x.f(str, "canvasId");
        com.waze.aj.b.c(this.wazeNativeLooperDispatcher, new h.g.a.a() { // from class: com.waze.map.s
            @Override // h.g.a.a
            public final Object invoke() {
                u.setShowMapLoader$lambda$0(this.f29596a, str, z);
                return null;
            }
        }, lVar);
    }

    public void updateMapContent(String str, MapContent mapContent, h.g.a.l<? super h.ab, h.ab> lVar) {
        h.g.b.x.f(str, "canvasId");
        com.waze.aj.b.c(this.wazeNativeLooperDispatcher, new q(this, str, mapContent, 2), lVar);
    }

    public final void setShowMapLoader(String str, boolean z) {
        h.g.b.x.f(str, "canvasId");
        setShowMapLoader$default(this, str, z, null, 4, null);
    }

    public final void UpdateMapBounds(String str, MapBounds mapBounds) {
        h.g.b.x.f(str, "canvasId");
        UpdateMapBounds$default(this, str, mapBounds, null, 4, null);
    }

    public final void cleanupAndClose(String str) {
        h.g.b.x.f(str, "canvasId");
        cleanupAndClose$default(this, str, null, 2, null);
    }

    public final void initNativeLayer(String str) {
        h.g.b.x.f(str, "canvasId");
        initNativeLayer$default(this, str, null, 2, null);
    }

    public final void performZoomIn(String str) {
        h.g.b.x.f(str, "canvasId");
        performZoomIn$default(this, str, null, 2, null);
    }

    public final void performZoomOut(String str) {
        h.g.b.x.f(str, "canvasId");
        performZoomOut$default(this, str, null, 2, null);
    }

    public final void updateMapContent(String str, MapContent mapContent) {
        h.g.b.x.f(str, "canvasId");
        updateMapContent$default(this, str, mapContent, null, 4, null);
    }

    public final void generateEtaLabelPositions(String str, GenerateMapObjectsPositionRequest generateMapObjectsPositionRequest) {
        h.g.b.x.f(str, "canvasId");
        h.g.b.x.f(generateMapObjectsPositionRequest, "request");
        generateEtaLabelPositions$default(this, str, generateMapObjectsPositionRequest, null, 4, null);
    }
}
