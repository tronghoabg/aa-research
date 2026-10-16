package androidx.camera.core.imagecapture;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.CaptureBundle;
import androidx.camera.core.impl.CaptureStage;
import com.google.d.m.a.bm;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public class ProcessingRequest {
    static final int PROGRESS_NOT_RECEIVED = -1;
    private static final String TAG = "ProcessingRequest";
    private final TakePictureCallback mCallback;
    final bm<Void> mCaptureFuture;
    private final Rect mCropRect;
    private final int mJpegQuality;
    private int mLastCaptureProcessProgressed;
    private final ImageCapture.OutputFileOptions mOutputFileOptions;
    private final int mRequestId;
    private final int mRotationDegrees;
    private final ImageCapture.OutputFileOptions mSecondaryOutputFileOptions;
    private final Matrix mSensorToBufferTransform;
    private final List<Integer> mStageIds;
    private final String mTagBundleKey;
    TakePictureRequest mTakePictureRequest;

    ProcessingRequest(CaptureBundle captureBundle, TakePictureRequest takePictureRequest, TakePictureCallback takePictureCallback, bm<Void> bmVar, int i2) {
        this.mLastCaptureProcessProgressed = -1;
        this.mRequestId = i2;
        this.mTakePictureRequest = takePictureRequest;
        this.mOutputFileOptions = takePictureRequest.getOutputFileOptions();
        this.mSecondaryOutputFileOptions = takePictureRequest.getSecondaryOutputFileOptions();
        this.mJpegQuality = takePictureRequest.getJpegQuality();
        this.mRotationDegrees = takePictureRequest.getRotationDegrees();
        this.mCropRect = takePictureRequest.getCropRect();
        this.mSensorToBufferTransform = takePictureRequest.getSensorToBufferTransform();
        this.mCallback = takePictureCallback;
        this.mTagBundleKey = String.valueOf(captureBundle.hashCode());
        this.mStageIds = new ArrayList();
        Iterator it = ((List) Objects.requireNonNull(captureBundle.getCaptureStages())).iterator();
        while (it.hasNext()) {
            this.mStageIds.add(Integer.valueOf(((CaptureStage) it.next()).getId()));
        }
        this.mCaptureFuture = bmVar;
        Logger.d(TAG, "ProcessingRequest: mRequestId = " + this.mRequestId + ", mTagBundleKey = " + this.mTagBundleKey);
    }

    bm<Void> getCaptureFuture() {
        return this.mCaptureFuture;
    }

    Rect getCropRect() {
        return this.mCropRect;
    }

    int getJpegQuality() {
        return this.mJpegQuality;
    }

    ImageCapture.OutputFileOptions getOutputFileOptions() {
        return this.mOutputFileOptions;
    }

    public int getRequestId() {
        return this.mRequestId;
    }

    int getRotationDegrees() {
        return this.mRotationDegrees;
    }

    ImageCapture.OutputFileOptions getSecondaryOutputFileOptions() {
        return this.mSecondaryOutputFileOptions;
    }

    Matrix getSensorToBufferTransform() {
        return this.mSensorToBufferTransform;
    }

    List<Integer> getStageIds() {
        return this.mStageIds;
    }

    String getTagBundleKey() {
        return this.mTagBundleKey;
    }

    TakePictureRequest getTakePictureRequest() {
        return this.mTakePictureRequest;
    }

    boolean isAborted() {
        return this.mCallback.isAborted();
    }

    boolean isInMemoryCapture() {
        return getOutputFileOptions() == null && getSecondaryOutputFileOptions() == null;
    }

    void onCaptureFailure(ImageCaptureException imageCaptureException) {
        Logger.w(TAG, "onCaptureFailure: request ID = " + this.mRequestId, imageCaptureException);
        this.mCallback.onCaptureFailure(imageCaptureException);
    }

    void onCaptureProcessProgressed(int i2) {
        if (this.mLastCaptureProcessProgressed != i2) {
            this.mLastCaptureProcessProgressed = i2;
            this.mCallback.onCaptureProcessProgressed(i2);
        }
    }

    void onCaptureStarted() {
        Logger.d(TAG, "onCaptureStarted: request ID = " + this.mRequestId);
        this.mCallback.onCaptureStarted();
    }

    void onFinalResult(ImageCapture.OutputFileResults outputFileResults) {
        Logger.i(TAG, "onFinalResult(OutputFileResults): request ID = " + this.mRequestId);
        this.mCallback.onFinalResult(outputFileResults);
    }

    void onImageCaptured() {
        Logger.i(TAG, "onImageCaptured: request ID = " + this.mRequestId);
        if (this.mLastCaptureProcessProgressed != -1) {
            onCaptureProcessProgressed(100);
        }
        this.mCallback.onImageCaptured();
    }

    void onPostviewBitmapAvailable(Bitmap bitmap) {
        Logger.i(TAG, "onPostviewBitmapAvailable: request ID = " + this.mRequestId);
        this.mCallback.onPostviewBitmapAvailable(bitmap);
    }

    void onProcessFailure(ImageCaptureException imageCaptureException) {
        Logger.w(TAG, "onProcessFailure: request ID = " + this.mRequestId, imageCaptureException);
        this.mCallback.onProcessFailure(imageCaptureException);
    }

    void onFinalResult(ImageProxy imageProxy) {
        Logger.i(TAG, "onFinalResult(ImageProxy): request ID = " + this.mRequestId);
        this.mCallback.onFinalResult(imageProxy);
    }

    ProcessingRequest(CaptureBundle captureBundle, TakePictureRequest takePictureRequest, TakePictureCallback takePictureCallback, bm<Void> bmVar) {
        this(captureBundle, takePictureRequest, takePictureCallback, bmVar, 0);
    }
}
