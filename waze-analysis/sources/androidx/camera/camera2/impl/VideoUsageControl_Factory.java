package androidx.camera.camera2.impl;

import c.b.c;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class VideoUsageControl_Factory implements c<VideoUsageControl> {

    /* compiled from: WazeSource */
    final class InstanceHolder {
        static final VideoUsageControl_Factory INSTANCE = new VideoUsageControl_Factory();

        private InstanceHolder() {
        }
    }

    public static VideoUsageControl_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static VideoUsageControl newInstance() {
        return new VideoUsageControl();
    }

    @Override // g.a.a, f.a.a
    public VideoUsageControl get() {
        return newInstance();
    }
}
