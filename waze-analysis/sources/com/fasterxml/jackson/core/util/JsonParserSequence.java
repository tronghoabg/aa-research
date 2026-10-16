package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class JsonParserSequence extends JsonParserDelegate {
    protected final boolean _checkForExistingToken;
    protected boolean _hasToken;
    protected int _nextParserIndex;
    protected final JsonParser[] _parsers;

    protected JsonParserSequence(boolean z, JsonParser[] jsonParserArr) {
        super(jsonParserArr[0]);
        this._checkForExistingToken = false;
        this._hasToken = false;
        this._parsers = jsonParserArr;
        this._nextParserIndex = 1;
    }

    public static JsonParserSequence createFlattened(boolean z, JsonParser jsonParser, JsonParser jsonParser2) {
        boolean z2 = jsonParser instanceof JsonParserSequence;
        if (!z2 && !(jsonParser2 instanceof JsonParserSequence)) {
            return new JsonParserSequence(false, new JsonParser[]{jsonParser, jsonParser2});
        }
        ArrayList arrayList = new ArrayList();
        if (z2) {
            ((JsonParserSequence) jsonParser).addFlattenedActiveParsers(arrayList);
        } else {
            arrayList.add(jsonParser);
        }
        if (jsonParser2 instanceof JsonParserSequence) {
            ((JsonParserSequence) jsonParser2).addFlattenedActiveParsers(arrayList);
        } else {
            arrayList.add(jsonParser2);
        }
        return new JsonParserSequence(false, (JsonParser[]) arrayList.toArray(new JsonParser[arrayList.size()]));
    }

    protected void addFlattenedActiveParsers(List<JsonParser> list) {
        int length = this._parsers.length;
        for (int i2 = this._nextParserIndex - 1; i2 < length; i2++) {
            JsonParser jsonParser = this._parsers[i2];
            if (jsonParser instanceof JsonParserSequence) {
                ((JsonParserSequence) jsonParser).addFlattenedActiveParsers(list);
            } else {
                list.add(jsonParser);
            }
        }
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        do {
            this.delegate.close();
        } while (switchToNext());
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public JsonToken nextToken() {
        JsonParser jsonParser = this.delegate;
        if (jsonParser == null) {
            return null;
        }
        if (this._hasToken) {
            this._hasToken = false;
            return jsonParser.currentToken();
        }
        JsonToken jsonTokenNextToken = jsonParser.nextToken();
        return jsonTokenNextToken == null ? switchAndReturnNext() : jsonTokenNextToken;
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public JsonParser skipChildren() {
        int i2 = 1;
        if (this.delegate.currentToken() == JsonToken.START_OBJECT || this.delegate.currentToken() == JsonToken.START_ARRAY) {
            while (true) {
                JsonToken jsonTokenNextToken = nextToken();
                if (jsonTokenNextToken == null) {
                    break;
                }
                if (!jsonTokenNextToken.isStructStart()) {
                    if (jsonTokenNextToken.isStructEnd() && i2 - 1 == 0) {
                        break;
                    }
                } else {
                    i2++;
                }
            }
        }
        return this;
    }

    protected JsonToken switchAndReturnNext() {
        JsonToken jsonTokenNextToken;
        do {
            int i2 = this._nextParserIndex;
            JsonParser[] jsonParserArr = this._parsers;
            if (i2 >= jsonParserArr.length) {
                return null;
            }
            this._nextParserIndex = i2 + 1;
            this.delegate = jsonParserArr[i2];
            if (this._checkForExistingToken && this.delegate.hasCurrentToken()) {
                return this.delegate.getCurrentToken();
            }
            jsonTokenNextToken = this.delegate.nextToken();
        } while (jsonTokenNextToken == null);
        return jsonTokenNextToken;
    }

    protected boolean switchToNext() {
        JsonParser[] jsonParserArr = this._parsers;
        int i2 = this._nextParserIndex;
        if (i2 >= jsonParserArr.length) {
            return false;
        }
        this._nextParserIndex = i2 + 1;
        this.delegate = jsonParserArr[i2];
        return true;
    }
}
