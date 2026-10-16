package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.FormatSchema;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonStreamContext;
import com.fasterxml.jackson.core.JsonToken;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class MappingIterator<T> implements Iterator<T>, Closeable {
    protected static final MappingIterator<?> EMPTY_ITERATOR = new MappingIterator<>(null, null, null, null, false, null);
    protected static final int STATE_CLOSED = 0;
    protected static final int STATE_HAS_VALUE = 3;
    protected static final int STATE_MAY_HAVE_VALUE = 2;
    protected static final int STATE_NEED_RESYNC = 1;
    protected final boolean _closeParser;
    protected final DeserializationContext _context;
    protected final JsonDeserializer<T> _deserializer;
    protected final JsonParser _parser;
    protected final JsonStreamContext _seqContext;
    protected int _state;
    protected final JavaType _type;
    protected final T _updatedValue;

    /* JADX WARN: Multi-variable type inference failed */
    protected MappingIterator(JavaType javaType, JsonParser jsonParser, DeserializationContext deserializationContext, JsonDeserializer<?> jsonDeserializer, boolean z, Object obj) {
        int i2;
        this._type = javaType;
        this._parser = jsonParser;
        this._context = deserializationContext;
        this._deserializer = jsonDeserializer;
        this._closeParser = z;
        JsonStreamContext parsingContext = null;
        if (obj == 0) {
            this._updatedValue = null;
        } else {
            this._updatedValue = obj;
        }
        if (jsonParser == null) {
            i2 = 0;
        } else {
            parsingContext = jsonParser.getParsingContext();
            if (z && jsonParser.isExpectedStartArrayToken()) {
                jsonParser.clearCurrentToken();
            } else {
                JsonToken jsonTokenCurrentToken = jsonParser.currentToken();
                if (jsonTokenCurrentToken == JsonToken.START_OBJECT || jsonTokenCurrentToken == JsonToken.START_ARRAY) {
                    parsingContext = parsingContext.getParent();
                }
            }
            i2 = 2;
        }
        this._seqContext = parsingContext;
        this._state = i2;
    }

    public static <T> MappingIterator<T> emptyIterator() {
        return (MappingIterator<T>) EMPTY_ITERATOR;
    }

    protected <R> R _handleIOException(IOException iOException) {
        throw new RuntimeException(iOException.getMessage(), iOException);
    }

    protected <R> R _handleMappingException(JsonMappingException jsonMappingException) {
        throw new RuntimeJsonMappingException(jsonMappingException.getMessage(), jsonMappingException);
    }

    protected void _resync() {
        JsonParser jsonParser = this._parser;
        if (jsonParser.getParsingContext() == this._seqContext) {
            return;
        }
        while (true) {
            JsonToken jsonTokenNextToken = jsonParser.nextToken();
            if (jsonTokenNextToken == JsonToken.END_ARRAY || jsonTokenNextToken == JsonToken.END_OBJECT) {
                if (jsonParser.getParsingContext() == this._seqContext) {
                    jsonParser.clearCurrentToken();
                    return;
                }
            } else if (jsonTokenNextToken == JsonToken.START_ARRAY || jsonTokenNextToken == JsonToken.START_OBJECT) {
                jsonParser.skipChildren();
            } else if (jsonTokenNextToken == null) {
                return;
            }
        }
    }

    protected <R> R _throwNoSuchElement() {
        throw new NoSuchElementException();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this._state != 0) {
            this._state = 0;
            JsonParser jsonParser = this._parser;
            if (jsonParser != null) {
                jsonParser.close();
            }
        }
    }

    public JsonLocation getCurrentLocation() {
        return this._parser.currentLocation();
    }

    public JsonParser getParser() {
        return this._parser;
    }

    public FormatSchema getParserSchema() {
        return this._parser.getSchema();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        try {
            return hasNextValue();
        } catch (JsonMappingException e2) {
            return ((Boolean) this._handleMappingException(e2)).booleanValue();
        } catch (IOException e3) {
            return ((Boolean) this._handleIOException(e3)).booleanValue();
        }
    }

    public boolean hasNextValue() {
        JsonToken jsonTokenNextToken;
        int i2 = this._state;
        if (i2 == 0) {
            return false;
        }
        if (i2 == 1) {
            _resync();
        } else if (i2 != 2) {
            return true;
        }
        JsonParser jsonParser = this._parser;
        if (jsonParser == null) {
            return false;
        }
        if (jsonParser.currentToken() != null || ((jsonTokenNextToken = this._parser.nextToken()) != null && jsonTokenNextToken != JsonToken.END_ARRAY)) {
            this._state = 3;
            return true;
        }
        this._state = 0;
        if (this._closeParser) {
            this._parser.close();
        }
        return false;
    }

    @Override // java.util.Iterator
    public T next() {
        try {
            return nextValue();
        } catch (JsonMappingException e2) {
            return (T) this._handleMappingException(e2);
        } catch (IOException e3) {
            return (T) this._handleIOException(e3);
        }
    }

    public T nextValue() {
        T tDeserialize;
        int i2 = this._state;
        if (i2 == 0) {
            return (T) _throwNoSuchElement();
        }
        if ((i2 == 1 || i2 == 2) && !hasNextValue()) {
            return (T) _throwNoSuchElement();
        }
        try {
            T t = this._updatedValue;
            JsonDeserializer<T> jsonDeserializer = this._deserializer;
            if (t == null) {
                tDeserialize = jsonDeserializer.deserialize(this._parser, this._context);
            } else {
                jsonDeserializer.deserialize(this._parser, this._context, t);
                tDeserialize = this._updatedValue;
            }
            this._state = 2;
            this._parser.clearCurrentToken();
            return tDeserialize;
        } catch (Throwable th) {
            this._state = 1;
            this._parser.clearCurrentToken();
            throw th;
        }
    }

    public <C extends Collection<? super T>> C readAll(C c2) {
        while (hasNextValue()) {
            c2.add(nextValue());
        }
        return c2;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }

    public List<T> readAll() {
        return readAll((MappingIterator<T>) new ArrayList());
    }

    public <L extends List<? super T>> L readAll(L l2) {
        while (hasNextValue()) {
            l2.add(nextValue());
        }
        return l2;
    }

    protected MappingIterator(MappingIterator<T> mappingIterator) {
        this(mappingIterator._type, mappingIterator._parser, mappingIterator._context, mappingIterator._deserializer, mappingIterator._closeParser, mappingIterator._updatedValue);
    }
}
