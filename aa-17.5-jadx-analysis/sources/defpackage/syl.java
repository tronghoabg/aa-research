package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.util.Log;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class syl extends sxt {
    public syl() {
        super(qnl.START_SERVICE, 10L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.sxt
    public final sxy a(sxy sxyVar, xxh xxhVar) {
        if (!xxhVar.f() || ((qnz) xxhVar.b()).b != 10) {
            throw new IllegalArgumentException();
        }
        qnz qnzVar = (qnz) xxhVar.b();
        qnx qnxVar = qnzVar.b == 10 ? (qnx) qnzVar.c : qnx.a;
        Context context = sxyVar.b;
        String packageName = context.getPackageName();
        Intent intent = new Intent().setPackage(packageName);
        if ((qnxVar.b & 1) != 0) {
            intent.setAction(qnxVar.c);
        }
        if ((qnxVar.b & 2) != 0) {
            intent.setComponent(new ComponentName(packageName, qnxVar.d));
        }
        for (int i = 0; i < qnxVar.e.size(); i++) {
            intent.addCategory((String) qnxVar.e.get(i));
        }
        Iterator<E> it = qnxVar.f.iterator();
        while (it.hasNext()) {
            roc.i(intent, (qnr) it.next());
        }
        List<ResolveInfo> listQueryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
            throw new IllegalStateException("No receiver for intent. ".concat(String.valueOf(String.valueOf(intent))));
        }
        Log.i("START_SERVICE_FIX", "Starting service: intent=".concat(String.valueOf(String.valueOf(intent))));
        if (qnxVar.g) {
            context.startForegroundService(intent);
            return sxyVar;
        }
        context.startService(intent);
        return sxyVar;
    }

    @Override // defpackage.sxt
    public final String b() {
        return "START_SERVICE_FIX";
    }
}
