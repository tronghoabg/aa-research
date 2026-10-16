package defpackage;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
class ybf implements Iterator {
    final Iterator a;
    final Collection b;
    final /* synthetic */ ybg c;

    public ybf(ybg ybgVar) {
        this.c = ybgVar;
        this.b = ybgVar.b;
        Collection collection = ybgVar.b;
        this.a = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    final void a() {
        ybg ybgVar = this.c;
        ybgVar.b();
        if (ybgVar.b != this.b) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        a();
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        a();
        return this.a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.a.remove();
        ybg ybgVar = this.c;
        ybm ybmVar = ybgVar.e;
        ybmVar.b--;
        ybgVar.c();
    }

    public ybf(ybg ybgVar, Iterator it) {
        this.c = ybgVar;
        this.b = ybgVar.b;
        this.a = it;
    }
}
