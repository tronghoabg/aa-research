package com.fasterxml.jackson.databind.jsonFormatVisitors;

import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.SerializerProvider;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public interface JsonObjectFormatVisitor extends JsonFormatVisitorWithSerializerProvider {

    /* compiled from: WazeSource */
    public class Base implements JsonObjectFormatVisitor {
        protected SerializerProvider _provider;

        public Base(SerializerProvider serializerProvider) {
            this._provider = serializerProvider;
        }

        @Override // com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWithSerializerProvider
        public SerializerProvider getProvider() {
            return this._provider;
        }

        @Override // com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor
        public void optionalProperty(BeanProperty beanProperty) {
        }

        @Override // com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor
        public void property(BeanProperty beanProperty) {
        }

        @Override // com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWithSerializerProvider
        public void setProvider(SerializerProvider serializerProvider) {
            this._provider = serializerProvider;
        }

        @Override // com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor
        public void optionalProperty(String str, JsonFormatVisitable jsonFormatVisitable, JavaType javaType) {
        }

        @Override // com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor
        public void property(String str, JsonFormatVisitable jsonFormatVisitable, JavaType javaType) {
        }

        public Base() {
        }
    }

    void optionalProperty(BeanProperty beanProperty);

    void optionalProperty(String str, JsonFormatVisitable jsonFormatVisitable, JavaType javaType);

    void property(BeanProperty beanProperty);

    void property(String str, JsonFormatVisitable jsonFormatVisitable, JavaType javaType);
}
