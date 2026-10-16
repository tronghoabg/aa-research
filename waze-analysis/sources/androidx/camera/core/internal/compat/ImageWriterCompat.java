package androidx.camera.core.internal.compat;

import android.media.Image;
import android.media.ImageWriter;
import android.view.Surface;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ImageWriterCompat {
    private ImageWriterCompat() {
    }

    public static void close(ImageWriter imageWriter) {
        ImageWriterCompatApi23Impl.close(imageWriter);
    }

    public static Image dequeueInputImage(ImageWriter imageWriter) {
        return ImageWriterCompatApi23Impl.dequeueInputImage(imageWriter);
    }

    public static ImageWriter newInstance(Surface surface, int i2) {
        return ImageWriterCompatApi23Impl.newInstance(surface, i2);
    }

    public static void queueInputImage(ImageWriter imageWriter, Image image) {
        ImageWriterCompatApi23Impl.queueInputImage(imageWriter, image);
    }

    public static void setOnImageReleasedListener(ImageWriter imageWriter, ImageWriter.OnImageReleasedListener onImageReleasedListener, Executor executor) {
        ImageWriterCompatApi23Impl.setOnImageReleasedListener(imageWriter, onImageReleasedListener, executor);
    }

    public static ImageWriter newInstance(Surface surface, int i2, int i3) {
        return ImageWriterCompatApi29Impl.newInstance(surface, i2, i3);
    }
}
