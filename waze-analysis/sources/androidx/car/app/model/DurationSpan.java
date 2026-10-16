package androidx.car.app.model;

import androidx.car.app.annotations.CarProtocol;
import j$.time.Duration;
import j$.util.Objects;

/* compiled from: WazeSource */
@CarProtocol
/* loaded from: classes2.dex */
public final class DurationSpan extends CarSpan {
    private final long mDurationSeconds;

    /* compiled from: WazeSource */
    final class Api26Impl {
        private Api26Impl() {
        }

        public static DurationSpan create(Duration duration) {
            return new DurationSpan(((Duration) Objects.requireNonNull(duration)).getSeconds());
        }
    }

    private DurationSpan() {
        this.mDurationSeconds = 0L;
    }

    public static DurationSpan create(long j2) {
        return new DurationSpan(j2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DurationSpan) && this.mDurationSeconds == ((DurationSpan) obj).mDurationSeconds;
    }

    public long getDurationSeconds() {
        return this.mDurationSeconds;
    }

    public int hashCode() {
        long j2 = this.mDurationSeconds;
        return (int) (j2 ^ (j2 >>> 32));
    }

    public String toString() {
        return "[seconds: " + this.mDurationSeconds + "]";
    }

    public static DurationSpan create(Duration duration) {
        return Api26Impl.create(duration);
    }

    DurationSpan(long j2) {
        this.mDurationSeconds = j2;
    }
}
