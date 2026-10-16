package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class aeyi implements j$.util.Iterator, defpackage.aeuy {
    int a = -1;
    int b = 0;
    final /* synthetic */ java.util.AbstractCollection c;
    private final /* synthetic */ int d;

    public aeyi(java.util.AbstractCollection abstractCollection, int i) {
        this.d = i;
        this.c = abstractCollection;
    }

    @Override // j$.util.Iterator, java.util.Iterator
    public final void forEachRemaining(java.util.function.Consumer consumer) {
        int i = this.d;
        java.util.AbstractCollection abstractCollection = this.c;
        if (i != 0) {
            defpackage.aeus aeusVar = (defpackage.aeus) abstractCollection;
            java.lang.Object[] objArr = aeusVar.a;
            while (true) {
                int i2 = this.b;
                if (i2 >= aeusVar.b) {
                    return;
                }
                this.b = i2 + 1;
                consumer.accept(objArr[i2]);
            }
        } else {
            defpackage.aeyj aeyjVar = (defpackage.aeyj) abstractCollection;
            java.lang.Object[] objArr2 = aeyjVar.a;
            while (true) {
                int i3 = this.b;
                if (i3 >= aeyjVar.b) {
                    return;
                }
                this.b = i3 + 1;
                consumer.accept(objArr2[i3]);
            }
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.d;
        int i2 = this.b;
        java.util.AbstractCollection abstractCollection = this.c;
        if (i != 0) {
            return i2 < ((defpackage.aeus) abstractCollection).b;
        }
        return i2 < ((defpackage.aeyj) abstractCollection).b;
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        if (this.d != 0) {
            if (!hasNext()) {
                throw new java.util.NoSuchElementException();
            }
            java.lang.Object[] objArr = ((defpackage.aeus) this.c).a;
            int i = this.b;
            this.b = i + 1;
            this.a = i;
            return objArr[i];
        }
        if (!hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        java.lang.Object[] objArr2 = ((defpackage.aeyj) this.c).a;
        int i2 = this.b;
        this.b = i2 + 1;
        this.a = i2;
        return objArr2[i2];
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.d;
        int i2 = this.a;
        if (i != 0) {
            if (i2 == -1) {
                throw new java.lang.IllegalStateException();
            }
            this.a = -1;
            defpackage.aeus aeusVar = (defpackage.aeus) this.c;
            int i3 = aeusVar.b;
            aeusVar.b = i3 - 1;
            int i4 = this.b;
            int i5 = i4 - 1;
            this.b = i5;
            java.lang.Object[] objArr = aeusVar.a;
            java.lang.System.arraycopy(objArr, i4, objArr, i5, i3 - i4);
            aeusVar.a[aeusVar.b] = null;
            return;
        }
        if (i2 == -1) {
            throw new java.lang.IllegalStateException();
        }
        this.a = -1;
        defpackage.aeyj aeyjVar = (defpackage.aeyj) this.c;
        int i6 = aeyjVar.b;
        aeyjVar.b = i6 - 1;
        int i7 = this.b;
        int i8 = i7 - 1;
        this.b = i8;
        java.lang.Object[] objArr2 = aeyjVar.a;
        java.lang.System.arraycopy(objArr2, i7, objArr2, i8, i6 - i7);
        aeyjVar.a[aeyjVar.b] = null;
    }
}
