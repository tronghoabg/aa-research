package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.type.ReferenceType;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.Converter;
import com.fasterxml.jackson.databind.util.LRUMap;
import com.fasterxml.jackson.databind.util.LookupCache;
import j$.util.Objects;
import java.io.Serializable;
import java.util.HashMap;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class DeserializerCache implements Serializable {
    public static final int DEFAULT_MAX_CACHE_SIZE = 2000;
    private static final long serialVersionUID = 1;
    protected final LookupCache<JavaType, JsonDeserializer<Object>> _cachedDeserializers;
    protected final HashMap<JavaType, JsonDeserializer<Object>> _incompleteDeserializers;
    private final ReentrantLock _incompleteDeserializersLock;

    public DeserializerCache(LookupCache<JavaType, JsonDeserializer<Object>> lookupCache) {
        this._incompleteDeserializers = new HashMap<>(8);
        this._incompleteDeserializersLock = new ReentrantLock();
        this._cachedDeserializers = lookupCache;
    }

    private boolean _hasCustomHandlers(JavaType javaType) {
        if (!javaType.isContainerType()) {
            return false;
        }
        JavaType contentType = javaType.getContentType();
        if (contentType == null || (contentType.getValueHandler() == null && contentType.getTypeHandler() == null)) {
            return javaType.isMapLikeType() && javaType.getKeyType().getValueHandler() != null;
        }
        return true;
    }

    private Class<?> _verifyAsClass(Object obj, String str, Class<?> cls) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Class) {
            Class<?> cls2 = (Class) obj;
            if (cls2 == cls || ClassUtil.isBogusClass(cls2)) {
                return null;
            }
            return cls2;
        }
        throw new IllegalStateException("AnnotationIntrospector." + str + "() returned value of type " + obj.getClass().getName() + ": expected type JsonSerializer or Class<JsonSerializer> instead");
    }

    private JavaType modifyTypeByAnnotation(DeserializationContext deserializationContext, Annotated annotated, JavaType javaType) {
        Object objFindContentDeserializer;
        JsonDeserializer<Object> jsonDeserializerDeserializerInstance;
        JavaType keyType;
        Object objFindKeyDeserializer;
        KeyDeserializer keyDeserializerKeyDeserializerInstance;
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        if (annotationIntrospector == null) {
            return javaType;
        }
        if (javaType.isMapLikeType() && (keyType = javaType.getKeyType()) != null && keyType.getValueHandler() == null && (objFindKeyDeserializer = annotationIntrospector.findKeyDeserializer(annotated)) != null && (keyDeserializerKeyDeserializerInstance = deserializationContext.keyDeserializerInstance(annotated, objFindKeyDeserializer)) != null) {
            javaType = ((MapLikeType) javaType).withKeyValueHandler(keyDeserializerKeyDeserializerInstance);
        }
        JavaType contentType = javaType.getContentType();
        if (contentType != null && contentType.getValueHandler() == null && (objFindContentDeserializer = annotationIntrospector.findContentDeserializer(annotated)) != null) {
            if (objFindContentDeserializer instanceof JsonDeserializer) {
                jsonDeserializerDeserializerInstance = (JsonDeserializer) objFindContentDeserializer;
            } else {
                Class<?> cls_verifyAsClass = _verifyAsClass(objFindContentDeserializer, "findContentDeserializer", JsonDeserializer.None.class);
                jsonDeserializerDeserializerInstance = cls_verifyAsClass != null ? deserializationContext.deserializerInstance(annotated, cls_verifyAsClass) : null;
            }
            if (jsonDeserializerDeserializerInstance != null) {
                javaType = javaType.withContentValueHandler(jsonDeserializerDeserializerInstance);
            }
        }
        return annotationIntrospector.refineDeserializationType(deserializationContext.getConfig(), annotated, javaType);
    }

    protected JsonDeserializer<Object> _createAndCache2(DeserializationContext deserializationContext, DeserializerFactory deserializerFactory, JavaType javaType, boolean z) throws InvalidDefinitionException {
        JsonDeserializer<Object> jsonDeserializer_createDeserializer;
        try {
            jsonDeserializer_createDeserializer = _createDeserializer(deserializationContext, deserializerFactory, javaType);
        } catch (IllegalArgumentException e2) {
            deserializationContext.reportBadDefinition(javaType, ClassUtil.exceptionMessage(e2));
            jsonDeserializer_createDeserializer = null;
        }
        if (jsonDeserializer_createDeserializer == null) {
            return null;
        }
        boolean z2 = false;
        if (!z && jsonDeserializer_createDeserializer.isCachable()) {
            z2 = true;
        }
        if (jsonDeserializer_createDeserializer instanceof ResolvableDeserializer) {
            this._incompleteDeserializers.put(javaType, jsonDeserializer_createDeserializer);
            try {
                ((ResolvableDeserializer) jsonDeserializer_createDeserializer).resolve(deserializationContext);
            } finally {
                this._incompleteDeserializers.remove(javaType);
            }
        }
        if (z2) {
            this._cachedDeserializers.put(javaType, jsonDeserializer_createDeserializer);
        }
        return jsonDeserializer_createDeserializer;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0024 A[Catch: all -> 0x0068, TryCatch #1 {all -> 0x0068, blocks: (B:10:0x0019, B:13:0x0024, B:15:0x002c, B:22:0x0043, B:24:0x004b, B:29:0x0059, B:32:0x0062, B:33:0x0067, B:20:0x003d), top: B:39:0x0019, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object> _createAndCacheValueDeserializer(com.fasterxml.jackson.databind.DeserializationContext r4, com.fasterxml.jackson.databind.deser.DeserializerFactory r5, com.fasterxml.jackson.databind.JavaType r6) {
        /*
            r3 = this;
            boolean r0 = r3._hasCustomHandlers(r6)
            if (r0 != 0) goto L12
            com.fasterxml.jackson.databind.util.LookupCache<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> r1 = r3._cachedDeserializers
            java.lang.Object r1 = r1.get(r6)
            com.fasterxml.jackson.databind.JsonDeserializer r1 = (com.fasterxml.jackson.databind.JsonDeserializer) r1
            if (r1 != 0) goto L11
            goto L12
        L11:
            return r1
        L12:
            java.util.concurrent.locks.ReentrantLock r1 = r3._incompleteDeserializersLock
            r1.lock()
            if (r0 != 0) goto L24
            com.fasterxml.jackson.databind.util.LookupCache<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> r1 = r3._cachedDeserializers     // Catch: java.lang.Throwable -> L68
            java.lang.Object r1 = r1.get(r6)     // Catch: java.lang.Throwable -> L68
            com.fasterxml.jackson.databind.JsonDeserializer r1 = (com.fasterxml.jackson.databind.JsonDeserializer) r1     // Catch: java.lang.Throwable -> L68
            if (r1 == 0) goto L24
            goto L37
        L24:
            java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> r1 = r3._incompleteDeserializers     // Catch: java.lang.Throwable -> L68
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L68
            if (r1 <= 0) goto L3d
            java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> r2 = r3._incompleteDeserializers     // Catch: java.lang.Throwable -> L68
            java.lang.Object r2 = r2.get(r6)     // Catch: java.lang.Throwable -> L68
            com.fasterxml.jackson.databind.JsonDeserializer r2 = (com.fasterxml.jackson.databind.JsonDeserializer) r2     // Catch: java.lang.Throwable -> L68
            if (r2 == 0) goto L3d
            r1 = r2
        L37:
            java.util.concurrent.locks.ReentrantLock r3 = r3._incompleteDeserializersLock
            r3.unlock()
            return r1
        L3d:
            com.fasterxml.jackson.databind.JsonDeserializer r4 = r3._createAndCache2(r4, r5, r6, r0)     // Catch: java.lang.Throwable -> L56
            if (r1 != 0) goto L50
            java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> r5 = r3._incompleteDeserializers     // Catch: java.lang.Throwable -> L68
            int r5 = r5.size()     // Catch: java.lang.Throwable -> L68
            if (r5 <= 0) goto L50
            java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> r5 = r3._incompleteDeserializers     // Catch: java.lang.Throwable -> L68
            r5.clear()     // Catch: java.lang.Throwable -> L68
        L50:
            java.util.concurrent.locks.ReentrantLock r3 = r3._incompleteDeserializersLock
            r3.unlock()
            return r4
        L56:
            r4 = move-exception
            if (r1 != 0) goto L67
            java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> r5 = r3._incompleteDeserializers     // Catch: java.lang.Throwable -> L68
            int r5 = r5.size()     // Catch: java.lang.Throwable -> L68
            if (r5 > 0) goto L62
            goto L67
        L62:
            java.util.HashMap<com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.JsonDeserializer<java.lang.Object>> r5 = r3._incompleteDeserializers     // Catch: java.lang.Throwable -> L68
            r5.clear()     // Catch: java.lang.Throwable -> L68
        L67:
            throw r4     // Catch: java.lang.Throwable -> L68
        L68:
            r4 = move-exception
            java.util.concurrent.locks.ReentrantLock r3 = r3._incompleteDeserializersLock
            r3.unlock()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.DeserializerCache._createAndCacheValueDeserializer(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.deser.DeserializerFactory, com.fasterxml.jackson.databind.JavaType):com.fasterxml.jackson.databind.JsonDeserializer");
    }

    protected JsonDeserializer<Object> _createDeserializer(DeserializationContext deserializationContext, DeserializerFactory deserializerFactory, JavaType javaType) {
        DeserializationConfig config = deserializationContext.getConfig();
        if (javaType.isAbstract() || javaType.isMapLikeType() || javaType.isCollectionLikeType()) {
            javaType = deserializerFactory.mapAbstractType(config, javaType);
        }
        BeanDescription beanDescriptionIntrospect = config.introspect(javaType);
        JsonDeserializer<Object> jsonDeserializerFindDeserializerFromAnnotation = findDeserializerFromAnnotation(deserializationContext, beanDescriptionIntrospect.getClassInfo());
        if (jsonDeserializerFindDeserializerFromAnnotation != null) {
            return jsonDeserializerFindDeserializerFromAnnotation;
        }
        JavaType javaTypeModifyTypeByAnnotation = modifyTypeByAnnotation(deserializationContext, beanDescriptionIntrospect.getClassInfo(), javaType);
        if (javaTypeModifyTypeByAnnotation != javaType) {
            beanDescriptionIntrospect = config.introspect(javaTypeModifyTypeByAnnotation);
            javaType = javaTypeModifyTypeByAnnotation;
        }
        Class<?> clsFindPOJOBuilder = beanDescriptionIntrospect.findPOJOBuilder();
        if (clsFindPOJOBuilder != null) {
            return deserializerFactory.createBuilderBasedDeserializer(deserializationContext, javaType, beanDescriptionIntrospect, clsFindPOJOBuilder);
        }
        Converter<Object, Object> converterFindDeserializationConverter = beanDescriptionIntrospect.findDeserializationConverter();
        if (converterFindDeserializationConverter == null) {
            return _createDeserializer2(deserializationContext, deserializerFactory, javaType, beanDescriptionIntrospect);
        }
        JavaType inputType = converterFindDeserializationConverter.getInputType(deserializationContext.getTypeFactory());
        if (!inputType.hasRawClass(javaType.getRawClass())) {
            beanDescriptionIntrospect = config.introspect(inputType);
        }
        return new StdDelegatingDeserializer(converterFindDeserializationConverter, inputType, _createDeserializer2(deserializationContext, deserializerFactory, inputType, beanDescriptionIntrospect));
    }

    protected JsonDeserializer<?> _createDeserializer2(DeserializationContext deserializationContext, DeserializerFactory deserializerFactory, JavaType javaType, BeanDescription beanDescription) {
        DeserializationConfig config = deserializationContext.getConfig();
        if (javaType.isEnumType()) {
            return deserializerFactory.createEnumDeserializer(deserializationContext, javaType, beanDescription);
        }
        if (javaType.isContainerType()) {
            if (javaType.isArrayType()) {
                return deserializerFactory.createArrayDeserializer(deserializationContext, (ArrayType) javaType, beanDescription);
            }
            if (javaType.isMapLikeType() && beanDescription.findExpectedFormat().getShape() != JsonFormat.Shape.OBJECT) {
                MapLikeType mapLikeType = (MapLikeType) javaType;
                return mapLikeType instanceof MapType ? deserializerFactory.createMapDeserializer(deserializationContext, (MapType) mapLikeType, beanDescription) : deserializerFactory.createMapLikeDeserializer(deserializationContext, mapLikeType, beanDescription);
            }
            if (javaType.isCollectionLikeType() && beanDescription.findExpectedFormat().getShape() != JsonFormat.Shape.OBJECT) {
                CollectionLikeType collectionLikeType = (CollectionLikeType) javaType;
                return collectionLikeType instanceof CollectionType ? deserializerFactory.createCollectionDeserializer(deserializationContext, (CollectionType) collectionLikeType, beanDescription) : deserializerFactory.createCollectionLikeDeserializer(deserializationContext, collectionLikeType, beanDescription);
            }
        }
        return javaType.isReferenceType() ? deserializerFactory.createReferenceDeserializer(deserializationContext, (ReferenceType) javaType, beanDescription) : JsonNode.class.isAssignableFrom(javaType.getRawClass()) ? deserializerFactory.createTreeDeserializer(config, javaType, beanDescription) : deserializerFactory.createBeanDeserializer(deserializationContext, javaType, beanDescription);
    }

    protected JsonDeserializer<Object> _findCachedDeserializer(JavaType javaType) {
        if (_hasCustomHandlers(javaType)) {
            return null;
        }
        return this._cachedDeserializers.get(javaType);
    }

    protected KeyDeserializer _handleUnknownKeyDeserializer(DeserializationContext deserializationContext, JavaType javaType) {
        return (KeyDeserializer) deserializationContext.reportBadDefinition(javaType, "Cannot find a (Map) Key deserializer for type ".concat(String.valueOf(String.valueOf(javaType))));
    }

    protected JsonDeserializer<Object> _handleUnknownValueDeserializer(DeserializationContext deserializationContext, JavaType javaType) {
        return !ClassUtil.isConcrete(javaType.getRawClass()) ? (JsonDeserializer) deserializationContext.reportBadDefinition(javaType, "Cannot find a Value deserializer for abstract type ".concat(String.valueOf(String.valueOf(javaType)))) : (JsonDeserializer) deserializationContext.reportBadDefinition(javaType, "Cannot find a Value deserializer for type ".concat(String.valueOf(String.valueOf(javaType))));
    }

    public int cachedDeserializersCount() {
        return this._cachedDeserializers.size();
    }

    public DeserializerCache emptyCopy() {
        return new DeserializerCache(this._cachedDeserializers.emptyCopy());
    }

    protected Converter<Object, Object> findConverter(DeserializationContext deserializationContext, Annotated annotated) {
        Object objFindDeserializationConverter = deserializationContext.getAnnotationIntrospector().findDeserializationConverter(annotated);
        if (objFindDeserializationConverter == null) {
            return null;
        }
        return deserializationContext.converterInstance(annotated, objFindDeserializationConverter);
    }

    protected JsonDeserializer<Object> findConvertingDeserializer(DeserializationContext deserializationContext, Annotated annotated, JsonDeserializer<Object> jsonDeserializer) {
        Converter<Object, Object> converterFindConverter = findConverter(deserializationContext, annotated);
        return converterFindConverter == null ? jsonDeserializer : new StdDelegatingDeserializer(converterFindConverter, converterFindConverter.getInputType(deserializationContext.getTypeFactory()), jsonDeserializer);
    }

    protected JsonDeserializer<Object> findDeserializerFromAnnotation(DeserializationContext deserializationContext, Annotated annotated) {
        Object objFindDeserializer = deserializationContext.getAnnotationIntrospector().findDeserializer(annotated);
        if (objFindDeserializer == null) {
            return null;
        }
        return findConvertingDeserializer(deserializationContext, annotated, deserializationContext.deserializerInstance(annotated, objFindDeserializer));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public KeyDeserializer findKeyDeserializer(DeserializationContext deserializationContext, DeserializerFactory deserializerFactory, JavaType javaType) {
        Objects.requireNonNull(javaType, "Null 'type' passed");
        KeyDeserializer keyDeserializerCreateKeyDeserializer = deserializerFactory.createKeyDeserializer(deserializationContext, javaType);
        if (keyDeserializerCreateKeyDeserializer == 0) {
            return _handleUnknownKeyDeserializer(deserializationContext, javaType);
        }
        if (keyDeserializerCreateKeyDeserializer instanceof ResolvableDeserializer) {
            ((ResolvableDeserializer) keyDeserializerCreateKeyDeserializer).resolve(deserializationContext);
        }
        return keyDeserializerCreateKeyDeserializer;
    }

    public JsonDeserializer<Object> findValueDeserializer(DeserializationContext deserializationContext, DeserializerFactory deserializerFactory, JavaType javaType) {
        Objects.requireNonNull(javaType, "Null 'propertyType' passed");
        JsonDeserializer<Object> jsonDeserializer_findCachedDeserializer = _findCachedDeserializer(javaType);
        if (jsonDeserializer_findCachedDeserializer != null) {
            return jsonDeserializer_findCachedDeserializer;
        }
        JsonDeserializer<Object> jsonDeserializer_createAndCacheValueDeserializer = _createAndCacheValueDeserializer(deserializationContext, deserializerFactory, javaType);
        return jsonDeserializer_createAndCacheValueDeserializer != null ? jsonDeserializer_createAndCacheValueDeserializer : _handleUnknownValueDeserializer(deserializationContext, javaType);
    }

    public void flushCachedDeserializers() {
        this._cachedDeserializers.clear();
    }

    public boolean hasValueDeserializerFor(DeserializationContext deserializationContext, DeserializerFactory deserializerFactory, JavaType javaType) {
        Objects.requireNonNull(javaType, "Null 'type' passed");
        JsonDeserializer<Object> jsonDeserializer_findCachedDeserializer = _findCachedDeserializer(javaType);
        if (jsonDeserializer_findCachedDeserializer == null) {
            jsonDeserializer_findCachedDeserializer = _createAndCacheValueDeserializer(deserializationContext, deserializerFactory, javaType);
        }
        return jsonDeserializer_findCachedDeserializer != null;
    }

    Object writeReplace() {
        this._incompleteDeserializers.clear();
        return this;
    }

    public DeserializerCache(int i2) {
        this(new LRUMap(Math.min(64, i2 >> 2), i2));
    }

    public DeserializerCache() {
        this(2000);
    }

    @Deprecated
    protected JsonDeserializer<Object> _createAndCache2(DeserializationContext deserializationContext, DeserializerFactory deserializerFactory, JavaType javaType) {
        return _createAndCache2(deserializationContext, deserializerFactory, javaType, _hasCustomHandlers(javaType));
    }
}
