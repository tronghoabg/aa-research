package androidx.media3.extractor.ts;

import androidx.media3.common.C;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableBitArray;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.TimestampAdjuster;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.ts.TsPayloadReader;
import com.google.d.b.an;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class PesReader implements TsPayloadReader {
    private static final int HEADER_SIZE = 9;
    private static final int MAX_HEADER_EXTENSION_SIZE = 10;
    private static final int PES_SCRATCH_SIZE = 10;
    private static final int STATE_FINDING_HEADER = 0;
    private static final int STATE_READING_BODY = 3;
    private static final int STATE_READING_HEADER = 1;
    private static final int STATE_READING_HEADER_EXTENSION = 2;
    private static final String TAG = "PesReader";
    private int bytesRead;
    private boolean dataAlignmentIndicator;
    private boolean dtsFlag;
    private int extendedHeaderLength;
    private int payloadSize;
    private boolean ptsFlag;
    private final ElementaryStreamReader reader;
    private boolean seenFirstDts;
    private long timeUs;
    private TimestampAdjuster timestampAdjuster;
    private final ParsableBitArray pesScratch = new ParsableBitArray(new byte[10]);
    private int state = 0;

    public PesReader(ElementaryStreamReader elementaryStreamReader) {
        this.reader = elementaryStreamReader;
    }

    private boolean continueRead(ParsableByteArray parsableByteArray, byte[] bArr, int i2) {
        int iMin = Math.min(parsableByteArray.bytesLeft(), i2 - this.bytesRead);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            parsableByteArray.skipBytes(iMin);
        } else {
            parsableByteArray.readBytes(bArr, this.bytesRead, iMin);
        }
        int i3 = this.bytesRead + iMin;
        this.bytesRead = i3;
        return i3 == i2;
    }

    private boolean parseHeader() {
        this.pesScratch.setPosition(0);
        int bits = this.pesScratch.readBits(24);
        if (bits != 1) {
            Log.w(TAG, "Unexpected start code prefix: " + bits);
            this.payloadSize = -1;
            return false;
        }
        this.pesScratch.skipBits(8);
        ParsableBitArray parsableBitArray = this.pesScratch;
        int bits2 = parsableBitArray.readBits(16);
        parsableBitArray.skipBits(5);
        this.dataAlignmentIndicator = this.pesScratch.readBit();
        this.pesScratch.skipBits(2);
        this.ptsFlag = this.pesScratch.readBit();
        this.dtsFlag = this.pesScratch.readBit();
        this.pesScratch.skipBits(6);
        int bits3 = this.pesScratch.readBits(8);
        this.extendedHeaderLength = bits3;
        if (bits2 == 0) {
            this.payloadSize = -1;
        } else {
            int i2 = (bits2 - 3) - bits3;
            this.payloadSize = i2;
            if (i2 < 0) {
                Log.w(TAG, "Found negative packet payload size: " + i2);
                this.payloadSize = -1;
            }
        }
        return true;
    }

    private void parseHeaderExtension() {
        this.pesScratch.setPosition(0);
        this.timeUs = C.TIME_UNSET;
        if (this.ptsFlag) {
            this.pesScratch.skipBits(4);
            long bits = this.pesScratch.readBits(3);
            this.pesScratch.skipBits(1);
            int bits2 = this.pesScratch.readBits(15) << 15;
            this.pesScratch.skipBits(1);
            long bits3 = this.pesScratch.readBits(15);
            this.pesScratch.skipBits(1);
            if (!this.seenFirstDts && this.dtsFlag) {
                this.pesScratch.skipBits(4);
                this.pesScratch.skipBits(1);
                int bits4 = this.pesScratch.readBits(15) << 15;
                this.pesScratch.skipBits(1);
                long bits5 = this.pesScratch.readBits(15);
                this.pesScratch.skipBits(1);
                this.timestampAdjuster.adjustTsTimestamp((this.pesScratch.readBits(3) << 30) | bits4 | bits5);
                this.seenFirstDts = true;
            }
            this.timeUs = this.timestampAdjuster.adjustTsTimestamp((bits << 30) | bits2 | bits3);
        }
    }

    private void setState(int i2) {
        this.state = i2;
        this.bytesRead = 0;
    }

    public boolean canConsumeSynthesizedEmptyPusi(boolean z) {
        boolean z2 = !z || parseHeader();
        int i2 = this.state;
        if (i2 != 3 ? i2 == 1 : this.payloadSize == -1) {
            if ((!z || !(this.reader instanceof H262Reader)) && z2) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.media3.extractor.ts.TsPayloadReader
    public void consume(ParsableByteArray parsableByteArray, int i2) {
        an.B(this.timestampAdjuster);
        if ((i2 & 1) != 0) {
            int i3 = this.state;
            if (i3 != 0 && i3 != 1) {
                if (i3 == 2) {
                    Log.w(TAG, "Unexpected start indicator reading extended header");
                } else {
                    if (i3 != 3) {
                        throw new IllegalStateException();
                    }
                    int i4 = this.payloadSize;
                    if (i4 != -1) {
                        Log.w(TAG, "Unexpected start indicator: expected " + i4 + " more bytes");
                    }
                    this.reader.packetFinished();
                }
            }
            if (parsableByteArray.limit() == 0) {
                this.reader.endOfInputReached();
            }
            setState(1);
        }
        while (parsableByteArray.bytesLeft() > 0) {
            int i5 = this.state;
            if (i5 != 0) {
                if (i5 != 1) {
                    if (i5 == 2) {
                        if (continueRead(parsableByteArray, this.pesScratch.data, Math.min(10, this.extendedHeaderLength)) && continueRead(parsableByteArray, null, this.extendedHeaderLength)) {
                            parseHeaderExtension();
                            i2 |= true == this.dataAlignmentIndicator ? 4 : 0;
                            this.reader.packetStarted(this.timeUs, i2);
                            setState(3);
                        }
                    } else {
                        if (i5 != 3) {
                            throw new IllegalStateException();
                        }
                        int iBytesLeft = parsableByteArray.bytesLeft();
                        int i6 = this.payloadSize;
                        int i7 = i6 != -1 ? iBytesLeft - i6 : 0;
                        if (i7 > 0) {
                            iBytesLeft -= i7;
                            parsableByteArray.setLimit(parsableByteArray.getPosition() + iBytesLeft);
                        }
                        this.reader.consume(parsableByteArray);
                        int i8 = this.payloadSize;
                        if (i8 != -1) {
                            int i9 = i8 - iBytesLeft;
                            this.payloadSize = i9;
                            if (i9 == 0) {
                                this.reader.packetFinished();
                                setState(1);
                            }
                        }
                    }
                } else if (continueRead(parsableByteArray, this.pesScratch.data, 9)) {
                    setState(true == parseHeader() ? 2 : 0);
                }
            } else {
                parsableByteArray.skipBytes(parsableByteArray.bytesLeft());
            }
        }
    }

    @Override // androidx.media3.extractor.ts.TsPayloadReader
    public void init(TimestampAdjuster timestampAdjuster, ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        this.timestampAdjuster = timestampAdjuster;
        this.reader.createTracks(extractorOutput, trackIdGenerator);
    }

    @Override // androidx.media3.extractor.ts.TsPayloadReader
    public void seek() {
        this.state = 0;
        this.bytesRead = 0;
        this.seenFirstDts = false;
        this.reader.seek();
    }
}
