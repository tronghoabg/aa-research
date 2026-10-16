package x;

import java.util.Iterator;
import java.util.NoSuchElementException;
import uf.InterfaceC4291a;

/* renamed from: x.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4408a implements Iterator, InterfaceC4291a {

    /* renamed from: a, reason: collision with root package name */
    public int f47490a;

    /* renamed from: b, reason: collision with root package name */
    public int f47491b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f47492c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f47493d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f47494e;

    public C4408a(int i5) {
        this.f47490a = i5;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f47491b < this.f47490a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object objG;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i5 = this.f47491b;
        switch (this.f47493d) {
            case 0:
                objG = ((C4412e) this.f47494e).g(i5);
                break;
            case 1:
                objG = ((C4412e) this.f47494e).k(i5);
                break;
            default:
                objG = ((C4413f) this.f47494e).f47505b[i5];
                break;
        }
        this.f47491b++;
        this.f47492c = true;
        return objG;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f47492c) {
            throw new IllegalStateException("Call next() before removing an element.");
        }
        int i5 = this.f47491b - 1;
        this.f47491b = i5;
        switch (this.f47493d) {
            case 0:
                ((C4412e) this.f47494e).i(i5);
                break;
            case 1:
                ((C4412e) this.f47494e).i(i5);
                break;
            default:
                ((C4413f) this.f47494e).a(i5);
                break;
        }
        this.f47490a--;
        this.f47492c = false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C4408a(C4413f c4413f) {
        this(c4413f.f47506c);
        this.f47493d = 2;
        this.f47494e = c4413f;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C4408a(C4412e c4412e, int i5) {
        this(c4412e.f47563c);
        this.f47493d = i5;
        switch (i5) {
            case 1:
                this.f47494e = c4412e;
                this(c4412e.f47563c);
                break;
            default:
                this.f47494e = c4412e;
                break;
        }
    }
}
