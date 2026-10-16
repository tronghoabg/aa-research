package l8;

import j$.util.Objects;

/* loaded from: classes4.dex */
public final class e0 extends AbstractC3409K {

    /* renamed from: e, reason: collision with root package name */
    public static final e0 f40101e = new e0(new Object[0], 0);

    /* renamed from: c, reason: collision with root package name */
    public final transient Object[] f40102c;

    /* renamed from: d, reason: collision with root package name */
    public final transient int f40103d;

    public e0(Object[] objArr, int i5) {
        this.f40102c = objArr;
        this.f40103d = i5;
    }

    @Override // l8.AbstractC3409K, l8.AbstractC3404F
    public final int b(int i5, Object[] objArr) {
        Object[] objArr2 = this.f40102c;
        int i10 = this.f40103d;
        System.arraycopy(objArr2, 0, objArr, i5, i10);
        return i5 + i10;
    }

    @Override // l8.AbstractC3404F
    public final Object[] c() {
        return this.f40102c;
    }

    @Override // l8.AbstractC3404F
    public final int d() {
        return this.f40103d;
    }

    @Override // l8.AbstractC3404F
    public final int e() {
        return 0;
    }

    @Override // l8.AbstractC3404F
    public final boolean f() {
        return false;
    }

    @Override // java.util.List
    public final Object get(int i5) {
        Fe.e.s(i5, this.f40103d);
        Object obj = this.f40102c[i5];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f40103d;
    }
}
