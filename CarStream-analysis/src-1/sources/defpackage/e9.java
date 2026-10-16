package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class e9 extends n5 {
    public final transient g9 d;
    public final transient f9 e;

    public e9(g9 g9Var, f9 f9Var) {
        this.d = g9Var;
        this.e = f9Var;
    }

    @Override // defpackage.j5
    public final int a(Object[] objArr) {
        return this.e.a(objArr);
    }

    @Override // defpackage.j5, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.d.get(obj) != null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return this.e.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.d.f;
    }
}
