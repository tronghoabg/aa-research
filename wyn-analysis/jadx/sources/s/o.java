package S;

import java.util.Iterator;
import uf.InterfaceC4291a;

/* loaded from: classes.dex */
public abstract class o implements Iterator, InterfaceC4291a {

    /* renamed from: a, reason: collision with root package name */
    public Object[] f10829a = n.f10824e.f10828d;

    /* renamed from: b, reason: collision with root package name */
    public int f10830b;

    /* renamed from: c, reason: collision with root package name */
    public int f10831c;

    public final void a(Object[] objArr, int i5, int i10) {
        this.f10829a = objArr;
        this.f10830b = i5;
        this.f10831c = i10;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f10831c < this.f10830b;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
