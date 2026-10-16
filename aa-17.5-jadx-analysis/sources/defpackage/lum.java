package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;

/* loaded from: classes.dex */
public final class lum extends luq {
    private final tgw b;

    public lum(Context context) {
        this.b = new tgw(context, actg.a.gu().b());
    }

    @Override // defpackage.luq
    public final yfg a(qrn qrnVar, nyj nyjVar) {
        int i = yfq.d;
        yfl yflVar = new yfl(4);
        PackageManager packageManager = mki.a.c.getPackageManager();
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.LAUNCHER");
        for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(intent, 0)) {
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            if (activityInfo != null && this.b.a(activityInfo.packageName)) {
                yflVar.i(new ComponentName(resolveInfo.activityInfo.packageName, resolveInfo.activityInfo.name));
            }
        }
        return yflVar.g();
    }
}
