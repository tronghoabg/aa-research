package androidx.camera.core.impl;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public class CameraCaptureFailure {
    private final Reason mReason;

    /* compiled from: WazeSource */
    public enum Reason {
        ERROR
    }

    public CameraCaptureFailure(Reason reason) {
        this.mReason = reason;
    }

    public Object getCaptureFailure() {
        return null;
    }

    public Reason getReason() {
        return this.mReason;
    }
}
