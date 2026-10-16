package com.google.v;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class fc extends f implements RandomAccess, en, fp {

    /* renamed from: a, reason: collision with root package name */
    private static final long[] f12945a;

    /* renamed from: b, reason: collision with root package name */
    private static final fc f12946b;

    /* renamed from: c, reason: collision with root package name */
    private long[] f12947c;

    /* renamed from: d, reason: collision with root package name */
    private int f12948d;

    static {
        long[] jArr = new long[0];
        f12945a = jArr;
        f12946b = new fc(jArr, 0, false);
    }

    fc() {
        this(f12945a, 0, true);
    }

    public static fc h() {
        return f12946b;
    }

    private final String j(int i2) {
        return "Index:" + i2 + ", Size:" + this.f12948d;
    }

    private final void k(int i2) {
        if (i2 < 0 || i2 >= this.f12948d) {
            throw new IndexOutOfBoundsException(j(i2));
        }
    }

    @Override // com.google.v.en
    public final long a(int i2) {
        k(i2);
        return this.f12947c[i2];
    }

    @Override // com.google.v.f, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i2, Object obj) {
        int i3;
        long jLongValue = ((Long) obj).longValue();
        bp();
        if (i2 < 0 || i2 > (i3 = this.f12948d)) {
            throw new IndexOutOfBoundsException(j(i2));
        }
        int i4 = i2 + 1;
        long[] jArr = this.f12947c;
        int length = jArr.length;
        if (i3 < length) {
            System.arraycopy(jArr, i2, jArr, i4, i3 - i2);
        } else {
            long[] jArr2 = new long[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.f12947c, 0, jArr2, 0, i2);
            System.arraycopy(this.f12947c, i2, jArr2, i4, this.f12948d - i2);
            this.f12947c = jArr2;
        }
        this.f12947c[i2] = jLongValue;
        this.f12948d++;
        this.modCount++;
    }

    @Override // com.google.v.f, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Long> collection) {
        bp();
        collection.getClass();
        if (!(collection instanceof fc)) {
            return super.addAll(collection);
        }
        fc fcVar = (fc) collection;
        int i2 = fcVar.f12948d;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f12948d;
        if (Integer.MAX_VALUE - i3 < i2) {
            throw new OutOfMemoryError();
        }
        int i4 = i3 + i2;
        long[] jArrCopyOf = this.f12947c;
        if (i4 > jArrCopyOf.length) {
            jArrCopyOf = Arrays.copyOf(jArrCopyOf, i4);
            this.f12947c = jArrCopyOf;
        }
        System.arraycopy(fcVar.f12947c, 0, jArrCopyOf, this.f12948d, fcVar.f12948d);
        this.f12948d = i4;
        this.modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.v.en
    public final long d(int i2, long j2) {
        bp();
        k(i2);
        long[] jArr = this.f12947c;
        long j3 = jArr[i2];
        jArr[i2] = j2;
        return j3;
    }

    @Override // com.google.v.eo
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final en f(int i2) {
        if (i2 >= this.f12948d) {
            return new fc(i2 == 0 ? f12945a : Arrays.copyOf(this.f12947c, i2), this.f12948d, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.v.f, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fc)) {
            return super.equals(obj);
        }
        fc fcVar = (fc) obj;
        if (this.f12948d != fcVar.f12948d) {
            return false;
        }
        long[] jArr = fcVar.f12947c;
        for (int i2 = 0; i2 < this.f12948d; i2++) {
            if (this.f12947c[i2] != jArr[i2]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.v.en
    public final void g(long j2) {
        bp();
        int i2 = this.f12948d;
        long[] jArr = this.f12947c;
        int length = jArr.length;
        if (i2 == length) {
            jArr = new long[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.f12947c, 0, jArr, 0, this.f12948d);
            this.f12947c = jArr;
        }
        int i3 = this.f12948d;
        this.f12948d = i3 + 1;
        jArr[i3] = j2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i2) {
        return Long.valueOf(a(i2));
    }

    @Override // com.google.v.f, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iB = 1;
        for (int i2 = 0; i2 < this.f12948d; i2++) {
            long j2 = this.f12947c[i2];
            byte[] bArr = ep.f12912a;
            iB = (iB * 31) + a.a.b(j2);
        }
        return iB;
    }

    final void i(int i2) {
        int length = this.f12947c.length;
        if (i2 <= length) {
            return;
        }
        if (length == 0) {
            this.f12947c = new long[Math.max(i2, 10)];
            return;
        }
        while (length < i2) {
            length = Math.max(((length * 3) / 2) + 1, 10);
        }
        this.f12947c = Arrays.copyOf(this.f12947c, length);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int i2 = this.f12948d;
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.f12947c[i3] == jLongValue) {
                return i3;
            }
        }
        return -1;
    }

    @Override // com.google.v.f, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i2) {
        bp();
        k(i2);
        long[] jArr = this.f12947c;
        long j2 = jArr[i2];
        if (i2 < this.f12948d - 1) {
            System.arraycopy(jArr, i2 + 1, jArr, i2, (r3 - i2) - 1);
        }
        this.f12948d--;
        this.modCount++;
        return Long.valueOf(j2);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i2, int i3) {
        bp();
        if (i3 < i2) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f12947c;
        System.arraycopy(jArr, i3, jArr, i2, this.f12948d - i3);
        this.f12948d -= i3 - i2;
        this.modCount++;
    }

    @Override // com.google.v.f, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i2, Object obj) {
        return Long.valueOf(d(i2, ((Long) obj).longValue()));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f12948d;
    }

    private fc(long[] jArr, int i2, boolean z) {
        super(z);
        this.f12947c = jArr;
        this.f12948d = i2;
    }

    @Override // com.google.v.f, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        g(((Long) obj).longValue());
        return true;
    }
}
