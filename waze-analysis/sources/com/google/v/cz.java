package com.google.v;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class cz extends f implements RandomAccess, ef, fp {

    /* renamed from: a, reason: collision with root package name */
    private static final double[] f12834a;

    /* renamed from: b, reason: collision with root package name */
    private static final cz f12835b;

    /* renamed from: c, reason: collision with root package name */
    private double[] f12836c;

    /* renamed from: d, reason: collision with root package name */
    private int f12837d;

    static {
        double[] dArr = new double[0];
        f12834a = dArr;
        f12835b = new cz(dArr, 0, false);
    }

    cz() {
        this(f12834a, 0, true);
    }

    public static cz e() {
        return f12835b;
    }

    private final String j(int i2) {
        return "Index:" + i2 + ", Size:" + this.f12837d;
    }

    private final void k(int i2) {
        if (i2 < 0 || i2 >= this.f12837d) {
            throw new IndexOutOfBoundsException(j(i2));
        }
    }

    @Override // com.google.v.f, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i2, Object obj) {
        int i3;
        double dDoubleValue = ((Double) obj).doubleValue();
        bp();
        if (i2 < 0 || i2 > (i3 = this.f12837d)) {
            throw new IndexOutOfBoundsException(j(i2));
        }
        int i4 = i2 + 1;
        double[] dArr = this.f12836c;
        int length = dArr.length;
        if (i3 < length) {
            System.arraycopy(dArr, i2, dArr, i4, i3 - i2);
        } else {
            double[] dArr2 = new double[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.f12836c, 0, dArr2, 0, i2);
            System.arraycopy(this.f12836c, i2, dArr2, i4, this.f12837d - i2);
            this.f12836c = dArr2;
        }
        this.f12836c[i2] = dDoubleValue;
        this.f12837d++;
        this.modCount++;
    }

    @Override // com.google.v.f, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Double> collection) {
        bp();
        collection.getClass();
        if (!(collection instanceof cz)) {
            return super.addAll(collection);
        }
        cz czVar = (cz) collection;
        int i2 = czVar.f12837d;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f12837d;
        if (Integer.MAX_VALUE - i3 < i2) {
            throw new OutOfMemoryError();
        }
        int i4 = i3 + i2;
        double[] dArrCopyOf = this.f12836c;
        if (i4 > dArrCopyOf.length) {
            dArrCopyOf = Arrays.copyOf(dArrCopyOf, i4);
            this.f12836c = dArrCopyOf;
        }
        System.arraycopy(czVar.f12836c, 0, dArrCopyOf, this.f12837d, czVar.f12837d);
        this.f12837d = i4;
        this.modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final double d(int i2) {
        k(i2);
        return this.f12836c[i2];
    }

    @Override // com.google.v.f, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cz)) {
            return super.equals(obj);
        }
        cz czVar = (cz) obj;
        if (this.f12837d != czVar.f12837d) {
            return false;
        }
        double[] dArr = czVar.f12836c;
        for (int i2 = 0; i2 < this.f12837d; i2++) {
            if (Double.doubleToLongBits(this.f12836c[i2]) != Double.doubleToLongBits(dArr[i2])) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.v.eo
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final ef f(int i2) {
        if (i2 >= this.f12837d) {
            return new cz(i2 == 0 ? f12834a : Arrays.copyOf(this.f12836c, i2), this.f12837d, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i2) {
        return Double.valueOf(d(i2));
    }

    public final void h(double d2) {
        bp();
        int i2 = this.f12837d;
        double[] dArr = this.f12836c;
        int length = dArr.length;
        if (i2 == length) {
            dArr = new double[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.f12836c, 0, dArr, 0, this.f12837d);
            this.f12836c = dArr;
        }
        int i3 = this.f12837d;
        this.f12837d = i3 + 1;
        dArr[i3] = d2;
    }

    @Override // com.google.v.f, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iB = 1;
        for (int i2 = 0; i2 < this.f12837d; i2++) {
            long jDoubleToLongBits = Double.doubleToLongBits(this.f12836c[i2]);
            byte[] bArr = ep.f12912a;
            iB = (iB * 31) + a.a.b(jDoubleToLongBits);
        }
        return iB;
    }

    final void i(int i2) {
        int length = this.f12836c.length;
        if (i2 <= length) {
            return;
        }
        if (length == 0) {
            this.f12836c = new double[Math.max(i2, 10)];
            return;
        }
        while (length < i2) {
            length = Math.max(((length * 3) / 2) + 1, 10);
        }
        this.f12836c = Arrays.copyOf(this.f12836c, length);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        int i2 = this.f12837d;
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.f12836c[i3] == dDoubleValue) {
                return i3;
            }
        }
        return -1;
    }

    @Override // com.google.v.f, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i2) {
        bp();
        k(i2);
        double[] dArr = this.f12836c;
        double d2 = dArr[i2];
        if (i2 < this.f12837d - 1) {
            System.arraycopy(dArr, i2 + 1, dArr, i2, (r3 - i2) - 1);
        }
        this.f12837d--;
        this.modCount++;
        return Double.valueOf(d2);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i2, int i3) {
        bp();
        if (i3 < i2) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.f12836c;
        System.arraycopy(dArr, i3, dArr, i2, this.f12837d - i3);
        this.f12837d -= i3 - i2;
        this.modCount++;
    }

    @Override // com.google.v.f, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i2, Object obj) {
        double dDoubleValue = ((Double) obj).doubleValue();
        bp();
        k(i2);
        double[] dArr = this.f12836c;
        double d2 = dArr[i2];
        dArr[i2] = dDoubleValue;
        return Double.valueOf(d2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f12837d;
    }

    private cz(double[] dArr, int i2, boolean z) {
        super(z);
        this.f12836c = dArr;
        this.f12837d = i2;
    }

    @Override // com.google.v.f, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        h(((Double) obj).doubleValue());
        return true;
    }
}
