package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonStreamContext;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.core.StreamReadCapability;
import com.fasterxml.jackson.core.StreamReadConstraints;
import com.fasterxml.jackson.core.StreamReadFeature;
import com.fasterxml.jackson.core.StreamWriteCapability;
import com.fasterxml.jackson.core.TreeNode;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.core.base.ParserMinimalBase;
import com.fasterxml.jackson.core.exc.StreamConstraintsException;
import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.core.io.JsonEOFException;
import com.fasterxml.jackson.core.io.NumberInput;
import com.fasterxml.jackson.core.json.JsonWriteContext;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import com.fasterxml.jackson.core.util.JacksonFeatureSet;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonSerializable;
import com.fasterxml.jackson.databind.cfg.PackageVersion;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.TreeMap;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class TokenBuffer extends JsonGenerator {
    protected static final int DEFAULT_GENERATOR_FEATURES = JsonGenerator.Feature.collectDefaults();
    protected int _appendAt;
    protected boolean _closed;
    protected Segment _first;
    protected boolean _forceBigDecimal;
    protected int _generatorFeatures;
    protected boolean _hasNativeId;
    protected boolean _hasNativeObjectIds;
    protected boolean _hasNativeTypeIds;
    protected Segment _last;
    protected boolean _mayHaveNativeIds;
    protected ObjectCodec _objectCodec;
    protected Object _objectId;
    protected JsonStreamContext _parentContext;
    protected StreamReadConstraints _streamReadConstraints;
    protected Object _typeId;
    protected JsonWriteContext _writeContext;

    /* compiled from: WazeSource */
    /* renamed from: com.fasterxml.jackson.databind.util.TokenBuffer$1, reason: invalid class name */
    /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$fasterxml$jackson$core$JsonParser$NumberType;
        static final /* synthetic */ int[] $SwitchMap$com$fasterxml$jackson$core$JsonToken;

        static {
            int[] iArr = new int[JsonParser.NumberType.values().length];
            $SwitchMap$com$fasterxml$jackson$core$JsonParser$NumberType = iArr;
            try {
                iArr[JsonParser.NumberType.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$core$JsonParser$NumberType[JsonParser.NumberType.BIG_INTEGER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[JsonToken.values().length];
            $SwitchMap$com$fasterxml$jackson$core$JsonToken = iArr2;
            try {
                iArr2[JsonToken.START_OBJECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.END_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.START_ARRAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.END_ARRAY.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.FIELD_NAME.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_NUMBER_INT.ordinal()] = 7;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_NUMBER_FLOAT.ordinal()] = 8;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_TRUE.ordinal()] = 9;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_FALSE.ordinal()] = 10;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_NULL.ordinal()] = 11;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_EMBEDDED_OBJECT.ordinal()] = 12;
            } catch (NoSuchFieldError unused14) {
            }
        }
    }

    public TokenBuffer(JsonParser jsonParser, DeserializationContext deserializationContext) {
        this._streamReadConstraints = StreamReadConstraints.defaults();
        this._hasNativeId = false;
        this._objectCodec = jsonParser.getCodec();
        this._streamReadConstraints = jsonParser.streamReadConstraints();
        this._parentContext = jsonParser.getParsingContext();
        this._generatorFeatures = DEFAULT_GENERATOR_FEATURES;
        this._writeContext = JsonWriteContext.createRootContext(null);
        Segment segment = new Segment();
        this._last = segment;
        this._first = segment;
        this._appendAt = 0;
        this._hasNativeTypeIds = jsonParser.canReadTypeId();
        boolean zCanReadObjectId = jsonParser.canReadObjectId();
        this._hasNativeObjectIds = zCanReadObjectId;
        boolean z = true;
        if (!this._hasNativeTypeIds && !zCanReadObjectId) {
            z = false;
        }
        this._mayHaveNativeIds = z;
        this._forceBigDecimal = deserializationContext != null ? deserializationContext.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS) : false;
    }

    private final void _appendNativeIds(StringBuilder sb) {
        Object objFindObjectId = this._last.findObjectId(this._appendAt - 1);
        if (objFindObjectId != null) {
            sb.append("[objectId=");
            sb.append(objFindObjectId.toString());
            sb.append(']');
        }
        Object objFindTypeId = this._last.findTypeId(this._appendAt - 1);
        if (objFindTypeId != null) {
            sb.append("[typeId=");
            sb.append(objFindTypeId.toString());
            sb.append(']');
        }
    }

    private final void _checkNativeIds(JsonParser jsonParser) {
        Object typeId = jsonParser.getTypeId();
        this._typeId = typeId;
        if (typeId != null) {
            this._hasNativeId = true;
        }
        Object objectId = jsonParser.getObjectId();
        this._objectId = objectId;
        if (objectId != null) {
            this._hasNativeId = true;
        }
    }

    private void _copyBufferValue(JsonParser jsonParser, JsonToken jsonToken) {
        if (this._mayHaveNativeIds) {
            _checkNativeIds(jsonParser);
        }
        JsonParser.NumberType numberType = JsonParser.NumberType.INT;
        JsonToken jsonToken2 = JsonToken.NOT_AVAILABLE;
        switch (jsonToken.ordinal()) {
            case 6:
                writeObject(jsonParser.getEmbeddedObject());
                return;
            case 7:
                if (jsonParser.hasTextCharacters()) {
                    writeString(jsonParser.getTextCharacters(), jsonParser.getTextOffset(), jsonParser.getTextLength());
                    return;
                } else {
                    writeString(jsonParser.getText());
                    return;
                }
            case 8:
                int iOrdinal = jsonParser.getNumberType().ordinal();
                if (iOrdinal == 0) {
                    writeNumber(jsonParser.getIntValue());
                    return;
                } else if (iOrdinal != 2) {
                    writeNumber(jsonParser.getLongValue());
                    return;
                } else {
                    writeLazyInteger(jsonParser.getNumberValueDeferred());
                    return;
                }
            case 9:
                writeLazyDecimal(jsonParser.getNumberValueDeferred());
                return;
            case 10:
                writeBoolean(true);
                return;
            case 11:
                writeBoolean(false);
                return;
            case 12:
                writeNull();
                return;
            default:
                throw new RuntimeException("Internal error: unexpected token: ".concat(String.valueOf(String.valueOf(jsonToken))));
        }
    }

    @Deprecated
    public static TokenBuffer asCopyOfValue(JsonParser jsonParser) throws StreamWriteException {
        TokenBuffer tokenBuffer = new TokenBuffer(jsonParser);
        tokenBuffer.copyCurrentStructure(jsonParser);
        return tokenBuffer;
    }

    private void writeLazyDecimal(Object obj) {
        _appendValue(JsonToken.VALUE_NUMBER_FLOAT, obj);
    }

    private void writeLazyInteger(Object obj) {
        _appendValue(JsonToken.VALUE_NUMBER_INT, obj);
    }

    protected final void _appendEndMarker(JsonToken jsonToken) {
        Segment segmentAppend = this._last.append(this._appendAt, jsonToken);
        if (segmentAppend == null) {
            this._appendAt++;
        } else {
            this._last = segmentAppend;
            this._appendAt = 1;
        }
    }

    protected final void _appendFieldName(Object obj) {
        boolean z = this._hasNativeId;
        Segment segment = this._last;
        Segment segmentAppend = z ? segment.append(this._appendAt, JsonToken.FIELD_NAME, obj, this._objectId, this._typeId) : segment.append(this._appendAt, JsonToken.FIELD_NAME, obj);
        if (segmentAppend == null) {
            this._appendAt++;
        } else {
            this._last = segmentAppend;
            this._appendAt = 1;
        }
    }

    protected final void _appendStartMarker(JsonToken jsonToken) {
        boolean z = this._hasNativeId;
        Segment segment = this._last;
        Segment segmentAppend = z ? segment.append(this._appendAt, jsonToken, this._objectId, this._typeId) : segment.append(this._appendAt, jsonToken);
        if (segmentAppend == null) {
            this._appendAt++;
        } else {
            this._last = segmentAppend;
            this._appendAt = 1;
        }
    }

    protected final void _appendValue(JsonToken jsonToken, Object obj) {
        this._writeContext.writeValue();
        boolean z = this._hasNativeId;
        Segment segment = this._last;
        Segment segmentAppend = z ? segment.append(this._appendAt, jsonToken, obj, this._objectId, this._typeId) : segment.append(this._appendAt, jsonToken, obj);
        if (segmentAppend == null) {
            this._appendAt++;
        } else {
            this._last = segmentAppend;
            this._appendAt = 1;
        }
    }

    protected void _copyBufferContents(JsonParser jsonParser) throws JsonGenerationException {
        int i2 = 1;
        while (true) {
            JsonToken jsonTokenNextToken = jsonParser.nextToken();
            if (jsonTokenNextToken == null) {
                return;
            }
            JsonParser.NumberType numberType = JsonParser.NumberType.INT;
            int iOrdinal = jsonTokenNextToken.ordinal();
            if (iOrdinal == 1) {
                i2++;
                if (this._mayHaveNativeIds) {
                    _checkNativeIds(jsonParser);
                }
                writeStartObject();
            } else if (iOrdinal == 2) {
                i2--;
                writeEndObject();
                if (i2 == 0) {
                    return;
                }
            } else if (iOrdinal == 3) {
                i2++;
                if (this._mayHaveNativeIds) {
                    _checkNativeIds(jsonParser);
                }
                writeStartArray();
            } else if (iOrdinal == 4) {
                i2--;
                writeEndArray();
                if (i2 == 0) {
                    return;
                }
            } else if (iOrdinal != 5) {
                _copyBufferValue(jsonParser, jsonTokenNextToken);
            } else {
                if (this._mayHaveNativeIds) {
                    _checkNativeIds(jsonParser);
                }
                writeFieldName(jsonParser.currentName());
            }
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    protected void _reportUnsupportedOperation() {
        throw new UnsupportedOperationException("Called operation not supported for TokenBuffer");
    }

    public TokenBuffer append(TokenBuffer tokenBuffer) throws StreamWriteException {
        if (!this._hasNativeTypeIds) {
            this._hasNativeTypeIds = tokenBuffer.canWriteTypeId();
        }
        boolean zCanWriteObjectId = this._hasNativeObjectIds;
        if (!zCanWriteObjectId) {
            zCanWriteObjectId = tokenBuffer.canWriteObjectId();
            this._hasNativeObjectIds = zCanWriteObjectId;
        }
        boolean z = true;
        if (!this._hasNativeTypeIds && !zCanWriteObjectId) {
            z = false;
        }
        this._mayHaveNativeIds = z;
        JsonParser jsonParserAsParser = tokenBuffer.asParser();
        while (jsonParserAsParser.nextToken() != null) {
            copyCurrentStructure(jsonParserAsParser);
        }
        return this;
    }

    public JsonParser asParser(JsonParser jsonParser) {
        Parser parser = new Parser(this._first, jsonParser.getCodec(), this._hasNativeTypeIds, this._hasNativeObjectIds, this._parentContext, jsonParser.streamReadConstraints());
        parser.setLocation(jsonParser.currentTokenLocation());
        return parser;
    }

    public JsonParser asParserOnFirstToken() {
        JsonParser jsonParserAsParser = asParser(this._objectCodec);
        jsonParserAsParser.nextToken();
        return jsonParserAsParser;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public boolean canWriteBinaryNatively() {
        return true;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public boolean canWriteObjectId() {
        return this._hasNativeObjectIds;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public boolean canWriteTypeId() {
        return this._hasNativeTypeIds;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this._closed = true;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void copyCurrentEvent(JsonParser jsonParser) throws JsonGenerationException {
        if (this._mayHaveNativeIds) {
            _checkNativeIds(jsonParser);
        }
        JsonParser.NumberType numberType = JsonParser.NumberType.INT;
        JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
        switch (jsonParser.currentToken().ordinal()) {
            case 1:
                writeStartObject();
                return;
            case 2:
                writeEndObject();
                return;
            case 3:
                writeStartArray();
                return;
            case 4:
                writeEndArray();
                return;
            case 5:
                writeFieldName(jsonParser.currentName());
                return;
            case 6:
                writeObject(jsonParser.getEmbeddedObject());
                return;
            case 7:
                if (jsonParser.hasTextCharacters()) {
                    writeString(jsonParser.getTextCharacters(), jsonParser.getTextOffset(), jsonParser.getTextLength());
                    return;
                } else {
                    writeString(jsonParser.getText());
                    return;
                }
            case 8:
                int iOrdinal = jsonParser.getNumberType().ordinal();
                if (iOrdinal == 0) {
                    writeNumber(jsonParser.getIntValue());
                    return;
                } else if (iOrdinal != 2) {
                    writeNumber(jsonParser.getLongValue());
                    return;
                } else {
                    writeLazyInteger(jsonParser.getNumberValueDeferred());
                    return;
                }
            case 9:
                writeLazyDecimal(jsonParser.getNumberValueDeferred());
                return;
            case 10:
                writeBoolean(true);
                return;
            case 11:
                writeBoolean(false);
                return;
            case 12:
                writeNull();
                return;
            default:
                throw new RuntimeException("Internal error: unexpected token: ".concat(String.valueOf(String.valueOf(jsonParser.currentToken()))));
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void copyCurrentStructure(JsonParser jsonParser) throws JsonEOFException, JsonGenerationException {
        JsonToken jsonTokenCurrentToken = jsonParser.currentToken();
        if (jsonTokenCurrentToken == JsonToken.FIELD_NAME) {
            if (this._mayHaveNativeIds) {
                _checkNativeIds(jsonParser);
            }
            writeFieldName(jsonParser.currentName());
            jsonTokenCurrentToken = jsonParser.nextToken();
        } else if (jsonTokenCurrentToken == null) {
            throw new JsonEOFException(jsonParser, null, "Unexpected end-of-input");
        }
        JsonParser.NumberType numberType = JsonParser.NumberType.INT;
        int iOrdinal = jsonTokenCurrentToken.ordinal();
        if (iOrdinal == 1) {
            if (this._mayHaveNativeIds) {
                _checkNativeIds(jsonParser);
            }
            writeStartObject();
            _copyBufferContents(jsonParser);
            return;
        }
        if (iOrdinal == 2) {
            writeEndObject();
            return;
        }
        if (iOrdinal != 3) {
            if (iOrdinal != 4) {
                _copyBufferValue(jsonParser, jsonTokenCurrentToken);
                return;
            } else {
                writeEndArray();
                return;
            }
        }
        if (this._mayHaveNativeIds) {
            _checkNativeIds(jsonParser);
        }
        writeStartArray();
        _copyBufferContents(jsonParser);
    }

    public TokenBuffer deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws StreamWriteException, JsonMappingException {
        JsonToken jsonTokenNextToken;
        if (!jsonParser.hasToken(JsonToken.FIELD_NAME)) {
            copyCurrentStructure(jsonParser);
            return this;
        }
        writeStartObject();
        do {
            copyCurrentStructure(jsonParser);
            jsonTokenNextToken = jsonParser.nextToken();
        } while (jsonTokenNextToken == JsonToken.FIELD_NAME);
        JsonToken jsonToken = JsonToken.END_OBJECT;
        if (jsonTokenNextToken != jsonToken) {
            deserializationContext.reportWrongTokenException(TokenBuffer.class, jsonToken, "Expected END_OBJECT after copying contents of a JsonParser into TokenBuffer, got ".concat(String.valueOf(String.valueOf(jsonTokenNextToken))), new Object[0]);
        }
        writeEndObject();
        return this;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public JsonGenerator disable(JsonGenerator.Feature feature) {
        this._generatorFeatures = (~feature.getMask()) & this._generatorFeatures;
        return this;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public JsonGenerator enable(JsonGenerator.Feature feature) {
        this._generatorFeatures = feature.getMask() | this._generatorFeatures;
        return this;
    }

    public JsonToken firstToken() {
        return this._first.type(0);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator, java.io.Flushable
    public void flush() {
    }

    public TokenBuffer forceUseOfBigDecimal(boolean z) {
        this._forceBigDecimal = z;
        return this;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public ObjectCodec getCodec() {
        return this._objectCodec;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public int getFeatureMask() {
        return this._generatorFeatures;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public JacksonFeatureSet<StreamWriteCapability> getWriteCapabilities() {
        return DEFAULT_WRITE_CAPABILITIES;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public boolean isClosed() {
        return this._closed;
    }

    public boolean isEmpty() {
        return this._appendAt == 0 && this._first == this._last;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public boolean isEnabled(JsonGenerator.Feature feature) {
        return (this._generatorFeatures & feature.getMask()) != 0;
    }

    public TokenBuffer overrideParentContext(JsonStreamContext jsonStreamContext) {
        this._parentContext = jsonStreamContext;
        return this;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public JsonGenerator overrideStdFeatures(int i2, int i3) {
        this._generatorFeatures = (i2 & i3) | (getFeatureMask() & (~i3));
        return this;
    }

    public void serialize(JsonGenerator jsonGenerator) throws JsonGenerationException {
        Segment next = this._first;
        boolean z = this._mayHaveNativeIds;
        boolean z2 = z && next.hasIds();
        int i2 = -1;
        while (true) {
            i2++;
            if (i2 >= 16) {
                next = next.next();
                if (next == null) {
                    return;
                }
                z2 = z && next.hasIds();
                i2 = 0;
            }
            JsonToken jsonTokenType = next.type(i2);
            if (jsonTokenType != null) {
                if (z2) {
                    Object objFindObjectId = next.findObjectId(i2);
                    if (objFindObjectId != null) {
                        jsonGenerator.writeObjectId(objFindObjectId);
                    }
                    Object objFindTypeId = next.findTypeId(i2);
                    if (objFindTypeId != null) {
                        jsonGenerator.writeTypeId(objFindTypeId);
                    }
                }
                JsonParser.NumberType numberType = JsonParser.NumberType.INT;
                switch (jsonTokenType.ordinal()) {
                    case 1:
                        jsonGenerator.writeStartObject();
                        break;
                    case 2:
                        jsonGenerator.writeEndObject();
                        break;
                    case 3:
                        jsonGenerator.writeStartArray();
                        break;
                    case 4:
                        jsonGenerator.writeEndArray();
                        break;
                    case 5:
                        Object obj = next.get(i2);
                        if (!(obj instanceof SerializableString)) {
                            jsonGenerator.writeFieldName((String) obj);
                            break;
                        } else {
                            jsonGenerator.writeFieldName((SerializableString) obj);
                            break;
                        }
                    case 6:
                        Object obj2 = next.get(i2);
                        if (!(obj2 instanceof RawValue)) {
                            if (!(obj2 instanceof JsonSerializable)) {
                                jsonGenerator.writeEmbeddedObject(obj2);
                                break;
                            } else {
                                jsonGenerator.writeObject(obj2);
                                break;
                            }
                        } else {
                            ((RawValue) obj2).serialize(jsonGenerator);
                            break;
                        }
                    case 7:
                        Object obj3 = next.get(i2);
                        if (!(obj3 instanceof SerializableString)) {
                            jsonGenerator.writeString((String) obj3);
                            break;
                        } else {
                            jsonGenerator.writeString((SerializableString) obj3);
                            break;
                        }
                    case 8:
                        Object obj4 = next.get(i2);
                        if (!(obj4 instanceof Integer)) {
                            if (!(obj4 instanceof BigInteger)) {
                                if (!(obj4 instanceof Long)) {
                                    if (!(obj4 instanceof Short)) {
                                        jsonGenerator.writeNumber(((Number) obj4).intValue());
                                        break;
                                    } else {
                                        jsonGenerator.writeNumber(((Short) obj4).shortValue());
                                        break;
                                    }
                                } else {
                                    jsonGenerator.writeNumber(((Long) obj4).longValue());
                                    break;
                                }
                            } else {
                                jsonGenerator.writeNumber((BigInteger) obj4);
                                break;
                            }
                        } else {
                            jsonGenerator.writeNumber(((Integer) obj4).intValue());
                            break;
                        }
                    case 9:
                        Object obj5 = next.get(i2);
                        if (!(obj5 instanceof Double)) {
                            if (!(obj5 instanceof BigDecimal)) {
                                if (!(obj5 instanceof Float)) {
                                    if (obj5 != null) {
                                        if (!(obj5 instanceof String)) {
                                            _reportError(String.format("Unrecognized value type for VALUE_NUMBER_FLOAT: %s, cannot serialize", obj5.getClass().getName()));
                                            break;
                                        } else {
                                            jsonGenerator.writeNumber((String) obj5);
                                            break;
                                        }
                                    } else {
                                        jsonGenerator.writeNull();
                                        break;
                                    }
                                } else {
                                    jsonGenerator.writeNumber(((Float) obj5).floatValue());
                                    break;
                                }
                            } else {
                                jsonGenerator.writeNumber((BigDecimal) obj5);
                                break;
                            }
                        } else {
                            jsonGenerator.writeNumber(((Double) obj5).doubleValue());
                            break;
                        }
                    case 10:
                        jsonGenerator.writeBoolean(true);
                        break;
                    case 11:
                        jsonGenerator.writeBoolean(false);
                        break;
                    case 12:
                        jsonGenerator.writeNull();
                        break;
                    default:
                        throw new RuntimeException("Internal error: should never end up through this code path");
                }
            } else {
                return;
            }
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public JsonGenerator setCodec(ObjectCodec objectCodec) {
        this._objectCodec = objectCodec;
        return this;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    @Deprecated
    public JsonGenerator setFeatureMask(int i2) {
        this._generatorFeatures = i2;
        return this;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[TokenBuffer: ");
        JsonParser jsonParserAsParser = asParser();
        int i2 = 0;
        boolean z = true;
        if (!this._hasNativeTypeIds && !this._hasNativeObjectIds) {
            z = false;
        }
        while (true) {
            try {
                JsonToken jsonTokenNextToken = jsonParserAsParser.nextToken();
                if (jsonTokenNextToken == null) {
                    break;
                }
                if (z) {
                    _appendNativeIds(sb);
                }
                if (i2 < 100) {
                    if (i2 > 0) {
                        sb.append(", ");
                    }
                    sb.append(jsonTokenNextToken.toString());
                    if (jsonTokenNextToken == JsonToken.FIELD_NAME) {
                        sb.append('(');
                        sb.append(jsonParserAsParser.currentName());
                        sb.append(')');
                    }
                }
                i2++;
            } catch (IOException e2) {
                throw new IllegalStateException(e2);
            }
        }
        if (i2 >= 100) {
            sb.append(" ... (truncated ");
            sb.append(i2 - 100);
            sb.append(" entries)");
        }
        sb.append(']');
        return sb.toString();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public JsonGenerator useDefaultPrettyPrinter() {
        return this;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator, com.fasterxml.jackson.core.Versioned
    public Version version() {
        return PackageVersion.VERSION;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeBinary(Base64Variant base64Variant, byte[] bArr, int i2, int i3) {
        byte[] bArr2 = new byte[i3];
        System.arraycopy(bArr, i2, bArr2, 0, i3);
        writeObject(bArr2);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeBoolean(boolean z) {
        _appendValue(z ? JsonToken.VALUE_TRUE : JsonToken.VALUE_FALSE);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeEmbeddedObject(Object obj) {
        _appendValue(JsonToken.VALUE_EMBEDDED_OBJECT, obj);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void writeEndArray() {
        _appendEndMarker(JsonToken.END_ARRAY);
        JsonWriteContext parent = this._writeContext.getParent();
        if (parent != null) {
            this._writeContext = parent;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void writeEndObject() {
        _appendEndMarker(JsonToken.END_OBJECT);
        JsonWriteContext parent = this._writeContext.getParent();
        if (parent != null) {
            this._writeContext = parent;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeFieldName(SerializableString serializableString) throws JsonGenerationException {
        this._writeContext.writeFieldName(serializableString.getValue());
        _appendFieldName(serializableString);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNull() {
        _appendValue(JsonToken.VALUE_NULL);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(BigDecimal bigDecimal) {
        if (bigDecimal == null) {
            writeNull();
        } else {
            _appendValue(JsonToken.VALUE_NUMBER_FLOAT, bigDecimal);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeObject(Object obj) {
        if (obj == null) {
            writeNull();
            return;
        }
        if (obj.getClass() == byte[].class || (obj instanceof RawValue)) {
            _appendValue(JsonToken.VALUE_EMBEDDED_OBJECT, obj);
            return;
        }
        ObjectCodec objectCodec = this._objectCodec;
        if (objectCodec == null) {
            _appendValue(JsonToken.VALUE_EMBEDDED_OBJECT, obj);
        } else {
            objectCodec.writeValue(this, obj);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeObjectId(Object obj) {
        this._objectId = obj;
        this._hasNativeId = true;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeRaw(char c2) {
        _reportUnsupportedOperation();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeRawUTF8String(byte[] bArr, int i2, int i3) {
        _reportUnsupportedOperation();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeRawValue(String str, int i2, int i3) {
        if (i2 > 0 || i3 != str.length()) {
            str = str.substring(i2, i3 + i2);
        }
        _appendValue(JsonToken.VALUE_EMBEDDED_OBJECT, new RawValue(str));
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void writeStartArray() {
        this._writeContext.writeValue();
        _appendStartMarker(JsonToken.START_ARRAY);
        this._writeContext = this._writeContext.createChildArrayContext();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void writeStartObject() {
        this._writeContext.writeValue();
        _appendStartMarker(JsonToken.START_OBJECT);
        this._writeContext = this._writeContext.createChildObjectContext();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeString(Reader reader, int i2) throws IOException {
        if (reader == null) {
            _reportError("null reader");
        }
        int i3 = i2 >= 0 ? i2 : Integer.MAX_VALUE;
        char[] cArr = new char[1000];
        StringBuilder sb = new StringBuilder(1000);
        while (i3 > 0) {
            int i4 = reader.read(cArr, 0, Math.min(i3, 1000));
            if (i4 <= 0) {
                break;
            }
            sb.append(cArr, 0, i4);
            i3 -= i4;
        }
        if (i3 > 0 && i2 >= 0) {
            _reportError("Was not able to read enough from reader");
        }
        _appendValue(JsonToken.VALUE_STRING, sb.toString());
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeTree(TreeNode treeNode) {
        if (treeNode == null) {
            writeNull();
            return;
        }
        ObjectCodec objectCodec = this._objectCodec;
        if (objectCodec == null) {
            _appendValue(JsonToken.VALUE_EMBEDDED_OBJECT, treeNode);
        } else {
            objectCodec.writeTree(this, treeNode);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeTypeId(Object obj) {
        this._typeId = obj;
        this._hasNativeId = true;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeUTF8String(byte[] bArr, int i2, int i3) {
        _reportUnsupportedOperation();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeRaw(SerializableString serializableString) {
        _reportUnsupportedOperation();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final JsonWriteContext getOutputContext() {
        return this._writeContext;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeRaw(String str) {
        _reportUnsupportedOperation();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeRaw(String str, int i2, int i3) {
        _reportUnsupportedOperation();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeRaw(char[] cArr, int i2, int i3) {
        _reportUnsupportedOperation();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public int writeBinary(Base64Variant base64Variant, InputStream inputStream, int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(float f2) {
        _appendValue(JsonToken.VALUE_NUMBER_FLOAT, Float.valueOf(f2));
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void writeFieldName(String str) throws JsonGenerationException {
        this._writeContext.writeFieldName(str);
        _appendFieldName(str);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(int i2) {
        _appendValue(JsonToken.VALUE_NUMBER_INT, Integer.valueOf(i2));
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(long j2) {
        _appendValue(JsonToken.VALUE_NUMBER_INT, Long.valueOf(j2));
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(String str) {
        _appendValue(JsonToken.VALUE_NUMBER_FLOAT, str);
    }

    public void writeNumber(String str, boolean z) {
        _appendValue(z ? JsonToken.VALUE_NUMBER_INT : JsonToken.VALUE_NUMBER_FLOAT, str);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(double d2) {
        _appendValue(JsonToken.VALUE_NUMBER_FLOAT, Double.valueOf(d2));
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(BigInteger bigInteger) {
        if (bigInteger == null) {
            writeNull();
        } else {
            _appendValue(JsonToken.VALUE_NUMBER_INT, bigInteger);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeStartArray(Object obj) {
        this._writeContext.writeValue();
        _appendStartMarker(JsonToken.START_ARRAY);
        this._writeContext = this._writeContext.createChildArrayContext(obj);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeStartObject(Object obj) {
        this._writeContext.writeValue();
        _appendStartMarker(JsonToken.START_OBJECT);
        this._writeContext = this._writeContext.createChildObjectContext(obj);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(short s) {
        _appendValue(JsonToken.VALUE_NUMBER_INT, Short.valueOf(s));
    }

    /* compiled from: WazeSource */
    public final class Segment {
        public static final int TOKENS_PER_SEGMENT = 16;
        private static final JsonToken[] TOKEN_TYPES_BY_INDEX;
        protected TreeMap<Integer, Object> _nativeIds;
        protected Segment _next;
        protected long _tokenTypes;
        protected final Object[] _tokens = new Object[16];

        static {
            JsonToken[] jsonTokenArr = new JsonToken[16];
            TOKEN_TYPES_BY_INDEX = jsonTokenArr;
            System.arraycopy(JsonToken.values(), 1, jsonTokenArr, 1, Math.min(15, r1.length - 1));
        }

        private final int _objectIdIndex(int i2) {
            return i2 + i2 + 1;
        }

        private final int _typeIdIndex(int i2) {
            return i2 + i2;
        }

        private final void assignNativeIds(int i2, Object obj, Object obj2) {
            TreeMap<Integer, Object> treeMap = this._nativeIds;
            if (treeMap == null) {
                treeMap = new TreeMap<>();
                this._nativeIds = treeMap;
            }
            if (obj != null) {
                treeMap.put(Integer.valueOf(_objectIdIndex(i2)), obj);
            }
            if (obj2 != null) {
                this._nativeIds.put(Integer.valueOf(_typeIdIndex(i2)), obj2);
            }
        }

        private void set(int i2, JsonToken jsonToken, Object obj, Object obj2, Object obj3) {
            this._tokens[i2] = obj;
            long jOrdinal = jsonToken.ordinal();
            if (i2 > 0) {
                jOrdinal <<= i2 << 2;
            }
            this._tokenTypes = jOrdinal | this._tokenTypes;
            assignNativeIds(i2, obj2, obj3);
        }

        public Segment append(int i2, JsonToken jsonToken, Object obj, Object obj2, Object obj3) {
            if (i2 < 16) {
                set(i2, jsonToken, obj, obj2, obj3);
                return null;
            }
            Segment segment = new Segment();
            this._next = segment;
            segment.set(0, jsonToken, obj, obj2, obj3);
            return this._next;
        }

        Object findObjectId(int i2) {
            TreeMap<Integer, Object> treeMap = this._nativeIds;
            if (treeMap == null) {
                return null;
            }
            return treeMap.get(Integer.valueOf(_objectIdIndex(i2)));
        }

        Object findTypeId(int i2) {
            TreeMap<Integer, Object> treeMap = this._nativeIds;
            if (treeMap == null) {
                return null;
            }
            return treeMap.get(Integer.valueOf(_typeIdIndex(i2)));
        }

        public Object get(int i2) {
            return this._tokens[i2];
        }

        public boolean hasIds() {
            return this._nativeIds != null;
        }

        public Segment next() {
            return this._next;
        }

        public int rawType(int i2) {
            long j2 = this._tokenTypes;
            if (i2 > 0) {
                j2 >>= i2 << 2;
            }
            return ((int) j2) & 15;
        }

        public JsonToken type(int i2) {
            long j2 = this._tokenTypes;
            if (i2 > 0) {
                j2 >>= i2 << 2;
            }
            return TOKEN_TYPES_BY_INDEX[((int) j2) & 15];
        }

        private void set(int i2, JsonToken jsonToken, Object obj) {
            this._tokens[i2] = obj;
            long jOrdinal = jsonToken.ordinal();
            if (i2 > 0) {
                jOrdinal <<= i2 << 2;
            }
            this._tokenTypes = jOrdinal | this._tokenTypes;
        }

        private void set(int i2, JsonToken jsonToken, Object obj, Object obj2) {
            long jOrdinal = jsonToken.ordinal();
            if (i2 > 0) {
                jOrdinal <<= i2 << 2;
            }
            this._tokenTypes = jOrdinal | this._tokenTypes;
            assignNativeIds(i2, obj, obj2);
        }

        private void set(int i2, JsonToken jsonToken) {
            long jOrdinal = jsonToken.ordinal();
            if (i2 > 0) {
                jOrdinal <<= i2 << 2;
            }
            this._tokenTypes |= jOrdinal;
        }

        public Segment append(int i2, JsonToken jsonToken, Object obj) {
            if (i2 < 16) {
                set(i2, jsonToken, obj);
                return null;
            }
            Segment segment = new Segment();
            this._next = segment;
            segment.set(0, jsonToken, obj);
            return this._next;
        }

        public Segment append(int i2, JsonToken jsonToken, Object obj, Object obj2) {
            if (i2 < 16) {
                set(i2, jsonToken, obj, obj2);
                return null;
            }
            Segment segment = new Segment();
            this._next = segment;
            segment.set(0, jsonToken, obj, obj2);
            return this._next;
        }

        public Segment append(int i2, JsonToken jsonToken) {
            if (i2 < 16) {
                set(i2, jsonToken);
                return null;
            }
            Segment segment = new Segment();
            this._next = segment;
            segment.set(0, jsonToken);
            return this._next;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeStartArray(Object obj, int i2) {
        this._writeContext.writeValue();
        _appendStartMarker(JsonToken.START_ARRAY);
        this._writeContext = this._writeContext.createChildArrayContext(obj);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeStartObject(Object obj, int i2) {
        this._writeContext.writeValue();
        _appendStartMarker(JsonToken.START_OBJECT);
        this._writeContext = this._writeContext.createChildObjectContext(obj);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeRawValue(String str) {
        _appendValue(JsonToken.VALUE_EMBEDDED_OBJECT, new RawValue(str));
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeRawValue(char[] cArr, int i2, int i3) {
        _appendValue(JsonToken.VALUE_EMBEDDED_OBJECT, new String(cArr, i2, i3));
    }

    public JsonParser asParser() {
        return asParser(this._objectCodec);
    }

    public JsonParser asParser(ObjectCodec objectCodec) {
        return new Parser(this._first, objectCodec, this._hasNativeTypeIds, this._hasNativeObjectIds, this._parentContext, this._streamReadConstraints);
    }

    public JsonParser asParser(StreamReadConstraints streamReadConstraints) {
        return new Parser(this._first, this._objectCodec, this._hasNativeTypeIds, this._hasNativeObjectIds, this._parentContext, streamReadConstraints);
    }

    /* compiled from: WazeSource */
    public final class Parser extends ParserMinimalBase {
        protected transient ByteArrayBuilder _byteBuilder;
        protected boolean _closed;
        protected ObjectCodec _codec;
        protected final boolean _hasNativeIds;
        protected final boolean _hasNativeObjectIds;
        protected final boolean _hasNativeTypeIds;
        protected JsonLocation _location;
        protected TokenBufferReadContext _parsingContext;
        protected Segment _segment;
        protected int _segmentPtr;

        public Parser(Segment segment, ObjectCodec objectCodec, boolean z, boolean z2, JsonStreamContext jsonStreamContext, StreamReadConstraints streamReadConstraints) {
            super(streamReadConstraints);
            this._location = null;
            this._segment = segment;
            this._segmentPtr = -1;
            this._codec = objectCodec;
            this._parsingContext = TokenBufferReadContext.createRootContext(jsonStreamContext);
            this._hasNativeTypeIds = z;
            this._hasNativeObjectIds = z2;
            boolean z3 = true;
            if (!z && !z2) {
                z3 = false;
            }
            this._hasNativeIds = z3;
        }

        private final boolean _smallerThanInt(Number number) {
            return (number instanceof Short) || (number instanceof Byte);
        }

        private final boolean _smallerThanLong(Number number) {
            return (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
        }

        private Number getNumberValue(boolean z) throws JsonParseException {
            _checkIsNumber();
            Object obj_currentObject = _currentObject();
            if (obj_currentObject instanceof Number) {
                return (Number) obj_currentObject;
            }
            if (!(obj_currentObject instanceof String)) {
                throw new IllegalStateException("Internal error: entry should be a Number, but is of type ".concat(ClassUtil.classNameOf(obj_currentObject)));
            }
            String str = (String) obj_currentObject;
            int length = str.length();
            if (this._currToken == JsonToken.VALUE_NUMBER_INT) {
                return (z || length >= 19) ? NumberInput.parseBigInteger(str, isEnabled(StreamReadFeature.USE_FAST_BIG_NUMBER_PARSER)) : length >= 10 ? Long.valueOf(NumberInput.parseLong(str)) : Integer.valueOf(NumberInput.parseInt(str));
            }
            if (!z) {
                return Double.valueOf(NumberInput.parseDouble(str, isEnabled(StreamReadFeature.USE_FAST_DOUBLE_PARSER)));
            }
            BigDecimal bigDecimal = NumberInput.parseBigDecimal(str, isEnabled(StreamReadFeature.USE_FAST_BIG_NUMBER_PARSER));
            if (bigDecimal != null) {
                return bigDecimal;
            }
            throw new IllegalStateException("Internal error: failed to parse number '" + str + "'");
        }

        protected final void _checkIsNumber() throws JsonParseException {
            JsonToken jsonToken = this._currToken;
            if (jsonToken == null || !jsonToken.isNumeric()) {
                throw _constructError("Current token (" + String.valueOf(jsonToken) + ") not numeric, cannot use numeric value accessors");
            }
        }

        protected int _convertNumberToInt(Number number) {
            if (number instanceof Long) {
                long jLongValue = number.longValue();
                int i2 = (int) jLongValue;
                if (i2 != jLongValue) {
                    reportOverflowInt();
                }
                return i2;
            }
            if (number instanceof BigInteger) {
                BigInteger bigInteger = (BigInteger) number;
                if (BI_MIN_INT.compareTo(bigInteger) > 0 || BI_MAX_INT.compareTo(bigInteger) < 0) {
                    reportOverflowInt();
                }
            } else {
                if ((number instanceof Double) || (number instanceof Float)) {
                    double dDoubleValue = number.doubleValue();
                    if (dDoubleValue < -2.147483648E9d || dDoubleValue > 2.147483647E9d) {
                        reportOverflowInt();
                    }
                    return (int) dDoubleValue;
                }
                if (number instanceof BigDecimal) {
                    BigDecimal bigDecimal = (BigDecimal) number;
                    if (BD_MIN_INT.compareTo(bigDecimal) > 0 || BD_MAX_INT.compareTo(bigDecimal) < 0) {
                        reportOverflowInt();
                    }
                } else {
                    _throwInternal();
                }
            }
            return number.intValue();
        }

        protected long _convertNumberToLong(Number number) {
            if (number instanceof BigInteger) {
                BigInteger bigInteger = (BigInteger) number;
                if (BI_MIN_LONG.compareTo(bigInteger) > 0 || BI_MAX_LONG.compareTo(bigInteger) < 0) {
                    reportOverflowLong();
                }
            } else {
                if ((number instanceof Double) || (number instanceof Float)) {
                    double dDoubleValue = number.doubleValue();
                    if (dDoubleValue < -9.223372036854776E18d || dDoubleValue > 9.223372036854776E18d) {
                        reportOverflowLong();
                    }
                    return (long) dDoubleValue;
                }
                if (number instanceof BigDecimal) {
                    BigDecimal bigDecimal = (BigDecimal) number;
                    if (BD_MIN_LONG.compareTo(bigDecimal) > 0 || BD_MAX_LONG.compareTo(bigDecimal) < 0) {
                        reportOverflowLong();
                    }
                } else {
                    _throwInternal();
                }
            }
            return number.longValue();
        }

        protected final Object _currentObject() {
            return this._segment.get(this._segmentPtr);
        }

        @Override // com.fasterxml.jackson.core.base.ParserMinimalBase
        protected void _handleEOF() {
            _throwInternal();
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public boolean canReadObjectId() {
            return this._hasNativeObjectIds;
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public boolean canReadTypeId() {
            return this._hasNativeTypeIds;
        }

        @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this._closed) {
                return;
            }
            this._closed = true;
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public JsonLocation currentLocation() {
            JsonLocation jsonLocation = this._location;
            return jsonLocation == null ? JsonLocation.NA : jsonLocation;
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public String currentName() {
            return (this._currToken == JsonToken.START_OBJECT || this._currToken == JsonToken.START_ARRAY) ? this._parsingContext.getParent().getCurrentName() : this._parsingContext.getCurrentName();
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public JsonLocation currentTokenLocation() {
            return currentLocation();
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public BigInteger getBigIntegerValue() throws JsonParseException, StreamConstraintsException {
            Number numberValue = getNumberValue(true);
            if (numberValue instanceof BigInteger) {
                return (BigInteger) numberValue;
            }
            if (!(numberValue instanceof BigDecimal)) {
                return BigInteger.valueOf(numberValue.longValue());
            }
            BigDecimal bigDecimal = (BigDecimal) numberValue;
            streamReadConstraints().validateBigIntegerScale(bigDecimal.scale());
            return bigDecimal.toBigInteger();
        }

        @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
        public byte[] getBinaryValue(Base64Variant base64Variant) throws JsonParseException {
            if (this._currToken == JsonToken.VALUE_EMBEDDED_OBJECT) {
                Object obj_currentObject = _currentObject();
                if (obj_currentObject instanceof byte[]) {
                    return (byte[]) obj_currentObject;
                }
            }
            JsonToken jsonToken = this._currToken;
            if (jsonToken != JsonToken.VALUE_STRING) {
                throw _constructError("Current token (" + String.valueOf(jsonToken) + ") not VALUE_STRING (or VALUE_EMBEDDED_OBJECT with byte[]), cannot access as binary");
            }
            String text = getText();
            if (text == null) {
                return null;
            }
            ByteArrayBuilder byteArrayBuilder = this._byteBuilder;
            if (byteArrayBuilder == null) {
                byteArrayBuilder = new ByteArrayBuilder(100);
                this._byteBuilder = byteArrayBuilder;
            } else {
                byteArrayBuilder.reset();
            }
            _decodeBase64(text, byteArrayBuilder, base64Variant);
            return byteArrayBuilder.toByteArray();
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public ObjectCodec getCodec() {
            return this._codec;
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        @Deprecated
        public JsonLocation getCurrentLocation() {
            return currentLocation();
        }

        @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
        @Deprecated
        public String getCurrentName() {
            return currentName();
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public BigDecimal getDecimalValue() throws JsonParseException {
            Number numberValue = getNumberValue(true);
            return numberValue instanceof BigDecimal ? (BigDecimal) numberValue : numberValue instanceof Integer ? BigDecimal.valueOf(numberValue.intValue()) : numberValue instanceof Long ? BigDecimal.valueOf(numberValue.longValue()) : numberValue instanceof BigInteger ? new BigDecimal((BigInteger) numberValue) : BigDecimal.valueOf(numberValue.doubleValue());
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public double getDoubleValue() {
            return getNumberValue().doubleValue();
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public Object getEmbeddedObject() {
            if (this._currToken == JsonToken.VALUE_EMBEDDED_OBJECT) {
                return _currentObject();
            }
            return null;
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public float getFloatValue() {
            return getNumberValue().floatValue();
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public int getIntValue() throws JsonParseException {
            Number numberValue = getNumberValue(false);
            return ((numberValue instanceof Integer) || _smallerThanInt(numberValue)) ? numberValue.intValue() : _convertNumberToInt(numberValue);
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public long getLongValue() throws JsonParseException {
            Number numberValue = getNumberValue(false);
            return ((numberValue instanceof Long) || _smallerThanLong(numberValue)) ? numberValue.longValue() : _convertNumberToLong(numberValue);
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public JsonParser.NumberType getNumberType() {
            Object numberValueDeferred = getNumberValueDeferred();
            if (numberValueDeferred instanceof Integer) {
                return JsonParser.NumberType.INT;
            }
            if (numberValueDeferred instanceof Long) {
                return JsonParser.NumberType.LONG;
            }
            if (numberValueDeferred instanceof Double) {
                return JsonParser.NumberType.DOUBLE;
            }
            if (numberValueDeferred instanceof BigDecimal) {
                return JsonParser.NumberType.BIG_DECIMAL;
            }
            if (numberValueDeferred instanceof BigInteger) {
                return JsonParser.NumberType.BIG_INTEGER;
            }
            if (numberValueDeferred instanceof Float) {
                return JsonParser.NumberType.FLOAT;
            }
            if (numberValueDeferred instanceof Short) {
                return JsonParser.NumberType.INT;
            }
            if (numberValueDeferred instanceof String) {
                return this._currToken == JsonToken.VALUE_NUMBER_FLOAT ? JsonParser.NumberType.BIG_DECIMAL : JsonParser.NumberType.BIG_INTEGER;
            }
            return null;
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public JsonParser.NumberTypeFP getNumberTypeFP() {
            if (this._currToken == JsonToken.VALUE_NUMBER_FLOAT) {
                Object obj_currentObject = _currentObject();
                if (obj_currentObject instanceof Double) {
                    return JsonParser.NumberTypeFP.DOUBLE64;
                }
                if (obj_currentObject instanceof BigDecimal) {
                    return JsonParser.NumberTypeFP.BIG_DECIMAL;
                }
                if (obj_currentObject instanceof Float) {
                    return JsonParser.NumberTypeFP.FLOAT32;
                }
            }
            return JsonParser.NumberTypeFP.UNKNOWN;
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public Object getNumberValueDeferred() throws JsonParseException {
            _checkIsNumber();
            return _currentObject();
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public Object getObjectId() {
            return this._segment.findObjectId(this._segmentPtr);
        }

        @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
        public JsonStreamContext getParsingContext() {
            return this._parsingContext;
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public JacksonFeatureSet<StreamReadCapability> getReadCapabilities() {
            return DEFAULT_READ_CAPABILITIES;
        }

        @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
        public String getText() {
            JsonToken jsonToken;
            if (this._currToken == JsonToken.VALUE_STRING || (jsonToken = this._currToken) == JsonToken.FIELD_NAME) {
                Object obj_currentObject = _currentObject();
                return obj_currentObject instanceof String ? (String) obj_currentObject : ClassUtil.nullOrToString(obj_currentObject);
            }
            if (jsonToken == null) {
                return null;
            }
            JsonParser.NumberType numberType = JsonParser.NumberType.INT;
            int iOrdinal = this._currToken.ordinal();
            return (iOrdinal == 8 || iOrdinal == 9) ? ClassUtil.nullOrToString(_currentObject()) : this._currToken.asString();
        }

        @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
        public char[] getTextCharacters() {
            String text = getText();
            if (text == null) {
                return null;
            }
            return text.toCharArray();
        }

        @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
        public int getTextLength() {
            String text = getText();
            if (text == null) {
                return 0;
            }
            return text.length();
        }

        @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
        public int getTextOffset() {
            return 0;
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        @Deprecated
        public JsonLocation getTokenLocation() {
            return currentTokenLocation();
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public Object getTypeId() {
            return this._segment.findTypeId(this._segmentPtr);
        }

        @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
        public boolean hasTextCharacters() {
            return false;
        }

        @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
        public boolean isClosed() {
            return this._closed;
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public boolean isNaN() {
            if (this._currToken == JsonToken.VALUE_NUMBER_FLOAT) {
                Object obj_currentObject = _currentObject();
                if (obj_currentObject instanceof Double) {
                    return !TokenBuffer$Parser$$ExternalSyntheticBackport0.m(((Double) obj_currentObject).doubleValue());
                }
                if ((obj_currentObject instanceof Float) && !TokenBuffer$Parser$$ExternalSyntheticBackport0.m(((Float) obj_currentObject).floatValue())) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public String nextFieldName() {
            Segment segment;
            if (this._closed || (segment = this._segment) == null) {
                return null;
            }
            int i2 = this._segmentPtr + 1;
            if (i2 < 16) {
                JsonToken jsonTokenType = segment.type(i2);
                JsonToken jsonToken = JsonToken.FIELD_NAME;
                if (jsonTokenType == jsonToken) {
                    this._segmentPtr = i2;
                    _updateToken(jsonToken);
                    Object obj = this._segment.get(i2);
                    String string = obj instanceof String ? (String) obj : obj.toString();
                    this._parsingContext.setCurrentName(string);
                    return string;
                }
            }
            if (nextToken() == JsonToken.FIELD_NAME) {
                return currentName();
            }
            return null;
        }

        @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
        public JsonToken nextToken() {
            Segment next;
            if (this._closed || (next = this._segment) == null) {
                return null;
            }
            int i2 = this._segmentPtr + 1;
            this._segmentPtr = i2;
            if (i2 >= 16) {
                i2 = 0;
                this._segmentPtr = 0;
                next = next.next();
                this._segment = next;
                if (next == null) {
                    return null;
                }
            }
            _updateToken(next.type(i2));
            if (this._currToken == JsonToken.FIELD_NAME) {
                Object obj_currentObject = _currentObject();
                this._parsingContext.setCurrentName(obj_currentObject instanceof String ? (String) obj_currentObject : obj_currentObject.toString());
            } else {
                JsonToken jsonToken = this._currToken;
                if (jsonToken == JsonToken.START_OBJECT) {
                    this._parsingContext = this._parsingContext.createChildObjectContext();
                } else if (jsonToken == JsonToken.START_ARRAY) {
                    this._parsingContext = this._parsingContext.createChildArrayContext();
                } else if (jsonToken == JsonToken.END_OBJECT || jsonToken == JsonToken.END_ARRAY) {
                    this._parsingContext = this._parsingContext.parentOrCopy();
                } else {
                    this._parsingContext.updateForValue();
                }
            }
            return this._currToken;
        }

        @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
        public void overrideCurrentName(String str) {
            JsonStreamContext parent = this._parsingContext;
            if (this._currToken == JsonToken.START_OBJECT || this._currToken == JsonToken.START_ARRAY) {
                parent = parent.getParent();
            }
            if (parent instanceof TokenBufferReadContext) {
                try {
                    ((TokenBufferReadContext) parent).setCurrentName(str);
                } catch (IOException e2) {
                    throw new RuntimeException(e2);
                }
            }
        }

        public JsonToken peekNextToken() {
            if (!this._closed) {
                Segment next = this._segment;
                int i2 = this._segmentPtr + 1;
                if (i2 >= 16) {
                    next = next == null ? null : next.next();
                    i2 = 0;
                }
                if (next != null) {
                    return next.type(i2);
                }
            }
            return null;
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public int readBinaryValue(Base64Variant base64Variant, OutputStream outputStream) throws IOException {
            byte[] binaryValue = getBinaryValue(base64Variant);
            if (binaryValue == null) {
                return 0;
            }
            int length = binaryValue.length;
            outputStream.write(binaryValue, 0, length);
            return length;
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public void setCodec(ObjectCodec objectCodec) {
            this._codec = objectCodec;
        }

        public void setLocation(JsonLocation jsonLocation) {
            this._location = jsonLocation;
        }

        @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
        public StreamReadConstraints streamReadConstraints() {
            return this._streamReadConstraints;
        }

        @Override // com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.core.Versioned
        public Version version() {
            return PackageVersion.VERSION;
        }

        @Deprecated
        public Parser(Segment segment, ObjectCodec objectCodec, boolean z, boolean z2, JsonStreamContext jsonStreamContext) {
            this(segment, objectCodec, z, z2, jsonStreamContext, StreamReadConstraints.defaults());
        }

        @Deprecated
        public Parser(Segment segment, ObjectCodec objectCodec, boolean z, boolean z2) {
            this(segment, objectCodec, z, z2, null);
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public final Number getNumberValue() {
            return getNumberValue(false);
        }
    }

    protected final void _appendValue(JsonToken jsonToken) {
        Segment segmentAppend;
        this._writeContext.writeValue();
        boolean z = this._hasNativeId;
        Segment segment = this._last;
        if (z) {
            segmentAppend = segment.append(this._appendAt, jsonToken, this._objectId, this._typeId);
        } else {
            segmentAppend = segment.append(this._appendAt, jsonToken);
        }
        if (segmentAppend == null) {
            this._appendAt++;
        } else {
            this._last = segmentAppend;
            this._appendAt = 1;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeString(SerializableString serializableString) {
        if (serializableString == null) {
            writeNull();
        } else {
            _appendValue(JsonToken.VALUE_STRING, serializableString);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeString(String str) {
        if (str == null) {
            writeNull();
        } else {
            _appendValue(JsonToken.VALUE_STRING, str);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeString(char[] cArr, int i2, int i3) {
        writeString(new String(cArr, i2, i3));
    }

    public TokenBuffer(JsonParser jsonParser) {
        this(jsonParser, (DeserializationContext) null);
    }

    public TokenBuffer(ObjectCodec objectCodec, boolean z) {
        this._streamReadConstraints = StreamReadConstraints.defaults();
        this._hasNativeId = false;
        this._objectCodec = objectCodec;
        this._generatorFeatures = DEFAULT_GENERATOR_FEATURES;
        this._writeContext = JsonWriteContext.createRootContext(null);
        Segment segment = new Segment();
        this._last = segment;
        this._first = segment;
        this._appendAt = 0;
        this._hasNativeTypeIds = z;
        this._hasNativeObjectIds = z;
        this._mayHaveNativeIds = z;
    }
}
