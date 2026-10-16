package androidx.media3.common.util;

import androidx.compose.foundation.style.StylePropertiesKt;
import com.google.d.b.an;
import com.google.d.d.ci;
import com.google.d.l.j;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class ParsableByteArray {
    public static final int INVALID_CODE_POINT = 1114112;
    private byte[] data;
    private int limit;
    private int position;
    private static final char[] CR_AND_LF = {'\r', '\n'};
    private static final char[] LF = {'\n'};
    private static final ci<Charset> SUPPORTED_CHARSETS_FOR_READLINE = ci.t(StandardCharsets.US_ASCII, StandardCharsets.UTF_8, StandardCharsets.UTF_16, StandardCharsets.UTF_16BE, StandardCharsets.UTF_16LE);
    private static final AtomicBoolean shouldEnforceLimitOnLegacyMethods = new AtomicBoolean();

    public ParsableByteArray(int i2) {
        this.data = new byte[i2];
        this.limit = i2;
    }

    private static int decodeUtf8CodeUnit(int i2, int i3, int i4, int i5) {
        int i6 = ((byte) i5) & 63;
        return j.j((byte) 0, j.b(((i2 & 7) << 2) | ((i3 & 48) >> 4)), j.b(((r5 & 60) >> 2) | ((((byte) i3) & StylePropertiesKt.RightId) << 4)), j.b(i6 | ((((byte) i4) & 3) << 6)));
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int findNextLineTerminator(java.nio.charset.Charset r5) {
        /*
            r4 = this;
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
            boolean r0 = r5.equals(r0)
            r1 = 1
            if (r0 != 0) goto L40
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.US_ASCII
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L12
            goto L40
        L12:
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_16
            boolean r0 = r5.equals(r0)
            r1 = 2
            if (r0 != 0) goto L40
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_16LE
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L40
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_16BE
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L2c
            goto L40
        L2c:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r0 = "Unsupported charset: "
            java.lang.String r5 = r0.concat(r5)
            r4.<init>(r5)
            throw r4
        L40:
            int r0 = r4.position
        L42:
            int r2 = r4.limit
            int r3 = r1 + (-1)
            int r3 = r2 - r3
            if (r0 >= r3) goto La1
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_8
            boolean r2 = r5.equals(r2)
            if (r2 != 0) goto L5a
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.US_ASCII
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L65
        L5a:
            byte[] r2 = r4.data
            r2 = r2[r0]
            boolean r2 = androidx.media3.common.util.Util.isLinebreak(r2)
            if (r2 == 0) goto L65
            goto L9e
        L65:
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_16
            boolean r2 = r5.equals(r2)
            if (r2 != 0) goto L75
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_16BE
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L86
        L75:
            byte[] r2 = r4.data
            r3 = r2[r0]
            if (r3 != 0) goto L86
            int r3 = r0 + 1
            r2 = r2[r3]
            boolean r2 = androidx.media3.common.util.Util.isLinebreak(r2)
            if (r2 == 0) goto L86
            goto L9e
        L86:
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_16LE
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L9f
            int r2 = r0 + 1
            byte[] r3 = r4.data
            r2 = r3[r2]
            if (r2 != 0) goto L9f
            r2 = r3[r0]
            boolean r2 = androidx.media3.common.util.Util.isLinebreak(r2)
            if (r2 == 0) goto L9f
        L9e:
            return r0
        L9f:
            int r0 = r0 + r1
            goto L42
        La1:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.common.util.ParsableByteArray.findNextLineTerminator(java.nio.charset.Charset):int");
    }

    private static int getSmallestCodeUnitSize(Charset charset) {
        an.q(SUPPORTED_CHARSETS_FOR_READLINE.contains(charset), "Unsupported charset: %s", charset);
        return (charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) ? 1 : 2;
    }

    private static boolean isUtf8ContinuationByte(byte b2) {
        return (b2 & 192) == 128;
    }

    private void maybeAssertAtLeastBytesLeftForLegacyMethod(int i2) {
        if (!shouldEnforceLimitOnLegacyMethods.get() || bytesLeft() >= i2) {
            return;
        }
        throw new IndexOutOfBoundsException("bytesNeeded= " + i2 + ", bytesLeft=" + bytesLeft());
    }

    private int peekCodePointAndSize(Charset charset) {
        int codePoint;
        an.q(SUPPORTED_CHARSETS_FOR_READLINE.contains(charset), "Unsupported charset: %s", charset);
        if (bytesLeft() < getSmallestCodeUnitSize(charset)) {
            throw new IndexOutOfBoundsException("position=" + this.position + ", limit=" + this.limit);
        }
        byte b2 = 1;
        if (charset.equals(StandardCharsets.US_ASCII)) {
            byte b3 = this.data[this.position];
            if ((b3 & 128) == 0) {
                codePoint = j.d(b3);
                return (codePoint << 8) | b2;
            }
            return 0;
        }
        if (charset.equals(StandardCharsets.UTF_8)) {
            byte bPeekUtf8CodeUnitSize = peekUtf8CodeUnitSize();
            if (bPeekUtf8CodeUnitSize == 1) {
                codePoint = j.d(this.data[this.position]);
            } else if (bPeekUtf8CodeUnitSize == 2) {
                byte[] bArr = this.data;
                int i2 = this.position;
                codePoint = decodeUtf8CodeUnit(0, 0, bArr[i2], bArr[i2 + 1]);
            } else {
                if (bPeekUtf8CodeUnitSize != 3) {
                    if (bPeekUtf8CodeUnitSize == 4) {
                        byte[] bArr2 = this.data;
                        int i3 = this.position;
                        codePoint = decodeUtf8CodeUnit(bArr2[i3], bArr2[i3 + 1], bArr2[i3 + 2], bArr2[i3 + 3]);
                    }
                    return 0;
                }
                byte[] bArr3 = this.data;
                int i4 = this.position;
                codePoint = decodeUtf8CodeUnit(0, bArr3[i4] & StylePropertiesKt.RightId, bArr3[i4 + 1], bArr3[i4 + 2]);
            }
            b2 = bPeekUtf8CodeUnitSize;
        } else {
            ByteOrder byteOrder = charset.equals(StandardCharsets.UTF_16LE) ? ByteOrder.LITTLE_ENDIAN : ByteOrder.BIG_ENDIAN;
            char cPeekChar = peekChar(byteOrder, 0);
            if (!Character.isHighSurrogate(cPeekChar) || bytesLeft() < 4) {
                codePoint = cPeekChar;
                b2 = 2;
            } else {
                codePoint = Character.toCodePoint(cPeekChar, peekChar(byteOrder, 2));
                b2 = 4;
            }
        }
        return (codePoint << 8) | b2;
    }

    private byte peekUtf8CodeUnitSize() {
        byte b2 = this.data[this.position];
        if ((b2 & 128) == 0) {
            return (byte) 1;
        }
        if ((b2 & 224) == 192 && bytesLeft() >= 2 && isUtf8ContinuationByte(this.data[this.position + 1])) {
            return (byte) 2;
        }
        if ((this.data[this.position] & 240) == 224 && bytesLeft() >= 3) {
            byte[] bArr = this.data;
            int i2 = this.position;
            if (isUtf8ContinuationByte(bArr[i2 + 1]) && isUtf8ContinuationByte(bArr[i2 + 2])) {
                return (byte) 3;
            }
        }
        if ((this.data[this.position] & 248) != 240 || bytesLeft() < 4) {
            return (byte) 0;
        }
        byte[] bArr2 = this.data;
        int i3 = this.position;
        return (isUtf8ContinuationByte(bArr2[i3 + 1]) && isUtf8ContinuationByte(bArr2[i3 + 2]) && isUtf8ContinuationByte(bArr2[i3 + 3])) ? (byte) 4 : (byte) 0;
    }

    private char readCharacterIfInList(Charset charset, char[] cArr) {
        int iPeekCodePointAndSize;
        if (bytesLeft() >= getSmallestCodeUnitSize(charset) && (iPeekCodePointAndSize = peekCodePointAndSize(charset)) != 0) {
            long j2 = iPeekCodePointAndSize >>> 8;
            an.p(true, "out of range: %s", j2);
            int i2 = (int) j2;
            if (!Character.isSupplementaryCodePoint(i2)) {
                long j3 = i2;
                char c2 = (char) j3;
                an.p(((long) c2) == j3, "Out of range: %s", j3);
                for (char c3 : cArr) {
                    if (c3 == c2) {
                        this.position += j.h(iPeekCodePointAndSize & 255);
                        return c2;
                    }
                }
            }
        }
        return (char) 0;
    }

    public static void setShouldEnforceLimitOnLegacyMethods(boolean z) {
        shouldEnforceLimitOnLegacyMethods.set(z);
    }

    private void skipLineTerminator(Charset charset) {
        if (readCharacterIfInList(charset, CR_AND_LF) == '\r') {
            readCharacterIfInList(charset, LF);
        }
    }

    public int bytesLeft() {
        return Math.max(this.limit - this.position, 0);
    }

    public int capacity() {
        return this.data.length;
    }

    public void ensureCapacity(int i2) {
        if (i2 > capacity()) {
            this.data = Arrays.copyOf(this.data, i2);
        }
    }

    public byte[] getData() {
        return this.data;
    }

    public int getPosition() {
        return this.position;
    }

    public int limit() {
        return this.limit;
    }

    @Deprecated
    public char peekChar(Charset charset) {
        int iPeekUnsignedByte;
        an.q(SUPPORTED_CHARSETS_FOR_READLINE.contains(charset), "Unsupported charset: %s", charset);
        if (bytesLeft() != 0) {
            if (charset.equals(StandardCharsets.US_ASCII)) {
                iPeekUnsignedByte = peekUnsignedByte();
            } else if (charset.equals(StandardCharsets.UTF_8)) {
                if ((this.data[this.position] & 128) == 0) {
                    iPeekUnsignedByte = peekUnsignedByte();
                }
            } else if (bytesLeft() >= 2) {
                return peekChar(charset.equals(StandardCharsets.UTF_16LE) ? ByteOrder.LITTLE_ENDIAN : ByteOrder.BIG_ENDIAN, 0);
            }
            return (char) iPeekUnsignedByte;
        }
        return (char) 0;
    }

    public int peekCodePoint(Charset charset) {
        return peekCodePointAndSize(charset) != 0 ? j.h(r0 >>> 8) : INVALID_CODE_POINT;
    }

    public int peekInt() {
        if (bytesLeft() >= 4) {
            this.position -= 4;
            return readInt();
        }
        throw new IndexOutOfBoundsException("position=" + this.position + ", limit=" + this.limit);
    }

    public int peekUnsignedByte() {
        maybeAssertAtLeastBytesLeftForLegacyMethod(1);
        return this.data[this.position] & 255;
    }

    public int peekUnsignedInt24() {
        if (bytesLeft() >= 3) {
            this.position -= 3;
            return readUnsignedInt24();
        }
        throw new IndexOutOfBoundsException("position=" + this.position + ", limit=" + this.limit);
    }

    public void readBytes(ByteBuffer byteBuffer, int i2) {
        maybeAssertAtLeastBytesLeftForLegacyMethod(i2);
        byteBuffer.put(this.data, this.position, i2);
        this.position += i2;
    }

    public String readDelimiterTerminatedString(char c2) {
        if (bytesLeft() == 0) {
            return null;
        }
        int i2 = this.position;
        while (i2 < this.limit && this.data[i2] != c2) {
            i2++;
        }
        byte[] bArr = this.data;
        int i3 = this.position;
        String strFromUtf8Bytes = Util.fromUtf8Bytes(bArr, i3, i2 - i3);
        this.position = i2;
        if (i2 < this.limit) {
            this.position = i2 + 1;
        }
        return strFromUtf8Bytes;
    }

    public double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    public float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    public int readInt() {
        maybeAssertAtLeastBytesLeftForLegacyMethod(4);
        byte[] bArr = this.data;
        int i2 = this.position;
        int i3 = i2 + 1;
        this.position = i3;
        int i4 = bArr[i2] & 255;
        int i5 = i2 + 2;
        this.position = i5;
        int i6 = bArr[i3] & 255;
        int i7 = i2 + 3;
        this.position = i7;
        int i8 = bArr[i5] & 255;
        this.position = i2 + 4;
        return (bArr[i7] & 255) | (i4 << 24) | (i6 << 16) | (i8 << 8);
    }

    public int readInt24() {
        maybeAssertAtLeastBytesLeftForLegacyMethod(3);
        byte[] bArr = this.data;
        int i2 = this.position;
        int i3 = i2 + 1;
        this.position = i3;
        int i4 = bArr[i2] & 255;
        int i5 = i2 + 2;
        this.position = i5;
        int i6 = bArr[i3] & 255;
        this.position = i2 + 3;
        return (bArr[i5] & 255) | ((i4 << 24) >> 8) | (i6 << 8);
    }

    public String readLine(Charset charset) {
        an.q(SUPPORTED_CHARSETS_FOR_READLINE.contains(charset), "Unsupported charset: %s", charset);
        if (bytesLeft() == 0) {
            return null;
        }
        if (!charset.equals(StandardCharsets.US_ASCII)) {
            readUtfCharsetFromBom();
        }
        String string = readString(findNextLineTerminator(charset) - this.position, charset);
        if (this.position == this.limit) {
            return string;
        }
        skipLineTerminator(charset);
        return string;
    }

    public int readLittleEndianInt() {
        maybeAssertAtLeastBytesLeftForLegacyMethod(4);
        byte[] bArr = this.data;
        int i2 = this.position;
        int i3 = i2 + 1;
        this.position = i3;
        int i4 = bArr[i2] & 255;
        int i5 = i2 + 2;
        this.position = i5;
        int i6 = bArr[i3] & 255;
        int i7 = i2 + 3;
        this.position = i7;
        int i8 = bArr[i5] & 255;
        this.position = i2 + 4;
        return ((bArr[i7] & 255) << 24) | (i6 << 8) | i4 | (i8 << 16);
    }

    public int readLittleEndianInt24() {
        maybeAssertAtLeastBytesLeftForLegacyMethod(3);
        byte[] bArr = this.data;
        int i2 = this.position;
        int i3 = i2 + 1;
        this.position = i3;
        int i4 = bArr[i2] & 255;
        int i5 = i2 + 2;
        this.position = i5;
        int i6 = bArr[i3] & 255;
        this.position = i2 + 3;
        return ((bArr[i5] & 255) << 16) | (i6 << 8) | i4;
    }

    public long readLittleEndianLong() {
        maybeAssertAtLeastBytesLeftForLegacyMethod(8);
        byte[] bArr = this.data;
        int i2 = this.position;
        int i3 = i2 + 1;
        this.position = i3;
        long j2 = bArr[i2];
        int i4 = i2 + 2;
        this.position = i4;
        long j3 = bArr[i3];
        int i5 = i2 + 3;
        this.position = i5;
        long j4 = bArr[i4];
        int i6 = i2 + 4;
        this.position = i6;
        long j5 = bArr[i5];
        int i7 = i2 + 5;
        this.position = i7;
        long j6 = bArr[i6];
        int i8 = i2 + 6;
        this.position = i8;
        long j7 = bArr[i7];
        this.position = i2 + 7;
        long j8 = bArr[i8];
        this.position = i2 + 8;
        return ((j8 & 255) << 48) | (j2 & 255) | ((j3 & 255) << 8) | ((j4 & 255) << 16) | ((j5 & 255) << 24) | ((j6 & 255) << 32) | ((j7 & 255) << 40) | ((bArr[r4] & 255) << 56);
    }

    public short readLittleEndianShort() {
        maybeAssertAtLeastBytesLeftForLegacyMethod(2);
        byte[] bArr = this.data;
        int i2 = this.position;
        int i3 = i2 + 1;
        this.position = i3;
        int i4 = bArr[i2] & 255;
        this.position = i2 + 2;
        return (short) (((bArr[i3] & 255) << 8) | i4);
    }

    public long readLittleEndianUnsignedInt() {
        maybeAssertAtLeastBytesLeftForLegacyMethod(4);
        byte[] bArr = this.data;
        int i2 = this.position;
        int i3 = i2 + 1;
        this.position = i3;
        long j2 = bArr[i2];
        int i4 = i2 + 2;
        this.position = i4;
        long j3 = bArr[i3];
        this.position = i2 + 3;
        long j4 = bArr[i4];
        this.position = i2 + 4;
        return ((bArr[r3] & 255) << 24) | (255 & j2) | ((j3 & 255) << 8) | ((j4 & 255) << 16);
    }

    public int readLittleEndianUnsignedInt24() {
        maybeAssertAtLeastBytesLeftForLegacyMethod(3);
        byte[] bArr = this.data;
        int i2 = this.position;
        int i3 = i2 + 1;
        this.position = i3;
        int i4 = bArr[i2] & 255;
        int i5 = i2 + 2;
        this.position = i5;
        int i6 = bArr[i3] & 255;
        this.position = i2 + 3;
        return ((bArr[i5] & 255) << 16) | (i6 << 8) | i4;
    }

    public int readLittleEndianUnsignedIntToInt() {
        int littleEndianInt = readLittleEndianInt();
        if (littleEndianInt >= 0) {
            return littleEndianInt;
        }
        throw new IllegalStateException(a.a(littleEndianInt, "Top bit not zero: "));
    }

    public int readLittleEndianUnsignedShort() {
        maybeAssertAtLeastBytesLeftForLegacyMethod(2);
        byte[] bArr = this.data;
        int i2 = this.position;
        int i3 = i2 + 1;
        this.position = i3;
        int i4 = bArr[i2] & 255;
        this.position = i2 + 2;
        return ((bArr[i3] & 255) << 8) | i4;
    }

    public long readLong() {
        maybeAssertAtLeastBytesLeftForLegacyMethod(8);
        byte[] bArr = this.data;
        int i2 = this.position;
        int i3 = i2 + 1;
        this.position = i3;
        long j2 = bArr[i2];
        int i4 = i2 + 2;
        this.position = i4;
        long j3 = bArr[i3];
        int i5 = i2 + 3;
        this.position = i5;
        long j4 = bArr[i4];
        int i6 = i2 + 4;
        this.position = i6;
        long j5 = bArr[i5];
        int i7 = i2 + 5;
        this.position = i7;
        long j6 = bArr[i6];
        int i8 = i2 + 6;
        this.position = i8;
        long j7 = bArr[i7];
        this.position = i2 + 7;
        long j8 = bArr[i8];
        this.position = i2 + 8;
        return ((j8 & 255) << 8) | ((j2 & 255) << 56) | ((j3 & 255) << 48) | ((j4 & 255) << 40) | ((j5 & 255) << 32) | ((j6 & 255) << 24) | ((j7 & 255) << 16) | (bArr[r4] & 255);
    }

    public String readNullTerminatedString(int i2) {
        maybeAssertAtLeastBytesLeftForLegacyMethod(i2);
        if (i2 == 0) {
            return "";
        }
        int i3 = this.position;
        int i4 = (i3 + i2) - 1;
        String strFromUtf8Bytes = Util.fromUtf8Bytes(this.data, i3, (i4 >= this.limit || this.data[i4] != 0) ? i2 : i2 - 1);
        this.position += i2;
        return strFromUtf8Bytes;
    }

    public short readShort() {
        maybeAssertAtLeastBytesLeftForLegacyMethod(2);
        byte[] bArr = this.data;
        int i2 = this.position;
        int i3 = i2 + 1;
        this.position = i3;
        int i4 = bArr[i2] & 255;
        this.position = i2 + 2;
        return (short) ((bArr[i3] & 255) | (i4 << 8));
    }

    public String readString(int i2, Charset charset) {
        maybeAssertAtLeastBytesLeftForLegacyMethod(i2);
        byte[] bArr = this.data;
        int i3 = this.position;
        String str = new String(bArr, i3, i2, charset);
        this.position = i3 + i2;
        return str;
    }

    public int readSynchSafeInt() {
        return readUnsignedByte() | (readUnsignedByte() << 21) | (readUnsignedByte() << 14) | (readUnsignedByte() << 7);
    }

    public int readUnsignedByte() {
        maybeAssertAtLeastBytesLeftForLegacyMethod(1);
        byte[] bArr = this.data;
        int i2 = this.position;
        this.position = i2 + 1;
        return bArr[i2] & 255;
    }

    public int readUnsignedFixedPoint1616() {
        maybeAssertAtLeastBytesLeftForLegacyMethod(4);
        byte[] bArr = this.data;
        int i2 = this.position;
        int i3 = i2 + 1;
        this.position = i3;
        int i4 = bArr[i2] & 255;
        this.position = i2 + 2;
        int i5 = bArr[i3] & 255;
        this.position = i2 + 4;
        return (i4 << 8) | i5;
    }

    public long readUnsignedInt() {
        maybeAssertAtLeastBytesLeftForLegacyMethod(4);
        byte[] bArr = this.data;
        int i2 = this.position;
        int i3 = i2 + 1;
        this.position = i3;
        long j2 = bArr[i2];
        int i4 = i2 + 2;
        this.position = i4;
        long j3 = bArr[i3];
        this.position = i2 + 3;
        long j4 = bArr[i4];
        this.position = i2 + 4;
        return (bArr[r3] & 255) | ((j2 & 255) << 24) | ((j3 & 255) << 16) | ((j4 & 255) << 8);
    }

    public int readUnsignedInt24() {
        maybeAssertAtLeastBytesLeftForLegacyMethod(3);
        byte[] bArr = this.data;
        int i2 = this.position;
        int i3 = i2 + 1;
        this.position = i3;
        int i4 = bArr[i2] & 255;
        int i5 = i2 + 2;
        this.position = i5;
        int i6 = bArr[i3] & 255;
        this.position = i2 + 3;
        return (bArr[i5] & 255) | (i4 << 16) | (i6 << 8);
    }

    public int readUnsignedIntToInt() {
        int i2 = readInt();
        if (i2 >= 0) {
            return i2;
        }
        throw new IllegalStateException(a.a(i2, "Top bit not zero: "));
    }

    public int readUnsignedLeb128ToInt() {
        return j.h(readUnsignedLeb128ToLong());
    }

    public long readUnsignedLeb128ToLong() {
        long j2 = 0;
        for (int i2 = 0; i2 < 9; i2++) {
            if (this.position == this.limit) {
                throw new IllegalStateException("Attempting to read a byte over the limit.");
            }
            long unsignedByte = readUnsignedByte();
            j2 |= (127 & unsignedByte) << (i2 * 7);
            if ((unsignedByte & 128) == 0) {
                return j2;
            }
        }
        return j2;
    }

    public long readUnsignedLongToLong() {
        long j2 = readLong();
        if (j2 >= 0) {
            return j2;
        }
        throw new IllegalStateException("Top bit not zero: " + j2);
    }

    public int readUnsignedShort() {
        maybeAssertAtLeastBytesLeftForLegacyMethod(2);
        byte[] bArr = this.data;
        int i2 = this.position;
        int i3 = i2 + 1;
        this.position = i3;
        int i4 = bArr[i2] & 255;
        this.position = i2 + 2;
        return (bArr[i3] & 255) | (i4 << 8);
    }

    public long readUtf8EncodedLong() {
        int i2;
        maybeAssertAtLeastBytesLeftForLegacyMethod(1);
        long j2 = this.data[this.position];
        int i3 = 7;
        while (true) {
            i2 = 0;
            if (i3 < 0) {
                break;
            }
            if (((1 << i3) & j2) != 0) {
                i3--;
            } else if (i3 < 6) {
                j2 &= r7 - 1;
                i2 = 7 - i3;
            } else if (i3 == 7) {
                i2 = 1;
            }
        }
        if (i2 == 0) {
            throw new NumberFormatException("Invalid UTF-8 sequence first byte: " + j2);
        }
        maybeAssertAtLeastBytesLeftForLegacyMethod(i2);
        for (int i4 = 1; i4 < i2; i4++) {
            if ((this.data[this.position + i4] & 192) != 128) {
                throw new NumberFormatException("Invalid UTF-8 sequence continuation byte: " + j2);
            }
            j2 = (j2 << 6) | (r3 & 63);
        }
        this.position += i2;
        return j2;
    }

    public Charset readUtfCharsetFromBom() {
        if (bytesLeft() >= 3) {
            byte[] bArr = this.data;
            int i2 = this.position;
            if (bArr[i2] == -17 && bArr[i2 + 1] == -69 && bArr[i2 + 2] == -65) {
                this.position = i2 + 3;
                return StandardCharsets.UTF_8;
            }
        }
        if (bytesLeft() < 2) {
            return null;
        }
        byte[] bArr2 = this.data;
        int i3 = this.position;
        byte b2 = bArr2[i3];
        if (b2 == -2) {
            if (bArr2[i3 + 1] != -1) {
                return null;
            }
            this.position = i3 + 2;
            return StandardCharsets.UTF_16BE;
        }
        if (b2 != -1 || bArr2[i3 + 1] != -2) {
            return null;
        }
        this.position = i3 + 2;
        return StandardCharsets.UTF_16LE;
    }

    public void reset(int i2) {
        reset(capacity() < i2 ? new byte[i2] : this.data, i2);
    }

    public void setLimit(int i2) {
        boolean z = false;
        if (i2 >= 0 && i2 <= this.data.length) {
            z = true;
        }
        an.l(z);
        this.limit = i2;
    }

    public void setPosition(int i2) {
        boolean z = false;
        if (i2 >= 0 && i2 <= this.limit) {
            z = true;
        }
        an.l(z);
        this.position = i2;
    }

    public void skipBytes(int i2) {
        setPosition(this.position + i2);
    }

    public void skipLeb128() {
        while ((readUnsignedByte() & 128) != 0) {
        }
    }

    public ParsableByteArray() {
        this.data = Util.EMPTY_BYTE_ARRAY;
    }

    public ParsableByteArray(byte[] bArr, int i2) {
        this.data = bArr;
        this.limit = i2;
    }

    public ParsableByteArray(byte[] bArr) {
        this.data = bArr;
        this.limit = bArr.length;
    }

    public void reset(byte[] bArr, int i2) {
        this.data = bArr;
        this.limit = i2;
        this.position = 0;
    }

    public void readBytes(ParsableBitArray parsableBitArray, int i2) {
        readBytes(parsableBitArray.data, 0, i2);
        parsableBitArray.setPosition(0);
    }

    public String readString(int i2) {
        return readString(i2, StandardCharsets.UTF_8);
    }

    public void reset(byte[] bArr) {
        reset(bArr, bArr.length);
    }

    public void readBytes(byte[] bArr, int i2, int i3) {
        maybeAssertAtLeastBytesLeftForLegacyMethod(i3);
        System.arraycopy(this.data, this.position, bArr, i2, i3);
        this.position += i3;
    }

    public String readNullTerminatedString() {
        return readDelimiterTerminatedString((char) 0);
    }

    public String readLine() {
        return readLine(StandardCharsets.UTF_8);
    }

    private char peekChar(ByteOrder byteOrder, int i2) {
        maybeAssertAtLeastBytesLeftForLegacyMethod(2);
        ByteOrder byteOrder2 = ByteOrder.BIG_ENDIAN;
        byte[] bArr = this.data;
        if (byteOrder == byteOrder2) {
            int i3 = this.position + i2;
            return j.q(bArr[i3], bArr[i3 + 1]);
        }
        int i4 = this.position + i2;
        return j.q(bArr[i4 + 1], bArr[i4]);
    }

    public char peekChar() {
        return peekChar(ByteOrder.BIG_ENDIAN, 0);
    }
}
