package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ResolveInfo;

/* loaded from: classes.dex */
public final class lus extends luq {
    @Override // defpackage.luq
    public final yfg a(qrn qrnVar, nyj nyjVar) {
        ygp ygpVar = new ygp();
        yfg yfgVar = this.a;
        if (yfgVar != null) {
            return yfgVar;
        }
        for (ResolveInfo resolveInfo : mki.a.c.getPackageManager().queryIntentServices(new Intent("androidx.car.app.messaging.action.HANDLE_CAR_MESSAGING"), 65)) {
            ygpVar.c(new ComponentName(resolveInfo.serviceInfo.packageName, resolveInfo.serviceInfo.name));
        }
        this.a = ygpVar.g();
        return ygpVar.g();
    }
}
