package androidx.media3.container;

import androidx.media3.common.util.ParsableBitArray;
import com.google.d.b.an;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class ObuParser {
    public static final int OBU_FRAME = 6;
    public static final int OBU_FRAME_HEADER = 3;
    public static final int OBU_METADATA = 5;
    public static final int OBU_PADDING = 15;
    public static final int OBU_SEQUENCE_HEADER = 1;
    public static final int OBU_TEMPORAL_DELIMITER = 2;

    /* compiled from: WazeSource */
    public final class FrameHeader {
        private static final int FRAME_TYPE_INTRA_ONLY_FRAME = 2;
        private static final int FRAME_TYPE_KEY_FRAME = 0;
        private static final int FRAME_TYPE_SWITCH_FRAME = 3;
        private static final int PROBE_BYTES = 4;
        private final boolean isDependedOn;

        /* JADX WARN: Removed duplicated region for block: B:13:0x004b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private FrameHeader(androidx.media3.container.ObuParser.SequenceHeader r8, androidx.media3.container.ObuParser.Obu r9) throws androidx.media3.container.ObuParser.NotYetImplementedException {
            /*
                r7 = this;
                r7.<init>()
                int r0 = r9.type
                r1 = 6
                r2 = 0
                r3 = 3
                r4 = 1
                if (r0 == r1) goto L10
                if (r0 != r3) goto Le
                goto L10
            Le:
                r0 = r2
                goto L11
            L10:
                r0 = r4
            L11:
                com.google.d.b.an.l(r0)
                java.nio.ByteBuffer r0 = r9.payload
                int r0 = r0.remaining()
                r1 = 4
                int r0 = java.lang.Math.min(r1, r0)
                byte[] r0 = new byte[r0]
                java.nio.ByteBuffer r9 = r9.payload
                java.nio.ByteBuffer r9 = r9.asReadOnlyBuffer()
                r9.get(r0)
                androidx.media3.common.util.ParsableBitArray r9 = new androidx.media3.common.util.ParsableBitArray
                r9.<init>(r0)
                boolean r0 = r8.reducedStillPictureHeader
                androidx.media3.container.ObuParser.m12380$$Nest$smthrowWhenFeatureRequired(r0)
                boolean r0 = r9.readBit()
                if (r0 == 0) goto L3b
                goto L96
            L3b:
                r0 = 2
                int r1 = r9.readBits(r0)
                boolean r5 = r9.readBit()
                boolean r6 = r8.decoderModelInfoPresentFlag
                androidx.media3.container.ObuParser.m12380$$Nest$smthrowWhenFeatureRequired(r6)
                if (r5 != 0) goto L4d
            L4b:
                r2 = r4
                goto L96
            L4d:
                if (r1 == r3) goto L57
                if (r1 != 0) goto L52
                goto L57
            L52:
                boolean r5 = r9.readBit()
                goto L58
            L57:
                r5 = r4
            L58:
                r9.skipBit()
                boolean r6 = r8.seqForceScreenContentTools
                r6 = r6 ^ r4
                androidx.media3.container.ObuParser.m12380$$Nest$smthrowWhenFeatureRequired(r6)
                boolean r6 = r9.readBit()
                if (r6 == 0) goto L70
                boolean r6 = r8.seqForceIntegerMv
                r6 = r6 ^ r4
                androidx.media3.container.ObuParser.m12380$$Nest$smthrowWhenFeatureRequired(r6)
                r9.skipBit()
            L70:
                boolean r6 = r8.frameIdNumbersPresentFlag
                androidx.media3.container.ObuParser.m12380$$Nest$smthrowWhenFeatureRequired(r6)
                if (r1 == r3) goto L7a
                r9.skipBit()
            L7a:
                int r8 = r8.orderHintBits
                r9.skipBits(r8)
                if (r1 == r0) goto L88
                if (r1 == 0) goto L88
                if (r5 != 0) goto L88
                r9.skipBits(r3)
            L88:
                if (r1 == r3) goto L4b
                if (r1 != 0) goto L8d
                goto L4b
            L8d:
                r8 = 8
                int r8 = r9.readBits(r8)
                if (r8 == 0) goto L96
                goto L4b
            L96:
                r7.isDependedOn = r2
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.media3.container.ObuParser.FrameHeader.<init>(androidx.media3.container.ObuParser$SequenceHeader, androidx.media3.container.ObuParser$Obu):void");
        }

        public static FrameHeader parse(SequenceHeader sequenceHeader, Obu obu) {
            try {
                return new FrameHeader(sequenceHeader, obu);
            } catch (NotYetImplementedException unused) {
                return null;
            }
        }

        public boolean isDependedOn() {
            return this.isDependedOn;
        }
    }

    /* compiled from: WazeSource */
    public final class Metadata {
        public static final int METADATA_TYPE_HDR_CLL = 1;
        public static final int METADATA_TYPE_HDR_MDCV = 2;
        public static final int METADATA_TYPE_ITUT_T35 = 4;
        public static final int METADATA_TYPE_SCALABILITY = 3;
        public static final int METADATA_TYPE_TIMECODE = 5;
        public final ByteBuffer payload;
        public final int type;

        private Metadata(int i2, ByteBuffer byteBuffer) {
            this.type = i2;
            this.payload = byteBuffer;
        }

        public static Metadata parse(Obu obu) {
            an.l(obu.type == 5);
            ByteBuffer byteBufferAsReadOnlyBuffer = obu.payload.asReadOnlyBuffer();
            return new Metadata(ObuParser.leb128(byteBufferAsReadOnlyBuffer), byteBufferAsReadOnlyBuffer);
        }
    }

    /* compiled from: WazeSource */
    public final class Obu {
        public final ByteBuffer header;
        public final ByteBuffer payload;
        public final int type;

        private Obu(int i2, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
            this.type = i2;
            this.header = byteBuffer;
            this.payload = byteBuffer2;
        }
    }

    /* compiled from: WazeSource */
    public final class SequenceHeader {
        public final int chromaSamplePosition;
        public final byte colorPrimaries;
        public final boolean decoderModelInfoPresentFlag;
        public final boolean frameIdNumbersPresentFlag;
        public final boolean highBitdepth;
        public final int initialDisplayDelayMinus1;
        public final boolean initialDisplayDelayPresentFlag;
        public final byte matrixCoefficients;
        public final boolean monochrome;
        public final int orderHintBits;
        public final boolean reducedStillPictureHeader;
        public final boolean seqForceIntegerMv;
        public final boolean seqForceScreenContentTools;
        public final int seqLevelIdx0;
        public final int seqProfile;
        public final int seqTier0;
        public final boolean subsamplingX;
        public final boolean subsamplingY;
        public final byte transferCharacteristics;
        public final boolean twelveBit;

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:60:0x010e  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x0116  */
        /* JADX WARN: Type inference failed for: r8v4, types: [int] */
        /* JADX WARN: Type inference failed for: r8v5 */
        /* JADX WARN: Type inference failed for: r8v6 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private SequenceHeader(androidx.media3.container.ObuParser.Obu r14) {
            /*
                Method dump skipped, instructions count: 456
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.media3.container.ObuParser.SequenceHeader.<init>(androidx.media3.container.ObuParser$Obu):void");
        }

        public static SequenceHeader parse(Obu obu) {
            try {
                return new SequenceHeader(obu);
            } catch (NotYetImplementedException unused) {
                return null;
            }
        }

        private static void skipTimingInfo(ParsableBitArray parsableBitArray) {
            parsableBitArray.skipBits(64);
            if (parsableBitArray.readBit()) {
                ObuParser.skipUvlc(parsableBitArray);
            }
        }
    }

    private ObuParser() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int leb128(ByteBuffer byteBuffer) {
        int i2 = 0;
        for (int i3 = 0; i3 < 8; i3++) {
            byte b2 = byteBuffer.get();
            i2 |= (b2 & 127) << (i3 * 7);
            if ((b2 & 128) == 0) {
                return i2;
            }
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void skipUvlc(ParsableBitArray parsableBitArray) {
        int i2 = 0;
        while (!parsableBitArray.readBit()) {
            i2++;
        }
        if (i2 < 32) {
            parsableBitArray.skipBits(i2);
        }
    }

    public static List<Obu> split(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        ArrayList arrayList = new ArrayList();
        while (byteBufferAsReadOnlyBuffer.hasRemaining()) {
            ByteBuffer byteBufferDuplicate = byteBufferAsReadOnlyBuffer.duplicate();
            try {
                byte b2 = byteBufferAsReadOnlyBuffer.get();
                int i2 = b2 >> 3;
                if (((b2 >> 2) & 1) != 0) {
                    byteBufferAsReadOnlyBuffer.get();
                }
                int iLeb128 = ((b2 >> 1) & 1) != 0 ? leb128(byteBufferAsReadOnlyBuffer) : byteBufferAsReadOnlyBuffer.remaining();
                if (byteBufferAsReadOnlyBuffer.position() + iLeb128 > byteBufferAsReadOnlyBuffer.limit()) {
                    break;
                }
                byteBufferDuplicate.limit(byteBufferAsReadOnlyBuffer.position());
                ByteBuffer byteBufferDuplicate2 = byteBufferAsReadOnlyBuffer.duplicate();
                byteBufferDuplicate2.limit(byteBufferAsReadOnlyBuffer.position() + iLeb128);
                arrayList.add(new Obu(i2 & 15, byteBufferDuplicate, byteBufferDuplicate2));
                byteBufferAsReadOnlyBuffer.position(byteBufferAsReadOnlyBuffer.position() + iLeb128);
            } catch (BufferUnderflowException unused) {
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void throwWhenFeatureRequired(boolean z) throws NotYetImplementedException {
        if (z) {
            throw new NotYetImplementedException();
        }
    }

    /* compiled from: WazeSource */
    class NotYetImplementedException extends Exception {
        private NotYetImplementedException() {
        }
    }
}
