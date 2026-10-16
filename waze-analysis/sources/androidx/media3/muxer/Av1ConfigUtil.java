package androidx.media3.muxer;

import androidx.media3.container.ObuParser;
import com.google.d.b.an;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class Av1ConfigUtil {
    private static final int MAX_AV1_CONFIG_RECORD_SIZE_BYTES = 4;
    private static final int MAX_HEADER_AND_LENGTH_SIZE_BYTES = 9;
    private static final int MAX_LEB128_SIZE_BYTES = 8;
    private static final int OBU_HAS_SIZE_FIELD_BYTES = 2;

    private Av1ConfigUtil() {
    }

    public static byte[] createAv1CodecConfigurationRecord(ByteBuffer byteBuffer) {
        ArrayList arrayList = new ArrayList();
        ByteBuffer byteBufferConcatenateBuffers = null;
        ByteBuffer configFromSeqHeader = null;
        for (ObuParser.Obu obu : ObuParser.split(byteBuffer)) {
            int i2 = obu.type;
            if (i2 == 5) {
                arrayList.add(getConfigObuWithHeaderAndLength(obu));
            } else if (i2 == 1 && byteBufferConcatenateBuffers == null) {
                byteBufferConcatenateBuffers = getConfigObuWithHeaderAndLength(obu);
                configFromSeqHeader = parseConfigFromSeqHeader(obu);
            }
        }
        an.C(byteBufferConcatenateBuffers, "No sequence header available.");
        ByteBuffer byteBufferConcatenateBuffers2 = BoxUtils.concatenateBuffers((ByteBuffer[]) arrayList.toArray(new ByteBuffer[0]));
        if (byteBufferConcatenateBuffers2 != null) {
            byteBufferConcatenateBuffers = BoxUtils.concatenateBuffers(byteBufferConcatenateBuffers, byteBufferConcatenateBuffers2);
        }
        an.C(configFromSeqHeader, "csdHeader is null.");
        return BoxUtils.concatenateBuffers(configFromSeqHeader, byteBufferConcatenateBuffers).array();
    }

    private static ByteBuffer getConfigObuWithHeaderAndLength(ObuParser.Obu obu) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(obu.payload.remaining() + 9);
        byteBufferAllocate.put(obuHeader(obu.type));
        byteBufferAllocate.put(lebEncode(obu.payload.remaining()));
        byteBufferAllocate.put(obu.payload.duplicate());
        byteBufferAllocate.flip();
        return byteBufferAllocate;
    }

    private static ByteBuffer lebEncode(int i2) {
        an.l(i2 > 0);
        int iLebSizeInBytes = lebSizeInBytes(i2);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(iLebSizeInBytes);
        an.u(iLebSizeInBytes < 8);
        for (int i3 = 0; i3 < iLebSizeInBytes; i3++) {
            int i4 = i2 & 127;
            i2 >>= 7;
            if (i2 != 0) {
                i4 |= 128;
            }
            byteBufferAllocate.put((byte) i4);
        }
        byteBufferAllocate.flip();
        return byteBufferAllocate;
    }

    private static int lebSizeInBytes(int i2) {
        int i3 = 0;
        do {
            i2 >>= 7;
            i3++;
        } while (i2 != 0);
        return i3;
    }

    private static byte obuHeader(int i2) {
        return (byte) ((i2 << 3) | 2);
    }

    private static ByteBuffer parseConfigFromSeqHeader(ObuParser.Obu obu) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.put((byte) -127);
        ObuParser.SequenceHeader sequenceHeader = ObuParser.SequenceHeader.parse(obu);
        an.C(sequenceHeader, "No sequence header available.");
        byteBufferAllocate.put((byte) ((sequenceHeader.seqProfile << 5) | sequenceHeader.seqLevelIdx0));
        int i2 = sequenceHeader.seqTier0;
        int i3 = true != sequenceHeader.highBitdepth ? 0 : 64;
        int i4 = true != sequenceHeader.twelveBit ? 0 : 32;
        int i5 = true != sequenceHeader.monochrome ? 0 : 16;
        byteBufferAllocate.put((byte) ((true != sequenceHeader.subsamplingY ? 0 : 4) | (i2 > 0 ? 128 : 0) | i3 | i4 | i5 | (true != sequenceHeader.subsamplingX ? 0 : 8) | sequenceHeader.chromaSamplePosition));
        boolean z = sequenceHeader.initialDisplayDelayPresentFlag;
        byteBufferAllocate.put((byte) ((true != z ? 0 : 16) | (z ? sequenceHeader.initialDisplayDelayMinus1 & 15 : 0)));
        byteBufferAllocate.flip();
        return byteBufferAllocate;
    }
}
