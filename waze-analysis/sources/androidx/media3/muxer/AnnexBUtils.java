package androidx.media3.muxer;

import android.util.Pair;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import com.google.d.b.an;
import com.google.d.d.bi;
import com.google.d.d.bn;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class AnnexBUtils {
    private static final int THREE_BYTE_NAL_START_CODE_SIZE = 3;

    private AnnexBUtils() {
    }

    public static boolean doesSampleContainAnnexBNalUnits(Format format) throws NumberFormatException {
        String str = format.sampleMimeType;
        an.B(str);
        if (!str.equals(MimeTypes.VIDEO_DOLBY_VISION)) {
            return str.equals("video/avc") || str.equals(MimeTypes.VIDEO_H265);
        }
        Pair<Integer, Integer> dolbyVisionProfileAndLevel = Boxes.getDolbyVisionProfileAndLevel(format);
        an.B(dolbyVisionProfileAndLevel);
        return ((Integer) dolbyVisionProfileAndLevel.first).intValue() != 10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0047, code lost:
    
        if (r2 == 1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0049, code lost:
    
        return r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int findNalEndIndex(java.nio.ByteBuffer r4, int r5) {
        /*
        L0:
            int r0 = r4.limit()
            int r0 = r0 + (-4)
            r1 = 1
            if (r5 > r0) goto L31
            int r0 = r4.getInt(r5)
            r2 = r0 & (-256(0xffffffffffffff00, float:NaN))
            if (r2 == 0) goto L49
            r3 = 256(0x100, float:3.59E-43)
            if (r2 != r3) goto L16
            goto L49
        L16:
            r2 = 16777215(0xffffff, float:2.3509886E-38)
            r2 = r2 & r0
            if (r2 == 0) goto L2f
            if (r2 != r1) goto L1f
            goto L2f
        L1f:
            char r1 = (char) r0
            if (r1 != 0) goto L25
            int r5 = r5 + 2
            goto L0
        L25:
            r0 = r0 & 255(0xff, float:3.57E-43)
            if (r0 != 0) goto L2c
            int r5 = r5 + 3
            goto L0
        L2c:
            int r5 = r5 + 4
            goto L0
        L2f:
            int r5 = r5 + r1
            return r5
        L31:
            int r0 = r4.limit()
            int r0 = r0 + (-3)
            if (r5 != r0) goto L4a
            short r0 = r4.getShort(r5)
            int r2 = r5 + 2
            byte r2 = r4.get(r2)
            if (r0 != 0) goto L4a
            if (r2 == 0) goto L49
            if (r2 != r1) goto L4a
        L49:
            return r5
        L4a:
            int r4 = r4.limit()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.muxer.AnnexBUtils.findNalEndIndex(java.nio.ByteBuffer, int):int");
    }

    public static bn<ByteBuffer> findNalUnits(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() == 0) {
            return bn.p();
        }
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        int iSkipLeadingZerosAndFindNalStartCodeIndex = skipLeadingZerosAndFindNalStartCodeIndex(byteBufferAsReadOnlyBuffer, byteBufferAsReadOnlyBuffer.position()) + 3;
        bi biVar = new bi();
        int i2 = iSkipLeadingZerosAndFindNalStartCodeIndex;
        boolean z = true;
        while (iSkipLeadingZerosAndFindNalStartCodeIndex < byteBufferAsReadOnlyBuffer.limit()) {
            if (!z) {
                int iSkipLeadingZerosAndFindNalStartCodeIndex2 = skipLeadingZerosAndFindNalStartCodeIndex(byteBufferAsReadOnlyBuffer, iSkipLeadingZerosAndFindNalStartCodeIndex);
                if (iSkipLeadingZerosAndFindNalStartCodeIndex2 == byteBufferAsReadOnlyBuffer.limit()) {
                    break;
                }
                i2 = iSkipLeadingZerosAndFindNalStartCodeIndex2 + 3;
                z = true;
                iSkipLeadingZerosAndFindNalStartCodeIndex = i2;
            } else {
                iSkipLeadingZerosAndFindNalStartCodeIndex = findNalEndIndex(byteBufferAsReadOnlyBuffer, iSkipLeadingZerosAndFindNalStartCodeIndex);
                biVar.g(getBytes(byteBufferAsReadOnlyBuffer, i2, iSkipLeadingZerosAndFindNalStartCodeIndex - i2));
                z = false;
            }
        }
        return biVar.f();
    }

    private static ByteBuffer getBytes(ByteBuffer byteBuffer, int i2, int i3) {
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        byteBufferDuplicate.position(i2);
        byteBufferDuplicate.limit(i2 + i3);
        return byteBufferDuplicate.slice();
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x004b, code lost:
    
        return r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int skipLeadingZerosAndFindNalStartCodeIndex(java.nio.ByteBuffer r5, int r6) {
        /*
        L0:
            int r0 = r5.limit()
            int r0 = r0 + (-4)
            r1 = 0
            r2 = 1
            if (r6 > r0) goto L2d
            int r0 = r5.getInt(r6)
            r3 = r0 & (-256(0xffffffffffffff00, float:NaN))
            r4 = 256(0x100, float:3.59E-43)
            if (r3 != r4) goto L15
            goto L4b
        L15:
            int r6 = r6 + 1
            if (r3 != 0) goto L1b
            r3 = r2
            goto L1c
        L1b:
            r3 = r1
        L1c:
            java.lang.String r4 = "Invalid Nal units"
            com.google.d.b.an.v(r3, r4)
            r0 = r0 & 255(0xff, float:3.57E-43)
            if (r0 != r2) goto L26
            return r6
        L26:
            if (r0 != 0) goto L29
            r1 = r2
        L29:
            com.google.d.b.an.v(r1, r4)
            goto L0
        L2d:
            int r0 = r5.limit()
            int r0 = r0 + (-3)
            java.lang.String r3 = "Invalid NAL units"
            if (r6 > r0) goto L53
            short r0 = r5.getShort(r6)
            if (r0 != 0) goto L3f
            r0 = r2
            goto L40
        L3f:
            r0 = r1
        L40:
            com.google.d.b.an.v(r0, r3)
            int r0 = r6 + 2
            byte r0 = r5.get(r0)
            if (r0 != r2) goto L4c
        L4b:
            return r6
        L4c:
            if (r0 != 0) goto L4f
            r1 = r2
        L4f:
            com.google.d.b.an.v(r1, r3)
            goto L68
        L53:
            int r0 = r5.limit()
            if (r6 >= r0) goto L68
            byte r0 = r5.get(r6)
            if (r0 != 0) goto L61
            r0 = r2
            goto L62
        L61:
            r0 = r1
        L62:
            com.google.d.b.an.v(r0, r3)
            int r6 = r6 + 1
            goto L53
        L68:
            int r5 = r5.limit()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.muxer.AnnexBUtils.skipLeadingZerosAndFindNalStartCodeIndex(java.nio.ByteBuffer, int):int");
    }

    public static ByteBuffer stripEmulationPrevention(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.limit());
        int i2 = 0;
        for (int i3 = 0; i3 < byteBuffer.limit(); i3++) {
            if (byteBuffer.get(i3) != 3 || i2 < 2) {
                byteBufferAllocate.put(byteBuffer.get(i3));
            }
            i2 = byteBuffer.get(i3) == 0 ? i2 + 1 : 0;
        }
        byteBufferAllocate.flip();
        return byteBufferAllocate;
    }
}
