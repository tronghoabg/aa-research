package defpackage;

import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public class erm {
    public final esk h = new esk();

    public final void g() {
        esk eskVar = this.h;
        if (!eskVar.c) {
            eskVar.c = true;
            synchronized (eskVar.d) {
                Iterator it = eskVar.a.values().iterator();
                while (it.hasNext()) {
                    esk.a((AutoCloseable) it.next());
                }
                Set set = eskVar.b;
                Iterator it2 = set.iterator();
                while (it2.hasNext()) {
                    esk.a((AutoCloseable) it2.next());
                }
                set.clear();
            }
        }
        d();
    }

    protected void d() {
    }
}
