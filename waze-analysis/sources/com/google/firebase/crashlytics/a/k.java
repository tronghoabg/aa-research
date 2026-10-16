package com.google.firebase.crashlytics.a;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import com.google.firebase.crashlytics.a.e.cc;
import com.google.firebase.crashlytics.a.e.cd;
import h.g.b.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final k f9774a = new k();

    public static /* synthetic */ cd a(String str, int i2, int i3, int i4) {
        x.f(str, "processName");
        cc ccVar = new cc();
        ccVar.e(str);
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        ccVar.d(i2);
        if ((i4 & 4) != 0) {
            i3 = 0;
        }
        ccVar.c(i3);
        ccVar.b(false);
        cd cdVarA = ccVar.a();
        x.e(cdVarA, "build(...)");
        return cdVarA;
    }

    public static final List b(Context context) {
        List<ActivityManager.RunningAppProcessInfo> listH;
        x.f(context, "context");
        int i2 = context.getApplicationInfo().uid;
        String str = context.getApplicationInfo().processName;
        Object systemService = context.getSystemService("activity");
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        if (activityManager == null || (listH = activityManager.getRunningAppProcesses()) == null) {
            listH = h.a.i.h();
        }
        List listAc = h.a.i.ac(listH);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listAc) {
            if (((ActivityManager.RunningAppProcessInfo) obj).uid == i2) {
                arrayList.add(obj);
            }
        }
        ArrayList<ActivityManager.RunningAppProcessInfo> arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList(h.a.i.q(arrayList2, 10));
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : arrayList2) {
            cc ccVar = new cc();
            ccVar.e(runningAppProcessInfo.processName);
            ccVar.d(runningAppProcessInfo.pid);
            ccVar.c(runningAppProcessInfo.importance);
            ccVar.b(x.n(runningAppProcessInfo.processName, str));
            arrayList3.add(ccVar.a());
        }
        return arrayList3;
    }

    public static final cd c(Context context) {
        Object next;
        String processName;
        x.f(context, "context");
        int iMyPid = Process.myPid();
        Iterator it = b(context).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((cd) next).b() == iMyPid) {
                break;
            }
        }
        cd cdVar = (cd) next;
        if (cdVar != null) {
            return cdVar;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            processName = Process.myProcessName();
            x.c(processName);
        } else {
            processName = Application.getProcessName();
            if (processName == null) {
                processName = "";
            }
        }
        return a(processName, iMyPid, 0, 12);
    }
}
