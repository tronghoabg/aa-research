package com.waze.map;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.waze.jni.protos.map.ScreenPoint;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public class MapPositionTrackerNativeManager extends cc {
    private final String mapId;
    private final List<h.g.a.p<Integer, com.waze.map.b.dw, h.ab>> positionUpdatedCallbacks;

    public MapPositionTrackerNativeManager(String str) {
        h.g.b.x.f(str, "mapId");
        this.mapId = str;
        this.positionUpdatedCallbacks = new ArrayList();
    }

    private final native void nativeCancelAllTrackingsOnMap(String str);

    private final native void nativeCancelTrackingOnMap(String str, int i2);

    private final native void nativeClearJvmInstance(String str);

    private final native void nativeRequestPositionTrackingOnMap(String str, int i2, int i3, int i4);

    private final native void nativeRequestUserTrackingOnMap(String str, int i2);

    public com.waze.shared_infra.s.d addOnPositionUpdatedCallback(h.g.a.p<? super Integer, ? super com.waze.map.b.dw, h.ab> pVar) {
        h.g.b.x.f(pVar, "callback");
        this.positionUpdatedCallbacks.add(pVar);
        return new ca(this, pVar, 0);
    }

    public void cancelTracking(int i2) {
        nativeCancelTrackingOnMap(this.mapId, i2);
    }

    public void clear() {
        nativeCancelAllTrackingsOnMap(this.mapId);
        nativeClearJvmInstance(this.mapId);
    }

    public final String getMapId() {
        return this.mapId;
    }

    public final void onPositionUpdated$third_party_waze_client_android_project_map_src_main_map_position_tracker_native_manager(int i2, ScreenPoint screenPoint) {
        h.g.b.x.f(screenPoint, "screenPointProto");
        com.waze.map.b.dw dwVar = new com.waze.map.b.dw(screenPoint.getX(), screenPoint.getY());
        Iterator<T> it = this.positionUpdatedCallbacks.iterator();
        while (it.hasNext()) {
            ((h.g.a.p) it.next()).invoke(Integer.valueOf(i2), dwVar);
        }
    }

    public void requestTracking(int i2, bv bvVar) {
        h.g.b.x.f(bvVar, TypedValues.AttributesType.S_TARGET);
        if (bvVar instanceof bt) {
            bt btVar = (bt) bvVar;
            nativeRequestPositionTrackingOnMap(this.mapId, i2, btVar.a().c(), btVar.a().d());
        } else {
            if (!(bvVar instanceof bu)) {
                throw new h.i();
            }
            nativeRequestUserTrackingOnMap(this.mapId, i2);
        }
    }
}
