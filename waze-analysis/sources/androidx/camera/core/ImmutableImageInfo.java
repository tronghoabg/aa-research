package androidx.camera.core;

import android.graphics.Matrix;
import androidx.camera.core.impl.TagBundle;
import androidx.camera.core.impl.utils.ExifData;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public abstract class ImmutableImageInfo implements ImageInfo {
    public static ImageInfo create(TagBundle tagBundle, long j2, int i2, Matrix matrix, int i3) {
        return new AutoValue_ImmutableImageInfo(tagBundle, j2, i2, matrix, i3);
    }

    @Override // androidx.camera.core.ImageInfo
    public abstract int getFlashState();

    @Override // androidx.camera.core.ImageInfo
    public abstract int getRotationDegrees();

    @Override // androidx.camera.core.ImageInfo
    public abstract Matrix getSensorToBufferTransformMatrix();

    @Override // androidx.camera.core.ImageInfo
    public abstract TagBundle getTagBundle();

    @Override // androidx.camera.core.ImageInfo
    public abstract long getTimestamp();

    @Override // androidx.camera.core.ImageInfo
    public void populateExifData(ExifData.Builder builder) throws NumberFormatException {
        builder.setOrientationDegrees(getRotationDegrees());
    }
}
