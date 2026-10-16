package defpackage;

import java.util.Iterator;

/* loaded from: classes.dex */
final class ljj implements lis {
    final /* synthetic */ ljk a;

    public ljj(ljk ljkVar) {
        this.a = ljkVar;
    }

    @Override // defpackage.lis
    public final void a(lir lirVar) {
        Iterator it = this.a.e.iterator();
        while (it.hasNext()) {
            ((lis) it.next()).a(lirVar);
        }
    }

    @Override // defpackage.lis
    public final void b(Float f) {
        Iterator it = this.a.e.iterator();
        while (it.hasNext()) {
            ((lis) it.next()).b(f);
        }
    }
}
