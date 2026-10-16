package com.waze.as;

import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import androidx.core.content.ContextCompat;
import com.waze.shared_infra.i.e;
import h.g.b.x;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.ck;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class c implements a {

    /* renamed from: a, reason: collision with root package name */
    private final Context f15476a;

    /* renamed from: b, reason: collision with root package name */
    private final e f15477b;

    /* renamed from: c, reason: collision with root package name */
    private final bn f15478c;

    /* renamed from: d, reason: collision with root package name */
    private final KeyguardManager f15479d;

    /* renamed from: e, reason: collision with root package name */
    private final ch f15480e;

    /* renamed from: f, reason: collision with root package name */
    private BroadcastReceiver f15481f;

    public c(Context context, d dVar, e eVar) {
        x.f(context, "applicationContext");
        x.f(dVar, "config");
        x.f(eVar, "logger");
        this.f15476a = context;
        this.f15477b = eVar;
        bn bnVarB = ck.b(com.waze.ui.r.a.e.b.a.f43360b);
        this.f15478c = bnVarB;
        this.f15479d = (KeyguardManager) ContextCompat.getSystemService(context, KeyguardManager.class);
        this.f15480e = ai.U(bnVarB);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.waze.ui.r.a.e.b.a f() {
        KeyguardManager keyguardManager = this.f15479d;
        return keyguardManager == null ? com.waze.ui.r.a.e.b.a.f43361c : keyguardManager.isDeviceLocked() ? com.waze.ui.r.a.e.b.a.f43359a : com.waze.ui.r.a.e.b.a.f43360b;
    }

    @Override // com.waze.as.a
    public final ch a() {
        return this.f15480e;
    }

    @Override // com.waze.as.a
    public final void b() {
        c();
        this.f15478c.e(f());
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        b bVar = new b(this);
        this.f15481f = bVar;
        this.f15477b.a("registered broadcastReceiver with identity: " + System.identityHashCode(bVar));
        this.f15476a.registerReceiver(this.f15481f, intentFilter);
    }

    @Override // com.waze.as.a
    public final void c() {
        this.f15477b.a("trying to unregister broadcastReceiver with identity: " + System.identityHashCode(this.f15481f));
        BroadcastReceiver broadcastReceiver = this.f15481f;
        if (broadcastReceiver != null) {
            this.f15476a.unregisterReceiver(broadcastReceiver);
        }
        this.f15481f = null;
    }
}
