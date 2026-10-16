package com.google.android.gearhead.telemetry;

import android.content.Context;
import android.content.Intent;
import defpackage.ebf;
import defpackage.qkz;
import defpackage.yyv;
import defpackage.yzy;
import defpackage.yzz;

/* loaded from: classes2.dex */
public class InstallReferrerReceiver extends qkz {
    @Override // defpackage.qkz, android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        super.onReceive(context, intent);
        String stringExtra = intent.getStringExtra("referrer");
        if (stringExtra == null) {
            stringExtra = "NO_REFERRER_PROVIDED";
        }
        ebf.j().A(yyv.INSTALL, stringExtra);
        if (stringExtra.contains("settings_google_services_discoveraa")) {
            ebf.j().o(yzz.SETTINGS_AA_GOOGLE_SETTINGS, yzy.cx);
        }
    }
}
