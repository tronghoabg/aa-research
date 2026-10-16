package l8;

/* loaded from: classes4.dex */
public final class h0 extends AbstractC3414P {

    /* renamed from: d, reason: collision with root package name */
    public final transient j0 f40112d;

    /* renamed from: e, reason: collision with root package name */
    public final transient i0 f40113e;

    public h0(j0 j0Var, i0 i0Var) {
        this.f40112d = j0Var;
        this.f40113e = i0Var;
    }

    @Override // l8.AbstractC3414P, l8.AbstractC3404F
    public final AbstractC3409K a() {
        return this.f40113e;
    }

    @Override // l8.AbstractC3404F
    public final int b(int i5, Object[] objArr) {
        return this.f40113e.b(i5, objArr);
    }

    @Override // l8.AbstractC3404F, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f40112d.get(obj) != null;
    }

    @Override // l8.AbstractC3404F
    public final boolean f() {
        return true;
    }

    @Override // l8.AbstractC3404F
    /* renamed from: g */
    public final t0 iterator() {
        return this.f40113e.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f40112d.f40125f;
    }
}
