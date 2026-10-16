package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonProcessingException;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public abstract class DatabindException extends JsonProcessingException {
    private static final long serialVersionUID = 3;

    protected DatabindException(String str, JsonLocation jsonLocation) {
        this(str, jsonLocation, null);
    }

    public abstract void prependPath(Object obj, int i2);

    public abstract void prependPath(Object obj, String str);

    protected DatabindException(String str) {
        super(str);
    }

    protected DatabindException(String str, JsonLocation jsonLocation, Throwable th) {
        super(str, jsonLocation, th);
    }

    protected DatabindException(String str, Throwable th) {
        this(str, null, th);
    }
}
