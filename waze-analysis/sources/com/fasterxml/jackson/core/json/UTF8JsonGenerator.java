package com.fasterxml.jackson.core.json;

import androidx.compose.foundation.style.StylePropertiesKt;
import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonStreamContext;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.PrettyPrinter;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.core.io.CharTypes;
import com.fasterxml.jackson.core.io.CharacterEscapes;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.io.NumberOutput;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.math.BigInteger;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class UTF8JsonGenerator extends JsonGeneratorImpl {
    protected boolean _bufferRecyclable;
    protected char[] _charBuffer;
    protected final int _charBufferLength;
    protected byte[] _outputBuffer;
    protected final int _outputEnd;
    protected final int _outputMaxContiguous;
    protected final OutputStream _outputStream;
    protected int _outputTail;
    protected byte _quoteChar;
    private static final byte[] HEX_BYTES_UPPER = CharTypes.copyHexBytes(true);
    private static final byte[] HEX_BYTES_LOWER = CharTypes.copyHexBytes(false);
    private static final byte[] NULL_BYTES = {110, 117, 108, 108};
    private static final byte[] TRUE_BYTES = {116, 114, 117, 101};
    private static final byte[] FALSE_BYTES = {102, 97, 108, 115, 101};

    public UTF8JsonGenerator(IOContext iOContext, int i2, ObjectCodec objectCodec, OutputStream outputStream, char c2) {
        super(iOContext, i2, objectCodec);
        this._outputStream = outputStream;
        this._quoteChar = (byte) c2;
        boolean zIsEnabled = isEnabled(JsonWriteFeature.ESCAPE_FORWARD_SLASHES.mappedFeature());
        if (c2 != '\"') {
            this._outputEscapes = CharTypes.get7BitOutputEscapes(c2, zIsEnabled);
        } else if (zIsEnabled) {
            zIsEnabled = true;
            c2 = '\"';
            this._outputEscapes = CharTypes.get7BitOutputEscapes(c2, zIsEnabled);
        }
        this._bufferRecyclable = true;
        byte[] bArrAllocWriteEncodingBuffer = iOContext.allocWriteEncodingBuffer();
        this._outputBuffer = bArrAllocWriteEncodingBuffer;
        int length = bArrAllocWriteEncodingBuffer.length;
        this._outputEnd = length;
        this._outputMaxContiguous = length >> 3;
        char[] cArrAllocConcatBuffer = iOContext.allocConcatBuffer();
        this._charBuffer = cArrAllocConcatBuffer;
        this._charBufferLength = cArrAllocConcatBuffer.length;
        if (isEnabled(JsonWriteFeature.ESCAPE_NON_ASCII.mappedFeature())) {
            setHighestNonEscapedChar(127);
        }
    }

    private final int _handleLongCustomEscape(byte[] bArr, int i2, int i3, byte[] bArr2, int i4) throws IOException {
        int length = bArr2.length;
        if (i2 + length > i3) {
            this._outputTail = i2;
            _flushBuffer();
            i2 = this._outputTail;
            if (length > bArr.length) {
                this._outputStream.write(bArr2, 0, length);
                return i2;
            }
        }
        System.arraycopy(bArr2, 0, bArr, i2, length);
        int i5 = i2 + length;
        if ((i4 * 6) + i5 <= i3) {
            return i5;
        }
        this._outputTail = i5;
        _flushBuffer();
        return this._outputTail;
    }

    private static boolean _isStartOfSurrogatePair(int i2) {
        return (i2 & 64512) == 55296;
    }

    private final int _outputMultiByteChar(int i2, int i3) {
        byte[] hexBytes = getHexBytes();
        byte[] bArr = this._outputBuffer;
        int i4 = i3 + 1;
        int i5 = i3 + 2;
        int i6 = i3 + 3;
        if (i2 < 55296 || i2 > 57343) {
            bArr[i3] = (byte) ((i2 >> 12) | 224);
            bArr[i4] = (byte) (((i2 >> 6) & 63) | 128);
            bArr[i5] = (byte) ((i2 & 63) | 128);
            return i6;
        }
        bArr[i3] = 92;
        bArr[i4] = 117;
        bArr[i5] = hexBytes[13];
        bArr[i6] = hexBytes[(i2 >> 8) & 15];
        int i7 = i3 + 5;
        bArr[i3 + 4] = hexBytes[(i2 >> 4) & 15];
        int i8 = i3 + 6;
        bArr[i7] = hexBytes[i2 & 15];
        return i8;
    }

    private final int _outputRawMultiByteChar(int i2, char[] cArr, int i3, int i4) throws IOException {
        if (i2 >= 55296 && i2 <= 57343) {
            if (i3 >= i4 || cArr == null) {
                _reportError(String.format("Split surrogate on writeRaw() input (last character): first character 0x%4x", Integer.valueOf(i2)));
            } else {
                _outputSurrogates(i2, cArr[i3]);
            }
            return i3 + 1;
        }
        byte[] bArr = this._outputBuffer;
        int i5 = this._outputTail;
        int i6 = i5 + 1;
        this._outputTail = i6;
        bArr[i5] = (byte) ((i2 >> 12) | 224);
        int i7 = i5 + 2;
        this._outputTail = i7;
        bArr[i6] = (byte) (((i2 >> 6) & 63) | 128);
        this._outputTail = i5 + 3;
        bArr[i7] = (byte) ((i2 & 63) | 128);
        return i3;
    }

    private int _outputSurrogatePair(char c2, char c3, int i2) {
        int i3 = ((c2 & 1023) << 10) + 65536 + (c3 & 1023);
        byte[] bArr = this._outputBuffer;
        bArr[i2] = (byte) ((i3 >> 18) + 240);
        bArr[i2 + 1] = (byte) (((i3 >> 12) & 63) + 128);
        bArr[i2 + 2] = (byte) (((i3 >> 6) & 63) + 128);
        bArr[i2 + 3] = (byte) ((i3 & 63) + 128);
        return i2 + 4;
    }

    private final int _readMore(InputStream inputStream, byte[] bArr, int i2, int i3, int i4) {
        int i5;
        int i6 = 0;
        while (i2 < i3) {
            bArr[i6] = bArr[i2];
            i6++;
            i2++;
        }
        int iMin = Math.min(i4, bArr.length);
        do {
            int i7 = iMin - i6;
            if (i7 == 0 || (i5 = inputStream.read(bArr, i6, i7)) < 0) {
                break;
            }
            i6 += i5;
        } while (i6 < 3);
        return i6;
    }

    private final void _writeBytes(byte[] bArr) throws IOException {
        int length = bArr.length;
        if (this._outputTail + length > this._outputEnd) {
            _flushBuffer();
            if (length > 512) {
                this._outputStream.write(bArr, 0, length);
                return;
            }
        }
        System.arraycopy(bArr, 0, this._outputBuffer, this._outputTail, length);
        this._outputTail += length;
    }

    private final int _writeCustomEscape(byte[] bArr, int i2, SerializableString serializableString, int i3) {
        byte[] bArrAsUnquotedUTF8 = serializableString.asUnquotedUTF8();
        int length = bArrAsUnquotedUTF8.length;
        if (length > 6) {
            return _handleLongCustomEscape(bArr, i2, this._outputEnd, bArrAsUnquotedUTF8, i3);
        }
        System.arraycopy(bArrAsUnquotedUTF8, 0, bArr, i2, length);
        return i2 + length;
    }

    private final void _writeCustomStringSegment2(String str, int i2, int i3) throws IOException {
        int i_outputMultiByteChar;
        if (this._outputTail + ((i3 - i2) * 6) > this._outputEnd) {
            _flushBuffer();
        }
        int i_writeGenericEscape = this._outputTail;
        byte[] bArr = this._outputBuffer;
        int[] iArr = this._outputEscapes;
        int i4 = this._maximumNonEscapedChar;
        if (i4 <= 0) {
            i4 = 65535;
        }
        CharacterEscapes characterEscapes = this._characterEscapes;
        while (i2 < i3) {
            int i5 = i2 + 1;
            char cCharAt = str.charAt(i2);
            if (cCharAt <= 127) {
                int i6 = iArr[cCharAt];
                if (i6 == 0) {
                    i_outputMultiByteChar = i_writeGenericEscape + 1;
                    bArr[i_writeGenericEscape] = (byte) cCharAt;
                    i_writeGenericEscape = i_outputMultiByteChar;
                    i2 = i5;
                } else if (i6 > 0) {
                    bArr[i_writeGenericEscape] = 92;
                    bArr[i_writeGenericEscape + 1] = (byte) i6;
                    i2 = i5;
                    i_writeGenericEscape += 2;
                } else {
                    if (i6 == -2) {
                        int i7 = i3 - i5;
                        SerializableString escapeSequence = characterEscapes.getEscapeSequence(cCharAt);
                        if (escapeSequence == null) {
                            _reportError("Invalid custom escape definitions; custom escape not found for character code 0x" + Integer.toHexString(cCharAt) + ", although was supposed to have one");
                        }
                        i_writeGenericEscape = _writeCustomEscape(bArr, i_writeGenericEscape, escapeSequence, i7);
                    } else {
                        i_writeGenericEscape = _writeGenericEscape(cCharAt, i_writeGenericEscape);
                    }
                    i2 = i5;
                }
            } else {
                if (cCharAt > i4) {
                    i_writeGenericEscape = _writeGenericEscape(cCharAt, i_writeGenericEscape);
                } else {
                    SerializableString escapeSequence2 = characterEscapes.getEscapeSequence(cCharAt);
                    if (escapeSequence2 != null) {
                        i_writeGenericEscape = _writeCustomEscape(bArr, i_writeGenericEscape, escapeSequence2, i3 - i5);
                    } else if (cCharAt <= 2047) {
                        bArr[i_writeGenericEscape] = (byte) ((cCharAt >> 6) | 192);
                        bArr[i_writeGenericEscape + 1] = (byte) ((cCharAt & '?') | 128);
                        i_writeGenericEscape += 2;
                    } else if (_isStartOfSurrogatePair(cCharAt) && JsonGenerator.Feature.COMBINE_UNICODE_SURROGATES_IN_UTF8.enabledIn(this._features) && i5 < i3) {
                        i2 += 2;
                        i_writeGenericEscape = _outputSurrogatePair(cCharAt, str.charAt(i5), i_writeGenericEscape);
                    } else {
                        i_outputMultiByteChar = _outputMultiByteChar(cCharAt, i_writeGenericEscape);
                        i_writeGenericEscape = i_outputMultiByteChar;
                    }
                }
                i2 = i5;
            }
        }
        this._outputTail = i_writeGenericEscape;
    }

    private int _writeGenericEscape(int i2, int i3) {
        byte[] bArr = this._outputBuffer;
        byte[] hexBytes = getHexBytes();
        bArr[i3] = 92;
        bArr[i3 + 1] = 117;
        int i4 = i3 + 2;
        int i5 = i3 + 3;
        if (i2 > 255) {
            int i6 = i2 >> 8;
            bArr[i4] = hexBytes[(i6 & 255) >> 4];
            bArr[i5] = hexBytes[i6 & 15];
            i2 &= 255;
        } else {
            bArr[i4] = StylePropertiesKt.LetterSpacingId;
            bArr[i5] = StylePropertiesKt.LetterSpacingId;
        }
        int i7 = i3 + 5;
        bArr[i3 + 4] = hexBytes[i2 >> 4];
        int i8 = i3 + 6;
        bArr[i7] = hexBytes[i2 & 15];
        return i8;
    }

    private final void _writeNull() throws IOException {
        if (this._outputTail + 4 >= this._outputEnd) {
            _flushBuffer();
        }
        System.arraycopy(NULL_BYTES, 0, this._outputBuffer, this._outputTail, 4);
        this._outputTail += 4;
    }

    private final void _writeQuotedInt(int i2) throws IOException {
        if (this._outputTail + 13 >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i3 = this._outputTail;
        int i4 = i3 + 1;
        this._outputTail = i4;
        bArr[i3] = this._quoteChar;
        int iOutputInt = NumberOutput.outputInt(i2, bArr, i4);
        byte[] bArr2 = this._outputBuffer;
        this._outputTail = iOutputInt + 1;
        bArr2[iOutputInt] = this._quoteChar;
    }

    private final void _writeQuotedLong(long j2) throws IOException {
        if (this._outputTail + 23 >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i2 = this._outputTail;
        int i3 = i2 + 1;
        this._outputTail = i3;
        bArr[i2] = this._quoteChar;
        int iOutputLong = NumberOutput.outputLong(j2, bArr, i3);
        byte[] bArr2 = this._outputBuffer;
        this._outputTail = iOutputLong + 1;
        bArr2[iOutputLong] = this._quoteChar;
    }

    private final void _writeQuotedRaw(String str) throws IOException {
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i2 = this._outputTail;
        this._outputTail = i2 + 1;
        bArr[i2] = this._quoteChar;
        writeRaw(str);
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr2 = this._outputBuffer;
        int i3 = this._outputTail;
        this._outputTail = i3 + 1;
        bArr2[i3] = this._quoteChar;
    }

    private final void _writeQuotedShort(short s) throws IOException {
        if (this._outputTail + 8 >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i2 = this._outputTail;
        int i3 = i2 + 1;
        this._outputTail = i3;
        bArr[i2] = this._quoteChar;
        int iOutputInt = NumberOutput.outputInt(s, bArr, i3);
        byte[] bArr2 = this._outputBuffer;
        this._outputTail = iOutputInt + 1;
        bArr2[iOutputInt] = this._quoteChar;
    }

    private void _writeRawSegment(char[] cArr, int i2, int i3) throws IOException {
        int i_outputRawMultiByteChar = 0;
        while (i_outputRawMultiByteChar < i3) {
            do {
                char c2 = cArr[i_outputRawMultiByteChar];
                i_outputRawMultiByteChar++;
                if (c2 <= 127) {
                    byte[] bArr = this._outputBuffer;
                    int i4 = this._outputTail;
                    this._outputTail = i4 + 1;
                    bArr[i4] = (byte) c2;
                } else if (c2 < 2048) {
                    byte[] bArr2 = this._outputBuffer;
                    int i5 = this._outputTail;
                    int i6 = i5 + 1;
                    this._outputTail = i6;
                    bArr2[i5] = (byte) ((c2 >> 6) | 192);
                    this._outputTail = i5 + 2;
                    bArr2[i6] = (byte) ((c2 & '?') | 128);
                } else {
                    i_outputRawMultiByteChar = _outputRawMultiByteChar(c2, cArr, i_outputRawMultiByteChar, i3);
                }
            } while (i_outputRawMultiByteChar < i3);
            return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001a, code lost:
    
        r1 = r7[r1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
    
        if (r1 >= 2048) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0020, code lost:
    
        r2 = r6._outputTail;
        r3 = r2 + 1;
        r6._outputTail = r3;
        r0[r2] = (byte) ((r1 >> 6) | 192);
        r6._outputTail = r2 + 2;
        r0[r3] = (byte) ((r1 & '?') | 128);
        r1 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003a, code lost:
    
        r1 = _outputRawMultiByteChar(r1, r7, r4, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0015, code lost:
    
        if ((r6._outputTail + 3) < r6._outputEnd) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0017, code lost:
    
        _flushBuffer();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void _writeSegmentedRaw(char[] r7, int r8, int r9) throws java.io.IOException {
        /*
            r6 = this;
            byte[] r0 = r6._outputBuffer
            r1 = r8
        L3:
            int r2 = r8 + r9
            if (r1 >= r2) goto L55
        L7:
            char r3 = r7[r1]
            int r4 = r1 + 1
            r5 = 127(0x7f, float:1.78E-43)
            if (r3 <= r5) goto L3f
            int r3 = r6._outputTail
            int r3 = r3 + 3
            int r5 = r6._outputEnd
            if (r3 < r5) goto L1a
            r6._flushBuffer()
        L1a:
            char r1 = r7[r1]
            r3 = 2048(0x800, float:2.87E-42)
            if (r1 >= r3) goto L3a
            int r2 = r6._outputTail
            int r3 = r2 + 1
            r6._outputTail = r3
            int r5 = r1 >> 6
            r5 = r5 | 192(0xc0, float:2.69E-43)
            byte r5 = (byte) r5
            r0[r2] = r5
            int r2 = r2 + 2
            r6._outputTail = r2
            r1 = r1 & 63
            r1 = r1 | 128(0x80, float:1.8E-43)
            byte r1 = (byte) r1
            r0[r3] = r1
            r1 = r4
            goto L3
        L3a:
            int r1 = r6._outputRawMultiByteChar(r1, r7, r4, r2)
            goto L3
        L3f:
            int r1 = r6._outputEnd
            int r5 = r6._outputTail
            if (r5 < r1) goto L48
            r6._flushBuffer()
        L48:
            byte r1 = (byte) r3
            int r3 = r6._outputTail
            int r5 = r3 + 1
            r6._outputTail = r5
            r0[r3] = r1
            if (r4 >= r2) goto L55
            r1 = r4
            goto L7
        L55:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.UTF8JsonGenerator._writeSegmentedRaw(char[], int, int):void");
    }

    private final void _writeStringSegment(String str, int i2, int i3) throws IOException {
        int i4;
        char cCharAt;
        int i5 = this._outputTail;
        byte[] bArr = this._outputBuffer;
        int[] iArr = this._outputEscapes;
        int i6 = i2;
        while (true) {
            i4 = i3 + i2;
            if (i6 >= i4 || (cCharAt = str.charAt(i6)) > 127 || iArr[cCharAt] != 0) {
                break;
            }
            bArr[i5] = (byte) cCharAt;
            i6++;
            i5++;
        }
        this._outputTail = i5;
        if (i6 < i4) {
            if (this._characterEscapes != null) {
                _writeCustomStringSegment2(str, i6, i4);
            } else if (this._maximumNonEscapedChar == 0) {
                _writeStringSegment2(str, i6, i4);
            } else {
                _writeStringSegmentASCII2(str, i6, i4);
            }
        }
    }

    private final void _writeStringSegment2(String str, int i2, int i3) throws IOException {
        int i_outputMultiByteChar;
        if (this._outputTail + ((i3 - i2) * 6) > this._outputEnd) {
            _flushBuffer();
        }
        int i_writeGenericEscape = this._outputTail;
        byte[] bArr = this._outputBuffer;
        int[] iArr = this._outputEscapes;
        while (i2 < i3) {
            int i4 = i2 + 1;
            char cCharAt = str.charAt(i2);
            if (cCharAt <= 127) {
                int i5 = iArr[cCharAt];
                if (i5 == 0) {
                    i_outputMultiByteChar = i_writeGenericEscape + 1;
                    bArr[i_writeGenericEscape] = (byte) cCharAt;
                    i_writeGenericEscape = i_outputMultiByteChar;
                    i2 = i4;
                } else if (i5 > 0) {
                    bArr[i_writeGenericEscape] = 92;
                    bArr[i_writeGenericEscape + 1] = (byte) i5;
                    i2 = i4;
                    i_writeGenericEscape += 2;
                } else {
                    i_writeGenericEscape = _writeGenericEscape(cCharAt, i_writeGenericEscape);
                    i2 = i4;
                }
            } else if (cCharAt <= 2047) {
                bArr[i_writeGenericEscape] = (byte) ((cCharAt >> 6) | 192);
                bArr[i_writeGenericEscape + 1] = (byte) ((cCharAt & '?') | 128);
                i_writeGenericEscape += 2;
                i2 = i4;
            } else if (_isStartOfSurrogatePair(cCharAt) && JsonGenerator.Feature.COMBINE_UNICODE_SURROGATES_IN_UTF8.enabledIn(this._features) && i4 < i3) {
                i2 += 2;
                i_writeGenericEscape = _outputSurrogatePair(cCharAt, str.charAt(i4), i_writeGenericEscape);
            } else {
                i_outputMultiByteChar = _outputMultiByteChar(cCharAt, i_writeGenericEscape);
                i_writeGenericEscape = i_outputMultiByteChar;
                i2 = i4;
            }
        }
        this._outputTail = i_writeGenericEscape;
    }

    private final void _writeStringSegmentASCII2(String str, int i2, int i3) throws IOException {
        if (this._outputTail + ((i3 - i2) * 6) > this._outputEnd) {
            _flushBuffer();
        }
        int i_outputMultiByteChar = this._outputTail;
        byte[] bArr = this._outputBuffer;
        int[] iArr = this._outputEscapes;
        int i4 = this._maximumNonEscapedChar;
        while (i2 < i3) {
            int i5 = i2 + 1;
            char cCharAt = str.charAt(i2);
            if (cCharAt <= 127) {
                int i6 = iArr[cCharAt];
                if (i6 == 0) {
                    bArr[i_outputMultiByteChar] = (byte) cCharAt;
                    i2 = i5;
                    i_outputMultiByteChar++;
                } else if (i6 > 0) {
                    bArr[i_outputMultiByteChar] = 92;
                    bArr[i_outputMultiByteChar + 1] = (byte) i6;
                    i2 = i5;
                    i_outputMultiByteChar += 2;
                } else {
                    i_outputMultiByteChar = _writeGenericEscape(cCharAt, i_outputMultiByteChar);
                }
            } else if (cCharAt > i4) {
                i_outputMultiByteChar = _writeGenericEscape(cCharAt, i_outputMultiByteChar);
            } else if (cCharAt <= 2047) {
                bArr[i_outputMultiByteChar] = (byte) ((cCharAt >> 6) | 192);
                bArr[i_outputMultiByteChar + 1] = (byte) ((cCharAt & '?') | 128);
                i_outputMultiByteChar += 2;
            } else {
                i_outputMultiByteChar = _outputMultiByteChar(cCharAt, i_outputMultiByteChar);
            }
            i2 = i5;
        }
        this._outputTail = i_outputMultiByteChar;
    }

    private final void _writeStringSegments(String str, boolean z) throws IOException {
        if (z) {
            if (this._outputTail >= this._outputEnd) {
                _flushBuffer();
            }
            byte[] bArr = this._outputBuffer;
            int i2 = this._outputTail;
            this._outputTail = i2 + 1;
            bArr[i2] = this._quoteChar;
        }
        int length = str.length();
        int i3 = 0;
        while (length > 0) {
            int iMin = Math.min(this._outputMaxContiguous, length);
            if (this._outputTail + iMin > this._outputEnd) {
                _flushBuffer();
            }
            _writeStringSegment(str, i3, iMin);
            i3 += iMin;
            length -= iMin;
        }
        if (z) {
            if (this._outputTail >= this._outputEnd) {
                _flushBuffer();
            }
            byte[] bArr2 = this._outputBuffer;
            int i4 = this._outputTail;
            this._outputTail = i4 + 1;
            bArr2[i4] = this._quoteChar;
        }
    }

    private final void _writeUTF8Segment(byte[] bArr, int i2, int i3) throws IOException {
        int[] iArr = this._outputEscapes;
        int i4 = i2;
        while (i4 < i2 + i3) {
            int i5 = i4 + 1;
            byte b2 = bArr[i4];
            if (b2 >= 0 && iArr[b2] != 0) {
                _writeUTF8Segment2(bArr, i2, i3);
                return;
            }
            i4 = i5;
        }
        if (this._outputTail + i3 > this._outputEnd) {
            _flushBuffer();
        }
        System.arraycopy(bArr, i2, this._outputBuffer, this._outputTail, i3);
        this._outputTail += i3;
    }

    private final void _writeUTF8Segment2(byte[] bArr, int i2, int i3) throws IOException {
        int i4;
        int i_writeGenericEscape = this._outputTail;
        if ((i3 * 6) + i_writeGenericEscape > this._outputEnd) {
            _flushBuffer();
            i_writeGenericEscape = this._outputTail;
        }
        byte[] bArr2 = this._outputBuffer;
        int[] iArr = this._outputEscapes;
        int i5 = i3 + i2;
        while (i2 < i5) {
            int i6 = i2 + 1;
            byte b2 = bArr[i2];
            if (b2 < 0 || (i4 = iArr[b2]) == 0) {
                bArr2[i_writeGenericEscape] = b2;
                i2 = i6;
                i_writeGenericEscape++;
            } else {
                if (i4 > 0) {
                    int i7 = i_writeGenericEscape + 1;
                    bArr2[i_writeGenericEscape] = 92;
                    i_writeGenericEscape += 2;
                    bArr2[i7] = (byte) i4;
                } else {
                    i_writeGenericEscape = _writeGenericEscape(b2, i_writeGenericEscape);
                }
                i2 = i6;
            }
        }
        this._outputTail = i_writeGenericEscape;
    }

    private final void _writeUTF8Segments(byte[] bArr, int i2, int i3) throws IOException {
        do {
            int iMin = Math.min(this._outputMaxContiguous, i3);
            _writeUTF8Segment(bArr, i2, iMin);
            i2 += iMin;
            i3 -= iMin;
        } while (i3 > 0);
    }

    private final void _writeUnq(SerializableString serializableString) throws IOException {
        int iAppendQuotedUTF8 = serializableString.appendQuotedUTF8(this._outputBuffer, this._outputTail);
        if (iAppendQuotedUTF8 < 0) {
            _writeBytes(serializableString.asQuotedUTF8());
        } else {
            this._outputTail += iAppendQuotedUTF8;
        }
    }

    private byte[] getHexBytes() {
        return this._cfgWriteHexUppercase ? HEX_BYTES_UPPER : HEX_BYTES_LOWER;
    }

    protected final void _flushBuffer() throws IOException {
        int i2 = this._outputTail;
        if (i2 > 0) {
            this._outputTail = 0;
            this._outputStream.write(this._outputBuffer, 0, i2);
        }
    }

    protected final void _outputSurrogates(int i2, int i3) throws IOException {
        int i_decodeSurrogate = _decodeSurrogate(i2, i3);
        if (this._outputTail + 4 > this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i4 = this._outputTail;
        int i5 = i4 + 1;
        this._outputTail = i5;
        bArr[i4] = (byte) ((i_decodeSurrogate >> 18) | 240);
        int i6 = i4 + 2;
        this._outputTail = i6;
        bArr[i5] = (byte) (((i_decodeSurrogate >> 12) & 63) | 128);
        int i7 = i4 + 3;
        this._outputTail = i7;
        bArr[i6] = (byte) (((i_decodeSurrogate >> 6) & 63) | 128);
        this._outputTail = i4 + 4;
        bArr[i7] = (byte) ((i_decodeSurrogate & 63) | 128);
    }

    protected void _releaseBuffers() {
        byte[] bArr = this._outputBuffer;
        if (bArr != null && this._bufferRecyclable) {
            this._outputBuffer = null;
            this._ioContext.releaseWriteEncodingBuffer(bArr);
        }
        char[] cArr = this._charBuffer;
        if (cArr != null) {
            this._charBuffer = null;
            this._ioContext.releaseConcatBuffer(cArr);
        }
    }

    @Override // com.fasterxml.jackson.core.base.GeneratorBase
    protected final void _verifyValueWrite(String str) throws IOException {
        byte b2;
        int iWriteValue = this._writeContext.writeValue();
        if (this._cfgPrettyPrinter != null) {
            _verifyPrettyValueWrite(str, iWriteValue);
            return;
        }
        if (iWriteValue == 1) {
            b2 = StylePropertiesKt.HyphensId;
        } else {
            if (iWriteValue != 2) {
                if (iWriteValue != 3) {
                    if (iWriteValue != 5) {
                        return;
                    }
                    _reportCantWriteValueExpectName(str);
                    return;
                }
                SerializableString serializableString = this._rootValueSeparator;
                if (serializableString != null) {
                    byte[] bArrAsUnquotedUTF8 = serializableString.asUnquotedUTF8();
                    if (bArrAsUnquotedUTF8.length > 0) {
                        _writeBytes(bArrAsUnquotedUTF8);
                        return;
                    }
                    return;
                }
                return;
            }
            b2 = 58;
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i2 = this._outputTail;
        this._outputTail = i2 + 1;
        bArr[i2] = b2;
    }

    protected final int _writeBinary(Base64Variant base64Variant, InputStream inputStream, byte[] bArr, int i2) throws IOException {
        int i3;
        UTF8JsonGenerator uTF8JsonGenerator;
        InputStream inputStream2;
        byte[] bArr2;
        int i_readMore;
        int i4 = 2;
        int maxLineLength = base64Variant.getMaxLineLength() >> 2;
        int i5 = -3;
        int i6 = i2;
        int i7 = 0;
        int i_readMore2 = 0;
        while (true) {
            i3 = this._outputEnd - 6;
            if (i6 <= 2) {
                uTF8JsonGenerator = this;
                inputStream2 = inputStream;
                bArr2 = bArr;
                break;
            }
            uTF8JsonGenerator = this;
            inputStream2 = inputStream;
            bArr2 = bArr;
            if (i7 > i5) {
                i_readMore2 = uTF8JsonGenerator._readMore(inputStream2, bArr2, i7, i_readMore2, i6);
                if (i_readMore2 < 3) {
                    i7 = 0;
                    break;
                }
                i5 = i_readMore2 - 3;
                i7 = 0;
            }
            if (uTF8JsonGenerator._outputTail > i3) {
                uTF8JsonGenerator._flushBuffer();
            }
            int i8 = i7 + 2;
            int i9 = ((bArr2[i7 + 1] & 255) | (bArr2[i7] << 8)) << 8;
            i7 += 3;
            i6 -= 3;
            int iEncodeBase64Chunk = base64Variant.encodeBase64Chunk(i9 | (bArr2[i8] & 255), uTF8JsonGenerator._outputBuffer, uTF8JsonGenerator._outputTail);
            uTF8JsonGenerator._outputTail = iEncodeBase64Chunk;
            maxLineLength--;
            if (maxLineLength <= 0) {
                byte[] bArr3 = uTF8JsonGenerator._outputBuffer;
                int i10 = iEncodeBase64Chunk + 1;
                uTF8JsonGenerator._outputTail = i10;
                bArr3[iEncodeBase64Chunk] = 92;
                uTF8JsonGenerator._outputTail = iEncodeBase64Chunk + 2;
                bArr3[i10] = 110;
                maxLineLength = base64Variant.getMaxLineLength() >> 2;
            }
            this = uTF8JsonGenerator;
            inputStream = inputStream2;
            bArr = bArr2;
        }
        if (i6 <= 0 || (i_readMore = uTF8JsonGenerator._readMore(inputStream2, bArr2, i7, i_readMore2, i6)) <= 0) {
            return i6;
        }
        if (uTF8JsonGenerator._outputTail > i3) {
            uTF8JsonGenerator._flushBuffer();
        }
        int i11 = bArr2[0] << StylePropertiesKt.BottomId;
        if (i_readMore > 1) {
            i11 |= (bArr2[1] & 255) << 8;
        } else {
            i4 = 1;
        }
        uTF8JsonGenerator._outputTail = base64Variant.encodeBase64Partial(i11, i4, uTF8JsonGenerator._outputBuffer, uTF8JsonGenerator._outputTail);
        return i6 - i4;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void _writePPFieldName(java.lang.String r6) throws java.io.IOException {
        /*
            r5 = this;
            com.fasterxml.jackson.core.json.JsonWriteContext r0 = r5._writeContext
            int r0 = r0.writeFieldName(r6)
            r1 = 4
            r2 = 1
            if (r0 != r1) goto L10
            java.lang.String r0 = "Can not write a field name, expecting a value"
            r5._reportError(r0)
            goto L18
        L10:
            if (r0 != r2) goto L18
            com.fasterxml.jackson.core.PrettyPrinter r0 = r5._cfgPrettyPrinter
            r0.writeObjectEntrySeparator(r5)
            goto L1d
        L18:
            com.fasterxml.jackson.core.PrettyPrinter r0 = r5._cfgPrettyPrinter
            r0.beforeObjectEntries(r5)
        L1d:
            boolean r0 = r5._cfgUnqNames
            r1 = 0
            if (r0 == 0) goto L26
            r5._writeStringSegments(r6, r1)
            return
        L26:
            int r0 = r6.length()
            int r3 = r5._charBufferLength
            if (r0 <= r3) goto L32
            r5._writeStringSegments(r6, r2)
            return
        L32:
            int r2 = r5._outputTail
            int r3 = r5._outputEnd
            if (r2 < r3) goto L3b
            r5._flushBuffer()
        L3b:
            byte[] r2 = r5._outputBuffer
            int r3 = r5._outputTail
            int r4 = r3 + 1
            r5._outputTail = r4
            byte r4 = r5._quoteChar
            r2[r3] = r4
            char[] r2 = r5._charBuffer
            r6.getChars(r1, r0, r2, r1)
            int r6 = r5._outputMaxContiguous
            if (r0 > r6) goto L60
            int r6 = r5._outputTail
            int r6 = r6 + r0
            int r2 = r5._outputEnd
            if (r6 <= r2) goto L5a
            r5._flushBuffer()
        L5a:
            char[] r6 = r5._charBuffer
            r5._writeStringSegment(r6, r1, r0)
            goto L65
        L60:
            char[] r6 = r5._charBuffer
            r5._writeStringSegments(r6, r1, r0)
        L65:
            int r6 = r5._outputTail
            int r0 = r5._outputEnd
            if (r6 < r0) goto L6e
            r5._flushBuffer()
        L6e:
            byte[] r6 = r5._outputBuffer
            int r0 = r5._outputTail
            int r1 = r0 + 1
            r5._outputTail = r1
            byte r5 = r5._quoteChar
            r6[r0] = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.UTF8JsonGenerator._writePPFieldName(java.lang.String):void");
    }

    @Override // com.fasterxml.jackson.core.base.GeneratorBase, com.fasterxml.jackson.core.JsonGenerator, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Exception {
        super.close();
        try {
            if (this._outputBuffer != null && isEnabled(JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT)) {
                while (true) {
                    JsonStreamContext outputContext = getOutputContext();
                    if (!outputContext.inArray()) {
                        if (!outputContext.inObject()) {
                            break;
                        } else {
                            writeEndObject();
                        }
                    } else {
                        writeEndArray();
                    }
                }
            }
            _flushBuffer();
            e = null;
        } catch (IOException e2) {
            e = e2;
        }
        this._outputTail = 0;
        if (this._outputStream != null) {
            try {
                if (this._ioContext.isResourceManaged() || isEnabled(JsonGenerator.Feature.AUTO_CLOSE_TARGET)) {
                    this._outputStream.close();
                } else if (isEnabled(JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM)) {
                    this._outputStream.flush();
                }
            } catch (IOException | RuntimeException e3) {
                if (e != null) {
                    e3.addSuppressed(e);
                }
                throw e3;
            }
        }
        _releaseBuffers();
        if (e != null) {
            throw e;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator, java.io.Flushable
    public void flush() throws IOException {
        _flushBuffer();
        if (this._outputStream == null || !isEnabled(JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM)) {
            return;
        }
        this._outputStream.flush();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public int getOutputBuffered() {
        return this._outputTail;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public Object getOutputTarget() {
        return this._outputStream;
    }

    @Override // com.fasterxml.jackson.core.base.GeneratorBase, com.fasterxml.jackson.core.JsonGenerator
    public int writeBinary(Base64Variant base64Variant, InputStream inputStream, int i2) throws IOException {
        _verifyValueWrite("write a binary value");
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i3 = this._outputTail;
        this._outputTail = i3 + 1;
        bArr[i3] = this._quoteChar;
        byte[] bArrAllocBase64Buffer = this._ioContext.allocBase64Buffer();
        try {
            if (i2 < 0) {
                i2 = _writeBinary(base64Variant, inputStream, bArrAllocBase64Buffer);
            } else {
                int i_writeBinary = _writeBinary(base64Variant, inputStream, bArrAllocBase64Buffer, i2);
                if (i_writeBinary > 0) {
                    _reportError("Too few bytes available: missing " + i_writeBinary + " bytes (out of " + i2 + ")");
                }
            }
            this._ioContext.releaseBase64Buffer(bArrAllocBase64Buffer);
            if (this._outputTail >= this._outputEnd) {
                _flushBuffer();
            }
            byte[] bArr2 = this._outputBuffer;
            int i4 = this._outputTail;
            this._outputTail = i4 + 1;
            bArr2[i4] = this._quoteChar;
            return i2;
        } catch (Throwable th) {
            this._ioContext.releaseBase64Buffer(bArrAllocBase64Buffer);
            throw th;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeBoolean(boolean z) throws IOException {
        _verifyValueWrite("write a boolean value");
        if (this._outputTail + 5 >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = z ? TRUE_BYTES : FALSE_BYTES;
        int length = bArr.length;
        System.arraycopy(bArr, 0, this._outputBuffer, this._outputTail, length);
        this._outputTail += length;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void writeEndArray() throws IOException {
        if (!this._writeContext.inArray()) {
            _reportError("Current context not Array but ".concat(String.valueOf(this._writeContext.typeDesc())));
        }
        PrettyPrinter prettyPrinter = this._cfgPrettyPrinter;
        if (prettyPrinter != null) {
            prettyPrinter.writeEndArray(this, this._writeContext.getEntryCount());
        } else {
            if (this._outputTail >= this._outputEnd) {
                _flushBuffer();
            }
            byte[] bArr = this._outputBuffer;
            int i2 = this._outputTail;
            this._outputTail = i2 + 1;
            bArr[i2] = 93;
        }
        this._writeContext = this._writeContext.clearAndGetParent();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void writeEndObject() throws IOException {
        if (!this._writeContext.inObject()) {
            _reportError("Current context not Object but ".concat(String.valueOf(this._writeContext.typeDesc())));
        }
        PrettyPrinter prettyPrinter = this._cfgPrettyPrinter;
        if (prettyPrinter != null) {
            prettyPrinter.writeEndObject(this, this._writeContext.getEntryCount());
        } else {
            if (this._outputTail >= this._outputEnd) {
                _flushBuffer();
            }
            byte[] bArr = this._outputBuffer;
            int i2 = this._outputTail;
            this._outputTail = i2 + 1;
            bArr[i2] = 125;
        }
        this._writeContext = this._writeContext.clearAndGetParent();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeFieldName(String str) throws IOException {
        if (this._cfgPrettyPrinter != null) {
            _writePPFieldName(str);
            return;
        }
        int iWriteFieldName = this._writeContext.writeFieldName(str);
        if (iWriteFieldName == 4) {
            _reportError("Can not write a field name, expecting a value");
        } else if (iWriteFieldName == 1) {
            if (this._outputTail >= this._outputEnd) {
                _flushBuffer();
            }
            byte[] bArr = this._outputBuffer;
            int i2 = this._outputTail;
            this._outputTail = i2 + 1;
            bArr[i2] = StylePropertiesKt.HyphensId;
        }
        if (this._cfgUnqNames) {
            _writeStringSegments(str, false);
            return;
        }
        int length = str.length();
        if (length > this._charBufferLength) {
            _writeStringSegments(str, true);
            return;
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr2 = this._outputBuffer;
        int i3 = this._outputTail;
        int i4 = i3 + 1;
        this._outputTail = i4;
        bArr2[i3] = this._quoteChar;
        if (length <= this._outputMaxContiguous) {
            if (i4 + length > this._outputEnd) {
                _flushBuffer();
            }
            _writeStringSegment(str, 0, length);
        } else {
            _writeStringSegments(str, 0, length);
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr3 = this._outputBuffer;
        int i5 = this._outputTail;
        this._outputTail = i5 + 1;
        bArr3[i5] = this._quoteChar;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNull() throws IOException {
        _verifyValueWrite("write a null");
        _writeNull();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(double d2) throws IOException {
        if (this._cfgNumbersAsStrings || (NumberOutput.notFinite(d2) && JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS.enabledIn(this._features))) {
            writeString(NumberOutput.toString(d2, isEnabled(JsonGenerator.Feature.USE_FAST_DOUBLE_WRITER)));
        } else {
            _verifyValueWrite("write a number");
            writeRaw(NumberOutput.toString(d2, isEnabled(JsonGenerator.Feature.USE_FAST_DOUBLE_WRITER)));
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void writeRaw(char[] cArr, int i2, int i3) throws IOException {
        _checkRangeBoundsForCharArray(cArr, i2, i3);
        int i4 = i3 + i3 + i3;
        int i5 = this._outputTail + i4;
        int i6 = this._outputEnd;
        if (i5 > i6) {
            if (i6 < i4) {
                _writeSegmentedRaw(cArr, i2, i3);
                return;
            }
            _flushBuffer();
        }
        int i7 = i3 + i2;
        while (i2 < i7) {
            do {
                char c2 = cArr[i2];
                i2++;
                if (c2 <= 127) {
                    byte[] bArr = this._outputBuffer;
                    int i8 = this._outputTail;
                    this._outputTail = i8 + 1;
                    bArr[i8] = (byte) c2;
                } else if (c2 < 2048) {
                    byte[] bArr2 = this._outputBuffer;
                    int i9 = this._outputTail;
                    int i10 = i9 + 1;
                    this._outputTail = i10;
                    bArr2[i9] = (byte) ((c2 >> 6) | 192);
                    this._outputTail = i9 + 2;
                    bArr2[i10] = (byte) ((c2 & '?') | 128);
                } else {
                    i2 = _outputRawMultiByteChar(c2, cArr, i2, i7);
                }
            } while (i2 < i7);
            return;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeRawUTF8String(byte[] bArr, int i2, int i3) throws IOException {
        _checkRangeBoundsForByteArray(bArr, i2, i3);
        _verifyValueWrite("write a string");
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr2 = this._outputBuffer;
        int i4 = this._outputTail;
        this._outputTail = i4 + 1;
        bArr2[i4] = this._quoteChar;
        _writeBytes(bArr, i2, i3);
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr3 = this._outputBuffer;
        int i5 = this._outputTail;
        this._outputTail = i5 + 1;
        bArr3[i5] = this._quoteChar;
    }

    @Override // com.fasterxml.jackson.core.base.GeneratorBase, com.fasterxml.jackson.core.JsonGenerator
    public void writeRawValue(SerializableString serializableString) throws IOException {
        _verifyValueWrite("write a raw (unencoded) value");
        int iAppendUnquotedUTF8 = serializableString.appendUnquotedUTF8(this._outputBuffer, this._outputTail);
        if (iAppendUnquotedUTF8 < 0) {
            _writeBytes(serializableString.asUnquotedUTF8());
        } else {
            this._outputTail += iAppendUnquotedUTF8;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void writeStartArray() throws IOException {
        _verifyValueWrite("start an array");
        this._writeContext = this._writeContext.createChildArrayContext();
        streamWriteConstraints().validateNestingDepth(this._writeContext.getNestingDepth());
        PrettyPrinter prettyPrinter = this._cfgPrettyPrinter;
        if (prettyPrinter != null) {
            prettyPrinter.writeStartArray(this);
            return;
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i2 = this._outputTail;
        this._outputTail = i2 + 1;
        bArr[i2] = 91;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void writeStartObject() throws IOException {
        _verifyValueWrite("start an object");
        this._writeContext = this._writeContext.createChildObjectContext();
        streamWriteConstraints().validateNestingDepth(this._writeContext.getNestingDepth());
        PrettyPrinter prettyPrinter = this._cfgPrettyPrinter;
        if (prettyPrinter != null) {
            prettyPrinter.writeStartObject(this);
            return;
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i2 = this._outputTail;
        this._outputTail = i2 + 1;
        bArr[i2] = 123;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeString(Reader reader, int i2) throws IOException {
        _verifyValueWrite("write a string");
        if (reader == null) {
            _reportError("null reader");
            return;
        }
        int i3 = i2 >= 0 ? i2 : Integer.MAX_VALUE;
        char[] cArr = this._charBuffer;
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i4 = this._outputTail;
        this._outputTail = i4 + 1;
        bArr[i4] = this._quoteChar;
        while (i3 > 0) {
            int i5 = reader.read(cArr, 0, Math.min(i3, cArr.length));
            if (i5 <= 0) {
                break;
            }
            if (this._outputTail + i2 >= this._outputEnd) {
                _flushBuffer();
            }
            _writeStringSegments(cArr, 0, i5);
            i3 -= i5;
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr2 = this._outputBuffer;
        int i6 = this._outputTail;
        this._outputTail = i6 + 1;
        bArr2[i6] = this._quoteChar;
        if (i3 <= 0 || i2 < 0) {
            return;
        }
        _reportError("Didn't read enough from reader");
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeUTF8String(byte[] bArr, int i2, int i3) throws IOException {
        _checkRangeBoundsForByteArray(bArr, i2, i3);
        _verifyValueWrite("write a string");
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr2 = this._outputBuffer;
        int i4 = this._outputTail;
        this._outputTail = i4 + 1;
        bArr2[i4] = this._quoteChar;
        if (i3 <= this._outputMaxContiguous) {
            _writeUTF8Segment(bArr, i2, i3);
        } else {
            _writeUTF8Segments(bArr, i2, i3);
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr3 = this._outputBuffer;
        int i5 = this._outputTail;
        this._outputTail = i5 + 1;
        bArr3[i5] = this._quoteChar;
    }

    private final void _writeBytes(byte[] bArr, int i2, int i3) throws IOException {
        if (this._outputTail + i3 > this._outputEnd) {
            _flushBuffer();
            if (i3 > 512) {
                this._outputStream.write(bArr, i2, i3);
                return;
            }
        }
        System.arraycopy(bArr, i2, this._outputBuffer, this._outputTail, i3);
        this._outputTail += i3;
    }

    private void _writeQuotedRaw(char[] cArr, int i2, int i3) throws IOException {
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i4 = this._outputTail;
        this._outputTail = i4 + 1;
        bArr[i4] = this._quoteChar;
        writeRaw(cArr, i2, i3);
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr2 = this._outputBuffer;
        int i5 = this._outputTail;
        this._outputTail = i5 + 1;
        bArr2[i5] = this._quoteChar;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(float f2) throws IOException {
        if (!this._cfgNumbersAsStrings && (!NumberOutput.notFinite(f2) || !JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS.enabledIn(this._features))) {
            _verifyValueWrite("write a number");
            writeRaw(NumberOutput.toString(f2, isEnabled(JsonGenerator.Feature.USE_FAST_DOUBLE_WRITER)));
        } else {
            writeString(NumberOutput.toString(f2, isEnabled(JsonGenerator.Feature.USE_FAST_DOUBLE_WRITER)));
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void writeStartArray(Object obj) throws IOException {
        _verifyValueWrite("start an array");
        this._writeContext = this._writeContext.createChildArrayContext(obj);
        streamWriteConstraints().validateNestingDepth(this._writeContext.getNestingDepth());
        PrettyPrinter prettyPrinter = this._cfgPrettyPrinter;
        if (prettyPrinter != null) {
            prettyPrinter.writeStartArray(this);
            return;
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i2 = this._outputTail;
        this._outputTail = i2 + 1;
        bArr[i2] = 91;
    }

    @Override // com.fasterxml.jackson.core.base.GeneratorBase, com.fasterxml.jackson.core.JsonGenerator
    public void writeStartObject(Object obj) throws IOException {
        _verifyValueWrite("start an object");
        JsonWriteContext jsonWriteContextCreateChildObjectContext = this._writeContext.createChildObjectContext(obj);
        streamWriteConstraints().validateNestingDepth(jsonWriteContextCreateChildObjectContext.getNestingDepth());
        this._writeContext = jsonWriteContextCreateChildObjectContext;
        PrettyPrinter prettyPrinter = this._cfgPrettyPrinter;
        if (prettyPrinter != null) {
            prettyPrinter.writeStartObject(this);
            return;
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i2 = this._outputTail;
        this._outputTail = i2 + 1;
        bArr[i2] = 123;
    }

    private final void _writeStringSegment(char[] cArr, int i2, int i3) throws IOException {
        int i4;
        char c2;
        int i5 = this._outputTail;
        byte[] bArr = this._outputBuffer;
        int[] iArr = this._outputEscapes;
        int i6 = i2;
        while (true) {
            i4 = i3 + i2;
            if (i6 >= i4 || (c2 = cArr[i6]) > 127 || iArr[c2] != 0) {
                break;
            }
            bArr[i5] = (byte) c2;
            i6++;
            i5++;
        }
        this._outputTail = i5;
        if (i6 < i4) {
            if (this._characterEscapes != null) {
                _writeCustomStringSegment2(cArr, i6, i4);
            } else if (this._maximumNonEscapedChar == 0) {
                _writeStringSegment2(cArr, i6, i4);
            } else {
                _writeStringSegmentASCII2(cArr, i6, i4);
            }
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(int i2) throws IOException {
        _verifyValueWrite("write a number");
        if (this._outputTail + 11 >= this._outputEnd) {
            _flushBuffer();
        }
        if (this._cfgNumbersAsStrings) {
            _writeQuotedInt(i2);
        } else {
            this._outputTail = NumberOutput.outputInt(i2, this._outputBuffer, this._outputTail);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeStartArray(Object obj, int i2) throws IOException {
        _verifyValueWrite("start an array");
        this._writeContext = this._writeContext.createChildArrayContext(obj);
        streamWriteConstraints().validateNestingDepth(this._writeContext.getNestingDepth());
        PrettyPrinter prettyPrinter = this._cfgPrettyPrinter;
        if (prettyPrinter != null) {
            prettyPrinter.writeStartArray(this);
            return;
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i3 = this._outputTail;
        this._outputTail = i3 + 1;
        bArr[i3] = 91;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeStartObject(Object obj, int i2) {
        writeStartObject(obj);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(long j2) throws IOException {
        _verifyValueWrite("write a number");
        if (this._cfgNumbersAsStrings) {
            _writeQuotedLong(j2);
            return;
        }
        if (this._outputTail + 21 >= this._outputEnd) {
            _flushBuffer();
        }
        this._outputTail = NumberOutput.outputLong(j2, this._outputBuffer, this._outputTail);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(String str) throws IOException {
        _verifyValueWrite("write a number");
        if (str == null) {
            _writeNull();
        } else if (this._cfgNumbersAsStrings) {
            _writeQuotedRaw(str);
        } else {
            writeRaw(str);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(BigDecimal bigDecimal) throws IOException {
        _verifyValueWrite("write a number");
        if (bigDecimal == null) {
            _writeNull();
        } else if (this._cfgNumbersAsStrings) {
            _writeQuotedRaw(_asString(bigDecimal));
        } else {
            writeRaw(_asString(bigDecimal));
        }
    }

    private final void _writeStringSegments(String str, int i2, int i3) throws IOException {
        int i4 = 0;
        do {
            int iMin = Math.min(this._outputMaxContiguous, i3);
            if (this._outputTail + iMin > this._outputEnd) {
                _flushBuffer();
            }
            _writeStringSegment(str, i4, iMin);
            i4 += iMin;
            i3 -= iMin;
        } while (i3 > 0);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(BigInteger bigInteger) throws IOException {
        _verifyValueWrite("write a number");
        if (bigInteger == null) {
            _writeNull();
        } else if (this._cfgNumbersAsStrings) {
            _writeQuotedRaw(bigInteger.toString());
        } else {
            writeRaw(bigInteger.toString());
        }
    }

    private final void _writeStringSegments(char[] cArr, int i2, int i3) throws IOException {
        do {
            int iMin = Math.min(this._outputMaxContiguous, i3);
            if (this._outputTail + iMin > this._outputEnd) {
                _flushBuffer();
            }
            _writeStringSegment(cArr, i2, iMin);
            i2 += iMin;
            i3 -= iMin;
        } while (i3 > 0);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(short s) throws IOException {
        _verifyValueWrite("write a number");
        if (this._outputTail + 6 >= this._outputEnd) {
            _flushBuffer();
        }
        if (this._cfgNumbersAsStrings) {
            _writeQuotedShort(s);
        } else {
            this._outputTail = NumberOutput.outputInt(s, this._outputBuffer, this._outputTail);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeRaw(SerializableString serializableString) throws IOException {
        int iAppendUnquotedUTF8 = serializableString.appendUnquotedUTF8(this._outputBuffer, this._outputTail);
        if (iAppendUnquotedUTF8 < 0) {
            _writeBytes(serializableString.asUnquotedUTF8());
        } else {
            this._outputTail += iAppendUnquotedUTF8;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(char[] cArr, int i2, int i3) throws IOException {
        _verifyValueWrite("write a number");
        if (this._cfgNumbersAsStrings) {
            _writeQuotedRaw(cArr, i2, i3);
        } else {
            writeRaw(cArr, i2, i3);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeRaw(String str) throws IOException {
        int length = str.length();
        char[] cArr = this._charBuffer;
        if (length <= cArr.length) {
            str.getChars(0, length, cArr, 0);
            writeRaw(cArr, 0, length);
        } else {
            writeRaw(str, 0, length);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeRaw(String str, int i2, int i3) throws IOException {
        int i4;
        char c2;
        _checkRangeBoundsForString(str, i2, i3);
        char[] cArr = this._charBuffer;
        int length = cArr.length;
        if (i3 <= length) {
            str.getChars(i2, i2 + i3, cArr, 0);
            writeRaw(cArr, 0, i3);
            return;
        }
        int i5 = this._outputEnd;
        int iMin = Math.min(length, (i5 >> 2) + (i5 >> 4));
        int i6 = iMin * 3;
        while (i3 > 0) {
            int iMin2 = Math.min(iMin, i3);
            str.getChars(i2, i2 + iMin2, cArr, 0);
            if (this._outputTail + i6 > this._outputEnd) {
                _flushBuffer();
            }
            if (iMin2 > 1 && (c2 = cArr[iMin2 - 1]) >= 55296 && c2 <= 56319) {
                iMin2 = i4;
            }
            _writeRawSegment(cArr, 0, iMin2);
            i2 += iMin2;
            i3 -= iMin2;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeRaw(char c2) throws IOException {
        if (this._outputTail + 3 >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        if (c2 <= 127) {
            int i2 = this._outputTail;
            this._outputTail = i2 + 1;
            bArr[i2] = (byte) c2;
        } else {
            if (c2 < 2048) {
                int i3 = this._outputTail;
                int i4 = i3 + 1;
                this._outputTail = i4;
                bArr[i3] = (byte) ((c2 >> 6) | 192);
                this._outputTail = i3 + 2;
                bArr[i4] = (byte) ((c2 & '?') | 128);
                return;
            }
            _outputRawMultiByteChar(c2, null, 0, 0);
        }
    }

    @Override // com.fasterxml.jackson.core.base.GeneratorBase, com.fasterxml.jackson.core.JsonGenerator
    public final void writeString(SerializableString serializableString) throws IOException {
        _verifyValueWrite("write a string");
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i2 = this._outputTail;
        int i3 = i2 + 1;
        this._outputTail = i3;
        bArr[i2] = this._quoteChar;
        int iAppendQuotedUTF8 = serializableString.appendQuotedUTF8(bArr, i3);
        if (iAppendQuotedUTF8 < 0) {
            _writeBytes(serializableString.asQuotedUTF8());
        } else {
            this._outputTail += iAppendQuotedUTF8;
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr2 = this._outputBuffer;
        int i4 = this._outputTail;
        this._outputTail = i4 + 1;
        bArr2[i4] = this._quoteChar;
    }

    private final void _writeStringSegmentASCII2(char[] cArr, int i2, int i3) throws IOException {
        if (this._outputTail + ((i3 - i2) * 6) > this._outputEnd) {
            _flushBuffer();
        }
        int i_outputMultiByteChar = this._outputTail;
        byte[] bArr = this._outputBuffer;
        int[] iArr = this._outputEscapes;
        int i4 = this._maximumNonEscapedChar;
        while (i2 < i3) {
            int i5 = i2 + 1;
            char c2 = cArr[i2];
            if (c2 <= 127) {
                int i6 = iArr[c2];
                if (i6 == 0) {
                    bArr[i_outputMultiByteChar] = (byte) c2;
                    i2 = i5;
                    i_outputMultiByteChar++;
                } else if (i6 > 0) {
                    bArr[i_outputMultiByteChar] = 92;
                    bArr[i_outputMultiByteChar + 1] = (byte) i6;
                    i2 = i5;
                    i_outputMultiByteChar += 2;
                } else {
                    i_outputMultiByteChar = _writeGenericEscape(c2, i_outputMultiByteChar);
                }
            } else if (c2 > i4) {
                i_outputMultiByteChar = _writeGenericEscape(c2, i_outputMultiByteChar);
            } else if (c2 <= 2047) {
                bArr[i_outputMultiByteChar] = (byte) ((c2 >> 6) | 192);
                bArr[i_outputMultiByteChar + 1] = (byte) ((c2 & '?') | 128);
                i_outputMultiByteChar += 2;
            } else {
                i_outputMultiByteChar = _outputMultiByteChar(c2, i_outputMultiByteChar);
            }
            i2 = i5;
        }
        this._outputTail = i_outputMultiByteChar;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeBinary(Base64Variant base64Variant, byte[] bArr, int i2, int i3) throws IOException {
        _checkRangeBoundsForByteArray(bArr, i2, i3);
        _verifyValueWrite("write a binary value");
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr2 = this._outputBuffer;
        int i4 = this._outputTail;
        this._outputTail = i4 + 1;
        bArr2[i4] = this._quoteChar;
        _writeBinary(base64Variant, bArr, i2, i3 + i2);
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr3 = this._outputBuffer;
        int i5 = this._outputTail;
        this._outputTail = i5 + 1;
        bArr3[i5] = this._quoteChar;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeString(String str) throws IOException {
        _verifyValueWrite("write a string");
        if (str == null) {
            _writeNull();
            return;
        }
        int i2 = this._outputMaxContiguous;
        int length = str.length();
        if (length > i2) {
            _writeStringSegments(str, true);
            return;
        }
        if (this._outputTail + length >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i3 = this._outputTail;
        this._outputTail = i3 + 1;
        bArr[i3] = this._quoteChar;
        _writeStringSegment(str, 0, length);
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr2 = this._outputBuffer;
        int i4 = this._outputTail;
        this._outputTail = i4 + 1;
        bArr2[i4] = this._quoteChar;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeString(char[] cArr, int i2, int i3) throws IOException {
        _verifyValueWrite("write a string");
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i4 = this._outputTail;
        int i5 = i4 + 1;
        this._outputTail = i5;
        bArr[i4] = this._quoteChar;
        if (i3 <= this._outputMaxContiguous) {
            if (i5 + i3 > this._outputEnd) {
                _flushBuffer();
            }
            _writeStringSegment(cArr, i2, i3);
        } else {
            _writeStringSegments(cArr, i2, i3);
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr2 = this._outputBuffer;
        int i6 = this._outputTail;
        this._outputTail = i6 + 1;
        bArr2[i6] = this._quoteChar;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void _writePPFieldName(com.fasterxml.jackson.core.SerializableString r5) throws java.io.IOException {
        /*
            r4 = this;
            com.fasterxml.jackson.core.json.JsonWriteContext r0 = r4._writeContext
            java.lang.String r1 = r5.getValue()
            int r0 = r0.writeFieldName(r1)
            r1 = 4
            if (r0 != r1) goto L13
            java.lang.String r0 = "Can not write a field name, expecting a value"
            r4._reportError(r0)
            goto L1c
        L13:
            r1 = 1
            if (r0 != r1) goto L1c
            com.fasterxml.jackson.core.PrettyPrinter r0 = r4._cfgPrettyPrinter
            r0.writeObjectEntrySeparator(r4)
            goto L21
        L1c:
            com.fasterxml.jackson.core.PrettyPrinter r0 = r4._cfgPrettyPrinter
            r0.beforeObjectEntries(r4)
        L21:
            boolean r0 = r4._cfgUnqNames
            if (r0 != 0) goto L3a
            int r1 = r4._outputTail
            int r2 = r4._outputEnd
            if (r1 < r2) goto L2e
            r4._flushBuffer()
        L2e:
            byte[] r1 = r4._outputBuffer
            int r2 = r4._outputTail
            int r3 = r2 + 1
            r4._outputTail = r3
            byte r3 = r4._quoteChar
            r1[r2] = r3
        L3a:
            byte[] r1 = r4._outputBuffer
            int r2 = r4._outputTail
            int r1 = r5.appendQuotedUTF8(r1, r2)
            if (r1 >= 0) goto L4c
            byte[] r5 = r5.asQuotedUTF8()
            r4._writeBytes(r5)
            goto L51
        L4c:
            int r5 = r4._outputTail
            int r5 = r5 + r1
            r4._outputTail = r5
        L51:
            if (r0 != 0) goto L68
            int r5 = r4._outputTail
            int r0 = r4._outputEnd
            if (r5 < r0) goto L5c
            r4._flushBuffer()
        L5c:
            byte[] r5 = r4._outputBuffer
            int r0 = r4._outputTail
            int r1 = r0 + 1
            r4._outputTail = r1
            byte r4 = r4._quoteChar
            r5[r0] = r4
        L68:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.UTF8JsonGenerator._writePPFieldName(com.fasterxml.jackson.core.SerializableString):void");
    }

    private final void _writeStringSegment2(char[] cArr, int i2, int i3) throws IOException {
        int i_outputMultiByteChar;
        if (this._outputTail + ((i3 - i2) * 6) > this._outputEnd) {
            _flushBuffer();
        }
        int i_writeGenericEscape = this._outputTail;
        byte[] bArr = this._outputBuffer;
        int[] iArr = this._outputEscapes;
        while (i2 < i3) {
            int i4 = i2 + 1;
            char c2 = cArr[i2];
            if (c2 <= 127) {
                int i5 = iArr[c2];
                if (i5 == 0) {
                    i_outputMultiByteChar = i_writeGenericEscape + 1;
                    bArr[i_writeGenericEscape] = (byte) c2;
                    i_writeGenericEscape = i_outputMultiByteChar;
                    i2 = i4;
                } else if (i5 > 0) {
                    bArr[i_writeGenericEscape] = 92;
                    bArr[i_writeGenericEscape + 1] = (byte) i5;
                    i2 = i4;
                    i_writeGenericEscape += 2;
                } else {
                    i_writeGenericEscape = _writeGenericEscape(c2, i_writeGenericEscape);
                    i2 = i4;
                }
            } else if (c2 <= 2047) {
                bArr[i_writeGenericEscape] = (byte) ((c2 >> 6) | 192);
                bArr[i_writeGenericEscape + 1] = (byte) ((c2 & '?') | 128);
                i_writeGenericEscape += 2;
                i2 = i4;
            } else if (_isStartOfSurrogatePair(c2) && JsonGenerator.Feature.COMBINE_UNICODE_SURROGATES_IN_UTF8.enabledIn(this._features) && i4 < i3) {
                i2 += 2;
                i_writeGenericEscape = _outputSurrogatePair(c2, cArr[i4], i_writeGenericEscape);
            } else {
                i_outputMultiByteChar = _outputMultiByteChar(c2, i_writeGenericEscape);
                i_writeGenericEscape = i_outputMultiByteChar;
                i2 = i4;
            }
        }
        this._outputTail = i_writeGenericEscape;
    }

    @Override // com.fasterxml.jackson.core.base.GeneratorBase, com.fasterxml.jackson.core.JsonGenerator
    public void writeFieldName(SerializableString serializableString) throws IOException {
        if (this._cfgPrettyPrinter != null) {
            _writePPFieldName(serializableString);
            return;
        }
        int iWriteFieldName = this._writeContext.writeFieldName(serializableString.getValue());
        if (iWriteFieldName == 4) {
            _reportError("Can not write a field name, expecting a value");
        } else if (iWriteFieldName == 1) {
            if (this._outputTail >= this._outputEnd) {
                _flushBuffer();
            }
            byte[] bArr = this._outputBuffer;
            int i2 = this._outputTail;
            this._outputTail = i2 + 1;
            bArr[i2] = StylePropertiesKt.HyphensId;
        }
        if (this._cfgUnqNames) {
            _writeUnq(serializableString);
            return;
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr2 = this._outputBuffer;
        int i3 = this._outputTail;
        int i4 = i3 + 1;
        this._outputTail = i4;
        bArr2[i3] = this._quoteChar;
        int iAppendQuotedUTF8 = serializableString.appendQuotedUTF8(bArr2, i4);
        if (iAppendQuotedUTF8 < 0) {
            _writeBytes(serializableString.asQuotedUTF8());
        } else {
            this._outputTail += iAppendQuotedUTF8;
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr3 = this._outputBuffer;
        int i5 = this._outputTail;
        this._outputTail = i5 + 1;
        bArr3[i5] = this._quoteChar;
    }

    protected final int _writeBinary(Base64Variant base64Variant, InputStream inputStream, byte[] bArr) throws IOException {
        int i2;
        byte[] bArr2 = bArr;
        int i3 = 2;
        int i4 = -3;
        int maxLineLength = base64Variant.getMaxLineLength() >> 2;
        int i5 = 0;
        int i_readMore = 0;
        int i6 = 0;
        while (true) {
            i2 = this._outputEnd - 6;
            if (i5 > i4) {
                i_readMore = _readMore(inputStream, bArr2, i5, i_readMore, bArr2.length);
                if (i_readMore < 3) {
                    break;
                }
                i4 = i_readMore - 3;
                i5 = 0;
            }
            if (this._outputTail > i2) {
                _flushBuffer();
            }
            int i7 = i5 + 2;
            int i8 = ((bArr[i5 + 1] & 255) | (bArr[i5] << 8)) << 8;
            i5 += 3;
            i6 += 3;
            int iEncodeBase64Chunk = base64Variant.encodeBase64Chunk(i8 | (bArr[i7] & 255), this._outputBuffer, this._outputTail);
            this._outputTail = iEncodeBase64Chunk;
            maxLineLength--;
            if (maxLineLength <= 0) {
                byte[] bArr3 = this._outputBuffer;
                int i9 = iEncodeBase64Chunk + 1;
                this._outputTail = i9;
                bArr3[iEncodeBase64Chunk] = 92;
                this._outputTail = iEncodeBase64Chunk + 2;
                bArr3[i9] = 110;
                maxLineLength = base64Variant.getMaxLineLength() >> 2;
            }
            bArr2 = bArr;
        }
        if (i_readMore <= 0) {
            return i6;
        }
        if (this._outputTail > i2) {
            _flushBuffer();
        }
        int i10 = bArr[0] << StylePropertiesKt.BottomId;
        if (i_readMore > 1) {
            i10 |= (bArr[1] & 255) << 8;
        } else {
            i3 = 1;
        }
        int i11 = i6 + i3;
        this._outputTail = base64Variant.encodeBase64Partial(i10, i3, this._outputBuffer, this._outputTail);
        return i11;
    }

    protected final void _writeBinary(Base64Variant base64Variant, byte[] bArr, int i2, int i3) throws IOException {
        int i4;
        int iEncodeBase64Chunk;
        int maxLineLength = base64Variant.getMaxLineLength();
        int i5 = 2;
        loop0: while (true) {
            int i6 = maxLineLength >> 2;
            do {
                int i7 = i3 - 3;
                i4 = this._outputEnd - 6;
                if (i2 > i7) {
                    break loop0;
                }
                if (this._outputTail > i4) {
                    _flushBuffer();
                }
                int i8 = i2 + 2;
                int i9 = ((bArr[i2 + 1] & 255) | (bArr[i2] << 8)) << 8;
                i2 += 3;
                iEncodeBase64Chunk = base64Variant.encodeBase64Chunk(i9 | (bArr[i8] & 255), this._outputBuffer, this._outputTail);
                this._outputTail = iEncodeBase64Chunk;
                i6--;
            } while (i6 > 0);
            byte[] bArr2 = this._outputBuffer;
            int i10 = iEncodeBase64Chunk + 1;
            this._outputTail = i10;
            bArr2[iEncodeBase64Chunk] = 92;
            this._outputTail = iEncodeBase64Chunk + 2;
            bArr2[i10] = 110;
            maxLineLength = base64Variant.getMaxLineLength();
        }
        int i11 = i3 - i2;
        if (i11 > 0) {
            if (this._outputTail > i4) {
                _flushBuffer();
            }
            int i12 = i2 + 1;
            int i13 = bArr[i2] << StylePropertiesKt.BottomId;
            if (i11 == 2) {
                i13 |= (bArr[i12] & 255) << 8;
            } else {
                i5 = i11;
            }
            this._outputTail = base64Variant.encodeBase64Partial(i13, i5, this._outputBuffer, this._outputTail);
        }
    }

    private final void _writeCustomStringSegment2(char[] cArr, int i2, int i3) throws IOException {
        int i_outputMultiByteChar;
        if (this._outputTail + ((i3 - i2) * 6) > this._outputEnd) {
            _flushBuffer();
        }
        int i_writeGenericEscape = this._outputTail;
        byte[] bArr = this._outputBuffer;
        int[] iArr = this._outputEscapes;
        int i4 = this._maximumNonEscapedChar;
        if (i4 <= 0) {
            i4 = 65535;
        }
        CharacterEscapes characterEscapes = this._characterEscapes;
        while (i2 < i3) {
            int i5 = i2 + 1;
            char c2 = cArr[i2];
            if (c2 <= 127) {
                int i6 = iArr[c2];
                if (i6 == 0) {
                    i_outputMultiByteChar = i_writeGenericEscape + 1;
                    bArr[i_writeGenericEscape] = (byte) c2;
                    i_writeGenericEscape = i_outputMultiByteChar;
                    i2 = i5;
                } else if (i6 > 0) {
                    bArr[i_writeGenericEscape] = 92;
                    bArr[i_writeGenericEscape + 1] = (byte) i6;
                    i2 = i5;
                    i_writeGenericEscape += 2;
                } else {
                    if (i6 == -2) {
                        int i7 = i3 - i5;
                        SerializableString escapeSequence = characterEscapes.getEscapeSequence(c2);
                        if (escapeSequence == null) {
                            _reportError("Invalid custom escape definitions; custom escape not found for character code 0x" + Integer.toHexString(c2) + ", although was supposed to have one");
                        }
                        i_writeGenericEscape = _writeCustomEscape(bArr, i_writeGenericEscape, escapeSequence, i7);
                    } else {
                        i_writeGenericEscape = _writeGenericEscape(c2, i_writeGenericEscape);
                    }
                    i2 = i5;
                }
            } else {
                if (c2 > i4) {
                    i_writeGenericEscape = _writeGenericEscape(c2, i_writeGenericEscape);
                } else {
                    SerializableString escapeSequence2 = characterEscapes.getEscapeSequence(c2);
                    if (escapeSequence2 != null) {
                        i_writeGenericEscape = _writeCustomEscape(bArr, i_writeGenericEscape, escapeSequence2, i3 - i5);
                    } else if (c2 <= 2047) {
                        bArr[i_writeGenericEscape] = (byte) ((c2 >> 6) | 192);
                        bArr[i_writeGenericEscape + 1] = (byte) ((c2 & '?') | 128);
                        i_writeGenericEscape += 2;
                    } else if (_isStartOfSurrogatePair(c2) && JsonGenerator.Feature.COMBINE_UNICODE_SURROGATES_IN_UTF8.enabledIn(this._features) && i5 < i3) {
                        i2 += 2;
                        i_writeGenericEscape = _outputSurrogatePair(c2, cArr[i5], i_writeGenericEscape);
                    } else {
                        i_outputMultiByteChar = _outputMultiByteChar(c2, i_writeGenericEscape);
                        i_writeGenericEscape = i_outputMultiByteChar;
                    }
                }
                i2 = i5;
            }
        }
        this._outputTail = i_writeGenericEscape;
    }
}
