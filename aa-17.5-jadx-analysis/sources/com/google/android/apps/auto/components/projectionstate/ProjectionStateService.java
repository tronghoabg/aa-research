package com.google.android.apps.auto.components.projectionstate;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import defpackage.mhy;
import defpackage.mia;

/* loaded from: classes.dex */
public class ProjectionStateService extends Service {
    public static volatile mhy a;
    private final IBinder b = new mia();

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.b;
    }
}
