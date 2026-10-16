package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class kxk {
    public static final /* synthetic */ int a = 0;

    static {
        defpackage.yqm yqmVar = defpackage.kxl.a;
    }

    public static android.os.HandlerThread a() {
        android.os.HandlerThread handlerThread = new android.os.HandlerThread("gh-record-worker", -16);
        handlerThread.start();
        return handlerThread;
    }

    public static void b(android.content.Context context) {
        android.app.ActivityManager activityManager = (android.app.ActivityManager) context.getSystemService("activity");
        if (activityManager == null) {
            ((defpackage.yqj) ((defpackage.yqj) defpackage.kxl.a.h()).ai((char) 3474)).u("Service activity does not exist");
            return;
        }
        java.util.List<android.app.ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
        if (runningAppProcesses == null) {
            ((defpackage.yqj) ((defpackage.yqj) defpackage.kxl.a.h()).ai((char) 3473)).u("No running process");
            return;
        }
        int iMyPid = android.os.Process.myPid();
        for (android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.pid == iMyPid) {
                defpackage.yqj yqjVar = (defpackage.yqj) ((defpackage.yqj) defpackage.kxl.a.f()).ai(3472);
                java.lang.Integer numValueOf = java.lang.Integer.valueOf(runningAppProcessInfo.pid);
                defpackage.zke zkeVar = defpackage.zke.a;
                yqjVar.S("pid: %s, uid: %s, name: %s, importance: %s", new defpackage.zkf(zkeVar, numValueOf), new defpackage.zkf(zkeVar, java.lang.Integer.valueOf(runningAppProcessInfo.uid)), new defpackage.zkf(zkeVar, runningAppProcessInfo.processName), new defpackage.zkf(zkeVar, java.lang.Integer.valueOf(runningAppProcessInfo.importance)));
            }
        }
    }
}
