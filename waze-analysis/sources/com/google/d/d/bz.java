package com.google.d.d;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class bz extends bh {
    private static final long serialVersionUID = 0;

    /* renamed from: a, reason: collision with root package name */
    private final transient ca f7481a;

    bz(ca caVar) {
        this.f7481a = caVar;
    }

    @Override // com.google.d.d.bh, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f7481a.E(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.d.d.bh
    final int d(Object[] objArr, int i2) {
        fu fuVarListIterator = this.f7481a.map.values().listIterator();
        while (fuVarListIterator.hasNext()) {
            i2 = ((bh) fuVarListIterator.next()).d(objArr, i2);
        }
        return i2;
    }

    @Override // com.google.d.d.bh, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: h */
    public final fu listIterator() {
        return new bw(this.f7481a);
    }

    @Override // com.google.d.d.bh
    final boolean i() {
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f7481a.size;
    }

    @Override // com.google.d.d.bh
    Object writeReplace() {
        return super.writeReplace();
    }
}
