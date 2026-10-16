package com.applovin.shadow.okio;

import Bf.r;
import Va.M6;
import com.applovin.shadow.okio.Buffer;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000P\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0005\n\u0002\b\f\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\u001a'\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0007H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\b\u001a\u00020\n*\u00020\nH\u0000¢\u0006\u0004\b\b\u0010\u000b\u001a\u0013\u0010\b\u001a\u00020\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\b\u0010\f\u001a\u001c\u0010\u000e\u001a\u00020\n*\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0080\f¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001c\u0010\u0010\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\r\u001a\u00020\nH\u0080\f¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001c\u0010\u0014\u001a\u00020\n*\u00020\u00122\u0006\u0010\u0013\u001a\u00020\nH\u0080\f¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001c\u0010\u0016\u001a\u00020\n*\u00020\u00122\u0006\u0010\u0013\u001a\u00020\nH\u0080\f¢\u0006\u0004\b\u0016\u0010\u0015\u001a\u001c\u0010\u0017\u001a\u00020\n*\u00020\u00122\u0006\u0010\u0013\u001a\u00020\nH\u0080\f¢\u0006\u0004\b\u0017\u0010\u0015\u001a\u001c\u0010\u0017\u001a\u00020\u0000*\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0000H\u0080\f¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u001c\u0010\u0019\u001a\u00020\u0012*\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0080\f¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u001c\u0010\u0017\u001a\u00020\u0000*\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0000H\u0080\f¢\u0006\u0004\b\u0017\u0010\u001b\u001a \u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\nH\u0080\b¢\u0006\u0004\b\u001e\u0010\u0011\u001a \u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u0000H\u0080\b¢\u0006\u0004\b\u001e\u0010\u001b\u001a7\u0010#\u001a\u00020\"2\u0006\u0010\u001c\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\nH\u0000¢\u0006\u0004\b#\u0010$\u001a\u0013\u0010&\u001a\u00020%*\u00020\u0012H\u0000¢\u0006\u0004\b&\u0010'\u001a\u0013\u0010&\u001a\u00020%*\u00020\nH\u0000¢\u0006\u0004\b&\u0010(\u001a\u0013\u0010&\u001a\u00020%*\u00020\u0000H\u0000¢\u0006\u0004\b&\u0010)\u001a\u0017\u0010,\u001a\u00020*2\u0006\u0010+\u001a\u00020*H\u0000¢\u0006\u0004\b,\u0010-\u001a\u001b\u0010,\u001a\u00020\n*\u00020.2\u0006\u0010/\u001a\u00020\nH\u0000¢\u0006\u0004\b,\u00100\u001a\u001b\u0010,\u001a\u00020\n*\u00020\u001f2\u0006\u00101\u001a\u00020\nH\u0000¢\u0006\u0004\b,\u00102\" \u00103\u001a\u00020*8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b3\u00104\u0012\u0004\b7\u00108\u001a\u0004\b5\u00106\"\u001a\u00109\u001a\u00020\n8\u0000X\u0080D¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<¨\u0006="}, d2 = {"", "size", MimeTypesReaderMetKeys.MATCH_OFFSET_ATTR, "byteCount", "Lef/C;", "checkOffsetAndCount", "(JJJ)V", "", "reverseBytes", "(S)S", "", "(I)I", "(J)J", "bitCount", "leftRotate", "(II)I", "rightRotate", "(JI)J", "", "other", "shr", "(BI)I", "shl", "and", "(BJ)J", "xor", "(BB)B", "(IJ)J", "a", "b", "minOf", "", "aOffset", "bOffset", "", "arrayRangeEquals", "([BI[BII)Z", "", "toHexString", "(B)Ljava/lang/String;", "(I)Ljava/lang/String;", "(J)Ljava/lang/String;", "Lcom/applovin/shadow/okio/Buffer$UnsafeCursor;", "unsafeCursor", "resolveDefaultParameter", "(Lcom/applovin/shadow/okio/Buffer$UnsafeCursor;)Lcom/applovin/shadow/okio/Buffer$UnsafeCursor;", "Lcom/applovin/shadow/okio/ByteString;", "position", "(Lcom/applovin/shadow/okio/ByteString;I)I", "sizeParam", "([BI)I", "DEFAULT__new_UnsafeCursor", "Lcom/applovin/shadow/okio/Buffer$UnsafeCursor;", "getDEFAULT__new_UnsafeCursor", "()La4/h;", "getDEFAULT__new_UnsafeCursor$annotations", "()V", "DEFAULT__ByteString_size", "I", "getDEFAULT__ByteString_size", "()I", "com.applovin.shadow.okio"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.applovin.shadow.okio.-SegmentedByteString, reason: invalid class name */
/* loaded from: classes.dex */
public final class SegmentedByteString {

    @NotNull
    private static final Buffer.UnsafeCursor DEFAULT__new_UnsafeCursor = new Buffer.UnsafeCursor();
    private static final int DEFAULT__ByteString_size = -1234567890;

    public static final int and(byte b5, int i5) {
        return b5 & i5;
    }

    public static final boolean arrayRangeEquals(@NotNull byte[] a5, int i5, @NotNull byte[] b5, int i10, int i11) {
        AbstractC3340k.e(a5, "a");
        AbstractC3340k.e(b5, "b");
        for (int i12 = 0; i12 < i11; i12++) {
            if (a5[i12 + i5] != b5[i12 + i10]) {
                return false;
            }
        }
        return true;
    }

    public static final void checkOffsetAndCount(long j8, long j10, long j11) {
        if ((j10 | j11) < 0 || j10 > j8 || j8 - j10 < j11) {
            StringBuilder sbU = M6.u(j8, "size=", " offset=");
            sbU.append(j10);
            sbU.append(" byteCount=");
            sbU.append(j11);
            throw new ArrayIndexOutOfBoundsException(sbU.toString());
        }
    }

    public static final int getDEFAULT__ByteString_size() {
        return DEFAULT__ByteString_size;
    }

    @NotNull
    public static final Buffer.UnsafeCursor getDEFAULT__new_UnsafeCursor() {
        return DEFAULT__new_UnsafeCursor;
    }

    public static /* synthetic */ void getDEFAULT__new_UnsafeCursor$annotations() {
    }

    public static final int leftRotate(int i5, int i10) {
        return (i5 >>> (32 - i10)) | (i5 << i10);
    }

    public static final long minOf(long j8, int i5) {
        return Math.min(j8, i5);
    }

    @NotNull
    public static final Buffer.UnsafeCursor resolveDefaultParameter(@NotNull Buffer.UnsafeCursor unsafeCursor) {
        AbstractC3340k.e(unsafeCursor, "unsafeCursor");
        return unsafeCursor == DEFAULT__new_UnsafeCursor ? new Buffer.UnsafeCursor() : unsafeCursor;
    }

    public static final int reverseBytes(int i5) {
        return ((i5 & 255) << 24) | (((-16777216) & i5) >>> 24) | ((16711680 & i5) >>> 8) | ((65280 & i5) << 8);
    }

    public static final long rightRotate(long j8, int i5) {
        return (j8 << (64 - i5)) | (j8 >>> i5);
    }

    public static final int shl(byte b5, int i5) {
        return b5 << i5;
    }

    public static final int shr(byte b5, int i5) {
        return b5 >> i5;
    }

    @NotNull
    public static final String toHexString(byte b5) {
        return new String(new char[]{com.applovin.shadow.okio.internal.ByteString.getHEX_DIGIT_CHARS()[(b5 >> 4) & 15], com.applovin.shadow.okio.internal.ByteString.getHEX_DIGIT_CHARS()[b5 & 15]});
    }

    public static final byte xor(byte b5, byte b10) {
        return (byte) (b5 ^ b10);
    }

    public static final long and(byte b5, long j8) {
        return j8 & b5;
    }

    public static final long minOf(int i5, long j8) {
        return Math.min(i5, j8);
    }

    public static final int resolveDefaultParameter(@NotNull ByteString byteString, int i5) {
        AbstractC3340k.e(byteString, "<this>");
        return i5 == DEFAULT__ByteString_size ? byteString.size() : i5;
    }

    public static final long reverseBytes(long j8) {
        return ((j8 & 255) << 56) | (((-72057594037927936L) & j8) >>> 56) | ((71776119061217280L & j8) >>> 40) | ((280375465082880L & j8) >>> 24) | ((1095216660480L & j8) >>> 8) | ((4278190080L & j8) << 8) | ((16711680 & j8) << 24) | ((65280 & j8) << 40);
    }

    public static final long and(int i5, long j8) {
        return j8 & i5;
    }

    public static final int resolveDefaultParameter(@NotNull byte[] bArr, int i5) {
        AbstractC3340k.e(bArr, "<this>");
        return i5 == DEFAULT__ByteString_size ? bArr.length : i5;
    }

    public static final short reverseBytes(short s10) {
        return (short) (((s10 & 255) << 8) | ((65280 & s10) >>> 8));
    }

    @NotNull
    public static final String toHexString(int i5) {
        int i10 = 0;
        if (i5 == 0) {
            return "0";
        }
        char[] cArr = {com.applovin.shadow.okio.internal.ByteString.getHEX_DIGIT_CHARS()[(i5 >> 28) & 15], com.applovin.shadow.okio.internal.ByteString.getHEX_DIGIT_CHARS()[(i5 >> 24) & 15], com.applovin.shadow.okio.internal.ByteString.getHEX_DIGIT_CHARS()[(i5 >> 20) & 15], com.applovin.shadow.okio.internal.ByteString.getHEX_DIGIT_CHARS()[(i5 >> 16) & 15], com.applovin.shadow.okio.internal.ByteString.getHEX_DIGIT_CHARS()[(i5 >> 12) & 15], com.applovin.shadow.okio.internal.ByteString.getHEX_DIGIT_CHARS()[(i5 >> 8) & 15], com.applovin.shadow.okio.internal.ByteString.getHEX_DIGIT_CHARS()[(i5 >> 4) & 15], com.applovin.shadow.okio.internal.ByteString.getHEX_DIGIT_CHARS()[i5 & 15]};
        while (i10 < 8 && cArr[i10] == '0') {
            i10++;
        }
        return r.Z(cArr, i10, 8);
    }

    @NotNull
    public static final String toHexString(long j8) {
        if (j8 == 0) {
            return "0";
        }
        char[] cArr = {com.applovin.shadow.okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j8 >> 60) & 15)], com.applovin.shadow.okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j8 >> 56) & 15)], com.applovin.shadow.okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j8 >> 52) & 15)], com.applovin.shadow.okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j8 >> 48) & 15)], com.applovin.shadow.okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j8 >> 44) & 15)], com.applovin.shadow.okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j8 >> 40) & 15)], com.applovin.shadow.okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j8 >> 36) & 15)], com.applovin.shadow.okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j8 >> 32) & 15)], com.applovin.shadow.okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j8 >> 28) & 15)], com.applovin.shadow.okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j8 >> 24) & 15)], com.applovin.shadow.okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j8 >> 20) & 15)], com.applovin.shadow.okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j8 >> 16) & 15)], com.applovin.shadow.okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j8 >> 12) & 15)], com.applovin.shadow.okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j8 >> 8) & 15)], com.applovin.shadow.okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j8 >> 4) & 15)], com.applovin.shadow.okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) (j8 & 15)]};
        int i5 = 0;
        while (i5 < 16 && cArr[i5] == '0') {
            i5++;
        }
        return r.Z(cArr, i5, 16);
    }
}
