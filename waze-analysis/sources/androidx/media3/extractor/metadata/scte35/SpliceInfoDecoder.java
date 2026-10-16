package androidx.media3.extractor.metadata.scte35;

import androidx.media3.common.Metadata;
import androidx.media3.common.util.ParsableBitArray;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.TimestampAdjuster;
import androidx.media3.extractor.metadata.MetadataInputBuffer;
import androidx.media3.extractor.metadata.SimpleMetadataDecoder;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class SpliceInfoDecoder extends SimpleMetadataDecoder {
    private static final int TYPE_PRIVATE_COMMAND = 255;
    private static final int TYPE_SPLICE_INSERT = 5;
    private static final int TYPE_SPLICE_NULL = 0;
    private static final int TYPE_SPLICE_SCHEDULE = 4;
    private static final int TYPE_TIME_SIGNAL = 6;
    private final ParsableByteArray sectionData = new ParsableByteArray();
    private final ParsableBitArray sectionHeader = new ParsableBitArray();
    private TimestampAdjuster timestampAdjuster;

    @Override // androidx.media3.extractor.metadata.SimpleMetadataDecoder
    protected Metadata decode(MetadataInputBuffer metadataInputBuffer, ByteBuffer byteBuffer) {
        TimestampAdjuster timestampAdjuster = this.timestampAdjuster;
        if (timestampAdjuster == null || metadataInputBuffer.subsampleOffsetUs != timestampAdjuster.getTimestampOffsetUs()) {
            TimestampAdjuster timestampAdjuster2 = new TimestampAdjuster(metadataInputBuffer.timeUs);
            this.timestampAdjuster = timestampAdjuster2;
            timestampAdjuster2.adjustSampleTimestamp(metadataInputBuffer.timeUs - metadataInputBuffer.subsampleOffsetUs);
        }
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        this.sectionData.reset(bArrArray, iLimit);
        this.sectionHeader.reset(bArrArray, iLimit);
        this.sectionHeader.skipBits(39);
        long bits = this.sectionHeader.readBits(1);
        long bits2 = this.sectionHeader.readBits(32);
        this.sectionHeader.skipBits(20);
        ParsableBitArray parsableBitArray = this.sectionHeader;
        ParsableByteArray parsableByteArray = this.sectionData;
        int bits3 = parsableBitArray.readBits(12);
        int bits4 = parsableBitArray.readBits(8);
        parsableByteArray.skipBytes(14);
        long j2 = (bits << 32) | bits2;
        Metadata.Entry fromSection = bits4 != 0 ? bits4 != 255 ? bits4 != 4 ? bits4 != 5 ? bits4 != 6 ? null : TimeSignalCommand.parseFromSection(this.sectionData, j2, this.timestampAdjuster) : SpliceInsertCommand.parseFromSection(this.sectionData, j2, this.timestampAdjuster) : SpliceScheduleCommand.parseFromSection(this.sectionData) : PrivateCommand.parseFromSection(this.sectionData, bits3, j2) : new SpliceNullCommand();
        return fromSection == null ? new Metadata(new Metadata.Entry[0]) : new Metadata(fromSection);
    }
}
