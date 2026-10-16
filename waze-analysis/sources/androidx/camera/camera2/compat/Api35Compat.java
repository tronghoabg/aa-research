package androidx.camera.camera2.compat;

import android.hardware.camera2.CaptureRequest;
import h.g.b.x;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class Api35Compat {
    public static final Api35Compat INSTANCE = new Api35Compat();

    private Api35Compat() {
    }

    public static final void setFlashStrengthLevel(Map<CaptureRequest.Key<?>, Object> map, int i2) {
        x.f(map, "parameters");
        map.put(CaptureRequest.FLASH_STRENGTH_LEVEL, Integer.valueOf(i2));
    }
}
