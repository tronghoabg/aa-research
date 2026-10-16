package com.waze.network;

import android.net.LinkProperties;
import android.net.NetworkCapabilities;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class s {

    /* renamed from: a, reason: collision with root package name */
    private final NetworkCapabilities f32408a;

    /* renamed from: b, reason: collision with root package name */
    private final LinkProperties f32409b;

    public s(NetworkCapabilities networkCapabilities, LinkProperties linkProperties) {
        h.g.b.x.f(networkCapabilities, "capabilities");
        this.f32408a = networkCapabilities;
        this.f32409b = linkProperties;
    }

    public final LinkProperties a() {
        return this.f32409b;
    }

    public final NetworkCapabilities b() {
        return this.f32408a;
    }
}
