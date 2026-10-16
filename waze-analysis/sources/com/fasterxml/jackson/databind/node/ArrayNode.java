package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonPointer;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.util.RawValue;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.stream.Stream;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class ArrayNode extends ContainerNode<ArrayNode> implements Serializable {
    private static final long serialVersionUID = 1;
    private final List<JsonNode> _children;

    public ArrayNode(JsonNodeFactory jsonNodeFactory, List<JsonNode> list) {
        super(jsonNodeFactory);
        this._children = (List) Objects.requireNonNull(list, "Must not pass `null` for 'children' argument");
    }

    protected ArrayNode _add(JsonNode jsonNode) {
        this._children.add(jsonNode);
        return this;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    protected JsonNode _at(JsonPointer jsonPointer) {
        return get(jsonPointer.getMatchingIndex());
    }

    protected boolean _childrenEqual(ArrayNode arrayNode) {
        return this._children.equals(arrayNode._children);
    }

    protected ArrayNode _insert(int i2, JsonNode jsonNode) {
        List<JsonNode> list = this._children;
        if (i2 < 0) {
            list.add(0, jsonNode);
            return this;
        }
        int size = list.size();
        List<JsonNode> list2 = this._children;
        if (i2 >= size) {
            list2.add(jsonNode);
            return this;
        }
        list2.add(i2, jsonNode);
        return this;
    }

    protected ArrayNode _set(int i2, JsonNode jsonNode) {
        if (i2 >= 0 && i2 < this._children.size()) {
            this._children.set(i2, jsonNode);
            return this;
        }
        throw new IndexOutOfBoundsException("Illegal index " + i2 + ", array size " + size());
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode
    protected ArrayNode _withArray(JsonPointer jsonPointer, JsonPointer jsonPointer2, JsonNode.OverwriteMode overwriteMode, boolean z) {
        ArrayNode arrayNode;
        JsonPointer jsonPointer3;
        boolean z2;
        if (jsonPointer2.matches()) {
            return this;
        }
        JsonNode jsonNode_at = _at(jsonPointer2);
        if (jsonNode_at == null || !(jsonNode_at instanceof BaseJsonNode)) {
            arrayNode = this;
            jsonPointer3 = jsonPointer2;
            z2 = z;
        } else {
            ArrayNode arrayNode_withArray = ((BaseJsonNode) jsonNode_at)._withArray(jsonPointer, jsonPointer2.tail(), overwriteMode, z);
            if (arrayNode_withArray != null) {
                return arrayNode_withArray;
            }
            arrayNode = this;
            jsonPointer3 = jsonPointer2;
            z2 = z;
            arrayNode._withXxxVerifyReplace(jsonPointer, jsonPointer3, overwriteMode, z2, jsonNode_at);
        }
        return arrayNode._withArrayAddTailElement(jsonPointer3, z2);
    }

    protected ArrayNode _withArrayAddTailElement(JsonPointer jsonPointer, boolean z) {
        int matchingIndex = jsonPointer.getMatchingIndex();
        if (matchingIndex < 0) {
            return null;
        }
        JsonPointer jsonPointerTail = jsonPointer.tail();
        if (jsonPointerTail.matches()) {
            ArrayNode arrayNode = arrayNode();
            _withXxxSetArrayElement(matchingIndex, arrayNode);
            return arrayNode;
        }
        if (z && jsonPointerTail.mayMatchElement()) {
            ArrayNode arrayNode2 = arrayNode();
            _withXxxSetArrayElement(matchingIndex, arrayNode2);
            return arrayNode2._withArrayAddTailElement(jsonPointerTail, true);
        }
        ObjectNode objectNode = objectNode();
        _withXxxSetArrayElement(matchingIndex, objectNode);
        return objectNode._withArrayAddTailProperty(jsonPointerTail, z);
    }

    @Override // com.fasterxml.jackson.databind.node.ContainerNode, com.fasterxml.jackson.databind.node.BaseJsonNode
    protected ObjectNode _withObject(JsonPointer jsonPointer, JsonPointer jsonPointer2, JsonNode.OverwriteMode overwriteMode, boolean z) {
        ArrayNode arrayNode;
        JsonPointer jsonPointer3;
        boolean z2;
        if (jsonPointer2.matches()) {
            return null;
        }
        JsonNode jsonNode_at = _at(jsonPointer2);
        if (jsonNode_at == null || !(jsonNode_at instanceof BaseJsonNode)) {
            arrayNode = this;
            jsonPointer3 = jsonPointer2;
            z2 = z;
        } else {
            ObjectNode objectNode_withObject = ((BaseJsonNode) jsonNode_at)._withObject(jsonPointer, jsonPointer2.tail(), overwriteMode, z);
            if (objectNode_withObject != null) {
                return objectNode_withObject;
            }
            arrayNode = this;
            jsonPointer3 = jsonPointer2;
            z2 = z;
            arrayNode._withXxxVerifyReplace(jsonPointer, jsonPointer3, overwriteMode, z2, jsonNode_at);
        }
        return arrayNode._withObjectAddTailElement(jsonPointer3, z2);
    }

    protected ObjectNode _withObjectAddTailElement(JsonPointer jsonPointer, boolean z) {
        int matchingIndex = jsonPointer.getMatchingIndex();
        if (matchingIndex < 0) {
            return null;
        }
        JsonPointer jsonPointerTail = jsonPointer.tail();
        if (jsonPointerTail.matches()) {
            ObjectNode objectNode = objectNode();
            _withXxxSetArrayElement(matchingIndex, objectNode);
            return objectNode;
        }
        if (z && jsonPointerTail.mayMatchElement()) {
            ArrayNode arrayNode = arrayNode();
            _withXxxSetArrayElement(matchingIndex, arrayNode);
            return arrayNode._withObjectAddTailElement(jsonPointerTail, true);
        }
        ObjectNode objectNode2 = objectNode();
        _withXxxSetArrayElement(matchingIndex, objectNode2);
        return objectNode2._withObjectAddTailProperty(jsonPointerTail, z);
    }

    protected void _withXxxSetArrayElement(int i2, JsonNode jsonNode) {
        if (i2 >= size()) {
            int maxElementIndexForInsert = this._nodeFactory.getMaxElementIndexForInsert();
            if (i2 > maxElementIndexForInsert) {
                _reportWrongNodeOperation("Too big Array index (%d; max %d) to use for insert with `JsonPointer`", Integer.valueOf(i2), Integer.valueOf(maxElementIndexForInsert));
            }
            while (i2 >= size()) {
                addNull();
            }
        }
        set(i2, jsonNode);
    }

    public ArrayNode add(Boolean bool) {
        return _add(bool == null ? nullNode() : booleanNode(bool.booleanValue()));
    }

    public ArrayNode addAll(Collection<? extends JsonNode> collection) {
        Iterator<? extends JsonNode> it = collection.iterator();
        while (it.hasNext()) {
            add(it.next());
        }
        return this;
    }

    public ArrayNode addArray() {
        ArrayNode arrayNode = arrayNode();
        _add(arrayNode);
        return arrayNode;
    }

    public ArrayNode addNull() {
        return _add(nullNode());
    }

    public ObjectNode addObject() {
        ObjectNode objectNode = objectNode();
        _add(objectNode);
        return objectNode;
    }

    public ArrayNode addPOJO(Object obj) {
        return _add(obj == null ? nullNode() : pojoNode(obj));
    }

    public ArrayNode addRawValue(RawValue rawValue) {
        return _add(rawValue == null ? nullNode() : rawValueNode(rawValue));
    }

    @Override // com.fasterxml.jackson.databind.node.ContainerNode, com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.core.TreeNode
    public JsonToken asToken() {
        return JsonToken.START_ARRAY;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public ArrayNode deepCopy() {
        ArrayNode arrayNode = arrayNode(this._children.size());
        Iterator<JsonNode> it = this._children.iterator();
        while (it.hasNext()) {
            arrayNode._children.add(it.next().deepCopy());
        }
        return arrayNode;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public Iterator<JsonNode> elements() {
        return this._children.listIterator();
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public boolean equals(Comparator<JsonNode> comparator, JsonNode jsonNode) {
        if (!(jsonNode instanceof ArrayNode)) {
            return false;
        }
        ArrayNode arrayNode = (ArrayNode) jsonNode;
        int size = this._children.size();
        if (arrayNode.size() != size) {
            return false;
        }
        List<JsonNode> list = this._children;
        List<JsonNode> list2 = arrayNode._children;
        for (int i2 = 0; i2 < size; i2++) {
            if (!list.get(i2).equals(comparator, list2.get(i2))) {
                return false;
            }
        }
        return true;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public ObjectNode findParent(String str) {
        Iterator<JsonNode> it = this._children.iterator();
        while (it.hasNext()) {
            JsonNode jsonNodeFindParent = it.next().findParent(str);
            if (jsonNodeFindParent != null) {
                return (ObjectNode) jsonNodeFindParent;
            }
        }
        return null;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public List<JsonNode> findParents(String str, List<JsonNode> list) {
        Iterator<JsonNode> it = this._children.iterator();
        while (it.hasNext()) {
            list = it.next().findParents(str, list);
        }
        return list;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public JsonNode findValue(String str) {
        Iterator<JsonNode> it = this._children.iterator();
        while (it.hasNext()) {
            JsonNode jsonNodeFindValue = it.next().findValue(str);
            if (jsonNodeFindValue != null) {
                return jsonNodeFindValue;
            }
        }
        return null;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public List<JsonNode> findValues(String str, List<JsonNode> list) {
        Iterator<JsonNode> it = this._children.iterator();
        while (it.hasNext()) {
            list = it.next().findValues(str, list);
        }
        return list;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public List<String> findValuesAsText(String str, List<String> list) {
        Iterator<JsonNode> it = this._children.iterator();
        while (it.hasNext()) {
            list = it.next().findValuesAsText(str, list);
        }
        return list;
    }

    @Override // com.fasterxml.jackson.databind.node.ContainerNode, com.fasterxml.jackson.databind.JsonNode
    public JsonNode get(int i2) {
        if (i2 < 0 || i2 >= this._children.size()) {
            return null;
        }
        return this._children.get(i2);
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public JsonNodeType getNodeType() {
        return JsonNodeType.ARRAY;
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode
    public int hashCode() {
        return this._children.hashCode();
    }

    public ArrayNode insert(int i2, Boolean bool) {
        return bool == null ? insertNull(i2) : _insert(i2, booleanNode(bool.booleanValue()));
    }

    public ArrayNode insertArray(int i2) {
        ArrayNode arrayNode = arrayNode();
        _insert(i2, arrayNode);
        return arrayNode;
    }

    public ArrayNode insertNull(int i2) {
        return _insert(i2, nullNode());
    }

    public ObjectNode insertObject(int i2) {
        ObjectNode objectNode = objectNode();
        _insert(i2, objectNode);
        return objectNode;
    }

    public ArrayNode insertPOJO(int i2, Object obj) {
        return _insert(i2, obj == null ? nullNode() : pojoNode(obj));
    }

    public ArrayNode insertRawValue(int i2, RawValue rawValue) {
        return _insert(i2, rawValue == null ? nullNode() : rawValueNode(rawValue));
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public boolean isArray() {
        return true;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public boolean isEmpty() {
        return this._children.isEmpty();
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public Optional<JsonNode> optional(int i2) {
        return Optional.ofNullable(get(i2));
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public JsonNode path(int i2) {
        return (i2 < 0 || i2 >= this._children.size()) ? MissingNode.getInstance() : this._children.get(i2);
    }

    public JsonNode remove(int i2) {
        if (i2 < 0 || i2 >= this._children.size()) {
            return null;
        }
        return this._children.remove(i2);
    }

    @Override // com.fasterxml.jackson.databind.node.ContainerNode
    public ArrayNode removeAll() {
        this._children.clear();
        return this;
    }

    @Override // com.fasterxml.jackson.databind.node.ContainerNode
    public ArrayNode removeIf(Predicate<? super JsonNode> predicate) {
        Collection.EL.removeIf(this._children, predicate);
        return this;
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.databind.JsonNode
    public JsonNode required(int i2) {
        return (i2 < 0 || i2 >= this._children.size()) ? (JsonNode) _reportRequiredViolation("No value at index #%d [0, %d) of `ArrayNode`", Integer.valueOf(i2), Integer.valueOf(this._children.size())) : this._children.get(i2);
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.databind.JsonSerializable
    public void serialize(JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        List<JsonNode> list = this._children;
        int size = list.size();
        jsonGenerator.writeStartArray(this, size);
        for (int i2 = 0; i2 < size; i2++) {
            list.get(i2).serialize(jsonGenerator, serializerProvider);
        }
        jsonGenerator.writeEndArray();
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.databind.JsonSerializable
    public void serializeWithType(JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) {
        WritableTypeId writableTypeIdWriteTypePrefix = typeSerializer.writeTypePrefix(jsonGenerator, typeSerializer.typeId(this, JsonToken.START_ARRAY));
        Iterator<JsonNode> it = this._children.iterator();
        while (it.hasNext()) {
            ((BaseJsonNode) it.next()).serialize(jsonGenerator, serializerProvider);
        }
        typeSerializer.writeTypeSuffix(jsonGenerator, writableTypeIdWriteTypePrefix);
    }

    public JsonNode set(int i2, JsonNode jsonNode) {
        if (jsonNode == null) {
            jsonNode = nullNode();
        }
        if (i2 >= 0 && i2 < this._children.size()) {
            return this._children.set(i2, jsonNode);
        }
        throw new IndexOutOfBoundsException("Illegal index " + i2 + ", array size " + size());
    }

    public ArrayNode setNull(int i2) {
        return _set(i2, nullNode());
    }

    public ArrayNode setPOJO(int i2, Object obj) {
        return _set(i2, obj == null ? nullNode() : pojoNode(obj));
    }

    public ArrayNode setRawValue(int i2, RawValue rawValue) {
        return _set(i2, rawValue == null ? nullNode() : rawValueNode(rawValue));
    }

    @Override // com.fasterxml.jackson.databind.node.ContainerNode, com.fasterxml.jackson.databind.JsonNode
    public int size() {
        return this._children.size();
    }

    @Override // com.fasterxml.jackson.databind.node.ContainerNode, com.fasterxml.jackson.databind.JsonNode
    public Stream<JsonNode> valueStream() {
        return Collection.EL.stream(this._children);
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public Iterator<JsonNode> values() {
        return this._children.listIterator();
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    @Deprecated
    public ObjectNode with(String str) {
        JsonPointer jsonPointer_jsonPointerIfValid = _jsonPointerIfValid(str);
        return jsonPointer_jsonPointerIfValid != null ? withObject(jsonPointer_jsonPointerIfValid) : (ObjectNode) super.with(str);
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public ArrayNode withArray(String str) {
        JsonPointer jsonPointer_jsonPointerIfValid = _jsonPointerIfValid(str);
        return jsonPointer_jsonPointerIfValid != null ? withArray(jsonPointer_jsonPointerIfValid) : (ArrayNode) super.withArray(str);
    }

    @Override // com.fasterxml.jackson.databind.node.ContainerNode
    public /* bridge */ /* synthetic */ ContainerNode removeIf(Predicate predicate) {
        return removeIf((Predicate<? super JsonNode>) predicate);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializable.Base
    public boolean isEmpty(SerializerProvider serializerProvider) {
        return this._children.isEmpty();
    }

    public ArrayNode(JsonNodeFactory jsonNodeFactory, int i2) {
        super(jsonNodeFactory);
        this._children = new ArrayList(i2);
    }

    public ArrayNode(JsonNodeFactory jsonNodeFactory) {
        super(jsonNodeFactory);
        this._children = new ArrayList();
    }

    public ArrayNode add(float f2) {
        return _add(numberNode(f2));
    }

    public ArrayNode insert(int i2, float f2) {
        return _insert(i2, numberNode(f2));
    }

    public ArrayNode add(int i2) {
        return _add(numberNode(i2));
    }

    public ArrayNode addAll(ArrayNode arrayNode) {
        this._children.addAll(arrayNode._children);
        return this;
    }

    public ArrayNode insert(int i2, int i3) {
        return _insert(i2, numberNode(i3));
    }

    public ArrayNode add(long j2) {
        return _add(numberNode(j2));
    }

    @Override // com.fasterxml.jackson.databind.node.ContainerNode, com.fasterxml.jackson.databind.JsonNode
    public JsonNode get(String str) {
        return null;
    }

    public ArrayNode insert(int i2, long j2) {
        return _insert(i2, numberNode(j2));
    }

    public ArrayNode add(JsonNode jsonNode) {
        if (jsonNode == null) {
            jsonNode = nullNode();
        }
        _add(jsonNode);
        return this;
    }

    public ArrayNode insert(int i2, JsonNode jsonNode) {
        if (jsonNode == null) {
            jsonNode = nullNode();
        }
        _insert(i2, jsonNode);
        return this;
    }

    public ArrayNode add(double d2) {
        return _add(numberNode(d2));
    }

    public ArrayNode insert(int i2, double d2) {
        return _insert(i2, numberNode(d2));
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public JsonNode path(String str) {
        return MissingNode.getInstance();
    }

    public ArrayNode add(Double d2) {
        return _add(d2 == null ? nullNode() : numberNode(d2.doubleValue()));
    }

    public ArrayNode insert(int i2, Double d2) {
        return _insert(i2, d2 == null ? nullNode() : numberNode(d2.doubleValue()));
    }

    public ArrayNode add(Float f2) {
        return _add(f2 == null ? nullNode() : numberNode(f2.floatValue()));
    }

    public ArrayNode insert(int i2, Float f2) {
        return _insert(i2, f2 == null ? nullNode() : numberNode(f2.floatValue()));
    }

    public ArrayNode add(Integer num) {
        return _add(num == null ? nullNode() : numberNode(num.intValue()));
    }

    public ArrayNode insert(int i2, Integer num) {
        return _insert(i2, num == null ? nullNode() : numberNode(num.intValue()));
    }

    public ArrayNode add(Long l2) {
        return _add(l2 == null ? nullNode() : numberNode(l2.longValue()));
    }

    public ArrayNode insert(int i2, Long l2) {
        return _insert(i2, l2 == null ? nullNode() : numberNode(l2.longValue()));
    }

    public ArrayNode add(Short sh) {
        return _add(sh == null ? nullNode() : numberNode(sh.shortValue()));
    }

    public ArrayNode insert(int i2, Short sh) {
        return _insert(i2, sh == null ? nullNode() : numberNode(sh.shortValue()));
    }

    public ArrayNode add(String str) {
        return _add(str == null ? nullNode() : textNode(str));
    }

    public ArrayNode insert(int i2, String str) {
        return _insert(i2, str == null ? nullNode() : textNode(str));
    }

    public ArrayNode add(BigDecimal bigDecimal) {
        return _add(bigDecimal == null ? nullNode() : numberNode(bigDecimal));
    }

    public ArrayNode insert(int i2, BigDecimal bigDecimal) {
        return _insert(i2, bigDecimal == null ? nullNode() : numberNode(bigDecimal));
    }

    public ArrayNode add(BigInteger bigInteger) {
        return _add(bigInteger == null ? nullNode() : numberNode(bigInteger));
    }

    public ArrayNode insert(int i2, BigInteger bigInteger) {
        return _insert(i2, bigInteger == null ? nullNode() : numberNode(bigInteger));
    }

    public ArrayNode add(short s) {
        return _add(numberNode(s));
    }

    public ArrayNode insert(int i2, short s) {
        return _insert(i2, numberNode(s));
    }

    public ArrayNode add(boolean z) {
        return _add(booleanNode(z));
    }

    public ArrayNode insert(int i2, boolean z) {
        return _insert(i2, booleanNode(z));
    }

    public ArrayNode add(byte[] bArr) {
        return _add(bArr == null ? nullNode() : binaryNode(bArr));
    }

    public ArrayNode insert(int i2, byte[] bArr) {
        if (bArr == null) {
            return insertNull(i2);
        }
        return _insert(i2, binaryNode(bArr));
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof ArrayNode)) {
            return this._children.equals(((ArrayNode) obj)._children);
        }
        return false;
    }

    public ArrayNode set(int i2, float f2) {
        return _set(i2, numberNode(f2));
    }

    public ArrayNode set(int i2, int i3) {
        return _set(i2, numberNode(i3));
    }

    public ArrayNode set(int i2, long j2) {
        return _set(i2, numberNode(j2));
    }

    public ArrayNode set(int i2, double d2) {
        return _set(i2, numberNode(d2));
    }

    public ArrayNode set(int i2, Boolean bool) {
        return _set(i2, bool == null ? nullNode() : booleanNode(bool.booleanValue()));
    }

    public ArrayNode set(int i2, Double d2) {
        return _set(i2, d2 == null ? nullNode() : numberNode(d2.doubleValue()));
    }

    public ArrayNode set(int i2, Float f2) {
        return _set(i2, f2 == null ? nullNode() : numberNode(f2.floatValue()));
    }

    public ArrayNode set(int i2, Integer num) {
        return _set(i2, num == null ? nullNode() : numberNode(num.intValue()));
    }

    public ArrayNode set(int i2, Long l2) {
        return _set(i2, l2 == null ? nullNode() : numberNode(l2.longValue()));
    }

    public ArrayNode set(int i2, Short sh) {
        return _set(i2, sh == null ? nullNode() : numberNode(sh.shortValue()));
    }

    public ArrayNode set(int i2, String str) {
        return _set(i2, str == null ? nullNode() : textNode(str));
    }

    public ArrayNode set(int i2, BigDecimal bigDecimal) {
        return _set(i2, bigDecimal == null ? nullNode() : numberNode(bigDecimal));
    }

    public ArrayNode set(int i2, BigInteger bigInteger) {
        return _set(i2, bigInteger == null ? nullNode() : numberNode(bigInteger));
    }

    public ArrayNode set(int i2, short s) {
        return _set(i2, numberNode(s));
    }

    public ArrayNode set(int i2, boolean z) {
        return _set(i2, booleanNode(z));
    }

    public ArrayNode set(int i2, byte[] bArr) {
        return _set(i2, bArr == null ? nullNode() : binaryNode(bArr));
    }
}
