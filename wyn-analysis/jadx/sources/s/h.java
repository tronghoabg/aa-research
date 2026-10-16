package S;

import i0.H;
import i0.J;
import java.util.Iterator;
import java.util.Map;
import uf.InterfaceC4291a;

/* loaded from: classes.dex */
public final class h implements Iterator, InterfaceC4291a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10817a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Iterator f10818b;

    public h(e eVar) {
        o[] oVarArr = new o[8];
        for (int i5 = 0; i5 < 8; i5++) {
            oVarArr[i5] = new q(this);
        }
        this.f10818b = new f(eVar, oVarArr);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f10817a) {
            case 0:
                return ((f) this.f10818b).f10804c;
            default:
                return this.f10818b.hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f10817a) {
            case 0:
                return (Map.Entry) ((f) this.f10818b).next();
            default:
                return (J) this.f10818b.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f10817a) {
            case 0:
                ((f) this.f10818b).remove();
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public h(H h10) {
        this.f10818b = h10.f36529j.iterator();
    }
}
