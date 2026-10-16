package S;

import gf.C2756c;
import gf.C2759f;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3340k;
import uf.InterfaceC4292b;

/* loaded from: classes.dex */
public final class j extends AbstractCollection implements Collection, InterfaceC4292b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10819a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f10820b;

    public /* synthetic */ j(Object obj, int i5) {
        this.f10819a = i5;
        this.f10820b = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f10819a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean addAll(Collection elements) {
        switch (this.f10819a) {
            case 1:
                AbstractC3340k.e(elements, "elements");
                throw new UnsupportedOperationException();
            default:
                return super.addAll(elements);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        switch (this.f10819a) {
            case 0:
                ((e) this.f10820b).clear();
                break;
            default:
                ((C2759f) this.f10820b).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f10819a) {
            case 0:
                return ((e) this.f10820b).containsValue(obj);
            default:
                return ((C2759f) this.f10820b).containsValue(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        switch (this.f10819a) {
            case 1:
                return ((C2759f) this.f10820b).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f10819a) {
            case 0:
                o[] oVarArr = new o[8];
                for (int i5 = 0; i5 < 8; i5++) {
                    oVarArr[i5] = new p(2);
                }
                return new i((e) this.f10820b, oVarArr);
            default:
                C2759f c2759f = (C2759f) this.f10820b;
                c2759f.getClass();
                return new C2756c(c2759f, 2);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        switch (this.f10819a) {
            case 1:
                C2759f c2759f = (C2759f) this.f10820b;
                c2759f.d();
                int iJ = c2759f.j(obj);
                if (iJ < 0) {
                    return false;
                }
                c2759f.m(iJ);
                return true;
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection elements) {
        switch (this.f10819a) {
            case 1:
                AbstractC3340k.e(elements, "elements");
                ((C2759f) this.f10820b).d();
                break;
        }
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection elements) {
        switch (this.f10819a) {
            case 1:
                AbstractC3340k.e(elements, "elements");
                ((C2759f) this.f10820b).d();
                break;
        }
        return super.retainAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        switch (this.f10819a) {
            case 0:
                e eVar = (e) this.f10820b;
                eVar.getClass();
                return eVar.f10810f;
            default:
                return ((C2759f) this.f10820b).f35903i;
        }
    }
}
