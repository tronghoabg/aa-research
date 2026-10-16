package androidx.media3.muxer;

import com.google.d.b.an;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class EbmlUtils {
    private EbmlUtils() {
    }

    public static int calculateMinimumVIntLength(long j2) {
        an.l(j2 >= 0);
        if (j2 <= 126) {
            return 1;
        }
        if (j2 <= 16382) {
            return 2;
        }
        if (j2 <= 2097150) {
            return 3;
        }
        if (j2 <= 268435454) {
            return 4;
        }
        if (j2 <= 34359738366L) {
            return 5;
        }
        if (j2 <= 4398046511102L) {
            return 6;
        }
        if (j2 <= 562949953421310L) {
            return 7;
        }
        if (j2 <= 72057594037927934L) {
            return 8;
        }
        throw new IllegalArgumentException("Value " + j2 + " is too large for a VINT.");
    }

    public static ByteBuffer encodeVInt(long j2) {
        return encodeVIntWithWidth(j2, calculateMinimumVIntLength(j2));
    }

    public static ByteBuffer encodeVIntWithWidth(long j2, int i2) {
        an.l(i2 > 0 && i2 <= 8);
        long j3 = j2 | (1 << (i2 * 7));
        byte[] bArr = new byte[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            bArr[i3] = (byte) (j3 >>> (((i2 - 1) - i3) * 8));
        }
        return ByteBuffer.wrap(bArr);
    }
}
