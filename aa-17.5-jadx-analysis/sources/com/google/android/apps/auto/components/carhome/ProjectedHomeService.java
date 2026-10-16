package com.google.android.apps.auto.components.carhome;

import android.app.IntentService;
import android.content.Intent;
import defpackage.yph;

/* loaded from: classes2.dex */
public class ProjectedHomeService extends IntentService {
    static {
        yph.c("GH.HomeService");
    }

    public ProjectedHomeService() {
        super("ProjectedHomeService");
    }

    @Override // android.app.IntentService
    protected final void onHandleIntent(Intent intent) {
    }
}
