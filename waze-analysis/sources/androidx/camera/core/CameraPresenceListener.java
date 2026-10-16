package androidx.camera.core;

import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface CameraPresenceListener {
    void onCamerasAdded(Set<CameraIdentifier> set);

    void onCamerasRemoved(Set<CameraIdentifier> set);
}
