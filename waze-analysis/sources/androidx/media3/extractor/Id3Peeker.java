package androidx.media3.extractor;

import androidx.media3.common.Metadata;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.extractor.metadata.id3.Id3Decoder;
import java.io.EOFException;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class Id3Peeker {
    private final ParsableByteArray scratch = new ParsableByteArray(10);

    private boolean peekId3HeaderIntoScratch(ExtractorInput extractorInput, int i2) {
        int i3;
        int i4 = 0;
        do {
            int i5 = i4 % 10;
            if (i5 == 0) {
                if (i4 != 0) {
                    ParsableByteArray parsableByteArray = this.scratch;
                    System.arraycopy(parsableByteArray.getData(), 10, parsableByteArray.getData(), 0, 9);
                }
                i3 = 0;
            } else {
                i3 = i5;
            }
            int i6 = i4 != 0 ? 1 : 10;
            try {
                int i7 = i5 + 10;
                extractorInput.peekFully(this.scratch.getData(), i7 - i6, i6);
                this.scratch.setPosition(i3);
                this.scratch.setLimit(i7);
                if (this.scratch.peekUnsignedInt24() == 4801587) {
                    return true;
                }
                if (MpegAudioUtil.getFrameSize(this.scratch.peekInt()) != -1) {
                    return false;
                }
                if (i4 == 0) {
                    this.scratch.ensureCapacity(20);
                }
                i4++;
            } catch (EOFException unused) {
            }
        } while (i4 <= i2);
        return false;
    }

    public Metadata peekId3Data(ExtractorInput extractorInput, Id3Decoder.FramePredicate framePredicate, int i2) {
        Metadata metadataDecode = null;
        int i3 = 0;
        while (peekId3HeaderIntoScratch(extractorInput, i2)) {
            ParsableByteArray parsableByteArray = this.scratch;
            int position = parsableByteArray.getPosition();
            parsableByteArray.skipBytes(6);
            int synchSafeInt = this.scratch.readSynchSafeInt();
            int i4 = synchSafeInt + 10;
            if (metadataDecode == null) {
                byte[] bArr = new byte[i4];
                System.arraycopy(this.scratch.getData(), position, bArr, 0, 10);
                extractorInput.peekFully(bArr, 10, synchSafeInt);
                metadataDecode = new Id3Decoder(framePredicate).decode(bArr, i4);
            } else {
                extractorInput.advancePeekPosition(synchSafeInt);
            }
            i3 += i4;
        }
        extractorInput.resetPeekPosition();
        extractorInput.advancePeekPosition(i3);
        return metadataDecode;
    }

    @Deprecated
    public Metadata peekId3Data(ExtractorInput extractorInput, Id3Decoder.FramePredicate framePredicate) {
        return peekId3Data(extractorInput, framePredicate, 0);
    }
}
