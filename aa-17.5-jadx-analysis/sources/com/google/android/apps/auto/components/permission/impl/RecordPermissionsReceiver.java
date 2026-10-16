package com.google.android.apps.auto.components.permission.impl;

import android.content.Context;
import android.content.Intent;
import defpackage.mdd;
import defpackage.mdh;
import defpackage.vky;
import defpackage.yfq;
import defpackage.ype;
import defpackage.yph;

/* loaded from: classes2.dex */
public class RecordPermissionsReceiver extends mdd {
    private static final yph a = yph.c("GH.RecordPermissions");
    private static final yfq b = yfq.r("android.intent.action.BOOT_COMPLETED", "android.intent.action.MY_PACKAGE_REPLACED");

    @Override // defpackage.mdd
    protected final vky a() {
        return new vky("RecordPermissionsReceiver");
    }

    @Override // defpackage.mdd
    public final void b(Context context, Intent intent) {
        String action = intent.getAction();
        if (action == null || !b.contains(action)) {
            return;
        }
        ((ype) ((ype) a.f()).ai((char) 4800)).u("Handling on-boot permission operations");
        mdh.d().a();
        mdh.d().b();
    }
}
