package androidx.camera.common;

import android.graphics.Rect;
import android.hardware.HardwareBuffer;
import android.hardware.SyncFence;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface ImageWrapper extends UnsafeWrapper, AutoCloseable {
    Rect getCropRect();

    int getDataSpace();

    int getFormat();

    HardwareBuffer getHardwareBuffer();

    int getHeight();

    List<ImagePlane> getImagePlanes();

    SyncFence getSyncFence();

    long getTimestamp();

    int getWidth();

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.common.ImageWrapper$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static int $default$getDataSpace(ImageWrapper imageWrapper) {
            return 0;
        }

        public static HardwareBuffer $default$getHardwareBuffer(ImageWrapper imageWrapper) {
            return null;
        }

        public static SyncFence $default$getSyncFence(ImageWrapper imageWrapper) {
            return null;
        }

        public static /* synthetic */ void getDataSpace$annotations() {
        }
    }
}
