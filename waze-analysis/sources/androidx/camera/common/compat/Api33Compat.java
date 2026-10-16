package androidx.camera.common.compat;

import android.hardware.SyncFence;
import android.media.Image;
import h.g.b.x;
import java.io.IOException;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class Api33Compat {
    public static final Api33Compat INSTANCE = new Api33Compat();

    private Api33Compat() {
    }

    public static final int getDataSpace(Image image) {
        x.f(image, "image");
        return image.getDataSpace();
    }

    public static final SyncFence getFence(Image image) throws IOException {
        x.f(image, "image");
        SyncFence fence = image.getFence();
        x.e(fence, "getFence(...)");
        return fence;
    }

    public static final void setDataSpace(Image image, int i2) {
        x.f(image, "image");
        image.setDataSpace(i2);
    }

    public static final void setFence(Image image, SyncFence syncFence) throws IOException {
        x.f(image, "image");
        x.f(syncFence, "fence");
        image.setFence(syncFence);
    }
}
