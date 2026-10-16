package androidx.camera.camera2.pipe.config;

import androidx.camera.camera2.pipe.FrameGraph;
import androidx.camera.camera2.pipe.core.Threads;
import androidx.camera.camera2.pipe.framegraph.FrameGraphImpl;
import h.g.b.o;
import h.g.b.x;
import kotlinx.coroutines.ae;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.br;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public abstract class FrameGraphModule {
    public static final Companion Companion = new Companion(null);

    public abstract FrameGraph bindFrameGraph(FrameGraphImpl frameGraphImpl);

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        @FrameGraphScope
        @FrameGraphCoroutineScope
        public final af provideFrameGraphCoroutineScope(Threads threads, @CameraPipeJob br brVar) {
            x.f(threads, "threads");
            x.f(brVar, "cameraPipeJob");
            return aj.e(aj.P(brVar).plus(threads.getLightweightDispatcher().plus(new ae("CXCP-FrameGraph"))));
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
