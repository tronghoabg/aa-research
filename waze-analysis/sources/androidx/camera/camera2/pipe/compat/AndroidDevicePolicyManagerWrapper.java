package androidx.camera.camera2.pipe.compat;

import android.app.admin.DevicePolicyManager;
import android.os.Trace;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class AndroidDevicePolicyManagerWrapper implements DevicePolicyManagerWrapper {
    private final DevicePolicyManager devicePolicyManager;

    public AndroidDevicePolicyManagerWrapper(DevicePolicyManager devicePolicyManager) {
        x.f(devicePolicyManager, "devicePolicyManager");
        this.devicePolicyManager = devicePolicyManager;
    }

    @Override // androidx.camera.camera2.pipe.compat.DevicePolicyManagerWrapper
    public boolean getCamerasDisabled() {
        try {
            Trace.beginSection("DevicePolicyManager#getCameraDisabled");
            return this.devicePolicyManager.getCameraDisabled(null);
        } finally {
            Trace.endSection();
        }
    }
}
