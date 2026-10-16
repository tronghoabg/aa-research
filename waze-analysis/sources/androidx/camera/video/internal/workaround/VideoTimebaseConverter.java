package androidx.camera.video.internal.workaround;

import android.os.Build;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.Timebase;
import androidx.camera.video.internal.compat.quirk.CameraUseInconsistentTimebaseQuirk;
import androidx.camera.video.internal.encoder.TimeProvider;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public class VideoTimebaseConverter {
    private static final String TAG = "VideoTimebaseConverter";
    private static final long UPTIME_REALTIME_DIFF_THRESHOLD_US = 3000000;
    private final CameraUseInconsistentTimebaseQuirk mCameraUseInconsistentTimebaseQuirk;
    private final Timebase mInputTimebase;
    private Timebase mResolvedInputTimebase;
    private final TimeProvider mTimeProvider;
    private long mUptimeToRealtimeOffsetUs = -1;

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.video.internal.workaround.VideoTimebaseConverter$1, reason: invalid class name */
    /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$androidx$camera$core$impl$Timebase;

        static {
            int[] iArr = new int[Timebase.values().length];
            $SwitchMap$androidx$camera$core$impl$Timebase = iArr;
            try {
                iArr[Timebase.REALTIME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$androidx$camera$core$impl$Timebase[Timebase.UPTIME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public VideoTimebaseConverter(TimeProvider timeProvider, Timebase timebase, CameraUseInconsistentTimebaseQuirk cameraUseInconsistentTimebaseQuirk) {
        this.mTimeProvider = timeProvider;
        this.mInputTimebase = timebase;
        this.mCameraUseInconsistentTimebaseQuirk = cameraUseInconsistentTimebaseQuirk;
    }

    private long calculateUptimeToRealtimeOffsetUs() {
        long j2 = Long.MAX_VALUE;
        long j3 = 0;
        for (int i2 = 0; i2 < 3; i2++) {
            TimeProvider timeProvider = this.mTimeProvider;
            long jUptimeUs = timeProvider.uptimeUs();
            long jRealtimeUs = timeProvider.realtimeUs();
            long jUptimeUs2 = timeProvider.uptimeUs();
            long j4 = jUptimeUs2 - jUptimeUs;
            if (i2 == 0 || j4 < j2) {
                j3 = jRealtimeUs - ((jUptimeUs + jUptimeUs2) >> 1);
                j2 = j4;
            }
        }
        return Math.max(0L, j3);
    }

    private boolean exceedUptimeRealtimeDiffThreshold() {
        TimeProvider timeProvider = this.mTimeProvider;
        return timeProvider.realtimeUs() - timeProvider.uptimeUs() > UPTIME_REALTIME_DIFF_THRESHOLD_US;
    }

    private boolean isCloseToRealtime(long j2) {
        TimeProvider timeProvider = this.mTimeProvider;
        return Math.abs(j2 - timeProvider.realtimeUs()) < Math.abs(j2 - timeProvider.uptimeUs());
    }

    private Timebase resolveInputTimebase(long j2) {
        boolean z;
        if (this.mCameraUseInconsistentTimebaseQuirk != null) {
            Logger.w(TAG, "CameraUseInconsistentTimebaseQuirk is enabled");
            z = false;
        } else {
            if (!exceedUptimeRealtimeDiffThreshold()) {
                return this.mInputTimebase;
            }
            z = true;
        }
        Timebase timebase = isCloseToRealtime(j2) ? Timebase.REALTIME : Timebase.UPTIME;
        if (z && timebase != this.mInputTimebase) {
            Logger.e(TAG, String.format("Detected camera timebase inconsistent. Please file an issue at https://issuetracker.google.com/issues/new?component=618491&template=1257717 with this error message [Manufacturer: %s, Model: %s, Hardware: %s, API Level: %d%s].\nCamera timebase is inconsistent. The timebase reported by the camera is %s, but the actual timebase contained in the frame is detected as %s.", Build.MANUFACTURER, Build.MODEL, Build.HARDWARE, Integer.valueOf(Build.VERSION.SDK_INT), Build.VERSION.SDK_INT >= 31 ? ", SOC: ".concat(String.valueOf(Build.SOC_MODEL)) : "", this.mInputTimebase, timebase));
            return timebase;
        }
        Objects.toString(timebase);
        Logger.d(TAG, "Detect input timebase = ".concat(String.valueOf(timebase)));
        return timebase;
    }

    public long convertToUptimeUs(long j2) {
        if (this.mResolvedInputTimebase == null) {
            this.mResolvedInputTimebase = resolveInputTimebase(j2);
        }
        Timebase timebase = Timebase.UPTIME;
        int iOrdinal = this.mResolvedInputTimebase.ordinal();
        if (iOrdinal == 0) {
            return j2;
        }
        if (iOrdinal != 1) {
            Timebase timebase2 = this.mResolvedInputTimebase;
            Objects.toString(timebase2);
            throw new AssertionError("Unknown timebase: ".concat(String.valueOf(timebase2)));
        }
        if (this.mUptimeToRealtimeOffsetUs == -1) {
            this.mUptimeToRealtimeOffsetUs = calculateUptimeToRealtimeOffsetUs();
            Logger.d(TAG, "mUptimeToRealtimeOffsetUs = " + this.mUptimeToRealtimeOffsetUs);
        }
        return j2 - this.mUptimeToRealtimeOffsetUs;
    }
}
