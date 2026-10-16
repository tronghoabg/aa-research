package Bf;

import X.B;
import ff.AbstractC2651f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/* loaded from: classes5.dex */
public final class e extends AbstractC2651f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1686a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1687b;

    public /* synthetic */ e(Object obj, int i5) {
        this.f1686a = i5;
        this.f1687b = obj;
    }

    @Override // ff.AbstractC2646a, java.util.Collection, java.util.List
    public /* bridge */ boolean contains(Object obj) {
        switch (this.f1686a) {
            case 0:
                if (obj instanceof String) {
                    return super.contains((String) obj);
                }
                return false;
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.List
    public final Object get(int i5) {
        switch (this.f1686a) {
            case 0:
                String strGroup = ((f) this.f1687b).f1688a.group(i5);
                return strGroup == null ? "" : strGroup;
            default:
                return ((ArrayList) this.f1687b).get(ff.o.h0(i5, this));
        }
    }

    @Override // ff.AbstractC2646a
    public final int getSize() {
        switch (this.f1686a) {
            case 0:
                return ((f) this.f1687b).f1688a.groupCount() + 1;
            default:
                return ((ArrayList) this.f1687b).size();
        }
    }

    @Override // ff.AbstractC2651f, java.util.List
    public /* bridge */ int indexOf(Object obj) {
        switch (this.f1686a) {
            case 0:
                if (obj instanceof String) {
                    return super.indexOf((String) obj);
                }
                return -1;
            default:
                return super.indexOf(obj);
        }
    }

    @Override // ff.AbstractC2651f, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        switch (this.f1686a) {
            case 1:
                return new B(this, 0);
            default:
                return super.iterator();
        }
    }

    @Override // ff.AbstractC2651f, java.util.List
    public /* bridge */ int lastIndexOf(Object obj) {
        switch (this.f1686a) {
            case 0:
                if (obj instanceof String) {
                    return super.lastIndexOf((String) obj);
                }
                return -1;
            default:
                return super.lastIndexOf(obj);
        }
    }

    @Override // ff.AbstractC2651f, java.util.List
    public ListIterator listIterator() {
        switch (this.f1686a) {
            case 1:
                return new B(this, 0);
            default:
                return super.listIterator();
        }
    }

    @Override // ff.AbstractC2651f, java.util.List
    public ListIterator listIterator(int i5) {
        switch (this.f1686a) {
            case 1:
                return new B(this, i5);
            default:
                return super.listIterator(i5);
        }
    }
}
