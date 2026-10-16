package com.waze.bl.d.a;

import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class i<T> extends h.a.g<T> {

    /* renamed from: a, reason: collision with root package name */
    private final List f17070a;

    /* renamed from: b, reason: collision with root package name */
    private final int f17071b;

    public i(List list, int i2) {
        x.f(list, "source");
        this.f17070a = list;
        this.f17071b = i2;
    }

    @Override // h.a.g, java.util.List
    public final T get(int i2) {
        int i3 = this.f17071b;
        List list = this.f17070a;
        return i2 < i3 ? (T) list.get(i2) : (T) list.get(i2 + 1);
    }

    @Override // h.a.g, h.a.a
    public final int getSize() {
        List list = this.f17070a;
        int size = list.size();
        int i2 = this.f17071b;
        return (i2 < 0 || i2 >= size) ? list.size() : list.size() - 1;
    }
}
