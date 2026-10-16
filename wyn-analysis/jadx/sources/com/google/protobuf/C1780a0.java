package com.google.protobuf;

import Va.M6;
import com.google.protobuf.Internal;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.protobuf.a0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1780a0 extends AbstractC1782b implements Internal.DoubleList, RandomAccess, InterfaceC1843v1 {

    /* renamed from: c, reason: collision with root package name */
    public static final C1780a0 f27644c = new C1780a0(new double[0], 0, false);

    /* renamed from: a, reason: collision with root package name */
    public double[] f27645a;

    /* renamed from: b, reason: collision with root package name */
    public int f27646b;

    public C1780a0(double[] dArr, int i5, boolean z2) {
        super(z2);
        this.f27645a = dArr;
        this.f27646b = i5;
    }

    public final void a(int i5) {
        if (i5 < 0 || i5 >= this.f27646b) {
            StringBuilder sbL = pd.f.l(i5, "Index:", ", Size:");
            sbL.append(this.f27646b);
            throw new IndexOutOfBoundsException(sbL.toString());
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i5, Object obj) {
        int i10;
        double dDoubleValue = ((Double) obj).doubleValue();
        ensureIsMutable();
        if (i5 < 0 || i5 > (i10 = this.f27646b)) {
            StringBuilder sbL = pd.f.l(i5, "Index:", ", Size:");
            sbL.append(this.f27646b);
            throw new IndexOutOfBoundsException(sbL.toString());
        }
        double[] dArr = this.f27645a;
        if (i10 < dArr.length) {
            System.arraycopy(dArr, i5, dArr, i5 + 1, i10 - i5);
        } else {
            double[] dArr2 = new double[M6.C(i10, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i5);
            System.arraycopy(this.f27645a, i5, dArr2, i5 + 1, this.f27646b - i5);
            this.f27645a = dArr2;
        }
        this.f27645a[i5] = dDoubleValue;
        this.f27646b++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.AbstractC1782b, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        ensureIsMutable();
        Internal.checkNotNull(collection);
        if (!(collection instanceof C1780a0)) {
            return super.addAll(collection);
        }
        C1780a0 c1780a0 = (C1780a0) collection;
        int i5 = c1780a0.f27646b;
        if (i5 == 0) {
            return false;
        }
        int i10 = this.f27646b;
        if (com.google.android.gms.common.api.f.API_PRIORITY_OTHER - i10 < i5) {
            throw new OutOfMemoryError();
        }
        int i11 = i10 + i5;
        double[] dArr = this.f27645a;
        if (i11 > dArr.length) {
            this.f27645a = Arrays.copyOf(dArr, i11);
        }
        System.arraycopy(c1780a0.f27645a, 0, this.f27645a, this.f27646b, c1780a0.f27646b);
        this.f27646b = i11;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.protobuf.Internal.DoubleList
    public final void addDouble(double d3) {
        ensureIsMutable();
        int i5 = this.f27646b;
        double[] dArr = this.f27645a;
        if (i5 == dArr.length) {
            double[] dArr2 = new double[M6.C(i5, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i5);
            this.f27645a = dArr2;
        }
        double[] dArr3 = this.f27645a;
        int i10 = this.f27646b;
        this.f27646b = i10 + 1;
        dArr3[i10] = d3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.protobuf.AbstractC1782b, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1780a0)) {
            return super.equals(obj);
        }
        C1780a0 c1780a0 = (C1780a0) obj;
        if (this.f27646b != c1780a0.f27646b) {
            return false;
        }
        double[] dArr = c1780a0.f27645a;
        for (int i5 = 0; i5 < this.f27646b; i5++) {
            if (Double.doubleToLongBits(this.f27645a[i5]) != Double.doubleToLongBits(dArr[i5])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i5) {
        return Double.valueOf(getDouble(i5));
    }

    @Override // com.google.protobuf.Internal.DoubleList
    public final double getDouble(int i5) {
        a(i5);
        return this.f27645a[i5];
    }

    @Override // com.google.protobuf.AbstractC1782b, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iHashLong = 1;
        for (int i5 = 0; i5 < this.f27646b; i5++) {
            iHashLong = (iHashLong * 31) + Internal.hashLong(Double.doubleToLongBits(this.f27645a[i5]));
        }
        return iHashLong;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        int i5 = this.f27646b;
        for (int i10 = 0; i10 < i5; i10++) {
            if (this.f27645a[i10] == dDoubleValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.protobuf.AbstractC1782b, java.util.AbstractList, java.util.List
    public final Object remove(int i5) {
        ensureIsMutable();
        a(i5);
        double[] dArr = this.f27645a;
        double d3 = dArr[i5];
        if (i5 < this.f27646b - 1) {
            System.arraycopy(dArr, i5 + 1, dArr, i5, (r3 - i5) - 1);
        }
        this.f27646b--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d3);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i5, int i10) {
        ensureIsMutable();
        if (i10 < i5) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.f27645a;
        System.arraycopy(dArr, i10, dArr, i5, this.f27646b - i10);
        this.f27646b -= i10 - i5;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i5, Object obj) {
        return Double.valueOf(setDouble(i5, ((Double) obj).doubleValue()));
    }

    @Override // com.google.protobuf.Internal.DoubleList
    public final double setDouble(int i5, double d3) {
        ensureIsMutable();
        a(i5);
        double[] dArr = this.f27645a;
        double d5 = dArr[i5];
        dArr[i5] = d3;
        return d5;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f27646b;
    }

    @Override // com.google.protobuf.Internal.ProtobufList, com.google.protobuf.Internal.IntList
    /* renamed from: mutableCopyWithCapacity */
    public final Internal.ProtobufList<Double> mutableCopyWithCapacity2(int i5) {
        if (i5 >= this.f27646b) {
            return new C1780a0(Arrays.copyOf(this.f27645a, i5), this.f27646b, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.AbstractC1782b, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addDouble(((Double) obj).doubleValue());
        return true;
    }
}
