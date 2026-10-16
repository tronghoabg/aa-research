package androidx.camera.camera2.adapter;

import c.b.c;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class CameraSessionLifecycleAdapter_Factory implements c<CameraSessionLifecycleAdapter> {

    /* compiled from: WazeSource */
    final class InstanceHolder {
        static final CameraSessionLifecycleAdapter_Factory INSTANCE = new CameraSessionLifecycleAdapter_Factory();

        private InstanceHolder() {
        }
    }

    public static CameraSessionLifecycleAdapter_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static CameraSessionLifecycleAdapter newInstance() {
        return new CameraSessionLifecycleAdapter();
    }

    @Override // g.a.a, f.a.a
    public CameraSessionLifecycleAdapter get() {
        return newInstance();
    }
}
