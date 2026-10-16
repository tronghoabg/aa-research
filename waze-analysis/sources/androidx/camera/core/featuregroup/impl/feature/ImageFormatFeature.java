package androidx.camera.core.featuregroup.impl.feature;

import androidx.camera.core.featuregroup.GroupableFeature;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ImageFormatFeature extends GroupableFeature {
    public static final Companion Companion = new Companion(null);
    public static final int DEFAULT_IMAGE_CAPTURE_OUTPUT_FORMAT = 0;
    private final FeatureTypeInternal featureTypeInternal = FeatureTypeInternal.IMAGE_FORMAT;
    private final int imageCaptureOutputFormat;

    public ImageFormatFeature(int i2) {
        this.imageCaptureOutputFormat = i2;
    }

    private final String getOutputFormatLabel() {
        int i2 = this.imageCaptureOutputFormat;
        if (i2 == 0) {
            return "JPEG";
        }
        if (i2 == 1) {
            return "JPEG_R";
        }
        return "UNDEFINED(" + i2 + ")";
    }

    @Override // androidx.camera.core.featuregroup.GroupableFeature
    public FeatureTypeInternal getFeatureTypeInternal() {
        return this.featureTypeInternal;
    }

    public final int getImageCaptureOutputFormat() {
        return this.imageCaptureOutputFormat;
    }

    public String toString() {
        return "ImageFormatFeature(imageCaptureOutputFormat=" + getOutputFormatLabel() + ")";
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
