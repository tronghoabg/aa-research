package com.google.android.gms.common.api.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ak extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    Context f4750a;

    /* renamed from: b, reason: collision with root package name */
    private final aj f4751b;

    public ak(aj ajVar) {
        this.f4751b = ajVar;
    }

    public final void a(Context context) {
        this.f4750a = context;
    }

    public final synchronized void b() {
        Context context = this.f4750a;
        if (context != null) {
            context.unregisterReceiver(this);
        }
        this.f4750a = null;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            this.f4751b.a();
            b();
        }
    }
}
