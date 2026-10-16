package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class yew implements Iterator {
    final /* synthetic */ yex a;
    private int b;
    private int c;
    private int d;
    private int e;

    public yew(yex yexVar) {
        this.a = yexVar;
        yey yeyVar = yexVar.b;
        this.b = yeyVar.e;
        this.c = -1;
        this.d = yeyVar.d;
        this.e = yeyVar.c;
    }

    private final void a() {
        if (this.a.b.d != this.d) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        a();
        return this.b != -2 && this.e > 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        yex yexVar = this.a;
        Object objA = yexVar.a(this.b);
        int i = this.b;
        this.c = i;
        this.b = yexVar.b.f[i];
        this.e--;
        return objA;
    }

    @Override // java.util.Iterator
    public final void remove() {
        a();
        woy.aa(this.c != -1, "no calls to next() since the last call to remove()");
        int i = this.c;
        yey yeyVar = this.a.b;
        yeyVar.g(i, wub.x(yeyVar.a[i]));
        if (this.b == yeyVar.c) {
            this.b = this.c;
        }
        this.c = -1;
        this.d = yeyVar.d;
    }
}
