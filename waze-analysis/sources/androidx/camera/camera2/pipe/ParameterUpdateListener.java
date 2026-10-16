package androidx.camera.camera2.pipe;

import android.hardware.camera2.CaptureRequest;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface ParameterUpdateListener {
    CaptureRequest.Key<?> getKey();

    /* renamed from: onUpdateCompleted-CcXjc1I, reason: not valid java name */
    void m849onUpdateCompletedCcXjc1I(RequestMetadata requestMetadata, long j2, FrameInfo frameInfo);

    void onUpdateRequestCreated(RequestMetadata requestMetadata);

    void onUpdateRequestSubmitted(RequestMetadata requestMetadata);

    void onUpdateSkipped(RequestFailure requestFailure);

    /* renamed from: onUpdateStarted-uGKBvU4, reason: not valid java name */
    void m850onUpdateStarteduGKBvU4(RequestMetadata requestMetadata, long j2, long j3);
}
