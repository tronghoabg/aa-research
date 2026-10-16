package defpackage;

import java.util.Map;

/* loaded from: classes.dex */
final class ygk extends yfg {
    private static final long serialVersionUID = 0;
    final ygm a;

    public ygk(ygm ygmVar) {
        this.a = ygmVar;
    }

    @Override // defpackage.yfg, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return this.a.y(entry.getKey(), entry.getValue());
    }

    @Override // defpackage.yfg, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: e */
    public final yno iterator() {
        return new ygh(this.a);
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
