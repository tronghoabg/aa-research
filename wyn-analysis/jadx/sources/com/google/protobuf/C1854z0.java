package com.google.protobuf;

import Va.M6;
import com.google.protobuf.Internal;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.protobuf.z0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1854z0 extends AbstractC1782b implements Internal.FloatList, RandomAccess, InterfaceC1843v1 {

    /* renamed from: c, reason: collision with root package name */
    public static final C1854z0 f27820c = new C1854z0(new float[0], 0, false);

    /* renamed from: a, reason: collision with root package name */
    public float[] f27821a;

    /* renamed from: b, reason: collision with root package name */
    public int f27822b;

    public C1854z0(float[] fArr, int i5, boolean z2) {
        super(z2);
        this.f27821a = fArr;
        this.f27822b = i5;
    }

    public final void a(int i5) {
        if (i5 < 0 || i5 >= this.f27822b) {
            StringBuilder sbL = pd.f.l(i5, "Index:", ", Size:");
            sbL.append(this.f27822b);
            throw new IndexOutOfBoundsException(sbL.toString());
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i5, Object obj) {
        int i10;
        float fFloatValue = ((Float) obj).floatValue();
        ensureIsMutable();
        if (i5 < 0 || i5 > (i10 = this.f27822b)) {
            StringBuilder sbL = pd.f.l(i5, "Index:", ", Size:");
            sbL.append(this.f27822b);
            throw new IndexOutOfBoundsException(sbL.toString());
        }
        float[] fArr = this.f27821a;
        if (i10 < fArr.length) {
            System.arraycopy(fArr, i5, fArr, i5 + 1, i10 - i5);
        } else {
            float[] fArr2 = new float[M6.C(i10, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i5);
            System.arraycopy(this.f27821a, i5, fArr2, i5 + 1, this.f27822b - i5);
            this.f27821a = fArr2;
        }
        this.f27821a[i5] = fFloatValue;
        this.f27822b++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.AbstractC1782b, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        ensureIsMutable();
        Internal.checkNotNull(collection);
        if (!(collection instanceof C1854z0)) {
            return super.addAll(collection);
        }
        C1854z0 c1854z0 = (C1854z0) collection;
        int i5 = c1854z0.f27822b;
        if (i5 == 0) {
            return false;
        }
        int i10 = this.f27822b;
        if (com.google.android.gms.common.api.f.API_PRIORITY_OTHER - i10 < i5) {
            throw new OutOfMemoryError();
        }
        int i11 = i10 + i5;
        float[] fArr = this.f27821a;
        if (i11 > fArr.length) {
            this.f27821a = Arrays.copyOf(fArr, i11);
        }
        System.arraycopy(c1854z0.f27821a, 0, this.f27821a, this.f27822b, c1854z0.f27822b);
        this.f27822b = i11;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.protobuf.Internal.FloatList
    public final void addFloat(float f10) {
        ensureIsMutable();
        int i5 = this.f27822b;
        float[] fArr = this.f27821a;
        if (i5 == fArr.length) {
            float[] fArr2 = new float[M6.C(i5, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i5);
            this.f27821a = fArr2;
        }
        float[] fArr3 = this.f27821a;
        int i10 = this.f27822b;
        this.f27822b = i10 + 1;
        fArr3[i10] = f10;
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
        if (!(obj instanceof C1854z0)) {
            return super.equals(obj);
        }
        C1854z0 c1854z0 = (C1854z0) obj;
        if (this.f27822b != c1854z0.f27822b) {
            return false;
        }
        float[] fArr = c1854z0.f27821a;
        for (int i5 = 0; i5 < this.f27822b; i5++) {
            if (Float.floatToIntBits(this.f27821a[i5]) != Float.floatToIntBits(fArr[i5])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i5) {
        return Float.valueOf(getFloat(i5));
    }

    @Override // com.google.protobuf.Internal.FloatList
    public final float getFloat(int i5) {
        a(i5);
        return this.f27821a[i5];
    }

    @Override // com.google.protobuf.AbstractC1782b, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i5 = 0; i5 < this.f27822b; i5++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.f27821a[i5]);
        }
        return iFloatToIntBits;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) obj).floatValue();
        int i5 = this.f27822b;
        for (int i10 = 0; i10 < i5; i10++) {
            if (this.f27821a[i10] == fFloatValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.protobuf.AbstractC1782b, java.util.AbstractList, java.util.List
    public final Object remove(int i5) {
        ensureIsMutable();
        a(i5);
        float[] fArr = this.f27821a;
        float f10 = fArr[i5];
        if (i5 < this.f27822b - 1) {
            System.arraycopy(fArr, i5 + 1, fArr, i5, (r2 - i5) - 1);
        }
        this.f27822b--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i5, int i10) {
        ensureIsMutable();
        if (i10 < i5) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.f27821a;
        System.arraycopy(fArr, i10, fArr, i5, this.f27822b - i10);
        this.f27822b -= i10 - i5;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i5, Object obj) {
        return Float.valueOf(setFloat(i5, ((Float) obj).floatValue()));
    }

    @Override // com.google.protobuf.Internal.FloatList
    public final float setFloat(int i5, float f10) {
        ensureIsMutable();
        a(i5);
        float[] fArr = this.f27821a;
        float f11 = fArr[i5];
        fArr[i5] = f10;
        return f11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f27822b;
    }

    @Override // com.google.protobuf.Internal.ProtobufList, com.google.protobuf.Internal.IntList
    /* renamed from: mutableCopyWithCapacity */
    public final Internal.ProtobufList<Float> mutableCopyWithCapacity2(int i5) {
        if (i5 >= this.f27822b) {
            return new C1854z0(Arrays.copyOf(this.f27821a, i5), this.f27822b, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.AbstractC1782b, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addFloat(((Float) obj).floatValue());
        return true;
    }
}
