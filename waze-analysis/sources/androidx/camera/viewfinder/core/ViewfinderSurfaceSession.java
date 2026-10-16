package androidx.camera.viewfinder.core;

import android.view.Surface;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface ViewfinderSurfaceSession extends AutoCloseable {
    ViewfinderSurfaceRequest getRequest();

    Surface getSurface();
}
