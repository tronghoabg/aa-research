package defpackage;

/* loaded from: classes.dex */
abstract class yhg extends ygr {
    @Override // defpackage.yfg
    public final int a(Object[] objArr, int i) {
        return d().a(objArr, i);
    }

    @Override // defpackage.ygr, defpackage.yfg, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: e */
    public yno iterator() {
        return d().listIterator(0);
    }

    public abstract Object h(int i);

    @Override // defpackage.ygr
    public final yfq k() {
        return new yhf(this);
    }

    @Override // defpackage.ygr, defpackage.yfg
    public Object writeReplace() {
        return super.writeReplace();
    }
}
