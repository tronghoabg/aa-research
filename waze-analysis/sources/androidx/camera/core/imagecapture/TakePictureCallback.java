package androidx.camera.core.imagecapture;

import android.graphics.Bitmap;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.ImageProxy;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface TakePictureCallback {
    boolean isAborted();

    void onCaptureFailure(ImageCaptureException imageCaptureException);

    void onCaptureProcessProgressed(int i2);

    void onCaptureStarted();

    void onFinalResult(ImageCapture.OutputFileResults outputFileResults);

    void onFinalResult(ImageProxy imageProxy);

    void onImageCaptured();

    void onPostviewBitmapAvailable(Bitmap bitmap);

    void onProcessFailure(ImageCaptureException imageCaptureException);
}
