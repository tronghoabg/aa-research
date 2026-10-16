package com.fasterxml.jackson.core.json.async;

import androidx.autofill.HintConstants;
import androidx.compose.foundation.style.StylePropertiesKt;
import androidx.core.internal.view.SupportMenu;
import androidx.credentials.provider.CredentialEntry;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.exc.StreamConstraintsException;
import com.fasterxml.jackson.core.io.CharTypes;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.json.JsonReadFeature;
import com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer;
import com.fasterxml.jackson.core.util.InternalJacksonUtil;
import com.fasterxml.jackson.core.util.TextBuffer;
import com.fasterxml.jackson.core.util.VersionUtil;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public abstract class NonBlockingUtf8JsonParserBase extends NonBlockingJsonParserBase {
    private static final int FEAT_MASK_TRAILING_COMMA = JsonParser.Feature.ALLOW_TRAILING_COMMA.getMask();
    private static final int FEAT_MASK_LEADING_ZEROS = JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS.getMask();
    private static final int FEAT_MASK_ALLOW_MISSING = JsonParser.Feature.ALLOW_MISSING_VALUES.getMask();
    private static final int FEAT_MASK_ALLOW_SINGLE_QUOTES = JsonParser.Feature.ALLOW_SINGLE_QUOTES.getMask();
    private static final int FEAT_MASK_ALLOW_UNQUOTED_NAMES = JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES.getMask();
    private static final int FEAT_MASK_ALLOW_JAVA_COMMENTS = JsonParser.Feature.ALLOW_COMMENTS.getMask();
    private static final int FEAT_MASK_ALLOW_YAML_COMMENTS = JsonParser.Feature.ALLOW_YAML_COMMENTS.getMask();
    private static final int[] _icUTF8 = CharTypes.getInputCodeUtf8();
    protected static final int[] _icLatin1 = CharTypes.getInputCodeLatin1();

    protected NonBlockingUtf8JsonParserBase(IOContext iOContext, int i2, ByteQuadsCanonicalizer byteQuadsCanonicalizer) {
        super(iOContext, i2, byteQuadsCanonicalizer);
    }

    private final int _decodeCharEscape() {
        return this._inputEnd - this._inputPtr < 5 ? _decodeSplitEscaped(0, -1) : _decodeFastCharEscape();
    }

    private final int _decodeFastCharEscape() {
        int iCharToHex;
        byte nextSignedByteFromBuffer = getNextSignedByteFromBuffer();
        if (nextSignedByteFromBuffer == 34 || nextSignedByteFromBuffer == 47 || nextSignedByteFromBuffer == 92) {
            return (char) nextSignedByteFromBuffer;
        }
        if (nextSignedByteFromBuffer == 98) {
            return 8;
        }
        if (nextSignedByteFromBuffer == 102) {
            return 12;
        }
        if (nextSignedByteFromBuffer == 110) {
            return 10;
        }
        if (nextSignedByteFromBuffer == 114) {
            return 13;
        }
        if (nextSignedByteFromBuffer == 116) {
            return 9;
        }
        if (nextSignedByteFromBuffer != 117) {
            char c2 = (char) nextSignedByteFromBuffer;
            _handleUnrecognizedCharacterEscape(c2);
            return c2;
        }
        byte nextSignedByteFromBuffer2 = getNextSignedByteFromBuffer();
        int iCharToHex2 = CharTypes.charToHex(nextSignedByteFromBuffer2);
        if (iCharToHex2 >= 0 && (iCharToHex = CharTypes.charToHex((nextSignedByteFromBuffer2 = getNextSignedByteFromBuffer()))) >= 0) {
            int i2 = iCharToHex2 << 4;
            byte nextSignedByteFromBuffer3 = getNextSignedByteFromBuffer();
            int iCharToHex3 = CharTypes.charToHex(nextSignedByteFromBuffer3);
            if (iCharToHex3 >= 0) {
                int i3 = (i2 | iCharToHex) << 4;
                nextSignedByteFromBuffer3 = getNextSignedByteFromBuffer();
                int iCharToHex4 = CharTypes.charToHex(nextSignedByteFromBuffer3);
                if (iCharToHex4 >= 0) {
                    return ((i3 | iCharToHex3) << 4) | iCharToHex4;
                }
            }
            nextSignedByteFromBuffer2 = nextSignedByteFromBuffer3;
        }
        _reportUnexpectedChar(nextSignedByteFromBuffer2 & 255, "expected a hex-digit for character escape sequence");
        return -1;
    }

    private int _decodeSplitEscaped(int i2, int i3) {
        if (this._inputPtr >= this._inputEnd) {
            this._quoted32 = i2;
            this._quotedDigits = i3;
            return -1;
        }
        byte nextSignedByteFromBuffer = getNextSignedByteFromBuffer();
        if (i3 == -1) {
            if (nextSignedByteFromBuffer == 34 || nextSignedByteFromBuffer == 47 || nextSignedByteFromBuffer == 92) {
                return nextSignedByteFromBuffer;
            }
            if (nextSignedByteFromBuffer == 98) {
                return 8;
            }
            if (nextSignedByteFromBuffer == 102) {
                return 12;
            }
            if (nextSignedByteFromBuffer == 110) {
                return 10;
            }
            if (nextSignedByteFromBuffer == 114) {
                return 13;
            }
            if (nextSignedByteFromBuffer == 116) {
                return 9;
            }
            if (nextSignedByteFromBuffer != 117) {
                char c2 = (char) nextSignedByteFromBuffer;
                _handleUnrecognizedCharacterEscape(c2);
                return c2;
            }
            if (this._inputPtr >= this._inputEnd) {
                this._quotedDigits = 0;
                this._quoted32 = 0;
                return -1;
            }
            nextSignedByteFromBuffer = getNextSignedByteFromBuffer();
            i3 = 0;
        }
        int nextUnsignedByteFromBuffer = nextSignedByteFromBuffer & 255;
        while (true) {
            int iCharToHex = CharTypes.charToHex(nextUnsignedByteFromBuffer);
            if (iCharToHex < 0) {
                _reportUnexpectedChar(nextUnsignedByteFromBuffer, "expected a hex-digit for character escape sequence");
            }
            i3++;
            i2 = (i2 << 4) | iCharToHex;
            if (i3 == 4) {
                return i2;
            }
            if (this._inputPtr >= this._inputEnd) {
                this._quotedDigits = i3;
                this._quoted32 = i2;
                return -1;
            }
            nextUnsignedByteFromBuffer = getNextUnsignedByteFromBuffer();
        }
    }

    private final boolean _decodeSplitMultiByte(int i2, int i3, boolean z) {
        if (i3 == 1) {
            int i_decodeSplitEscaped = _decodeSplitEscaped(0, -1);
            if (i_decodeSplitEscaped < 0) {
                this._minorState = 41;
                return false;
            }
            this._textBuffer.append((char) i_decodeSplitEscaped);
            return true;
        }
        if (i3 == 2) {
            if (z) {
                this._textBuffer.append((char) _decodeUTF8_2(i2, getNextSignedByteFromBuffer()));
                return true;
            }
            this._minorState = 42;
            this._pending32 = i2;
            return false;
        }
        if (i3 == 3) {
            int i4 = i2 & 15;
            if (z) {
                return _decodeSplitUTF8_3(i4, 1, getNextSignedByteFromBuffer());
            }
            this._minorState = 43;
            this._pending32 = i4;
            this._pendingBytes = 1;
            return false;
        }
        if (i3 != 4) {
            if (i2 < 32) {
                _throwUnquotedSpace(i2, "string value");
            } else {
                _reportInvalidChar(i2);
            }
            this._textBuffer.append((char) i2);
            return true;
        }
        int i5 = i2 & 7;
        if (z) {
            return _decodeSplitUTF8_4(i5, 1, getNextSignedByteFromBuffer());
        }
        this._pending32 = i5;
        this._pendingBytes = 1;
        this._minorState = 44;
        return false;
    }

    private final boolean _decodeSplitUTF8_3(int i2, int i3, int i4) {
        if (i3 == 1) {
            if ((i4 & 192) != 128) {
                _reportInvalidOther(i4 & 255, this._inputPtr);
            }
            i2 = (i2 << 6) | (i4 & 63);
            if (this._inputPtr >= this._inputEnd) {
                this._minorState = 43;
                this._pending32 = i2;
                this._pendingBytes = 2;
                return false;
            }
            i4 = getNextSignedByteFromBuffer();
        }
        if ((i4 & 192) != 128) {
            _reportInvalidOther(i4 & 255, this._inputPtr);
        }
        this._textBuffer.append((char) ((i2 << 6) | (i4 & 63)));
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean _decodeSplitUTF8_4(int r5, int r6, int r7) {
        /*
            r4 = this;
            r0 = 128(0x80, float:1.8E-43)
            r1 = 2
            r2 = 1
            if (r6 != r2) goto L22
            r6 = r7 & 192(0xc0, float:2.69E-43)
            if (r6 == r0) goto L11
            r6 = r7 & 255(0xff, float:3.57E-43)
            int r3 = r4._inputPtr
            r4._reportInvalidOther(r6, r3)
        L11:
            int r5 = r5 << 6
            r6 = r7 & 63
            int r7 = r4._inputPtr
            int r3 = r4._inputEnd
            r5 = r5 | r6
            if (r7 < r3) goto L1d
            goto L3b
        L1d:
            byte r7 = r4.getNextSignedByteFromBuffer()
            r6 = r1
        L22:
            if (r6 != r1) goto L49
            r6 = r7 & 192(0xc0, float:2.69E-43)
            if (r6 == r0) goto L2f
            r6 = r7 & 255(0xff, float:3.57E-43)
            int r1 = r4._inputPtr
            r4._reportInvalidOther(r6, r1)
        L2f:
            int r5 = r5 << 6
            r6 = r7 & 63
            int r7 = r4._inputPtr
            int r1 = r4._inputEnd
            r5 = r5 | r6
            if (r7 < r1) goto L45
            r1 = 3
        L3b:
            r6 = 44
            r4._minorState = r6
            r4._pending32 = r5
            r4._pendingBytes = r1
            r4 = 0
            return r4
        L45:
            byte r7 = r4.getNextSignedByteFromBuffer()
        L49:
            r6 = r7 & 192(0xc0, float:2.69E-43)
            if (r6 == r0) goto L54
            r6 = r7 & 255(0xff, float:3.57E-43)
            int r0 = r4._inputPtr
            r4._reportInvalidOther(r6, r0)
        L54:
            int r5 = r5 << 6
            r6 = r7 & 63
            com.fasterxml.jackson.core.util.TextBuffer r7 = r4._textBuffer
            r5 = r5 | r6
            r6 = -65536(0xffffffffffff0000, float:NaN)
            int r5 = r5 + r6
            int r6 = r5 >> 10
            r0 = 55296(0xd800, float:7.7486E-41)
            r6 = r6 | r0
            char r6 = (char) r6
            r7.append(r6)
            com.fasterxml.jackson.core.util.TextBuffer r4 = r4._textBuffer
            r5 = r5 & 1023(0x3ff, float:1.434E-42)
            r6 = 56320(0xdc00, float:7.8921E-41)
            r5 = r5 | r6
            char r5 = (char) r5
            r4.append(r5)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.async.NonBlockingUtf8JsonParserBase._decodeSplitUTF8_4(int, int, int):boolean");
    }

    private final int _decodeUTF8_2(int i2, int i3) {
        if ((i3 & 192) != 128) {
            _reportInvalidOther(i3 & 255, this._inputPtr);
        }
        return ((i2 & 31) << 6) | (i3 & 63);
    }

    private final int _decodeUTF8_3(int i2, int i3, int i4) {
        if ((i3 & 192) != 128) {
            _reportInvalidOther(i3 & 255, this._inputPtr);
        }
        int i5 = i2 & 15;
        int i6 = i3 & 63;
        if ((i4 & 192) != 128) {
            _reportInvalidOther(i4 & 255, this._inputPtr);
        }
        return (((i5 << 6) | i6) << 6) | (i4 & 63);
    }

    private final int _decodeUTF8_4(int i2, int i3, int i4, int i5) {
        if ((i3 & 192) != 128) {
            _reportInvalidOther(i3 & 255, this._inputPtr);
        }
        int i6 = i2 & 7;
        int i7 = i3 & 63;
        if ((i4 & 192) != 128) {
            _reportInvalidOther(i4 & 255, this._inputPtr);
        }
        int i8 = (i6 << 6) | i7;
        int i9 = i4 & 63;
        if ((i5 & 192) != 128) {
            _reportInvalidOther(i5 & 255, this._inputPtr);
        }
        return ((((i8 << 6) | i9) << 6) | (i5 & 63)) + SupportMenu.CATEGORY_MASK;
    }

    private final String _fastParseName() {
        int[] iArr = _icLatin1;
        int i2 = this._inputPtr;
        int i3 = i2 + 1;
        int byteFromBuffer = getByteFromBuffer(i2) & 255;
        if (iArr[byteFromBuffer] != 0) {
            if (byteFromBuffer != 34) {
                return null;
            }
            this._inputPtr = i3;
            return "";
        }
        int i4 = i2 + 2;
        int byteFromBuffer2 = getByteFromBuffer(i3) & 255;
        if (iArr[byteFromBuffer2] != 0) {
            if (byteFromBuffer2 != 34) {
                return null;
            }
            this._inputPtr = i4;
            return _findName(byteFromBuffer, 1);
        }
        int i5 = byteFromBuffer2 | (byteFromBuffer << 8);
        int i6 = i2 + 3;
        int byteFromBuffer3 = getByteFromBuffer(i4) & 255;
        if (iArr[byteFromBuffer3] != 0) {
            if (byteFromBuffer3 != 34) {
                return null;
            }
            this._inputPtr = i6;
            return _findName(i5, 2);
        }
        int i7 = (i5 << 8) | byteFromBuffer3;
        int i8 = i2 + 4;
        int byteFromBuffer4 = getByteFromBuffer(i6) & 255;
        if (iArr[byteFromBuffer4] != 0) {
            if (byteFromBuffer4 != 34) {
                return null;
            }
            this._inputPtr = i8;
            return _findName(i7, 3);
        }
        int i9 = (i7 << 8) | byteFromBuffer4;
        int i10 = i2 + 5;
        int byteFromBuffer5 = getByteFromBuffer(i8) & 255;
        if (iArr[byteFromBuffer5] == 0) {
            this._quad1 = i9;
            return _parseMediumName(i10, byteFromBuffer5);
        }
        if (byteFromBuffer5 != 34) {
            return null;
        }
        this._inputPtr = i10;
        return _findName(i9, 4);
    }

    private JsonToken _finishAposName(int i2, int i3, int i4) throws StreamConstraintsException {
        int[] iArr_growNameDecodeBuffer = this._quadBuffer;
        int[] iArr = _icLatin1;
        while (this._inputPtr < this._inputEnd) {
            int nextUnsignedByteFromBuffer = getNextUnsignedByteFromBuffer();
            if (nextUnsignedByteFromBuffer == 39) {
                if (i4 > 0) {
                    int length = iArr_growNameDecodeBuffer.length;
                    if (i2 >= length) {
                        iArr_growNameDecodeBuffer = _growNameDecodeBuffer(iArr_growNameDecodeBuffer, length);
                        this._quadBuffer = iArr_growNameDecodeBuffer;
                    }
                    iArr_growNameDecodeBuffer[i2] = _padLastQuad(i3, i4);
                    i2++;
                } else if (i2 == 0) {
                    return _fieldComplete("");
                }
                String strFindName = this._symbols.findName(iArr_growNameDecodeBuffer, i2);
                if (strFindName == null) {
                    strFindName = _addName(iArr_growNameDecodeBuffer, i2, i4);
                }
                return _fieldComplete(strFindName);
            }
            if (nextUnsignedByteFromBuffer != 34 && iArr[nextUnsignedByteFromBuffer] != 0) {
                if (nextUnsignedByteFromBuffer != 92) {
                    _throwUnquotedSpace(nextUnsignedByteFromBuffer, HintConstants.AUTOFILL_HINT_NAME);
                } else {
                    nextUnsignedByteFromBuffer = _decodeCharEscape();
                    if (nextUnsignedByteFromBuffer < 0) {
                        this._minorState = 8;
                        this._minorStateAfterSplit = 9;
                        this._quadLength = i2;
                        this._pending32 = i3;
                        this._pendingBytes = i4;
                        return _updateTokenToNA();
                    }
                }
                if (nextUnsignedByteFromBuffer > 127) {
                    int i5 = 0;
                    if (i4 >= 4) {
                        int length2 = iArr_growNameDecodeBuffer.length;
                        if (i2 >= length2) {
                            iArr_growNameDecodeBuffer = _growNameDecodeBuffer(iArr_growNameDecodeBuffer, length2);
                            this._quadBuffer = iArr_growNameDecodeBuffer;
                        }
                        iArr_growNameDecodeBuffer[i2] = i3;
                        i2++;
                        i3 = 0;
                        i4 = 0;
                    }
                    i4++;
                    int i6 = i3 << 8;
                    if (nextUnsignedByteFromBuffer < 2048) {
                        i3 = i6 | (nextUnsignedByteFromBuffer >> 6) | 192;
                    } else {
                        int i7 = i6 | (nextUnsignedByteFromBuffer >> 12) | 224;
                        if (i4 >= 4) {
                            int length3 = iArr_growNameDecodeBuffer.length;
                            if (i2 >= length3) {
                                iArr_growNameDecodeBuffer = _growNameDecodeBuffer(iArr_growNameDecodeBuffer, length3);
                                this._quadBuffer = iArr_growNameDecodeBuffer;
                            }
                            iArr_growNameDecodeBuffer[i2] = i7;
                            i2++;
                            i4 = 0;
                        } else {
                            i5 = i7;
                        }
                        i3 = (i5 << 8) | ((nextUnsignedByteFromBuffer >> 6) & 63) | 128;
                        i4++;
                    }
                    nextUnsignedByteFromBuffer = (nextUnsignedByteFromBuffer & 63) | 128;
                }
            }
            if (i4 < 4) {
                i4++;
                i3 = (i3 << 8) | nextUnsignedByteFromBuffer;
            } else {
                int length4 = iArr_growNameDecodeBuffer.length;
                if (i2 >= length4) {
                    int[] iArr_growNameDecodeBuffer2 = _growNameDecodeBuffer(iArr_growNameDecodeBuffer, length4);
                    this._quadBuffer = iArr_growNameDecodeBuffer2;
                    iArr_growNameDecodeBuffer = iArr_growNameDecodeBuffer2;
                }
                iArr_growNameDecodeBuffer[i2] = i3;
                i2++;
                i3 = nextUnsignedByteFromBuffer;
                i4 = 1;
            }
        }
        this._quadLength = i2;
        this._pending32 = i3;
        this._pendingBytes = i4;
        this._minorState = 9;
        return _updateTokenToNA();
    }

    private final JsonToken _finishAposString() {
        TextBuffer textBuffer = this._textBuffer;
        int[] iArr = _icUTF8;
        char[] bufferWithoutReset = textBuffer.getBufferWithoutReset();
        int currentSegmentSize = textBuffer.getCurrentSegmentSize();
        int i2 = this._inputPtr;
        int i3 = this._inputEnd - 5;
        while (i2 < this._inputEnd) {
            int i4 = 0;
            if (currentSegmentSize >= bufferWithoutReset.length) {
                bufferWithoutReset = this._textBuffer.finishCurrentSegment();
                currentSegmentSize = 0;
            }
            int iMin = Math.min(this._inputEnd, InternalJacksonUtil.addOverflowSafe(i2, bufferWithoutReset.length - currentSegmentSize));
            while (true) {
                if (i2 < iMin) {
                    int i5 = i2 + 1;
                    int byteFromBuffer = getByteFromBuffer(i2) & 255;
                    int i6 = iArr[byteFromBuffer];
                    if (i6 == 0 || byteFromBuffer == 34) {
                        if (byteFromBuffer == 39) {
                            this._inputPtr = i5;
                            this._textBuffer.setCurrentLength(currentSegmentSize);
                            JsonToken jsonToken = JsonToken.VALUE_STRING;
                            _valueComplete(jsonToken);
                            return jsonToken;
                        }
                        bufferWithoutReset[currentSegmentSize] = (char) byteFromBuffer;
                        currentSegmentSize++;
                        i2 = i5;
                    } else if (i5 >= i3) {
                        this._inputPtr = i5;
                        this._textBuffer.setCurrentLength(currentSegmentSize);
                        if (!_decodeSplitMultiByte(byteFromBuffer, iArr[byteFromBuffer], i5 < this._inputEnd)) {
                            this._minorStateAfterSplit = 45;
                            return _updateTokenToNA();
                        }
                        TextBuffer textBuffer2 = this._textBuffer;
                        bufferWithoutReset = textBuffer2.getBufferWithoutReset();
                        currentSegmentSize = textBuffer2.getCurrentSegmentSize();
                        i2 = this._inputPtr;
                    } else {
                        if (i6 == 1) {
                            this._inputPtr = i5;
                            byteFromBuffer = _decodeFastCharEscape();
                            i2 = this._inputPtr;
                        } else if (i6 == 2) {
                            i2 += 2;
                            byteFromBuffer = _decodeUTF8_2(byteFromBuffer, getByteFromBuffer(i5));
                        } else if (i6 == 3) {
                            int i7 = i2 + 2;
                            i2 += 3;
                            byteFromBuffer = _decodeUTF8_3(byteFromBuffer, getByteFromBuffer(i5), getByteFromBuffer(i7));
                        } else if (i6 != 4) {
                            if (byteFromBuffer < 32) {
                                _throwUnquotedSpace(byteFromBuffer, "string value");
                            } else {
                                _reportInvalidChar(byteFromBuffer);
                            }
                            i2 = i5;
                        } else {
                            int i8 = currentSegmentSize + 1;
                            int i9 = i2 + 3;
                            byte byteFromBuffer2 = getByteFromBuffer(i5);
                            byte byteFromBuffer3 = getByteFromBuffer(i2 + 2);
                            i2 += 4;
                            int i_decodeUTF8_4 = _decodeUTF8_4(byteFromBuffer, byteFromBuffer2, byteFromBuffer3, getByteFromBuffer(i9));
                            bufferWithoutReset[currentSegmentSize] = (char) ((i_decodeUTF8_4 >> 10) | 55296);
                            if (i8 >= bufferWithoutReset.length) {
                                bufferWithoutReset = this._textBuffer.finishCurrentSegment();
                                currentSegmentSize = 0;
                            } else {
                                currentSegmentSize = i8;
                            }
                            byteFromBuffer = (i_decodeUTF8_4 & 1023) | 56320;
                        }
                        if (currentSegmentSize >= bufferWithoutReset.length) {
                            bufferWithoutReset = this._textBuffer.finishCurrentSegment();
                        } else {
                            i4 = currentSegmentSize;
                        }
                        currentSegmentSize = i4 + 1;
                        bufferWithoutReset[i4] = (char) byteFromBuffer;
                    }
                }
            }
        }
        this._inputPtr = i2;
        this._minorState = 45;
        this._textBuffer.setCurrentLength(currentSegmentSize);
        return _updateTokenToNA();
    }

    private final JsonToken _finishBOM(int i2) throws JsonParseException {
        while (this._inputPtr < this._inputEnd) {
            int nextUnsignedByteFromBuffer = getNextUnsignedByteFromBuffer();
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        this._currInputProcessed -= 3;
                        return _startDocument(nextUnsignedByteFromBuffer);
                    }
                } else if (nextUnsignedByteFromBuffer != 191) {
                    _reportError("Unexpected byte 0x%02x following 0xEF 0xBB; should get 0xBF as third byte of UTF-8 BOM", Integer.valueOf(nextUnsignedByteFromBuffer));
                }
            } else if (nextUnsignedByteFromBuffer != 187) {
                _reportError("Unexpected byte 0x%02x following 0xEF; should get 0xBB as second byte UTF-8 BOM", Integer.valueOf(nextUnsignedByteFromBuffer));
            }
            i2++;
        }
        this._pending32 = i2;
        this._minorState = 1;
        return _updateTokenToNA();
    }

    private final JsonToken _finishCComment(int i2, boolean z) {
        while (this._inputPtr < this._inputEnd) {
            int nextUnsignedByteFromBuffer = getNextUnsignedByteFromBuffer();
            if (nextUnsignedByteFromBuffer < 32) {
                if (nextUnsignedByteFromBuffer == 10) {
                    this._currInputRow++;
                } else if (nextUnsignedByteFromBuffer == 13) {
                    this._currInputRowAlt++;
                } else if (nextUnsignedByteFromBuffer != 9) {
                    _throwInvalidSpace(nextUnsignedByteFromBuffer);
                }
                this._currInputRowStart = this._inputPtr;
            } else if (nextUnsignedByteFromBuffer == 42) {
                z = true;
            } else if (nextUnsignedByteFromBuffer == 47 && z) {
                return _startAfterComment(i2);
            }
            z = false;
        }
        this._minorState = true != z ? 53 : 52;
        this._pending32 = i2;
        return _updateTokenToNA();
    }

    private final JsonToken _finishCppComment(int i2) {
        while (this._inputPtr < this._inputEnd) {
            int nextUnsignedByteFromBuffer = getNextUnsignedByteFromBuffer();
            if (nextUnsignedByteFromBuffer < 32) {
                if (nextUnsignedByteFromBuffer == 10) {
                    this._currInputRow++;
                    this._currInputRowStart = this._inputPtr;
                } else if (nextUnsignedByteFromBuffer == 13) {
                    this._currInputRowAlt++;
                    this._currInputRowStart = this._inputPtr;
                } else if (nextUnsignedByteFromBuffer != 9) {
                    _throwInvalidSpace(nextUnsignedByteFromBuffer);
                }
                return _startAfterComment(i2);
            }
        }
        this._minorState = 54;
        this._pending32 = i2;
        return _updateTokenToNA();
    }

    private final JsonToken _finishHashComment(int i2) {
        if ((this._features & FEAT_MASK_ALLOW_YAML_COMMENTS) == 0) {
            _reportUnexpectedChar(35, "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_YAML_COMMENTS' not enabled for parser)");
        }
        while (this._inputPtr < this._inputEnd) {
            int nextUnsignedByteFromBuffer = getNextUnsignedByteFromBuffer();
            if (nextUnsignedByteFromBuffer < 32) {
                if (nextUnsignedByteFromBuffer == 10) {
                    this._currInputRow++;
                    this._currInputRowStart = this._inputPtr;
                } else if (nextUnsignedByteFromBuffer == 13) {
                    this._currInputRowAlt++;
                    this._currInputRowStart = this._inputPtr;
                } else if (nextUnsignedByteFromBuffer != 9) {
                    _throwInvalidSpace(nextUnsignedByteFromBuffer);
                }
                return _startAfterComment(i2);
            }
        }
        this._minorState = 55;
        this._pending32 = i2;
        return _updateTokenToNA();
    }

    private final JsonToken _finishRegularString() {
        TextBuffer textBuffer = this._textBuffer;
        int[] iArr = _icUTF8;
        char[] bufferWithoutReset = textBuffer.getBufferWithoutReset();
        int currentSegmentSize = textBuffer.getCurrentSegmentSize();
        int i2 = this._inputPtr;
        int i3 = this._inputEnd - 5;
        while (i2 < this._inputEnd) {
            int i4 = 0;
            if (currentSegmentSize >= bufferWithoutReset.length) {
                bufferWithoutReset = this._textBuffer.finishCurrentSegment();
                currentSegmentSize = 0;
            }
            int iMin = Math.min(this._inputEnd, InternalJacksonUtil.addOverflowSafe(i2, bufferWithoutReset.length - currentSegmentSize));
            while (true) {
                if (i2 < iMin) {
                    int i5 = i2 + 1;
                    int byteFromBuffer = getByteFromBuffer(i2) & 255;
                    int i6 = iArr[byteFromBuffer];
                    if (i6 == 0) {
                        bufferWithoutReset[currentSegmentSize] = (char) byteFromBuffer;
                        currentSegmentSize++;
                        i2 = i5;
                    } else {
                        if (byteFromBuffer == 34) {
                            this._inputPtr = i5;
                            this._textBuffer.setCurrentLength(currentSegmentSize);
                            JsonToken jsonToken = JsonToken.VALUE_STRING;
                            _valueComplete(jsonToken);
                            return jsonToken;
                        }
                        if (i5 >= i3) {
                            this._inputPtr = i5;
                            this._textBuffer.setCurrentLength(currentSegmentSize);
                            if (!_decodeSplitMultiByte(byteFromBuffer, iArr[byteFromBuffer], i5 < this._inputEnd)) {
                                this._minorStateAfterSplit = 40;
                                return _updateTokenToNA();
                            }
                            TextBuffer textBuffer2 = this._textBuffer;
                            bufferWithoutReset = textBuffer2.getBufferWithoutReset();
                            currentSegmentSize = textBuffer2.getCurrentSegmentSize();
                            i2 = this._inputPtr;
                        } else {
                            if (i6 == 1) {
                                this._inputPtr = i5;
                                byteFromBuffer = _decodeFastCharEscape();
                                i2 = this._inputPtr;
                            } else if (i6 == 2) {
                                i2 += 2;
                                byteFromBuffer = _decodeUTF8_2(byteFromBuffer, getByteFromBuffer(i5));
                            } else if (i6 == 3) {
                                int i7 = i2 + 2;
                                i2 += 3;
                                byteFromBuffer = _decodeUTF8_3(byteFromBuffer, getByteFromBuffer(i5), getByteFromBuffer(i7));
                            } else if (i6 != 4) {
                                if (byteFromBuffer < 32) {
                                    _throwUnquotedSpace(byteFromBuffer, "string value");
                                } else {
                                    _reportInvalidChar(byteFromBuffer);
                                }
                                i2 = i5;
                            } else {
                                int i8 = currentSegmentSize + 1;
                                int i9 = i2 + 3;
                                byte byteFromBuffer2 = getByteFromBuffer(i5);
                                byte byteFromBuffer3 = getByteFromBuffer(i2 + 2);
                                i2 += 4;
                                int i_decodeUTF8_4 = _decodeUTF8_4(byteFromBuffer, byteFromBuffer2, byteFromBuffer3, getByteFromBuffer(i9));
                                bufferWithoutReset[currentSegmentSize] = (char) ((i_decodeUTF8_4 >> 10) | 55296);
                                if (i8 >= bufferWithoutReset.length) {
                                    bufferWithoutReset = this._textBuffer.finishCurrentSegment();
                                    currentSegmentSize = 0;
                                } else {
                                    currentSegmentSize = i8;
                                }
                                byteFromBuffer = (i_decodeUTF8_4 & 1023) | 56320;
                            }
                            if (currentSegmentSize >= bufferWithoutReset.length) {
                                bufferWithoutReset = this._textBuffer.finishCurrentSegment();
                            } else {
                                i4 = currentSegmentSize;
                            }
                            currentSegmentSize = i4 + 1;
                            bufferWithoutReset[i4] = (char) byteFromBuffer;
                        }
                    }
                }
            }
        }
        this._inputPtr = i2;
        this._minorState = 40;
        this._textBuffer.setCurrentLength(currentSegmentSize);
        return _updateTokenToNA();
    }

    private JsonToken _finishUnquotedName(int i2, int i3, int i4) throws StreamConstraintsException {
        int[] iArr_growNameDecodeBuffer = this._quadBuffer;
        int[] inputCodeUtf8JsNames = CharTypes.getInputCodeUtf8JsNames();
        while (true) {
            int i5 = this._inputPtr;
            if (i5 >= this._inputEnd) {
                this._quadLength = i2;
                this._pending32 = i3;
                this._pendingBytes = i4;
                this._minorState = 10;
                return _updateTokenToNA();
            }
            int byteFromBuffer = getByteFromBuffer(i5) & 255;
            if (inputCodeUtf8JsNames[byteFromBuffer] != 0) {
                if (i4 > 0) {
                    int length = iArr_growNameDecodeBuffer.length;
                    if (i2 >= length) {
                        iArr_growNameDecodeBuffer = _growNameDecodeBuffer(iArr_growNameDecodeBuffer, length);
                        this._quadBuffer = iArr_growNameDecodeBuffer;
                    }
                    iArr_growNameDecodeBuffer[i2] = i3;
                    i2++;
                }
                String strFindName = this._symbols.findName(iArr_growNameDecodeBuffer, i2);
                if (strFindName == null) {
                    strFindName = _addName(iArr_growNameDecodeBuffer, i2, i4);
                }
                return _fieldComplete(strFindName);
            }
            this._inputPtr++;
            if (i4 < 4) {
                i3 = (i3 << 8) | byteFromBuffer;
                i4++;
            } else {
                int length2 = iArr_growNameDecodeBuffer.length;
                if (i2 >= length2) {
                    int[] iArr_growNameDecodeBuffer2 = _growNameDecodeBuffer(iArr_growNameDecodeBuffer, length2);
                    this._quadBuffer = iArr_growNameDecodeBuffer2;
                    iArr_growNameDecodeBuffer = iArr_growNameDecodeBuffer2;
                }
                iArr_growNameDecodeBuffer[i2] = i3;
                i2++;
                i3 = byteFromBuffer;
                i4 = 1;
            }
        }
    }

    private JsonToken _handleOddName(int i2) {
        if (i2 != 35) {
            if (i2 != 39) {
                if (i2 == 47) {
                    return _startSlashComment(4);
                }
                if (i2 == 93) {
                    return _closeArrayScope();
                }
            } else if ((this._features & FEAT_MASK_ALLOW_SINGLE_QUOTES) != 0) {
                return _finishAposName(0, 0, 0);
            }
        } else if ((this._features & FEAT_MASK_ALLOW_YAML_COMMENTS) != 0) {
            return _finishHashComment(4);
        }
        if ((this._features & FEAT_MASK_ALLOW_UNQUOTED_NAMES) == 0) {
            _reportUnexpectedChar(i2, "was expecting double-quote to start field name");
        }
        if (CharTypes.getInputCodeUtf8JsNames()[i2] != 0) {
            _reportUnexpectedChar(i2, "was expecting either valid name character (for unquoted name) or double-quote (for quoted) to start field name");
        }
        return _finishUnquotedName(0, i2, 1);
    }

    private final JsonToken _parseEscapedName(int i2, int i3, int i4) throws StreamConstraintsException {
        int[] iArr_growNameDecodeBuffer = this._quadBuffer;
        int[] iArr = _icLatin1;
        while (this._inputPtr < this._inputEnd) {
            int nextUnsignedByteFromBuffer = getNextUnsignedByteFromBuffer();
            if (iArr[nextUnsignedByteFromBuffer] == 0) {
                if (i4 < 4) {
                    i3 = (i3 << 8) | nextUnsignedByteFromBuffer;
                    i4++;
                } else {
                    int length = iArr_growNameDecodeBuffer.length;
                    if (i2 >= length) {
                        int[] iArr_growNameDecodeBuffer2 = _growNameDecodeBuffer(iArr_growNameDecodeBuffer, length);
                        this._quadBuffer = iArr_growNameDecodeBuffer2;
                        iArr_growNameDecodeBuffer = iArr_growNameDecodeBuffer2;
                    }
                    iArr_growNameDecodeBuffer[i2] = i3;
                    i2++;
                    i3 = nextUnsignedByteFromBuffer;
                    i4 = 1;
                }
            } else {
                if (nextUnsignedByteFromBuffer == 34) {
                    if (i4 > 0) {
                        int length2 = iArr_growNameDecodeBuffer.length;
                        if (i2 >= length2) {
                            iArr_growNameDecodeBuffer = _growNameDecodeBuffer(iArr_growNameDecodeBuffer, length2);
                            this._quadBuffer = iArr_growNameDecodeBuffer;
                        }
                        iArr_growNameDecodeBuffer[i2] = _padLastQuad(i3, i4);
                        i2++;
                    } else if (i2 == 0) {
                        return _fieldComplete("");
                    }
                    String strFindName = this._symbols.findName(iArr_growNameDecodeBuffer, i2);
                    if (strFindName == null) {
                        strFindName = _addName(iArr_growNameDecodeBuffer, i2, i4);
                    }
                    return _fieldComplete(strFindName);
                }
                if (nextUnsignedByteFromBuffer != 92) {
                    _throwUnquotedSpace(nextUnsignedByteFromBuffer, HintConstants.AUTOFILL_HINT_NAME);
                } else {
                    nextUnsignedByteFromBuffer = _decodeCharEscape();
                    if (nextUnsignedByteFromBuffer < 0) {
                        this._minorState = 8;
                        this._minorStateAfterSplit = 7;
                        this._quadLength = i2;
                        this._pending32 = i3;
                        this._pendingBytes = i4;
                        return _updateTokenToNA();
                    }
                }
                int length3 = iArr_growNameDecodeBuffer.length;
                if (i2 >= length3) {
                    iArr_growNameDecodeBuffer = _growNameDecodeBuffer(iArr_growNameDecodeBuffer, length3);
                    this._quadBuffer = iArr_growNameDecodeBuffer;
                }
                if (nextUnsignedByteFromBuffer > 127) {
                    int i5 = 0;
                    if (i4 >= 4) {
                        iArr_growNameDecodeBuffer[i2] = i3;
                        i2++;
                        i3 = 0;
                        i4 = 0;
                    }
                    i4++;
                    int i6 = i3 << 8;
                    if (nextUnsignedByteFromBuffer < 2048) {
                        i3 = i6 | (nextUnsignedByteFromBuffer >> 6) | 192;
                    } else {
                        int i7 = i6 | (nextUnsignedByteFromBuffer >> 12) | 224;
                        if (i4 >= 4) {
                            iArr_growNameDecodeBuffer[i2] = i7;
                            i2++;
                            i4 = 0;
                        } else {
                            i5 = i7;
                        }
                        i3 = (i5 << 8) | ((nextUnsignedByteFromBuffer >> 6) & 63) | 128;
                        i4++;
                    }
                    nextUnsignedByteFromBuffer = (nextUnsignedByteFromBuffer & 63) | 128;
                }
                int i8 = i4;
                int i9 = i3;
                i3 = nextUnsignedByteFromBuffer;
                if (i8 < 4) {
                    i3 |= i9 << 8;
                    i4 = i8 + 1;
                } else {
                    iArr_growNameDecodeBuffer[i2] = i9;
                    i2++;
                    i4 = 1;
                }
            }
        }
        this._quadLength = i2;
        this._pending32 = i3;
        this._pendingBytes = i4;
        this._minorState = 7;
        return _updateTokenToNA();
    }

    private final String _parseMediumName(int i2, int i3) {
        int[] iArr = _icLatin1;
        int byteFromBuffer = getByteFromBuffer(i2) & 255;
        int i4 = i2 + 1;
        if (iArr[byteFromBuffer] != 0) {
            if (byteFromBuffer != 34) {
                return null;
            }
            this._inputPtr = i4;
            return _findName(this._quad1, i3, 1);
        }
        int i5 = (i3 << 8) | byteFromBuffer;
        int i6 = i2 + 2;
        int byteFromBuffer2 = getByteFromBuffer(i4) & 255;
        if (iArr[byteFromBuffer2] != 0) {
            if (byteFromBuffer2 != 34) {
                return null;
            }
            this._inputPtr = i6;
            return _findName(this._quad1, i5, 2);
        }
        int i7 = (i5 << 8) | byteFromBuffer2;
        int i8 = i2 + 3;
        int byteFromBuffer3 = getByteFromBuffer(i6) & 255;
        if (iArr[byteFromBuffer3] != 0) {
            if (byteFromBuffer3 != 34) {
                return null;
            }
            this._inputPtr = i8;
            return _findName(this._quad1, i7, 3);
        }
        int i9 = (i7 << 8) | byteFromBuffer3;
        int i10 = i2 + 4;
        int byteFromBuffer4 = getByteFromBuffer(i8) & 255;
        if (iArr[byteFromBuffer4] == 0) {
            return _parseMediumName2(i10, byteFromBuffer4, i9);
        }
        if (byteFromBuffer4 != 34) {
            return null;
        }
        this._inputPtr = i10;
        return _findName(this._quad1, i9, 4);
    }

    private final String _parseMediumName2(int i2, int i3, int i4) {
        int[] iArr = _icLatin1;
        int byteFromBuffer = getByteFromBuffer(i2) & 255;
        int i5 = i2 + 1;
        if (iArr[byteFromBuffer] != 0) {
            if (byteFromBuffer != 34) {
                return null;
            }
            this._inputPtr = i5;
            return _findName(this._quad1, i4, i3, 1);
        }
        int i6 = (i3 << 8) | byteFromBuffer;
        int i7 = i2 + 2;
        int byteFromBuffer2 = getByteFromBuffer(i5) & 255;
        if (iArr[byteFromBuffer2] != 0) {
            if (byteFromBuffer2 != 34) {
                return null;
            }
            this._inputPtr = i7;
            return _findName(this._quad1, i4, i6, 2);
        }
        int i8 = (i6 << 8) | byteFromBuffer2;
        int i9 = i2 + 3;
        int byteFromBuffer3 = getByteFromBuffer(i7) & 255;
        if (iArr[byteFromBuffer3] != 0) {
            if (byteFromBuffer3 != 34) {
                return null;
            }
            this._inputPtr = i9;
            return _findName(this._quad1, i4, i8, 3);
        }
        int i10 = (i8 << 8) | byteFromBuffer3;
        int i11 = i2 + 4;
        if ((getByteFromBuffer(i9) & 255) != 34) {
            return null;
        }
        this._inputPtr = i11;
        return _findName(this._quad1, i4, i10, 4);
    }

    private final int _skipWS(int i2) {
        do {
            if (i2 != 32) {
                if (i2 == 10) {
                    this._currInputRow++;
                    this._currInputRowStart = this._inputPtr;
                } else if (i2 == 13) {
                    this._currInputRowAlt++;
                    this._currInputRowStart = this._inputPtr;
                } else if (i2 != 9 && !_isAllowedCtrlCharRS(i2)) {
                    _throwInvalidSpace(i2);
                }
            }
            if (this._inputPtr >= this._inputEnd) {
                _updateTokenToNA();
                return 0;
            }
            i2 = getNextUnsignedByteFromBuffer();
        } while (i2 <= 32);
        return i2;
    }

    private final JsonToken _startAfterComment(int i2) {
        if (this._inputPtr >= this._inputEnd) {
            this._minorState = i2;
            return _updateTokenToNA();
        }
        int nextUnsignedByteFromBuffer = getNextUnsignedByteFromBuffer();
        if (i2 == 4) {
            return _startFieldName(nextUnsignedByteFromBuffer);
        }
        if (i2 == 5) {
            return _startFieldNameAfterComma(nextUnsignedByteFromBuffer);
        }
        switch (i2) {
            case 12:
                return _startValue(nextUnsignedByteFromBuffer);
            case 13:
                return _startValueExpectComma(nextUnsignedByteFromBuffer);
            case 14:
                return _startValueExpectColon(nextUnsignedByteFromBuffer);
            case 15:
                return _startValueAfterComma(nextUnsignedByteFromBuffer);
            default:
                VersionUtil.throwInternal();
                return null;
        }
    }

    private final JsonToken _startDocument(int i2) {
        if (i2 == 239 && this._minorState != 1) {
            return _finishBOM(1);
        }
        while (i2 <= 32) {
            if (i2 != 32) {
                if (i2 == 10) {
                    this._currInputRow++;
                    this._currInputRowStart = this._inputPtr;
                } else if (i2 == 13) {
                    this._currInputRowAlt++;
                    this._currInputRowStart = this._inputPtr;
                } else if (i2 != 9) {
                    _throwInvalidSpace(i2);
                }
            }
            if (this._inputPtr >= this._inputEnd) {
                this._minorState = 3;
                if (this._closed) {
                    return null;
                }
                if (!this._endOfInput) {
                    return JsonToken.NOT_AVAILABLE;
                }
                _eofAsNextToken();
                return null;
            }
            i2 = getNextUnsignedByteFromBuffer();
        }
        return _startValue(i2);
    }

    private final JsonToken _startFieldName(int i2) {
        String str_fastParseName;
        if (i2 > 32 || (i2 = _skipWS(i2)) > 0) {
            _updateTokenLocation();
            return i2 != 34 ? i2 == 125 ? _closeObjectScope() : _handleOddName(i2) : (this._inputPtr + 13 > this._inputEnd || (str_fastParseName = _fastParseName()) == null) ? _parseEscapedName(0, 0, 0) : _fieldComplete(str_fastParseName);
        }
        this._minorState = 4;
        return this._currToken;
    }

    private final JsonToken _startFieldNameAfterComma(int i2) {
        String str_fastParseName;
        int i3 = 5;
        if (i2 > 32 || (i2 = _skipWS(i2)) > 0) {
            int i4 = 125;
            if (i2 != 44) {
                if (i2 == 125) {
                    return _closeObjectScope();
                }
                if (i2 == 35) {
                    return _finishHashComment(5);
                }
                if (i2 == 47) {
                    return _startSlashComment(5);
                }
                _reportUnexpectedChar(i2, "was expecting comma to separate " + this._parsingContext.typeDesc() + " entries");
            }
            int i5 = this._inputPtr;
            if (i5 >= this._inputEnd) {
                this._minorState = 4;
                return _updateTokenToNA();
            }
            int byteFromBuffer = getByteFromBuffer(i5);
            this._inputPtr = i5 + 1;
            if (byteFromBuffer > 32 || (byteFromBuffer = _skipWS(byteFromBuffer)) > 0) {
                _updateTokenLocation();
                if (byteFromBuffer == 34) {
                    return (this._inputPtr + 13 > this._inputEnd || (str_fastParseName = _fastParseName()) == null) ? _parseEscapedName(0, 0, 0) : _fieldComplete(str_fastParseName);
                }
                if (byteFromBuffer != 125) {
                    i4 = byteFromBuffer;
                } else if ((this._features & FEAT_MASK_TRAILING_COMMA) != 0) {
                    return _closeObjectScope();
                }
                return _handleOddName(i4);
            }
            i3 = 4;
        }
        this._minorState = i3;
        return this._currToken;
    }

    private final JsonToken _startSlashComment(int i2) {
        if ((this._features & FEAT_MASK_ALLOW_JAVA_COMMENTS) == 0) {
            _reportUnexpectedChar(47, "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_COMMENTS' not enabled for parser)");
        }
        if (this._inputPtr >= this._inputEnd) {
            this._pending32 = i2;
            this._minorState = 51;
            return _updateTokenToNA();
        }
        byte nextSignedByteFromBuffer = getNextSignedByteFromBuffer();
        if (nextSignedByteFromBuffer == 42) {
            return _finishCComment(i2, false);
        }
        if (nextSignedByteFromBuffer == 47) {
            return _finishCppComment(i2);
        }
        _reportUnexpectedChar(nextSignedByteFromBuffer & 255, "was expecting either '*' or '/' for a comment");
        return null;
    }

    private final JsonToken _startValue(int i2) {
        if (i2 <= 32 && (i2 = _skipWS(i2)) <= 0) {
            this._minorState = 12;
            return this._currToken;
        }
        _updateTokenLocation();
        this._parsingContext.expectComma();
        if (i2 == 34) {
            return _startString();
        }
        if (i2 == 35) {
            return _finishHashComment(12);
        }
        if (i2 == 43) {
            return _startPositiveNumber();
        }
        if (i2 == 91) {
            return _startArrayScope();
        }
        if (i2 == 93) {
            return _closeArrayScope();
        }
        if (i2 == 102) {
            return _startFalseToken();
        }
        if (i2 == 110) {
            return _startNullToken();
        }
        if (i2 == 116) {
            return _startTrueToken();
        }
        if (i2 == 123) {
            return _startObjectScope();
        }
        if (i2 == 125) {
            return _closeObjectScope();
        }
        switch (i2) {
            case 45:
                return _startNegativeNumber();
            case 46:
                if (isEnabled(JsonReadFeature.ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS.mappedFeature())) {
                    return _startFloatThatStartsWithPeriod();
                }
                break;
            case 47:
                return _startSlashComment(12);
            case 48:
                return _startNumberLeadingZero();
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
                return _startPositiveNumber(i2);
        }
        return _startUnexpectedValue(false, i2);
    }

    private final JsonToken _startValueAfterComma(int i2) {
        if (i2 <= 32 && (i2 = _skipWS(i2)) <= 0) {
            this._minorState = 15;
            return this._currToken;
        }
        _updateTokenLocation();
        if (i2 == 34) {
            return _startString();
        }
        if (i2 == 35) {
            return _finishHashComment(15);
        }
        if (i2 == 43) {
            return _startPositiveNumber();
        }
        if (i2 == 45) {
            return _startNegativeNumber();
        }
        if (i2 == 91) {
            return _startArrayScope();
        }
        if (i2 != 93) {
            if (i2 == 102) {
                return _startFalseToken();
            }
            if (i2 == 110) {
                return _startNullToken();
            }
            if (i2 == 116) {
                return _startTrueToken();
            }
            if (i2 == 123) {
                return _startObjectScope();
            }
            if (i2 != 125) {
                switch (i2) {
                    case 47:
                        return _startSlashComment(15);
                    case 48:
                        return _startNumberLeadingZero();
                    case 49:
                    case 50:
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                        return _startPositiveNumber(i2);
                }
            }
            if ((this._features & FEAT_MASK_TRAILING_COMMA) != 0) {
                return _closeObjectScope();
            }
        } else if ((this._features & FEAT_MASK_TRAILING_COMMA) != 0) {
            return _closeArrayScope();
        }
        return _startUnexpectedValue(true, i2);
    }

    private final JsonToken _startValueExpectColon(int i2) {
        int i3 = 14;
        if (i2 > 32 || (i2 = _skipWS(i2)) > 0) {
            if (i2 != 58) {
                if (i2 == 47) {
                    return _startSlashComment(14);
                }
                if (i2 == 35) {
                    return _finishHashComment(14);
                }
                _reportUnexpectedChar(i2, "was expecting a colon to separate field name and value");
            }
            int i4 = this._inputPtr;
            if (i4 >= this._inputEnd) {
                this._minorState = 12;
                return _updateTokenToNA();
            }
            int byteFromBuffer = getByteFromBuffer(i4);
            this._inputPtr = i4 + 1;
            if (byteFromBuffer > 32 || (byteFromBuffer = _skipWS(byteFromBuffer)) > 0) {
                _updateTokenLocation();
                if (byteFromBuffer == 34) {
                    return _startString();
                }
                if (byteFromBuffer == 35) {
                    return _finishHashComment(12);
                }
                if (byteFromBuffer == 43) {
                    return _startPositiveNumber();
                }
                if (byteFromBuffer == 45) {
                    return _startNegativeNumber();
                }
                if (byteFromBuffer == 91) {
                    return _startArrayScope();
                }
                if (byteFromBuffer == 102) {
                    return _startFalseToken();
                }
                if (byteFromBuffer == 110) {
                    return _startNullToken();
                }
                if (byteFromBuffer == 116) {
                    return _startTrueToken();
                }
                if (byteFromBuffer == 123) {
                    return _startObjectScope();
                }
                switch (byteFromBuffer) {
                    case 47:
                        return _startSlashComment(12);
                    case 48:
                        return _startNumberLeadingZero();
                    case 49:
                    case 50:
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                        return _startPositiveNumber(byteFromBuffer);
                    default:
                        return _startUnexpectedValue(false, byteFromBuffer);
                }
            }
            i3 = 12;
        }
        this._minorState = i3;
        return this._currToken;
    }

    private final JsonToken _startValueExpectComma(int i2) {
        int i3 = 13;
        if (i2 > 32 || (i2 = _skipWS(i2)) > 0) {
            if (i2 != 44) {
                if (i2 == 93) {
                    return _closeArrayScope();
                }
                if (i2 == 125) {
                    return _closeObjectScope();
                }
                if (i2 == 47) {
                    return _startSlashComment(13);
                }
                if (i2 == 35) {
                    return _finishHashComment(13);
                }
                _reportUnexpectedChar(i2, "was expecting comma to separate " + this._parsingContext.typeDesc() + " entries");
            }
            this._parsingContext.expectComma();
            int i4 = this._inputPtr;
            if (i4 >= this._inputEnd) {
                this._minorState = 15;
                return _updateTokenToNA();
            }
            int byteFromBuffer = getByteFromBuffer(i4);
            this._inputPtr = i4 + 1;
            if (byteFromBuffer > 32 || (byteFromBuffer = _skipWS(byteFromBuffer)) > 0) {
                _updateTokenLocation();
                if (byteFromBuffer == 34) {
                    return _startString();
                }
                if (byteFromBuffer == 35) {
                    return _finishHashComment(15);
                }
                if (byteFromBuffer == 43) {
                    return _startPositiveNumber();
                }
                if (byteFromBuffer == 45) {
                    return _startNegativeNumber();
                }
                if (byteFromBuffer == 91) {
                    return _startArrayScope();
                }
                if (byteFromBuffer != 93) {
                    if (byteFromBuffer == 102) {
                        return _startFalseToken();
                    }
                    if (byteFromBuffer == 110) {
                        return _startNullToken();
                    }
                    if (byteFromBuffer == 116) {
                        return _startTrueToken();
                    }
                    if (byteFromBuffer == 123) {
                        return _startObjectScope();
                    }
                    if (byteFromBuffer != 125) {
                        switch (byteFromBuffer) {
                            case 47:
                                return _startSlashComment(15);
                            case 48:
                                return _startNumberLeadingZero();
                            case 49:
                            case 50:
                            case 51:
                            case 52:
                            case 53:
                            case 54:
                            case 55:
                            case 56:
                            case 57:
                                return _startPositiveNumber(byteFromBuffer);
                        }
                    }
                    if ((this._features & FEAT_MASK_TRAILING_COMMA) != 0) {
                        return _closeObjectScope();
                    }
                } else if ((this._features & FEAT_MASK_TRAILING_COMMA) != 0) {
                    return _closeArrayScope();
                }
                return _startUnexpectedValue(true, byteFromBuffer);
            }
            i3 = 15;
        }
        this._minorState = i3;
        return this._currToken;
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase
    protected char _decodeEscaped() {
        VersionUtil.throwInternal();
        return ' ';
    }

    protected JsonToken _finishErrorToken() {
        while (this._inputPtr < this._inputEnd) {
            char nextSignedByteFromBuffer = (char) getNextSignedByteFromBuffer();
            if (Character.isJavaIdentifierPart(nextSignedByteFromBuffer)) {
                this._textBuffer.append(nextSignedByteFromBuffer);
                if (this._textBuffer.size() >= this._ioContext.errorReportConfiguration().getMaxErrorTokenLength()) {
                }
            }
            return _reportErrorToken(this._textBuffer.contentsAsString());
        }
        return _updateTokenToNA();
    }

    protected JsonToken _finishErrorTokenWithEOF() {
        return _reportErrorToken(this._textBuffer.contentsAsString());
    }

    protected final JsonToken _finishFieldWithEscape() {
        int i_decodeSplitEscaped = _decodeSplitEscaped(this._quoted32, this._quotedDigits);
        if (i_decodeSplitEscaped < 0) {
            this._minorState = 8;
            return JsonToken.NOT_AVAILABLE;
        }
        int i2 = this._quadLength;
        int[] iArr = this._quadBuffer;
        if (i2 >= iArr.length) {
            this._quadBuffer = _growNameDecodeBuffer(iArr, 32);
        }
        int i3 = this._pending32;
        int i4 = this._pendingBytes;
        int i5 = 1;
        if (i_decodeSplitEscaped > 127) {
            int i6 = 0;
            if (i4 >= 4) {
                int[] iArr2 = this._quadBuffer;
                int i7 = this._quadLength;
                this._quadLength = i7 + 1;
                iArr2[i7] = i3;
                i3 = 0;
                i4 = 0;
            }
            i4++;
            int i8 = i3 << 8;
            if (i_decodeSplitEscaped < 2048) {
                i3 = i8 | (i_decodeSplitEscaped >> 6) | 192;
            } else {
                int i9 = i8 | (i_decodeSplitEscaped >> 12) | 224;
                if (i4 >= 4) {
                    int[] iArr3 = this._quadBuffer;
                    int i10 = this._quadLength;
                    this._quadLength = i10 + 1;
                    iArr3[i10] = i9;
                    i4 = 0;
                } else {
                    i6 = i9;
                }
                i3 = (i6 << 8) | ((i_decodeSplitEscaped >> 6) & 63) | 128;
                i4++;
            }
            i_decodeSplitEscaped = (i_decodeSplitEscaped & 63) | 128;
        }
        if (i4 < 4) {
            i5 = 1 + i4;
            i_decodeSplitEscaped |= i3 << 8;
        } else {
            int[] iArr4 = this._quadBuffer;
            int i11 = this._quadLength;
            this._quadLength = i11 + 1;
            iArr4[i11] = i3;
        }
        return this._minorStateAfterSplit == 9 ? _finishAposName(this._quadLength, i_decodeSplitEscaped, i5) : _parseEscapedName(this._quadLength, i_decodeSplitEscaped, i5);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected com.fasterxml.jackson.core.JsonToken _finishFloatExponent(boolean r5, int r6) {
        /*
            r4 = this;
            r0 = 0
            if (r5 == 0) goto L27
            r5 = 32
            r4._minorState = r5
            r1 = 45
            if (r6 == r1) goto L10
            r1 = 43
            if (r6 != r1) goto L27
            r6 = r1
        L10:
            com.fasterxml.jackson.core.util.TextBuffer r1 = r4._textBuffer
            char r6 = (char) r6
            r1.append(r6)
            int r6 = r4._inputPtr
            int r1 = r4._inputEnd
            if (r6 < r1) goto L23
            r4._minorState = r5
            r4._expLength = r0
            com.fasterxml.jackson.core.JsonToken r4 = com.fasterxml.jackson.core.JsonToken.NOT_AVAILABLE
            return r4
        L23:
            byte r6 = r4.getNextSignedByteFromBuffer()
        L27:
            com.fasterxml.jackson.core.util.TextBuffer r5 = r4._textBuffer
            char[] r1 = r5.getBufferWithoutReset()
            int r5 = r5.getCurrentSegmentSize()
            int r2 = r4._expLength
        L33:
            r3 = 48
            if (r6 < r3) goto L61
            r3 = 57
            if (r6 > r3) goto L61
            int r2 = r2 + 1
            int r3 = r1.length
            if (r5 < r3) goto L46
            com.fasterxml.jackson.core.util.TextBuffer r1 = r4._textBuffer
            char[] r1 = r1.expandCurrentSegment()
        L46:
            int r3 = r5 + 1
            char r6 = (char) r6
            r1[r5] = r6
            int r5 = r4._inputPtr
            int r6 = r4._inputEnd
            if (r5 < r6) goto L5b
            com.fasterxml.jackson.core.util.TextBuffer r5 = r4._textBuffer
            r5.setCurrentLength(r3)
            r4._expLength = r2
            com.fasterxml.jackson.core.JsonToken r4 = com.fasterxml.jackson.core.JsonToken.NOT_AVAILABLE
            return r4
        L5b:
            byte r6 = r4.getNextSignedByteFromBuffer()
            r5 = r3
            goto L33
        L61:
            r6 = r6 & 255(0xff, float:3.57E-43)
            if (r2 != 0) goto L6b
            java.lang.String r1 = "Exponent indicator not followed by a digit"
            r4._reportUnexpectedNumberChar(r6, r1)
            goto L6c
        L6b:
            r0 = r2
        L6c:
            int r6 = r4._inputPtr
            int r6 = r6 + (-1)
            r4._inputPtr = r6
            com.fasterxml.jackson.core.util.TextBuffer r6 = r4._textBuffer
            r6.setCurrentLength(r5)
            r4._expLength = r0
            com.fasterxml.jackson.core.JsonToken r5 = com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_FLOAT
            r4._valueComplete(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.async.NonBlockingUtf8JsonParserBase._finishFloatExponent(boolean, int):com.fasterxml.jackson.core.JsonToken");
    }

    protected JsonToken _finishFloatFraction() {
        TextBuffer textBuffer = this._textBuffer;
        int i2 = this._fractLength;
        char[] bufferWithoutReset = textBuffer.getBufferWithoutReset();
        int currentSegmentSize = textBuffer.getCurrentSegmentSize();
        byte nextSignedByteFromBuffer = getNextSignedByteFromBuffer();
        boolean z = true;
        while (z) {
            if (nextSignedByteFromBuffer >= 48 && nextSignedByteFromBuffer <= 57) {
                i2++;
                if (currentSegmentSize >= bufferWithoutReset.length) {
                    bufferWithoutReset = this._textBuffer.expandCurrentSegment();
                }
                int i3 = currentSegmentSize + 1;
                bufferWithoutReset[currentSegmentSize] = (char) nextSignedByteFromBuffer;
                if (this._inputPtr >= this._inputEnd) {
                    this._textBuffer.setCurrentLength(i3);
                    this._fractLength = i2;
                    return JsonToken.NOT_AVAILABLE;
                }
                nextSignedByteFromBuffer = getNextSignedByteFromBuffer();
                currentSegmentSize = i3;
            } else if ((nextSignedByteFromBuffer | StylePropertiesKt.BackgroundColorId) == 102) {
                _reportUnexpectedNumberChar(nextSignedByteFromBuffer, "JSON does not support parsing numbers that have 'f' or 'd' suffixes");
            } else if (nextSignedByteFromBuffer == 46) {
                _reportUnexpectedNumberChar(46, "Cannot parse number with more than one decimal point");
            } else {
                z = false;
            }
        }
        if (i2 == 0) {
            if (!isEnabled(JsonReadFeature.ALLOW_TRAILING_DECIMAL_POINT_FOR_NUMBERS.mappedFeature())) {
                _reportUnexpectedNumberChar(nextSignedByteFromBuffer, "Decimal point not followed by a digit");
            }
            i2 = 0;
        }
        this._fractLength = i2;
        this._textBuffer.setCurrentLength(currentSegmentSize);
        if ((nextSignedByteFromBuffer | StylePropertiesKt.ZIndexId) != 101) {
            this._inputPtr--;
            this._textBuffer.setCurrentLength(currentSegmentSize);
            this._expLength = 0;
            JsonToken jsonToken = JsonToken.VALUE_NUMBER_FLOAT;
            _valueComplete(jsonToken);
            return jsonToken;
        }
        this._textBuffer.append((char) nextSignedByteFromBuffer);
        this._expLength = 0;
        if (this._inputPtr >= this._inputEnd) {
            this._minorState = 31;
            return JsonToken.NOT_AVAILABLE;
        }
        this._minorState = 32;
        return _finishFloatExponent(true, getNextUnsignedByteFromBuffer());
    }

    protected JsonToken _finishKeywordToken(String str, int i2, JsonToken jsonToken) {
        while (true) {
            int i3 = this._inputPtr;
            if (i3 < this._inputEnd) {
                int length = str.length();
                char byteFromBuffer = getByteFromBuffer(i3);
                if (i2 != length) {
                    if (byteFromBuffer != str.charAt(i2)) {
                        break;
                    }
                    this._inputPtr++;
                    i2++;
                } else if (byteFromBuffer < '0' || (byteFromBuffer | ' ') == 125) {
                    _valueComplete(jsonToken);
                    return jsonToken;
                }
            } else {
                this._pending32 = i2;
                return _updateTokenToNA();
            }
        }
        this._minorState = 50;
        this._textBuffer.resetWithCopy(str, 0, i2);
        return _finishErrorToken();
    }

    protected JsonToken _finishKeywordTokenWithEOF(String str, int i2, JsonToken jsonToken) {
        if (i2 == str.length()) {
            _updateToken(jsonToken);
            return jsonToken;
        }
        this._textBuffer.resetWithCopy(str, 0, i2);
        return _finishErrorTokenWithEOF();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003f, code lost:
    
        r4._minorState = 50;
        r4._textBuffer.resetWithCopy(r0, 0, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004d, code lost:
    
        return _finishErrorToken();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected com.fasterxml.jackson.core.JsonToken _finishNonStdToken(int r5, int r6) {
        /*
            r4 = this;
            java.lang.String r0 = r4._nonStdToken(r5)
            int r1 = r0.length()
        L8:
            int r2 = r4._inputPtr
            int r3 = r4._inputEnd
            if (r2 < r3) goto L1b
            r4._nonStdTokenType = r5
            r4._pending32 = r6
            r5 = 19
            r4._minorState = r5
            com.fasterxml.jackson.core.JsonToken r4 = r4._updateTokenToNA()
            return r4
        L1b:
            byte r2 = r4.getByteFromBuffer(r2)
            if (r6 != r1) goto L30
            r1 = 48
            if (r2 < r1) goto L2b
            r1 = r2 | 32
            r2 = 125(0x7d, float:1.75E-43)
            if (r1 != r2) goto L3f
        L2b:
            com.fasterxml.jackson.core.JsonToken r4 = r4._valueNonStdNumberComplete(r5)
            return r4
        L30:
            char r3 = r0.charAt(r6)
            if (r2 != r3) goto L3f
            int r2 = r4._inputPtr
            int r2 = r2 + 1
            r4._inputPtr = r2
            int r6 = r6 + 1
            goto L8
        L3f:
            r5 = 50
            r4._minorState = r5
            com.fasterxml.jackson.core.util.TextBuffer r5 = r4._textBuffer
            r1 = 0
            r5.resetWithCopy(r0, r1, r6)
            com.fasterxml.jackson.core.JsonToken r4 = r4._finishErrorToken()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.async.NonBlockingUtf8JsonParserBase._finishNonStdToken(int, int):com.fasterxml.jackson.core.JsonToken");
    }

    protected JsonToken _finishNonStdTokenWithEOF(int i2, int i3) {
        String str_nonStdToken = _nonStdToken(i2);
        if (i3 == str_nonStdToken.length()) {
            return _valueNonStdNumberComplete(i2);
        }
        this._textBuffer.resetWithCopy(str_nonStdToken, 0, i3);
        return _finishErrorTokenWithEOF();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0043, code lost:
    
        r5._intLength = r0;
        r5._textBuffer.setCurrentLength(r7);
        r6 = com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_INT;
        _valueComplete(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004f, code lost:
    
        return r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected com.fasterxml.jackson.core.JsonToken _finishNumberIntegralPart(char[] r6, int r7) {
        /*
            r5 = this;
            boolean r0 = r5._numberNegative
            r1 = 1
            if (r1 == r0) goto L7
            r0 = 0
            goto L8
        L7:
            r0 = -1
        L8:
            int r2 = r5._inputPtr
            int r3 = r5._inputEnd
            if (r2 < r3) goto L1c
            r6 = 26
            r5._minorState = r6
            com.fasterxml.jackson.core.util.TextBuffer r6 = r5._textBuffer
            r6.setCurrentLength(r7)
            com.fasterxml.jackson.core.JsonToken r5 = r5._updateTokenToNA()
            return r5
        L1c:
            byte r2 = r5.getByteFromBuffer(r2)
            r2 = r2 & 255(0xff, float:3.57E-43)
            r3 = 48
            if (r2 >= r3) goto L38
            int r0 = r0 + r7
            r3 = 46
            if (r2 == r3) goto L2c
            goto L43
        L2c:
            r5._intLength = r0
            int r0 = r5._inputPtr
            int r0 = r0 + r1
            r5._inputPtr = r0
            com.fasterxml.jackson.core.JsonToken r5 = r5._startFloat(r6, r7, r3)
            return r5
        L38:
            r3 = 57
            if (r2 <= r3) goto L5c
            int r0 = r0 + r7
            r3 = r2 | 32
            r4 = 101(0x65, float:1.42E-43)
            if (r3 == r4) goto L50
        L43:
            r5._intLength = r0
            com.fasterxml.jackson.core.util.TextBuffer r6 = r5._textBuffer
            r6.setCurrentLength(r7)
            com.fasterxml.jackson.core.JsonToken r6 = com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_INT
            r5._valueComplete(r6)
            return r6
        L50:
            r5._intLength = r0
            int r0 = r5._inputPtr
            int r0 = r0 + r1
            r5._inputPtr = r0
            com.fasterxml.jackson.core.JsonToken r5 = r5._startFloat(r6, r7, r2)
            return r5
        L5c:
            int r3 = r5._inputPtr
            int r3 = r3 + r1
            r5._inputPtr = r3
            int r3 = r6.length
            if (r7 < r3) goto L6a
            com.fasterxml.jackson.core.util.TextBuffer r6 = r5._textBuffer
            char[] r6 = r6.expandCurrentSegment()
        L6a:
            int r3 = r7 + 1
            char r2 = (char) r2
            r6[r7] = r2
            r7 = r3
            goto L8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.async.NonBlockingUtf8JsonParserBase._finishNumberIntegralPart(char[], int):com.fasterxml.jackson.core.JsonToken");
    }

    protected JsonToken _finishNumberLeadingNegZeroes() {
        return _finishNumberLeadingPosNegZeroes(true);
    }

    protected JsonToken _finishNumberLeadingPosNegZeroes(boolean z) {
        char c2;
        while (this._inputPtr < this._inputEnd) {
            int nextUnsignedByteFromBuffer = getNextUnsignedByteFromBuffer();
            if (nextUnsignedByteFromBuffer < 48) {
                if (nextUnsignedByteFromBuffer == 46) {
                    c2 = true == z ? '-' : '+';
                    char[] cArrEmptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
                    cArrEmptyAndGetCurrentSegment[0] = c2;
                    cArrEmptyAndGetCurrentSegment[1] = '0';
                    this._intLength = 1;
                    return _startFloat(cArrEmptyAndGetCurrentSegment, 2, 46);
                }
            } else if (nextUnsignedByteFromBuffer > 57) {
                int i2 = nextUnsignedByteFromBuffer | 32;
                if (i2 == 101) {
                    c2 = true == z ? '-' : '+';
                    char[] cArrEmptyAndGetCurrentSegment2 = this._textBuffer.emptyAndGetCurrentSegment();
                    cArrEmptyAndGetCurrentSegment2[0] = c2;
                    cArrEmptyAndGetCurrentSegment2[1] = '0';
                    this._intLength = 1;
                    return _startFloat(cArrEmptyAndGetCurrentSegment2, 2, nextUnsignedByteFromBuffer);
                }
                if (i2 != 125) {
                    _reportUnexpectedNumberChar(nextUnsignedByteFromBuffer, "expected digit (0-9), decimal point (.) or exponent indicator (e/E) to follow '0'");
                }
            } else {
                if ((this._features & FEAT_MASK_LEADING_ZEROS) == 0) {
                    reportInvalidNumber("Leading zeroes not allowed");
                }
                if (nextUnsignedByteFromBuffer != 48) {
                    c2 = true == z ? '-' : '+';
                    char[] cArrEmptyAndGetCurrentSegment3 = this._textBuffer.emptyAndGetCurrentSegment();
                    cArrEmptyAndGetCurrentSegment3[0] = c2;
                    cArrEmptyAndGetCurrentSegment3[1] = (char) nextUnsignedByteFromBuffer;
                    this._intLength = 1;
                    return _finishNumberIntegralPart(cArrEmptyAndGetCurrentSegment3, 2);
                }
            }
            this._inputPtr--;
            return _valueCompleteInt(0, "0");
        }
        this._minorState = true != z ? 24 : 25;
        return _updateTokenToNA();
    }

    protected JsonToken _finishNumberLeadingPosZeroes() {
        return _finishNumberLeadingPosNegZeroes(false);
    }

    protected JsonToken _finishNumberLeadingZeroes() {
        while (this._inputPtr < this._inputEnd) {
            int nextUnsignedByteFromBuffer = getNextUnsignedByteFromBuffer();
            if (nextUnsignedByteFromBuffer < 48) {
                if (nextUnsignedByteFromBuffer == 46) {
                    char[] cArrEmptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
                    cArrEmptyAndGetCurrentSegment[0] = '0';
                    this._intLength = 1;
                    return _startFloat(cArrEmptyAndGetCurrentSegment, 1, 46);
                }
            } else if (nextUnsignedByteFromBuffer > 57) {
                int i2 = nextUnsignedByteFromBuffer | 32;
                if (i2 == 101) {
                    char[] cArrEmptyAndGetCurrentSegment2 = this._textBuffer.emptyAndGetCurrentSegment();
                    cArrEmptyAndGetCurrentSegment2[0] = '0';
                    this._intLength = 1;
                    return _startFloat(cArrEmptyAndGetCurrentSegment2, 1, nextUnsignedByteFromBuffer);
                }
                if (i2 != 125) {
                    _reportUnexpectedNumberChar(nextUnsignedByteFromBuffer, "expected digit (0-9), decimal point (.) or exponent indicator (e/E) to follow '0'");
                }
            } else {
                if ((this._features & FEAT_MASK_LEADING_ZEROS) == 0) {
                    reportInvalidNumber("Leading zeroes not allowed");
                }
                if (nextUnsignedByteFromBuffer != 48) {
                    char[] cArrEmptyAndGetCurrentSegment3 = this._textBuffer.emptyAndGetCurrentSegment();
                    cArrEmptyAndGetCurrentSegment3[0] = (char) nextUnsignedByteFromBuffer;
                    this._intLength = 1;
                    return _finishNumberIntegralPart(cArrEmptyAndGetCurrentSegment3, 1);
                }
            }
            this._inputPtr--;
            return _valueCompleteInt(0, "0");
        }
        this._minorState = 24;
        return _updateTokenToNA();
    }

    protected JsonToken _finishNumberMinus(int i2) {
        return _finishNumberPlusMinus(i2, true);
    }

    protected JsonToken _finishNumberPlus(int i2) {
        return _finishNumberPlusMinus(i2, false);
    }

    protected JsonToken _finishNumberPlusMinus(int i2, boolean z) {
        if (i2 <= 48) {
            if (i2 == 48) {
                if (z) {
                    return _finishNumberLeadingNegZeroes();
                }
                if (!isEnabled(JsonReadFeature.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS.mappedFeature())) {
                    _reportUnexpectedNumberChar(43, "JSON spec does not allow numbers to have plus signs: enable `JsonReadFeature.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS` to allow");
                }
                return _finishNumberLeadingPosZeroes();
            }
            if (i2 == 46) {
                if (isEnabled(JsonReadFeature.ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS.mappedFeature())) {
                    if (z) {
                        this._inputPtr--;
                        return _finishNumberLeadingNegZeroes();
                    }
                    if (!isEnabled(JsonReadFeature.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS.mappedFeature())) {
                        _reportUnexpectedNumberChar(43, "JSON spec does not allow numbers to have plus signs: enable `JsonReadFeature.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS` to allow");
                    }
                    this._inputPtr--;
                    return _finishNumberLeadingPosZeroes();
                }
                i2 = 46;
            }
            _reportUnexpectedNumberChar(i2, true == z ? "expected digit (0-9) to follow minus sign, for valid numeric value" : "expected digit (0-9) for valid numeric value");
        } else if (i2 > 57) {
            if (i2 == 73) {
                return _finishNonStdToken(true != z ? 2 : 3, 2);
            }
            _reportUnexpectedNumberChar(i2, true == z ? "expected digit (0-9) to follow minus sign, for valid numeric value" : "expected digit (0-9) for valid numeric value");
        }
        if (!z && !isEnabled(JsonReadFeature.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS.mappedFeature())) {
            _reportUnexpectedNumberChar(43, "JSON spec does not allow numbers to have plus signs: enable `JsonReadFeature.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS` to allow");
        }
        char c2 = (char) i2;
        TextBuffer textBuffer = this._textBuffer;
        char c3 = true == z ? '-' : '+';
        char[] cArrEmptyAndGetCurrentSegment = textBuffer.emptyAndGetCurrentSegment();
        cArrEmptyAndGetCurrentSegment[0] = c3;
        cArrEmptyAndGetCurrentSegment[1] = c2;
        this._intLength = 1;
        return _finishNumberIntegralPart(cArrEmptyAndGetCurrentSegment, 2);
    }

    protected final JsonToken _finishToken() {
        int i2 = this._minorState;
        if (i2 == 1) {
            return _finishBOM(this._pending32);
        }
        if (i2 == 4) {
            return _startFieldName(getNextUnsignedByteFromBuffer());
        }
        if (i2 == 5) {
            return _startFieldNameAfterComma(getNextUnsignedByteFromBuffer());
        }
        switch (i2) {
            case 7:
                return _parseEscapedName(this._quadLength, this._pending32, this._pendingBytes);
            case 8:
                return _finishFieldWithEscape();
            case 9:
                return _finishAposName(this._quadLength, this._pending32, this._pendingBytes);
            case 10:
                return _finishUnquotedName(this._quadLength, this._pending32, this._pendingBytes);
            default:
                switch (i2) {
                    case 12:
                        return _startValue(getNextUnsignedByteFromBuffer());
                    case 13:
                        return _startValueExpectComma(getNextUnsignedByteFromBuffer());
                    case 14:
                        return _startValueExpectColon(getNextUnsignedByteFromBuffer());
                    case 15:
                        return _startValueAfterComma(getNextUnsignedByteFromBuffer());
                    case 16:
                        return _finishKeywordToken("null", this._pending32, JsonToken.VALUE_NULL);
                    case 17:
                        return _finishKeywordToken(CredentialEntry.TRUE_STRING, this._pending32, JsonToken.VALUE_TRUE);
                    case 18:
                        return _finishKeywordToken(CredentialEntry.FALSE_STRING, this._pending32, JsonToken.VALUE_FALSE);
                    case 19:
                        return _finishNonStdToken(this._nonStdTokenType, this._pending32);
                    default:
                        switch (i2) {
                            case 22:
                                return _finishNumberPlus(getNextUnsignedByteFromBuffer());
                            case 23:
                                return _finishNumberMinus(getNextUnsignedByteFromBuffer());
                            case 24:
                                return _finishNumberLeadingZeroes();
                            case 25:
                                return _finishNumberLeadingNegZeroes();
                            case 26:
                                TextBuffer textBuffer = this._textBuffer;
                                return _finishNumberIntegralPart(textBuffer.getBufferWithoutReset(), textBuffer.getCurrentSegmentSize());
                            default:
                                switch (i2) {
                                    case 30:
                                        return _finishFloatFraction();
                                    case 31:
                                        return _finishFloatExponent(true, getNextUnsignedByteFromBuffer());
                                    case 32:
                                        return _finishFloatExponent(false, getNextUnsignedByteFromBuffer());
                                    default:
                                        switch (i2) {
                                            case 40:
                                                return _finishRegularString();
                                            case 41:
                                                int i_decodeSplitEscaped = _decodeSplitEscaped(this._quoted32, this._quotedDigits);
                                                if (i_decodeSplitEscaped < 0) {
                                                    return JsonToken.NOT_AVAILABLE;
                                                }
                                                this._textBuffer.append((char) i_decodeSplitEscaped);
                                                return this._minorStateAfterSplit == 45 ? _finishAposString() : _finishRegularString();
                                            case 42:
                                                this._textBuffer.append((char) _decodeUTF8_2(this._pending32, getNextSignedByteFromBuffer()));
                                                return this._minorStateAfterSplit == 45 ? _finishAposString() : _finishRegularString();
                                            case 43:
                                                return !_decodeSplitUTF8_3(this._pending32, this._pendingBytes, getNextSignedByteFromBuffer()) ? JsonToken.NOT_AVAILABLE : this._minorStateAfterSplit == 45 ? _finishAposString() : _finishRegularString();
                                            case 44:
                                                return !_decodeSplitUTF8_4(this._pending32, this._pendingBytes, getNextSignedByteFromBuffer()) ? JsonToken.NOT_AVAILABLE : this._minorStateAfterSplit == 45 ? _finishAposString() : _finishRegularString();
                                            case 45:
                                                return _finishAposString();
                                            default:
                                                switch (i2) {
                                                    case 50:
                                                        return _finishErrorToken();
                                                    case 51:
                                                        return _startSlashComment(this._pending32);
                                                    case 52:
                                                        return _finishCComment(this._pending32, true);
                                                    case 53:
                                                        return _finishCComment(this._pending32, false);
                                                    case 54:
                                                        return _finishCppComment(this._pending32);
                                                    case 55:
                                                        return _finishHashComment(this._pending32);
                                                    default:
                                                        VersionUtil.throwInternal();
                                                        return null;
                                                }
                                        }
                                }
                        }
                }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    protected final JsonToken _finishTokenWithEOF() {
        JsonToken jsonToken = this._currToken;
        int i2 = this._minorState;
        if (i2 == 3) {
            _eofAsNextToken();
            return null;
        }
        if (i2 == 12) {
            _eofAsNextToken();
            return null;
        }
        if (i2 == 50) {
            return _finishErrorTokenWithEOF();
        }
        switch (i2) {
            case 16:
                return _finishKeywordTokenWithEOF("null", this._pending32, JsonToken.VALUE_NULL);
            case 17:
                return _finishKeywordTokenWithEOF(CredentialEntry.TRUE_STRING, this._pending32, JsonToken.VALUE_TRUE);
            case 18:
                return _finishKeywordTokenWithEOF(CredentialEntry.FALSE_STRING, this._pending32, JsonToken.VALUE_FALSE);
            case 19:
                return _finishNonStdTokenWithEOF(this._nonStdTokenType, this._pending32);
            default:
                switch (i2) {
                    case 24:
                    case 25:
                        return _valueCompleteInt(0, "0");
                    case 26:
                        int currentSegmentSize = this._textBuffer.getCurrentSegmentSize();
                        if (this._numberNegative) {
                            currentSegmentSize--;
                        }
                        this._intLength = currentSegmentSize;
                        JsonToken jsonToken2 = JsonToken.VALUE_NUMBER_INT;
                        _valueComplete(jsonToken2);
                        return jsonToken2;
                    default:
                        switch (i2) {
                            case 30:
                                this._expLength = 0;
                                JsonToken jsonToken3 = JsonToken.VALUE_NUMBER_FLOAT;
                                _valueComplete(jsonToken3);
                                return jsonToken3;
                            case 31:
                                _reportInvalidEOF(": was expecting fraction after exponent marker", JsonToken.VALUE_NUMBER_FLOAT);
                                _reportInvalidEOF(": was expecting closing '*/' for comment", JsonToken.NOT_AVAILABLE);
                                _eofAsNextToken();
                                return null;
                            case 32:
                                JsonToken jsonToken32 = JsonToken.VALUE_NUMBER_FLOAT;
                                _valueComplete(jsonToken32);
                                return jsonToken32;
                            default:
                                switch (i2) {
                                    case 52:
                                    case 53:
                                        _reportInvalidEOF(": was expecting closing '*/' for comment", JsonToken.NOT_AVAILABLE);
                                        break;
                                    case 54:
                                    case 55:
                                        break;
                                    default:
                                        _reportInvalidEOF(": was expecting rest of token (internal state: " + i2 + ")", this._currToken);
                                        return jsonToken;
                                }
                                _eofAsNextToken();
                                return null;
                        }
                }
        }
    }

    protected JsonToken _reportErrorToken(String str) {
        _reportError("Unrecognized token '%s': was expecting %s", this._textBuffer.contentsAsString(), _validJsonTokenList());
        return JsonToken.NOT_AVAILABLE;
    }

    protected JsonToken _startAposString() {
        TextBuffer textBuffer = this._textBuffer;
        int i2 = this._inputPtr;
        char[] cArrEmptyAndGetCurrentSegment = textBuffer.emptyAndGetCurrentSegment();
        int length = cArrEmptyAndGetCurrentSegment.length + i2;
        int[] iArr = _icUTF8;
        int iMin = Math.min(this._inputEnd, length);
        int i3 = 0;
        while (i2 < iMin) {
            int byteFromBuffer = getByteFromBuffer(i2) & 255;
            if (byteFromBuffer == 39) {
                this._inputPtr = i2 + 1;
                this._textBuffer.setCurrentLength(i3);
                JsonToken jsonToken = JsonToken.VALUE_STRING;
                _valueComplete(jsonToken);
                return jsonToken;
            }
            if (iArr[byteFromBuffer] != 0) {
                break;
            }
            i2++;
            cArrEmptyAndGetCurrentSegment[i3] = (char) byteFromBuffer;
            i3++;
        }
        this._textBuffer.setCurrentLength(i3);
        this._inputPtr = i2;
        return _finishAposString();
    }

    protected JsonToken _startFalseToken() {
        int byteFromBuffer;
        int i2 = this._inputPtr;
        if (i2 + 4 < this._inputEnd) {
            int i3 = i2 + 1;
            if (getByteFromBuffer(i2) == 97) {
                int i4 = i2 + 2;
                if (getByteFromBuffer(i3) == 108) {
                    int i5 = i2 + 3;
                    if (getByteFromBuffer(i4) == 115) {
                        int i6 = i2 + 4;
                        if (getByteFromBuffer(i5) == 101 && ((byteFromBuffer = getByteFromBuffer(i6) & 255) < 48 || (byteFromBuffer | 32) == 125)) {
                            this._inputPtr = i6;
                            JsonToken jsonToken = JsonToken.VALUE_FALSE;
                            _valueComplete(jsonToken);
                            return jsonToken;
                        }
                    }
                }
            }
        }
        this._minorState = 18;
        return _finishKeywordToken(CredentialEntry.FALSE_STRING, 1, JsonToken.VALUE_FALSE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x00c5, code lost:
    
        r8 = r9;
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected com.fasterxml.jackson.core.JsonToken _startFloat(char[] r7, int r8, int r9) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.async.NonBlockingUtf8JsonParserBase._startFloat(char[], int, int):com.fasterxml.jackson.core.JsonToken");
    }

    protected JsonToken _startFloatThatStartsWithPeriod() {
        this._numberNegative = false;
        this._intLength = 0;
        return _startFloat(this._textBuffer.emptyAndGetCurrentSegment(), 0, 46);
    }

    protected JsonToken _startNegativeNumber() {
        int i2;
        this._numberNegative = true;
        if (this._inputPtr >= this._inputEnd) {
            this._minorState = 23;
            return _updateTokenToNA();
        }
        int nextUnsignedByteFromBuffer = getNextUnsignedByteFromBuffer();
        int i3 = 2;
        if (nextUnsignedByteFromBuffer <= 48) {
            if (nextUnsignedByteFromBuffer == 48) {
                return _finishNumberLeadingNegZeroes();
            }
            _reportUnexpectedNumberChar(nextUnsignedByteFromBuffer, "expected digit (0-9) to follow minus sign, for valid numeric value");
        } else if (nextUnsignedByteFromBuffer > 57) {
            if (nextUnsignedByteFromBuffer == 73) {
                return _finishNonStdToken(3, 2);
            }
            _reportUnexpectedNumberChar(nextUnsignedByteFromBuffer, "expected digit (0-9) to follow minus sign, for valid numeric value");
        }
        char[] cArrEmptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        cArrEmptyAndGetCurrentSegment[0] = '-';
        cArrEmptyAndGetCurrentSegment[1] = (char) nextUnsignedByteFromBuffer;
        int i4 = this._inputPtr;
        if (i4 >= this._inputEnd) {
            this._minorState = 26;
            this._textBuffer.setCurrentLength(2);
            this._intLength = 1;
            return _updateTokenToNA();
        }
        int byteFromBuffer = getByteFromBuffer(i4);
        while (true) {
            if (byteFromBuffer < 48) {
                i2 = i3 - 1;
                if (byteFromBuffer == 46) {
                    this._intLength = i2;
                    this._inputPtr++;
                    return _startFloat(cArrEmptyAndGetCurrentSegment, i3, 46);
                }
            } else if (byteFromBuffer > 57) {
                i2 = i3 - 1;
                if ((byteFromBuffer | 32) == 101) {
                    this._intLength = i2;
                    this._inputPtr++;
                    return _startFloat(cArrEmptyAndGetCurrentSegment, i3, byteFromBuffer);
                }
            } else {
                if (i3 >= cArrEmptyAndGetCurrentSegment.length) {
                    cArrEmptyAndGetCurrentSegment = this._textBuffer.expandCurrentSegment();
                }
                int i5 = i3 + 1;
                cArrEmptyAndGetCurrentSegment[i3] = (char) byteFromBuffer;
                int i6 = this._inputPtr + 1;
                this._inputPtr = i6;
                if (i6 >= this._inputEnd) {
                    this._minorState = 26;
                    this._textBuffer.setCurrentLength(i5);
                    return _updateTokenToNA();
                }
                byteFromBuffer = getByteFromBuffer(i6) & 255;
                i3 = i5;
            }
        }
        this._intLength = i2;
        this._textBuffer.setCurrentLength(i3);
        JsonToken jsonToken = JsonToken.VALUE_NUMBER_INT;
        _valueComplete(jsonToken);
        return jsonToken;
    }

    protected JsonToken _startNullToken() {
        int byteFromBuffer;
        int i2 = this._inputPtr;
        if (i2 + 3 < this._inputEnd) {
            int i3 = i2 + 1;
            if (getByteFromBuffer(i2) == 117) {
                int i4 = i2 + 2;
                if (getByteFromBuffer(i3) == 108) {
                    int i5 = i2 + 3;
                    if (getByteFromBuffer(i4) == 108 && ((byteFromBuffer = getByteFromBuffer(i5) & 255) < 48 || (byteFromBuffer | 32) == 125)) {
                        this._inputPtr = i5;
                        JsonToken jsonToken = JsonToken.VALUE_NULL;
                        _valueComplete(jsonToken);
                        return jsonToken;
                    }
                }
            }
        }
        this._minorState = 16;
        return _finishKeywordToken("null", 1, JsonToken.VALUE_NULL);
    }

    protected JsonToken _startNumberLeadingZero() {
        int i2 = this._inputPtr;
        if (i2 >= this._inputEnd) {
            this._minorState = 24;
            return _updateTokenToNA();
        }
        int i3 = i2 + 1;
        int byteFromBuffer = getByteFromBuffer(i2) & 255;
        if (byteFromBuffer < 48) {
            if (byteFromBuffer == 46) {
                this._inputPtr = i3;
                this._intLength = 1;
                char[] cArrEmptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
                cArrEmptyAndGetCurrentSegment[0] = '0';
                return _startFloat(cArrEmptyAndGetCurrentSegment, 1, 46);
            }
        } else {
            if (byteFromBuffer <= 57) {
                return _finishNumberLeadingZeroes();
            }
            int i4 = byteFromBuffer | 32;
            if (i4 == 101) {
                this._inputPtr = i3;
                this._intLength = 1;
                char[] cArrEmptyAndGetCurrentSegment2 = this._textBuffer.emptyAndGetCurrentSegment();
                cArrEmptyAndGetCurrentSegment2[0] = '0';
                return _startFloat(cArrEmptyAndGetCurrentSegment2, 1, byteFromBuffer);
            }
            if (i4 != 125) {
                _reportUnexpectedNumberChar(byteFromBuffer, "expected digit (0-9), decimal point (.) or exponent indicator (e/E) to follow '0'");
            }
        }
        return _valueCompleteInt(0, "0");
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x009f, code lost:
    
        r9._intLength = r3;
        r9._textBuffer.setCurrentLength(r7);
        r0 = com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_INT;
        _valueComplete(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ab, code lost:
    
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected com.fasterxml.jackson.core.JsonToken _startPositiveNumber() {
        /*
            Method dump skipped, instructions count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.async.NonBlockingUtf8JsonParserBase._startPositiveNumber():com.fasterxml.jackson.core.JsonToken");
    }

    protected JsonToken _startString() {
        TextBuffer textBuffer = this._textBuffer;
        int i2 = this._inputPtr;
        char[] cArrEmptyAndGetCurrentSegment = textBuffer.emptyAndGetCurrentSegment();
        int length = cArrEmptyAndGetCurrentSegment.length + i2;
        int[] iArr = _icUTF8;
        int iMin = Math.min(this._inputEnd, length);
        int i3 = 0;
        while (true) {
            if (i2 >= iMin) {
                break;
            }
            int byteFromBuffer = getByteFromBuffer(i2) & 255;
            if (iArr[byteFromBuffer] == 0) {
                i2++;
                cArrEmptyAndGetCurrentSegment[i3] = (char) byteFromBuffer;
                i3++;
            } else if (byteFromBuffer == 34) {
                this._inputPtr = i2 + 1;
                this._textBuffer.setCurrentLength(i3);
                JsonToken jsonToken = JsonToken.VALUE_STRING;
                _valueComplete(jsonToken);
                return jsonToken;
            }
        }
        this._textBuffer.setCurrentLength(i3);
        this._inputPtr = i2;
        return _finishRegularString();
    }

    protected JsonToken _startTrueToken() {
        int byteFromBuffer;
        int i2 = this._inputPtr;
        if (i2 + 3 < this._inputEnd) {
            int i3 = i2 + 1;
            if (getByteFromBuffer(i2) == 114) {
                int i4 = i2 + 2;
                if (getByteFromBuffer(i3) == 117) {
                    int i5 = i2 + 3;
                    if (getByteFromBuffer(i4) == 101 && ((byteFromBuffer = getByteFromBuffer(i5) & 255) < 48 || (byteFromBuffer | 32) == 125)) {
                        this._inputPtr = i5;
                        JsonToken jsonToken = JsonToken.VALUE_TRUE;
                        _valueComplete(jsonToken);
                        return jsonToken;
                    }
                }
            }
        }
        this._minorState = 17;
        return _finishKeywordToken(CredentialEntry.TRUE_STRING, 1, JsonToken.VALUE_TRUE);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected com.fasterxml.jackson.core.JsonToken _startUnexpectedValue(boolean r2, int r3) {
        /*
            r1 = this;
            r2 = 39
            if (r3 == r2) goto L4f
            r2 = 73
            r0 = 1
            if (r3 == r2) goto L4a
            r2 = 78
            if (r3 == r2) goto L44
            r2 = 93
            if (r3 == r2) goto L20
            r2 = 43
            if (r3 == r2) goto L1a
            r2 = 44
            if (r3 == r2) goto L29
            goto L5b
        L1a:
            r2 = 2
            com.fasterxml.jackson.core.JsonToken r1 = r1._finishNonStdToken(r2, r0)
            return r1
        L20:
            com.fasterxml.jackson.core.json.JsonReadContext r2 = r1._parsingContext
            boolean r2 = r2.inArray()
            if (r2 != 0) goto L29
            goto L5b
        L29:
            com.fasterxml.jackson.core.json.JsonReadContext r2 = r1._parsingContext
            boolean r2 = r2.inRoot()
            if (r2 != 0) goto L5b
            int r2 = r1._features
            int r0 = com.fasterxml.jackson.core.json.async.NonBlockingUtf8JsonParserBase.FEAT_MASK_ALLOW_MISSING
            r2 = r2 & r0
            if (r2 == 0) goto L5b
            int r2 = r1._inputPtr
            int r2 = r2 + (-1)
            r1._inputPtr = r2
            com.fasterxml.jackson.core.JsonToken r2 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL
            r1._valueComplete(r2)
            return r2
        L44:
            r2 = 0
            com.fasterxml.jackson.core.JsonToken r1 = r1._finishNonStdToken(r2, r0)
            return r1
        L4a:
            com.fasterxml.jackson.core.JsonToken r1 = r1._finishNonStdToken(r0, r0)
            return r1
        L4f:
            int r2 = r1._features
            int r0 = com.fasterxml.jackson.core.json.async.NonBlockingUtf8JsonParserBase.FEAT_MASK_ALLOW_SINGLE_QUOTES
            r2 = r2 & r0
            if (r2 == 0) goto L5b
            com.fasterxml.jackson.core.JsonToken r1 = r1._startAposString()
            return r1
        L5b:
            java.lang.String r2 = r1._validJsonValueList()
            java.lang.String r0 = "expected a valid value "
            java.lang.String r2 = r0.concat(r2)
            r1._reportUnexpectedChar(r3, r2)
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.async.NonBlockingUtf8JsonParserBase._startUnexpectedValue(boolean, int):com.fasterxml.jackson.core.JsonToken");
    }

    protected abstract byte getByteFromBuffer(int i2);

    protected abstract byte getNextSignedByteFromBuffer();

    protected abstract int getNextUnsignedByteFromBuffer();

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public JsonToken nextToken() {
        if (this._inputPtr >= this._inputEnd) {
            if (this._closed) {
                return null;
            }
            if (!this._endOfInput) {
                return JsonToken.NOT_AVAILABLE;
            }
            if (this._currToken == JsonToken.NOT_AVAILABLE) {
                return _finishTokenWithEOF();
            }
            _eofAsNextToken();
            return null;
        }
        if (this._currToken == JsonToken.NOT_AVAILABLE) {
            return _finishToken();
        }
        this._numTypesValid = 0;
        this._tokenInputTotal = this._currInputProcessed + (this._inputPtr - this._currBufferStart);
        this._binaryValue = null;
        int nextUnsignedByteFromBuffer = getNextUnsignedByteFromBuffer();
        switch (this._majorState) {
            case 0:
                return _startDocument(nextUnsignedByteFromBuffer);
            case 1:
                return _startValue(nextUnsignedByteFromBuffer);
            case 2:
                return _startFieldName(nextUnsignedByteFromBuffer);
            case 3:
                return _startFieldNameAfterComma(nextUnsignedByteFromBuffer);
            case 4:
                return _startValueExpectColon(nextUnsignedByteFromBuffer);
            case 5:
                return _startValue(nextUnsignedByteFromBuffer);
            case 6:
                return _startValueExpectComma(nextUnsignedByteFromBuffer);
            default:
                VersionUtil.throwInternal();
                return null;
        }
    }

    protected JsonToken _startPositiveNumber(int i2) {
        this._numberNegative = false;
        char[] cArrEmptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        cArrEmptyAndGetCurrentSegment[0] = (char) i2;
        int i3 = this._inputPtr;
        if (i3 >= this._inputEnd) {
            this._minorState = 26;
            this._textBuffer.setCurrentLength(1);
            return _updateTokenToNA();
        }
        int byteFromBuffer = getByteFromBuffer(i3) & 255;
        int i4 = 1;
        while (true) {
            if (byteFromBuffer < 48) {
                if (byteFromBuffer == 46) {
                    this._intLength = i4;
                    this._inputPtr++;
                    return _startFloat(cArrEmptyAndGetCurrentSegment, i4, 46);
                }
            } else if (byteFromBuffer <= 57) {
                if (i4 >= cArrEmptyAndGetCurrentSegment.length) {
                    cArrEmptyAndGetCurrentSegment = this._textBuffer.expandCurrentSegment();
                }
                int i5 = i4 + 1;
                cArrEmptyAndGetCurrentSegment[i4] = (char) byteFromBuffer;
                int i6 = this._inputPtr + 1;
                this._inputPtr = i6;
                if (i6 >= this._inputEnd) {
                    this._minorState = 26;
                    this._textBuffer.setCurrentLength(i5);
                    return _updateTokenToNA();
                }
                byteFromBuffer = getByteFromBuffer(i6) & 255;
                i4 = i5;
            } else if ((byteFromBuffer | 32) == 101) {
                this._intLength = i4;
                this._inputPtr++;
                return _startFloat(cArrEmptyAndGetCurrentSegment, i4, byteFromBuffer);
            }
        }
        this._intLength = i4;
        this._textBuffer.setCurrentLength(i4);
        JsonToken jsonToken = JsonToken.VALUE_NUMBER_INT;
        _valueComplete(jsonToken);
        return jsonToken;
    }
}
