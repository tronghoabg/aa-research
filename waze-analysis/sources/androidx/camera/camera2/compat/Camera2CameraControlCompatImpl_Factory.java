package androidx.camera.camera2.compat;

import c.b.c;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class Camera2CameraControlCompatImpl_Factory implements c<Camera2CameraControlCompatImpl> {

    /* compiled from: WazeSource */
    final class InstanceHolder {
        static final Camera2CameraControlCompatImpl_Factory INSTANCE = new Camera2CameraControlCompatImpl_Factory();

        private InstanceHolder() {
        }
    }

    public static Camera2CameraControlCompatImpl_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static Camera2CameraControlCompatImpl newInstance() {
        return new Camera2CameraControlCompatImpl();
    }

    @Override // g.a.a, f.a.a
    public Camera2CameraControlCompatImpl get() {
        return newInstance();
    }
}
