package defpackage;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class tzu extends plb {
    private Collection b;
    private final Map c;

    public tzu(int i, pkz pkzVar, pkx pkxVar) {
        super(i, pkzVar, pkxVar, null);
        this.b = yly.a;
        this.c = new HashMap();
    }

    @Override // defpackage.plb
    public final synchronized Object h(Object obj) {
        Object objH = super.h(obj);
        if (objH != null) {
            return objH;
        }
        return this.c.get(obj);
    }

    @Override // defpackage.plb
    public final synchronized void l() {
        int i = yfq.d;
        t((Collection) yls.a);
        super.l();
    }

    @Override // defpackage.plb
    protected final synchronized void o(Object obj, Object obj2) {
        if (this.b.contains(obj)) {
            this.c.put(obj, obj2);
        }
    }

    public final synchronized void t(Collection collection) {
        this.b = collection;
        this.c.keySet().retainAll(this.b);
    }
}
