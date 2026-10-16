package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes.dex */
final class ogu extends mdd {
    final /* synthetic */ ogy a;

    public ogu(ogy ogyVar) {
        this.a = ogyVar;
    }

    @Override // defpackage.mdd
    protected final vky a() {
        return new vky("IcsPackageChangeReceiver");
    }

    @Override // defpackage.mdd
    public final void b(Context context, Intent intent) {
        ogy ogyVar = this.a;
        if (context.getPackageManager().getComponentEnabledSetting(new ComponentName(context, ogyVar.getClass().getName())) == 1) {
            return;
        }
        ((ype) ((ype) ogy.a.f()).ai((char) 5903)).u("ICS package disabled");
        ogyVar.b();
        ohh ohhVar = ogyVar.c;
        if (ohhVar != null) {
            ohhVar.onUnbind(new Intent("android.telecom.InCallService"));
            return;
        }
        ogw ogwVar = ogyVar.b;
        ogwVar.getClass();
        ogwVar.onUnbind(new Intent("android.telecom.InCallService"));
    }
}
