package defpackage;

import android.app.Notification;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.service.notification.StatusBarNotification;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

/* loaded from: classes2.dex */
public abstract class lxj {
    private static final yph a = yph.c("GH.ConvSbnConverter");

    static lvh e(StatusBarNotification statusBarNotification) {
        mcd.b();
        long jA = mcd.a(statusBarNotification);
        Notification notification = statusBarNotification.getNotification();
        lvh lvhVar = new lvh();
        lvhVar.f = jA;
        lvhVar.c = lnm.j().a(jA);
        lvhVar.o = statusBarNotification.getPackageName();
        lvhVar.n = statusBarNotification;
        lvhVar.k = lxr.l().a(statusBarNotification);
        lvhVar.i = notification.icon;
        lvhVar.m = notification.color;
        return lvhVar;
    }

    static void f(lvi lviVar) {
        lviVar.j(lws.d().i());
        lviVar.h(lnm.j().j(lviVar));
    }

    static void g(qjk qjkVar, StatusBarNotification statusBarNotification, String str, Icon icon) {
        qjkVar.a = statusBarNotification;
        qjkVar.c = str;
        qjkVar.h = statusBarNotification.getPackageName();
        qjkVar.i = icon;
        qjkVar.g = str;
    }

    static final boolean i(String str) {
        return kmo.c(actq.b(), str);
    }

    public abstract lvg a(Context context, StatusBarNotification statusBarNotification);

    protected abstract boolean b(StatusBarNotification statusBarNotification);

    @ResultIgnorabilityUnspecified
    public final boolean j(StatusBarNotification statusBarNotification) {
        if (!i(statusBarNotification.getPackageName())) {
            return false;
        }
        if (jrk.a(mki.a.c, statusBarNotification.getPackageName()) != null) {
            return b(statusBarNotification);
        }
        ((ype) ((ype) a.h()).ai((char) 4434)).y("Car message notification with null appName (maybe '%s' is an invalid package?)", statusBarNotification.getPackageName());
        return false;
    }
}
