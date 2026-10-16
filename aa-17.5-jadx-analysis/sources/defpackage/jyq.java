package defpackage;

import android.app.Notification;
import android.content.Context;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import com.google.android.apps.auto.components.graphics.icon.GhIcon;
import j$.util.Objects;

/* loaded from: classes.dex */
public final class jyq {
    public static final yph a = yph.c("CarApp.H.Not");

    public static int a(StatusBarNotification statusBarNotification) {
        nuo nuoVarC = c(statusBarNotification.getNotification());
        String tag = statusBarNotification.getTag();
        int id = statusBarNotification.getId();
        String packageName = statusBarNotification.getPackageName();
        String strValueOf = String.valueOf(statusBarNotification.getUser());
        return Objects.hash(nuoVarC, Long.valueOf((tag + id + packageName + strValueOf).hashCode()));
    }

    public static nul b(Context context, String str, Notification.Action action) {
        aaew aaewVar = new aaew(null);
        aaewVar.b = jul.b(context, str, action.actionIntent);
        if (action.title != null) {
            aaewVar.d = action.title.toString();
        }
        if (action.icon != 0 && !TextUtils.isEmpty(str)) {
            aaewVar.e = GhIcon.r(str, action.icon);
        }
        if (action.getSemanticAction() == 7) {
            aaewVar.a = 4;
        }
        return new nul(aaewVar);
    }

    public static nuo c(Notification notification) {
        return "navigation".equals(notification.category) ? nuo.c : "recommendation".equals(notification.category) ? nuo.i : (notification.flags & 524288) != 0 ? nuo.k : nuo.a;
    }

    public static boolean d(StatusBarNotification statusBarNotification) {
        if (!ogb.i()) {
            return false;
        }
        mqc mqcVarA = ogb.d().a();
        mqcVarA.getClass();
        if (statusBarNotification.getPackageName().equals(mqcVarA.a().getPackageName())) {
            Notification notification = statusBarNotification.getNotification();
            yph yphVar = nvq.a;
            if (lxw.z(notification) != null) {
                return true;
            }
        }
        return false;
    }
}
