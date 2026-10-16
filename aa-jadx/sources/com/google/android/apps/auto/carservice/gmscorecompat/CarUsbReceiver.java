package com.google.android.apps.auto.carservice.gmscorecompat;

/* JADX INFO: loaded from: classes2.dex */
public class CarUsbReceiver extends defpackage.mdl {
    public static final /* synthetic */ int a = 0;
    private static final defpackage.yqm b = defpackage.yqm.c("CAR.CarUsbRcvr");

    @Override // defpackage.mdl
    protected final defpackage.vlu a() {
        return new defpackage.vlu("CarUsbReceiver");
    }

    @Override // defpackage.mdl
    public final void b(android.content.Context context, android.content.Intent intent) {
        if (!c(intent) || new defpackage.npc(context).e()) {
            return;
        }
        if (defpackage.rox.k((android.os.UserManager) context.getSystemService(android.os.UserManager.class))) {
            ((defpackage.yqj) b.l().ai((char) 2393)).y("Broadcast receiver %s detected for private profile user", getClass());
        } else {
            defpackage.shb.b(context, intent, new defpackage.inr(context, 3), false);
        }
    }

    protected boolean c(android.content.Intent intent) {
        return defpackage.shb.e(intent);
    }
}
