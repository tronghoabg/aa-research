package defpackage;

import java.util.Map;

/* loaded from: classes.dex */
public final class ylu extends ygr {
    public final transient Object[] a;
    public final transient int b;
    public final transient int c;
    private final transient yfy d;

    public ylu(yfy yfyVar, Object[] objArr, int i, int i2) {
        this.d = yfyVar;
        this.a = objArr;
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.yfg
    public final int a(Object[] objArr, int i) {
        return d().a(objArr, i);
    }

    @Override // defpackage.yfg, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.d.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ygr, defpackage.yfg, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: e */
    public final yno iterator() {
        return d().listIterator(0);
    }

    @Override // defpackage.yfg
    public final boolean f() {
        return true;
    }

    @Override // defpackage.ygr
    public final yfq k() {
        return new ylt(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.c;
    }

    @Override // defpackage.ygr, defpackage.yfg
    public Object writeReplace() {
        return super.writeReplace();
    }
}
