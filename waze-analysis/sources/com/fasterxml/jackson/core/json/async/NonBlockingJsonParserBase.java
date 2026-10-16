package com.fasterxml.jackson.core.json.async;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.json.JsonParserBase;
import com.fasterxml.jackson.core.json.JsonReadContext;
import com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public abstract class NonBlockingJsonParserBase extends JsonParserBase {
    protected static final String[] NON_STD_TOKENS = {"NaN", "Infinity", "+Infinity", "-Infinity"};
    protected static final double[] NON_STD_TOKEN_VALUES = {Double.NaN, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.NEGATIVE_INFINITY};
    protected int _currBufferStart;
    protected int _currInputRowAlt;
    protected boolean _endOfInput;
    protected int _majorState;
    protected int _majorStateAfterValue;
    protected int _minorState;
    protected int _minorStateAfterSplit;
    protected int _nonStdTokenType;
    protected int _pending32;
    protected int _pendingBytes;
    protected int _quad1;
    protected int[] _quadBuffer;
    protected int _quadLength;
    protected int _quoted32;
    protected int _quotedDigits;
    protected final ByteQuadsCanonicalizer _symbols;

    public NonBlockingJsonParserBase(IOContext iOContext, int i2, ByteQuadsCanonicalizer byteQuadsCanonicalizer) {
        super(iOContext, i2, null);
        this._quadBuffer = new int[8];
        this._endOfInput = false;
        this._currBufferStart = 0;
        this._currInputRowAlt = 1;
        this._symbols = byteQuadsCanonicalizer;
        this._currToken = null;
        this._majorState = 0;
        this._majorStateAfterValue = 1;
    }

    protected static final int _padLastQuad(int i2, int i3) {
        return i3 == 4 ? i2 : i2 | ((-1) << (i3 << 3));
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final java.lang.String _addName(int[] r18, int r19, int r20) throws com.fasterxml.jackson.core.exc.StreamConstraintsException {
        /*
            Method dump skipped, instructions count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.async.NonBlockingJsonParserBase._addName(int[], int, int):java.lang.String");
    }

    protected final JsonToken _closeArrayScope() {
        if (!this._parsingContext.inArray()) {
            _reportMismatchedEndMarker(93, '}');
        }
        JsonReadContext parent = this._parsingContext.getParent();
        this._parsingContext = parent;
        int i2 = parent.inObject() ? 3 : parent.inArray() ? 6 : 1;
        this._majorState = i2;
        this._majorStateAfterValue = i2;
        JsonToken jsonToken = JsonToken.END_ARRAY;
        _updateToken(jsonToken);
        return jsonToken;
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase
    protected void _closeInput() {
        this._currBufferStart = 0;
        this._inputEnd = 0;
    }

    protected final JsonToken _closeObjectScope() {
        if (!this._parsingContext.inObject()) {
            _reportMismatchedEndMarker(125, ']');
        }
        JsonReadContext parent = this._parsingContext.getParent();
        this._parsingContext = parent;
        int i2 = parent.inObject() ? 3 : parent.inArray() ? 6 : 1;
        this._majorState = i2;
        this._majorStateAfterValue = i2;
        JsonToken jsonToken = JsonToken.END_OBJECT;
        _updateToken(jsonToken);
        return jsonToken;
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase
    protected JsonLocation _currentLocationMinusOne() {
        return new JsonLocation(_contentReference(), this._currInputProcessed + (r0 - this._currBufferStart), -1L, Math.max(this._currInputRow, this._currInputRowAlt), ((this._inputPtr - 1) - this._currInputRowStart) + 1);
    }

    protected final JsonToken _eofAsNextToken() {
        this._majorState = 7;
        if (!this._parsingContext.inRoot()) {
            _handleEOF();
        }
        close();
        _updateTokenToNull();
        return null;
    }

    protected final JsonToken _fieldComplete(String str) throws JsonParseException {
        this._majorState = 4;
        this._parsingContext.setCurrentName(str);
        JsonToken jsonToken = JsonToken.FIELD_NAME;
        _updateToken(jsonToken);
        return jsonToken;
    }

    protected final String _findName(int i2, int i3, int i4, int i5) {
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
        return _addName(iArr, 3, i5);
    }

    protected final String _getText2(JsonToken jsonToken) {
        int iId;
        if (jsonToken == null || (iId = jsonToken.id()) == -1) {
            return null;
        }
        return iId != 5 ? (iId == 6 || iId == 7 || iId == 8) ? this._textBuffer.contentsAsString() : jsonToken.asString() : this._parsingContext.getCurrentName();
    }

    protected final String _nonStdToken(int i2) {
        return NON_STD_TOKENS[i2];
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase
    protected void _releaseBuffers() {
        super._releaseBuffers();
        this._symbols.release();
    }

    protected void _reportInvalidChar(int i2) {
        _reportInvalidInitial(i2);
    }

    protected void _reportInvalidInitial(int i2) {
        _reportError("Invalid UTF-8 start byte 0x".concat(String.valueOf(Integer.toHexString(i2))));
    }

    protected void _reportInvalidOther(int i2) {
        _reportError("Invalid UTF-8 middle byte 0x".concat(String.valueOf(Integer.toHexString(i2))));
    }

    protected final JsonToken _startArrayScope() {
        createChildArrayContext(-1, -1);
        this._majorState = 5;
        this._majorStateAfterValue = 6;
        JsonToken jsonToken = JsonToken.START_ARRAY;
        _updateToken(jsonToken);
        return jsonToken;
    }

    protected final JsonToken _startObjectScope() {
        createChildObjectContext(-1, -1);
        this._majorState = 2;
        this._majorStateAfterValue = 3;
        JsonToken jsonToken = JsonToken.START_OBJECT;
        _updateToken(jsonToken);
        return jsonToken;
    }

    protected final void _updateTokenLocation() {
        this._tokenInputRow = Math.max(this._currInputRow, this._currInputRowAlt);
        this._tokenInputCol = this._inputPtr - this._currInputRowStart;
        this._tokenInputTotal = this._currInputProcessed + (r0 - this._currBufferStart);
    }

    protected final JsonToken _valueComplete(JsonToken jsonToken) {
        this._majorState = this._majorStateAfterValue;
        _updateToken(jsonToken);
        return jsonToken;
    }

    protected final JsonToken _valueCompleteInt(int i2, String str) {
        this._textBuffer.resetWithString("0");
        this._intLength = 1;
        this._numTypesValid = 1;
        this._numberInt = 0;
        this._majorState = this._majorStateAfterValue;
        JsonToken jsonToken = JsonToken.VALUE_NUMBER_INT;
        _updateToken(jsonToken);
        return jsonToken;
    }

    protected final JsonToken _valueNonStdNumberComplete(int i2) throws JsonParseException {
        String str = NON_STD_TOKENS[i2];
        this._textBuffer.resetWithString(str);
        if (!isEnabled(JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS)) {
            _reportError("Non-standard token '%s': enable `JsonReadFeature.ALLOW_NON_NUMERIC_NUMBERS` to allow", str);
        }
        this._intLength = 0;
        this._numTypesValid = 8;
        this._numberDouble = NON_STD_TOKEN_VALUES[i2];
        this._majorState = this._majorStateAfterValue;
        JsonToken jsonToken = JsonToken.VALUE_NUMBER_FLOAT;
        _updateToken(jsonToken);
        return jsonToken;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean canParseAsync() {
        return true;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonLocation currentLocation() {
        int i2 = this._inputPtr - this._currInputRowStart;
        return new JsonLocation(_contentReference(), (this._inputPtr - this._currBufferStart) + this._currInputProcessed, -1L, Math.max(this._currInputRow, this._currInputRowAlt), i2 + 1);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonLocation currentTokenLocation() {
        return new JsonLocation(_contentReference(), this._tokenInputTotal, -1L, this._tokenInputRow, this._tokenInputCol);
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase, com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public byte[] getBinaryValue(Base64Variant base64Variant) throws JsonParseException {
        if (this._currToken != JsonToken.VALUE_STRING) {
            _reportError("Current token (%s) not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary", this._currToken);
        }
        if (this._binaryValue == null) {
            ByteArrayBuilder byteArrayBuilder_getByteArrayBuilder = _getByteArrayBuilder();
            _decodeBase64(getText(), byteArrayBuilder_getByteArrayBuilder, base64Variant);
            this._binaryValue = byteArrayBuilder_getByteArrayBuilder.toByteArray();
        }
        return this._binaryValue;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public Object getEmbeddedObject() {
        if (this._currToken == JsonToken.VALUE_EMBEDDED_OBJECT) {
            return this._binaryValue;
        }
        return null;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public Object getInputSource() {
        return null;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int getText(Writer writer) throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == JsonToken.VALUE_STRING) {
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
        if (jsonToken == JsonToken.NOT_AVAILABLE) {
            _reportError("Current token not available: can not call this method");
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
            return (iId == 6 || iId == 7 || iId == 8) ? this._textBuffer.getTextBuffer() : jsonToken.asCharArray();
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
        return iId != 5 ? (iId == 6 || iId == 7 || iId == 8) ? this._textBuffer.size() : jsonToken.asCharArray().length : this._parsingContext.getCurrentName().length();
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public int getTextOffset() {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == null) {
            return 0;
        }
        int iId = jsonToken.id();
        if (iId == 6 || iId == 7 || iId == 8) {
            return this._textBuffer.getTextOffset();
        }
        return 0;
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public String getValueAsString() {
        return this._currToken == JsonToken.VALUE_STRING ? this._textBuffer.contentsAsString() : this._currToken == JsonToken.FIELD_NAME ? currentName() : super.getValueAsString(null);
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase, com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public boolean hasTextCharacters() {
        if (this._currToken == JsonToken.VALUE_STRING) {
            return this._textBuffer.hasTextAsCharacters();
        }
        if (this._currToken == JsonToken.FIELD_NAME) {
            return this._nameCopied;
        }
        return false;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int readBinaryValue(Base64Variant base64Variant, OutputStream outputStream) throws IOException {
        byte[] binaryValue = getBinaryValue(base64Variant);
        outputStream.write(binaryValue);
        return binaryValue.length;
    }

    @Override // com.fasterxml.jackson.core.json.JsonParserBase, com.fasterxml.jackson.core.JsonParser
    public void setCodec(ObjectCodec objectCodec) {
        throw new UnsupportedOperationException("Cannot use ObjectMapper with non-blocking parser");
    }

    protected void _reportInvalidOther(int i2, int i3) {
        this._inputPtr = i3;
        _reportInvalidOther(i2);
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public String getValueAsString(String str) {
        if (this._currToken == JsonToken.VALUE_STRING) {
            return this._textBuffer.contentsAsString();
        }
        if (this._currToken == JsonToken.FIELD_NAME) {
            return currentName();
        }
        return super.getValueAsString(str);
    }

    protected final String _findName(int i2, int i3, int i4) {
        ByteQuadsCanonicalizer byteQuadsCanonicalizer = this._symbols;
        int i_padLastQuad = _padLastQuad(i3, i4);
        String strFindName = byteQuadsCanonicalizer.findName(i2, i_padLastQuad);
        if (strFindName != null) {
            return strFindName;
        }
        int[] iArr = this._quadBuffer;
        iArr[0] = i2;
        iArr[1] = i_padLastQuad;
        return _addName(iArr, 2, i4);
    }

    protected final String _findName(int i2, int i3) {
        ByteQuadsCanonicalizer byteQuadsCanonicalizer = this._symbols;
        int i_padLastQuad = _padLastQuad(i2, i3);
        String strFindName = byteQuadsCanonicalizer.findName(i_padLastQuad);
        if (strFindName != null) {
            return strFindName;
        }
        int[] iArr = this._quadBuffer;
        iArr[0] = i_padLastQuad;
        return _addName(iArr, 1, i3);
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public String getText() {
        if (this._currToken == JsonToken.VALUE_STRING) {
            return this._textBuffer.contentsAsString();
        }
        return _getText2(this._currToken);
    }
}
