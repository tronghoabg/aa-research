package com.google.android.gearhead.vanagon;

import android.app.Activity;
import android.os.Bundle;
import defpackage.ype;
import defpackage.yph;

/* loaded from: classes2.dex */
public class VnDrivingModeLauncherActivity extends Activity {
    private static final yph a = yph.c("GH.VnDrivingModeLaunchr");

    @Override // android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((ype) ((ype) a.h()).ai((char) 7498)).u("Received Driving Mode intent, but Vanagon is deprecated");
        finish();
    }
}
