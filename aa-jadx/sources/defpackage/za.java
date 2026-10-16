package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class za implements java.util.Iterator, java.util.Map.Entry {
    int a;
    int b = -1;
    boolean c;
    final /* synthetic */ defpackage.zd d;

    public za(defpackage.zd zdVar) {
        this.d = zdVar;
        this.a = zdVar.d - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(java.lang.Object obj) {
        if (!this.c) {
            throw new java.lang.IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        if (!(obj instanceof java.util.Map.Entry)) {
            return false;
        }
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        java.lang.Object key = entry.getKey();
        defpackage.zd zdVar = this.d;
        return defpackage.afga.f(key, zdVar.d(this.b)) && defpackage.afga.f(entry.getValue(), zdVar.g(this.b));
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getKey() {
        if (this.c) {
            return this.d.d(this.b);
        }
        throw new java.lang.IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getValue() {
        if (this.c) {
            return this.d.g(this.b);
        }
        throw new java.lang.IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.a;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.c) {
            throw new java.lang.IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        defpackage.zd zdVar = this.d;
        java.lang.Object objD = zdVar.d(this.b);
        java.lang.Object objG = zdVar.g(this.b);
        return (objD == null ? 0 : objD.hashCode()) ^ (objG != null ? objG.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ java.lang.Object next() {
        if (!hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        this.b++;
        this.c = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.c) {
            throw new java.lang.IllegalStateException();
        }
        this.d.e(this.b);
        this.b--;
        this.a--;
        this.c = false;
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object setValue(java.lang.Object obj) {
        if (this.c) {
            return this.d.f(this.b, obj);
        }
        throw new java.lang.IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final java.lang.String toString() {
        return java.lang.String.valueOf(getKey()) + "=" + java.lang.String.valueOf(getValue());
    }
}
