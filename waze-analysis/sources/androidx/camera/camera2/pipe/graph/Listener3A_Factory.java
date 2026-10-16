package androidx.camera.camera2.pipe.graph;

import c.b.c;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class Listener3A_Factory implements c<Listener3A> {

    /* compiled from: WazeSource */
    final class InstanceHolder {
        static final Listener3A_Factory INSTANCE = new Listener3A_Factory();

        private InstanceHolder() {
        }
    }

    public static Listener3A_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static Listener3A newInstance() {
        return new Listener3A();
    }

    @Override // g.a.a, f.a.a
    public Listener3A get() {
        return newInstance();
    }
}
