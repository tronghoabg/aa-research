package androidx.camera.camera2.pipe;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class CameraCloseStallException extends RuntimeException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CameraCloseStallException(String str) {
        super(str);
        x.f(str, "message");
    }
}
