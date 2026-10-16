package androidx.camera.viewfinder.core;

import com.waze.strings.DisplayStrings;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class TransformationInfo {
    public static final float CROP_NONE = Float.NaN;
    public static final Companion Companion = new Companion(null);
    public static final TransformationInfo DEFAULT = new TransformationInfo(0, false, false, 0.0f, 0.0f, 0.0f, 0.0f, 0, 255, null);
    private final float cropRectBottom;
    private final float cropRectLeft;
    private final float cropRectRight;
    private final float cropRectTop;
    private final boolean isSourceMirroredHorizontally;
    private final boolean isSourceMirroredVertically;
    private final int sourceRotation;
    private final int transformationMode;

    public /* synthetic */ TransformationInfo(int i2, boolean z, boolean z2, float f2, float f3, float f4, float f5, int i3, int i4, o oVar) {
        this(1 == (i4 & 1) ? 0 : i2, z & ((i4 & 2) == 0), z2 & ((i4 & 4) == 0), (i4 & 8) != 0 ? Float.NaN : f2, (i4 & 16) != 0 ? Float.NaN : f3, (i4 & 32) != 0 ? Float.NaN : f4, (i4 & 64) != 0 ? Float.NaN : f5, (i4 & 128) != 0 ? 0 : i3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransformationInfo)) {
            return false;
        }
        TransformationInfo transformationInfo = (TransformationInfo) obj;
        return this.sourceRotation == transformationInfo.sourceRotation && this.isSourceMirroredHorizontally == transformationInfo.isSourceMirroredHorizontally && this.isSourceMirroredVertically == transformationInfo.isSourceMirroredVertically && this.cropRectLeft == transformationInfo.cropRectLeft && this.cropRectTop == transformationInfo.cropRectTop && this.cropRectRight == transformationInfo.cropRectRight && this.cropRectBottom == transformationInfo.cropRectBottom && this.transformationMode == transformationInfo.transformationMode;
    }

    public final float getCropRectBottom() {
        return this.cropRectBottom;
    }

    public final float getCropRectLeft() {
        return this.cropRectLeft;
    }

    public final float getCropRectRight() {
        return this.cropRectRight;
    }

    public final float getCropRectTop() {
        return this.cropRectTop;
    }

    public final int getSourceRotation() {
        return this.sourceRotation;
    }

    public final int getTransformationMode() {
        return this.transformationMode;
    }

    public int hashCode() {
        int i2 = this.sourceRotation;
        float f2 = this.cropRectLeft;
        return (((((((((((((i2 * 31) + TransformationInfo$$ExternalSyntheticBackport0.m(this.isSourceMirroredHorizontally)) * 31) + TransformationInfo$$ExternalSyntheticBackport0.m(this.isSourceMirroredVertically)) * 31) + Float.floatToIntBits(f2)) * 31) + Float.floatToIntBits(this.cropRectTop)) * 31) + Float.floatToIntBits(this.cropRectRight)) * 31) + Float.floatToIntBits(this.cropRectBottom)) * 31) + this.transformationMode;
    }

    public final boolean isSourceMirroredHorizontally() {
        return this.isSourceMirroredHorizontally;
    }

    public final boolean isSourceMirroredVertically() {
        return this.isSourceMirroredVertically;
    }

    public String toString() {
        return "TransformationInfo(sourceRotation=" + this.sourceRotation + ", isSourceMirroredHorizontally=" + this.isSourceMirroredHorizontally + ", isSourceMirroredVertically=" + this.isSourceMirroredVertically + ", cropRectLeft=" + this.cropRectLeft + ", cropRectTop=" + this.cropRectTop + ", cropRectRight=" + this.cropRectRight + ", cropRectBottom=" + this.cropRectBottom + ", transformationMode=" + this.transformationMode + ")";
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public TransformationInfo(int i2) {
        this(i2, false, false, 0.0f, 0.0f, 0.0f, 0.0f, 0, DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_ENDPOINT_2W_2, null);
    }

    public TransformationInfo(int i2, boolean z) {
        this(i2, z, false, 0.0f, 0.0f, 0.0f, 0.0f, 0, DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_ENDPOINT_NEW_USER_5, null);
    }

    public TransformationInfo(int i2, boolean z, boolean z2) {
        this(i2, z, z2, 0.0f, 0.0f, 0.0f, 0.0f, 0, DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_ENDPOINT_NEW_USER_1, null);
    }

    public TransformationInfo(int i2, boolean z, boolean z2, float f2) {
        this(i2, z, z2, f2, 0.0f, 0.0f, 0.0f, 0, 240, null);
    }

    public TransformationInfo(int i2, boolean z, boolean z2, float f2, float f3) {
        this(i2, z, z2, f2, f3, 0.0f, 0.0f, 0, 224, null);
    }

    public TransformationInfo(int i2, boolean z, boolean z2, float f2, float f3, float f4) {
        this(i2, z, z2, f2, f3, f4, 0.0f, 0, 192, null);
    }

    public TransformationInfo(int i2, boolean z, boolean z2, float f2, float f3, float f4, float f5) {
        this(i2, z, z2, f2, f3, f4, f5, 0, 128, null);
    }

    public TransformationInfo(int i2, boolean z, boolean z2, float f2, float f3, float f4, float f5, int i3) {
        this.sourceRotation = i2;
        this.isSourceMirroredHorizontally = z;
        this.isSourceMirroredVertically = z2;
        this.cropRectLeft = f2;
        this.cropRectTop = f3;
        this.cropRectRight = f4;
        this.cropRectBottom = f5;
        this.transformationMode = i3;
    }

    public TransformationInfo() {
        this(0, false, false, 0.0f, 0.0f, 0.0f, 0.0f, 0, 255, null);
    }
}
