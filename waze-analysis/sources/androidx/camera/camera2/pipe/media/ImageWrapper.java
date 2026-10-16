package androidx.camera.camera2.pipe.media;

import android.graphics.Rect;
import android.hardware.HardwareBuffer;
import androidx.camera.camera2.pipe.UnsafeWrapper;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface ImageWrapper extends UnsafeWrapper, AutoCloseable {
    Rect getCropRect();

    Integer getDataSpace();

    int getFormat();

    HardwareBuffer getHardwareBuffer();

    int getHeight();

    List<ImagePlane> getPlanes();

    long getTimestamp();

    int getWidth();

    void setCropRect(Rect rect);

    void setDataSpace(Integer num);

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.camera2.pipe.media.ImageWrapper$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static Integer $default$getDataSpace(ImageWrapper imageWrapper) {
            return null;
        }

        public static HardwareBuffer $default$getHardwareBuffer(ImageWrapper imageWrapper) {
            return null;
        }

        public static void $default$setDataSpace(ImageWrapper imageWrapper, Integer num) {
        }
    }
}
