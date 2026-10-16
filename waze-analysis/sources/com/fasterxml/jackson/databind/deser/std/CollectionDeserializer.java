package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.cfg.CoercionAction;
import com.fasterxml.jackson.databind.cfg.CoercionInputShape;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.deser.NullValueProvider;
import com.fasterxml.jackson.databind.deser.UnresolvedForwardReference;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.deser.impl.ReadableObjectId;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.databind.util.ClassUtil;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
@JacksonStdImpl
/* loaded from: classes4.dex */
public class CollectionDeserializer extends ContainerDeserializerBase<Collection<Object>> implements ContextualDeserializer {
    private static final long serialVersionUID = -1;
    protected final JsonDeserializer<Object> _delegateDeserializer;
    protected final JsonDeserializer<Object> _valueDeserializer;
    protected final ValueInstantiator _valueInstantiator;
    protected final TypeDeserializer _valueTypeDeserializer;

    /* compiled from: WazeSource */
    final class CollectionReferring extends ReadableObjectId.Referring {
        private final CollectionReferringAccumulator _parent;
        public final List<Object> next;

        CollectionReferring(CollectionReferringAccumulator collectionReferringAccumulator, UnresolvedForwardReference unresolvedForwardReference, Class<?> cls) {
            super(unresolvedForwardReference, cls);
            this.next = new ArrayList();
            this._parent = collectionReferringAccumulator;
        }

        @Override // com.fasterxml.jackson.databind.deser.impl.ReadableObjectId.Referring
        public void handleResolvedForwardReference(Object obj, Object obj2) {
            this._parent.resolveForwardReference(obj, obj2);
        }
    }

    /* compiled from: WazeSource */
    public class CollectionReferringAccumulator {
        private List<CollectionReferring> _accumulator = new ArrayList();
        private final Class<?> _elementType;
        private final Collection<Object> _result;

        public CollectionReferringAccumulator(Class<?> cls, Collection<Object> collection) {
            this._elementType = cls;
            this._result = collection;
        }

        public void add(Object obj) {
            if (this._accumulator.isEmpty()) {
                this._result.add(obj);
            } else {
                this._accumulator.get(r1.size() - 1).next.add(obj);
            }
        }

        public ReadableObjectId.Referring handleUnresolvedReference(UnresolvedForwardReference unresolvedForwardReference) {
            CollectionReferring collectionReferring = new CollectionReferring(this, unresolvedForwardReference, this._elementType);
            this._accumulator.add(collectionReferring);
            return collectionReferring;
        }

        public void resolveForwardReference(Object obj, Object obj2) {
            Iterator<CollectionReferring> it = this._accumulator.iterator();
            Collection collection = this._result;
            while (it.hasNext()) {
                CollectionReferring next = it.next();
                if (next.hasId(obj)) {
                    it.remove();
                    collection.add(obj2);
                    collection.addAll(next.next);
                    return;
                }
                collection = next.next;
            }
            throw new IllegalArgumentException("Trying to resolve a forward reference with id [" + String.valueOf(obj) + "] that wasn't previously seen as unresolved.");
        }
    }

    protected CollectionDeserializer(CollectionDeserializer collectionDeserializer) {
        super(collectionDeserializer);
        this._valueDeserializer = collectionDeserializer._valueDeserializer;
        this._valueTypeDeserializer = collectionDeserializer._valueTypeDeserializer;
        this._valueInstantiator = collectionDeserializer._valueInstantiator;
        this._delegateDeserializer = collectionDeserializer._delegateDeserializer;
    }

    protected Collection<Object> _deserializeFromArray(JsonParser jsonParser, DeserializationContext deserializationContext, Collection<Object> collection) throws JsonMappingException {
        Object obj_deserializeNoNullChecks;
        jsonParser.assignCurrentValue(collection);
        if (this._valueDeserializer.getObjectIdReader() != null) {
            return _deserializeWithObjectId(jsonParser, deserializationContext, collection);
        }
        while (true) {
            JsonToken jsonTokenNextToken = jsonParser.nextToken();
            if (jsonTokenNextToken == JsonToken.END_ARRAY) {
                return collection;
            }
            try {
                if (jsonTokenNextToken != JsonToken.VALUE_NULL) {
                    obj_deserializeNoNullChecks = _deserializeNoNullChecks(jsonParser, deserializationContext);
                } else if (!this._skipNullValues) {
                    obj_deserializeNoNullChecks = null;
                }
                if (obj_deserializeNoNullChecks == null && (obj_deserializeNoNullChecks = this._nullProvider.getNullValue(deserializationContext)) == null) {
                    _tryToAddNull(jsonParser, deserializationContext, collection);
                } else {
                    collection.add(obj_deserializeNoNullChecks);
                }
            } catch (Exception e2) {
                if (deserializationContext != null && !deserializationContext.isEnabled(DeserializationFeature.WRAP_EXCEPTIONS)) {
                    ClassUtil.throwIfRTE(e2);
                }
                throw JsonMappingException.wrapWithPath(e2, collection, collection.size());
            }
        }
    }

