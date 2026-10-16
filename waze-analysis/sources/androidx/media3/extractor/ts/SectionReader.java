package androidx.media3.extractor.ts;

import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.TimestampAdjuster;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.ts.TsPayloadReader;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class SectionReader implements TsPayloadReader {
    private static final int DEFAULT_SECTION_BUFFER_LENGTH = 32;
    private static final int MAX_SECTION_LENGTH = 4098;
    private static final int SECTION_HEADER_LENGTH = 3;
    private int bytesRead;
    private final SectionPayloadReader reader;
    private final ParsableByteArray sectionData = new ParsableByteArray(32);
    private boolean sectionSyntaxIndicator;
    private int totalSectionLength;
    private boolean waitingForPayloadStart;

    public SectionReader(SectionPayloadReader sectionPayloadReader) {
        this.reader = sectionPayloadReader;
    }

    @Override // androidx.media3.extractor.ts.TsPayloadReader
    public void consume(ParsableByteArray parsableByteArray, int i2) {
        int i3 = i2 & 1;
        int position = i3 != 0 ? parsableByteArray.getPosition() + parsableByteArray.readUnsignedByte() : -1;
        if (this.waitingForPayloadStart) {
            if (i3 == 0) {
                return;
            }
            this.waitingForPayloadStart = false;
            parsableByteArray.setPosition(position);
            this.bytesRead = 0;
        }
        while (parsableByteArray.bytesLeft() > 0) {
            int i4 = this.bytesRead;
            if (i4 < 3) {
                if (i4 == 0) {
                    int unsignedByte = parsableByteArray.readUnsignedByte();
                    parsableByteArray.setPosition(parsableByteArray.getPosition() - 1);
                    if (unsignedByte == 255) {
                        this.waitingForPayloadStart = true;
                        return;
                    }
                }
                int iMin = Math.min(parsableByteArray.bytesLeft(), 3 - this.bytesRead);
                parsableByteArray.readBytes(this.sectionData.getData(), this.bytesRead, iMin);
                int i5 = this.bytesRead + iMin;
                this.bytesRead = i5;
                if (i5 == 3) {
                    this.sectionData.setPosition(0);
                    this.sectionData.setLimit(3);
                    this.sectionData.skipBytes(1);
                    ParsableByteArray parsableByteArray2 = this.sectionData;
                    int unsignedByte2 = parsableByteArray2.readUnsignedByte();
                    boolean z = (unsignedByte2 & 128) != 0;
                    int unsignedByte3 = parsableByteArray2.readUnsignedByte();
                    this.sectionSyntaxIndicator = z;
                    this.totalSectionLength = (unsignedByte3 | ((unsignedByte2 & 15) << 8)) + 3;
                    int iCapacity = this.sectionData.capacity();
                    int i6 = this.totalSectionLength;
                    if (iCapacity < i6) {
                        int iCapacity2 = this.sectionData.capacity();
                        this.sectionData.ensureCapacity(Math.min(4098, Math.max(i6, iCapacity2 + iCapacity2)));
                    }
                }
            } else {
                int iMin2 = Math.min(parsableByteArray.bytesLeft(), this.totalSectionLength - this.bytesRead);
                parsableByteArray.readBytes(this.sectionData.getData(), this.bytesRead, iMin2);
                int i7 = this.bytesRead + iMin2;
                this.bytesRead = i7;
                int i8 = this.totalSectionLength;
                if (i7 == i8) {
                    boolean z2 = this.sectionSyntaxIndicator;
                    ParsableByteArray parsableByteArray3 = this.sectionData;
                    if (!z2) {
                        parsableByteArray3.setLimit(i8);
                    } else {
                        if (Util.crc32(parsableByteArray3.getData(), 0, this.totalSectionLength, -1) != 0) {
                            this.waitingForPayloadStart = true;
                            return;
                        }
                        this.sectionData.setLimit(this.totalSectionLength - 4);
                    }
                    this.sectionData.setPosition(0);
                    this.reader.consume(this.sectionData);
                    this.bytesRead = 0;
                } else {
                    continue;
                }
            }
        }
    }

    @Override // androidx.media3.extractor.ts.TsPayloadReader
    public void init(TimestampAdjuster timestampAdjuster, ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        this.reader.init(timestampAdjuster, extractorOutput, trackIdGenerator);
        this.waitingForPayloadStart = true;
    }

    @Override // androidx.media3.extractor.ts.TsPayloadReader
    public void seek() {
        this.waitingForPayloadStart = true;
    }
}
