package androidx.camera.camera2.pipe;

import androidx.camera.camera2.pipe.core.Log;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class StrictMode {
    private final boolean enabled;

    public StrictMode(boolean z) {
        this.enabled = z;
    }

    public final void check(boolean z, h.g.a.a<String> aVar) {
        x.f(aVar, "message");
        if (z) {
            return;
        }
        String strInvoke = aVar.invoke();
        if (getEnabled()) {
            throw new IllegalStateException(strInvoke);
        }
        if (Log.INSTANCE.getWARN_LOGGABLE()) {
            android.util.Log.w(Log.TAG, strInvoke);
        }
    }

    public final boolean getEnabled() {
        return this.enabled;
    }
}