    protected Collection<Object> _deserializeFromString(JsonParser jsonParser, DeserializationContext deserializationContext, String str) {
        CollectionDeserializer collectionDeserializer;
        JsonParser jsonParser2;
        DeserializationContext deserializationContext2;
        CoercionAction coercionActionFindCoercionFromBlankString;
        Class<?> clsHandledType = handledType();
        if (str.isEmpty()) {
            CoercionAction coercionActionFindCoercionAction = deserializationContext.findCoercionAction(logicalType(), clsHandledType, CoercionInputShape.EmptyString);
            if (coercionActionFindCoercionAction != null && coercionActionFindCoercionAction != CoercionAction.Fail) {
                return (Collection) _deserializeFromEmptyString(jsonParser, deserializationContext, coercionActionFindCoercionAction, clsHandledType, "empty String (\"\")");
            }
            collectionDeserializer = this;
            jsonParser2 = jsonParser;
            deserializationContext2 = deserializationContext;
        } else {
            collectionDeserializer = this;
            jsonParser2 = jsonParser;
            deserializationContext2 = deserializationContext;
            if (_isBlank(str) && (coercionActionFindCoercionFromBlankString = deserializationContext2.findCoercionFromBlankString(collectionDeserializer.logicalType(), clsHandledType, CoercionAction.Fail)) != CoercionAction.Fail) {
                return (Collection) collectionDeserializer._deserializeFromEmptyString(jsonParser2, deserializationContext2, coercionActionFindCoercionFromBlankString, clsHandledType, "blank String (all whitespace)");
            }
        }
        return collectionDeserializer.handleNonArray(jsonParser2, deserializationContext2, collectionDeserializer.createDefaultInstance(deserializationContext2));
    }

    protected Object _deserializeNoNullChecks(JsonParser jsonParser, DeserializationContext deserializationContext) {
        TypeDeserializer typeDeserializer = this._valueTypeDeserializer;
        JsonDeserializer<Object> jsonDeserializer = this._valueDeserializer;
        return typeDeserializer == null ? jsonDeserializer.deserialize(jsonParser, deserializationContext) : jsonDeserializer.deserializeWithType(jsonParser, deserializationContext, typeDeserializer);
    }

    protected Collection<Object> _deserializeWithObjectId(JsonParser jsonParser, DeserializationContext deserializationContext, Collection<Object> collection) throws JsonMappingException {
        Object obj_deserializeNoNullChecks;
        if (!jsonParser.isExpectedStartArrayToken()) {
            return handleNonArray(jsonParser, deserializationContext, collection);
        }
        jsonParser.assignCurrentValue(collection);
        CollectionReferringAccumulator collectionReferringAccumulator = new CollectionReferringAccumulator(this._containerType.getContentType().getRawClass(), collection);
        while (true) {
            JsonToken jsonTokenNextToken = jsonParser.nextToken();
            if (jsonTokenNextToken == JsonToken.END_ARRAY) {
                return collection;
            }
            try {
            } catch (UnresolvedForwardReference e2) {
                e2.getRoid().appendReferring(collectionReferringAccumulator.handleUnresolvedReference(e2));
            } catch (Exception e3) {
                if (deserializationContext != null && !deserializationContext.isEnabled(DeserializationFeature.WRAP_EXCEPTIONS)) {
                    ClassUtil.throwIfRTE(e3);
                }
                throw JsonMappingException.wrapWithPath(e3, collection, collection.size());
            }
            if (jsonTokenNextToken != JsonToken.VALUE_NULL) {
                obj_deserializeNoNullChecks = _deserializeNoNullChecks(jsonParser, deserializationContext);
            } else if (!this._skipNullValues) {
                obj_deserializeNoNullChecks = null;
            }
            if (obj_deserializeNoNullChecks != null || (obj_deserializeNoNullChecks = this._nullProvider.getNullValue(deserializationContext)) != null || !this._skipNullValues) {
                collectionReferringAccumulator.add(obj_deserializeNoNullChecks);
            }
        }
    }

