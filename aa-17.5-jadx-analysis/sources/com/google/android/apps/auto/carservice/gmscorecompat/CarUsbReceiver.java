package com.google.android.apps.auto.carservice.gmscorecompat;

import android.content.Context;
import android.content.Intent;
import android.os.UserManager;
import defpackage.inl;
import defpackage.mdd;
import defpackage.nsy;
import defpackage.sgf;
import defpackage.thg;
import defpackage.vky;
import defpackage.ype;
import defpackage.yph;

/* loaded from: classes2.dex */
public class CarUsbReceiver extends mdd {
    public static final /* synthetic */ int a = 0;
    private static final yph b = yph.c("CAR.CarUsbRcvr");

    @Override // defpackage.mdd
    protected final vky a() {
        return new vky("CarUsbReceiver");
    }

    @Override // defpackage.mdd
    public final void b(Context context, Intent intent) {
        if (!c(intent) || new nsy(context).j()) {
            return;
        }
        if (thg.l((UserManager) context.getSystemService(UserManager.class))) {
            ((ype) b.l().ai((char) 2392)).y("Broadcast receiver %s detected for private profile user", getClass());
        } else {
            sgf.b(context, intent, new inl(context, 3), false);
        }
    }

    protected boolean c(Intent intent) {
        return sgf.e(intent);
    }
}
