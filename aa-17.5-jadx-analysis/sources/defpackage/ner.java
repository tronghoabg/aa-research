package defpackage;

import android.hardware.camera2.CameraManager;
import android.os.Handler;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class ner extends eqj {
    private final neq h = new neq(this);
    public final Set a = new LinkedHashSet();

    @Override // defpackage.eqj
    protected final void c() {
        Object systemService = mki.a.c.getSystemService((Class<Object>) CameraManager.class);
        if (systemService == null) {
            throw new IllegalStateException("Required value was null.");
        }
        ((CameraManager) systemService).registerAvailabilityCallback(this.h, (Handler) null);
    }

    @Override // defpackage.eqj
    protected final void d() {
        Object systemService = mki.a.c.getSystemService((Class<Object>) CameraManager.class);
        if (systemService == null) {
            throw new IllegalStateException("Required value was null.");
        }
        ((CameraManager) systemService).unregisterAvailabilityCallback(this.h);
    }
}
