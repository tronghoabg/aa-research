package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.core.io.CharacterEscapes;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.core.util.JacksonFeatureSet;
import com.fasterxml.jackson.core.util.VersionUtil;
import j$.util.Objects;
import java.io.Closeable;
import java.io.Flushable;
import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public abstract class JsonGenerator implements Closeable, Flushable, Versioned {
    protected static final JacksonFeatureSet<StreamWriteCapability> DEFAULT_BINARY_WRITE_CAPABILITIES;
    protected static final JacksonFeatureSet<StreamWriteCapability> DEFAULT_TEXTUAL_WRITE_CAPABILITIES;
    protected static final JacksonFeatureSet<StreamWriteCapability> DEFAULT_WRITE_CAPABILITIES;
    protected PrettyPrinter _cfgPrettyPrinter;

    /* compiled from: WazeSource */
    public enum Feature {
        AUTO_CLOSE_TARGET(true),
        AUTO_CLOSE_JSON_CONTENT(true),
        FLUSH_PASSED_TO_STREAM(true),
        QUOTE_FIELD_NAMES(true),
        QUOTE_NON_NUMERIC_NUMBERS(true),
        ESCAPE_NON_ASCII(false),
        WRITE_NUMBERS_AS_STRINGS(false),
        WRITE_BIGDECIMAL_AS_PLAIN(false),
        STRICT_DUPLICATE_DETECTION(false),
        IGNORE_UNKNOWN(false),
        USE_FAST_DOUBLE_WRITER(false),
        WRITE_HEX_UPPER_CASE(true),
        ESCAPE_FORWARD_SLASHES(false),
        COMBINE_UNICODE_SURROGATES_IN_UTF8(false);

        private final boolean _defaultState;
        private final int _mask = 1 << ordinal();

        Feature(boolean z) {
            this._defaultState = z;
        }

        public static int collectDefaults() {
            int mask = 0;
            for (Feature feature : values()) {
                if (feature.enabledByDefault()) {
                    mask |= feature.getMask();
                }
            }
            return mask;
        }

        public boolean enabledByDefault() {
            return this._defaultState;
        }

        public boolean enabledIn(int i2) {
            return (this._mask & i2) != 0;
        }

        public int getMask() {
            return this._mask;
        }
    }

    static {
        JacksonFeatureSet<StreamWriteCapability> jacksonFeatureSetFromDefaults = JacksonFeatureSet.fromDefaults(StreamWriteCapability.values());
        DEFAULT_WRITE_CAPABILITIES = jacksonFeatureSetFromDefaults;
        DEFAULT_TEXTUAL_WRITE_CAPABILITIES = jacksonFeatureSetFromDefaults.with(StreamWriteCapability.CAN_WRITE_FORMATTED_NUMBERS);
        DEFAULT_BINARY_WRITE_CAPABILITIES = jacksonFeatureSetFromDefaults.with(StreamWriteCapability.CAN_WRITE_BINARY_NATIVELY);
    }

    protected JsonGenerator() {
    }

    protected StreamWriteException _constructWriteException(String str, Object obj, Object obj2) {
        return _constructWriteException(String.format(str, obj, obj2));
    }

    protected void _copyCurrentContents(JsonParser jsonParser) {
        int i2 = 1;
        while (true) {
            JsonToken jsonTokenNextToken = jsonParser.nextToken();
            if (jsonTokenNextToken == null) {
                return;
            }
            switch (jsonTokenNextToken.id()) {
                case 1:
                    writeStartObject();
                    break;
                case 2:
                    i2--;
                    writeEndObject();
                    if (i2 == 0) {
                        return;
                    } else {
                        continue;
                    }
                case 3:
                    writeStartArray();
                    break;
                case 4:
                    i2--;
                    writeEndArray();
                    if (i2 == 0) {
                        return;
                    } else {
                        continue;
                    }
                case 5:
                    writeFieldName(jsonParser.currentName());
                    continue;
                case 6:
                    _copyCurrentStringValue(jsonParser);
                    continue;
                case 7:
                    _copyCurrentIntValue(jsonParser);
                    continue;
                case 8:
                    _copyCurrentFloatValue(jsonParser);
                    continue;
                case 9:
                    writeBoolean(true);
                    continue;
                case 10:
                    writeBoolean(false);
                    continue;
                case 11:
                    writeNull();
                    continue;
                case 12:
                    writeObject(jsonParser.getEmbeddedObject());
                    continue;
                default:
                    throw new IllegalStateException("Internal error: unknown current token, ".concat(jsonTokenNextToken.toString()));
            }
            i2++;
        }
    }

    protected void _copyCurrentFloatValue(JsonParser jsonParser) {
        JsonParser.NumberType numberType = jsonParser.getNumberType();
        if (numberType == JsonParser.NumberType.BIG_DECIMAL) {
            writeNumber(jsonParser.getDecimalValue());
        } else if (numberType == JsonParser.NumberType.FLOAT) {
            writeNumber(jsonParser.getFloatValue());
        } else {
            writeNumber(jsonParser.getDoubleValue());
        }
    }

    protected void _copyCurrentFloatValueExact(JsonParser jsonParser) {
        Number numberValueExact = jsonParser.getNumberValueExact();
        if (numberValueExact instanceof BigDecimal) {
            writeNumber((BigDecimal) numberValueExact);
        } else if (numberValueExact instanceof Double) {
            writeNumber(numberValueExact.doubleValue());
        } else {
            writeNumber(numberValueExact.floatValue());
        }
    }

    protected void _copyCurrentIntValue(JsonParser jsonParser) {
        JsonParser.NumberType numberType = jsonParser.getNumberType();
        if (numberType == JsonParser.NumberType.INT) {
            writeNumber(jsonParser.getIntValue());
        } else if (numberType == JsonParser.NumberType.LONG) {
            writeNumber(jsonParser.getLongValue());
        } else {
            writeNumber(jsonParser.getBigIntegerValue());
        }
    }

    protected void _copyCurrentStringValue(JsonParser jsonParser) {
        if (jsonParser.hasTextCharacters()) {
            writeString(jsonParser.getTextCharacters(), jsonParser.getTextOffset(), jsonParser.getTextLength());
        } else {
            writeString(jsonParser.getText());
        }
    }

    protected void _reportError(String str) throws JsonGenerationException {
        throw ((JsonGenerationException) _constructWriteException(str));
    }

    protected void _reportUnsupportedOperation() {
        _reportUnsupportedOperation("Operation not supported by `JsonGenerator` of type ".concat(String.valueOf(getClass().getName())));
    }

    protected final void _throwInternal() {
        VersionUtil.throwInternal();
    }

    protected final void _verifyOffsets(int i2, int i3, int i4) {
        if (i3 < 0 || i3 + i4 > i2) {
            throw new IllegalArgumentException(String.format("invalid argument(s) (offset=%d, length=%d) for input array of %d element", Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i2)));
        }
    }

    protected void _writeSimpleObject(Object obj) {
        if (obj == null) {
            writeNull();
            return;
        }
        if (obj instanceof String) {
            writeString((String) obj);
            return;
        }
        if (obj instanceof Number) {
            Number number = (Number) obj;
            if (number instanceof Integer) {
                writeNumber(number.intValue());
                return;
            }
            if (number instanceof Long) {
                writeNumber(number.longValue());
                return;
            }
            if (number instanceof Double) {
                writeNumber(number.doubleValue());
                return;
            }
            if (number instanceof Float) {
                writeNumber(number.floatValue());
                return;
            }
            if (number instanceof Short) {
                writeNumber(number.shortValue());
                return;
            }
            if (number instanceof Byte) {
                writeNumber((short) number.byteValue());
                return;
            }
            if (number instanceof BigInteger) {
                writeNumber((BigInteger) number);
                return;
            }
            if (number instanceof BigDecimal) {
                writeNumber((BigDecimal) number);
                return;
            } else if (number instanceof AtomicInteger) {
                writeNumber(((AtomicInteger) number).get());
                return;
            } else if (number instanceof AtomicLong) {
                writeNumber(((AtomicLong) number).get());
                return;
            }
        } else if (obj instanceof byte[]) {
            writeBinary((byte[]) obj);
            return;
        } else if (obj instanceof Boolean) {
            writeBoolean(((Boolean) obj).booleanValue());
            return;
        } else if (obj instanceof AtomicBoolean) {
            writeBoolean(((AtomicBoolean) obj).get());
            return;
        }
        throw new IllegalStateException("No ObjectCodec defined for the generator, can only serialize simple wrapper types (type passed " + obj.getClass().getName() + ")");
    }

    protected boolean _writeTypePrefixUsingNative(WritableTypeId writableTypeId) throws JsonGenerationException {
        writableTypeId.wrapperWritten = false;
        writeTypeId(writableTypeId.id);
        return false;
    }

    protected boolean _writeTypePrefixUsingWrapper(WritableTypeId writableTypeId) {
        String string = Objects.toString(writableTypeId.id, null);
        if (string == null) {
            return false;
        }
        WritableTypeId.Inclusion inclusion = writableTypeId.include;
        if (writableTypeId.valueShape != JsonToken.START_OBJECT && inclusion.requiresObjectContext()) {
            inclusion = WritableTypeId.Inclusion.WRAPPER_ARRAY;
            writableTypeId.include = inclusion;
        }
        writableTypeId.wrapperWritten = true;
        WritableTypeId.Inclusion inclusion2 = WritableTypeId.Inclusion.WRAPPER_ARRAY;
        int iOrdinal = inclusion.ordinal();
        if (iOrdinal == 1) {
            writeStartObject();
            writeFieldName(string);
            return false;
        }
        if (iOrdinal == 2) {
            writeStartObject(writableTypeId.forValue);
            writeStringField(writableTypeId.asProperty, string);
            return true;
        }
        if (iOrdinal == 3 || iOrdinal == 4) {
            return false;
        }
        writeStartArray();
        writeString(string);
        return false;
    }

    public void assignCurrentValue(Object obj) {
        JsonStreamContext outputContext = getOutputContext();
        if (outputContext != null) {
            outputContext.setCurrentValue(obj);
        }
    }

    public boolean canOmitFields() {
        return true;
    }

    public boolean canUseSchema(FormatSchema formatSchema) {
        return false;
    }

    public boolean canWriteBinaryNatively() {
        return false;
    }

    public boolean canWriteFormattedNumbers() {
        return false;
    }

    public boolean canWriteObjectId() {
        return false;
    }

    public boolean canWriteTypeId() {
        return false;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public abstract void close();

    public final JsonGenerator configure(Feature feature, boolean z) {
        if (z) {
            enable(feature);
            return this;
        }
        disable(feature);
        return this;
    }

    public void copyCurrentEvent(JsonParser jsonParser) throws StreamWriteException {
        JsonToken jsonTokenCurrentToken = jsonParser.currentToken();
        if (jsonTokenCurrentToken != null) {
            switch (jsonTokenCurrentToken.id()) {
                case -1:
                    break;
                case 0:
                default:
                    throw new IllegalStateException("Internal error: unknown current token, ".concat(jsonTokenCurrentToken.toString()));
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
                    _copyCurrentStringValue(jsonParser);
                    return;
                case 7:
                    _copyCurrentIntValue(jsonParser);
                    return;
                case 8:
                    _copyCurrentFloatValue(jsonParser);
                    return;
                case 9:
                    writeBoolean(true);
                    return;
                case 10:
                    writeBoolean(false);
                    return;
                case 11:
                    writeNull();
                    return;
                case 12:
                    writeObject(jsonParser.getEmbeddedObject());
                    return;
            }
        }
        throw _constructWriteException("No current event to copy");
    }

    public void copyCurrentEventExact(JsonParser jsonParser) throws StreamWriteException {
        JsonToken jsonTokenCurrentToken = jsonParser.currentToken();
        if (jsonTokenCurrentToken != null) {
            switch (jsonTokenCurrentToken.id()) {
                case -1:
                    break;
                case 0:
                default:
                    throw new IllegalStateException("Internal error: unknown current token, ".concat(jsonTokenCurrentToken.toString()));
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
                    _copyCurrentStringValue(jsonParser);
                    return;
                case 7:
                    _copyCurrentIntValue(jsonParser);
                    return;
                case 8:
                    _copyCurrentFloatValueExact(jsonParser);
                    return;
                case 9:
                    writeBoolean(true);
                    return;
                case 10:
                    writeBoolean(false);
                    return;
                case 11:
                    writeNull();
                    return;
                case 12:
                    writeObject(jsonParser.getEmbeddedObject());
                    return;
            }
        }
        throw _constructWriteException("No current event to copy");
    }

    public void copyCurrentStructure(JsonParser jsonParser) throws StreamWriteException {
        JsonToken jsonTokenCurrentToken = jsonParser.currentToken();
        int iId = -1;
        int iId2 = jsonTokenCurrentToken == null ? -1 : jsonTokenCurrentToken.id();
        if (iId2 == 5) {
            writeFieldName(jsonParser.currentName());
            JsonToken jsonTokenNextToken = jsonParser.nextToken();
            if (jsonTokenNextToken != null) {
                iId = jsonTokenNextToken.id();
            }
        } else {
            iId = iId2;
        }
        if (iId == 1) {
            writeStartObject();
            _copyCurrentContents(jsonParser);
        } else if (iId != 3) {
            copyCurrentEvent(jsonParser);
        } else {
            writeStartArray();
            _copyCurrentContents(jsonParser);
        }
    }

    public Object currentValue() {
        JsonStreamContext outputContext = getOutputContext();
        if (outputContext == null) {
            return null;
        }
        return outputContext.getCurrentValue();
    }

    public abstract JsonGenerator disable(Feature feature);

    public abstract JsonGenerator enable(Feature feature);

    @Override // java.io.Flushable
    public abstract void flush();

    public CharacterEscapes getCharacterEscapes() {
        return null;
    }

    public abstract ObjectCodec getCodec();

    @Deprecated
    public Object getCurrentValue() {
        return currentValue();
    }

    public abstract int getFeatureMask();

    public int getFormatFeatures() {
        return 0;
    }

    public int getHighestEscapedChar() {
        return 0;
    }

    public int getOutputBuffered() {
        return -1;
    }

    public abstract JsonStreamContext getOutputContext();

    public Object getOutputTarget() {
        return null;
    }

    public PrettyPrinter getPrettyPrinter() {
        return this._cfgPrettyPrinter;
    }

    public FormatSchema getSchema() {
        return null;
    }

    public JacksonFeatureSet<StreamWriteCapability> getWriteCapabilities() {
        return DEFAULT_WRITE_CAPABILITIES;
    }

    public abstract boolean isClosed();

    public abstract boolean isEnabled(Feature feature);

    public boolean isEnabled(StreamWriteFeature streamWriteFeature) {
        return isEnabled(streamWriteFeature.mappedFeature());
    }

    public JsonGenerator overrideFormatFeatures(int i2, int i3) {
        return this;
    }

    public JsonGenerator overrideStdFeatures(int i2, int i3) {
        return setFeatureMask((i2 & i3) | (getFeatureMask() & (~i3)));
    }

    public JsonGenerator setCharacterEscapes(CharacterEscapes characterEscapes) {
        return this;
    }

    public abstract JsonGenerator setCodec(ObjectCodec objectCodec);

    @Deprecated
    public void setCurrentValue(Object obj) {
        assignCurrentValue(obj);
    }

    @Deprecated
    public abstract JsonGenerator setFeatureMask(int i2);

    public JsonGenerator setHighestNonEscapedChar(int i2) {
        return this;
    }

    public JsonGenerator setPrettyPrinter(PrettyPrinter prettyPrinter) {
        this._cfgPrettyPrinter = prettyPrinter;
        return this;
    }

    public JsonGenerator setRootValueSeparator(SerializableString serializableString) {
        throw new UnsupportedOperationException();
    }

    public void setSchema(FormatSchema formatSchema) {
        throw new UnsupportedOperationException(String.format("Generator of type %s does not support schema of type '%s'", getClass().getName(), formatSchema.getSchemaType()));
    }

    public StreamWriteConstraints streamWriteConstraints() {
        return StreamWriteConstraints.defaults();
    }

    public abstract JsonGenerator useDefaultPrettyPrinter();

    @Override // com.fasterxml.jackson.core.Versioned
    public abstract Version version();

    public void writeArray(double[] dArr, int i2, int i3) {
        if (dArr == null) {
            throw new IllegalArgumentException("null array");
        }
        _verifyOffsets(dArr.length, i2, i3);
        writeStartArray(dArr, i3);
        int i4 = i3 + i2;
        while (i2 < i4) {
            writeNumber(dArr[i2]);
            i2++;
        }
        writeEndArray();
    }

    public void writeArrayFieldStart(String str) {
        writeFieldName(str);
        writeStartArray();
    }

    public abstract int writeBinary(Base64Variant base64Variant, InputStream inputStream, int i2);

    public abstract void writeBinary(Base64Variant base64Variant, byte[] bArr, int i2, int i3);

    public void writeBinary(byte[] bArr) {
        writeBinary(Base64Variants.getDefaultVariant(), bArr, 0, bArr.length);
    }

    public void writeBinaryField(String str, byte[] bArr) {
        writeFieldName(str);
        writeBinary(bArr);
    }

    public abstract void writeBoolean(boolean z);

    public void writeBooleanField(String str, boolean z) {
        writeFieldName(str);
        writeBoolean(z);
    }

    public void writeEmbeddedObject(Object obj) throws JsonGenerationException {
        if (obj == null) {
            writeNull();
        } else {
            if (!(obj instanceof byte[])) {
                throw new JsonGenerationException("No native support for writing embedded objects of type ".concat(String.valueOf(obj.getClass().getName())), this);
            }
            writeBinary((byte[]) obj);
        }
    }

    public abstract void writeEndArray();

    public abstract void writeEndObject();

    public void writeFieldId(long j2) {
        writeFieldName(Long.toString(j2));
    }

    public abstract void writeFieldName(SerializableString serializableString);

    public abstract void writeFieldName(String str);

    public abstract void writeNull();

    public void writeNullField(String str) {
        writeFieldName(str);
        writeNull();
    }

    public abstract void writeNumber(double d2);

    public abstract void writeNumber(float f2);

    public abstract void writeNumber(int i2);

    public abstract void writeNumber(long j2);

    public abstract void writeNumber(String str);

    public abstract void writeNumber(BigDecimal bigDecimal);

    public abstract void writeNumber(BigInteger bigInteger);

    public void writeNumber(char[] cArr, int i2, int i3) {
        writeNumber(new String(cArr, i2, i3));
    }

    public void writeNumberField(String str, double d2) {
        writeFieldName(str);
        writeNumber(d2);
    }

    public abstract void writeObject(Object obj);

    public void writeObjectField(String str, Object obj) {
        writeFieldName(str);
        writeObject(obj);
    }

    public void writeObjectFieldStart(String str) {
        writeFieldName(str);
        writeStartObject();
    }

    public void writeObjectId(Object obj) throws JsonGenerationException {
        throw new JsonGenerationException("No native support for writing Object Ids", this);
    }

    public void writeObjectRef(Object obj) throws JsonGenerationException {
        throw new JsonGenerationException("No native support for writing Object Ids", this);
    }

    public void writeOmittedField(String str) {
    }

    public void writePOJO(Object obj) {
        writeObject(obj);
    }

    public void writePOJOField(String str, Object obj) {
        writeObjectField(str, obj);
    }

    public abstract void writeRaw(char c2);

    public void writeRaw(SerializableString serializableString) {
        writeRaw(serializableString.getValue());
    }

    public abstract void writeRaw(String str);

    public abstract void writeRaw(String str, int i2, int i3);

    public abstract void writeRaw(char[] cArr, int i2, int i3);

    public abstract void writeRawUTF8String(byte[] bArr, int i2, int i3);

    public void writeRawValue(SerializableString serializableString) {
        writeRawValue(serializableString.getValue());
    }

    public abstract void writeRawValue(String str);

    public abstract void writeRawValue(String str, int i2, int i3);

    public abstract void writeRawValue(char[] cArr, int i2, int i3);

    public abstract void writeStartArray();

    public void writeStartArray(Object obj) {
        writeStartArray();
        setCurrentValue(obj);
    }

    public abstract void writeStartObject();

    public void writeStartObject(Object obj) {
        writeStartObject();
        setCurrentValue(obj);
    }

    public abstract void writeString(SerializableString serializableString);

    public void writeString(Reader reader, int i2) {
        _reportUnsupportedOperation();
    }

    public abstract void writeString(String str);

    public abstract void writeString(char[] cArr, int i2, int i3);

    public void writeStringField(String str, String str2) {
        writeFieldName(str);
        writeString(str2);
    }

    public abstract void writeTree(TreeNode treeNode);

    public void writeTypeId(Object obj) throws JsonGenerationException {
        throw new JsonGenerationException("No native support for writing Type Ids", this);
    }

    public WritableTypeId writeTypePrefix(WritableTypeId writableTypeId) {
        boolean z_writeTypePrefixUsingNative = canWriteTypeId() ? _writeTypePrefixUsingNative(writableTypeId) : _writeTypePrefixUsingWrapper(writableTypeId);
        WritableTypeId.Inclusion inclusion = WritableTypeId.Inclusion.WRAPPER_ARRAY;
        JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
        int iOrdinal = writableTypeId.valueShape.ordinal();
        if (iOrdinal != 1) {
            if (iOrdinal == 3) {
                writeStartArray(writableTypeId.forValue);
                return writableTypeId;
            }
        } else if (!z_writeTypePrefixUsingNative) {
            writeStartObject(writableTypeId.forValue);
        }
        return writableTypeId;
    }

    public WritableTypeId writeTypeSuffix(WritableTypeId writableTypeId) {
        JsonToken jsonToken = writableTypeId.valueShape;
        if (jsonToken == JsonToken.START_OBJECT) {
            writeEndObject();
        } else if (jsonToken == JsonToken.START_ARRAY) {
            writeEndArray();
        }
        if (writableTypeId.wrapperWritten) {
            WritableTypeId.Inclusion inclusion = WritableTypeId.Inclusion.WRAPPER_ARRAY;
            int iOrdinal = writableTypeId.include.ordinal();
            if (iOrdinal == 0) {
                writeEndArray();
            } else if (iOrdinal != 2 && iOrdinal != 3) {
                if (iOrdinal != 4) {
                    writeEndObject();
                    return writableTypeId;
                }
                Object obj = writableTypeId.id;
                writeStringField(writableTypeId.asProperty, obj instanceof String ? (String) obj : String.valueOf(obj));
                return writableTypeId;
            }
        }
        return writableTypeId;
    }

    public abstract void writeUTF8String(byte[] bArr, int i2, int i3);

    public void writeNumberField(String str, float f2) {
        writeFieldName(str);
        writeNumber(f2);
    }

    @Deprecated
    public void writeStartArray(int i2) {
        writeStartArray();
    }

    public void writeStartObject(Object obj, int i2) {
        writeStartObject(obj);
    }

    public void writeStartArray(Object obj, int i2) {
        writeStartArray(i2);
        setCurrentValue(obj);
    }

    public void writeNumber(short s) {
        writeNumber((int) s);
    }

    public void writeNumberField(String str, int i2) {
        writeFieldName(str);
        writeNumber(i2);
    }

    public int writeBinary(InputStream inputStream, int i2) {
        return writeBinary(Base64Variants.getDefaultVariant(), inputStream, i2);
    }

    public void writeBinary(byte[] bArr, int i2, int i3) {
        writeBinary(Base64Variants.getDefaultVariant(), bArr, i2, i3);
    }

    public void writeNumberField(String str, long j2) {
        writeFieldName(str);
        writeNumber(j2);
    }

    public void writeNumberField(String str, BigDecimal bigDecimal) {
        writeFieldName(str);
        writeNumber(bigDecimal);
    }

    public void writeNumberField(String str, BigInteger bigInteger) {
        writeFieldName(str);
        writeNumber(bigInteger);
    }

    public void writeNumberField(String str, short s) {
        writeFieldName(str);
        writeNumber(s);
    }

    protected StreamWriteException _constructWriteException(String str, Object obj) {
        return _constructWriteException(String.format(str, obj));
    }

    protected StreamWriteException _constructWriteException(String str) {
        return new JsonGenerationException(str, this);
    }

    protected StreamWriteException _constructWriteException(String str, Throwable th) {
        return new JsonGenerationException(str, th, this);
    }

    protected void _reportUnsupportedOperation(String str) {
        throw new UnsupportedOperationException(str);
    }

    public void writeArray(int[] iArr, int i2, int i3) {
        if (iArr != null) {
            _verifyOffsets(iArr.length, i2, i3);
            writeStartArray(iArr, i3);
            int i4 = i3 + i2;
            while (i2 < i4) {
                writeNumber(iArr[i2]);
                i2++;
            }
            writeEndArray();
            return;
        }
        throw new IllegalArgumentException("null array");
    }

    public void writeArray(long[] jArr, int i2, int i3) {
        if (jArr != null) {
            _verifyOffsets(jArr.length, i2, i3);
            writeStartArray(jArr, i3);
            int i4 = i3 + i2;
            while (i2 < i4) {
                writeNumber(jArr[i2]);
                i2++;
            }
            writeEndArray();
            return;
        }
        throw new IllegalArgumentException("null array");
    }

    public void writeArray(String[] strArr, int i2, int i3) {
        if (strArr != null) {
            _verifyOffsets(strArr.length, i2, i3);
            writeStartArray(strArr, i3);
            int i4 = i3 + i2;
            while (i2 < i4) {
                writeString(strArr[i2]);
                i2++;
            }
            writeEndArray();
            return;
        }
        throw new IllegalArgumentException("null array");
    }
}
