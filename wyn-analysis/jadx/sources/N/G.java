package N;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import uf.InterfaceC4291a;

/* loaded from: classes.dex */
public final class G implements Iterator, InterfaceC4291a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7689a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final w0 f7690b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7691c;

    /* renamed from: d, reason: collision with root package name */
    public int f7692d;

    /* renamed from: e, reason: collision with root package name */
    public int f7693e;

    public G(w0 w0Var, int i5, int i10) {
        this.f7690b = w0Var;
        this.f7691c = i10;
        this.f7692d = i5;
        this.f7693e = w0Var.f7950g;
        if (w0Var.f7949f) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f7689a) {
            case 0:
                return this.f7692d < this.f7691c;
            default:
                throw null;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f7689a) {
            case 0:
                w0 w0Var = this.f7690b;
                int i5 = w0Var.f7950g;
                int i10 = this.f7693e;
                if (i5 != i10) {
                    throw new ConcurrentModificationException();
                }
                int i11 = this.f7692d;
                this.f7692d = C0718d.j(i11, w0Var.f7944a) + i11;
                return new x0(w0Var, i11, i10);
            default:
                throw null;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f7689a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public G(w0 w0Var, int i5, H h10, C0718d c0718d) {
        this.f7690b = w0Var;
        this.f7691c = i5;
        this.f7692d = w0Var.f7950g;
    }
}
