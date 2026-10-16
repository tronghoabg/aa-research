package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class rre {
    private final shv a;
    private final tmu b;

    public rre(Context context) {
        List list = shv.n;
        this.a = new shp(context, "CAR").a();
        this.b = new tmu(context, new tmp(new ajeg()));
    }

    public final void a(yxc yxcVar, yxb yxbVar, List list) {
        shr shrVarF;
        synchronized (this) {
            shrVarF = this.a.f(yxbVar);
            shrVarF.g(yxcVar.aw);
            shrVarF.f("com.google.android.gms.car");
            shrVarF.f("com.google.android.projection.gearhead");
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Integer num = (Integer) it.next();
                num.intValue();
                if (shrVarF.c == null) {
                    shrVarF.c = new ArrayList();
                }
                shrVarF.c.add(num);
            }
            shrVarF.c(this.b);
        }
        shrVarF.b();
    }
}
