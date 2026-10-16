package defpackage;

import android.hardware.camera2.CameraManager;
import android.os.Handler;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class nfa extends eqj {
    private final nez h = new nez(this);
    public final Set a = new LinkedHashSet();

    @Override // defpackage.eqj
    protected final void c() {
        Object systemService = mki.a.c.getSystemService((Class<Object>) CameraManager.class);
        if (systemService == null) {
            throw new IllegalStateException("Required value was null.");
        }
        ((CameraManager) systemService).registerTorchCallback(this.h, (Handler) null);
    }

    @Override // defpackage.eqj
    protected final void d() {
        Object systemService = mki.a.c.getSystemService((Class<Object>) CameraManager.class);
        if (systemService == null) {
            throw new IllegalStateException("Required value was null.");
        }
        ((CameraManager) systemService).unregisterTorchCallback(this.h);
    }
}
