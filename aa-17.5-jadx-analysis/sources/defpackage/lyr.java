package defpackage;

import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
final class lyr extends lyt {
    final /* synthetic */ lyu a;

    public lyr(lyu lyuVar) {
        this.a = lyuVar;
    }

    @Override // defpackage.lyt
    protected final boolean a() {
        return this.a.a;
    }

    @Override // defpackage.lyt
    protected final void b(boolean z) {
        int i = lyu.e;
        Set set = this.a.b;
        set.size();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((lyo) it.next()).b();
        }
    }
}
