package com.fasterxml.jackson.core.io;

import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class JsonStringEncoder {
    private static final char[] HC = CharTypes.copyHexChars(true);
    private static final byte[] HB = CharTypes.copyHexBytes(true);
    private static final JsonStringEncoder instance = new JsonStringEncoder();

    private int _appendByte(int i2, int i3, ByteArrayBuilder byteArrayBuilder, int i4) {
        byteArrayBuilder.setCurrentSegmentLength(i4);
        byteArrayBuilder.append(92);
        if (i3 < 0) {
            byteArrayBuilder.append(117);
            byteArrayBuilder.append(48);
            byteArrayBuilder.append(48);
            byte[] bArr = HB;
            byteArrayBuilder.append(bArr[i2 >> 4]);
            byteArrayBuilder.append(bArr[i2 & 15]);
        } else {
            byteArrayBuilder.append((byte) i3);
        }
        return byteArrayBuilder.getCurrentSegmentLength();
    }

    private int _appendNamed(int i2, char[] cArr) {
        cArr[1] = (char) i2;
        return 2;
    }

    private int _appendNumeric(int i2, char[] cArr) {
        cArr[1] = 'u';
        char[] cArr2 = HC;
        cArr[4] = cArr2[i2 >> 4];
        cArr[5] = cArr2[i2 & 15];
        return 6;
    }

    private static int _convert(int i2, int i3) {
        if (i3 >= 56320 && i3 <= 57343) {
            return ((i2 << 10) + i3) - 56613888;
        }
        throw new IllegalArgumentException("Broken surrogate pair: first char 0x" + Integer.toHexString(i2) + ", second 0x" + Integer.toHexString(i3) + "; illegal combination");
    }

    private static void _illegal(int i2) {
        throw new IllegalArgumentException(UTF8Writer.illegalSurrogateDesc(i2));
    }

    static int _initialByteBufSize(int i2) {
        return Math.min(Math.max(24, i2 + 6 + (i2 >> 1)), 32000);
    }

    static int _initialCharBufSize(int i2) {
        return Math.min(Math.max(16, i2 + Math.min((i2 >> 3) + 6, 1000)), 32000);
    }

    private char[] _qbuf() {
        return new char[]{'\\', 0, '0', '0', 0, 0};
    }

    public static JsonStringEncoder getInstance() {
        return instance;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e2 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public byte[] encodeAsUTF8(java.lang.String r10) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.io.JsonStringEncoder.encodeAsUTF8(java.lang.String):byte[]");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0024, code lost:
    
        r6 = _qbuf();
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
    
        r7 = r13.charAt(r7);
        r10 = r2[r7];
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002e, code lost:
    
        if (r10 >= 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0030, code lost:
    
        _appendNumeric(r7, r6);
        r7 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0035, code lost:
    
        _appendNamed(r10, r6);
        r7 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0039, code lost:
    
        r10 = r8 + r7;
        r11 = r1.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003c, code lost:
    
        if (r10 <= r11) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003e, code lost:
    
        r11 = r11 - r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003f, code lost:
    
        if (r11 <= 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0041, code lost:
    
        java.lang.System.arraycopy(r6, 0, r1, r8, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0044, code lost:
    
        if (r4 != null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0046, code lost:
    
        r4 = com.fasterxml.jackson.core.util.TextBuffer.fromInitial(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004a, code lost:
    
        r1 = r4.finishCurrentSegment();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004e, code lost:
    
        r7 = r7 - r11;
        java.lang.System.arraycopy(r6, r11, r1, 0, r7);
        r8 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0054, code lost:
    
        r12 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005a, code lost:
    
        throw new java.lang.IllegalStateException(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005b, code lost:
    
        java.lang.System.arraycopy(r6, 0, r1, r8, r7);
        r8 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0020, code lost:
    
        r9 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
    
        if (r6 != null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public char[] quoteAsString(java.lang.String r13) {
        /*
            r12 = this;
            int r0 = r13.length()
            int r1 = _initialCharBufSize(r0)
            char[] r1 = new char[r1]
            int[] r2 = com.fasterxml.jackson.core.io.CharTypes.get7BitOutputEscapes()
            int r3 = r2.length
            r4 = 0
            r5 = 0
            r6 = r4
            r7 = r5
            r8 = r7
        L14:
            if (r7 >= r0) goto L85
        L16:
            char r9 = r13.charAt(r7)
            if (r9 >= r3) goto L61
            r10 = r2[r9]
            if (r10 == 0) goto L61
            int r9 = r7 + 1
            if (r6 != 0) goto L28
            char[] r6 = r12._qbuf()
        L28:
            char r7 = r13.charAt(r7)
            r10 = r2[r7]
            if (r10 >= 0) goto L35
            r12._appendNumeric(r7, r6)
            r7 = 6
            goto L39
        L35:
            r12._appendNamed(r10, r6)
            r7 = 2
        L39:
            int r10 = r8 + r7
            int r11 = r1.length
            if (r10 <= r11) goto L5b
            int r11 = r11 - r8
            if (r11 <= 0) goto L44
            java.lang.System.arraycopy(r6, r5, r1, r8, r11)
        L44:
            if (r4 != 0) goto L4a
            com.fasterxml.jackson.core.util.TextBuffer r4 = com.fasterxml.jackson.core.util.TextBuffer.fromInitial(r1)
        L4a:
            char[] r1 = r4.finishCurrentSegment()     // Catch: java.io.IOException -> L54
            int r7 = r7 - r11
            java.lang.System.arraycopy(r6, r11, r1, r5, r7)
            r8 = r7
            goto L5f
        L54:
            r12 = move-exception
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            r13.<init>(r12)
            throw r13
        L5b:
            java.lang.System.arraycopy(r6, r5, r1, r8, r7)
            r8 = r10
        L5f:
            r7 = r9
            goto L14
        L61:
            int r10 = r1.length
            if (r8 < r10) goto L79
            if (r4 != 0) goto L6a
            com.fasterxml.jackson.core.util.TextBuffer r4 = com.fasterxml.jackson.core.util.TextBuffer.fromInitial(r1)
        L6a:
            char[] r1 = r4.finishCurrentSegment()     // Catch: java.io.IOException -> L72
            int r7 = r7 + 1
            r8 = r5
            goto L7b
        L72:
            r12 = move-exception
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            r13.<init>(r12)
            throw r13
        L79:
            int r7 = r7 + 1
        L7b:
            int r10 = r8 + 1
            r1[r8] = r9
            if (r7 < r0) goto L83
            r8 = r10
            goto L85
        L83:
            r8 = r10
            goto L16
        L85:
            if (r4 != 0) goto L8c
            char[] r12 = java.util.Arrays.copyOfRange(r1, r5, r8)
            return r12
        L8c:
            r4.setCurrentLength(r8)
            char[] r12 = r4.contentsAsArray()     // Catch: java.io.IOException -> L94
            return r12
        L94:
            r12 = move-exception
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            r13.<init>(r12)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.io.JsonStringEncoder.quoteAsString(java.lang.String):char[]");
    }

    public byte[] quoteAsUTF8(String str) {
        int i2;
        int i3;
        int i4;
        int length = str.length();
        byte[] bArrFinishCurrentSegment = new byte[_initialByteBufSize(length)];
        ByteArrayBuilder byteArrayBuilderFromInitial = null;
        int i5 = 0;
        int i_appendByte = 0;
        loop0: while (true) {
            if (i5 >= length) {
                break;
            }
            int[] iArr = CharTypes.get7BitOutputEscapes();
            while (true) {
                char cCharAt = str.charAt(i5);
                i2 = i5 + 1;
                if (cCharAt > 127 || iArr[cCharAt] != 0) {
                    break;
                }
                if (i_appendByte >= bArrFinishCurrentSegment.length) {
                    if (byteArrayBuilderFromInitial == null) {
                        byteArrayBuilderFromInitial = ByteArrayBuilder.fromInitial(bArrFinishCurrentSegment, i_appendByte);
                    }
                    bArrFinishCurrentSegment = byteArrayBuilderFromInitial.finishCurrentSegment();
                    i_appendByte = 0;
                }
                int i6 = i_appendByte + 1;
                bArrFinishCurrentSegment[i_appendByte] = (byte) cCharAt;
                if (i2 >= length) {
                    i_appendByte = i6;
                    break loop0;
                }
                i_appendByte = i6;
                i5 = i2;
            }
            if (byteArrayBuilderFromInitial == null) {
                byteArrayBuilderFromInitial = ByteArrayBuilder.fromInitial(bArrFinishCurrentSegment, i_appendByte);
            }
            if (i_appendByte >= bArrFinishCurrentSegment.length) {
                bArrFinishCurrentSegment = byteArrayBuilderFromInitial.finishCurrentSegment();
                i_appendByte = 0;
            }
            char cCharAt2 = str.charAt(i5);
            if (cCharAt2 <= 127) {
                i_appendByte = _appendByte(cCharAt2, iArr[cCharAt2], byteArrayBuilderFromInitial, i_appendByte);
                bArrFinishCurrentSegment = byteArrayBuilderFromInitial.getCurrentSegment();
            } else {
                int i7 = i_appendByte + 1;
                if (cCharAt2 <= 2047) {
                    bArrFinishCurrentSegment[i_appendByte] = (byte) ((cCharAt2 >> 6) | 192);
                    i4 = (cCharAt2 & '?') | 128;
                } else {
                    if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                        bArrFinishCurrentSegment[i_appendByte] = (byte) ((cCharAt2 >> '\f') | 224);
                        if (i7 >= bArrFinishCurrentSegment.length) {
                            bArrFinishCurrentSegment = byteArrayBuilderFromInitial.finishCurrentSegment();
                            i7 = 0;
                        }
                        bArrFinishCurrentSegment[i7] = (byte) (((cCharAt2 >> 6) & 63) | 128);
                        i3 = (cCharAt2 & '?') | 128;
                        i7++;
                    } else {
                        if (cCharAt2 > 56319) {
                            _illegal(cCharAt2);
                        }
                        if (i2 >= length) {
                            _illegal(cCharAt2);
                        }
                        int i8 = i5 + 2;
                        int i_convert = _convert(cCharAt2, str.charAt(i2));
                        if (i_convert > 1114111) {
                            _illegal(i_convert);
                        }
                        bArrFinishCurrentSegment[i_appendByte] = (byte) ((i_convert >> 18) | 240);
                        if (i7 >= bArrFinishCurrentSegment.length) {
                            bArrFinishCurrentSegment = byteArrayBuilderFromInitial.finishCurrentSegment();
                            i7 = 0;
                        }
                        int i9 = i7 + 1;
                        bArrFinishCurrentSegment[i7] = (byte) (((i_convert >> 12) & 63) | 128);
                        if (i9 >= bArrFinishCurrentSegment.length) {
                            bArrFinishCurrentSegment = byteArrayBuilderFromInitial.finishCurrentSegment();
                            i9 = 0;
                        }
                        i7 = i9 + 1;
                        bArrFinishCurrentSegment[i9] = (byte) (((i_convert >> 6) & 63) | 128);
                        i3 = (i_convert & 63) | 128;
                        i2 = i8;
                    }
                    i4 = i3;
                }
                if (i7 >= bArrFinishCurrentSegment.length) {
                    bArrFinishCurrentSegment = byteArrayBuilderFromInitial.finishCurrentSegment();
                    i7 = 0;
                }
                i_appendByte = i7 + 1;
                bArrFinishCurrentSegment[i7] = (byte) i4;
            }
            i5 = i2;
        }
        return byteArrayBuilderFromInitial == null ? Arrays.copyOfRange(bArrFinishCurrentSegment, 0, i_appendByte) : byteArrayBuilderFromInitial.completeAndCoalesce(i_appendByte);
    }
}
