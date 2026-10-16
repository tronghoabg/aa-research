package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.util.AccessPattern;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public interface NullValueProvider {

    /* compiled from: WazeSource */
    /* renamed from: com.fasterxml.jackson.databind.deser.NullValueProvider$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
    }

    Object getAbsentValue(DeserializationContext deserializationContext);

    AccessPattern getNullAccessPattern();

    Object getNullValue(DeserializationContext deserializationContext);
}
