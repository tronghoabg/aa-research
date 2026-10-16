package V5;

import android.media.MediaCodecInfo;
import c5.AbstractC1558a;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class m {
    public static int a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i5, int i10, double d3) {
        List supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints();
        if (supportedPerformancePoints == null || supportedPerformancePoints.isEmpty()) {
            return 0;
        }
        d2.n.e();
        MediaCodecInfo.VideoCapabilities.PerformancePoint performancePointD = d2.n.d(i5, i10, (int) d3);
        for (int i11 = 0; i11 < supportedPerformancePoints.size(); i11++) {
            if (AbstractC1558a.g(supportedPerformancePoints.get(i11)).covers(performancePointD)) {
                return 2;
            }
        }
        return 1;
    }
}
