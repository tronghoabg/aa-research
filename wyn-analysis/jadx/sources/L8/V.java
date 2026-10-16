package l8;

import java.util.AbstractList;
import java.util.ListIterator;

/* loaded from: classes4.dex */
public final class V extends s0 implements ListIterator {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f40072b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractList f40073c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ V(AbstractList abstractList, ListIterator listIterator, int i5) {
        super(listIterator);
        this.f40072b = i5;
        this.f40073c = abstractList;
    }

    @Override // l8.s0
    public final Object a(Object obj) {
        switch (this.f40072b) {
            case 0:
                return ((W) this.f40073c).f40075b.apply(obj);
            default:
                return ((X) this.f40073c).f40077b.apply(obj);
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return ((ListIterator) this.f40159a).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return ((ListIterator) this.f40159a).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return a(((ListIterator) this.f40159a).previous());
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return ((ListIterator) this.f40159a).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
