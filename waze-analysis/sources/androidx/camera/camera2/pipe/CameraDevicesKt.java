package androidx.camera.camera2.pipe;

import h.g.b.x;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.k;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class CameraDevicesKt {
    /* renamed from: find-Ohbb9yk, reason: not valid java name */
    public static final k<CameraMetadata> m469findOhbb9yk(CameraDevices cameraDevices, String str, boolean z) {
        x.f(cameraDevices, "$this$find");
        return ai.E(new CameraDevicesKt$find$1(cameraDevices, str, z, null));
    }

    /* renamed from: find-Ohbb9yk$default, reason: not valid java name */
    public static /* synthetic */ k m470findOhbb9yk$default(CameraDevices cameraDevices, String str, boolean z, int i2, Object obj) {
        if (1 == (i2 & 1)) {
            str = null;
        }
        return m469findOhbb9yk(cameraDevices, str, z & ((i2 & 2) == 0));
    }
}
