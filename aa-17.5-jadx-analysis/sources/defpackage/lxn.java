package defpackage;

import android.app.Notification;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.service.notification.StatusBarNotification;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

/* loaded from: classes.dex */
public abstract class lxn extends mcc {
    private static final yph a = yph.c("GH.SbnConverter");

    static lwy e(StatusBarNotification statusBarNotification) {
        mcd.b();
        long jA = mcd.a(statusBarNotification);
        Notification notification = statusBarNotification.getNotification();
        lwy lwyVar = new lwy();
        lwyVar.h = jA;
        lwyVar.e = lnm.k().a(jA);
        lwyVar.i = statusBarNotification.getPackageName();
        lwyVar.b = statusBarNotification;
        lwyVar.B = lxr.l().a(statusBarNotification);
        lwyVar.y = notification.icon;
        lwyVar.w = notification.color;
        return lwyVar;
    }

    static void f(lwz lwzVar) {
        lwzVar.s(lws.d().i());
        lwzVar.g(lnm.k().j(lwzVar));
    }

    static void g(qjk qjkVar, StatusBarNotification statusBarNotification, String str, Icon icon) {
        qjkVar.a = statusBarNotification;
        qjkVar.c = str;
        qjkVar.h = statusBarNotification.getPackageName();
        qjkVar.i = icon;
        qjkVar.g = str;
    }

    static final boolean j(String str) {
        return kmo.c(actq.b(), str);
    }

    protected abstract boolean b(StatusBarNotification statusBarNotification);

    @Override // defpackage.mcc
    @ResultIgnorabilityUnspecified
    public final boolean i(Context context, StatusBarNotification statusBarNotification) {
        if (!j(statusBarNotification.getPackageName())) {
            return false;
        }
        if (jrk.a(mki.a.c, statusBarNotification.getPackageName()) != null) {
            return b(statusBarNotification);
        }
        ((ype) ((ype) a.h()).ai((char) 4441)).y("Car message notification with null appName (maybe '%s' is an invalid package?)", statusBarNotification.getPackageName());
        return false;
    }

    @Override // defpackage.mcc
    public final boolean k(StatusBarNotification statusBarNotification) {
        return true;
    }

    @Override // defpackage.mcc
    public final boolean l(StatusBarNotification statusBarNotification) {
        return true;
    }
}
