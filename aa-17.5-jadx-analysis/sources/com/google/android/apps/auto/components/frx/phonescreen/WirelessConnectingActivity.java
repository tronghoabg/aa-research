package com.google.android.apps.auto.components.frx.phonescreen;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import defpackage.leu;
import defpackage.lex;
import defpackage.yph;
import defpackage.yzy;
import defpackage.yzz;

/* loaded from: classes2.dex */
public class WirelessConnectingActivity extends lex {
    final leu n = new leu();

    static {
        yph.c("GH.WifiPreflight");
    }

    @Override // defpackage.lex
    protected final IntentFilter C() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.apps.auto.components.frx.phonescreen.WirelessFrxPhonescreenBottomSheetActivity.CLOSE");
        intentFilter.addAction("com.google.android.apps.auto.components.frx.phonescreen.WirelessConnectingActivity.CLOSE");
        return intentFilter;
    }

    @Override // defpackage.lex, defpackage.ler, defpackage.bc, defpackage.ob, defpackage.cs, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (a().f("wireless_connecting_dialog") == null) {
            this.n.f(a(), "wireless_connecting_dialog");
        }
        D(yzz.FRX_WIRELESS_CONNECTING_ACTIVITY, yzy.f);
        if (Build.VERSION.SDK_INT < 29) {
            Intent intent = new Intent("com.google.android.projection.gearhead.RESCAN_AFTER_WELCOME_DOWNLOAD");
            intent.setPackage("com.google.android.projection.gearhead");
            sendBroadcast(intent);
        }
    }
}
