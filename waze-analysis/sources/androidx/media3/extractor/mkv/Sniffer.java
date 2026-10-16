package androidx.media3.extractor.mkv;

import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.extractor.ExtractorInput;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class Sniffer {
    private static final int ID_EBML = 440786851;
    private static final int SEARCH_LENGTH = 1024;
    private int peekLength;
    private final ParsableByteArray scratch = new ParsableByteArray(8);

    private long readUint(ExtractorInput extractorInput) {
        int i2;
        int i3 = 0;
        extractorInput.peekFully(this.scratch.getData(), 0, 1);
        int i4 = this.scratch.getData()[0] & 255;
        if (i4 == 0) {
            return Long.MIN_VALUE;
        }
        int i5 = 128;
        int i6 = 0;
        while (true) {
            i2 = i6 + 1;
            if ((i4 & i5) != 0) {
                break;
            }
            i5 >>= 1;
            i6 = i2;
        }
        int i7 = i4 & (~i5);
        extractorInput.peekFully(this.scratch.getData(), 1, i6);
        while (i3 < i6) {
            i3++;
            i7 = (this.scratch.getData()[i3] & 255) + (i7 << 8);
        }
        this.peekLength += i2;
        return i7;
    }

    public boolean sniff(ExtractorInput extractorInput) {
        long length = extractorInput.getLength();
        long j2 = 1024;
        if (length != -1 && length <= 1024) {
            j2 = length;
        }
        extractorInput.peekFully(this.scratch.getData(), 0, 4);
        long unsignedInt = this.scratch.readUnsignedInt();
        this.peekLength = 4;
        while (unsignedInt != 440786851) {
            int i2 = (int) j2;
            int i3 = this.peekLength + 1;
            this.peekLength = i3;
            if (i3 == i2) {
                return false;
            }
            extractorInput.peekFully(this.scratch.getData(), 0, 1);
            unsignedInt = ((unsignedInt << 8) & (-256)) | (this.scratch.getData()[0] & 255);
        }
        long uint = readUint(extractorInput);
        long j3 = this.peekLength;
        if (uint != Long.MIN_VALUE) {
            long j4 = j3 + uint;
            if (length == -1 || j4 < length) {
                while (true) {
                    long j5 = this.peekLength;
                    if (j5 < j4) {
                        if (readUint(extractorInput) == Long.MIN_VALUE) {
                            return false;
                        }
                        long uint2 = readUint(extractorInput);
                        if (uint2 < 0) {
                            return false;
                        }
                        if (uint2 != 0) {
                            int i4 = (int) uint2;
                            extractorInput.advancePeekPosition(i4);
                            this.peekLength += i4;
                        }
                    } else if (j5 == j4) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
