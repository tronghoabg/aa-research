package androidx.car.app.model;

import androidx.car.app.annotations.CarProtocol;
import java.time.Duration;
import java.util.Objects;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
@CarProtocol
/* loaded from: classes.dex */
public final class DurationSpan extends CarSpan {
    private final long mDurationSeconds;

    /* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
    public static final class Api26Impl {
        private Api26Impl() {
        }

        public static DurationSpan create(Duration duration) {
            Objects.requireNonNull(duration);
            return new DurationSpan(duration.getSeconds());
        }
    }

    public DurationSpan(long j) {
        this.mDurationSeconds = j;
    }

    public static DurationSpan create(long j) {
        return new DurationSpan(j);
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
        long j = this.mDurationSeconds;
        return (int) (j ^ (j >>> 32));
    }

    public String toString() {
        return "[seconds: " + this.mDurationSeconds + "]";
    }

    public static DurationSpan create(Duration duration) {
        return Api26Impl.create(duration);
    }

    private DurationSpan() {
        this.mDurationSeconds = 0L;
    }
}
