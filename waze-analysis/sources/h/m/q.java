package h.m;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class q implements Iterator, h.g.b.a.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ r f48195a;

    /* renamed from: b, reason: collision with root package name */
    private final Iterator f48196b;

    /* renamed from: c, reason: collision with root package name */
    private int f48197c;

    q(r rVar) {
        this.f48195a = rVar;
        this.f48196b = rVar.f48198a.iterator();
    }

    private final void a() {
        while (this.f48197c < this.f48195a.f48199b) {
            Iterator it = this.f48196b;
            if (!it.hasNext()) {
                return;
            }
            it.next();
            this.f48197c++;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        a();
        return this.f48197c < this.f48195a.f48200c && this.f48196b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        a();
        r rVar = this.f48195a;
        int i2 = this.f48197c;
        if (i2 >= rVar.f48200c) {
            throw new NoSuchElementException();
        }
        this.f48197c = i2 + 1;
        return this.f48196b.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
