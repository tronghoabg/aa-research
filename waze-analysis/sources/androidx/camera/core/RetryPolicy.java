package androidx.camera.core;

import androidx.camera.core.RetryPolicy;
import androidx.camera.core.impl.CameraProviderInitRetryPolicy;
import androidx.camera.core.impl.RetryPolicyInternal;
import androidx.camera.core.impl.TimeoutRetryPolicy;
import androidx.core.util.Preconditions;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface RetryPolicy {
    public static final RetryPolicy DEFAULT;
    public static final long DEFAULT_RETRY_TIMEOUT_IN_MILLIS = 6000;
    public static final RetryPolicy NEVER = new RetryPolicy() { // from class: androidx.camera.core.RetryPolicy$$ExternalSyntheticLambda0
        @Override // androidx.camera.core.RetryPolicy
        public /* synthetic */ long getTimeoutInMillis() {
            int i2 = RetryPolicy.CC.f1640a;
            return 0L;
        }

        @Override // androidx.camera.core.RetryPolicy
        public final RetryPolicy.RetryConfig onRetryDecisionRequested(RetryPolicy.ExecutionState executionState) {
            return RetryPolicy.RetryConfig.NOT_RETRY;
        }
    };
    public static final RetryPolicy RETRY_UNAVAILABLE_CAMERA;

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.core.RetryPolicy$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int f1640a = 0;

        public static long $default$getTimeoutInMillis(RetryPolicy retryPolicy) {
            return 0L;
        }

        static {
            long j2 = RetryPolicy.DEFAULT_RETRY_TIMEOUT_IN_MILLIS;
        }

        public static long getDefaultRetryTimeoutInMillis() {
            return 6000L;
        }
    }

    /* compiled from: WazeSource */
    public final class Builder {
        private final RetryPolicy mBasePolicy;
        private long mTimeoutInMillis;

        public Builder(RetryPolicy retryPolicy) {
            this.mBasePolicy = retryPolicy;
            this.mTimeoutInMillis = retryPolicy.getTimeoutInMillis();
        }

        public RetryPolicy build() {
            RetryPolicy retryPolicy = this.mBasePolicy;
            return retryPolicy instanceof RetryPolicyInternal ? ((RetryPolicyInternal) retryPolicy).copy(this.mTimeoutInMillis) : new TimeoutRetryPolicy(this.mTimeoutInMillis, retryPolicy);
        }

        public Builder setTimeoutInMillis(long j2) {
            this.mTimeoutInMillis = j2;
            return this;
        }
    }

    /* compiled from: WazeSource */
    public interface ExecutionState {
        public static final int STATUS_CAMERA_UNAVAILABLE = 2;
        public static final int STATUS_CONFIGURATION_FAIL = 1;
        public static final int STATUS_UNKNOWN_ERROR = 0;

        /* compiled from: WazeSource */
        @Retention(RetentionPolicy.SOURCE)
        public @interface Status {
        }

        Throwable getCause();

        long getExecutedTimeInMillis();

        int getNumOfAttempts();

        int getStatus();
    }

    static {
        int i2 = CC.f1640a;
        DEFAULT = new CameraProviderInitRetryPolicy.Legacy(6000L);
        RETRY_UNAVAILABLE_CAMERA = new CameraProviderInitRetryPolicy(6000L);
    }

    long getTimeoutInMillis();

    RetryConfig onRetryDecisionRequested(ExecutionState executionState);

    /* compiled from: WazeSource */
    public final class RetryConfig {
        private static final long DEFAULT_DELAY_MILLIS = 500;
        private final boolean mCompleteWithoutFailure;
        private final long mDelayInMillis;
        private final boolean mShouldRetry;
        public static final RetryConfig NOT_RETRY = new RetryConfig(false, 0);
        public static final RetryConfig DEFAULT_DELAY_RETRY = new RetryConfig(true);
        private static final long MINI_DELAY_MILLIS = 100;
        public static final RetryConfig MINI_DELAY_RETRY = new RetryConfig(true, MINI_DELAY_MILLIS);
        public static RetryConfig COMPLETE_WITHOUT_FAILURE = new RetryConfig(false, 0L, true);

        /* compiled from: WazeSource */
        public final class Builder {
            private boolean mShouldRetry = true;
            private long mTimeoutInMillis;

            public Builder() {
                RetryConfig retryConfig = RetryConfig.NOT_RETRY;
                this.mTimeoutInMillis = 500L;
            }

            public RetryConfig build() {
                return new RetryConfig(this.mShouldRetry, this.mTimeoutInMillis);
            }

            public Builder setRetryDelayInMillis(long j2) {
                this.mTimeoutInMillis = j2;
                return this;
            }

            public Builder setShouldRetry(boolean z) {
                this.mShouldRetry = z;
                return this;
            }
        }

        private RetryConfig(boolean z, long j2, boolean z2) {
            this.mShouldRetry = z;
            this.mDelayInMillis = j2;
            if (z2) {
                Preconditions.checkArgument(!z, "shouldRetry must be false when completeWithoutFailure is set to true");
            }
            this.mCompleteWithoutFailure = z2;
        }

        public static long getDefaultRetryDelayInMillis() {
            return 500L;
        }

        public long getRetryDelayInMillis() {
            return this.mDelayInMillis;
        }

        public boolean shouldCompleteWithoutFailure() {
            return this.mCompleteWithoutFailure;
        }

        public boolean shouldRetry() {
            return this.mShouldRetry;
        }

        private RetryConfig(boolean z) {
            this(z, 500L);
        }

        private RetryConfig(boolean z, long j2) {
            this(z, j2, false);
        }
    }
}
