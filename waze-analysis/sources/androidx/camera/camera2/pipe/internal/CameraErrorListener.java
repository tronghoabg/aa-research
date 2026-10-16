package androidx.camera.camera2.pipe.internal;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface CameraErrorListener {

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.camera2.pipe.internal.CameraErrorListener$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        /* renamed from: onCameraError-3M5Xam4$default, reason: not valid java name */
        public static /* synthetic */ void m1203onCameraError3M5Xam4$default(CameraErrorListener cameraErrorListener, String str, int i2, boolean z, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onCameraError-3M5Xam4");
            }
            cameraErrorListener.mo1038onCameraError3M5Xam4(str, i2, z & ((i3 & 4) == 0));
        }
    }

    /* compiled from: WazeSource */
    public final class DefaultImpls {
    }

    /* renamed from: onCameraError-3M5Xam4 */
    void mo1038onCameraError3M5Xam4(String str, int i2, boolean z);
}
