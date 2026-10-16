package com.google.android.gearhead.vanagon;

import android.app.Activity;
import android.os.Bundle;
import defpackage.ype;
import defpackage.yph;

/* loaded from: classes2.dex */
public class VnLaunchPadInternalActivity extends Activity {
    private static final yph a = yph.c("GH.VnLaunchPadActivity");

    @Override // android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((ype) a.l().ai((char) 7499)).u("Launch pad is deprecated, do nothing.");
        finish();
    }
}
