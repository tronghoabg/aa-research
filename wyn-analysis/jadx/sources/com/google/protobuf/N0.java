package com.google.protobuf;

import com.google.protobuf.Internal;
import java.util.Map;

/* loaded from: classes4.dex */
public final class N0 implements Map.Entry {

    /* renamed from: a, reason: collision with root package name */
    public final Map.Entry f27595a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Internal.MapAdapter f27596b;

    public N0(Internal.MapAdapter mapAdapter, Map.Entry entry) {
        this.f27596b = mapAdapter;
        this.f27595a = entry;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof Map.Entry) && this.f27595a.getKey().equals(((Map.Entry) obj).getKey()) && getValue().equals(getValue());
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f27595a.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f27596b.valueConverter.doForward(this.f27595a.getValue());
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f27595a.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Internal.MapAdapter mapAdapter = this.f27596b;
        Object value = this.f27595a.setValue(mapAdapter.valueConverter.doBackward(obj));
        if (value == null) {
            return null;
        }
        return mapAdapter.valueConverter.doForward(value);
    }
}
