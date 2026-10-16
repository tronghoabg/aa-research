package androidx.camera.camera2.pipe.internal;

import c.b.c;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class FrameCaptureQueue_Factory implements c<FrameCaptureQueue> {

    /* compiled from: WazeSource */
    final class InstanceHolder {
        static final FrameCaptureQueue_Factory INSTANCE = new FrameCaptureQueue_Factory();

        private InstanceHolder() {
        }
    }

    public static FrameCaptureQueue_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static FrameCaptureQueue newInstance() {
        return new FrameCaptureQueue();
    }

    @Override // g.a.a, f.a.a
    public FrameCaptureQueue get() {
        return newInstance();
    }
}
