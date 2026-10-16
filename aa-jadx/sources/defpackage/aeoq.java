package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aeoq<V> extends defpackage.aema<V> implements java.io.Serializable, java.lang.Cloneable {
    private static final long serialVersionUID = 0;
    public transient long[] a;
    public transient java.lang.Object[] b;
    public transient int c;
    public transient boolean d;
    public transient int e;
    public transient int f;
    public transient long[] g;
    public transient int h;
    public transient int i;
    protected final transient int j;
    public int k;
    protected transient defpackage.aerb l;
    protected transient defpackage.aeuv m;
    protected transient defpackage.aeon n;

    public aeoq(byte[] bArr) {
        this.e = -1;
        this.f = -1;
        int iD = defpackage.aefc.d(16, 0.75f);
        this.h = iD;
        this.j = iD;
        this.c = iD - 1;
        this.i = defpackage.aefc.e(iD, 0.75f);
        int i = this.h + 1;
        this.a = new long[i];
        this.b = new java.lang.Object[i];
        this.g = new long[i];
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.lang.ClassNotFoundException, java.io.IOException {
        long[] jArr;
        int i;
        objectInputStream.defaultReadObject();
        int iD = defpackage.aefc.d(this.k, 0.75f);
        this.h = iD;
        this.i = defpackage.aefc.e(iD, 0.75f);
        int i2 = this.h;
        this.c = i2 - 1;
        boolean z = true;
        int i3 = i2 + 1;
        long[] jArr2 = new long[i3];
        this.a = jArr2;
        java.lang.Object[] objArr = new java.lang.Object[i3];
        this.b = objArr;
        long[] jArr3 = new long[i3];
        this.g = jArr3;
        this.f = -1;
        this.e = -1;
        int i4 = this.k;
        int i5 = -1;
        while (true) {
            int i6 = i4 - 1;
            if (i4 == 0) {
                break;
            }
            long j = objectInputStream.readLong();
            java.lang.Object object = objectInputStream.readObject();
            long j2 = 0;
            if (j == 0) {
                i = this.h;
                this.d = z;
                jArr = jArr2;
            } else {
                long j3 = (-7046029254386353131L) * j;
                long j4 = j3 ^ (j3 >>> 32);
                jArr = jArr2;
                int i7 = ((int) (j4 ^ (j4 >>> 16))) & this.c;
                while (jArr[i7] != 0) {
                    i7 = (i7 + 1) & this.c;
                }
                j2 = j;
                i = i7;
            }
            jArr[i] = j2;
            objArr[i] = object;
            if (this.e != -1) {
                long j5 = jArr3[i5];
                jArr3[i5] = j5 ^ (((((long) i) & 4294967295L) ^ j5) & 4294967295L);
                long j6 = jArr3[i];
                jArr3[i] = j6 ^ ((((((long) i5) & 4294967295L) << 32) ^ j6) & (-4294967296L));
            } else {
                this.e = i;
                jArr3[i] = jArr3[i] | (-4294967296L);
            }
            i4 = i6;
            i5 = i;
            jArr2 = jArr;
            z = true;
        }
        this.f = i5;
        if (i5 != -1) {
            jArr3[i5] = jArr3[i5] | 4294967295L;
        }
    }

    private void writeObject(java.io.ObjectOutputStream objectOutputStream) throws java.io.IOException {
        long[] jArr = this.a;
        java.lang.Object[] objArr = this.b;
        defpackage.aeoi aeoiVar = new defpackage.aeoi(this);
        objectOutputStream.defaultWriteObject();
        for (int i = this.k; i != 0; i--) {
            int iG = aeoiVar.g();
            objectOutputStream.writeLong(jArr[iG]);
            objectOutputStream.writeObject(objArr[iG]);
        }
    }

    public final void A(int i) {
        int i2;
        int i3;
        int i4 = i + 1;
        long[] jArr = this.a;
        java.lang.Object[] objArr = this.b;
        long[] jArr2 = new long[i4];
        java.lang.Object[] objArr2 = new java.lang.Object[i4];
        int i5 = this.e;
        long[] jArr3 = this.g;
        long[] jArr4 = new long[i4];
        this.e = -1;
        int i6 = this.k;
        int i7 = -1;
        int i8 = -1;
        while (true) {
            i2 = i - 1;
            int i9 = i6 - 1;
            if (i6 == 0) {
                break;
            }
            long j = jArr[i5];
            if (j != 0) {
                long j2 = j * (-7046029254386353131L);
                long j3 = j2 ^ (j2 >>> 32);
                int i10 = (int) (j3 ^ (j3 >>> 16));
                while (true) {
                    i3 = i10 & i2;
                    if (jArr2[i3] == 0) {
                        break;
                    } else {
                        i10 = i3 + 1;
                    }
                }
            } else {
                i3 = i;
            }
            jArr2[i3] = jArr[i5];
            objArr2[i3] = objArr[i5];
            if (i8 != -1) {
                long j4 = jArr4[i7];
                jArr4[i7] = (((((long) i3) & 4294967295L) ^ j4) & 4294967295L) ^ j4;
                long j5 = jArr4[i3];
                jArr4[i3] = j5 ^ ((((((long) i7) & 4294967295L) << 32) ^ j5) & (-4294967296L));
            } else {
                this.e = i3;
                jArr4[i3] = -1;
            }
            i8 = i5;
            i7 = i3;
            objArr = objArr;
            i5 = (int) jArr3[i5];
            jArr = jArr;
            i6 = i9;
        }
        this.g = jArr4;
        this.f = i7;
        if (i7 != -1) {
            jArr4[i7] = jArr4[i7] | 4294967295L;
        }
        this.h = i;
        this.c = i2;
        this.i = defpackage.aefc.e(i, 0.75f);
        this.a = jArr2;
        this.b = objArr2;
    }

    @Override // defpackage.aeov
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final defpackage.aeon t() {
        defpackage.aeon aeonVar = this.n;
        if (aeonVar != null) {
            return aeonVar;
        }
        defpackage.aeon aeonVar2 = new defpackage.aeon(this);
        this.n = aeonVar2;
        return aeonVar2;
    }

    @Override // defpackage.aeov
    public final defpackage.aeov C() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // defpackage.aeov
    public final defpackage.aeov D() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // defpackage.aeov
    public final defpackage.aeov E() {
        throw new java.lang.UnsupportedOperationException();
    }

    public final void F(int i) {
        int iNumberOfLeadingZeros = 1 << (32 - java.lang.Integer.numberOfLeadingZeros(((int) java.lang.Math.ceil(i / 0.75f)) - 1));
        if (iNumberOfLeadingZeros >= this.h || this.k > defpackage.aefc.e(iNumberOfLeadingZeros, 0.75f)) {
            return;
        }
        try {
            A(iNumberOfLeadingZeros);
        } catch (java.lang.OutOfMemoryError unused) {
        }
    }

    @Override // defpackage.aely, defpackage.aeoe
    public final java.lang.Object a(long j, java.lang.Object obj) {
        int i;
        if (j == 0) {
            boolean z = this.d;
            i = this.h;
            if (!z) {
                i = -(i + 1);
            }
        } else {
            long[] jArr = this.a;
            long j2 = (-7046029254386353131L) * j;
            long j3 = j2 ^ (j2 >>> 32);
            int i2 = this.c & ((int) (j3 ^ (j3 >>> 16)));
            long j4 = jArr[i2];
            if (j4 != 0) {
                if (j != j4) {
                    while (true) {
                        i2 = (i2 + 1) & this.c;
                        long j5 = jArr[i2];
                        if (j5 == 0) {
                            i = -(i2 + 1);
                        } else if (j == j5) {
                        }
                    }
                }
                i = i2;
            } else {
                i = -(i2 + 1);
            }
        }
        if (i >= 0) {
            java.lang.Object[] objArr = this.b;
            java.lang.Object obj2 = objArr[i];
            objArr[i] = obj;
            return obj2;
        }
        int i3 = (-i) - 1;
        if (i3 == this.h) {
            this.d = true;
        }
        this.a[i3] = j;
        this.b[i3] = obj;
        int i4 = this.k;
        if (i4 == 0) {
            this.f = i3;
            this.e = i3;
            this.g[i3] = -1;
        } else {
            long[] jArr2 = this.g;
            int i5 = this.f;
            long j6 = jArr2[i5];
            jArr2[i5] = j6 ^ (((((long) i3) & 4294967295L) ^ j6) & 4294967295L);
            jArr2[i3] = ((((long) i5) & 4294967295L) << 32) | 4294967295L;
            this.f = i3;
        }
        this.k = i4 + 1;
        if (i4 < this.i) {
            return null;
        }
        A(defpackage.aefc.d(i4 + 2, 0.75f));
        return null;
    }

    @Override // defpackage.aely, defpackage.aeoe
    public final java.lang.Object b(long j) {
        long j2;
        if (j == 0) {
            if (this.d) {
                return v();
            }
            return null;
        }
        long[] jArr = this.a;
        long j3 = (-7046029254386353131L) * j;
        long j4 = j3 ^ (j3 >>> 32);
        int i = this.c & ((int) (j4 ^ (j4 >>> 16)));
        long j5 = jArr[i];
        if (j5 == 0) {
            return null;
        }
        if (j == j5) {
            return u(i);
        }
        do {
            i = (i + 1) & this.c;
            j2 = jArr[i];
            if (j2 == 0) {
                return null;
            }
        } while (j != j2);
        return u(i);
    }

    @Override // defpackage.aelz, defpackage.aely, defpackage.aeoe
    public final boolean c(long j) {
        long j2;
        if (j == 0) {
            return this.d;
        }
        long[] jArr = this.a;
        long j3 = (-7046029254386353131L) * j;
        long j4 = j3 ^ (j3 >>> 32);
        int i = this.c & ((int) (j4 ^ (j4 >>> 16)));
        long j5 = jArr[i];
        if (j5 == 0) {
            return false;
        }
        if (j != j5) {
            do {
                i = (i + 1) & this.c;
                j2 = jArr[i];
                if (j2 == 0) {
                    return false;
                }
            } while (j != j2);
        }
        return true;
    }

    @Override // defpackage.aelz, defpackage.aeos, java.util.Map
    public final void clear() {
        if (this.k == 0) {
            return;
        }
        this.k = 0;
        this.d = false;
        java.util.Arrays.fill(this.a, 0L);
        java.util.Arrays.fill(this.b, (java.lang.Object) null);
        this.f = -1;
        this.e = -1;
    }

    @Override // defpackage.aema, java.util.SortedMap
    public final /* bridge */ /* synthetic */ java.util.Comparator<? super java.lang.Long> comparator() {
        return null;
    }

    @Override // defpackage.aelz, java.util.Map
    public final boolean containsValue(java.lang.Object obj) {
        long[] jArr = this.a;
        java.lang.Object[] objArr = this.b;
        if (this.d && j$.util.Objects.equals(objArr[this.h], obj)) {
            return true;
        }
        int i = this.h;
        while (i != 0) {
            i--;
            if (jArr[i] != 0 && j$.util.Objects.equals(objArr[i], obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.aelz
    /* JADX INFO: renamed from: d */
    public final /* bridge */ /* synthetic */ defpackage.aeqx keySet() {
        return keySet();
    }

    @Override // defpackage.aelz
    /* JADX INFO: renamed from: e */
    public final defpackage.aeuv values() {
        if (this.m == null) {
            this.m = new defpackage.aeoh(this);
        }
        return this.m;
    }

    @Override // defpackage.aelz, java.util.Map
    public final int hashCode() {
        long j;
        int i;
        long[] jArr = this.a;
        java.lang.Object[] objArr = this.b;
        boolean z = this.d;
        int i2 = this.k;
        if (z) {
            i2--;
        }
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int i5 = i2 - 1;
            if (i2 == 0) {
                break;
            }
            while (true) {
                j = jArr[i3];
                i = i3 + 1;
                if (j != 0) {
                    break;
                }
                i3 = i;
            }
            java.lang.Object obj = objArr[i3];
            int iF = defpackage.a.f(j);
            if (this != obj) {
                iF ^= obj == null ? 0 : obj.hashCode();
            }
            i4 += iF;
            i2 = i5;
            i3 = i;
        }
        if (!this.d) {
            return i4;
        }
        java.lang.Object obj2 = objArr[this.h];
        return i4 + (obj2 != null ? obj2.hashCode() : 0);
    }

    @Override // defpackage.aelz, java.util.Map
    public final boolean isEmpty() {
        return this.k == 0;
    }

    @Override // defpackage.aema
    /* JADX INFO: renamed from: k */
    public final defpackage.aerb keySet() {
        if (this.l == null) {
            this.l = new defpackage.aeol(this);
        }
        return this.l;
    }

    @Override // defpackage.aema, defpackage.aelz, java.util.Map
    public final /* bridge */ /* synthetic */ java.util.Set<java.lang.Long> keySet() {
        return keySet();
    }

    @Override // defpackage.aeoe
    public final java.lang.Object p(long j) {
        long j2;
        if (j == 0) {
            if (this.d) {
                return this.b[this.h];
            }
            return null;
        }
        long[] jArr = this.a;
        long j3 = (-7046029254386353131L) * j;
        long j4 = j3 ^ (j3 >>> 32);
        int i = this.c & ((int) (j4 ^ (j4 >>> 16)));
        long j5 = jArr[i];
        if (j5 == 0) {
            return null;
        }
        if (j == j5) {
            return this.b[i];
        }
        do {
            i = (i + 1) & this.c;
            j2 = jArr[i];
            if (j2 == 0) {
                return null;
            }
        } while (j != j2);
        return this.b[i];
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.aelz, java.util.Map
    public final void putAll(java.util.Map<? extends java.lang.Long, ? extends V> map) {
        int iMin = (int) java.lang.Math.min(1073741824L, java.lang.Math.max(2L, 1 << (64 - java.lang.Long.numberOfLeadingZeros(((long) java.lang.Math.ceil((this.k + map.size()) / 0.75f)) - 1))));
        if (iMin > this.h) {
            A(iMin);
        }
        if (map instanceof defpackage.aeos) {
            defpackage.aeuy aeuyVarA = defpackage.aeou.a((defpackage.aeos) map);
            while (aeuyVarA.hasNext()) {
                defpackage.aeom aeomVar = (defpackage.aeom) aeuyVarA.next();
                a(aeomVar.a(), aeomVar.getValue());
            }
            return;
        }
        int size = map.size();
        java.util.Iterator<java.util.Map.Entry<? extends java.lang.Long, ? extends V>> it = map.entrySet().iterator();
        while (size != 0) {
            size--;
            java.util.Map.Entry<? extends java.lang.Long, ? extends V> next = it.next();
            defpackage.adrq.as(this, next.getKey(), next.getValue());
        }
    }

    @Override // defpackage.aeov
    public final long q() {
        if (this.k != 0) {
            return this.a[this.e];
        }
        throw new java.util.NoSuchElementException();
    }

    @Override // defpackage.aeov
    public final long r() {
        if (this.k != 0) {
            return this.a[this.f];
        }
        throw new java.util.NoSuchElementException();
    }

    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public final defpackage.aeoq clone() {
        try {
            defpackage.aeoq aeoqVar = (defpackage.aeoq) super.clone();
            aeoqVar.l = null;
            aeoqVar.m = null;
            aeoqVar.n = null;
            aeoqVar.d = this.d;
            aeoqVar.a = (long[]) this.a.clone();
            aeoqVar.b = (java.lang.Object[]) this.b.clone();
            aeoqVar.g = (long[]) this.g.clone();
            return aeoqVar;
        } catch (java.lang.CloneNotSupportedException unused) {
            throw new java.lang.InternalError();
        }
    }

    @Override // defpackage.aely, defpackage.aefe
    public final int size() {
        return this.k;
    }

    public final java.lang.Object u(int i) {
        long j;
        java.lang.Object[] objArr = this.b;
        java.lang.Object obj = objArr[i];
        objArr[i] = null;
        this.k--;
        x(i);
        long[] jArr = this.a;
        java.lang.Object[] objArr2 = this.b;
        loop0: while (true) {
            int i2 = (i + 1) & this.c;
            while (true) {
                j = jArr[i2];
                if (j != 0) {
                    int i3 = this.c;
                    long j2 = (-7046029254386353131L) * j;
                    long j3 = j2 ^ (j2 >>> 32);
                    int i4 = ((int) (j3 ^ (j3 >>> 16))) & i3;
                    if (i > i2) {
                        if (i >= i4 && i4 > i2) {
                            break;
                        }
                        i2 = (i2 + 1) & i3;
                    } else {
                        if (i >= i4 || i4 > i2) {
                            break;
                        }
                        i2 = (i2 + 1) & i3;
                    }
                } else {
                    break loop0;
                }
            }
            jArr[i] = j;
            objArr2[i] = objArr2[i2];
            y(i2, i);
            i = i2;
        }
        jArr[i] = 0;
        objArr2[i] = null;
        int i5 = this.h;
        if (i5 > this.j && this.k < this.i / 4 && i5 > 16) {
            A(i5 >> 1);
        }
        return obj;
    }

    public final java.lang.Object v() {
        this.d = false;
        java.lang.Object[] objArr = this.b;
        int i = this.h;
        java.lang.Object obj = objArr[i];
        objArr[i] = null;
        this.k--;
        x(i);
        int i2 = this.h;
        if (i2 > this.j && this.k < this.i / 4 && i2 > 16) {
            A(i2 >> 1);
        }
        return obj;
    }

    @Override // defpackage.aema, defpackage.aelz, java.util.Map
    public final /* bridge */ /* synthetic */ java.util.Collection values() {
        return values();
    }

    public final java.lang.Object w(int i, java.lang.Object obj) {
        java.lang.Object[] objArr = this.b;
        java.lang.Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    protected final void x(int i) {
        if (this.k == 0) {
            this.f = -1;
            this.e = -1;
            return;
        }
        if (this.e == i) {
            long[] jArr = this.g;
            int i2 = (int) jArr[i];
            this.e = i2;
            if (i2 >= 0) {
                jArr[i2] = (-4294967296L) | jArr[i2];
                return;
            }
            return;
        }
        int i3 = this.f;
        long[] jArr2 = this.g;
        if (i3 == i) {
            int i4 = (int) (jArr2[i] >>> 32);
            this.f = i4;
            if (i4 >= 0) {
                jArr2[i4] = jArr2[i4] | 4294967295L;
                return;
            }
            return;
        }
        long j = jArr2[i];
        int i5 = (int) j;
        int i6 = (int) (j >>> 32);
        long j2 = jArr2[i6];
        jArr2[i6] = (4294967295L & ((j & 4294967295L) ^ j2)) ^ j2;
        long j3 = jArr2[i5];
        jArr2[i5] = (((j & (-4294967296L)) ^ j3) & (-4294967296L)) ^ j3;
    }

    protected final void y(int i, int i2) {
        if (this.k == 1) {
            this.f = i2;
            this.e = i2;
            this.g[i2] = -1;
            return;
        }
        long j = ((long) i2) & 4294967295L;
        if (this.e == i) {
            this.e = i2;
            long[] jArr = this.g;
            int i3 = (int) jArr[i];
            long j2 = jArr[i3];
            jArr[i3] = (((j << 32) ^ j2) & (-4294967296L)) ^ j2;
            jArr[i2] = jArr[i];
            return;
        }
        if (this.f == i) {
            this.f = i2;
            long[] jArr2 = this.g;
            int i4 = (int) (jArr2[i] >>> 32);
            long j3 = jArr2[i4];
            jArr2[i4] = ((j ^ j3) & 4294967295L) ^ j3;
            jArr2[i2] = jArr2[i];
            return;
        }
        long j4 = j << 32;
        long[] jArr3 = this.g;
        long j5 = jArr3[i];
        int i5 = (int) j5;
        int i6 = (int) (j5 >>> 32);
        long j6 = jArr3[i6];
        jArr3[i6] = ((j ^ j6) & 4294967295L) ^ j6;
        long j7 = jArr3[i5];
        jArr3[i5] = j7 ^ ((j7 ^ j4) & (-4294967296L));
        jArr3[i2] = j5;
    }

    public final void z(int i) {
        int i2;
        if (this.k == 1 || (i2 = this.f) == i) {
            return;
        }
        int i3 = this.e;
        long[] jArr = this.g;
        if (i3 == i) {
            int i4 = (int) jArr[i];
            this.e = i4;
            jArr[i4] = (-4294967296L) | jArr[i4];
        } else {
            long j = jArr[i];
            int i5 = (int) j;
            int i6 = (int) (j >>> 32);
            long j2 = jArr[i6];
            jArr[i6] = j2 ^ (((j & 4294967295L) ^ j2) & 4294967295L);
            long j3 = jArr[i5];
            jArr[i5] = ((-4294967296L) & ((j & (-4294967296L)) ^ j3)) ^ j3;
        }
        long j4 = jArr[i2];
        jArr[i2] = j4 ^ (((((long) i) & 4294967295L) ^ j4) & 4294967295L);
        jArr[i] = ((((long) i2) & 4294967295L) << 32) | 4294967295L;
        this.f = i;
    }

    public aeoq() {
        throw null;
    }
}
