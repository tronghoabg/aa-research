package defpackage;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
final class ekt implements Iterator {
    final /* synthetic */ ekv a;
    private int b = -1;
    private boolean c;
    private Iterator d;

    public ekt(ekv ekvVar) {
        this.a = ekvVar;
    }

    private final Iterator a() {
        Iterator it = this.d;
        if (it != null) {
            return it;
        }
        Iterator it2 = this.a.c.entrySet().iterator();
        this.d = it2;
        return it2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.b + 1;
        ekv ekvVar = this.a;
        if (i >= ekvVar.b) {
            return !ekvVar.c.isEmpty() && a().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        this.c = true;
        int i = this.b + 1;
        this.b = i;
        ekv ekvVar = this.a;
        return i < ekvVar.b ? (eks) ekvVar.a[i] : (Map.Entry) a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.c) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.c = false;
        ekv ekvVar = this.a;
        ekvVar.e();
        int i = this.b;
        if (i >= ekvVar.b) {
            a().remove();
        } else {
            this.b = i - 1;
            ekvVar.c(i);
        }
    }
}
