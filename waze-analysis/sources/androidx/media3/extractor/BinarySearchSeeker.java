package androidx.media3.extractor;

import androidx.media3.common.C;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.SeekMap;
import com.google.d.b.an;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public abstract class BinarySearchSeeker {
    private static final long MAX_SKIP_BYTES = 262144;
    private final int minimumSearchRange;
    protected final BinarySearchSeekMap seekMap;
    protected SeekOperationParams seekOperationParams;
    protected final TimestampSeeker timestampSeeker;

    /* compiled from: WazeSource */
    public class BinarySearchSeekMap implements SeekMap {
        private final long approxBytesPerFrame;
        private final long ceilingBytePosition;
        private final long ceilingTimePosition;
        private final long durationUs;
        private final long floorBytePosition;
        private final long floorTimePosition;
        private final SeekTimestampConverter seekTimestampConverter;

        public BinarySearchSeekMap(SeekTimestampConverter seekTimestampConverter, long j2, long j3, long j4, long j5, long j6, long j7) {
            this.seekTimestampConverter = seekTimestampConverter;
            this.durationUs = j2;
            this.floorTimePosition = j3;
            this.ceilingTimePosition = j4;
            this.floorBytePosition = j5;
            this.ceilingBytePosition = j6;
            this.approxBytesPerFrame = j7;
        }

        @Override // androidx.media3.extractor.SeekMap
        public long getDurationUs() {
            return this.durationUs;
        }

        @Override // androidx.media3.extractor.SeekMap
        public SeekMap.SeekPoints getSeekPoints(long j2) {
            return new SeekMap.SeekPoints(new SeekPoint(j2, SeekOperationParams.calculateNextSearchBytePosition(this.seekTimestampConverter.timeUsToTargetTime(j2), this.floorTimePosition, this.ceilingTimePosition, this.floorBytePosition, this.ceilingBytePosition, this.approxBytesPerFrame)));
        }

        @Override // androidx.media3.extractor.SeekMap
        public /* synthetic */ boolean isEstimated() {
            return false;
        }

        @Override // androidx.media3.extractor.SeekMap
        public boolean isSeekable() {
            return true;
        }

        public long timeUsToTargetTime(long j2) {
            return this.seekTimestampConverter.timeUsToTargetTime(j2);
        }
    }

    /* compiled from: WazeSource */
    public final class DefaultSeekTimestampConverter implements SeekTimestampConverter {
        @Override // androidx.media3.extractor.BinarySearchSeeker.SeekTimestampConverter
        public long timeUsToTargetTime(long j2) {
            return j2;
        }
    }

    /* compiled from: WazeSource */
    public class SeekOperationParams {
        private final long approxBytesPerFrame;
        private long ceilingBytePosition;
        private long ceilingTimePosition;
        private long floorBytePosition;
        private long floorTimePosition;
        private long nextSearchBytePosition;
        private final long seekTimeUs;
        private final long targetTimePosition;

        protected SeekOperationParams(long j2, long j3, long j4, long j5, long j6, long j7, long j8) {
            this.seekTimeUs = j2;
            this.targetTimePosition = j3;
            this.floorTimePosition = j4;
            this.ceilingTimePosition = j5;
            this.floorBytePosition = j6;
            this.ceilingBytePosition = j7;
            this.approxBytesPerFrame = j8;
            this.nextSearchBytePosition = calculateNextSearchBytePosition(j3, j4, j5, j6, j7, j8);
        }

        protected static long calculateNextSearchBytePosition(long j2, long j3, long j4, long j5, long j6, long j7) {
            if (j5 + 1 >= j6 || 1 + j3 >= j4) {
                return j5;
            }
            long j8 = (long) ((j2 - j3) * ((j6 - j5) / (j4 - j3)));
            return Util.constrainValue(((j5 + j8) - j7) - (j8 / 20), j5, j6 - 1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long getCeilingBytePosition() {
            return this.ceilingBytePosition;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long getFloorBytePosition() {
            return this.floorBytePosition;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long getNextSearchBytePosition() {
            return this.nextSearchBytePosition;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long getSeekTimeUs() {
            return this.seekTimeUs;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long getTargetTimePosition() {
            return this.targetTimePosition;
        }

        private void updateNextSearchBytePosition() {
            this.nextSearchBytePosition = calculateNextSearchBytePosition(this.targetTimePosition, this.floorTimePosition, this.ceilingTimePosition, this.floorBytePosition, this.ceilingBytePosition, this.approxBytesPerFrame);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void updateSeekCeiling(long j2, long j3) {
            this.ceilingTimePosition = j2;
            this.ceilingBytePosition = j3;
            updateNextSearchBytePosition();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void updateSeekFloor(long j2, long j3) {
            this.floorTimePosition = j2;
            this.floorBytePosition = j3;
            updateNextSearchBytePosition();
        }
    }

    /* compiled from: WazeSource */
    public interface SeekTimestampConverter {
        long timeUsToTargetTime(long j2);
    }

    /* compiled from: WazeSource */
    public final class TimestampSearchResult {
        public static final TimestampSearchResult NO_TIMESTAMP_IN_RANGE_RESULT = new TimestampSearchResult(-3, C.TIME_UNSET, -1);
        public static final int TYPE_NO_TIMESTAMP = -3;
        public static final int TYPE_POSITION_OVERESTIMATED = -1;
        public static final int TYPE_POSITION_UNDERESTIMATED = -2;
        public static final int TYPE_TARGET_TIMESTAMP_FOUND = 0;
        private final long bytePositionToUpdate;
        private final long timestampToUpdate;
        private final int type;

        /* compiled from: WazeSource */
        @Target({ElementType.TYPE_USE})
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        @interface Type {
        }

        private TimestampSearchResult(int i2, long j2, long j3) {
            this.type = i2;
            this.timestampToUpdate = j2;
            this.bytePositionToUpdate = j3;
        }

        public static TimestampSearchResult overestimatedResult(long j2, long j3) {
            return new TimestampSearchResult(-1, j2, j3);
        }

        public static TimestampSearchResult targetFoundResult(long j2) {
            return new TimestampSearchResult(0, C.TIME_UNSET, j2);
        }

        public static TimestampSearchResult underestimatedResult(long j2, long j3) {
            return new TimestampSearchResult(-2, j2, j3);
        }
    }

    /* compiled from: WazeSource */
    public interface TimestampSeeker {

        /* compiled from: WazeSource */
        /* renamed from: androidx.media3.extractor.BinarySearchSeeker$TimestampSeeker$-CC, reason: invalid class name */
        public final /* synthetic */ class CC {
            public static void $default$onSeekFinished(TimestampSeeker timestampSeeker) {
            }
        }

        void onSeekFinished();

        TimestampSearchResult searchForTimestamp(ExtractorInput extractorInput, long j2);
    }

    protected BinarySearchSeeker(SeekTimestampConverter seekTimestampConverter, TimestampSeeker timestampSeeker, long j2, long j3, long j4, long j5, long j6, long j7, int i2) {
        this.timestampSeeker = timestampSeeker;
        this.minimumSearchRange = i2;
        this.seekMap = new BinarySearchSeekMap(seekTimestampConverter, j2, j3, j4, j5, j6, j7);
    }

    protected SeekOperationParams createSeekParamsForTargetTimeUs(long j2) {
        BinarySearchSeekMap binarySearchSeekMap = this.seekMap;
        return new SeekOperationParams(j2, binarySearchSeekMap.timeUsToTargetTime(j2), binarySearchSeekMap.floorTimePosition, binarySearchSeekMap.ceilingTimePosition, binarySearchSeekMap.floorBytePosition, binarySearchSeekMap.ceilingBytePosition, binarySearchSeekMap.approxBytesPerFrame);
    }

    public final SeekMap getSeekMap() {
        return this.seekMap;
    }

    public int handlePendingSeek(ExtractorInput extractorInput, PositionHolder positionHolder) {
        while (true) {
            SeekOperationParams seekOperationParams = this.seekOperationParams;
            an.B(seekOperationParams);
            long floorBytePosition = seekOperationParams.getFloorBytePosition();
            long ceilingBytePosition = seekOperationParams.getCeilingBytePosition();
            long nextSearchBytePosition = seekOperationParams.getNextSearchBytePosition();
            if (ceilingBytePosition - floorBytePosition <= this.minimumSearchRange) {
                markSeekOperationFinished(false, floorBytePosition);
                return seekToPosition(extractorInput, floorBytePosition, positionHolder);
            }
            if (!skipInputUntilPosition(extractorInput, nextSearchBytePosition)) {
                return seekToPosition(extractorInput, nextSearchBytePosition, positionHolder);
            }
            extractorInput.resetPeekPosition();
            TimestampSearchResult timestampSearchResultSearchForTimestamp = this.timestampSeeker.searchForTimestamp(extractorInput, seekOperationParams.getTargetTimePosition());
            int i2 = timestampSearchResultSearchForTimestamp.type;
            if (i2 == -3) {
                markSeekOperationFinished(false, nextSearchBytePosition);
                return seekToPosition(extractorInput, nextSearchBytePosition, positionHolder);
            }
            if (i2 == -2) {
                seekOperationParams.updateSeekFloor(timestampSearchResultSearchForTimestamp.timestampToUpdate, timestampSearchResultSearchForTimestamp.bytePositionToUpdate);
            } else {
                if (i2 != -1) {
                    if (i2 != 0) {
                        throw new IllegalStateException("Invalid case");
                    }
                    skipInputUntilPosition(extractorInput, timestampSearchResultSearchForTimestamp.bytePositionToUpdate);
                    markSeekOperationFinished(true, timestampSearchResultSearchForTimestamp.bytePositionToUpdate);
                    return seekToPosition(extractorInput, timestampSearchResultSearchForTimestamp.bytePositionToUpdate, positionHolder);
                }
                seekOperationParams.updateSeekCeiling(timestampSearchResultSearchForTimestamp.timestampToUpdate, timestampSearchResultSearchForTimestamp.bytePositionToUpdate);
            }
        }
    }

    public final boolean isSeeking() {
        return this.seekOperationParams != null;
    }

    protected final void markSeekOperationFinished(boolean z, long j2) {
        this.seekOperationParams = null;
        this.timestampSeeker.onSeekFinished();
        onSeekOperationFinished(z, j2);
    }

    protected void onSeekOperationFinished(boolean z, long j2) {
    }

    protected final int seekToPosition(ExtractorInput extractorInput, long j2, PositionHolder positionHolder) {
        if (j2 == extractorInput.getPosition()) {
            return 0;
        }
        positionHolder.position = j2;
        return 1;
    }

    public final void setSeekTargetUs(long j2) {
        SeekOperationParams seekOperationParams = this.seekOperationParams;
        if (seekOperationParams == null || seekOperationParams.getSeekTimeUs() != j2) {
            this.seekOperationParams = createSeekParamsForTargetTimeUs(j2);
        }
    }

    protected final boolean skipInputUntilPosition(ExtractorInput extractorInput, long j2) {
        long position = j2 - extractorInput.getPosition();
        if (position < 0 || position > MAX_SKIP_BYTES) {
            return false;
        }
        extractorInput.skipFully((int) position);
        return true;
    }
}
