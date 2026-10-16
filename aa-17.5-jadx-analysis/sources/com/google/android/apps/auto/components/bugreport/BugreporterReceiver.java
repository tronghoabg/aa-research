package com.google.android.apps.auto.components.bugreport;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;
import defpackage.mdd;
import defpackage.obs;
import defpackage.vky;
import defpackage.ype;
import defpackage.yph;
import j$.util.Objects;

/* loaded from: classes2.dex */
public final class BugreporterReceiver extends mdd {
    private static final yph b = yph.c("GH.BugreporterReceiver");
    public static final ComponentName a = new ComponentName("com.google.android.projection.gearhead", "com.google.android.apps.auto.components.bugreport.BugreporterReceiver");

    public static class ShowToastReceiver extends mdd {
        @Override // defpackage.mdd
        protected final vky a() {
            return new vky("BugreportReceiver$ShowToastReceiver");
        }

        @Override // defpackage.mdd
        public final void b(Context context, Intent intent) {
            int intExtra = intent.getIntExtra("EXTRA_BUGREPORT_REQUEST_STATUS_MESSAGE", -1);
            obs.a().c(context, BugreporterReceiver.a, intExtra, 0);
            Toast.makeText(context, intExtra, 0).show();
        }
    }

    public static Intent c(String str, String str2) {
        ((ype) b.l().ai((char) 3052)).u("Creating intent to request a bug report");
        f(str);
        Intent intentAddFlags = new Intent("android.intent.action.BUG_REPORT").setComponent(a).putExtra("EXTRA_ORIGIN", str).addFlags(268435456);
        if (str2 != null && !str2.isEmpty()) {
            intentAddFlags.putExtra("EXTRA_TITLE", str2);
        }
        return intentAddFlags;
    }

    public static Intent d() {
        ((ype) b.l().ai((char) 3053)).u("Creating intent to request a screenshot");
        return new Intent("com.google.android.projection.gearhead.SCREENSHOT").setComponent(a).addFlags(268435456);
    }

    private static void f(String str) {
        Objects.checkIndex(0, 6);
        if (str == null) {
            ((ype) b.l().ai((char) 3060)).u("Origin: Null");
            return;
        }
        if (str.equals("ORIGIN_LONG_PRESS")) {
            ((ype) b.l().ai((char) 3061)).u("Origin: Long press");
            return;
        }
        if (str.equals("ORIGIN_SETTINGS")) {
            ((ype) b.l().ai((char) 3062)).u("Origin: Settings");
            return;
        }
        if (str.equals("ORIGIN_NOTIFICATION")) {
            ((ype) b.l().ai((char) 3063)).u("Origin: Notification");
            return;
        }
        if (str.equals("ORIGIN_CRASH")) {
            ((ype) b.l().ai((char) 3064)).u("Origin: Crash");
        } else if (str.equals("ORIGIN_HU")) {
            ((ype) b.l().ai((char) 3065)).u("Origin: HU");
        } else {
            ((ype) b.l().ai((char) 3059)).u("Origin: Unknown");
        }
    }

    @Override // defpackage.mdd
    protected final vky a() {
        return new vky("BugreporterReceiver");
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x018a  */
    @Override // defpackage.mdd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(android.content.Context r25, android.content.Intent r26) {
        /*
            Method dump skipped, instructions count: 570
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.auto.components.bugreport.BugreporterReceiver.b(android.content.Context, android.content.Intent):void");
    }
}
