package androidx.camera.core;

import android.media.ImageReader;
import androidx.camera.core.impl.ImageReaderProxy;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ImageReaderProxys {

    /* compiled from: WazeSource */
    class ImageReaderApi29Impl {
        private ImageReaderApi29Impl() {
        }

        static ImageReader newInstance(int i2, int i3, int i4, int i5, long j2) {
            return ImageReader.newInstance(i2, i3, i4, i5, j2);
        }
    }

    private ImageReaderProxys() {
    }

    public static ImageReaderProxy createIsolatedReader(int i2, int i3, int i4, int i5, long j2) {
        return new AndroidImageReaderProxy(j2 != 0 ? ImageReaderApi29Impl.newInstance(i2, i3, i4, i5, j2) : ImageReader.newInstance(i2, i3, i4, i5));
    }

    public static ImageReaderProxy createIsolatedReader(int i2, int i3, int i4, int i5) {
        return createIsolatedReader(i2, i3, i4, i5, 0L);
    }
}
