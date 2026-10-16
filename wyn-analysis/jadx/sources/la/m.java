package la;

import java.util.ArrayList;
import java.util.Iterator;
import ka.AbstractC3256n;

/* loaded from: classes4.dex */
public final class m extends o implements Iterable {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f40206a = new ArrayList();

    @Override // la.o
    public final boolean a() {
        return d().a();
    }

    @Override // la.o
    public final String c() {
        return d().c();
    }

    public final o d() {
        ArrayList arrayList = this.f40206a;
        int size = arrayList.size();
        if (size == 1) {
            return (o) arrayList.get(0);
        }
        throw new IllegalStateException(AbstractC3256n.g(size, "Array must have size 1, but has size "));
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof m) && ((m) obj).f40206a.equals(this.f40206a);
        }
        return true;
    }

    public final int hashCode() {
        return this.f40206a.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f40206a.iterator();
    }
}
