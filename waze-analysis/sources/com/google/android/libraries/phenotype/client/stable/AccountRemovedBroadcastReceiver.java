package com.google.android.libraries.phenotype.client.stable;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.d.m.a.bm;
import com.google.d.m.a.cf;
import java.io.IOException;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class AccountRemovedBroadcastReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.accounts.action.ACCOUNT_REMOVED".equals(intent.getAction())) {
            try {
                String stringExtra = intent.getStringExtra("accountType");
                if (stringExtra != null) {
                    if ("com.google".equals(stringExtra) || "com.google.work".equals(stringExtra) || "cn.google".equals(stringExtra) || "__logged_out_type".equals(stringExtra)) {
                        Bundle extras = intent.getExtras();
                        String string = extras != null ? extras.getString("authAccount") : null;
                        if (string != null && (string.contains("../") || string.contains("/.."))) {
                            Log.w("AccountRemovedRecv", "Got an invalid account name for P/H that includes '..'. Exiting.");
                            return;
                        }
                        com.google.android.libraries.phenotype.client.h.l();
                        com.google.android.libraries.phenotype.client.h hVarC = com.google.android.libraries.phenotype.client.h.c(context);
                        if (hVarC == null) {
                            Log.w("AccountRemovedRecv", "Did not set PhenotypeContext before Account Removed Broadcast. Exiting.");
                            return;
                        }
                        BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
                        bm[] bmVarArr = new bm[2];
                        bmVarArr[0] = com.google.d.m.a.bd.d(string != null ? ae.c(hVarC, string) : com.google.d.m.a.bd.i(), IOException.class, new l(1), cf.y());
                        bmVarArr[1] = string != null ? hVarC.j().submit(new x(context, string, 1)) : com.google.d.m.a.bd.i();
                        com.google.d.m.a.bd.b(bmVarArr).a(new com.google.firebase.appcheck.playintegrity.a.c(pendingResultGoAsync, 1), cf.y());
                    }
                }
            } catch (ClassCastException e2) {
                Log.w("AccountRemovedRecv", "Invalid broadcast received: ", e2);
            }
        }
    }
}
