package com.waze;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public class AIDLService extends Service {

    /* renamed from: a, reason: collision with root package name */
    static String f13530a;

    /* renamed from: b, reason: collision with root package name */
    static String f13531b;

    /* renamed from: c, reason: collision with root package name */
    private final cg f13532c = new cg(this);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.f13532c;
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        f13531b = null;
        return true;
    }
}
