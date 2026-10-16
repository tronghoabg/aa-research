package androidx.camera.camera2.impl;

import c.b.c;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class CameraCallbackMap_Factory implements c<CameraCallbackMap> {

    /* compiled from: WazeSource */
    final class InstanceHolder {
        static final CameraCallbackMap_Factory INSTANCE = new CameraCallbackMap_Factory();

        private InstanceHolder() {
        }
    }

    public static CameraCallbackMap_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static CameraCallbackMap newInstance() {
        return new CameraCallbackMap();
    }

    @Override // g.a.a, f.a.a
    public CameraCallbackMap get() {
        return newInstance();
    }
}
