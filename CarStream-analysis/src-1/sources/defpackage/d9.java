package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class d9 extends n5 {
    public final transient g9 d;
    public final transient Object[] e;
    public final transient int f;

    public d9(g9 g9Var, Object[] objArr, int i) {
        this.d = g9Var;
        this.e = objArr;
        this.f = i;
    }

    @Override // defpackage.j5
    public final int a(Object[] objArr) {
        m5 m5VarG = this.b;
        if (m5VarG == null) {
            m5VarG = g();
            this.b = m5VarG;
        }
        return m5VarG.a(objArr);
    }

    @Override // defpackage.j5, java.util.AbstractCollection, java.util.Collection, java.util.Set
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

    public final m5 g() {
        return new c9(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        m5 m5VarG = this.b;
        if (m5VarG == null) {
            m5VarG = g();
            this.b = m5VarG;
        }
        return m5VarG.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f;
    }
}
