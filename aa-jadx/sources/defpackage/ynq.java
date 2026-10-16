package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ynq extends defpackage.yns {
    final /* synthetic */ java.util.Set a;
    final /* synthetic */ java.util.Set b;

    public ynq(java.util.Set set, java.util.Set set2) {
        this.a = set;
        this.b = set2;
    }

    @Override // defpackage.yns
    public final int a() {
        return d(this.a);
    }

    @Override // defpackage.yns
    public final int b() {
        return java.lang.Math.max(e(this.a) - d(this.b), 0);
    }

    @Override // defpackage.yns, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: c */
    public final defpackage.yot iterator() {
        return new defpackage.ynp(this.a, this.b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(java.lang.Object obj) {
        return this.a.contains(obj) && !this.b.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.b.containsAll(this.a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        java.util.Iterator it = this.a.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (!this.b.contains(it.next())) {
                i++;
            }
        }
        return i;
    }
}
