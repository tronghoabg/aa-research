package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aeul<K, V> extends defpackage.aero<K, V> implements java.io.Serializable, java.lang.Cloneable {
    private static final long serialVersionUID = 0;
    protected transient java.lang.Object[] a;
    protected transient java.lang.Object[] b;
    protected transient int c;
    protected transient boolean d;
    protected transient int e;
    protected transient int f;
    protected final transient int g;
    public int h;
    protected transient defpackage.aetx i;
    protected transient defpackage.aevm j;
    protected transient defpackage.aeuv k;

    public aeul(int i) {
        int iD = defpackage.aefc.d(i, 0.75f);
        this.e = iD;
        this.g = iD;
        this.c = iD - 1;
        this.f = defpackage.aefc.e(iD, 0.75f);
        int i2 = this.e + 1;
        this.a = new java.lang.Object[i2];
        this.b = new java.lang.Object[i2];
    }

    private final int j(java.lang.Object obj) {
        java.lang.Object obj2;
        if (obj == null) {
            boolean z = this.d;
            int i = this.e;
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

    private final void k(int i, java.lang.Object obj, java.lang.Object obj2) {
        if (i == this.e) {
            this.d = true;
        }
        this.a[i] = obj;
        this.b[i] = obj2;
        int i2 = this.h;
        this.h = i2 + 1;
        if (i2 >= this.f) {
            i(defpackage.aefc.d(i2 + 2, 0.75f));
        }
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
        java.lang.Object[] objArr2 = new java.lang.Object[i3];
        this.b = objArr2;
        int i4 = this.h;
        while (true) {
            int i5 = i4 - 1;
            if (i4 == 0) {
                return;
            }
            java.lang.Object object = objectInputStream.readObject();
            java.lang.Object object2 = objectInputStream.readObject();
            if (object == null) {
                i = this.e;
                this.d = true;
            } else {
                int iHashCode = object.hashCode() * (-1640531527);
                int i6 = this.c;
                int i7 = iHashCode ^ (iHashCode >>> 16);
                while (true) {
                    i = i7 & i6;
                    if (objArr[i] != null) {
                        i7 = i + 1;
                        i6 = this.c;
                    }
                }
            }
            objArr[i] = object;
            objArr2[i] = object2;
            i4 = i5;
        }
    }

    private void writeObject(java.io.ObjectOutputStream objectOutputStream) throws java.io.IOException {
        java.lang.Object[] objArr = this.a;
        java.lang.Object[] objArr2 = this.b;
        defpackage.aeuc aeucVar = new defpackage.aeuc(this);
        objectOutputStream.defaultWriteObject();
        for (int i = this.h; i != 0; i--) {
            int iB = aeucVar.b();
            objectOutputStream.writeObject(objArr[iB]);
            objectOutputStream.writeObject(objArr2[iB]);
        }
    }

    @Override // defpackage.aero
    /* JADX INFO: renamed from: a */
    public final defpackage.aeuv values() {
        if (this.k == null) {
            this.k = new defpackage.aeub(this);
        }
        return this.k;
    }

    @Override // defpackage.aero
    /* JADX INFO: renamed from: c */
    public final defpackage.aevm keySet() {
        if (this.j == null) {
            this.j = new defpackage.aeue(this);
        }
        return this.j;
    }

    @Override // defpackage.aero, defpackage.aety, java.util.Map
    public final void clear() {
        if (this.h == 0) {
            return;
        }
        this.h = 0;
        this.d = false;
        java.util.Arrays.fill(this.a, (java.lang.Object) null);
        java.util.Arrays.fill(this.b, (java.lang.Object) null);
    }

    @Override // defpackage.aero, j$.util.Map
    public final java.lang.Object compute(java.lang.Object obj, java.util.function.BiFunction biFunction) {
        biFunction.getClass();
        int iJ = j(obj);
        java.lang.Object objApply = biFunction.apply(obj, iJ >= 0 ? this.b[iJ] : null);
        if (objApply == null) {
            if (iJ >= 0) {
                if (obj == null) {
                    h();
                } else {
                    g(iJ);
                }
            }
            return null;
        }
        if (iJ < 0) {
            k((-iJ) - 1, obj, objApply);
            return objApply;
        }
        this.b[iJ] = objApply;
        return objApply;
    }

    @Override // defpackage.aero, j$.util.Map
    public final java.lang.Object computeIfPresent(java.lang.Object obj, java.util.function.BiFunction biFunction) {
        java.lang.Object obj2;
        biFunction.getClass();
        int iJ = j(obj);
        if (iJ < 0 || (obj2 = this.b[iJ]) == null) {
            return null;
        }
        java.lang.Object objApply = biFunction.apply(obj, obj2);
        if (objApply != null) {
            this.b[iJ] = objApply;
            return objApply;
        }
        if (obj == null) {
            h();
            return null;
        }
        g(iJ);
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
        if (this.d && j$.util.Objects.equals(objArr2[this.e], obj)) {
            return true;
        }
        int i = this.e;
        while (i != 0) {
            i--;
            if (objArr[i] != null && j$.util.Objects.equals(objArr2[i], obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.aety
    public final /* bridge */ /* synthetic */ defpackage.aevm d() {
        if (this.i == null) {
            this.i = new defpackage.aeuh(this);
        }
        return this.i;
    }

    public final int e() {
        boolean z = this.d;
        int i = this.h;
        return z ? i - 1 : i;
    }

    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final defpackage.aeul clone() {
        try {
            defpackage.aeul aeulVar = (defpackage.aeul) super.clone();
            aeulVar.j = null;
            aeulVar.k = null;
            aeulVar.i = null;
            aeulVar.d = this.d;
            aeulVar.a = (java.lang.Object[]) this.a.clone();
            aeulVar.b = (java.lang.Object[]) this.b.clone();
            return aeulVar;
        } catch (java.lang.CloneNotSupportedException unused) {
            throw new java.lang.InternalError();
        }
    }

    public final java.lang.Object g(int i) {
        java.lang.Object obj;
        java.lang.Object[] objArr = this.b;
        java.lang.Object obj2 = objArr[i];
        objArr[i] = null;
        this.h--;
        java.lang.Object[] objArr2 = this.a;
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
            objArr[i] = objArr[i2];
            i = i2;
        }
        objArr2[i] = null;
        objArr[i] = null;
        int i5 = this.e;
        if (i5 > this.g && this.h < this.f / 4 && i5 > 16) {
            i(i5 >> 1);
        }
        return obj2;
    }

    @Override // defpackage.aetk, defpackage.aefe
    public final V get(java.lang.Object obj) {
        java.lang.Object obj2;
        if (obj == null) {
            if (this.d) {
                return (V) this.b[this.e];
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
            return this.b[this.e];
        }
        return obj2;
    }

    public final java.lang.Object h() {
        this.d = false;
        java.lang.Object[] objArr = this.a;
        int i = this.e;
        objArr[i] = null;
        java.lang.Object[] objArr2 = this.b;
        java.lang.Object obj = objArr2[i];
        objArr2[i] = null;
        int i2 = this.h - 1;
        this.h = i2;
        if (i > this.g && i2 < this.f / 4 && i > 16) {
            i(i >> 1);
        }
        return obj;
    }

    @Override // defpackage.aero, java.util.Map
    public final int hashCode() {
        java.lang.Object obj;
        int i;
        java.lang.Object[] objArr = this.a;
        java.lang.Object[] objArr2 = this.b;
        int iE = e();
        int i2 = 0;
        int i3 = 0;
        int iHashCode = 0;
        while (iE != 0) {
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
            java.lang.Object obj2 = objArr2[i2];
            if (this != obj2) {
                iHashCode = (obj2 == null ? 0 : obj2.hashCode()) ^ iHashCode;
            }
            i3 += iHashCode;
            iE--;
            i2 = i;
        }
        if (!this.d) {
            return i3;
        }
        java.lang.Object obj3 = objArr2[this.e];
        return i3 + (obj3 != null ? obj3.hashCode() : 0);
    }

    protected final void i(int i) {
        java.lang.Object obj;
        int i2 = i + 1;
        java.lang.Object[] objArr = this.a;
        java.lang.Object[] objArr2 = this.b;
        java.lang.Object[] objArr3 = new java.lang.Object[i2];
        java.lang.Object[] objArr4 = new java.lang.Object[i2];
        int i3 = this.e;
        int iE = e();
        while (true) {
            int i4 = i - 1;
            if (iE == 0) {
                objArr4[i] = objArr2[this.e];
                this.e = i;
                this.c = i4;
                this.f = defpackage.aefc.e(i, 0.75f);
                this.a = objArr3;
                this.b = objArr4;
                return;
            }
            do {
                i3--;
                obj = objArr[i3];
            } while (obj == null);
            int iHashCode = obj.hashCode() * (-1640531527);
            int i5 = (iHashCode ^ (iHashCode >>> 16)) & i4;
            if (objArr3[i5] != null) {
                do {
                    i5 = (i5 + 1) & i4;
                } while (objArr3[i5] != null);
            }
            objArr3[i5] = objArr[i3];
            objArr4[i5] = objArr2[i3];
            iE--;
        }
    }

    @Override // defpackage.aero, java.util.Map
    public final boolean isEmpty() {
        return this.h == 0;
    }

    @Override // defpackage.aero, java.util.Map
    public final /* bridge */ /* synthetic */ java.util.Set keySet() {
        return keySet();
    }

    @Override // defpackage.aero, j$.util.Map
    public final java.lang.Object merge(java.lang.Object obj, java.lang.Object obj2, java.util.function.BiFunction biFunction) {
        java.lang.Object obj3;
        biFunction.getClass();
        obj2.getClass();
        int iJ = j(obj);
        if (iJ < 0 || (obj3 = this.b[iJ]) == null) {
            if (iJ < 0) {
                k((-iJ) - 1, obj, obj2);
                return obj2;
            }
            this.b[iJ] = obj2;
            return obj2;
        }
        java.lang.Object objApply = biFunction.apply(obj3, obj2);
        if (objApply != null) {
            this.b[iJ] = objApply;
            return objApply;
        }
        if (obj == null) {
            h();
            return null;
        }
        g(iJ);
        return null;
    }

    @Override // defpackage.aero, defpackage.aety, java.util.Map
    public final V put(K k, V v) {
        int iJ = j(k);
        if (iJ < 0) {
            k((-iJ) - 1, k, v);
            return null;
        }
        java.lang.Object[] objArr = this.b;
        V v2 = (V) objArr[iJ];
        objArr[iJ] = v;
        return v2;
    }

    @Override // defpackage.aero, java.util.Map
    public final void putAll(java.util.Map<? extends K, ? extends V> map) {
        int iMin = (int) java.lang.Math.min(1073741824L, java.lang.Math.max(2L, 1 << (64 - java.lang.Long.numberOfLeadingZeros(((long) java.lang.Math.ceil((this.h + map.size()) / 0.75f)) - 1))));
        if (iMin > this.e) {
            i(iMin);
        }
        super.putAll(map);
    }

    @Override // defpackage.aero, j$.util.Map
    public final java.lang.Object putIfAbsent(java.lang.Object obj, java.lang.Object obj2) {
        int iJ = j(obj);
        if (iJ >= 0) {
            return this.b[iJ];
        }
        k((-iJ) - 1, obj, obj2);
        return null;
    }

    @Override // defpackage.aero, j$.util.Map
    public final boolean remove(java.lang.Object obj, java.lang.Object obj2) {
        if (obj == null) {
            if (!this.d || !j$.util.Objects.equals(obj2, this.b[this.e])) {
                return false;
            }
            h();
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
            g(i);
            return true;
        }
        while (true) {
            i = (i + 1) & this.c;
            java.lang.Object obj4 = objArr[i];
            if (obj4 == null) {
                return false;
            }
            if (obj.equals(obj4) && j$.util.Objects.equals(obj2, this.b[i])) {
                g(i);
                return true;
            }
        }
    }

    @Override // defpackage.aero, j$.util.Map
    public final boolean replace(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        int iJ = j(obj);
        if (iJ < 0 || !j$.util.Objects.equals(obj2, this.b[iJ])) {
            return false;
        }
        this.b[iJ] = obj3;
        return true;
    }

    @Override // defpackage.aern, defpackage.aefe
    public final int size() {
        return this.h;
    }

    @Override // defpackage.aero, java.util.Map
    public final /* bridge */ /* synthetic */ java.util.Collection values() {
        return values();
    }

    @Override // defpackage.aero, j$.util.Map
    public final java.lang.Object replace(java.lang.Object obj, java.lang.Object obj2) {
        int iJ = j(obj);
        if (iJ < 0) {
            return null;
        }
        java.lang.Object[] objArr = this.b;
        java.lang.Object obj3 = objArr[iJ];
        objArr[iJ] = obj2;
        return obj3;
    }

    public aeul() {
        throw null;
    }

    @Override // defpackage.aero, defpackage.aety, java.util.Map
    public final V remove(java.lang.Object obj) {
        java.lang.Object obj2;
        if (obj == null) {
            if (this.d) {
                return (V) h();
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
            return (V) g(i);
        }
        return (V) g(i);
    }
}
