package T3;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.util.Log;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final String f11420a;

    static {
        String strF = J3.r.f("ProcessUtils");
        AbstractC3340k.d(strF, "tagWithPrefix(\"ProcessUtils\")");
        f11420a = strF;
    }

    public static final boolean a(Context context, J3.b configuration) {
        String strA;
        Object next;
        Object objInvoke;
        AbstractC3340k.e(context, "context");
        AbstractC3340k.e(configuration, "configuration");
        if (Build.VERSION.SDK_INT >= 28) {
            strA = a.f11401a.a();
        } else {
            strA = null;
            try {
                Method declaredMethod = Class.forName("android.app.ActivityThread", false, J3.x.class.getClassLoader()).getDeclaredMethod("currentProcessName", new Class[0]);
                declaredMethod.setAccessible(true);
                objInvoke = declaredMethod.invoke(null, new Object[0]);
                AbstractC3340k.b(objInvoke);
            } catch (Throwable th) {
                if (J3.r.d().f5584a <= 3) {
                    Log.d(f11420a, "Unable to check ActivityThread for processName", th);
                }
            }
            if (objInvoke instanceof String) {
                strA = (String) objInvoke;
            } else {
                int iMyPid = Process.myPid();
                Object systemService = context.getSystemService("activity");
                AbstractC3340k.c(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
                List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) systemService).getRunningAppProcesses();
                if (runningAppProcesses != null) {
                    Iterator<T> it = runningAppProcesses.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        if (((ActivityManager.RunningAppProcessInfo) next).pid == iMyPid) {
                            break;
                        }
                    }
                    ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) next;
                    if (runningAppProcessInfo != null) {
                        strA = runningAppProcessInfo.processName;
                    }
                }
            }
        }
        return AbstractC3340k.a(strA, context.getApplicationInfo().processName);
    }
}
