package com.waze.map;

import androidx.core.app.NotificationCompat;
import com.waze.jni.protos.ConversionExtensionsKt;
import com.waze.jni.protos.EtaLabelDefinitions;
import com.waze.jni.protos.Position;
import com.waze.jni.protos.map.DisplayRects;
import com.waze.jni.protos.map.GenerateMapObjectsPositionRequest;
import com.waze.jni.protos.map.MapBounds;
import com.waze.jni.protos.map.MapConfiguration;
import com.waze.jni.protos.map.MapMovementChanged;
import com.waze.jni.protos.map.MapVisibleAreaChanged;
import com.waze.jni.protos.map.Marker;
import com.waze.jni.protos.map.Polyline;
import com.waze.jni.protos.map.RouteEtaLabelPositionAndAlignment;
import com.waze.jni.protos.map.ScreenPoint;
import com.waze.native_managers.WazeNativeLooperDispatcher;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.CompletableDeferred;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class GenericCanvasNativeManager extends u implements com.waze.map.canvas.a.e {
    private com.waze.map.b.cs _mapDataShowingState;
    private com.waze.map.b.dk _mapMovementState;
    private com.waze.map.b.dx _mapSkinState;
    private com.waze.map.b.dm _mapVisibleAreaState;
    private final String canvasId;
    private final List<com.waze.map.canvas.a.c> jniAdapters;
    private final boolean supportPolylines;
    private final boolean supportShowingLoader;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GenericCanvasNativeManager(String str, com.waze.native_managers.j jVar, WazeNativeLooperDispatcher wazeNativeLooperDispatcher) {
        super(jVar, wazeNativeLooperDispatcher);
        h.g.b.x.f(str, "canvasId");
        h.g.b.x.f(jVar, "wazeMainLooperDispatcher");
        h.g.b.x.f(wazeNativeLooperDispatcher, "wazeNativeLooperDispatcher");
        this.canvasId = str;
        this.jniAdapters = new ArrayList();
        this._mapSkinState = com.waze.map.b.dx.f28228a;
        this._mapMovementState = com.waze.map.b.dk.f28192a;
        this.supportShowingLoader = true;
    }

    static final h.ab performZoomIn$lambda$0(CompletableDeferred completableDeferred, h.ab abVar) {
        h.ab abVar2 = h.ab.f48028a;
        completableDeferred.a(abVar2);
        return abVar2;
    }

    static final h.ab performZoomOut$lambda$0(CompletableDeferred completableDeferred, h.ab abVar) {
        h.ab abVar2 = h.ab.f48028a;
        completableDeferred.a(abVar2);
        return abVar2;
    }

    static final h.ab setShowMapLoader$lambda$0(CompletableDeferred completableDeferred, h.ab abVar) {
        h.ab abVar2 = h.ab.f48028a;
        completableDeferred.a(abVar2);
        return abVar2;
    }

    private final com.waze.map.b.dk toKotlinEnum(MapMovementChanged.MapMovementState mapMovementState) {
        Marker.Alignment alignment = Marker.Alignment.ALIGNMENT_UNKNOWN;
        MapMovementChanged.MapMovementState mapMovementState2 = MapMovementChanged.MapMovementState.IDLE_AFTER_TOUCH;
        switch (mapMovementState.ordinal()) {
            case 0:
                return com.waze.map.b.dk.f28193b;
            case 1:
                return com.waze.map.b.dk.f28194c;
            case 2:
                return com.waze.map.b.dk.f28195d;
            case 3:
                return com.waze.map.b.dk.f28196e;
            case 4:
                return com.waze.map.b.dk.f28197f;
            case 5:
                return com.waze.map.b.dk.f28198g;
            case 6:
                return com.waze.map.b.dk.f28192a;
            default:
                throw new h.i();
        }
    }

    private final EtaLabelDefinitions.PinAlignment toPinAlignment(Marker.Alignment alignment) {
        Marker.Alignment alignment2 = Marker.Alignment.ALIGNMENT_UNKNOWN;
        MapMovementChanged.MapMovementState mapMovementState = MapMovementChanged.MapMovementState.IDLE_AFTER_TOUCH;
        int iOrdinal = alignment.ordinal();
        return iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? iOrdinal != 4 ? EtaLabelDefinitions.PinAlignment.TOP_LEFT : EtaLabelDefinitions.PinAlignment.TOP_RIGHT : EtaLabelDefinitions.PinAlignment.BOTTOM_RIGHT : EtaLabelDefinitions.PinAlignment.BOTTOM_LEFT : EtaLabelDefinitions.PinAlignment.TOP_LEFT;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<Long, com.waze.map.b.dq> toRouteDataMap(Map<Long, RouteEtaLabelPositionAndAlignment> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(h.a.r.a(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            Position.IntPosition position = ((RouteEtaLabelPositionAndAlignment) entry.getValue()).getPosition();
            h.g.b.x.e(position, "getPosition(...)");
            Marker.Alignment alignment = ((RouteEtaLabelPositionAndAlignment) entry.getValue()).getAlignment();
            h.g.b.x.e(alignment, "getAlignment(...)");
            linkedHashMap.put(key, new com.waze.map.b.dq(position, toPinAlignment(alignment)));
        }
        return linkedHashMap;
    }

    static final h.ab updateMapBounds$lambda$0(CompletableDeferred completableDeferred, h.ab abVar) {
        h.ab abVar2 = h.ab.f48028a;
        completableDeferred.a(abVar2);
        return abVar2;
    }

    static final h.ab updateMapContent$lambda$0(CompletableDeferred completableDeferred, h.ab abVar) {
        h.ab abVar2 = h.ab.f48028a;
        completableDeferred.a(abVar2);
        return abVar2;
    }

    public final void OnFallthroughClickOnMap$third_party_waze_client_android_project_map_canvas_src_main_generic_canvas_native_manager(ScreenPoint screenPoint) {
        h.g.b.x.f(screenPoint, NotificationCompat.CATEGORY_EVENT);
        com.waze.map.b.dw dwVar = new com.waze.map.b.dw(screenPoint.getX(), screenPoint.getY());
        Iterator<T> it = this.jniAdapters.iterator();
        while (it.hasNext()) {
            ((com.waze.map.canvas.a.c) it.next()).d(dwVar);
        }
    }

    public final native void UpdateMapBoundsNTV(String str, byte[] bArr);

    @Override // com.waze.map.canvas.a.e
    public Object addJniAdapter(com.waze.map.canvas.a.c cVar, h.c.e<? super com.waze.shared_infra.s.d> eVar) {
        this.jniAdapters.add(cVar);
        cVar.o(this._mapSkinState);
        cVar.i(this._mapMovementState);
        cVar.q(this._mapVisibleAreaState);
        cVar.f(this._mapDataShowingState);
        return new ca(this, cVar, 1);
    }

    @Override // com.waze.map.canvas.a.e
    public void cleanupAndClose() {
        cleanupAndClose(this.canvasId, new gl(1));
    }

    public final native void cleanupAndCloseNTV(String str);

    @Override // com.waze.map.canvas.a.e
    public Object generateEtaLabelPositions(List<com.waze.map.b.dp> list, List<com.waze.shared_infra.h.c> list2, h.c.e<? super Map<Long, com.waze.map.b.dq>> eVar) {
        GenerateMapObjectsPositionRequest.Builder builderNewBuilder = GenerateMapObjectsPositionRequest.newBuilder();
        List<com.waze.shared_infra.h.c> list3 = list2;
        ArrayList arrayList = new ArrayList(h.a.i.q(list3, 10));
        Iterator<T> it = list3.iterator();
        while (it.hasNext()) {
            arrayList.add(ConversionExtensionsKt.toIntPosition((com.waze.shared_infra.h.c) it.next()));
        }
        builderNewBuilder.addAllCoordinatesToBeFarFrom(arrayList);
        List<com.waze.map.b.dp> list4 = list;
        ArrayList arrayList2 = new ArrayList(h.a.i.q(list4, 10));
        for (com.waze.map.b.dp dpVar : list4) {
            Polyline.Builder builderNewBuilder2 = Polyline.newBuilder();
            List listB = dpVar.b();
            ArrayList arrayList3 = new ArrayList(h.a.i.q(listB, 10));
            Iterator it2 = listB.iterator();
            while (it2.hasNext()) {
                arrayList3.add(ConversionExtensionsKt.toIntPosition((com.waze.shared_infra.h.c) it2.next()));
            }
            builderNewBuilder2.addAllPosition(arrayList3);
            builderNewBuilder2.setId((int) dpVar.a());
            arrayList2.add(builderNewBuilder2.build());
        }
        builderNewBuilder.addAllPolylines(arrayList2);
        h.g.b.x.e(builderNewBuilder, "addAllPolylines(...)");
        kotlinx.coroutines.l lVar = new kotlinx.coroutines.l(h.c.a.h.d(eVar), 1);
        lVar.u();
        String canvasId = getCanvasId();
        GenerateMapObjectsPositionRequest generateMapObjectsPositionRequestBuild = builderNewBuilder.build();
        h.g.b.x.e(generateMapObjectsPositionRequestBuild, "build(...)");
        generateEtaLabelPositions(canvasId, generateMapObjectsPositionRequestBuild, new j(lVar, this));
        Object objJ = lVar.j();
        if (objJ == h.c.a.a.f48038a) {
            h.d.b.c(eVar);
        }
        return objJ;
    }

    public final native byte[] generateEtaLabelPositionsNTV(String str, byte[] bArr);

    public final String getCanvasId() {
        return this.canvasId;
    }

    @Override // com.waze.map.canvas.a.e
    public boolean getSupportPolylines() {
        return this.supportPolylines;
    }

    @Override // com.waze.map.canvas.a.e
    public boolean getSupportShowingLoader() {
        return this.supportShowingLoader;
    }

    public final native void initNativeLayerNTV(String str);

    @Override // com.waze.map.canvas.a.e
    public Object initialize(h.c.e<? super h.ab> eVar) {
        u.initNativeLayer$default(this, this.canvasId, null, 2, null);
        return h.ab.f48028a;
    }

    public final void onCanvasCreated$third_party_waze_client_android_project_map_canvas_src_main_generic_canvas_native_manager(String str) {
        h.g.b.x.f(str, "canvasId");
        com.waze.shared_infra.i.h.a("onCanvasCreated(canvasId:" + str + ")");
    }

    public final void onCanvasDestroyed$third_party_waze_client_android_project_map_canvas_src_main_generic_canvas_native_manager(String str) {
        h.g.b.x.f(str, "canvasId");
        com.waze.shared_infra.i.h.a("onCanvasDestroyed(canvasId:" + str + ")");
    }

    public final void onMapDataShown$third_party_waze_client_android_project_map_canvas_src_main_generic_canvas_native_manager(DisplayRects displayRects) {
        h.g.b.x.f(displayRects, "displayRects");
        com.waze.map.b.cs csVar = new com.waze.map.b.cs(displayRects);
        this._mapDataShowingState = csVar;
        Iterator<T> it = this.jniAdapters.iterator();
        while (it.hasNext()) {
            ((com.waze.map.canvas.a.c) it.next()).f(csVar);
        }
    }

    public final void onMapMovementStateChanged$third_party_waze_client_android_project_map_canvas_src_main_generic_canvas_native_manager(MapMovementChanged mapMovementChanged) {
        h.g.b.x.f(mapMovementChanged, "protoEvent");
        MapMovementChanged.MapMovementState newState = mapMovementChanged.getNewState();
        h.g.b.x.e(newState, "getNewState(...)");
        com.waze.map.b.dk kotlinEnum = toKotlinEnum(newState);
        this._mapMovementState = kotlinEnum;
        Iterator<T> it = this.jniAdapters.iterator();
        while (it.hasNext()) {
            ((com.waze.map.canvas.a.c) it.next()).i(kotlinEnum);
        }
    }

    public final void onMapVisibleAreaChanged$third_party_waze_client_android_project_map_canvas_src_main_generic_canvas_native_manager(MapVisibleAreaChanged mapVisibleAreaChanged) {
        h.g.b.x.f(mapVisibleAreaChanged, NotificationCompat.CATEGORY_EVENT);
        MapVisibleAreaChanged.CornersPolygon viewportCornersPolygon = mapVisibleAreaChanged.getNewArea().getViewportCornersPolygon();
        h.g.b.x.e(viewportCornersPolygon, "getViewportCornersPolygon(...)");
        com.waze.map.b.ci ciVarF = com.waze.google_assistant.an.f(viewportCornersPolygon);
        MapVisibleAreaChanged.CornersPolygon fullscreenCornersPolygon = mapVisibleAreaChanged.getNewArea().getFullscreenCornersPolygon();
        h.g.b.x.e(fullscreenCornersPolygon, "getFullscreenCornersPolygon(...)");
        com.waze.map.b.ci ciVarF2 = com.waze.google_assistant.an.f(fullscreenCornersPolygon);
        float orientationDegrees = mapVisibleAreaChanged.getNewArea().getOrientationDegrees();
        Position.IntPosition viewportCenter = mapVisibleAreaChanged.getNewArea().getViewportCenter();
        h.g.b.x.e(viewportCenter, "getViewportCenter(...)");
        com.waze.map.b.dm dmVar = new com.waze.map.b.dm(ciVarF, ciVarF2, cc.a(viewportCenter), orientationDegrees, mapVisibleAreaChanged.getNewArea().getCameraAngleDegrees(), mapVisibleAreaChanged.getNewArea().getZoomNormalized());
        this._mapVisibleAreaState = dmVar;
        Iterator<T> it = this.jniAdapters.iterator();
        while (it.hasNext()) {
            ((com.waze.map.canvas.a.c) it.next()).q(dmVar);
        }
    }

    public final void onMarkerSelected$third_party_waze_client_android_project_map_canvas_src_main_generic_canvas_native_manager(String str) {
        h.g.b.x.f(str, "markerId");
        Iterator<T> it = this.jniAdapters.iterator();
        while (it.hasNext()) {
            ((com.waze.map.canvas.a.c) it.next()).h(str);
        }
    }

    public final void onRouteSelectedFromMap$third_party_waze_client_android_project_map_canvas_src_main_generic_canvas_native_manager(int i2) {
        Iterator<T> it = this.jniAdapters.iterator();
        while (it.hasNext()) {
            ((com.waze.map.canvas.a.c) it.next()).n(i2);
        }
    }

    public final void onSkinChanged$third_party_waze_client_android_project_map_canvas_src_main_generic_canvas_native_manager(boolean z) {
        com.waze.map.b.dx dxVar = z ? com.waze.map.b.dx.f28229b : com.waze.map.b.dx.f28230c;
        this._mapSkinState = dxVar;
        Iterator<T> it = this.jniAdapters.iterator();
        while (it.hasNext()) {
            ((com.waze.map.canvas.a.c) it.next()).o(dxVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.waze.map.canvas.a.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object performZoomIn(h.c.e<? super h.ab> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.waze.map.k
            if (r0 == 0) goto L13
            r0 = r7
            com.waze.map.k r0 = (com.waze.map.k) r0
            int r1 = r0.f29288c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f29288c = r1
            goto L18
        L13:
            com.waze.map.k r0 = new com.waze.map.k
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f29286a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f29288c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            e.b.c.b(r7)     // Catch: java.lang.Throwable -> L4c
            goto L50
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            e.b.c.b(r7)
            java.lang.String r7 = r6.canvasId
            kotlinx.coroutines.CompletableDeferred r2 = kotlinx.coroutines.bo.j()
            com.waze.map.i r4 = new com.waze.map.i
            r5 = 3
            r4.<init>(r2, r5)
            r6.performZoomIn(r7, r4)
            com.waze.map.GenericCanvasNativeManager r6 = (com.waze.map.GenericCanvasNativeManager) r6     // Catch: java.lang.Throwable -> L4c
            r0.f29288c = r3     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r6 = r2.c(r0)     // Catch: java.lang.Throwable -> L4c
            if (r6 != r1) goto L50
            return r1
        L4c:
            r6 = move-exception
            e.b.c.a(r6)
        L50:
            h.ab r6 = h.ab.f48028a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.map.GenericCanvasNativeManager.performZoomIn(h.c.e):java.lang.Object");
    }

    public final native void performZoomInNTV(String str);

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.waze.map.canvas.a.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object performZoomOut(h.c.e<? super h.ab> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.waze.map.l
            if (r0 == 0) goto L13
            r0 = r7
            com.waze.map.l r0 = (com.waze.map.l) r0
            int r1 = r0.f29291c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f29291c = r1
            goto L18
        L13:
            com.waze.map.l r0 = new com.waze.map.l
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f29289a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f29291c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            e.b.c.b(r7)     // Catch: java.lang.Throwable -> L4c
            goto L50
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            e.b.c.b(r7)
            java.lang.String r7 = r6.canvasId
            kotlinx.coroutines.CompletableDeferred r2 = kotlinx.coroutines.bo.j()
            com.waze.map.i r4 = new com.waze.map.i
            r5 = 4
            r4.<init>(r2, r5)
            r6.performZoomOut(r7, r4)
            com.waze.map.GenericCanvasNativeManager r6 = (com.waze.map.GenericCanvasNativeManager) r6     // Catch: java.lang.Throwable -> L4c
            r0.f29291c = r3     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r6 = r2.c(r0)     // Catch: java.lang.Throwable -> L4c
            if (r6 != r1) goto L50
            return r1
        L4c:
            r6 = move-exception
            e.b.c.a(r6)
        L50:
            h.ab r6 = h.ab.f48028a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.map.GenericCanvasNativeManager.performZoomOut(h.c.e):java.lang.Object");
    }

    public final native void performZoomOutNTV(String str);

    @Override // com.waze.map.canvas.a.e
    public Object setDarkenHighlight(com.waze.shared_infra.h.c cVar, h.c.e<? super h.ab> eVar) {
        com.waze.shared_infra.i.h.j("setDarkenHighlight not supported in GenericCanvas");
        return h.ab.f48028a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.waze.map.canvas.a.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object setShowMapLoader(boolean r7, h.c.e<? super h.ab> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.waze.map.m
            if (r0 == 0) goto L13
            r0 = r8
            com.waze.map.m r0 = (com.waze.map.m) r0
            int r1 = r0.f29294c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f29294c = r1
            goto L18
        L13:
            com.waze.map.m r0 = new com.waze.map.m
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f29292a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f29294c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            e.b.c.b(r8)     // Catch: java.lang.Throwable -> L4c
            goto L50
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            e.b.c.b(r8)
            java.lang.String r8 = r6.canvasId
            kotlinx.coroutines.CompletableDeferred r2 = kotlinx.coroutines.bo.j()
            com.waze.map.i r4 = new com.waze.map.i
            r5 = 0
            r4.<init>(r2, r5)
            r6.setShowMapLoader(r8, r7, r4)
            com.waze.map.GenericCanvasNativeManager r6 = (com.waze.map.GenericCanvasNativeManager) r6     // Catch: java.lang.Throwable -> L4c
            r0.f29294c = r3     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r6 = r2.c(r0)     // Catch: java.lang.Throwable -> L4c
            if (r6 != r1) goto L50
            return r1
        L4c:
            r6 = move-exception
            e.b.c.a(r6)
        L50:
            h.ab r6 = h.ab.f48028a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.map.GenericCanvasNativeManager.setShowMapLoader(boolean, h.c.e):java.lang.Object");
    }

    public final native void setShowMapLoaderNTV(String str, boolean z);

    @Override // com.waze.map.canvas.a.e
    public Object setUserLocationOffset(MapBounds.PositionPercentage positionPercentage, boolean z, h.c.e<? super h.ab> eVar) {
        com.waze.shared_infra.i.h.j("setUserLocationOffset not supported in GenericCanvas");
        return h.ab.f48028a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.waze.map.canvas.a.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object updateMapBounds(com.waze.jni.protos.map.MapBounds r7, h.c.e<? super h.ab> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.waze.map.n
            if (r0 == 0) goto L13
            r0 = r8
            com.waze.map.n r0 = (com.waze.map.n) r0
            int r1 = r0.f29484c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f29484c = r1
            goto L18
        L13:
            com.waze.map.n r0 = new com.waze.map.n
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f29482a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f29484c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            e.b.c.b(r8)     // Catch: java.lang.Throwable -> L4c
            goto L50
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            e.b.c.b(r8)
            java.lang.String r8 = r6.canvasId
            kotlinx.coroutines.CompletableDeferred r2 = kotlinx.coroutines.bo.j()
            com.waze.map.i r4 = new com.waze.map.i
            r5 = 2
            r4.<init>(r2, r5)
            r6.UpdateMapBounds(r8, r7, r4)
            com.waze.map.GenericCanvasNativeManager r6 = (com.waze.map.GenericCanvasNativeManager) r6     // Catch: java.lang.Throwable -> L4c
            r0.f29484c = r3     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r6 = r2.c(r0)     // Catch: java.lang.Throwable -> L4c
            if (r6 != r1) goto L50
            return r1
        L4c:
            r6 = move-exception
            e.b.c.a(r6)
        L50:
            h.ab r6 = h.ab.f48028a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.map.GenericCanvasNativeManager.updateMapBounds(com.waze.jni.protos.map.MapBounds, h.c.e):java.lang.Object");
    }

    @Override // com.waze.map.canvas.a.e
    public Object updateMapConfiguration(MapConfiguration mapConfiguration, h.c.e<? super h.ab> eVar) {
        com.waze.shared_infra.i.h.j("Got configuration {" + mapConfiguration + "} but Generic canvas doesn't support configuration, ignoring! (only wazeMapService supports configuration)");
        return h.ab.f48028a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.waze.map.canvas.a.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object updateMapContent(com.waze.jni.protos.map.MapContent r6, h.c.e<? super h.ab> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.waze.map.o
            if (r0 == 0) goto L13
            r0 = r7
            com.waze.map.o r0 = (com.waze.map.o) r0
            int r1 = r0.f29487c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f29487c = r1
            goto L18
        L13:
            com.waze.map.o r0 = new com.waze.map.o
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f29485a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f29487c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            e.b.c.b(r7)     // Catch: java.lang.Throwable -> L4b
            goto L4f
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            e.b.c.b(r7)
            java.lang.String r7 = r5.canvasId
            kotlinx.coroutines.CompletableDeferred r2 = kotlinx.coroutines.bo.j()
            com.waze.map.i r4 = new com.waze.map.i
            r4.<init>(r2, r3)
            r5.updateMapContent(r7, r6, r4)
            com.waze.map.GenericCanvasNativeManager r5 = (com.waze.map.GenericCanvasNativeManager) r5     // Catch: java.lang.Throwable -> L4b
            r0.f29487c = r3     // Catch: java.lang.Throwable -> L4b
            java.lang.Object r5 = r2.c(r0)     // Catch: java.lang.Throwable -> L4b
            if (r5 != r1) goto L4f
            return r1
        L4b:
            r5 = move-exception
            e.b.c.a(r5)
        L4f:
            h.ab r5 = h.ab.f48028a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.map.GenericCanvasNativeManager.updateMapContent(com.waze.jni.protos.map.MapContent, h.c.e):java.lang.Object");
    }

    public final native void updateMapContentNTV(String str, byte[] bArr);
}
