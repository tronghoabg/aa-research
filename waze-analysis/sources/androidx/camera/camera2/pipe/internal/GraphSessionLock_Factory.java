package androidx.camera.camera2.pipe.internal;

import c.b.c;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class GraphSessionLock_Factory implements c<GraphSessionLock> {

    /* compiled from: WazeSource */
    final class InstanceHolder {
        static final GraphSessionLock_Factory INSTANCE = new GraphSessionLock_Factory();

        private InstanceHolder() {
        }
    }

    public static GraphSessionLock_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static GraphSessionLock newInstance() {
        return new GraphSessionLock();
    }

    @Override // g.a.a, f.a.a
    public GraphSessionLock get() {
        return newInstance();
    }
}
