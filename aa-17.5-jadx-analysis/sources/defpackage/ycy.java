package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
final class ycy implements Iterator {
    int a;
    int b;
    int c = -1;
    final /* synthetic */ ycz d;

    public ycy(ycz yczVar) {
        this.d = yczVar;
        this.a = yczVar.b;
        this.b = yczVar.a();
    }

    private final void a() {
        if (this.d.b != this.a) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        a();
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.b;
        this.c = i;
        ycz yczVar = this.d;
        Object objC = yczVar.c(i);
        this.b = yczVar.b(this.b);
        return objC;
    }

    @Override // java.util.Iterator
    public final void remove() {
        a();
        woy.aa(this.c >= 0, "no calls to next() since the last call to remove()");
        this.a += 32;
        int i = this.c;
        ycz yczVar = this.d;
        yczVar.remove(yczVar.c(i));
        this.b--;
        this.c = -1;
    }
}
