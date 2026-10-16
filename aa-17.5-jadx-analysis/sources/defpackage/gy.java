package defpackage;

import android.content.Context;
import android.view.MenuItem;

/* loaded from: classes2.dex */
class gy {
    final Context a;
    public aat b;

    public gy(Context context) {
        this.a = context;
    }

    final MenuItem a(MenuItem menuItem) {
        if (!(menuItem instanceof dvu)) {
            return menuItem;
        }
        dvu dvuVar = (dvu) menuItem;
        aat aatVar = this.b;
        if (aatVar == null) {
            aatVar = new aat(0);
            this.b = aatVar;
        }
        MenuItem menuItem2 = (MenuItem) aatVar.get(dvuVar);
        if (menuItem2 != null) {
            return menuItem2;
        }
        hn hnVar = new hn(this.a, dvuVar);
        this.b.put(dvuVar, hnVar);
        return hnVar;
    }
}
