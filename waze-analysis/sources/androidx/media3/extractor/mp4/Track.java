package androidx.media3.extractor.mp4;

import androidx.media3.common.C;
import androidx.media3.common.Format;
import com.google.d.b.an;
import com.google.d.l.d;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class Track {
    public static final long TIMESCALE_UNSET = -1;
    public static final int TRANSFORMATION_CEA608_CDAT = 1;
    public static final int TRANSFORMATION_NONE = 0;
    public final int chapterTrackId;
    public final long durationUs;
    public final d editListDurations;
    public final d editListMediaTimes;
    public final Format format;
    public final int id;
    public final long mediaDurationUs;
    public final long movieTimescale;
    public final int nalUnitLengthFieldLength;
    private final TrackEncryptionBox[] sampleDescriptionEncryptionBoxes;
    public final int sampleTransformation;
    public final boolean shouldBeExposed;
    public final long timescale;
    public final int type;

    /* compiled from: WazeSource */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Transformation {
    }

    private Track(Builder builder) {
        this.id = builder.id;
        this.type = builder.type;
        this.timescale = builder.timescale;
        this.movieTimescale = builder.movieTimescale;
        this.durationUs = builder.durationUs;
        this.mediaDurationUs = builder.mediaDurationUs;
        Format format = builder.format;
        an.B(format);
        this.format = format;
        this.sampleTransformation = builder.sampleTransformation;
        this.sampleDescriptionEncryptionBoxes = builder.sampleDescriptionEncryptionBoxes;
        this.nalUnitLengthFieldLength = builder.nalUnitLengthFieldLength;
        this.editListDurations = builder.editListDurations;
        this.editListMediaTimes = builder.editListMediaTimes;
        this.shouldBeExposed = builder.shouldBeExposed;
        this.chapterTrackId = builder.chapterTrackId;
    }

    public Builder buildUpon() {
        return new Builder();
    }

    @Deprecated
    public Track copyWithFormat(Format format) {
        Builder builderBuildUpon = buildUpon();
        builderBuildUpon.setFormat(format);
        return builderBuildUpon.build();
    }

    @Deprecated
    public Track copyWithoutEditLists() {
        Builder builderBuildUpon = buildUpon();
        builderBuildUpon.setEditListDurations(null);
        builderBuildUpon.setEditListMediaTimes(null);
        return builderBuildUpon.build();
    }

    public TrackEncryptionBox getSampleDescriptionEncryptionBox(int i2) {
        TrackEncryptionBox[] trackEncryptionBoxArr = this.sampleDescriptionEncryptionBoxes;
        if (trackEncryptionBoxArr == null) {
            return null;
        }
        return trackEncryptionBoxArr[i2];
    }

    /* compiled from: WazeSource */
    public final class Builder {
        private int chapterTrackId;
        private long durationUs;
        private d editListDurations;
        private d editListMediaTimes;
        private Format format;
        private int id;
        private long mediaDurationUs;
        private long movieTimescale;
        private int nalUnitLengthFieldLength;
        private TrackEncryptionBox[] sampleDescriptionEncryptionBoxes;
        private int sampleTransformation;
        private boolean shouldBeExposed;
        private long timescale;
        private int type;

        private Builder(Track track) {
            this.id = track.id;
            this.type = track.type;
            this.timescale = track.timescale;
            this.movieTimescale = track.movieTimescale;
            this.durationUs = track.durationUs;
            this.mediaDurationUs = track.mediaDurationUs;
            this.format = track.format;
            this.sampleTransformation = track.sampleTransformation;
            this.sampleDescriptionEncryptionBoxes = track.sampleDescriptionEncryptionBoxes;
            this.nalUnitLengthFieldLength = track.nalUnitLengthFieldLength;
            this.editListDurations = track.editListDurations;
            this.editListMediaTimes = track.editListMediaTimes;
            this.shouldBeExposed = track.shouldBeExposed;
            this.chapterTrackId = track.chapterTrackId;
        }

        public Track build() {
            an.B(this.format);
            return new Track(this);
        }

        public Builder setChapterTrackId(int i2) {
            this.chapterTrackId = i2;
            return this;
        }

        public Builder setDurationUs(long j2) {
            this.durationUs = j2;
            return this;
        }

        public Builder setEditListDurations(d dVar) {
            this.editListDurations = dVar;
            return this;
        }

        public Builder setEditListMediaTimes(d dVar) {
            this.editListMediaTimes = dVar;
            return this;
        }

        public Builder setFormat(Format format) {
            this.format = format;
            return this;
        }

        public Builder setId(int i2) {
            this.id = i2;
            return this;
        }

        public Builder setMediaDurationUs(long j2) {
            this.mediaDurationUs = j2;
            return this;
        }

        public Builder setMovieTimescale(long j2) {
            this.movieTimescale = j2;
            return this;
        }

        public Builder setNalUnitLengthFieldLength(int i2) {
            this.nalUnitLengthFieldLength = i2;
            return this;
        }

        public Builder setSampleDescriptionEncryptionBoxes(TrackEncryptionBox[] trackEncryptionBoxArr) {
            this.sampleDescriptionEncryptionBoxes = trackEncryptionBoxArr == null ? null : (TrackEncryptionBox[]) trackEncryptionBoxArr.clone();
            return this;
        }

        public Builder setSampleTransformation(int i2) {
            this.sampleTransformation = i2;
            return this;
        }

        public Builder setShouldBeExposed(boolean z) {
            this.shouldBeExposed = z;
            return this;
        }

        public Builder setTimescale(long j2) {
            this.timescale = j2;
            return this;
        }

        public Builder setType(int i2) {
            this.type = i2;
            return this;
        }

        public Builder() {
            this.type = -1;
            this.timescale = -1L;
            this.movieTimescale = -1L;
            this.durationUs = C.TIME_UNSET;
            this.mediaDurationUs = C.TIME_UNSET;
            this.sampleTransformation = 0;
            this.shouldBeExposed = true;
            this.chapterTrackId = -1;
        }
    }

    @Deprecated
    public Track(int i2, int i3, long j2, long j3, long j4, long j5, Format format, int i4, TrackEncryptionBox[] trackEncryptionBoxArr, int i5, long[] jArr, long[] jArr2, boolean z, int i6) {
        this.id = i2;
        this.type = i3;
        this.timescale = j2;
        this.movieTimescale = j3;
        this.durationUs = j4;
        this.mediaDurationUs = j5;
        this.format = format;
        this.sampleTransformation = i4;
        this.sampleDescriptionEncryptionBoxes = trackEncryptionBoxArr == null ? null : (TrackEncryptionBox[]) trackEncryptionBoxArr.clone();
        this.nalUnitLengthFieldLength = i5;
        this.editListDurations = jArr == null ? null : d.e(jArr);
        this.editListMediaTimes = jArr2 != null ? d.e(jArr2) : null;
        this.shouldBeExposed = z;
        this.chapterTrackId = i6;
    }
}
