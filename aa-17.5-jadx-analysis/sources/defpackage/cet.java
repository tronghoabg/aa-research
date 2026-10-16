package defpackage;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.ConcurrentModificationException;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class cet<T> implements ListIterator<T>, afgc {
    private final SnapshotStateList a;
    private int b;
    private int c = -1;
    private List d;
    private int e;

    public cet(SnapshotStateList snapshotStateList, int i) {
        this.a = snapshotStateList;
        this.b = i - 1;
        this.d = snapshotStateList.e();
        this.e = ceo.a(snapshotStateList);
    }

    private final void a() {
        if (ceo.a(this.a) != this.e) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public final void add(T t) {
        a();
        int i = this.b + 1;
        SnapshotStateList snapshotStateList = this.a;
        snapshotStateList.add(i, t);
        this.c = -1;
        this.b++;
        this.d = snapshotStateList.e();
        this.e = ceo.a(snapshotStateList);
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
        ceo.b(i, this.d.size());
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
        ceo.b(this.b, this.d.size());
        int i = this.b;
        this.c = i;
        this.b--;
        return (T) this.d.get(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.b;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        a();
        SnapshotStateList snapshotStateList = this.a;
        snapshotStateList.b(this.c);
        this.b--;
        this.c = -1;
        this.d = snapshotStateList.e();
        this.e = ceo.a(snapshotStateList);
    }

    @Override // java.util.ListIterator
    public final void set(T t) {
        a();
        int i = this.c;
        if (i < 0) {
            throw new IllegalStateException("Cannot call set before the first call to next() or previous() or immediately after a call to add() or remove()");
        }
        SnapshotStateList snapshotStateList = this.a;
        snapshotStateList.set(i, t);
        this.d = snapshotStateList.e();
        this.e = ceo.a(snapshotStateList);
    }
}
