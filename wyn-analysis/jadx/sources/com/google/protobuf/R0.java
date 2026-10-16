package com.google.protobuf;

import java.util.Map;

/* loaded from: classes4.dex */
public final class R0 implements Map.Entry {

    /* renamed from: a, reason: collision with root package name */
    public Map.Entry f27620a;

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f27620a.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        LazyField lazyField = (LazyField) this.f27620a.getValue();
        if (lazyField == null) {
            return null;
        }
        return lazyField.getValue();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj instanceof MessageLite) {
            return ((LazyField) this.f27620a.getValue()).setValue((MessageLite) obj);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
}
