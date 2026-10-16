package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public final class idt implements idh {
    public final Set a = Collections.newSetFromMap(new WeakHashMap());

    @Override // defpackage.idh
    public final void j() {
        Iterator it = ify.e(this.a).iterator();
        while (it.hasNext()) {
            ((iev) it.next()).j();
        }
    }

    @Override // defpackage.idh
    public final void k() {
        Iterator it = ify.e(this.a).iterator();
        while (it.hasNext()) {
            ((iev) it.next()).k();
        }
    }

    @Override // defpackage.idh
    public final void l() {
        Iterator it = ify.e(this.a).iterator();
        while (it.hasNext()) {
            ((iev) it.next()).l();
        }
    }
}
