package androidx.camera.viewfinder.core;

import android.view.Surface;
import h.g.b.x;
import java.util.concurrent.Executor;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface ViewfinderSurfaceSessionScope extends af {

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.viewfinder.core.ViewfinderSurfaceSessionScope$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static void $default$addFrameRenderedListener(ViewfinderSurfaceSessionScope viewfinderSurfaceSessionScope, Executor executor, FrameRenderedListener frameRenderedListener) {
            x.f(executor, "executor");
            x.f(frameRenderedListener, "listener");
        }
    }

    void addFrameRenderedListener(Executor executor, FrameRenderedListener frameRenderedListener);

    ViewfinderSurfaceRequest getRequest();

    Surface getSurface();

    void removeFrameRenderedListener(FrameRenderedListener frameRenderedListener);
}
