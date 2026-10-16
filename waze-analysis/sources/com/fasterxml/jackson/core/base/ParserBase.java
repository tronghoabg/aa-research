package com.fasterxml.jackson.core.base;

import androidx.camera.video.AudioStats;
import androidx.collection.SieveCacheKt;
import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.StreamReadCapability;
import com.fasterxml.jackson.core.StreamReadFeature;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.core.exc.InputCoercionException;
import com.fasterxml.jackson.core.exc.StreamConstraintsException;
import com.fasterxml.jackson.core.io.ContentReference;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.io.NumberInput;
import com.fasterxml.jackson.core.json.DupDetector;
import com.fasterxml.jackson.core.json.JsonReadContext;
import com.fasterxml.jackson.core.json.PackageVersion;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import com.fasterxml.jackson.core.util.JacksonFeatureSet;
import com.fasterxml.jackson.core.util.TextBuffer;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public abstract class ParserBase extends ParserMinimalBase {
    protected static final JacksonFeatureSet<StreamReadCapability> JSON_READ_CAPABILITIES = DEFAULT_READ_CAPABILITIES;
    protected byte[] _binaryValue;
    protected ByteArrayBuilder _byteArrayBuilder;
    protected boolean _closed;
    protected long _currInputProcessed;
    protected int _currInputRow;
    protected int _currInputRowStart;
    protected int _expLength;
    protected int _fractLength;
    protected int _inputEnd;
    protected int _inputPtr;
    protected int _intLength;
    protected final IOContext _ioContext;
    protected boolean _nameCopied;
    protected char[] _nameCopyBuffer;
    protected JsonToken _nextToken;
    protected int _numTypesValid;
    protected BigDecimal _numberBigDecimal;
    protected BigInteger _numberBigInt;
    protected double _numberDouble;
    protected float _numberFloat;
    protected int _numberInt;
    protected boolean _numberIsNaN;
    protected long _numberLong;
    protected boolean _numberNegative;
    protected String _numberString;
    protected JsonReadContext _parsingContext;
    protected final TextBuffer _textBuffer;
    protected int _tokenInputCol;
    protected int _tokenInputRow;
    protected long _tokenInputTotal;

    protected ParserBase(IOContext iOContext, int i2) {
        super(i2, iOContext.streamReadConstraints());
        this._currInputRow = 1;
        this._tokenInputRow = 1;
        this._numTypesValid = 0;
        this._ioContext = iOContext;
        this._textBuffer = iOContext.constructReadConstrainedTextBuffer();
        this._parsingContext = JsonReadContext.createRootContext(JsonParser.Feature.STRICT_DUPLICATE_DETECTION.enabledIn(i2) ? DupDetector.rootDetector(this) : null);
    }

    private void _parseSlowFloat(int i2) {
        if (i2 == 16) {
            this._numberBigDecimal = this._textBuffer.contentsAsDecimal(isEnabled(StreamReadFeature.USE_FAST_BIG_NUMBER_PARSER));
            this._numTypesValid = 16;
            return;
        }
        if (i2 == 8) {
            this._numberDouble = this._textBuffer.contentsAsDouble(isEnabled(StreamReadFeature.USE_FAST_DOUBLE_PARSER));
            this._numTypesValid = 8;
        } else if (i2 == 32) {
            this._numberFloat = this._textBuffer.contentsAsFloat(isEnabled(StreamReadFeature.USE_FAST_DOUBLE_PARSER));
            this._numTypesValid = 32;
        } else {
            this._numberDouble = AudioStats.AUDIO_AMPLITUDE_NONE;
            this._numberString = this._textBuffer.contentsAsString();
            this._numTypesValid = 8;
        }
    }

    private void _parseSlowInt(int i2) throws InputCoercionException {
        String strContentsAsString = this._textBuffer.contentsAsString();
        if (i2 == 1) {
            _reportTooLongIntegral(i2, strContentsAsString);
        } else if (i2 == 2) {
            i2 = 2;
            _reportTooLongIntegral(i2, strContentsAsString);
        }
        if (i2 == 8 || i2 == 32) {
            this._numberString = strContentsAsString;
            this._numTypesValid = 8;
        } else {
            this._numberBigInt = null;
            this._numberString = strContentsAsString;
            this._numTypesValid = 4;
        }
    }

    protected static int[] growArrayBy(int[] iArr, int i2) {
        if (iArr == null) {
            return new int[i2];
        }
        int length = iArr.length + i2;
        if (length >= 0) {
            return Arrays.copyOf(iArr, length);
        }
        throw new IllegalArgumentException("Unable to grow array to longer than `Integer.MAX_VALUE`");
    }

    protected void _checkStdFeatureChanges(int i2, int i3) {
        int mask = JsonParser.Feature.STRICT_DUPLICATE_DETECTION.getMask();
        if ((i3 & mask) == 0 || (i2 & mask) == 0) {
            return;
        }
        DupDetector dupDetector = this._parsingContext.getDupDetector();
        JsonReadContext jsonReadContext = this._parsingContext;
        if (dupDetector == null) {
            jsonReadContext.withDupDetector(DupDetector.rootDetector(this));
            this._parsingContext = jsonReadContext;
        } else {
            jsonReadContext.withDupDetector(null);
            this._parsingContext = jsonReadContext;
        }
    }

    protected abstract void _closeInput();

    protected ContentReference _contentReference() {
        return JsonParser.Feature.INCLUDE_SOURCE_IN_LOCATION.enabledIn(this._features) ? this._ioContext.contentReference() : _contentReferenceRedacted();
    }

    protected ContentReference _contentReferenceRedacted() {
        return ContentReference.redacted();
    }

    protected BigInteger _convertBigDecimalToBigInteger(BigDecimal bigDecimal) throws StreamConstraintsException {
        this._streamReadConstraints.validateBigIntegerScale(bigDecimal.scale());
        return bigDecimal.toBigInteger();
    }

    protected final int _decodeBase64Escape(Base64Variant base64Variant, char c2, int i2) {
        if (c2 != '\\') {
            throw reportInvalidBase64Char(base64Variant, c2, i2);
        }
        char c_decodeEscaped = _decodeEscaped();
        if (c_decodeEscaped <= ' ' && i2 == 0) {
            return -1;
        }
        int iDecodeBase64Char = base64Variant.decodeBase64Char(c_decodeEscaped);
        if (iDecodeBase64Char >= 0) {
            return iDecodeBase64Char;
        }
        if (iDecodeBase64Char != -2 || i2 < 2) {
            throw reportInvalidBase64Char(base64Variant, c_decodeEscaped, i2);
        }
        return -2;
    }

    protected char _decodeEscaped() {
        throw null;
    }

    protected final int _eofAsNextChar() {
        _handleEOF();
        return -1;
    }

    protected BigDecimal _getBigDecimal() throws JsonParseException {
        BigDecimal bigDecimal = this._numberBigDecimal;
        if (bigDecimal != null) {
            return bigDecimal;
        }
        String str = this._numberString;
        if (str == null) {
            throw new IllegalStateException("cannot get BigDecimal from current parser state");
        }
        try {
            this._numberBigDecimal = NumberInput.parseBigDecimal(str, isEnabled(StreamReadFeature.USE_FAST_BIG_NUMBER_PARSER));
        } catch (NumberFormatException e2) {
            _wrapError("Malformed numeric value (" + _longNumberDesc(this._numberString) + ")", e2);
        }
        this._numberString = null;
        return this._numberBigDecimal;
    }

    protected BigInteger _getBigInteger() throws JsonParseException {
        BigInteger bigInteger = this._numberBigInt;
        if (bigInteger != null) {
            return bigInteger;
        }
        String str = this._numberString;
        if (str == null) {
            throw new IllegalStateException("cannot get BigInteger from current parser state");
        }
        try {
            this._numberBigInt = NumberInput.parseBigInteger(str, isEnabled(StreamReadFeature.USE_FAST_BIG_NUMBER_PARSER));
        } catch (NumberFormatException e2) {
            _wrapError("Malformed numeric value (" + _longNumberDesc(this._numberString) + ")", e2);
        }
        this._numberString = null;
        return this._numberBigInt;
    }

    public ByteArrayBuilder _getByteArrayBuilder() {
        ByteArrayBuilder byteArrayBuilder = this._byteArrayBuilder;
        if (byteArrayBuilder == null) {
            this._byteArrayBuilder = new ByteArrayBuilder();
        } else {
            byteArrayBuilder.reset();
        }
        return this._byteArrayBuilder;
    }

    protected double _getNumberDouble() throws JsonParseException {
        String str = this._numberString;
        if (str != null) {
            try {
                this._numberDouble = NumberInput.parseDouble(str, isEnabled(StreamReadFeature.USE_FAST_DOUBLE_PARSER));
            } catch (NumberFormatException e2) {
                _wrapError("Malformed numeric value (" + _longNumberDesc(this._numberString) + ")", e2);
            }
            this._numberString = null;
        }
        return this._numberDouble;
    }

    protected float _getNumberFloat() throws JsonParseException {
        String str = this._numberString;
        if (str != null) {
            try {
                this._numberFloat = NumberInput.parseFloat(str, isEnabled(StreamReadFeature.USE_FAST_DOUBLE_PARSER));
            } catch (NumberFormatException e2) {
                _wrapError("Malformed numeric value (" + _longNumberDesc(this._numberString) + ")", e2);
            }
            this._numberString = null;
        }
        return this._numberFloat;
    }

    protected int[] _growNameDecodeBuffer(int[] iArr, int i2) throws StreamConstraintsException {
        this._streamReadConstraints.validateNameLength(iArr.length << 2);
        return growArrayBy(iArr, i2);
    }

    protected void _handleBase64MissingPadding(Base64Variant base64Variant) {
        _reportError(base64Variant.missingPaddingMessage());
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase
    protected void _handleEOF() {
        if (this._parsingContext.inRoot()) {
            return;
        }
        _reportInvalidEOF(String.format(": expected close marker for %s (start marker at %s)", true != this._parsingContext.inArray() ? "Object" : "Array", this._parsingContext.startLocation(_contentReference())), null);
    }

    protected char _handleUnrecognizedCharacterEscape(char c2) {
        if (isEnabled(JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER)) {
            return c2;
        }
        if (c2 == '\'') {
            if (isEnabled(JsonParser.Feature.ALLOW_SINGLE_QUOTES)) {
                return '\'';
            }
            c2 = '\'';
        }
        throw _constructReadException("Unrecognized character escape ".concat(_getCharDesc(c2)), _currentLocationMinusOne());
    }

    protected int _parseIntValue() throws JsonParseException, InputCoercionException {
        if (this._closed) {
            _reportError("Internal error: _parseNumericValue called when parser instance closed");
        }
        if (this._currToken != JsonToken.VALUE_NUMBER_INT || this._intLength > 9) {
            _parseNumericValue(1);
            if ((this._numTypesValid & 1) == 0) {
                convertNumberToInt();
            }
            return this._numberInt;
        }
        int iContentsAsInt = this._textBuffer.contentsAsInt(this._numberNegative);
        this._numberInt = iContentsAsInt;
        this._numTypesValid = 1;
        return iContentsAsInt;
    }

    protected void _parseNumericValue(int i2) throws JsonParseException, InputCoercionException {
        if (this._closed) {
            _reportError("Internal error: _parseNumericValue called when parser instance closed");
        }
        if (this._currToken != JsonToken.VALUE_NUMBER_INT) {
            JsonToken jsonToken = this._currToken;
            if (jsonToken == JsonToken.VALUE_NUMBER_FLOAT) {
                _parseSlowFloat(i2);
                return;
            } else {
                _reportError("Current token (%s) not numeric, can not use numeric value accessors", jsonToken);
                return;
            }
        }
        int i3 = this._intLength;
        if (i3 <= 9) {
            this._numberInt = this._textBuffer.contentsAsInt(this._numberNegative);
            this._numTypesValid = 1;
            return;
        }
        if (i3 <= 18) {
            long jContentsAsLong = this._textBuffer.contentsAsLong(this._numberNegative);
            if (i3 != 10 || (!this._numberNegative ? jContentsAsLong <= SieveCacheKt.NodeLinkMask : jContentsAsLong >= SieveCacheKt.NodeMetaAndPreviousMask)) {
                this._numberLong = jContentsAsLong;
                this._numTypesValid = 2;
                return;
            } else {
                this._numberInt = (int) jContentsAsLong;
                this._numTypesValid = 1;
                return;
            }
        }
        if (i3 == 19) {
            TextBuffer textBuffer = this._textBuffer;
            char[] textBuffer2 = textBuffer.getTextBuffer();
            int textOffset = textBuffer.getTextOffset();
            boolean z = this._numberNegative;
            if (z) {
                textOffset++;
            }
            if (NumberInput.inLongRange(textBuffer2, textOffset, 19, z)) {
                this._numberLong = NumberInput.parseLong19(textBuffer2, textOffset, this._numberNegative);
                this._numTypesValid = 2;
                return;
            }
        }
        _parseSlowInt(i2);
    }

    protected void _releaseBuffers() {
        this._textBuffer.releaseBuffers();
        char[] cArr = this._nameCopyBuffer;
        if (cArr != null) {
            this._nameCopyBuffer = null;
            this._ioContext.releaseNameCopyBuffer(cArr);
        }
    }

    protected void _reportExtraEndMarker(int i2) throws JsonParseException {
        throw _constructReadException(String.format("Unexpected close marker '%s': no open %s to close", Character.valueOf((char) i2), i2 == 125 ? "Object" : "Array"), _currentLocationMinusOne());
    }

    protected void _reportMismatchedEndMarker(int i2, char c2) {
        JsonReadContext parsingContext = getParsingContext();
        if (!parsingContext.inRoot()) {
            throw _constructReadException(String.format("Unexpected close marker '%s': expected '%c' (for %s starting at %s)", Character.valueOf((char) i2), Character.valueOf(c2), parsingContext.typeDesc(), parsingContext.startLocation(_contentReference())), _currentLocationMinusOne());
        }
        _reportExtraEndMarker(i2);
    }

    protected void _reportTooLongIntegral(int i2, String str) throws InputCoercionException {
        if (i2 == 1) {
            reportOverflowInt(str);
        } else {
            reportOverflowLong(str);
        }
    }

    protected void _throwUnquotedSpace(int i2, String str) {
        if (!isEnabled(JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS) || i2 > 32) {
            throw _constructReadException("Illegal unquoted character (" + _getCharDesc((char) i2) + "): has to be escaped using backslash to be included in " + str, _currentLocationMinusOne());
        }
    }

    protected String _validJsonTokenList() {
        return _validJsonValueList();
    }

    protected String _validJsonValueList() {
        return isEnabled(JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS) ? "(JSON String, Number (or 'NaN'/'+INF'/'-INF'), Array, Object or token 'null', 'true' or 'false')" : "(JSON String, Number, Array, Object or token 'null', 'true' or 'false')";
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public void assignCurrentValue(Object obj) {
        this._parsingContext.setCurrentValue(obj);
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this._closed) {
            return;
        }
        this._inputPtr = Math.max(this._inputPtr, this._inputEnd);
        this._closed = true;
        try {
            _closeInput();
        } finally {
            _releaseBuffers();
            this._ioContext.close();
        }
    }

    protected void convertNumberToBigDecimal() {
        int i2 = this._numTypesValid;
        if ((i2 & 8) != 0) {
            String text = this._numberString;
            if (text == null) {
                text = getText();
            }
            this._numberBigDecimal = NumberInput.parseBigDecimal(text, isEnabled(StreamReadFeature.USE_FAST_BIG_NUMBER_PARSER));
        } else if ((i2 & 4) != 0) {
            this._numberBigDecimal = new BigDecimal(_getBigInteger());
        } else if ((i2 & 2) != 0) {
            this._numberBigDecimal = BigDecimal.valueOf(this._numberLong);
        } else if ((i2 & 1) != 0) {
            this._numberBigDecimal = BigDecimal.valueOf(this._numberInt);
        } else {
            _throwInternal();
        }
        this._numTypesValid |= 16;
    }

    protected void convertNumberToBigInteger() {
        int i2 = this._numTypesValid;
        if ((i2 & 16) != 0) {
            this._numberBigInt = _convertBigDecimalToBigInteger(_getBigDecimal());
        } else if ((i2 & 2) != 0) {
            this._numberBigInt = BigInteger.valueOf(this._numberLong);
        } else if ((i2 & 1) != 0) {
            this._numberBigInt = BigInteger.valueOf(this._numberInt);
        } else if ((i2 & 8) == 0) {
            _throwInternal();
        } else if (this._numberString != null) {
            this._numberBigInt = _convertBigDecimalToBigInteger(_getBigDecimal());
        } else {
            this._numberBigInt = _convertBigDecimalToBigInteger(BigDecimal.valueOf(_getNumberDouble()));
        }
        this._numTypesValid |= 4;
    }

    protected void convertNumberToDouble() {
        double dDoubleValue;
        int i2 = this._numTypesValid;
        if ((i2 & 16) != 0) {
            if (this._numberString != null) {
                this._numberDouble = _getNumberDouble();
            } else {
                this._numberDouble = _getBigDecimal().doubleValue();
            }
        } else if ((i2 & 4) == 0) {
            if ((i2 & 2) != 0) {
                dDoubleValue = this._numberLong;
            } else if ((i2 & 1) != 0) {
                dDoubleValue = this._numberInt;
            } else if ((i2 & 32) == 0) {
                _throwInternal();
            } else if (this._numberString != null) {
                this._numberDouble = _getNumberDouble();
            } else {
                this._numberDouble = _getNumberFloat();
            }
            this._numberDouble = dDoubleValue;
        } else if (this._numberString != null) {
            this._numberDouble = _getNumberDouble();
        } else {
            dDoubleValue = _getBigInteger().doubleValue();
            this._numberDouble = dDoubleValue;
        }
        this._numTypesValid |= 8;
    }

    protected void convertNumberToFloat() {
        float fFloatValue;
        int i2 = this._numTypesValid;
        if ((i2 & 16) != 0) {
            if (this._numberString != null) {
                this._numberFloat = _getNumberFloat();
            } else {
                this._numberFloat = _getBigDecimal().floatValue();
            }
        } else if ((i2 & 4) == 0) {
            if ((i2 & 2) != 0) {
                fFloatValue = this._numberLong;
            } else if ((i2 & 1) != 0) {
                fFloatValue = this._numberInt;
            } else if ((i2 & 8) == 0) {
                _throwInternal();
            } else if (this._numberString != null) {
                this._numberFloat = _getNumberFloat();
            } else {
                this._numberFloat = (float) _getNumberDouble();
            }
            this._numberFloat = fFloatValue;
        } else if (this._numberString != null) {
            this._numberFloat = _getNumberFloat();
        } else {
            fFloatValue = _getBigInteger().floatValue();
            this._numberFloat = fFloatValue;
        }
        this._numTypesValid |= 32;
    }

    protected void convertNumberToInt() {
        int i2 = this._numTypesValid;
        if ((i2 & 2) != 0) {
            long j2 = this._numberLong;
            int i3 = (int) j2;
            if (i3 != j2) {
                reportOverflowInt(getText(), currentToken());
            }
            this._numberInt = i3;
        } else if ((i2 & 4) != 0) {
            BigInteger bigInteger_getBigInteger = _getBigInteger();
            if (BI_MIN_INT.compareTo(bigInteger_getBigInteger) > 0 || BI_MAX_INT.compareTo(bigInteger_getBigInteger) < 0) {
                reportOverflowInt();
            }
            this._numberInt = bigInteger_getBigInteger.intValue();
        } else if ((i2 & 8) != 0) {
            double d_getNumberDouble = _getNumberDouble();
            if (d_getNumberDouble < -2.147483648E9d || d_getNumberDouble > 2.147483647E9d) {
                reportOverflowInt();
            }
            this._numberInt = (int) d_getNumberDouble;
        } else if ((i2 & 16) != 0) {
            BigDecimal bigDecimal_getBigDecimal = _getBigDecimal();
            if (BD_MIN_INT.compareTo(bigDecimal_getBigDecimal) > 0 || BD_MAX_INT.compareTo(bigDecimal_getBigDecimal) < 0) {
                reportOverflowInt();
            }
            this._numberInt = bigDecimal_getBigDecimal.intValue();
        } else {
            _throwInternal();
        }
        this._numTypesValid |= 1;
    }

    protected void convertNumberToLong() throws JsonParseException {
        int i2 = this._numTypesValid;
        if ((i2 & 1) != 0) {
            this._numberLong = this._numberInt;
        } else if ((i2 & 4) != 0) {
            BigInteger bigInteger_getBigInteger = _getBigInteger();
            if (BI_MIN_LONG.compareTo(bigInteger_getBigInteger) > 0 || BI_MAX_LONG.compareTo(bigInteger_getBigInteger) < 0) {
                reportOverflowLong();
            }
            this._numberLong = bigInteger_getBigInteger.longValue();
        } else if ((i2 & 8) != 0) {
            double d_getNumberDouble = _getNumberDouble();
            if (d_getNumberDouble < -9.223372036854776E18d || d_getNumberDouble > 9.223372036854776E18d) {
                reportOverflowLong();
            }
            this._numberLong = (long) d_getNumberDouble;
        } else if ((i2 & 16) != 0) {
            BigDecimal bigDecimal_getBigDecimal = _getBigDecimal();
            if (BD_MIN_LONG.compareTo(bigDecimal_getBigDecimal) > 0 || BD_MAX_LONG.compareTo(bigDecimal_getBigDecimal) < 0) {
                reportOverflowLong();
            }
            this._numberLong = bigDecimal_getBigDecimal.longValue();
        } else {
            _throwInternal();
        }
        this._numTypesValid |= 2;
    }

    protected void createChildArrayContext(int i2, int i3) {
        JsonReadContext jsonReadContextCreateChildArrayContext = this._parsingContext.createChildArrayContext(i2, i3);
        this._parsingContext = jsonReadContextCreateChildArrayContext;
        this._streamReadConstraints.validateNestingDepth(jsonReadContextCreateChildArrayContext.getNestingDepth());
    }

    protected void createChildObjectContext(int i2, int i3) {
        JsonReadContext jsonReadContextCreateChildObjectContext = this._parsingContext.createChildObjectContext(i2, i3);
        this._parsingContext = jsonReadContextCreateChildObjectContext;
        this._streamReadConstraints.validateNestingDepth(jsonReadContextCreateChildObjectContext.getNestingDepth());
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public Object currentValue() {
        return this._parsingContext.getCurrentValue();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonParser disable(JsonParser.Feature feature) {
        this._features &= ~feature.getMask();
        if (feature == JsonParser.Feature.STRICT_DUPLICATE_DETECTION) {
            JsonReadContext jsonReadContext = this._parsingContext;
            jsonReadContext.withDupDetector(null);
            this._parsingContext = jsonReadContext;
        }
        return this;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonParser enable(JsonParser.Feature feature) {
        this._features |= feature.getMask();
        if (feature == JsonParser.Feature.STRICT_DUPLICATE_DETECTION && this._parsingContext.getDupDetector() == null) {
            JsonReadContext jsonReadContext = this._parsingContext;
            jsonReadContext.withDupDetector(DupDetector.rootDetector(this));
            this._parsingContext = jsonReadContext;
        }
        return this;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public BigInteger getBigIntegerValue() throws JsonParseException, InputCoercionException {
        int i2 = this._numTypesValid;
        if ((i2 & 4) == 0) {
            if (i2 == 0) {
                _parseNumericValue(4);
            }
            if ((this._numTypesValid & 4) == 0) {
                convertNumberToBigInteger();
                return this._numberBigInt;
            }
        }
        return _getBigInteger();
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public byte[] getBinaryValue(Base64Variant base64Variant) {
        byte[] bArr = this._binaryValue;
        if (bArr != null) {
            return bArr;
        }
        if (this._currToken != JsonToken.VALUE_STRING) {
            _reportError("Current token (" + String.valueOf(this._currToken) + ") not VALUE_STRING, can not access as binary");
        }
        ByteArrayBuilder byteArrayBuilder_getByteArrayBuilder = _getByteArrayBuilder();
        _decodeBase64(getText(), byteArrayBuilder_getByteArrayBuilder, base64Variant);
        byte[] byteArray = byteArrayBuilder_getByteArrayBuilder.toByteArray();
        this._binaryValue = byteArray;
        return byteArray;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    @Deprecated
    public JsonLocation getCurrentLocation() {
        return new JsonLocation(_contentReference(), -1L, this._inputPtr + this._currInputProcessed, this._currInputRow, (this._inputPtr - this._currInputRowStart) + 1);
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    @Deprecated
    public String getCurrentName() {
        JsonReadContext parent;
        return ((this._currToken == JsonToken.START_OBJECT || this._currToken == JsonToken.START_ARRAY) && (parent = this._parsingContext.getParent()) != null) ? parent.getCurrentName() : this._parsingContext.getCurrentName();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public BigDecimal getDecimalValue() throws JsonParseException, InputCoercionException {
        int i2 = this._numTypesValid;
        if ((i2 & 16) == 0) {
            if (i2 == 0) {
                _parseNumericValue(16);
            }
            if ((this._numTypesValid & 16) == 0) {
                convertNumberToBigDecimal();
                return this._numberBigDecimal;
            }
        }
        return _getBigDecimal();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public double getDoubleValue() throws JsonParseException, InputCoercionException {
        int i2 = this._numTypesValid;
        if ((i2 & 8) == 0) {
            if (i2 == 0) {
                _parseNumericValue(8);
            }
            if ((this._numTypesValid & 8) == 0) {
                convertNumberToDouble();
                return this._numberDouble;
            }
        }
        return _getNumberDouble();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public float getFloatValue() throws JsonParseException, InputCoercionException {
        int i2 = this._numTypesValid;
        if ((i2 & 32) == 0) {
            if (i2 == 0) {
                _parseNumericValue(32);
            }
            if ((this._numTypesValid & 32) == 0) {
                convertNumberToFloat();
                return this._numberFloat;
            }
        }
        return _getNumberFloat();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int getIntValue() {
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

    @Override // com.fasterxml.jackson.core.JsonParser
    public long getLongValue() throws JsonParseException, InputCoercionException {
        int i2 = this._numTypesValid;
        if ((i2 & 2) == 0) {
            if (i2 == 0) {
                _parseNumericValue(2);
            }
            if ((this._numTypesValid & 2) == 0) {
                convertNumberToLong();
            }
        }
        return this._numberLong;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonParser.NumberType getNumberType() throws JsonParseException, InputCoercionException {
        if (this._numTypesValid == 0) {
            _parseNumericValue(0);
        }
        JsonToken jsonToken = this._currToken;
        JsonToken jsonToken2 = JsonToken.VALUE_NUMBER_INT;
        int i2 = this._numTypesValid;
        return jsonToken == jsonToken2 ? (i2 & 1) != 0 ? JsonParser.NumberType.INT : (i2 & 2) != 0 ? JsonParser.NumberType.LONG : JsonParser.NumberType.BIG_INTEGER : (i2 & 16) != 0 ? JsonParser.NumberType.BIG_DECIMAL : (i2 & 32) != 0 ? JsonParser.NumberType.FLOAT : JsonParser.NumberType.DOUBLE;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public Number getNumberValue() throws JsonParseException, InputCoercionException {
        if (this._numTypesValid == 0) {
            _parseNumericValue(0);
        }
        if (this._currToken == JsonToken.VALUE_NUMBER_INT) {
            int i2 = this._numTypesValid;
            if ((i2 & 1) != 0) {
                return Integer.valueOf(this._numberInt);
            }
            if ((i2 & 2) != 0) {
                return Long.valueOf(this._numberLong);
            }
            if ((i2 & 4) != 0) {
                return _getBigInteger();
            }
            _throwInternal();
        }
        int i3 = this._numTypesValid;
        if ((i3 & 16) != 0) {
            return _getBigDecimal();
        }
        if ((i3 & 32) != 0) {
            return Float.valueOf(_getNumberFloat());
        }
        if ((i3 & 8) == 0) {
            _throwInternal();
        }
        return Double.valueOf(_getNumberDouble());
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public Object getNumberValueDeferred() throws JsonParseException, InputCoercionException {
        if (this._currToken == JsonToken.VALUE_NUMBER_INT) {
            if (this._numTypesValid == 0) {
                _parseNumericValue(0);
            }
            int i2 = this._numTypesValid;
            if ((i2 & 1) != 0) {
                return Integer.valueOf(this._numberInt);
            }
            if ((i2 & 2) != 0) {
                return Long.valueOf(this._numberLong);
            }
            if ((i2 & 4) != 0) {
                BigInteger bigInteger = this._numberBigInt;
                if (bigInteger != null) {
                    return bigInteger;
                }
                String str = this._numberString;
                return str != null ? str : _getBigInteger();
            }
            _throwInternal();
        }
        if (this._currToken != JsonToken.VALUE_NUMBER_FLOAT) {
            return getNumberValue();
        }
        int i3 = this._numTypesValid;
        return (i3 & 16) != 0 ? _getBigDecimal() : (i3 & 8) != 0 ? Double.valueOf(_getNumberDouble()) : (i3 & 32) != 0 ? Float.valueOf(_getNumberFloat()) : this._textBuffer.contentsAsString();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public Number getNumberValueExact() throws JsonParseException, InputCoercionException {
        if (this._currToken == JsonToken.VALUE_NUMBER_INT) {
            if (this._numTypesValid == 0) {
                _parseNumericValue(0);
            }
            int i2 = this._numTypesValid;
            if ((i2 & 1) != 0) {
                return Integer.valueOf(this._numberInt);
            }
            if ((i2 & 2) != 0) {
                return Long.valueOf(this._numberLong);
            }
            if ((i2 & 4) != 0) {
                return _getBigInteger();
            }
            _throwInternal();
        }
        if (this._numTypesValid == 0) {
            _parseNumericValue(16);
        }
        int i3 = this._numTypesValid;
        if ((i3 & 16) != 0) {
            return _getBigDecimal();
        }
        if ((i3 & 32) != 0) {
            return Float.valueOf(_getNumberFloat());
        }
        if ((i3 & 8) == 0) {
            _throwInternal();
        }
        return Double.valueOf(_getNumberDouble());
    }

    public long getTokenCharacterOffset() {
        return this._tokenInputTotal;
    }

    public int getTokenColumnNr() {
        int i2 = this._tokenInputCol;
        return i2 < 0 ? i2 : i2 + 1;
    }

    public int getTokenLineNr() {
        return this._tokenInputRow;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    @Deprecated
    public JsonLocation getTokenLocation() {
        return new JsonLocation(_contentReference(), -1L, getTokenCharacterOffset(), getTokenLineNr(), getTokenColumnNr());
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public boolean hasTextCharacters() {
        if (this._currToken == JsonToken.VALUE_STRING) {
            return true;
        }
        if (this._currToken == JsonToken.FIELD_NAME) {
            return this._nameCopied;
        }
        return false;
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public boolean isClosed() {
        return this._closed;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean isNaN() {
        return this._currToken == JsonToken.VALUE_NUMBER_FLOAT && this._numberIsNaN;
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public void overrideCurrentName(String str) {
        JsonReadContext parent = this._parsingContext;
        if (this._currToken == JsonToken.START_OBJECT || this._currToken == JsonToken.START_ARRAY) {
            parent = parent.getParent();
        }
        try {
            parent.setCurrentName(str);
        } catch (IOException e2) {
            throw new IllegalStateException(e2);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonParser overrideStdFeatures(int i2, int i3) {
        int i4 = this._features;
        int i5 = (i2 & i3) | ((~i3) & i4);
        int i6 = i4 ^ i5;
        if (i6 != 0) {
            this._features = i5;
            _checkStdFeatureChanges(i5, i6);
        }
        return this;
    }

    protected IllegalArgumentException reportInvalidBase64Char(Base64Variant base64Variant, int i2, int i3, String str) {
        String str2;
        if (i2 <= 32) {
            str2 = String.format("Illegal white space character (code 0x%s) as character #%d of 4-char base64 unit: can only used between units", Integer.toHexString(i2), Integer.valueOf(i3 + 1));
        } else if (base64Variant.usesPaddingChar(i2)) {
            str2 = "Unexpected padding character ('" + base64Variant.getPaddingChar() + "') as character #" + (i3 + 1) + " of 4-char base64 unit: padding only legal as 3rd or 4th character";
        } else if (!Character.isDefined(i2) || Character.isISOControl(i2)) {
            str2 = "Illegal character (code 0x" + Integer.toHexString(i2) + ") in base64 content";
        } else {
            str2 = "Illegal character '" + ((char) i2) + "' (code 0x" + Integer.toHexString(i2) + ") in base64 content";
        }
        if (str != null) {
            str2 = str2 + ": " + str;
        }
        return new IllegalArgumentException(str2);
    }

    protected final JsonToken resetAsNaN(String str, double d2) {
        this._textBuffer.resetWithString(str);
        this._numberDouble = d2;
        this._numTypesValid = 8;
        this._numberIsNaN = true;
        this._numberString = null;
        return JsonToken.VALUE_NUMBER_FLOAT;
    }

    protected final JsonToken resetFloat(boolean z, int i2, int i3, int i4) throws StreamConstraintsException {
        this._streamReadConstraints.validateFPLength(i2 + i3 + i4);
        this._numberNegative = z;
        this._numberIsNaN = false;
        this._intLength = i2;
        this._fractLength = i3;
        this._expLength = i4;
        this._numTypesValid = 0;
        this._numberString = null;
        return JsonToken.VALUE_NUMBER_FLOAT;
    }

    protected final JsonToken resetInt(boolean z, int i2) throws StreamConstraintsException {
        this._streamReadConstraints.validateIntegerLength(i2);
        this._numberNegative = z;
        this._numberIsNaN = false;
        this._intLength = i2;
        this._fractLength = 0;
        this._expLength = 0;
        this._numTypesValid = 0;
        this._numberString = null;
        return JsonToken.VALUE_NUMBER_INT;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    @Deprecated
    public JsonParser setFeatureMask(int i2) {
        int i3 = this._features ^ i2;
        if (i3 != 0) {
            this._features = i2;
            _checkStdFeatureChanges(i2, i3);
        }
        return this;
    }

    @Override // com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.core.Versioned
    public Version version() {
        return PackageVersion.VERSION;
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public JsonReadContext getParsingContext() {
        return this._parsingContext;
    }

    protected final int _decodeBase64Escape(Base64Variant base64Variant, int i2, int i3) {
        if (i2 == 92) {
            char c_decodeEscaped = _decodeEscaped();
            if (c_decodeEscaped <= ' ' && i3 == 0) {
                return -1;
            }
            int iDecodeBase64Char = base64Variant.decodeBase64Char((int) c_decodeEscaped);
            if (iDecodeBase64Char >= 0 || iDecodeBase64Char == -2) {
                return iDecodeBase64Char;
            }
            throw reportInvalidBase64Char(base64Variant, c_decodeEscaped, i3);
        }
        throw reportInvalidBase64Char(base64Variant, i2, i3);
    }

    protected IllegalArgumentException reportInvalidBase64Char(Base64Variant base64Variant, int i2, int i3) {
        return reportInvalidBase64Char(base64Variant, i2, i3, null);
    }
}
