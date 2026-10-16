package androidx.camera.camera2.pipe.core;

import c.b.c;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class SystemTimeSource_Factory implements c<SystemTimeSource> {

    /* compiled from: WazeSource */
    final class InstanceHolder {
        static final SystemTimeSource_Factory INSTANCE = new SystemTimeSource_Factory();

        private InstanceHolder() {
        }
    }

    public static SystemTimeSource_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static SystemTimeSource newInstance() {
        return new SystemTimeSource();
    }

    @Override // g.a.a, f.a.a
    public SystemTimeSource get() {
        return newInstance();
    }
}
