package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes2.dex */
public final class ssc extends sla {
    public final Activity a;

    public ssc(Context context) {
        super(context, null, srs.a, null, skz.a);
        this.a = null;
    }

    public final void a(Intent intent) {
        spu.aw(this.a);
        snb snbVar = new snb();
        snbVar.a = new qoq(this, intent, 4);
        snbVar.c = 34401;
        super.u(1, snbVar.a());
    }

    public ssc(Activity activity) {
        super(activity, activity, srs.a, null, skz.a);
        this.a = activity;
    }
}
