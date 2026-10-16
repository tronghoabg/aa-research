package com.fasterxml.jackson.core.json;

import androidx.compose.foundation.style.StylePropertiesKt;
import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonStreamContext;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.PrettyPrinter;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.core.io.CharTypes;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.io.NumberOutput;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class WriterBasedJsonGenerator extends JsonGeneratorImpl {
    protected char[] _copyBuffer;
    protected SerializableString _currentEscape;
    protected char[] _entityBuffer;
    protected char[] _outputBuffer;
    protected int _outputEnd;
    protected int _outputHead;
    protected int _outputTail;
    protected char _quoteChar;
    protected final Writer _writer;
    protected static final char[] HEX_CHARS_UPPER = CharTypes.copyHexChars(true);
    protected static final char[] HEX_CHARS_LOWER = CharTypes.copyHexChars(false);

    public WriterBasedJsonGenerator(IOContext iOContext, int i2, ObjectCodec objectCodec, Writer writer, char c2) {
        super(iOContext, i2, objectCodec);
        this._writer = writer;
        char[] cArrAllocConcatBuffer = iOContext.allocConcatBuffer();
        this._outputBuffer = cArrAllocConcatBuffer;
        this._outputEnd = cArrAllocConcatBuffer.length;
        this._quoteChar = c2;
        boolean zIsEnabled = isEnabled(JsonWriteFeature.ESCAPE_FORWARD_SLASHES.mappedFeature());
        if (c2 == '\"') {
            if (!zIsEnabled) {
                return;
            }
            zIsEnabled = true;
            c2 = '\"';
        }
        this._outputEscapes = CharTypes.get7BitOutputEscapes(c2, zIsEnabled);
    }

    private char[] _allocateCopyBuffer() {
        char[] cArr = this._copyBuffer;
        if (cArr != null) {
            return cArr;
        }
        char[] cArrAllocNameCopyBuffer = this._ioContext.allocNameCopyBuffer(2000);
        this._copyBuffer = cArrAllocNameCopyBuffer;
        return cArrAllocNameCopyBuffer;
    }

    private char[] _allocateEntityBuffer() {
        char[] cArr = {'\\', 0, '\\', 'u', '0', '0', 0, 0, '\\', 'u', 0, 0, 0, 0};
        this._entityBuffer = cArr;
        return cArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v10 */
    private void _appendCharacterEscape(char c2, int i2) throws IOException {
        String value;
        char c3;
        if (i2 >= 0) {
            if (this._outputTail + 2 > this._outputEnd) {
                _flushBuffer();
            }
            char[] cArr = this._outputBuffer;
            int i3 = this._outputTail;
            int i4 = i3 + 1;
            this._outputTail = i4;
            cArr[i3] = '\\';
            this._outputTail = i3 + 2;
            cArr[i4] = (char) i2;
            return;
        }
        if (i2 == -2) {
            SerializableString serializableString = this._currentEscape;
            if (serializableString == null) {
                value = this._characterEscapes.getEscapeSequence(c2).getValue();
            } else {
                value = serializableString.getValue();
                this._currentEscape = null;
            }
            int length = value.length();
            if (this._outputTail + length > this._outputEnd) {
                _flushBuffer();
                if (length > this._outputEnd) {
                    this._writer.write(value);
                    return;
                }
            }
            value.getChars(0, length, this._outputBuffer, this._outputTail);
            this._outputTail += length;
            return;
        }
        if (this._outputTail + 5 >= this._outputEnd) {
            _flushBuffer();
        }
        int i5 = this._outputTail;
        char[] cArr2 = this._outputBuffer;
        char[] hexChars = getHexChars();
        cArr2[i5] = '\\';
        int i6 = i5 + 2;
        int i7 = i5 + 3;
        int i8 = i5 + 4;
        cArr2[i5 + 1] = 'u';
        if (c2 > 255) {
            int i9 = c2 >> '\b';
            cArr2[i6] = hexChars[(i9 & 255) >> 4];
            cArr2[i7] = hexChars[i9 & 15];
            c3 = c2 & 255;
        } else {
            cArr2[i6] = '0';
            cArr2[i7] = '0';
            c3 = c2;
        }
        cArr2[i8] = hexChars[c3 >> 4];
        cArr2[i5 + 5] = hexChars[c3 & 15];
        this._outputTail = i5 + 6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v11 */
    private void _prependOrWriteCharacterEscape(char c2, int i2) throws IOException {
        String value;
        char c3;
        if (i2 >= 0) {
            char c4 = (char) i2;
            int i3 = this._outputTail;
            if (i3 >= 2) {
                int i4 = i3 - 2;
                this._outputHead = i4;
                char[] cArr = this._outputBuffer;
                cArr[i4] = '\\';
                cArr[i3 - 1] = c4;
                return;
            }
            char[] cArr_allocateEntityBuffer = this._entityBuffer;
            if (cArr_allocateEntityBuffer == null) {
                cArr_allocateEntityBuffer = _allocateEntityBuffer();
            }
            this._outputHead = this._outputTail;
            cArr_allocateEntityBuffer[1] = c4;
            this._writer.write(cArr_allocateEntityBuffer, 0, 2);
            return;
        }
        if (i2 == -2) {
            SerializableString serializableString = this._currentEscape;
            if (serializableString == null) {
                value = this._characterEscapes.getEscapeSequence(c2).getValue();
            } else {
                value = serializableString.getValue();
                this._currentEscape = null;
            }
            int length = value.length();
            int i5 = this._outputTail;
            if (i5 < length) {
                this._outputHead = i5;
                this._writer.write(value);
                return;
            } else {
                int i6 = i5 - length;
                this._outputHead = i6;
                value.getChars(0, length, this._outputBuffer, i6);
                return;
            }
        }
        char[] hexChars = getHexChars();
        int i7 = this._outputTail;
        if (i7 < 6) {
            char[] cArr_allocateEntityBuffer2 = this._entityBuffer;
            if (cArr_allocateEntityBuffer2 == null) {
                cArr_allocateEntityBuffer2 = _allocateEntityBuffer();
            }
            this._outputHead = this._outputTail;
            if (c2 <= 255) {
                cArr_allocateEntityBuffer2[6] = hexChars[c2 >> 4];
                cArr_allocateEntityBuffer2[7] = hexChars[c2 & 15];
                this._writer.write(cArr_allocateEntityBuffer2, 2, 6);
                return;
            } else {
                int i8 = c2 >> '\b';
                cArr_allocateEntityBuffer2[10] = hexChars[(i8 & 255) >> 4];
                cArr_allocateEntityBuffer2[11] = hexChars[i8 & 15];
                cArr_allocateEntityBuffer2[12] = hexChars[(c2 & 255) >> 4];
                cArr_allocateEntityBuffer2[13] = hexChars[c2 & 15];
                this._writer.write(cArr_allocateEntityBuffer2, 8, 6);
                return;
            }
        }
        char[] cArr2 = this._outputBuffer;
        int i9 = i7 - 6;
        this._outputHead = i9;
        cArr2[i9] = '\\';
        int i10 = i7 - 4;
        int i11 = i7 - 3;
        cArr2[i7 - 5] = 'u';
        if (c2 > 255) {
            int i12 = c2 >> '\b';
            cArr2[i10] = hexChars[(i12 & 255) >> 4];
            cArr2[i11] = hexChars[i12 & 15];
            c3 = c2 & 255;
        } else {
            cArr2[i10] = '0';
            cArr2[i11] = '0';
            c3 = c2;
        }
        cArr2[i7 - 2] = hexChars[c3 >> 4];
        cArr2[i7 - 1] = hexChars[c3 & 15];
    }

    private int _readMore(InputStream inputStream, byte[] bArr, int i2, int i3, int i4) {
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

    private void _writeLongString(String str) throws IOException {
        _flushBuffer();
        int length = str.length();
        int i2 = 0;
        while (true) {
            int i3 = this._outputEnd;
            if (i2 + i3 > length) {
                i3 = length - i2;
            }
            int i4 = i2 + i3;
            str.getChars(i2, i4, this._outputBuffer, 0);
            if (this._characterEscapes != null) {
                _writeSegmentCustom(i3);
            } else {
                int i5 = this._maximumNonEscapedChar;
                if (i5 != 0) {
                    _writeSegmentASCII(i3, i5);
                } else {
                    _writeSegment(i3);
                }
            }
            if (i4 >= length) {
                return;
            } else {
                i2 = i4;
            }
        }
    }

    private final void _writeNull() throws IOException {
        if (this._outputTail + 4 >= this._outputEnd) {
            _flushBuffer();
        }
        int i2 = this._outputTail;
        char[] cArr = this._outputBuffer;
        cArr[i2] = 'n';
        cArr[i2 + 1] = 'u';
        cArr[i2 + 2] = 'l';
        cArr[i2 + 3] = 'l';
        this._outputTail = i2 + 4;
    }

    private void _writeQuotedInt(int i2) throws IOException {
        if (this._outputTail + 13 >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr = this._outputBuffer;
        int i3 = this._outputTail;
        int i4 = i3 + 1;
        this._outputTail = i4;
        cArr[i3] = this._quoteChar;
        int iOutputInt = NumberOutput.outputInt(i2, cArr, i4);
        char[] cArr2 = this._outputBuffer;
        this._outputTail = iOutputInt + 1;
        cArr2[iOutputInt] = this._quoteChar;
    }

    private void _writeQuotedLong(long j2) throws IOException {
        if (this._outputTail + 23 >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr = this._outputBuffer;
        int i2 = this._outputTail;
        int i3 = i2 + 1;
        this._outputTail = i3;
        cArr[i2] = this._quoteChar;
        int iOutputLong = NumberOutput.outputLong(j2, cArr, i3);
        char[] cArr2 = this._outputBuffer;
        this._outputTail = iOutputLong + 1;
        cArr2[iOutputLong] = this._quoteChar;
    }

    private void _writeQuotedRaw(String str) throws IOException {
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr = this._outputBuffer;
        int i2 = this._outputTail;
        this._outputTail = i2 + 1;
        cArr[i2] = this._quoteChar;
        writeRaw(str);
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr2 = this._outputBuffer;
        int i3 = this._outputTail;
        this._outputTail = i3 + 1;
        cArr2[i3] = this._quoteChar;
    }

    private void _writeQuotedShort(short s) throws IOException {
        if (this._outputTail + 8 >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr = this._outputBuffer;
        int i2 = this._outputTail;
        int i3 = i2 + 1;
        this._outputTail = i3;
        cArr[i2] = this._quoteChar;
        int iOutputInt = NumberOutput.outputInt(s, cArr, i3);
        char[] cArr2 = this._outputBuffer;
        this._outputTail = iOutputInt + 1;
        cArr2[iOutputInt] = this._quoteChar;
    }

    private void _writeSegment(int i2) throws IOException {
        char[] cArr;
        char c2;
        int[] iArr = this._outputEscapes;
        int length = iArr.length;
        int i3 = 0;
        int i_prependOrWriteCharacterEscape = 0;
        while (i3 < i2) {
            do {
                cArr = this._outputBuffer;
                c2 = cArr[i3];
                if (c2 < length && iArr[c2] != 0) {
                    break;
                } else {
                    i3++;
                }
            } while (i3 < i2);
            int i4 = i3 - i_prependOrWriteCharacterEscape;
            if (i4 > 0) {
                this._writer.write(cArr, i_prependOrWriteCharacterEscape, i4);
                if (i3 >= i2) {
                    return;
                }
            }
            int i5 = i3 + 1;
            i_prependOrWriteCharacterEscape = _prependOrWriteCharacterEscape(this._outputBuffer, i5, i2, c2, iArr[c2]);
            i3 = i5;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001e A[PHI: r4
  0x001e: PHI (r4v7 int) = (r4v2 int), (r4v8 int) binds: [B:9:0x001a, B:7:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void _writeSegmentASCII(int r13, int r14) throws java.io.IOException {
        /*
            r12 = this;
            int[] r0 = r12._outputEscapes
            int r1 = r0.length
            int r2 = r14 + 1
            int r1 = java.lang.Math.min(r1, r2)
            r2 = 0
            r3 = r2
            r4 = r3
        Lc:
            if (r2 >= r13) goto L3b
        Le:
            char[] r5 = r12._outputBuffer
            char r10 = r5[r2]
            if (r10 >= r1) goto L1a
            r4 = r0[r10]
            if (r4 == 0) goto L1e
        L18:
            r11 = r4
            goto L23
        L1a:
            if (r10 <= r14) goto L1e
            r4 = -1
            goto L18
        L1e:
            int r2 = r2 + 1
            if (r2 < r13) goto Le
            goto L18
        L23:
            int r4 = r2 - r3
            if (r4 <= 0) goto L2e
            java.io.Writer r6 = r12._writer
            r6.write(r5, r3, r4)
            if (r2 >= r13) goto L3b
        L2e:
            int r8 = r2 + 1
            char[] r7 = r12._outputBuffer
            r6 = r12
            r9 = r13
            int r3 = r6._prependOrWriteCharacterEscape(r7, r8, r9, r10, r11)
            r2 = r8
            r4 = r11
            goto Lc
        L3b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeSegmentASCII(int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0031 A[PHI: r6
  0x0031: PHI (r6v8 int) = (r6v2 int), (r6v9 int) binds: [B:15:0x002d, B:10:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void _writeSegmentCustom(int r15) throws java.io.IOException {
        /*
            r14 = this;
            int[] r0 = r14._outputEscapes
            int r1 = r14._maximumNonEscapedChar
            if (r1 > 0) goto L9
            r1 = 65535(0xffff, float:9.1834E-41)
        L9:
            int r2 = r0.length
            int r3 = r1 + 1
            int r2 = java.lang.Math.min(r2, r3)
            com.fasterxml.jackson.core.io.CharacterEscapes r3 = r14._characterEscapes
            r4 = 0
            r5 = r4
            r6 = r5
        L15:
            if (r4 >= r15) goto L50
        L17:
            char[] r7 = r14._outputBuffer
            char r12 = r7[r4]
            if (r12 >= r2) goto L23
            r6 = r0[r12]
            if (r6 == 0) goto L31
        L21:
            r13 = r6
            goto L36
        L23:
            if (r12 <= r1) goto L27
            r6 = -1
            goto L21
        L27:
            com.fasterxml.jackson.core.SerializableString r7 = r3.getEscapeSequence(r12)
            r14._currentEscape = r7
            if (r7 == 0) goto L31
            r6 = -2
            goto L21
        L31:
            int r4 = r4 + 1
            if (r4 < r15) goto L17
            goto L21
        L36:
            int r6 = r4 - r5
            if (r6 <= 0) goto L43
            java.io.Writer r7 = r14._writer
            char[] r8 = r14._outputBuffer
            r7.write(r8, r5, r6)
            if (r4 >= r15) goto L50
        L43:
            int r10 = r4 + 1
            char[] r9 = r14._outputBuffer
            r8 = r14
            r11 = r15
            int r5 = r8._prependOrWriteCharacterEscape(r9, r10, r11, r12, r13)
            r4 = r10
            r6 = r13
            goto L15
        L50:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeSegmentCustom(int):void");
    }

    private void _writeString(char[] cArr, int i2, int i3) throws IOException {
        if (this._characterEscapes != null) {
            _writeStringCustom(cArr, i2, i3);
            return;
        }
        int i4 = this._maximumNonEscapedChar;
        if (i4 != 0) {
            _writeStringASCII(cArr, i2, i3, i4);
            return;
        }
        int i5 = i3 + i2;
        int[] iArr = this._outputEscapes;
        int length = iArr.length;
        while (i2 < i5) {
            int i6 = i2;
            do {
                char c2 = cArr[i6];
                if (c2 < length && iArr[c2] != 0) {
                    break;
                } else {
                    i6++;
                }
            } while (i6 < i5);
            int i7 = i6 - i2;
            if (i7 < 32) {
                if (this._outputTail + i7 > this._outputEnd) {
                    _flushBuffer();
                }
                if (i7 > 0) {
                    System.arraycopy(cArr, i2, this._outputBuffer, this._outputTail, i7);
                    this._outputTail += i7;
                }
            } else {
                _flushBuffer();
                this._writer.write(cArr, i2, i7);
            }
            if (i6 >= i5) {
                return;
            }
            i2 = i6 + 1;
            char c3 = cArr[i6];
            _appendCharacterEscape(c3, iArr[c3]);
        }
    }

    private void _writeString2(SerializableString serializableString) throws IOException {
        char[] cArrAsQuotedChars = serializableString.asQuotedChars();
        int length = cArrAsQuotedChars.length;
        if (length < 32) {
            if (length > this._outputEnd - this._outputTail) {
                _flushBuffer();
            }
            System.arraycopy(cArrAsQuotedChars, 0, this._outputBuffer, this._outputTail, length);
            this._outputTail += length;
        } else {
            _flushBuffer();
            this._writer.write(cArrAsQuotedChars, 0, length);
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr = this._outputBuffer;
        int i2 = this._outputTail;
        this._outputTail = i2 + 1;
        cArr[i2] = this._quoteChar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001d A[PHI: r2
  0x001d: PHI (r2v6 int) = (r2v3 int), (r2v7 int) binds: [B:11:0x0019, B:9:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void _writeStringASCII(char[] r11, int r12, int r13, int r14) throws java.io.IOException {
        /*
            r10 = this;
            int[] r0 = r10._outputEscapes
            int r1 = r0.length
            int r2 = r14 + 1
            int r1 = java.lang.Math.min(r1, r2)
            r2 = 0
            r3 = r12
        Lb:
            int r4 = r13 + r12
            if (r3 >= r4) goto L51
            r5 = r3
        L10:
            char r6 = r11[r5]
            if (r6 >= r1) goto L19
            r2 = r0[r6]
            if (r2 == 0) goto L1d
            goto L21
        L19:
            if (r6 <= r14) goto L1d
            r2 = -1
            goto L21
        L1d:
            int r5 = r5 + 1
            if (r5 < r4) goto L10
        L21:
            int r7 = r5 - r3
            r8 = 32
            if (r7 >= r8) goto L40
            int r8 = r10._outputTail
            int r8 = r8 + r7
            int r9 = r10._outputEnd
            if (r8 <= r9) goto L31
            r10._flushBuffer()
        L31:
            if (r7 <= 0) goto L48
            char[] r8 = r10._outputBuffer
            int r9 = r10._outputTail
            java.lang.System.arraycopy(r11, r3, r8, r9, r7)
            int r3 = r10._outputTail
            int r3 = r3 + r7
            r10._outputTail = r3
            goto L48
        L40:
            r10._flushBuffer()
            java.io.Writer r8 = r10._writer
            r8.write(r11, r3, r7)
        L48:
            if (r5 < r4) goto L4b
            goto L51
        L4b:
            int r3 = r5 + 1
            r10._appendCharacterEscape(r6, r2)
            goto Lb
        L51:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeStringASCII(char[], int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0030 A[PHI: r4
  0x0030: PHI (r4v6 int) = (r4v2 int), (r4v7 int) binds: [B:17:0x002c, B:12:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void _writeStringCustom(char[] r13, int r14, int r15) throws java.io.IOException {
        /*
            r12 = this;
            int[] r0 = r12._outputEscapes
            int r1 = r12._maximumNonEscapedChar
            if (r1 > 0) goto L9
            r1 = 65535(0xffff, float:9.1834E-41)
        L9:
            int r2 = r0.length
            int r3 = r1 + 1
            int r2 = java.lang.Math.min(r2, r3)
            com.fasterxml.jackson.core.io.CharacterEscapes r3 = r12._characterEscapes
            r4 = 0
            r5 = r14
        L14:
            int r6 = r15 + r14
            if (r5 >= r6) goto L64
            r7 = r5
        L19:
            char r8 = r13[r7]
            if (r8 >= r2) goto L22
            r4 = r0[r8]
            if (r4 == 0) goto L30
            goto L34
        L22:
            if (r8 <= r1) goto L26
            r4 = -1
            goto L34
        L26:
            com.fasterxml.jackson.core.SerializableString r9 = r3.getEscapeSequence(r8)
            r12._currentEscape = r9
            if (r9 == 0) goto L30
            r4 = -2
            goto L34
        L30:
            int r7 = r7 + 1
            if (r7 < r6) goto L19
        L34:
            int r9 = r7 - r5
            r10 = 32
            if (r9 >= r10) goto L53
            int r10 = r12._outputTail
            int r10 = r10 + r9
            int r11 = r12._outputEnd
            if (r10 <= r11) goto L44
            r12._flushBuffer()
        L44:
            if (r9 <= 0) goto L5b
            char[] r10 = r12._outputBuffer
            int r11 = r12._outputTail
            java.lang.System.arraycopy(r13, r5, r10, r11, r9)
            int r5 = r12._outputTail
            int r5 = r5 + r9
            r12._outputTail = r5
            goto L5b
        L53:
            r12._flushBuffer()
            java.io.Writer r10 = r12._writer
            r10.write(r13, r5, r9)
        L5b:
            if (r7 < r6) goto L5e
            goto L64
        L5e:
            int r5 = r7 + 1
            r12._appendCharacterEscape(r8, r4)
            goto L14
        L64:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeStringCustom(char[], int, int):void");
    }

    private char[] getHexChars() {
        return this._cfgWriteHexUppercase ? HEX_CHARS_UPPER : HEX_CHARS_LOWER;
    }

    private void writeRawLong(String str) throws IOException {
        int i2 = this._outputEnd;
        int i3 = this._outputTail;
        int i4 = i2 - i3;
        str.getChars(0, i4, this._outputBuffer, i3);
        this._outputTail += i4;
        _flushBuffer();
        int length = str.length() - i4;
        while (true) {
            int i5 = this._outputEnd;
            char[] cArr = this._outputBuffer;
            if (length <= i5) {
                str.getChars(i4, i4 + length, cArr, 0);
                this._outputHead = 0;
                this._outputTail = length;
                return;
            } else {
                int i6 = i4 + i5;
                str.getChars(i4, i6, cArr, 0);
                this._outputHead = 0;
                this._outputTail = i5;
                _flushBuffer();
                length -= i5;
                i4 = i6;
            }
        }
    }

    protected void _flushBuffer() throws IOException {
        int i2 = this._outputTail;
        int i3 = this._outputHead;
        int i4 = i2 - i3;
        if (i4 > 0) {
            this._outputHead = 0;
            this._outputTail = 0;
            this._writer.write(this._outputBuffer, i3, i4);
        }
    }

    protected void _releaseBuffers() {
        char[] cArr = this._outputBuffer;
        if (cArr != null) {
            this._outputBuffer = null;
            this._ioContext.releaseConcatBuffer(cArr);
        }
        char[] cArr2 = this._copyBuffer;
        if (cArr2 != null) {
            this._copyBuffer = null;
            this._ioContext.releaseNameCopyBuffer(cArr2);
        }
    }

    @Override // com.fasterxml.jackson.core.base.GeneratorBase
    protected void _verifyValueWrite(String str) throws IOException {
        char c2;
        int iWriteValue = this._writeContext.writeValue();
        if (this._cfgPrettyPrinter != null) {
            _verifyPrettyValueWrite(str, iWriteValue);
            return;
        }
        if (iWriteValue == 1) {
            c2 = ',';
        } else {
            if (iWriteValue != 2) {
                if (iWriteValue != 3) {
                    if (iWriteValue != 5) {
                        return;
                    }
                    _reportCantWriteValueExpectName(str);
                    return;
                } else {
                    SerializableString serializableString = this._rootValueSeparator;
                    if (serializableString != null) {
                        writeRaw(serializableString.getValue());
                        return;
                    }
                    return;
                }
            }
            c2 = ':';
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr = this._outputBuffer;
        int i2 = this._outputTail;
        this._outputTail = i2 + 1;
        cArr[i2] = c2;
    }

    protected int _writeBinary(Base64Variant base64Variant, InputStream inputStream, byte[] bArr, int i2) throws IOException {
        WriterBasedJsonGenerator writerBasedJsonGenerator;
        InputStream inputStream2;
        byte[] bArr2;
        int i_readMore;
        int i3 = this._outputEnd - 6;
        int i4 = 2;
        int maxLineLength = base64Variant.getMaxLineLength() >> 2;
        int i5 = -3;
        int i6 = i2;
        int i7 = 0;
        int i_readMore2 = 0;
        while (true) {
            if (i6 <= 2) {
                writerBasedJsonGenerator = this;
                inputStream2 = inputStream;
                bArr2 = bArr;
                break;
            }
            writerBasedJsonGenerator = this;
            inputStream2 = inputStream;
            bArr2 = bArr;
            if (i7 > i5) {
                i_readMore2 = writerBasedJsonGenerator._readMore(inputStream2, bArr2, i7, i_readMore2, i6);
                if (i_readMore2 < 3) {
                    i7 = 0;
                    break;
                }
                i5 = i_readMore2 - 3;
                i7 = 0;
            }
            if (writerBasedJsonGenerator._outputTail > i3) {
                writerBasedJsonGenerator._flushBuffer();
            }
            int i8 = i7 + 2;
            int i9 = ((bArr2[i7 + 1] & 255) | (bArr2[i7] << 8)) << 8;
            i7 += 3;
            i6 -= 3;
            int iEncodeBase64Chunk = base64Variant.encodeBase64Chunk(i9 | (bArr2[i8] & 255), writerBasedJsonGenerator._outputBuffer, writerBasedJsonGenerator._outputTail);
            writerBasedJsonGenerator._outputTail = iEncodeBase64Chunk;
            maxLineLength--;
            if (maxLineLength <= 0) {
                char[] cArr = writerBasedJsonGenerator._outputBuffer;
                int i10 = iEncodeBase64Chunk + 1;
                writerBasedJsonGenerator._outputTail = i10;
                cArr[iEncodeBase64Chunk] = '\\';
                writerBasedJsonGenerator._outputTail = iEncodeBase64Chunk + 2;
                cArr[i10] = 'n';
                maxLineLength = base64Variant.getMaxLineLength() >> 2;
            }
            this = writerBasedJsonGenerator;
            inputStream = inputStream2;
            bArr = bArr2;
        }
        if (i6 <= 0 || (i_readMore = writerBasedJsonGenerator._readMore(inputStream2, bArr2, i7, i_readMore2, i6)) <= 0) {
            return i6;
        }
        if (writerBasedJsonGenerator._outputTail > i3) {
            writerBasedJsonGenerator._flushBuffer();
        }
        int i11 = bArr2[0] << StylePropertiesKt.BottomId;
        if (i_readMore > 1) {
            i11 |= (bArr2[1] & 255) << 8;
        } else {
            i4 = 1;
        }
        writerBasedJsonGenerator._outputTail = base64Variant.encodeBase64Partial(i11, i4, writerBasedJsonGenerator._outputBuffer, writerBasedJsonGenerator._outputTail);
        return i6 - i4;
    }

    protected void _writeFieldName(SerializableString serializableString, boolean z) throws IOException {
        if (this._cfgPrettyPrinter != null) {
            _writePPFieldName(serializableString, z);
            return;
        }
        if (this._outputTail + 1 >= this._outputEnd) {
            _flushBuffer();
        }
        if (z) {
            char[] cArr = this._outputBuffer;
            int i2 = this._outputTail;
            this._outputTail = i2 + 1;
            cArr[i2] = ',';
        }
        if (this._cfgUnqNames) {
            char[] cArrAsQuotedChars = serializableString.asQuotedChars();
            writeRaw(cArrAsQuotedChars, 0, cArrAsQuotedChars.length);
            return;
        }
        char[] cArr2 = this._outputBuffer;
        int i3 = this._outputTail;
        int i4 = i3 + 1;
        this._outputTail = i4;
        cArr2[i3] = this._quoteChar;
        int iAppendQuoted = serializableString.appendQuoted(cArr2, i4);
        if (iAppendQuoted < 0) {
            _writeFieldNameTail(serializableString);
            return;
        }
        int i5 = this._outputTail + iAppendQuoted;
        this._outputTail = i5;
        if (i5 >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr3 = this._outputBuffer;
        int i6 = this._outputTail;
        this._outputTail = i6 + 1;
        cArr3[i6] = this._quoteChar;
    }

    protected void _writeFieldNameTail(SerializableString serializableString) throws IOException {
        char[] cArrAsQuotedChars = serializableString.asQuotedChars();
        writeRaw(cArrAsQuotedChars, 0, cArrAsQuotedChars.length);
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr = this._outputBuffer;
        int i2 = this._outputTail;
        this._outputTail = i2 + 1;
        cArr[i2] = this._quoteChar;
    }

    protected void _writePPFieldName(SerializableString serializableString, boolean z) throws IOException {
        if (z) {
            this._cfgPrettyPrinter.writeObjectEntrySeparator(this);
        } else {
            this._cfgPrettyPrinter.beforeObjectEntries(this);
        }
        char[] cArrAsQuotedChars = serializableString.asQuotedChars();
        if (this._cfgUnqNames) {
            writeRaw(cArrAsQuotedChars, 0, cArrAsQuotedChars.length);
            return;
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr = this._outputBuffer;
        int i2 = this._outputTail;
        this._outputTail = i2 + 1;
        cArr[i2] = this._quoteChar;
        writeRaw(cArrAsQuotedChars, 0, cArrAsQuotedChars.length);
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr2 = this._outputBuffer;
        int i3 = this._outputTail;
        this._outputTail = i3 + 1;
        cArr2[i3] = this._quoteChar;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public boolean canWriteFormattedNumbers() {
        return true;
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
        this._outputHead = 0;
        this._outputTail = 0;
        if (this._writer != null) {
            try {
                if (this._ioContext.isResourceManaged() || isEnabled(JsonGenerator.Feature.AUTO_CLOSE_TARGET)) {
                    this._writer.close();
                } else if (isEnabled(JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM)) {
                    this._writer.flush();
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
        if (this._writer == null || !isEnabled(JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM)) {
            return;
        }
        this._writer.flush();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public int getOutputBuffered() {
        return Math.max(0, this._outputTail - this._outputHead);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public Object getOutputTarget() {
        return this._writer;
    }

    @Override // com.fasterxml.jackson.core.base.GeneratorBase, com.fasterxml.jackson.core.JsonGenerator
    public int writeBinary(Base64Variant base64Variant, InputStream inputStream, int i2) throws IOException {
        _verifyValueWrite("write a binary value");
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr = this._outputBuffer;
        int i3 = this._outputTail;
        this._outputTail = i3 + 1;
        cArr[i3] = this._quoteChar;
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
            char[] cArr2 = this._outputBuffer;
            int i4 = this._outputTail;
            this._outputTail = i4 + 1;
            cArr2[i4] = this._quoteChar;
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
        int i2 = this._outputTail;
        int i3 = i2 + 1;
        char[] cArr = this._outputBuffer;
        int i4 = i2 + 2;
        int i5 = i2 + 3;
        if (z) {
            cArr[i2] = 't';
            cArr[i3] = 'r';
            cArr[i4] = 'u';
            cArr[i5] = 'e';
        } else {
            cArr[i2] = 'f';
            cArr[i3] = 'a';
            cArr[i4] = 'l';
            cArr[i5] = 's';
            i5 = i2 + 4;
            cArr[i5] = 'e';
        }
        this._outputTail = i5 + 1;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeEndArray() throws IOException {
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
            char[] cArr = this._outputBuffer;
            int i2 = this._outputTail;
            this._outputTail = i2 + 1;
            cArr[i2] = ']';
        }
        this._writeContext = this._writeContext.clearAndGetParent();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeEndObject() throws IOException {
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
            char[] cArr = this._outputBuffer;
            int i2 = this._outputTail;
            this._outputTail = i2 + 1;
            cArr[i2] = '}';
        }
        this._writeContext = this._writeContext.clearAndGetParent();
    }

    @Override // com.fasterxml.jackson.core.base.GeneratorBase, com.fasterxml.jackson.core.JsonGenerator
    public void writeFieldName(SerializableString serializableString) throws IOException {
        int iWriteFieldName = this._writeContext.writeFieldName(serializableString.getValue());
        if (iWriteFieldName == 4) {
            _reportError("Can not write a field name, expecting a value");
        }
        _writeFieldName(serializableString, iWriteFieldName == 1);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNull() throws IOException {
        _verifyValueWrite("write a null");
        _writeNull();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(double d2) throws IOException {
        if (this._cfgNumbersAsStrings || (NumberOutput.notFinite(d2) && isEnabled(JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS))) {
            writeString(NumberOutput.toString(d2, isEnabled(JsonGenerator.Feature.USE_FAST_DOUBLE_WRITER)));
        } else {
            _verifyValueWrite("write a number");
            writeRaw(NumberOutput.toString(d2, isEnabled(JsonGenerator.Feature.USE_FAST_DOUBLE_WRITER)));
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeRaw(String str, int i2, int i3) throws IOException {
        _checkRangeBoundsForString(str, i2, i3);
        int i4 = this._outputEnd;
        int i5 = this._outputTail;
        int i6 = i4 - i5;
        if (i6 < i3) {
            _flushBuffer();
            int i7 = this._outputEnd;
            i5 = this._outputTail;
            i6 = i7 - i5;
        }
        if (i6 < i3) {
            writeRawLong(str.substring(i2, i3 + i2));
        } else {
            str.getChars(i2, i2 + i3, this._outputBuffer, i5);
            this._outputTail += i3;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeRawUTF8String(byte[] bArr, int i2, int i3) {
        _reportUnsupportedOperation();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeStartArray() throws IOException {
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
        char[] cArr = this._outputBuffer;
        int i2 = this._outputTail;
        this._outputTail = i2 + 1;
        cArr[i2] = '[';
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeStartObject() throws IOException {
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
        char[] cArr = this._outputBuffer;
        int i2 = this._outputTail;
        this._outputTail = i2 + 1;
        cArr[i2] = '{';
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeString(Reader reader, int i2) throws IOException {
        _verifyValueWrite("write a string");
        if (reader == null) {
            _reportError("null reader");
            return;
        }
        int i3 = i2 >= 0 ? i2 : Integer.MAX_VALUE;
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr = this._outputBuffer;
        int i4 = this._outputTail;
        this._outputTail = i4 + 1;
        cArr[i4] = this._quoteChar;
        char[] cArr_allocateCopyBuffer = _allocateCopyBuffer();
        while (i3 > 0) {
            int i5 = reader.read(cArr_allocateCopyBuffer, 0, Math.min(i3, cArr_allocateCopyBuffer.length));
            if (i5 <= 0) {
                break;
            }
            _writeString(cArr_allocateCopyBuffer, 0, i5);
            i3 -= i5;
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr2 = this._outputBuffer;
        int i6 = this._outputTail;
        this._outputTail = i6 + 1;
        cArr2[i6] = this._quoteChar;
        if (i3 <= 0 || i2 < 0) {
            return;
        }
        _reportError("Didn't read enough from reader");
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeUTF8String(byte[] bArr, int i2, int i3) {
        _reportUnsupportedOperation();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeFieldName(String str) throws IOException {
        int iWriteFieldName = this._writeContext.writeFieldName(str);
        if (iWriteFieldName == 4) {
            _reportError("Can not write a field name, expecting a value");
        }
        _writeFieldName(str, iWriteFieldName == 1);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeRaw(SerializableString serializableString) throws IOException {
        int iAppendUnquoted = serializableString.appendUnquoted(this._outputBuffer, this._outputTail);
        if (iAppendUnquoted < 0) {
            writeRaw(serializableString.getValue());
        } else {
            this._outputTail += iAppendUnquoted;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeRaw(String str) throws IOException {
        int length = str.length();
        int i2 = this._outputEnd;
        int i3 = this._outputTail;
        int i4 = i2 - i3;
        if (i4 == 0) {
            _flushBuffer();
            int i5 = this._outputEnd;
            i3 = this._outputTail;
            i4 = i5 - i3;
        }
        if (i4 >= length) {
            str.getChars(0, length, this._outputBuffer, i3);
            this._outputTail += length;
        } else {
            writeRawLong(str);
        }
    }

    private void _writeQuotedRaw(char[] cArr, int i2, int i3) throws IOException {
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr2 = this._outputBuffer;
        int i4 = this._outputTail;
        this._outputTail = i4 + 1;
        cArr2[i4] = this._quoteChar;
        writeRaw(cArr, i2, i3);
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr3 = this._outputBuffer;
        int i5 = this._outputTail;
        this._outputTail = i5 + 1;
        cArr3[i5] = this._quoteChar;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeRaw(char c2) throws IOException {
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr = this._outputBuffer;
        int i2 = this._outputTail;
        this._outputTail = i2 + 1;
        cArr[i2] = c2;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeRaw(char[] cArr, int i2, int i3) throws IOException {
        _checkRangeBoundsForCharArray(cArr, i2, i3);
        if (i3 < 32) {
            if (i3 > this._outputEnd - this._outputTail) {
                _flushBuffer();
            }
            System.arraycopy(cArr, i2, this._outputBuffer, this._outputTail, i3);
            this._outputTail += i3;
            return;
        }
        _flushBuffer();
        this._writer.write(cArr, i2, i3);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(float f2) throws IOException {
        if (!this._cfgNumbersAsStrings && (!NumberOutput.notFinite(f2) || !isEnabled(JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS))) {
            _verifyValueWrite("write a number");
            writeRaw(NumberOutput.toString(f2, isEnabled(JsonGenerator.Feature.USE_FAST_DOUBLE_WRITER)));
        } else {
            writeString(NumberOutput.toString(f2, isEnabled(JsonGenerator.Feature.USE_FAST_DOUBLE_WRITER)));
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeStartArray(Object obj) throws IOException {
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
        char[] cArr = this._outputBuffer;
        int i2 = this._outputTail;
        this._outputTail = i2 + 1;
        cArr[i2] = '[';
    }

    @Override // com.fasterxml.jackson.core.base.GeneratorBase, com.fasterxml.jackson.core.JsonGenerator
    public void writeStartObject(Object obj) throws IOException {
        _verifyValueWrite("start an object");
        JsonWriteContext jsonWriteContextCreateChildObjectContext = this._writeContext.createChildObjectContext(obj);
        streamWriteConstraints().validateNestingDepth(this._writeContext.getNestingDepth());
        this._writeContext = jsonWriteContextCreateChildObjectContext;
        PrettyPrinter prettyPrinter = this._cfgPrettyPrinter;
        if (prettyPrinter != null) {
            prettyPrinter.writeStartObject(this);
            return;
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr = this._outputBuffer;
        int i2 = this._outputTail;
        this._outputTail = i2 + 1;
        cArr[i2] = '{';
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(int i2) throws IOException {
        _verifyValueWrite("write a number");
        if (this._cfgNumbersAsStrings) {
            _writeQuotedInt(i2);
            return;
        }
        if (this._outputTail + 11 >= this._outputEnd) {
            _flushBuffer();
        }
        this._outputTail = NumberOutput.outputInt(i2, this._outputBuffer, this._outputTail);
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
        char[] cArr = this._outputBuffer;
        int i3 = this._outputTail;
        this._outputTail = i3 + 1;
        cArr[i3] = '[';
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeStartObject(Object obj, int i2) {
        writeStartObject(obj);
    }

    private void _writeString2(int i2) throws IOException {
        int i3;
        int i4 = this._outputTail + i2;
        int[] iArr = this._outputEscapes;
        int length = iArr.length;
        while (this._outputTail < i4) {
            do {
                char[] cArr = this._outputBuffer;
                int i5 = this._outputTail;
                char c2 = cArr[i5];
                if (c2 >= length || iArr[c2] == 0) {
                    i3 = i5 + 1;
                    this._outputTail = i3;
                } else {
                    int i6 = this._outputHead;
                    int i7 = i5 - i6;
                    if (i7 > 0) {
                        this._writer.write(cArr, i6, i7);
                    }
                    char[] cArr2 = this._outputBuffer;
                    int i8 = this._outputTail;
                    this._outputTail = i8 + 1;
                    char c3 = cArr2[i8];
                    _prependOrWriteCharacterEscape(c3, iArr[c3]);
                }
            } while (i3 < i4);
            return;
        }
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

    protected void _writePPFieldName(String str, boolean z) throws IOException {
        if (z) {
            this._cfgPrettyPrinter.writeObjectEntrySeparator(this);
        } else {
            this._cfgPrettyPrinter.beforeObjectEntries(this);
        }
        if (this._cfgUnqNames) {
            _writeString(str);
            return;
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr = this._outputBuffer;
        int i2 = this._outputTail;
        this._outputTail = i2 + 1;
        cArr[i2] = this._quoteChar;
        _writeString(str);
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr2 = this._outputBuffer;
        int i3 = this._outputTail;
        this._outputTail = i3 + 1;
        cArr2[i3] = this._quoteChar;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(short s) throws IOException {
        _verifyValueWrite("write a number");
        if (this._cfgNumbersAsStrings) {
            _writeQuotedShort(s);
            return;
        }
        if (this._outputTail + 6 >= this._outputEnd) {
            _flushBuffer();
        }
        this._outputTail = NumberOutput.outputInt(s, this._outputBuffer, this._outputTail);
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

    /* JADX WARN: Removed duplicated region for block: B:14:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void _writeStringASCII(int r9, int r10) throws java.io.IOException {
        /*
            r8 = this;
            int r0 = r8._outputTail
            int r0 = r0 + r9
            int[] r9 = r8._outputEscapes
            int r1 = r9.length
            int r2 = r10 + 1
            int r1 = java.lang.Math.min(r1, r2)
        Lc:
            int r2 = r8._outputTail
            if (r2 >= r0) goto L3a
        L10:
            char[] r2 = r8._outputBuffer
            int r3 = r8._outputTail
            char r4 = r2[r3]
            if (r4 >= r1) goto L1d
            r5 = r9[r4]
            if (r5 == 0) goto L34
            goto L20
        L1d:
            if (r4 <= r10) goto L34
            r5 = -1
        L20:
            int r6 = r8._outputHead
            int r3 = r3 - r6
            if (r3 <= 0) goto L2a
            java.io.Writer r7 = r8._writer
            r7.write(r2, r6, r3)
        L2a:
            int r2 = r8._outputTail
            int r2 = r2 + 1
            r8._outputTail = r2
            r8._prependOrWriteCharacterEscape(r4, r5)
            goto Lc
        L34:
            int r3 = r3 + 1
            r8._outputTail = r3
            if (r3 < r0) goto L10
        L3a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeStringASCII(int, int):void");
    }

    private void _writeString(String str) throws IOException {
        int length = str.length();
        int i2 = this._outputEnd;
        if (length > i2) {
            _writeLongString(str);
            return;
        }
        if (this._outputTail + length > i2) {
            _flushBuffer();
        }
        str.getChars(0, length, this._outputBuffer, this._outputTail);
        if (this._characterEscapes != null) {
            _writeStringCustom(length);
            return;
        }
        int i3 = this._maximumNonEscapedChar;
        if (i3 != 0) {
            _writeStringASCII(length, i3);
        } else {
            _writeString2(length);
        }
    }

    protected void _writeFieldName(String str, boolean z) throws IOException {
        if (this._cfgPrettyPrinter != null) {
            _writePPFieldName(str, z);
            return;
        }
        if (this._outputTail + 1 >= this._outputEnd) {
            _flushBuffer();
        }
        if (z) {
            char[] cArr = this._outputBuffer;
            int i2 = this._outputTail;
            this._outputTail = i2 + 1;
            cArr[i2] = ',';
        }
        if (this._cfgUnqNames) {
            _writeString(str);
            return;
        }
        char[] cArr2 = this._outputBuffer;
        int i3 = this._outputTail;
        this._outputTail = i3 + 1;
        cArr2[i3] = this._quoteChar;
        _writeString(str);
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr3 = this._outputBuffer;
        int i4 = this._outputTail;
        this._outputTail = i4 + 1;
        cArr3[i4] = this._quoteChar;
    }

    @Override // com.fasterxml.jackson.core.base.GeneratorBase, com.fasterxml.jackson.core.JsonGenerator
    public void writeString(SerializableString serializableString) throws IOException {
        _verifyValueWrite("write a string");
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr = this._outputBuffer;
        int i2 = this._outputTail;
        int i3 = i2 + 1;
        this._outputTail = i3;
        cArr[i2] = this._quoteChar;
        int iAppendQuoted = serializableString.appendQuoted(cArr, i3);
        if (iAppendQuoted < 0) {
            _writeString2(serializableString);
            return;
        }
        int i4 = this._outputTail + iAppendQuoted;
        this._outputTail = i4;
        if (i4 >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr2 = this._outputBuffer;
        int i5 = this._outputTail;
        this._outputTail = i5 + 1;
        cArr2[i5] = this._quoteChar;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0041 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void _writeStringCustom(int r11) throws java.io.IOException {
        /*
            r10 = this;
            int r0 = r10._outputTail
            int r0 = r0 + r11
            int[] r11 = r10._outputEscapes
            int r1 = r10._maximumNonEscapedChar
            if (r1 > 0) goto Lc
            r1 = 65535(0xffff, float:9.1834E-41)
        Lc:
            int r2 = r11.length
            int r3 = r1 + 1
            int r2 = java.lang.Math.min(r2, r3)
            com.fasterxml.jackson.core.io.CharacterEscapes r3 = r10._characterEscapes
        L15:
            int r4 = r10._outputTail
            if (r4 >= r0) goto L53
        L19:
            char[] r4 = r10._outputBuffer
            int r5 = r10._outputTail
            char r4 = r4[r5]
            if (r4 >= r2) goto L26
            r5 = r11[r4]
            if (r5 == 0) goto L4b
            goto L33
        L26:
            if (r4 <= r1) goto L2a
            r5 = -1
            goto L33
        L2a:
            com.fasterxml.jackson.core.SerializableString r5 = r3.getEscapeSequence(r4)
            r10._currentEscape = r5
            if (r5 == 0) goto L4b
            r5 = -2
        L33:
            int r6 = r10._outputTail
            int r7 = r10._outputHead
            int r6 = r6 - r7
            if (r6 <= 0) goto L41
            java.io.Writer r8 = r10._writer
            char[] r9 = r10._outputBuffer
            r8.write(r9, r7, r6)
        L41:
            int r6 = r10._outputTail
            int r6 = r6 + 1
            r10._outputTail = r6
            r10._prependOrWriteCharacterEscape(r4, r5)
            goto L15
        L4b:
            int r4 = r10._outputTail
            int r4 = r4 + 1
            r10._outputTail = r4
            if (r4 < r0) goto L19
        L53:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeStringCustom(int):void");
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeString(String str) throws IOException {
        _verifyValueWrite("write a string");
        if (str == null) {
            _writeNull();
            return;
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr = this._outputBuffer;
        int i2 = this._outputTail;
        this._outputTail = i2 + 1;
        cArr[i2] = this._quoteChar;
        _writeString(str);
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr2 = this._outputBuffer;
        int i3 = this._outputTail;
        this._outputTail = i3 + 1;
        cArr2[i3] = this._quoteChar;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeBinary(Base64Variant base64Variant, byte[] bArr, int i2, int i3) throws IOException {
        _checkRangeBoundsForByteArray(bArr, i2, i3);
        _verifyValueWrite("write a binary value");
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr = this._outputBuffer;
        int i4 = this._outputTail;
        this._outputTail = i4 + 1;
        cArr[i4] = this._quoteChar;
        _writeBinary(base64Variant, bArr, i2, i3 + i2);
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr2 = this._outputBuffer;
        int i5 = this._outputTail;
        this._outputTail = i5 + 1;
        cArr2[i5] = this._quoteChar;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeString(char[] cArr, int i2, int i3) throws IOException {
        _verifyValueWrite("write a string");
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr2 = this._outputBuffer;
        int i4 = this._outputTail;
        this._outputTail = i4 + 1;
        cArr2[i4] = this._quoteChar;
        _writeString(cArr, i2, i3);
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr3 = this._outputBuffer;
        int i5 = this._outputTail;
        this._outputTail = i5 + 1;
        cArr3[i5] = this._quoteChar;
    }

    protected int _writeBinary(Base64Variant base64Variant, InputStream inputStream, byte[] bArr) throws IOException {
        byte[] bArr2 = bArr;
        int i2 = this._outputEnd - 6;
        int i3 = 2;
        int i4 = -3;
        int maxLineLength = base64Variant.getMaxLineLength() >> 2;
        int i5 = 0;
        int i_readMore = 0;
        int i6 = 0;
        while (true) {
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
                char[] cArr = this._outputBuffer;
                int i9 = iEncodeBase64Chunk + 1;
                this._outputTail = i9;
                cArr[iEncodeBase64Chunk] = '\\';
                this._outputTail = iEncodeBase64Chunk + 2;
                cArr[i9] = 'n';
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

    protected void _writeBinary(Base64Variant base64Variant, byte[] bArr, int i2, int i3) throws IOException {
        int iEncodeBase64Chunk;
        int i4 = this._outputEnd - 6;
        int maxLineLength = base64Variant.getMaxLineLength();
        int i5 = 2;
        loop0: while (true) {
            int i6 = maxLineLength >> 2;
            while (i2 <= i3 - 3) {
                if (this._outputTail > i4) {
                    _flushBuffer();
                }
                int i7 = i2 + 2;
                int i8 = ((bArr[i2 + 1] & 255) | (bArr[i2] << 8)) << 8;
                i2 += 3;
                iEncodeBase64Chunk = base64Variant.encodeBase64Chunk(i8 | (bArr[i7] & 255), this._outputBuffer, this._outputTail);
                this._outputTail = iEncodeBase64Chunk;
                i6--;
                if (i6 <= 0) {
                    break;
                }
            }
            char[] cArr = this._outputBuffer;
            int i9 = iEncodeBase64Chunk + 1;
            this._outputTail = i9;
            cArr[iEncodeBase64Chunk] = '\\';
            this._outputTail = iEncodeBase64Chunk + 2;
            cArr[i9] = 'n';
            maxLineLength = base64Variant.getMaxLineLength();
        }
        int i10 = i3 - i2;
        if (i10 > 0) {
            if (this._outputTail > i4) {
                _flushBuffer();
            }
            int i11 = i2 + 1;
            int i12 = bArr[i2] << StylePropertiesKt.BottomId;
            if (i10 == 2) {
                i12 |= (bArr[i11] & 255) << 8;
            } else {
                i5 = i10;
            }
            this._outputTail = base64Variant.encodeBase64Partial(i12, i5, this._outputBuffer, this._outputTail);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v11 */
    private int _prependOrWriteCharacterEscape(char[] cArr, int i2, int i3, char c2, int i4) throws IOException {
        String value;
        char c3;
        if (i4 >= 0) {
            char c4 = (char) i4;
            if (i2 > 1 && i2 < i3) {
                int i5 = i2 - 2;
                cArr[i5] = '\\';
                cArr[i2 - 1] = c4;
                return i5;
            }
            char[] cArr_allocateEntityBuffer = this._entityBuffer;
            if (cArr_allocateEntityBuffer == null) {
                cArr_allocateEntityBuffer = _allocateEntityBuffer();
            }
            cArr_allocateEntityBuffer[1] = c4;
            this._writer.write(cArr_allocateEntityBuffer, 0, 2);
            return i2;
        }
        if (i4 == -2) {
            SerializableString serializableString = this._currentEscape;
            if (serializableString == null) {
                value = this._characterEscapes.getEscapeSequence(c2).getValue();
            } else {
                value = serializableString.getValue();
                this._currentEscape = null;
            }
            int length = value.length();
            if (i2 >= length && i2 < i3) {
                int i6 = i2 - length;
                value.getChars(0, length, cArr, i6);
                return i6;
            }
            this._writer.write(value);
            return i2;
        }
        char[] hexChars = getHexChars();
        if (i2 > 5 && i2 < i3) {
            cArr[i2 - 6] = '\\';
            int i7 = i2 - 4;
            int i8 = i2 - 3;
            int i9 = i2 - 2;
            cArr[i2 - 5] = 'u';
            if (c2 > 255) {
                int i10 = c2 >> '\b';
                cArr[i7] = hexChars[(i10 & 255) >> 4];
                cArr[i8] = hexChars[i10 & 15];
                c3 = c2 & 255;
            } else {
                cArr[i7] = '0';
                cArr[i8] = '0';
                c3 = c2;
            }
            cArr[i9] = hexChars[c3 >> 4];
            cArr[i2 - 1] = hexChars[c3 & 15];
            return i2 - 6;
        }
        char[] cArr_allocateEntityBuffer2 = this._entityBuffer;
        if (cArr_allocateEntityBuffer2 == null) {
            cArr_allocateEntityBuffer2 = _allocateEntityBuffer();
        }
        this._outputHead = this._outputTail;
        if (c2 > 255) {
            int i11 = c2 >> '\b';
            cArr_allocateEntityBuffer2[10] = hexChars[(i11 & 255) >> 4];
            cArr_allocateEntityBuffer2[11] = hexChars[i11 & 15];
            cArr_allocateEntityBuffer2[12] = hexChars[(c2 & 255) >> 4];
            cArr_allocateEntityBuffer2[13] = hexChars[c2 & 15];
            this._writer.write(cArr_allocateEntityBuffer2, 8, 6);
            return i2;
        }
        cArr_allocateEntityBuffer2[6] = hexChars[c2 >> 4];
        cArr_allocateEntityBuffer2[7] = hexChars[c2 & 15];
        this._writer.write(cArr_allocateEntityBuffer2, 2, 6);
        return i2;
    }
}
