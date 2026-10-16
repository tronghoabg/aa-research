package com.google.v;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class dj extends f implements RandomAccess, ej, fp {

    /* renamed from: a, reason: collision with root package name */
    private static final float[] f12862a;

    /* renamed from: b, reason: collision with root package name */
    private static final dj f12863b;

    /* renamed from: c, reason: collision with root package name */
    private float[] f12864c;

    /* renamed from: d, reason: collision with root package name */
    private int f12865d;

    static {
        float[] fArr = new float[0];
        f12862a = fArr;
        f12863b = new dj(fArr, 0, false);
    }

    dj() {
        this(f12862a, 0, true);
    }

    public static dj g() {
        return f12863b;
    }

    private final String k(int i2) {
        return "Index:" + i2 + ", Size:" + this.f12865d;
    }

    private final void l(int i2) {
        if (i2 < 0 || i2 >= this.f12865d) {
            throw new IndexOutOfBoundsException(k(i2));
        }
    }

    @Override // com.google.v.f, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i2, Object obj) {
        int i3;
        float fFloatValue = ((Float) obj).floatValue();
        bp();
        if (i2 < 0 || i2 > (i3 = this.f12865d)) {
            throw new IndexOutOfBoundsException(k(i2));
        }
        int i4 = i2 + 1;
        float[] fArr = this.f12864c;
        int length = fArr.length;
        if (i3 < length) {
            System.arraycopy(fArr, i2, fArr, i4, i3 - i2);
        } else {
            float[] fArr2 = new float[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.f12864c, 0, fArr2, 0, i2);
            System.arraycopy(this.f12864c, i2, fArr2, i4, this.f12865d - i2);
            this.f12864c = fArr2;
        }
        this.f12864c[i2] = fFloatValue;
        this.f12865d++;
        this.modCount++;
    }

    @Override // com.google.v.f, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Float> collection) {
        bp();
        collection.getClass();
        if (!(collection instanceof dj)) {
            return super.addAll(collection);
        }
        dj djVar = (dj) collection;
        int i2 = djVar.f12865d;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f12865d;
        if (Integer.MAX_VALUE - i3 < i2) {
            throw new OutOfMemoryError();
        }
        int i4 = i3 + i2;
        float[] fArrCopyOf = this.f12864c;
        if (i4 > fArrCopyOf.length) {
            fArrCopyOf = Arrays.copyOf(fArrCopyOf, i4);
            this.f12864c = fArrCopyOf;
        }
        System.arraycopy(djVar.f12864c, 0, fArrCopyOf, this.f12865d, djVar.f12865d);
        this.f12865d = i4;
        this.modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.v.ej
    public final float d(int i2) {
        l(i2);
        return this.f12864c[i2];
    }

    @Override // com.google.v.ej
    public final float e(int i2, float f2) {
        bp();
        l(i2);
        float[] fArr = this.f12864c;
        float f3 = fArr[i2];
        fArr[i2] = f2;
        return f3;
    }

    @Override // com.google.v.f, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dj)) {
            return super.equals(obj);
        }
        dj djVar = (dj) obj;
        if (this.f12865d != djVar.f12865d) {
            return false;
        }
        float[] fArr = djVar.f12864c;
        for (int i2 = 0; i2 < this.f12865d; i2++) {
            if (Float.floatToIntBits(this.f12864c[i2]) != Float.floatToIntBits(fArr[i2])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i2) {
        return Float.valueOf(d(i2));
    }

    @Override // com.google.v.eo
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final ej f(int i2) {
        if (i2 >= this.f12865d) {
            return new dj(i2 == 0 ? f12862a : Arrays.copyOf(this.f12864c, i2), this.f12865d, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.v.f, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i2 = 0; i2 < this.f12865d; i2++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.f12864c[i2]);
        }
        return iFloatToIntBits;
    }

    @Override // com.google.v.ej
    public final void i(float f2) {
        bp();
        int i2 = this.f12865d;
        float[] fArr = this.f12864c;
        int length = fArr.length;
        if (i2 == length) {
            fArr = new float[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.f12864c, 0, fArr, 0, this.f12865d);
            this.f12864c = fArr;
        }
        int i3 = this.f12865d;
        this.f12865d = i3 + 1;
        fArr[i3] = f2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) obj).floatValue();
        int i2 = this.f12865d;
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.f12864c[i3] == fFloatValue) {
                return i3;
            }
        }
        return -1;
    }

    final void j(int i2) {
        int length = this.f12864c.length;
        if (i2 <= length) {
            return;
        }
        if (length == 0) {
            this.f12864c = new float[Math.max(i2, 10)];
            return;
        }
        while (length < i2) {
            length = Math.max(((length * 3) / 2) + 1, 10);
        }
        this.f12864c = Arrays.copyOf(this.f12864c, length);
    }

    @Override // com.google.v.f, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i2) {
        bp();
        l(i2);
        float[] fArr = this.f12864c;
        float f2 = fArr[i2];
        if (i2 < this.f12865d - 1) {
            System.arraycopy(fArr, i2 + 1, fArr, i2, (r2 - i2) - 1);
        }
        this.f12865d--;
        this.modCount++;
        return Float.valueOf(f2);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i2, int i3) {
        bp();
        if (i3 < i2) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.f12864c;
        System.arraycopy(fArr, i3, fArr, i2, this.f12865d - i3);
        this.f12865d -= i3 - i2;
        this.modCount++;
    }

    @Override // com.google.v.f, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i2, Object obj) {
        return Float.valueOf(e(i2, ((Float) obj).floatValue()));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f12865d;
    }

    private dj(float[] fArr, int i2, boolean z) {
        super(z);
        this.f12864c = fArr;
        this.f12865d = i2;
    }

    @Override // com.google.v.f, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        i(((Float) obj).floatValue());
        return true;
    }
}
