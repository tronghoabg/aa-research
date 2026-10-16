package defpackage;

import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;

/* loaded from: classes.dex */
final class esz extends Handler {
    final /* synthetic */ etb a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public esz(etb etbVar, Looper looper) {
        super(looper);
        this.a = etbVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int size;
        sx[] sxVarArr;
        if (message.what != 1) {
            super.handleMessage(message);
            return;
        }
        etb etbVar = this.a;
        while (true) {
            synchronized (etbVar.b) {
                ArrayList arrayList = etbVar.c;
                size = arrayList.size();
                if (size <= 0) {
                    return;
                }
                sxVarArr = new sx[size];
                arrayList.toArray(sxVarArr);
                arrayList.clear();
            }
            for (int i = 0; i < size; i++) {
                sx sxVar = sxVarArr[i];
                ArrayList arrayList2 = (ArrayList) sxVar.a;
                int size2 = arrayList2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    eta etaVar = (eta) arrayList2.get(i2);
                    if (!etaVar.d) {
                        etaVar.b.onReceive(etbVar.a, (Intent) sxVar.b);
                    }
                }
            }
        }
    }
}
