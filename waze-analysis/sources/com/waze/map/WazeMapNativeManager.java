package com.waze.map;

import androidx.core.app.NotificationCompat;
import com.waze.jni.protos.ConversionExtensionsKt;
import com.waze.jni.protos.EtaLabelDefinitions;
import com.waze.jni.protos.Position;
import com.waze.jni.protos.map.ClickedPoiType;
import com.waze.jni.protos.map.GenerateMapObjectsPositionRequest;
import com.waze.jni.protos.map.GenerateMapObjectsPositionResult;
import com.waze.jni.protos.map.MapBounds;
import com.waze.jni.protos.map.MapConfiguration;
import com.waze.jni.protos.map.MapContent;
import com.waze.jni.protos.map.MapMovementChanged;
import com.waze.jni.protos.map.MapNorthLockChanged;
import com.waze.jni.protos.map.MapVisibleAreaChanged;
import com.waze.jni.protos.map.Marker;
import com.waze.jni.protos.map.NorthLockBehavior;
import com.waze.jni.protos.map.PoiClicked;
import com.waze.jni.protos.map.Polyline;
import com.waze.jni.protos.map.RouteEtaLabelPositionAndAlignment;
import com.waze.jni.protos.map.ScreenPoint;
import com.waze.map.b.Cdo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public class WazeMapNativeManager extends gq implements com.waze.map.canvas.a.e {
    private final kotlinx.coroutines.ab backgroundDispatcher;
    private final List<com.waze.map.canvas.a.c> jniAdapters;
    private final String mapId;
    private final boolean supportPolylines;
    private final boolean supportShowingLoader;

    public WazeMapNativeManager(String str, kotlinx.coroutines.ab abVar) {
        h.g.b.x.f(str, "mapId");
        h.g.b.x.f(abVar, "backgroundDispatcher");
        this.mapId = str;
        this.backgroundDispatcher = abVar;
        this.jniAdapters = new ArrayList();
        this.supportPolylines = true;
    }

    static /* synthetic */ Object addJniAdapter$suspendImpl(WazeMapNativeManager wazeMapNativeManager, com.waze.map.canvas.a.c cVar, h.c.e<? super com.waze.shared_infra.s.d> eVar) {
        wazeMapNativeManager.jniAdapters.add(cVar);
        return new ca(wazeMapNativeManager, cVar, 2);
    }

    private final void forEveryAdapter(h.g.a.l<? super com.waze.map.canvas.a.c, h.ab> lVar) {
        for (com.waze.map.canvas.a.c cVar : h.a.i.ao(this.jniAdapters)) {
            if (this.jniAdapters.contains(cVar)) {
                lVar.invoke(cVar);
            }
        }
    }

    static /* synthetic */ Object generateEtaLabelPositions$suspendImpl(WazeMapNativeManager wazeMapNativeManager, List<com.waze.map.b.dp> list, List<com.waze.shared_infra.h.c> list2, h.c.e<? super Map<Long, com.waze.map.b.dq>> eVar) {
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
        String str = wazeMapNativeManager.mapId;
        byte[] byteArray = builderNewBuilder.build().toByteArray();
        h.g.b.x.e(byteArray, "toByteArray(...)");
        byte[] bArrNativeGenerateEtaLabelPositions = wazeMapNativeManager.nativeGenerateEtaLabelPositions(str, byteArray);
        if (bArrNativeGenerateEtaLabelPositions == null) {
            com.waze.shared_infra.i.h.j("null result from native layer");
            return h.a.r.j();
        }
        GenerateMapObjectsPositionResult from = GenerateMapObjectsPositionResult.parseFrom(bArrNativeGenerateEtaLabelPositions);
        h.g.b.x.e(from, "parseFrom(...)");
        Map<Long, RouteEtaLabelPositionAndAlignment> resultMap = from.getResultMap();
        h.g.b.x.e(resultMap, "getResultMap(...)");
        LinkedHashMap linkedHashMap = new LinkedHashMap(h.a.r.a(resultMap.size()));
        Iterator<T> it3 = resultMap.entrySet().iterator();
        while (it3.hasNext()) {
            Map.Entry entry = (Map.Entry) it3.next();
            Object key = entry.getKey();
            Position.IntPosition position = ((RouteEtaLabelPositionAndAlignment) entry.getValue()).getPosition();
            h.g.b.x.e(position, "getPosition(...)");
            Marker.Alignment alignment = ((RouteEtaLabelPositionAndAlignment) entry.getValue()).getAlignment();
            h.g.b.x.e(alignment, "getAlignment(...)");
            Marker.Alignment alignment2 = Marker.Alignment.ALIGNMENT_UNKNOWN;
            NorthLockBehavior northLockBehavior = NorthLockBehavior.UNLOCKED;
            ClickedPoiType clickedPoiType = ClickedPoiType.HOME;
            int iOrdinal = alignment.ordinal();
            linkedHashMap.put(key, new com.waze.map.b.dq(position, iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? iOrdinal != 4 ? EtaLabelDefinitions.PinAlignment.TOP_LEFT : EtaLabelDefinitions.PinAlignment.TOP_RIGHT : EtaLabelDefinitions.PinAlignment.BOTTOM_RIGHT : EtaLabelDefinitions.PinAlignment.BOTTOM_LEFT : EtaLabelDefinitions.PinAlignment.TOP_LEFT));
        }
        com.waze.shared_infra.i.h.a("did calculate " + linkedHashMap.size() + " positions for ETA labels");
        return linkedHashMap;
    }

    static /* synthetic */ Object initialize$suspendImpl(WazeMapNativeManager wazeMapNativeManager, h.c.e<? super h.ab> eVar) {
        wazeMapNativeManager.nativeInit(wazeMapNativeManager.mapId);
        return h.ab.f48028a;
    }

    private final native void nativeClearDarkWithHighlight(String str);

    private final native byte[] nativeGenerateEtaLabelPositions(String str, byte[] bArr);

    private final native void nativeInit(String str);

    private final native void nativePerformZoomIn(String str, boolean z);

    private final native void nativePerformZoomOut(String str, boolean z);

    /* JADX INFO: Access modifiers changed from: private */
    public final native void nativePrepareMapContent(String str, byte[] bArr);

    private final native void nativeSetDarkWithHighlight(String str, int i2, int i3);

    private final native void nativeSetUserLocationOffset(String str, float f2, float f3, boolean z);

    private final native void nativeUpdateMapBounds(String str, byte[] bArr);

    private final native void nativeUpdateMapConfiguration(String str, byte[] bArr);

    private final native void nativeUpdateMapContent(String str);

    static final h.ab onAdClicked$lambda$0(String str, com.waze.map.canvas.a.c cVar) {
        h.g.b.x.f(cVar, "it");
        cVar.a(str);
        return h.ab.f48028a;
    }

    static final h.ab onAlertClicked$lambda$0(int i2, com.waze.shared_infra.h.c cVar, com.waze.map.canvas.a.c cVar2) {
        h.g.b.x.f(cVar2, "it");
        cVar2.b(i2, cVar);
        return h.ab.f48028a;
    }

    static final h.ab onExternalPoiClicked$lambda$0(int i2, com.waze.shared_infra.h.c cVar, com.waze.map.canvas.a.c cVar2) {
        h.g.b.x.f(cVar2, "it");
        cVar2.c(i2, cVar);
        return h.ab.f48028a;
    }

    static final h.ab onLongClick$lambda$0(com.waze.shared_infra.h.c cVar, com.waze.map.canvas.a.c cVar2) {
        h.g.b.x.f(cVar2, "it");
        cVar2.e(cVar);
        return h.ab.f48028a;
    }

    static final h.ab onMapFallthroughClick$lambda$0(ScreenPoint screenPoint, com.waze.map.canvas.a.c cVar) {
        h.g.b.x.f(cVar, "it");
        cVar.d(new com.waze.map.b.dw(screenPoint.getX(), screenPoint.getY()));
        return h.ab.f48028a;
    }

    static final h.ab onMapInteractionStarted$lambda$0(com.waze.map.canvas.a.c cVar) {
        h.g.b.x.f(cVar, "it");
        cVar.g();
        return h.ab.f48028a;
    }

    static final h.ab onMapMovementStateChanged$lambda$0(com.waze.map.b.dk dkVar, com.waze.map.canvas.a.c cVar) {
        h.g.b.x.f(cVar, "it");
        cVar.i(dkVar);
        return h.ab.f48028a;
    }

    static final h.ab onMapNorthLockBehaviorChanged$lambda$0(MapNorthLockChanged mapNorthLockChanged, com.waze.map.canvas.a.c cVar) {
        Cdo cdo;
        h.g.b.x.f(cVar, "it");
        NorthLockBehavior northLock = mapNorthLockChanged.getNorthLock();
        h.g.b.x.e(northLock, "getNorthLock(...)");
        Marker.Alignment alignment = Marker.Alignment.ALIGNMENT_UNKNOWN;
        NorthLockBehavior northLockBehavior = NorthLockBehavior.UNLOCKED;
        ClickedPoiType clickedPoiType = ClickedPoiType.HOME;
        int iOrdinal = northLock.ordinal();
        if (iOrdinal == 0) {
            cdo = Cdo.f28213a;
        } else if (iOrdinal == 1) {
            cdo = Cdo.f28214b;
        } else if (iOrdinal == 2) {
            cdo = Cdo.f28215c;
        } else {
            if (iOrdinal != 3) {
                throw new h.i();
            }
            cdo = null;
        }
        cVar.j(cdo);
        return h.ab.f48028a;
    }

    static final h.ab onMapVisibleAreaChanged$lambda$0(com.waze.map.b.dm dmVar, com.waze.map.canvas.a.c cVar) {
        h.g.b.x.f(cVar, "it");
        cVar.q(dmVar);
        return h.ab.f48028a;
    }

    static final h.ab onMarkerClicked$lambda$0(String str, com.waze.map.canvas.a.c cVar) {
        h.g.b.x.f(cVar, "it");
        cVar.h(str);
        return h.ab.f48028a;
    }

    static final h.ab onParkingPinClicked$lambda$0(int i2, com.waze.shared_infra.h.c cVar, com.waze.map.canvas.a.c cVar2) {
        h.g.b.x.f(cVar2, "it");
        cVar2.k(i2, cVar);
        return h.ab.f48028a;
    }

    static final h.ab onPoiClicked$lambda$1(com.waze.shared_infra.h.c cVar, com.waze.map.b.cg cgVar, com.waze.map.canvas.a.c cVar2) {
        h.g.b.x.f(cVar2, "it");
        cVar2.l(cVar, cgVar);
        return h.ab.f48028a;
    }

    static final h.ab onPolylineClicked$lambda$0(String str, com.waze.map.canvas.a.c cVar) {
        h.g.b.x.f(cVar, "it");
        cVar.m(str);
        return h.ab.f48028a;
    }

    static final h.ab onUserLocationClicked$lambda$0(com.waze.map.canvas.a.c cVar) {
        h.g.b.x.f(cVar, "it");
        cVar.p();
        return h.ab.f48028a;
    }

    static final h.ab onWazerClicked$lambda$0(int i2, com.waze.shared_infra.h.c cVar, com.waze.map.canvas.a.c cVar2) {
        h.g.b.x.f(cVar2, "it");
        cVar2.r(i2, cVar);
        return h.ab.f48028a;
    }

    static /* synthetic */ Object performZoomIn$suspendImpl(WazeMapNativeManager wazeMapNativeManager, h.c.e<? super h.ab> eVar) {
        wazeMapNativeManager.nativePerformZoomIn(wazeMapNativeManager.mapId, true);
        return h.ab.f48028a;
    }

    static /* synthetic */ Object performZoomOut$suspendImpl(WazeMapNativeManager wazeMapNativeManager, h.c.e<? super h.ab> eVar) {
        wazeMapNativeManager.nativePerformZoomOut(wazeMapNativeManager.mapId, true);
        return h.ab.f48028a;
    }

    static /* synthetic */ Object setDarkenHighlight$suspendImpl(WazeMapNativeManager wazeMapNativeManager, com.waze.shared_infra.h.c cVar, h.c.e<? super h.ab> eVar) {
        if (cVar != null) {
            wazeMapNativeManager.nativeSetDarkWithHighlight(wazeMapNativeManager.mapId, cVar.c(), cVar.d());
        } else {
            wazeMapNativeManager.nativeClearDarkWithHighlight(wazeMapNativeManager.mapId);
        }
        return h.ab.f48028a;
    }

    static /* synthetic */ Object setShowMapLoader$suspendImpl(WazeMapNativeManager wazeMapNativeManager, boolean z, h.c.e<? super h.ab> eVar) {
        return h.ab.f48028a;
    }

    static /* synthetic */ Object setUserLocationOffset$suspendImpl(WazeMapNativeManager wazeMapNativeManager, MapBounds.PositionPercentage positionPercentage, boolean z, h.c.e<? super h.ab> eVar) {
        wazeMapNativeManager.nativeSetUserLocationOffset(wazeMapNativeManager.mapId, positionPercentage.getXPercentage(), positionPercentage.getYPercentage(), z);
        return h.ab.f48028a;
    }

    static /* synthetic */ Object updateMapBounds$suspendImpl(WazeMapNativeManager wazeMapNativeManager, MapBounds mapBounds, h.c.e<? super h.ab> eVar) {
        String str = wazeMapNativeManager.mapId;
        byte[] byteArray = mapBounds.toByteArray();
        h.g.b.x.e(byteArray, "toByteArray(...)");
        wazeMapNativeManager.nativeUpdateMapBounds(str, byteArray);
        return h.ab.f48028a;
    }

    static /* synthetic */ Object updateMapConfiguration$suspendImpl(WazeMapNativeManager wazeMapNativeManager, MapConfiguration mapConfiguration, h.c.e<? super h.ab> eVar) {
        String str = wazeMapNativeManager.mapId;
        byte[] byteArray = mapConfiguration.toByteArray();
        h.g.b.x.e(byteArray, "toByteArray(...)");
        wazeMapNativeManager.nativeUpdateMapConfiguration(str, byteArray);
        return h.ab.f48028a;
    }

    static final h.ab updateMapContent$lambda$0(com.waze.map.b.dx dxVar, com.waze.map.canvas.a.c cVar) {
        h.g.b.x.f(cVar, "it");
        cVar.o(dxVar);
        return h.ab.f48028a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ java.lang.Object updateMapContent$suspendImpl(com.waze.map.WazeMapNativeManager r5, com.waze.jni.protos.map.MapContent r6, h.c.e<? super h.ab> r7) {
        /*
            boolean r0 = r7 instanceof com.waze.map.go
            if (r0 == 0) goto L13
            r0 = r7
            com.waze.map.go r0 = (com.waze.map.go) r0
            int r1 = r0.f29166d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f29166d = r1
            goto L18
        L13:
            com.waze.map.go r0 = new com.waze.map.go
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f29164b
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f29166d
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            com.waze.jni.protos.map.MapContent r6 = r0.f29167e
            r5 = r6
            com.waze.jni.protos.map.MapContent r5 = (com.waze.jni.protos.map.MapContent) r5
            java.lang.Object r5 = r0.f29163a
            com.waze.map.WazeMapNativeManager r5 = (com.waze.map.WazeMapNativeManager) r5
            e.b.c.b(r7)
            goto L53
        L30:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L38:
            e.b.c.b(r7)
            kotlinx.coroutines.ab r7 = r5.backgroundDispatcher
            h.c.j r7 = (h.c.j) r7
            com.waze.map.gp r2 = new com.waze.map.gp
            r4 = 0
            r2.<init>(r5, r6, r4)
            h.g.a.p r2 = (h.g.a.p) r2
            r0.f29163a = r5
            r0.f29167e = r6
            r0.f29166d = r3
            java.lang.Object r7 = kotlinx.coroutines.aj.v(r7, r2, r0)
            if (r7 == r1) goto L8e
        L53:
            java.lang.String r7 = r5.mapId
            r5.nativeUpdateMapContent(r7)
            com.waze.jni.protos.map.MapContent$ColorScheme r6 = r6.getColorScheme()
            com.waze.jni.protos.map.MapContent$ColorScheme r7 = com.waze.jni.protos.map.MapContent.ColorScheme.UNKNOWN
            int r6 = r6.ordinal()
            if (r6 == 0) goto L7f
            if (r6 == r3) goto L7c
            r7 = 2
            if (r6 == r7) goto L79
            r7 = 3
            if (r6 == r7) goto L7c
            r7 = 4
            if (r6 == r7) goto L79
            r7 = 5
            if (r6 != r7) goto L73
            goto L7f
        L73:
            h.i r5 = new h.i
            r5.<init>()
            throw r5
        L79:
            com.waze.map.b.dx r6 = com.waze.map.b.dx.f28230c
            goto L81
        L7c:
            com.waze.map.b.dx r6 = com.waze.map.b.dx.f28229b
            goto L81
        L7f:
            com.waze.map.b.dx r6 = com.waze.map.b.dx.f28228a
        L81:
            com.waze.map.i r7 = new com.waze.map.i
            r0 = 10
            r7.<init>(r6, r0)
            r5.forEveryAdapter(r7)
            h.ab r5 = h.ab.f48028a
            return r5
        L8e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.map.WazeMapNativeManager.updateMapContent$suspendImpl(com.waze.map.WazeMapNativeManager, com.waze.jni.protos.map.MapContent, h.c.e):java.lang.Object");
    }

    @Override // com.waze.map.canvas.a.e
    public Object addJniAdapter(com.waze.map.canvas.a.c cVar, h.c.e<? super com.waze.shared_infra.s.d> eVar) {
        return addJniAdapter$suspendImpl(this, cVar, eVar);
    }

    @Override // com.waze.map.canvas.a.e
    public void cleanupAndClose() {
    }

    @Override // com.waze.map.canvas.a.e
    public Object generateEtaLabelPositions(List<com.waze.map.b.dp> list, List<com.waze.shared_infra.h.c> list2, h.c.e<? super Map<Long, com.waze.map.b.dq>> eVar) {
        return generateEtaLabelPositions$suspendImpl(this, list, list2, eVar);
    }

    @Override // com.waze.map.canvas.a.e
    public boolean getSupportPolylines() {
        return this.supportPolylines;
    }

    @Override // com.waze.map.canvas.a.e
    public boolean getSupportShowingLoader() {
        return this.supportShowingLoader;
    }

    @Override // com.waze.map.canvas.a.e
    public Object initialize(h.c.e<? super h.ab> eVar) {
        return initialize$suspendImpl(this, eVar);
    }

    public final void onAdClicked$third_party_waze_client_android_project_map_canvas_src_main_waze_map_native_manager(String str) {
        h.g.b.x.f(str, "adId");
        forEveryAdapter(new i(str, 13));
    }

    public final void onAlertClicked$third_party_waze_client_android_project_map_canvas_src_main_waze_map_native_manager(int i2, int i3, int i4) {
        forEveryAdapter(new gm(i2, new com.waze.shared_infra.h.c(i4, i3), 3));
    }

    public final void onExternalPoiClicked$third_party_waze_client_android_project_map_canvas_src_main_waze_map_native_manager(int i2, int i3, int i4) {
        forEveryAdapter(new gm(i2, new com.waze.shared_infra.h.c(i4, i3), 1));
    }

    public final void onLongClick$third_party_waze_client_android_project_map_canvas_src_main_waze_map_native_manager(ScreenPoint screenPoint, int i2, int i3) {
        h.g.b.x.f(screenPoint, "point");
        forEveryAdapter(new i(new com.waze.shared_infra.h.c(i2, i3), 11));
    }

    public final void onMapFallthroughClick$third_party_waze_client_android_project_map_canvas_src_main_waze_map_native_manager(ScreenPoint screenPoint) {
        h.g.b.x.f(screenPoint, "point");
        forEveryAdapter(new i(screenPoint, 16));
    }

    public final void onMapInteractionStarted$third_party_waze_client_android_project_map_canvas_src_main_waze_map_native_manager() {
        forEveryAdapter(new gl(2));
    }

    public final void onMapMovementStateChanged$third_party_waze_client_android_project_map_canvas_src_main_waze_map_native_manager(MapMovementChanged mapMovementChanged) {
        com.waze.map.b.dk dkVar;
        h.g.b.x.f(mapMovementChanged, "protoEvent");
        MapMovementChanged.MapMovementState newState = mapMovementChanged.getNewState();
        h.g.b.x.e(newState, "getNewState(...)");
        h.g.b.x.f(newState, "<this>");
        MapMovementChanged.MapMovementState mapMovementState = MapMovementChanged.MapMovementState.IDLE_AFTER_TOUCH;
        switch (newState.ordinal()) {
            case 0:
                dkVar = com.waze.map.b.dk.f28193b;
                break;
            case 1:
                dkVar = com.waze.map.b.dk.f28194c;
                break;
            case 2:
                dkVar = com.waze.map.b.dk.f28195d;
                break;
            case 3:
                dkVar = com.waze.map.b.dk.f28196e;
                break;
            case 4:
                dkVar = com.waze.map.b.dk.f28197f;
                break;
            case 5:
                dkVar = com.waze.map.b.dk.f28198g;
                break;
            case 6:
                dkVar = com.waze.map.b.dk.f28192a;
                break;
            default:
                throw new h.i();
        }
        forEveryAdapter(new i(dkVar, 12));
    }

    public final void onMapNorthLockBehaviorChanged$third_party_waze_client_android_project_map_canvas_src_main_waze_map_native_manager(MapNorthLockChanged mapNorthLockChanged) {
        h.g.b.x.f(mapNorthLockChanged, "protoEvent");
        forEveryAdapter(new i(mapNorthLockChanged, 14));
    }

    public final void onMapVisibleAreaChanged$third_party_waze_client_android_project_map_canvas_src_main_waze_map_native_manager(MapVisibleAreaChanged mapVisibleAreaChanged) {
        h.g.b.x.f(mapVisibleAreaChanged, NotificationCompat.CATEGORY_EVENT);
        MapVisibleAreaChanged.CornersPolygon viewportCornersPolygon = mapVisibleAreaChanged.getNewArea().getViewportCornersPolygon();
        h.g.b.x.e(viewportCornersPolygon, "getViewportCornersPolygon(...)");
        com.waze.map.b.ci ciVarF = com.waze.google_assistant.an.f(viewportCornersPolygon);
        MapVisibleAreaChanged.CornersPolygon fullscreenCornersPolygon = mapVisibleAreaChanged.getNewArea().getFullscreenCornersPolygon();
        h.g.b.x.e(fullscreenCornersPolygon, "getFullscreenCornersPolygon(...)");
        com.waze.map.b.ci ciVarF2 = com.waze.google_assistant.an.f(fullscreenCornersPolygon);
        Position.IntPosition viewportCenter = mapVisibleAreaChanged.getNewArea().getViewportCenter();
        h.g.b.x.e(viewportCenter, "getViewportCenter(...)");
        forEveryAdapter(new i(new com.waze.map.b.dm(ciVarF, ciVarF2, cc.a(viewportCenter), mapVisibleAreaChanged.getNewArea().getOrientationDegrees(), mapVisibleAreaChanged.getNewArea().getCameraAngleDegrees(), mapVisibleAreaChanged.getNewArea().getZoomNormalized()), 17));
    }

    public final void onMarkerClicked$third_party_waze_client_android_project_map_canvas_src_main_waze_map_native_manager(String str) {
        h.g.b.x.f(str, "markerId");
        forEveryAdapter(new i(str, 15));
    }

    public final void onParkingPinClicked$third_party_waze_client_android_project_map_canvas_src_main_waze_map_native_manager(int i2, int i3, int i4) {
        forEveryAdapter(new gm(i2, new com.waze.shared_infra.h.c(i4, i3), 2));
    }

    public final void onPoiClicked$third_party_waze_client_android_project_map_canvas_src_main_waze_map_native_manager(int i2, int i3, PoiClicked poiClicked) {
        final com.waze.map.b.cg cgVar;
        h.g.b.x.f(poiClicked, "protoEvent");
        final com.waze.shared_infra.h.c cVar = new com.waze.shared_infra.h.c(i3, i2);
        ClickedPoiType type = poiClicked.getType();
        h.g.b.x.e(type, "getType(...)");
        Marker.Alignment alignment = Marker.Alignment.ALIGNMENT_UNKNOWN;
        NorthLockBehavior northLockBehavior = NorthLockBehavior.UNLOCKED;
        ClickedPoiType clickedPoiType = ClickedPoiType.HOME;
        int iOrdinal = type.ordinal();
        if (iOrdinal == 0) {
            cgVar = com.waze.map.b.cg.f28139a;
        } else if (iOrdinal == 1) {
            cgVar = com.waze.map.b.cg.f28140b;
        } else if (iOrdinal == 2) {
            cgVar = com.waze.map.b.cg.f28141c;
        } else if (iOrdinal == 3) {
            cgVar = com.waze.map.b.cg.f28142d;
        } else {
            if (iOrdinal != 4) {
                throw new h.i();
            }
            cgVar = null;
        }
        if (cgVar != null) {
            forEveryAdapter(new h.g.a.l() { // from class: com.waze.map.gn
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return WazeMapNativeManager.onPoiClicked$lambda$1(cVar, cgVar, (com.waze.map.canvas.a.c) obj);
                }
            });
            return;
        }
        com.waze.shared_infra.i.h.c("Unrecognized POI type clicked: " + poiClicked.getType() + ", ignoring");
    }

    public final void onPolylineClicked$third_party_waze_client_android_project_map_canvas_src_main_waze_map_native_manager(String str) {
        h.g.b.x.f(str, "polylineTag");
        forEveryAdapter(new i(str, 18));
    }

    public final void onUserLocationClicked$third_party_waze_client_android_project_map_canvas_src_main_waze_map_native_manager() {
        forEveryAdapter(new gl(0));
    }

    public final void onWazerClicked$third_party_waze_client_android_project_map_canvas_src_main_waze_map_native_manager(int i2, int i3, int i4) {
        forEveryAdapter(new gm(i2, new com.waze.shared_infra.h.c(i4, i3), 0));
    }

    @Override // com.waze.map.canvas.a.e
    public Object performZoomIn(h.c.e<? super h.ab> eVar) {
        return performZoomIn$suspendImpl(this, eVar);
    }

    @Override // com.waze.map.canvas.a.e
    public Object performZoomOut(h.c.e<? super h.ab> eVar) {
        return performZoomOut$suspendImpl(this, eVar);
    }

    @Override // com.waze.map.canvas.a.e
    public Object setDarkenHighlight(com.waze.shared_infra.h.c cVar, h.c.e<? super h.ab> eVar) {
        return setDarkenHighlight$suspendImpl(this, cVar, eVar);
    }

    @Override // com.waze.map.canvas.a.e
    public Object setShowMapLoader(boolean z, h.c.e<? super h.ab> eVar) {
        return setShowMapLoader$suspendImpl(this, z, eVar);
    }

    @Override // com.waze.map.canvas.a.e
    public Object setUserLocationOffset(MapBounds.PositionPercentage positionPercentage, boolean z, h.c.e<? super h.ab> eVar) {
        return setUserLocationOffset$suspendImpl(this, positionPercentage, z, eVar);
    }

    @Override // com.waze.map.canvas.a.e
    public Object updateMapBounds(MapBounds mapBounds, h.c.e<? super h.ab> eVar) {
        return updateMapBounds$suspendImpl(this, mapBounds, eVar);
    }

    @Override // com.waze.map.canvas.a.e
    public Object updateMapConfiguration(MapConfiguration mapConfiguration, h.c.e<? super h.ab> eVar) {
        return updateMapConfiguration$suspendImpl(this, mapConfiguration, eVar);
    }

    @Override // com.waze.map.canvas.a.e
    public Object updateMapContent(MapContent mapContent, h.c.e<? super h.ab> eVar) {
        return updateMapContent$suspendImpl(this, mapContent, eVar);
    }
}
