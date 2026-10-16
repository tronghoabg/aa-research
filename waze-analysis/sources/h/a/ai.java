package h.a;

import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ai implements Iterator, h.g.b.a.a {

    /* renamed from: a, reason: collision with root package name */
    private final Iterator f47973a;

    /* renamed from: b, reason: collision with root package name */
    private int f47974b;

    public ai(Iterator it) {
        h.g.b.x.f(it, "iterator");
        this.f47973a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f47973a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        int i2 = this.f47974b;
        this.f47974b = i2 + 1;
        if (i2 < 0) {
            i.p();
        }
        return new ag(i2, this.f47973a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
