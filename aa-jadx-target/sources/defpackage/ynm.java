package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ynm extends defpackage.yns {
    final /* synthetic */ java.util.Set a;
    final /* synthetic */ java.util.Set b;

    public ynm(java.util.Set set, java.util.Set set2) {
        this.a = set;
        this.b = set2;
    }

    @Override // defpackage.yns
    public final int a() {
        return defpackage.ysr.cO(((long) d(this.a)) + ((long) d(this.b)));
    }

    @Override // defpackage.yns
    public final int b() {
        return java.lang.Math.max(e(this.a), e(this.b));
    }

    @Override // defpackage.yns, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: c */
    public final defpackage.yot iterator() {
        return new defpackage.ynl(this.a, this.b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(java.lang.Object obj) {
        return this.a.contains(obj) || this.b.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.a.isEmpty() && this.b.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        java.util.Set set = this.b;
        java.util.Set set2 = this.a;
        int size = set2.size();
        java.util.Iterator it = set.iterator();
        while (it.hasNext()) {
            if (!set2.contains(it.next())) {
                size++;
            }
        }
        return size;
    }
}
