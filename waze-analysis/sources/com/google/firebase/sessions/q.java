package com.google.firebase.sessions;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class q {
    public static final List a(Context context) {
        List<ActivityManager.RunningAppProcessInfo> listH;
        h.g.b.x.f(context, "context");
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
            String str2 = runningAppProcessInfo.processName;
            h.g.b.x.e(str2, "processName");
            arrayList3.add(new u(str2, runningAppProcessInfo.pid, runningAppProcessInfo.importance, h.g.b.x.n(runningAppProcessInfo.processName, str)));
        }
        return arrayList3;
    }

    public static final String b() {
        if (Build.VERSION.SDK_INT >= 33) {
            String strMyProcessName = Process.myProcessName();
            h.g.b.x.e(strMyProcessName, "myProcessName(...)");
            return strMyProcessName;
        }
        String processName = Application.getProcessName();
        if (processName != null) {
            return processName;
        }
        String strA = com.google.android.gms.common.util.e.a();
        return strA != null ? strA : "";
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|2|(2:4|(1:6)(1:7))(0)|8|(1:44)|(1:(1:(7:12|46|13|34|35|40|41)(2:17|18))(2:19|20))(3:24|25|(2:27|36))|28|42|31|(5:33|34|35|40|41)|36|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008d, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008e, code lost:
    
        r8 = r7;
        r7 = r8;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(com.google.firebase.installations.d r8, h.c.e r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.google.firebase.sessions.r
            if (r0 == 0) goto L13
            r0 = r9
            com.google.firebase.sessions.r r0 = (com.google.firebase.sessions.r) r0
            int r1 = r0.f10981c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10981c = r1
            goto L18
        L13:
            com.google.firebase.sessions.r r0 = new com.google.firebase.sessions.r
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r7 = r0.f10980b
            h.c.a.a r9 = h.c.a.a.f48038a
            int r1 = r0.f10981c
            java.lang.String r2 = ""
            java.lang.String r3 = "InstallationId"
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L46
            if (r1 == r5) goto L3c
            if (r1 != r4) goto L34
            java.lang.Object r8 = r0.f10979a
            java.lang.String r8 = (java.lang.String) r8
            e.b.c.b(r7)     // Catch: java.lang.Exception -> L32
            goto L85
        L32:
            r7 = move-exception
            goto L91
        L34:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3c:
            java.lang.Object r8 = r0.f10979a
            com.google.firebase.installations.d r8 = (com.google.firebase.installations.d) r8
            e.b.c.b(r7)     // Catch: java.lang.Exception -> L44
            goto L5d
        L44:
            r7 = move-exception
            goto L67
        L46:
            e.b.c.b(r7)
            com.google.android.gms.o.t r7 = r8.h()     // Catch: java.lang.Exception -> L44
            java.lang.String r1 = "getToken(...)"
            h.g.b.x.e(r7, r1)     // Catch: java.lang.Exception -> L44
            r0.f10979a = r8     // Catch: java.lang.Exception -> L44
            r0.f10981c = r5     // Catch: java.lang.Exception -> L44
            java.lang.Object r7 = kotlinx.coroutines.i.c.a(r7, r0)     // Catch: java.lang.Exception -> L44
            if (r7 != r9) goto L5d
            goto L8c
        L5d:
            com.google.firebase.installations.j r7 = (com.google.firebase.installations.j) r7     // Catch: java.lang.Exception -> L44
            java.lang.String r7 = r7.a()     // Catch: java.lang.Exception -> L44
            h.g.b.x.c(r7)     // Catch: java.lang.Exception -> L44
            goto L6f
        L67:
            java.lang.String r1 = "Error getting authentication token."
            java.lang.Throwable r7 = (java.lang.Throwable) r7
            android.util.Log.w(r3, r1, r7)
            r7 = r2
        L6f:
            com.google.android.gms.o.t r8 = r8.a()     // Catch: java.lang.Exception -> L8d
            java.lang.String r1 = "getId(...)"
            h.g.b.x.e(r8, r1)     // Catch: java.lang.Exception -> L8d
            r0.f10979a = r7     // Catch: java.lang.Exception -> L8d
            r0.f10981c = r4     // Catch: java.lang.Exception -> L8d
            java.lang.Object r8 = kotlinx.coroutines.i.c.a(r8, r0)     // Catch: java.lang.Exception -> L8d
            if (r8 == r9) goto L8c
            r6 = r8
            r8 = r7
            r7 = r6
        L85:
            h.g.b.x.c(r7)     // Catch: java.lang.Exception -> L32
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Exception -> L32
            r2 = r7
            goto L98
        L8c:
            return r9
        L8d:
            r8 = move-exception
            r6 = r8
            r8 = r7
            r7 = r6
        L91:
            java.lang.String r9 = "Error getting Firebase installation id ."
            java.lang.Throwable r7 = (java.lang.Throwable) r7
            android.util.Log.w(r3, r9, r7)
        L98:
            com.google.firebase.sessions.s r7 = new com.google.firebase.sessions.s
            r7.<init>(r2, r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.q.c(com.google.firebase.installations.d, h.c.e):java.lang.Object");
    }
}
