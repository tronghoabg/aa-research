package com.google.d.d;

import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class by extends bh {
    private static final long serialVersionUID = 0;

    /* renamed from: a, reason: collision with root package name */
    final ca f7480a;

    by(ca caVar) {
        this.f7480a = caVar;
    }

    @Override // com.google.d.d.bh, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return this.f7480a.D(entry.getKey(), entry.getValue());
    }

    @Override // com.google.d.d.bh, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: h */
    public final fu listIterator() {
        return new bv(this.f7480a);
    }

    @Override // com.google.d.d.bh
    final boolean i() {
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f7480a.size;
    }

    @Override // com.google.d.d.bh
    Object writeReplace() {
        return super.writeReplace();
    }
}
