package androidx.webkit.internal;

import android.content.ComponentName;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class ApiHelperForTiramisu {
    private ApiHelperForTiramisu() {
    }

    static ServiceInfo getServiceInfo(PackageManager packageManager, ComponentName componentName, PackageManager.ComponentInfoFlags componentInfoFlags) {
        return packageManager.getServiceInfo(componentName, componentInfoFlags);
    }

    static PackageManager.ComponentInfoFlags of(long j2) {
        return PackageManager.ComponentInfoFlags.of(j2);
    }
}
