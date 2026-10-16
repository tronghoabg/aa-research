package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ulr implements java.util.Iterator {
    private final java.util.List a;
    private int b = 0;

    public ulr(java.util.List list) {
        this.a = list;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final defpackage.uky next() {
        int i = this.b;
        this.b = i + 1;
        return (defpackage.uky) this.a.get(i);
    }

    public final defpackage.uky b() {
        return (defpackage.uky) this.a.get(this.b);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.a.size();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException("remove() not supported");
    }
}
