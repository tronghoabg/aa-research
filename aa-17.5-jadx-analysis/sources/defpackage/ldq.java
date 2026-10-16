package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.os.UserManager;

/* loaded from: classes.dex */
public class ldq {
    private final jri a;
    private final String b;
    private final Context c;

    public ldq(Context context, jri jriVar, String str) {
        this.c = context;
        this.a = jriVar;
        this.b = str;
    }

    public static final yyi g() {
        return yyi.b((int) acvz.a.gu().a());
    }

    public tea a() {
        return null;
    }

    public Boolean b() {
        return null;
    }

    public final String c() {
        return this.b;
    }

    public final String d() {
        return this.a.name();
    }

    public final boolean e() {
        return ((ActivityManager) this.c.getSystemService(ActivityManager.class)).isBackgroundRestricted();
    }

    public final boolean f() {
        return ((UserManager) this.c.getSystemService(UserManager.class)).isUserUnlocked();
    }
}
