package com.google.android.apps.auto.wireless.setup.receiver;

import android.app.ActivityOptions;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.InetAddresses;
import android.os.Build;
import defpackage.mdd;
import defpackage.vky;
import defpackage.ype;
import defpackage.yph;

/* loaded from: classes2.dex */
public class WirelessStartupReceiver extends mdd {
    private static final yph a = yph.c("GH.WSR");

    @Override // defpackage.mdd
    protected final vky a() {
        return new vky("WirelessStartupReceiver");
    }

    @Override // defpackage.mdd
    public final void b(Context context, Intent intent) {
        if (Build.VERSION.SDK_INT < 30) {
            ((ype) ((ype) a.f()).ai((char) 6279)).u("Automatic wireless projection startup is disabled for Q-.");
            return;
        }
        yph yphVar = a;
        ((ype) ((ype) yphVar.f()).ai((char) 6275)).u("Processing intent.");
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(ConnectivityManager.class);
        String stringExtra = intent.getStringExtra("ip_address");
        stringExtra.getClass();
        if (!InetAddresses.isNumericAddress(stringExtra)) {
            ((ype) ((ype) yphVar.h()).ai((char) 6278)).y("Incorrect IP address %s was received. Please send a valid IP address.", stringExtra);
            return;
        }
        int intExtra = intent.getIntExtra("projection_port", -1);
        if (intExtra <= 0 || intExtra > 65535) {
            ((ype) ((ype) yphVar.h()).ai((char) 6276)).w("Incorrect projection port %d was received. Please send a valid value.", intExtra);
            return;
        }
        Intent component = new Intent().setComponent(new ComponentName(context, "com.google.android.apps.auto.wireless.setup.service.impl.WirelessStartupActivity"));
        component.addFlags(268435456).putExtra("PARAM_HOST_ADDRESS", stringExtra).putExtra("PARAM_SERVICE_PORT", intExtra).putExtra("PARAM_SERVICE_WIFI_NETWORK", connectivityManager.getActiveNetwork()).putExtra("WIFI_Q_ENABLED", true);
        ((ype) ((ype) yphVar.f()).ai((char) 6277)).u("Starting wireless startup activity.");
        context.startActivity(component, ActivityOptions.makeBasic().setLaunchDisplayId(0).toBundle());
    }
}
