package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class tyn implements tqu {
    private boolean a = false;
    private List b = new ArrayList();

    public final void b(Runnable runnable) {
        boolean z;
        synchronized (this) {
            z = this.a;
            if (!z) {
                List list = this.b;
                list.getClass();
                list.add(runnable);
            }
        }
        if (z) {
            runnable.run();
        }
    }

    @Override // defpackage.tqu
    public final void gq(abgx abgxVar, int i) {
        List list;
        synchronized (this) {
            list = null;
            if (!this.a) {
                List list2 = this.b;
                this.b = null;
                list = list2;
            }
            this.a = true;
        }
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }
    }
}
