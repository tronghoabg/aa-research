package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class tdk<T> extends defpackage.tdh<T> implements java.util.ListIterator<T>, defpackage.afhc {
    final /* synthetic */ defpackage.tdj a;
    private final java.util.ListIterator b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tdk(defpackage.tdj tdjVar, java.util.ListIterator listIterator) {
        super(listIterator);
        this.a = tdjVar;
        listIterator.getClass();
        this.b = listIterator;
    }

    @Override // defpackage.tdh
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
