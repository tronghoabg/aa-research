package com.google.d.d;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class fm extends ci {

    /* renamed from: a, reason: collision with root package name */
    final transient Object f7624a;

    fm(Object obj) {
        com.google.d.b.an.B(obj);
        this.f7624a = obj;
    }

    @Override // com.google.d.d.bh, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f7624a.equals(obj);
    }

    @Override // com.google.d.d.bh
    final int d(Object[] objArr, int i2) {
        objArr[i2] = this.f7624a;
        return i2 + 1;
    }

    @Override // com.google.d.d.ci, com.google.d.d.bh
    public final bn g() {
        return bn.q(this.f7624a);
    }

    @Override // com.google.d.d.ci, com.google.d.d.bh, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: h */
    public final fu listIterator() {
        return new db(this.f7624a);
    }

    @Override // com.google.d.d.ci, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f7624a.hashCode();
    }

    @Override // com.google.d.d.bh
    final boolean i() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return "[" + this.f7624a.toString() + "]";
    }

    @Override // com.google.d.d.ci, com.google.d.d.bh
    Object writeReplace() {
        return super.writeReplace();
    }
}
