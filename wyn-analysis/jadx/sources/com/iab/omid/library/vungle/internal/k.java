package com.iab.omid.library.vungle.internal;

import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* loaded from: classes4.dex */
public class k {

    /* renamed from: d, reason: collision with root package name */
    private static k f28169d = new k();

    /* renamed from: a, reason: collision with root package name */
    private WeakReference<Context> f28170a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f28171b = false;

    /* renamed from: c, reason: collision with root package name */
    private boolean f28172c = false;

    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            k kVar;
            boolean z2;
            boolean z10;
            if (intent.getAction().equals("android.intent.action.SCREEN_OFF")) {
                kVar = k.this;
                z2 = kVar.f28172c;
                z10 = true;
            } else {
                if (!intent.getAction().equals("android.intent.action.SCREEN_ON")) {
                    return;
                }
                kVar = k.this;
                z2 = kVar.f28172c;
                z10 = false;
            }
            kVar.a(z10, z2);
            k.this.f28171b = z10;
        }
    }

    public static k b() {
        return f28169d;
    }

    public void a() {
        KeyguardManager keyguardManager;
        Context context = this.f28170a.get();
        if (context == null || (keyguardManager = (KeyguardManager) context.getSystemService("keyguard")) == null) {
            return;
        }
        boolean zIsDeviceLocked = keyguardManager.isDeviceLocked();
        a(this.f28171b, zIsDeviceLocked);
        this.f28172c = zIsDeviceLocked;
    }

    public void a(Context context) {
        if (context == null) {
            return;
        }
        this.f28170a = new WeakReference<>(context);
        IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        context.registerReceiver(new a(), intentFilter);
    }

    public void a(boolean z2, boolean z10) {
        if ((z10 || z2) == (this.f28172c || this.f28171b)) {
            return;
        }
        Iterator<com.iab.omid.library.vungle.adsession.a> it = c.c().b().iterator();
        while (it.hasNext()) {
            it.next().d().b(z10 || z2);
        }
    }
}
