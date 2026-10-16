package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.util.ClassUtil;
import j$.util.DesugarCollections;
import java.io.Closeable;
import java.io.IOException;
import java.io.Serializable;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class JsonMappingException extends DatabindException {
    static final int MAX_REFS_TO_LIST = 1000;
    private static final long serialVersionUID = 3;
    protected LinkedList<Reference> _path;
    protected transient Closeable _processor;

    public JsonMappingException(Closeable closeable, String str, Throwable th) {
        super(str, th);
        this._processor = closeable;
        if (th instanceof JacksonException) {
            this._location = ((JacksonException) th).getLocation();
        } else if (closeable instanceof JsonParser) {
            this._location = ((JsonParser) closeable).currentTokenLocation();
        }
    }

    private static JsonGenerator _generator(SerializerProvider serializerProvider) {
        if (serializerProvider == null) {
            return null;
        }
        return serializerProvider.getGenerator();
    }

    private static JsonParser _parser(DeserializationContext deserializationContext) {
        if (deserializationContext == null) {
            return null;
        }
        return deserializationContext.getParser();
    }

    public static JsonMappingException from(JsonGenerator jsonGenerator, String str) {
        return new JsonMappingException(jsonGenerator, str, (Throwable) null);
    }

    public static JsonMappingException fromUnexpectedIOE(IOException iOException) {
        return new JsonMappingException((Closeable) null, String.format("Unexpected IOException (of type %s): %s", iOException.getClass().getName(), ClassUtil.exceptionMessage(iOException)));
    }

    public static JsonMappingException wrapWithPath(Throwable th, Reference reference) {
        JsonMappingException jsonMappingException;
        if (th instanceof JsonMappingException) {
            jsonMappingException = (JsonMappingException) th;
        } else {
            String strExceptionMessage = ClassUtil.exceptionMessage(th);
            if (strExceptionMessage == null || strExceptionMessage.isEmpty()) {
                strExceptionMessage = "(was " + th.getClass().getName() + ")";
            }
            Closeable closeable = null;
            if (th instanceof JacksonException) {
                Object processor = ((JacksonException) th).getProcessor();
                if (processor instanceof Closeable) {
                    closeable = (Closeable) processor;
                }
            }
            jsonMappingException = new JsonMappingException(closeable, strExceptionMessage, th);
        }
        jsonMappingException.prependPath(reference);
        return jsonMappingException;
    }

    protected void _appendPathDesc(StringBuilder sb) {
        LinkedList<Reference> linkedList = this._path;
        if (linkedList == null) {
            return;
        }
        Iterator<Reference> it = linkedList.iterator();
        while (it.hasNext()) {
            sb.append(it.next().toString());
            if (it.hasNext()) {
                sb.append("->");
            }
        }
    }

    protected StringBuilder _appendReferenceChain(StringBuilder sb) {
        sb.append(" (through reference chain: ");
        StringBuilder pathReference = getPathReference(sb);
        pathReference.append(')');
        return pathReference;
    }

    protected String _buildMessage() {
        String message = super.getMessage();
        return this._path == null ? message : _appendReferenceChain(new StringBuilder(message)).toString();
    }

    @Override // java.lang.Throwable
    public String getLocalizedMessage() {
        return _buildMessage();
    }

    @Override // com.fasterxml.jackson.core.JsonProcessingException, java.lang.Throwable
    public String getMessage() {
        return _buildMessage();
    }

    public List<Reference> getPath() {
        LinkedList<Reference> linkedList = this._path;
        return linkedList == null ? Collections.EMPTY_LIST : DesugarCollections.unmodifiableList(linkedList);
    }

    public String getPathReference() {
        return getPathReference(new StringBuilder()).toString();
    }

    @Override // com.fasterxml.jackson.core.JsonProcessingException, com.fasterxml.jackson.core.JacksonException
    @JsonIgnore
    public Object getProcessor() {
        return this._processor;
    }

    public void prependPath(Reference reference) {
        LinkedList<Reference> linkedList = this._path;
        if (linkedList == null) {
            linkedList = new LinkedList<>();
            this._path = linkedList;
        }
        if (linkedList.size() < 1000) {
            this._path.addFirst(reference);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonProcessingException, java.lang.Throwable
    public String toString() {
        return getClass().getName() + ": " + getMessage();
    }

    public JsonMappingException withCause(Throwable th) {
        initCause(th);
        return this;
    }

    public static JsonMappingException from(JsonGenerator jsonGenerator, String str, Throwable th) {
        return new JsonMappingException(jsonGenerator, str, th);
    }

    public static JsonMappingException from(JsonParser jsonParser, String str) {
        return new JsonMappingException(jsonParser, str);
    }

    public static JsonMappingException from(JsonParser jsonParser, String str, Throwable th) {
        return new JsonMappingException(jsonParser, str, th);
    }

    public static JsonMappingException from(DeserializationContext deserializationContext, String str) {
        return new JsonMappingException(_parser(deserializationContext), str);
    }

    public static JsonMappingException from(DeserializationContext deserializationContext, String str, Throwable th) {
        return new JsonMappingException(_parser(deserializationContext), str, th);
    }

    public StringBuilder getPathReference(StringBuilder sb) {
        _appendPathDesc(sb);
        return sb;
    }

    public static JsonMappingException from(SerializerProvider serializerProvider, String str) {
        return new JsonMappingException(_generator(serializerProvider), str);
    }

    public static JsonMappingException from(SerializerProvider serializerProvider, String str, Throwable th) {
        return new JsonMappingException(_generator(serializerProvider), str, th);
    }

    /* compiled from: WazeSource */
    public class Reference implements Serializable {
        private static final long serialVersionUID = 2;
        protected String _desc;
        protected String _fieldName;
        protected transient Object _from;
        protected int _index;

        public Reference(Object obj, String str) {
            this._index = -1;
            this._from = obj;
            if (str == null) {
                throw new NullPointerException("Cannot pass null fieldName");
            }
            this._fieldName = str;
        }

        public String getDescription() {
            String str = this._desc;
            if (str != null) {
                return str;
            }
            StringBuilder sb = new StringBuilder();
            Object obj = this._from;
            if (obj != null) {
                Class<?> componentType = obj instanceof Class ? (Class) obj : obj.getClass();
                int i2 = 0;
                while (componentType.isArray()) {
                    componentType = componentType.getComponentType();
                    i2++;
                }
                sb.append(componentType.getName());
                while (true) {
                    i2--;
                    if (i2 < 0) {
                        break;
                    }
                    sb.append("[]");
                }
            } else {
                sb.append("UNKNOWN");
            }
            sb.append('[');
            if (this._fieldName != null) {
                sb.append(JsonFactory.DEFAULT_QUOTE_CHAR);
                sb.append(this._fieldName);
                sb.append(JsonFactory.DEFAULT_QUOTE_CHAR);
            } else {
                int i3 = this._index;
                if (i3 >= 0) {
                    sb.append(i3);
                } else {
                    sb.append('?');
                }
            }
            sb.append(']');
            String string = sb.toString();
            this._desc = string;
            return string;
        }

        public String getFieldName() {
            return this._fieldName;
        }

        @JsonIgnore
        public Object getFrom() {
            return this._from;
        }

        public int getIndex() {
            return this._index;
        }

        void setDescription(String str) {
            this._desc = str;
        }

        void setFieldName(String str) {
            this._fieldName = str;
        }

        void setIndex(int i2) {
            this._index = i2;
        }

        public String toString() {
            return getDescription();
        }

        Object writeReplace() {
            getDescription();
            return this;
        }

        public Reference(Object obj) {
            this._index = -1;
            this._from = obj;
        }

        public Reference(Object obj, int i2) {
            this._from = obj;
            this._index = i2;
        }

        protected Reference() {
            this._index = -1;
        }
    }

    @Override // com.fasterxml.jackson.databind.DatabindException
    public void prependPath(Object obj, int i2) {
        prependPath(new Reference(obj, i2));
    }

    @Override // com.fasterxml.jackson.databind.DatabindException
    public void prependPath(Object obj, String str) {
        prependPath(new Reference(obj, str));
    }

    public JsonMappingException(Closeable closeable, String str, JsonLocation jsonLocation) {
        super(str, jsonLocation);
        this._processor = closeable;
    }

    public JsonMappingException(Closeable closeable, String str) {
        super(str);
        this._processor = closeable;
        if (closeable instanceof JsonParser) {
            this._location = ((JsonParser) closeable).currentTokenLocation();
        }
    }

    @Deprecated
    public JsonMappingException(String str) {
        super(str);
    }

    @Deprecated
    public JsonMappingException(String str, JsonLocation jsonLocation) {
        super(str, jsonLocation);
    }

    @Deprecated
    public JsonMappingException(String str, JsonLocation jsonLocation, Throwable th) {
        super(str, jsonLocation, th);
    }

    @Deprecated
    public JsonMappingException(String str, Throwable th) {
        super(str, th);
    }

    public static JsonMappingException wrapWithPath(Throwable th, Object obj, int i2) {
        return wrapWithPath(th, new Reference(obj, i2));
    }

    public static JsonMappingException wrapWithPath(Throwable th, Object obj, String str) {
        return wrapWithPath(th, new Reference(obj, str));
    }
}
