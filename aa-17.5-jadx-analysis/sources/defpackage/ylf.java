package defpackage;

import java.util.Iterator;

/* loaded from: classes3.dex */
class ylf extends ymm {
    final /* synthetic */ ybv b;

    public ylf(ybv ybvVar) {
        this.b = ybvVar;
    }

    public ylc a() {
        return this.b;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        a().clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof ylb) {
            ylb ylbVar = (ylb) obj;
            if (ylbVar.a() > 0 && a().a(ylbVar.b()) == ylbVar.a()) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return this.b.e();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!(obj instanceof ylb)) {
            return false;
        }
        ylb ylbVar = (ylb) obj;
        Object objB = ylbVar.b();
        int iA = ylbVar.a();
        if (iA != 0) {
            return a().g(objB, iA);
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.b.b();
    }
}
