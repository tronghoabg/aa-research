package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aisl implements java.util.Iterator, defpackage.afhc {
    final /* synthetic */ defpackage.aism a;
    private final java.util.Iterator b;
    private java.util.Iterator c;
    private int d;

    public aisl(defpackage.aism aismVar) {
        this.a = aismVar;
        this.b = aismVar.a.a();
    }

    private final boolean a() {
        java.util.Iterator it;
        java.util.Iterator it2 = this.c;
        if (it2 != null && it2.hasNext()) {
            this.d = 1;
            return true;
        }
        do {
            java.util.Iterator it3 = this.b;
            if (!it3.hasNext()) {
                this.d = 2;
                this.c = null;
                return false;
            }
            java.lang.Object next = it3.next();
            defpackage.aism aismVar = this.a;
            it = (java.util.Iterator) aismVar.c.invoke(aismVar.b.invoke(next));
        } while (!it.hasNext());
        this.c = it;
        this.d = 1;
        return true;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.d;
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return false;
        }
        return a();
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        int i = this.d;
        if (i == 2) {
            throw new java.util.NoSuchElementException();
        }
        if (i == 0 && !a()) {
            throw new java.util.NoSuchElementException();
        }
        this.d = 0;
        java.util.Iterator it = this.c;
        it.getClass();
        return it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
