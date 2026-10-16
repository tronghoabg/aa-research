package androidx.camera.camera2.pipe.compat;

import androidx.camera.camera2.pipe.CameraId;
import h.ab;
import h.g.b.o;
import h.g.b.x;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.bo;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class RequestCloseById extends CameraRequest {
    private final String activeCameraId;
    private final CompletableDeferred<ab> deferred;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private RequestCloseById(String str) {
        super(null);
        x.f(str, "activeCameraId");
        this.activeCameraId = str;
        this.deferred = bo.j();
    }

    /* renamed from: getActiveCameraId-Dz_R5H8, reason: not valid java name */
    public final String m1090getActiveCameraIdDz_R5H8() {
        return this.activeCameraId;
    }

    public final CompletableDeferred<ab> getDeferred() {
        return this.deferred;
    }

    public String toString() {
        return "RequestCloseById(" + CameraId.m552toStringimpl(this.activeCameraId) + ")";
    }

    public /* synthetic */ RequestCloseById(String str, o oVar) {
        this(str);
    }
}
