package com.waze.map;

import androidx.core.app.NotificationCompat;
import com.waze.jni.protos.map.MapMovementChanged;
import com.waze.jni.protos.map.MapNorthLockChanged;
import com.waze.jni.protos.map.MapVisibleAreaChanged;
import com.waze.jni.protos.map.PoiClicked;
import com.waze.jni.protos.map.ScreenPoint;
import com.waze.jni.protos.map.ZoomLevelDisplayRange;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public class gq {
    public static ZoomLevelDisplayRange a(com.waze.map.b.fk fkVar) {
        h.g.b.x.f(fkVar, "<this>");
        ZoomLevelDisplayRange.Builder builderNewBuilder = ZoomLevelDisplayRange.newBuilder();
        builderNewBuilder.setMinZoomLevel(fkVar.b());
        builderNewBuilder.setMaxZoomLevel(fkVar.a());
        ZoomLevelDisplayRange zoomLevelDisplayRangeBuild = builderNewBuilder.build();
        h.g.b.x.e(zoomLevelDisplayRangeBuild, "build(...)");
        return zoomLevelDisplayRangeBuild;
    }

    protected final void onAdClickedJNI(String str) {
        h.g.b.x.f(str, "adId");
        ((WazeMapNativeManager) this).onAdClicked$third_party_waze_client_android_project_map_canvas_src_main_waze_map_native_manager(str);
    }

    protected final void onAlertClickedJNI(int i2, int i3, int i4) {
        ((WazeMapNativeManager) this).onAlertClicked$third_party_waze_client_android_project_map_canvas_src_main_waze_map_native_manager(i2, i3, i4);
    }

    protected final void onExternalPoiClickedJNI(int i2, int i3, int i4) {
        ((WazeMapNativeManager) this).onExternalPoiClicked$third_party_waze_client_android_project_map_canvas_src_main_waze_map_native_manager(i2, i3, i4);
    }

    protected final void onLongClickJNI(byte[] bArr, int i2, int i3) {
        h.g.b.x.f(bArr, "point");
        try {
            ScreenPoint screenPoint = (ScreenPoint) ScreenPoint.parser().c(bArr);
            h.g.b.x.c(screenPoint);
            ((WazeMapNativeManager) this).onLongClick$third_party_waze_client_android_project_map_canvas_src_main_waze_map_native_manager(screenPoint, i2, i3);
        } catch (com.google.v.eu unused) {
        }
    }

    protected final void onMapFallthroughClickJNI(byte[] bArr) {
        h.g.b.x.f(bArr, "point");
        try {
            ScreenPoint screenPoint = (ScreenPoint) ScreenPoint.parser().c(bArr);
            h.g.b.x.c(screenPoint);
            ((WazeMapNativeManager) this).onMapFallthroughClick$third_party_waze_client_android_project_map_canvas_src_main_waze_map_native_manager(screenPoint);
        } catch (com.google.v.eu unused) {
        }
    }

    protected final void onMapInteractionStartedJNI() {
        ((WazeMapNativeManager) this).onMapInteractionStarted$third_party_waze_client_android_project_map_canvas_src_main_waze_map_native_manager();
    }

    protected final void onMapMovementStateChangedJNI(byte[] bArr) {
        h.g.b.x.f(bArr, "protoEvent");
        try {
            MapMovementChanged mapMovementChanged = (MapMovementChanged) MapMovementChanged.parser().c(bArr);
            h.g.b.x.c(mapMovementChanged);
            ((WazeMapNativeManager) this).onMapMovementStateChanged$third_party_waze_client_android_project_map_canvas_src_main_waze_map_native_manager(mapMovementChanged);
        } catch (com.google.v.eu unused) {
        }
    }

    protected final void onMapNorthLockBehaviorChangedJNI(byte[] bArr) {
        h.g.b.x.f(bArr, "protoEvent");
        try {
            MapNorthLockChanged mapNorthLockChanged = (MapNorthLockChanged) MapNorthLockChanged.parser().c(bArr);
            h.g.b.x.c(mapNorthLockChanged);
            ((WazeMapNativeManager) this).onMapNorthLockBehaviorChanged$third_party_waze_client_android_project_map_canvas_src_main_waze_map_native_manager(mapNorthLockChanged);
        } catch (com.google.v.eu unused) {
        }
    }

    protected final void onMapVisibleAreaChangedJNI(byte[] bArr) {
        h.g.b.x.f(bArr, NotificationCompat.CATEGORY_EVENT);
        try {
            MapVisibleAreaChanged mapVisibleAreaChanged = (MapVisibleAreaChanged) MapVisibleAreaChanged.parser().c(bArr);
            h.g.b.x.c(mapVisibleAreaChanged);
            ((WazeMapNativeManager) this).onMapVisibleAreaChanged$third_party_waze_client_android_project_map_canvas_src_main_waze_map_native_manager(mapVisibleAreaChanged);
        } catch (com.google.v.eu unused) {
        }
    }

    protected final void onMarkerClickedJNI(String str) {
        h.g.b.x.f(str, "markerId");
        ((WazeMapNativeManager) this).onMarkerClicked$third_party_waze_client_android_project_map_canvas_src_main_waze_map_native_manager(str);
    }

    protected final void onParkingPinClickedJNI(int i2, int i3, int i4) {
        ((WazeMapNativeManager) this).onParkingPinClicked$third_party_waze_client_android_project_map_canvas_src_main_waze_map_native_manager(i2, i3, i4);
    }

    protected final void onPoiClickedJNI(int i2, int i3, byte[] bArr) {
        h.g.b.x.f(bArr, "protoEvent");
        try {
            PoiClicked poiClicked = (PoiClicked) PoiClicked.parser().c(bArr);
            h.g.b.x.c(poiClicked);
            ((WazeMapNativeManager) this).onPoiClicked$third_party_waze_client_android_project_map_canvas_src_main_waze_map_native_manager(i2, i3, poiClicked);
        } catch (com.google.v.eu unused) {
        }
    }

    protected final void onPolylineClickedJNI(String str) {
        h.g.b.x.f(str, "polylineTag");
        ((WazeMapNativeManager) this).onPolylineClicked$third_party_waze_client_android_project_map_canvas_src_main_waze_map_native_manager(str);
    }

    protected final void onUserLocationClickedJNI() {
        ((WazeMapNativeManager) this).onUserLocationClicked$third_party_waze_client_android_project_map_canvas_src_main_waze_map_native_manager();
    }

    protected final void onWazerClickedJNI(int i2, int i3, int i4) {
        ((WazeMapNativeManager) this).onWazerClicked$third_party_waze_client_android_project_map_canvas_src_main_waze_map_native_manager(i2, i3, i4);
    }
}
