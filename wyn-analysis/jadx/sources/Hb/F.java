package hb;

import java.util.AbstractMap;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* loaded from: classes4.dex */
public abstract class F implements Iterator {

    /* renamed from: b, reason: collision with root package name */
    public int f36246b;

    /* renamed from: c, reason: collision with root package name */
    public Map.Entry f36247c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AbstractMap f36249e;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36245a = 0;

    /* renamed from: d, reason: collision with root package name */
    public Map.Entry f36248d = null;

    public F(na.l lVar) {
        this.f36249e = lVar;
        this.f36247c = lVar.f40991f.f40979d;
        this.f36246b = lVar.f40990e;
    }

    public G a() {
        G g9 = (G) this.f36247c;
        H h10 = (H) this.f36249e;
        if (g9 == h10.f36262c) {
            throw new NoSuchElementException();
        }
        if (h10.f36264e != this.f36246b) {
            throw new ConcurrentModificationException();
        }
        this.f36247c = g9.f36253d;
        this.f36248d = g9;
        return g9;
    }

    public na.k b() {
        na.k kVar = (na.k) this.f36247c;
        na.l lVar = (na.l) this.f36249e;
        if (kVar == lVar.f40991f) {
            throw new NoSuchElementException();
        }
        if (lVar.f40990e != this.f36246b) {
            throw new ConcurrentModificationException();
        }
        this.f36247c = kVar.f40979d;
        this.f36248d = kVar;
        return kVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f36245a) {
            case 0:
                if (((G) this.f36247c) != ((H) this.f36249e).f36262c) {
                }
                break;
            default:
                if (((na.k) this.f36247c) != ((na.l) this.f36249e).f40991f) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public Object next() {
        switch (this.f36245a) {
            case 0:
                return a();
            default:
                return b();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f36245a) {
            case 0:
                G g9 = (G) this.f36248d;
                if (g9 == null) {
                    throw new IllegalStateException();
                }
                H h10 = (H) this.f36249e;
                h10.d(g9, true);
                this.f36248d = null;
                this.f36246b = h10.f36264e;
                return;
            default:
                na.k kVar = (na.k) this.f36248d;
                if (kVar == null) {
                    throw new IllegalStateException();
                }
                na.l lVar = (na.l) this.f36249e;
                lVar.d(kVar, true);
                this.f36248d = null;
                this.f36246b = lVar.f40990e;
                return;
        }
    }

    public F(H h10) {
        this.f36249e = h10;
        this.f36247c = h10.f36262c.f36253d;
        this.f36246b = h10.f36264e;
    }
}
