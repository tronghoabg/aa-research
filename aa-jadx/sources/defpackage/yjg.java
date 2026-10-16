package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class yjg implements java.util.Iterator {
    final java.util.Set a;
    defpackage.yji b;
    defpackage.yji c;
    int d;
    final /* synthetic */ defpackage.yjl e;

    public yjg(defpackage.yjl yjlVar) {
        this.e = yjlVar;
        this.a = defpackage.ysr.r(yjlVar.x().size());
        this.b = yjlVar.a;
        this.d = yjlVar.e;
    }

    private final void a() {
        if (this.e.e != this.d) {
            throw new java.util.ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        a();
        return this.b != null;
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        defpackage.yji yjiVar;
        a();
        defpackage.yji yjiVar2 = this.b;
        if (yjiVar2 == null) {
            throw new java.util.NoSuchElementException();
        }
        this.c = yjiVar2;
        java.util.Set set = this.a;
        set.add(yjiVar2.getKey());
        do {
            yjiVar = this.b.a;
            this.b = yjiVar;
            if (yjiVar == null) {
                break;
            }
        } while (!set.add(yjiVar.getKey()));
        return this.c.getKey();
    }

    @Override // java.util.Iterator
    public final void remove() {
        a();
        defpackage.ysr.bk(this.c != null, "no calls to next() since the last call to remove()");
        java.lang.Object key = this.c.getKey();
        defpackage.yjl yjlVar = this.e;
        yjlVar.d(key);
        this.c = null;
        this.d = yjlVar.e;
    }
}
