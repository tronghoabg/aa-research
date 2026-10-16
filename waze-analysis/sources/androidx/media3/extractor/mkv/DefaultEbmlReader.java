package androidx.media3.extractor.mkv;

import androidx.media3.extractor.ExtractorInput;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayDeque;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class DefaultEbmlReader implements EbmlReader {
    private static final int ELEMENT_STATE_READ_CONTENT = 2;
    private static final int ELEMENT_STATE_READ_CONTENT_SIZE = 1;
    private static final int ELEMENT_STATE_READ_ID = 0;
    private static final int MAX_ID_BYTES = 4;
    private static final int MAX_INTEGER_ELEMENT_SIZE_BYTES = 8;
    private static final int MAX_LENGTH_BYTES = 8;
    private static final int VALID_FLOAT32_ELEMENT_SIZE_BYTES = 4;
    private static final int VALID_FLOAT64_ELEMENT_SIZE_BYTES = 8;
    private long elementContentSize;
    private int elementId;
    private int elementState;
    private EbmlProcessor processor;
    private final byte[] scratch = new byte[8];
    private final ArrayDeque<MasterElement> masterElementsStack = new ArrayDeque<>();
    private final VarintReader varintReader = new VarintReader();

    /* compiled from: WazeSource */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @interface ElementState {
    }

    /* compiled from: WazeSource */
    final class MasterElement {
        private final long elementEndPosition;
        private final int elementId;

        private MasterElement(int i2, long j2) {
            this.elementId = i2;
            this.elementEndPosition = j2;
        }
    }

    private long maybeResyncToNextLevel1Element(ExtractorInput extractorInput) {
        extractorInput.resetPeekPosition();
        while (true) {
            extractorInput.peekFully(this.scratch, 0, 4);
            int unsignedVarintLength = VarintReader.parseUnsignedVarintLength(this.scratch[0]);
            if (unsignedVarintLength != -1 && unsignedVarintLength <= 4) {
                int iAssembleVarint = (int) VarintReader.assembleVarint(this.scratch, unsignedVarintLength, false);
                if (this.processor.isLevel1Element(iAssembleVarint)) {
                    extractorInput.skipFully(unsignedVarintLength);
                    return iAssembleVarint;
                }
            }
            extractorInput.skipFully(1);
        }
    }

    private double readFloat(ExtractorInput extractorInput, int i2) {
        return i2 == 4 ? Float.intBitsToFloat((int) r1) : Double.longBitsToDouble(readInteger(extractorInput, i2));
    }

    private long readInteger(ExtractorInput extractorInput, int i2) {
        extractorInput.readFully(this.scratch, 0, i2);
        long j2 = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            j2 = (j2 << 8) | (this.scratch[i3] & 255);
        }
        return j2;
    }

    private static String readString(ExtractorInput extractorInput, int i2) {
        if (i2 == 0) {
            return "";
        }
        byte[] bArr = new byte[i2];
        extractorInput.readFully(bArr, 0, i2);
        while (i2 > 0) {
            int i3 = i2 - 1;
            if (bArr[i3] != 0) {
                break;
            }
            i2 = i3;
        }
        return new String(bArr, 0, i2);
    }

    @Override // androidx.media3.extractor.mkv.EbmlReader
    public void init(EbmlProcessor ebmlProcessor) {
        this.processor = ebmlProcessor;
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x013a A[LOOP:0: B:3:0x0005->B:58:0x013a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x006a A[SYNTHETIC] */
    @Override // androidx.media3.extractor.mkv.EbmlReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean read(androidx.media3.extractor.ExtractorInput r12) throws androidx.media3.common.ParserException {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.mkv.DefaultEbmlReader.read(androidx.media3.extractor.ExtractorInput):boolean");
    }

    @Override // androidx.media3.extractor.mkv.EbmlReader
    public void reset() {
        this.elementState = 0;
        this.masterElementsStack.clear();
        this.varintReader.reset();
    }
}
