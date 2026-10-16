package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: classes3.dex */
final class yia implements Iterator {
    final Set a;
    yic b;
    yic c;
    int d;
    final /* synthetic */ yif e;

    public yia(yif yifVar) {
        this.e = yifVar;
        this.a = yrm.r(yifVar.x().size());
        this.b = yifVar.a;
        this.d = yifVar.e;
    }

    private final void a() {
        if (this.e.e != this.d) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        a();
        return this.b != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        yic yicVar;
        a();
        yic yicVar2 = this.b;
        if (yicVar2 == null) {
            throw new NoSuchElementException();
        }
        this.c = yicVar2;
        Set set = this.a;
        set.add(yicVar2.getKey());
        do {
            yicVar = this.b.a;
            this.b = yicVar;
            if (yicVar == null) {
                break;
            }
        } while (!set.add(yicVar.getKey()));
        return this.c.getKey();
    }

    @Override // java.util.Iterator
    public final void remove() {
        a();
        woy.aa(this.c != null, "no calls to next() since the last call to remove()");
        Object key = this.c.getKey();
        yif yifVar = this.e;
        yifVar.d(key);
        this.c = null;
        this.d = yifVar.e;
    }
}
