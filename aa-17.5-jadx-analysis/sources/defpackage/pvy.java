package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes2.dex */
final class pvy extends BroadcastReceiver {
    final /* synthetic */ pvz a;

    public pvy(pvz pvzVar) {
        this.a = pvzVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            pvz pvzVar = this.a;
            synchronized (pvzVar) {
                zhc zhcVar = pvzVar.a;
                if (zhcVar == null) {
                    return;
                }
                pwn pwnVarC = pvzVar.c();
                if (pwnVarC != null) {
                    zhcVar.o(pwnVarC);
                } else if (zhcVar.isDone()) {
                    pvzVar.a = null;
                }
            }
        }
    }
}
