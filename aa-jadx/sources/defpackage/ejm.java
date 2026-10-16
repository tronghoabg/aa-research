package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ejm extends defpackage.ein implements java.util.RandomAccess, defpackage.eju, defpackage.ekt {
    private static final float[] b;
    public int a;
    private float[] c;

    static {
        float[] fArr = new float[0];
        b = fArr;
        new defpackage.ejm(fArr, 0, false);
    }

    ejm() {
        this(b, 0, true);
    }

    private final java.lang.String g(int i) {
        return "Index:" + i + ", Size:" + this.a;
    }

    private final void h(int i) {
        if (i < 0 || i >= this.a) {
            throw new java.lang.IndexOutOfBoundsException(g(i));
        }
    }

    @Override // defpackage.ein, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, java.lang.Object obj) {
        int i2;
        float fFloatValue = ((java.lang.Float) obj).floatValue();
        a();
        if (i < 0 || i > (i2 = this.a)) {
            throw new java.lang.IndexOutOfBoundsException(g(i));
        }
        int i3 = i + 1;
        float[] fArr = this.c;
        int length = fArr.length;
        if (i2 < length) {
            java.lang.System.arraycopy(fArr, i, fArr, i3, i2 - i);
        } else {
            float[] fArr2 = new float[java.lang.Math.max(((length * 3) / 2) + 1, 10)];
            java.lang.System.arraycopy(this.c, 0, fArr2, 0, i);
            java.lang.System.arraycopy(this.c, i, fArr2, i3, this.a - i);
            this.c = fArr2;
        }
        this.c[i] = fFloatValue;
        this.a++;
        this.modCount++;
    }

    @Override // defpackage.ein, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(java.util.Collection<? extends java.lang.Float> collection) {
        a();
        defpackage.ejv.a(collection);
        if (!(collection instanceof defpackage.ejm)) {
            return super.addAll(collection);
        }
        defpackage.ejm ejmVar = (defpackage.ejm) collection;
        int i = ejmVar.a;
        if (i == 0) {
            return false;
        }
        int i2 = this.a;
        if (androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY - i2 < i) {
            throw new java.lang.OutOfMemoryError();
        }
        int i3 = i2 + i;
        float[] fArrCopyOf = this.c;
        if (i3 > fArrCopyOf.length) {
            fArrCopyOf = java.util.Arrays.copyOf(fArrCopyOf, i3);
            this.c = fArrCopyOf;
        }
        java.lang.System.arraycopy(ejmVar.c, 0, fArrCopyOf, this.a, ejmVar.a);
        this.a = i3;
        this.modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(java.lang.Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // defpackage.eju
    public final /* bridge */ /* synthetic */ defpackage.eju d(int i) {
        if (i >= this.a) {
            return new defpackage.ejm(i == 0 ? b : java.util.Arrays.copyOf(this.c, i), this.a, true);
        }
        throw new java.lang.IllegalArgumentException();
    }

    public final float e(int i) {
        h(i);
        return this.c[i];
    }

    @Override // defpackage.ein, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.ejm)) {
            return super.equals(obj);
        }
        defpackage.ejm ejmVar = (defpackage.ejm) obj;
        if (this.a != ejmVar.a) {
            return false;
        }
        float[] fArr = ejmVar.c;
        for (int i = 0; i < this.a; i++) {
            if (java.lang.Float.floatToIntBits(this.c[i]) != java.lang.Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    public final void f(float f) {
        a();
        int i = this.a;
        float[] fArr = this.c;
        int length = fArr.length;
        if (i == length) {
            fArr = new float[java.lang.Math.max(((length * 3) / 2) + 1, 10)];
            java.lang.System.arraycopy(this.c, 0, fArr, 0, this.a);
            this.c = fArr;
        }
        int i2 = this.a;
        this.a = i2 + 1;
        fArr[i2] = f;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object get(int i) {
        return java.lang.Float.valueOf(e(i));
    }

    @Override // defpackage.ein, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i = 0; i < this.a; i++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + java.lang.Float.floatToIntBits(this.c[i]);
        }
        return iFloatToIntBits;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(java.lang.Object obj) {
        if (!(obj instanceof java.lang.Float)) {
            return -1;
        }
        float fFloatValue = ((java.lang.Float) obj).floatValue();
        int i = this.a;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.c[i2] == fFloatValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // defpackage.ein, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object remove(int i) {
        a();
        h(i);
        float[] fArr = this.c;
        float f = fArr[i];
        int i2 = this.a;
        if (i < i2 - 1) {
            java.lang.System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.a--;
        this.modCount++;
        return java.lang.Float.valueOf(f);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        a();
        if (i2 < i) {
            throw new java.lang.IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.c;
        java.lang.System.arraycopy(fArr, i2, fArr, i, this.a - i2);
        this.a -= i2 - i;
        this.modCount++;
    }

    @Override // defpackage.ein, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ java.lang.Object set(int i, java.lang.Object obj) {
        float fFloatValue = ((java.lang.Float) obj).floatValue();
        a();
        h(i);
        float[] fArr = this.c;
        float f = fArr[i];
        fArr[i] = fFloatValue;
        return java.lang.Float.valueOf(f);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a;
    }

    private ejm(float[] fArr, int i, boolean z) {
        super(z);
        this.c = fArr;
        this.a = i;
    }

    @Override // defpackage.ein, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(java.lang.Object obj) {
        f(((java.lang.Float) obj).floatValue());
        return true;
    }
}
