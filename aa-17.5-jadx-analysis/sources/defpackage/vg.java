package defpackage;

import androidx.car.app.model.Row;
import androidx.car.app.model.RowSection;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class vg extends vn {
    public final int a = -1;

    public final RowSection a() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            wj.e.a((Row) it.next());
        }
        return new RowSection(this, null);
    }

    public final /* bridge */ /* synthetic */ void b(uf ufVar) {
        this.c.add(ufVar);
    }
}
