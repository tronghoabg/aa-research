package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.util.Log;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class syj extends sxt {
    public syj() {
        super(qnl.SEND_BROADCAST, 10L);
    }

    @Override // defpackage.sxt
    public final sxy a(sxy sxyVar, xxh xxhVar) {
        if (!xxhVar.f() || ((qnz) xxhVar.b()).b != 3) {
            throw new IllegalArgumentException();
        }
        qnz qnzVar = (qnz) xxhVar.b();
        qnv qnvVar = qnzVar.b == 3 ? (qnv) qnzVar.c : qnv.a;
        Context context = sxyVar.b;
        String packageName = context.getPackageName();
        Intent intent = new Intent().setPackage(packageName);
        if ((qnvVar.b & 1) != 0) {
            intent.setAction(qnvVar.c);
        }
        if ((qnvVar.b & 2) != 0) {
            intent.setComponent(new ComponentName(packageName, qnvVar.d));
        }
        if ((qnvVar.b & 4) != 0) {
            intent.setData(Uri.parse(qnvVar.e));
        }
        Iterator<E> it = qnvVar.f.iterator();
        while (it.hasNext()) {
            roc.i(intent, (qnr) it.next());
        }
        List<ResolveInfo> listQueryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
        if (listQueryBroadcastReceivers == null || listQueryBroadcastReceivers.isEmpty()) {
            throw new IllegalStateException("No receiver for intent. ".concat(String.valueOf(String.valueOf(intent))));
        }
        Log.d("SEND_BROADCAST_FIX", "Broadcasting: intent=".concat(String.valueOf(String.valueOf(intent))));
        context.sendBroadcast(intent);
        return sxyVar;
    }

    @Override // defpackage.sxt
    public final String b() {
        return "SEND_BROADCAST_FIX";
    }
}
