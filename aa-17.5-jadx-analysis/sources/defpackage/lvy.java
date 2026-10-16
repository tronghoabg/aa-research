package defpackage;

import android.os.Build;
import android.os.UserHandle;
import android.provider.Telephony;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class lvy implements max {
    private final String a;
    private final UserHandle b;

    public lvy() {
        htm htmVar = new htm(mki.a.c, (byte[]) null);
        this.a = Telephony.Sms.getDefaultSmsPackage(mki.a.c);
        if (Build.VERSION.SDK_INT >= 30) {
            this.b = htmVar.q();
        } else {
            this.b = null;
        }
    }

    @Override // defpackage.max
    public final /* synthetic */ boolean a(StatusBarNotification statusBarNotification, int i, boolean z) {
        boolean zJ = new lwd(statusBarNotification, false).j();
        String packageName = statusBarNotification.getPackageName();
        lwf.a();
        lwb lwbVarB = lwf.b(statusBarNotification);
        if (lwd.m(statusBarNotification)) {
            lxr.e();
            lxr.h(yzz.MESSAGING_SBN, !zJ ? yzy.lS : lwbVarB == null ? yzy.lT : yzy.nJ, packageName);
        }
        if (zJ && statusBarNotification.getUser().equals(this.b)) {
            lxr.e();
            yzz yzzVar = yzz.MESSAGING_SBN;
            lxr.i(yzzVar, yzy.np, packageName);
            if (!lup.e().i(packageName)) {
                lxr.e();
                lxr.i(yzzVar, yzy.nq, packageName);
            }
        }
        String str = this.a;
        if (TextUtils.equals(str, packageName)) {
            lxr.e();
            lxr.h(yzz.MESSAGING_SBN, yzy.lU, str);
        }
        if (kmo.c(acxs.b(), packageName)) {
            lxr.e();
            lxr.h(yzz.MESSAGING_SBN, yzy.md, packageName);
        }
        return false;
    }

    @Override // defpackage.max
    public final boolean b(StatusBarNotification statusBarNotification) {
        return false;
    }
}
