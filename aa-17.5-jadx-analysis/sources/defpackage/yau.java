package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
final class yau extends ykk {
    final /* synthetic */ yaw a;

    public yau(yaw yawVar) {
        this.a = yawVar;
    }

    @Override // defpackage.ykk
    public final Map a() {
        return this.a;
    }

    @Override // defpackage.ykk, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return ysi.m(this.a.a.entrySet(), obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry> iterator() {
        return new yav(this.a);
    }

    @Override // defpackage.ykk, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Object objRemove;
        if (!contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        entry.getClass();
        yaw yawVar = this.a;
        Object key = entry.getKey();
        ybm ybmVar = yawVar.b;
        Map map = ybmVar.a;
        map.getClass();
        try {
            objRemove = map.remove(key);
        } catch (ClassCastException | NullPointerException unused) {
            objRemove = null;
        }
        Collection collection = (Collection) objRemove;
        if (collection == null) {
            return true;
        }
        int size = collection.size();
        collection.clear();
        ybmVar.b -= size;
        return true;
    }
}
