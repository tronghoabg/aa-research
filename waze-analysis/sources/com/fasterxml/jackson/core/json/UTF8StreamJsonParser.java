package com.fasterxml.jackson.core.json;

import androidx.autofill.HintConstants;
import androidx.core.internal.view.SupportMenu;
import androidx.credentials.provider.CredentialEntry;
import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.core.exc.StreamConstraintsException;
import com.fasterxml.jackson.core.io.CharTypes;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import com.fasterxml.jackson.core.util.InternalJacksonUtil;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Writer;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class UTF8StreamJsonParser extends JsonParserBase {
    protected boolean _bufferRecyclable;
    protected byte[] _inputBuffer;
    protected InputStream _inputStream;
    protected int _nameStartCol;
    protected int _nameStartOffset;
    protected int _nameStartRow;
    private int _quad1;
    protected int[] _quadBuffer;
    protected final ByteQuadsCanonicalizer _symbols;
    protected boolean _tokenIncomplete;

    public UTF8StreamJsonParser(IOContext iOContext, int i2, InputStream inputStream, ObjectCodec objectCodec, ByteQuadsCanonicalizer byteQuadsCanonicalizer, byte[] bArr, int i3, int i4, int i5, boolean z) {
        super(iOContext, i2, objectCodec);
        this._quadBuffer = new int[16];
        this._inputStream = inputStream;
        this._symbols = byteQuadsCanonicalizer;
        this._inputBuffer = bArr;
        this._inputPtr = i3;
        this._inputEnd = i4;
        this._currInputRowStart = i3 - i5;
        this._currInputProcessed = (-i3) + i5;
        this._bufferRecyclable = z;
    }

    private final void _checkMatchEnd(String str, int i2, int i3) {
        if (Character.isJavaIdentifierPart((char) _decodeCharForError(i3))) {
            _reportInvalidToken(str.substring(0, i2));
        }
    }

    private final void _closeArrayScope() {
        _updateLocation();
        if (!this._parsingContext.inArray()) {
            _reportMismatchedEndMarker(93, '}');
        }
        this._parsingContext = this._parsingContext.clearAndGetParent();
    }

    private final void _closeObjectScope() {
        _updateLocation();
        if (!this._parsingContext.inObject()) {
            _reportMismatchedEndMarker(125, ']');
        }
        this._parsingContext = this._parsingContext.clearAndGetParent();
    }

    private final JsonToken _closeScope(int i2) {
        if (i2 == 125) {
            _closeObjectScope();
            JsonToken jsonToken = JsonToken.END_OBJECT;
            _updateToken(jsonToken);
            return jsonToken;
        }
        _closeArrayScope();
        JsonToken jsonToken2 = JsonToken.END_ARRAY;
        _updateToken(jsonToken2);
        return jsonToken2;
    }

    private final int _decodeUtf8_2(int i2) {
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr = this._inputBuffer;
        int i3 = this._inputPtr;
        int i4 = i3 + 1;
        this._inputPtr = i4;
        byte b2 = bArr[i3];
        if ((b2 & 192) != 128) {
            _reportInvalidOther(b2 & 255, i4);
        }
        return ((i2 & 31) << 6) | (b2 & 63);
    }

    private final int _decodeUtf8_3(int i2) {
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        int i3 = i2 & 15;
        byte[] bArr = this._inputBuffer;
        int i4 = this._inputPtr;
        int i5 = i4 + 1;
        this._inputPtr = i5;
        byte b2 = bArr[i4];
        if ((b2 & 192) != 128) {
            _reportInvalidOther(b2 & 255, i5);
        }
        int i6 = i3 << 6;
        int i7 = b2 & 63;
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr2 = this._inputBuffer;
        int i8 = this._inputPtr;
        int i9 = i8 + 1;
        this._inputPtr = i9;
        byte b3 = bArr2[i8];
        if ((b3 & 192) != 128) {
            _reportInvalidOther(b3 & 255, i9);
        }
        return ((i6 | i7) << 6) | (b3 & 63);
    }

    private final int _decodeUtf8_3fast(int i2) {
        byte[] bArr = this._inputBuffer;
        int i3 = this._inputPtr;
        int i4 = i3 + 1;
        this._inputPtr = i4;
        byte b2 = bArr[i3];
        if ((b2 & 192) != 128) {
            _reportInvalidOther(b2 & 255, i4);
        }
        int i5 = i2 & 15;
        int i6 = b2 & 63;
        byte[] bArr2 = this._inputBuffer;
        int i7 = this._inputPtr;
        int i8 = i7 + 1;
        this._inputPtr = i8;
        byte b3 = bArr2[i7];
        if ((b3 & 192) != 128) {
            _reportInvalidOther(b3 & 255, i8);
        }
        return (((i5 << 6) | i6) << 6) | (b3 & 63);
    }

    private final int _decodeUtf8_4(int i2) {
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr = this._inputBuffer;
        int i3 = this._inputPtr;
        int i4 = i3 + 1;
        this._inputPtr = i4;
        byte b2 = bArr[i3];
        if ((b2 & 192) != 128) {
            _reportInvalidOther(b2 & 255, i4);
        }
        int i5 = i2 & 7;
        int i6 = b2 & 63;
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr2 = this._inputBuffer;
        int i7 = this._inputPtr;
        int i8 = i7 + 1;
        this._inputPtr = i8;
        byte b3 = bArr2[i7];
        if ((b3 & 192) != 128) {
            _reportInvalidOther(b3 & 255, i8);
        }
        int i9 = (i5 << 6) | i6;
        int i10 = b3 & 63;
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr3 = this._inputBuffer;
        int i11 = this._inputPtr;
        int i12 = i11 + 1;
        this._inputPtr = i12;
        byte b4 = bArr3[i11];
        if ((b4 & 192) != 128) {
            _reportInvalidOther(b4 & 255, i12);
        }
        return ((((i9 << 6) | i10) << 6) | (b4 & 63)) + SupportMenu.CATEGORY_MASK;
    }

    private final void _finishString2(char[] cArr, int i2) {
        int[] iArr = INPUT_CODES_UTF8;
        byte[] bArr = this._inputBuffer;
        while (true) {
            int i3 = this._inputPtr;
            if (i3 >= this._inputEnd) {
                _loadMoreGuaranteed();
                i3 = this._inputPtr;
            }
            int i4 = 0;
            if (i2 >= cArr.length) {
                cArr = this._textBuffer.finishCurrentSegment();
                i2 = 0;
            }
            int iMin = Math.min(this._inputEnd, InternalJacksonUtil.addOverflowSafe(i3, cArr.length - i2));
            while (true) {
                if (i3 >= iMin) {
                    this._inputPtr = i3;
                    break;
                }
                int i5 = i3 + 1;
                int i_decodeEscaped = bArr[i3] & 255;
                int i6 = iArr[i_decodeEscaped];
                if (i6 != 0) {
                    this._inputPtr = i5;
                    if (i_decodeEscaped == 34) {
                        this._textBuffer.setCurrentLength(i2);
                        return;
                    }
                    if (i6 == 1) {
                        i_decodeEscaped = _decodeEscaped();
                    } else if (i6 == 2) {
                        i_decodeEscaped = _decodeUtf8_2(i_decodeEscaped);
                    } else if (i6 == 3) {
                        i_decodeEscaped = this._inputEnd - i5 >= 2 ? _decodeUtf8_3fast(i_decodeEscaped) : _decodeUtf8_3(i_decodeEscaped);
                    } else if (i6 == 4) {
                        int i7 = i2 + 1;
                        int i_decodeUtf8_4 = _decodeUtf8_4(i_decodeEscaped);
                        cArr[i2] = (char) ((i_decodeUtf8_4 >> 10) | 55296);
                        if (i7 >= cArr.length) {
                            cArr = this._textBuffer.finishCurrentSegment();
                            i2 = 0;
                        } else {
                            i2 = i7;
                        }
                        i_decodeEscaped = (i_decodeUtf8_4 & 1023) | 56320;
                    } else if (i_decodeEscaped < 32) {
                        _throwUnquotedSpace(i_decodeEscaped, "string value");
                    } else {
                        _reportInvalidChar(i_decodeEscaped);
                    }
                    if (i2 >= cArr.length) {
                        cArr = this._textBuffer.finishCurrentSegment();
                    } else {
                        i4 = i2;
                    }
                    i2 = i4 + 1;
                    cArr[i4] = (char) i_decodeEscaped;
                } else {
                    cArr[i2] = (char) i_decodeEscaped;
                    i3 = i5;
                    i2++;
                }
            }
        }
    }

    private final boolean _isNextTokenNameMaybe(int i2, SerializableString serializableString) throws JsonParseException {
        JsonToken jsonToken_parseSignedNumber;
        String str_parseName = _parseName(i2);
        this._parsingContext.setCurrentName(str_parseName);
        boolean zEquals = str_parseName.equals(serializableString.getValue());
        _updateToken(JsonToken.FIELD_NAME);
        int i_skipColon = _skipColon();
        _updateLocation();
        if (i_skipColon == 34) {
            this._tokenIncomplete = true;
            this._nextToken = JsonToken.VALUE_STRING;
            return zEquals;
        }
        if (i_skipColon == 43) {
            jsonToken_parseSignedNumber = isEnabled(JsonReadFeature.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS.mappedFeature()) ? _parseSignedNumber(false) : _handleUnexpectedValue(i_skipColon);
        } else if (i_skipColon == 91) {
            jsonToken_parseSignedNumber = JsonToken.START_ARRAY;
        } else if (i_skipColon == 102) {
            _matchFalse();
            jsonToken_parseSignedNumber = JsonToken.VALUE_FALSE;
        } else if (i_skipColon == 110) {
            _matchNull();
            jsonToken_parseSignedNumber = JsonToken.VALUE_NULL;
        } else if (i_skipColon == 116) {
            _matchTrue();
            jsonToken_parseSignedNumber = JsonToken.VALUE_TRUE;
        } else if (i_skipColon == 123) {
            jsonToken_parseSignedNumber = JsonToken.START_OBJECT;
        } else if (i_skipColon == 45) {
            jsonToken_parseSignedNumber = _parseSignedNumber(true);
        } else if (i_skipColon != 46) {
            switch (i_skipColon) {
                case 48:
                case 49:
                case 50:
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                    jsonToken_parseSignedNumber = _parseUnsignedNumber(i_skipColon);
                    break;
                default:
                    jsonToken_parseSignedNumber = _handleUnexpectedValue(i_skipColon);
                    break;
            }
        } else {
            jsonToken_parseSignedNumber = _parseFloatThatStartsWithPeriod(false, false);
        }
        this._nextToken = jsonToken_parseSignedNumber;
        return zEquals;
    }

    private final void _isNextTokenNameYes(int i2) {
        _updateToken(JsonToken.FIELD_NAME);
        _updateLocation();
        if (i2 == 34) {
            this._tokenIncomplete = true;
            this._nextToken = JsonToken.VALUE_STRING;
            return;
        }
        if (i2 == 43) {
            if (isEnabled(JsonReadFeature.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS.mappedFeature())) {
                this._nextToken = _parseSignedNumber(false);
                return;
            } else {
                this._nextToken = _handleUnexpectedValue(i2);
                return;
            }
        }
        if (i2 == 91) {
            this._nextToken = JsonToken.START_ARRAY;
            return;
        }
        if (i2 == 102) {
            _matchFalse();
            this._nextToken = JsonToken.VALUE_FALSE;
            return;
        }
        if (i2 == 110) {
            _matchNull();
            this._nextToken = JsonToken.VALUE_NULL;
            return;
        }
        if (i2 == 116) {
            _matchTrue();
            this._nextToken = JsonToken.VALUE_TRUE;
            return;
        }
        if (i2 == 123) {
            this._nextToken = JsonToken.START_OBJECT;
            return;
        }
        if (i2 == 45) {
            this._nextToken = _parseSignedNumber(true);
            return;
        }
        if (i2 == 46) {
            this._nextToken = _parseFloatThatStartsWithPeriod(false, false);
            return;
        }
        switch (i2) {
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
                this._nextToken = _parseUnsignedNumber(i2);
                break;
            default:
                this._nextToken = _handleUnexpectedValue(i2);
                break;
        }
    }

    private final void _matchToken2(String str, int i2) {
        int length;
        int i3;
        int i4;
        do {
            if ((this._inputPtr >= this._inputEnd && !_loadMore()) || this._inputBuffer[this._inputPtr] != str.charAt(i2)) {
                _reportInvalidToken(str.substring(0, i2));
            }
            length = str.length();
            i3 = this._inputPtr + 1;
            this._inputPtr = i3;
            i2++;
        } while (i2 < length);
        if ((i3 < this._inputEnd || _loadMore()) && (i4 = this._inputBuffer[this._inputPtr] & 255) >= 48 && i4 != 93 && i4 != 125) {
            _checkMatchEnd(str, i2, i4);
        }
    }

    private final JsonToken _nextAfterName() {
        this._nameCopied = false;
        JsonToken jsonToken = this._nextToken;
        this._nextToken = null;
        if (jsonToken == JsonToken.START_ARRAY) {
            createChildArrayContext(this._tokenInputRow, this._tokenInputCol);
        } else if (jsonToken == JsonToken.START_OBJECT) {
            createChildObjectContext(this._tokenInputRow, this._tokenInputCol);
        }
        _updateToken(jsonToken);
        return jsonToken;
    }

    private final JsonToken _nextTokenNotInObject(int i2) {
        if (i2 == 34) {
            this._tokenIncomplete = true;
            JsonToken jsonToken = JsonToken.VALUE_STRING;
            _updateToken(jsonToken);
            return jsonToken;
        }
        if (i2 == 43) {
            if (isEnabled(JsonReadFeature.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS.mappedFeature())) {
                JsonToken jsonToken_parseSignedNumber = _parseSignedNumber(false);
                _updateToken(jsonToken_parseSignedNumber);
                return jsonToken_parseSignedNumber;
            }
            JsonToken jsonToken_handleUnexpectedValue = _handleUnexpectedValue(i2);
            _updateToken(jsonToken_handleUnexpectedValue);
            return jsonToken_handleUnexpectedValue;
        }
        if (i2 == 91) {
            createChildArrayContext(this._tokenInputRow, this._tokenInputCol);
            JsonToken jsonToken2 = JsonToken.START_ARRAY;
            _updateToken(jsonToken2);
            return jsonToken2;
        }
        if (i2 == 102) {
            _matchFalse();
            JsonToken jsonToken3 = JsonToken.VALUE_FALSE;
            _updateToken(jsonToken3);
            return jsonToken3;
        }
        if (i2 == 110) {
            _matchNull();
            JsonToken jsonToken4 = JsonToken.VALUE_NULL;
            _updateToken(jsonToken4);
            return jsonToken4;
        }
        if (i2 == 116) {
            _matchTrue();
            JsonToken jsonToken5 = JsonToken.VALUE_TRUE;
            _updateToken(jsonToken5);
            return jsonToken5;
        }
        if (i2 == 123) {
            createChildObjectContext(this._tokenInputRow, this._tokenInputCol);
            JsonToken jsonToken6 = JsonToken.START_OBJECT;
            _updateToken(jsonToken6);
            return jsonToken6;
        }
        if (i2 == 45) {
            JsonToken jsonToken_parseSignedNumber2 = _parseSignedNumber(true);
            _updateToken(jsonToken_parseSignedNumber2);
            return jsonToken_parseSignedNumber2;
        }
        if (i2 == 46) {
            JsonToken jsonToken_parseFloatThatStartsWithPeriod = _parseFloatThatStartsWithPeriod(false, false);
            _updateToken(jsonToken_parseFloatThatStartsWithPeriod);
            return jsonToken_parseFloatThatStartsWithPeriod;
        }
        switch (i2) {
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
                JsonToken jsonToken_parseUnsignedNumber = _parseUnsignedNumber(i2);
                _updateToken(jsonToken_parseUnsignedNumber);
                return jsonToken_parseUnsignedNumber;
            default:
                JsonToken jsonToken_handleUnexpectedValue2 = _handleUnexpectedValue(i2);
                _updateToken(jsonToken_handleUnexpectedValue2);
                return jsonToken_handleUnexpectedValue2;
        }
    }

    private static final int _padLastQuad(int i2, int i3) {
        return i3 == 4 ? i2 : i2 | ((-1) << (i3 << 3));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:49:0x00c3
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:195)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:62)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:101)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.fasterxml.jackson.core.JsonToken _parseFloat(char[] r11, int r12, int r13, boolean r14, int r15) {
        /*
            Method dump skipped, instructions count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.UTF8StreamJsonParser._parseFloat(char[], int, int, boolean, int):com.fasterxml.jackson.core.JsonToken");
    }

    private final JsonToken _parseNumber2(char[] cArr, int i2, boolean z, int i3) {
        int i4;
        int i5;
        char[] cArrFinishCurrentSegment = cArr;
        int i6 = i2;
        int i7 = i3;
        while (true) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                this._textBuffer.setCurrentLength(i6);
                return resetInt(z, i7);
            }
            byte[] bArr = this._inputBuffer;
            i4 = this._inputPtr;
            this._inputPtr = i4 + 1;
            i5 = bArr[i4] & 255;
            if (i5 > 57 || i5 < 48) {
                break;
            }
            if (i6 >= cArrFinishCurrentSegment.length) {
                i6 = 0;
                cArrFinishCurrentSegment = this._textBuffer.finishCurrentSegment();
            }
            cArrFinishCurrentSegment[i6] = (char) i5;
            i7++;
            i6++;
        }
        if (i5 == 46 || (i5 | 32) == 101) {
            return _parseFloat(cArrFinishCurrentSegment, i6, i5, z, i7);
        }
        this._inputPtr = i4;
        this._textBuffer.setCurrentLength(i6);
        if (this._parsingContext.inRoot()) {
            _verifyRootSpace(this._inputBuffer[this._inputPtr] & 255);
        }
        return resetInt(z, i7);
    }

    private final JsonToken _parseSignedNumber(boolean z) {
        int i2;
        int i3;
        int i4;
        char[] cArrEmptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        int i5 = 0;
        int i6 = 1;
        if (z) {
            cArrEmptyAndGetCurrentSegment[0] = '-';
            i5 = 1;
        }
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr = this._inputBuffer;
        int i7 = this._inputPtr;
        this._inputPtr = i7 + 1;
        int i_verifyNoLeadingZeroes = bArr[i7] & 255;
        if (i_verifyNoLeadingZeroes <= 48) {
            if (i_verifyNoLeadingZeroes != 48) {
                return i_verifyNoLeadingZeroes == 46 ? _parseFloatThatStartsWithPeriod(z, true) : _handleInvalidNumberStart(i_verifyNoLeadingZeroes, z, true);
            }
            i_verifyNoLeadingZeroes = _verifyNoLeadingZeroes();
        } else if (i_verifyNoLeadingZeroes > 57) {
            return _handleInvalidNumberStart(i_verifyNoLeadingZeroes, z, true);
        }
        int i8 = i5 + 1;
        cArrEmptyAndGetCurrentSegment[i5] = (char) i_verifyNoLeadingZeroes;
        int iMin = Math.min(this._inputEnd, (this._inputPtr + cArrEmptyAndGetCurrentSegment.length) - i8);
        while (true) {
            i2 = i8;
            i3 = this._inputPtr;
            if (i3 >= iMin) {
                return _parseNumber2(cArrEmptyAndGetCurrentSegment, i2, z, i6);
            }
            byte[] bArr2 = this._inputBuffer;
            this._inputPtr = i3 + 1;
            i4 = bArr2[i3] & 255;
            if (i4 < 48 || i4 > 57) {
                break;
            }
            i8 = i2 + 1;
            cArrEmptyAndGetCurrentSegment[i2] = (char) i4;
            i6++;
        }
        if (i4 == 46 || (i4 | 32) == 101) {
            return _parseFloat(cArrEmptyAndGetCurrentSegment, i2, i4, z, i6);
        }
        this._inputPtr = i3;
        this._textBuffer.setCurrentLength(i2);
        if (this._parsingContext.inRoot()) {
            _verifyRootSpace(i4);
        }
        return resetInt(z, i6);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0043, code lost:
    
        _reportInvalidEOF(" in a comment", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0049, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void _skipCComment() {
        /*
            r5 = this;
            int[] r0 = com.fasterxml.jackson.core.io.CharTypes.getInputCodeComment()
        L4:
            int r1 = r5._inputPtr
            int r2 = r5._inputEnd
            if (r1 < r2) goto L10
            boolean r1 = r5._loadMore()
            if (r1 == 0) goto L43
        L10:
            byte[] r1 = r5._inputBuffer
            int r2 = r5._inputPtr
            int r3 = r2 + 1
            r5._inputPtr = r3
            r1 = r1[r2]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r2 = r0[r1]
            if (r2 == 0) goto L4
            r4 = 2
            if (r2 == r4) goto L6e
            r4 = 3
            if (r2 == r4) goto L6a
            r4 = 4
            if (r2 == r4) goto L66
            r4 = 10
            if (r2 == r4) goto L5d
            r4 = 13
            if (r2 == r4) goto L59
            r4 = 42
            if (r2 == r4) goto L39
            r5._reportInvalidChar(r1)
            goto L4
        L39:
            int r1 = r5._inputEnd
            if (r3 < r1) goto L4a
            boolean r1 = r5._loadMore()
            if (r1 != 0) goto L4a
        L43:
            java.lang.String r0 = " in a comment"
            r1 = 0
            r5._reportInvalidEOF(r0, r1)
            return
        L4a:
            byte[] r1 = r5._inputBuffer
            int r2 = r5._inputPtr
            r1 = r1[r2]
            r3 = 47
            if (r1 != r3) goto L4
            int r2 = r2 + 1
            r5._inputPtr = r2
            return
        L59:
            r5._skipCR()
            goto L4
        L5d:
            int r1 = r5._currInputRow
            int r1 = r1 + 1
            r5._currInputRow = r1
            r5._currInputRowStart = r3
            goto L4
        L66:
            r5._skipUtf8_4(r1)
            goto L4
        L6a:
            r5._skipUtf8_3()
            goto L4
        L6e:
            r5._skipUtf8_2()
            goto L4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.UTF8StreamJsonParser._skipCComment():void");
    }

    private final int _skipColon() {
        int i2;
        byte b2;
        int i3 = this._inputPtr;
        if (i3 + 4 >= this._inputEnd) {
            return _skipColon2(false);
        }
        byte[] bArr = this._inputBuffer;
        byte b3 = bArr[i3];
        if (b3 == 58) {
            i2 = i3 + 1;
            this._inputPtr = i2;
            b2 = bArr[i2];
            if (b2 <= 32) {
                if (b2 == 32 || b2 == 9) {
                    i2 = i3 + 2;
                    this._inputPtr = i2;
                    b2 = bArr[i2];
                    if (b2 > 32) {
                        if (b2 == 47 || b2 == 35) {
                            return _skipColon2(true);
                        }
                    }
                }
                return _skipColon2(true);
            }
            if (b2 == 47 || b2 == 35) {
                return _skipColon2(true);
            }
        } else {
            if (b3 == 32 || b3 == 9) {
                i3++;
                this._inputPtr = i3;
                b3 = bArr[i3];
            }
            if (b3 != 58) {
                return _skipColon2(false);
            }
            i2 = i3 + 1;
            this._inputPtr = i2;
            b2 = bArr[i2];
            if (b2 <= 32) {
                if (b2 == 32 || b2 == 9) {
                    i2 = i3 + 2;
                    this._inputPtr = i2;
                    b2 = bArr[i2];
                    if (b2 > 32) {
                        if (b2 == 47 || b2 == 35) {
                            return _skipColon2(true);
                        }
                    }
                }
                return _skipColon2(true);
            }
            if (b2 == 47 || b2 == 35) {
                return _skipColon2(true);
            }
        }
        this._inputPtr = i2 + 1;
        return b2;
    }

    private final int _skipColon2(boolean z) {
        while (true) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                _reportInvalidEOF(" within/between " + this._parsingContext.typeDesc() + " entries", null);
                return -1;
            }
            byte[] bArr = this._inputBuffer;
            int i2 = this._inputPtr;
            int i3 = i2 + 1;
            this._inputPtr = i3;
            int i4 = bArr[i2] & 255;
            if (i4 > 32) {
                if (i4 == 47) {
                    _skipComment();
                } else {
                    if (i4 == 35) {
                        if (_skipYAMLComment()) {
                            continue;
                        } else {
                            i4 = 35;
                        }
                    }
                    if (z) {
                        return i4;
                    }
                    if (i4 != 58) {
                        _reportUnexpectedChar(i4, "was expecting a colon to separate field name and value");
                    }
                    z = true;
                }
            } else if (i4 != 32) {
                if (i4 == 10) {
                    this._currInputRow++;
                    this._currInputRowStart = i3;
                } else if (i4 == 13) {
                    _skipCR();
                } else if (i4 != 9) {
                    _throwInvalidSpace(i4);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001b, code lost:
    
        if (r2 != 35) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int _skipColonFast(int r10) {
        /*
            r9 = this;
            byte[] r0 = r9._inputBuffer
            r1 = r0[r10]
            int r2 = r10 + 1
            r3 = 9
            r4 = 35
            r5 = 47
            r6 = 32
            r7 = 1
            r8 = 58
            if (r1 != r8) goto L38
            int r1 = r10 + 2
            r2 = r0[r2]
            if (r2 <= r6) goto L1e
            if (r2 == r5) goto L2f
            if (r2 != r4) goto L5f
            goto L2f
        L1e:
            if (r2 == r6) goto L22
            if (r2 != r3) goto L2f
        L22:
            int r10 = r10 + 3
            r2 = r0[r1]
            if (r2 <= r6) goto L2e
            if (r2 == r5) goto L2e
            if (r2 == r4) goto L2e
        L2c:
            r1 = r10
            goto L5f
        L2e:
            r1 = r10
        L2f:
            int r1 = r1 + (-1)
            r9._inputPtr = r1
            int r9 = r9._skipColon2(r7)
            return r9
        L38:
            if (r1 == r6) goto L3c
            if (r1 != r3) goto L41
        L3c:
            int r10 = r10 + 2
            r1 = r0[r2]
            r2 = r10
        L41:
            if (r1 != r8) goto L6c
            int r1 = r2 + 1
            r10 = r0[r2]
            if (r10 <= r6) goto L50
            if (r10 == r5) goto L63
            if (r10 != r4) goto L4e
            goto L63
        L4e:
            r2 = r10
            goto L5f
        L50:
            if (r10 == r6) goto L54
            if (r10 != r3) goto L63
        L54:
            int r10 = r2 + 2
            r2 = r0[r1]
            if (r2 <= r6) goto L62
            if (r2 == r5) goto L62
            if (r2 == r4) goto L62
            goto L2c
        L5f:
            r9._inputPtr = r1
            return r2
        L62:
            r1 = r10
        L63:
            int r1 = r1 + (-1)
            r9._inputPtr = r1
            int r9 = r9._skipColon2(r7)
            return r9
        L6c:
            int r2 = r2 + (-1)
            r9._inputPtr = r2
            r10 = 0
            int r9 = r9._skipColon2(r10)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.UTF8StreamJsonParser._skipColonFast(int):int");
    }

    private final void _skipComment() {
        if ((this._features & FEAT_MASK_ALLOW_JAVA_COMMENTS) == 0) {
            _reportUnexpectedChar(47, "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_COMMENTS' not enabled for parser)");
        }
        if (this._inputPtr >= this._inputEnd && !_loadMore()) {
            _reportInvalidEOF(" in a comment", null);
        }
        byte[] bArr = this._inputBuffer;
        int i2 = this._inputPtr;
        this._inputPtr = i2 + 1;
        int i3 = bArr[i2] & 255;
        if (i3 == 47) {
            _skipLine();
        } else if (i3 == 42) {
            _skipCComment();
        } else {
            _reportUnexpectedChar(i3, "was expecting either '*' or '/' for a comment");
        }
    }

    private final void _skipLine() {
        int[] inputCodeComment = CharTypes.getInputCodeComment();
        while (true) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                return;
            }
            byte[] bArr = this._inputBuffer;
            int i2 = this._inputPtr;
            int i3 = i2 + 1;
            this._inputPtr = i3;
            int i4 = bArr[i2] & 255;
            int i5 = inputCodeComment[i4];
            if (i5 != 0) {
                if (i5 == 2) {
                    _skipUtf8_2();
                } else if (i5 == 3) {
                    _skipUtf8_3();
                } else if (i5 == 4) {
                    _skipUtf8_4(i4);
                } else if (i5 == 10) {
                    this._currInputRow++;
                    this._currInputRowStart = i3;
                    return;
                } else if (i5 == 13) {
                    _skipCR();
                    return;
                } else if (i5 != 42 && i5 < 0) {
                    _reportInvalidChar(i4);
                }
            }
        }
    }

    private final void _skipUtf8_2() {
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr = this._inputBuffer;
        int i2 = this._inputPtr;
        int i3 = i2 + 1;
        this._inputPtr = i3;
        byte b2 = bArr[i2];
        if ((b2 & 192) != 128) {
            _reportInvalidOther(b2 & 255, i3);
        }
    }

    private final void _skipUtf8_3() {
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr = this._inputBuffer;
        int i2 = this._inputPtr;
        int i3 = i2 + 1;
        this._inputPtr = i3;
        byte b2 = bArr[i2];
        if ((b2 & 192) != 128) {
            _reportInvalidOther(b2 & 255, i3);
        }
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr2 = this._inputBuffer;
        int i4 = this._inputPtr;
        int i5 = i4 + 1;
        this._inputPtr = i5;
        byte b3 = bArr2[i4];
        if ((b3 & 192) != 128) {
            _reportInvalidOther(b3 & 255, i5);
        }
    }

    private final void _skipUtf8_4(int i2) {
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr = this._inputBuffer;
        int i3 = this._inputPtr;
        int i4 = i3 + 1;
        this._inputPtr = i4;
        byte b2 = bArr[i3];
        if ((b2 & 192) != 128) {
            _reportInvalidOther(b2 & 255, i4);
        }
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr2 = this._inputBuffer;
        int i5 = this._inputPtr;
        int i6 = i5 + 1;
        this._inputPtr = i6;
        byte b3 = bArr2[i5];
        if ((b3 & 192) != 128) {
            _reportInvalidOther(b3 & 255, i6);
        }
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr3 = this._inputBuffer;
        int i7 = this._inputPtr;
        int i8 = i7 + 1;
        this._inputPtr = i8;
        byte b4 = bArr3[i7];
        if ((b4 & 192) != 128) {
            _reportInvalidOther(b4 & 255, i8);
        }
    }

    private final int _skipWS() {
        while (true) {
            int i2 = this._inputPtr;
            if (i2 >= this._inputEnd) {
                return _skipWS2();
            }
            byte[] bArr = this._inputBuffer;
            int i3 = i2 + 1;
            this._inputPtr = i3;
            int i4 = bArr[i2] & 255;
            if (i4 > 32) {
                if (i4 != 47 && i4 != 35) {
                    return i4;
                }
                this._inputPtr = i2;
                return _skipWS2();
            }
            if (i4 != 32) {
                if (i4 == 10) {
                    this._currInputRow++;
                    this._currInputRowStart = i3;
                } else if (i4 == 13) {
                    _skipCR();
                } else if (i4 != 9) {
                    _throwInvalidSpace(i4);
                }
            }
        }
    }

    private final int _skipWS2() throws JsonParseException {
        while (true) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                throw _constructError("Unexpected end-of-input within/between " + this._parsingContext.typeDesc() + " entries");
            }
            byte[] bArr = this._inputBuffer;
            int i2 = this._inputPtr;
            int i3 = i2 + 1;
            this._inputPtr = i3;
            int i4 = bArr[i2] & 255;
            if (i4 > 32) {
                if (i4 == 47) {
                    _skipComment();
                } else {
                    if (i4 != 35) {
                        return i4;
                    }
                    if (!_skipYAMLComment()) {
                        return 35;
                    }
                }
            } else if (i4 != 32) {
                if (i4 == 10) {
                    this._currInputRow++;
                    this._currInputRowStart = i3;
                } else if (i4 == 13) {
                    _skipCR();
                } else if (i4 != 9) {
                    _throwInvalidSpace(i4);
                }
            }
        }
    }

    private final int _skipWSOrEnd() {
        if (this._inputPtr >= this._inputEnd && !_loadMore()) {
            _eofAsNextChar();
            return -1;
        }
        byte[] bArr = this._inputBuffer;
        int i2 = this._inputPtr;
        int i3 = i2 + 1;
        this._inputPtr = i3;
        int i4 = bArr[i2] & 255;
        if (i4 > 32) {
            if (i4 != 47 && i4 != 35) {
                return i4;
            }
            this._inputPtr = i2;
            return _skipWSOrEnd2();
        }
        if (i4 != 32) {
            if (i4 == 10) {
                this._currInputRow++;
                this._currInputRowStart = i3;
            } else if (i4 == 13) {
                _skipCR();
            } else if (i4 != 9 && !_isAllowedCtrlCharRS(i4)) {
                _throwInvalidSpace(i4);
            }
        }
        while (true) {
            int i5 = this._inputPtr;
            if (i5 >= this._inputEnd) {
                return _skipWSOrEnd2();
            }
            byte[] bArr2 = this._inputBuffer;
            int i6 = i5 + 1;
            this._inputPtr = i6;
            int i7 = bArr2[i5] & 255;
            if (i7 > 32) {
                if (i7 != 47 && i7 != 35) {
                    return i7;
                }
                this._inputPtr = i5;
                return _skipWSOrEnd2();
            }
            if (i7 != 32) {
                if (i7 == 10) {
                    this._currInputRow++;
                    this._currInputRowStart = i6;
                } else if (i7 == 13) {
                    _skipCR();
                } else if (i7 != 9 && !_isAllowedCtrlCharRS(i7)) {
                    _throwInvalidSpace(i7);
                }
            }
        }
    }

    private final int _skipWSOrEnd2() {
        while (true) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                _eofAsNextChar();
                return -1;
            }
            byte[] bArr = this._inputBuffer;
            int i2 = this._inputPtr;
            int i3 = i2 + 1;
            this._inputPtr = i3;
            int i4 = bArr[i2] & 255;
            if (i4 > 32) {
                if (i4 == 47) {
                    _skipComment();
                } else {
                    if (i4 != 35) {
                        return i4;
                    }
                    if (!_skipYAMLComment()) {
                        return 35;
                    }
                }
            } else if (i4 != 32) {
                if (i4 == 10) {
                    this._currInputRow++;
                    this._currInputRowStart = i3;
                } else if (i4 == 13) {
                    _skipCR();
                } else if (i4 != 9) {
                    _throwInvalidSpace(i4);
                }
            }
        }
    }

    private final boolean _skipYAMLComment() {
        if ((this._features & FEAT_MASK_ALLOW_YAML_COMMENTS) == 0) {
            return false;
        }
        _skipLine();
        return true;
    }

    private final void _updateLocation() {
        this._tokenInputRow = this._currInputRow;
        int i2 = this._inputPtr;
        this._tokenInputTotal = this._currInputProcessed + i2;
        this._tokenInputCol = i2 - this._currInputRowStart;
    }

    private final void _updateNameLocation() {
        this._nameStartRow = this._currInputRow;
        int i2 = this._inputPtr;
        this._nameStartOffset = i2;
        this._nameStartCol = i2 - this._currInputRowStart;
    }

    private final int _verifyNoLeadingZeroes() {
        int i2;
        if ((this._inputPtr >= this._inputEnd && !_loadMore()) || (i2 = this._inputBuffer[this._inputPtr] & 255) < 48 || i2 > 57) {
            return 48;
        }
        if ((this._features & FEAT_MASK_LEADING_ZEROS) == 0) {
            reportInvalidNumber("Leading zeroes not allowed");
        }
        this._inputPtr++;
        if (i2 != 48) {
            return i2;
        }
        do {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                return i2;
            }
            byte[] bArr = this._inputBuffer;
            int i3 = this._inputPtr;
            i2 = bArr[i3] & 255;
            if (i2 < 48 || i2 > 57) {
                return 48;
            }
            this._inputPtr = i3 + 1;
        } while (i2 == 48);
        return i2;
    }

    private final void _verifyRootSpace(int i2) {
        int i3 = this._inputPtr;
        int i4 = i3 + 1;
        this._inputPtr = i4;
        if (i2 != 9) {
            if (i2 == 10) {
                this._currInputRow++;
                this._currInputRowStart = i4;
            } else if (i2 == 13) {
                this._inputPtr = i3;
            } else if (i2 != 32) {
                _reportMissingRootWS(i2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.String addName(int[] r18, int r19, int r20) throws com.fasterxml.jackson.core.exc.StreamConstraintsException {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.UTF8StreamJsonParser.addName(int[], int, int):java.lang.String");
    }

    private final String findName(int i2, int i3, int i4, int i5) {
        ByteQuadsCanonicalizer byteQuadsCanonicalizer = this._symbols;
        int i_padLastQuad = _padLastQuad(i4, i5);
        String strFindName = byteQuadsCanonicalizer.findName(i2, i3, i_padLastQuad);
        if (strFindName != null) {
            return strFindName;
        }
        int[] iArr = this._quadBuffer;
        iArr[0] = i2;
        iArr[1] = i3;
        iArr[2] = _padLastQuad(i_padLastQuad, i5);
        return addName(iArr, 3, i5);
    }

    private int nextByte() {
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr = this._inputBuffer;
        int i2 = this._inputPtr;
        this._inputPtr = i2 + 1;
        return bArr[i2] & 255;
    }

    private final String parseName(int i2, int i3, int i4, int i5) {
        int[] iArr = this._quadBuffer;
        iArr[0] = i2;
        return parseEscapedName(iArr, 1, i3, i4, i5);
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase
    protected void _closeInput() throws IOException {
        if (this._inputStream != null) {
            if (this._ioContext.isResourceManaged() || isEnabled(JsonParser.Feature.AUTO_CLOSE_SOURCE)) {
                this._inputStream.close();
            }
            this._inputStream = null;
        }
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase
    protected JsonLocation _currentLocationMinusOne() {
        int i2 = this._inputPtr - 1;
        return new JsonLocation(_contentReference(), this._currInputProcessed + i2, -1L, this._currInputRow, (i2 - this._currInputRowStart) + 1);
    }

    protected final byte[] _decodeBase64(Base64Variant base64Variant) {
        ByteArrayBuilder byteArrayBuilder_getByteArrayBuilder = _getByteArrayBuilder();
        while (true) {
            if (this._inputPtr >= this._inputEnd) {
                _loadMoreGuaranteed();
            }
            byte[] bArr = this._inputBuffer;
            int i2 = this._inputPtr;
            this._inputPtr = i2 + 1;
            int i3 = bArr[i2] & 255;
            if (i3 > 32) {
                int iDecodeBase64Char = base64Variant.decodeBase64Char(i3);
                if (iDecodeBase64Char < 0) {
                    if (i3 == 34) {
                        return byteArrayBuilder_getByteArrayBuilder.toByteArray();
                    }
                    iDecodeBase64Char = _decodeBase64Escape(base64Variant, i3, 0);
                    if (iDecodeBase64Char < 0) {
                        continue;
                    }
                }
                if (this._inputPtr >= this._inputEnd) {
                    _loadMoreGuaranteed();
                }
                byte[] bArr2 = this._inputBuffer;
                int i4 = this._inputPtr;
                this._inputPtr = i4 + 1;
                int i5 = bArr2[i4] & 255;
                int iDecodeBase64Char2 = base64Variant.decodeBase64Char(i5);
                if (iDecodeBase64Char2 < 0) {
                    iDecodeBase64Char2 = _decodeBase64Escape(base64Variant, i5, 1);
                }
                int i6 = iDecodeBase64Char << 6;
                if (this._inputPtr >= this._inputEnd) {
                    _loadMoreGuaranteed();
                }
                int i7 = i6 | iDecodeBase64Char2;
                byte[] bArr3 = this._inputBuffer;
                int i8 = this._inputPtr;
                this._inputPtr = i8 + 1;
                int i9 = bArr3[i8] & 255;
                int iDecodeBase64Char3 = base64Variant.decodeBase64Char(i9);
                if (iDecodeBase64Char3 < 0) {
                    if (iDecodeBase64Char3 != -2) {
                        if (i9 == 34) {
                            byteArrayBuilder_getByteArrayBuilder.append(i7 >> 4);
                            if (base64Variant.requiresPaddingOnRead()) {
                                this._inputPtr--;
                                _handleBase64MissingPadding(base64Variant);
                            }
                            return byteArrayBuilder_getByteArrayBuilder.toByteArray();
                        }
                        iDecodeBase64Char3 = _decodeBase64Escape(base64Variant, i9, 2);
                    }
                    if (iDecodeBase64Char3 == -2) {
                        if (this._inputPtr >= this._inputEnd) {
                            _loadMoreGuaranteed();
                        }
                        byte[] bArr4 = this._inputBuffer;
                        int i10 = this._inputPtr;
                        this._inputPtr = i10 + 1;
                        int i11 = bArr4[i10] & 255;
                        if (!base64Variant.usesPaddingChar(i11) && _decodeBase64Escape(base64Variant, i11, 3) != -2) {
                            throw reportInvalidBase64Char(base64Variant, i11, 3, a.a(base64Variant));
                        }
                        byteArrayBuilder_getByteArrayBuilder.append(i7 >> 4);
                    }
                }
                int i12 = i7 << 6;
                if (this._inputPtr >= this._inputEnd) {
                    _loadMoreGuaranteed();
                }
                int i13 = i12 | iDecodeBase64Char3;
                byte[] bArr5 = this._inputBuffer;
                int i14 = this._inputPtr;
                this._inputPtr = i14 + 1;
                int i15 = bArr5[i14] & 255;
                int iDecodeBase64Char4 = base64Variant.decodeBase64Char(i15);
                if (iDecodeBase64Char4 < 0) {
                    if (iDecodeBase64Char4 != -2) {
                        if (i15 == 34) {
                            byteArrayBuilder_getByteArrayBuilder.appendTwoBytes(i13 >> 2);
                            if (base64Variant.requiresPaddingOnRead()) {
                                this._inputPtr--;
                                _handleBase64MissingPadding(base64Variant);
                            }
                            return byteArrayBuilder_getByteArrayBuilder.toByteArray();
                        }
                        iDecodeBase64Char4 = _decodeBase64Escape(base64Variant, i15, 3);
                    }
                    if (iDecodeBase64Char4 == -2) {
                        byteArrayBuilder_getByteArrayBuilder.appendTwoBytes(i13 >> 2);
                    }
                }
                byteArrayBuilder_getByteArrayBuilder.appendThreeBytes((i13 << 6) | iDecodeBase64Char4);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected int _decodeCharForError(int r7) {
        /*
            r6 = this;
            r0 = r7 & 255(0xff, float:3.57E-43)
            r1 = 127(0x7f, float:1.78E-43)
            if (r0 <= r1) goto L61
            r1 = r7 & 224(0xe0, float:3.14E-43)
            r2 = 2
            r3 = 1
            r4 = 192(0xc0, float:2.69E-43)
            if (r1 != r4) goto L12
            r0 = r7 & 31
        L10:
            r7 = r3
            goto L2a
        L12:
            r1 = r7 & 240(0xf0, float:3.36E-43)
            r4 = 224(0xe0, float:3.14E-43)
            if (r1 != r4) goto L1c
            r0 = r7 & 15
            r7 = r2
            goto L2a
        L1c:
            r1 = r7 & 248(0xf8, float:3.48E-43)
            r4 = 240(0xf0, float:3.36E-43)
            if (r1 != r4) goto L26
            r0 = r7 & 7
            r7 = 3
            goto L2a
        L26:
            r6._reportInvalidInitial(r0)
            goto L10
        L2a:
            int r1 = r6.nextByte()
            r4 = r1 & 192(0xc0, float:2.69E-43)
            r5 = 128(0x80, float:1.8E-43)
            if (r4 == r5) goto L37
            r6._reportInvalidOther(r1)
        L37:
            int r0 = r0 << 6
            r1 = r1 & 63
            r0 = r0 | r1
            if (r7 <= r3) goto L61
            int r1 = r6.nextByte()
            r3 = r1 & 192(0xc0, float:2.69E-43)
            if (r3 == r5) goto L49
            r6._reportInvalidOther(r1)
        L49:
            int r0 = r0 << 6
            r1 = r1 & 63
            r0 = r0 | r1
            if (r7 <= r2) goto L61
            int r7 = r6.nextByte()
            r1 = r7 & 192(0xc0, float:2.69E-43)
            if (r1 == r5) goto L5b
            r6._reportInvalidOther(r7)
        L5b:
            int r6 = r0 << 6
            r7 = r7 & 63
            r6 = r6 | r7
            return r6
        L61:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.UTF8StreamJsonParser._decodeCharForError(int):int");
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase
    protected char _decodeEscaped() {
        if (this._inputPtr >= this._inputEnd && !_loadMore()) {
            _reportInvalidEOF(" in character escape sequence", JsonToken.VALUE_STRING);
        }
        byte[] bArr = this._inputBuffer;
        int i2 = this._inputPtr;
        this._inputPtr = i2 + 1;
        byte b2 = bArr[i2];
        if (b2 == 34 || b2 == 47 || b2 == 92) {
            return (char) b2;
        }
        if (b2 == 98) {
            return '\b';
        }
        if (b2 == 102) {
            return '\f';
        }
        if (b2 == 110) {
            return '\n';
        }
        if (b2 == 114) {
            return '\r';
        }
        if (b2 == 116) {
            return '\t';
        }
        if (b2 != 117) {
            char c_decodeCharForError = (char) _decodeCharForError(b2);
            _handleUnrecognizedCharacterEscape(c_decodeCharForError);
            return c_decodeCharForError;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < 4; i4++) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                _reportInvalidEOF(" in character escape sequence", JsonToken.VALUE_STRING);
            }
            byte[] bArr2 = this._inputBuffer;
            int i5 = this._inputPtr;
            this._inputPtr = i5 + 1;
            byte b3 = bArr2[i5];
            int iCharToHex = CharTypes.charToHex(b3);
            if (iCharToHex < 0) {
                _reportUnexpectedChar(b3 & 255, "expected a hex-digit for character escape sequence");
            }
            i3 = (i3 << 4) | iCharToHex;
        }
        return (char) i3;
    }

    protected String _finishAndReturnString() {
        int i2 = this._inputPtr;
        if (i2 >= this._inputEnd) {
            _loadMoreGuaranteed();
            i2 = this._inputPtr;
        }
        char[] cArrEmptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        int[] iArr = INPUT_CODES_UTF8;
        int iMin = Math.min(this._inputEnd, cArrEmptyAndGetCurrentSegment.length + i2);
        byte[] bArr = this._inputBuffer;
        int i3 = 0;
        while (true) {
            if (i2 >= iMin) {
                break;
            }
            int i4 = bArr[i2] & 255;
            if (iArr[i4] == 0) {
                i2++;
                cArrEmptyAndGetCurrentSegment[i3] = (char) i4;
                i3++;
            } else if (i4 == 34) {
                this._inputPtr = i2 + 1;
                return this._textBuffer.setCurrentAndReturn(i3);
            }
        }
        this._inputPtr = i2;
        _finishString2(cArrEmptyAndGetCurrentSegment, i3);
        return this._textBuffer.contentsAsString();
    }

    protected void _finishString() {
        int i2 = this._inputPtr;
        if (i2 >= this._inputEnd) {
            _loadMoreGuaranteed();
            i2 = this._inputPtr;
        }
        char[] cArrEmptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        int[] iArr = INPUT_CODES_UTF8;
        int iMin = Math.min(this._inputEnd, cArrEmptyAndGetCurrentSegment.length + i2);
        byte[] bArr = this._inputBuffer;
        int i3 = 0;
        while (true) {
            if (i2 >= iMin) {
                break;
            }
            int i4 = bArr[i2] & 255;
            if (iArr[i4] == 0) {
                i2++;
                cArrEmptyAndGetCurrentSegment[i3] = (char) i4;
                i3++;
            } else if (i4 == 34) {
                this._inputPtr = i2 + 1;
                this._textBuffer.setCurrentLength(i3);
                return;
            }
        }
        this._inputPtr = i2;
        _finishString2(cArrEmptyAndGetCurrentSegment, i3);
    }

    protected final String _getText2(JsonToken jsonToken) {
        if (jsonToken == null) {
            return null;
        }
        int iId = jsonToken.id();
        return iId != 5 ? (iId == 6 || iId == 7 || iId == 8) ? this._textBuffer.contentsAsString() : jsonToken.asString() : this._parsingContext.getCurrentName();
    }

    protected JsonToken _handleApos() {
        char[] cArrEmptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        int[] iArr = INPUT_CODES_UTF8;
        byte[] bArr = this._inputBuffer;
        int i2 = 0;
        while (true) {
            if (this._inputPtr >= this._inputEnd) {
                _loadMoreGuaranteed();
            }
            if (i2 >= cArrEmptyAndGetCurrentSegment.length) {
                cArrEmptyAndGetCurrentSegment = this._textBuffer.finishCurrentSegment();
                i2 = 0;
            }
            int i3 = this._inputEnd;
            int iAddOverflowSafe = InternalJacksonUtil.addOverflowSafe(this._inputPtr, cArrEmptyAndGetCurrentSegment.length - i2);
            if (iAddOverflowSafe < i3) {
                i3 = iAddOverflowSafe;
            }
            while (true) {
                int i4 = this._inputPtr;
                if (i4 < i3) {
                    int i5 = i4 + 1;
                    this._inputPtr = i5;
                    int i_decodeEscaped = bArr[i4] & 255;
                    if (i_decodeEscaped == 39) {
                        this._textBuffer.setCurrentLength(i2);
                        return JsonToken.VALUE_STRING;
                    }
                    int i6 = iArr[i_decodeEscaped];
                    if (i6 == 0 || i_decodeEscaped == 34) {
                        cArrEmptyAndGetCurrentSegment[i2] = (char) i_decodeEscaped;
                        i2++;
                    } else {
                        if (i6 == 1) {
                            i_decodeEscaped = _decodeEscaped();
                        } else if (i6 == 2) {
                            i_decodeEscaped = _decodeUtf8_2(i_decodeEscaped);
                        } else if (i6 == 3) {
                            i_decodeEscaped = this._inputEnd - i5 >= 2 ? _decodeUtf8_3fast(i_decodeEscaped) : _decodeUtf8_3(i_decodeEscaped);
                        } else if (i6 != 4) {
                            if (i_decodeEscaped < 32) {
                                _throwUnquotedSpace(i_decodeEscaped, "string value");
                            }
                            _reportInvalidChar(i_decodeEscaped);
                        } else {
                            int i7 = i2 + 1;
                            int i_decodeUtf8_4 = _decodeUtf8_4(i_decodeEscaped);
                            cArrEmptyAndGetCurrentSegment[i2] = (char) ((i_decodeUtf8_4 >> 10) | 55296);
                            if (i7 >= cArrEmptyAndGetCurrentSegment.length) {
                                cArrEmptyAndGetCurrentSegment = this._textBuffer.finishCurrentSegment();
                                i2 = 0;
                            } else {
                                i2 = i7;
                            }
                            i_decodeEscaped = 56320 | (i_decodeUtf8_4 & 1023);
                        }
                        if (i2 >= cArrEmptyAndGetCurrentSegment.length) {
                            cArrEmptyAndGetCurrentSegment = this._textBuffer.finishCurrentSegment();
                            i2 = 0;
                        }
                        cArrEmptyAndGetCurrentSegment[i2] = (char) i_decodeEscaped;
                        i2++;
                    }
                }
            }
        }
    }

    protected JsonToken _handleInvalidNumberStart(int i2, boolean z, boolean z2) throws JsonParseException {
        String str;
        while (i2 == 73) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                _reportInvalidEOFInValue(JsonToken.VALUE_NUMBER_FLOAT);
            }
            byte[] bArr = this._inputBuffer;
            int i3 = this._inputPtr;
            this._inputPtr = i3 + 1;
            i2 = bArr[i3];
            if (i2 != 78) {
                if (i2 != 110) {
                    break;
                }
                str = true != z ? "+Infinity" : "-Infinity";
            } else {
                str = true != z ? "+INF" : "-INF";
            }
            _matchToken(str, 3);
            if ((this._features & FEAT_MASK_NON_NUM_NUMBERS) != 0) {
                return resetAsNaN(str, true != z ? Double.POSITIVE_INFINITY : Double.NEGATIVE_INFINITY);
            }
            _reportError("Non-standard token '%s': enable `JsonReadFeature.ALLOW_NON_NUMERIC_NUMBERS` to allow", str);
        }
        if (!isEnabled(JsonReadFeature.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS.mappedFeature()) && !z) {
            _reportUnexpectedNumberChar(43, "JSON spec does not allow numbers to have plus signs: enable `JsonReadFeature.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS` to allow");
        }
        _reportUnexpectedNumberChar(i2, true != z ? "expected digit (0-9) for valid numeric value" : "expected digit (0-9) to follow minus sign, for valid numeric value");
        return null;
    }

    protected String _handleOddName(int i2) throws StreamConstraintsException {
        if (i2 == 39) {
            if ((this._features & FEAT_MASK_ALLOW_SINGLE_QUOTES) != 0) {
                return _parseAposName();
            }
            i2 = 39;
        }
        if ((this._features & FEAT_MASK_ALLOW_UNQUOTED_NAMES) == 0) {
            _reportUnexpectedChar((char) _decodeCharForError(i2), "was expecting double-quote to start field name");
        }
        int[] inputCodeUtf8JsNames = CharTypes.getInputCodeUtf8JsNames();
        if (inputCodeUtf8JsNames[i2] != 0) {
            _reportUnexpectedChar(i2, "was expecting either valid name character (for unquoted name) or double-quote (for quoted) to start field name");
        }
        int[] iArr_growNameDecodeBuffer = this._quadBuffer;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            if (i3 < 4) {
                i2 |= i5 << 8;
                i3++;
            } else {
                int length = iArr_growNameDecodeBuffer.length;
                if (i4 >= length) {
                    iArr_growNameDecodeBuffer = _growNameDecodeBuffer(iArr_growNameDecodeBuffer, length);
                    this._quadBuffer = iArr_growNameDecodeBuffer;
                }
                iArr_growNameDecodeBuffer[i4] = i5;
                i4++;
                i3 = 1;
            }
            i5 = i2;
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                _reportInvalidEOF(" in field name", JsonToken.FIELD_NAME);
            }
            byte[] bArr = this._inputBuffer;
            int i6 = this._inputPtr;
            i2 = bArr[i6] & 255;
            if (inputCodeUtf8JsNames[i2] != 0) {
                break;
            }
            this._inputPtr = i6 + 1;
        }
        if (i3 > 0) {
            int length2 = iArr_growNameDecodeBuffer.length;
            if (i4 >= length2) {
                int[] iArr_growNameDecodeBuffer2 = _growNameDecodeBuffer(iArr_growNameDecodeBuffer, length2);
                this._quadBuffer = iArr_growNameDecodeBuffer2;
                iArr_growNameDecodeBuffer = iArr_growNameDecodeBuffer2;
            }
            iArr_growNameDecodeBuffer[i4] = i5;
            i4++;
        }
        String strFindName = this._symbols.findName(iArr_growNameDecodeBuffer, i4);
        return strFindName == null ? addName(iArr_growNameDecodeBuffer, i4, i3) : strFindName;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001b, code lost:
    
        if (r4 != 44) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0048, code lost:
    
        if (r3._parsingContext.inArray() != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0050, code lost:
    
        if (r3._parsingContext.inRoot() != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0057, code lost:
    
        if ((r3._features & com.fasterxml.jackson.core.json.UTF8StreamJsonParser.FEAT_MASK_ALLOW_MISSING) == 0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0059, code lost:
    
        r3._inputPtr--;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0061, code lost:
    
        return com.fasterxml.jackson.core.JsonToken.VALUE_NULL;
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected com.fasterxml.jackson.core.JsonToken _handleUnexpectedValue(int r4) {
        /*
            r3 = this;
            r0 = 39
            if (r4 == r0) goto L9a
            r0 = 73
            r1 = 1
            if (r4 == r0) goto L81
            r0 = 78
            if (r4 == r0) goto L68
            r0 = 93
            if (r4 == r0) goto L42
            r0 = 125(0x7d, float:1.75E-43)
            if (r4 == r0) goto L62
            r0 = 43
            if (r4 == r0) goto L1f
            r0 = 44
            if (r4 == r0) goto L4a
            goto La6
        L1f:
            int r4 = r3._inputPtr
            int r0 = r3._inputEnd
            if (r4 < r0) goto L30
            boolean r4 = r3._loadMore()
            if (r4 != 0) goto L30
            com.fasterxml.jackson.core.JsonToken r4 = com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_INT
            r3._reportInvalidEOFInValue(r4)
        L30:
            byte[] r4 = r3._inputBuffer
            int r0 = r3._inputPtr
            int r2 = r0 + 1
            r3._inputPtr = r2
            r4 = r4[r0]
            r4 = r4 & 255(0xff, float:3.57E-43)
            r0 = 0
            com.fasterxml.jackson.core.JsonToken r3 = r3._handleInvalidNumberStart(r4, r0, r1)
            return r3
        L42:
            com.fasterxml.jackson.core.json.JsonReadContext r0 = r3._parsingContext
            boolean r0 = r0.inArray()
            if (r0 == 0) goto La6
        L4a:
            com.fasterxml.jackson.core.json.JsonReadContext r0 = r3._parsingContext
            boolean r0 = r0.inRoot()
            if (r0 != 0) goto L62
            int r0 = r3._features
            int r1 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.FEAT_MASK_ALLOW_MISSING
            r0 = r0 & r1
            if (r0 == 0) goto L62
            int r4 = r3._inputPtr
            int r4 = r4 + (-1)
            r3._inputPtr = r4
            com.fasterxml.jackson.core.JsonToken r3 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL
            return r3
        L62:
            java.lang.String r0 = "expected a value"
            r3._reportUnexpectedChar(r4, r0)
            goto L9a
        L68:
            java.lang.String r0 = "NaN"
            r3._matchToken(r0, r1)
            int r1 = r3._features
            int r2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.FEAT_MASK_NON_NUM_NUMBERS
            r1 = r1 & r2
            if (r1 == 0) goto L7b
            r1 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            com.fasterxml.jackson.core.JsonToken r3 = r3.resetAsNaN(r0, r1)
            return r3
        L7b:
            java.lang.String r0 = "Non-standard token 'NaN': enable `JsonReadFeature.ALLOW_NON_NUMERIC_NUMBERS` to allow"
            r3._reportError(r0)
            goto La6
        L81:
            java.lang.String r0 = "Infinity"
            r3._matchToken(r0, r1)
            int r1 = r3._features
            int r2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.FEAT_MASK_NON_NUM_NUMBERS
            r1 = r1 & r2
            if (r1 == 0) goto L94
            r1 = 9218868437227405312(0x7ff0000000000000, double:Infinity)
            com.fasterxml.jackson.core.JsonToken r3 = r3.resetAsNaN(r0, r1)
            return r3
        L94:
            java.lang.String r0 = "Non-standard token 'Infinity': enable `JsonReadFeature.ALLOW_NON_NUMERIC_NUMBERS` to allow"
            r3._reportError(r0)
            goto La6
        L9a:
            int r0 = r3._features
            int r1 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.FEAT_MASK_ALLOW_SINGLE_QUOTES
            r0 = r0 & r1
            if (r0 == 0) goto La6
            com.fasterxml.jackson.core.JsonToken r3 = r3._handleApos()
            return r3
        La6:
            boolean r0 = java.lang.Character.isJavaIdentifierStart(r4)
            if (r0 == 0) goto Lc0
            char r0 = (char) r4
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = r3._validJsonTokenList()
            r3._reportInvalidToken(r0, r1)
        Lc0:
            java.lang.String r0 = r3._validJsonValueList()
            java.lang.String r1 = "expected a valid value "
            java.lang.String r0 = r1.concat(r0)
            r3._reportUnexpectedChar(r4, r0)
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.UTF8StreamJsonParser._handleUnexpectedValue(int):com.fasterxml.jackson.core.JsonToken");
    }

    protected final boolean _loadMore() throws IOException {
        int length;
        if (this._inputStream != null && (length = this._inputBuffer.length) != 0) {
            int i2 = this._inputEnd;
            long j2 = this._currInputProcessed + i2;
            this._currInputProcessed = j2;
            this._currInputRowStart -= i2;
            this._streamReadConstraints.validateDocumentLength(j2);
            int i3 = this._inputStream.read(this._inputBuffer, 0, length);
            if (i3 > 0) {
                this._nameStartOffset -= i2;
                this._inputPtr = 0;
                this._inputEnd = i3;
                return true;
            }
            this._inputEnd = 0;
            this._inputPtr = 0;
            _closeInput();
            if (i3 == 0) {
                throw new IOException("InputStream.read() returned 0 characters when trying to read " + this._inputBuffer.length + " bytes");
            }
        }
        return false;
    }

    protected void _loadMoreGuaranteed() {
        if (_loadMore()) {
            return;
        }
        _reportInvalidEOF();
    }

    protected final void _matchFalse() {
        int i2;
        int i3 = this._inputPtr;
        if (i3 + 4 < this._inputEnd) {
            byte[] bArr = this._inputBuffer;
            int i4 = i3 + 1;
            if (bArr[i3] == 97) {
                int i5 = i3 + 2;
                if (bArr[i4] == 108) {
                    int i6 = i3 + 3;
                    if (bArr[i5] == 115) {
                        int i7 = i3 + 4;
                        if (bArr[i6] == 101 && ((i2 = bArr[i7] & 255) < 48 || (i2 | 32) == 125)) {
                            this._inputPtr = i7;
                            return;
                        }
                    }
                }
            }
        }
        _matchToken2(CredentialEntry.FALSE_STRING, 1);
    }

    protected final void _matchNull() {
        int i2;
        int i3 = this._inputPtr;
        if (i3 + 3 < this._inputEnd) {
            byte[] bArr = this._inputBuffer;
            int i4 = i3 + 1;
            if (bArr[i3] == 117) {
                int i5 = i3 + 2;
                if (bArr[i4] == 108) {
                    int i6 = i3 + 3;
                    if (bArr[i5] == 108 && ((i2 = bArr[i6] & 255) < 48 || (i2 | 32) == 125)) {
                        this._inputPtr = i6;
                        return;
                    }
                }
            }
        }
        _matchToken2("null", 1);
    }

    protected final void _matchToken(String str, int i2) {
        int i3;
        int i4 = this._inputPtr;
        int length = str.length();
        if (i4 + length >= this._inputEnd) {
            _matchToken2(str, i2);
            return;
        }
        do {
            if (this._inputBuffer[this._inputPtr] != str.charAt(i2)) {
                _reportInvalidToken(str.substring(0, i2));
            }
            i3 = this._inputPtr + 1;
            this._inputPtr = i3;
            i2++;
        } while (i2 < length);
        int i5 = this._inputBuffer[i3] & 255;
        if (i5 < 48 || i5 == 93 || i5 == 125) {
            return;
        }
        _checkMatchEnd(str, i2, i5);
    }

    protected final void _matchTrue() {
        int i2;
        int i3 = this._inputPtr;
        if (i3 + 3 < this._inputEnd) {
            byte[] bArr = this._inputBuffer;
            int i4 = i3 + 1;
            if (bArr[i3] == 114) {
                int i5 = i3 + 2;
                if (bArr[i4] == 117) {
                    int i6 = i3 + 3;
                    if (bArr[i5] == 101 && ((i2 = bArr[i6] & 255) < 48 || (i2 | 32) == 125)) {
                        this._inputPtr = i6;
                        return;
                    }
                }
            }
        }
        _matchToken2(CredentialEntry.TRUE_STRING, 1);
    }

    protected String _parseAposName() throws StreamConstraintsException {
        if (this._inputPtr >= this._inputEnd && !_loadMore()) {
            _reportInvalidEOF(": was expecting closing ''' for field name", JsonToken.FIELD_NAME);
        }
        byte[] bArr = this._inputBuffer;
        int i2 = this._inputPtr;
        this._inputPtr = i2 + 1;
        int i_decodeEscaped = bArr[i2] & 255;
        if (i_decodeEscaped == 39) {
            return "";
        }
        int[] iArr_growNameDecodeBuffer = this._quadBuffer;
        int[] iArr = INPUT_CODES_LATIN1;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i_decodeEscaped != 39) {
            if (iArr[i_decodeEscaped] != 0 && i_decodeEscaped != 34) {
                if (i_decodeEscaped != 92) {
                    _throwUnquotedSpace(i_decodeEscaped, HintConstants.AUTOFILL_HINT_NAME);
                } else {
                    i_decodeEscaped = _decodeEscaped();
                }
                if (i_decodeEscaped > 127) {
                    if (i3 >= 4) {
                        int i6 = i5 + 1;
                        int length = iArr_growNameDecodeBuffer.length;
                        if (i5 >= length) {
                            iArr_growNameDecodeBuffer = _growNameDecodeBuffer(iArr_growNameDecodeBuffer, length);
                            this._quadBuffer = iArr_growNameDecodeBuffer;
                        }
                        iArr_growNameDecodeBuffer[i5] = i4;
                        i4 = 0;
                        i5 = i6;
                        i3 = 0;
                    }
                    i3++;
                    int i7 = i4 << 8;
                    if (i_decodeEscaped < 2048) {
                        i4 = i7 | (i_decodeEscaped >> 6) | 192;
                    } else {
                        int i8 = i7 | (i_decodeEscaped >> 12) | 224;
                        if (i3 >= 4) {
                            int length2 = iArr_growNameDecodeBuffer.length;
                            if (i5 >= length2) {
                                iArr_growNameDecodeBuffer = _growNameDecodeBuffer(iArr_growNameDecodeBuffer, length2);
                                this._quadBuffer = iArr_growNameDecodeBuffer;
                            }
                            iArr_growNameDecodeBuffer[i5] = i8;
                            i8 = 0;
                            i5++;
                            i3 = 0;
                        }
                        i4 = (i8 << 8) | ((i_decodeEscaped >> 6) & 63) | 128;
                        i3++;
                    }
                    i_decodeEscaped = (i_decodeEscaped & 63) | 128;
                }
            }
            if (i3 < 4) {
                i_decodeEscaped |= i4 << 8;
                i3++;
            } else {
                int length3 = iArr_growNameDecodeBuffer.length;
                if (i5 >= length3) {
                    iArr_growNameDecodeBuffer = _growNameDecodeBuffer(iArr_growNameDecodeBuffer, length3);
                    this._quadBuffer = iArr_growNameDecodeBuffer;
                }
                iArr_growNameDecodeBuffer[i5] = i4;
                i5++;
                i3 = 1;
            }
            i4 = i_decodeEscaped;
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                _reportInvalidEOF(" in field name", JsonToken.FIELD_NAME);
            }
            byte[] bArr2 = this._inputBuffer;
            int i9 = this._inputPtr;
            this._inputPtr = i9 + 1;
            i_decodeEscaped = bArr2[i9] & 255;
        }
        if (i3 > 0) {
            int i10 = i5 + 1;
            int length4 = iArr_growNameDecodeBuffer.length;
            if (i5 >= length4) {
                int[] iArr_growNameDecodeBuffer2 = _growNameDecodeBuffer(iArr_growNameDecodeBuffer, length4);
                this._quadBuffer = iArr_growNameDecodeBuffer2;
                iArr_growNameDecodeBuffer = iArr_growNameDecodeBuffer2;
            }
            iArr_growNameDecodeBuffer[i5] = _padLastQuad(i4, i3);
            i5 = i10;
        }
        String strFindName = this._symbols.findName(iArr_growNameDecodeBuffer, i5);
        return strFindName == null ? addName(iArr_growNameDecodeBuffer, i5, i3) : strFindName;
    }

    protected final JsonToken _parseFloatThatStartsWithPeriod(boolean z, boolean z2) {
        if (!isEnabled(JsonReadFeature.ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS.mappedFeature())) {
            return _handleUnexpectedValue(46);
        }
        char[] cArrEmptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        int i2 = 0;
        if (z) {
            cArrEmptyAndGetCurrentSegment[0] = '-';
            i2 = 1;
        }
        return _parseFloat(cArrEmptyAndGetCurrentSegment, i2, 46, z, 0);
    }

    protected final String _parseName(int i2) {
        if (i2 != 34) {
            return _handleOddName(i2);
        }
        int i3 = this._inputPtr;
        if (i3 + 13 > this._inputEnd) {
            return slowParseName();
        }
        byte[] bArr = this._inputBuffer;
        int i4 = i3 + 1;
        int[] iArr = INPUT_CODES_LATIN1;
        this._inputPtr = i4;
        int i5 = bArr[i3] & 255;
        if (iArr[i5] != 0) {
            return i5 == 34 ? "" : parseName(0, i5, 0);
        }
        int i6 = i3 + 2;
        this._inputPtr = i6;
        int i7 = bArr[i4] & 255;
        if (iArr[i7] != 0) {
            return i7 == 34 ? findName(i5, 1) : parseName(i5, i7, 1);
        }
        int i8 = i7 | (i5 << 8);
        int i9 = i3 + 3;
        this._inputPtr = i9;
        int i10 = bArr[i6] & 255;
        if (iArr[i10] != 0) {
            return i10 == 34 ? findName(i8, 2) : parseName(i8, i10, 2);
        }
        int i11 = (i8 << 8) | i10;
        int i12 = i3 + 4;
        this._inputPtr = i12;
        int i13 = bArr[i9] & 255;
        if (iArr[i13] != 0) {
            return i13 == 34 ? findName(i11, 3) : parseName(i11, i13, 3);
        }
        int i14 = (i11 << 8) | i13;
        this._inputPtr = i3 + 5;
        int i15 = bArr[i12] & 255;
        if (iArr[i15] != 0) {
            return i15 == 34 ? findName(i14, 4) : parseName(i14, i15, 4);
        }
        this._quad1 = i14;
        return parseMediumName(i15);
    }

    protected JsonToken _parseUnsignedNumber(int i2) {
        int i3;
        int i4;
        char[] cArrEmptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        if (i2 == 48) {
            i2 = _verifyNoLeadingZeroes();
        }
        cArrEmptyAndGetCurrentSegment[0] = (char) i2;
        int iMin = Math.min(this._inputEnd, (this._inputPtr + cArrEmptyAndGetCurrentSegment.length) - 1);
        int i5 = 1;
        int i6 = 1;
        while (true) {
            i3 = this._inputPtr;
            if (i3 >= iMin) {
                return _parseNumber2(cArrEmptyAndGetCurrentSegment, i5, false, i6);
            }
            byte[] bArr = this._inputBuffer;
            this._inputPtr = i3 + 1;
            i4 = bArr[i3] & 255;
            if (i4 < 48 || i4 > 57) {
                break;
            }
            i6++;
            cArrEmptyAndGetCurrentSegment[i5] = (char) i4;
            i5++;
        }
        if (i4 == 46 || (i4 | 32) == 101) {
            return _parseFloat(cArrEmptyAndGetCurrentSegment, i5, i4, false, i6);
        }
        this._inputPtr = i3;
        this._textBuffer.setCurrentLength(i5);
        if (this._parsingContext.inRoot()) {
            _verifyRootSpace(i4);
        }
        return resetInt(false, i6);
    }

    protected int _readBinary(Base64Variant base64Variant, OutputStream outputStream, byte[] bArr) throws IOException {
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (this._inputPtr >= this._inputEnd) {
                _loadMoreGuaranteed();
            }
            byte[] bArr2 = this._inputBuffer;
            int i4 = this._inputPtr;
            this._inputPtr = i4 + 1;
            int i5 = bArr2[i4] & 255;
            if (i5 > 32) {
                int iDecodeBase64Char = base64Variant.decodeBase64Char(i5);
                if (iDecodeBase64Char < 0) {
                    if (i5 == 34) {
                        break;
                    }
                    iDecodeBase64Char = _decodeBase64Escape(base64Variant, i5, 0);
                    if (iDecodeBase64Char < 0) {
                        continue;
                    }
                }
                if (i2 > bArr.length - 3) {
                    i3 += i2;
                    outputStream.write(bArr, 0, i2);
                    i2 = 0;
                }
                if (this._inputPtr >= this._inputEnd) {
                    _loadMoreGuaranteed();
                }
                byte[] bArr3 = this._inputBuffer;
                int i6 = this._inputPtr;
                this._inputPtr = i6 + 1;
                int i7 = bArr3[i6] & 255;
                int iDecodeBase64Char2 = base64Variant.decodeBase64Char(i7);
                if (iDecodeBase64Char2 < 0) {
                    iDecodeBase64Char2 = _decodeBase64Escape(base64Variant, i7, 1);
                }
                int i8 = iDecodeBase64Char << 6;
                if (this._inputPtr >= this._inputEnd) {
                    _loadMoreGuaranteed();
                }
                int i9 = i8 | iDecodeBase64Char2;
                byte[] bArr4 = this._inputBuffer;
                int i10 = this._inputPtr;
                this._inputPtr = i10 + 1;
                int i11 = bArr4[i10] & 255;
                int iDecodeBase64Char3 = base64Variant.decodeBase64Char(i11);
                if (iDecodeBase64Char3 < 0) {
                    if (iDecodeBase64Char3 != -2) {
                        if (i11 == 34) {
                            int i12 = i2 + 1;
                            bArr[i2] = (byte) (i9 >> 4);
                            if (base64Variant.requiresPaddingOnRead()) {
                                this._inputPtr--;
                                _handleBase64MissingPadding(base64Variant);
                            }
                            i2 = i12;
                        } else {
                            iDecodeBase64Char3 = _decodeBase64Escape(base64Variant, i11, 2);
                        }
                    }
                    if (iDecodeBase64Char3 == -2) {
                        if (this._inputPtr >= this._inputEnd) {
                            _loadMoreGuaranteed();
                        }
                        byte[] bArr5 = this._inputBuffer;
                        int i13 = this._inputPtr;
                        this._inputPtr = i13 + 1;
                        int i14 = bArr5[i13] & 255;
                        if (!base64Variant.usesPaddingChar(i14) && _decodeBase64Escape(base64Variant, i14, 3) != -2) {
                            throw reportInvalidBase64Char(base64Variant, i14, 3, a.a(base64Variant));
                        }
                        bArr[i2] = (byte) (i9 >> 4);
                        i2++;
                    }
                }
                int i15 = i2 + 1;
                int i16 = i2 + 2;
                int i17 = i9 << 6;
                if (this._inputPtr >= this._inputEnd) {
                    _loadMoreGuaranteed();
                }
                int i18 = i17 | iDecodeBase64Char3;
                byte[] bArr6 = this._inputBuffer;
                int i19 = this._inputPtr;
                this._inputPtr = i19 + 1;
                int i20 = bArr6[i19] & 255;
                int iDecodeBase64Char4 = base64Variant.decodeBase64Char(i20);
                if (iDecodeBase64Char4 < 0) {
                    if (iDecodeBase64Char4 != -2) {
                        if (i20 == 34) {
                            bArr[i2] = (byte) (i18 >> 10);
                            bArr[i15] = (byte) (i18 >> 2);
                            if (base64Variant.requiresPaddingOnRead()) {
                                this._inputPtr--;
                                _handleBase64MissingPadding(base64Variant);
                            }
                            i2 = i16;
                        } else {
                            iDecodeBase64Char4 = _decodeBase64Escape(base64Variant, i20, 3);
                        }
                    }
                    if (iDecodeBase64Char4 == -2) {
                        bArr[i2] = (byte) (i18 >> 10);
                        bArr[i15] = (byte) (i18 >> 2);
                        i2 = i16;
                    }
                }
                int i21 = (i18 << 6) | iDecodeBase64Char4;
                bArr[i2] = (byte) (i21 >> 16);
                bArr[i15] = (byte) (i21 >> 8);
                i2 += 3;
                bArr[i16] = (byte) i21;
            }
        }
        this._tokenIncomplete = false;
        if (i2 <= 0) {
            return i3;
        }
        int i22 = i3 + i2;
        outputStream.write(bArr, 0, i2);
        return i22;
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase
    protected void _releaseBuffers() {
        byte[] bArr;
        byte[] bArr2;
        super._releaseBuffers();
        this._symbols.release();
        if (!this._bufferRecyclable || (bArr = this._inputBuffer) == null || bArr == (bArr2 = NO_BYTES)) {
            return;
        }
        this._inputBuffer = bArr2;
        this._ioContext.releaseReadIOBuffer(bArr);
    }

    protected void _reportInvalidChar(int i2) {
        if (i2 < 32) {
            _throwInvalidSpace(i2);
        }
        _reportInvalidInitial(i2);
    }

    protected void _reportInvalidInitial(int i2) {
        _reportError("Invalid UTF-8 start byte 0x".concat(String.valueOf(Integer.toHexString(i2))));
    }

    protected void _reportInvalidOther(int i2) {
        _reportError("Invalid UTF-8 middle byte 0x".concat(String.valueOf(Integer.toHexString(i2))));
    }

    protected void _reportInvalidToken(String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        while (true) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                break;
            }
            byte[] bArr = this._inputBuffer;
            int i2 = this._inputPtr;
            this._inputPtr = i2 + 1;
            char c_decodeCharForError = (char) _decodeCharForError(bArr[i2]);
            if (!Character.isJavaIdentifierPart(c_decodeCharForError)) {
                break;
            }
            sb.append(c_decodeCharForError);
            if (sb.length() >= this._ioContext.errorReportConfiguration().getMaxErrorTokenLength()) {
                sb.append("...");
                break;
            }
        }
        _reportError("Unrecognized token '%s': was expecting %s", sb, str2);
    }

    protected final void _skipCR() {
        if (this._inputPtr < this._inputEnd || _loadMore()) {
            byte[] bArr = this._inputBuffer;
            int i2 = this._inputPtr;
            if (bArr[i2] == 10) {
                this._inputPtr = i2 + 1;
            }
        }
        this._currInputRow++;
        this._currInputRowStart = this._inputPtr;
    }

    protected void _skipString() {
        this._tokenIncomplete = false;
        int[] iArr = INPUT_CODES_UTF8;
        byte[] bArr = this._inputBuffer;
        while (true) {
            int i2 = this._inputPtr;
            int i3 = this._inputEnd;
            if (i2 >= i3) {
                _loadMoreGuaranteed();
                i2 = this._inputPtr;
                i3 = this._inputEnd;
            }
            while (true) {
                if (i2 >= i3) {
                    this._inputPtr = i2;
                    break;
                }
                int i4 = i2 + 1;
                int i5 = bArr[i2] & 255;
                int i6 = iArr[i5];
                if (i6 != 0) {
                    this._inputPtr = i4;
                    if (i5 == 34) {
                        return;
                    }
                    if (i6 == 1) {
                        _decodeEscaped();
                    } else if (i6 == 2) {
                        _skipUtf8_2();
                    } else if (i6 == 3) {
                        _skipUtf8_3();
                    } else if (i6 == 4) {
                        _skipUtf8_4(i5);
                    } else if (i5 < 32) {
                        _throwUnquotedSpace(i5, "string value");
                    } else {
                        _reportInvalidChar(i5);
                    }
                } else {
                    i2 = i4;
                }
            }
        }
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonLocation currentLocation() {
        return new JsonLocation(_contentReference(), this._currInputProcessed + this._inputPtr, -1L, this._currInputRow, (this._inputPtr - this._currInputRowStart) + 1);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonLocation currentTokenLocation() {
        if (this._currToken != JsonToken.FIELD_NAME) {
            return new JsonLocation(_contentReference(), this._tokenInputTotal - 1, -1L, this._tokenInputRow, this._tokenInputCol);
        }
        return new JsonLocation(_contentReference(), this._currInputProcessed + (this._nameStartOffset - 1), -1L, this._nameStartRow, this._nameStartCol);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public void finishToken() {
        if (this._tokenIncomplete) {
            this._tokenIncomplete = false;
            _finishString();
        }
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase, com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public byte[] getBinaryValue(Base64Variant base64Variant) throws JsonParseException {
        JsonToken jsonToken;
        if (this._currToken != JsonToken.VALUE_STRING && ((jsonToken = this._currToken) != JsonToken.VALUE_EMBEDDED_OBJECT || this._binaryValue == null)) {
            _reportError("Current token (" + String.valueOf(jsonToken) + ") not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary");
        }
        if (this._tokenIncomplete) {
            try {
                this._binaryValue = _decodeBase64(base64Variant);
                this._tokenIncomplete = false;
            } catch (IllegalArgumentException e2) {
                throw _constructError("Failed to decode VALUE_STRING as base64 (" + String.valueOf(base64Variant) + "): " + e2.getMessage());
            }
        } else if (this._binaryValue == null) {
            ByteArrayBuilder byteArrayBuilder_getByteArrayBuilder = _getByteArrayBuilder();
            _decodeBase64(getText(), byteArrayBuilder_getByteArrayBuilder, base64Variant);
            this._binaryValue = byteArrayBuilder_getByteArrayBuilder.toByteArray();
        }
        return this._binaryValue;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public Object getInputSource() {
        return this._inputStream;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int getText(Writer writer) throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == JsonToken.VALUE_STRING) {
            if (this._tokenIncomplete) {
                this._tokenIncomplete = false;
                _finishString();
            }
            return this._textBuffer.contentsToWriter(writer);
        }
        if (jsonToken == JsonToken.FIELD_NAME) {
            String currentName = this._parsingContext.getCurrentName();
            writer.write(currentName);
            return currentName.length();
        }
        if (jsonToken == null) {
            return 0;
        }
        if (jsonToken.isNumeric()) {
            return this._textBuffer.contentsToWriter(writer);
        }
        char[] cArrAsCharArray = jsonToken.asCharArray();
        writer.write(cArrAsCharArray);
        return cArrAsCharArray.length;
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public char[] getTextCharacters() {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == null) {
            return null;
        }
        int iId = jsonToken.id();
        if (iId != 5) {
            if (iId != 6) {
                if (iId != 7 && iId != 8) {
                    return jsonToken.asCharArray();
                }
            } else if (this._tokenIncomplete) {
                this._tokenIncomplete = false;
                _finishString();
            }
            return this._textBuffer.getTextBuffer();
        }
        if (!this._nameCopied) {
            String currentName = this._parsingContext.getCurrentName();
            int length = currentName.length();
            char[] cArr = this._nameCopyBuffer;
            if (cArr == null) {
                this._nameCopyBuffer = this._ioContext.allocNameCopyBuffer(length);
            } else if (cArr.length < length) {
                this._nameCopyBuffer = new char[length];
            }
            currentName.getChars(0, length, this._nameCopyBuffer, 0);
            this._nameCopied = true;
        }
        return this._nameCopyBuffer;
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public int getTextLength() {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == null) {
            return 0;
        }
        int iId = jsonToken.id();
        if (iId == 5) {
            return this._parsingContext.getCurrentName().length();
        }
        if (iId != 6) {
            if (iId != 7 && iId != 8) {
                return jsonToken.asCharArray().length;
            }
        } else if (this._tokenIncomplete) {
            this._tokenIncomplete = false;
            _finishString();
        }
        return this._textBuffer.size();
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0011, code lost:
    
        if (r0 != 8) goto L16;
     */
    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int getTextOffset() {
        /*
            r3 = this;
            com.fasterxml.jackson.core.JsonToken r0 = r3._currToken
            r1 = 0
            if (r0 == 0) goto L24
            int r0 = r0.id()
            r2 = 6
            if (r0 == r2) goto L14
            r2 = 7
            if (r0 == r2) goto L1d
            r2 = 8
            if (r0 == r2) goto L1d
            goto L24
        L14:
            boolean r0 = r3._tokenIncomplete
            if (r0 == 0) goto L1d
            r3._tokenIncomplete = r1
            r3._finishString()
        L1d:
            com.fasterxml.jackson.core.util.TextBuffer r3 = r3._textBuffer
            int r3 = r3.getTextOffset()
            return r3
        L24:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.UTF8StreamJsonParser.getTextOffset():int");
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public int getValueAsInt() {
        JsonToken jsonToken = this._currToken;
        if (jsonToken != JsonToken.VALUE_NUMBER_INT && jsonToken != JsonToken.VALUE_NUMBER_FLOAT) {
            return super.getValueAsInt(0);
        }
        int i2 = this._numTypesValid;
        int i3 = i2 & 1;
        if (i3 == 0) {
            if (i2 == 0) {
                return _parseIntValue();
            }
            if (i3 == 0) {
                convertNumberToInt();
            }
        }
        return this._numberInt;
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public String getValueAsString() {
        if (this._currToken != JsonToken.VALUE_STRING) {
            return this._currToken == JsonToken.FIELD_NAME ? currentName() : super.getValueAsString(null);
        }
        if (!this._tokenIncomplete) {
            return this._textBuffer.contentsAsString();
        }
        this._tokenIncomplete = false;
        return _finishAndReturnString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x003d, code lost:
    
        if (r3 == com.fasterxml.jackson.core.JsonToken.VALUE_FALSE) goto L20;
     */
    @Override // com.fasterxml.jackson.core.JsonParser
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Boolean nextBooleanValue() throws com.fasterxml.jackson.core.JsonParseException {
        /*
            r3 = this;
            com.fasterxml.jackson.core.JsonToken r0 = r3._currToken
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME
            r2 = 0
            if (r0 != r1) goto L33
            r0 = 0
            r3._nameCopied = r0
            com.fasterxml.jackson.core.JsonToken r0 = r3._nextToken
            r3._nextToken = r2
            r3._updateToken(r0)
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE
            if (r0 != r1) goto L16
            goto L43
        L16:
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.VALUE_FALSE
            if (r0 != r1) goto L1b
            goto L3f
        L1b:
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.START_ARRAY
            if (r0 != r1) goto L27
            int r0 = r3._tokenInputRow
            int r1 = r3._tokenInputCol
            r3.createChildArrayContext(r0, r1)
            goto L42
        L27:
            com.fasterxml.jackson.core.JsonToken r1 = com.fasterxml.jackson.core.JsonToken.START_OBJECT
            if (r0 != r1) goto L42
            int r0 = r3._tokenInputRow
            int r1 = r3._tokenInputCol
            r3.createChildObjectContext(r0, r1)
            goto L42
        L33:
            com.fasterxml.jackson.core.JsonToken r3 = r3.nextToken()
            com.fasterxml.jackson.core.JsonToken r0 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE
            if (r3 == r0) goto L43
            com.fasterxml.jackson.core.JsonToken r0 = com.fasterxml.jackson.core.JsonToken.VALUE_FALSE
            if (r3 != r0) goto L42
        L3f:
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            return r3
        L42:
            return r2
        L43:
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.UTF8StreamJsonParser.nextBooleanValue():java.lang.Boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0073, code lost:
    
        if (r1 == 125) goto L32;
     */
    @Override // com.fasterxml.jackson.core.JsonParser
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String nextFieldName() throws com.fasterxml.jackson.core.JsonParseException {
        /*
            Method dump skipped, instructions count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.UTF8StreamJsonParser.nextFieldName():java.lang.String");
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int nextIntValue(int i2) {
        if (this._currToken == JsonToken.FIELD_NAME) {
            this._nameCopied = false;
            JsonToken jsonToken = this._nextToken;
            this._nextToken = null;
            _updateToken(jsonToken);
            if (jsonToken == JsonToken.VALUE_NUMBER_INT) {
                return getIntValue();
            }
            if (jsonToken == JsonToken.START_ARRAY) {
                createChildArrayContext(this._tokenInputRow, this._tokenInputCol);
                return i2;
            }
            if (jsonToken == JsonToken.START_OBJECT) {
                createChildObjectContext(this._tokenInputRow, this._tokenInputCol);
                return i2;
            }
        } else if (nextToken() == JsonToken.VALUE_NUMBER_INT) {
            return getIntValue();
        }
        return i2;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public long nextLongValue(long j2) {
        if (this._currToken == JsonToken.FIELD_NAME) {
            this._nameCopied = false;
            JsonToken jsonToken = this._nextToken;
            this._nextToken = null;
            _updateToken(jsonToken);
            if (jsonToken == JsonToken.VALUE_NUMBER_INT) {
                return getLongValue();
            }
            if (jsonToken == JsonToken.START_ARRAY) {
                createChildArrayContext(this._tokenInputRow, this._tokenInputCol);
                return j2;
            }
            if (jsonToken == JsonToken.START_OBJECT) {
                createChildObjectContext(this._tokenInputRow, this._tokenInputCol);
                return j2;
            }
        } else if (nextToken() == JsonToken.VALUE_NUMBER_INT) {
            return getLongValue();
        }
        return j2;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public String nextTextValue() {
        if (this._currToken == JsonToken.FIELD_NAME) {
            this._nameCopied = false;
            JsonToken jsonToken = this._nextToken;
            this._nextToken = null;
            _updateToken(jsonToken);
            if (jsonToken == JsonToken.VALUE_STRING) {
                if (!this._tokenIncomplete) {
                    return this._textBuffer.contentsAsString();
                }
                this._tokenIncomplete = false;
                return _finishAndReturnString();
            }
            if (jsonToken == JsonToken.START_ARRAY) {
                createChildArrayContext(this._tokenInputRow, this._tokenInputCol);
            } else if (jsonToken == JsonToken.START_OBJECT) {
                createChildObjectContext(this._tokenInputRow, this._tokenInputCol);
            }
        } else if (nextToken() == JsonToken.VALUE_STRING) {
            return getText();
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0074, code lost:
    
        if (r1 == 125) goto L32;
     */
    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.fasterxml.jackson.core.JsonToken nextToken() throws com.fasterxml.jackson.core.JsonParseException {
        /*
            Method dump skipped, instructions count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.UTF8StreamJsonParser.nextToken():com.fasterxml.jackson.core.JsonToken");
    }

    protected final String parseEscapedName(int[] iArr, int i2, int i3, int i4, int i5) throws StreamConstraintsException {
        int[] iArr2 = INPUT_CODES_LATIN1;
        while (true) {
            if (iArr2[i4] != 0) {
                if (i4 == 34) {
                    break;
                }
                if (i4 != 92) {
                    _throwUnquotedSpace(i4, HintConstants.AUTOFILL_HINT_NAME);
                } else {
                    i4 = _decodeEscaped();
                }
                if (i4 > 127) {
                    int i6 = 0;
                    if (i5 >= 4) {
                        int length = iArr.length;
                        if (i2 >= length) {
                            iArr = _growNameDecodeBuffer(iArr, length);
                            this._quadBuffer = iArr;
                        }
                        iArr[i2] = i3;
                        i2++;
                        i3 = 0;
                        i5 = 0;
                    }
                    i5++;
                    int i7 = i3 << 8;
                    if (i4 < 2048) {
                        i3 = i7 | (i4 >> 6) | 192;
                    } else {
                        int i8 = i7 | (i4 >> 12) | 224;
                        if (i5 >= 4) {
                            int length2 = iArr.length;
                            if (i2 >= length2) {
                                iArr = _growNameDecodeBuffer(iArr, length2);
                                this._quadBuffer = iArr;
                            }
                            iArr[i2] = i8;
                            i2++;
                            i5 = 0;
                        } else {
                            i6 = i8;
                        }
                        i3 = (i6 << 8) | ((i4 >> 6) & 63) | 128;
                        i5++;
                    }
                    i4 = (i4 & 63) | 128;
                }
            }
            if (i5 < 4) {
                i3 = (i3 << 8) | i4;
                i5++;
            } else {
                int length3 = iArr.length;
                if (i2 >= length3) {
                    iArr = _growNameDecodeBuffer(iArr, length3);
                    this._quadBuffer = iArr;
                }
                iArr[i2] = i3;
                i3 = i4;
                i2++;
                i5 = 1;
            }
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                _reportInvalidEOF(" in field name", JsonToken.FIELD_NAME);
            }
            byte[] bArr = this._inputBuffer;
            int i9 = this._inputPtr;
            this._inputPtr = i9 + 1;
            i4 = bArr[i9] & 255;
        }
        if (i5 > 0) {
            int length4 = iArr.length;
            if (i2 >= length4) {
                iArr = _growNameDecodeBuffer(iArr, length4);
                this._quadBuffer = iArr;
            }
            iArr[i2] = _padLastQuad(i3, i5);
            i2++;
        }
        String strFindName = this._symbols.findName(iArr, i2);
        return strFindName == null ? addName(iArr, i2, i5) : strFindName;
    }

    protected final String parseLongName(int i2, int i3, int i4) throws StreamConstraintsException {
        int[] iArr = this._quadBuffer;
        iArr[0] = this._quad1;
        int i5 = 1;
        iArr[1] = i3;
        iArr[2] = i4;
        byte[] bArr = this._inputBuffer;
        int[] iArr2 = INPUT_CODES_LATIN1;
        int i6 = i2;
        int i7 = 3;
        while (true) {
            int i8 = this._inputPtr;
            if (i8 + 4 > this._inputEnd) {
                return parseEscapedName(this._quadBuffer, i7, 0, i6, 0);
            }
            int i9 = i8 + 1;
            this._inputPtr = i9;
            int i10 = bArr[i8] & 255;
            if (iArr2[i10] != 0) {
                int[] iArr3 = this._quadBuffer;
                if (i10 == 34) {
                    return findName(iArr3, i7, i6, i5);
                }
                return parseEscapedName(iArr3, i7, i6, i10, 1);
            }
            int i11 = i5;
            int i12 = i7;
            int i13 = i6;
            int[] iArr4 = iArr2;
            int i14 = (i13 << 8) | i10;
            int i15 = i8 + 2;
            this._inputPtr = i15;
            int i16 = bArr[i9] & 255;
            if (iArr4[i16] != 0) {
                int[] iArr5 = this._quadBuffer;
                return i16 == 34 ? findName(iArr5, i12, i14, 2) : parseEscapedName(iArr5, i12, i14, i16, 2);
            }
            int i17 = (i14 << 8) | i16;
            int i18 = i8 + 3;
            this._inputPtr = i18;
            int i19 = bArr[i15] & 255;
            if (iArr4[i19] != 0) {
                int[] iArr6 = this._quadBuffer;
                return i19 == 34 ? findName(iArr6, i12, i17, 3) : parseEscapedName(iArr6, i12, i17, i19, 3);
            }
            int i20 = (i17 << 8) | i19;
            this._inputPtr = i8 + 4;
            int i21 = bArr[i18] & 255;
            if (iArr4[i21] != 0) {
                int[] iArr7 = this._quadBuffer;
                return i21 == 34 ? findName(iArr7, i12, i20, 4) : parseEscapedName(iArr7, i12, i20, i21, 4);
            }
            int[] iArr_growNameDecodeBuffer = this._quadBuffer;
            if (i12 >= iArr_growNameDecodeBuffer.length) {
                iArr_growNameDecodeBuffer = _growNameDecodeBuffer(iArr_growNameDecodeBuffer, i12);
                this._quadBuffer = iArr_growNameDecodeBuffer;
            }
            iArr_growNameDecodeBuffer[i12] = i20;
            i6 = i21;
            iArr2 = iArr4;
            i7 = i12 + 1;
            i5 = i11;
        }
    }

    protected final String parseMediumName(int i2) {
        byte[] bArr = this._inputBuffer;
        int[] iArr = INPUT_CODES_LATIN1;
        int i3 = this._inputPtr;
        int i4 = i3 + 1;
        this._inputPtr = i4;
        int i5 = bArr[i3] & 255;
        if (iArr[i5] != 0) {
            int i6 = this._quad1;
            return i5 == 34 ? findName(i6, i2, 1) : parseName(i6, i2, i5, 1);
        }
        int i7 = (i2 << 8) | i5;
        int i8 = i3 + 2;
        this._inputPtr = i8;
        int i9 = bArr[i4] & 255;
        if (iArr[i9] != 0) {
            int i10 = this._quad1;
            return i9 == 34 ? findName(i10, i7, 2) : parseName(i10, i7, i9, 2);
        }
        int i11 = (i7 << 8) | i9;
        int i12 = i3 + 3;
        this._inputPtr = i12;
        int i13 = bArr[i8] & 255;
        if (iArr[i13] != 0) {
            int i14 = this._quad1;
            return i13 == 34 ? findName(i14, i11, 3) : parseName(i14, i11, i13, 3);
        }
        int i15 = (i11 << 8) | i13;
        this._inputPtr = i3 + 4;
        int i16 = bArr[i12] & 255;
        if (iArr[i16] == 0) {
            return parseMediumName2(i16, i15);
        }
        int i17 = this._quad1;
        return i16 == 34 ? findName(i17, i15, 4) : parseName(i17, i15, i16, 4);
    }

    protected final String parseMediumName2(int i2, int i3) {
        byte[] bArr = this._inputBuffer;
        int[] iArr = INPUT_CODES_LATIN1;
        int i4 = this._inputPtr;
        int i5 = i4 + 1;
        this._inputPtr = i5;
        int i6 = bArr[i4] & 255;
        if (iArr[i6] != 0) {
            int i7 = this._quad1;
            return i6 == 34 ? findName(i7, i3, i2, 1) : parseName(i7, i3, i2, i6, 1);
        }
        int i8 = (i2 << 8) | i6;
        int i9 = i4 + 2;
        this._inputPtr = i9;
        int i10 = bArr[i5] & 255;
        if (iArr[i10] != 0) {
            int i11 = this._quad1;
            return i10 == 34 ? findName(i11, i3, i8, 2) : parseName(i11, i3, i8, i10, 2);
        }
        int i12 = (i8 << 8) | i10;
        int i13 = i4 + 3;
        this._inputPtr = i13;
        int i14 = bArr[i9] & 255;
        if (iArr[i14] != 0) {
            int i15 = this._quad1;
            return i14 == 34 ? findName(i15, i3, i12, 3) : parseName(i15, i3, i12, i14, 3);
        }
        int i16 = (i12 << 8) | i14;
        this._inputPtr = i4 + 4;
        int i17 = bArr[i13] & 255;
        if (iArr[i17] == 0) {
            return parseLongName(i17, i3, i16);
        }
        int i18 = this._quad1;
        return i17 == 34 ? findName(i18, i3, i16, 4) : parseName(i18, i3, i16, i17, 4);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int readBinaryValue(Base64Variant base64Variant, OutputStream outputStream) throws IOException {
        if (!this._tokenIncomplete || this._currToken != JsonToken.VALUE_STRING) {
            byte[] binaryValue = getBinaryValue(base64Variant);
            outputStream.write(binaryValue);
            return binaryValue.length;
        }
        byte[] bArrAllocBase64Buffer = this._ioContext.allocBase64Buffer();
        try {
            return _readBinary(base64Variant, outputStream, bArrAllocBase64Buffer);
        } finally {
            this._ioContext.releaseBase64Buffer(bArrAllocBase64Buffer);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int releaseBuffered(OutputStream outputStream) throws IOException {
        int i2 = this._inputEnd;
        int i3 = this._inputPtr;
        int i4 = i2 - i3;
        if (i4 <= 0) {
            return 0;
        }
        this._inputPtr = i3 + i4;
        outputStream.write(this._inputBuffer, i3, i4);
        return i4;
    }

    protected String slowParseName() {
        if (this._inputPtr >= this._inputEnd && !_loadMore()) {
            _reportInvalidEOF(": was expecting closing '\"' for name", JsonToken.FIELD_NAME);
        }
        byte[] bArr = this._inputBuffer;
        int i2 = this._inputPtr;
        this._inputPtr = i2 + 1;
        int i3 = bArr[i2] & 255;
        return i3 == 34 ? "" : parseEscapedName(this._quadBuffer, 0, 0, i3, 0);
    }

    private final String parseName(int i2, int i3, int i4) {
        return parseEscapedName(this._quadBuffer, 0, i2, i3, i4);
    }

    private final String parseName(int i2, int i3, int i4, int i5, int i6) {
        int[] iArr = this._quadBuffer;
        iArr[0] = i2;
        iArr[1] = i3;
        return parseEscapedName(iArr, 2, i4, i5, i6);
    }

    protected void _reportInvalidOther(int i2, int i3) {
        this._inputPtr = i3;
        _reportInvalidOther(i2);
    }

    private final String findName(int i2, int i3, int i4) {
        ByteQuadsCanonicalizer byteQuadsCanonicalizer = this._symbols;
        int i_padLastQuad = _padLastQuad(i3, i4);
        String strFindName = byteQuadsCanonicalizer.findName(i2, i_padLastQuad);
        if (strFindName != null) {
            return strFindName;
        }
        int[] iArr = this._quadBuffer;
        iArr[0] = i2;
        iArr[1] = i_padLastQuad;
        return addName(iArr, 2, i4);
    }

    private final String findName(int i2, int i3) {
        ByteQuadsCanonicalizer byteQuadsCanonicalizer = this._symbols;
        int i_padLastQuad = _padLastQuad(i2, i3);
        String strFindName = byteQuadsCanonicalizer.findName(i_padLastQuad);
        if (strFindName != null) {
            return strFindName;
        }
        int[] iArr = this._quadBuffer;
        iArr[0] = i_padLastQuad;
        return addName(iArr, 1, i3);
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public int getValueAsInt(int i2) {
        JsonToken jsonToken = this._currToken;
        if (jsonToken != JsonToken.VALUE_NUMBER_INT && jsonToken != JsonToken.VALUE_NUMBER_FLOAT) {
            return super.getValueAsInt(i2);
        }
        int i3 = this._numTypesValid;
        int i4 = i3 & 1;
        if (i4 == 0) {
            if (i3 == 0) {
                return _parseIntValue();
            }
            if (i4 == 0) {
                convertNumberToInt();
            }
        }
        return this._numberInt;
    }

    private final String findName(int[] iArr, int i2, int i3, int i4) throws StreamConstraintsException {
        int length = iArr.length;
        if (i2 >= length) {
            iArr = _growNameDecodeBuffer(iArr, length);
            this._quadBuffer = iArr;
        }
        int i5 = i2 + 1;
        iArr[i2] = _padLastQuad(i3, i4);
        String strFindName = this._symbols.findName(iArr, i5);
        return strFindName == null ? addName(iArr, i5, i4) : strFindName;
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public String getValueAsString(String str) {
        if (this._currToken != JsonToken.VALUE_STRING) {
            if (this._currToken == JsonToken.FIELD_NAME) {
                return currentName();
            }
            return super.getValueAsString(str);
        }
        if (this._tokenIncomplete) {
            this._tokenIncomplete = false;
            return _finishAndReturnString();
        }
        return this._textBuffer.contentsAsString();
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public String getText() {
        if (this._currToken != JsonToken.VALUE_STRING) {
            return _getText2(this._currToken);
        }
        if (this._tokenIncomplete) {
            this._tokenIncomplete = false;
            return _finishAndReturnString();
        }
        return this._textBuffer.contentsAsString();
    }

    protected void _reportInvalidToken(String str) {
        _reportInvalidToken(str, _validJsonTokenList());
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0073, code lost:
    
        if (r1 == 125) goto L32;
     */
    @Override // com.fasterxml.jackson.core.JsonParser
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean nextFieldName(com.fasterxml.jackson.core.SerializableString r8) throws com.fasterxml.jackson.core.JsonParseException {
        /*
            r7 = this;
            r0 = 0
            r7._numTypesValid = r0
            com.fasterxml.jackson.core.JsonToken r1 = r7._currToken
            com.fasterxml.jackson.core.JsonToken r2 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME
            if (r1 != r2) goto Ld
            r7._nextAfterName()
            return r0
        Ld:
            boolean r1 = r7._tokenIncomplete
            if (r1 == 0) goto L14
            r7._skipString()
        L14:
            int r1 = r7._skipWSOrEnd()
            if (r1 >= 0) goto L21
            r7.close()
            r7._updateTokenToNull()
            return r0
        L21:
            r2 = 0
            r7._binaryValue = r2
            r2 = 93
            if (r1 != r2) goto L31
            r7._closeArrayScope()
            com.fasterxml.jackson.core.JsonToken r8 = com.fasterxml.jackson.core.JsonToken.END_ARRAY
            r7._updateToken(r8)
            return r0
        L31:
            r3 = 125(0x7d, float:1.75E-43)
            if (r1 != r3) goto L3e
            r7._closeObjectScope()
            com.fasterxml.jackson.core.JsonToken r8 = com.fasterxml.jackson.core.JsonToken.END_OBJECT
            r7._updateToken(r8)
            return r0
        L3e:
            com.fasterxml.jackson.core.json.JsonReadContext r4 = r7._parsingContext
            boolean r4 = r4.expectComma()
            if (r4 == 0) goto L7b
            r4 = 44
            if (r1 == r4) goto L66
            com.fasterxml.jackson.core.json.JsonReadContext r4 = r7._parsingContext
            java.lang.String r4 = r4.typeDesc()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "was expecting comma to separate "
            r5.<init>(r6)
            r5.append(r4)
            java.lang.String r4 = " entries"
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            r7._reportUnexpectedChar(r1, r4)
        L66:
            int r1 = r7._skipWS()
            int r4 = r7._features
            int r5 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.FEAT_MASK_TRAILING_COMMA
            r4 = r4 & r5
            if (r4 == 0) goto L7b
            if (r1 == r2) goto L76
            if (r1 != r3) goto L7b
            goto L77
        L76:
            r3 = r1
        L77:
            r7._closeScope(r3)
            return r0
        L7b:
            com.fasterxml.jackson.core.json.JsonReadContext r2 = r7._parsingContext
            boolean r2 = r2.inObject()
            if (r2 != 0) goto L8a
            r7._updateLocation()
            r7._nextTokenNotInObject(r1)
            return r0
        L8a:
            r7._updateNameLocation()
            r2 = 34
            if (r1 != r2) goto Lc9
            byte[] r1 = r8.asQuotedUTF8()
            int r3 = r1.length
            int r4 = r7._inputPtr
            int r3 = r3 + r4
            int r5 = r3 + 4
            int r6 = r7._inputEnd
            if (r5 >= r6) goto Lc8
            byte[] r5 = r7._inputBuffer
            r5 = r5[r3]
            if (r5 != r2) goto Lc8
        La5:
            if (r4 != r3) goto Lba
            r0 = 1
            int r4 = r4 + r0
            com.fasterxml.jackson.core.json.JsonReadContext r1 = r7._parsingContext
            java.lang.String r8 = r8.getValue()
            r1.setCurrentName(r8)
            int r8 = r7._skipColonFast(r4)
            r7._isNextTokenNameYes(r8)
            return r0
        Lba:
            r5 = r1[r0]
            byte[] r6 = r7._inputBuffer
            r6 = r6[r4]
            if (r5 == r6) goto Lc3
            goto Lc8
        Lc3:
            int r0 = r0 + 1
            int r4 = r4 + 1
            goto La5
        Lc8:
            r1 = r2
        Lc9:
            boolean r7 = r7._isNextTokenNameMaybe(r1, r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.UTF8StreamJsonParser.nextFieldName(com.fasterxml.jackson.core.SerializableString):boolean");
    }
}
