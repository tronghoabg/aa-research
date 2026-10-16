package androidx.camera.core;

import android.graphics.Matrix;
import androidx.camera.core.impl.TagBundle;
import androidx.camera.core.impl.utils.ExifData;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface ImageInfo {

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.core.ImageInfo$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static int $default$getFlashState(ImageInfo imageInfo) {
            return 0;
        }

        public static Matrix $default$getSensorToBufferTransformMatrix(ImageInfo imageInfo) {
            return new Matrix();
        }
    }

    int getFlashState();

    int getRotationDegrees();

    Matrix getSensorToBufferTransformMatrix();

    TagBundle getTagBundle();

    long getTimestamp();

    void populateExifData(ExifData.Builder builder);
}
