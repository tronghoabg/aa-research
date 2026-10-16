package androidx.camera.camera2.pipe;

import androidx.camera.camera2.pipe.Request;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface CaptureSequence<TCaptureRequest> {

    /* compiled from: WazeSource */
    public interface CaptureSequenceListener {
        void onCaptureSequenceComplete(CaptureSequence<?> captureSequence);
    }

    /* renamed from: getCameraId-Dz_R5H8, reason: not valid java name */
    String mo595getCameraIdDz_R5H8();

    List<RequestMetadata> getCaptureMetadataList();

    List<TCaptureRequest> getCaptureRequestList();

    List<Request.Listener> getListeners();

    boolean getRepeating();

    CaptureSequenceListener getSequenceListener();

    int getSequenceNumber();

    void setSequenceNumber(int i2);
}
