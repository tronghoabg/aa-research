package androidx.camera.common.compat;

import android.hardware.HardwareBuffer;
import android.media.Image;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class Api28Compat {
    public static final Api28Compat INSTANCE = new Api28Compat();

    private Api28Compat() {
    }

    public static final HardwareBuffer getHardwareBuffer(Image image) {
        x.f(image, "image");
        return image.getHardwareBuffer();
    }
}
