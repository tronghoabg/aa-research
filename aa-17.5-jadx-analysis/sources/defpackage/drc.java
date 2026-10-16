package defpackage;

import java.util.Iterator;

/* loaded from: classes2.dex */
public final class drc extends drb {
    public int m;

    public drc(drj drjVar) {
        super(drjVar);
        this.l = true != (drjVar instanceof drg) ? 3 : 2;
    }

    @Override // defpackage.drb
    public final void c(int i) {
        if (this.i) {
            return;
        }
        this.i = true;
        this.f = i;
        Iterator it = this.j.iterator();
        while (it.hasNext()) {
            ((dqz) it.next()).f();
        }
    }
}
