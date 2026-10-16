package defpackage;

import android.content.Context;
import android.service.notification.StatusBarNotification;

/* loaded from: classes.dex */
public abstract class mcc implements mnt {
    protected static final long n(StatusBarNotification statusBarNotification) {
        mcd.b();
        return mcd.a(statusBarNotification);
    }

    public abstract boolean i(Context context, StatusBarNotification statusBarNotification);

    public abstract boolean k(StatusBarNotification statusBarNotification);

    public abstract boolean l(StatusBarNotification statusBarNotification);
}
