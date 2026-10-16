package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.io.CharacterEscapes;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class JsonFactoryBuilder extends TSFBuilder<JsonFactory, JsonFactoryBuilder> {
    protected CharacterEscapes _characterEscapes;
    protected int _maximumNonEscapedChar;
    protected char _quoteChar;
    protected SerializableString _rootValueSeparator;

    public JsonFactoryBuilder(JsonFactory jsonFactory) {
        super(jsonFactory);
        this._quoteChar = JsonFactory.DEFAULT_QUOTE_CHAR;
        this._characterEscapes = jsonFactory.getCharacterEscapes();
        this._rootValueSeparator = jsonFactory._rootValueSeparator;
        this._maximumNonEscapedChar = jsonFactory._maximumNonEscapedChar;
    }

    public JsonFactoryBuilder() {
        this._quoteChar = JsonFactory.DEFAULT_QUOTE_CHAR;
        this._rootValueSeparator = JsonFactory.DEFAULT_ROOT_VALUE_SEPARATOR;
        this._maximumNonEscapedChar = 0;
    }
}
