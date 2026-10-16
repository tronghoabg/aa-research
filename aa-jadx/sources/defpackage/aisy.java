package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class aisy implements java.util.Iterator, defpackage.afhc {
    final /* synthetic */ java.lang.Object a;
    private final java.util.Iterator b;
    private int c = -1;
    private java.lang.Object d;
    private final /* synthetic */ int e;

    public aisy(defpackage.aisk aiskVar, int i) {
        this.e = i;
        this.a = aiskVar;
        this.b = aiskVar.a.a();
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [affc, java.lang.Object] */
    private final void a() {
        java.util.Iterator it = this.b;
        if (it.hasNext()) {
            java.lang.Object next = it.next();
            if (((java.lang.Boolean) ((defpackage.aita) this.a).b.invoke(next)).booleanValue()) {
                this.c = 1;
                this.d = next;
                return;
            }
        }
        this.c = 0;
    }

    private final void b() {
        int i;
        java.lang.Object next;
        defpackage.aisk aiskVar;
        do {
            java.util.Iterator it = this.b;
            if (it.hasNext()) {
                next = it.next();
                aiskVar = (defpackage.aisk) this.a;
            } else {
                i = 0;
            }
            this.c = i;
        } while (((java.lang.Boolean) aiskVar.c.invoke(next)).booleanValue() != aiskVar.b);
        this.d = next;
        i = 1;
        this.c = i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.e;
        int i2 = this.c;
        if (i != 0) {
            if (i2 == -1) {
                b();
            }
            return this.c == 1;
        }
        if (i2 == -1) {
            a();
        }
        return this.c == 1;
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        int i = this.e;
        int i2 = this.c;
        if (i != 0) {
            if (i2 == -1) {
                b();
            }
            if (this.c == 0) {
                throw new java.util.NoSuchElementException();
            }
            java.lang.Object obj = this.d;
            this.d = null;
            this.c = -1;
            return obj;
        }
        if (i2 == -1) {
            a();
        }
        if (this.c == 0) {
            throw new java.util.NoSuchElementException();
        }
        java.lang.Object obj2 = this.d;
        this.d = null;
        this.c = -1;
        return obj2;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.e == 0) {
            throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public aisy(defpackage.aita aitaVar, int i) {
        this.e = i;
        this.a = aitaVar;
        this.b = aitaVar.a.a();
    }
}
