package defpackage;

import java.util.ListIterator;

/* loaded from: classes.dex */
public final class tco<T> extends tcl<T> implements ListIterator<T>, afgc {
    final /* synthetic */ tcn a;
    private final ListIterator b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tco(tcn tcnVar, ListIterator listIterator) {
        super(listIterator);
        this.a = tcnVar;
        listIterator.getClass();
        this.b = listIterator;
    }

    @Override // defpackage.tcl
    public final void a() {
        this.a.a();
    }

    @Override // java.util.ListIterator
    public final void add(T t) {
        this.b.add(t);
        a();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.b.hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.b.nextIndex();
    }

    @Override // java.util.ListIterator
    public final T previous() {
        return (T) this.b.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.b.previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(T t) {
        this.b.set(t);
        a();
    }
}
