package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aeif<V> extends defpackage.aehg<V> implements java.io.Serializable, java.lang.Cloneable {
    private static final long serialVersionUID = 0;
    protected transient int[] a;
    protected transient java.lang.Object[] b;
    protected transient int c;
    protected transient boolean d;
    protected transient int e;
    protected transient int f;
    protected transient long[] g;
    protected transient int h;
    protected transient int i;
    protected final transient int j;
    protected int k;
    protected transient defpackage.aelk l;
    protected transient defpackage.aeuv m;
    protected transient defpackage.aeic n;

    public aeif(byte[] bArr) {
        this.e = -1;
        this.f = -1;
        int iD = defpackage.aefc.d(16, 0.75f);
        this.h = iD;
        this.j = iD;
        this.c = iD - 1;
        this.i = defpackage.aefc.e(iD, 0.75f);
        int i = this.h + 1;
        this.a = new int[i];
        this.b = new java.lang.Object[i];
        this.g = new long[i];
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.lang.ClassNotFoundException, java.io.IOException {
        int i;
        int i2;
        int i3;
        objectInputStream.defaultReadObject();
        int iD = defpackage.aefc.d(this.k, 0.75f);
        this.h = iD;
        this.i = defpackage.aefc.e(iD, 0.75f);
        int i4 = this.h;
        this.c = i4 - 1;
        boolean z = true;
        int i5 = i4 + 1;
        int[] iArr = new int[i5];
        this.a = iArr;
        java.lang.Object[] objArr = new java.lang.Object[i5];
        this.b = objArr;
        long[] jArr = new long[i5];
        this.g = jArr;
        this.f = -1;
        this.e = -1;
        int i6 = this.k;
        int i7 = -1;
        while (true) {
            int i8 = i6 - 1;
            if (i6 == 0) {
                break;
            }
            int i9 = objectInputStream.readInt();
            java.lang.Object object = objectInputStream.readObject();
            if (i9 == 0) {
                i3 = this.h;
                this.d = z;
                i2 = 0;
            } else {
                int i10 = this.c;
                int i11 = (-1640531527) * i9;
                int i12 = i11 ^ (i11 >>> 16);
                while (true) {
                    i = i10 & i12;
                    if (iArr[i] == 0) {
                        break;
                    }
                    i10 = i + 1;
                    i12 = this.c;
                }
                i2 = i9;
                i3 = i;
            }
            iArr[i3] = i2;
            objArr[i3] = object;
            if (this.e != -1) {
                long j = jArr[i7];
                jArr[i7] = (((((long) i3) & 4294967295L) ^ j) & 4294967295L) ^ j;
                long j2 = jArr[i3];
                jArr[i3] = j2 ^ ((((4294967295L & ((long) i7)) << 32) ^ j2) & (-4294967296L));
            } else {
                this.e = i3;
                jArr[i3] = jArr[i3] | (-4294967296L);
            }
            i7 = i3;
            i6 = i8;
            iArr = iArr;
            z = true;
        }
        this.f = i7;
        if (i7 != -1) {
            jArr[i7] = jArr[i7] | 4294967295L;
        }
    }

    private void writeObject(java.io.ObjectOutputStream objectOutputStream) throws java.io.IOException {
        int[] iArr = this.a;
        java.lang.Object[] objArr = this.b;
        defpackage.aehy aehyVar = new defpackage.aehy(this);
        objectOutputStream.defaultWriteObject();
        for (int i = this.k; i != 0; i--) {
            int iG = aehyVar.g();
            objectOutputStream.writeInt(iArr[iG]);
            objectOutputStream.writeObject(objArr[iG]);
        }
    }

    @Override // defpackage.aeiz
    public final defpackage.aeiz A() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // defpackage.aeiz
    public final defpackage.aeiz B() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // defpackage.aeiz
    public final defpackage.aeiz C() {
        throw new java.lang.UnsupportedOperationException();
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001a A[EDGE_INSN: B:9:0x001a->B:15:0x002b BREAK  A[LOOP:0: B:11:0x0020->B:32:?], PHI: r2
  0x001a: PHI (r2v14 int) = (r2v1 int), (r2v4 int), (r2v17 int) binds: [B:8:0x0018, B:30:0x001a, B:5:0x0007] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.aehe, defpackage.aehu
    public final java.lang.Object a(int i, java.lang.Object obj) {
        int i2;
        int i3;
        if (i != 0) {
            int[] iArr = this.a;
            int i4 = (-1640531527) * i;
            i2 = this.c & (i4 ^ (i4 >>> 16));
            int i5 = iArr[i2];
            if (i5 == 0) {
                i2 = -(i2 + 1);
                break;
            }
            if (i != i5) {
                do {
                    i2 = (i2 + 1) & this.c;
                    i3 = iArr[i2];
                    if (i3 == 0) {
                        i2 = -(i2 + 1);
                        break;
                    }
                } while (i != i3);
            }
        } else {
            boolean z = this.d;
            i2 = this.h;
            if (!z) {
                i2 = -(i2 + 1);
                break;
            }
        }
        if (i2 >= 0) {
            java.lang.Object[] objArr = this.b;
            java.lang.Object obj2 = objArr[i2];
            objArr[i2] = obj;
            return obj2;
        }
        int i6 = (-i2) - 1;
        if (i6 == this.h) {
            this.d = true;
        }
        this.a[i6] = i;
        this.b[i6] = obj;
        int i7 = this.k;
        if (i7 == 0) {
            this.f = i6;
            this.e = i6;
            this.g[i6] = -1;
        } else {
            long[] jArr = this.g;
            int i8 = this.f;
            long j = jArr[i8];
            jArr[i8] = j ^ (((((long) i6) & 4294967295L) ^ j) & 4294967295L);
            jArr[i6] = ((((long) i8) & 4294967295L) << 32) | 4294967295L;
            this.f = i6;
        }
        this.k = i7 + 1;
        if (i7 < this.i) {
            return null;
        }
        y(defpackage.aefc.d(i7 + 2, 0.75f));
        return null;
    }

    @Override // defpackage.aehe, defpackage.aehu
    public final java.lang.Object b(int i) {
        int i2;
        if (i == 0) {
            if (this.d) {
                return v();
            }
            return null;
        }
        int[] iArr = this.a;
        int i3 = (-1640531527) * i;
        int i4 = this.c & (i3 ^ (i3 >>> 16));
        int i5 = iArr[i4];
        if (i5 == 0) {
            return null;
        }
        if (i == i5) {
            return u(i4);
        }
        do {
            i4 = (i4 + 1) & this.c;
            i2 = iArr[i4];
            if (i2 == 0) {
                return null;
            }
        } while (i != i2);
        return u(i4);
    }

    @Override // defpackage.aehf, defpackage.aehe, defpackage.aehu
    public final boolean c(int i) {
        int i2;
        if (i == 0) {
            return this.d;
        }
        int[] iArr = this.a;
        int i3 = (-1640531527) * i;
        int i4 = this.c & (i3 ^ (i3 >>> 16));
        int i5 = iArr[i4];
        if (i5 == 0) {
            return false;
        }
        if (i != i5) {
            do {
                i4 = (i4 + 1) & this.c;
                i2 = iArr[i4];
                if (i2 == 0) {
                    return false;
                }
            } while (i != i2);
        }
        return true;
    }

    @Override // defpackage.aehf, defpackage.aeij, java.util.Map
    public final void clear() {
        if (this.k == 0) {
            return;
        }
        this.k = 0;
        this.d = false;
        java.util.Arrays.fill(this.a, 0);
        java.util.Arrays.fill(this.b, (java.lang.Object) null);
        this.f = -1;
        this.e = -1;
    }

    @Override // defpackage.aehg, java.util.SortedMap
    public final /* bridge */ /* synthetic */ java.util.Comparator<? super java.lang.Integer> comparator() {
        return null;
    }

    @Override // defpackage.aehf, java.util.Map
    public final boolean containsValue(java.lang.Object obj) {
        int[] iArr = this.a;
        java.lang.Object[] objArr = this.b;
        if (this.d && j$.util.Objects.equals(objArr[this.h], obj)) {
            return true;
        }
        int i = this.h;
        while (i != 0) {
            i--;
            if (iArr[i] != 0 && j$.util.Objects.equals(objArr[i], obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.aehf
    /* JADX INFO: renamed from: d */
    public final /* bridge */ /* synthetic */ defpackage.aelf keySet() {
        return keySet();
    }

    @Override // defpackage.aehg, defpackage.aehf, defpackage.aeij
    /* JADX INFO: renamed from: e */
    public final defpackage.aeuv values() {
        if (this.m == null) {
            this.m = new defpackage.aehx(this);
        }
        return this.m;
    }

    @Override // defpackage.aehf, java.util.Map
    public final int hashCode() {
        int iHashCode;
        int i;
        int[] iArr = this.a;
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
                iHashCode = iArr[i3];
                i = i3 + 1;
                if (iHashCode != 0) {
                    break;
                }
                i3 = i;
            }
            java.lang.Object obj = objArr[i3];
            if (this != obj) {
                iHashCode ^= obj == null ? 0 : obj.hashCode();
            }
            i4 += iHashCode;
            i2 = i5;
            i3 = i;
        }
        if (!this.d) {
            return i4;
        }
        java.lang.Object obj2 = objArr[this.h];
        return i4 + (obj2 != null ? obj2.hashCode() : 0);
    }

    @Override // defpackage.aehf, java.util.Map
    public final boolean isEmpty() {
        return this.k == 0;
    }

    @Override // defpackage.aehg
    /* JADX INFO: renamed from: k */
    public final defpackage.aelk keySet() {
        if (this.l == null) {
            this.l = new defpackage.aeib(this);
        }
        return this.l;
    }

    @Override // defpackage.aehg, defpackage.aehf, java.util.Map
    public final /* bridge */ /* synthetic */ java.util.Set<java.lang.Integer> keySet() {
        return keySet();
    }

    @Override // defpackage.aehu
    public final java.lang.Object p(int i) {
        int i2;
        if (i == 0) {
            if (this.d) {
                return this.b[this.h];
            }
            return null;
        }
        int[] iArr = this.a;
        int i3 = (-1640531527) * i;
        int i4 = this.c & (i3 ^ (i3 >>> 16));
        int i5 = iArr[i4];
        if (i5 == 0) {
            return null;
        }
        if (i == i5) {
            return this.b[i4];
        }
        do {
            i4 = (i4 + 1) & this.c;
            i2 = iArr[i4];
            if (i2 == 0) {
                return null;
            }
        } while (i != i2);
        return this.b[i4];
    }

    @Override // defpackage.aehf, java.util.Map
    public final void putAll(java.util.Map<? extends java.lang.Integer, ? extends V> map) {
        int iMin = (int) java.lang.Math.min(1073741824L, java.lang.Math.max(2L, 1 << (64 - java.lang.Long.numberOfLeadingZeros(((long) java.lang.Math.ceil((this.k + map.size()) / 0.75f)) - 1))));
        if (iMin > this.h) {
            y(iMin);
        }
        super.putAll(map);
    }

    @Override // defpackage.aeiz
    public final int q() {
        if (this.k != 0) {
            return this.a[this.e];
        }
        throw new java.util.NoSuchElementException();
    }

    @Override // defpackage.aeiz
    public final int r() {
        if (this.k != 0) {
            return this.a[this.f];
        }
        throw new java.util.NoSuchElementException();
    }

    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public final defpackage.aeif clone() {
        try {
            defpackage.aeif aeifVar = (defpackage.aeif) super.clone();
            aeifVar.l = null;
            aeifVar.m = null;
            aeifVar.n = null;
            aeifVar.d = this.d;
            aeifVar.a = (int[]) this.a.clone();
            aeifVar.b = (java.lang.Object[]) this.b.clone();
            aeifVar.g = (long[]) this.g.clone();
            return aeifVar;
        } catch (java.lang.CloneNotSupportedException unused) {
            throw new java.lang.InternalError();
        }
    }

    @Override // defpackage.aehe, defpackage.aefe
    public final int size() {
        return this.k;
    }

    public final java.lang.Object u(int i) {
        int i2;
        java.lang.Object[] objArr = this.b;
        java.lang.Object obj = objArr[i];
        objArr[i] = null;
        this.k--;
        w(i);
        int[] iArr = this.a;
        java.lang.Object[] objArr2 = this.b;
        loop0: while (true) {
            int i3 = (i + 1) & this.c;
            while (true) {
                i2 = iArr[i3];
                if (i2 != 0) {
                    int i4 = this.c;
                    int i5 = (-1640531527) * i2;
                    int i6 = (i5 ^ (i5 >>> 16)) & i4;
                    if (i > i3) {
                        if (i >= i6 && i6 > i3) {
                            break;
                        }
                        i3 = (i3 + 1) & i4;
                    } else {
                        if (i >= i6 || i6 > i3) {
                            break;
                        }
                        i3 = (i3 + 1) & i4;
                    }
                } else {
                    break loop0;
                }
            }
            iArr[i] = i2;
            objArr2[i] = objArr2[i3];
            x(i3, i);
            i = i3;
        }
        iArr[i] = 0;
        objArr2[i] = null;
        int i7 = this.h;
        if (i7 > this.j && this.k < this.i / 4 && i7 > 16) {
            y(i7 >> 1);
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
        w(i);
        int i2 = this.h;
        if (i2 > this.j && this.k < this.i / 4 && i2 > 16) {
            y(i2 >> 1);
        }
        return obj;
    }

    @Override // defpackage.aehg, defpackage.aehf, java.util.Map
    public final /* bridge */ /* synthetic */ java.util.Collection values() {
        return values();
    }

    protected final void w(int i) {
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

    protected final void x(int i, int i2) {
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

    protected final void y(int i) {
        int i2;
        int i3;
        int i4 = i + 1;
        int[] iArr = this.a;
        java.lang.Object[] objArr = this.b;
        int[] iArr2 = new int[i4];
        java.lang.Object[] objArr2 = new java.lang.Object[i4];
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
            int i10 = iArr[i5];
            if (i10 != 0) {
                int i11 = i10 * (-1640531527);
                int i12 = i11 ^ (i11 >>> 16);
                while (true) {
                    i3 = i12 & i2;
                    if (iArr2[i3] == 0) {
                        break;
                    } else {
                        i12 = i3 + 1;
                    }
                }
            } else {
                i3 = i;
            }
            iArr2[i3] = iArr[i5];
            objArr2[i3] = objArr[i5];
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
            objArr = objArr;
            i5 = (int) jArr[i5];
            iArr = iArr;
        }
        this.g = jArr2;
        this.f = i7;
        if (i7 != -1) {
            jArr2[i7] = jArr2[i7] | 4294967295L;
        }
        this.h = i;
        this.c = i2;
        this.i = defpackage.aefc.e(i, 0.75f);
        this.a = iArr2;
        this.b = objArr2;
    }

    @Override // defpackage.aeiz
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final defpackage.aeic t() {
        defpackage.aeic aeicVar = this.n;
        if (aeicVar != null) {
            return aeicVar;
        }
        defpackage.aeic aeicVar2 = new defpackage.aeic(this);
        this.n = aeicVar2;
        return aeicVar2;
    }

    public aeif() {
        throw null;
    }
}
