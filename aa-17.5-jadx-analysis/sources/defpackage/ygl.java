package defpackage;

/* loaded from: classes.dex */
final class ygl extends yfg {
    private static final long serialVersionUID = 0;
    private final transient ygm a;

    public ygl(ygm ygmVar) {
        this.a = ygmVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.yfg
    public final int a(Object[] objArr, int i) {
        yno it = this.a.map.values().iterator();
        while (it.hasNext()) {
            i = ((yfg) it.next()).a(objArr, i);
        }
        return i;
    }

    @Override // defpackage.yfg, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.z(obj);
    }

    @Override // defpackage.yfg, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: e */
    public final yno iterator() {
        return new ygi(this.a);
    }

    @Override // defpackage.yfg
    public final boolean f() {
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.a.size;
    }

    @Override // defpackage.yfg
    public Object writeReplace() {
        return super.writeReplace();
    }
}
