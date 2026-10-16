package Af;

import java.util.Iterator;
import uf.InterfaceC4291a;

/* loaded from: classes5.dex */
public final class y implements Iterator, InterfaceC4291a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1338a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Iterator f1339b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1340c;

    public y(Nd.e eVar) {
        this.f1340c = eVar;
        this.f1339b = eVar.f8660a.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f1338a) {
        }
        return this.f1339b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f1338a) {
            case 0:
                return ((z) this.f1340c).f1342b.invoke(this.f1339b.next());
            default:
                return ((Nd.e) this.f1340c).f8661b.invoke(this.f1339b.next());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f1338a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                this.f1339b.remove();
                return;
        }
    }

    public y(z zVar) {
        this.f1340c = zVar;
        this.f1339b = zVar.f1341a.iterator();
    }
}
