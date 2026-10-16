package com.google.protobuf;

import Va.M6;
import com.google.protobuf.Internal;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes4.dex */
public final class G0 extends AbstractC1782b implements Internal.IntList, RandomAccess, InterfaceC1843v1 {

    /* renamed from: c, reason: collision with root package name */
    public static final G0 f27566c = new G0(new int[0], 0, false);

    /* renamed from: a, reason: collision with root package name */
    public int[] f27567a;

    /* renamed from: b, reason: collision with root package name */
    public int f27568b;

    public G0() {
        this(new int[10], 0, true);
    }

    public final void a(int i5) {
        if (i5 < 0 || i5 >= this.f27568b) {
            StringBuilder sbL = pd.f.l(i5, "Index:", ", Size:");
            sbL.append(this.f27568b);
            throw new IndexOutOfBoundsException(sbL.toString());
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i5, Object obj) {
        int i10;
        int iIntValue = ((Integer) obj).intValue();
        ensureIsMutable();
        if (i5 < 0 || i5 > (i10 = this.f27568b)) {
            StringBuilder sbL = pd.f.l(i5, "Index:", ", Size:");
            sbL.append(this.f27568b);
            throw new IndexOutOfBoundsException(sbL.toString());
        }
        int[] iArr = this.f27567a;
        if (i10 < iArr.length) {
            System.arraycopy(iArr, i5, iArr, i5 + 1, i10 - i5);
        } else {
            int[] iArr2 = new int[M6.C(i10, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i5);
            System.arraycopy(this.f27567a, i5, iArr2, i5 + 1, this.f27568b - i5);
            this.f27567a = iArr2;
        }
        this.f27567a[i5] = iIntValue;
        this.f27568b++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.AbstractC1782b, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        ensureIsMutable();
        Internal.checkNotNull(collection);
        if (!(collection instanceof G0)) {
            return super.addAll(collection);
        }
        G0 g02 = (G0) collection;
        int i5 = g02.f27568b;
        if (i5 == 0) {
            return false;
        }
        int i10 = this.f27568b;
        if (com.google.android.gms.common.api.f.API_PRIORITY_OTHER - i10 < i5) {
            throw new OutOfMemoryError();
        }
        int i11 = i10 + i5;
        int[] iArr = this.f27567a;
        if (i11 > iArr.length) {
            this.f27567a = Arrays.copyOf(iArr, i11);
        }
        System.arraycopy(g02.f27567a, 0, this.f27567a, this.f27568b, g02.f27568b);
        this.f27568b = i11;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.protobuf.Internal.IntList
    public final void addInt(int i5) {
        ensureIsMutable();
        int i10 = this.f27568b;
        int[] iArr = this.f27567a;
        if (i10 == iArr.length) {
            int[] iArr2 = new int[M6.C(i10, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i10);
            this.f27567a = iArr2;
        }
        int[] iArr3 = this.f27567a;
        int i11 = this.f27568b;
        this.f27568b = i11 + 1;
        iArr3[i11] = i5;
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
        if (!(obj instanceof G0)) {
            return super.equals(obj);
        }
        G0 g02 = (G0) obj;
        if (this.f27568b != g02.f27568b) {
            return false;
        }
        int[] iArr = g02.f27567a;
        for (int i5 = 0; i5 < this.f27568b; i5++) {
            if (this.f27567a[i5] != iArr[i5]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i5) {
        return Integer.valueOf(getInt(i5));
    }

    @Override // com.google.protobuf.Internal.IntList
    public final int getInt(int i5) {
        a(i5);
        return this.f27567a[i5];
    }

    @Override // com.google.protobuf.AbstractC1782b, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i5 = 1;
        for (int i10 = 0; i10 < this.f27568b; i10++) {
            i5 = (i5 * 31) + this.f27567a[i10];
        }
        return i5;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i5 = this.f27568b;
        for (int i10 = 0; i10 < i5; i10++) {
            if (this.f27567a[i10] == iIntValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.protobuf.AbstractC1782b, java.util.AbstractList, java.util.List
    public final Object remove(int i5) {
        ensureIsMutable();
        a(i5);
        int[] iArr = this.f27567a;
        int i10 = iArr[i5];
        if (i5 < this.f27568b - 1) {
            System.arraycopy(iArr, i5 + 1, iArr, i5, (r2 - i5) - 1);
        }
        this.f27568b--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i5, int i10) {
        ensureIsMutable();
        if (i10 < i5) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f27567a;
        System.arraycopy(iArr, i10, iArr, i5, this.f27568b - i10);
        this.f27568b -= i10 - i5;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i5, Object obj) {
        return Integer.valueOf(setInt(i5, ((Integer) obj).intValue()));
    }

    @Override // com.google.protobuf.Internal.IntList
    public final int setInt(int i5, int i10) {
        ensureIsMutable();
        a(i5);
        int[] iArr = this.f27567a;
        int i11 = iArr[i5];
        iArr[i5] = i10;
        return i11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f27568b;
    }

    public G0(int[] iArr, int i5, boolean z2) {
        super(z2);
        this.f27567a = iArr;
        this.f27568b = i5;
    }

    @Override // com.google.protobuf.Internal.ProtobufList, com.google.protobuf.Internal.IntList
    /* renamed from: mutableCopyWithCapacity, reason: merged with bridge method [inline-methods] */
    public final Internal.ProtobufList<Integer> mutableCopyWithCapacity2(int i5) {
        if (i5 >= this.f27568b) {
            return new G0(Arrays.copyOf(this.f27567a, i5), this.f27568b, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.AbstractC1782b, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addInt(((Integer) obj).intValue());
        return true;
    }
}
