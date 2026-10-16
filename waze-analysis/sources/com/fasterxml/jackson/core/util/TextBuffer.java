package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.io.NumberInput;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class TextBuffer {
    static final char[] NO_CHARS = new char[0];
    private final BufferRecycler _allocator;
    private char[] _currentSegment;
    private int _currentSize;
    private boolean _hasSegments;
    private char[] _inputBuffer;
    private int _inputLen;
    private int _inputStart;
    private char[] _resultArray;
    private String _resultString;
    private int _segmentSize;
    private ArrayList<char[]> _segments;

    protected TextBuffer(BufferRecycler bufferRecycler, char[] cArr) {
        this(null);
        this._currentSegment = cArr;
        this._currentSize = cArr.length;
        this._inputStart = -1;
    }

    private char[] buf(int i2) {
        BufferRecycler bufferRecycler = this._allocator;
        return bufferRecycler != null ? bufferRecycler.allocCharBuffer(2, i2) : new char[Math.max(i2, 500)];
    }

    private char[] carr(int i2) {
        return new char[i2];
    }

    private void clearSegments() {
        this._hasSegments = false;
        this._segments.clear();
        this._segmentSize = 0;
        this._currentSize = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029 A[PHI: r0
  0x0029: PHI (r0v9 int) = (r0v6 int), (r0v7 int) binds: [B:9:0x0027, B:12:0x002d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void expand() {
        /*
            r3 = this;
            java.util.ArrayList<char[]> r0 = r3._segments
            if (r0 != 0) goto Lb
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3._segments = r0
        Lb:
            char[] r1 = r3._currentSegment
            r2 = 1
            r3._hasSegments = r2
            r0.add(r1)
            int r0 = r3._segmentSize
            int r1 = r1.length
            int r0 = r0 + r1
            r3._segmentSize = r0
            if (r0 >= 0) goto L1f
            int r0 = r0 - r1
            r3._reportBufferOverflow(r0, r1)
        L1f:
            r0 = 0
            r3._currentSize = r0
            int r0 = r1 >> 1
            int r1 = r1 + r0
            r0 = 500(0x1f4, float:7.0E-43)
            if (r1 >= r0) goto L2b
        L29:
            r1 = r0
            goto L30
        L2b:
            r0 = 65536(0x10000, float:9.1835E-41)
            if (r1 <= r0) goto L30
            goto L29
        L30:
            char[] r0 = r3.carr(r1)
            r3._currentSegment = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.util.TextBuffer.expand():void");
    }

    public static TextBuffer fromInitial(char[] cArr) {
        return new TextBuffer(null, cArr);
    }

    private char[] resultArray() {
        int i2;
        String str = this._resultString;
        if (str != null) {
            return str.toCharArray();
        }
        if (this._inputStart >= 0) {
            int i3 = this._inputLen;
            if (i3 > 0) {
                validateStringLength(i3);
                int i4 = this._inputStart;
                char[] cArr = this._inputBuffer;
                return i4 == 0 ? Arrays.copyOf(cArr, i3) : Arrays.copyOfRange(cArr, i4, i3 + i4);
            }
        } else {
            int size = size();
            if (size > 0) {
                validateStringLength(size);
                char[] carr = carr(size);
                ArrayList<char[]> arrayList = this._segments;
                if (arrayList != null) {
                    int size2 = arrayList.size();
                    i2 = 0;
                    for (int i5 = 0; i5 < size2; i5++) {
                        char[] cArr2 = this._segments.get(i5);
                        int length = cArr2.length;
                        System.arraycopy(cArr2, 0, carr, i2, length);
                        i2 += length;
                    }
                } else {
                    i2 = 0;
                }
                System.arraycopy(this._currentSegment, 0, carr, i2, this._currentSize);
                return carr;
            }
            if (size < 0) {
                _reportBufferOverflow(this._segmentSize, this._currentSize);
            }
        }
        return NO_CHARS;
    }

    private void unshare(int i2) {
        int i3 = this._inputLen;
        this._inputLen = 0;
        char[] cArr = this._inputBuffer;
        this._inputBuffer = null;
        int i4 = this._inputStart;
        this._inputStart = -1;
        int i5 = i2 + i3;
        char[] cArrBuf = this._currentSegment;
        if (cArrBuf == null || i5 > cArrBuf.length) {
            cArrBuf = buf(i5);
            this._currentSegment = cArrBuf;
        }
        if (i3 > 0) {
            System.arraycopy(cArr, i4, cArrBuf, 0, i3);
        }
        this._segmentSize = 0;
        this._currentSize = i3;
    }

    private void validateAppend(int i2) {
        int i3 = this._segmentSize + this._currentSize + i2;
        if (i3 < 0) {
            i3 = Integer.MAX_VALUE;
        }
        validateStringLength(i3);
    }

    protected void _reportBufferOverflow(int i2, int i3) {
        throw new IllegalStateException("TextBuffer overrun: size reached (" + (i2 + i3) + ") exceeds maximum of 2147483647");
    }

    public void append(String str, int i2, int i3) {
        if (this._inputStart >= 0) {
            unshare(i3);
        }
        this._resultString = null;
        this._resultArray = null;
        char[] cArr = this._currentSegment;
        int length = cArr.length;
        int i4 = this._currentSize;
        int i5 = length - i4;
        if (i5 >= i3) {
            str.getChars(i2, i2 + i3, cArr, i4);
            this._currentSize += i3;
            return;
        }
        validateAppend(i3);
        if (i5 > 0) {
            int i6 = i2 + i5;
            str.getChars(i2, i6, cArr, this._currentSize);
            i3 -= i5;
            i2 = i6;
        }
        while (true) {
            expand();
            int iMin = Math.min(this._currentSegment.length, i3);
            int i7 = i2 + iMin;
            str.getChars(i2, i7, this._currentSegment, 0);
            this._currentSize += iMin;
            i3 -= iMin;
            if (i3 <= 0) {
                return;
            } else {
                i2 = i7;
            }
        }
    }

    public BufferRecycler bufferRecycler() {
        return this._allocator;
    }

    public char[] contentsAsArray() {
        char[] cArr = this._resultArray;
        if (cArr != null) {
            return cArr;
        }
        char[] cArrResultArray = resultArray();
        this._resultArray = cArrResultArray;
        return cArrResultArray;
    }

    public BigDecimal contentsAsDecimal(boolean z) {
        String str = this._resultString;
        if (str != null) {
            return NumberInput.parseBigDecimal(str, z);
        }
        int i2 = this._inputStart;
        if (i2 >= 0) {
            return NumberInput.parseBigDecimal(this._inputBuffer, i2, this._inputLen, z);
        }
        if (!this._hasSegments) {
            return NumberInput.parseBigDecimal(this._currentSegment, 0, this._currentSize, z);
        }
        char[] cArr = this._resultArray;
        if (cArr != null) {
            return NumberInput.parseBigDecimal(cArr, z);
        }
        try {
            return NumberInput.parseBigDecimal(contentsAsArray(), z);
        } catch (IOException e2) {
            throw new NumberFormatException(e2.getMessage());
        }
    }

    public double contentsAsDouble(boolean z) {
        String str = this._resultString;
        if (str != null) {
            return NumberInput.parseDouble(str, z);
        }
        int i2 = this._inputStart;
        if (i2 >= 0) {
            return NumberInput.parseDouble(this._inputBuffer, i2, this._inputLen, z);
        }
        if (!this._hasSegments) {
            return NumberInput.parseDouble(this._currentSegment, 0, this._currentSize, z);
        }
        char[] cArr = this._resultArray;
        if (cArr != null) {
            return NumberInput.parseDouble(cArr, z);
        }
        try {
            return NumberInput.parseDouble(contentsAsString(), z);
        } catch (IOException e2) {
            throw new NumberFormatException(e2.getMessage());
        }
    }

    public float contentsAsFloat(boolean z) {
        String str = this._resultString;
        if (str != null) {
            return NumberInput.parseFloat(str, z);
        }
        int i2 = this._inputStart;
        if (i2 >= 0) {
            return NumberInput.parseFloat(this._inputBuffer, i2, this._inputLen, z);
        }
        if (!this._hasSegments) {
            return NumberInput.parseFloat(this._currentSegment, 0, this._currentSize, z);
        }
        char[] cArr = this._resultArray;
        if (cArr != null) {
            return NumberInput.parseFloat(cArr, z);
        }
        try {
            return NumberInput.parseFloat(contentsAsString(), z);
        } catch (IOException e2) {
            throw new NumberFormatException(e2.getMessage());
        }
    }

    public int contentsAsInt(boolean z) {
        char[] cArr;
        int i2 = this._inputStart;
        if (i2 < 0 || (cArr = this._inputBuffer) == null) {
            char[] cArr2 = this._currentSegment;
            return z ? -NumberInput.parseInt(cArr2, 1, this._currentSize - 1) : NumberInput.parseInt(cArr2, 0, this._currentSize);
        }
        int i3 = this._inputLen;
        return z ? -NumberInput.parseInt(cArr, i2 + 1, i3 - 1) : NumberInput.parseInt(cArr, i2, i3);
    }

    public long contentsAsLong(boolean z) {
        char[] cArr;
        int i2 = this._inputStart;
        if (i2 < 0 || (cArr = this._inputBuffer) == null) {
            char[] cArr2 = this._currentSegment;
            return z ? -NumberInput.parseLong(cArr2, 1, this._currentSize - 1) : NumberInput.parseLong(cArr2, 0, this._currentSize);
        }
        int i3 = this._inputLen;
        return z ? -NumberInput.parseLong(cArr, i2 + 1, i3 - 1) : NumberInput.parseLong(cArr, i2, i3);
    }

    public String contentsAsString() {
        String str = this._resultString;
        if (str != null) {
            return str;
        }
        char[] cArr = this._resultArray;
        if (cArr != null) {
            String str2 = new String(cArr);
            this._resultString = str2;
            return str2;
        }
        if (this._inputStart >= 0) {
            int i2 = this._inputLen;
            if (i2 <= 0) {
                this._resultString = "";
                return "";
            }
            validateStringLength(i2);
            String str3 = new String(this._inputBuffer, this._inputStart, this._inputLen);
            this._resultString = str3;
            return str3;
        }
        int i3 = this._segmentSize;
        int i4 = this._currentSize;
        if (i3 == 0) {
            if (i4 == 0) {
                this._resultString = "";
                return "";
            }
            validateStringLength(i4);
            String str4 = new String(this._currentSegment, 0, i4);
            this._resultString = str4;
            return str4;
        }
        int i5 = i3 + i4;
        if (i5 < 0) {
            _reportBufferOverflow(i3, i4);
        }
        validateStringLength(i5);
        StringBuilder sb = new StringBuilder(i5);
        ArrayList<char[]> arrayList = this._segments;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i6 = 0; i6 < size; i6++) {
                char[] cArr2 = this._segments.get(i6);
                sb.append(cArr2, 0, cArr2.length);
            }
        }
        sb.append(this._currentSegment, 0, this._currentSize);
        String string = sb.toString();
        this._resultString = string;
        return string;
    }

    public int contentsToWriter(Writer writer) throws IOException {
        int i2;
        char[] cArr = this._resultArray;
        if (cArr != null) {
            writer.write(cArr);
            return this._resultArray.length;
        }
        String str = this._resultString;
        if (str != null) {
            writer.write(str);
            return this._resultString.length();
        }
        int i3 = this._inputStart;
        if (i3 >= 0) {
            int i4 = this._inputLen;
            if (i4 > 0) {
                writer.write(this._inputBuffer, i3, i4);
            }
            return i4;
        }
        ArrayList<char[]> arrayList = this._segments;
        if (arrayList != null) {
            int size = arrayList.size();
            i2 = 0;
            for (int i5 = 0; i5 < size; i5++) {
                char[] cArr2 = this._segments.get(i5);
                int length = cArr2.length;
                i2 += length;
                writer.write(cArr2, 0, length);
            }
        } else {
            i2 = 0;
        }
        int i6 = this._currentSize;
        if (i6 <= 0) {
            return i2;
        }
        int i7 = i2 + i6;
        writer.write(this._currentSegment, 0, i6);
        return i7;
    }

    public char[] emptyAndGetCurrentSegment() {
        this._inputStart = -1;
        this._currentSize = 0;
        this._inputLen = 0;
        this._inputBuffer = null;
        this._resultString = null;
        this._resultArray = null;
        if (this._hasSegments) {
            clearSegments();
        }
        char[] cArr = this._currentSegment;
        if (cArr != null) {
            return cArr;
        }
        char[] cArrBuf = buf(0);
        this._currentSegment = cArrBuf;
        return cArrBuf;
    }

    public char[] expandCurrentSegment() {
        char[] cArr = this._currentSegment;
        int length = cArr.length;
        int i2 = (length >> 1) + length;
        if (i2 > 65536) {
            i2 = (length >> 2) + length;
        }
        char[] cArrCopyOf = Arrays.copyOf(cArr, i2);
        this._currentSegment = cArrCopyOf;
        return cArrCopyOf;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0030 A[PHI: r1
  0x0030: PHI (r1v9 int) = (r1v7 int), (r1v8 int) binds: [B:9:0x002e, B:12:0x0034] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public char[] finishCurrentSegment() {
        /*
            r2 = this;
            java.util.ArrayList<char[]> r0 = r2._segments
            if (r0 != 0) goto Lb
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2._segments = r0
        Lb:
            r1 = 1
            r2._hasSegments = r1
            char[] r1 = r2._currentSegment
            r0.add(r1)
            char[] r0 = r2._currentSegment
            int r0 = r0.length
            int r1 = r2._segmentSize
            int r1 = r1 + r0
            r2._segmentSize = r1
            if (r1 >= 0) goto L21
            int r1 = r1 - r0
            r2._reportBufferOverflow(r1, r0)
        L21:
            r1 = 0
            r2._currentSize = r1
            int r1 = r2._segmentSize
            r2.validateStringLength(r1)
            int r1 = r0 >> 1
            int r0 = r0 + r1
            r1 = 500(0x1f4, float:7.0E-43)
            if (r0 >= r1) goto L32
        L30:
            r0 = r1
            goto L37
        L32:
            r1 = 65536(0x10000, float:9.1835E-41)
            if (r0 <= r1) goto L37
            goto L30
        L37:
            char[] r0 = r2.carr(r0)
            r2._currentSegment = r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.util.TextBuffer.finishCurrentSegment():char[]");
    }

    public char[] getBufferWithoutReset() {
        return this._currentSegment;
    }

    public char[] getCurrentSegment() {
        if (this._inputStart >= 0) {
            unshare(1);
        } else {
            char[] cArr = this._currentSegment;
            if (cArr == null) {
                this._currentSegment = buf(0);
            } else if (this._currentSize >= cArr.length) {
                expand();
            }
        }
        return this._currentSegment;
    }

    public int getCurrentSegmentSize() {
        return this._currentSize;
    }

    public char[] getTextBuffer() {
        if (this._inputStart >= 0) {
            return this._inputBuffer;
        }
        char[] cArr = this._resultArray;
        if (cArr != null) {
            return cArr;
        }
        String str = this._resultString;
        if (str != null) {
            char[] charArray = str.toCharArray();
            this._resultArray = charArray;
            return charArray;
        }
        if (this._hasSegments) {
            return contentsAsArray();
        }
        char[] cArr2 = this._currentSegment;
        return cArr2 == null ? NO_CHARS : cArr2;
    }

    public int getTextOffset() {
        int i2 = this._inputStart;
        if (i2 >= 0) {
            return i2;
        }
        return 0;
    }

    public boolean hasTextAsCharacters() {
        return this._inputStart >= 0 || this._resultArray != null || this._resultString == null;
    }

    public void releaseBuffers() {
        char[] cArr;
        this._inputStart = -1;
        this._currentSize = 0;
        this._inputLen = 0;
        this._inputBuffer = null;
        this._resultArray = null;
        if (this._hasSegments) {
            clearSegments();
        }
        BufferRecycler bufferRecycler = this._allocator;
        if (bufferRecycler == null || (cArr = this._currentSegment) == null) {
            return;
        }
        this._currentSegment = null;
        bufferRecycler.releaseCharBuffer(2, cArr);
    }

    public void resetWithCopy(String str, int i2, int i3) {
        this._inputBuffer = null;
        this._inputStart = -1;
        this._inputLen = 0;
        this._resultString = null;
        this._resultArray = null;
        if (this._hasSegments) {
            clearSegments();
        } else if (this._currentSegment == null) {
            this._currentSegment = buf(i3);
        }
        this._segmentSize = 0;
        this._currentSize = 0;
        append(str, 0, i3);
    }

    public void resetWithShared(char[] cArr, int i2, int i3) {
        this._resultString = null;
        this._resultArray = null;
        this._inputBuffer = cArr;
        this._inputStart = i2;
        this._inputLen = i3;
        if (this._hasSegments) {
            clearSegments();
        }
    }

    public void resetWithString(String str) {
        this._inputBuffer = null;
        this._inputStart = -1;
        this._inputLen = 0;
        validateStringLength(str.length());
        this._resultString = str;
        this._resultArray = null;
        if (this._hasSegments) {
            clearSegments();
        }
        this._currentSize = 0;
    }

    public String setCurrentAndReturn(int i2) {
        this._currentSize = i2;
        if (this._segmentSize > 0) {
            return contentsAsString();
        }
        validateStringLength(i2);
        String str = i2 == 0 ? "" : new String(this._currentSegment, 0, i2);
        this._resultString = str;
        return str;
    }

    public void setCurrentLength(int i2) {
        this._currentSize = i2;
    }

    public int size() {
        if (this._inputStart >= 0) {
            return this._inputLen;
        }
        char[] cArr = this._resultArray;
        if (cArr != null) {
            return cArr.length;
        }
        String str = this._resultString;
        return str != null ? str.length() : this._segmentSize + this._currentSize;
    }

    public String toString() {
        try {
            return contentsAsString();
        } catch (IOException unused) {
            return "TextBuffer: Exception when reading contents";
        }
    }

    protected void validateStringLength(int i2) {
    }

    public TextBuffer(BufferRecycler bufferRecycler) {
        this._allocator = bufferRecycler;
    }

    public void resetWithCopy(char[] cArr, int i2, int i3) {
        this._inputBuffer = null;
        this._inputStart = -1;
        this._inputLen = 0;
        this._resultString = null;
        this._resultArray = null;
        if (this._hasSegments) {
            clearSegments();
        } else if (this._currentSegment == null) {
            this._currentSegment = buf(i3);
        }
        this._segmentSize = 0;
        this._currentSize = 0;
        append(cArr, i2, i3);
    }

    public void append(char c2) {
        if (this._inputStart >= 0) {
            unshare(16);
        }
        this._resultString = null;
        this._resultArray = null;
        char[] cArr = this._currentSegment;
        if (this._currentSize >= cArr.length) {
            validateAppend(1);
            expand();
            cArr = this._currentSegment;
        }
        int i2 = this._currentSize;
        this._currentSize = i2 + 1;
        cArr[i2] = c2;
    }

    public void append(char[] cArr, int i2, int i3) {
        if (this._inputStart >= 0) {
            unshare(i3);
        }
        this._resultString = null;
        this._resultArray = null;
        char[] cArr2 = this._currentSegment;
        int length = cArr2.length;
        int i4 = this._currentSize;
        int i5 = length - i4;
        if (i5 >= i3) {
            System.arraycopy(cArr, i2, cArr2, i4, i3);
            this._currentSize += i3;
            return;
        }
        validateAppend(i3);
        if (i5 > 0) {
            System.arraycopy(cArr, i2, cArr2, this._currentSize, i5);
            i2 += i5;
            i3 -= i5;
        }
        do {
            expand();
            int iMin = Math.min(this._currentSegment.length, i3);
            System.arraycopy(cArr, i2, this._currentSegment, 0, iMin);
            this._currentSize += iMin;
            i2 += iMin;
            i3 -= iMin;
        } while (i3 > 0);
    }
}
