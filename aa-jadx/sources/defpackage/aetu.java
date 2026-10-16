package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aetu<K, V> extends defpackage.aerp<K, V> implements java.io.Serializable, java.lang.Cloneable {
    private static final long serialVersionUID = 0;
    public transient java.lang.Object[] a;
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
    protected transient defpackage.aevr l;
    protected transient defpackage.aeuv m;
    protected transient defpackage.aetr n;

    public aetu(byte[] bArr) {
        this.e = -1;
        this.f = -1;
        int iD = defpackage.aefc.d(16, 0.75f);
        this.h = iD;
        this.j = iD;
        this.c = iD - 1;
        this.i = defpackage.aefc.e(iD, 0.75f);
        int i = this.h + 1;
        this.a = new java.lang.Object[i];
        this.b = new java.lang.Object[i];
        this.g = new long[i];
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.lang.ClassNotFoundException, java.io.IOException {
        int i;
        objectInputStream.defaultReadObject();
        int iD = defpackage.aefc.d(this.k, 0.75f);
        this.h = iD;
        this.i = defpackage.aefc.e(iD, 0.75f);
        int i2 = this.h;
        this.c = i2 - 1;
        boolean z = true;
        int i3 = i2 + 1;
        java.lang.Object[] objArr = new java.lang.Object[i3];
        this.a = objArr;
        java.lang.Object[] objArr2 = new java.lang.Object[i3];
        this.b = objArr2;
        long[] jArr = new long[i3];
        this.g = jArr;
        this.f = -1;
        this.e = -1;
        int i4 = this.k;
        int i5 = -1;
        while (true) {
            int i6 = i4 - 1;
            if (i4 == 0) {
                break;
            }
            java.lang.Object object = objectInputStream.readObject();
            java.lang.Object object2 = objectInputStream.readObject();
            if (object != null) {
                int iHashCode = object.hashCode() * (-1640531527);
                int i7 = this.c;
                int i8 = iHashCode ^ (iHashCode >>> 16);
                while (true) {
                    i = i8 & i7;
                    if (objArr[i] == null) {
                        break;
                    }
                    i8 = i + 1;
                    i7 = this.c;
                }
            } else {
                i = this.h;
                this.d = z;
            }
            objArr[i] = object;
            objArr2[i] = object2;
            if (this.e != -1) {
                long j = jArr[i5];
                jArr[i5] = (((((long) i) & 4294967295L) ^ j) & 4294967295L) ^ j;
                long j2 = jArr[i];
                jArr[i] = j2 ^ ((((((long) i5) & 4294967295L) << 32) ^ j2) & (-4294967296L));
            } else {
                this.e = i;
                jArr[i] = jArr[i] | (-4294967296L);
            }
            i4 = i6;
            objArr = objArr;
            i5 = i;
            z = true;
        }
        this.f = i5;
        if (i5 != -1) {
            jArr[i5] = jArr[i5] | 4294967295L;
        }
    }

    private final int u(java.lang.Object obj) {
        java.lang.Object obj2;
        if (obj == null) {
            boolean z = this.d;
            int i = this.h;
            return z ? i : -(i + 1);
        }
        java.lang.Object[] objArr = this.a;
        int iHashCode = obj.hashCode() * (-1640531527);
        int i2 = (iHashCode ^ (iHashCode >>> 16)) & this.c;
        java.lang.Object obj3 = objArr[i2];
        if (obj3 == null) {
            return -(i2 + 1);
        }
        if (!obj.equals(obj3)) {
            do {
                i2 = (i2 + 1) & this.c;
                obj2 = objArr[i2];
                if (obj2 == null) {
                    return -(i2 + 1);
                }
            } while (!obj.equals(obj2));
        }
        return i2;
    }

    private final void v(int i, java.lang.Object obj, java.lang.Object obj2) {
        if (i == this.h) {
            this.d = true;
        }
        this.a[i] = obj;
        this.b[i] = obj2;
        int i2 = this.k;
        if (i2 == 0) {
            this.f = i;
            this.e = i;
            this.g[i] = -1;
        } else {
            long[] jArr = this.g;
            int i3 = this.f;
            long j = jArr[i3];
            jArr[i3] = j ^ (((((long) i) & 4294967295L) ^ j) & 4294967295L);
            jArr[i] = ((((long) i3) & 4294967295L) << 32) | 4294967295L;
            this.f = i;
        }
        this.k = i2 + 1;
        if (i2 >= this.i) {
            o(defpackage.aefc.d(i2 + 2, 0.75f));
        }
    }

    private void writeObject(java.io.ObjectOutputStream objectOutputStream) throws java.io.IOException {
        java.lang.Object[] objArr = this.a;
        java.lang.Object[] objArr2 = this.b;
        defpackage.aeto aetoVar = new defpackage.aeto(this);
        objectOutputStream.defaultWriteObject();
        for (int i = this.k; i != 0; i--) {
            int iC = aetoVar.c();
            objectOutputStream.writeObject(objArr[iC]);
            objectOutputStream.writeObject(objArr2[iC]);
        }
    }

    @Override // defpackage.aero
    /* JADX INFO: renamed from: a */
    public final defpackage.aeuv values() {
        if (this.m == null) {
            this.m = new defpackage.aetn(this);
        }
        return this.m;
    }

    @Override // defpackage.aero
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ defpackage.aevm keySet() {
        return keySet();
    }

    @Override // defpackage.aero, defpackage.aety, java.util.Map
    public final void clear() {
        if (this.k == 0) {
            return;
        }
        this.k = 0;
        this.d = false;
        java.util.Arrays.fill(this.a, (java.lang.Object) null);
        java.util.Arrays.fill(this.b, (java.lang.Object) null);
        this.f = -1;
        this.e = -1;
    }

    @Override // java.util.SortedMap
    public final java.util.Comparator comparator() {
        return null;
    }

    @Override // defpackage.aero, j$.util.Map
    public final java.lang.Object compute(java.lang.Object obj, java.util.function.BiFunction biFunction) {
        biFunction.getClass();
        int iU = u(obj);
        java.lang.Object objApply = biFunction.apply(obj, iU >= 0 ? this.b[iU] : null);
        if (objApply == null) {
            if (iU >= 0) {
                if (obj == null) {
                    j();
                } else {
                    i(iU);
                }
            }
            return null;
        }
        if (iU < 0) {
            v((-iU) - 1, obj, objApply);
            return objApply;
        }
        this.b[iU] = objApply;
        return objApply;
    }

    @Override // defpackage.aero, j$.util.Map
    public final java.lang.Object computeIfPresent(java.lang.Object obj, java.util.function.BiFunction biFunction) {
        java.lang.Object obj2;
        biFunction.getClass();
        int iU = u(obj);
        if (iU < 0 || (obj2 = this.b[iU]) == null) {
            return null;
        }
        java.lang.Object objApply = biFunction.apply(obj, obj2);
        if (objApply != null) {
            this.b[iU] = objApply;
            return objApply;
        }
        if (obj == null) {
            j();
            return null;
        }
        i(iU);
        return null;
    }

    @Override // defpackage.aero, defpackage.aern, defpackage.aefe
    public final boolean containsKey(java.lang.Object obj) {
        java.lang.Object obj2;
        if (obj == null) {
            return this.d;
        }
        java.lang.Object[] objArr = this.a;
        int iHashCode = obj.hashCode() * (-1640531527);
        int i = (iHashCode ^ (iHashCode >>> 16)) & this.c;
        java.lang.Object obj3 = objArr[i];
        if (obj3 == null) {
            return false;
        }
        if (!obj.equals(obj3)) {
            do {
                i = (i + 1) & this.c;
                obj2 = objArr[i];
                if (obj2 == null) {
                    return false;
                }
            } while (!obj.equals(obj2));
        }
        return true;
    }

    @Override // defpackage.aero, java.util.Map
    public final boolean containsValue(java.lang.Object obj) {
        java.lang.Object[] objArr = this.a;
        java.lang.Object[] objArr2 = this.b;
        if (this.d && j$.util.Objects.equals(objArr2[this.h], obj)) {
            return true;
        }
        int i = this.h;
        while (i != 0) {
            i--;
            if (objArr[i] != null && j$.util.Objects.equals(objArr2[i], obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.aerp
    /* JADX INFO: renamed from: f */
    public final defpackage.aevr keySet() {
        if (this.l == null) {
            this.l = new defpackage.aetq(this);
        }
        return this.l;
    }

    @Override // java.util.SortedMap
    public final java.lang.Object firstKey() {
        if (this.k != 0) {
            return this.a[this.e];
        }
        throw new java.util.NoSuchElementException();
    }

    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final defpackage.aetu clone() {
        try {
            defpackage.aetu aetuVar = (defpackage.aetu) super.clone();
            aetuVar.l = null;
            aetuVar.m = null;
            aetuVar.n = null;
            aetuVar.d = this.d;
            aetuVar.a = (java.lang.Object[]) this.a.clone();
            aetuVar.b = (java.lang.Object[]) this.b.clone();
            aetuVar.g = (long[]) this.g.clone();
            return aetuVar;
        } catch (java.lang.CloneNotSupportedException unused) {
            throw new java.lang.InternalError();
        }
    }

    @Override // defpackage.aetk, defpackage.aefe
    public final V get(java.lang.Object obj) {
        java.lang.Object obj2;
        if (obj == null) {
            if (this.d) {
                return (V) this.b[this.h];
            }
            return null;
        }
        java.lang.Object[] objArr = this.a;
        int iHashCode = obj.hashCode() * (-1640531527);
        int i = (iHashCode ^ (iHashCode >>> 16)) & this.c;
        java.lang.Object obj3 = objArr[i];
        if (obj3 == null) {
            return null;
        }
        if (obj.equals(obj3)) {
            return (V) this.b[i];
        }
        do {
            i = (i + 1) & this.c;
            obj2 = objArr[i];
            if (obj2 == null) {
                return null;
            }
        } while (!obj.equals(obj2));
        return (V) this.b[i];
    }

    @Override // defpackage.aero, j$.util.Map
    public final java.lang.Object getOrDefault(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Object obj3;
        if (obj != null) {
            java.lang.Object[] objArr = this.a;
            int iHashCode = obj.hashCode() * (-1640531527);
            int i = (iHashCode ^ (iHashCode >>> 16)) & this.c;
            java.lang.Object obj4 = objArr[i];
            if (obj4 != null) {
                if (obj.equals(obj4)) {
                    return this.b[i];
                }
                do {
                    i = (i + 1) & this.c;
                    obj3 = objArr[i];
                    if (obj3 != null) {
                    }
                } while (!obj.equals(obj3));
                return this.b[i];
            }
        } else if (this.d) {
            return this.b[this.h];
        }
        return obj2;
    }

    @Override // defpackage.aero, java.util.Map
    public final int hashCode() {
        java.lang.Object obj;
        int i;
        java.lang.Object[] objArr = this.a;
        java.lang.Object[] objArr2 = this.b;
        boolean z = this.d;
        int i2 = this.k;
        if (z) {
            i2--;
        }
        int i3 = 0;
        int i4 = 0;
        int iHashCode = 0;
        while (true) {
            int i5 = i2 - 1;
            if (i2 == 0) {
                break;
            }
            while (true) {
                obj = objArr[i3];
                i = i3 + 1;
                if (obj != null) {
                    break;
                }
                i3 = i;
            }
            if (this != obj) {
                iHashCode = obj.hashCode();
            }
            java.lang.Object obj2 = objArr2[i3];
            if (this != obj2) {
                iHashCode = (obj2 == null ? 0 : obj2.hashCode()) ^ iHashCode;
            }
            i4 += iHashCode;
            i2 = i5;
            i3 = i;
        }
        if (!this.d) {
            return i4;
        }
        java.lang.Object obj3 = objArr2[this.h];
        return i4 + (obj3 != null ? obj3.hashCode() : 0);
    }

    @Override // defpackage.aerp, java.util.SortedMap
    public final /* bridge */ /* synthetic */ java.util.SortedMap headMap(java.lang.Object obj) {
        return q();
    }

    public final java.lang.Object i(int i) {
        java.lang.Object obj;
        java.lang.Object[] objArr = this.b;
        java.lang.Object obj2 = objArr[i];
        objArr[i] = null;
        this.k--;
        l(i);
        java.lang.Object[] objArr2 = this.a;
        java.lang.Object[] objArr3 = this.b;
        loop0: while (true) {
            int i2 = (i + 1) & this.c;
            while (true) {
                obj = objArr2[i2];
                if (obj != null) {
                    int iHashCode = obj.hashCode() * (-1640531527);
                    int i3 = this.c;
                    int i4 = (iHashCode ^ (iHashCode >>> 16)) & i3;
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
            objArr2[i] = obj;
            objArr3[i] = objArr3[i2];
            m(i2, i);
            i = i2;
        }
        objArr2[i] = null;
        objArr3[i] = null;
        int i5 = this.h;
        if (i5 > this.j && this.k < this.i / 4 && i5 > 16) {
            o(i5 >> 1);
        }
        return obj2;
    }

    @Override // defpackage.aero, java.util.Map
    public final boolean isEmpty() {
        return this.k == 0;
    }

    public final java.lang.Object j() {
        this.d = false;
        java.lang.Object[] objArr = this.a;
        int i = this.h;
        objArr[i] = null;
        java.lang.Object[] objArr2 = this.b;
        java.lang.Object obj = objArr2[i];
        objArr2[i] = null;
        this.k--;
        l(i);
        int i2 = this.h;
        if (i2 > this.j && this.k < this.i / 4 && i2 > 16) {
            o(i2 >> 1);
        }
        return obj;
    }

    public final java.lang.Object k(int i, java.lang.Object obj) {
        java.lang.Object[] objArr = this.b;
        java.lang.Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    @Override // defpackage.aerp, defpackage.aero, java.util.Map
    public final /* bridge */ /* synthetic */ java.util.Set keySet() {
        return keySet();
    }

    protected final void l(int i) {
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

    @Override // java.util.SortedMap
    public final java.lang.Object lastKey() {
        if (this.k != 0) {
            return this.a[this.f];
        }
        throw new java.util.NoSuchElementException();
    }

    protected final void m(int i, int i2) {
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

    @Override // defpackage.aero, j$.util.Map
    public final java.lang.Object merge(java.lang.Object obj, java.lang.Object obj2, java.util.function.BiFunction biFunction) {
        java.lang.Object obj3;
        biFunction.getClass();
        obj2.getClass();
        int iU = u(obj);
        if (iU < 0 || (obj3 = this.b[iU]) == null) {
            if (iU < 0) {
                v((-iU) - 1, obj, obj2);
                return obj2;
            }
            this.b[iU] = obj2;
            return obj2;
        }
        java.lang.Object objApply = biFunction.apply(obj3, obj2);
        if (objApply != null) {
            this.b[iU] = objApply;
            return objApply;
        }
        if (obj == null) {
            j();
            return null;
        }
        i(iU);
        return null;
    }

    public final void n(int i) {
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

    public final void o(int i) {
        int i2;
        int i3;
        int i4 = i + 1;
        java.lang.Object[] objArr = this.a;
        java.lang.Object[] objArr2 = this.b;
        java.lang.Object[] objArr3 = new java.lang.Object[i4];
        java.lang.Object[] objArr4 = new java.lang.Object[i4];
        int i5 = this.e;
        long[] jArr = this.g;
        long[] jArr2 = new long[i4];
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
            java.lang.Object obj = objArr[i5];
            if (obj != null) {
                int iHashCode = obj.hashCode() * (-1640531527);
                int i10 = iHashCode ^ (iHashCode >>> 16);
                while (true) {
                    i3 = i10 & i2;
                    if (objArr3[i3] == null) {
                        break;
                    } else {
                        i10 = i3 + 1;
                    }
                }
            } else {
                i3 = i;
            }
            objArr3[i3] = objArr[i5];
            objArr4[i3] = objArr2[i5];
            if (i8 != -1) {
                long j = jArr2[i7];
                jArr2[i7] = (((((long) i3) & 4294967295L) ^ j) & 4294967295L) ^ j;
                long j2 = jArr2[i3];
                jArr2[i3] = j2 ^ ((((((long) i7) & 4294967295L) << 32) ^ j2) & (-4294967296L));
            } else {
                this.e = i3;
                jArr2[i3] = -1;
            }
            i8 = i5;
            i7 = i3;
            i6 = i9;
            objArr2 = objArr2;
            i5 = (int) jArr[i5];
            objArr = objArr;
        }
        this.g = jArr2;
        this.f = i7;
        if (i7 != -1) {
            jArr2[i7] = jArr2[i7] | 4294967295L;
        }
        this.h = i;
        this.c = i2;
        this.i = defpackage.aefc.e(i, 0.75f);
        this.a = objArr3;
        this.b = objArr4;
    }

    @Override // defpackage.aeum
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final defpackage.aetr h() {
        defpackage.aetr aetrVar = this.n;
        if (aetrVar != null) {
            return aetrVar;
        }
        defpackage.aetr aetrVar2 = new defpackage.aetr(this);
        this.n = aetrVar2;
        return aetrVar2;
    }

    @Override // defpackage.aero, defpackage.aety, java.util.Map
    public final V put(K k, V v) {
        int iU = u(k);
        if (iU < 0) {
            v((-iU) - 1, k, v);
            return null;
        }
        java.lang.Object[] objArr = this.b;
        V v2 = (V) objArr[iU];
        objArr[iU] = v;
        return v2;
    }

    @Override // defpackage.aero, java.util.Map
    public final void putAll(java.util.Map<? extends K, ? extends V> map) {
        int iMin = (int) java.lang.Math.min(1073741824L, java.lang.Math.max(2L, 1 << (64 - java.lang.Long.numberOfLeadingZeros(((long) java.lang.Math.ceil((this.k + map.size()) / 0.75f)) - 1))));
        if (iMin > this.h) {
            o(iMin);
        }
        super.putAll(map);
    }

    @Override // defpackage.aero, j$.util.Map
    public final java.lang.Object putIfAbsent(java.lang.Object obj, java.lang.Object obj2) {
        int iU = u(obj);
        if (iU >= 0) {
            return this.b[iU];
        }
        v((-iU) - 1, obj, obj2);
        return null;
    }

    @Override // defpackage.aeum
    public final defpackage.aeum q() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // defpackage.aeum
    public final defpackage.aeum r() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // defpackage.aero, j$.util.Map
    public final boolean remove(java.lang.Object obj, java.lang.Object obj2) {
        if (obj == null) {
            if (!this.d || !j$.util.Objects.equals(obj2, this.b[this.h])) {
                return false;
            }
            j();
            return true;
        }
        java.lang.Object[] objArr = this.a;
        int iHashCode = obj.hashCode() * (-1640531527);
        int i = (iHashCode ^ (iHashCode >>> 16)) & this.c;
        java.lang.Object obj3 = objArr[i];
        if (obj3 == null) {
            return false;
        }
        if (obj.equals(obj3) && j$.util.Objects.equals(obj2, this.b[i])) {
            i(i);
            return true;
        }
        while (true) {
            i = (i + 1) & this.c;
            java.lang.Object obj4 = objArr[i];
            if (obj4 == null) {
                return false;
            }
            if (obj.equals(obj4) && j$.util.Objects.equals(obj2, this.b[i])) {
                i(i);
                return true;
            }
        }
    }

    @Override // defpackage.aero, j$.util.Map
    public final boolean replace(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        int iU = u(obj);
        if (iU < 0 || !j$.util.Objects.equals(obj2, this.b[iU])) {
            return false;
        }
        this.b[iU] = obj3;
        return true;
    }

    @Override // defpackage.aeum
    public final defpackage.aeum s() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // defpackage.aern, defpackage.aefe
    public final int size() {
        return this.k;
    }

    @Override // defpackage.aerp, java.util.SortedMap
    public final /* bridge */ /* synthetic */ java.util.SortedMap subMap(java.lang.Object obj, java.lang.Object obj2) {
        return r();
    }

    public final void t(int i) {
        int iNumberOfLeadingZeros = 1 << (32 - java.lang.Integer.numberOfLeadingZeros(((int) java.lang.Math.ceil(i / 0.75f)) - 1));
        if (iNumberOfLeadingZeros >= this.h || this.k > defpackage.aefc.e(iNumberOfLeadingZeros, 0.75f)) {
            return;
        }
        try {
            o(iNumberOfLeadingZeros);
        } catch (java.lang.OutOfMemoryError unused) {
        }
    }

    @Override // defpackage.aerp, java.util.SortedMap
    public final /* bridge */ /* synthetic */ java.util.SortedMap tailMap(java.lang.Object obj) {
        return s();
    }

    @Override // defpackage.aerp, defpackage.aero, java.util.Map
    public final /* bridge */ /* synthetic */ java.util.Collection values() {
        return values();
    }

    @Override // defpackage.aero, j$.util.Map
    public final java.lang.Object replace(java.lang.Object obj, java.lang.Object obj2) {
        int iU = u(obj);
        if (iU < 0) {
            return null;
        }
        java.lang.Object[] objArr = this.b;
        java.lang.Object obj3 = objArr[iU];
        objArr[iU] = obj2;
        return obj3;
    }

    public aetu() {
        throw null;
    }

    @Override // defpackage.aero, defpackage.aety, java.util.Map
    public final V remove(java.lang.Object obj) {
        java.lang.Object obj2;
        if (obj == null) {
            if (this.d) {
                return (V) j();
            }
            return null;
        }
        java.lang.Object[] objArr = this.a;
        int iHashCode = obj.hashCode() * (-1640531527);
        int i = (iHashCode ^ (iHashCode >>> 16)) & this.c;
        java.lang.Object obj3 = objArr[i];
        if (obj3 == null) {
            return null;
        }
        if (!obj.equals(obj3)) {
            do {
                i = (i + 1) & this.c;
                obj2 = objArr[i];
                if (obj2 == null) {
                    return null;
                }
            } while (!obj.equals(obj2));
            return (V) i(i);
        }
        return (V) i(i);
    }
}
