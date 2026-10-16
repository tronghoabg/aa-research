package androidx.media3.extractor.ts;

import androidx.media3.common.C;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.TimestampAdjuster;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.PositionHolder;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class TsDurationReader {
    private static final String TAG = "TsDurationReader";
    private boolean isDurationRead;
    private boolean isFirstPcrValueRead;
    private boolean isLastPcrValueRead;
    private final int timestampSearchBytes;
    private final TimestampAdjuster pcrTimestampAdjuster = new TimestampAdjuster(0);
    private long firstPcrValue = C.TIME_UNSET;
    private long lastPcrValue = C.TIME_UNSET;
    private long durationUs = C.TIME_UNSET;
    private final ParsableByteArray packetBuffer = new ParsableByteArray();

    TsDurationReader(int i2) {
        this.timestampSearchBytes = i2;
    }

    private int finishReadDuration(ExtractorInput extractorInput) {
        this.packetBuffer.reset(Util.EMPTY_BYTE_ARRAY);
        this.isDurationRead = true;
        extractorInput.resetPeekPosition();
        return 0;
    }

    private int readFirstPcrValue(ExtractorInput extractorInput, PositionHolder positionHolder, int i2) {
        int iMin = (int) Math.min(this.timestampSearchBytes, extractorInput.getLength());
        if (extractorInput.getPosition() != 0) {
            positionHolder.position = 0L;
            return 1;
        }
        this.packetBuffer.reset(iMin);
        extractorInput.resetPeekPosition();
        extractorInput.peekFully(this.packetBuffer.getData(), 0, iMin);
        this.firstPcrValue = readFirstPcrValueFromBuffer(this.packetBuffer, i2);
        this.isFirstPcrValueRead = true;
        return 0;
    }

    private long readFirstPcrValueFromBuffer(ParsableByteArray parsableByteArray, int i2) {
        int iLimit = parsableByteArray.limit();
        for (int position = parsableByteArray.getPosition(); position < iLimit; position++) {
            if (parsableByteArray.getData()[position] == 71) {
                long pcrFromPacket = TsUtil.readPcrFromPacket(parsableByteArray, position, i2);
                if (pcrFromPacket != C.TIME_UNSET) {
                    return pcrFromPacket;
                }
            }
        }
        return C.TIME_UNSET;
    }

    private int readLastPcrValue(ExtractorInput extractorInput, PositionHolder positionHolder, int i2) {
        long j2 = this.timestampSearchBytes;
        long length = extractorInput.getLength();
        int iMin = (int) Math.min(j2, length);
        long j3 = length - iMin;
        if (extractorInput.getPosition() != j3) {
            positionHolder.position = j3;
            return 1;
        }
        this.packetBuffer.reset(iMin);
        extractorInput.resetPeekPosition();
        extractorInput.peekFully(this.packetBuffer.getData(), 0, iMin);
        this.lastPcrValue = readLastPcrValueFromBuffer(this.packetBuffer, i2);
        this.isLastPcrValueRead = true;
        return 0;
    }

    private long readLastPcrValueFromBuffer(ParsableByteArray parsableByteArray, int i2) {
        int position = parsableByteArray.getPosition();
        int iLimit = parsableByteArray.limit();
        for (int i3 = iLimit - 188; i3 >= position; i3--) {
            if (TsUtil.isStartOfTsPacket(parsableByteArray.getData(), position, iLimit, i3)) {
                long pcrFromPacket = TsUtil.readPcrFromPacket(parsableByteArray, i3, i2);
                if (pcrFromPacket != C.TIME_UNSET) {
                    return pcrFromPacket;
                }
            }
        }
        return C.TIME_UNSET;
    }

    public long getDurationUs() {
        return this.durationUs;
    }

    public TimestampAdjuster getPcrTimestampAdjuster() {
        return this.pcrTimestampAdjuster;
    }

    public boolean isDurationReadFinished() {
        return this.isDurationRead;
    }

    public int readDuration(ExtractorInput extractorInput, PositionHolder positionHolder, int i2) {
        if (i2 <= 0) {
            finishReadDuration(extractorInput);
            return 0;
        }
        if (!this.isLastPcrValueRead) {
            return readLastPcrValue(extractorInput, positionHolder, i2);
        }
        if (this.lastPcrValue == C.TIME_UNSET) {
            finishReadDuration(extractorInput);
            return 0;
        }
        if (!this.isFirstPcrValueRead) {
            return readFirstPcrValue(extractorInput, positionHolder, i2);
        }
        long j2 = this.firstPcrValue;
        if (j2 == C.TIME_UNSET) {
            finishReadDuration(extractorInput);
            return 0;
        }
        TimestampAdjuster timestampAdjuster = this.pcrTimestampAdjuster;
        this.durationUs = timestampAdjuster.adjustTsTimestampGreaterThanPreviousTimestamp(this.lastPcrValue) - timestampAdjuster.adjustTsTimestamp(j2);
        finishReadDuration(extractorInput);
        return 0;
    }
}
