package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aepp<V> extends defpackage.aemc<V> implements java.io.Serializable, java.lang.Cloneable {
    private static final long serialVersionUID = 0;
    protected transient long[] a;
    protected transient java.lang.Object[] b;
    protected transient int c;
    protected transient boolean d;
    protected transient int e;
    protected transient int f;
    protected final transient int g;
    protected int h;
    protected transient defpackage.aeqx i;
    protected transient defpackage.aeyk j;
    protected transient defpackage.aepk k;

    public aepp(byte[] bArr) {
        int iD = defpackage.aefc.d(16, 0.75f);
        this.e = iD;
        this.g = iD;
        this.c = iD - 1;
        this.f = defpackage.aefc.e(iD, 0.75f);
        int i = this.e + 1;
        this.a = new long[i];
        this.b = new java.lang.Object[i];
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.lang.ClassNotFoundException, java.io.IOException {
        int i;
        int i2;
        objectInputStream.defaultReadObject();
        int iD = defpackage.aefc.d(this.h, 0.75f);
        this.e = iD;
        this.f = defpackage.aefc.e(iD, 0.75f);
        int i3 = this.e;
        this.c = i3 - 1;
        int i4 = i3 + 1;
        long[] jArr = new long[i4];
        this.a = jArr;
        java.lang.Object[] objArr = new java.lang.Object[i4];
        this.b = objArr;
        int i5 = this.h;
        while (true) {
            int i6 = i5 - 1;
            if (i5 == 0) {
                return;
            }
            long j = objectInputStream.readLong();
            java.lang.Object object = objectInputStream.readObject();
            long j2 = 0;
            if (j == 0) {
                i2 = this.e;
                this.d = true;
            } else {
                int i7 = this.c;
                long j3 = (-7046029254386353131L) * j;
                long j4 = j3 ^ (j3 >>> 32);
                int i8 = (int) (j4 ^ (j4 >>> 16));
                while (true) {
                    i = i7 & i8;
                    if (jArr[i] == 0) {
                        break;
                    }
                    i7 = i + 1;
                    i8 = this.c;
                }
                j2 = j;
                i2 = i;
            }
            jArr[i2] = j2;
            objArr[i2] = object;
            i5 = i6;
        }
    }

    private void writeObject(java.io.ObjectOutputStream objectOutputStream) throws java.io.IOException {
        long[] jArr = this.a;
        java.lang.Object[] objArr = this.b;
        defpackage.aepe aepeVar = new defpackage.aepe(this);
        objectOutputStream.defaultWriteObject();
        for (int i = this.h; i != 0; i--) {
            int iB = aepeVar.b();
            objectOutputStream.writeLong(jArr[iB]);
            objectOutputStream.writeObject(objArr[iB]);
        }
    }

    @Override // defpackage.aemb, defpackage.aeow
    public final java.lang.Object a(long j, java.lang.Object obj) {
        int i;
        if (j == 0) {
            boolean z = this.d;
            i = this.e;
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
        if (i3 == this.e) {
            this.d = true;
        }
        this.a[i3] = j;
        this.b[i3] = obj;
        int i4 = this.h;
        this.h = i4 + 1;
        if (i4 < this.f) {
            return null;
        }
        n(defpackage.aefc.d(i4 + 2, 0.75f));
        return null;
    }

    @Override // defpackage.aemb, defpackage.aeow
    public final java.lang.Object b(long j) {
        long j2;
        if (j == 0) {
            if (this.d) {
                return m();
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
            return l(i);
        }
        do {
            i = (i + 1) & this.c;
            j2 = jArr[i];
            if (j2 == 0) {
                return null;
            }
        } while (j != j2);
        return l(i);
    }

    @Override // defpackage.aemc, defpackage.aemb, defpackage.aeow
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

    @Override // defpackage.aemc, defpackage.aepa, java.util.Map
    public final void clear() {
        if (this.h == 0) {
            return;
        }
        this.h = 0;
        this.d = false;
        java.util.Arrays.fill(this.a, 0L);
        java.util.Arrays.fill(this.b, (java.lang.Object) null);
    }

    @Override // defpackage.aemc, java.util.Map
    public final boolean containsValue(java.lang.Object obj) {
        long[] jArr = this.a;
        java.lang.Object[] objArr = this.b;
        if (this.d && objArr[this.e] == obj) {
            return true;
        }
        int i = this.e;
        while (i != 0) {
            i--;
            if (jArr[i] != 0 && objArr[i] == obj) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.aemc
    /* JADX INFO: renamed from: d */
    public final defpackage.aeqx keySet() {
        if (this.i == null) {
            this.i = new defpackage.aeph(this);
        }
        return this.i;
    }

    @Override // defpackage.aemc, defpackage.aepa
    /* JADX INFO: renamed from: f */
    public final defpackage.aeyk values() {
        if (this.j == null) {
            this.j = new defpackage.aepd(this);
        }
        return this.j;
    }

    @Override // defpackage.aeow
    public final java.lang.Object h(long j) {
        long j2;
        if (j == 0) {
            if (this.d) {
                return this.b[this.e];
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

    @Override // defpackage.aemc, java.util.Map
    public final int hashCode() {
        long j;
        int i;
        long[] jArr = this.a;
        java.lang.Object[] objArr = this.b;
        int iJ = j();
        int i2 = 0;
        int i3 = 0;
        while (iJ != 0) {
            while (true) {
                j = jArr[i2];
                i = i2 + 1;
                if (j != 0) {
                    break;
                }
                i2 = i;
            }
            java.lang.Object obj = objArr[i2];
            int iF = defpackage.a.f(j);
            if (this != obj) {
                iF ^= obj == null ? 0 : java.lang.System.identityHashCode(obj);
            }
            i3 += iF;
            iJ--;
            i2 = i;
        }
        if (!this.d) {
            return i3;
        }
        java.lang.Object obj2 = objArr[this.e];
        return i3 + (obj2 != null ? java.lang.System.identityHashCode(obj2) : 0);
    }

    @Override // defpackage.aepa
    public final /* bridge */ /* synthetic */ defpackage.aevm i() {
        defpackage.aepk aepkVar = this.k;
        if (aepkVar != null) {
            return aepkVar;
        }
        defpackage.aepk aepkVar2 = new defpackage.aepk(this);
        this.k = aepkVar2;
        return aepkVar2;
    }

    @Override // defpackage.aemc, java.util.Map
    public final boolean isEmpty() {
        return this.h == 0;
    }

    public final int j() {
        boolean z = this.d;
        int i = this.h;
        return z ? i - 1 : i;
    }

    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public final defpackage.aepp clone() {
        try {
            defpackage.aepp aeppVar = (defpackage.aepp) super.clone();
            aeppVar.i = null;
            aeppVar.j = null;
            aeppVar.k = null;
            aeppVar.d = this.d;
            aeppVar.a = (long[]) this.a.clone();
            aeppVar.b = (java.lang.Object[]) this.b.clone();
            return aeppVar;
        } catch (java.lang.CloneNotSupportedException unused) {
            throw new java.lang.InternalError();
        }
    }

    @Override // defpackage.aemc, java.util.Map
    public final /* bridge */ /* synthetic */ java.util.Set<java.lang.Long> keySet() {
        return keySet();
    }

    public final java.lang.Object l(int i) {
        long j;
        java.lang.Object[] objArr = this.b;
        java.lang.Object obj = objArr[i];
        objArr[i] = null;
        this.h--;
        long[] jArr = this.a;
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
            objArr[i] = objArr[i2];
            i = i2;
        }
        jArr[i] = 0;
        objArr[i] = null;
        int i5 = this.e;
        if (i5 > this.g && this.h < this.f / 4 && i5 > 16) {
            n(i5 >> 1);
        }
        return obj;
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
        long j;
        int i2 = i + 1;
        long[] jArr = this.a;
        java.lang.Object[] objArr = this.b;
        long[] jArr2 = new long[i2];
        java.lang.Object[] objArr2 = new java.lang.Object[i2];
        int i3 = this.e;
        int iJ = j();
        while (true) {
            int i4 = i - 1;
            if (iJ == 0) {
                objArr2[i] = objArr[this.e];
                this.e = i;
                this.c = i4;
                this.f = defpackage.aefc.e(i, 0.75f);
                this.a = jArr2;
                this.b = objArr2;
                return;
            }
            do {
                i3--;
                j = jArr[i3];
            } while (j == 0);
            long j2 = j * (-7046029254386353131L);
            long j3 = j2 ^ (j2 >>> 32);
            int i5 = ((int) (j3 ^ (j3 >>> 16))) & i4;
            if (jArr2[i5] != 0) {
                do {
                    i5 = (i5 + 1) & i4;
                } while (jArr2[i5] != 0);
            }
            jArr2[i5] = jArr[i3];
            objArr2[i5] = objArr[i3];
            iJ--;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.aemc, java.util.Map
    public final void putAll(java.util.Map<? extends java.lang.Long, ? extends V> map) {
        int iMin = (int) java.lang.Math.min(1073741824L, java.lang.Math.max(2L, 1 << (64 - java.lang.Long.numberOfLeadingZeros(((long) java.lang.Math.ceil((this.h + map.size()) / 0.75f)) - 1))));
        if (iMin > this.e) {
            n(iMin);
        }
        if (map instanceof defpackage.aepa) {
            defpackage.aeuy aeuyVarA = defpackage.aepc.a((defpackage.aepa) map);
            while (aeuyVarA.hasNext()) {
                defpackage.aepj aepjVar = (defpackage.aepj) aeuyVarA.next();
                a(aepjVar.a(), aepjVar.getValue());
            }
            return;
        }
        int size = map.size();
        java.util.Iterator<java.util.Map.Entry<? extends java.lang.Long, ? extends V>> it = map.entrySet().iterator();
        while (size != 0) {
            size--;
            java.util.Map.Entry<? extends java.lang.Long, ? extends V> next = it.next();
            defpackage.adrq.an(this, next.getKey(), next.getValue());
        }
    }

    @Override // defpackage.aemb, defpackage.aefe
    public final int size() {
        return this.h;
    }

    @Override // defpackage.aemc, java.util.Map
    public final /* bridge */ /* synthetic */ java.util.Collection values() {
        return values();
    }

    public aepp() {
        throw null;
    }
}
