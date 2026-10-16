package com.waze.map;

import com.waze.jni.protos.Position;
import com.waze.jni.protos.map.ScreenPoint;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public class cc {
    public static com.waze.shared_infra.h.c a(Position.IntPosition intPosition) {
        h.g.b.x.f(intPosition, "<this>");
        return new com.waze.shared_infra.h.c(intPosition.getLatitude(), intPosition.getLongitude());
    }

    protected final void onPositionUpdatedJNI(int i2, byte[] bArr) {
        h.g.b.x.f(bArr, "screenPointProto");
        try {
            ScreenPoint screenPoint = (ScreenPoint) ScreenPoint.parser().c(bArr);
            h.g.b.x.c(screenPoint);
            ((MapPositionTrackerNativeManager) this).onPositionUpdated$third_party_waze_client_android_project_map_src_main_map_position_tracker_native_manager(i2, screenPoint);
        } catch (com.google.v.eu unused) {
        }
    }
}
