package com.google.android.apps.auto.components.firstdrive;

import android.app.PendingIntent;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import defpackage.acqs;
import defpackage.ebf;
import defpackage.jqw;
import defpackage.ldx;
import defpackage.lhg;
import defpackage.mdd;
import defpackage.mkh;
import defpackage.mki;
import defpackage.ohv;
import defpackage.olm;
import defpackage.rrc;
import defpackage.vky;
import defpackage.wdu;
import defpackage.yfq;
import defpackage.ype;
import defpackage.yph;
import defpackage.yxc;
import defpackage.yxy;
import defpackage.yzy;
import defpackage.yzz;

/* loaded from: classes.dex */
public final class FirstDriveNotificationManager implements lhg {
    public static final yph a = yph.c("GH.FirstDrive");
    final ohv b = new ldx();
    public boolean c;

    /* loaded from: classes2.dex */
    public static class Receiver extends mdd {
        @Override // defpackage.mdd
        protected final vky a() {
            return new vky("FirstDriveNotificationManager.Receiver");
        }

        @Override // defpackage.mdd
        public final void b(Context context, Intent intent) {
            yph yphVar = FirstDriveNotificationManager.a;
            ((ype) ((ype) yphVar.f()).ai((char) 3802)).y("Handling FDC notification intent. action=%s", intent.getAction());
            FirstDriveNotificationManager.a();
            String action = intent.getAction();
            action.getClass();
            int iHashCode = action.hashCode();
            if (iHashCode != -1834783951) {
                if (iHashCode == -1746781228 && action.equals("ACTION_DELETE")) {
                    ((ype) ((ype) yphVar.f()).ai((char) 3805)).u("FDC notification dismissed");
                    FirstDriveNotificationManager.b(yzy.BP);
                    return;
                }
            } else if (action.equals("ACTION_ACCEPT")) {
                ((ype) ((ype) yphVar.f()).ai((char) 3804)).u("FDC notification accepted");
                FirstDriveNotificationManager.b(yzy.BO);
                ((ype) ((ype) yphVar.f()).ai((char) 3806)).u("Clickthrough");
                context.startActivity(new Intent("android.intent.action.VIEW").setData(Uri.parse(acqs.c())).setFlags(268435456));
                return;
            }
            throw new IllegalArgumentException(String.format("Unknown action: %s", action));
        }
    }

    public static FirstDriveNotificationManager a() {
        return (FirstDriveNotificationManager) mki.a.c(FirstDriveNotificationManager.class, yfq.q(mkh.b), new jqw(19));
    }

    public static final void b(yzy yzyVar) {
        ebf.j().F((rrc) rrc.h(yxy.GEARHEAD, yzz.FIRST_DRIVE, yzyVar).l());
    }

    public static final PendingIntent e(Context context) {
        Intent intent = new Intent(mki.a.c, (Class<?>) Receiver.class);
        intent.setAction("ACTION_ACCEPT");
        ClipData clipData = wdu.a;
        return wdu.c(context, 0, intent, 201326592);
    }

    @Override // defpackage.lhg
    public final void c() {
        if (acqs.d()) {
            olm.d().d(this.b, yfq.q(yxc.NON_UI));
        }
    }

    @Override // defpackage.lhg
    public final void d() {
        olm.d().f(this.b);
    }
}
