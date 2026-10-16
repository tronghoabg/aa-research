package com.google.android.apps.auto.components.crossprofile;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import defpackage.ype;
import defpackage.yph;

/* loaded from: classes2.dex */
public class CrossProfilePermissionFlowTrampolineActivity extends Activity {
    private static final yph a = yph.c("GH.CPPermFlowTrampAct");

    @Override // android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        ((ype) ((ype) a.f()).ai((char) 3451)).y("CrossProfilePermissionFlowTrampolineActivity handling intent: %s", intent);
        CrossProfileNotificationPromptManager.a();
        CrossProfileNotificationPromptManager.b(this, intent);
    }
}
