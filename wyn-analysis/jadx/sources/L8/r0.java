package l8;

/* loaded from: classes4.dex */
public final class r0 extends AbstractC3414P {

    /* renamed from: d, reason: collision with root package name */
    public final transient Object f40158d;

    public r0(Object obj) {
        obj.getClass();
        this.f40158d = obj;
    }

    @Override // l8.AbstractC3414P, l8.AbstractC3404F
    public final AbstractC3409K a() {
        return AbstractC3409K.n(this.f40158d);
    }

    @Override // l8.AbstractC3404F
    public final int b(int i5, Object[] objArr) {
        objArr[i5] = this.f40158d;
        return i5 + 1;
    }

    @Override // l8.AbstractC3404F, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f40158d.equals(obj);
    }

    @Override // l8.AbstractC3404F
    public final boolean f() {
        return false;
    }

    @Override // l8.AbstractC3404F
    /* renamed from: g */
    public final t0 iterator() {
        return new C3418U(this.f40158d);
    }

    @Override // l8.AbstractC3414P, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f40158d.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return "[" + this.f40158d.toString() + ']';
    }
}
