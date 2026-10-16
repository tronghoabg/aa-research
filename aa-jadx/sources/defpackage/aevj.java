package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aevj implements j$.util.Iterator, defpackage.aeuy {
    int a;
    int b = -1;
    int c;
    boolean d;
    defpackage.aeuq e;
    final /* synthetic */ defpackage.aevl f;

    public aevj(defpackage.aevl aevlVar) {
        this.f = aevlVar;
        this.a = aevlVar.d;
        this.c = aevlVar.g;
        this.d = aevlVar.c;
    }

    @Override // j$.util.Iterator, java.util.Iterator
    public final void forEachRemaining(java.util.function.Consumer consumer) {
        defpackage.aevl aevlVar = this.f;
        java.lang.Object[] objArr = aevlVar.a;
        if (this.d) {
            this.d = false;
            int i = aevlVar.d;
            this.b = i;
            consumer.accept(objArr[i]);
            this.c--;
        }
        while (this.c != 0) {
            int i2 = this.a - 1;
            this.a = i2;
            if (i2 < 0) {
                this.b = Integer.MIN_VALUE;
                consumer.accept(this.e.get((-i2) - 1));
                this.c--;
            } else {
                java.lang.Object obj = objArr[i2];
                if (obj != null) {
                    this.b = i2;
                    consumer.accept(obj);
                    this.c--;
                }
            }
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c != 0;
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        int i;
        java.lang.Object obj;
        if (!hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        this.c--;
        defpackage.aevl aevlVar = this.f;
        java.lang.Object[] objArr = aevlVar.a;
        if (this.d) {
            this.d = false;
            int i2 = aevlVar.d;
            this.b = i2;
            return objArr[i2];
        }
        do {
            i = this.a - 1;
            this.a = i;
            if (i < 0) {
                this.b = Integer.MIN_VALUE;
                return this.e.get((-i) - 1);
            }
            obj = objArr[i];
        } while (obj == null);
        this.b = i;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        java.lang.Object obj;
        int i = this.b;
        if (i == -1) {
            throw new java.lang.IllegalStateException();
        }
        defpackage.aevl aevlVar = this.f;
        int i2 = aevlVar.d;
        if (i == i2) {
            aevlVar.c = false;
            aevlVar.a[i2] = null;
        } else {
            int i3 = this.a;
            if (i3 < 0) {
                aevlVar.remove(this.e.set((-i3) - 1, null));
                this.b = -1;
                return;
            }
            java.lang.Object[] objArr = aevlVar.a;
            loop0: while (true) {
                int i4 = (i + 1) & aevlVar.b;
                while (true) {
                    obj = objArr[i4];
                    if (obj != null) {
                        int iHashCode = obj.hashCode() * (-1640531527);
                        int i5 = aevlVar.b;
                        int i6 = (iHashCode ^ (iHashCode >>> 16)) & i5;
                        if (i > i4) {
                            if (i >= i6 && i6 > i4) {
                                break;
                            } else {
                                i4 = (i4 + 1) & i5;
                            }
                        } else if (i >= i6 || i6 > i4) {
                            break;
                        } else {
                            i4 = (i4 + 1) & i5;
                        }
                    } else {
                        break loop0;
                    }
                }
                if (i4 < i) {
                    defpackage.aeuq aeuqVar = this.e;
                    if (aeuqVar == null) {
                        aeuqVar = new defpackage.aeuq((byte[]) null);
                        this.e = aeuqVar;
                    }
                    aeuqVar.add(objArr[i4]);
                }
                objArr[i] = obj;
                i = i4;
            }
            objArr[i] = null;
        }
        aevlVar.g--;
        this.b = -1;
    }
}
