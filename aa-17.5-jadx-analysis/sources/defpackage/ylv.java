package defpackage;

/* loaded from: classes.dex */
public final class ylv extends ygr {
    public final transient yfq a;
    private final transient yfy b;

    public ylv(yfy yfyVar, yfq yfqVar) {
        this.b = yfyVar;
        this.a = yfqVar;
    }

    @Override // defpackage.yfg
    public final int a(Object[] objArr, int i) {
        return this.a.a(objArr, i);
    }

    @Override // defpackage.yfg, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.b.get(obj) != null;
    }

    @Override // defpackage.ygr, defpackage.yfg
    public final yfq d() {
        return this.a;
    }

    @Override // defpackage.ygr, defpackage.yfg, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: e */
    public final yno iterator() {
        return this.a.listIterator(0);
    }

    @Override // defpackage.yfg
    public final boolean f() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.b.size();
    }

    @Override // defpackage.ygr, defpackage.yfg
    public Object writeReplace() {
        return super.writeReplace();
    }
}
