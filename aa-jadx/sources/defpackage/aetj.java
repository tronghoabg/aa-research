package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aetj<K> extends defpackage.aerm<K> implements java.io.Serializable, java.lang.Cloneable {
    private static final long serialVersionUID = 0;
    public transient java.lang.Object[] a;
    protected transient int[] b;
    protected transient int c;
    public transient boolean d;
    public transient int e;
    protected transient int f;
    protected final transient int g;
    public int h;
    protected transient defpackage.aevm i;
    protected transient defpackage.aekf j;
    protected transient defpackage.aete k;

    public aetj(byte[] bArr) {
        int iD = defpackage.aefc.d(16, 0.75f);
        this.e = iD;
        this.g = iD;
        this.c = iD - 1;
        this.f = defpackage.aefc.e(iD, 0.75f);
        int i = this.e + 1;
        this.a = new java.lang.Object[i];
        this.b = new int[i];
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.lang.ClassNotFoundException, java.io.IOException {
        int i;
        objectInputStream.defaultReadObject();
        int iD = defpackage.aefc.d(this.h, 0.75f);
        this.e = iD;
        this.f = defpackage.aefc.e(iD, 0.75f);
        int i2 = this.e;
        this.c = i2 - 1;
        int i3 = i2 + 1;
        java.lang.Object[] objArr = new java.lang.Object[i3];
        this.a = objArr;
        int[] iArr = new int[i3];
        this.b = iArr;
        int i4 = this.h;
        while (true) {
            int i5 = i4 - 1;
            if (i4 == 0) {
                return;
            }
            java.lang.Object object = objectInputStream.readObject();
            int i6 = objectInputStream.readInt();
            if (object == null) {
                i = this.e;
                this.d = true;
            } else {
                int iHashCode = object.hashCode() * (-1640531527);
                int i7 = this.c;
                int i8 = iHashCode ^ (iHashCode >>> 16);
                while (true) {
                    i = i8 & i7;
                    if (objArr[i] != null) {
                        i8 = i + 1;
                        i7 = this.c;
                    }
                }
            }
            objArr[i] = object;
            iArr[i] = i6;
            i4 = i5;
        }
    }

    private void writeObject(java.io.ObjectOutputStream objectOutputStream) throws java.io.IOException {
        java.lang.Object[] objArr = this.a;
        int[] iArr = this.b;
        defpackage.aesy aesyVar = new defpackage.aesy(this);
        objectOutputStream.defaultWriteObject();
        for (int i = this.h; i != 0; i--) {
            int iB = aesyVar.b();
            objectOutputStream.writeObject(objArr[iB]);
            objectOutputStream.writeInt(iArr[iB]);
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001e A[EDGE_INSN: B:9:0x001e->B:17:0x0037 BREAK  A[LOOP:0: B:12:0x0028->B:30:?], PHI: r2
  0x001e: PHI (r2v9 int) = (r2v3 int), (r2v6 int), (r2v12 int) binds: [B:8:0x001c, B:29:0x001e, B:5:0x0007] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.aerk, defpackage.aesn
    public final int a(java.lang.Object obj, int i) {
        int i2;
        java.lang.Object obj2;
        if (obj != null) {
            java.lang.Object[] objArr = this.a;
            int iHashCode = obj.hashCode() * (-1640531527);
            i2 = (iHashCode ^ (iHashCode >>> 16)) & this.c;
            java.lang.Object obj3 = objArr[i2];
            if (obj3 == null) {
                i2 = -(i2 + 1);
                break;
            }
            if (!obj.equals(obj3)) {
                do {
                    i2 = (i2 + 1) & this.c;
                    obj2 = objArr[i2];
                    if (obj2 == null) {
                        i2 = -(i2 + 1);
                        break;
                    }
                } while (!obj.equals(obj2));
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
            int[] iArr = this.b;
            int i3 = iArr[i2];
            iArr[i2] = i;
            return i3;
        }
        int i4 = (-i2) - 1;
        if (i4 == this.e) {
            this.d = true;
        }
        this.a[i4] = obj;
        this.b[i4] = i;
        int i5 = this.h;
        this.h = i5 + 1;
        if (i5 < this.f) {
            return 0;
        }
        u(defpackage.aefc.d(i5 + 2, 0.75f));
        return 0;
    }

    @Override // defpackage.aerk, defpackage.aesn
    public final int b(java.lang.Object obj) {
        java.lang.Object obj2;
        if (obj == null) {
            if (this.d) {
                return s();
            }
            return 0;
        }
        java.lang.Object[] objArr = this.a;
        int iHashCode = obj.hashCode() * (-1640531527);
        int i = (iHashCode ^ (iHashCode >>> 16)) & this.c;
        java.lang.Object obj3 = objArr[i];
        if (obj3 == null) {
            return 0;
        }
        if (obj.equals(obj3)) {
            return r(i);
        }
        do {
            i = (i + 1) & this.c;
            obj2 = objArr[i];
            if (obj2 == null) {
                return 0;
            }
        } while (!obj.equals(obj2));
        return r(i);
    }

    @Override // defpackage.aerm, java.util.Map
    public final void clear() {
        if (this.h == 0) {
            return;
        }
        this.h = 0;
        this.d = false;
        java.util.Arrays.fill(this.a, (java.lang.Object) null);
    }

    @Override // defpackage.aerm, defpackage.aerk, defpackage.aefe
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

    @Override // defpackage.aerm
    /* JADX INFO: renamed from: d */
    public final defpackage.aekf values() {
        if (this.j == null) {
            this.j = new defpackage.aesx(this);
        }
        return this.j;
    }

    @Override // defpackage.aerm
    /* JADX INFO: renamed from: f */
    public final defpackage.aevm keySet() {
        if (this.i == null) {
            this.i = new defpackage.aetb(this);
        }
        return this.i;
    }

    @Override // defpackage.aerm, java.util.Map
    public final int hashCode() {
        java.lang.Object obj;
        int i;
        java.lang.Object[] objArr = this.a;
        int[] iArr = this.b;
        int iQ = q();
        int i2 = 0;
        int i3 = 0;
        int iHashCode = 0;
        while (iQ != 0) {
            while (true) {
                obj = objArr[i2];
                i = i2 + 1;
                if (obj != null) {
                    break;
                }
                i2 = i;
            }
            if (this != obj) {
                iHashCode = obj.hashCode();
            }
            iQ--;
            iHashCode ^= iArr[i2];
            i3 += iHashCode;
            i2 = i;
        }
        return this.d ? i3 + iArr[this.e] : i3;
    }

    @Override // defpackage.aerm, java.util.Map
    public final boolean isEmpty() {
        return this.h == 0;
    }

    @Override // defpackage.aerm, java.util.Map
    public final /* bridge */ /* synthetic */ java.util.Set keySet() {
        return keySet();
    }

    @Override // defpackage.aerm, defpackage.aest
    public final boolean m(int i) {
        java.lang.Object[] objArr = this.a;
        int[] iArr = this.b;
        if (this.d && iArr[this.e] == i) {
            return true;
        }
        int i2 = this.e;
        while (i2 != 0) {
            i2--;
            if (objArr[i2] != null && iArr[i2] == i) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.aesn
    public final int o(java.lang.Object obj) {
        java.lang.Object obj2;
        if (obj == null) {
            if (this.d) {
                return this.b[this.e];
            }
            return 0;
        }
        java.lang.Object[] objArr = this.a;
        int iHashCode = obj.hashCode() * (-1640531527);
        int i = (iHashCode ^ (iHashCode >>> 16)) & this.c;
        java.lang.Object obj3 = objArr[i];
        if (obj3 == null) {
            return 0;
        }
        if (obj.equals(obj3)) {
            return this.b[i];
        }
        do {
            i = (i + 1) & this.c;
            obj2 = objArr[i];
            if (obj2 == null) {
                return 0;
            }
        } while (!obj.equals(obj2));
        return this.b[i];
    }

    @Override // defpackage.aest
    public final /* bridge */ /* synthetic */ defpackage.aevm p() {
        defpackage.aete aeteVar = this.k;
        if (aeteVar != null) {
            return aeteVar;
        }
        defpackage.aete aeteVar2 = new defpackage.aete(this);
        this.k = aeteVar2;
        return aeteVar2;
    }

    @Override // defpackage.aerm, java.util.Map
    public final void putAll(java.util.Map<? extends K, ? extends java.lang.Integer> map) {
        int iMin = (int) java.lang.Math.min(1073741824L, java.lang.Math.max(2L, 1 << (64 - java.lang.Long.numberOfLeadingZeros(((long) java.lang.Math.ceil((this.h + map.size()) / 0.75f)) - 1))));
        if (iMin > this.e) {
            u(iMin);
        }
        if (map instanceof defpackage.aest) {
            defpackage.aeuy aeuyVarA = defpackage.aesw.a((defpackage.aest) map);
            while (aeuyVarA.hasNext()) {
                defpackage.aess aessVar = (defpackage.aess) aeuyVarA.next();
                a(aessVar.getKey(), aessVar.a());
            }
            return;
        }
        int size = map.size();
        java.util.Iterator<java.util.Map.Entry<? extends K, ? extends java.lang.Integer>> it = map.entrySet().iterator();
        while (size != 0) {
            size--;
            java.util.Map.Entry<? extends K, ? extends java.lang.Integer> next = it.next();
            defpackage.adrq.S(this, next.getKey(), next.getValue());
        }
    }

    public final int q() {
        boolean z = this.d;
        int i = this.h;
        return z ? i - 1 : i;
    }

    public final int r(int i) {
        java.lang.Object obj;
        int[] iArr = this.b;
        int i2 = iArr[i];
        this.h--;
        java.lang.Object[] objArr = this.a;
        loop0: while (true) {
            int i3 = (i + 1) & this.c;
            while (true) {
                obj = objArr[i3];
                if (obj != null) {
                    int iHashCode = obj.hashCode() * (-1640531527);
                    int i4 = this.c;
                    int i5 = (iHashCode ^ (iHashCode >>> 16)) & i4;
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
            objArr[i] = obj;
            iArr[i] = iArr[i3];
            i = i3;
        }
        objArr[i] = null;
        int i6 = this.e;
        if (i6 > this.g && this.h < this.f / 4 && i6 > 16) {
            u(i6 >> 1);
        }
        return i2;
    }

    public final int s() {
        this.d = false;
        java.lang.Object[] objArr = this.a;
        int i = this.e;
        objArr[i] = null;
        int i2 = this.b[i];
        int i3 = this.h - 1;
        this.h = i3;
        if (i > this.g && i3 < this.f / 4 && i > 16) {
            u(i >> 1);
        }
        return i2;
    }

    @Override // defpackage.aerk, defpackage.aefe
    public final int size() {
        return this.h;
    }

    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public final defpackage.aetj clone() {
        try {
            defpackage.aetj aetjVar = (defpackage.aetj) super.clone();
            aetjVar.i = null;
            aetjVar.j = null;
            aetjVar.k = null;
            aetjVar.d = this.d;
            aetjVar.a = (java.lang.Object[]) this.a.clone();
            aetjVar.b = (int[]) this.b.clone();
            return aetjVar;
        } catch (java.lang.CloneNotSupportedException unused) {
            throw new java.lang.InternalError();
        }
    }

    protected final void u(int i) {
        java.lang.Object obj;
        int i2 = i + 1;
        java.lang.Object[] objArr = this.a;
        int[] iArr = this.b;
        java.lang.Object[] objArr2 = new java.lang.Object[i2];
        int[] iArr2 = new int[i2];
        int i3 = this.e;
        int iQ = q();
        while (true) {
            int i4 = i - 1;
            if (iQ == 0) {
                iArr2[i] = iArr[this.e];
                this.e = i;
                this.c = i4;
                this.f = defpackage.aefc.e(i, 0.75f);
                this.a = objArr2;
                this.b = iArr2;
                return;
            }
            do {
                i3--;
                obj = objArr[i3];
            } while (obj == null);
            int iHashCode = obj.hashCode() * (-1640531527);
            int i5 = (iHashCode ^ (iHashCode >>> 16)) & i4;
            if (objArr2[i5] != null) {
                do {
                    i5 = (i5 + 1) & i4;
                } while (objArr2[i5] != null);
            }
            objArr2[i5] = objArr[i3];
            iArr2[i5] = iArr[i3];
            iQ--;
        }
    }

    public final void v(int i) {
        int iNumberOfLeadingZeros = 1 << (32 - java.lang.Integer.numberOfLeadingZeros(((int) java.lang.Math.ceil(i / 0.75f)) - 1));
        if (iNumberOfLeadingZeros >= this.e || this.h > defpackage.aefc.e(iNumberOfLeadingZeros, 0.75f)) {
            return;
        }
        try {
            u(iNumberOfLeadingZeros);
        } catch (java.lang.OutOfMemoryError unused) {
        }
    }

    @Override // defpackage.aerm, java.util.Map
    public final /* bridge */ /* synthetic */ java.util.Collection<java.lang.Integer> values() {
        return values();
    }

    public aetj() {
        throw null;
    }
}
