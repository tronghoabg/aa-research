package defpackage;

import android.content.Context;
import android.location.Location;
import android.os.WorkSource;
import com.google.android.gms.location.CurrentLocationRequest;

/* loaded from: classes.dex */
public final class str extends sla implements sle {
    public static final rju a = new rju("LocationServices.API", new sto());

    public str(Context context) {
        super(context, null, a, sku.c, skz.a);
    }

    public final svz a() {
        snb snbVar = new snb();
        snbVar.a = new qpz(9);
        snbVar.c = 2414;
        return super.u(0, snbVar.a());
    }

    public final svz b() {
        roc.bb(102);
        CurrentLocationRequest currentLocationRequest = new CurrentLocationRequest(10000L, 0, 102, Long.MAX_VALUE, false, 0, new WorkSource(null), null);
        snb snbVar = new snb();
        snbVar.a = new qpy(currentLocationRequest, 15);
        snbVar.c = 2415;
        return super.u(0, snbVar.a());
    }

    public final void c(Location location) {
        spu.am(location != null);
        snb snbVar = new snb();
        snbVar.a = new qpy(location, 14);
        snbVar.c = 2419;
        super.u(1, snbVar.a());
    }
}
