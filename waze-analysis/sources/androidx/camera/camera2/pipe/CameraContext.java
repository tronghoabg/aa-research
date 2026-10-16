package androidx.camera.camera2.pipe;

import android.content.Context;
import androidx.camera.camera2.pipe.core.Threads;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface CameraContext {
    Context getAppContext();

    CameraBackends getCameraBackends();

    Threads getThreads();
}
