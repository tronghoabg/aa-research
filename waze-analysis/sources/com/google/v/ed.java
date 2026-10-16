package com.google.v;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class ed extends f implements RandomAccess, ek, fp {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f12906a;

    /* renamed from: b, reason: collision with root package name */
    private static final ed f12907b;

    /* renamed from: c, reason: collision with root package name */
    private int[] f12908c;

    /* renamed from: d, reason: collision with root package name */
    private int f12909d;

    static {
        int[] iArr = new int[0];
        f12906a = iArr;
        f12907b = new ed(iArr, 0, false);
    }

    ed() {
        this(f12906a, 0, true);
    }

    public static ed g() {
        return f12907b;
    }

    private final String k(int i2) {
        return "Index:" + i2 + ", Size:" + this.f12909d;
    }

    private final void l(int i2) {
        if (i2 < 0 || i2 >= this.f12909d) {
            throw new IndexOutOfBoundsException(k(i2));
        }
    }

    @Override // com.google.v.f, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i2, Object obj) {
        int i3;
        int iIntValue = ((Integer) obj).intValue();
        bp();
        if (i2 < 0 || i2 > (i3 = this.f12909d)) {
            throw new IndexOutOfBoundsException(k(i2));
        }
        int i4 = i2 + 1;
        int[] iArr = this.f12908c;
        int length = iArr.length;
        if (i3 < length) {
            System.arraycopy(iArr, i2, iArr, i4, i3 - i2);
        } else {
            int[] iArr2 = new int[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.f12908c, 0, iArr2, 0, i2);
            System.arraycopy(this.f12908c, i2, iArr2, i4, this.f12909d - i2);
            this.f12908c = iArr2;
        }
        this.f12908c[i2] = iIntValue;
        this.f12909d++;
        this.modCount++;
    }

    @Override // com.google.v.f, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Integer> collection) {
        bp();
        collection.getClass();
        if (!(collection instanceof ed)) {
            return super.addAll(collection);
        }
        ed edVar = (ed) collection;
        int i2 = edVar.f12909d;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f12909d;
        if (Integer.MAX_VALUE - i3 < i2) {
            throw new OutOfMemoryError();
        }
        int i4 = i3 + i2;
        int[] iArrCopyOf = this.f12908c;
        if (i4 > iArrCopyOf.length) {
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, i4);
            this.f12908c = iArrCopyOf;
        }
        System.arraycopy(edVar.f12908c, 0, iArrCopyOf, this.f12909d, edVar.f12909d);
        this.f12909d = i4;
        this.modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.v.ek
    public final int d(int i2) {
        l(i2);
        return this.f12908c[i2];
    }

    @Override // com.google.v.ek
    public final int e(int i2, int i3) {
        bp();
        l(i2);
        int[] iArr = this.f12908c;
        int i4 = iArr[i2];
        iArr[i2] = i3;
        return i4;
    }

    @Override // com.google.v.f, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ed)) {
            return super.equals(obj);
        }
        ed edVar = (ed) obj;
        if (this.f12909d != edVar.f12909d) {
            return false;
        }
        int[] iArr = edVar.f12908c;
        for (int i2 = 0; i2 < this.f12909d; i2++) {
            if (this.f12908c[i2] != iArr[i2]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i2) {
        return Integer.valueOf(d(i2));
    }

    @Override // com.google.v.eo
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final ek f(int i2) {
        if (i2 >= this.f12909d) {
            return new ed(i2 == 0 ? f12906a : Arrays.copyOf(this.f12908c, i2), this.f12909d, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.v.f, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i2 = 1;
        for (int i3 = 0; i3 < this.f12909d; i3++) {
            i2 = (i2 * 31) + this.f12908c[i3];
        }
        return i2;
    }

    @Override // com.google.v.ek
    public final void i(int i2) {
        bp();
        int i3 = this.f12909d;
        int[] iArr = this.f12908c;
        int length = iArr.length;
        if (i3 == length) {
            iArr = new int[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.f12908c, 0, iArr, 0, this.f12909d);
            this.f12908c = iArr;
        }
        int i4 = this.f12909d;
        this.f12909d = i4 + 1;
        iArr[i4] = i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i2 = this.f12909d;
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.f12908c[i3] == iIntValue) {
                return i3;
            }
        }
        return -1;
    }

    final void j(int i2) {
        int length = this.f12908c.length;
        if (i2 <= length) {
            return;
        }
        if (length == 0) {
            this.f12908c = new int[Math.max(i2, 10)];
            return;
        }
        while (length < i2) {
            length = Math.max(((length * 3) / 2) + 1, 10);
        }
        this.f12908c = Arrays.copyOf(this.f12908c, length);
    }

    @Override // com.google.v.f, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i2) {
        bp();
        l(i2);
        int[] iArr = this.f12908c;
        int i3 = iArr[i2];
        if (i2 < this.f12909d - 1) {
            System.arraycopy(iArr, i2 + 1, iArr, i2, (r2 - i2) - 1);
        }
        this.f12909d--;
        this.modCount++;
        return Integer.valueOf(i3);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i2, int i3) {
        bp();
        if (i3 < i2) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f12908c;
        System.arraycopy(iArr, i3, iArr, i2, this.f12909d - i3);
        this.f12909d -= i3 - i2;
        this.modCount++;
    }

    @Override // com.google.v.f, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i2, Object obj) {
        return Integer.valueOf(e(i2, ((Integer) obj).intValue()));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f12909d;
    }

    private ed(int[] iArr, int i2, boolean z) {
        super(z);
        this.f12908c = iArr;
        this.f12909d = i2;
    }

    @Override // com.google.v.f, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        i(((Integer) obj).intValue());
        return true;
    }
}
