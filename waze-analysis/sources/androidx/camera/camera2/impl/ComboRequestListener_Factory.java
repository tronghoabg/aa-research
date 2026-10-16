package androidx.camera.camera2.impl;

import c.b.c;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ComboRequestListener_Factory implements c<ComboRequestListener> {

    /* compiled from: WazeSource */
    final class InstanceHolder {
        static final ComboRequestListener_Factory INSTANCE = new ComboRequestListener_Factory();

        private InstanceHolder() {
        }
    }

    public static ComboRequestListener_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static ComboRequestListener newInstance() {
        return new ComboRequestListener();
    }

    @Override // g.a.a, f.a.a
    public ComboRequestListener get() {
        return newInstance();
    }
}
