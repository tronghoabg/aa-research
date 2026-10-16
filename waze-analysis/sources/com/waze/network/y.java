package com.waze.network;

import android.net.ConnectivityManager;
import kotlinx.coroutines.b.by;
import kotlinx.coroutines.b.bz;
import kotlinx.coroutines.b.ch;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class y implements z {

    /* renamed from: a, reason: collision with root package name */
    private final kotlinx.coroutines.af f32422a;

    /* renamed from: b, reason: collision with root package name */
    private final ConnectivityManager f32423b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f32424c;

    /* renamed from: d, reason: collision with root package name */
    private final ch f32425d;

    public y(kotlinx.coroutines.af afVar, ConnectivityManager connectivityManager, com.waze.shared_infra.i.e eVar) {
        h.g.b.x.f(afVar, "scope");
        h.g.b.x.f(connectivityManager, "connectivityManager");
        h.g.b.x.f(eVar, "logger");
        this.f32422a = afVar;
        this.f32423b = connectivityManager;
        this.f32424c = eVar;
        x xVar = new x(kotlinx.coroutines.b.ai.n(new u(this, null)), this);
        int i2 = bz.f51630a;
        this.f32425d = kotlinx.coroutines.b.ai.V(xVar, afVar, by.b(), null);
    }

    public final ConnectivityManager a() {
        return this.f32423b;
    }

    public final com.waze.shared_infra.i.e b() {
        return this.f32424c;
    }

    @Override // com.waze.network.z
    public final ch c() {
        return this.f32425d;
    }
}
