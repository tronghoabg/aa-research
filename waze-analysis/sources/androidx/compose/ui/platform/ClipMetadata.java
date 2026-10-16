package androidx.compose.ui.platform;

import android.content.ClipDescription;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class ClipMetadata {
    public static final int $stable = 8;
    private final ClipDescription clipDescription;

    public ClipMetadata(ClipDescription clipDescription) {
        this.clipDescription = clipDescription;
    }

    public final ClipDescription getClipDescription() {
        return this.clipDescription;
    }
}
