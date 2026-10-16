package androidx.camera.core.internal.compat;

import android.media.ImageWriter;
import android.view.Surface;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class ImageWriterCompatApi29Impl {
    private ImageWriterCompatApi29Impl() {
    }

    static ImageWriter newInstance(Surface surface, int i2, int i3) {
        return ImageWriter.newInstance(surface, i2, i3);
    }
}
