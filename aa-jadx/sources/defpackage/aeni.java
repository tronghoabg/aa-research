package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aeni extends defpackage.aelv implements java.io.Serializable, java.lang.Cloneable {
    private static final long serialVersionUID = 0;
    protected transient long[] a;
    protected transient int[] b;
    protected transient int c;
    protected transient boolean d;
    protected transient int e;
    protected transient int f;
    protected final transient int g;
    public int h;
    protected transient defpackage.aeqx i;
    protected transient defpackage.aekf j;
    protected transient defpackage.aend k;

    public aeni(byte[] bArr) {
        int iD = defpackage.aefc.d(16, 0.75f);
        this.e = iD;
        this.g = iD;
        this.c = iD - 1;
        this.f = defpackage.aefc.e(iD, 0.75f);
        int i = this.e + 1;
        this.a = new long[i];
        this.b = new int[i];
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
        int[] iArr = new int[i4];
        this.b = iArr;
        int i5 = this.h;
        while (true) {
            int i6 = i5 - 1;
            if (i5 == 0) {
                return;
            }
            long j = objectInputStream.readLong();
            int i7 = objectInputStream.readInt();
            long j2 = 0;
            if (j == 0) {
                i2 = this.e;
                this.d = true;
            } else {
                int i8 = this.c;
                long j3 = (-7046029254386353131L) * j;
                long j4 = j3 ^ (j3 >>> 32);
                int i9 = (int) (j4 ^ (j4 >>> 16));
                while (true) {
                    i = i8 & i9;
                    if (jArr[i] == 0) {
                        break;
                    }
                    i8 = i + 1;
                    i9 = this.c;
                }
                j2 = j;
                i2 = i;
            }
            jArr[i2] = j2;
            iArr[i2] = i7;
            i5 = i6;
        }
    }

    private void writeObject(java.io.ObjectOutputStream objectOutputStream) throws java.io.IOException {
        long[] jArr = this.a;
        int[] iArr = this.b;
        defpackage.aemw aemwVar = new defpackage.aemw(this);
        objectOutputStream.defaultWriteObject();
        for (int i = this.h; i != 0; i--) {
            int iB = aemwVar.b();
            objectOutputStream.writeLong(jArr[iB]);
            objectOutputStream.writeInt(iArr[iB]);
        }
    }

    @Override // defpackage.aelu, defpackage.aemo
    public final int a(long j, int i) {
        int i2;
        if (j == 0) {
            boolean z = this.d;
            i2 = this.e;
            if (!z) {
                i2 = -(i2 + 1);
            }
        } else {
            long[] jArr = this.a;
            long j2 = (-7046029254386353131L) * j;
            long j3 = j2 ^ (j2 >>> 32);
            int i3 = this.c & ((int) (j3 ^ (j3 >>> 16)));
            long j4 = jArr[i3];
            if (j4 != 0) {
                if (j != j4) {
                    while (true) {
                        i3 = (i3 + 1) & this.c;
                        long j5 = jArr[i3];
                        if (j5 == 0) {
                            i2 = -(i3 + 1);
                        } else if (j == j5) {
                        }
                    }
                }
                i2 = i3;
            } else {
                i2 = -(i3 + 1);
            }
        }
        if (i2 >= 0) {
            int[] iArr = this.b;
            int i4 = iArr[i2];
            iArr[i2] = i;
            return i4;
        }
        int i5 = (-i2) - 1;
        if (i5 == this.e) {
            this.d = true;
        }
        this.a[i5] = j;
        this.b[i5] = i;
        int i6 = this.h;
        this.h = i6 + 1;
        if (i6 < this.f) {
            return 0;
        }
        y(defpackage.aefc.d(i6 + 2, 0.75f));
        return 0;
    }

    @Override // defpackage.aelu, defpackage.aemo
    public final int b(long j) {
        long j2;
        if (j == 0) {
            if (this.d) {
                return w();
            }
            return 0;
        }
        long[] jArr = this.a;
        long j3 = (-7046029254386353131L) * j;
        long j4 = j3 ^ (j3 >>> 32);
        int i = this.c & ((int) (j4 ^ (j4 >>> 16)));
        long j5 = jArr[i];
        if (j5 == 0) {
            return 0;
        }
        if (j == j5) {
            return v(i);
        }
        do {
            i = (i + 1) & this.c;
            j2 = jArr[i];
            if (j2 == 0) {
                return 0;
            }
        } while (j != j2);
        return v(i);
    }

    @Override // defpackage.aelv, java.util.Map
    public final void clear() {
        if (this.h == 0) {
            return;
        }
        this.h = 0;
        this.d = false;
        java.util.Arrays.fill(this.a, 0L);
    }

    @Override // defpackage.aelv, defpackage.aelu, defpackage.aemo
    public final boolean d(long j) {
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

    @Override // defpackage.aelv
    /* JADX INFO: renamed from: e */
    public final defpackage.aekf values() {
        if (this.j == null) {
            this.j = new defpackage.aemv(this);
        }
        return this.j;
    }

    @Override // defpackage.aelv
    /* JADX INFO: renamed from: f */
    public final defpackage.aeqx keySet() {
        if (this.i == null) {
            this.i = new defpackage.aena(this);
        }
        return this.i;
    }

    @Override // defpackage.aelv, java.util.Map
    public final int hashCode() {
        long j;
        int i;
        long[] jArr = this.a;
        int[] iArr = this.b;
        int iU = u();
        int iF = 0;
        int i2 = 0;
        while (iU != 0) {
            while (true) {
                j = jArr[i2];
                i = i2 + 1;
                if (j == 0) {
                    i2 = i;
                }
            }
            iU--;
            iF += iArr[i2] ^ defpackage.a.f(j);
            i2 = i;
        }
        return this.d ? iF + iArr[this.e] : iF;
    }

    @Override // defpackage.aelv, java.util.Map
    public final boolean isEmpty() {
        return this.h == 0;
    }

    @Override // defpackage.aelv, java.util.Map
    public final /* bridge */ /* synthetic */ java.util.Set keySet() {
        return keySet();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.aelv, java.util.Map
    public final void putAll(java.util.Map<? extends java.lang.Long, ? extends java.lang.Integer> map) {
        int iMin = (int) java.lang.Math.min(1073741824L, java.lang.Math.max(2L, 1 << (64 - java.lang.Long.numberOfLeadingZeros(((long) java.lang.Math.ceil((this.h + map.size()) / 0.75f)) - 1))));
        if (iMin > this.e) {
            y(iMin);
        }
        if (map instanceof defpackage.aems) {
            defpackage.aeuy aeuyVarA = defpackage.aemu.a((defpackage.aems) map);
            while (aeuyVarA.hasNext()) {
                defpackage.aenc aencVar = (defpackage.aenc) aeuyVarA.next();
                a(aencVar.b(), aencVar.a());
            }
            return;
        }
        int size = map.size();
        java.util.Iterator<java.util.Map.Entry<? extends java.lang.Long, ? extends java.lang.Integer>> it = map.entrySet().iterator();
        while (size != 0) {
            size--;
            java.util.Map.Entry<? extends java.lang.Long, ? extends java.lang.Integer> next = it.next();
            defpackage.aefc.J(this, next.getKey(), next.getValue());
        }
    }

    @Override // defpackage.aelv, defpackage.aems
    public final boolean q(int i) {
        long[] jArr = this.a;
        int[] iArr = this.b;
        if (this.d && iArr[this.e] == i) {
            return true;
        }
        int i2 = this.e;
        while (i2 != 0) {
            i2--;
            if (jArr[i2] != 0 && iArr[i2] == i) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.aemo
    public final int s(long j) {
        long j2;
        if (j == 0) {
            if (this.d) {
                return this.b[this.e];
            }
            return 0;
        }
        long[] jArr = this.a;
        long j3 = (-7046029254386353131L) * j;
        long j4 = j3 ^ (j3 >>> 32);
        int i = this.c & ((int) (j4 ^ (j4 >>> 16)));
        long j5 = jArr[i];
        if (j5 == 0) {
            return 0;
        }
        if (j == j5) {
            return this.b[i];
        }
        do {
            i = (i + 1) & this.c;
            j2 = jArr[i];
            if (j2 == 0) {
                return 0;
            }
        } while (j != j2);
        return this.b[i];
    }

    @Override // defpackage.aelu, defpackage.aefe
    public final int size() {
        return this.h;
    }

    @Override // defpackage.aems
    public final /* bridge */ /* synthetic */ defpackage.aevm t() {
        defpackage.aend aendVar = this.k;
        if (aendVar != null) {
            return aendVar;
        }
        defpackage.aend aendVar2 = new defpackage.aend(this);
        this.k = aendVar2;
        return aendVar2;
    }

    public final int u() {
        boolean z = this.d;
        int i = this.h;
        return z ? i - 1 : i;
    }

    public final int v(int i) {
        long j;
        int[] iArr = this.b;
        int i2 = iArr[i];
        this.h--;
        long[] jArr = this.a;
        loop0: while (true) {
            int i3 = (i + 1) & this.c;
            while (true) {
                j = jArr[i3];
                if (j != 0) {
                    int i4 = this.c;
                    long j2 = (-7046029254386353131L) * j;
                    long j3 = j2 ^ (j2 >>> 32);
                    int i5 = ((int) (j3 ^ (j3 >>> 16))) & i4;
                    if (i > i3) {
                        if (i >= i5 && i5 > i3) {
                            break;
                        }
                        i3 = (i3 + 1) & i4;
                    } else {
                        if (i >= i5 || i5 > i3) {
                            break;
                        }
                        i3 = (i3 + 1) & i4;
                    }
                } else {
                    break loop0;
                }
            }
            jArr[i] = j;
            iArr[i] = iArr[i3];
            i = i3;
        }
        jArr[i] = 0;
        int i6 = this.e;
        if (i6 > this.g && this.h < this.f / 4 && i6 > 16) {
            y(i6 >> 1);
        }
        return i2;
    }

    @Override // defpackage.aelv, java.util.Map
    public final /* bridge */ /* synthetic */ java.util.Collection values() {
        return values();
    }

    public final int w() {
        this.d = false;
        int[] iArr = this.b;
        int i = this.e;
        int i2 = iArr[i];
        int i3 = this.h - 1;
        this.h = i3;
        if (i > this.g && i3 < this.f / 4 && i > 16) {
            y(i >> 1);
        }
        return i2;
    }

    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public final defpackage.aeni clone() {
        try {
            defpackage.aeni aeniVar = (defpackage.aeni) super.clone();
            aeniVar.i = null;
            aeniVar.j = null;
            aeniVar.k = null;
            aeniVar.d = this.d;
            aeniVar.a = (long[]) this.a.clone();
            aeniVar.b = (int[]) this.b.clone();
            return aeniVar;
        } catch (java.lang.CloneNotSupportedException unused) {
            throw new java.lang.InternalError();
        }
    }

    protected final void y(int i) {
        long j;
        int i2 = i + 1;
        long[] jArr = this.a;
        int[] iArr = this.b;
        long[] jArr2 = new long[i2];
        int[] iArr2 = new int[i2];
        int i3 = this.e;
        int iU = u();
        while (true) {
            int i4 = i - 1;
            if (iU == 0) {
                iArr2[i] = iArr[this.e];
                this.e = i;
                this.c = i4;
                this.f = defpackage.aefc.e(i, 0.75f);
                this.a = jArr2;
                this.b = iArr2;
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
            iArr2[i5] = iArr[i3];
            iU--;
        }
    }

    public final void z(int i) {
        int iNumberOfLeadingZeros = 1 << (32 - java.lang.Integer.numberOfLeadingZeros(((int) java.lang.Math.ceil(i / 0.75f)) - 1));
        if (iNumberOfLeadingZeros >= this.e || this.h > defpackage.aefc.e(iNumberOfLeadingZeros, 0.75f)) {
            return;
        }
        try {
            y(iNumberOfLeadingZeros);
        } catch (java.lang.OutOfMemoryError unused) {
        }
    }

    public aeni() {
        throw null;
    }
}
