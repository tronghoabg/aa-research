package defpackage;

import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
final class ygh extends yno {
    final Iterator a;
    Object b = null;
    Iterator c = yhq.a;
    final /* synthetic */ ygm d;

    public ygh(ygm ygmVar) {
        this.d = ygmVar;
        this.a = ygmVar.map.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c.hasNext() || this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        if (!this.c.hasNext()) {
            Map.Entry entry = (Map.Entry) this.a.next();
            this.b = entry.getKey();
            this.c = ((yfg) entry.getValue()).iterator();
        }
        Object obj = this.b;
        obj.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, this.c.next());
    }
}
