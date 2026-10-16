package androidx.camera.video;

import android.location.Location;
import androidx.core.util.Preconditions;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public abstract class OutputOptions {
    public static final int DURATION_UNLIMITED = 0;
    public static final int FILE_SIZE_UNLIMITED = 0;
    private final OutputOptionsInternal mOutputOptionsInternal;

    /* compiled from: WazeSource */
    abstract class Builder<T extends OutputOptions, B> {
        final OutputOptionsInternal.Builder<?> mRootInternalBuilder;

        Builder(OutputOptionsInternal.Builder<?> builder) {
            this.mRootInternalBuilder = builder;
            builder.setFileSizeLimit(0L);
            builder.setDurationLimitMillis(0L);
        }

        abstract T build();

        /* JADX WARN: Multi-variable type inference failed */
        public B setDurationLimitMillis(long j2) {
            Preconditions.checkArgument(j2 >= 0, "The specified duration limit can't be negative.");
            this.mRootInternalBuilder.setDurationLimitMillis(j2);
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public B setFileSizeLimit(long j2) {
            Preconditions.checkArgument(j2 >= 0, "The specified file size limit can't be negative.");
            this.mRootInternalBuilder.setFileSizeLimit(j2);
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public B setLocation(Location location) {
            if (location != null) {
                Preconditions.checkArgument(location.getLatitude() >= -90.0d && location.getLatitude() <= 90.0d, "Latitude must be in the range [-90, 90]");
                Preconditions.checkArgument(location.getLongitude() >= -180.0d && location.getLongitude() <= 180.0d, "Longitude must be in the range [-180, 180]");
            }
            this.mRootInternalBuilder.setLocation(location);
            return this;
        }
    }

    /* compiled from: WazeSource */
    abstract class OutputOptionsInternal {

        /* compiled from: WazeSource */
        abstract class Builder<B> {
            Builder() {
            }

            abstract OutputOptionsInternal build();

            abstract B setDurationLimitMillis(long j2);

            abstract B setFileSizeLimit(long j2);

            abstract B setLocation(Location location);
        }

        OutputOptionsInternal() {
        }

        abstract long getDurationLimitMillis();

        abstract long getFileSizeLimit();

        abstract Location getLocation();
    }

    OutputOptions(OutputOptionsInternal outputOptionsInternal) {
        this.mOutputOptionsInternal = outputOptionsInternal;
    }

    public long getDurationLimitMillis() {
        return this.mOutputOptionsInternal.getDurationLimitMillis();
    }

    public long getFileSizeLimit() {
        return this.mOutputOptionsInternal.getFileSizeLimit();
    }

    public Location getLocation() {
        return this.mOutputOptionsInternal.getLocation();
    }
}
