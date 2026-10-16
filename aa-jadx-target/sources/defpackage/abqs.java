package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class abqs<K extends defpackage.abow> extends java.util.AbstractMap<K, java.lang.Object> {
    private volatile abqr d;
    public boolean c = false;
    public java.lang.Object[] a = null;
    public int b = 0;
    private volatile boolean e = true;

    private final void e(int i) {
        int length;
        java.lang.Object[] objArr = this.a;
        if (objArr == null || (length = objArr.length) == 0) {
            this.a = new java.lang.Object[java.lang.Math.max(16, i)];
            return;
        }
        if (i > length) {
            if (!this.e) {
                c();
                if (i <= this.a.length) {
                    return;
                }
            }
            java.lang.Object[] objArr2 = this.a;
            int length2 = objArr2.length;
            int i2 = length2 + (length2 >> 1);
            if (i2 - i >= 0) {
                i = i2;
            }
            if ((-2147483639) + i > 0) {
                i = 2147483639;
            }
            this.a = java.util.Arrays.copyOf(objArr2, i);
        }
    }

    private final int f(defpackage.abow abowVar) {
        int i = this.b - 1;
        int i2 = 0;
        while (i2 <= i) {
            int i3 = (i2 + i) >>> 1;
            int iCompareTo = ((defpackage.abqp) this.a[i3]).c.compareTo(abowVar);
            if (iCompareTo < 0) {
                i2 = i3 + 1;
            } else {
                if (iCompareTo <= 0) {
                    return i3;
                }
                i = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public final java.util.Map.Entry a(int i) {
        c();
        if (i < this.b) {
            return (defpackage.abqp) this.a[i];
        }
        throw new java.lang.ArrayIndexOutOfBoundsException(i);
    }

    public final void b() {
        if (this.c) {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x003f A[Catch: all -> 0x0057, TryCatch #0 {, blocks: (B:8:0x000a, B:10:0x000e, B:12:0x0010, B:14:0x0015, B:16:0x0017, B:17:0x001e, B:19:0x0022, B:21:0x002a, B:23:0x003a, B:25:0x0045, B:24:0x003f, B:27:0x004a, B:28:0x0053, B:29:0x0055), top: B:35:0x000a }] */
    public final void c() {
        int i;
        if (this.c || this.e) {
            return;
        }
        synchronized (this) {
            if (this.e) {
                return;
            }
            int i2 = this.b;
            if (i2 <= 1) {
                return;
            }
            int i3 = 0;
            java.util.Arrays.sort(this.a, 0, i2);
            int i4 = 0;
            while (true) {
                i = this.b;
                if (i3 >= i) {
                    break;
                }
                java.lang.Object[] objArr = this.a;
                defpackage.abqp abqpVar = (defpackage.abqp) objArr[i3];
                if (i4 > 0) {
                    int i5 = i4 - 1;
                    if (((defpackage.abqp) objArr[i5]).c.equals(abqpVar.c)) {
                        this.a[i5] = abqpVar;
                    } else {
                        this.a[i4] = abqpVar;
                        i4++;
                    }
                } else {
                    this.a[i4] = abqpVar;
                    i4++;
                }
                i3++;
            }
            if (i4 < i) {
                this.b = i4;
                java.lang.Object[] objArr2 = this.a;
                java.util.Arrays.fill(objArr2, i4, objArr2.length, (java.lang.Object) null);
            }
            this.e = true;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        b();
        if (this.b != 0) {
            this.a = null;
            this.b = 0;
            this.e = true;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(java.lang.Object obj) {
        c();
        return f((defpackage.abow) obj) >= 0;
    }

    public final void d(defpackage.abow abowVar, java.lang.Object obj) {
        b();
        abowVar.getClass();
        boolean z = this.e;
        int i = this.b;
        if (i > 0) {
            int iCompareTo = abowVar.compareTo(((defpackage.abqp) this.a[i - 1]).c);
            if (iCompareTo < 0) {
                z = false;
            } else if (iCompareTo == 0) {
                ((defpackage.abqp) this.a[this.b - 1]).setValue(obj);
                return;
            }
        }
        e(this.b + 1);
        java.lang.Object[] objArr = this.a;
        int i2 = this.b;
        this.b = i2 + 1;
        objArr[i2] = new defpackage.abqp(this, abowVar, obj);
        this.e = z;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Set<java.util.Map.Entry<K, java.lang.Object>> entrySet() {
        c();
        if (this.d == null) {
            this.d = new abqr(this);
        }
        return this.d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.abqs)) {
            return super.equals(obj);
        }
        defpackage.abqs abqsVar = (defpackage.abqs) obj;
        int size = size();
        if (size != abqsVar.size()) {
            return false;
        }
        java.lang.Object[] objArr = this.a;
        java.lang.Object[] objArr2 = abqsVar.a;
        for (int i = 0; i < size; i++) {
            if (!objArr[i].equals(objArr2[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.lang.Object get(java.lang.Object obj) {
        c();
        int iF = f((defpackage.abow) obj);
        if (iF >= 0) {
            return ((defpackage.abqp) this.a[iF]).a;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = size();
        int iHashCode = 0;
        for (int i = 0; i < size; i++) {
            iHashCode += this.a[i].hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return this.b == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ java.lang.Object put(java.lang.Object obj, java.lang.Object obj2) {
        d((defpackage.abow) obj, obj2);
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(java.util.Map<? extends K, ?> map) {
        b();
        if (!(map instanceof defpackage.abqs)) {
            e(this.b + map.size());
            for (java.util.Map.Entry<? extends K, ?> entry : map.entrySet()) {
                d(entry.getKey(), entry.getValue());
            }
            return;
        }
        defpackage.abqs abqsVar = (defpackage.abqs) map;
        e(this.b + abqsVar.b);
        int i = this.b;
        int i2 = abqsVar.b + i;
        for (int i3 = i; i3 < i2; i3++) {
            defpackage.abqp abqpVar = (defpackage.abqp) abqsVar.a[i3 - i];
            d(abqpVar.c, abqpVar.a);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.lang.Object remove(java.lang.Object obj) {
        b();
        c();
        int iF = f((defpackage.abow) obj);
        if (iF < 0) {
            return null;
        }
        java.lang.Object[] objArr = this.a;
        java.lang.Object obj2 = ((defpackage.abqp) objArr[iF]).a;
        java.lang.System.arraycopy(objArr, iF + 1, objArr, iF, (this.b - iF) - 1);
        java.lang.Object[] objArr2 = this.a;
        int i = this.b - 1;
        this.b = i;
        objArr2[i] = null;
        return obj2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        c();
        return this.b;
    }
}
