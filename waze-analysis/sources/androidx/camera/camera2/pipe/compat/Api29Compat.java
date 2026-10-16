package androidx.camera.camera2.pipe.compat;

import android.media.ImageReader;
import android.media.ImageWriter;
import android.view.Surface;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class Api29Compat {
    public static final Api29Compat INSTANCE = new Api29Compat();

    private Api29Compat() {
    }

    public static final ImageReader imageReaderNewInstance(int i2, int i3, int i4, int i5, long j2) {
        ImageReader imageReaderNewInstance = ImageReader.newInstance(i2, i3, i4, i5, j2);
        x.e(imageReaderNewInstance, "newInstance(...)");
        return imageReaderNewInstance;
    }

    public static final ImageWriter imageWriterNewInstance(Surface surface, int i2, int i3) {
        x.f(surface, "surface");
        ImageWriter imageWriterNewInstance = ImageWriter.newInstance(surface, i2, i3);
        x.e(imageWriterNewInstance, "newInstance(...)");
        return imageWriterNewInstance;
    }
}