    protected void _tryToAddNull(JsonParser jsonParser, DeserializationContext deserializationContext, Collection<?> collection) throws MismatchedInputException, InvalidDefinitionException {
        if (this._skipNullValues) {
            return;
        }
        try {
            collection.add(null);
        } catch (NullPointerException unused) {
            deserializationContext.handleUnexpectedToken(this._valueType, JsonToken.VALUE_NULL, jsonParser, "`java.util.Collection` of type %s does not accept `null` values", ClassUtil.getTypeDescription(getValueType(deserializationContext)));
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.ContextualDeserializer
    public CollectionDeserializer createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) throws InvalidDefinitionException {
        ValueInstantiator valueInstantiator = this._valueInstantiator;
        JsonDeserializer<Object> jsonDeserializerFindDeserializer = null;
        if (valueInstantiator != null) {
            boolean zCanCreateUsingDelegate = valueInstantiator.canCreateUsingDelegate();
            ValueInstantiator valueInstantiator2 = this._valueInstantiator;
            if (zCanCreateUsingDelegate) {
                JavaType delegateType = valueInstantiator2.getDelegateType(deserializationContext.getConfig());
                if (delegateType == null) {
                    JavaType javaType = this._containerType;
                    deserializationContext.reportBadDefinition(javaType, String.format("Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingDelegate()', but null for 'getDelegateType()'", javaType, this._valueInstantiator.getClass().getName()));
                }
                jsonDeserializerFindDeserializer = findDeserializer(deserializationContext, delegateType, beanProperty);
            } else if (valueInstantiator2.canCreateUsingArrayDelegate()) {
                JavaType arrayDelegateType = this._valueInstantiator.getArrayDelegateType(deserializationContext.getConfig());
                if (arrayDelegateType == null) {
                    JavaType javaType2 = this._containerType;
                    deserializationContext.reportBadDefinition(javaType2, String.format("Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingArrayDelegate()', but null for 'getArrayDelegateType()'", javaType2, this._valueInstantiator.getClass().getName()));
                }
                jsonDeserializerFindDeserializer = findDeserializer(deserializationContext, arrayDelegateType, beanProperty);
            }
        }
        JsonDeserializer<Object> jsonDeserializer = jsonDeserializerFindDeserializer;
        Boolean boolFindFormatFeature = findFormatFeature(deserializationContext, beanProperty, Collection.class, JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        JsonDeserializer<?> jsonDeserializerFindConvertingContentDeserializer = findConvertingContentDeserializer(deserializationContext, beanProperty, this._valueDeserializer);
        JavaType contentType = this._containerType.getContentType();
        JsonDeserializer<?> jsonDeserializerFindContextualValueDeserializer = jsonDeserializerFindConvertingContentDeserializer == null ? deserializationContext.findContextualValueDeserializer(contentType, beanProperty) : deserializationContext.handleSecondaryContextualization(jsonDeserializerFindConvertingContentDeserializer, beanProperty, contentType);
        TypeDeserializer typeDeserializerForProperty = this._valueTypeDeserializer;
        if (typeDeserializerForProperty != null) {
            typeDeserializerForProperty = typeDeserializerForProperty.forProperty(beanProperty);
        }
        TypeDeserializer typeDeserializer = typeDeserializerForProperty;
        NullValueProvider nullValueProviderFindContentNullProvider = findContentNullProvider(deserializationContext, beanProperty, jsonDeserializerFindContextualValueDeserializer);
        return (Objects.equals(boolFindFormatFeature, this._unwrapSingle) && nullValueProviderFindContentNullProvider == this._nullProvider && jsonDeserializer == this._delegateDeserializer && jsonDeserializerFindContextualValueDeserializer == this._valueDeserializer && typeDeserializer == this._valueTypeDeserializer) ? this : withResolved(jsonDeserializer, jsonDeserializerFindContextualValueDeserializer, typeDeserializer, nullValueProviderFindContentNullProvider, boolFindFormatFeature);
    }

    protected Collection<Object> createDefaultInstance(DeserializationContext deserializationContext) {
        return (Collection) this._valueInstantiator.createUsingDefault(deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Collection<Object> deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) {
        JsonDeserializer<Object> jsonDeserializer = this._delegateDeserializer;
        return jsonDeserializer != null ? (Collection) this._valueInstantiator.createUsingDelegate(deserializationContext, jsonDeserializer.deserialize(jsonParser, deserializationContext)) : jsonParser.isExpectedStartArrayToken() ? _deserializeFromArray(jsonParser, deserializationContext, createDefaultInstance(deserializationContext)) : jsonParser.hasToken(JsonToken.VALUE_STRING) ? _deserializeFromString(jsonParser, deserializationContext, jsonParser.getText()) : handleNonArray(jsonParser, deserializationContext, createDefaultInstance(deserializationContext));
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) {
        return typeDeserializer.deserializeTypedFromArray(jsonParser, deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase
    public JsonDeserializer<Object> getContentDeserializer() {
        return this._valueDeserializer;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, com.fasterxml.jackson.databind.deser.ValueInstantiator.Gettable
    public ValueInstantiator getValueInstantiator() {
        return this._valueInstantiator;
    }

    protected final Collection<Object> handleNonArray(JsonParser jsonParser, DeserializationContext deserializationContext, Collection<Object> collection) throws JsonMappingException {
        Object obj_deserializeNoNullChecks;
        Boolean bool = this._unwrapSingle;
        if (bool != Boolean.TRUE && (bool != null || !deserializationContext.isEnabled(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY))) {
            return (Collection) deserializationContext.handleUnexpectedToken(this._containerType, jsonParser);
        }
        try {
            if (!jsonParser.hasToken(JsonToken.VALUE_NULL)) {
                obj_deserializeNoNullChecks = _deserializeNoNullChecks(jsonParser, deserializationContext);
            } else {
                if (this._skipNullValues) {
                    return collection;
                }
                obj_deserializeNoNullChecks = null;
            }
            if (obj_deserializeNoNullChecks == null && (obj_deserializeNoNullChecks = this._nullProvider.getNullValue(deserializationContext)) == null) {
                _tryToAddNull(jsonParser, deserializationContext, collection);
                return collection;
            }
            collection.add(obj_deserializeNoNullChecks);
            return collection;
        } catch (Exception e2) {
            if (!deserializationContext.isEnabled(DeserializationFeature.WRAP_EXCEPTIONS)) {
                ClassUtil.throwIfRTE(e2);
            }
            throw JsonMappingException.wrapWithPath(e2, Object.class, collection.size());
        }
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public boolean isCachable() {
        return this._valueDeserializer == null && this._valueTypeDeserializer == null && this._delegateDeserializer == null;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public LogicalType logicalType() {
        return LogicalType.Collection;
    }

    protected CollectionDeserializer withResolved(JsonDeserializer<?> jsonDeserializer, JsonDeserializer<?> jsonDeserializer2, TypeDeserializer typeDeserializer, NullValueProvider nullValueProvider, Boolean bool) {
        return new CollectionDeserializer(this._containerType, jsonDeserializer2, typeDeserializer, this._valueInstantiator, jsonDeserializer, nullValueProvider, bool);
    }

    protected CollectionDeserializer(JavaType javaType, JsonDeserializer<Object> jsonDeserializer, TypeDeserializer typeDeserializer, ValueInstantiator valueInstantiator, JsonDeserializer<Object> jsonDeserializer2, NullValueProvider nullValueProvider, Boolean bool) {
        super(javaType, nullValueProvider, bool);
        this._valueDeserializer = jsonDeserializer;
        this._valueTypeDeserializer = typeDeserializer;
        this._valueInstantiator = valueInstantiator;
        this._delegateDeserializer = jsonDeserializer2;
    }

    public CollectionDeserializer(JavaType javaType, JsonDeserializer<Object> jsonDeserializer, TypeDeserializer typeDeserializer, ValueInstantiator valueInstantiator) {
        this(javaType, jsonDeserializer, typeDeserializer, valueInstantiator, null, null, null);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Collection<Object> deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, Collection<Object> collection) {
        if (jsonParser.isExpectedStartArrayToken()) {
            return _deserializeFromArray(jsonParser, deserializationContext, collection);
        }
        return handleNonArray(jsonParser, deserializationContext, collection);
    }
}
