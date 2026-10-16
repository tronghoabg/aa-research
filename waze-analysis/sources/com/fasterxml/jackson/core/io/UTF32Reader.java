package com.fasterxml.jackson.core.io;

import java.io.CharConversionException;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class UTF32Reader extends Reader {
    protected final boolean _bigEndian;
    protected byte[] _buffer;
    protected int _byteCount;
    protected int _charCount;
    protected final IOContext _context;
    protected InputStream _in;
    protected int _length;
    protected final boolean _managedBuffers;
    protected int _ptr;
    protected char _surrogate = 0;
    protected char[] _tmpBuf;

    public UTF32Reader(IOContext iOContext, InputStream inputStream, byte[] bArr, int i2, int i3, boolean z) {
        this._context = iOContext;
        this._in = inputStream;
        this._buffer = bArr;
        this._ptr = i2;
        this._length = i3;
        this._bigEndian = z;
        this._managedBuffers = inputStream != null;
    }

    private void freeBuffers() {
        byte[] bArr = this._buffer;
        if (bArr != null) {
            this._buffer = null;
            IOContext iOContext = this._context;
            if (iOContext != null) {
                iOContext.releaseReadIOBuffer(bArr);
            }
        }
    }

    private boolean loadMore(int i2) throws IOException {
        byte[] bArr;
        InputStream inputStream = this._in;
        if (inputStream == null || (bArr = this._buffer) == null) {
            return false;
        }
        this._byteCount += this._length - i2;
        if (i2 > 0) {
            int i3 = this._ptr;
            if (i3 > 0) {
                System.arraycopy(bArr, i3, bArr, 0, i2);
                this._ptr = 0;
            }
            this._length = i2;
        } else {
            this._ptr = 0;
            int i4 = inputStream.read(bArr);
            if (i4 <= 0) {
                this._length = 0;
                if (i4 < 0) {
                    if (this._managedBuffers) {
                        freeBuffers();
                    }
                    return false;
                }
                reportStrangeStream();
            }
            this._length = i4;
        }
        while (true) {
            int i5 = this._length;
            if (i5 >= 4) {
                return true;
            }
            InputStream inputStream2 = this._in;
            byte[] bArr2 = this._buffer;
            int i6 = inputStream2.read(bArr2, i5, bArr2.length - i5);
            if (i6 <= 0) {
                if (i6 < 0) {
                    if (this._managedBuffers) {
                        freeBuffers();
                    }
                    reportUnexpectedEOF(this._length, 4);
                }
                reportStrangeStream();
            }
            this._length += i6;
        }
    }

    private void reportBounds(char[] cArr, int i2, int i3) {
        throw new ArrayIndexOutOfBoundsException(String.format("read(buf,%d,%d), cbuf[%d]", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(cArr.length)));
    }

    private void reportInvalid(int i2, int i3, String str) throws CharConversionException {
        int i4 = this._byteCount + this._ptr;
        int i5 = this._charCount + i3;
        String hexString = Integer.toHexString(i2);
        StringBuilder sb = new StringBuilder("Invalid UTF-32 character 0x");
        sb.append(hexString);
        sb.append(str);
        sb.append(" at char #");
        sb.append(i5);
        sb.append(", byte #");
        sb.append(i4 - 1);
        sb.append(")");
        throw new CharConversionException(sb.toString());
    }

    private void reportStrangeStream() throws IOException {
        throw new IOException("Strange I/O stream, returned 0 bytes on read");
    }

    private void reportUnexpectedEOF(int i2, int i3) throws CharConversionException {
        int i4 = this._byteCount + i2;
        throw new CharConversionException("Unexpected EOF in the middle of a 4-byte UTF-32 char: got " + i2 + ", needed 4, at char #" + this._charCount + ", byte #" + i4 + ")");
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        InputStream inputStream = this._in;
        if (inputStream != null) {
            this._in = null;
            freeBuffers();
            inputStream.close();
        }
    }

    @Override // java.io.Reader
    public int read(char[] cArr, int i2, int i3) throws CharConversionException {
        int i4;
        int i5;
        int i6;
        if (this._buffer == null) {
            return -1;
        }
        if (i3 <= 0) {
            return i3;
        }
        if (i2 < 0 || i2 + i3 > cArr.length) {
            reportBounds(cArr, i2, i3);
        }
        int i7 = i3 + i2;
        char c2 = this._surrogate;
        if (c2 != 0) {
            i4 = i2 + 1;
            cArr[i2] = c2;
            this._surrogate = (char) 0;
        } else {
            int i8 = this._length - this._ptr;
            if (i8 < 4 && !loadMore(i8)) {
                if (i8 == 0) {
                    return -1;
                }
                reportUnexpectedEOF(this._length - this._ptr, 4);
            }
            i4 = i2;
        }
        int i9 = this._length - 4;
        while (true) {
            if (i4 < i7) {
                int i10 = this._ptr;
                if (i10 > i9) {
                    break;
                }
                int i11 = i10 + 3;
                int i12 = i10 + 2;
                int i13 = i10 + 1;
                boolean z = this._bigEndian;
                byte[] bArr = this._buffer;
                if (z) {
                    int i14 = bArr[i10] << 8;
                    int i15 = bArr[i13] & 255;
                    i6 = (bArr[i11] & 255) | ((bArr[i12] & 255) << 8);
                    i5 = i14 | i15;
                } else {
                    int i16 = bArr[i10] & 255;
                    int i17 = (bArr[i13] & 255) << 8;
                    i5 = (bArr[i12] & 255) | (bArr[i11] << 8);
                    i6 = i16 | i17;
                }
                this._ptr = i10 + 4;
                if (i5 != 0) {
                    char c3 = (char) i5;
                    int i18 = i6 | ((c3 - 1) << 16);
                    if (c3 > 16) {
                        reportInvalid(i18, i4 - i2, String.format(" (above 0x%08x)", 1114111));
                    }
                    int i19 = i4 + 1;
                    cArr[i4] = (char) ((i18 >> 10) + 55296);
                    int i20 = i18 & 1023;
                    if (i19 >= i7) {
                        this._surrogate = (char) i18;
                        i4 = i19;
                        break;
                    }
                    i6 = 56320 | i20;
                    i4 = i19;
                }
                cArr[i4] = (char) i6;
                i4++;
            } else {
                break;
            }
        }
        int i21 = i4 - i2;
        this._charCount += i21;
        return i21;
    }

    @Override // java.io.Reader
    public int read() {
        char[] cArr = this._tmpBuf;
        if (cArr == null) {
            cArr = new char[1];
            this._tmpBuf = cArr;
        }
        if (read(cArr, 0, 1) <= 0) {
            return -1;
        }
        return this._tmpBuf[0];
    }
}
