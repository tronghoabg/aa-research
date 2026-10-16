package com.google.v;

import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class eq<K> implements Map.Entry<K, Object> {

    /* renamed from: a, reason: collision with root package name */
    private final Map.Entry f12913a;

    public final es a() {
        return (es) this.f12913a.getValue();
    }

    @Override // java.util.Map.Entry
    public final K getKey() {
        return (K) this.f12913a.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        es esVar = (es) this.f12913a.getValue();
        if (esVar == null) {
            return null;
        }
        return esVar.c();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (!(obj instanceof fi)) {
            throw new IllegalArgumentException("Lazy field only supports MessageLite values.");
        }
        Map.Entry entry = this.f12913a;
        fi fiVar = ((es) entry.getValue()).f12915a;
        entry.setValue(new es((fi) obj));
        return fiVar;
    }
}
