package androidx.media3.extractor.mp3;

import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.MpegAudioUtil;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.SeekPoint;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class VbriSeeker implements Seeker {
    private static final String TAG = "VbriSeeker";
    private final int averageBitrate;
    private final long dataEndPosition;
    private final long dataStartPosition;
    private final long durationUs;
    private final long[] positions;
    private final long[] timesUs;

    private VbriSeeker(long[] jArr, long[] jArr2, long j2, long j3, long j4) {
        this.timesUs = jArr;
        this.positions = jArr2;
        this.durationUs = j2;
        this.dataStartPosition = j3;
        this.dataEndPosition = j4;
        this.averageBitrate = Mp3Util.computeAverageBitrate(j4 - j3, j2);
    }

    public static VbriSeeker create(long j2, long j3, MpegAudioUtil.Header header, ParsableByteArray parsableByteArray) {
        int unsignedByte;
        parsableByteArray.skipBytes(6);
        int i2 = parsableByteArray.readInt();
        long j4 = header.frameSize;
        long j5 = i2;
        if (parsableByteArray.readInt() <= 0) {
            return null;
        }
        long jSampleCountToDurationUs = Util.sampleCountToDurationUs((r4 * header.samplesPerFrame) - 1, header.sampleRate);
        int unsignedShort = parsableByteArray.readUnsignedShort();
        int unsignedShort2 = parsableByteArray.readUnsignedShort();
        int unsignedShort3 = parsableByteArray.readUnsignedShort();
        parsableByteArray.skipBytes(2);
        long[] jArr = new long[unsignedShort];
        long[] jArr2 = new long[unsignedShort];
        int i3 = 0;
        long j6 = j3 + header.frameSize;
        while (i3 < unsignedShort) {
            long[] jArr3 = jArr2;
            int i4 = i3;
            jArr[i4] = (i3 * jSampleCountToDurationUs) / unsignedShort;
            jArr3[i4] = j6;
            if (unsignedShort3 == 1) {
                unsignedByte = parsableByteArray.readUnsignedByte();
            } else if (unsignedShort3 == 2) {
                unsignedByte = parsableByteArray.readUnsignedShort();
            } else if (unsignedShort3 == 3) {
                unsignedByte = parsableByteArray.readUnsignedInt24();
            } else {
                if (unsignedShort3 != 4) {
                    return null;
                }
                unsignedByte = parsableByteArray.readUnsignedIntToInt();
            }
            j6 += unsignedByte * unsignedShort2;
            i3 = i4 + 1;
            jArr2 = jArr3;
        }
        long[] jArr4 = jArr2;
        long j7 = j3 + j4;
        long jMax = j5 + j7;
        if (j2 != -1 && j2 != jMax) {
            Log.w(TAG, "VBRI data size mismatch: " + j2 + ", " + jMax);
        }
        if (jMax != j6) {
            Log.w(TAG, "VBRI bytes and ToC mismatch (using max): " + jMax + ", " + j6 + "\nSeeking will be inaccurate.");
            jMax = Math.max(jMax, j6);
        }
        return new VbriSeeker(jArr, jArr4, jSampleCountToDurationUs, j7, jMax);
    }

    @Override // androidx.media3.extractor.mp3.Seeker
    public int getAverageBitrate() {
        return this.averageBitrate;
    }

    @Override // androidx.media3.extractor.mp3.Seeker
    public long getDataEndPosition() {
        return this.dataEndPosition;
    }

    @Override // androidx.media3.extractor.mp3.Seeker
    public long getDataStartPosition() {
        return this.dataStartPosition;
    }

    @Override // androidx.media3.extractor.SeekMap
    public long getDurationUs() {
        return this.durationUs;
    }

    @Override // androidx.media3.extractor.SeekMap
    public SeekMap.SeekPoints getSeekPoints(long j2) {
        long[] jArr = this.timesUs;
        int iBinarySearchFloor = Util.binarySearchFloor(jArr, j2, true, true);
        SeekPoint seekPoint = new SeekPoint(jArr[iBinarySearchFloor], this.positions[iBinarySearchFloor]);
        if (seekPoint.timeUs < j2) {
            long[] jArr2 = this.timesUs;
            if (iBinarySearchFloor != jArr2.length - 1) {
                int i2 = iBinarySearchFloor + 1;
                return new SeekMap.SeekPoints(seekPoint, new SeekPoint(jArr2[i2], this.positions[i2]));
            }
        }
        return new SeekMap.SeekPoints(seekPoint);
    }

    @Override // androidx.media3.extractor.mp3.Seeker
    public long getTimeUs(long j2) {
        return this.timesUs[Util.binarySearchFloor(this.positions, j2, true, true)];
    }

    @Override // androidx.media3.extractor.SeekMap
    public /* synthetic */ boolean isEstimated() {
        return false;
    }

    @Override // androidx.media3.extractor.SeekMap
    public boolean isSeekable() {
        return true;
    }
}
