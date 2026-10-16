package T3;

import android.content.Context;
import android.os.PowerManager;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public static final String f11431a;

    static {
        String strF = J3.r.f("WakeLocks");
        AbstractC3340k.d(strF, "tagWithPrefix(\"WakeLocks\")");
        f11431a = strF;
    }

    public static final PowerManager.WakeLock a(Context context, String tag) {
        AbstractC3340k.e(context, "context");
        AbstractC3340k.e(tag, "tag");
        Object systemService = context.getApplicationContext().getSystemService("power");
        AbstractC3340k.c(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        String strConcat = "WorkManager: ".concat(tag);
        PowerManager.WakeLock wakeLock = ((PowerManager) systemService).newWakeLock(1, strConcat);
        synchronized (q.f11432a) {
        }
        AbstractC3340k.d(wakeLock, "wakeLock");
        return wakeLock;
    }
}
