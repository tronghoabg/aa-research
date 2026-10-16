package h.m;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class s implements Iterator, h.g.b.a.a {

    /* renamed from: a, reason: collision with root package name */
    private int f48201a;

    /* renamed from: b, reason: collision with root package name */
    private final Iterator f48202b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f48203c;

    s(t tVar, int i2, byte[] bArr) {
        this.f48203c = i2;
        this.f48202b = tVar.f48204a.iterator();
        this.f48201a = tVar.f48205b;
    }

    private final void a() {
        while (this.f48201a > 0) {
            Iterator it = this.f48202b;
            if (!it.hasNext()) {
                return;
            }
            it.next();
            this.f48201a--;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f48203c == 0) {
            return this.f48201a > 0 && this.f48202b.hasNext();
        }
        a();
        return this.f48202b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f48203c != 0) {
            a();
            return this.f48202b.next();
        }
        int i2 = this.f48201a;
        if (i2 == 0) {
            throw new NoSuchElementException();
        }
        this.f48201a = i2 - 1;
        return this.f48202b.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.f48203c == 0) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    s(t tVar, int i2) {
        this.f48203c = i2;
        this.f48201a = tVar.f48205b;
        this.f48202b = tVar.f48204a.iterator();
    }
}
