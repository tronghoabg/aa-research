package defpackage;

import java.util.ListIterator;

/* loaded from: classes3.dex */
final class ybh extends ybf implements ListIterator {
    final /* synthetic */ ybi d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ybh(ybi ybiVar, int i) {
        super(ybiVar, ybiVar.d().listIterator(i));
        this.d = ybiVar;
    }

    private final ListIterator b() {
        a();
        return (ListIterator) this.a;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        ybi ybiVar = this.d;
        boolean zIsEmpty = ybiVar.isEmpty();
        b().add(obj);
        ybiVar.f.b++;
        if (zIsEmpty) {
            ybiVar.a();
        }
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
    public ybh(ybi ybiVar) {
        super(ybiVar);
        this.d = ybiVar;
    }
}
