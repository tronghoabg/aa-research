package androidx.media3.common;

import androidx.media3.common.audio.SpeedProvider;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class SpeedParameters {
    public static final SpeedParameters DEFAULT = new SpeedParameters(SpeedProvider.DEFAULT, false);
    public final boolean shouldMaintainPitch;
    public final SpeedProvider speedProvider;

    public SpeedParameters(SpeedProvider speedProvider, boolean z) {
        this.speedProvider = speedProvider;
        this.shouldMaintainPitch = z;
    }
}
