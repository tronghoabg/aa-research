package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class ygt<E> extends defpackage.ygw<E> {
    private final transient defpackage.ygw a;

    public ygt(defpackage.ygw ygwVar) {
        this.a = ygwVar;
    }

    @Override // defpackage.ygw, defpackage.ygm, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        return this.a.contains(obj);
    }

    @Override // defpackage.ygm
    public final boolean f() {
        return this.a.f();
    }

    @Override // java.util.List
    public final E get(int i) {
        defpackage.ysr.bs(i, size());
        return this.a.get((size() - 1) - i);
    }

    @Override // defpackage.ygw
    public final defpackage.ygw h() {
        return this.a;
    }

    @Override // defpackage.ygw
    /* JADX INFO: renamed from: i */
    public final defpackage.ygw subList(int i, int i2) {
        defpackage.ysr.bi(i, i2, size());
        return this.a.subList(size() - i2, size() - i).h();
    }

    @Override // defpackage.ygw, java.util.List
    public final int indexOf(java.lang.Object obj) {
        int iLastIndexOf = this.a.lastIndexOf(obj);
        if (iLastIndexOf >= 0) {
            return (size() - 1) - iLastIndexOf;
        }
        return -1;
    }

    @Override // defpackage.ygw, java.util.List
    public final int lastIndexOf(java.lang.Object obj) {
        int iIndexOf = this.a.indexOf(obj);
        if (iIndexOf >= 0) {
            return (size() - 1) - iIndexOf;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.size();
    }

    @Override // defpackage.ygw, java.util.List
    public final /* bridge */ /* synthetic */ java.util.List subList(int i, int i2) {
        return subList(i, i2);
    }

    @Override // defpackage.ygw, defpackage.ygm
    public java.lang.Object writeReplace() {
        return super.writeReplace();
    }
}
