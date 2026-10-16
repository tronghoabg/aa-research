package androidx.media3.extractor.ogg;

import androidx.media3.common.ParserException;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorUtil;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class OggPageHeader {
    private static final int CAPTURE_PATTERN = 1332176723;
    private static final int CAPTURE_PATTERN_SIZE = 4;
    public static final int EMPTY_PAGE_HEADER_SIZE = 27;
    public static final int MAX_PAGE_PAYLOAD = 65025;
    public static final int MAX_PAGE_SIZE = 65307;
    public static final int MAX_SEGMENT_COUNT = 255;
    public int bodySize;
    public long granulePosition;
    public int headerSize;
    public long pageChecksum;
    public int pageSegmentCount;
    public long pageSequenceNumber;
    public int revision;
    public long streamSerialNumber;
    public int type;
    public final int[] laces = new int[255];
    private final ParsableByteArray scratch = new ParsableByteArray(255);

    OggPageHeader() {
    }

    public boolean populate(ExtractorInput extractorInput, boolean z) throws ParserException {
        reset();
        this.scratch.reset(27);
        if (ExtractorUtil.peekFullyQuietly(extractorInput, this.scratch.getData(), 0, 27, z) && this.scratch.readUnsignedInt() == 1332176723) {
            int unsignedByte = this.scratch.readUnsignedByte();
            this.revision = unsignedByte;
            if (unsignedByte != 0) {
                if (z) {
                    return false;
                }
                throw ParserException.createForUnsupportedContainerFeature("unsupported bit stream revision");
            }
            this.type = this.scratch.readUnsignedByte();
            this.granulePosition = this.scratch.readLittleEndianLong();
            this.streamSerialNumber = this.scratch.readLittleEndianUnsignedInt();
            this.pageSequenceNumber = this.scratch.readLittleEndianUnsignedInt();
            this.pageChecksum = this.scratch.readLittleEndianUnsignedInt();
            int unsignedByte2 = this.scratch.readUnsignedByte();
            this.pageSegmentCount = unsignedByte2;
            this.headerSize = unsignedByte2 + 27;
            this.scratch.reset(unsignedByte2);
            if (ExtractorUtil.peekFullyQuietly(extractorInput, this.scratch.getData(), 0, this.pageSegmentCount, z)) {
                for (int i2 = 0; i2 < this.pageSegmentCount; i2++) {
                    this.laces[i2] = this.scratch.readUnsignedByte();
                    this.bodySize += this.laces[i2];
                }
                return true;
            }
        }
        return false;
    }

    public void reset() {
        this.revision = 0;
        this.type = 0;
        this.granulePosition = 0L;
        this.streamSerialNumber = 0L;
        this.pageSequenceNumber = 0L;
        this.pageChecksum = 0L;
        this.pageSegmentCount = 0;
        this.headerSize = 0;
        this.bodySize = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0052, code lost:
    
        if (r10 == (-1)) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005a, code lost:
    
        if (r9.getPosition() >= r10) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0061, code lost:
    
        if (r9.skip(1) != (-1)) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0063, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean skipToNextPage(androidx.media3.extractor.ExtractorInput r9, long r10) {
        /*
            r8 = this;
            long r0 = r9.getPosition()
            long r2 = r9.getPeekPosition()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L10
            r0 = r2
            goto L11
        L10:
            r0 = r1
        L11:
            com.google.d.b.an.l(r0)
            androidx.media3.common.util.ParsableByteArray r0 = r8.scratch
            r3 = 4
            r0.reset(r3)
        L1a:
            r4 = -1
            int r0 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r0 == 0) goto L2c
            long r4 = r9.getPosition()
            r6 = 4
            long r4 = r4 + r6
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 < 0) goto L2c
            goto L52
        L2c:
            androidx.media3.common.util.ParsableByteArray r4 = r8.scratch
            byte[] r4 = r4.getData()
            boolean r4 = androidx.media3.extractor.ExtractorUtil.peekFullyQuietly(r9, r4, r1, r3, r2)
            if (r4 == 0) goto L52
            androidx.media3.common.util.ParsableByteArray r0 = r8.scratch
            r0.setPosition(r1)
            androidx.media3.common.util.ParsableByteArray r0 = r8.scratch
            long r4 = r0.readUnsignedInt()
            r6 = 1332176723(0x4f676753, double:6.58182753E-315)
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L4e
            r9.resetPeekPosition()
            return r2
        L4e:
            r9.skipFully(r2)
            goto L1a
        L52:
            if (r0 == 0) goto L5c
            long r3 = r9.getPosition()
            int r8 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r8 >= 0) goto L63
        L5c:
            int r8 = r9.skip(r2)
            r3 = -1
            if (r8 != r3) goto L52
        L63:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.ogg.OggPageHeader.skipToNextPage(androidx.media3.extractor.ExtractorInput, long):boolean");
    }

    public boolean skipToNextPage(ExtractorInput extractorInput) {
        return skipToNextPage(extractorInput, -1L);
    }
}
