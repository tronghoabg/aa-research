package com.google.android.apps.auto.carservice.frx;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.SystemClock;
import defpackage.acvh;
import defpackage.fyz;
import defpackage.jkz;
import defpackage.luk;
import defpackage.mdd;
import defpackage.vky;
import defpackage.ype;
import defpackage.yph;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class FrxReceiver extends mdd {
    private static final yph a = yph.c("CAR.FrxReceiver");

    @Override // defpackage.mdd
    protected final vky a() {
        return new vky("FrxReceiver");
    }

    @Override // defpackage.mdd
    public final void b(Context context, Intent intent) {
        if (Build.VERSION.SDK_INT < 30) {
            ((ype) a.l().ai((char) 2351)).u("Aborting on Q- device.");
            return;
        }
        intent.getClass();
        SharedPreferences sharedPreferences = context.getSharedPreferences("frx_cookie", 0);
        String action = intent.getAction();
        action.getClass();
        int iHashCode = action.hashCode();
        if (iHashCode != 798292259) {
            if (iHashCode == 1737074039 && action.equals("android.intent.action.MY_PACKAGE_REPLACED")) {
                long jElapsedRealtime = SystemClock.elapsedRealtime() - sharedPreferences.getLong("ELAPSED_REALTIME", Long.MAX_VALUE);
                if (jElapsedRealtime >= 0) {
                    TimeUnit timeUnit = TimeUnit.MINUTES;
                    if (jElapsedRealtime < 300000) {
                        int i = sharedPreferences.getInt("CONNECTION_TYPE", -1);
                        yph yphVar = a;
                        ((ype) yphVar.l().ai(2353)).w("Package replaced, from Gearhead FRX, connType: %s: ", i);
                        fyz.g(sharedPreferences);
                        if (i == 1) {
                            jkz jkzVar = new jkz();
                            jkzVar.a = i;
                            jkzVar.b = 0;
                            jkzVar.c = new Intent();
                            jkzVar.d = true;
                            jkzVar.a(context);
                            return;
                        }
                        if (i != 2) {
                            ((ype) ((ype) yphVar.h()).ai((char) 2354)).u("Ignoring unsupported connection");
                            return;
                        }
                        Intent intent2 = new Intent();
                        intent2.setFlags(268435456);
                        intent2.setClassName(context, acvh.m());
                        context.startActivity(intent2, luk.c());
                        return;
                    }
                }
                ((ype) a.l().ai((char) 2355)).u("Package replaced, not from Gearhead FRX.");
                return;
            }
        } else if (action.equals("android.intent.action.BOOT_COMPLETED")) {
            ((ype) a.l().ai((char) 2352)).u("Fresh boot, clearing cookie");
            fyz.g(sharedPreferences);
            return;
        }
        ((ype) ((ype) a.h()).ai((char) 2350)).y("Unknown action: %s", intent.getAction());
    }
}
