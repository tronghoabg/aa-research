package com.fasterxml.jackson.core;

import androidx.compose.foundation.style.StylePropertiesKt;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import java.io.Serializable;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class Base64Variant implements Serializable {
    private static final long serialVersionUID = 1;
    private final transient int[] _asciiToBase64;
    private final transient byte[] _base64ToAsciiB;
    private final transient char[] _base64ToAsciiC;
    private final int _maxLineLength;
    final String _name;
    private final char _paddingChar;
    private final PaddingReadBehaviour _paddingReadBehaviour;
    private final boolean _writePadding;

    /* compiled from: WazeSource */
    public enum PaddingReadBehaviour {
        PADDING_FORBIDDEN,
        PADDING_REQUIRED,
        PADDING_ALLOWED
    }

    public Base64Variant(String str, String str2, boolean z, char c2, int i2) {
        PaddingReadBehaviour paddingReadBehaviour;
        int[] iArr = new int[128];
        this._asciiToBase64 = iArr;
        char[] cArr = new char[64];
        this._base64ToAsciiC = cArr;
        this._base64ToAsciiB = new byte[64];
        this._name = str;
        this._writePadding = z;
        this._paddingChar = c2;
        this._maxLineLength = i2;
        int length = str2.length();
        if (length != 64) {
            throw new IllegalArgumentException("Base64Alphabet length must be exactly 64 (was " + length + ")");
        }
        str2.getChars(0, 64, cArr, 0);
        Arrays.fill(iArr, -1);
        for (int i3 = 0; i3 < 64; i3++) {
            char c3 = this._base64ToAsciiC[i3];
            this._base64ToAsciiB[i3] = (byte) c3;
            this._asciiToBase64[c3] = i3;
        }
        if (z) {
            this._asciiToBase64[c2] = -2;
            paddingReadBehaviour = PaddingReadBehaviour.PADDING_REQUIRED;
        } else {
            paddingReadBehaviour = PaddingReadBehaviour.PADDING_FORBIDDEN;
        }
        this._paddingReadBehaviour = paddingReadBehaviour;
    }

    protected void _reportBase64EOF() {
        throw new IllegalArgumentException(missingPaddingMessage());
    }

    protected void _reportBase64UnexpectedPadding() {
        throw new IllegalArgumentException(unexpectedPaddingMessage());
    }

    protected void _reportInvalidBase64(char c2, int i2, String str) {
        String str2;
        if (c2 <= ' ') {
            str2 = "Illegal white space character (code 0x" + Integer.toHexString(c2) + ") as character #" + (i2 + 1) + " of 4-char base64 unit: can only used between units";
        } else if (usesPaddingChar(c2)) {
            str2 = "Unexpected padding character ('" + getPaddingChar() + "') as character #" + (i2 + 1) + " of 4-char base64 unit: padding only legal as 3rd or 4th character";
        } else if (!Character.isDefined(c2) || Character.isISOControl(c2)) {
            str2 = "Illegal character (code 0x" + Integer.toHexString(c2) + ") in base64 content";
        } else {
            str2 = "Illegal character '" + c2 + "' (code 0x" + Integer.toHexString(c2) + ") in base64 content";
        }
        if (str != null) {
            str2 = str2 + ": " + str;
        }
        throw new IllegalArgumentException(str2);
    }

    public boolean acceptsPaddingOnRead() {
        return this._paddingReadBehaviour != PaddingReadBehaviour.PADDING_FORBIDDEN;
    }

    public void decode(String str, ByteArrayBuilder byteArrayBuilder) {
        int length = str.length();
        int i2 = 0;
        while (i2 < length) {
            int i3 = i2 + 1;
            char cCharAt = str.charAt(i2);
            if (cCharAt > ' ') {
                int iDecodeBase64Char = decodeBase64Char(cCharAt);
                if (iDecodeBase64Char < 0) {
                    _reportInvalidBase64(cCharAt, 0, null);
                }
                if (i3 >= length) {
                    _reportBase64EOF();
                }
                int i4 = i2 + 2;
                char cCharAt2 = str.charAt(i3);
                int iDecodeBase64Char2 = decodeBase64Char(cCharAt2);
                if (iDecodeBase64Char2 < 0) {
                    _reportInvalidBase64(cCharAt2, 1, null);
                }
                int i5 = (iDecodeBase64Char << 6) | iDecodeBase64Char2;
                if (i4 >= length) {
                    if (!requiresPaddingOnRead()) {
                        byteArrayBuilder.append(i5 >> 4);
                        return;
                    }
                    _reportBase64EOF();
                }
                int i6 = i2 + 3;
                char cCharAt3 = str.charAt(i4);
                int iDecodeBase64Char3 = decodeBase64Char(cCharAt3);
                if (iDecodeBase64Char3 < 0) {
                    int i7 = i5 >> 4;
                    if (iDecodeBase64Char3 != -2) {
                        _reportInvalidBase64(cCharAt3, 2, null);
                    }
                    if (!acceptsPaddingOnRead()) {
                        _reportBase64UnexpectedPadding();
                    }
                    if (i6 >= length) {
                        _reportBase64EOF();
                    }
                    i2 += 4;
                    char cCharAt4 = str.charAt(i6);
                    if (!usesPaddingChar(cCharAt4)) {
                        _reportInvalidBase64(cCharAt4, 3, "expected padding character '" + getPaddingChar() + "'");
                    }
                    byteArrayBuilder.append(i7);
                } else {
                    int i8 = (i5 << 6) | iDecodeBase64Char3;
                    if (i6 >= length) {
                        if (!requiresPaddingOnRead()) {
                            byteArrayBuilder.appendTwoBytes(i8 >> 2);
                            return;
                        }
                        _reportBase64EOF();
                    }
                    i2 += 4;
                    char cCharAt5 = str.charAt(i6);
                    int iDecodeBase64Char4 = decodeBase64Char(cCharAt5);
                    if (iDecodeBase64Char4 < 0) {
                        int i9 = i8 >> 2;
                        if (iDecodeBase64Char4 != -2) {
                            _reportInvalidBase64(cCharAt5, 3, null);
                        }
                        if (!acceptsPaddingOnRead()) {
                            _reportBase64UnexpectedPadding();
                        }
                        byteArrayBuilder.appendTwoBytes(i9);
                    } else {
                        byteArrayBuilder.appendThreeBytes((i8 << 6) | iDecodeBase64Char4);
                    }
                }
            } else {
                i2 = i3;
            }
        }
    }

    public int decodeBase64Char(char c2) {
        if (c2 <= 127) {
            return this._asciiToBase64[c2];
        }
        return -1;
    }

    public String encode(byte[] bArr, boolean z) {
        int length = bArr.length;
        StringBuilder sb = new StringBuilder((length >> 2) + length + (length >> 3));
        int i2 = 2;
        int maxLineLength = getMaxLineLength() >> 2;
        int i3 = length - 3;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = i4 + 2;
            int i6 = ((bArr[i4 + 1] & 255) | (bArr[i4] << 8)) << 8;
            i4 += 3;
            encodeBase64Chunk(sb, i6 | (bArr[i5] & 255));
            maxLineLength--;
            if (maxLineLength <= 0) {
                sb.append("\\n");
                maxLineLength = getMaxLineLength() >> 2;
            }
        }
        int i7 = length - i4;
        if (i7 > 0) {
            int i8 = i4 + 1;
            int i9 = bArr[i4] << StylePropertiesKt.BottomId;
            if (i7 == 2) {
                i9 |= (bArr[i8] & 255) << 8;
            } else {
                i2 = i7;
            }
            encodeBase64Partial(sb, i9, i2);
        }
        return sb.toString();
    }

    public void encodeBase64Chunk(StringBuilder sb, int i2) {
        sb.append(this._base64ToAsciiC[(i2 >> 18) & 63]);
        sb.append(this._base64ToAsciiC[(i2 >> 12) & 63]);
        sb.append(this._base64ToAsciiC[(i2 >> 6) & 63]);
        sb.append(this._base64ToAsciiC[i2 & 63]);
    }

    public int encodeBase64Partial(int i2, int i3, byte[] bArr, int i4) {
        byte[] bArr2 = this._base64ToAsciiB;
        bArr[i4] = bArr2[(i2 >> 18) & 63];
        bArr[i4 + 1] = bArr2[(i2 >> 12) & 63];
        int i5 = i4 + 2;
        if (!usesPadding()) {
            if (i3 != 2) {
                return i5;
            }
            int i6 = i4 + 3;
            bArr[i5] = bArr2[(i2 >> 6) & 63];
            return i6;
        }
        int i7 = i4 + 3;
        byte b2 = (byte) this._paddingChar;
        bArr[i5] = i3 == 2 ? bArr2[(i2 >> 6) & 63] : b2;
        int i8 = i4 + 4;
        bArr[i7] = b2;
        return i8;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null) {
            if (obj.getClass() == getClass()) {
                Base64Variant base64Variant = (Base64Variant) obj;
                if (base64Variant._paddingChar == this._paddingChar && base64Variant._maxLineLength == this._maxLineLength && base64Variant._writePadding == this._writePadding && base64Variant._paddingReadBehaviour == this._paddingReadBehaviour && this._name.equals(base64Variant._name)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int getMaxLineLength() {
        return this._maxLineLength;
    }

    public String getName() {
        return this._name;
    }

    public char getPaddingChar() {
        return this._paddingChar;
    }

    public int hashCode() {
        return this._name.hashCode();
    }

    public String missingPaddingMessage() {
        return String.format("Unexpected end of base64-encoded String: base64 variant '%s' expects padding (one or more '%c' characters) at the end. This Base64Variant might have been incorrectly configured", getName(), Character.valueOf(getPaddingChar()));
    }

    protected Object readResolve() {
        Base64Variant base64VariantValueOf = Base64Variants.valueOf(this._name);
        boolean z = base64VariantValueOf._writePadding;
        boolean z2 = this._writePadding;
        return (z2 == z && this._paddingChar == base64VariantValueOf._paddingChar && this._paddingReadBehaviour == base64VariantValueOf._paddingReadBehaviour && this._maxLineLength == base64VariantValueOf._maxLineLength) ? base64VariantValueOf : new Base64Variant(base64VariantValueOf, this._name, z2, this._paddingChar, this._paddingReadBehaviour, this._maxLineLength);
    }

    public boolean requiresPaddingOnRead() {
        return this._paddingReadBehaviour == PaddingReadBehaviour.PADDING_REQUIRED;
    }

    public String toString() {
        return this._name;
    }

    protected String unexpectedPaddingMessage() {
        return String.format("Unexpected end of base64-encoded String: base64 variant '%s' expects no padding at the end while decoding. This Base64Variant might have been incorrectly configured", getName());
    }

    public boolean usesPadding() {
        return this._writePadding;
    }

    public boolean usesPaddingChar(char c2) {
        return c2 == this._paddingChar;
    }

    public boolean usesPaddingChar(int i2) {
        return i2 == this._paddingChar;
    }

    public int decodeBase64Char(int i2) {
        if (i2 <= 127) {
            return this._asciiToBase64[i2];
        }
        return -1;
    }

    public int encodeBase64Chunk(int i2, char[] cArr, int i3) {
        char[] cArr2 = this._base64ToAsciiC;
        cArr[i3] = cArr2[(i2 >> 18) & 63];
        cArr[i3 + 1] = cArr2[(i2 >> 12) & 63];
        cArr[i3 + 2] = cArr2[(i2 >> 6) & 63];
        cArr[i3 + 3] = cArr2[i2 & 63];
        return i3 + 4;
    }

    public int encodeBase64Chunk(int i2, byte[] bArr, int i3) {
        byte[] bArr2 = this._base64ToAsciiB;
        bArr[i3] = bArr2[(i2 >> 18) & 63];
        bArr[i3 + 1] = bArr2[(i2 >> 12) & 63];
        bArr[i3 + 2] = bArr2[(i2 >> 6) & 63];
        bArr[i3 + 3] = bArr2[i2 & 63];
        return i3 + 4;
    }

    public int encodeBase64Partial(int i2, int i3, char[] cArr, int i4) {
        char c2;
        char[] cArr2 = this._base64ToAsciiC;
        cArr[i4] = cArr2[(i2 >> 18) & 63];
        cArr[i4 + 1] = cArr2[(i2 >> 12) & 63];
        int i5 = i4 + 2;
        if (!usesPadding()) {
            if (i3 != 2) {
                return i5;
            }
            int i6 = i4 + 3;
            cArr[i5] = cArr2[(i2 >> 6) & 63];
            return i6;
        }
        int i7 = i4 + 3;
        if (i3 == 2) {
            c2 = cArr2[(i2 >> 6) & 63];
        } else {
            c2 = this._paddingChar;
        }
        cArr[i5] = c2;
        int i8 = i4 + 4;
        cArr[i7] = this._paddingChar;
        return i8;
    }

    public void encodeBase64Partial(StringBuilder sb, int i2, int i3) {
        char c2;
        sb.append(this._base64ToAsciiC[(i2 >> 18) & 63]);
        sb.append(this._base64ToAsciiC[(i2 >> 12) & 63]);
        if (!usesPadding()) {
            if (i3 == 2) {
                sb.append(this._base64ToAsciiC[(i2 >> 6) & 63]);
                return;
            }
            return;
        }
        if (i3 == 2) {
            c2 = this._base64ToAsciiC[(i2 >> 6) & 63];
        } else {
            c2 = this._paddingChar;
        }
        sb.append(c2);
        sb.append(this._paddingChar);
    }

    public String encode(byte[] bArr) {
        return encode(bArr, false);
    }

    public Base64Variant(Base64Variant base64Variant, String str, boolean z, char c2, int i2) {
        this(base64Variant, str, z, c2, base64Variant._paddingReadBehaviour, i2);
    }

    private Base64Variant(Base64Variant base64Variant, String str, boolean z, char c2, PaddingReadBehaviour paddingReadBehaviour, int i2) {
        int[] iArr = new int[128];
        this._asciiToBase64 = iArr;
        char[] cArr = new char[64];
        this._base64ToAsciiC = cArr;
        byte[] bArr = new byte[64];
        this._base64ToAsciiB = bArr;
        this._name = str;
        byte[] bArr2 = base64Variant._base64ToAsciiB;
        System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
        char[] cArr2 = base64Variant._base64ToAsciiC;
        System.arraycopy(cArr2, 0, cArr, 0, cArr2.length);
        int[] iArr2 = base64Variant._asciiToBase64;
        System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
        this._writePadding = z;
        this._paddingChar = c2;
        this._maxLineLength = i2;
        this._paddingReadBehaviour = paddingReadBehaviour;
    }

    public Base64Variant(Base64Variant base64Variant, String str, int i2) {
        this(base64Variant, "MIME-NO-LINEFEEDS", base64Variant._writePadding, base64Variant._paddingChar, Integer.MAX_VALUE);
    }

    public byte[] decode(String str) {
        ByteArrayBuilder byteArrayBuilder = new ByteArrayBuilder();
        decode(str, byteArrayBuilder);
        return byteArrayBuilder.toByteArray();
    }
}
