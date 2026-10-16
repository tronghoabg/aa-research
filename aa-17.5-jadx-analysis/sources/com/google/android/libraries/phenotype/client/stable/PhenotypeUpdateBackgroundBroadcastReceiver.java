package com.google.android.libraries.phenotype.client.stable;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import defpackage.a;
import defpackage.pwg;
import defpackage.rgf;
import defpackage.wae;
import defpackage.wcw;
import defpackage.wcy;
import defpackage.woy;
import defpackage.zfb;
import defpackage.zgj;
import defpackage.zhp;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class PhenotypeUpdateBackgroundBroadcastReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        final String stringExtra = intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME");
        if (stringExtra != null) {
            if (stringExtra.contains("../") || stringExtra.contains("/..")) {
                Log.w("PhenotypeBackgroundRecv", a.bq(stringExtra, "Got an invalid config package for P/H that includes '..': ", ". Exiting."));
                return;
            }
            wae waeVarA = wae.a(context);
            if (waeVarA == null) {
                woy.Z(wae.d());
                return;
            }
            Map mapA = wcw.a(context);
            if (mapA.isEmpty()) {
                return;
            }
            wcw wcwVar = (wcw) mapA.get(stringExtra);
            if (wcwVar == null || !wcwVar.b.equals(zhp.FILE)) {
                Log.i("PhenotypeBackgroundRecv", a.bq(stringExtra, "Skipping ", " which doesn't use ProcessStable flags."));
                return;
            }
            final BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
            final zgj zgjVarX = ((zgj) zfb.g(zgj.v(zgj.v(wcy.b(waeVarA).c()).w(new rgf(stringExtra, 12), waeVarA.b())), new pwg(wcwVar, stringExtra, waeVarA, 2), waeVarA.b())).x(25L, TimeUnit.SECONDS, waeVarA.b());
            zgjVarX.c(new Runnable() { // from class: wde
                @Override // java.lang.Runnable
                public final void run() {
                    zgj zgjVar = zgjVarX;
                    String str = stringExtra;
                    BroadcastReceiver.PendingResult pendingResult = pendingResultGoAsync;
                    try {
                        try {
                            wub.af(zgjVar);
                            Log.i("PhenotypeBackgroundRecv", a.bz(str, "Successfully updated snapshot for "));
                        } catch (ExecutionException e) {
                            Log.w("PhenotypeBackgroundRecv", a.bz(str, "Failed to update local snapshot for "), e);
                        }
                    } finally {
                        pendingResult.finish();
                    }
                }
            }, waeVarA.b());
        }
    }
}
