package com.fasterxml.jackson.core.filter;

import com.fasterxml.jackson.core.JsonPointer;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class JsonPointerBasedFilter extends TokenFilter {
    protected final boolean _includeAllElements;
    protected final JsonPointer _pathToMatch;

    public JsonPointerBasedFilter(String str) {
        this(JsonPointer.compile(str), false);
    }

    @Override // com.fasterxml.jackson.core.filter.TokenFilter
    protected boolean _includeScalar() {
        return this._pathToMatch.matches();
    }

    protected JsonPointerBasedFilter construct(JsonPointer jsonPointer, boolean z) {
        return new JsonPointerBasedFilter(jsonPointer, z);
    }

    @Override // com.fasterxml.jackson.core.filter.TokenFilter
    public TokenFilter includeElement(int i2) {
        JsonPointer jsonPointerMatchElement = (!this._includeAllElements || this._pathToMatch.mayMatchElement()) ? this._pathToMatch.matchElement(i2) : this._pathToMatch.tail();
        if (jsonPointerMatchElement == null) {
            return null;
        }
        return jsonPointerMatchElement.matches() ? TokenFilter.INCLUDE_ALL : construct(jsonPointerMatchElement, this._includeAllElements);
    }

    @Override // com.fasterxml.jackson.core.filter.TokenFilter
    public TokenFilter includeProperty(String str) {
        JsonPointer jsonPointerMatchProperty = this._pathToMatch.matchProperty(str);
        if (jsonPointerMatchProperty == null) {
            return null;
        }
        return jsonPointerMatchProperty.matches() ? TokenFilter.INCLUDE_ALL : construct(jsonPointerMatchProperty, this._includeAllElements);
    }

    @Override // com.fasterxml.jackson.core.filter.TokenFilter
    public String toString() {
        return "[JsonPointerFilter at: " + String.valueOf(this._pathToMatch) + "]";
    }

    public JsonPointerBasedFilter(JsonPointer jsonPointer) {
        this(jsonPointer, false);
    }

    public JsonPointerBasedFilter(JsonPointer jsonPointer, boolean z) {
        this._pathToMatch = jsonPointer;
        this._includeAllElements = z;
    }
}
