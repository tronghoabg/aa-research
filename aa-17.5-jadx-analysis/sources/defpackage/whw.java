package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.view.View;

/* loaded from: classes3.dex */
public final class whw extends ClickableSpan {
    final /* synthetic */ String a;
    final /* synthetic */ Activity b;
    final /* synthetic */ String c;

    public whw(String str, Activity activity, String str2) {
        this.a = str;
        this.b = activity;
        this.c = str2;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        wic wicVar = new wic();
        String str = this.a;
        Activity activity = this.b;
        if (str != null) {
            vuf.I(activity, str);
        } else {
            try {
                String str2 = this.c;
                activity.getClass();
                if (str2 == null || str2.isEmpty()) {
                    vuf.T(activity);
                } else {
                    Intent intentPutExtra = new Intent("com.google.android.gms.accountsettings.action.VIEW_SETTINGS").setPackage("com.google.android.gms").putExtra("extra.accountName", str2).putExtra("extra.screenId", 500);
                    if (intentPutExtra.resolveActivity(activity.getPackageManager()) == null) {
                        vuf.T(activity);
                    } else {
                        activity.startActivityForResult(intentPutExtra, 0);
                    }
                }
            } catch (wdr e) {
                Log.e("ResourceUtils", "No app found to open URL: ".concat(String.valueOf(e.a)));
            }
        }
        Activity activity2 = this.b;
        String str3 = this.c;
        wox woxVar = wia.c;
        if (wia.c(adgs.c(wia.b))) {
            wib wibVarA = wib.a();
            abnp abnpVarN = abwm.a.n();
            abnpVarN.t();
            ((abwm) abnpVarN.b).b = aclh.g(2);
            abnpVarN.t();
            ((abwm) abnpVarN.b).c = aclh.f(4);
            wibVarA.d((abwm) abnpVarN.q(), wicVar.b(), wicVar.a(), activity2, str3);
        }
    }
}
