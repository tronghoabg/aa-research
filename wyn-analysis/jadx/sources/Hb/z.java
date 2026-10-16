package hb;

import java.util.Iterator;

/* loaded from: classes4.dex */
public final class z implements Iterator, Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public final v f36377a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f36378b;

    /* renamed from: c, reason: collision with root package name */
    public int f36379c;

    public z(v vVar, Object[] objArr, int i5) {
        this.f36377a = vVar;
        this.f36378b = objArr;
        this.f36379c = i5;
    }

    public final Object clone() {
        return new z(this.f36377a, this.f36378b, this.f36379c);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f36379c < this.f36378b.length;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i5 = this.f36379c;
        this.f36379c = i5 + 1;
        return this.f36378b[i5];
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
