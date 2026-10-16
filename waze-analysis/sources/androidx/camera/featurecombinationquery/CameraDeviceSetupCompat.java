package androidx.camera.featurecombinationquery;

import android.hardware.camera2.params.SessionConfiguration;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface CameraDeviceSetupCompat {

    /* compiled from: WazeSource */
    public final class SupportQueryResult {
        public static final int RESULT_SUPPORTED = 1;
        public static final int RESULT_UNDEFINED = 0;
        public static final int RESULT_UNSUPPORTED = 2;
        public static final int SOURCE_ANDROID_FRAMEWORK = 2;
        public static final int SOURCE_PLAY_SERVICES = 1;
        public static final int SOURCE_UNDEFINED = 0;
        private final int mSource;
        private final int mSupported;
        private final long mTimestampMillis;

        /* compiled from: WazeSource */
        @Retention(RetentionPolicy.SOURCE)
        public @interface Supported {
        }

        public SupportQueryResult(int i2, int i3, long j2) {
            this.mSupported = i2;
            this.mSource = i3;
            this.mTimestampMillis = j2;
        }

        public int getSource() {
            return this.mSource;
        }

        public int getSupported() {
            return this.mSupported;
        }

        public long getTimestampMillis() {
            return this.mTimestampMillis;
        }
    }

    SupportQueryResult isSessionConfigurationSupported(SessionConfiguration sessionConfiguration);

    SupportQueryResult isSessionConfigurationSupportedLegacy(SessionConfigurationLegacy sessionConfigurationLegacy);
}
