package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
final class vqd extends vpx {
    public final List b = new CopyOnWriteArrayList();

    @Override // defpackage.vpx
    public final void g(vky vkyVar) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((vqa) it.next()).g(vkyVar);
        }
    }

    @Override // defpackage.vpx
    public final void j(vky vkyVar) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((vqa) it.next()).j(vkyVar);
        }
    }
}
