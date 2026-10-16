package androidx.camera.camera2.pipe.compat;

import android.app.admin.DevicePolicyManager;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class AndroidDevicePolicyManagerWrapper_Factory implements c.b.c<AndroidDevicePolicyManagerWrapper> {
    private final c.b.e<DevicePolicyManager> devicePolicyManagerProvider;

    private AndroidDevicePolicyManagerWrapper_Factory(c.b.e<DevicePolicyManager> eVar) {
        this.devicePolicyManagerProvider = eVar;
    }

    public static AndroidDevicePolicyManagerWrapper_Factory create(c.b.e<DevicePolicyManager> eVar) {
        return new AndroidDevicePolicyManagerWrapper_Factory(eVar);
    }

    public static AndroidDevicePolicyManagerWrapper newInstance(DevicePolicyManager devicePolicyManager) {
        return new AndroidDevicePolicyManagerWrapper(devicePolicyManager);
    }

    @Override // g.a.a, f.a.a
    public AndroidDevicePolicyManagerWrapper get() {
        return newInstance(this.devicePolicyManagerProvider.get());
    }
}
