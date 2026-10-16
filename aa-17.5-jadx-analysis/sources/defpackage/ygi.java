package defpackage;

import java.util.Iterator;

/* loaded from: classes.dex */
final class ygi extends yno {
    final Iterator a;
    Iterator b = yhq.a;
    final /* synthetic */ ygm c;

    public ygi(ygm ygmVar) {
        this.c = ygmVar;
        this.a = ygmVar.map.values().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b.hasNext() || this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.b.hasNext()) {
            this.b = ((yfg) this.a.next()).iterator();
        }
        return this.b.next();
    }
}
