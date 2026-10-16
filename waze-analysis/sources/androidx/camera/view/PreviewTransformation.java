package androidx.camera.view;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import android.view.Display;
import android.view.TextureView;
import android.view.View;
import androidx.camera.core.Logger;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.utils.CameraOrientationUtil;
import androidx.camera.core.impl.utils.TransformUtils;
import androidx.camera.view.PreviewView;
import androidx.core.util.Preconditions;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class PreviewTransformation {
    private static final PreviewView.ScaleType DEFAULT_SCALE_TYPE = PreviewView.ScaleType.FILL_CENTER;
    private static final String TAG = "PreviewTransform";
    private boolean mHasCameraTransform;
    private boolean mIsFrontCamera;
    private int mPreviewRotationDegrees;
    private Size mResolution;
    private PreviewView.ScaleType mScaleType = DEFAULT_SCALE_TYPE;
    private Matrix mSensorToBufferTransform;
    private Rect mSurfaceCropRect;
    private int mTargetRotation;

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.view.PreviewTransformation$1, reason: invalid class name */
    /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$androidx$camera$view$PreviewView$ScaleType;

        static {
            int[] iArr = new int[PreviewView.ScaleType.values().length];
            $SwitchMap$androidx$camera$view$PreviewView$ScaleType = iArr;
            try {
                iArr[PreviewView.ScaleType.FIT_CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$androidx$camera$view$PreviewView$ScaleType[PreviewView.ScaleType.FILL_CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$androidx$camera$view$PreviewView$ScaleType[PreviewView.ScaleType.FIT_END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$androidx$camera$view$PreviewView$ScaleType[PreviewView.ScaleType.FILL_END.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$androidx$camera$view$PreviewView$ScaleType[PreviewView.ScaleType.FIT_START.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$androidx$camera$view$PreviewView$ScaleType[PreviewView.ScaleType.FILL_START.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    PreviewTransformation() {
    }

    private static RectF flipHorizontally(RectF rectF, float f2) {
        float f3 = f2 + f2;
        return new RectF(f3 - rectF.right, rectF.top, f3 - rectF.left, rectF.bottom);
    }

    private int getRemainingRotationDegrees() {
        return !this.mHasCameraTransform ? this.mPreviewRotationDegrees : -CameraOrientationUtil.surfaceRotationToDegrees(this.mTargetRotation);
    }

    private Size getRotatedViewportSize() {
        return TransformUtils.is90or270(this.mPreviewRotationDegrees) ? new Size(this.mSurfaceCropRect.height(), this.mSurfaceCropRect.width()) : new Size(this.mSurfaceCropRect.width(), this.mSurfaceCropRect.height());
    }

    private RectF getTransformedSurfaceRect(Size size, int i2) {
        Preconditions.checkState(isTransformationInfoReady());
        Matrix surfaceToPreviewViewMatrix = getSurfaceToPreviewViewMatrix(size, i2);
        RectF rectF = new RectF(0.0f, 0.0f, this.mResolution.getWidth(), this.mResolution.getHeight());
        surfaceToPreviewViewMatrix.mapRect(rectF);
        return rectF;
    }

    private boolean isTransformationInfoReady() {
        return (this.mSurfaceCropRect == null || this.mResolution == null || !(!this.mHasCameraTransform || this.mTargetRotation != -1)) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void setMatrixRectToRect(android.graphics.Matrix r3, android.graphics.RectF r4, android.graphics.RectF r5, androidx.camera.view.PreviewView.ScaleType r6) {
        /*
            androidx.camera.view.PreviewView$ScaleType r0 = androidx.camera.view.PreviewView.ScaleType.FILL_START
            int r0 = r6.ordinal()
            if (r0 == 0) goto L32
            r1 = 1
            if (r0 == r1) goto L2f
            r1 = 2
            if (r0 == r1) goto L2c
            r1 = 3
            if (r0 == r1) goto L32
            r1 = 4
            if (r0 == r1) goto L2f
            r1 = 5
            if (r0 == r1) goto L2c
            java.util.Objects.toString(r6)
            java.lang.String r0 = java.lang.String.valueOf(r6)
            java.lang.String r1 = "PreviewTransform"
            java.lang.String r2 = "Unexpected crop rect: "
            java.lang.String r0 = r2.concat(r0)
            androidx.camera.core.Logger.e(r1, r0)
            android.graphics.Matrix$ScaleToFit r0 = android.graphics.Matrix.ScaleToFit.FILL
            goto L34
        L2c:
            android.graphics.Matrix$ScaleToFit r0 = android.graphics.Matrix.ScaleToFit.END
            goto L34
        L2f:
            android.graphics.Matrix$ScaleToFit r0 = android.graphics.Matrix.ScaleToFit.CENTER
            goto L34
        L32:
            android.graphics.Matrix$ScaleToFit r0 = android.graphics.Matrix.ScaleToFit.START
        L34:
            androidx.camera.view.PreviewView$ScaleType r1 = androidx.camera.view.PreviewView.ScaleType.FIT_CENTER
            if (r6 == r1) goto L48
            androidx.camera.view.PreviewView$ScaleType r1 = androidx.camera.view.PreviewView.ScaleType.FIT_START
            if (r6 == r1) goto L48
            androidx.camera.view.PreviewView$ScaleType r1 = androidx.camera.view.PreviewView.ScaleType.FIT_END
            if (r6 != r1) goto L41
            goto L48
        L41:
            r3.setRectToRect(r5, r4, r0)
            r3.invert(r3)
            return
        L48:
            r3.setRectToRect(r4, r5, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.view.PreviewTransformation.setMatrixRectToRect(android.graphics.Matrix, android.graphics.RectF, android.graphics.RectF, androidx.camera.view.PreviewView$ScaleType):void");
    }

    Bitmap createTransformedBitmap(Bitmap bitmap, Size size, int i2) {
        if (!isTransformationInfoReady()) {
            return bitmap;
        }
        Matrix textureViewCorrectionMatrix = getTextureViewCorrectionMatrix();
        RectF transformedSurfaceRect = getTransformedSurfaceRect(size, i2);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(size.getWidth(), size.getHeight(), bitmap.getConfig());
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Matrix matrix = new Matrix();
        matrix.postConcat(textureViewCorrectionMatrix);
        matrix.postScale(transformedSurfaceRect.width() / this.mResolution.getWidth(), transformedSurfaceRect.height() / this.mResolution.getHeight());
        matrix.postTranslate(transformedSurfaceRect.left, transformedSurfaceRect.top);
        canvas.drawBitmap(bitmap, matrix, new Paint(7));
        return bitmapCreateBitmap;
    }

    Matrix getPreviewViewToNormalizedSensorMatrix(Size size, int i2, Rect rect) {
        if (!isTransformationInfoReady()) {
            return null;
        }
        Matrix matrix = new Matrix();
        getSensorToViewTransform(size, i2).invert(matrix);
        Matrix matrix2 = new Matrix();
        matrix2.setRectToRect(new RectF(0.0f, 0.0f, rect.width(), rect.height()), new RectF(0.0f, 0.0f, 1.0f, 1.0f), Matrix.ScaleToFit.FILL);
        matrix.postConcat(matrix2);
        return matrix;
    }

    RectF getPreviewViewViewportRectForMismatchedAspectRatios(Size size, int i2) {
        RectF rectF = new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight());
        Size rotatedViewportSize = getRotatedViewportSize();
        RectF rectF2 = new RectF(0.0f, 0.0f, rotatedViewportSize.getWidth(), rotatedViewportSize.getHeight());
        Matrix matrix = new Matrix();
        setMatrixRectToRect(matrix, rectF2, rectF, this.mScaleType);
        matrix.mapRect(rectF2);
        return i2 == 1 ? flipHorizontally(rectF2, size.getWidth() / 2.0f) : rectF2;
    }

    PreviewView.ScaleType getScaleType() {
        return this.mScaleType;
    }

    Matrix getSensorToViewTransform(Size size, int i2) {
        if (!isTransformationInfoReady()) {
            return null;
        }
        Matrix matrix = new Matrix(this.mSensorToBufferTransform);
        matrix.postConcat(getSurfaceToPreviewViewMatrix(size, i2));
        return matrix;
    }

    Rect getSurfaceCropRect() {
        return this.mSurfaceCropRect;
    }

    Matrix getSurfaceToPreviewViewMatrix(Size size, int i2) {
        Preconditions.checkState(isTransformationInfoReady());
        Matrix rectToRect = TransformUtils.getRectToRect(new RectF(this.mSurfaceCropRect), isViewportAspectRatioMatchPreviewView(size) ? new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight()) : getPreviewViewViewportRectForMismatchedAspectRatios(size, i2), this.mPreviewRotationDegrees);
        if (this.mIsFrontCamera && this.mHasCameraTransform) {
            boolean zIs90or270 = TransformUtils.is90or270(this.mPreviewRotationDegrees);
            Rect rect = this.mSurfaceCropRect;
            if (zIs90or270) {
                rectToRect.preScale(1.0f, -1.0f, rect.centerX(), this.mSurfaceCropRect.centerY());
                return rectToRect;
            }
            rectToRect.preScale(-1.0f, 1.0f, rect.centerX(), this.mSurfaceCropRect.centerY());
        }
        return rectToRect;
    }

    Matrix getTextureViewCorrectionMatrix() {
        Preconditions.checkState(isTransformationInfoReady());
        RectF rectF = new RectF(0.0f, 0.0f, this.mResolution.getWidth(), this.mResolution.getHeight());
        return TransformUtils.getRectToRect(rectF, rectF, getRemainingRotationDegrees());
    }

    boolean isViewportAspectRatioMatchPreviewView(Size size) {
        return TransformUtils.isAspectRatioMatchingWithRoundingError(size, true, getRotatedViewportSize(), false);
    }

    void overrideWithDisplayRotation(int i2, int i3) {
        if (this.mHasCameraTransform) {
            this.mPreviewRotationDegrees = i2;
            this.mTargetRotation = i3;
        }
    }

    void setScaleType(PreviewView.ScaleType scaleType) {
        this.mScaleType = scaleType;
    }

    void setTransformationInfo(SurfaceRequest.TransformationInfo transformationInfo, Size size, boolean z) {
        Logger.d(TAG, "Transformation info set: " + transformationInfo + " " + size + " " + z);
        this.mSurfaceCropRect = transformationInfo.getCropRect();
        this.mPreviewRotationDegrees = transformationInfo.getRotationDegrees();
        this.mTargetRotation = transformationInfo.getTargetRotation();
        this.mResolution = size;
        this.mIsFrontCamera = z;
        this.mHasCameraTransform = transformationInfo.hasCameraTransform();
        this.mSensorToBufferTransform = transformationInfo.getSensorToBufferTransform();
    }

    void transformView(Size size, int i2, View view) {
        if (size.getHeight() == 0 || size.getWidth() == 0) {
            Objects.toString(size);
            Logger.w(TAG, "Transform not applied due to PreviewView size: ".concat(String.valueOf(size)));
            return;
        }
        if (isTransformationInfoReady()) {
            if (view instanceof TextureView) {
                ((TextureView) view).setTransform(getTextureViewCorrectionMatrix());
            } else {
                Display display = view.getDisplay();
                boolean z = (!this.mHasCameraTransform || display == null || display.getRotation() == this.mTargetRotation) ? false : true;
                boolean z2 = (this.mHasCameraTransform || getRemainingRotationDegrees() == 0) ? false : true;
                if (z || z2) {
                    Logger.e(TAG, "Custom rotation not supported with SurfaceView/PERFORMANCE mode.");
                }
            }
            RectF transformedSurfaceRect = getTransformedSurfaceRect(size, i2);
            view.setPivotX(0.0f);
            view.setPivotY(0.0f);
            view.setScaleX(transformedSurfaceRect.width() / this.mResolution.getWidth());
            view.setScaleY(transformedSurfaceRect.height() / this.mResolution.getHeight());
            view.setTranslationX(transformedSurfaceRect.left - view.getLeft());
            view.setTranslationY(transformedSurfaceRect.top - view.getTop());
        }
    }
}
