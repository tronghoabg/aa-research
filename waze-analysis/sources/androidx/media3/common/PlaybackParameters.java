package androidx.media3.common;

import android.os.Bundle;
import androidx.media3.common.util.Util;
import com.google.d.b.an;
import com.waze.strings.DisplayStrings;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class PlaybackParameters {
    public final float pitch;
    private final int scaledUsPerMs;
    public final float speed;
    public static final PlaybackParameters DEFAULT = new PlaybackParameters(1.0f);
    private static final String FIELD_SPEED = Util.intToStringMaxRadix(0);
    private static final String FIELD_PITCH = Util.intToStringMaxRadix(1);

    public PlaybackParameters(float f2, float f3) {
        an.l(f2 > 0.0f);
        an.l(f3 > 0.0f);
        this.speed = f2;
        this.pitch = f3;
        this.scaledUsPerMs = Math.round(f2 * 1000.0f);
    }

    public static PlaybackParameters fromBundle(Bundle bundle) {
        return new PlaybackParameters(bundle.getFloat(FIELD_SPEED, 1.0f), bundle.getFloat(FIELD_PITCH, 1.0f));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            PlaybackParameters playbackParameters = (PlaybackParameters) obj;
            if (this.speed == playbackParameters.speed && this.pitch == playbackParameters.pitch) {
                return true;
            }
        }
        return false;
    }

    public long getMediaTimeUsForPlayoutTimeMs(long j2) {
        return j2 * this.scaledUsPerMs;
    }

    public int hashCode() {
        return ((Float.floatToRawIntBits(this.speed) + DisplayStrings.DS_REPORT_MENU_V2_ANIMAL_ON_SHOULDER_LABEL) * 31) + Float.floatToRawIntBits(this.pitch);
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putFloat(FIELD_SPEED, this.speed);
        bundle.putFloat(FIELD_PITCH, this.pitch);
        return bundle;
    }

    public String toString() {
        return Util.formatInvariant("PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.speed), Float.valueOf(this.pitch));
    }

    public PlaybackParameters withPitch(float f2) {
        return new PlaybackParameters(this.speed, f2);
    }

    public PlaybackParameters withSpeed(float f2) {
        return new PlaybackParameters(f2, this.pitch);
    }

    public PlaybackParameters(float f2) {
        this(f2, 1.0f);
    }
}
