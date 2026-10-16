package c9;

import java.util.AbstractMap;
import java.util.Iterator;

/* renamed from: c9.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1591a implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19799a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f19800b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Iterable f19801c;

    public C1591a(b bVar, int i5) {
        this.f19801c = bVar;
        this.f19800b = i5;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f19799a) {
            case 0:
                if (this.f19800b < ((b) this.f19801c).f19802a.length) {
                }
                break;
            default:
                if (this.f19800b >= 0) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f19799a) {
            case 0:
                b bVar = (b) this.f19801c;
                Object[] objArr = bVar.f19802a;
                int i5 = this.f19800b;
                Object obj = objArr[i5];
                Object obj2 = bVar.f19803b[i5];
                this.f19800b = i5 + 1;
                return new AbstractMap.SimpleImmutableEntry(obj, obj2);
            default:
                int i10 = this.f19800b;
                f fVar = new f();
                Math.pow(2.0d, i10);
                this.f19800b--;
                return fVar;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f19799a) {
            case 0:
                throw new UnsupportedOperationException("Can't remove elements from ImmutableSortedMap");
            default:
                return;
        }
    }

    public C1591a(j jVar) {
        this.f19801c = jVar;
        this.f19800b = jVar.f19813b - 1;
    }

    private final void a() {
    }
}
