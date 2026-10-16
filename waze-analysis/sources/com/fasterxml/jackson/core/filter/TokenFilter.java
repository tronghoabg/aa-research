package com.fasterxml.jackson.core.filter;

import com.fasterxml.jackson.core.JsonParser;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class TokenFilter {
    public static final TokenFilter INCLUDE_ALL = new TokenFilter();

    /* compiled from: WazeSource */
    public enum Inclusion {
        ONLY_INCLUDE_ALL,
        INCLUDE_ALL_AND_PATH,
        INCLUDE_NON_NULL
    }

    protected TokenFilter() {
    }

    protected boolean _includeScalar() {
        return true;
    }

    public TokenFilter includeElement(int i2) {
        return this;
    }

    public TokenFilter includeProperty(String str) {
        return this;
    }

    public TokenFilter includeRootValue(int i2) {
        return this;
    }

    public boolean includeValue(JsonParser jsonParser) {
        return _includeScalar();
    }

    public String toString() {
        return this == INCLUDE_ALL ? "TokenFilter.INCLUDE_ALL" : super.toString();
    }
}
