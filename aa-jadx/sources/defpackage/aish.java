package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class aish implements java.util.Iterator, defpackage.afhc {
    private int a;
    private final /* synthetic */ int b;
    private final java.lang.Object c;

    public aish(defpackage.aisx aisxVar, int i) {
        this.b = i;
        this.a = 2;
        this.c = new defpackage.aitb((defpackage.aitc) aisxVar.a);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Iterator] */
    private final void a() {
        while (this.a > 0) {
            ?? r0 = this.c;
            if (!r0.hasNext()) {
                return;
            }
            r0.next();
            this.a--;
        }
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, java.util.Iterator] */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.b;
        if (i == 0) {
            a();
            return this.c.hasNext();
        }
        int i2 = this.a;
        if (i != 1) {
            return i2 > 0 && this.c.hasNext();
        }
        return i2 < ((java.lang.Object[]) this.c).length;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object, java.util.Iterator] */
    @Override // java.util.Iterator
    public final java.lang.Object next() {
        int i = this.b;
        if (i == 0) {
            a();
            return this.c.next();
        }
        if (i != 1) {
            int i2 = this.a;
            if (i2 == 0) {
                throw new java.util.NoSuchElementException();
            }
            this.a = i2 - 1;
            return this.c.next();
        }
        try {
            java.lang.Object obj = this.c;
            int i3 = this.a;
            this.a = i3 + 1;
            return ((java.lang.Object[]) obj)[i3];
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            this.a--;
            throw new java.util.NoSuchElementException(e.getMessage());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.b;
        if (i == 0) {
            throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }
        if (i == 1) {
            throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public aish(defpackage.aisw aiswVar, int i) {
        this.b = i;
        this.c = aiswVar.a.a();
        this.a = aiswVar.b;
    }

    public aish(java.lang.Object[] objArr, int i) {
        this.b = i;
        this.c = objArr;
    }
}
