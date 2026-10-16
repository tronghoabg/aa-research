package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aevl<K> extends defpackage.aerw<K> implements java.io.Serializable, java.lang.Cloneable {
    public static final /* synthetic */ int i = 0;
    private static final long serialVersionUID = 0;
    protected transient java.lang.Object[] a;
    protected transient int b;
    protected transient boolean c;
    protected transient int d;
    protected transient int e;
    protected final transient int f;
    protected int g;
    protected final float h;

    static {
        j$.util.stream.Collector.CC.of(new defpackage.aeun(3), new defpackage.maj(6), new defpackage.riy(8), j$.util.stream.Collector.Characteristics.UNORDERED);
    }

    public aevl(int i2) {
        if (i2 < 0) {
            throw new java.lang.IllegalArgumentException("The expected number of elements must be nonnegative");
        }
        this.h = 0.75f;
        int iD = defpackage.aefc.d(i2, 0.75f);
        this.d = iD;
        this.f = iD;
        this.b = iD - 1;
        this.e = defpackage.aefc.e(iD, 0.75f);
        this.a = new java.lang.Object[this.d + 1];
    }

    private final void f(int i2) {
        java.lang.Object obj;
        this.g--;
        java.lang.Object[] objArr = this.a;
        loop0: while (true) {
            int i3 = (i2 + 1) & this.b;
            while (true) {
                obj = objArr[i3];
                if (obj != null) {
                    int iHashCode = obj.hashCode() * (-1640531527);
                    int i4 = this.b;
                    int i5 = (iHashCode ^ (iHashCode >>> 16)) & i4;
                    if (i2 > i3) {
                        if (i2 >= i5 && i5 > i3) {
                            break;
                        } else {
                            i3 = (i3 + 1) & i4;
                        }
                    } else if (i2 >= i5 || i5 > i3) {
                        break;
                    } else {
                        i3 = (i3 + 1) & i4;
                    }
                } else {
                    break loop0;
                }
            }
            objArr[i2] = obj;
            i2 = i3;
        }
        objArr[i2] = null;
        int i6 = this.d;
        if (i6 <= this.f || this.g >= this.e / 4 || i6 <= 16) {
            return;
        }
        e(i6 >> 1);
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.lang.ClassNotFoundException, java.io.IOException {
        int i2;
        objectInputStream.defaultReadObject();
        int i3 = this.g;
        float f = this.h;
        int iD = defpackage.aefc.d(i3, f);
        this.d = iD;
        this.e = defpackage.aefc.e(iD, f);
        int i4 = this.d;
        this.b = i4 - 1;
        java.lang.Object[] objArr = new java.lang.Object[i4 + 1];
        this.a = objArr;
        int i5 = this.g;
        while (true) {
            int i6 = i5 - 1;
            if (i5 == 0) {
                return;
            }
            java.lang.Object object = objectInputStream.readObject();
            if (object == null) {
                i2 = this.d;
                this.c = true;
            } else {
                int iHashCode = object.hashCode() * (-1640531527);
                i2 = (iHashCode ^ (iHashCode >>> 16)) & this.b;
                if (objArr[i2] != null) {
                    do {
                        i2 = (i2 + 1) & this.b;
                    } while (objArr[i2] != null);
                }
            }
            objArr[i2] = object;
            i5 = i6;
        }
    }

    private void writeObject(java.io.ObjectOutputStream objectOutputStream) throws java.io.IOException {
        defpackage.aevj aevjVar = new defpackage.aevj(this);
        objectOutputStream.defaultWriteObject();
        for (int i2 = this.g; i2 != 0; i2--) {
            objectOutputStream.writeObject(aevjVar.next());
        }
    }

    @Override // defpackage.aerw, defpackage.aerq, defpackage.aeuv
    /* JADX INFO: renamed from: a */
    public final defpackage.aeuy iterator() {
        return new defpackage.aevj(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(K k) {
        java.lang.Object obj;
        if (k != null) {
            java.lang.Object[] objArr = this.a;
            int iHashCode = k.hashCode() * (-1640531527);
            int i2 = (iHashCode ^ (iHashCode >>> 16)) & this.b;
            java.lang.Object obj2 = objArr[i2];
            if (obj2 != null) {
                if (!obj2.equals(k)) {
                    do {
                        i2 = (i2 + 1) & this.b;
                        obj = objArr[i2];
                        if (obj != null) {
                        }
                    } while (!obj.equals(k));
                }
                return false;
            }
            objArr[i2] = k;
        } else {
            if (this.c) {
                return false;
            }
            this.c = true;
        }
        int i3 = this.g;
        this.g = i3 + 1;
        if (i3 >= this.e) {
            e(defpackage.aefc.d(i3 + 2, this.h));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(java.util.Collection<? extends K> collection) {
        float f = this.h;
        if (f <= 0.5d) {
            int iD = defpackage.aefc.d(collection.size(), f);
            if (iD > this.d) {
                e(iD);
            }
        } else {
            int iMin = (int) java.lang.Math.min(1073741824L, java.lang.Math.max(2L, 1 << (64 - java.lang.Long.numberOfLeadingZeros(((long) java.lang.Math.ceil((this.g + collection.size()) / f)) - 1))));
            if (iMin > this.d) {
                e(iMin);
            }
        }
        return super.addAll(collection);
    }

    @Override // defpackage.aerw, defpackage.aerq, defpackage.aeuv
    public final defpackage.aevs b() {
        return new defpackage.aevk(this);
    }

    public final int c() {
        boolean z = this.c;
        int i2 = this.g;
        return z ? i2 - 1 : i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        if (this.g == 0) {
            return;
        }
        this.g = 0;
        this.c = false;
        java.util.Arrays.fill(this.a, (java.lang.Object) null);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(java.lang.Object obj) {
        java.lang.Object obj2;
        if (obj == null) {
            return this.c;
        }
        java.lang.Object[] objArr = this.a;
        int iHashCode = obj.hashCode() * (-1640531527);
        int i2 = (iHashCode ^ (iHashCode >>> 16)) & this.b;
        java.lang.Object obj3 = objArr[i2];
        if (obj3 == null) {
            return false;
        }
        if (!obj.equals(obj3)) {
            do {
                i2 = (i2 + 1) & this.b;
                obj2 = objArr[i2];
                if (obj2 == null) {
                    return false;
                }
            } while (!obj.equals(obj2));
        }
        return true;
    }

    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final defpackage.aevl clone() {
        try {
            defpackage.aevl aevlVar = (defpackage.aevl) super.clone();
            aevlVar.a = (java.lang.Object[]) this.a.clone();
            aevlVar.c = this.c;
            return aevlVar;
        } catch (java.lang.CloneNotSupportedException unused) {
            throw new java.lang.InternalError();
        }
    }

    protected final void e(int i2) {
        java.lang.Object obj;
        java.lang.Object[] objArr = this.a;
        java.lang.Object[] objArr2 = new java.lang.Object[i2 + 1];
        int i3 = this.d;
        int iC = c();
        while (true) {
            int i4 = i2 - 1;
            if (iC == 0) {
                this.d = i2;
                this.b = i4;
                this.e = defpackage.aefc.e(i2, this.h);
                this.a = objArr2;
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
            iC--;
        }
    }

    @Override // defpackage.aerq, java.lang.Iterable, j$.util.Collection, j$.lang.a
    public final void forEach(java.util.function.Consumer<? super K> consumer) {
        java.lang.Object[] objArr = this.a;
        if (this.c) {
            consumer.accept(objArr[this.d]);
        }
        int i2 = this.d;
        while (i2 != 0) {
            i2--;
            java.lang.Object obj = objArr[i2];
            if (obj != null) {
                consumer.accept(obj);
            }
        }
    }

    @Override // defpackage.aerw, java.util.Collection, java.util.Set
    public final int hashCode() {
        java.lang.Object obj;
        java.lang.Object[] objArr = this.a;
        int iHashCode = 0;
        int i2 = 0;
        for (int iC = c(); iC != 0; iC--) {
            do {
                obj = objArr[i2];
                i2++;
            } while (obj == null);
            if (this != obj) {
                iHashCode += obj.hashCode();
            }
        }
        return iHashCode;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.g == 0;
    }

    @Override // defpackage.aerw, defpackage.aerq, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ java.util.Iterator iterator() {
        return new defpackage.aevj(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(java.lang.Object obj) {
        java.lang.Object obj2;
        if (obj == null) {
            if (!this.c) {
                return false;
            }
            this.c = false;
            java.lang.Object[] objArr = this.a;
            int i2 = this.d;
            objArr[i2] = null;
            int i3 = this.g - 1;
            this.g = i3;
            if (i2 > this.f && i3 < this.e / 4 && i2 > 16) {
                e(i2 >> 1);
            }
            return true;
        }
        java.lang.Object[] objArr2 = this.a;
        int iHashCode = obj.hashCode() * (-1640531527);
        int i4 = (iHashCode ^ (iHashCode >>> 16)) & this.b;
        java.lang.Object obj3 = objArr2[i4];
        if (obj3 == null) {
            return false;
        }
        if (obj.equals(obj3)) {
            f(i4);
            return true;
        }
        do {
            i4 = (i4 + 1) & this.b;
            obj2 = objArr2[i4];
            if (obj2 == null) {
                return false;
            }
        } while (!obj.equals(obj2));
        f(i4);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.g;
    }

    @Override // defpackage.aerw, defpackage.aerq, java.util.Collection, java.lang.Iterable, j$.util.Collection, j$.lang.a
    public final /* synthetic */ j$.util.Spliterator spliterator() {
        return new defpackage.aevk(this);
    }

    public aevl() {
        throw null;
    }
}
