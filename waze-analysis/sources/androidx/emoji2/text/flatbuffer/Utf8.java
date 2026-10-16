package androidx.emoji2.text.flatbuffer;

import androidx.compose.foundation.style.StylePropertiesKt;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public abstract class Utf8 {
    private static Utf8 DEFAULT;

    /* compiled from: WazeSource */
    class DecodeUtil {
        DecodeUtil() {
        }

        static void handleFourBytes(byte b2, byte b3, byte b4, byte b5, char[] cArr, int i2) {
            if (isNotTrailingByte(b3) || (((b2 << StylePropertiesKt.RotationZId) + (b3 + 112)) >> 30) != 0 || isNotTrailingByte(b4) || isNotTrailingByte(b5)) {
                throw new IllegalArgumentException("Invalid UTF-8");
            }
            int iTrailingByteValue = ((b2 & 7) << 18) | (trailingByteValue(b3) << 12) | (trailingByteValue(b4) << 6) | trailingByteValue(b5);
            cArr[i2] = highSurrogate(iTrailingByteValue);
            cArr[i2 + 1] = lowSurrogate(iTrailingByteValue);
        }

        static void handleOneByte(byte b2, char[] cArr, int i2) {
            cArr[i2] = (char) b2;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0013  */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0016 A[PHI: r2
  0x0016: PHI (r2v3 byte) = (r2v2 byte), (r2v9 byte) binds: [B:9:0x0011, B:11:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:14:0x001c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        static void handleThreeBytes(byte r2, byte r3, byte r4, char[] r5, int r6) {
            /*
                boolean r0 = isNotTrailingByte(r3)
                if (r0 != 0) goto L30
                r0 = -96
                r1 = -32
                if (r2 != r1) goto Lf
                if (r3 < r0) goto L30
                r2 = r1
            Lf:
                r1 = -19
                if (r2 != r1) goto L16
                if (r3 >= r0) goto L30
                r2 = r1
            L16:
                boolean r0 = isNotTrailingByte(r4)
                if (r0 != 0) goto L30
                r2 = r2 & 15
                int r3 = trailingByteValue(r3)
                int r4 = trailingByteValue(r4)
                int r2 = r2 << 12
                int r3 = r3 << 6
                r2 = r2 | r3
                r2 = r2 | r4
                char r2 = (char) r2
                r5[r6] = r2
                return
            L30:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r3 = "Invalid UTF-8"
                r2.<init>(r3)
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.flatbuffer.Utf8.DecodeUtil.handleThreeBytes(byte, byte, byte, char[], int):void");
        }

        static void handleTwoBytes(byte b2, byte b3, char[] cArr, int i2) {
            if (b2 < -62) {
                throw new IllegalArgumentException("Invalid UTF-8: Illegal leading byte in 2 bytes utf");
            }
            if (isNotTrailingByte(b3)) {
                throw new IllegalArgumentException("Invalid UTF-8: Illegal trailing byte in 2 bytes utf");
            }
            cArr[i2] = (char) (((b2 & StylePropertiesKt.ClipId) << 6) | trailingByteValue(b3));
        }

        private static char highSurrogate(int i2) {
            return (char) ((i2 >>> 10) + 55232);
        }

        private static boolean isNotTrailingByte(byte b2) {
            return b2 > -65;
        }

        static boolean isOneByte(byte b2) {
            return b2 >= 0;
        }

        static boolean isThreeBytes(byte b2) {
            return b2 < -16;
        }

        static boolean isTwoBytes(byte b2) {
            return b2 < -32;
        }

        private static char lowSurrogate(int i2) {
            return (char) ((i2 & 1023) + 56320);
        }

        private static int trailingByteValue(byte b2) {
            return b2 & 63;
        }
    }

    /* compiled from: WazeSource */
    class UnpairedSurrogateException extends IllegalArgumentException {
        UnpairedSurrogateException(int i2, int i3) {
            super("Unpaired surrogate at index " + i2 + " of " + i3);
        }
    }

    public static Utf8 getDefault() {
        if (DEFAULT == null) {
            DEFAULT = new Utf8Safe();
        }
        return DEFAULT;
    }

    public static void setDefault(Utf8 utf8) {
        DEFAULT = utf8;
    }

    public abstract String decodeUtf8(ByteBuffer byteBuffer, int i2, int i3);

    public abstract void encodeUtf8(CharSequence charSequence, ByteBuffer byteBuffer);

    public abstract int encodedLength(CharSequence charSequence);
}
