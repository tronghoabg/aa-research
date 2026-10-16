package com.google.android.libraries.phenotype.client.stable;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import defpackage.flt;
import defpackage.rgf;
import defpackage.txa;
import defpackage.unj;
import defpackage.vzf;
import defpackage.wae;
import defpackage.wcy;
import defpackage.wub;
import defpackage.zet;
import defpackage.zfb;
import defpackage.zfq;
import defpackage.zgj;
import defpackage.zgl;
import defpackage.zgp;
import java.io.IOException;

/* loaded from: classes3.dex */
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
                        if (string != null && (string.contains("..") || string.contains("/") || string.contains("\\") || string.equals("."))) {
                            Log.w("AccountRemovedRecv", "Got an invalid account name for P/H. Exiting.");
                            return;
                        }
                        if (wae.d()) {
                            return;
                        }
                        wae waeVarA = wae.a(context);
                        if (waeVarA == null) {
                            Log.w("AccountRemovedRecv", "Did not set PhenotypeContext before Account Removed Broadcast. Exiting.");
                            return;
                        }
                        BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
                        zgp[] zgpVarArr = new zgp[2];
                        zgp zgpVarG = string != null ? zfb.g(zgj.v(wcy.b(waeVarA).a(new rgf(string, 11), waeVarA.b())), new vzf(waeVarA, string, 2), waeVarA.b()) : zgl.a;
                        txa txaVar = new txa(18);
                        zfq zfqVar = zfq.a;
                        zgpVarArr[0] = zet.f(zgpVarG, IOException.class, txaVar, zfqVar);
                        zgpVarArr[1] = string != null ? waeVarA.b().submit(new unj(context, string, 13)) : zgl.a;
                        wub.T(zgpVarArr).a(new flt(pendingResultGoAsync, 19), zfqVar);
                    }
                }
            } catch (ClassCastException e) {
                Log.w("AccountRemovedRecv", "Invalid broadcast received: ", e);
            }
        }
    }
}
