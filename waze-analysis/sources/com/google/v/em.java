package com.google.v;

import java.util.AbstractList;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class em<T> extends AbstractList<T> {

    /* renamed from: a, reason: collision with root package name */
    private final ek f12910a;

    /* renamed from: b, reason: collision with root package name */
    private final el f12911b;

    public em(ek ekVar, el elVar) {
        this.f12910a = ekVar;
        this.f12911b = elVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final T get(int i2) {
        return (T) this.f12911b.convert(this.f12910a.d(i2));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f12910a.size();
    }
}
