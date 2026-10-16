package l8;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: l8.t, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3438t implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public int f40160a;

    /* renamed from: b, reason: collision with root package name */
    public int f40161b;

    /* renamed from: c, reason: collision with root package name */
    public int f40162c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C3441w f40163d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f40164e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C3441w f40165f;

    public C3438t(C3441w c3441w, int i5) {
        this.f40164e = i5;
        this.f40165f = c3441w;
        this.f40163d = c3441w;
        this.f40160a = c3441w.f40176e;
        this.f40161b = c3441w.isEmpty() ? -1 : 0;
        this.f40162c = -1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f40161b >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object c3440v;
        C3441w c3441w = this.f40163d;
        if (c3441w.f40176e != this.f40160a) {
            throw new ConcurrentModificationException();
        }
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i5 = this.f40161b;
        this.f40162c = i5;
        switch (this.f40164e) {
            case 0:
                c3440v = this.f40165f.k()[i5];
                break;
            case 1:
                c3440v = new C3440v(this.f40165f, i5);
                break;
            default:
                c3440v = this.f40165f.l()[i5];
                break;
        }
        int i10 = this.f40161b + 1;
        if (i10 >= c3441w.f40177f) {
            i10 = -1;
        }
        this.f40161b = i10;
        return c3440v;
    }

    @Override // java.util.Iterator
    public final void remove() {
        C3441w c3441w = this.f40163d;
        if (c3441w.f40176e != this.f40160a) {
            throw new ConcurrentModificationException();
        }
        Fe.e.w("no calls to next() since the last call to remove()", this.f40162c >= 0);
        this.f40160a += 32;
        c3441w.remove(c3441w.k()[this.f40162c]);
        this.f40161b--;
        this.f40162c = -1;
    }
}
