package com.moloco.sdk.internal.services;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: com.moloco.sdk.internal.services.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1940c {

    /* renamed from: a, reason: collision with root package name */
    public final Context f29575a;

    /* renamed from: b, reason: collision with root package name */
    public final v f29576b;

    public C1940c(Context context, v deviceInfoService) {
        AbstractC3340k.e(deviceInfoService, "deviceInfoService");
        this.f29575a = context;
        this.f29576b = deviceInfoService;
    }

    public final Ba.c a() {
        NetworkCapabilities networkCapabilities;
        Object systemService = this.f29575a.getSystemService("connectivity");
        AbstractC3340k.c(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
        Network activeNetwork = connectivityManager.getActiveNetwork();
        C1938b c1938b = C1938b.f29407j;
        if (activeNetwork != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork())) != null) {
            if (networkCapabilities.hasTransport(1)) {
                return C1938b.k;
            }
            if (networkCapabilities.hasTransport(0)) {
                return new C1937a(this.f29576b.a().f29388g);
            }
        }
        return c1938b;
    }
}
