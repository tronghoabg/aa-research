package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class ycz extends java.util.AbstractCollection {
    final /* synthetic */ defpackage.yda a;

    public ycz(defpackage.yda ydaVar) {
        this.a = ydaVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.a.q();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        return this.a.z(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
        return this.a.m();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.a.h();
    }
}
