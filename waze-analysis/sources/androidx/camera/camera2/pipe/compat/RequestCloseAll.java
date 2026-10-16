package androidx.camera.camera2.pipe.compat;

import h.ab;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.bo;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class RequestCloseAll extends CameraRequest {
    private final CompletableDeferred<ab> deferred;

    public RequestCloseAll() {
        super(null);
        this.deferred = bo.j();
    }

    public final CompletableDeferred<ab> getDeferred() {
        return this.deferred;
    }

    public String toString() {
        return "RequestCloseAll";
    }
}
