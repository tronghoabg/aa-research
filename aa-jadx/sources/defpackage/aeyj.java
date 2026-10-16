package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aeyj<K> extends defpackage.aesm<K> implements java.io.Serializable, java.lang.Cloneable {
    private static final long serialVersionUID = 1;
    protected transient java.lang.Object[] a;
    public int b;

    public aeyj(java.lang.Object[] objArr) {
        this.a = objArr;
        this.b = 0;
    }

    private final int d(java.lang.Object obj) {
        java.lang.Object[] objArr = this.a;
        int i = this.b;
        while (i != 0) {
            i--;
            if (objArr[i] == obj) {
                return i;
            }
        }
        return -1;
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.lang.ClassNotFoundException, java.io.IOException {
        objectInputStream.defaultReadObject();
        java.lang.Object[] objArr = new java.lang.Object[this.b];
        this.a = objArr;
        for (int i = 0; i < this.b; i++) {
            objArr[i] = objectInputStream.readObject();
        }
    }

    private void writeObject(java.io.ObjectOutputStream objectOutputStream) throws java.io.IOException {
        objectOutputStream.defaultWriteObject();
        java.lang.Object[] objArr = this.a;
        for (int i = 0; i < this.b; i++) {
            objectOutputStream.writeObject(objArr[i]);
        }
    }

    @Override // defpackage.aesm, defpackage.aesf, defpackage.aeyk
    /* JADX INFO: renamed from: a */
    public final defpackage.aeuy iterator() {
        return new defpackage.aeyi(this, 0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(K k) {
        if (d(k) != -1) {
            return false;
        }
        int i = this.b;
        java.lang.Object[] objArr = this.a;
        if (i == objArr.length) {
            objArr = new java.lang.Object[i == 0 ? 2 : i + i];
            while (true) {
                int i2 = i - 1;
                if (i == 0) {
                    break;
                }
                objArr[i2] = this.a[i2];
                i = i2;
            }
            this.a = objArr;
        }
        int i3 = this.b;
        this.b = i3 + 1;
        objArr[i3] = k;
        return true;
    }

    @Override // defpackage.aesm, defpackage.aesf, defpackage.aeyk
    public final defpackage.aevs b() {
        return new defpackage.aeur(this, 3);
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final defpackage.aeyj clone() {
        try {
            defpackage.aeyj aeyjVar = (defpackage.aeyj) super.clone();
            aeyjVar.a = (java.lang.Object[]) this.a.clone();
            return aeyjVar;
        } catch (java.lang.CloneNotSupportedException unused) {
            throw new java.lang.InternalError();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        java.util.Arrays.fill(this.a, 0, this.b, (java.lang.Object) null);
        this.b = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(java.lang.Object obj) {
        return d(obj) != -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.b == 0;
    }

    @Override // defpackage.aesm, defpackage.aesf, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ java.util.Iterator iterator() {
        return new defpackage.aeyi(this, 0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(java.lang.Object obj) {
        int iD = d(obj);
        if (iD == -1) {
            return false;
        }
        int i = (this.b - iD) - 1;
        for (int i2 = 0; i2 < i; i2++) {
            java.lang.Object[] objArr = this.a;
            int i3 = iD + i2;
            objArr[i3] = objArr[i3 + 1];
        }
        int i4 = this.b - 1;
        this.b = i4;
        this.a[i4] = null;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.b;
    }

    @Override // defpackage.aesm, defpackage.aesf, java.util.Collection, java.lang.Iterable, j$.util.Collection, j$.lang.a
    public final /* synthetic */ j$.util.Spliterator spliterator() {
        return new defpackage.aeur(this, 3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final <T> T[] toArray(T[] tArr) {
        int i = this.b;
        if (tArr == null) {
            tArr = (T[]) new java.lang.Object[i];
        } else if (tArr.length < i) {
            tArr = (T[]) ((java.lang.Object[]) java.lang.reflect.Array.newInstance(tArr.getClass().getComponentType(), this.b));
        }
        java.lang.System.arraycopy(this.a, 0, tArr, 0, this.b);
        int length = tArr.length;
        int i2 = this.b;
        if (length > i2) {
            tArr[i2] = null;
        }
        return tArr;
    }

    public aeyj() {
        this.a = defpackage.aeut.a;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final java.lang.Object[] toArray() {
        int i = this.b;
        return i == 0 ? defpackage.aeut.a : java.util.Arrays.copyOf(this.a, i, java.lang.Object[].class);
    }
}
