package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class ycn extends defpackage.ycl implements java.util.ListIterator {
    final /* synthetic */ defpackage.yco d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ycn(defpackage.yco ycoVar, int i) {
        super(ycoVar, ycoVar.d().listIterator(i));
        this.d = ycoVar;
    }

    private final java.util.ListIterator b() {
        a();
        return (java.util.ListIterator) this.a;
    }

    @Override // java.util.ListIterator
    public final void add(java.lang.Object obj) {
        defpackage.yco ycoVar = this.d;
        boolean zIsEmpty = ycoVar.isEmpty();
        b().add(obj);
        ycoVar.f.b++;
        if (zIsEmpty) {
            ycoVar.a();
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
    public final java.lang.Object previous() {
        return b().previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return b().previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(java.lang.Object obj) {
        b().set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ycn(defpackage.yco ycoVar) {
        super(ycoVar);
        this.d = ycoVar;
    }
}
