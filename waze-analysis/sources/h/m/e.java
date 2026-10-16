package h.m;

import h.g.b.x;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class e implements Iterator, h.g.b.a.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ f f48174a;

    /* renamed from: b, reason: collision with root package name */
    private final Iterator f48175b;

    /* renamed from: c, reason: collision with root package name */
    private Iterator f48176c;

    /* renamed from: d, reason: collision with root package name */
    private int f48177d;

    e(f fVar) {
        this.f48174a = fVar;
        this.f48175b = fVar.f48178a.iterator();
    }

    private final boolean a() {
        Iterator it;
        Iterator it2 = this.f48176c;
        if (it2 != null && it2.hasNext()) {
            this.f48177d = 1;
            return true;
        }
        do {
            Iterator it3 = this.f48175b;
            if (!it3.hasNext()) {
                this.f48177d = 2;
                this.f48176c = null;
                return false;
            }
            f fVar = this.f48174a;
            it = (Iterator) fVar.f48180c.invoke(fVar.f48179b.invoke(it3.next()));
        } while (!it.hasNext());
        this.f48176c = it;
        this.f48177d = 1;
        return true;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i2 = this.f48177d;
        if (i2 == 1) {
            return true;
        }
        if (i2 == 2) {
            return false;
        }
        return a();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i2 = this.f48177d;
        if (i2 == 2) {
            throw new NoSuchElementException();
        }
        if (i2 == 0 && !a()) {
            throw new NoSuchElementException();
        }
        this.f48177d = 0;
        Iterator it = this.f48176c;
        x.c(it);
        return it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
