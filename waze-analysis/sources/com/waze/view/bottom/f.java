package com.waze.view.bottom;

import com.waze.NativeManager;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class f {
    public static final int $stable = 0;

    static final void postLongMessagePointsJNI$lambda$0(f fVar, int i2, int i3) {
        x.d(fVar, "null cannot be cast to non-null type com.waze.view.bottom.BottomNotificationNativeManager");
        ((BottomNotificationNativeManager) fVar).postLongMessagePoints$third_party_waze_client_android_project_waze_src_main_waze(i2, i3);
    }

    static final void postNearbyMessageJNI$lambda$0(f fVar, String str, String str2, int i2, int i3) {
        x.d(fVar, "null cannot be cast to non-null type com.waze.view.bottom.BottomNotificationNativeManager");
        ((BottomNotificationNativeManager) fVar).postNearbyMessage$third_party_waze_client_android_project_waze_src_main_waze(str, str2, i2, i3);
    }

    protected final void postLongMessagePointsJNI(final int i2, final int i3) {
        NativeManager.runMainThreadTask(new Runnable() { // from class: com.waze.view.bottom.e
            @Override // java.lang.Runnable
            public final void run() {
                f.postLongMessagePointsJNI$lambda$0(this.f45008a, i2, i3);
            }
        });
    }

    protected final void postNearbyMessageJNI(final String str, final String str2, final int i2, final int i3) {
        x.f(str, "message");
        x.f(str2, "messageBody");
        NativeManager.runMainThreadTask(new Runnable() { // from class: com.waze.view.bottom.d
            @Override // java.lang.Runnable
            public final void run() {
                f.postNearbyMessageJNI$lambda$0(this.f45003a, str, str2, i2, i3);
            }
        });
    }
}
