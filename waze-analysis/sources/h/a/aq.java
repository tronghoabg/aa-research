package h.a;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class aq<T> extends g<T> {

    /* renamed from: a, reason: collision with root package name */
    private final List f47983a;

    public aq(List list) {
        h.g.b.x.f(list, "delegate");
        this.f47983a = list;
    }

    @Override // h.a.g, java.util.List
    public final T get(int i2) {
        return (T) this.f47983a.get(i.A(this, i2));
    }

    @Override // h.a.g, h.a.a
    public final int getSize() {
        return this.f47983a.size();
    }

    @Override // h.a.g, h.a.a, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<T> iterator() {
        return listIterator(0);
    }

    @Override // h.a.g, java.util.List
    public final ListIterator<T> listIterator(int i2) {
        return new ap(this, i2);
    }

    @Override // h.a.g, java.util.List
    public final ListIterator<T> listIterator() {
        return listIterator(0);
    }
}
