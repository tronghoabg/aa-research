package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class sza {
    public static java.lang.Thread a;
    public static java.lang.Thread b;

    private sza() {
    }

    public static void a(android.content.Context context) {
        int iMyPid = android.os.Process.myPid();
        int iMyUid = android.os.Process.myUid();
        android.app.ActivityManager activityManager = (android.app.ActivityManager) context.getSystemService("activity");
        if (activityManager == null) {
            android.util.Log.e("AppDoctorRestartUtil", "Failed to get ActivityManager.");
            return;
        }
        for (android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo : activityManager.getRunningAppProcesses()) {
            if (runningAppProcessInfo.uid == iMyUid && runningAppProcessInfo.pid != iMyPid) {
                android.util.Log.i("AppDoctorRestartUtil", java.lang.String.format("Killing '%s' pid=%d", runningAppProcessInfo.processName, java.lang.Integer.valueOf(runningAppProcessInfo.pid)));
                android.os.Process.killProcess(runningAppProcessInfo.pid);
            }
        }
    }

    public static void b() {
        android.os.Process.killProcess(android.os.Process.myPid());
    }
}
