package gf;

import ff.i;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: gf.g, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2760g extends i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35907a;

    /* renamed from: b, reason: collision with root package name */
    public final C2759f f35908b;

    public /* synthetic */ C2760g(C2759f c2759f, int i5) {
        this.f35907a = i5;
        this.f35908b = c2759f;
    }

    @Override // ff.i
    public final int a() {
        switch (this.f35907a) {
        }
        return this.f35908b.f35903i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.f35907a) {
            case 0:
                Map.Entry element = (Map.Entry) obj;
                AbstractC3340k.e(element, "element");
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection elements) {
        switch (this.f35907a) {
            case 0:
                AbstractC3340k.e(elements, "elements");
                throw new UnsupportedOperationException();
            default:
                AbstractC3340k.e(elements, "elements");
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f35907a) {
            case 0:
                this.f35908b.clear();
                break;
            default:
                this.f35908b.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f35907a) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry element = (Map.Entry) obj;
                AbstractC3340k.e(element, "element");
                return this.f35908b.g(element);
            default:
                return this.f35908b.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection elements) {
        switch (this.f35907a) {
            case 0:
                AbstractC3340k.e(elements, "elements");
                return this.f35908b.f(elements);
            default:
                return super.containsAll(elements);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        switch (this.f35907a) {
        }
        return this.f35908b.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f35907a) {
            case 0:
                C2759f c2759f = this.f35908b;
                c2759f.getClass();
                return new C2756c(c2759f, 0);
            default:
                C2759f c2759f2 = this.f35908b;
                c2759f2.getClass();
                return new C2756c(c2759f2, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f35907a) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry element = (Map.Entry) obj;
                    AbstractC3340k.e(element, "element");
                    C2759f c2759f = this.f35908b;
                    c2759f.getClass();
                    c2759f.d();
                    int i5 = c2759f.i(element.getKey());
                    if (i5 >= 0) {
                        Object[] objArr = c2759f.f35896b;
                        AbstractC3340k.b(objArr);
                        if (AbstractC3340k.a(objArr[i5], element.getValue())) {
                            c2759f.m(i5);
                            break;
                        }
                    }
                }
                break;
            default:
                C2759f c2759f2 = this.f35908b;
                c2759f2.d();
                int i10 = c2759f2.i(obj);
                if (i10 >= 0) {
                    c2759f2.m(i10);
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection elements) {
        switch (this.f35907a) {
            case 0:
                AbstractC3340k.e(elements, "elements");
                this.f35908b.d();
                break;
            default:
                AbstractC3340k.e(elements, "elements");
                this.f35908b.d();
                break;
        }
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection elements) {
        switch (this.f35907a) {
            case 0:
                AbstractC3340k.e(elements, "elements");
                this.f35908b.d();
                break;
            default:
                AbstractC3340k.e(elements, "elements");
                this.f35908b.d();
                break;
        }
        return super.retainAll(elements);
    }
}
