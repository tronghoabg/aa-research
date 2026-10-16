package androidx.camera.core.imagecapture;

import androidx.camera.core.ImageCaptureException;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface TakePictureManager {

    /* compiled from: WazeSource */
    public abstract class CaptureError {
        static CaptureError of(int i2, ImageCaptureException imageCaptureException) {
            return new AutoValue_TakePictureManager_CaptureError(i2, imageCaptureException);
        }

        abstract ImageCaptureException getImageCaptureException();

        abstract int getRequestId();
    }

    /* compiled from: WazeSource */
    public interface Provider {
        TakePictureManager newInstance(ImageCaptureControl imageCaptureControl);
    }

    void abortRequests();

    RequestWithCallback getCapturingRequest();

    ImagePipeline getImagePipeline();

    List<RequestWithCallback> getIncompleteRequests();

    boolean hasCapturingRequest();

    void offerRequest(TakePictureRequest takePictureRequest);

    void pause();

    void resume();

    void setImagePipeline(ImagePipeline imagePipeline);
}
