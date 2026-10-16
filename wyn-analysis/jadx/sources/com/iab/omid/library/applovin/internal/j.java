package com.iab.omid.library.applovin.internal;

import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* loaded from: classes4.dex */
public class j {

    /* renamed from: d, reason: collision with root package name */
    private static j f27884d = new j();

    /* renamed from: a, reason: collision with root package name */
    private WeakReference<Context> f27885a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f27886b = false;

    /* renamed from: c, reason: collision with root package name */
    private boolean f27887c = false;

    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            j jVar;
            boolean z2;
            boolean z10;
            if (intent.getAction().equals("android.intent.action.SCREEN_OFF")) {
                jVar = j.this;
                z2 = jVar.f27887c;
                z10 = true;
            } else {
                if (!intent.getAction().equals("android.intent.action.SCREEN_ON")) {
                    return;
                }
                jVar = j.this;
                z2 = jVar.f27887c;
                z10 = false;
            }
            jVar.a(z10, z2);
            j.this.f27886b = z10;
        }
    }

    public static j b() {
        return f27884d;
    }

    public void a() {
        Context context = this.f27885a.get();
        if (context == null) {
            return;
        }
        boolean zIsDeviceLocked = ((KeyguardManager) context.getSystemService("keyguard")).isDeviceLocked();
        a(this.f27886b, zIsDeviceLocked);
        this.f27887c = zIsDeviceLocked;
    }

    public void a(Context context) {
        if (context == null) {
            return;
        }
        this.f27885a = new WeakReference<>(context);
        IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        context.registerReceiver(new a(), intentFilter);
    }

    public void a(boolean z2, boolean z10) {
        if ((z10 || z2) == (this.f27887c || this.f27886b)) {
            return;
        }
        Iterator<com.iab.omid.library.applovin.adsession.a> it = c.c().b().iterator();
        while (it.hasNext()) {
            it.next().d().b(z10 || z2);
        }
    }
}
