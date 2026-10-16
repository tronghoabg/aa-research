package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aeiy<V> extends defpackage.aehf<V> implements java.io.Serializable, java.lang.Cloneable {
    private static final long serialVersionUID = 0;
    protected transient int[] a;
    protected transient java.lang.Object[] b;
    protected transient int c;
    protected transient boolean d;
    protected transient int e;
    protected transient int f;
    protected final transient int g;
    public int h;
    protected transient defpackage.aeii i;
    protected transient defpackage.aelf j;
    protected transient defpackage.aeuv k;

    public aeiy(int i) {
        if (i < 0) {
            throw new java.lang.IllegalArgumentException("The expected number of elements must be nonnegative");
        }
        int iD = defpackage.aefc.d(i, 0.75f);
        this.e = iD;
        this.g = iD;
        this.c = iD - 1;
        this.f = defpackage.aefc.e(iD, 0.75f);
        int i2 = this.e + 1;
        this.a = new int[i2];
        this.b = new java.lang.Object[i2];
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.lang.ClassNotFoundException, java.io.IOException {
        int i;
        int i2;
        int i3;
        objectInputStream.defaultReadObject();
        int iD = defpackage.aefc.d(this.h, 0.75f);
        this.e = iD;
        this.f = defpackage.aefc.e(iD, 0.75f);
        int i4 = this.e;
        this.c = i4 - 1;
        int i5 = i4 + 1;
        int[] iArr = new int[i5];
        this.a = iArr;
        java.lang.Object[] objArr = new java.lang.Object[i5];
        this.b = objArr;
        int i6 = this.h;
        while (true) {
            int i7 = i6 - 1;
            if (i6 == 0) {
                return;
            }
            int i8 = objectInputStream.readInt();
            java.lang.Object object = objectInputStream.readObject();
            if (i8 == 0) {
                i3 = this.e;
                this.d = true;
                i2 = 0;
            } else {
                int i9 = this.c;
                int i10 = (-1640531527) * i8;
                int i11 = i10 ^ (i10 >>> 16);
                while (true) {
                    i = i9 & i11;
                    if (iArr[i] == 0) {
                        break;
                    }
                    i9 = i + 1;
                    i11 = this.c;
                }
                i2 = i8;
                i3 = i;
            }
            iArr[i3] = i2;
            objArr[i3] = object;
            i6 = i7;
        }
    }

    private void writeObject(java.io.ObjectOutputStream objectOutputStream) throws java.io.IOException {
        int[] iArr = this.a;
        java.lang.Object[] objArr = this.b;
        defpackage.aein aeinVar = new defpackage.aein(this);
        objectOutputStream.defaultWriteObject();
        for (int i = this.h; i != 0; i--) {
            int iB = aeinVar.b();
            objectOutputStream.writeInt(iArr[iB]);
            objectOutputStream.writeObject(objArr[iB]);
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001a A[EDGE_INSN: B:9:0x001a->B:15:0x002b BREAK  A[LOOP:0: B:11:0x0020->B:28:?], PHI: r2
  0x001a: PHI (r2v7 int) = (r2v1 int), (r2v4 int), (r2v10 int) binds: [B:8:0x0018, B:26:0x001a, B:5:0x0007] A[DONT_GENERATE, DONT_INLINE]] */
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
            i2 = this.e;
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
        if (i6 == this.e) {
            this.d = true;
        }
        this.a[i6] = i;
        this.b[i6] = obj;
        int i7 = this.h;
        this.h = i7 + 1;
        if (i7 < this.f) {
            return null;
        }
        n(defpackage.aefc.d(i7 + 2, 0.75f));
        return null;
    }

    @Override // defpackage.aehe, defpackage.aehu
    public final java.lang.Object b(int i) {
        int i2;
        if (i == 0) {
            if (this.d) {
                return m();
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
            return k(i4);
        }
        do {
            i4 = (i4 + 1) & this.c;
            i2 = iArr[i4];
            if (i2 == 0) {
                return null;
            }
        } while (i != i2);
        return k(i4);
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
        if (this.h == 0) {
            return;
        }
        this.h = 0;
        this.d = false;
        java.util.Arrays.fill(this.a, 0);
        java.util.Arrays.fill(this.b, (java.lang.Object) null);
    }

    @Override // defpackage.aehf, java.util.Map
    public final boolean containsValue(java.lang.Object obj) {
        int[] iArr = this.a;
        java.lang.Object[] objArr = this.b;
        if (this.d && j$.util.Objects.equals(objArr[this.e], obj)) {
            return true;
        }
        int i = this.e;
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
    public final defpackage.aelf keySet() {
        if (this.j == null) {
            this.j = new defpackage.aeiq(this);
        }
        return this.j;
    }

    @Override // defpackage.aehf, defpackage.aeij
    /* JADX INFO: renamed from: e */
    public final defpackage.aeuv values() {
        if (this.k == null) {
            this.k = new defpackage.aeim(this);
        }
        return this.k;
    }

    public final int h() {
        boolean z = this.d;
        int i = this.h;
        return z ? i - 1 : i;
    }

    @Override // defpackage.aehf, java.util.Map
    public final int hashCode() {
        int iHashCode;
        int i;
        int[] iArr = this.a;
        java.lang.Object[] objArr = this.b;
        int iH = h();
        int i2 = 0;
        int i3 = 0;
        while (iH != 0) {
            while (true) {
                iHashCode = iArr[i2];
                i = i2 + 1;
                if (iHashCode != 0) {
                    break;
                }
                i2 = i;
            }
            java.lang.Object obj = objArr[i2];
            if (this != obj) {
                iHashCode ^= obj == null ? 0 : obj.hashCode();
            }
            i3 += iHashCode;
            iH--;
            i2 = i;
        }
        if (!this.d) {
            return i3;
        }
        java.lang.Object obj2 = objArr[this.e];
        return i3 + (obj2 != null ? obj2.hashCode() : 0);
    }

    @Override // defpackage.aeij
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final defpackage.aeii l() {
        if (this.i == null) {
            this.i = new defpackage.aeit(this);
        }
        return this.i;
    }

    @Override // defpackage.aehf, java.util.Map
    public final boolean isEmpty() {
        return this.h == 0;
    }

    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public final defpackage.aeiy clone() {
        try {
            defpackage.aeiy aeiyVar = (defpackage.aeiy) super.clone();
            aeiyVar.j = null;
            aeiyVar.k = null;
            aeiyVar.i = null;
            aeiyVar.d = this.d;
            aeiyVar.a = (int[]) this.a.clone();
            aeiyVar.b = (java.lang.Object[]) this.b.clone();
            return aeiyVar;
        } catch (java.lang.CloneNotSupportedException unused) {
            throw new java.lang.InternalError();
        }
    }

    public final java.lang.Object k(int i) {
        int i2;
        java.lang.Object[] objArr = this.b;
        java.lang.Object obj = objArr[i];
        objArr[i] = null;
        this.h--;
        int[] iArr = this.a;
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
            objArr[i] = objArr[i3];
            i = i3;
        }
        iArr[i] = 0;
        objArr[i] = null;
        int i7 = this.e;
        if (i7 > this.g && this.h < this.f / 4 && i7 > 16) {
            n(i7 >> 1);
        }
        return obj;
    }

    @Override // defpackage.aehf, java.util.Map
    public final /* bridge */ /* synthetic */ java.util.Set<java.lang.Integer> keySet() {
        return keySet();
    }

    public final java.lang.Object m() {
        this.d = false;
        java.lang.Object[] objArr = this.b;
        int i = this.e;
        java.lang.Object obj = objArr[i];
        objArr[i] = null;
        int i2 = this.h - 1;
        this.h = i2;
        if (i > this.g && i2 < this.f / 4 && i > 16) {
            n(i >> 1);
        }
        return obj;
    }

    protected final void n(int i) {
        int i2;
        int i3 = i + 1;
        int[] iArr = this.a;
        java.lang.Object[] objArr = this.b;
        int[] iArr2 = new int[i3];
        java.lang.Object[] objArr2 = new java.lang.Object[i3];
        int i4 = this.e;
        int iH = h();
        while (true) {
            int i5 = i - 1;
            if (iH == 0) {
                objArr2[i] = objArr[this.e];
                this.e = i;
                this.c = i5;
                this.f = defpackage.aefc.e(i, 0.75f);
                this.a = iArr2;
                this.b = objArr2;
                return;
            }
            do {
                i4--;
                i2 = iArr[i4];
            } while (i2 == 0);
            int i6 = i2 * (-1640531527);
            int i7 = (i6 ^ (i6 >>> 16)) & i5;
            if (iArr2[i7] != 0) {
                do {
                    i7 = (i7 + 1) & i5;
                } while (iArr2[i7] != 0);
            }
            iArr2[i7] = iArr[i4];
            objArr2[i7] = objArr[i4];
            iH--;
        }
    }

    @Override // defpackage.aehu
    public final java.lang.Object p(int i) {
        int i2;
        if (i == 0) {
            if (this.d) {
                return this.b[this.e];
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
        int iMin = (int) java.lang.Math.min(1073741824L, java.lang.Math.max(2L, 1 << (64 - java.lang.Long.numberOfLeadingZeros(((long) java.lang.Math.ceil((this.h + map.size()) / 0.75f)) - 1))));
        if (iMin > this.e) {
            n(iMin);
        }
        super.putAll(map);
    }

    @Override // defpackage.aehe, defpackage.aefe
    public final int size() {
        return this.h;
    }

    @Override // defpackage.aehf, java.util.Map
    public final /* bridge */ /* synthetic */ java.util.Collection values() {
        return values();
    }

    public aeiy() {
        throw null;
    }
}
