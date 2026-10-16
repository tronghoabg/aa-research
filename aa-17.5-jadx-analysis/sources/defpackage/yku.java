package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
final class yku extends ykk {
    final /* synthetic */ ykv a;

    public yku(ykv ykvVar) {
        this.a = ykvVar;
    }

    @Override // defpackage.ykk
    public final Map a() {
        return this.a;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry> iterator() {
        yks yksVar = this.a.a;
        Set setX = yksVar.x();
        yksVar.getClass();
        return new ykg(setX.iterator(), new rgf(yksVar, 17));
    }

    @Override // defpackage.ykk, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        entry.getClass();
        ykv ykvVar = this.a;
        ykvVar.a.x().remove(entry.getKey());
        return true;
    }
}
