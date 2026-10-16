package androidx.media3.common.util;

import androidx.camera.video.AudioStats;
import androidx.media3.common.C;
import androidx.media3.common.audio.SpeedProvider;
import com.google.d.b.an;
import java.util.ArrayList;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public class SpeedProviderUtil {

    /* compiled from: WazeSource */
    public final class SpeedProviderMapper {
        private final long[] inputSegmentStartTimesUs;
        private final long[] outputSegmentStartTimesUs;
        private final float[] speeds;

        public SpeedProviderMapper(SpeedProvider speedProvider) {
            LongArray longArray = new LongArray();
            LongArray longArray2 = new LongArray();
            ArrayList arrayList = new ArrayList();
            float speed = speedProvider.getSpeed(0L);
            longArray.add(0L);
            longArray2.add(0L);
            arrayList.add(Float.valueOf(speed));
            long nextSpeedChangeTimeUs = speedProvider.getNextSpeedChangeTimeUs(0L);
            an.u(speed > 0.0f);
            long playoutDurationForMediaDuration = 0;
            long nextSpeedChangeTimeUs2 = nextSpeedChangeTimeUs;
            long j2 = 0;
            while (nextSpeedChangeTimeUs2 != C.TIME_UNSET) {
                an.u(nextSpeedChangeTimeUs2 > j2);
                an.u(speed > 0.0f);
                playoutDurationForMediaDuration += Util.getPlayoutDurationForMediaDuration(nextSpeedChangeTimeUs2 - j2, speed);
                speed = speedProvider.getSpeed(nextSpeedChangeTimeUs2);
                longArray.add(playoutDurationForMediaDuration);
                longArray2.add(nextSpeedChangeTimeUs2);
                arrayList.add(Float.valueOf(speed));
                j2 = nextSpeedChangeTimeUs2;
                nextSpeedChangeTimeUs2 = speedProvider.getNextSpeedChangeTimeUs(nextSpeedChangeTimeUs2);
            }
            this.outputSegmentStartTimesUs = longArray.toArray();
            this.inputSegmentStartTimesUs = longArray2.toArray();
            Object[] array = arrayList.toArray();
            int length = array.length;
            float[] fArr = new float[length];
            for (int i2 = 0; i2 < length; i2++) {
                Object obj = array[i2];
                an.B(obj);
                fArr[i2] = ((Number) obj).floatValue();
            }
            this.speeds = fArr;
        }

        public long getAdjustedTimeUs(long j2) {
            an.l((j2 == C.TIME_UNSET || j2 == Long.MIN_VALUE) ? false : true);
            an.l(j2 >= 0);
            int iBinarySearchFloor = Util.binarySearchFloor(this.inputSegmentStartTimesUs, j2, true, true);
            return this.outputSegmentStartTimesUs[iBinarySearchFloor] + Util.getPlayoutDurationForMediaDuration(j2 - this.inputSegmentStartTimesUs[iBinarySearchFloor], this.speeds[iBinarySearchFloor]);
        }

        public long getOriginalTimeUs(long j2) {
            an.l((j2 == C.TIME_UNSET || j2 == Long.MIN_VALUE) ? false : true);
            an.l(j2 >= 0);
            int iBinarySearchFloor = Util.binarySearchFloor(this.outputSegmentStartTimesUs, j2, true, true);
            return this.inputSegmentStartTimesUs[iBinarySearchFloor] + Util.getMediaDurationForPlayoutDuration(j2 - this.outputSegmentStartTimesUs[iBinarySearchFloor], this.speeds[iBinarySearchFloor]);
        }
    }

    private SpeedProviderUtil() {
    }

    public static long getDurationAfterSpeedProviderApplied(SpeedProvider speedProvider, long j2) {
        double dMin = AudioStats.AUDIO_AMPLITUDE_NONE;
        long j3 = 0;
        while (j3 < j2) {
            long nextSpeedChangeTimeUs = speedProvider.getNextSpeedChangeTimeUs(j3);
            if (nextSpeedChangeTimeUs == C.TIME_UNSET) {
                nextSpeedChangeTimeUs = Long.MAX_VALUE;
            }
            an.u(nextSpeedChangeTimeUs > j3);
            dMin += (Math.min(nextSpeedChangeTimeUs, j2) - j3) / speedProvider.getSpeed(j3);
            j3 = nextSpeedChangeTimeUs;
        }
        return (long) Math.floor(dMin);
    }

    public static long getNextSpeedChangeSamplePosition(SpeedProvider speedProvider, long j2, int i2) {
        an.l(j2 >= 0);
        an.l(i2 > 0);
        long nextSpeedChangeTimeUs = speedProvider.getNextSpeedChangeTimeUs(Util.sampleCountToDurationUs(j2, i2));
        if (nextSpeedChangeTimeUs == C.TIME_UNSET) {
            return -1L;
        }
        return Util.durationUsToSampleCount(nextSpeedChangeTimeUs, i2);
    }

    public static float getSampleAlignedSpeed(SpeedProvider speedProvider, long j2, int i2) {
        an.l(j2 >= 0);
        an.l(i2 > 0);
        return speedProvider.getSpeed(Util.sampleCountToDurationUs(j2, i2));
    }
}
