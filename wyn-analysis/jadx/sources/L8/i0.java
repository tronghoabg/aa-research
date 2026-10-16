package l8;

import j$.util.Objects;

/* loaded from: classes4.dex */
public final class i0 extends AbstractC3409K {

    /* renamed from: c, reason: collision with root package name */
    public final transient Object[] f40114c;

    /* renamed from: d, reason: collision with root package name */
    public final transient int f40115d;

    /* renamed from: e, reason: collision with root package name */
    public final transient int f40116e;

    public i0(Object[] objArr, int i5, int i10) {
        this.f40114c = objArr;
        this.f40115d = i5;
        this.f40116e = i10;
    }

    @Override // l8.AbstractC3404F
    public final boolean f() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i5) {
        Fe.e.s(i5, this.f40116e);
        Object obj = this.f40114c[(i5 * 2) + this.f40115d];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f40116e;
    }
}
