package androidx.camera.video.internal.workaround;

import android.util.Pair;
import androidx.camera.video.AudioStats;
import androidx.camera.video.internal.compat.quirk.DeviceQuirks;
import androidx.camera.video.internal.compat.quirk.NegativeLatLongSavesIncorrectlyQuirk;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class CorrectNegativeLatLongForMediaMuxer {
    private CorrectNegativeLatLongForMediaMuxer() {
    }

    public static Pair<Double, Double> adjustGeoLocation(double d2, double d3) {
        if (DeviceQuirks.get(NegativeLatLongSavesIncorrectlyQuirk.class) != null) {
            d2 = adjustInternal(d2);
            d3 = adjustInternal(d3);
        }
        return Pair.create(Double.valueOf(d2), Double.valueOf(d3));
    }

    private static double adjustInternal(double d2) {
        return d2 >= AudioStats.AUDIO_AMPLITUDE_NONE ? d2 : ((d2 * 10000.0d) - 1.0d) / 10000.0d;
    }
}
