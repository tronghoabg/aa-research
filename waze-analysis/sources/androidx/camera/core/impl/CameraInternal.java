package androidx.camera.core.impl;

import androidx.camera.core.Camera;
import androidx.camera.core.CameraControl;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.UseCase;
import com.google.d.m.a.bm;
import java.util.Collection;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface CameraInternal extends Camera, UseCase.StateChangeCallback {

    /* compiled from: WazeSource */
    public enum State {
        RELEASED(false),
        RELEASING(true),
        CLOSED(false),
        PENDING_OPEN(false),
        CLOSING(true),
        OPENING(true),
        OPEN(true),
        CONFIGURED(true);

        private final boolean mHoldsCameraSlot;

        State(boolean z) {
            this.mHoldsCameraSlot = z;
        }

        boolean holdsCameraSlot() {
            return this.mHoldsCameraSlot;
        }
    }

    void attachUseCases(Collection<UseCase> collection);

    void close();

    void detachUseCases(Collection<UseCase> collection);

    @Override // androidx.camera.core.Camera
    CameraControl getCameraControl();

    CameraControlInternal getCameraControlInternal();

    @Override // androidx.camera.core.Camera
    CameraInfo getCameraInfo();

    CameraInfoInternal getCameraInfoInternal();

    Observable<State> getCameraState();

    @Override // androidx.camera.core.Camera
    CameraConfig getExtendedConfig();

    boolean getHasTransform();

    boolean isFrontFacing();

    boolean isRemoved();

    void onRemoved();

    void open();

    bm<Void> release();

    void setActiveResumingMode(boolean z);

    void setExtendedConfig(CameraConfig cameraConfig);

    void setPrimary(boolean z);

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.core.impl.CameraInternal$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static boolean $default$getHasTransform(CameraInternal cameraInternal) {
            return true;
        }

        public static boolean $default$isFrontFacing(CameraInternal cameraInternal) {
            return cameraInternal.getCameraInfo().getLensFacing() == 0;
        }

        public static boolean $default$isRemoved(CameraInternal cameraInternal) {
            return false;
        }

        public static void $default$onRemoved(CameraInternal cameraInternal) {
        }

        public static void $default$setActiveResumingMode(CameraInternal cameraInternal, boolean z) {
        }

        public static void $default$setExtendedConfig(CameraInternal cameraInternal, CameraConfig cameraConfig) {
        }

        public static void $default$setPrimary(CameraInternal cameraInternal, boolean z) {
        }
    }
}
