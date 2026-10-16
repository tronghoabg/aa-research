package com.applovin.impl;

import android.content.Intent;
import android.content.IntentFilter;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.SessionTracker;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: com.applovin.impl.g0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1638g0 implements AppLovinBroadcastManager.Receiver {

    /* renamed from: c, reason: collision with root package name */
    private static final Set f21580c = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    private final h7 f21581a;

    /* renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f21582b;

    private C1638g0(long j8, boolean z2, com.applovin.impl.sdk.k kVar, Runnable runnable) {
        this.f21581a = h7.a(j8, z2, kVar, new W9.r(this, z2, runnable, 1));
        this.f21582b = kVar;
        f21580c.add(this);
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
    }

    public long b() {
        return this.f21581a.c();
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        String action = intent.getAction();
        if (SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            this.f21581a.d();
        } else if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            this.f21581a.e();
        }
    }

    public static C1638g0 a(long j8, com.applovin.impl.sdk.k kVar, Runnable runnable) {
        return a(j8, false, kVar, runnable);
    }

    public static C1638g0 a(long j8, boolean z2, com.applovin.impl.sdk.k kVar, Runnable runnable) {
        return new C1638g0(j8, z2, kVar, runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(boolean z2, Runnable runnable) {
        if (!z2) {
            a();
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public void a() {
        this.f21581a.a();
        AppLovinBroadcastManager.unregisterReceiver(this);
        f21580c.remove(this);
    }
}
