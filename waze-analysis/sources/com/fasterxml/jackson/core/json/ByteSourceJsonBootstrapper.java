package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.format.InputAccessor;
import com.fasterxml.jackson.core.format.MatchStrength;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.io.MergedStream;
import com.fasterxml.jackson.core.io.UTF32Reader;
import com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer;
import com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer;
import com.fasterxml.jackson.core.util.VersionUtil;
import java.io.ByteArrayInputStream;
import java.io.CharConversionException;
import java.io.DataInput;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringReader;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ByteSourceJsonBootstrapper {
    private boolean _bigEndian;
    private final boolean _bufferRecyclable;
    private int _bytesPerChar;
    private final IOContext _context;
    private final InputStream _in;
    private final byte[] _inputBuffer;
    private int _inputEnd;
    private int _inputPtr;

    public ByteSourceJsonBootstrapper(IOContext iOContext, InputStream inputStream) {
        this._bigEndian = true;
        this._context = iOContext;
        this._in = inputStream;
        this._inputBuffer = iOContext.allocReadIOBuffer();
        this._inputPtr = 0;
        this._inputEnd = 0;
        this._bufferRecyclable = true;
    }

    private boolean checkUTF16(int i2) {
        if ((65280 & i2) == 0) {
            this._bigEndian = true;
        } else {
            if ((i2 & 255) != 0) {
                return false;
            }
            this._bigEndian = false;
        }
        this._bytesPerChar = 2;
        return true;
    }

    private boolean checkUTF32(int i2) throws CharConversionException {
        if ((i2 >> 8) == 0) {
            this._bigEndian = true;
        } else if ((16777215 & i2) == 0) {
            this._bigEndian = false;
        } else if (((-16711681) & i2) == 0) {
            reportWeirdUCS4("3412");
        } else {
            if ((i2 & (-65281)) != 0) {
                return false;
            }
            reportWeirdUCS4("2143");
        }
        this._bytesPerChar = 4;
        return true;
    }

    private boolean handleBOM(int i2) throws CharConversionException {
        int i3;
        if (i2 != -16842752) {
            i3 = 4;
            if (i2 != -131072) {
                if (i2 == 65279) {
                    this._bigEndian = true;
                    this._inputPtr += 4;
                    this._bytesPerChar = 4;
                    return true;
                }
                if (i2 == 65534) {
                    reportWeirdUCS4("2143");
                }
            }
            this._inputPtr += i3;
            this._bytesPerChar = i3;
            this._bigEndian = false;
            return true;
        }
        reportWeirdUCS4("3412");
        int i4 = i2 >>> 16;
        i3 = 2;
        if (i4 == 65279) {
            this._inputPtr += 2;
            this._bytesPerChar = 2;
            this._bigEndian = true;
            return true;
        }
        if (i4 != 65534) {
            if ((i2 >>> 8) != 15711167) {
                return false;
            }
            this._inputPtr += 3;
            this._bytesPerChar = 1;
            this._bigEndian = true;
            return true;
        }
        this._inputPtr += i3;
        this._bytesPerChar = i3;
        this._bigEndian = false;
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x00a1, code lost:
    
        if (r5 >= 48) goto L76;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.fasterxml.jackson.core.format.MatchStrength hasJSONFormat(com.fasterxml.jackson.core.format.InputAccessor r5) {
        /*
            boolean r0 = r5.hasMoreBytes()
            if (r0 != 0) goto L9
            com.fasterxml.jackson.core.format.MatchStrength r5 = com.fasterxml.jackson.core.format.MatchStrength.INCONCLUSIVE
            return r5
        L9:
            byte r0 = r5.nextByte()
            r1 = -17
            if (r0 != r1) goto L46
            boolean r0 = r5.hasMoreBytes()
            if (r0 != 0) goto L1a
            com.fasterxml.jackson.core.format.MatchStrength r5 = com.fasterxml.jackson.core.format.MatchStrength.INCONCLUSIVE
            return r5
        L1a:
            byte r0 = r5.nextByte()
            r1 = -69
            if (r0 == r1) goto L25
            com.fasterxml.jackson.core.format.MatchStrength r5 = com.fasterxml.jackson.core.format.MatchStrength.NO_MATCH
            return r5
        L25:
            boolean r0 = r5.hasMoreBytes()
            if (r0 != 0) goto L2e
            com.fasterxml.jackson.core.format.MatchStrength r5 = com.fasterxml.jackson.core.format.MatchStrength.INCONCLUSIVE
            return r5
        L2e:
            byte r0 = r5.nextByte()
            r1 = -65
            if (r0 == r1) goto L39
            com.fasterxml.jackson.core.format.MatchStrength r5 = com.fasterxml.jackson.core.format.MatchStrength.NO_MATCH
            return r5
        L39:
            boolean r0 = r5.hasMoreBytes()
            if (r0 != 0) goto L42
            com.fasterxml.jackson.core.format.MatchStrength r5 = com.fasterxml.jackson.core.format.MatchStrength.INCONCLUSIVE
            return r5
        L42:
            byte r0 = r5.nextByte()
        L46:
            int r0 = skipSpace(r5, r0)
            if (r0 >= 0) goto L4f
            com.fasterxml.jackson.core.format.MatchStrength r5 = com.fasterxml.jackson.core.format.MatchStrength.INCONCLUSIVE
            return r5
        L4f:
            r1 = 123(0x7b, float:1.72E-43)
            r2 = 34
            if (r0 != r1) goto L6b
            int r5 = skipSpace(r5)
            if (r5 >= 0) goto L5e
            com.fasterxml.jackson.core.format.MatchStrength r5 = com.fasterxml.jackson.core.format.MatchStrength.INCONCLUSIVE
            return r5
        L5e:
            if (r5 == r2) goto L68
            r0 = 125(0x7d, float:1.75E-43)
            if (r5 != r0) goto L65
            goto L68
        L65:
            com.fasterxml.jackson.core.format.MatchStrength r5 = com.fasterxml.jackson.core.format.MatchStrength.NO_MATCH
            return r5
        L68:
            com.fasterxml.jackson.core.format.MatchStrength r5 = com.fasterxml.jackson.core.format.MatchStrength.SOLID_MATCH
            return r5
        L6b:
            r1 = 91
            if (r0 != r1) goto L85
            int r5 = skipSpace(r5)
            if (r5 >= 0) goto L78
            com.fasterxml.jackson.core.format.MatchStrength r5 = com.fasterxml.jackson.core.format.MatchStrength.INCONCLUSIVE
            return r5
        L78:
            r0 = 93
            if (r5 == r0) goto L82
            if (r5 != r1) goto L7f
            goto L82
        L7f:
            com.fasterxml.jackson.core.format.MatchStrength r5 = com.fasterxml.jackson.core.format.MatchStrength.SOLID_MATCH
            return r5
        L82:
            com.fasterxml.jackson.core.format.MatchStrength r5 = com.fasterxml.jackson.core.format.MatchStrength.SOLID_MATCH
            return r5
        L85:
            com.fasterxml.jackson.core.format.MatchStrength r1 = com.fasterxml.jackson.core.format.MatchStrength.WEAK_MATCH
            if (r0 != r2) goto L8a
            goto La4
        L8a:
            r2 = 48
            r3 = 57
            if (r0 > r3) goto L92
            if (r0 >= r2) goto La4
        L92:
            r4 = 45
            if (r0 != r4) goto La5
            int r5 = skipSpace(r5)
            if (r5 >= 0) goto L9f
            com.fasterxml.jackson.core.format.MatchStrength r5 = com.fasterxml.jackson.core.format.MatchStrength.INCONCLUSIVE
            return r5
        L9f:
            if (r5 > r3) goto Lc6
            if (r5 >= r2) goto La4
            goto Lc6
        La4:
            return r1
        La5:
            r2 = 110(0x6e, float:1.54E-43)
            if (r0 != r2) goto Lb0
            java.lang.String r0 = "ull"
            com.fasterxml.jackson.core.format.MatchStrength r5 = tryMatch(r5, r0, r1)
            return r5
        Lb0:
            r2 = 116(0x74, float:1.63E-43)
            if (r0 != r2) goto Lbb
            java.lang.String r0 = "rue"
            com.fasterxml.jackson.core.format.MatchStrength r5 = tryMatch(r5, r0, r1)
            return r5
        Lbb:
            r2 = 102(0x66, float:1.43E-43)
            if (r0 != r2) goto Lc6
            java.lang.String r0 = "alse"
            com.fasterxml.jackson.core.format.MatchStrength r5 = tryMatch(r5, r0, r1)
            return r5
        Lc6:
            com.fasterxml.jackson.core.format.MatchStrength r5 = com.fasterxml.jackson.core.format.MatchStrength.NO_MATCH
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper.hasJSONFormat(com.fasterxml.jackson.core.format.InputAccessor):com.fasterxml.jackson.core.format.MatchStrength");
    }

    private void reportWeirdUCS4(String str) throws CharConversionException {
        throw new CharConversionException("Unsupported UCS-4 endianness (" + str + ") detected");
    }

    private static int skipSpace(InputAccessor inputAccessor, byte b2) {
        while (true) {
            int i2 = b2 & 255;
            if (i2 != 32 && i2 != 13 && i2 != 10 && i2 != 9) {
                return i2;
            }
            if (!inputAccessor.hasMoreBytes()) {
                return -1;
            }
            b2 = inputAccessor.nextByte();
        }
    }

    public static int skipUTF8BOM(DataInput dataInput) {
        int unsignedByte = dataInput.readUnsignedByte();
        if (unsignedByte != 239) {
            return unsignedByte;
        }
        int unsignedByte2 = dataInput.readUnsignedByte();
        if (unsignedByte2 != 187) {
            throw new IOException("Unexpected byte 0x" + Integer.toHexString(unsignedByte2) + " following 0xEF; should get 0xBB as part of UTF-8 BOM");
        }
        int unsignedByte3 = dataInput.readUnsignedByte();
        if (unsignedByte3 == 191) {
            return dataInput.readUnsignedByte();
        }
        throw new IOException("Unexpected byte 0x" + Integer.toHexString(unsignedByte3) + " following 0xEF 0xBB; should get 0xBF as part of UTF-8 BOM");
    }

    private static MatchStrength tryMatch(InputAccessor inputAccessor, String str, MatchStrength matchStrength) {
        for (int i2 = 0; i2 < str.length(); i2++) {
            if (!inputAccessor.hasMoreBytes()) {
                return MatchStrength.INCONCLUSIVE;
            }
            if (inputAccessor.nextByte() != str.charAt(i2)) {
                return MatchStrength.NO_MATCH;
            }
        }
        return matchStrength;
    }

    public JsonParser constructParser(int i2, ObjectCodec objectCodec, ByteQuadsCanonicalizer byteQuadsCanonicalizer, CharsToNameCanonicalizer charsToNameCanonicalizer, int i3) {
        int i4 = this._inputPtr;
        JsonEncoding jsonEncodingDetectEncoding = JsonFactory.Feature.CHARSET_DETECTION.enabledIn(i3) ? detectEncoding() : JsonEncoding.UTF8;
        int i5 = this._inputPtr - i4;
        if (jsonEncodingDetectEncoding == JsonEncoding.UTF8 && JsonFactory.Feature.CANONICALIZE_FIELD_NAMES.enabledIn(i3)) {
            return new UTF8StreamJsonParser(this._context, i2, this._in, objectCodec, byteQuadsCanonicalizer.makeChild(i3), this._inputBuffer, this._inputPtr, this._inputEnd, i5, this._bufferRecyclable);
        }
        return new ReaderBasedJsonParser(this._context, i2, constructReader(), objectCodec, charsToNameCanonicalizer.makeChild());
    }

    public Reader constructReader() {
        JsonEncoding encoding = this._context.getEncoding();
        int iBits = encoding.bits();
        if (iBits != 8 && iBits != 16) {
            if (iBits != 32) {
                return (Reader) VersionUtil.throwInternalReturnAny();
            }
            IOContext iOContext = this._context;
            return new UTF32Reader(iOContext, this._in, this._inputBuffer, this._inputPtr, this._inputEnd, iOContext.getEncoding().isBigEndian());
        }
        InputStream mergedStream = this._in;
        if (mergedStream == null) {
            int i2 = this._inputEnd;
            int i3 = this._inputPtr;
            int i4 = i2 - i3;
            byte[] bArr = this._inputBuffer;
            if (i4 <= 8192) {
                return new StringReader(new String(bArr, this._inputPtr, i4, encoding.getJavaName()));
            }
            mergedStream = new ByteArrayInputStream(bArr, i3, i2);
        } else if (this._inputPtr < this._inputEnd) {
            mergedStream = new MergedStream(this._context, mergedStream, this._inputBuffer, this._inputPtr, this._inputEnd);
        }
        return new InputStreamReader(mergedStream, encoding.getJavaName());
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.fasterxml.jackson.core.JsonEncoding detectEncoding() {
        /*
            r8 = this;
            r0 = 4
            boolean r1 = r8.ensureLoaded(r0)
            r2 = 1
            r3 = 2
            if (r1 == 0) goto L40
            byte[] r1 = r8._inputBuffer
            int r4 = r8._inputPtr
            r5 = r1[r4]
            int r5 = r5 << 24
            int r6 = r4 + 1
            r6 = r1[r6]
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r7 = r4 + 2
            r7 = r1[r7]
            r7 = r7 & 255(0xff, float:3.57E-43)
            int r7 = r7 << 8
            int r4 = r4 + 3
            r1 = r1[r4]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r4 = r6 << 16
            r4 = r4 | r5
            r4 = r4 | r7
            r1 = r1 | r4
            boolean r4 = r8.handleBOM(r1)
            if (r4 == 0) goto L31
            goto L5c
        L31:
            boolean r4 = r8.checkUTF32(r1)
            if (r4 != 0) goto L5c
            int r1 = r1 >>> 16
            boolean r1 = r8.checkUTF16(r1)
            if (r1 != 0) goto L5c
            goto L82
        L40:
            boolean r1 = r8.ensureLoaded(r3)
            if (r1 == 0) goto L82
            byte[] r1 = r8._inputBuffer
            int r4 = r8._inputPtr
            r5 = r1[r4]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r5 = r5 << 8
            int r4 = r4 + r2
            r1 = r1[r4]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r1 = r1 | r5
            boolean r1 = r8.checkUTF16(r1)
            if (r1 == 0) goto L82
        L5c:
            int r1 = r8._bytesPerChar
            if (r1 == r2) goto L7f
            if (r1 == r3) goto L75
            if (r1 == r0) goto L6b
            java.lang.Object r8 = com.fasterxml.jackson.core.util.VersionUtil.throwInternalReturnAny()
            com.fasterxml.jackson.core.JsonEncoding r8 = (com.fasterxml.jackson.core.JsonEncoding) r8
            return r8
        L6b:
            boolean r0 = r8._bigEndian
            if (r0 == 0) goto L72
            com.fasterxml.jackson.core.JsonEncoding r0 = com.fasterxml.jackson.core.JsonEncoding.UTF32_BE
            goto L84
        L72:
            com.fasterxml.jackson.core.JsonEncoding r0 = com.fasterxml.jackson.core.JsonEncoding.UTF32_LE
            goto L84
        L75:
            boolean r0 = r8._bigEndian
            if (r0 == 0) goto L7c
            com.fasterxml.jackson.core.JsonEncoding r0 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE
            goto L84
        L7c:
            com.fasterxml.jackson.core.JsonEncoding r0 = com.fasterxml.jackson.core.JsonEncoding.UTF16_LE
            goto L84
        L7f:
            com.fasterxml.jackson.core.JsonEncoding r0 = com.fasterxml.jackson.core.JsonEncoding.UTF8
            goto L84
        L82:
            com.fasterxml.jackson.core.JsonEncoding r0 = com.fasterxml.jackson.core.JsonEncoding.UTF8
        L84:
            com.fasterxml.jackson.core.io.IOContext r8 = r8._context
            r8.setEncoding(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper.detectEncoding():com.fasterxml.jackson.core.JsonEncoding");
    }

    protected boolean ensureLoaded(int i2) throws IOException {
        int i3;
        int i4 = this._inputEnd - this._inputPtr;
        while (i4 < i2) {
            InputStream inputStream = this._in;
            if (inputStream == null) {
                i3 = -1;
            } else {
                byte[] bArr = this._inputBuffer;
                int i5 = this._inputEnd;
                i3 = inputStream.read(bArr, i5, bArr.length - i5);
            }
            if (i3 <= 0) {
                return false;
            }
            this._inputEnd += i3;
            i4 += i3;
        }
        return true;
    }

    public ByteSourceJsonBootstrapper(IOContext iOContext, byte[] bArr, int i2, int i3) {
        this._bigEndian = true;
        this._context = iOContext;
        this._in = null;
        this._inputBuffer = bArr;
        this._inputPtr = i2;
        this._inputEnd = i2 + i3;
        this._bufferRecyclable = false;
    }

    private static int skipSpace(InputAccessor inputAccessor) {
        if (inputAccessor.hasMoreBytes()) {
            return skipSpace(inputAccessor, inputAccessor.nextByte());
        }
        return -1;
    }
}
