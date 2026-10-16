package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class cfa<T> implements java.util.ListIterator<T>, defpackage.afhc {
    private final androidx.compose.runtime.snapshots.SnapshotStateList a;
    private int b;
    private int c = -1;
    private java.util.List d;
    private int e;

    public cfa(androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList, int i) {
        this.a = snapshotStateList;
        this.b = i - 1;
        this.d = snapshotStateList.e();
        this.e = defpackage.cev.a(snapshotStateList);
    }

    private final void a() {
        if (defpackage.cev.a(this.a) != this.e) {
            throw new java.util.ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public final void add(T t) {
        a();
        int i = this.b + 1;
        androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList = this.a;
        snapshotStateList.add(i, t);
        this.c = -1;
        this.b++;
        this.d = snapshotStateList.e();
        this.e = defpackage.cev.a(snapshotStateList);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.d.size() + (-1);
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.b >= 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final T next() {
        a();
        int i = this.b + 1;
        this.c = i;
        defpackage.cev.b(i, this.d.size());
        T t = (T) this.d.get(i);
        this.b = i;
        return t;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.b + 1;
    }

    @Override // java.util.ListIterator
    public final T previous() {
        a();
        defpackage.cev.b(this.b, this.d.size());
        int i = this.b;
        this.c = i;
        T t = (T) this.d.get(i);
        this.b--;
        return t;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.b;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        a();
        androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList = this.a;
        snapshotStateList.b(this.c);
        this.b--;
        this.c = -1;
        this.d = snapshotStateList.e();
        this.e = defpackage.cev.a(snapshotStateList);
    }

    @Override // java.util.ListIterator
    public final void set(T t) {
        a();
        int i = this.c;
        if (i < 0) {
            throw new java.lang.IllegalStateException("Cannot call set before the first call to next() or previous() or immediately after a call to add() or remove()");
        }
        androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList = this.a;
        snapshotStateList.set(i, t);
        this.d = snapshotStateList.e();
        this.e = defpackage.cev.a(snapshotStateList);
    }
}
