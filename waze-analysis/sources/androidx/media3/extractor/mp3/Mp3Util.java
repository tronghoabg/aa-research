package androidx.media3.extractor.mp3;

import androidx.collection.SieveCacheKt;
import androidx.media3.common.C;
import androidx.media3.common.util.Util;
import java.math.RoundingMode;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
class Mp3Util {
    private Mp3Util() {
    }

    static int computeAverageBitrate(long j2, long j3) {
        if (j2 <= 0 || j3 <= 0) {
            return C.RATE_UNSET_INT;
        }
        long jScaleLargeValue = Util.scaleLargeValue(j2, 8000000L, j3, RoundingMode.HALF_UP);
        return (jScaleLargeValue <= 0 || jScaleLargeValue > SieveCacheKt.NodeLinkMask) ? C.RATE_UNSET_INT : (int) jScaleLargeValue;
    }
}
