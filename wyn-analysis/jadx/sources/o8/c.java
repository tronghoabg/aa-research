package O8;

import U8.C0857a0;
import U8.C0859b0;
import U8.E0;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.util.Log;
import ff.o;
import ff.p;
import ff.v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f8921a = new c();

    /* renamed from: b, reason: collision with root package name */
    public static final c f8922b = new c();

    public static C0859b0 a(c cVar, String processName, int i5, int i10, int i11) {
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        cVar.getClass();
        AbstractC3340k.e(processName, "processName");
        C0857a0 c0857a0 = new C0857a0();
        c0857a0.f12509a = processName;
        c0857a0.f12510b = i5;
        byte b5 = (byte) (c0857a0.f12513e | 1);
        c0857a0.f12511c = i10;
        c0857a0.f12512d = false;
        c0857a0.f12513e = (byte) (((byte) (b5 | 2)) | 4);
        return c0857a0.a();
    }

    public static ArrayList d(Context context) {
        AbstractC3340k.e(context, "context");
        int i5 = context.getApplicationInfo().uid;
        String str = context.getApplicationInfo().processName;
        Object systemService = context.getSystemService("activity");
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager != null ? activityManager.getRunningAppProcesses() : null;
        if (runningAppProcesses == null) {
            runningAppProcesses = v.f35432a;
        }
        ArrayList arrayListO0 = o.o0(runningAppProcesses);
        ArrayList arrayList = new ArrayList();
        Iterator it = arrayListO0.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((ActivityManager.RunningAppProcessInfo) next).uid == i5) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(p.a0(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) it2.next();
            C0857a0 c0857a0 = new C0857a0();
            String str2 = runningAppProcessInfo.processName;
            if (str2 == null) {
                throw new NullPointerException("Null processName");
            }
            c0857a0.f12509a = str2;
            c0857a0.f12510b = runningAppProcessInfo.pid;
            byte b5 = (byte) (c0857a0.f12513e | 1);
            c0857a0.f12511c = runningAppProcessInfo.importance;
            c0857a0.f12513e = (byte) (b5 | 2);
            c0857a0.f12512d = AbstractC3340k.a(str2, str);
            c0857a0.f12513e = (byte) (c0857a0.f12513e | 4);
            arrayList2.add(c0857a0.a());
        }
        return arrayList2;
    }

    public boolean b(int i5) {
        return 4 <= i5 || Log.isLoggable("FirebaseCrashlytics", i5);
    }

    public void c(String str) {
        if (b(3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
    }

    public E0 e(Context context) {
        Object next;
        String processName;
        AbstractC3340k.e(context, "context");
        int iMyPid = Process.myPid();
        Iterator it = d(context).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((C0859b0) ((E0) next)).f12525b == iMyPid) {
                break;
            }
        }
        E0 e02 = (E0) next;
        if (e02 != null) {
            return e02;
        }
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 33) {
            processName = Process.myProcessName();
            AbstractC3340k.d(processName, "{\n      Process.myProcessName()\n    }");
        } else if (i5 < 28 || (processName = Application.getProcessName()) == null) {
            processName = "";
        }
        return a(this, processName, iMyPid, 0, 12);
    }

    public void f(String str) {
        if (b(2)) {
            Log.v("FirebaseCrashlytics", str, null);
        }
    }

    public void g(String str, Exception exc) {
        if (b(5)) {
            Log.w("FirebaseCrashlytics", str, exc);
        }
    }
}
