package androidx.camera.core.processing.util;

import android.graphics.Rect;
import android.util.Size;
import androidx.camera.core.impl.utils.TransformUtils;
import androidx.camera.core.processing.SurfaceEdge;
import java.util.UUID;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public abstract class OutConfig {
    public static OutConfig of(SurfaceEdge surfaceEdge) {
        return of(surfaceEdge.getTargets(), surfaceEdge.getFormat(), surfaceEdge.getCropRect(), TransformUtils.getRotatedSize(surfaceEdge.getCropRect(), surfaceEdge.getRotationDegrees()), surfaceEdge.getRotationDegrees(), surfaceEdge.isMirroring());
    }

    public abstract Rect getCropRect();

    public abstract int getFormat();

    public abstract int getRotationDegrees();

    public abstract Size getSize();

    public abstract int getTargets();

    abstract UUID getUuid();

    public abstract boolean isMirroring();

    public abstract boolean shouldRespectInputCropRect();

    public static OutConfig of(int i2, int i3, Rect rect, Size size, int i4, boolean z, boolean z2) {
        return new AutoValue_OutConfig(UUID.randomUUID(), i2, i3, rect, size, i4, z, z2);
    }

    public static OutConfig of(int i2, int i3, Rect rect, Size size, int i4, boolean z) {
        return of(i2, i3, rect, size, i4, z, false);
    }
}
