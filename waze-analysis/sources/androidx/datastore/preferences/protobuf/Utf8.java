package androidx.datastore.preferences.protobuf;

import androidx.compose.foundation.style.StylePropertiesKt;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class Utf8 {
    private static final long ASCII_MASK_LONG = -9187201950435737472L;
    static final int COMPLETE = 0;
    static final int MALFORMED = -1;
    static final int MAX_BYTES_PER_CHAR = 3;
    private static final int UNSAFE_COUNT_ASCII_THRESHOLD = 16;
    private static final Processor processor;

    /* compiled from: WazeSource */
    class DecodeUtil {
        private DecodeUtil() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void handleFourBytes(byte b2, byte b3, byte b4, byte b5, char[] cArr, int i2) throws InvalidProtocolBufferException {
            if (isNotTrailingByte(b3) || (((b2 << StylePropertiesKt.RotationZId) + (b3 + 112)) >> 30) != 0 || isNotTrailingByte(b4) || isNotTrailingByte(b5)) {
                throw InvalidProtocolBufferException.invalidUtf8();
            }
            int iTrailingByteValue = ((b2 & 7) << 18) | (trailingByteValue(b3) << 12) | (trailingByteValue(b4) << 6) | trailingByteValue(b5);
            cArr[i2] = highSurrogate(iTrailingByteValue);
            cArr[i2 + 1] = lowSurrogate(iTrailingByteValue);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void handleOneByte(byte b2, char[] cArr, int i2) {
            cArr[i2] = (char) b2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0013  */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0016 A[PHI: r2
  0x0016: PHI (r2v3 byte) = (r2v2 byte), (r2v9 byte) binds: [B:9:0x0011, B:11:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:14:0x001c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static void handleThreeBytes(byte r2, byte r3, byte r4, char[] r5, int r6) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException {
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
                androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r2 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.invalidUtf8()
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.Utf8.DecodeUtil.handleThreeBytes(byte, byte, byte, char[], int):void");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void handleTwoBytes(byte b2, byte b3, char[] cArr, int i2) throws InvalidProtocolBufferException {
            if (b2 < -62 || isNotTrailingByte(b3)) {
                throw InvalidProtocolBufferException.invalidUtf8();
            }
            cArr[i2] = (char) (((b2 & StylePropertiesKt.ClipId) << 6) | trailingByteValue(b3));
        }

        private static char highSurrogate(int i2) {
            return (char) ((i2 >>> 10) + 55232);
        }

        private static boolean isNotTrailingByte(byte b2) {
            return b2 > -65;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean isOneByte(byte b2) {
            return b2 >= 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean isThreeBytes(byte b2) {
            return b2 < -16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean isTwoBytes(byte b2) {
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

    static {
        processor = (!UnsafeProcessor.isAvailable() || Android.isOnAndroidDevice()) ? new SafeProcessor() : new UnsafeProcessor();
    }

    private Utf8() {
    }

    static String decodeUtf8(ByteBuffer byteBuffer, int i2, int i3) {
        return processor.decodeUtf8(byteBuffer, i2, i3);
    }

    static int encode(String str, byte[] bArr, int i2, int i3) {
        return processor.encodeUtf8(str, bArr, i2, i3);
    }

    static void encodeUtf8(String str, ByteBuffer byteBuffer) {
        processor.encodeUtf8(str, byteBuffer);
    }

    static int encodedLength(String str) {
        int length = str.length();
        int i2 = 0;
        while (i2 < length && str.charAt(i2) < 128) {
            i2++;
        }
        int iEncodedLengthGeneral = length;
        while (true) {
            if (i2 < length) {
                char cCharAt = str.charAt(i2);
                if (cCharAt >= 2048) {
                    iEncodedLengthGeneral += encodedLengthGeneral(str, i2);
                    break;
                }
                iEncodedLengthGeneral += (127 - cCharAt) >>> 31;
                i2++;
            } else {
                break;
            }
        }
        if (iEncodedLengthGeneral >= length) {
            return iEncodedLengthGeneral;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (iEncodedLengthGeneral + 4294967296L));
    }

    private static int encodedLengthGeneral(String str, int i2) {
        int length = str.length();
        int i3 = 0;
        while (i2 < length) {
            char cCharAt = str.charAt(i2);
            if (cCharAt < 2048) {
                i3 += (127 - cCharAt) >>> 31;
            } else {
                i3 += 2;
                if (cCharAt >= 55296 && cCharAt <= 57343) {
                    if (Character.codePointAt(str, i2) < 65536) {
                        throw new UnpairedSurrogateException(i2, length);
                    }
                    i2++;
                }
            }
            i2++;
        }
        return i3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int estimateConsecutiveAscii(ByteBuffer byteBuffer, int i2, int i3) {
        int i4 = i2;
        while (i4 < i3 - 7 && (byteBuffer.getLong(i4) & (-9187201950435737472L)) == 0) {
            i4 += 8;
        }
        return i4 - i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int incompleteStateFor(ByteBuffer byteBuffer, int i2, int i3, int i4) {
        if (i4 == 0) {
            return incompleteStateFor(i2);
        }
        if (i4 == 1) {
            return incompleteStateFor(i2, byteBuffer.get(i3));
        }
        if (i4 == 2) {
            return incompleteStateFor(i2, byteBuffer.get(i3), byteBuffer.get(i3 + 1));
        }
        throw new AssertionError();
    }

    static boolean isValidUtf8(ByteBuffer byteBuffer) {
        return processor.isValidUtf8(byteBuffer, byteBuffer.position(), byteBuffer.remaining());
    }

    static int partialIsValidUtf8(int i2, ByteBuffer byteBuffer, int i3, int i4) {
        return processor.partialIsValidUtf8(i2, byteBuffer, i3, i4);
    }

    static String decodeUtf8(byte[] bArr, int i2, int i3) {
        return processor.decodeUtf8(bArr, i2, i3);
    }

    static int partialIsValidUtf8(int i2, byte[] bArr, int i3, int i4) {
        return processor.partialIsValidUtf8(i2, bArr, i3, i4);
    }

    /* compiled from: WazeSource */
    abstract class Processor {
        Processor() {
        }

        private static int partialIsValidUtf8(ByteBuffer byteBuffer, int i2, int i3) {
            int iEstimateConsecutiveAscii = i2 + Utf8.estimateConsecutiveAscii(byteBuffer, i2, i3);
            while (iEstimateConsecutiveAscii < i3) {
                int i4 = iEstimateConsecutiveAscii + 1;
                byte b2 = byteBuffer.get(iEstimateConsecutiveAscii);
                if (b2 >= 0) {
                    iEstimateConsecutiveAscii = i4;
                } else if (b2 < -32) {
                    if (i4 >= i3) {
                        return b2;
                    }
                    if (b2 < -62 || byteBuffer.get(i4) > -65) {
                        return -1;
                    }
                    iEstimateConsecutiveAscii += 2;
                } else {
                    if (b2 >= -16) {
                        if (i4 >= i3 - 2) {
                            return Utf8.incompleteStateFor(byteBuffer, b2, i4, i3 - i4);
                        }
                        int i5 = iEstimateConsecutiveAscii + 2;
                        byte b3 = byteBuffer.get(i4);
                        if (b3 <= -65 && (((b2 << StylePropertiesKt.RotationZId) + (b3 + 112)) >> 30) == 0) {
                            int i6 = iEstimateConsecutiveAscii + 3;
                            if (byteBuffer.get(i5) <= -65) {
                                iEstimateConsecutiveAscii += 4;
                                if (byteBuffer.get(i6) <= -65) {
                                }
                            }
                        }
                        return -1;
                    }
                    if (i4 >= i3 - 1) {
                        return Utf8.incompleteStateFor(byteBuffer, b2, i4, i3 - i4);
                    }
                    int i7 = iEstimateConsecutiveAscii + 2;
                    byte b4 = byteBuffer.get(i4);
                    if (b4 > -65 || ((b2 == -32 && b4 < -96) || ((b2 == -19 && b4 >= -96) || byteBuffer.get(i7) > -65))) {
                        return -1;
                    }
                    iEstimateConsecutiveAscii += 3;
                }
            }
            return 0;
        }

        final String decodeUtf8(ByteBuffer byteBuffer, int i2, int i3) {
            if (byteBuffer.hasArray()) {
                return decodeUtf8(byteBuffer.array(), byteBuffer.arrayOffset() + i2, i3);
            }
            return byteBuffer.isDirect() ? decodeUtf8Direct(byteBuffer, i2, i3) : decodeUtf8Default(byteBuffer, i2, i3);
        }

        abstract String decodeUtf8(byte[] bArr, int i2, int i3);

        final String decodeUtf8Default(ByteBuffer byteBuffer, int i2, int i3) throws InvalidProtocolBufferException {
            int i4;
            if ((((byteBuffer.limit() - i2) - i3) | i2 | i3) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i2), Integer.valueOf(i3)));
            }
            int i5 = i2 + i3;
            char[] cArr = new char[i3];
            int i6 = 0;
            while (i2 < i5) {
                byte b2 = byteBuffer.get(i2);
                if (!DecodeUtil.isOneByte(b2)) {
                    break;
                }
                i2++;
                DecodeUtil.handleOneByte(b2, cArr, i6);
                i6++;
            }
            int i7 = i6;
            while (i2 < i5) {
                int i8 = i2 + 1;
                byte b3 = byteBuffer.get(i2);
                if (DecodeUtil.isOneByte(b3)) {
                    DecodeUtil.handleOneByte(b3, cArr, i7);
                    i7++;
                    i2 = i8;
                    while (i2 < i5) {
                        byte b4 = byteBuffer.get(i2);
                        if (DecodeUtil.isOneByte(b4)) {
                            i2++;
                            DecodeUtil.handleOneByte(b4, cArr, i7);
                            i7++;
                        }
                    }
                } else {
                    if (DecodeUtil.isTwoBytes(b3)) {
                        if (i8 >= i5) {
                            throw InvalidProtocolBufferException.invalidUtf8();
                        }
                        i4 = i7 + 1;
                        i2 += 2;
                        DecodeUtil.handleTwoBytes(b3, byteBuffer.get(i8), cArr, i7);
                    } else if (DecodeUtil.isThreeBytes(b3)) {
                        if (i8 >= i5 - 1) {
                            throw InvalidProtocolBufferException.invalidUtf8();
                        }
                        i4 = i7 + 1;
                        int i9 = i2 + 2;
                        i2 += 3;
                        DecodeUtil.handleThreeBytes(b3, byteBuffer.get(i8), byteBuffer.get(i9), cArr, i7);
                    } else {
                        if (i8 >= i5 - 2) {
                            throw InvalidProtocolBufferException.invalidUtf8();
                        }
                        byte b5 = byteBuffer.get(i8);
                        int i10 = i2 + 3;
                        byte b6 = byteBuffer.get(i2 + 2);
                        i2 += 4;
                        DecodeUtil.handleFourBytes(b3, b5, b6, byteBuffer.get(i10), cArr, i7);
                        i7 += 2;
                    }
                    i7 = i4;
                }
            }
            return new String(cArr, 0, i7);
        }

        abstract String decodeUtf8Direct(ByteBuffer byteBuffer, int i2, int i3);

        abstract int encodeUtf8(String str, byte[] bArr, int i2, int i3);

        final void encodeUtf8(String str, ByteBuffer byteBuffer) {
            if (byteBuffer.hasArray()) {
                int iArrayOffset = byteBuffer.arrayOffset();
                Java8Compatibility.position(byteBuffer, Utf8.encode(str, byteBuffer.array(), byteBuffer.position() + iArrayOffset, byteBuffer.remaining()) - iArrayOffset);
            } else if (byteBuffer.isDirect()) {
                encodeUtf8Direct(str, byteBuffer);
            } else {
                encodeUtf8Default(str, byteBuffer);
            }
        }

        final void encodeUtf8Default(String str, ByteBuffer byteBuffer) {
            int length = str.length();
            int iPosition = byteBuffer.position();
            int i2 = 0;
            while (i2 < length) {
                try {
                    char cCharAt = str.charAt(i2);
                    if (cCharAt >= 128) {
                        break;
                    }
                    byteBuffer.put(iPosition + i2, (byte) cCharAt);
                    i2++;
                } catch (IndexOutOfBoundsException unused) {
                    throw new ArrayIndexOutOfBoundsException("Not enough space in output buffer to encode UTF-8 string");
                }
            }
            if (i2 == length) {
                Java8Compatibility.position(byteBuffer, iPosition + i2);
                return;
            }
            int i3 = iPosition + i2;
            while (i2 < length) {
                char cCharAt2 = str.charAt(i2);
                if (cCharAt2 < 128) {
                    byteBuffer.put(i3, (byte) cCharAt2);
                } else if (cCharAt2 < 2048) {
                    int i4 = i3 + 1;
                    byteBuffer.put(i3, (byte) ((cCharAt2 >>> 6) | 192));
                    byteBuffer.put(i4, (byte) ((cCharAt2 & '?') | 128));
                    i3 = i4;
                } else {
                    if (cCharAt2 >= 55296 && cCharAt2 <= 57343) {
                        int i5 = i2 + 1;
                        if (i5 != length) {
                            char cCharAt3 = str.charAt(i5);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                byteBuffer.put(i3, (byte) ((codePoint >>> 18) | 240));
                                int i6 = i3 + 2;
                                byteBuffer.put(i3 + 1, (byte) (((codePoint >>> 12) & 63) | 128));
                                i3 += 3;
                                byteBuffer.put(i6, (byte) (((codePoint >>> 6) & 63) | 128));
                                byteBuffer.put(i3, (byte) ((codePoint & 63) | 128));
                                i2 = i5;
                            } else {
                                i2 = i5;
                            }
                        }
                        throw new UnpairedSurrogateException(i2, length);
                    }
                    int i7 = i3 + 1;
                    byteBuffer.put(i3, (byte) ((cCharAt2 >>> '\f') | 224));
                    i3 = i7 + 1;
                    byteBuffer.put(i7, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                    byteBuffer.put(i3, (byte) ((cCharAt2 & '?') | 128));
                }
                i3++;
                i2++;
            }
            Java8Compatibility.position(byteBuffer, i3);
        }

        abstract void encodeUtf8Direct(String str, ByteBuffer byteBuffer);

        final boolean isValidUtf8(ByteBuffer byteBuffer, int i2, int i3) {
            return partialIsValidUtf8(0, byteBuffer, i2, i3) == 0;
        }

        abstract int partialIsValidUtf8(int i2, byte[] bArr, int i3, int i4);

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0017, code lost:
        
            if (r8.get(r9) <= (-65)) goto L11;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x004c, code lost:
        
            if (r8.get(r9) <= (-65)) goto L11;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x008e, code lost:
        
            if (r8.get(r7) <= (-65)) goto L55;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        final int partialIsValidUtf8Default(int r7, java.nio.ByteBuffer r8, int r9, int r10) {
            /*
                r6 = this;
                if (r7 == 0) goto L92
                if (r9 < r10) goto L5
                return r7
            L5:
                byte r6 = (byte) r7
                r0 = -32
                r1 = -1
                r2 = -65
                if (r6 >= r0) goto L1d
                r7 = -62
                if (r6 < r7) goto L1c
                int r6 = r9 + 1
                byte r7 = r8.get(r9)
                if (r7 > r2) goto L1c
            L19:
                r9 = r6
                goto L92
            L1c:
                return r1
            L1d:
                int r3 = r7 >> 8
                int r3 = ~r3
                r4 = -16
                if (r6 >= r4) goto L50
                byte r7 = (byte) r3
                if (r7 != 0) goto L38
                int r7 = r9 + 1
                byte r9 = r8.get(r9)
                if (r7 >= r10) goto L33
                r5 = r9
                r9 = r7
                r7 = r5
                goto L38
            L33:
                int r6 = androidx.datastore.preferences.protobuf.Utf8.access$000(r6, r9)
                return r6
            L38:
                if (r7 > r2) goto L4f
                r3 = -96
                if (r6 != r0) goto L40
                if (r7 < r3) goto L4f
            L40:
                r0 = -19
                if (r6 != r0) goto L46
                if (r7 >= r3) goto L4f
            L46:
                int r6 = r9 + 1
                byte r7 = r8.get(r9)
                if (r7 > r2) goto L4f
                goto L19
            L4f:
                return r1
            L50:
                byte r0 = (byte) r3
                if (r0 != 0) goto L62
                int r7 = r9 + 1
                byte r0 = r8.get(r9)
                if (r7 >= r10) goto L5d
                r9 = 0
                goto L68
            L5d:
                int r6 = androidx.datastore.preferences.protobuf.Utf8.access$000(r6, r0)
                return r6
            L62:
                int r7 = r7 >> 16
                byte r7 = (byte) r7
                r5 = r9
                r9 = r7
                r7 = r5
            L68:
                if (r9 != 0) goto L7b
                int r9 = r7 + 1
                byte r7 = r8.get(r7)
                if (r9 >= r10) goto L76
                r5 = r9
                r9 = r7
                r7 = r5
                goto L7b
            L76:
                int r6 = androidx.datastore.preferences.protobuf.Utf8.access$100(r6, r0, r7)
                return r6
            L7b:
                if (r0 > r2) goto L91
                int r6 = r6 << 28
                int r0 = r0 + 112
                int r6 = r6 + r0
                int r6 = r6 >> 30
                if (r6 != 0) goto L91
                if (r9 > r2) goto L91
                int r9 = r7 + 1
                byte r6 = r8.get(r7)
                if (r6 > r2) goto L91
                goto L92
            L91:
                return r1
            L92:
                int r6 = partialIsValidUtf8(r8, r9, r10)
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.Utf8.Processor.partialIsValidUtf8Default(int, java.nio.ByteBuffer, int, int):int");
        }

        abstract int partialIsValidUtf8Direct(int i2, ByteBuffer byteBuffer, int i3, int i4);

        final boolean isValidUtf8(byte[] bArr, int i2, int i3) {
            return partialIsValidUtf8(0, bArr, i2, i3) == 0;
        }

        final int partialIsValidUtf8(int i2, ByteBuffer byteBuffer, int i3, int i4) {
            if (byteBuffer.hasArray()) {
                int iArrayOffset = byteBuffer.arrayOffset();
                return partialIsValidUtf8(i2, byteBuffer.array(), i3 + iArrayOffset, iArrayOffset + i4);
            }
            if (byteBuffer.isDirect()) {
                return partialIsValidUtf8Direct(i2, byteBuffer, i3, i4);
            }
            return partialIsValidUtf8Default(i2, byteBuffer, i3, i4);
        }
    }

    static boolean isValidUtf8(byte[] bArr) {
        return processor.isValidUtf8(bArr, 0, bArr.length);
    }

    static boolean isValidUtf8(byte[] bArr, int i2, int i3) {
        return processor.isValidUtf8(bArr, i2, i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int incompleteStateFor(int i2, int i3) {
        if (i2 > -12 || i3 > -65) {
            return -1;
        }
        return i2 ^ (i3 << 8);
    }

    /* compiled from: WazeSource */
    final class UnsafeProcessor extends Processor {
        UnsafeProcessor() {
        }

        static boolean isAvailable() {
            return UnsafeUtil.hasUnsafeArrayOperations() && UnsafeUtil.hasUnsafeByteBufferOperations();
        }

        private static int unsafeEstimateConsecutiveAscii(byte[] bArr, long j2, int i2) {
            int i3 = 0;
            if (i2 < 16) {
                return 0;
            }
            int i4 = (int) j2;
            while (i3 < 8 - (i4 & 7)) {
                long j3 = 1 + j2;
                if (UnsafeUtil.getByte(bArr, j2) < 0) {
                    return i3;
                }
                i3++;
                j2 = j3;
            }
            while (true) {
                int i5 = i3 + 8;
                if (i5 > i2 || (UnsafeUtil.getLong((Object) bArr, UnsafeUtil.BYTE_ARRAY_BASE_OFFSET + j2) & (-9187201950435737472L)) != 0) {
                    break;
                }
                j2 += 8;
                i3 = i5;
            }
            while (i3 < i2) {
                long j4 = j2 + 1;
                if (UnsafeUtil.getByte(bArr, j2) < 0) {
                    return i3;
                }
                i3++;
                j2 = j4;
            }
            return i2;
        }

        private static int unsafeIncompleteStateFor(long j2, int i2, int i3) {
            if (i3 == 0) {
                return Utf8.incompleteStateFor(i2);
            }
            if (i3 == 1) {
                return Utf8.incompleteStateFor(i2, UnsafeUtil.getByte(j2));
            }
            if (i3 == 2) {
                return Utf8.incompleteStateFor(i2, UnsafeUtil.getByte(j2), UnsafeUtil.getByte(j2 + 1));
            }
            throw new AssertionError();
        }

        @Override // androidx.datastore.preferences.protobuf.Utf8.Processor
        String decodeUtf8(byte[] bArr, int i2, int i3) throws InvalidProtocolBufferException {
            String str = new String(bArr, i2, i3, Internal.UTF_8);
            if (str.indexOf(65533) >= 0 && !Arrays.equals(str.getBytes(Internal.UTF_8), Arrays.copyOfRange(bArr, i2, i3 + i2))) {
                throw InvalidProtocolBufferException.invalidUtf8();
            }
            return str;
        }

        @Override // androidx.datastore.preferences.protobuf.Utf8.Processor
        String decodeUtf8Direct(ByteBuffer byteBuffer, int i2, int i3) throws InvalidProtocolBufferException {
            long j2;
            if ((((byteBuffer.limit() - i2) - i3) | i2 | i3) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i2), Integer.valueOf(i3)));
            }
            long jAddressOffset = UnsafeUtil.addressOffset(byteBuffer) + i2;
            long j3 = i3;
            char[] cArr = new char[i3];
            int i4 = 0;
            long j4 = jAddressOffset;
            while (true) {
                j2 = jAddressOffset + j3;
                if (j4 >= j2) {
                    break;
                }
                byte b2 = UnsafeUtil.getByte(j4);
                if (!DecodeUtil.isOneByte(b2)) {
                    break;
                }
                j4++;
                DecodeUtil.handleOneByte(b2, cArr, i4);
                i4++;
            }
            while (true) {
                int i5 = i4;
                while (j4 < j2) {
                    long j5 = j4 + 1;
                    byte b3 = UnsafeUtil.getByte(j4);
                    if (DecodeUtil.isOneByte(b3)) {
                        int i6 = i5 + 1;
                        DecodeUtil.handleOneByte(b3, cArr, i5);
                        while (j5 < j2) {
                            byte b4 = UnsafeUtil.getByte(j5);
                            if (!DecodeUtil.isOneByte(b4)) {
                                break;
                            }
                            j5++;
                            DecodeUtil.handleOneByte(b4, cArr, i6);
                            i6++;
                        }
                        i5 = i6;
                        j4 = j5;
                    } else if (DecodeUtil.isTwoBytes(b3)) {
                        if (j5 >= j2) {
                            throw InvalidProtocolBufferException.invalidUtf8();
                        }
                        i4 = i5 + 1;
                        j4 += 2;
                        DecodeUtil.handleTwoBytes(b3, UnsafeUtil.getByte(j5), cArr, i5);
                    } else if (DecodeUtil.isThreeBytes(b3)) {
                        if (j5 >= j2 - 1) {
                            throw InvalidProtocolBufferException.invalidUtf8();
                        }
                        i4 = i5 + 1;
                        long j6 = 2 + j4;
                        j4 += 3;
                        DecodeUtil.handleThreeBytes(b3, UnsafeUtil.getByte(j5), UnsafeUtil.getByte(j6), cArr, i5);
                    } else {
                        if (j5 >= j2 - 2) {
                            throw InvalidProtocolBufferException.invalidUtf8();
                        }
                        long j7 = 2 + j4;
                        long j8 = 3 + j4;
                        j4 += 4;
                        DecodeUtil.handleFourBytes(b3, UnsafeUtil.getByte(j5), UnsafeUtil.getByte(j7), UnsafeUtil.getByte(j8), cArr, i5);
                        i5 += 2;
                    }
                }
                return new String(cArr, 0, i5);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.Utf8.Processor
        int encodeUtf8(String str, byte[] bArr, int i2, int i3) {
            long j2;
            long j3;
            int i4;
            char cCharAt;
            int i5 = i3;
            int length = str.length();
            if (length <= i5) {
                long j4 = i2;
                if (bArr.length - i5 >= i2) {
                    int i6 = 0;
                    long j5 = j4;
                    while (true) {
                        j2 = 1;
                        if (i6 >= length || (cCharAt = str.charAt(i6)) >= 128) {
                            break;
                        }
                        UnsafeUtil.putByte(bArr, j5, (byte) cCharAt);
                        i6++;
                        j5 = 1 + j5;
                    }
                    if (i6 == length) {
                        return (int) j5;
                    }
                    while (i6 < length) {
                        long j6 = i5 + j4;
                        char cCharAt2 = str.charAt(i6);
                        if (cCharAt2 >= 128 || j5 >= j6) {
                            j3 = j2;
                            if (cCharAt2 < 2048 && j5 <= (-2) + j6) {
                                long j7 = j5 + j3;
                                UnsafeUtil.putByte(bArr, j5, (byte) ((cCharAt2 >>> 6) | 960));
                                j5 += 2;
                                UnsafeUtil.putByte(bArr, j7, (byte) ((cCharAt2 & '?') | 128));
                            } else {
                                if ((cCharAt2 >= 55296 && cCharAt2 <= 57343) || j5 > j6 - 3) {
                                    if (j5 > j6 - 4) {
                                        if (cCharAt2 < 55296 || cCharAt2 > 57343 || ((i4 = i6 + 1) != length && Character.isSurrogatePair(cCharAt2, str.charAt(i4)))) {
                                            throw new ArrayIndexOutOfBoundsException("Not enough space in output buffer to encode UTF-8 string");
                                        }
                                        throw new UnpairedSurrogateException(i6, length);
                                    }
                                    int i7 = i6 + 1;
                                    if (i7 != length) {
                                        char cCharAt3 = str.charAt(i7);
                                        if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                            int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                            UnsafeUtil.putByte(bArr, j5, (byte) ((codePoint >>> 18) | 240));
                                            UnsafeUtil.putByte(bArr, j5 + j3, (byte) (((codePoint >>> 12) & 63) | 128));
                                            long j8 = j5 + 3;
                                            UnsafeUtil.putByte(bArr, j5 + 2, (byte) (((codePoint >>> 6) & 63) | 128));
                                            j5 += 4;
                                            UnsafeUtil.putByte(bArr, j8, (byte) ((codePoint & 63) | 128));
                                            i6 = i7;
                                        } else {
                                            i6 = i7;
                                        }
                                    }
                                    throw new UnpairedSurrogateException(i6 - 1, length);
                                }
                                UnsafeUtil.putByte(bArr, j5, (byte) ((cCharAt2 >>> '\f') | 480));
                                long j9 = j5 + 2;
                                UnsafeUtil.putByte(bArr, j5 + j3, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                                j5 += 3;
                                UnsafeUtil.putByte(bArr, j9, (byte) ((cCharAt2 & '?') | 128));
                            }
                        } else {
                            UnsafeUtil.putByte(bArr, j5, (byte) cCharAt2);
                            j3 = j2;
                            j5 += j2;
                        }
                        i6++;
                        i5 = i3;
                        j2 = j3;
                    }
                    return (int) j5;
                }
            }
            throw new ArrayIndexOutOfBoundsException("Not enough space in output buffer to encode UTF-8 string");
        }

        @Override // androidx.datastore.preferences.protobuf.Utf8.Processor
        void encodeUtf8Direct(String str, ByteBuffer byteBuffer) {
            long j2;
            char c2;
            long j3;
            long j4;
            long j5;
            char c3;
            int i2;
            char cCharAt;
            long jAddressOffset = UnsafeUtil.addressOffset(byteBuffer);
            long jPosition = byteBuffer.position() + jAddressOffset;
            long jLimit = byteBuffer.limit() + jAddressOffset;
            int length = str.length();
            if (length > jLimit - jPosition) {
                throw new ArrayIndexOutOfBoundsException("Not enough space in output buffer to encode UTF-8 string");
            }
            int i3 = 0;
            while (true) {
                j2 = 1;
                c2 = 128;
                if (i3 >= length || (cCharAt = str.charAt(i3)) >= 128) {
                    break;
                }
                UnsafeUtil.putByte(jPosition, (byte) cCharAt);
                i3++;
                jPosition = 1 + jPosition;
            }
            if (i3 == length) {
                Java8Compatibility.position(byteBuffer, (int) (jPosition - jAddressOffset));
                return;
            }
            while (i3 < length) {
                char cCharAt2 = str.charAt(i3);
                if (cCharAt2 < c2 && jPosition < jLimit) {
                    UnsafeUtil.putByte(jPosition, (byte) cCharAt2);
                    j4 = jAddressOffset;
                    j5 = jLimit;
                    j3 = j2;
                    c3 = c2;
                    jPosition += j2;
                } else if (cCharAt2 >= 2048 || jPosition > jLimit - 2) {
                    j3 = j2;
                    if ((cCharAt2 >= 55296 && cCharAt2 <= 57343) || jPosition > jLimit - 3) {
                        j4 = jAddressOffset;
                        if (jPosition > (-4) + jLimit) {
                            if (cCharAt2 >= 55296 && cCharAt2 <= 57343 && ((i2 = i3 + 1) == length || !Character.isSurrogatePair(cCharAt2, str.charAt(i2)))) {
                                throw new UnpairedSurrogateException(i3, length);
                            }
                            throw new ArrayIndexOutOfBoundsException("Not enough space in output buffer to encode UTF-8 string");
                        }
                        int i4 = i3 + 1;
                        if (i4 != length) {
                            char cCharAt3 = str.charAt(i4);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                j5 = jLimit;
                                long j6 = jPosition + 3;
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                UnsafeUtil.putByte(jPosition, (byte) ((codePoint >>> 18) | 240));
                                c3 = 128;
                                UnsafeUtil.putByte(jPosition + j3, (byte) (((codePoint >>> 12) & 63) | 128));
                                UnsafeUtil.putByte(jPosition + 2, (byte) (((codePoint >>> 6) & 63) | 128));
                                jPosition += 4;
                                UnsafeUtil.putByte(j6, (byte) ((codePoint & 63) | 128));
                                i3 = i4;
                            } else {
                                i3 = i4;
                            }
                        }
                        throw new UnpairedSurrogateException(i3 - 1, length);
                    }
                    j4 = jAddressOffset;
                    UnsafeUtil.putByte(jPosition, (byte) ((cCharAt2 >>> '\f') | 480));
                    UnsafeUtil.putByte(jPosition + j3, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                    UnsafeUtil.putByte(jPosition + 2, (byte) ((cCharAt2 & '?') | 128));
                    j5 = jLimit;
                    jPosition += 3;
                    c3 = 128;
                } else {
                    j3 = j2;
                    UnsafeUtil.putByte(jPosition, (byte) ((cCharAt2 >>> 6) | 960));
                    UnsafeUtil.putByte(jPosition + j3, (byte) ((cCharAt2 & '?') | c2));
                    j4 = jAddressOffset;
                    j5 = jLimit;
                    c3 = c2;
                    jPosition += 2;
                }
                i3++;
                c2 = c3;
                j2 = j3;
                jAddressOffset = j4;
                jLimit = j5;
            }
            Java8Compatibility.position(byteBuffer, (int) (jPosition - jAddressOffset));
        }

        /* JADX WARN: Code restructure failed: missing block: B:35:0x005b, code lost:
        
            if (androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r12, r2) <= (-65)) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x009d, code lost:
        
            if (androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r12, r2) > (-65)) goto L58;
         */
        @Override // androidx.datastore.preferences.protobuf.Utf8.Processor
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        int partialIsValidUtf8(int r11, byte[] r12, int r13, int r14) {
            /*
                Method dump skipped, instructions count: 202
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.Utf8.UnsafeProcessor.partialIsValidUtf8(int, byte[], int, int):int");
        }

        /* JADX WARN: Code restructure failed: missing block: B:35:0x0064, code lost:
        
            if (androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r1) <= (-65)) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x00a6, code lost:
        
            if (androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r1) > (-65)) goto L58;
         */
        @Override // androidx.datastore.preferences.protobuf.Utf8.Processor
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        int partialIsValidUtf8Direct(int r10, java.nio.ByteBuffer r11, int r12, int r13) {
            /*
                Method dump skipped, instructions count: 215
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.Utf8.UnsafeProcessor.partialIsValidUtf8Direct(int, java.nio.ByteBuffer, int, int):int");
        }

        private static int unsafeIncompleteStateFor(byte[] bArr, int i2, long j2, int i3) {
            if (i3 == 0) {
                return Utf8.incompleteStateFor(i2);
            }
            if (i3 == 1) {
                return Utf8.incompleteStateFor(i2, UnsafeUtil.getByte(bArr, j2));
            }
            if (i3 == 2) {
                return Utf8.incompleteStateFor(i2, UnsafeUtil.getByte(bArr, j2), UnsafeUtil.getByte(bArr, j2 + 1));
            }
            throw new AssertionError();
        }

        private static int unsafeEstimateConsecutiveAscii(long j2, int i2) {
            if (i2 < 16) {
                return 0;
            }
            int i3 = (int) ((-j2) & 7);
            int i4 = i3;
            while (i4 > 0) {
                long j3 = 1 + j2;
                if (UnsafeUtil.getByte(j2) < 0) {
                    return i3 - i4;
                }
                i4--;
                j2 = j3;
            }
            int i5 = i2 - i3;
            while (i5 >= 8 && (UnsafeUtil.getLong(j2) & (-9187201950435737472L)) == 0) {
                j2 += 8;
                i5 -= 8;
            }
            return i2 - i5;
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0038, code lost:
        
            return -1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x0064, code lost:
        
            return -1;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static int partialIsValidUtf8(long r10, int r12) {
            /*
                int r0 = unsafeEstimateConsecutiveAscii(r10, r12)
                long r1 = (long) r0
                int r12 = r12 - r0
                long r10 = r10 + r1
            L7:
                r0 = 0
                r1 = r0
            L9:
                r2 = 1
                if (r12 <= 0) goto L1a
                long r4 = r10 + r2
                byte r1 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r10)
                if (r1 < 0) goto L19
                int r12 = r12 + (-1)
                r10 = r4
                goto L9
            L19:
                r10 = r4
            L1a:
                if (r12 != 0) goto L1d
                return r0
            L1d:
                int r0 = r12 + (-1)
                r4 = -32
                r5 = -1
                r6 = -65
                if (r1 >= r4) goto L39
                if (r0 != 0) goto L29
                return r1
            L29:
                int r12 = r12 + (-2)
                r0 = -62
                if (r1 < r0) goto L38
                long r2 = r2 + r10
                byte r10 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r10)
                if (r10 > r6) goto L38
                r10 = r2
                goto L7
            L38:
                return r5
            L39:
                r7 = -16
                r8 = 2
                if (r1 >= r7) goto L65
                r7 = 2
                if (r0 >= r7) goto L47
                int r10 = unsafeIncompleteStateFor(r10, r1, r0)
                return r10
            L47:
                long r2 = r2 + r10
                int r12 = r12 + (-3)
                byte r0 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r10)
                if (r0 > r6) goto L64
                r7 = -96
                if (r1 != r4) goto L56
                if (r0 < r7) goto L64
            L56:
                r4 = -19
                if (r1 != r4) goto L5c
                if (r0 >= r7) goto L64
            L5c:
                long r10 = r10 + r8
                byte r0 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r2)
                if (r0 > r6) goto L64
                goto L7
            L64:
                return r5
            L65:
                r4 = 3
                if (r0 >= r4) goto L6d
                int r10 = unsafeIncompleteStateFor(r10, r1, r0)
                return r10
            L6d:
                long r2 = r2 + r10
                int r12 = r12 + (-4)
                byte r0 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r10)
                if (r0 > r6) goto L91
                int r1 = r1 << 28
                int r0 = r0 + 112
                int r1 = r1 + r0
                int r0 = r1 >> 30
                if (r0 != 0) goto L91
                long r8 = r8 + r10
                byte r0 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r2)
                if (r0 > r6) goto L91
                r0 = 3
                long r10 = r10 + r0
                byte r0 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r8)
                if (r0 > r6) goto L91
                goto L7
            L91:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.Utf8.UnsafeProcessor.partialIsValidUtf8(long, int):int");
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0038, code lost:
        
            return -1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x0064, code lost:
        
            return -1;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static int partialIsValidUtf8(byte[] r10, long r11, int r13) {
            /*
                int r0 = unsafeEstimateConsecutiveAscii(r10, r11, r13)
                int r13 = r13 - r0
                long r0 = (long) r0
                long r11 = r11 + r0
            L7:
                r0 = 0
                r1 = r0
            L9:
                r2 = 1
                if (r13 <= 0) goto L1a
                long r4 = r11 + r2
                byte r1 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r10, r11)
                if (r1 < 0) goto L19
                int r13 = r13 + (-1)
                r11 = r4
                goto L9
            L19:
                r11 = r4
            L1a:
                if (r13 != 0) goto L1d
                return r0
            L1d:
                int r0 = r13 + (-1)
                r4 = -32
                r5 = -1
                r6 = -65
                if (r1 >= r4) goto L39
                if (r0 != 0) goto L29
                return r1
            L29:
                int r13 = r13 + (-2)
                r0 = -62
                if (r1 < r0) goto L38
                long r2 = r2 + r11
                byte r11 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r10, r11)
                if (r11 > r6) goto L38
                r11 = r2
                goto L7
            L38:
                return r5
            L39:
                r7 = -16
                r8 = 2
                if (r1 >= r7) goto L65
                r7 = 2
                if (r0 >= r7) goto L47
                int r10 = unsafeIncompleteStateFor(r10, r1, r11, r0)
                return r10
            L47:
                long r2 = r2 + r11
                int r13 = r13 + (-3)
                byte r0 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r10, r11)
                if (r0 > r6) goto L64
                r7 = -96
                if (r1 != r4) goto L56
                if (r0 < r7) goto L64
            L56:
                r4 = -19
                if (r1 != r4) goto L5c
                if (r0 >= r7) goto L64
            L5c:
                long r11 = r11 + r8
                byte r0 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r10, r2)
                if (r0 > r6) goto L64
                goto L7
            L64:
                return r5
            L65:
                r4 = 3
                if (r0 >= r4) goto L6d
                int r10 = unsafeIncompleteStateFor(r10, r1, r11, r0)
                return r10
            L6d:
                long r2 = r2 + r11
                int r13 = r13 + (-4)
                byte r0 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r10, r11)
                if (r0 > r6) goto L91
                int r1 = r1 << 28
                int r0 = r0 + 112
                int r1 = r1 + r0
                int r0 = r1 >> 30
                if (r0 != 0) goto L91
                long r8 = r8 + r11
                byte r0 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r10, r2)
                if (r0 > r6) goto L91
                r0 = 3
                long r11 = r11 + r0
                byte r0 = androidx.datastore.preferences.protobuf.UnsafeUtil.getByte(r10, r8)
                if (r0 > r6) goto L91
                goto L7
            L91:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.Utf8.UnsafeProcessor.partialIsValidUtf8(byte[], long, int):int");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int incompleteStateFor(int i2, int i3, int i4) {
        if (i2 > -12 || i3 > -65 || i4 > -65) {
            return -1;
        }
        return (i2 ^ (i3 << 8)) ^ (i4 << 16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int incompleteStateFor(int i2) {
        if (i2 > -12) {
            return -1;
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int incompleteStateFor(byte[] bArr, int i2, int i3) {
        int i4 = i3 - i2;
        byte b2 = bArr[i2 - 1];
        if (i4 == 0) {
            return incompleteStateFor(b2);
        }
        if (i4 == 1) {
            return incompleteStateFor(b2, bArr[i2]);
        }
        if (i4 == 2) {
            return incompleteStateFor(b2, bArr[i2], bArr[i2 + 1]);
        }
        throw new AssertionError();
    }

    /* compiled from: WazeSource */
    final class SafeProcessor extends Processor {
        SafeProcessor() {
        }

        private static int partialIsValidUtf8NonAscii(byte[] bArr, int i2, int i3) {
            while (i2 < i3) {
                int i4 = i2 + 1;
                byte b2 = bArr[i2];
                if (b2 < 0) {
                    if (b2 < -32) {
                        if (i4 >= i3) {
                            return b2;
                        }
                        if (b2 >= -62) {
                            i2 += 2;
                            if (bArr[i4] > -65) {
                            }
                        }
                        return -1;
                    }
                    if (b2 >= -16) {
                        if (i4 >= i3 - 2) {
                            return Utf8.incompleteStateFor(bArr, i4, i3);
                        }
                        int i5 = i2 + 2;
                        byte b3 = bArr[i4];
                        if (b3 <= -65 && (((b2 << StylePropertiesKt.RotationZId) + (b3 + 112)) >> 30) == 0) {
                            int i6 = i2 + 3;
                            if (bArr[i5] <= -65) {
                                i2 += 4;
                                if (bArr[i6] <= -65) {
                                }
                            }
                        }
                        return -1;
                    }
                    if (i4 >= i3 - 1) {
                        return Utf8.incompleteStateFor(bArr, i4, i3);
                    }
                    int i7 = i2 + 2;
                    byte b4 = bArr[i4];
                    if (b4 <= -65 && ((b2 != -32 || b4 >= -96) && (b2 != -19 || b4 < -96))) {
                        i2 += 3;
                        if (bArr[i7] > -65) {
                        }
                    }
                    return -1;
                }
                i2 = i4;
            }
            return 0;
        }

        @Override // androidx.datastore.preferences.protobuf.Utf8.Processor
        String decodeUtf8(byte[] bArr, int i2, int i3) throws InvalidProtocolBufferException {
            int i4;
            int length = bArr.length;
            if ((((length - i2) - i3) | i2 | i3) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(i2), Integer.valueOf(i3)));
            }
            int i5 = i2 + i3;
            char[] cArr = new char[i3];
            int i6 = 0;
            while (i2 < i5) {
                byte b2 = bArr[i2];
                if (!DecodeUtil.isOneByte(b2)) {
                    break;
                }
                i2++;
                DecodeUtil.handleOneByte(b2, cArr, i6);
                i6++;
            }
            int i7 = i6;
            while (i2 < i5) {
                int i8 = i2 + 1;
                byte b3 = bArr[i2];
                if (DecodeUtil.isOneByte(b3)) {
                    DecodeUtil.handleOneByte(b3, cArr, i7);
                    i7++;
                    i2 = i8;
                    while (i2 < i5) {
                        byte b4 = bArr[i2];
                        if (DecodeUtil.isOneByte(b4)) {
                            i2++;
                            DecodeUtil.handleOneByte(b4, cArr, i7);
                            i7++;
                        }
                    }
                } else {
                    if (DecodeUtil.isTwoBytes(b3)) {
                        if (i8 >= i5) {
                            throw InvalidProtocolBufferException.invalidUtf8();
                        }
                        i4 = i7 + 1;
                        i2 += 2;
                        DecodeUtil.handleTwoBytes(b3, bArr[i8], cArr, i7);
                    } else if (DecodeUtil.isThreeBytes(b3)) {
                        if (i8 >= i5 - 1) {
                            throw InvalidProtocolBufferException.invalidUtf8();
                        }
                        i4 = i7 + 1;
                        int i9 = i2 + 2;
                        i2 += 3;
                        DecodeUtil.handleThreeBytes(b3, bArr[i8], bArr[i9], cArr, i7);
                    } else {
                        if (i8 >= i5 - 2) {
                            throw InvalidProtocolBufferException.invalidUtf8();
                        }
                        byte b5 = bArr[i8];
                        int i10 = i2 + 3;
                        byte b6 = bArr[i2 + 2];
                        i2 += 4;
                        DecodeUtil.handleFourBytes(b3, b5, b6, bArr[i10], cArr, i7);
                        i7 += 2;
                    }
                    i7 = i4;
                }
            }
            return new String(cArr, 0, i7);
        }

        @Override // androidx.datastore.preferences.protobuf.Utf8.Processor
        String decodeUtf8Direct(ByteBuffer byteBuffer, int i2, int i3) {
            return decodeUtf8Default(byteBuffer, i2, i3);
        }

        @Override // androidx.datastore.preferences.protobuf.Utf8.Processor
        int encodeUtf8(String str, byte[] bArr, int i2, int i3) {
            int i4;
            int i5;
            int i6;
            char cCharAt;
            int length = str.length();
            int i7 = 0;
            while (true) {
                i4 = i2 + i3;
                if (i7 >= length || (i6 = i7 + i2) >= i4 || (cCharAt = str.charAt(i7)) >= 128) {
                    break;
                }
                bArr[i6] = (byte) cCharAt;
                i7++;
            }
            if (i7 == length) {
                return i2 + length;
            }
            int i8 = i2 + i7;
            while (i7 < length) {
                char cCharAt2 = str.charAt(i7);
                if (cCharAt2 < 128 && i8 < i4) {
                    bArr[i8] = (byte) cCharAt2;
                    i8++;
                } else if (cCharAt2 < 2048 && i8 <= i4 - 2) {
                    bArr[i8] = (byte) ((cCharAt2 >>> 6) | 960);
                    bArr[i8 + 1] = (byte) ((cCharAt2 & '?') | 128);
                    i8 += 2;
                } else {
                    if ((cCharAt2 >= 55296 && cCharAt2 <= 57343) || i8 > i4 - 3) {
                        if (i8 > i4 - 4) {
                            if (cCharAt2 < 55296 || cCharAt2 > 57343 || ((i5 = i7 + 1) != str.length() && Character.isSurrogatePair(cCharAt2, str.charAt(i5)))) {
                                throw new ArrayIndexOutOfBoundsException("Not enough space in output buffer to encode UTF-8 string");
                            }
                            throw new UnpairedSurrogateException(i7, length);
                        }
                        int i9 = i7 + 1;
                        if (i9 != str.length()) {
                            char cCharAt3 = str.charAt(i9);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int i10 = i8 + 3;
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                bArr[i8] = (byte) ((codePoint >>> 18) | 240);
                                bArr[i8 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                bArr[i8 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                i8 += 4;
                                bArr[i10] = (byte) ((codePoint & 63) | 128);
                                i7 = i9;
                            } else {
                                i7 = i9;
                            }
                        }
                        throw new UnpairedSurrogateException(i7 - 1, length);
                    }
                    bArr[i8] = (byte) ((cCharAt2 >>> '\f') | 480);
                    bArr[i8 + 1] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                    bArr[i8 + 2] = (byte) ((cCharAt2 & '?') | 128);
                    i8 += 3;
                }
                i7++;
            }
            return i8;
        }

        @Override // androidx.datastore.preferences.protobuf.Utf8.Processor
        void encodeUtf8Direct(String str, ByteBuffer byteBuffer) {
            encodeUtf8Default(str, byteBuffer);
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0015, code lost:
        
            if (r8[r9] <= (-65)) goto L11;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0046, code lost:
        
            if (r8[r9] <= (-65)) goto L11;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x0082, code lost:
        
            if (r8[r7] <= (-65)) goto L55;
         */
        @Override // androidx.datastore.preferences.protobuf.Utf8.Processor
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        int partialIsValidUtf8(int r7, byte[] r8, int r9, int r10) {
            /*
                r6 = this;
                if (r7 == 0) goto L86
                if (r9 < r10) goto L5
                return r7
            L5:
                byte r6 = (byte) r7
                r0 = -32
                r1 = -1
                r2 = -65
                if (r6 >= r0) goto L1b
                r7 = -62
                if (r6 < r7) goto L1a
                int r6 = r9 + 1
                r7 = r8[r9]
                if (r7 > r2) goto L1a
            L17:
                r9 = r6
                goto L86
            L1a:
                return r1
            L1b:
                int r3 = r7 >> 8
                int r3 = ~r3
                r4 = -16
                if (r6 >= r4) goto L4a
                byte r7 = (byte) r3
                if (r7 != 0) goto L34
                int r7 = r9 + 1
                r9 = r8[r9]
                if (r7 >= r10) goto L2f
                r5 = r9
                r9 = r7
                r7 = r5
                goto L34
            L2f:
                int r6 = androidx.datastore.preferences.protobuf.Utf8.access$000(r6, r9)
                return r6
            L34:
                if (r7 > r2) goto L49
                r3 = -96
                if (r6 != r0) goto L3c
                if (r7 < r3) goto L49
            L3c:
                r0 = -19
                if (r6 != r0) goto L42
                if (r7 >= r3) goto L49
            L42:
                int r6 = r9 + 1
                r7 = r8[r9]
                if (r7 > r2) goto L49
                goto L17
            L49:
                return r1
            L4a:
                byte r0 = (byte) r3
                if (r0 != 0) goto L5a
                int r7 = r9 + 1
                r0 = r8[r9]
                if (r7 >= r10) goto L55
                r9 = 0
                goto L60
            L55:
                int r6 = androidx.datastore.preferences.protobuf.Utf8.access$000(r6, r0)
                return r6
            L5a:
                int r7 = r7 >> 16
                byte r7 = (byte) r7
                r5 = r9
                r9 = r7
                r7 = r5
            L60:
                if (r9 != 0) goto L71
                int r9 = r7 + 1
                r7 = r8[r7]
                if (r9 >= r10) goto L6c
                r5 = r9
                r9 = r7
                r7 = r5
                goto L71
            L6c:
                int r6 = androidx.datastore.preferences.protobuf.Utf8.access$100(r6, r0, r7)
                return r6
            L71:
                if (r0 > r2) goto L85
                int r6 = r6 << 28
                int r0 = r0 + 112
                int r6 = r6 + r0
                int r6 = r6 >> 30
                if (r6 != 0) goto L85
                if (r9 > r2) goto L85
                int r9 = r7 + 1
                r6 = r8[r7]
                if (r6 > r2) goto L85
                goto L86
            L85:
                return r1
            L86:
                int r6 = partialIsValidUtf8(r8, r9, r10)
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.Utf8.SafeProcessor.partialIsValidUtf8(int, byte[], int, int):int");
        }

        @Override // androidx.datastore.preferences.protobuf.Utf8.Processor
        int partialIsValidUtf8Direct(int i2, ByteBuffer byteBuffer, int i3, int i4) {
            return partialIsValidUtf8Default(i2, byteBuffer, i3, i4);
        }

        private static int partialIsValidUtf8(byte[] bArr, int i2, int i3) {
            while (i2 < i3 && bArr[i2] >= 0) {
                i2++;
            }
            if (i2 >= i3) {
                return 0;
            }
            return partialIsValidUtf8NonAscii(bArr, i2, i3);
        }
    }
}
