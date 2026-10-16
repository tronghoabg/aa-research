package com.waze.sdk;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.Messenger;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class SdkService extends Service {

    /* renamed from: a, reason: collision with root package name */
    private final aj f35174a = new aj(this);

    /* renamed from: b, reason: collision with root package name */
    private final Messenger f35175b = new Messenger(new bj(this));

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.f35174a;
    }
}
