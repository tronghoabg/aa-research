package e.a.i;

import e.a.bk;
import e.a.bl;
import e.a.bn;
import e.a.br;
import e.a.w;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class i extends e {

    /* renamed from: i, reason: collision with root package name */
    private final AtomicInteger f47831i;

    /* renamed from: j, reason: collision with root package name */
    private br f47832j;

    public i(bl blVar) {
        super(blVar);
        this.f47831i = new AtomicInteger(new Random().nextInt());
        this.f47832j = new bk(bn.c());
    }

    private final br l(Collection collection) {
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(((c) it.next()).c());
        }
        return new h(arrayList, this.f47831i);
    }

    private final void m(w wVar, br brVar) {
        if (wVar == this.f47823h && brVar.equals(this.f47832j)) {
            return;
        }
        f().f(wVar, brVar);
        this.f47823h = wVar;
        this.f47832j = brVar;
    }

    @Override // e.a.i.e
    protected final c g(Object obj) {
        return new g(this, obj, this.f47822g);
    }

    @Override // e.a.i.e
    protected final void k() {
        List listI = i();
        if (!listI.isEmpty()) {
            m(w.f47852b, l(listI));
            return;
        }
        Iterator it = h().iterator();
        while (it.hasNext()) {
            w wVarB = ((c) it.next()).b();
            w wVar = w.f47851a;
            if (wVarB == wVar || wVarB == w.f47854d) {
                m(wVar, new bk(bn.c()));
                return;
            }
        }
        m(w.f47853c, l(h()));
    }
}
