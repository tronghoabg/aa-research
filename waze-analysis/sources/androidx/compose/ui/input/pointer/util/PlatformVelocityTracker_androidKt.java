package androidx.compose.ui.input.pointer.util;

import androidx.compose.ui.AndroidComposeUiFlags;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class PlatformVelocityTracker_androidKt {
    public static final PlatformVelocityTracker PlatformVelocityTracker() {
        return AndroidComposeUiFlags.isFrameworkVelocityTrackerEnabled ? new FrameworkVelocityTracker() : new Lsq2VelocityTracker();
    }
}
