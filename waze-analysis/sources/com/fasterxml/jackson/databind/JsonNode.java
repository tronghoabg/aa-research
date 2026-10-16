package com.fasterxml.jackson.databind;

import androidx.camera.video.AudioStats;
import com.fasterxml.jackson.core.JsonPointer;
import com.fasterxml.jackson.core.TreeNode;
import com.fasterxml.jackson.databind.JsonSerializable;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.JsonNodeType;
import com.fasterxml.jackson.databind.node.MissingNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.util.ClassUtil;
import j$.util.Optional;
import j$.util.stream.Stream;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public abstract class JsonNode extends JsonSerializable.Base implements TreeNode, Iterable<JsonNode> {

    /* compiled from: WazeSource */
    /* renamed from: com.fasterxml.jackson.databind.JsonNode$1, reason: invalid class name */
    /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$fasterxml$jackson$databind$node$JsonNodeType;

        static {
            int[] iArr = new int[JsonNodeType.values().length];
            $SwitchMap$com$fasterxml$jackson$databind$node$JsonNodeType = iArr;
            try {
                iArr[JsonNodeType.ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$databind$node$JsonNodeType[JsonNodeType.OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$databind$node$JsonNodeType[JsonNodeType.MISSING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: WazeSource */
    public enum OverwriteMode {
        NONE,
        NULLS,
        SCALARS,
        ALL
    }

    protected JsonNode() {
    }

    protected abstract JsonNode _at(JsonPointer jsonPointer);

    protected <T> T _reportRequiredViolation(String str, Object... objArr) {
        throw new IllegalArgumentException(String.format(str, objArr));
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected <T extends JsonNode> T _this() {
        return this;
    }

    public boolean asBoolean() {
        return asBoolean(false);
    }

    public double asDouble() {
        return asDouble(AudioStats.AUDIO_AMPLITUDE_NONE);
    }

    public int asInt() {
        return asInt(0);
    }

    public long asLong() {
        return asLong(0L);
    }

    public Optional<JsonNode> asOptional() {
        return Optional.of(this);
    }

    public abstract String asText();

    public String asText(String str) {
        String strAsText = asText();
        return strAsText == null ? str : strAsText;
    }

    public final JsonNode at(JsonPointer jsonPointer) {
        if (jsonPointer.matches()) {
            return this;
        }
        JsonNode jsonNode_at = _at(jsonPointer);
        return jsonNode_at == null ? MissingNode.getInstance() : jsonNode_at.at(jsonPointer.tail());
    }

    public BigInteger bigIntegerValue() {
        return BigInteger.ZERO;
    }

    public byte[] binaryValue() {
        return null;
    }

    public boolean booleanValue() {
        return false;
    }

    public boolean canConvertToExactIntegral() {
        return isIntegralNumber();
    }

    public boolean canConvertToInt() {
        return false;
    }

    public boolean canConvertToLong() {
        return false;
    }

    public BigDecimal decimalValue() {
        return BigDecimal.ZERO;
    }

    public abstract <T extends JsonNode> T deepCopy();

    public double doubleValue() {
        return AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    public Iterator<JsonNode> elements() {
        return ClassUtil.emptyIterator();
    }

    public abstract boolean equals(Object obj);

    public boolean equals(Comparator<JsonNode> comparator, JsonNode jsonNode) {
        return comparator.compare(this, jsonNode) == 0;
    }

    public Iterator<String> fieldNames() {
        return ClassUtil.emptyIterator();
    }

    @Deprecated
    public Iterator<Map.Entry<String, JsonNode>> fields() {
        return ClassUtil.emptyIterator();
    }

    public abstract JsonNode findParent(String str);

    public final List<JsonNode> findParents(String str) {
        List<JsonNode> listFindParents = findParents(str, null);
        return listFindParents == null ? Collections.EMPTY_LIST : listFindParents;
    }

    public abstract List<JsonNode> findParents(String str, List<JsonNode> list);

    public abstract JsonNode findPath(String str);

    public abstract JsonNode findValue(String str);

    public final List<JsonNode> findValues(String str) {
        List<JsonNode> listFindValues = findValues(str, null);
        return listFindValues == null ? Collections.EMPTY_LIST : listFindValues;
    }

    public abstract List<JsonNode> findValues(String str, List<JsonNode> list);

    public final List<String> findValuesAsText(String str) {
        List<String> listFindValuesAsText = findValuesAsText(str, null);
        return listFindValuesAsText == null ? Collections.EMPTY_LIST : listFindValuesAsText;
    }

    public abstract List<String> findValuesAsText(String str, List<String> list);

    public float floatValue() {
        return 0.0f;
    }

    public void forEachEntry(BiConsumer<? super String, ? super JsonNode> biConsumer) {
    }

    @Override // 
    public abstract JsonNode get(int i2);

    public abstract JsonNodeType getNodeType();

    public boolean has(int i2) {
        return get(i2) != null;
    }

    public boolean hasNonNull(int i2) {
        JsonNode jsonNode = get(i2);
        return (jsonNode == null || jsonNode.isNull()) ? false : true;
    }

    public int intValue() {
        return 0;
    }

    public boolean isArray() {
        return false;
    }

    public boolean isBigDecimal() {
        return false;
    }

    public boolean isBigInteger() {
        return false;
    }

    public final boolean isBinary() {
        return getNodeType() == JsonNodeType.BINARY;
    }

    public final boolean isBoolean() {
        return getNodeType() == JsonNodeType.BOOLEAN;
    }

    public final boolean isContainerNode() {
        JsonNodeType nodeType = getNodeType();
        return nodeType == JsonNodeType.OBJECT || nodeType == JsonNodeType.ARRAY;
    }

    public boolean isDouble() {
        return false;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public boolean isFloat() {
        return false;
    }

    public boolean isFloatingPointNumber() {
        return false;
    }

    public boolean isInt() {
        return false;
    }

    public boolean isIntegralNumber() {
        return false;
    }

    public boolean isLong() {
        return false;
    }

    public boolean isMissingNode() {
        return false;
    }

    public final boolean isNull() {
        return getNodeType() == JsonNodeType.NULL;
    }

    public final boolean isNumber() {
        return getNodeType() == JsonNodeType.NUMBER;
    }

    public boolean isObject() {
        return false;
    }

    public final boolean isPojo() {
        return getNodeType() == JsonNodeType.POJO;
    }

    public boolean isShort() {
        return false;
    }

    public final boolean isTextual() {
        return getNodeType() == JsonNodeType.STRING;
    }

    public final boolean isValueNode() {
        JsonNodeType jsonNodeType = JsonNodeType.ARRAY;
        int iOrdinal = getNodeType().ordinal();
        return (iOrdinal == 0 || iOrdinal == 3 || iOrdinal == 6) ? false : true;
    }

    @Override // java.lang.Iterable
    public final Iterator<JsonNode> iterator() {
        return elements();
    }

    public long longValue() {
        return 0L;
    }

    public Number numberValue() {
        return null;
    }

    public Optional<JsonNode> optional(int i2) {
        return Optional.empty();
    }

    @Override // 
    public abstract JsonNode path(int i2);

    @Override // 
    public abstract JsonNode path(String str);

    public Set<Map.Entry<String, JsonNode>> properties() {
        return Collections.EMPTY_SET;
    }

    public Stream<Map.Entry<String, JsonNode>> propertyStream() {
        return ClassUtil.emptyStream();
    }

    public <T extends JsonNode> T require() {
        return (T) _this();
    }

    public <T extends JsonNode> T requireNonNull() {
        return (T) _this();
    }

    public JsonNode required(int i2) {
        return (JsonNode) _reportRequiredViolation("Node of type `%s` has no indexed values", getClass().getName());
    }

    public final JsonNode requiredAt(JsonPointer jsonPointer) {
        JsonNode jsonNode_at = this;
        for (JsonPointer jsonPointerTail = jsonPointer; !jsonPointerTail.matches(); jsonPointerTail = jsonPointerTail.tail()) {
            jsonNode_at = jsonNode_at._at(jsonPointerTail);
            if (jsonNode_at == null) {
                _reportRequiredViolation("No node at '%s' (unmatched part: '%s')", jsonPointer, jsonPointerTail);
            }
        }
        return jsonNode_at;
    }

    public short shortValue() {
        return (short) 0;
    }

    public int size() {
        return 0;
    }

    public String textValue() {
        return null;
    }

    public String toPrettyString() {
        return toString();
    }

    public abstract String toString();

    public Stream<JsonNode> valueStream() {
        return ClassUtil.emptyStream();
    }

    public Iterator<JsonNode> values() {
        return elements();
    }

    @Deprecated
    public <T extends JsonNode> T with(String str) {
        throw new UnsupportedOperationException(a.a(this, "`JsonNode` not of type `ObjectNode` (but ", "), cannot call `with(String)` on it"));
    }

    public ArrayNode withArray(JsonPointer jsonPointer, OverwriteMode overwriteMode, boolean z) {
        throw new UnsupportedOperationException("`withArray(JsonPointer)` not implemented by ".concat(String.valueOf(getClass().getName())));
    }

    public ArrayNode withArrayProperty(String str) {
        throw new UnsupportedOperationException(a.a(this, "`JsonNode` not of type `ObjectNode` (but `", ")`, cannot call `withArrayProperty(String)` on it"));
    }

    public ObjectNode withObject(JsonPointer jsonPointer, OverwriteMode overwriteMode, boolean z) {
        throw new UnsupportedOperationException(a.a(this, "`withObject(JsonPointer)` not implemented by `", "`"));
    }

    public ObjectNode withObjectProperty(String str) {
        throw new UnsupportedOperationException(a.a(this, "`JsonNode` not of type `ObjectNode` (but `", ")`, cannot call `withObjectProperty(String)` on it"));
    }

    @Override // 
    public JsonNode get(String str) {
        return null;
    }

    public Optional<JsonNode> optional(String str) {
        return Optional.empty();
    }

    public boolean asBoolean(boolean z) {
        return z;
    }

    public int asInt(int i2) {
        return i2;
    }

    public double asDouble(double d2) {
        return d2;
    }

    public long asLong(long j2) {
        return j2;
    }

    public boolean has(String str) {
        return get(str) != null;
    }

    public final ObjectNode withObject(JsonPointer jsonPointer) {
        return withObject(jsonPointer, OverwriteMode.NULLS, true);
    }

    public ObjectNode withObject(String str) {
        throw new UnsupportedOperationException(a.a(this, "`withObject(String)` not implemented by `", "`"));
    }

    public boolean hasNonNull(String str) {
        JsonNode jsonNode = get(str);
        return (jsonNode == null || jsonNode.isNull()) ? false : true;
    }

    public final ObjectNode withObject(String str, OverwriteMode overwriteMode, boolean z) {
        return withObject(JsonPointer.compile(str), overwriteMode, z);
    }

    public JsonNode required(String str) {
        return (JsonNode) _reportRequiredViolation("Node of type `%s` has no fields", getClass().getName());
    }

    public final ArrayNode withArray(JsonPointer jsonPointer) {
        return withArray(jsonPointer, OverwriteMode.NULLS, true);
    }

    public <T extends JsonNode> T withArray(String str) {
        throw new UnsupportedOperationException(a.a(this, "`JsonNode` not of type `ObjectNode` (but `", ")`, cannot call `withArray()` on it"));
    }

    public ArrayNode withArray(String str, OverwriteMode overwriteMode, boolean z) {
        return withArray(JsonPointer.compile(str), overwriteMode, z);
    }

    public final JsonNode at(String str) {
        return at(JsonPointer.compile(str));
    }

    public JsonNode requiredAt(String str) {
        return requiredAt(JsonPointer.compile(str));
    }
}
