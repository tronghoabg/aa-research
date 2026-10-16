package androidx.camera.camera2.pipe;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface RequestFailure extends UnsafeWrapper {
    /* renamed from: getFrameNumber-Ugla2oM, reason: not valid java name */
    long mo879getFrameNumberUgla2oM();

    int getReason();

    RequestMetadata getRequestMetadata();

    boolean getWasImageCaptured();
}
