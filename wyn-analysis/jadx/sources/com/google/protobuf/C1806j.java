package com.google.protobuf;

import Va.M6;
import com.google.protobuf.Internal;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.protobuf.j, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1806j extends AbstractC1782b implements Internal.BooleanList, RandomAccess, InterfaceC1843v1 {

    /* renamed from: c, reason: collision with root package name */
    public static final C1806j f27690c = new C1806j(new boolean[0], 0, false);

    /* renamed from: a, reason: collision with root package name */
    public boolean[] f27691a;

    /* renamed from: b, reason: collision with root package name */
    public int f27692b;

    public C1806j(boolean[] zArr, int i5, boolean z2) {
        super(z2);
        this.f27691a = zArr;
        this.f27692b = i5;
    }

    public final void a(int i5) {
        if (i5 < 0 || i5 >= this.f27692b) {
            StringBuilder sbL = pd.f.l(i5, "Index:", ", Size:");
            sbL.append(this.f27692b);
            throw new IndexOutOfBoundsException(sbL.toString());
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i5, Object obj) {
        int i10;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        ensureIsMutable();
        if (i5 < 0 || i5 > (i10 = this.f27692b)) {
            StringBuilder sbL = pd.f.l(i5, "Index:", ", Size:");
            sbL.append(this.f27692b);
            throw new IndexOutOfBoundsException(sbL.toString());
        }
        boolean[] zArr = this.f27691a;
        if (i10 < zArr.length) {
            System.arraycopy(zArr, i5, zArr, i5 + 1, i10 - i5);
        } else {
            boolean[] zArr2 = new boolean[M6.C(i10, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i5);
            System.arraycopy(this.f27691a, i5, zArr2, i5 + 1, this.f27692b - i5);
            this.f27691a = zArr2;
        }
        this.f27691a[i5] = zBooleanValue;
        this.f27692b++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.AbstractC1782b, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        ensureIsMutable();
        Internal.checkNotNull(collection);
        if (!(collection instanceof C1806j)) {
            return super.addAll(collection);
        }
        C1806j c1806j = (C1806j) collection;
        int i5 = c1806j.f27692b;
        if (i5 == 0) {
            return false;
        }
        int i10 = this.f27692b;
        if (com.google.android.gms.common.api.f.API_PRIORITY_OTHER - i10 < i5) {
            throw new OutOfMemoryError();
        }
        int i11 = i10 + i5;
        boolean[] zArr = this.f27691a;
        if (i11 > zArr.length) {
            this.f27691a = Arrays.copyOf(zArr, i11);
        }
        System.arraycopy(c1806j.f27691a, 0, this.f27691a, this.f27692b, c1806j.f27692b);
        this.f27692b = i11;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.protobuf.Internal.BooleanList
    public final void addBoolean(boolean z2) {
        ensureIsMutable();
        int i5 = this.f27692b;
        boolean[] zArr = this.f27691a;
        if (i5 == zArr.length) {
            boolean[] zArr2 = new boolean[M6.C(i5, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i5);
            this.f27691a = zArr2;
        }
        boolean[] zArr3 = this.f27691a;
        int i10 = this.f27692b;
        this.f27692b = i10 + 1;
        zArr3[i10] = z2;
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
        if (!(obj instanceof C1806j)) {
            return super.equals(obj);
        }
        C1806j c1806j = (C1806j) obj;
        if (this.f27692b != c1806j.f27692b) {
            return false;
        }
        boolean[] zArr = c1806j.f27691a;
        for (int i5 = 0; i5 < this.f27692b; i5++) {
            if (this.f27691a[i5] != zArr[i5]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i5) {
        return Boolean.valueOf(getBoolean(i5));
    }

    @Override // com.google.protobuf.Internal.BooleanList
    public final boolean getBoolean(int i5) {
        a(i5);
        return this.f27691a[i5];
    }

    @Override // com.google.protobuf.AbstractC1782b, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iHashBoolean = 1;
        for (int i5 = 0; i5 < this.f27692b; i5++) {
            iHashBoolean = (iHashBoolean * 31) + Internal.hashBoolean(this.f27691a[i5]);
        }
        return iHashBoolean;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int i5 = this.f27692b;
        for (int i10 = 0; i10 < i5; i10++) {
            if (this.f27691a[i10] == zBooleanValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.protobuf.AbstractC1782b, java.util.AbstractList, java.util.List
    public final Object remove(int i5) {
        ensureIsMutable();
        a(i5);
        boolean[] zArr = this.f27691a;
        boolean z2 = zArr[i5];
        if (i5 < this.f27692b - 1) {
            System.arraycopy(zArr, i5 + 1, zArr, i5, (r2 - i5) - 1);
        }
        this.f27692b--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z2);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i5, int i10) {
        ensureIsMutable();
        if (i10 < i5) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.f27691a;
        System.arraycopy(zArr, i10, zArr, i5, this.f27692b - i10);
        this.f27692b -= i10 - i5;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i5, Object obj) {
        return Boolean.valueOf(setBoolean(i5, ((Boolean) obj).booleanValue()));
    }

    @Override // com.google.protobuf.Internal.BooleanList
    public final boolean setBoolean(int i5, boolean z2) {
        ensureIsMutable();
        a(i5);
        boolean[] zArr = this.f27691a;
        boolean z10 = zArr[i5];
        zArr[i5] = z2;
        return z10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f27692b;
    }

    @Override // com.google.protobuf.Internal.ProtobufList, com.google.protobuf.Internal.IntList
    /* renamed from: mutableCopyWithCapacity */
    public final Internal.ProtobufList<Boolean> mutableCopyWithCapacity2(int i5) {
        if (i5 >= this.f27692b) {
            return new C1806j(Arrays.copyOf(this.f27691a, i5), this.f27692b, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.AbstractC1782b, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addBoolean(((Boolean) obj).booleanValue());
        return true;
    }
}
