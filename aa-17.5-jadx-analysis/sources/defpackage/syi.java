package defpackage;

import android.app.ActivityManager;
import android.os.Process;
import android.util.Log;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class syi extends sxt {
    public syi() {
        super(qnl.PROCESS_RESTART, 60L);
    }

    @Override // defpackage.sxt
    public final sxy a(sxy sxyVar, xxh xxhVar) {
        xxh xxhVarH;
        if (!xxhVar.f() || ((qnz) xxhVar.b()).b != 5) {
            throw new IllegalArgumentException("Required ProcessRestartFixConfig missing.");
        }
        qnz qnzVar = (qnz) xxhVar.b();
        qnu qnuVar = qnzVar.b == 5 ? (qnu) qnzVar.c : qnu.a;
        if (qnuVar.b == 1 && ((Boolean) qnuVar.c).booleanValue()) {
            sxx sxxVar = new sxx(sxyVar);
            sxxVar.c();
            return sxxVar.a();
        }
        qnz qnzVar2 = (qnz) xxhVar.b();
        qnu qnuVar2 = qnzVar2.b == 5 ? (qnu) qnzVar2.c : qnu.a;
        String str = qnuVar2.b == 2 ? (String) qnuVar2.c : "";
        ActivityManager activityManager = (ActivityManager) sxyVar.b.getSystemService("activity");
        if (activityManager == null) {
            throw new IllegalStateException("ActivityManager is null!");
        }
        Iterator<ActivityManager.RunningAppProcessInfo> it = activityManager.getRunningAppProcesses().iterator();
        while (true) {
            if (!it.hasNext()) {
                xxhVarH = xvy.a;
                break;
            }
            ActivityManager.RunningAppProcessInfo next = it.next();
            if (next.processName.equals(str)) {
                xxhVarH = xxh.h(Integer.valueOf(next.pid));
                break;
            }
        }
        if (!xxhVarH.f()) {
            Log.d("ProcessRestartFix", String.format("Process '%s' is not currently running.", str));
            return sxyVar;
        }
        Integer num = (Integer) xxhVarH.b();
        int iIntValue = num.intValue();
        Log.i("ProcessRestartFix", String.format("Killing '%s' pid=%d", str, num));
        if (iIntValue == Process.myPid()) {
            sxx sxxVar2 = new sxx(sxyVar);
            sxxVar2.h = true;
            return sxxVar2.a();
        }
        Process.killProcess(iIntValue);
        sxx sxxVar3 = new sxx(sxyVar);
        sxxVar3.h = false;
        return sxxVar3.a();
    }

    @Override // defpackage.sxt
    public final String b() {
        return "ProcessRestartFix";
    }
}
