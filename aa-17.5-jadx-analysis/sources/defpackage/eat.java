package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class eat<T> implements Iterator<T>, afgc {
    private final afec a;
    private final List b = new ArrayList();
    private Iterator c;

    public eat(Iterator it, afec afecVar) {
        this.a = afecVar;
        this.c = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c.hasNext();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Iterator] */
    @Override // java.util.Iterator
    public final T next() {
        T t = (T) this.c.next();
        ?? Invoke = this.a.invoke(t);
        if (Invoke != 0 && Invoke.hasNext()) {
            this.b.add(this.c);
            this.c = Invoke;
            return t;
        }
        while (!this.c.hasNext()) {
            List list = this.b;
            if (list.isEmpty()) {
                break;
            }
            this.c = (Iterator) woy.bK(list);
            woy.bu(list);
        }
        return t;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
