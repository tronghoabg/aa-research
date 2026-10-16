package androidx.camera.camera2.pipe.graph;

import c.b.c;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class GraphState3A_Factory implements c<GraphState3A> {

    /* compiled from: WazeSource */
    final class InstanceHolder {
        static final GraphState3A_Factory INSTANCE = new GraphState3A_Factory();

        private InstanceHolder() {
        }
    }

    public static GraphState3A_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static GraphState3A newInstance() {
        return new GraphState3A();
    }

    @Override // g.a.a, f.a.a
    public GraphState3A get() {
        return newInstance();
    }
}
