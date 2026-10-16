package com.google.android.apps.auto.carservice.gmscorecompat;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import defpackage.mdd;
import defpackage.vky;
import defpackage.ype;
import defpackage.yph;

/* loaded from: classes2.dex */
public class ComponentInitReceiver extends mdd {
    private static final yph a = yph.c("CAR.ComponentInitRcvr");

    private static void c(Context context, ComponentName componentName, boolean z) {
        ((ype) ((ype) a.f()).ai(2404)).M("Setting %s in Gearhead to: %s", componentName, true != z ? "disabled" : "enabled");
        context.getPackageManager().setComponentEnabledSetting(componentName, true != z ? 2 : 1, 1);
    }

    private static final boolean d(boolean z) {
        if (z) {
            ((ype) ((ype) a.d()).ai((char) 2395)).u("getDesiredCarUsbReceiverEnabledState: Receiver executing under work profile");
            return false;
        }
        if (Build.VERSION.SDK_INT < 30) {
            ((ype) ((ype) a.d()).ai((char) 2394)).u("getDesiredCarUsbReceiverEnabledState: Android is Q or below.");
            return false;
        }
        ((ype) ((ype) a.d()).ai((char) 2393)).u("getDesiredCarUsbReceiverEnabledState: Android is R+.");
        return true;
    }

    @Override // defpackage.mdd
    protected final vky a() {
        return new vky("ComponentInitReceiver");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ae  */
    @Override // defpackage.mdd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(android.content.Context r8, android.content.Intent r9) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.auto.carservice.gmscorecompat.ComponentInitReceiver.b(android.content.Context, android.content.Intent):void");
    }
}
