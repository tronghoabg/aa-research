package androidx.media3.extractor.mp3;

import androidx.media3.common.C;
import androidx.media3.common.Metadata;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.MpegAudioUtil;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class XingFrame {
    public final long dataSize;
    public final int encoderDelay;
    public final int encoderPadding;
    public final long frameCount;
    public final MpegAudioUtil.Header header;
    public final Mp3InfoReplayGain replayGain;
    public final long[] tableOfContents;

    private XingFrame(MpegAudioUtil.Header header, long j2, long j3, long[] jArr, Mp3InfoReplayGain mp3InfoReplayGain, int i2, int i3) {
        this.header = new MpegAudioUtil.Header(header);
        this.frameCount = j2;
        this.dataSize = j3;
        this.tableOfContents = jArr;
        this.replayGain = mp3InfoReplayGain;
        this.encoderDelay = i2;
        this.encoderPadding = i3;
    }

    public static XingFrame parse(MpegAudioUtil.Header header, ParsableByteArray parsableByteArray) {
        long[] jArr;
        int i2;
        int i3;
        int i4 = parsableByteArray.readInt();
        int unsignedIntToInt = (i4 & 1) != 0 ? parsableByteArray.readUnsignedIntToInt() : -1;
        long unsignedInt = (i4 & 2) != 0 ? parsableByteArray.readUnsignedInt() : -1L;
        Mp3InfoReplayGain mp3InfoReplayGain = null;
        if ((i4 & 4) == 4) {
            long[] jArr2 = new long[100];
            for (int i5 = 0; i5 < 100; i5++) {
                jArr2[i5] = parsableByteArray.readUnsignedByte();
            }
            jArr = jArr2;
        } else {
            jArr = null;
        }
        if ((i4 & 8) != 0) {
            parsableByteArray.skipBytes(4);
        }
        if (parsableByteArray.bytesLeft() >= 24) {
            parsableByteArray.skipBytes(11);
            mp3InfoReplayGain = Mp3InfoReplayGain.parse(parsableByteArray.readFloat(), parsableByteArray.readUnsignedShort(), parsableByteArray.readUnsignedShort());
            parsableByteArray.skipBytes(2);
            int unsignedInt24 = parsableByteArray.readUnsignedInt24();
            i3 = unsignedInt24 & 4095;
            i2 = unsignedInt24 >> 12;
        } else {
            i2 = -1;
            i3 = -1;
        }
        return new XingFrame(header, unsignedIntToInt, unsignedInt, jArr, mp3InfoReplayGain, i2, i3);
    }

    public long computeDurationUs() {
        int i2;
        long j2 = this.frameCount;
        if (j2 == -1 || j2 == 0) {
            return C.TIME_UNSET;
        }
        MpegAudioUtil.Header header = this.header;
        long j3 = header.samplesPerFrame;
        long j4 = j2 * j3;
        if (this.encoderDelay != -1 && (i2 = this.encoderPadding) != -1) {
            j4 -= r9 + i2;
        }
        return j4 > 0 ? Util.sampleCountToDurationUs(j4 - 1, header.sampleRate) : C.TIME_UNSET;
    }

    public Metadata getMetadata() {
        Mp3InfoReplayGain mp3InfoReplayGain = this.replayGain;
        if (mp3InfoReplayGain != null) {
            return new Metadata(mp3InfoReplayGain);
        }
        return null;
    }
}
