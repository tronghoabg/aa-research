package androidx.media3.extractor.avi;

import androidx.media3.common.DataReader;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.SeekPoint;
import androidx.media3.extractor.TrackOutput;
import com.google.d.b.an;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class ChunkReader {
    private static final int CHUNK_TYPE_AUDIO = 1651965952;
    private static final int CHUNK_TYPE_VIDEO_COMPRESSED = 1667497984;
    private static final int CHUNK_TYPE_VIDEO_UNCOMPRESSED = 1650720768;
    private static final int INITIAL_INDEX_SIZE = 512;
    private final int alternativeChunkId;
    private int bytesRemainingInCurrentChunk;
    private int chunkCount;
    private final int chunkId;
    private int currentChunkIndex;
    private int currentChunkSize;
    private final long durationUs;
    private long firstIndexChunkOffset;
    private int indexChunkCount;
    private int indexSize;
    private int[] keyFrameIndices;
    private long[] keyFrameOffsets;
    private final AviStreamHeaderChunk streamHeaderChunk;
    private final TrackOutput trackOutput;

    /* compiled from: WazeSource */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @interface ChunkType {
    }

    public ChunkReader(int i2, AviStreamHeaderChunk aviStreamHeaderChunk, TrackOutput trackOutput) {
        this.streamHeaderChunk = aviStreamHeaderChunk;
        int trackType = aviStreamHeaderChunk.getTrackType();
        boolean z = true;
        if (trackType != 1) {
            if (trackType == 2) {
                trackType = 2;
            } else {
                z = false;
            }
        }
        an.l(z);
        this.chunkId = getChunkIdFourCc(i2, trackType == 2 ? CHUNK_TYPE_VIDEO_COMPRESSED : CHUNK_TYPE_AUDIO);
        this.durationUs = aviStreamHeaderChunk.getDurationUs();
        this.trackOutput = trackOutput;
        this.alternativeChunkId = trackType == 2 ? getChunkIdFourCc(i2, CHUNK_TYPE_VIDEO_UNCOMPRESSED) : -1;
        this.firstIndexChunkOffset = -1L;
        this.keyFrameOffsets = new long[512];
        this.keyFrameIndices = new int[512];
        this.chunkCount = aviStreamHeaderChunk.length;
    }

    private static int getChunkIdFourCc(int i2, int i3) {
        return (((i2 % 10) + 48) << 8) | ((i2 / 10) + 48) | i3;
    }

    private long getChunkTimestampUs(int i2) {
        return (this.durationUs * i2) / this.chunkCount;
    }

    private SeekPoint getSeekPoint(int i2) {
        return new SeekPoint(this.keyFrameIndices[i2] * getFrameDurationUs(), this.keyFrameOffsets[i2]);
    }

    public void advanceCurrentChunk() {
        this.currentChunkIndex++;
    }

    public void appendIndexChunk(long j2, boolean z) {
        if (this.firstIndexChunkOffset == -1) {
            this.firstIndexChunkOffset = j2;
        }
        if (z) {
            int i2 = this.indexSize;
            int[] iArrCopyOf = this.keyFrameIndices;
            if (i2 == iArrCopyOf.length) {
                long[] jArr = this.keyFrameOffsets;
                this.keyFrameOffsets = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
                int[] iArr = this.keyFrameIndices;
                iArrCopyOf = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
                this.keyFrameIndices = iArrCopyOf;
            }
            long[] jArr2 = this.keyFrameOffsets;
            int i3 = this.indexSize;
            jArr2[i3] = j2;
            iArrCopyOf[i3] = this.indexChunkCount;
            this.indexSize = i3 + 1;
        }
        this.indexChunkCount++;
    }

    public void commitIndex() {
        int i2;
        this.keyFrameOffsets = Arrays.copyOf(this.keyFrameOffsets, this.indexSize);
        this.keyFrameIndices = Arrays.copyOf(this.keyFrameIndices, this.indexSize);
        if (!isAudio() || this.streamHeaderChunk.sampleSize == 0 || (i2 = this.indexSize) <= 0) {
            return;
        }
        this.chunkCount = i2;
    }

    public long getCurrentChunkTimestampUs() {
        return getChunkTimestampUs(this.currentChunkIndex);
    }

    public long getFrameDurationUs() {
        return getChunkTimestampUs(1);
    }

    public SeekMap.SeekPoints getSeekPoints(long j2) {
        if (this.indexSize == 0) {
            return new SeekMap.SeekPoints(new SeekPoint(0L, this.firstIndexChunkOffset));
        }
        int frameDurationUs = (int) (j2 / getFrameDurationUs());
        int iBinarySearchFloor = Util.binarySearchFloor(this.keyFrameIndices, frameDurationUs, true, true);
        if (this.keyFrameIndices[iBinarySearchFloor] == frameDurationUs) {
            return new SeekMap.SeekPoints(getSeekPoint(iBinarySearchFloor));
        }
        SeekPoint seekPoint = getSeekPoint(iBinarySearchFloor);
        int i2 = iBinarySearchFloor + 1;
        return i2 < this.keyFrameOffsets.length ? new SeekMap.SeekPoints(seekPoint, getSeekPoint(i2)) : new SeekMap.SeekPoints(seekPoint);
    }

    public boolean handlesChunkId(int i2) {
        return this.chunkId == i2 || this.alternativeChunkId == i2;
    }

    public boolean isAudio() {
        return (this.chunkId & CHUNK_TYPE_AUDIO) == CHUNK_TYPE_AUDIO;
    }

    public boolean isCurrentFrameAKeyFrame() {
        return Arrays.binarySearch(this.keyFrameIndices, this.currentChunkIndex) >= 0;
    }

    public boolean isVideo() {
        return (this.chunkId & CHUNK_TYPE_VIDEO_COMPRESSED) == CHUNK_TYPE_VIDEO_COMPRESSED;
    }

    public boolean onChunkData(ExtractorInput extractorInput) {
        int i2 = this.bytesRemainingInCurrentChunk;
        int iSampleData = i2 - this.trackOutput.sampleData((DataReader) extractorInput, i2, false);
        this.bytesRemainingInCurrentChunk = iSampleData;
        boolean z = iSampleData == 0;
        if (z) {
            if (this.currentChunkSize > 0) {
                this.trackOutput.sampleMetadata(getCurrentChunkTimestampUs(), isCurrentFrameAKeyFrame() ? 1 : 0, this.currentChunkSize, 0, null);
            }
            advanceCurrentChunk();
        }
        return z;
    }

    public void onChunkStart(int i2) {
        this.currentChunkSize = i2;
        this.bytesRemainingInCurrentChunk = i2;
    }

    public void seekToPosition(long j2) {
        if (this.indexSize == 0) {
            this.currentChunkIndex = 0;
        } else {
            this.currentChunkIndex = this.keyFrameIndices[Util.binarySearchFloor(this.keyFrameOffsets, j2, true, true)];
        }
    }
}
