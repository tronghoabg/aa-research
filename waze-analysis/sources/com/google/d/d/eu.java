package com.google.d.d;

import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class eu extends ci {

    /* renamed from: a, reason: collision with root package name */
    private final transient bs f7586a;

    /* renamed from: b, reason: collision with root package name */
    private final transient Object[] f7587b;

    /* renamed from: c, reason: collision with root package name */
    private final transient int f7588c;

    eu(bs bsVar, Object[] objArr, int i2) {
        this.f7586a = bsVar;
        this.f7587b = objArr;
        this.f7588c = i2;
    }

    @Override // com.google.d.d.bh, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f7586a.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.d.d.bh
    final int d(Object[] objArr, int i2) {
        return g().d(objArr, i2);
    }

    @Override // com.google.d.d.ci, com.google.d.d.bh, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: h */
    public final fu listIterator() {
        return g().iterator();
    }

    @Override // com.google.d.d.bh
    final boolean i() {
        return true;
    }

    @Override // com.google.d.d.ci
    final bn k() {
        return new et(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f7588c;
    }

    @Override // com.google.d.d.ci, com.google.d.d.bh
    Object writeReplace() {
        return super.writeReplace();
    }
}
