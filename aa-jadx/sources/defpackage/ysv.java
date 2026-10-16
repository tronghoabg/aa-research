package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ysv<T> extends java.util.AbstractSet<T> {
    final int a;
    final /* synthetic */ defpackage.ysw b;

    public ysv(defpackage.ysw yswVar, int i) {
        this.b = yswVar;
        this.a = i;
    }

    final int a() {
        return this.b.c[this.a + 1];
    }

    final int b() {
        int i = this.a;
        if (i == -1) {
            return 0;
        }
        return this.b.c[i];
    }

    final java.lang.Object c(int i) {
        return this.b.b[b() + i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(java.lang.Object obj) {
        return java.util.Arrays.binarySearch(this.b.b, b(), a(), obj, this.a == -1 ? defpackage.ysw.a : defpackage.ysy.a) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator<T> iterator() {
        return new defpackage.ysu(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return a() - b();
    }
}
