package l8;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

/* renamed from: l8.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3422d implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40093a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Iterator f40094b;

    /* renamed from: c, reason: collision with root package name */
    public Object f40095c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f40096d;

    public C3422d(C3431m c3431m) {
        this.f40096d = c3431m;
        Collection collection = c3431m.f40137b;
        this.f40095c = collection;
        this.f40094b = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    public void a() {
        C3431m c3431m = (C3431m) this.f40096d;
        c3431m.b();
        if (c3431m.f40137b != ((Collection) this.f40095c)) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f40093a) {
            case 0:
                break;
            case 1:
                break;
            default:
                a();
                break;
        }
        return this.f40094b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f40093a) {
            case 0:
                Map.Entry entry = (Map.Entry) this.f40094b.next();
                this.f40095c = (Collection) entry.getValue();
                return ((C3423e) this.f40096d).a(entry);
            case 1:
                Map.Entry entry2 = (Map.Entry) this.f40094b.next();
                this.f40095c = entry2;
                return entry2.getKey();
            default:
                a();
                return this.f40094b.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f40093a) {
            case 0:
                Fe.e.w("no calls to next() since the last call to remove()", ((Collection) this.f40095c) != null);
                this.f40094b.remove();
                C3423e c3423e = (C3423e) this.f40096d;
                c3423e.f40100d.f40082e -= ((Collection) this.f40095c).size();
                ((Collection) this.f40095c).clear();
                this.f40095c = null;
                break;
            case 1:
                Fe.e.w("no calls to next() since the last call to remove()", ((Map.Entry) this.f40095c) != null);
                Collection collection = (Collection) ((Map.Entry) this.f40095c).getValue();
                this.f40094b.remove();
                C3424f c3424f = (C3424f) this.f40096d;
                c3424f.f40105c.f40082e -= collection.size();
                collection.clear();
                this.f40095c = null;
                break;
            default:
                this.f40094b.remove();
                C3431m c3431m = (C3431m) this.f40096d;
                a0 a0Var = c3431m.f40140e;
                a0Var.f40082e--;
                c3431m.c();
                break;
        }
    }

    public C3422d(C3431m c3431m, ListIterator listIterator) {
        this.f40096d = c3431m;
        this.f40095c = c3431m.f40137b;
        this.f40094b = listIterator;
    }

    public C3422d(C3424f c3424f, Iterator it) {
        this.f40094b = it;
        this.f40096d = c3424f;
    }

    public C3422d(C3423e c3423e) {
        this.f40096d = c3423e;
        this.f40094b = c3423e.f40099c.entrySet().iterator();
    }
}
