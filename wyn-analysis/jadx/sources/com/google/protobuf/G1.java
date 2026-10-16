package com.google.protobuf;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public final class G1 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public int f27569a;

    /* renamed from: b, reason: collision with root package name */
    public Iterator f27570b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ F1 f27571c;

    public G1(F1 f1) {
        this.f27571c = f1;
        this.f27569a = f1.f27557b.size();
    }

    public final Iterator a() {
        if (this.f27570b == null) {
            this.f27570b = this.f27571c.f27561f.entrySet().iterator();
        }
        return this.f27570b;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i5 = this.f27569a;
        return (i5 > 0 && i5 <= this.f27571c.f27557b.size()) || a().hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (a().hasNext()) {
            return (Map.Entry) a().next();
        }
        List list = this.f27571c.f27557b;
        int i5 = this.f27569a - 1;
        this.f27569a = i5;
        return (Map.Entry) list.get(i5);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
