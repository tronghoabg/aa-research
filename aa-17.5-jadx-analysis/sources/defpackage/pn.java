package defpackage;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class pn extends pp implements Iterator {
    final /* synthetic */ pq a;
    private pm b;
    private boolean c = true;

    public pn(pq pqVar) {
        this.a = pqVar;
    }

    @Override // java.util.Iterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Map.Entry next() {
        if (this.c) {
            this.c = false;
            pm pmVar = this.a.a;
            this.b = pmVar;
            return pmVar;
        }
        pm pmVar2 = this.b;
        pm pmVar3 = pmVar2 != null ? pmVar2.c : null;
        this.b = pmVar3;
        return pmVar3;
    }

    @Override // defpackage.pp
    public final void b(pm pmVar) {
        pm pmVar2 = this.b;
        if (pmVar == pmVar2) {
            pm pmVar3 = pmVar2.d;
            this.b = pmVar3;
            this.c = pmVar3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.c) {
            return this.a.a != null;
        }
        pm pmVar = this.b;
        return (pmVar == null || pmVar.c == null) ? false : true;
    }
}
