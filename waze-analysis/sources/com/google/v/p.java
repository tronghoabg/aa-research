package com.google.v;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class p extends f implements RandomAccess, ee, fp {

    /* renamed from: a, reason: collision with root package name */
    private static final boolean[] f13043a;

    /* renamed from: b, reason: collision with root package name */
    private static final p f13044b;

    /* renamed from: c, reason: collision with root package name */
    private boolean[] f13045c;

    /* renamed from: d, reason: collision with root package name */
    private int f13046d;

    static {
        boolean[] zArr = new boolean[0];
        f13043a = zArr;
        f13044b = new p(zArr, 0, false);
    }

    p() {
        this(f13043a, 0, true);
    }

    public static p d() {
        return f13044b;
    }

    private final String i(int i2) {
        return "Index:" + i2 + ", Size:" + this.f13046d;
    }

    private final void j(int i2) {
        if (i2 < 0 || i2 >= this.f13046d) {
            throw new IndexOutOfBoundsException(i(i2));
        }
    }

    @Override // com.google.v.f, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i2, Object obj) {
        int i3;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        bp();
        if (i2 < 0 || i2 > (i3 = this.f13046d)) {
            throw new IndexOutOfBoundsException(i(i2));
        }
        int i4 = i2 + 1;
        boolean[] zArr = this.f13045c;
        int length = zArr.length;
        if (i3 < length) {
            System.arraycopy(zArr, i2, zArr, i4, i3 - i2);
        } else {
            boolean[] zArr2 = new boolean[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.f13045c, 0, zArr2, 0, i2);
            System.arraycopy(this.f13045c, i2, zArr2, i4, this.f13046d - i2);
            this.f13045c = zArr2;
        }
        this.f13045c[i2] = zBooleanValue;
        this.f13046d++;
        this.modCount++;
    }

    @Override // com.google.v.f, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Boolean> collection) {
        bp();
        collection.getClass();
        if (!(collection instanceof p)) {
            return super.addAll(collection);
        }
        p pVar = (p) collection;
        int i2 = pVar.f13046d;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f13046d;
        if (Integer.MAX_VALUE - i3 < i2) {
            throw new OutOfMemoryError();
        }
        int i4 = i3 + i2;
        boolean[] zArrCopyOf = this.f13045c;
        if (i4 > zArrCopyOf.length) {
            zArrCopyOf = Arrays.copyOf(zArrCopyOf, i4);
            this.f13045c = zArrCopyOf;
        }
        System.arraycopy(pVar.f13045c, 0, zArrCopyOf, this.f13046d, pVar.f13046d);
        this.f13046d = i4;
        this.modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.v.eo
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final ee f(int i2) {
        if (i2 >= this.f13046d) {
            return new p(i2 == 0 ? f13043a : Arrays.copyOf(this.f13045c, i2), this.f13046d, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.v.f, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return super.equals(obj);
        }
        p pVar = (p) obj;
        if (this.f13046d != pVar.f13046d) {
            return false;
        }
        boolean[] zArr = pVar.f13045c;
        for (int i2 = 0; i2 < this.f13046d; i2++) {
            if (this.f13045c[i2] != zArr[i2]) {
                return false;
            }
        }
        return true;
    }

    public final void g(boolean z) {
        bp();
        int i2 = this.f13046d;
        boolean[] zArr = this.f13045c;
        int length = zArr.length;
        if (i2 == length) {
            zArr = new boolean[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.f13045c, 0, zArr, 0, this.f13046d);
            this.f13045c = zArr;
        }
        int i3 = this.f13046d;
        this.f13046d = i3 + 1;
        zArr[i3] = z;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i2) {
        return Boolean.valueOf(h(i2));
    }

    public final boolean h(int i2) {
        j(i2);
        return this.f13045c[i2];
    }

    @Override // com.google.v.f, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iA = 1;
        for (int i2 = 0; i2 < this.f13046d; i2++) {
            boolean z = this.f13045c[i2];
            byte[] bArr = ep.f12912a;
            iA = (iA * 31) + a.a.a(z);
        }
        return iA;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int i2 = this.f13046d;
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.f13045c[i3] == zBooleanValue) {
                return i3;
            }
        }
        return -1;
    }

    @Override // com.google.v.f, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i2) {
        bp();
        j(i2);
        boolean[] zArr = this.f13045c;
        boolean z = zArr[i2];
        if (i2 < this.f13046d - 1) {
            System.arraycopy(zArr, i2 + 1, zArr, i2, (r2 - i2) - 1);
        }
        this.f13046d--;
        this.modCount++;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i2, int i3) {
        bp();
        if (i3 < i2) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.f13045c;
        System.arraycopy(zArr, i3, zArr, i2, this.f13046d - i3);
        this.f13046d -= i3 - i2;
        this.modCount++;
    }

    @Override // com.google.v.f, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i2, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        bp();
        j(i2);
        boolean[] zArr = this.f13045c;
        boolean z = zArr[i2];
        zArr[i2] = zBooleanValue;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f13046d;
    }

    private p(boolean[] zArr, int i2, boolean z) {
        super(z);
        this.f13045c = zArr;
        this.f13046d = i2;
    }

    @Override // com.google.v.f, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        g(((Boolean) obj).booleanValue());
        return true;
    }
}
