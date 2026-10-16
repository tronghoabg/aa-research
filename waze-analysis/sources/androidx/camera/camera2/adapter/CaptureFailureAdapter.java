package androidx.camera.camera2.adapter;

import android.hardware.camera2.CaptureFailure;
import androidx.camera.camera2.pipe.RequestFailure;
import androidx.camera.camera2.pipe.compat.AndroidCaptureFailure;
import androidx.camera.core.impl.CameraCaptureFailure;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class CaptureFailureAdapter extends CameraCaptureFailure {
    private final RequestFailure requestFailure;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CaptureFailureAdapter(RequestFailure requestFailure) {
        super(CameraCaptureFailure.Reason.ERROR);
        x.f(requestFailure, "requestFailure");
        this.requestFailure = requestFailure;
    }

    @Override // androidx.camera.core.impl.CameraCaptureFailure
    public CaptureFailure getCaptureFailure() {
        RequestFailure requestFailure = this.requestFailure;
        x.d(requestFailure, "null cannot be cast to non-null type androidx.camera.camera2.pipe.compat.AndroidCaptureFailure");
        Object objUnwrapAs = ((AndroidCaptureFailure) requestFailure).unwrapAs((Class<Object>) CaptureFailure.class);
        x.c(objUnwrapAs);
        return (CaptureFailure) objUnwrapAs;
    }
}
