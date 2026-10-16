package com.google.android.enterprise.connectedapps;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import defpackage.qde;

/* loaded from: classes2.dex */
public final class CrossProfileConnector_Service extends Service {
    private final qde a = new qde(this);

    @Override // android.app.Service
    public final /* synthetic */ IBinder onBind(Intent intent) {
        return this.a;
    }
}
