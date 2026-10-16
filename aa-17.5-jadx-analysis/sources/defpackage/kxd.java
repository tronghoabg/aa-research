package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.os.HandlerThread;
import android.os.Process;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class kxd {
    public static final /* synthetic */ int a = 0;

    static {
        yph yphVar = kxe.a;
    }

    public static HandlerThread a() {
        HandlerThread handlerThread = new HandlerThread("gh-record-worker", -16);
        handlerThread.start();
        return handlerThread;
    }

    public static void b(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager == null) {
            ((ype) ((ype) kxe.a.h()).ai((char) 3471)).u("Service activity does not exist");
            return;
        }
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
        if (runningAppProcesses == null) {
            ((ype) ((ype) kxe.a.h()).ai((char) 3470)).u("No running process");
            return;
        }
        int iMyPid = Process.myPid();
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.pid == iMyPid) {
                ype ypeVar = (ype) ((ype) kxe.a.f()).ai(3469);
                Integer numValueOf = Integer.valueOf(runningAppProcessInfo.pid);
                zjc zjcVar = zjc.a;
                ypeVar.S("pid: %s, uid: %s, name: %s, importance: %s", new zjd(zjcVar, numValueOf), new zjd(zjcVar, Integer.valueOf(runningAppProcessInfo.uid)), new zjd(zjcVar, runningAppProcessInfo.processName), new zjd(zjcVar, Integer.valueOf(runningAppProcessInfo.importance)));
            }
        }
    }
}
