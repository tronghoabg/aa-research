package l8;

import java.util.List;
import java.util.ListIterator;

/* renamed from: l8.l, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3430l extends C3422d implements ListIterator {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C3431m f40134e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3430l(C3431m c3431m) {
        super(c3431m);
        this.f40134e = c3431m;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        C3431m c3431m = this.f40134e;
        boolean zIsEmpty = c3431m.isEmpty();
        b().add(obj);
        c3431m.f40141f.f40082e++;
        if (zIsEmpty) {
            c3431m.a();
        }
    }

    public final ListIterator b() {
        a();
        return (ListIterator) this.f40094b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return b().hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return b().nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return b().previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return b().previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        b().set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3430l(C3431m c3431m, int i5) {
        super(c3431m, ((List) c3431m.f40137b).listIterator(i5));
        this.f40134e = c3431m;
    }
}
