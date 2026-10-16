package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class stm {
    private static final java.lang.reflect.Method a;
    private static final java.lang.reflect.Method b;

    static {
        java.lang.reflect.Method declaredMethod;
        java.lang.reflect.Method declaredMethod2 = null;
        try {
            declaredMethod = android.app.job.JobScheduler.class.getDeclaredMethod("scheduleAsPackage", android.app.job.JobInfo.class, java.lang.String.class, java.lang.Integer.TYPE, java.lang.String.class);
        } catch (java.lang.NoSuchMethodException unused) {
            if (android.util.Log.isLoggable("JobSchedulerCompat", 6)) {
                android.util.Log.e("JobSchedulerCompat", "No scheduleAsPackage method available, falling back to schedule");
            }
            declaredMethod = null;
        }
        a = declaredMethod;
        try {
            declaredMethod2 = android.os.UserHandle.class.getDeclaredMethod("myUserId", null);
        } catch (java.lang.NoSuchMethodException unused2) {
            if (android.util.Log.isLoggable("JobSchedulerCompat", 6)) {
                android.util.Log.e("JobSchedulerCompat", "No myUserId method available");
            }
        }
        b = declaredMethod2;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003d  */
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public static void a(android.content.Context context, android.app.job.JobInfo jobInfo, java.lang.String str) {
        int iIntValue;
        android.app.job.JobScheduler jobScheduler = (android.app.job.JobScheduler) context.getSystemService("jobscheduler");
        jobScheduler.getClass();
        if (a == null || context.checkSelfPermission("android.permission.UPDATE_DEVICE_STATS") != 0) {
            jobScheduler.schedule(jobInfo);
            return;
        }
        java.lang.reflect.Method method = b;
        if (method != null) {
            try {
                java.lang.Integer num = (java.lang.Integer) method.invoke(android.os.UserHandle.class, null);
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 0;
                }
            } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException e) {
                if (android.util.Log.isLoggable("JobSchedulerCompat", 6)) {
                    android.util.Log.e("JobSchedulerCompat", "myUserId invocation illegal", e);
                }
            }
        } else {
            iIntValue = 0;
        }
        java.lang.reflect.Method method2 = a;
        if (method2 != null) {
            try {
                java.lang.Integer num2 = (java.lang.Integer) method2.invoke(jobScheduler, jobInfo, "com.google.android.gms", java.lang.Integer.valueOf(iIntValue), str);
                if (num2 != null) {
                    num2.intValue();
                    return;
                }
                return;
            } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException e2) {
                android.util.Log.e(str, "error calling scheduleAsPackage", e2);
            }
        }
        jobScheduler.schedule(jobInfo);
    }
}
