package o8;

import Fe.e;
import S3.f;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: o8.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3656b extends AbstractList implements RandomAccess, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final int[] f41427a;

    /* renamed from: b, reason: collision with root package name */
    public final int f41428b;

    /* renamed from: c, reason: collision with root package name */
    public final int f41429c;

    public C3656b(int[] iArr, int i5, int i10) {
        this.f41427a = iArr;
        this.f41428b = i5;
        this.f41429c = i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (obj instanceof Integer) {
            return f.w(this.f41427a, ((Integer) obj).intValue(), this.f41428b, this.f41429c) != -1;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3656b)) {
            return super.equals(obj);
        }
        C3656b c3656b = (C3656b) obj;
        int size = size();
        if (c3656b.size() != size) {
            return false;
        }
        for (int i5 = 0; i5 < size; i5++) {
            if (this.f41427a[this.f41428b + i5] != c3656b.f41427a[c3656b.f41428b + i5]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i5) {
        e.s(i5, size());
        return Integer.valueOf(this.f41427a[this.f41428b + i5]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i5 = 1;
        for (int i10 = this.f41428b; i10 < this.f41429c; i10++) {
            i5 = (i5 * 31) + this.f41427a[i10];
        }
        return i5;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int[] iArr = this.f41427a;
        int i5 = this.f41428b;
        int iW = f.w(iArr, iIntValue, i5, this.f41429c);
        if (iW >= 0) {
            return iW - i5;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int i5;
        if (obj instanceof Integer) {
            int iIntValue = ((Integer) obj).intValue();
            int i10 = this.f41429c;
            while (true) {
                i10--;
                i5 = this.f41428b;
                if (i10 < i5) {
                    i10 = -1;
                    break;
                }
                if (this.f41427a[i10] == iIntValue) {
                    break;
                }
            }
            if (i10 >= 0) {
                return i10 - i5;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i5, Object obj) {
        Integer num = (Integer) obj;
        e.s(i5, size());
        int i10 = this.f41428b + i5;
        int[] iArr = this.f41427a;
        int i11 = iArr[i10];
        num.getClass();
        iArr[i10] = num.intValue();
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f41429c - this.f41428b;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i5, int i10) {
        e.v(i5, i10, size());
        if (i5 == i10) {
            return Collections.EMPTY_LIST;
        }
        int i11 = this.f41428b;
        return new C3656b(this.f41427a, i5 + i11, i11 + i10);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        StringBuilder sb2 = new StringBuilder(size() * 5);
        sb2.append('[');
        int[] iArr = this.f41427a;
        int i5 = this.f41428b;
        sb2.append(iArr[i5]);
        while (true) {
            i5++;
            if (i5 >= this.f41429c) {
                sb2.append(']');
                return sb2.toString();
            }
            sb2.append(", ");
            sb2.append(iArr[i5]);
        }
    }
}
