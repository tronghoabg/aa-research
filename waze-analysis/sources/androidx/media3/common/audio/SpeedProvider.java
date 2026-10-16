package androidx.media3.common.audio;

import androidx.media3.common.C;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public interface SpeedProvider {
    public static final SpeedProvider DEFAULT = new SpeedProvider() { // from class: androidx.media3.common.audio.SpeedProvider.1
        @Override // androidx.media3.common.audio.SpeedProvider
        public long getNextSpeedChangeTimeUs(long j2) {
            return C.TIME_UNSET;
        }

        @Override // androidx.media3.common.audio.SpeedProvider
        public float getSpeed(long j2) {
            return 1.0f;
        }
    };

    long getNextSpeedChangeTimeUs(long j2);

    float getSpeed(long j2);
}
