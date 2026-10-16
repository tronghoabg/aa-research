package androidx.camera.camera2.pipe.compat;

import android.hardware.camera2.CaptureFailure;
import androidx.camera.camera2.pipe.RequestFailure;
import androidx.camera.camera2.pipe.RequestMetadata;
import androidx.camera.camera2.pipe.UnsafeWrapper;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class AndroidCaptureFailure implements RequestFailure {
    private final CaptureFailure captureFailure;
    private final long frameNumber;
    private final int reason;
    private final RequestMetadata requestMetadata;
    private final boolean wasImageCaptured;

    public AndroidCaptureFailure(RequestMetadata requestMetadata, CaptureFailure captureFailure) {
        x.f(requestMetadata, "requestMetadata");
        x.f(captureFailure, "captureFailure");
        this.requestMetadata = requestMetadata;
        this.captureFailure = captureFailure;
        this.frameNumber = captureFailure.getFrameNumber();
        this.reason = captureFailure.getReason();
        this.wasImageCaptured = captureFailure.wasImageCaptured();
    }

    @Override // androidx.camera.camera2.pipe.RequestFailure
    /* renamed from: getFrameNumber-Ugla2oM */
    public long mo879getFrameNumberUgla2oM() {
        return this.frameNumber;
    }

    @Override // androidx.camera.camera2.pipe.RequestFailure
    public int getReason() {
        return this.reason;
    }

    @Override // androidx.camera.camera2.pipe.RequestFailure
    public RequestMetadata getRequestMetadata() {
        return this.requestMetadata;
    }

    @Override // androidx.camera.camera2.pipe.RequestFailure
    public boolean getWasImageCaptured() {
        return this.wasImageCaptured;
    }

    @Override // androidx.camera.camera2.pipe.UnsafeWrapper, androidx.camera.common.UnsafeWrapper
    public <T> T unwrapAs(Class<T> cls) {
        x.f(cls, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        if (x.n(cls, CaptureFailure.class)) {
            return (T) this.captureFailure;
        }
        return null;
    }

    @Override // androidx.camera.camera2.pipe.UnsafeWrapper
    public /* synthetic */ Object unwrapAs(h.l.c cVar) {
        return UnsafeWrapper.CC.$default$unwrapAs(this, cVar);
    }
}
