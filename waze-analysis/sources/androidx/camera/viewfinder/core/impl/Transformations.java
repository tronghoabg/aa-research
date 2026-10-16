package androidx.camera.viewfinder.core.impl;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.util.Size;
import android.util.SizeF;
import androidx.camera.viewfinder.core.ScaleType;
import androidx.camera.viewfinder.core.TransformationInfo;
import com.waze.strings.DisplayStrings;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class Transformations {
    public static final Transformations INSTANCE = new Transformations();

    private Transformations() {
    }

    private final RectF cropRectFor(TransformationInfo transformationInfo, Size size) {
        float cropRectLeft = transformationInfo.getCropRectLeft();
        if (true == Float.isNaN(cropRectLeft)) {
            cropRectLeft = 0.0f;
        }
        float cropRectTop = transformationInfo.getCropRectTop();
        float f2 = true != Float.isNaN(cropRectTop) ? cropRectTop : 0.0f;
        float cropRectRight = transformationInfo.getCropRectRight();
        if (Float.isNaN(cropRectRight)) {
            cropRectRight = size.getWidth();
        }
        float cropRectBottom = transformationInfo.getCropRectBottom();
        if (Float.isNaN(cropRectBottom)) {
            cropRectBottom = size.getHeight();
        }
        return new RectF(cropRectLeft, f2, cropRectRight, cropRectBottom);
    }

    private final Matrix getNormalizedToBuffer(RectF rectF) {
        Matrix matrix = new Matrix();
        matrix.setRectToRect(TransformationsKt.NORMALIZED_RECT, rectF, Matrix.ScaleToFit.FILL);
        return matrix;
    }

    private final Matrix getRectToRect(RectF rectF, RectF rectF2, int i2) {
        Matrix matrix = new Matrix();
        matrix.setRectToRect(rectF, TransformationsKt.NORMALIZED_RECT, Matrix.ScaleToFit.FILL);
        matrix.postRotate(i2);
        matrix.postConcat(INSTANCE.getNormalizedToBuffer(rectF2));
        return matrix;
    }

    public static final Matrix getSurfaceToViewfinderMatrix(Size size, Size size2, TransformationInfo transformationInfo, int i2, ContentScale contentScale, Alignment alignment) {
        x.f(size, "viewfinderSize");
        x.f(size2, "surfaceResolution");
        x.f(transformationInfo, "transformationInfo");
        x.f(contentScale, "contentScale");
        x.f(alignment, "alignment");
        Transformations transformations = INSTANCE;
        SizeF sizeFRotatedViewportFor = transformations.rotatedViewportFor(transformationInfo, size2);
        RectF rectF = transformations.isViewportAspectRatioMatchViewfinder$viewfinder_core(sizeFRotatedViewportFor, size) ? new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight()) : transformations.getViewfinderViewportRectForMismatchedAspectRatios(sizeFRotatedViewportFor, size, i2, contentScale, alignment);
        RectF rectFCropRectFor = transformations.cropRectFor(transformationInfo, size2);
        Matrix rectToRect = transformations.getRectToRect(rectFCropRectFor, rectF, transformationInfo.getSourceRotation());
        if (transformationInfo.isSourceMirroredHorizontally()) {
            if (transformations.is90or270(transformationInfo.getSourceRotation())) {
                rectToRect.preScale(1.0f, -1.0f, rectFCropRectFor.centerX(), rectFCropRectFor.centerY());
            } else {
                rectToRect.preScale(-1.0f, 1.0f, rectFCropRectFor.centerX(), rectFCropRectFor.centerY());
            }
        }
        if (transformationInfo.isSourceMirroredVertically()) {
            if (transformations.is90or270(transformationInfo.getSourceRotation())) {
                rectToRect.preScale(-1.0f, 1.0f, rectFCropRectFor.centerX(), rectFCropRectFor.centerY());
                return rectToRect;
            }
            rectToRect.preScale(1.0f, -1.0f, rectFCropRectFor.centerX(), rectFCropRectFor.centerY());
        }
        return rectToRect;
    }

    public static final Matrix getTextureViewCorrectionMatrix(int i2, int i3, int i4) {
        RectF rectF = new RectF(0.0f, 0.0f, i3, i4);
        return INSTANCE.getRectToRect(rectF, rectF, -i2);
    }

    private final RectF getViewfinderViewportRectForMismatchedAspectRatios(SizeF sizeF, Size size, int i2, ContentScale contentScale, Alignment alignment) {
        Matrix matrix = new Matrix();
        INSTANCE.setTransform(matrix, sizeF, size, i2, contentScale, alignment);
        RectF rectF = new RectF(0.0f, 0.0f, sizeF.getWidth(), sizeF.getHeight());
        matrix.mapRect(rectF);
        return rectF;
    }

    private final boolean is90or270(int i2) {
        if (i2 == 0) {
            return false;
        }
        if (i2 == 90) {
            return true;
        }
        if (i2 == 180) {
            return false;
        }
        if (i2 == 270) {
            return true;
        }
        throw new IllegalArgumentException("Invalid rotation degrees: " + i2);
    }

    private final boolean isAspectRatioMatchingWithRoundingError(SizeF sizeF, boolean z, Size size, boolean z2) {
        float width;
        float width2;
        float width3;
        float width4;
        if (z) {
            width2 = sizeF.getWidth() / sizeF.getHeight();
            width = width2;
        } else {
            float width5 = sizeF.getWidth() + 1.0f;
            float height = sizeF.getHeight() - 1.0f;
            width = (sizeF.getWidth() - 1.0f) / (sizeF.getHeight() + 1.0f);
            width2 = width5 / height;
        }
        if (z2) {
            width3 = size.getWidth() / size.getHeight();
            width4 = width3;
        } else {
            width3 = (size.getWidth() - 1.0f) / (size.getHeight() + 1.0f);
            width4 = (size.getWidth() + 1.0f) / (size.getHeight() - 1.0f);
        }
        return width2 >= width3 && width4 >= width;
    }

    private final SizeF rotatedViewportFor(TransformationInfo transformationInfo, Size size) {
        RectF rectFCropRectFor = cropRectFor(transformationInfo, size);
        return INSTANCE.is90or270(transformationInfo.getSourceRotation()) ? new SizeF(rectFCropRectFor.height(), rectFCropRectFor.width()) : new SizeF(rectFCropRectFor.width(), rectFCropRectFor.height());
    }

    private final void setTransform(Matrix matrix, SizeF sizeF, Size size, int i2, ContentScale contentScale, Alignment alignment) {
        long jMo1547computeScaleFactorho9e9VQ = contentScale.mo1547computeScaleFactorho9e9VQ(sizeF, toSizeF(size));
        matrix.setScale(ScaleFactorF.m1562getScaleXimpl(jMo1547computeScaleFactorho9e9VQ), ScaleFactorF.m1563getScaleYimpl(jMo1547computeScaleFactorho9e9VQ));
        long jMo1546align41g9ag8 = alignment.mo1546align41g9ag8(new SizeF(sizeF.getWidth() * ScaleFactorF.m1562getScaleXimpl(jMo1547computeScaleFactorho9e9VQ), sizeF.getHeight() * ScaleFactorF.m1563getScaleYimpl(jMo1547computeScaleFactorho9e9VQ)), INSTANCE.toSizeF(size), i2);
        matrix.postTranslate(OffsetF.m1552getXimpl(jMo1546align41g9ag8), OffsetF.m1553getYimpl(jMo1546align41g9ag8));
    }

    public static final int surfaceRotationToRotationDegrees(int i2) {
        if (i2 == 0) {
            return 0;
        }
        if (i2 == 1) {
            return 90;
        }
        if (i2 == 2) {
            return 180;
        }
        if (i2 == 3) {
            return DisplayStrings.DS_TRIP_OVERVIEW_NO_NAME_ORIGIN;
        }
        throw new UnsupportedOperationException("Unsupported surface rotation: " + i2);
    }

    private final SizeF toSizeF(Size size) {
        return new SizeF(size.getWidth(), size.getHeight());
    }

    public final boolean isViewportAspectRatioMatchViewfinder$viewfinder_core(SizeF sizeF, Size size) {
        x.f(sizeF, "rotatedViewportSize");
        x.f(size, "viewfinderSize");
        return isAspectRatioMatchingWithRoundingError(sizeF, false, size, true);
    }

    public static final Matrix getSurfaceToViewfinderMatrix(Size size, Size size2, TransformationInfo transformationInfo, int i2, ScaleType scaleType) {
        x.f(size, "viewfinderSize");
        x.f(size2, "surfaceResolution");
        x.f(transformationInfo, "transformationInfo");
        x.f(scaleType, "scaleType");
        return getSurfaceToViewfinderMatrix(size, size2, transformationInfo, i2, scaleType.getContentScale$viewfinder_core(), scaleType.getAlignment$viewfinder_core());
    }
}
