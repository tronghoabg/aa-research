package defpackage;

/* loaded from: classes.dex */
public final class ymp extends ygr {
    final transient Object a;

    public ymp(Object obj) {
        obj.getClass();
        this.a = obj;
    }

    @Override // defpackage.yfg
    public final int a(Object[] objArr, int i) {
        objArr[i] = this.a;
        return i + 1;
    }

    @Override // defpackage.yfg, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.equals(obj);
    }

    @Override // defpackage.ygr, defpackage.yfg
    public final yfq d() {
        return yfq.q(this.a);
    }

    @Override // defpackage.ygr, defpackage.yfg, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: e */
    public final yno iterator() {
        return new yhu(this.a);
    }

    @Override // defpackage.yfg
    public final boolean f() {
        return false;
    }

    @Override // defpackage.ygr, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return "[" + this.a.toString() + "]";
    }

    @Override // defpackage.ygr, defpackage.yfg
    public Object writeReplace() {
        return super.writeReplace();
    }
}
