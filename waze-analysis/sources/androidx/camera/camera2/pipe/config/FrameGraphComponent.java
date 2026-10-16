package androidx.camera.camera2.pipe.config;

import androidx.camera.camera2.pipe.FrameGraph;

/* compiled from: WazeSource */
@FrameGraphScope
/* loaded from: classes2.dex */
public interface FrameGraphComponent {

    /* compiled from: WazeSource */
    public interface Builder {
        FrameGraphComponent build();

        Builder frameGraphConfigModule(FrameGraphConfigModule frameGraphConfigModule);
    }

    FrameGraph frameGraph();
}
