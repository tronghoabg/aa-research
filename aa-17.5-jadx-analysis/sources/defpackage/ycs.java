package defpackage;

import j$.util.Objects;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
final class ycs extends AbstractSet {
    final /* synthetic */ ycx a;

    public ycs(ycx ycxVar) {
        this.a = ycxVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        ycx ycxVar = this.a;
        Map mapN = ycxVar.n();
        if (mapN != null) {
            return mapN.entrySet().contains(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            int iF = ycxVar.f(entry.getKey());
            if (iF != -1 && Objects.equals(ycxVar.j(iF), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry> iterator() {
        return this.a.k();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int iE;
        int iZ;
        ycx ycxVar = this.a;
        Map mapN = ycxVar.n();
        if (mapN != null) {
            return mapN.entrySet().remove(obj);
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (ycxVar.u() || (iZ = wub.z(entry.getKey(), entry.getValue(), (iE = ycxVar.e()), ycxVar.i(), ycxVar.v(), ycxVar.w(), ycxVar.x())) == -1) {
            return false;
        }
        ycxVar.r(iZ, iE);
        ycxVar.f--;
        ycxVar.o();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.size();
    }
}
