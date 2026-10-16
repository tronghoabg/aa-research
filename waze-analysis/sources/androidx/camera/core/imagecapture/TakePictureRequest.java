package androidx.camera.core.imagecapture;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.core.internal.compat.workaround.CaptureFailedRetryEnabler;
import androidx.core.util.Preconditions;
import j$.util.Objects;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public abstract class TakePictureRequest {
    private static final String TAG = "TakePictureRequest";
    private int mRemainingRetires = new CaptureFailedRetryEnabler().getRetryCount();
    private final Map<Integer, Boolean> mFormatCaptureStatus = new HashMap();

    /* compiled from: WazeSource */
    interface RetryControl {
        void retryRequest(TakePictureRequest takePictureRequest);
    }

    public static TakePictureRequest of(Executor executor, ImageCapture.OnImageCapturedCallback onImageCapturedCallback, ImageCapture.OnImageSavedCallback onImageSavedCallback, ImageCapture.OutputFileOptions outputFileOptions, ImageCapture.OutputFileOptions outputFileOptions2, Rect rect, Matrix matrix, int i2, int i3, int i4, boolean z, List<CameraCaptureCallback> list) {
        Preconditions.checkArgument((onImageSavedCallback == null) == (outputFileOptions == null), "onDiskCallback and outputFileOptions should be both null or both non-null.");
        Preconditions.checkArgument((onImageCapturedCallback == null) ^ (onImageSavedCallback == null), "One and only one on-disk or in-memory callback should be present.");
        AutoValue_TakePictureRequest autoValue_TakePictureRequest = new AutoValue_TakePictureRequest(executor, onImageCapturedCallback, onImageSavedCallback, outputFileOptions, outputFileOptions2, rect, matrix, i2, i3, i4, z, list);
        if (z) {
            autoValue_TakePictureRequest.initFormatProcessStatusInSimultaneousCapture();
        }
        return autoValue_TakePictureRequest;
    }

    boolean decrementRetryCounter() {
        Threads.checkMainThread();
        int i2 = this.mRemainingRetires;
        if (i2 <= 0) {
            return false;
        }
        this.mRemainingRetires = i2 - 1;
        return true;
    }

    abstract Executor getAppExecutor();

    abstract int getCaptureMode();

    public abstract Rect getCropRect();

    public abstract ImageCapture.OnImageCapturedCallback getInMemoryCallback();

    public abstract int getJpegQuality();

    public abstract ImageCapture.OnImageSavedCallback getOnDiskCallback();

    public abstract ImageCapture.OutputFileOptions getOutputFileOptions();

    int getRemainingRetries() {
        Threads.checkMainThread();
        return this.mRemainingRetires;
    }

    public abstract int getRotationDegrees();

    public abstract ImageCapture.OutputFileOptions getSecondaryOutputFileOptions();

    abstract Matrix getSensorToBufferTransform();

    abstract List<CameraCaptureCallback> getSessionConfigCameraCaptureCallbacks();

    void incrementRetryCounter() {
        Threads.checkMainThread();
        this.mRemainingRetires++;
    }

    void initFormatProcessStatusInSimultaneousCapture() {
        this.mFormatCaptureStatus.put(32, false);
        this.mFormatCaptureStatus.put(256, false);
    }

    boolean isFormatProcessedInSimultaneousCapture() {
        Iterator<Map.Entry<Integer, Boolean>> it = this.mFormatCaptureStatus.entrySet().iterator();
        while (it.hasNext()) {
            if (!it.next().getValue().booleanValue()) {
                return false;
            }
        }
        return true;
    }

    abstract boolean isSimultaneousCapture();

    /* renamed from: lambda$onCaptureProcessProgressed$3$androidx-camera-core-imagecapture-TakePictureRequest, reason: not valid java name */
    /* synthetic */ void m1354x43aa6c74(int i2) {
        if (getOnDiskCallback() != null) {
            getOnDiskCallback().onCaptureProcessProgressed(i2);
        } else if (getInMemoryCallback() != null) {
            getInMemoryCallback().onCaptureProcessProgressed(i2);
        }
    }

    /* renamed from: lambda$onError$0$androidx-camera-core-imagecapture-TakePictureRequest, reason: not valid java name */
    /* synthetic */ void m1355x9daf4b5c(ImageCaptureException imageCaptureException) {
        ImageCapture.OnImageCapturedCallback inMemoryCallback = getInMemoryCallback();
        boolean z = getOnDiskCallback() != null;
        boolean z2 = inMemoryCallback != null;
        if (z2 && !z) {
            ((ImageCapture.OnImageCapturedCallback) Objects.requireNonNull(getInMemoryCallback())).onError(imageCaptureException);
        } else {
            if (!z || z2) {
                throw new IllegalStateException("One and only one callback is allowed.");
            }
            ((ImageCapture.OnImageSavedCallback) Objects.requireNonNull(getOnDiskCallback())).onError(imageCaptureException);
        }
    }

    /* renamed from: lambda$onPostviewBitmapAvailable$4$androidx-camera-core-imagecapture-TakePictureRequest, reason: not valid java name */
    /* synthetic */ void m1356xa594fdeb(Bitmap bitmap) {
        if (getOnDiskCallback() != null) {
            getOnDiskCallback().onPostviewBitmapAvailable(bitmap);
        } else if (getInMemoryCallback() != null) {
            getInMemoryCallback().onPostviewBitmapAvailable(bitmap);
        }
    }

    /* renamed from: lambda$onResult$1$androidx-camera-core-imagecapture-TakePictureRequest, reason: not valid java name */
    /* synthetic */ void m1357x75636bce(ImageCapture.OutputFileResults outputFileResults) {
        ((ImageCapture.OnImageSavedCallback) Objects.requireNonNull(getOnDiskCallback())).onImageSaved((ImageCapture.OutputFileResults) Objects.requireNonNull(outputFileResults));
    }

    /* renamed from: lambda$onResult$2$androidx-camera-core-imagecapture-TakePictureRequest, reason: not valid java name */
    /* synthetic */ void m1358x8f7eea6d(ImageProxy imageProxy) {
        ((ImageCapture.OnImageCapturedCallback) Objects.requireNonNull(getInMemoryCallback())).onCaptureSuccess((ImageProxy) Objects.requireNonNull(imageProxy));
    }

    void markFormatProcessStatusInSimultaneousCapture(int i2, boolean z) {
        Map<Integer, Boolean> map = this.mFormatCaptureStatus;
        Integer numValueOf = Integer.valueOf(i2);
        if (map.containsKey(numValueOf)) {
            this.mFormatCaptureStatus.put(numValueOf, Boolean.valueOf(z));
        } else {
            Logger.e(TAG, "The format is not supported in simultaneous capture");
        }
    }

    void onCaptureProcessProgressed(final int i2) {
        getAppExecutor().execute(new Runnable() { // from class: androidx.camera.core.imagecapture.TakePictureRequest$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m1354x43aa6c74(i2);
            }
        });
    }

    void onError(final ImageCaptureException imageCaptureException) {
        getAppExecutor().execute(new Runnable() { // from class: androidx.camera.core.imagecapture.TakePictureRequest$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m1355x9daf4b5c(imageCaptureException);
            }
        });
    }

    void onPostviewBitmapAvailable(final Bitmap bitmap) {
        getAppExecutor().execute(new Runnable() { // from class: androidx.camera.core.imagecapture.TakePictureRequest$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m1356xa594fdeb(bitmap);
            }
        });
    }

    void onResult(final ImageCapture.OutputFileResults outputFileResults) {
        getAppExecutor().execute(new Runnable() { // from class: androidx.camera.core.imagecapture.TakePictureRequest$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m1357x75636bce(outputFileResults);
            }
        });
    }

    void onResult(final ImageProxy imageProxy) {
        getAppExecutor().execute(new Runnable() { // from class: androidx.camera.core.imagecapture.TakePictureRequest$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m1358x8f7eea6d(imageProxy);
            }
        });
    }
}
