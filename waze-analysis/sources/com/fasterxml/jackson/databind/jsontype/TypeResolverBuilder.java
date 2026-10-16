package com.fasterxml.jackson.databind.jsontype;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import java.util.Collection;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public interface TypeResolverBuilder<T extends TypeResolverBuilder<T>> {

    /* compiled from: WazeSource */
    /* renamed from: com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static TypeResolverBuilder $default$withSettings(TypeResolverBuilder typeResolverBuilder, JsonTypeInfo.Value value) {
            throw new IllegalStateException("TypeResolveBuilder implementation " + typeResolverBuilder.getClass().getName() + " must implement `withSettings()`");
        }
    }

    TypeDeserializer buildTypeDeserializer(DeserializationConfig deserializationConfig, JavaType javaType, Collection<NamedType> collection);

    TypeSerializer buildTypeSerializer(SerializationConfig serializationConfig, JavaType javaType, Collection<NamedType> collection);

    T defaultImpl(Class<?> cls);

    Class<?> getDefaultImpl();

    T inclusion(JsonTypeInfo.As as);

    T init(JsonTypeInfo.Id id, TypeIdResolver typeIdResolver);

    T init(JsonTypeInfo.Value value, TypeIdResolver typeIdResolver);

    T typeIdVisibility(boolean z);

    T typeProperty(String str);

    T withDefaultImpl(Class<?> cls);

    T withSettings(JsonTypeInfo.Value value);
}
