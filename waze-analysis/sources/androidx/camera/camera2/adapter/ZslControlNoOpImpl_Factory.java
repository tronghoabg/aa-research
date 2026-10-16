package androidx.camera.camera2.adapter;

import c.b.c;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ZslControlNoOpImpl_Factory implements c<ZslControlNoOpImpl> {

    /* compiled from: WazeSource */
    final class InstanceHolder {
        static final ZslControlNoOpImpl_Factory INSTANCE = new ZslControlNoOpImpl_Factory();

        private InstanceHolder() {
        }
    }

    public static ZslControlNoOpImpl_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static ZslControlNoOpImpl newInstance() {
        return new ZslControlNoOpImpl();
    }

    @Override // g.a.a, f.a.a
    public ZslControlNoOpImpl get() {
        return newInstance();
    }
}
