package com.google.android.libraries.phenotype.client.stable;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class PhenotypeUpdateBackgroundBroadcastReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        final String stringExtra = intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME");
        if (stringExtra != null) {
            if (stringExtra.contains("../") || stringExtra.contains("/..")) {
                Log.w("PhenotypeBackgroundRecv", "Got an invalid config package for P/H that includes '..': " + stringExtra + ". Exiting.");
                return;
            }
            com.google.android.libraries.phenotype.client.h hVarC = com.google.android.libraries.phenotype.client.h.c(context);
            if (hVarC == null) {
                com.google.android.libraries.phenotype.client.h.l();
                com.google.d.b.an.u(false);
                return;
            }
            Map mapB = z.b(context);
            if (mapB.isEmpty()) {
                return;
            }
            z zVar = (z) mapB.get(stringExtra);
            if (zVar != null && zVar.e()) {
                final BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
                final com.google.d.m.a.be beVarC = com.google.d.m.a.be.z(ae.a(hVarC, stringExtra)).B(new an(zVar, stringExtra, hVarC, 0), hVarC.j()).C(TimeUnit.SECONDS, hVarC.j());
                beVarC.addListener(new Runnable() { // from class: com.google.android.libraries.phenotype.client.stable.ao
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.google.d.m.a.be beVar = beVarC;
                        String str = stringExtra;
                        BroadcastReceiver.PendingResult pendingResult = pendingResultGoAsync;
                        try {
                            try {
                                com.google.d.m.a.bd.o(beVar);
                                Log.i("PhenotypeBackgroundRecv", "Successfully updated snapshot for " + str);
                            } catch (ExecutionException e2) {
                                Log.w("PhenotypeBackgroundRecv", "Failed to update local snapshot for " + str, e2);
                            }
                        } finally {
                            pendingResult.finish();
                        }
                    }
                }, hVarC.j());
            } else {
                Log.i("PhenotypeBackgroundRecv", "Skipping " + stringExtra + " which doesn't use ProcessStable flags.");
            }
        }
    }
}
