package com.google.d.d;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class fb extends ci {

    /* renamed from: a, reason: collision with root package name */
    static final fb f7608a;

    /* renamed from: d, reason: collision with root package name */
    private static final Object[] f7609d;

    /* renamed from: b, reason: collision with root package name */
    final transient Object[] f7610b;

    /* renamed from: c, reason: collision with root package name */
    final transient Object[] f7611c;

    /* renamed from: e, reason: collision with root package name */
    private final transient int f7612e;

    /* renamed from: f, reason: collision with root package name */
    private final transient int f7613f;

    /* renamed from: g, reason: collision with root package name */
    private final transient int f7614g;

    static {
        Object[] objArr = new Object[0];
        f7609d = objArr;
        f7608a = new fb(objArr, 0, objArr, 0, 0);
    }

    fb(Object[] objArr, int i2, Object[] objArr2, int i3, int i4) {
        this.f7610b = objArr;
        this.f7612e = i2;
        this.f7611c = objArr2;
        this.f7613f = i3;
        this.f7614g = i4;
    }

    @Override // com.google.d.d.ci
    final boolean b() {
        return true;
    }

    @Override // com.google.d.d.bh, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f7611c;
            if (objArr.length != 0) {
                int iW = fo.W(obj);
                while (true) {
                    int i2 = iW & this.f7613f;
                    Object obj2 = objArr[i2];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    iW = i2 + 1;
                }
            }
        }
        return false;
    }

    @Override // com.google.d.d.bh
    final int d(Object[] objArr, int i2) {
        Object[] objArr2 = this.f7610b;
        int i3 = this.f7614g;
        System.arraycopy(objArr2, 0, objArr, i2, i3);
        return i2 + i3;
    }

    @Override // com.google.d.d.bh
    final int e() {
        return this.f7614g;
    }

    @Override // com.google.d.d.bh
    final int f() {
        return 0;
    }

    @Override // com.google.d.d.ci, com.google.d.d.bh, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: h */
    public final fu listIterator() {
        return g().iterator();
    }

    @Override // com.google.d.d.ci, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f7612e;
    }

    @Override // com.google.d.d.bh
    final boolean i() {
        return false;
    }

    @Override // com.google.d.d.bh
    final Object[] j() {
        return this.f7610b;
    }

    @Override // com.google.d.d.ci
    final bn k() {
        return bn.l(this.f7610b, this.f7614g);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f7614g;
    }

    @Override // com.google.d.d.ci, com.google.d.d.bh
    Object writeReplace() {
        return super.writeReplace();
    }
}
