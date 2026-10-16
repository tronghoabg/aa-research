package com.google.v;

import java.util.Arrays;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class fr<E> extends f<E> implements RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    private static final Object[] f12974a;

    /* renamed from: b, reason: collision with root package name */
    private static final fr f12975b;

    /* renamed from: c, reason: collision with root package name */
    private Object[] f12976c;

    /* renamed from: d, reason: collision with root package name */
    private int f12977d;

    static {
        Object[] objArr = new Object[0];
        f12974a = objArr;
        f12975b = new fr(objArr, 0, false);
    }

    fr() {
        this(f12974a, 0, true);
    }

    public static fr d() {
        return f12975b;
    }

    private final String g(int i2) {
        return "Index:" + i2 + ", Size:" + this.f12977d;
    }

    private final void h(int i2) {
        if (i2 < 0 || i2 >= this.f12977d) {
            throw new IndexOutOfBoundsException(g(i2));
        }
    }

    @Override // com.google.v.f, java.util.AbstractList, java.util.List
    public final void add(int i2, E e2) {
        int i3;
        bp();
        if (i2 < 0 || i2 > (i3 = this.f12977d)) {
            throw new IndexOutOfBoundsException(g(i2));
        }
        int i4 = i2 + 1;
        Object[] objArr = this.f12976c;
        int length = objArr.length;
        if (i3 < length) {
            System.arraycopy(objArr, i2, objArr, i4, i3 - i2);
        } else {
            Object[] objArr2 = new Object[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.f12976c, 0, objArr2, 0, i2);
            System.arraycopy(this.f12976c, i2, objArr2, i4, this.f12977d - i2);
            this.f12976c = objArr2;
        }
        this.f12976c[i2] = e2;
        this.f12977d++;
        this.modCount++;
    }

    final void e(int i2) {
        int length = this.f12976c.length;
        if (i2 <= length) {
            return;
        }
        if (length == 0) {
            this.f12976c = new Object[Math.max(i2, 10)];
            return;
        }
        while (length < i2) {
            length = Math.max(((length * 3) / 2) + 1, 10);
        }
        this.f12976c = Arrays.copyOf(this.f12976c, length);
    }

    @Override // com.google.v.f, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            return super.equals(obj);
        }
        List list = (List) obj;
        int i2 = this.f12977d;
        if (i2 != list.size()) {
            return false;
        }
        if (!(obj instanceof fr)) {
            for (int i3 = 0; i3 < i2; i3++) {
                if (!this.f12976c[i3].equals(list.get(i3))) {
                    return false;
                }
            }
            return true;
        }
        fr frVar = (fr) obj;
        for (int i4 = 0; i4 < i2; i4++) {
            if (!this.f12976c[i4].equals(frVar.f12976c[i4])) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.v.eo
    public final /* bridge */ /* synthetic */ eo f(int i2) {
        if (i2 >= this.f12977d) {
            return new fr(i2 == 0 ? f12974a : Arrays.copyOf(this.f12976c, i2), this.f12977d, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i2) {
        h(i2);
        return (E) this.f12976c[i2];
    }

    @Override // com.google.v.f, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i2 = this.f12977d;
        int iHashCode = 1;
        for (int i3 = 0; i3 < i2; i3++) {
            iHashCode = (iHashCode * 31) + this.f12976c[i3].hashCode();
        }
        return iHashCode;
    }

    @Override // com.google.v.f, java.util.AbstractList, java.util.List
    public final E remove(int i2) {
        bp();
        h(i2);
        Object[] objArr = this.f12976c;
        E e2 = (E) objArr[i2];
        if (i2 < this.f12977d - 1) {
            System.arraycopy(objArr, i2 + 1, objArr, i2, (r2 - i2) - 1);
        }
        this.f12977d--;
        this.modCount++;
        return e2;
    }

    @Override // com.google.v.f, java.util.AbstractList, java.util.List
    public final E set(int i2, E e2) {
        bp();
        h(i2);
        Object[] objArr = this.f12976c;
        E e3 = (E) objArr[i2];
        objArr[i2] = e2;
        this.modCount++;
        return e3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f12977d;
    }

    private fr(Object[] objArr, int i2, boolean z) {
        super(z);
        this.f12976c = objArr;
        this.f12977d = i2;
    }

    @Override // com.google.v.f, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e2) {
        bp();
        int i2 = this.f12977d;
        Object[] objArrCopyOf = this.f12976c;
        int length = objArrCopyOf.length;
        if (i2 == length) {
            objArrCopyOf = Arrays.copyOf(this.f12976c, Math.max(((length * 3) / 2) + 1, 10));
            this.f12976c = objArrCopyOf;
        }
        int i3 = this.f12977d;
        this.f12977d = i3 + 1;
        objArrCopyOf[i3] = e2;
        this.modCount++;
        return true;
    }
}
