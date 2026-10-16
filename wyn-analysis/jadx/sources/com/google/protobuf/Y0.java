package com.google.protobuf;

import Va.M6;
import com.google.protobuf.Internal;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes4.dex */
public final class Y0 extends AbstractC1782b implements Internal.LongList, RandomAccess, InterfaceC1843v1 {

    /* renamed from: c, reason: collision with root package name */
    public static final Y0 f27637c = new Y0(new long[0], 0, false);

    /* renamed from: a, reason: collision with root package name */
    public long[] f27638a;

    /* renamed from: b, reason: collision with root package name */
    public int f27639b;

    public Y0() {
        this(new long[10], 0, true);
    }

    public final void a(int i5) {
        if (i5 < 0 || i5 >= this.f27639b) {
            StringBuilder sbL = pd.f.l(i5, "Index:", ", Size:");
            sbL.append(this.f27639b);
            throw new IndexOutOfBoundsException(sbL.toString());
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i5, Object obj) {
        int i10;
        long jLongValue = ((Long) obj).longValue();
        ensureIsMutable();
        if (i5 < 0 || i5 > (i10 = this.f27639b)) {
            StringBuilder sbL = pd.f.l(i5, "Index:", ", Size:");
            sbL.append(this.f27639b);
            throw new IndexOutOfBoundsException(sbL.toString());
        }
        long[] jArr = this.f27638a;
        if (i10 < jArr.length) {
            System.arraycopy(jArr, i5, jArr, i5 + 1, i10 - i5);
        } else {
            long[] jArr2 = new long[M6.C(i10, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i5);
            System.arraycopy(this.f27638a, i5, jArr2, i5 + 1, this.f27639b - i5);
            this.f27638a = jArr2;
        }
        this.f27638a[i5] = jLongValue;
        this.f27639b++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.AbstractC1782b, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        ensureIsMutable();
        Internal.checkNotNull(collection);
        if (!(collection instanceof Y0)) {
            return super.addAll(collection);
        }
        Y0 y02 = (Y0) collection;
        int i5 = y02.f27639b;
        if (i5 == 0) {
            return false;
        }
        int i10 = this.f27639b;
        if (com.google.android.gms.common.api.f.API_PRIORITY_OTHER - i10 < i5) {
            throw new OutOfMemoryError();
        }
        int i11 = i10 + i5;
        long[] jArr = this.f27638a;
        if (i11 > jArr.length) {
            this.f27638a = Arrays.copyOf(jArr, i11);
        }
        System.arraycopy(y02.f27638a, 0, this.f27638a, this.f27639b, y02.f27639b);
        this.f27639b = i11;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.protobuf.Internal.LongList
    public final void addLong(long j8) {
        ensureIsMutable();
        int i5 = this.f27639b;
        long[] jArr = this.f27638a;
        if (i5 == jArr.length) {
            long[] jArr2 = new long[M6.C(i5, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i5);
            this.f27638a = jArr2;
        }
        long[] jArr3 = this.f27638a;
        int i10 = this.f27639b;
        this.f27639b = i10 + 1;
        jArr3[i10] = j8;
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
        if (!(obj instanceof Y0)) {
            return super.equals(obj);
        }
        Y0 y02 = (Y0) obj;
        if (this.f27639b != y02.f27639b) {
            return false;
        }
        long[] jArr = y02.f27638a;
        for (int i5 = 0; i5 < this.f27639b; i5++) {
            if (this.f27638a[i5] != jArr[i5]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i5) {
        return Long.valueOf(getLong(i5));
    }

    @Override // com.google.protobuf.Internal.LongList
    public final long getLong(int i5) {
        a(i5);
        return this.f27638a[i5];
    }

    @Override // com.google.protobuf.AbstractC1782b, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iHashLong = 1;
        for (int i5 = 0; i5 < this.f27639b; i5++) {
            iHashLong = (iHashLong * 31) + Internal.hashLong(this.f27638a[i5]);
        }
        return iHashLong;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int i5 = this.f27639b;
        for (int i10 = 0; i10 < i5; i10++) {
            if (this.f27638a[i10] == jLongValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.protobuf.AbstractC1782b, java.util.AbstractList, java.util.List
    public final Object remove(int i5) {
        ensureIsMutable();
        a(i5);
        long[] jArr = this.f27638a;
        long j8 = jArr[i5];
        if (i5 < this.f27639b - 1) {
            System.arraycopy(jArr, i5 + 1, jArr, i5, (r3 - i5) - 1);
        }
        this.f27639b--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j8);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i5, int i10) {
        ensureIsMutable();
        if (i10 < i5) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f27638a;
        System.arraycopy(jArr, i10, jArr, i5, this.f27639b - i10);
        this.f27639b -= i10 - i5;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i5, Object obj) {
        return Long.valueOf(setLong(i5, ((Long) obj).longValue()));
    }

    @Override // com.google.protobuf.Internal.LongList
    public final long setLong(int i5, long j8) {
        ensureIsMutable();
        a(i5);
        long[] jArr = this.f27638a;
        long j10 = jArr[i5];
        jArr[i5] = j8;
        return j10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f27639b;
    }

    public Y0(long[] jArr, int i5, boolean z2) {
        super(z2);
        this.f27638a = jArr;
        this.f27639b = i5;
    }

    @Override // com.google.protobuf.Internal.ProtobufList, com.google.protobuf.Internal.IntList
    /* renamed from: mutableCopyWithCapacity */
    public final Internal.ProtobufList<Long> mutableCopyWithCapacity2(int i5) {
        if (i5 >= this.f27639b) {
            return new Y0(Arrays.copyOf(this.f27638a, i5), this.f27639b, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.AbstractC1782b, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLong(((Long) obj).longValue());
        return true;
    }
}
