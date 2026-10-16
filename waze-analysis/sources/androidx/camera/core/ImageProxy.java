package androidx.camera.core;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.hardware.HardwareBuffer;
import android.media.Image;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface ImageProxy extends AutoCloseable {

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.core.ImageProxy$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static HardwareBuffer $default$getHardwareBuffer(ImageProxy imageProxy) {
            return null;
        }
    }

    /* compiled from: WazeSource */
    public interface PlaneProxy {
        ByteBuffer getBuffer();

        int getPixelStride();

        int getRowStride();
    }

    @Override // java.lang.AutoCloseable
    void close();

    Rect getCropRect();

    int getFormat();

    HardwareBuffer getHardwareBuffer();

    int getHeight();

    Image getImage();

    ImageInfo getImageInfo();

    PlaneProxy[] getPlanes();

    int getWidth();

    void setCropRect(Rect rect);

    Bitmap toBitmap();
}
