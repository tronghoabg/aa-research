package defpackage;

/* JADX INFO: loaded from: classes.dex */
class ycl implements java.util.Iterator {
    final java.util.Iterator a;
    final java.util.Collection b;
    final /* synthetic */ defpackage.ycm c;

    public ycl(defpackage.ycm ycmVar) {
        this.c = ycmVar;
        this.b = ycmVar.b;
        java.util.Collection collection = ycmVar.b;
        this.a = collection instanceof java.util.List ? ((java.util.List) collection).listIterator() : collection.iterator();
    }

    final void a() {
        defpackage.ycm ycmVar = this.c;
        ycmVar.b();
        if (ycmVar.b != this.b) {
            throw new java.util.ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        a();
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        a();
        return this.a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.a.remove();
        defpackage.ycm ycmVar = this.c;
        ycmVar.e.b--;
        ycmVar.c();
    }

    public ycl(defpackage.ycm ycmVar, java.util.Iterator it) {
        this.c = ycmVar;
        this.b = ycmVar.b;
        this.a = it;
    }
}
