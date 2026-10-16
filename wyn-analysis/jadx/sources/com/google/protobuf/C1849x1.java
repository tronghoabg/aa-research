package com.google.protobuf;

import Va.M6;
import com.google.protobuf.Internal;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* renamed from: com.google.protobuf.x1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1849x1 extends AbstractC1782b implements RandomAccess {

    /* renamed from: c, reason: collision with root package name */
    public static final C1849x1 f27789c = new C1849x1(new Object[0], 0, false);

    /* renamed from: a, reason: collision with root package name */
    public Object[] f27790a;

    /* renamed from: b, reason: collision with root package name */
    public int f27791b;

    public C1849x1(Object[] objArr, int i5, boolean z2) {
        super(z2);
        this.f27790a = objArr;
        this.f27791b = i5;
    }

    public final void a(int i5) {
        if (i5 < 0 || i5 >= this.f27791b) {
            StringBuilder sbL = pd.f.l(i5, "Index:", ", Size:");
            sbL.append(this.f27791b);
            throw new IndexOutOfBoundsException(sbL.toString());
        }
    }

    @Override // com.google.protobuf.AbstractC1782b, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        ensureIsMutable();
        int i5 = this.f27791b;
        Object[] objArr = this.f27790a;
        if (i5 == objArr.length) {
            this.f27790a = Arrays.copyOf(objArr, ((i5 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f27790a;
        int i10 = this.f27791b;
        this.f27791b = i10 + 1;
        objArr2[i10] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i5) {
        a(i5);
        return this.f27790a[i5];
    }

    @Override // com.google.protobuf.Internal.ProtobufList, com.google.protobuf.Internal.IntList
    /* renamed from: mutableCopyWithCapacity */
    public final Internal.ProtobufList mutableCopyWithCapacity2(int i5) {
        if (i5 >= this.f27791b) {
            return new C1849x1(Arrays.copyOf(this.f27790a, i5), this.f27791b, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.AbstractC1782b, java.util.AbstractList, java.util.List
    public final Object remove(int i5) {
        ensureIsMutable();
        a(i5);
        Object[] objArr = this.f27790a;
        Object obj = objArr[i5];
        if (i5 < this.f27791b - 1) {
            System.arraycopy(objArr, i5 + 1, objArr, i5, (r2 - i5) - 1);
        }
        this.f27791b--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i5, Object obj) {
        ensureIsMutable();
        a(i5);
        Object[] objArr = this.f27790a;
        Object obj2 = objArr[i5];
        objArr[i5] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f27791b;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i5, Object obj) {
        int i10;
        ensureIsMutable();
        if (i5 >= 0 && i5 <= (i10 = this.f27791b)) {
            Object[] objArr = this.f27790a;
            if (i10 < objArr.length) {
                System.arraycopy(objArr, i5, objArr, i5 + 1, i10 - i5);
            } else {
                Object[] objArr2 = new Object[M6.C(i10, 3, 2, 1)];
                System.arraycopy(objArr, 0, objArr2, 0, i5);
                System.arraycopy(this.f27790a, i5, objArr2, i5 + 1, this.f27791b - i5);
                this.f27790a = objArr2;
            }
            this.f27790a[i5] = obj;
            this.f27791b++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder sbL = pd.f.l(i5, "Index:", ", Size:");
        sbL.append(this.f27791b);
        throw new IndexOutOfBoundsException(sbL.toString());
    }
}
