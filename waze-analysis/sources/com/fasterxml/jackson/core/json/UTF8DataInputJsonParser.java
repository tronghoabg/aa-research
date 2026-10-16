package com.fasterxml.jackson.core.json;

import androidx.autofill.HintConstants;
import androidx.core.internal.view.SupportMenu;
import androidx.credentials.provider.CredentialEntry;
import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.io.CharTypes;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import com.waze.strings.DisplayStrings;
import java.io.DataInput;
import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class UTF8DataInputJsonParser extends JsonParserBase {
    protected DataInput _inputData;
    protected int _nextByte;
    private int _quad1;
    protected int[] _quadBuffer;
    protected final ByteQuadsCanonicalizer _symbols;
    protected boolean _tokenIncomplete;

    public UTF8DataInputJsonParser(IOContext iOContext, int i2, DataInput dataInput, ObjectCodec objectCodec, ByteQuadsCanonicalizer byteQuadsCanonicalizer, int i3) {
        super(iOContext, i2, objectCodec);
        this._quadBuffer = new int[16];
        this._symbols = byteQuadsCanonicalizer;
        this._inputData = dataInput;
        this._nextByte = i3;
    }

    private final void _checkMatchEnd(String str, int i2, int i3) throws IOException {
        char c_decodeCharForError = (char) _decodeCharForError(i3);
        if (Character.isJavaIdentifierPart(c_decodeCharForError)) {
            _reportInvalidToken(c_decodeCharForError, str.substring(0, i2));
        }
    }

    private void _closeScope(int i2) {
        if (i2 == 93) {
            if (!this._parsingContext.inArray()) {
                _reportMismatchedEndMarker(93, '}');
            }
            this._parsingContext = this._parsingContext.clearAndGetParent();
            _updateToken(JsonToken.END_ARRAY);
            return;
        }
        if (i2 == 125) {
            if (!this._parsingContext.inObject()) {
                _reportMismatchedEndMarker(125, ']');
            }
            this._parsingContext = this._parsingContext.clearAndGetParent();
            _updateToken(JsonToken.END_OBJECT);
        }
    }

    private final int _decodeUtf8_2(int i2) throws IOException {
        int unsignedByte = this._inputData.readUnsignedByte();
        if ((unsignedByte & 192) != 128) {
            _reportInvalidOther(unsignedByte & 255);
        }
        return ((i2 & 31) << 6) | (unsignedByte & 63);
    }

    private final int _decodeUtf8_3(int i2) throws IOException {
        int unsignedByte = this._inputData.readUnsignedByte();
        if ((unsignedByte & 192) != 128) {
            _reportInvalidOther(unsignedByte & 255);
        }
        int i3 = i2 & 15;
        int i4 = unsignedByte & 63;
        int unsignedByte2 = this._inputData.readUnsignedByte();
        if ((unsignedByte2 & 192) != 128) {
            _reportInvalidOther(unsignedByte2 & 255);
        }
        return (((i3 << 6) | i4) << 6) | (unsignedByte2 & 63);
    }

    private final int _decodeUtf8_4(int i2) throws IOException {
        int unsignedByte = this._inputData.readUnsignedByte();
        if ((unsignedByte & 192) != 128) {
            _reportInvalidOther(unsignedByte & 255);
        }
        int i3 = i2 & 7;
        int i4 = unsignedByte & 63;
        int unsignedByte2 = this._inputData.readUnsignedByte();
        if ((unsignedByte2 & 192) != 128) {
            _reportInvalidOther(unsignedByte2 & 255);
        }
        int i5 = (i3 << 6) | i4;
        int i6 = unsignedByte2 & 63;
        int unsignedByte3 = this._inputData.readUnsignedByte();
        if ((unsignedByte3 & 192) != 128) {
            _reportInvalidOther(unsignedByte3 & 255);
        }
        return ((((i5 << 6) | i6) << 6) | (unsignedByte3 & 63)) + SupportMenu.CATEGORY_MASK;
    }

    private String _finishAndReturnString() throws IOException {
        char[] cArrEmptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        int length = cArrEmptyAndGetCurrentSegment.length;
        int[] iArr = INPUT_CODES_UTF8;
        int i2 = 0;
        while (true) {
            int unsignedByte = this._inputData.readUnsignedByte();
            if (iArr[unsignedByte] != 0) {
                if (unsignedByte == 34) {
                    return this._textBuffer.setCurrentAndReturn(i2);
                }
                _finishString2(cArrEmptyAndGetCurrentSegment, i2, unsignedByte);
                return this._textBuffer.contentsAsString();
            }
            int i3 = i2 + 1;
            cArrEmptyAndGetCurrentSegment[i2] = (char) unsignedByte;
            if (i3 >= length) {
                _finishString2(cArrEmptyAndGetCurrentSegment, i3, this._inputData.readUnsignedByte());
                return this._textBuffer.contentsAsString();
            }
            i2 = i3;
        }
    }

    private final void _finishString2(char[] cArr, int i2, int i3) throws IOException {
        int length = cArr.length;
        int[] iArr = INPUT_CODES_UTF8;
        while (true) {
            int i4 = iArr[i3];
            int i5 = 0;
            if (i4 == 0) {
                if (i2 >= length) {
                    cArr = this._textBuffer.finishCurrentSegment();
                    length = cArr.length;
                    i2 = 0;
                }
                cArr[i2] = (char) i3;
                i3 = this._inputData.readUnsignedByte();
                i2++;
            } else {
                if (i3 == 34) {
                    this._textBuffer.setCurrentLength(i2);
                    return;
                }
                if (i4 == 1) {
                    i3 = _decodeEscaped();
                } else if (i4 == 2) {
                    i3 = _decodeUtf8_2(i3);
                } else if (i4 == 3) {
                    i3 = _decodeUtf8_3(i3);
                } else if (i4 == 4) {
                    int i_decodeUtf8_4 = _decodeUtf8_4(i3);
                    if (i2 >= cArr.length) {
                        cArr = this._textBuffer.finishCurrentSegment();
                        length = cArr.length;
                        i2 = 0;
                    }
                    cArr[i2] = (char) ((i_decodeUtf8_4 >> 10) | 55296);
                    i3 = 56320 | (i_decodeUtf8_4 & 1023);
                    i2++;
                } else if (i3 < 32) {
                    _throwUnquotedSpace(i3, "string value");
                } else {
                    _reportInvalidChar(i3);
                }
                if (i2 >= cArr.length) {
                    cArr = this._textBuffer.finishCurrentSegment();
                    length = cArr.length;
                } else {
                    i5 = i2;
                }
                i2 = i5 + 1;
                cArr[i5] = (char) i3;
                i3 = this._inputData.readUnsignedByte();
            }
        }
    }

    private final int _handleLeadingZeroes() throws IOException {
        int unsignedByte = this._inputData.readUnsignedByte();
        if (unsignedByte >= 48 && unsignedByte <= 57) {
            if ((this._features & FEAT_MASK_LEADING_ZEROS) == 0) {
                reportInvalidNumber("Leading zeroes not allowed");
            }
            while (unsignedByte == 48) {
                unsignedByte = this._inputData.readUnsignedByte();
            }
        }
        return unsignedByte;
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

    private final JsonToken _nextTokenNotInObject(int i2) throws IOException {
        if (i2 == 34) {
            this._tokenIncomplete = true;
            JsonToken jsonToken = JsonToken.VALUE_STRING;
            _updateToken(jsonToken);
            return jsonToken;
        }
        if (i2 == 43) {
            if (isEnabled(JsonReadFeature.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS.mappedFeature())) {
                JsonToken jsonToken_parsePosNumber = _parsePosNumber();
                _updateToken(jsonToken_parsePosNumber);
                return jsonToken_parsePosNumber;
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
            _matchToken(CredentialEntry.FALSE_STRING, 1);
            JsonToken jsonToken3 = JsonToken.VALUE_FALSE;
            _updateToken(jsonToken3);
            return jsonToken3;
        }
        if (i2 == 110) {
            _matchToken("null", 1);
            JsonToken jsonToken4 = JsonToken.VALUE_NULL;
            _updateToken(jsonToken4);
            return jsonToken4;
        }
        if (i2 == 116) {
            _matchToken(CredentialEntry.TRUE_STRING, 1);
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
            JsonToken jsonToken_parseNegNumber = _parseNegNumber();
            _updateToken(jsonToken_parseNegNumber);
            return jsonToken_parseNegNumber;
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

    /* JADX WARN: Removed duplicated region for block: B:35:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.fasterxml.jackson.core.JsonToken _parseFloat(char[] r8, int r9, int r10, boolean r11, int r12) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._parseFloat(char[], int, int, boolean, int):com.fasterxml.jackson.core.JsonToken");
    }

    private final String _parseLongName(int i2, int i3, int i4) throws IOException {
        int[] iArr = this._quadBuffer;
        iArr[0] = this._quad1;
        iArr[1] = i3;
        iArr[2] = i4;
        int[] iArr2 = INPUT_CODES_LATIN1;
        int i5 = i2;
        int i6 = 3;
        while (true) {
            int unsignedByte = this._inputData.readUnsignedByte();
            if (iArr2[unsignedByte] != 0) {
                int[] iArr3 = this._quadBuffer;
                return unsignedByte == 34 ? findName(iArr3, i6, i5, 1) : parseEscapedName(iArr3, i6, i5, unsignedByte, 1);
            }
            int i7 = (i5 << 8) | unsignedByte;
            int unsignedByte2 = this._inputData.readUnsignedByte();
            if (iArr2[unsignedByte2] != 0) {
                int[] iArr4 = this._quadBuffer;
                return unsignedByte2 == 34 ? findName(iArr4, i6, i7, 2) : parseEscapedName(iArr4, i6, i7, unsignedByte2, 2);
            }
            int i8 = (i7 << 8) | unsignedByte2;
            int unsignedByte3 = this._inputData.readUnsignedByte();
            if (iArr2[unsignedByte3] != 0) {
                int[] iArr5 = this._quadBuffer;
                return unsignedByte3 == 34 ? findName(iArr5, i6, i8, 3) : parseEscapedName(iArr5, i6, i8, unsignedByte3, 3);
            }
            int i9 = (i8 << 8) | unsignedByte3;
            int unsignedByte4 = this._inputData.readUnsignedByte();
            if (iArr2[unsignedByte4] != 0) {
                int[] iArr6 = this._quadBuffer;
                return unsignedByte4 == 34 ? findName(iArr6, i6, i9, 4) : parseEscapedName(iArr6, i6, i9, unsignedByte4, 4);
            }
            int[] iArrGrowArrayBy = this._quadBuffer;
            if (i6 >= iArrGrowArrayBy.length) {
                iArrGrowArrayBy = growArrayBy(iArrGrowArrayBy, i6);
                this._quadBuffer = iArrGrowArrayBy;
            }
            iArrGrowArrayBy[i6] = i9;
            i6++;
            i5 = unsignedByte4;
        }
    }

    private final String _parseMediumName(int i2) throws IOException {
        int[] iArr = INPUT_CODES_LATIN1;
        int unsignedByte = this._inputData.readUnsignedByte();
        if (iArr[unsignedByte] != 0) {
            int i3 = this._quad1;
            return unsignedByte == 34 ? findName(i3, i2, 1) : parseName(i3, i2, unsignedByte, 1);
        }
        int i4 = (i2 << 8) | unsignedByte;
        int unsignedByte2 = this._inputData.readUnsignedByte();
        if (iArr[unsignedByte2] != 0) {
            int i5 = this._quad1;
            return unsignedByte2 == 34 ? findName(i5, i4, 2) : parseName(i5, i4, unsignedByte2, 2);
        }
        int i6 = (i4 << 8) | unsignedByte2;
        int unsignedByte3 = this._inputData.readUnsignedByte();
        if (iArr[unsignedByte3] != 0) {
            int i7 = this._quad1;
            return unsignedByte3 == 34 ? findName(i7, i6, 3) : parseName(i7, i6, unsignedByte3, 3);
        }
        int i8 = (i6 << 8) | unsignedByte3;
        int unsignedByte4 = this._inputData.readUnsignedByte();
        if (iArr[unsignedByte4] == 0) {
            return _parseMediumName2(unsignedByte4, i8);
        }
        int i9 = this._quad1;
        return unsignedByte4 == 34 ? findName(i9, i8, 4) : parseName(i9, i8, unsignedByte4, 4);
    }

    private final String _parseMediumName2(int i2, int i3) throws IOException {
        int[] iArr = INPUT_CODES_LATIN1;
        int unsignedByte = this._inputData.readUnsignedByte();
        if (iArr[unsignedByte] != 0) {
            int i4 = this._quad1;
            return unsignedByte == 34 ? findName(i4, i3, i2, 1) : parseName(i4, i3, i2, unsignedByte, 1);
        }
        int i5 = (i2 << 8) | unsignedByte;
        int unsignedByte2 = this._inputData.readUnsignedByte();
        if (iArr[unsignedByte2] != 0) {
            int i6 = this._quad1;
            return unsignedByte2 == 34 ? findName(i6, i3, i5, 2) : parseName(i6, i3, i5, unsignedByte2, 2);
        }
        int i7 = (i5 << 8) | unsignedByte2;
        int unsignedByte3 = this._inputData.readUnsignedByte();
        if (iArr[unsignedByte3] != 0) {
            int i8 = this._quad1;
            return unsignedByte3 == 34 ? findName(i8, i3, i7, 3) : parseName(i8, i3, i7, unsignedByte3, 3);
        }
        int i9 = (i7 << 8) | unsignedByte3;
        int unsignedByte4 = this._inputData.readUnsignedByte();
        if (iArr[unsignedByte4] == 0) {
            return _parseLongName(unsignedByte4, i3, i9);
        }
        int i10 = this._quad1;
        return unsignedByte4 == 34 ? findName(i10, i3, i9, 4) : parseName(i10, i3, i9, unsignedByte4, 4);
    }

    private final JsonToken _parseSignedNumber(boolean z) throws IOException {
        int i2;
        int unsignedByte;
        char[] cArrEmptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        if (z) {
            cArrEmptyAndGetCurrentSegment[0] = '-';
            i2 = 1;
        } else {
            i2 = 0;
        }
        int unsignedByte2 = this._inputData.readUnsignedByte();
        int i3 = i2 + 1;
        cArrEmptyAndGetCurrentSegment[i2] = (char) unsignedByte2;
        if (unsignedByte2 <= 48) {
            if (unsignedByte2 != 48) {
                return unsignedByte2 == 46 ? _parseFloatThatStartsWithPeriod(z, true) : _handleInvalidNumberStart(unsignedByte2, z, true);
            }
            unsignedByte = _handleLeadingZeroes();
        } else {
            if (unsignedByte2 > 57) {
                return _handleInvalidNumberStart(unsignedByte2, z, true);
            }
            unsignedByte = this._inputData.readUnsignedByte();
        }
        char[] cArrFinishCurrentSegment = cArrEmptyAndGetCurrentSegment;
        int i4 = 1;
        int unsignedByte3 = unsignedByte;
        int i5 = i3;
        while (unsignedByte3 <= 57 && unsignedByte3 >= 48) {
            i4++;
            if (i5 >= cArrFinishCurrentSegment.length) {
                cArrFinishCurrentSegment = this._textBuffer.finishCurrentSegment();
                i5 = 0;
            }
            cArrFinishCurrentSegment[i5] = (char) unsignedByte3;
            unsignedByte3 = this._inputData.readUnsignedByte();
            i5++;
        }
        if (unsignedByte3 == 46 || (unsignedByte3 | 32) == 101) {
            return _parseFloat(cArrFinishCurrentSegment, i5, unsignedByte3, z, i4);
        }
        this._textBuffer.setCurrentLength(i5);
        this._nextByte = unsignedByte3;
        if (this._parsingContext.inRoot()) {
            _verifyRootSpace();
        }
        return resetInt(z, i4);
    }

    private void _reportInvalidOther(int i2) {
        _reportError("Invalid UTF-8 middle byte 0x".concat(String.valueOf(Integer.toHexString(i2))));
    }

    private final void _skipCComment() throws IOException {
        int[] inputCodeComment = CharTypes.getInputCodeComment();
        int unsignedByte = this._inputData.readUnsignedByte();
        while (true) {
            int i2 = inputCodeComment[unsignedByte];
            if (i2 != 0) {
                if (i2 == 2) {
                    _skipUtf8_2();
                } else if (i2 == 3) {
                    _skipUtf8_3();
                } else if (i2 == 4) {
                    _skipUtf8_4();
                } else if (i2 == 10 || i2 == 13) {
                    this._currInputRow++;
                } else if (i2 != 42) {
                    _reportInvalidChar(unsignedByte);
                } else {
                    unsignedByte = this._inputData.readUnsignedByte();
                    if (unsignedByte == 47) {
                        return;
                    }
                }
            }
            unsignedByte = this._inputData.readUnsignedByte();
        }
    }

    private final int _skipColon() throws IOException {
        int unsignedByte = this._nextByte;
        if (unsignedByte < 0) {
            unsignedByte = this._inputData.readUnsignedByte();
        } else {
            this._nextByte = -1;
        }
        if (unsignedByte == 58) {
            int unsignedByte2 = this._inputData.readUnsignedByte();
            return unsignedByte2 > 32 ? (unsignedByte2 == 47 || unsignedByte2 == 35) ? _skipColon2(unsignedByte2, true) : unsignedByte2 : ((unsignedByte2 == 32 || unsignedByte2 == 9) && (unsignedByte2 = this._inputData.readUnsignedByte()) > 32) ? (unsignedByte2 == 47 || unsignedByte2 == 35) ? _skipColon2(unsignedByte2, true) : unsignedByte2 : _skipColon2(unsignedByte2, true);
        }
        if (unsignedByte == 32 || unsignedByte == 9) {
            unsignedByte = this._inputData.readUnsignedByte();
        }
        if (unsignedByte != 58) {
            return _skipColon2(unsignedByte, false);
        }
        int unsignedByte3 = this._inputData.readUnsignedByte();
        return unsignedByte3 > 32 ? (unsignedByte3 == 47 || unsignedByte3 == 35) ? _skipColon2(unsignedByte3, true) : unsignedByte3 : ((unsignedByte3 == 32 || unsignedByte3 == 9) && (unsignedByte3 = this._inputData.readUnsignedByte()) > 32) ? (unsignedByte3 == 47 || unsignedByte3 == 35) ? _skipColon2(unsignedByte3, true) : unsignedByte3 : _skipColon2(unsignedByte3, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x001a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int _skipColon2(int r3, boolean r4) throws java.io.IOException {
        /*
            r2 = this;
        L0:
            r0 = 32
            r1 = 1
            if (r3 <= r0) goto L26
            r0 = 47
            if (r3 != r0) goto Ld
            r2._skipComment()
            goto L33
        Ld:
            r0 = 35
            if (r3 != r0) goto L18
            boolean r3 = r2._skipYAMLComment()
            if (r3 != 0) goto L33
            r3 = r0
        L18:
            if (r4 == 0) goto L1b
            return r3
        L1b:
            r4 = 58
            if (r3 == r4) goto L24
            java.lang.String r4 = "was expecting a colon to separate field name and value"
            r2._reportUnexpectedChar(r3, r4)
        L24:
            r4 = r1
            goto L33
        L26:
            r0 = 13
            if (r3 == r0) goto L2e
            r0 = 10
            if (r3 != r0) goto L33
        L2e:
            int r3 = r2._currInputRow
            int r3 = r3 + r1
            r2._currInputRow = r3
        L33:
            java.io.DataInput r3 = r2._inputData
            int r3 = r3.readUnsignedByte()
            goto L0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._skipColon2(int, boolean):int");
    }

    private final void _skipComment() throws IOException {
        if ((this._features & FEAT_MASK_ALLOW_JAVA_COMMENTS) == 0) {
            _reportUnexpectedChar(47, "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_COMMENTS' not enabled for parser)");
        }
        int unsignedByte = this._inputData.readUnsignedByte();
        if (unsignedByte == 47) {
            _skipLine();
        } else if (unsignedByte == 42) {
            _skipCComment();
        } else {
            _reportUnexpectedChar(unsignedByte, "was expecting either '*' or '/' for a comment");
        }
    }

    private final void _skipLine() throws IOException {
        int[] inputCodeComment = CharTypes.getInputCodeComment();
        while (true) {
            int unsignedByte = this._inputData.readUnsignedByte();
            int i2 = inputCodeComment[unsignedByte];
            if (i2 != 0) {
                if (i2 == 2) {
                    _skipUtf8_2();
                } else if (i2 == 3) {
                    _skipUtf8_3();
                } else if (i2 == 4) {
                    _skipUtf8_4();
                } else if (i2 == 10 || i2 == 13) {
                    break;
                } else if (i2 != 42 && i2 < 0) {
                    _reportInvalidChar(unsignedByte);
                }
            }
        }
        this._currInputRow++;
    }

    private final void _skipUtf8_2() throws IOException {
        int unsignedByte = this._inputData.readUnsignedByte();
        if ((unsignedByte & 192) != 128) {
            _reportInvalidOther(unsignedByte & 255);
        }
    }

    private final void _skipUtf8_3() throws IOException {
        int unsignedByte = this._inputData.readUnsignedByte();
        if ((unsignedByte & 192) != 128) {
            _reportInvalidOther(unsignedByte & 255);
        }
        int unsignedByte2 = this._inputData.readUnsignedByte();
        if ((unsignedByte2 & 192) != 128) {
            _reportInvalidOther(unsignedByte2 & 255);
        }
    }

    private final void _skipUtf8_4() throws IOException {
        int unsignedByte = this._inputData.readUnsignedByte();
        if ((unsignedByte & 192) != 128) {
            _reportInvalidOther(unsignedByte & 255);
        }
        int unsignedByte2 = this._inputData.readUnsignedByte();
        if ((unsignedByte2 & 192) != 128) {
            _reportInvalidOther(unsignedByte2 & 255);
        }
        int unsignedByte3 = this._inputData.readUnsignedByte();
        if ((unsignedByte3 & 192) != 128) {
            _reportInvalidOther(unsignedByte3 & 255);
        }
    }

    private final int _skipWS() throws IOException {
        int unsignedByte = this._nextByte;
        if (unsignedByte < 0) {
            unsignedByte = this._inputData.readUnsignedByte();
        } else {
            this._nextByte = -1;
        }
        while (unsignedByte <= 32) {
            if (unsignedByte == 13 || unsignedByte == 10) {
                this._currInputRow++;
            }
            unsignedByte = this._inputData.readUnsignedByte();
        }
        return (unsignedByte == 47 || unsignedByte == 35) ? _skipWSComment(unsignedByte) : unsignedByte;
    }

    private final int _skipWSComment(int i2) throws IOException {
        while (true) {
            if (i2 > 32) {
                if (i2 == 47) {
                    _skipComment();
                } else {
                    if (i2 != 35) {
                        return i2;
                    }
                    if (!_skipYAMLComment()) {
                        return 35;
                    }
                }
            } else if (i2 == 13 || i2 == 10) {
                this._currInputRow++;
            }
            i2 = this._inputData.readUnsignedByte();
        }
    }

    private final int _skipWSOrEnd() throws IOException {
        int unsignedByte = this._nextByte;
        if (unsignedByte < 0) {
            try {
                unsignedByte = this._inputData.readUnsignedByte();
            } catch (EOFException unused) {
                _eofAsNextChar();
                return -1;
            }
        } else {
            this._nextByte = -1;
        }
        while (unsignedByte <= 32) {
            if (unsignedByte == 13 || unsignedByte == 10) {
                this._currInputRow++;
            }
            try {
                unsignedByte = this._inputData.readUnsignedByte();
            } catch (EOFException unused2) {
                _eofAsNextChar();
                return -1;
            }
        }
        return (unsignedByte == 47 || unsignedByte == 35) ? _skipWSComment(unsignedByte) : unsignedByte;
    }

    private final boolean _skipYAMLComment() throws IOException {
        if ((this._features & FEAT_MASK_ALLOW_YAML_COMMENTS) == 0) {
            return false;
        }
        _skipLine();
        return true;
    }

    private final void _verifyRootSpace() {
        int i2 = this._nextByte;
        if (i2 > 32) {
            _reportMissingRootWS(i2);
            return;
        }
        this._nextByte = -1;
        if (i2 == 13 || i2 == 10) {
            this._currInputRow++;
        }
    }

    private final String addName(int[] iArr, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = 3;
        if (i3 < 4) {
            int i9 = i2 - 1;
            i4 = iArr[i9];
            iArr[i9] = i4 << ((4 - i3) << 3);
        } else {
            i4 = 0;
        }
        char[] cArrEmptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int i12 = ((i2 << 2) - 4) + i3;
            if (i10 >= i12) {
                break;
            }
            int i13 = iArr[i10 >> 2] >> ((3 - (i10 & 3)) << i8);
            int i14 = i10 + 1;
            int i15 = i13 & 255;
            if (i15 > 127) {
                i5 = i8;
                if ((i13 & 224) == 192) {
                    i6 = i13 & 31;
                    i7 = 1;
                } else if ((i13 & 240) == 224) {
                    i6 = i13 & 15;
                    i7 = 2;
                } else if ((i13 & DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_ENDPOINT_NEW_USER_1) == 240) {
                    i6 = i13 & 7;
                    i7 = i5;
                } else {
                    _reportInvalidInitial(i15);
                    i6 = 1;
                    i7 = 1;
                }
                if (i14 + i7 > i12) {
                    _reportInvalidEOF(" in field name", JsonToken.FIELD_NAME);
                }
                int i16 = iArr[i14 >> 2] >> ((3 - (i14 & 3)) << 3);
                i14 = i10 + 2;
                if ((i16 & 192) != 128) {
                    _reportInvalidOther(i16);
                }
                int i17 = (i6 << 6) | (i16 & 63);
                if (i7 > 1) {
                    int i18 = iArr[i14 >> 2] >> ((3 - (i14 & 3)) << 3);
                    i14 = i10 + 3;
                    if ((i18 & 192) != 128) {
                        _reportInvalidOther(i18);
                    }
                    i17 = (i17 << 6) | (i18 & 63);
                    if (i7 > 2) {
                        int i19 = iArr[i14 >> 2] >> ((3 - (i14 & 3)) << 3);
                        i14 = i10 + 4;
                        if ((i19 & 192) != 128) {
                            _reportInvalidOther(i19 & 255);
                        }
                        i17 = (i17 << 6) | (i19 & 63);
                    }
                }
                i15 = i17;
                if (i7 > 2) {
                    int i20 = i15 + SupportMenu.CATEGORY_MASK;
                    if (i11 >= cArrEmptyAndGetCurrentSegment.length) {
                        cArrEmptyAndGetCurrentSegment = this._textBuffer.expandCurrentSegment();
                    }
                    cArrEmptyAndGetCurrentSegment[i11] = (char) ((i20 >> 10) + 55296);
                    i15 = (i20 & 1023) | 56320;
                    i11++;
                }
            } else {
                i5 = i8;
            }
            i10 = i14;
            if (i11 >= cArrEmptyAndGetCurrentSegment.length) {
                cArrEmptyAndGetCurrentSegment = this._textBuffer.expandCurrentSegment();
            }
            cArrEmptyAndGetCurrentSegment[i11] = (char) i15;
            i11++;
            i8 = i5;
        }
        String str = new String(cArrEmptyAndGetCurrentSegment, 0, i11);
        if (!this._symbols.isCanonicalizing()) {
            return str;
        }
        if (i3 < 4) {
            iArr[i2 - 1] = i4;
        }
        return this._symbols.addName(str, iArr, i2);
    }

    private final String findName(int i2, int i3, int i4, int i5) {
        ByteQuadsCanonicalizer byteQuadsCanonicalizer = this._symbols;
        int iPad = pad(i4, i5);
        String strFindName = byteQuadsCanonicalizer.findName(i2, i3, iPad);
        if (strFindName != null) {
            return strFindName;
        }
        int[] iArr = this._quadBuffer;
        iArr[0] = i2;
        iArr[1] = i3;
        iArr[2] = pad(iPad, i5);
        return addName(iArr, 3, i5);
    }

    private static final int pad(int i2, int i3) {
        return i3 == 4 ? i2 : i2 | ((-1) << (i3 << 3));
    }

    private final String parseName(int i2, int i3, int i4, int i5) {
        int[] iArr = this._quadBuffer;
        iArr[0] = i2;
        return parseEscapedName(iArr, 1, i3, i4, i5);
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase
    protected void _closeInput() {
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase
    protected JsonLocation _currentLocationMinusOne() {
        return currentLocation();
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0084, code lost:
    
        throw reportInvalidBase64Char(r10, r2, 3, com.fasterxml.jackson.core.json.a.a(r10));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final byte[] _decodeBase64(com.fasterxml.jackson.core.Base64Variant r10) throws java.io.IOException {
        /*
            r9 = this;
            com.fasterxml.jackson.core.util.ByteArrayBuilder r0 = r9._getByteArrayBuilder()
        L4:
            java.io.DataInput r1 = r9._inputData
            int r1 = r1.readUnsignedByte()
            r2 = 32
            if (r1 <= r2) goto L4
            int r2 = r10.decodeBase64Char(r1)
            r3 = 34
            if (r2 >= 0) goto L24
            if (r1 != r3) goto L1d
            byte[] r9 = r0.toByteArray()
            return r9
        L1d:
            r2 = 0
            int r2 = r9._decodeBase64Escape(r10, r1, r2)
            if (r2 < 0) goto L4
        L24:
            java.io.DataInput r1 = r9._inputData
            int r1 = r1.readUnsignedByte()
            int r4 = r10.decodeBase64Char(r1)
            if (r4 >= 0) goto L35
            r4 = 1
            int r4 = r9._decodeBase64Escape(r10, r1, r4)
        L35:
            int r1 = r2 << 6
            java.io.DataInput r2 = r9._inputData
            int r2 = r2.readUnsignedByte()
            int r5 = r10.decodeBase64Char(r2)
            r1 = r1 | r4
            r4 = 3
            r6 = 2
            r7 = -2
            if (r5 >= 0) goto L8c
            if (r5 == r7) goto L62
            if (r2 != r3) goto L5e
            int r1 = r1 >> 4
            r0.append(r1)
            boolean r1 = r10.requiresPaddingOnRead()
            if (r1 == 0) goto L59
            r9._handleBase64MissingPadding(r10)
        L59:
            byte[] r9 = r0.toByteArray()
            return r9
        L5e:
            int r5 = r9._decodeBase64Escape(r10, r2, r6)
        L62:
            if (r5 != r7) goto L8c
            java.io.DataInput r2 = r9._inputData
            int r2 = r2.readUnsignedByte()
            boolean r3 = r10.usesPaddingChar(r2)
            if (r3 != 0) goto L85
            r3 = 92
            if (r2 != r3) goto L7c
            int r2 = r9._decodeBase64Escape(r10, r3, r4)
            if (r2 != r7) goto L7b
            goto L85
        L7b:
            r2 = r3
        L7c:
            java.lang.String r0 = com.fasterxml.jackson.core.json.a.a(r10)
            java.lang.IllegalArgumentException r9 = r9.reportInvalidBase64Char(r10, r2, r4, r0)
            throw r9
        L85:
            int r1 = r1 >> 4
            r0.append(r1)
            goto L4
        L8c:
            int r1 = r1 << 6
            java.io.DataInput r2 = r9._inputData
            int r2 = r2.readUnsignedByte()
            int r8 = r10.decodeBase64Char(r2)
            r1 = r1 | r5
            if (r8 >= 0) goto Lbe
            if (r8 == r7) goto Lb5
            if (r2 != r3) goto Lb1
            int r1 = r1 >> r6
            r0.appendTwoBytes(r1)
            boolean r1 = r10.requiresPaddingOnRead()
            if (r1 == 0) goto Lac
            r9._handleBase64MissingPadding(r10)
        Lac:
            byte[] r9 = r0.toByteArray()
            return r9
        Lb1:
            int r8 = r9._decodeBase64Escape(r10, r2, r4)
        Lb5:
            if (r8 != r7) goto Lbe
            int r1 = r1 >> 2
            r0.appendTwoBytes(r1)
            goto L4
        Lbe:
            int r1 = r1 << 6
            r1 = r1 | r8
            r0.appendThreeBytes(r1)
            goto L4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._decodeBase64(com.fasterxml.jackson.core.Base64Variant):byte[]");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected int _decodeCharForError(int r7) throws java.io.IOException {
        /*
            r6 = this;
            r0 = r7 & 255(0xff, float:3.57E-43)
            r1 = 127(0x7f, float:1.78E-43)
            if (r0 <= r1) goto L6d
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
            java.io.DataInput r1 = r6._inputData
            int r1 = r1.readUnsignedByte()
            r4 = r1 & 192(0xc0, float:2.69E-43)
            r5 = 128(0x80, float:1.8E-43)
            if (r4 == r5) goto L3b
            r4 = r1 & 255(0xff, float:3.57E-43)
            r6._reportInvalidOther(r4)
        L3b:
            int r0 = r0 << 6
            r1 = r1 & 63
            r0 = r0 | r1
            if (r7 <= r3) goto L6d
            java.io.DataInput r1 = r6._inputData
            int r1 = r1.readUnsignedByte()
            r3 = r1 & 192(0xc0, float:2.69E-43)
            if (r3 == r5) goto L51
            r3 = r1 & 255(0xff, float:3.57E-43)
            r6._reportInvalidOther(r3)
        L51:
            int r0 = r0 << 6
            r1 = r1 & 63
            r0 = r0 | r1
            if (r7 <= r2) goto L6d
            java.io.DataInput r7 = r6._inputData
            int r7 = r7.readUnsignedByte()
            r1 = r7 & 192(0xc0, float:2.69E-43)
            if (r1 == r5) goto L67
            r1 = r7 & 255(0xff, float:3.57E-43)
            r6._reportInvalidOther(r1)
        L67:
            int r6 = r0 << 6
            r7 = r7 & 63
            r6 = r6 | r7
            return r6
        L6d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._decodeCharForError(int):int");
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase
    protected char _decodeEscaped() throws IOException {
        int unsignedByte = this._inputData.readUnsignedByte();
        if (unsignedByte == 34 || unsignedByte == 47 || unsignedByte == 92) {
            return (char) unsignedByte;
        }
        if (unsignedByte == 98) {
            return '\b';
        }
        if (unsignedByte == 102) {
            return '\f';
        }
        if (unsignedByte == 110) {
            return '\n';
        }
        if (unsignedByte == 114) {
            return '\r';
        }
        if (unsignedByte == 116) {
            return '\t';
        }
        if (unsignedByte != 117) {
            char c_decodeCharForError = (char) _decodeCharForError(unsignedByte);
            _handleUnrecognizedCharacterEscape(c_decodeCharForError);
            return c_decodeCharForError;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < 4; i3++) {
            int unsignedByte2 = this._inputData.readUnsignedByte();
            int iCharToHex = CharTypes.charToHex(unsignedByte2);
            if (iCharToHex < 0) {
                _reportUnexpectedChar(unsignedByte2, "expected a hex-digit for character escape sequence");
            }
            i2 = (i2 << 4) | iCharToHex;
        }
        return (char) i2;
    }

    protected void _finishString() throws IOException {
        char[] cArrEmptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        int length = cArrEmptyAndGetCurrentSegment.length;
        int[] iArr = INPUT_CODES_UTF8;
        int i2 = 0;
        while (true) {
            int unsignedByte = this._inputData.readUnsignedByte();
            if (iArr[unsignedByte] != 0) {
                if (unsignedByte == 34) {
                    this._textBuffer.setCurrentLength(i2);
                    return;
                } else {
                    _finishString2(cArrEmptyAndGetCurrentSegment, i2, unsignedByte);
                    return;
                }
            }
            int i3 = i2 + 1;
            cArrEmptyAndGetCurrentSegment[i2] = (char) unsignedByte;
            if (i3 >= length) {
                _finishString2(cArrEmptyAndGetCurrentSegment, i3, this._inputData.readUnsignedByte());
                return;
            }
            i2 = i3;
        }
    }

    protected final String _getText2(JsonToken jsonToken) {
        if (jsonToken == null) {
            return null;
        }
        int iId = jsonToken.id();
        return iId != 5 ? (iId == 6 || iId == 7 || iId == 8) ? this._textBuffer.contentsAsString() : jsonToken.asString() : this._parsingContext.getCurrentName();
    }

    protected JsonToken _handleApos() throws IOException {
        char[] cArrEmptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        int[] iArr = INPUT_CODES_UTF8;
        int i2 = 0;
        while (true) {
            int length = cArrEmptyAndGetCurrentSegment.length;
            if (i2 >= length) {
                cArrEmptyAndGetCurrentSegment = this._textBuffer.finishCurrentSegment();
                length = cArrEmptyAndGetCurrentSegment.length;
                i2 = 0;
            }
            while (true) {
                int unsignedByte = this._inputData.readUnsignedByte();
                if (unsignedByte == 39) {
                    this._textBuffer.setCurrentLength(i2);
                    return JsonToken.VALUE_STRING;
                }
                int i3 = iArr[unsignedByte];
                if (i3 == 0 || unsignedByte == 34) {
                    int i4 = i2 + 1;
                    cArrEmptyAndGetCurrentSegment[i2] = (char) unsignedByte;
                    i2 = i4;
                    if (i4 >= length) {
                        break;
                    }
                } else {
                    if (i3 == 1) {
                        unsignedByte = _decodeEscaped();
                    } else if (i3 == 2) {
                        unsignedByte = _decodeUtf8_2(unsignedByte);
                    } else if (i3 == 3) {
                        unsignedByte = _decodeUtf8_3(unsignedByte);
                    } else if (i3 != 4) {
                        if (unsignedByte < 32) {
                            _throwUnquotedSpace(unsignedByte, "string value");
                        }
                        _reportInvalidChar(unsignedByte);
                    } else {
                        int i5 = i2 + 1;
                        int i_decodeUtf8_4 = _decodeUtf8_4(unsignedByte);
                        cArrEmptyAndGetCurrentSegment[i2] = (char) ((i_decodeUtf8_4 >> 10) | 55296);
                        if (i5 >= cArrEmptyAndGetCurrentSegment.length) {
                            cArrEmptyAndGetCurrentSegment = this._textBuffer.finishCurrentSegment();
                            i2 = 0;
                        } else {
                            i2 = i5;
                        }
                        unsignedByte = 56320 | (i_decodeUtf8_4 & 1023);
                    }
                    if (i2 >= cArrEmptyAndGetCurrentSegment.length) {
                        cArrEmptyAndGetCurrentSegment = this._textBuffer.finishCurrentSegment();
                        i2 = 0;
                    }
                    cArrEmptyAndGetCurrentSegment[i2] = (char) unsignedByte;
                    i2++;
                }
            }
        }
    }

    protected JsonToken _handleInvalidNumberStart(int i2, boolean z, boolean z2) throws IOException {
        String str;
        while (i2 == 73) {
            i2 = this._inputData.readUnsignedByte();
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
            _reportError("Non-standard token '" + str + "': enable `JsonReadFeature.ALLOW_NON_NUMERIC_NUMBERS` to allow");
        }
        if (!isEnabled(JsonReadFeature.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS.mappedFeature()) && z2 && !z) {
            _reportUnexpectedNumberChar(43, "JSON spec does not allow numbers to have plus signs: enable `JsonReadFeature.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS` to allow");
        }
        _reportUnexpectedNumberChar(i2, true != z ? "expected digit (0-9) for valid numeric value" : "expected digit (0-9) to follow minus sign, for valid numeric value");
        return null;
    }

    protected String _handleOddName(int i2) throws IOException {
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
        int[] iArrGrowArrayBy = this._quadBuffer;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        do {
            if (i3 < 4) {
                i2 |= i5 << 8;
                i3++;
            } else {
                int length = iArrGrowArrayBy.length;
                if (i4 >= length) {
                    iArrGrowArrayBy = growArrayBy(iArrGrowArrayBy, length);
                    this._quadBuffer = iArrGrowArrayBy;
                }
                iArrGrowArrayBy[i4] = i5;
                i4++;
                i3 = 1;
            }
            i5 = i2;
            i2 = this._inputData.readUnsignedByte();
        } while (inputCodeUtf8JsNames[i2] == 0);
        this._nextByte = i2;
        if (i3 > 0) {
            int length2 = iArrGrowArrayBy.length;
            if (i4 >= length2) {
                int[] iArrGrowArrayBy2 = growArrayBy(iArrGrowArrayBy, length2);
                this._quadBuffer = iArrGrowArrayBy2;
                iArrGrowArrayBy = iArrGrowArrayBy2;
            }
            iArrGrowArrayBy[i4] = i5;
            i4++;
        }
        String strFindName = this._symbols.findName(iArrGrowArrayBy, i4);
        return strFindName == null ? addName(iArrGrowArrayBy, i4, i3) : strFindName;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001b, code lost:
    
        if (r4 != 44) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0030, code lost:
    
        if (r3._parsingContext.inArray() != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0038, code lost:
    
        if (r3._parsingContext.inRoot() != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x003f, code lost:
    
        if ((r3._features & com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.FEAT_MASK_ALLOW_MISSING) == 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0041, code lost:
    
        r3._nextByte = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0045, code lost:
    
        return com.fasterxml.jackson.core.JsonToken.VALUE_NULL;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected com.fasterxml.jackson.core.JsonToken _handleUnexpectedValue(int r4) throws java.io.IOException {
        /*
            r3 = this;
            r0 = 39
            if (r4 == r0) goto L7e
            r0 = 73
            r1 = 1
            if (r4 == r0) goto L65
            r0 = 78
            if (r4 == r0) goto L4c
            r0 = 93
            if (r4 == r0) goto L2a
            r0 = 125(0x7d, float:1.75E-43)
            if (r4 == r0) goto L46
            r0 = 43
            if (r4 == r0) goto L1e
            r0 = 44
            if (r4 == r0) goto L32
            goto L8a
        L1e:
            java.io.DataInput r4 = r3._inputData
            int r4 = r4.readUnsignedByte()
            r0 = 0
            com.fasterxml.jackson.core.JsonToken r3 = r3._handleInvalidNumberStart(r4, r0, r1)
            return r3
        L2a:
            com.fasterxml.jackson.core.json.JsonReadContext r0 = r3._parsingContext
            boolean r0 = r0.inArray()
            if (r0 == 0) goto L8a
        L32:
            com.fasterxml.jackson.core.json.JsonReadContext r0 = r3._parsingContext
            boolean r0 = r0.inRoot()
            if (r0 != 0) goto L46
            int r0 = r3._features
            int r1 = com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.FEAT_MASK_ALLOW_MISSING
            r0 = r0 & r1
            if (r0 == 0) goto L46
            r3._nextByte = r4
            com.fasterxml.jackson.core.JsonToken r3 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL
            return r3
        L46:
            java.lang.String r0 = "expected a value"
            r3._reportUnexpectedChar(r4, r0)
            goto L7e
        L4c:
            java.lang.String r0 = "NaN"
            r3._matchToken(r0, r1)
            int r1 = r3._features
            int r2 = com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.FEAT_MASK_NON_NUM_NUMBERS
            r1 = r1 & r2
            if (r1 == 0) goto L5f
            r1 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            com.fasterxml.jackson.core.JsonToken r3 = r3.resetAsNaN(r0, r1)
            return r3
        L5f:
            java.lang.String r0 = "Non-standard token 'NaN': enable `JsonReadFeature.ALLOW_NON_NUMERIC_NUMBERS` to allow"
            r3._reportError(r0)
            goto L8a
        L65:
            java.lang.String r0 = "Infinity"
            r3._matchToken(r0, r1)
            int r1 = r3._features
            int r2 = com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.FEAT_MASK_NON_NUM_NUMBERS
            r1 = r1 & r2
            if (r1 == 0) goto L78
            r1 = 9218868437227405312(0x7ff0000000000000, double:Infinity)
            com.fasterxml.jackson.core.JsonToken r3 = r3.resetAsNaN(r0, r1)
            return r3
        L78:
            java.lang.String r0 = "Non-standard token 'Infinity': enable `JsonReadFeature.ALLOW_NON_NUMERIC_NUMBERS` to allow"
            r3._reportError(r0)
            goto L8a
        L7e:
            int r0 = r3._features
            int r1 = com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.FEAT_MASK_ALLOW_SINGLE_QUOTES
            r0 = r0 & r1
            if (r0 == 0) goto L8a
            com.fasterxml.jackson.core.JsonToken r3 = r3._handleApos()
            return r3
        L8a:
            boolean r0 = java.lang.Character.isJavaIdentifierStart(r4)
            if (r0 == 0) goto La4
            char r0 = (char) r4
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = r3._validJsonTokenList()
            r3._reportInvalidToken(r4, r0, r1)
        La4:
            java.lang.String r0 = r3._validJsonValueList()
            java.lang.String r1 = "expected a valid value "
            java.lang.String r0 = r1.concat(r0)
            r3._reportUnexpectedChar(r4, r0)
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._handleUnexpectedValue(int):com.fasterxml.jackson.core.JsonToken");
    }

    protected final void _matchToken(String str, int i2) throws IOException {
        do {
            int unsignedByte = this._inputData.readUnsignedByte();
            if (unsignedByte != str.charAt(i2)) {
                _reportInvalidToken(unsignedByte, str.substring(0, i2));
            }
            i2++;
        } while (i2 < str.length());
        int unsignedByte2 = this._inputData.readUnsignedByte();
        if (unsignedByte2 >= 48 && unsignedByte2 != 93 && unsignedByte2 != 125) {
            _checkMatchEnd(str, i2, unsignedByte2);
        }
        this._nextByte = unsignedByte2;
    }

    protected String _parseAposName() throws IOException {
        int unsignedByte = this._inputData.readUnsignedByte();
        if (unsignedByte == 39) {
            return "";
        }
        int[] iArrGrowArrayBy = this._quadBuffer;
        int[] iArr = INPUT_CODES_LATIN1;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (unsignedByte != 39) {
            if (unsignedByte != 34 && iArr[unsignedByte] != 0) {
                if (unsignedByte != 92) {
                    _throwUnquotedSpace(unsignedByte, HintConstants.AUTOFILL_HINT_NAME);
                } else {
                    unsignedByte = _decodeEscaped();
                }
                if (unsignedByte > 127) {
                    if (i2 >= 4) {
                        int i5 = i4 + 1;
                        int length = iArrGrowArrayBy.length;
                        if (i4 >= length) {
                            iArrGrowArrayBy = growArrayBy(iArrGrowArrayBy, length);
                            this._quadBuffer = iArrGrowArrayBy;
                        }
                        iArrGrowArrayBy[i4] = i3;
                        i3 = 0;
                        i4 = i5;
                        i2 = 0;
                    }
                    i2++;
                    int i6 = i3 << 8;
                    if (unsignedByte < 2048) {
                        i3 = i6 | (unsignedByte >> 6) | 192;
                    } else {
                        int i7 = i6 | (unsignedByte >> 12) | 224;
                        if (i2 >= 4) {
                            int length2 = iArrGrowArrayBy.length;
                            if (i4 >= length2) {
                                iArrGrowArrayBy = growArrayBy(iArrGrowArrayBy, length2);
                                this._quadBuffer = iArrGrowArrayBy;
                            }
                            iArrGrowArrayBy[i4] = i7;
                            i7 = 0;
                            i4++;
                            i2 = 0;
                        }
                        i3 = (i7 << 8) | ((unsignedByte >> 6) & 63) | 128;
                        i2++;
                    }
                    unsignedByte = (unsignedByte & 63) | 128;
                }
            }
            if (i2 < 4) {
                unsignedByte |= i3 << 8;
                i2++;
            } else {
                int length3 = iArrGrowArrayBy.length;
                if (i4 >= length3) {
                    iArrGrowArrayBy = growArrayBy(iArrGrowArrayBy, length3);
                    this._quadBuffer = iArrGrowArrayBy;
                }
                iArrGrowArrayBy[i4] = i3;
                i4++;
                i2 = 1;
            }
            i3 = unsignedByte;
            unsignedByte = this._inputData.readUnsignedByte();
        }
        if (i2 > 0) {
            int i8 = i4 + 1;
            int length4 = iArrGrowArrayBy.length;
            if (i4 >= length4) {
                int[] iArrGrowArrayBy2 = growArrayBy(iArrGrowArrayBy, length4);
                this._quadBuffer = iArrGrowArrayBy2;
                iArrGrowArrayBy = iArrGrowArrayBy2;
            }
            iArrGrowArrayBy[i4] = pad(i3, i2);
            i4 = i8;
        }
        String strFindName = this._symbols.findName(iArrGrowArrayBy, i4);
        return strFindName == null ? addName(iArrGrowArrayBy, i4, i2) : strFindName;
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

    protected final String _parseName(int i2) throws IOException {
        if (i2 != 34) {
            return _handleOddName(i2);
        }
        int[] iArr = INPUT_CODES_LATIN1;
        int unsignedByte = this._inputData.readUnsignedByte();
        if (iArr[unsignedByte] != 0) {
            return unsignedByte == 34 ? "" : parseName(0, unsignedByte, 0);
        }
        int unsignedByte2 = this._inputData.readUnsignedByte();
        if (iArr[unsignedByte2] != 0) {
            return unsignedByte2 == 34 ? findName(unsignedByte, 1) : parseName(unsignedByte, unsignedByte2, 1);
        }
        int i3 = (unsignedByte << 8) | unsignedByte2;
        int unsignedByte3 = this._inputData.readUnsignedByte();
        if (iArr[unsignedByte3] != 0) {
            return unsignedByte3 == 34 ? findName(i3, 2) : parseName(i3, unsignedByte3, 2);
        }
        int i4 = (i3 << 8) | unsignedByte3;
        int unsignedByte4 = this._inputData.readUnsignedByte();
        if (iArr[unsignedByte4] != 0) {
            return unsignedByte4 == 34 ? findName(i4, 3) : parseName(i4, unsignedByte4, 3);
        }
        int i5 = (i4 << 8) | unsignedByte4;
        int unsignedByte5 = this._inputData.readUnsignedByte();
        if (iArr[unsignedByte5] != 0) {
            return unsignedByte5 == 34 ? findName(i5, 4) : parseName(i5, unsignedByte5, 4);
        }
        this._quad1 = i5;
        return _parseMediumName(unsignedByte5);
    }

    protected final JsonToken _parseNegNumber() {
        return _parseSignedNumber(true);
    }

    protected final JsonToken _parsePosNumber() {
        return _parseSignedNumber(false);
    }

    protected JsonToken _parseUnsignedNumber(int i2) throws IOException {
        int unsignedByte;
        char[] cArrEmptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        int i3 = 1;
        if (i2 == 48) {
            unsignedByte = _handleLeadingZeroes();
            if (unsignedByte <= 57 && unsignedByte >= 48) {
                i3 = 0;
            } else {
                if (unsignedByte == 120 || unsignedByte == 88) {
                    return _handleInvalidNumberStart(unsignedByte, false);
                }
                cArrEmptyAndGetCurrentSegment[0] = '0';
            }
        } else {
            cArrEmptyAndGetCurrentSegment[0] = (char) i2;
            unsignedByte = this._inputData.readUnsignedByte();
        }
        int unsignedByte2 = unsignedByte;
        char[] cArrFinishCurrentSegment = cArrEmptyAndGetCurrentSegment;
        int i4 = i3;
        int i5 = i4;
        while (unsignedByte2 <= 57 && unsignedByte2 >= 48) {
            i5++;
            if (i4 >= cArrFinishCurrentSegment.length) {
                cArrFinishCurrentSegment = this._textBuffer.finishCurrentSegment();
                i4 = 0;
            }
            cArrFinishCurrentSegment[i4] = (char) unsignedByte2;
            unsignedByte2 = this._inputData.readUnsignedByte();
            i4++;
        }
        if (unsignedByte2 == 46 || (unsignedByte2 | 32) == 101) {
            return _parseFloat(cArrFinishCurrentSegment, i4, unsignedByte2, false, i5);
        }
        this._textBuffer.setCurrentLength(i4);
        this._nextByte = unsignedByte2;
        if (this._parsingContext.inRoot()) {
            _verifyRootSpace();
        }
        return resetInt(false, i5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0086, code lost:
    
        throw reportInvalidBase64Char(r13, r4, 3, com.fasterxml.jackson.core.json.a.a(r13));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected int _readBinary(com.fasterxml.jackson.core.Base64Variant r13, java.io.OutputStream r14, byte[] r15) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._readBinary(com.fasterxml.jackson.core.Base64Variant, java.io.OutputStream, byte[]):int");
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase
    protected void _releaseBuffers() {
        super._releaseBuffers();
        this._symbols.release();
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

    protected void _reportInvalidToken(int i2, String str, String str2) throws IOException {
        StringBuilder sb = new StringBuilder(str);
        while (true) {
            char c_decodeCharForError = (char) _decodeCharForError(i2);
            if (!Character.isJavaIdentifierPart(c_decodeCharForError)) {
                _reportError("Unrecognized token '" + sb.toString() + "': was expecting " + str2);
                return;
            }
            sb.append(c_decodeCharForError);
            i2 = this._inputData.readUnsignedByte();
        }
    }

    protected void _skipString() throws IOException {
        this._tokenIncomplete = false;
        int[] iArr = INPUT_CODES_UTF8;
        while (true) {
            int unsignedByte = this._inputData.readUnsignedByte();
            int i2 = iArr[unsignedByte];
            if (i2 != 0) {
                if (unsignedByte == 34) {
                    return;
                }
                if (i2 == 1) {
                    _decodeEscaped();
                } else if (i2 == 2) {
                    _skipUtf8_2();
                } else if (i2 == 3) {
                    _skipUtf8_3();
                } else if (i2 == 4) {
                    _skipUtf8_4();
                } else if (unsignedByte < 32) {
                    _throwUnquotedSpace(unsignedByte, "string value");
                } else {
                    _reportInvalidChar(unsignedByte);
                }
            }
        }
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonLocation currentLocation() {
        return new JsonLocation(_contentReference(), -1L, -1L, this._currInputRow, -1);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonLocation currentTokenLocation() {
        return new JsonLocation(_contentReference(), -1L, -1L, this._tokenInputRow, -1);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public void finishToken() throws IOException {
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
        return this._inputData;
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
    public char[] getTextCharacters() throws IOException {
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
    public int getTextLength() throws IOException {
        if (this._currToken == JsonToken.VALUE_STRING) {
            if (this._tokenIncomplete) {
                this._tokenIncomplete = false;
                _finishString();
            }
            return this._textBuffer.size();
        }
        JsonToken jsonToken = this._currToken;
        if (jsonToken == JsonToken.FIELD_NAME) {
            return this._parsingContext.getCurrentName().length();
        }
        if (jsonToken != null) {
            return jsonToken.isNumeric() ? this._textBuffer.size() : jsonToken.asCharArray().length;
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0011, code lost:
    
        if (r0 != 8) goto L16;
     */
    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int getTextOffset() throws java.io.IOException {
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
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getTextOffset():int");
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
    public java.lang.Boolean nextBooleanValue() throws java.io.IOException {
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
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.nextBooleanValue():java.lang.Boolean");
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public String nextFieldName() throws IOException {
        JsonToken jsonToken_parsePosNumber;
        this._numTypesValid = 0;
        if (this._currToken == JsonToken.FIELD_NAME) {
            _nextAfterName();
            return null;
        }
        if (this._tokenIncomplete) {
            _skipString();
        }
        int i_skipWS = _skipWS();
        this._binaryValue = null;
        this._tokenInputRow = this._currInputRow;
        if ((i_skipWS | 32) == 125) {
            _closeScope(i_skipWS);
            return null;
        }
        if (this._parsingContext.expectComma()) {
            if (i_skipWS != 44) {
                _reportUnexpectedChar(i_skipWS, "was expecting comma to separate " + this._parsingContext.typeDesc() + " entries");
            }
            i_skipWS = _skipWS();
            if ((this._features & FEAT_MASK_TRAILING_COMMA) != 0 && (i_skipWS | 32) == 125) {
                _closeScope(i_skipWS);
                return null;
            }
        }
        if (!this._parsingContext.inObject()) {
            _nextTokenNotInObject(i_skipWS);
            return null;
        }
        String str_parseName = _parseName(i_skipWS);
        this._parsingContext.setCurrentName(str_parseName);
        _updateToken(JsonToken.FIELD_NAME);
        int i_skipColon = _skipColon();
        if (i_skipColon == 34) {
            this._tokenIncomplete = true;
            this._nextToken = JsonToken.VALUE_STRING;
            return str_parseName;
        }
        if (i_skipColon == 43) {
            jsonToken_parsePosNumber = isEnabled(JsonReadFeature.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS.mappedFeature()) ? _parsePosNumber() : _handleUnexpectedValue(i_skipColon);
        } else if (i_skipColon == 91) {
            jsonToken_parsePosNumber = JsonToken.START_ARRAY;
        } else if (i_skipColon == 102) {
            _matchToken(CredentialEntry.FALSE_STRING, 1);
            jsonToken_parsePosNumber = JsonToken.VALUE_FALSE;
        } else if (i_skipColon == 110) {
            _matchToken("null", 1);
            jsonToken_parsePosNumber = JsonToken.VALUE_NULL;
        } else if (i_skipColon == 116) {
            _matchToken(CredentialEntry.TRUE_STRING, 1);
            jsonToken_parsePosNumber = JsonToken.VALUE_TRUE;
        } else if (i_skipColon == 123) {
            jsonToken_parsePosNumber = JsonToken.START_OBJECT;
        } else if (i_skipColon != 45) {
            if (i_skipColon != 46) {
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
                        break;
                    default:
                        jsonToken_parsePosNumber = _handleUnexpectedValue(i_skipColon);
                        break;
                }
            } else {
                _parseFloatThatStartsWithPeriod(false, false);
            }
            jsonToken_parsePosNumber = _parseUnsignedNumber(i_skipColon);
        } else {
            jsonToken_parsePosNumber = _parseNegNumber();
        }
        this._nextToken = jsonToken_parsePosNumber;
        return str_parseName;
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

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public JsonToken nextToken() throws IOException {
        JsonToken jsonToken_parsePosNumber;
        if (this._closed) {
            return null;
        }
        if (this._currToken == JsonToken.FIELD_NAME) {
            return _nextAfterName();
        }
        this._numTypesValid = 0;
        if (this._tokenIncomplete) {
            _skipString();
        }
        int i_skipWSOrEnd = _skipWSOrEnd();
        if (i_skipWSOrEnd < 0) {
            close();
            _updateTokenToNull();
            return null;
        }
        this._binaryValue = null;
        this._tokenInputRow = this._currInputRow;
        if ((i_skipWSOrEnd | 32) == 125) {
            _closeScope(i_skipWSOrEnd);
            return this._currToken;
        }
        if (this._parsingContext.expectComma()) {
            if (i_skipWSOrEnd != 44) {
                _reportUnexpectedChar(i_skipWSOrEnd, "was expecting comma to separate " + this._parsingContext.typeDesc() + " entries");
            }
            i_skipWSOrEnd = _skipWS();
            if ((this._features & FEAT_MASK_TRAILING_COMMA) != 0 && (i_skipWSOrEnd | 32) == 125) {
                _closeScope(i_skipWSOrEnd);
                return this._currToken;
            }
        }
        if (!this._parsingContext.inObject()) {
            return _nextTokenNotInObject(i_skipWSOrEnd);
        }
        this._parsingContext.setCurrentName(_parseName(i_skipWSOrEnd));
        _updateToken(JsonToken.FIELD_NAME);
        int i_skipColon = _skipColon();
        if (i_skipColon == 34) {
            this._tokenIncomplete = true;
            this._nextToken = JsonToken.VALUE_STRING;
            return this._currToken;
        }
        if (i_skipColon == 43) {
            jsonToken_parsePosNumber = isEnabled(JsonReadFeature.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS.mappedFeature()) ? _parsePosNumber() : _handleUnexpectedValue(i_skipColon);
        } else if (i_skipColon == 91) {
            jsonToken_parsePosNumber = JsonToken.START_ARRAY;
        } else if (i_skipColon == 102) {
            _matchToken(CredentialEntry.FALSE_STRING, 1);
            jsonToken_parsePosNumber = JsonToken.VALUE_FALSE;
        } else if (i_skipColon == 110) {
            _matchToken("null", 1);
            jsonToken_parsePosNumber = JsonToken.VALUE_NULL;
        } else if (i_skipColon == 116) {
            _matchToken(CredentialEntry.TRUE_STRING, 1);
            jsonToken_parsePosNumber = JsonToken.VALUE_TRUE;
        } else if (i_skipColon == 123) {
            jsonToken_parsePosNumber = JsonToken.START_OBJECT;
        } else if (i_skipColon == 45) {
            jsonToken_parsePosNumber = _parseNegNumber();
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
                    jsonToken_parsePosNumber = _parseUnsignedNumber(i_skipColon);
                    break;
                default:
                    jsonToken_parsePosNumber = _handleUnexpectedValue(i_skipColon);
                    break;
            }
        } else {
            jsonToken_parsePosNumber = _parseFloatThatStartsWithPeriod(false, false);
        }
        this._nextToken = jsonToken_parsePosNumber;
        return this._currToken;
    }

    protected final String parseEscapedName(int[] iArr, int i2, int i3, int i4, int i5) throws IOException {
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
                            iArr = growArrayBy(iArr, length);
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
                                iArr = growArrayBy(iArr, length2);
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
                    iArr = growArrayBy(iArr, length3);
                    this._quadBuffer = iArr;
                }
                iArr[i2] = i3;
                i3 = i4;
                i2++;
                i5 = 1;
            }
            i4 = this._inputData.readUnsignedByte();
        }
        if (i5 > 0) {
            int length4 = iArr.length;
            if (i2 >= length4) {
                iArr = growArrayBy(iArr, length4);
                this._quadBuffer = iArr;
            }
            iArr[i2] = pad(i3, i5);
            i2++;
        }
        String strFindName = this._symbols.findName(iArr, i2);
        return strFindName == null ? addName(iArr, i2, i5) : strFindName;
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
    public int releaseBuffered(OutputStream outputStream) {
        return 0;
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

    private final String findName(int i2, int i3, int i4) {
        ByteQuadsCanonicalizer byteQuadsCanonicalizer = this._symbols;
        int iPad = pad(i3, i4);
        String strFindName = byteQuadsCanonicalizer.findName(i2, iPad);
        if (strFindName != null) {
            return strFindName;
        }
        int[] iArr = this._quadBuffer;
        iArr[0] = i2;
        iArr[1] = iPad;
        return addName(iArr, 2, i4);
    }

    private final String findName(int i2, int i3) {
        ByteQuadsCanonicalizer byteQuadsCanonicalizer = this._symbols;
        int iPad = pad(i2, i3);
        String strFindName = byteQuadsCanonicalizer.findName(iPad);
        if (strFindName != null) {
            return strFindName;
        }
        int[] iArr = this._quadBuffer;
        iArr[0] = iPad;
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

    private final String findName(int[] iArr, int i2, int i3, int i4) {
        int length = iArr.length;
        if (i2 >= length) {
            iArr = growArrayBy(iArr, length);
            this._quadBuffer = iArr;
        }
        int i5 = i2 + 1;
        iArr[i2] = pad(i3, i4);
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

    protected void _reportInvalidToken(int i2, String str) throws IOException {
        _reportInvalidToken(i2, str, _validJsonTokenList());
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

    protected JsonToken _handleInvalidNumberStart(int i2, boolean z) {
        return _handleInvalidNumberStart(i2, false, false);
    }
}
