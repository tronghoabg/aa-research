package X0;

import android.app.AppOpsManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.os.Bundle;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class N {

    /* renamed from: d, reason: collision with root package name */
    public static String f15807d;

    /* renamed from: g, reason: collision with root package name */
    public static M f15810g;

    /* renamed from: a, reason: collision with root package name */
    public final Context f15811a;

    /* renamed from: b, reason: collision with root package name */
    public final NotificationManager f15812b;

    /* renamed from: c, reason: collision with root package name */
    public static final Object f15806c = new Object();

    /* renamed from: e, reason: collision with root package name */
    public static HashSet f15808e = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    public static final Object f15809f = new Object();

    public N(Context context) {
        this.f15811a = context;
        this.f15812b = (NotificationManager) context.getSystemService("notification");
    }

    public final boolean a() throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        Method method;
        Integer num;
        if (Build.VERSION.SDK_INT >= 24) {
            return F.a(this.f15812b);
        }
        Context context = this.f15811a;
        AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService("appops");
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        String packageName = context.getApplicationContext().getPackageName();
        int i5 = applicationInfo.uid;
        try {
            Class<?> cls = Class.forName(AppOpsManager.class.getName());
            Class<?> cls2 = Integer.TYPE;
            method = cls.getMethod("checkOpNoThrow", cls2, cls2, String.class);
            num = (Integer) cls.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class);
            num.getClass();
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
        }
        return ((Integer) method.invoke(appOpsManager, num, Integer.valueOf(i5), packageName)).intValue() == 0;
    }

    public final void b(int i5, String str) {
        this.f15812b.cancel(str, i5);
    }

    public final void c(String str, int i5, Notification notification) {
        Bundle bundle = notification.extras;
        NotificationManager notificationManager = this.f15812b;
        if (bundle == null || !bundle.getBoolean("android.support.useSideChannel")) {
            notificationManager.notify(str, i5, notification);
            return;
        }
        J j8 = new J(this.f15811a.getPackageName(), i5, str, notification);
        synchronized (f15809f) {
            try {
                if (f15810g == null) {
                    f15810g = new M(this.f15811a.getApplicationContext());
                }
                f15810g.f15803b.obtainMessage(0, j8).sendToTarget();
            } catch (Throwable th) {
                throw th;
            }
        }
        notificationManager.cancel(str, i5);
    }
}
