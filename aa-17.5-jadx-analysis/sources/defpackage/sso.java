package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.os.UserHandle;
import android.util.Log;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public final class sso {
    private static final Method a;
    private static final Method b;

    static {
        Method declaredMethod;
        Method declaredMethod2 = null;
        try {
            declaredMethod = JobScheduler.class.getDeclaredMethod("scheduleAsPackage", JobInfo.class, String.class, Integer.TYPE, String.class);
        } catch (NoSuchMethodException unused) {
            if (Log.isLoggable("JobSchedulerCompat", 6)) {
                Log.e("JobSchedulerCompat", "No scheduleAsPackage method available, falling back to schedule");
            }
            declaredMethod = null;
        }
        a = declaredMethod;
        try {
            declaredMethod2 = UserHandle.class.getDeclaredMethod("myUserId", null);
        } catch (NoSuchMethodException unused2) {
            if (Log.isLoggable("JobSchedulerCompat", 6)) {
                Log.e("JobSchedulerCompat", "No myUserId method available");
            }
        }
        b = declaredMethod2;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003d  */
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(android.content.Context r5, android.app.job.JobInfo r6, java.lang.String r7) {
        /*
            java.lang.String r0 = "jobscheduler"
            java.lang.Object r0 = r5.getSystemService(r0)
            android.app.job.JobScheduler r0 = (android.app.job.JobScheduler) r0
            r0.getClass()
            java.lang.reflect.Method r1 = defpackage.sso.a
            if (r1 == 0) goto L6e
            java.lang.String r1 = "android.permission.UPDATE_DEVICE_STATS"
            int r5 = r5.checkSelfPermission(r1)
            if (r5 != 0) goto L6e
            java.lang.reflect.Method r5 = defpackage.sso.b
            r1 = 0
            if (r5 == 0) goto L3d
            java.lang.Class<android.os.UserHandle> r2 = android.os.UserHandle.class
            r3 = 0
            java.lang.Object r5 = r5.invoke(r2, r3)     // Catch: java.lang.reflect.InvocationTargetException -> L2c java.lang.IllegalAccessException -> L2e
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch: java.lang.reflect.InvocationTargetException -> L2c java.lang.IllegalAccessException -> L2e
            if (r5 == 0) goto L3d
            int r5 = r5.intValue()     // Catch: java.lang.reflect.InvocationTargetException -> L2c java.lang.IllegalAccessException -> L2e
            goto L3e
        L2c:
            r5 = move-exception
            goto L2f
        L2e:
            r5 = move-exception
        L2f:
            r2 = 6
            java.lang.String r3 = "JobSchedulerCompat"
            boolean r2 = android.util.Log.isLoggable(r3, r2)
            if (r2 == 0) goto L3d
            java.lang.String r2 = "myUserId invocation illegal"
            android.util.Log.e(r3, r2, r5)
        L3d:
            r5 = r1
        L3e:
            java.lang.reflect.Method r2 = defpackage.sso.a
            if (r2 == 0) goto L6a
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.reflect.InvocationTargetException -> L62 java.lang.IllegalAccessException -> L64
            r3 = 4
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.reflect.InvocationTargetException -> L62 java.lang.IllegalAccessException -> L64
            r3[r1] = r6     // Catch: java.lang.reflect.InvocationTargetException -> L62 java.lang.IllegalAccessException -> L64
            java.lang.String r1 = "com.google.android.gms"
            r4 = 1
            r3[r4] = r1     // Catch: java.lang.reflect.InvocationTargetException -> L62 java.lang.IllegalAccessException -> L64
            r1 = 2
            r3[r1] = r5     // Catch: java.lang.reflect.InvocationTargetException -> L62 java.lang.IllegalAccessException -> L64
            r5 = 3
            r3[r5] = r7     // Catch: java.lang.reflect.InvocationTargetException -> L62 java.lang.IllegalAccessException -> L64
            java.lang.Object r5 = r2.invoke(r0, r3)     // Catch: java.lang.reflect.InvocationTargetException -> L62 java.lang.IllegalAccessException -> L64
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch: java.lang.reflect.InvocationTargetException -> L62 java.lang.IllegalAccessException -> L64
            if (r5 == 0) goto L61
            r5.intValue()     // Catch: java.lang.reflect.InvocationTargetException -> L62 java.lang.IllegalAccessException -> L64
        L61:
            return
        L62:
            r5 = move-exception
            goto L65
        L64:
            r5 = move-exception
        L65:
            java.lang.String r1 = "error calling scheduleAsPackage"
            android.util.Log.e(r7, r1, r5)
        L6a:
            r0.schedule(r6)
            return
        L6e:
            r0.schedule(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sso.a(android.content.Context, android.app.job.JobInfo, java.lang.String):void");
    }
}
