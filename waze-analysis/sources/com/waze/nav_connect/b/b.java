package com.waze.nav_connect.b;

import com.waze.navigate.en;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final en f30786a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.nav_connect.a f30787b;

    public b(en enVar, com.waze.nav_connect.a aVar) {
        h.g.b.x.f(enVar, "navigationStateProvider");
        h.g.b.x.f(aVar, "config");
        this.f30786a = enVar;
        this.f30787b = aVar;
    }

    public final d a() {
        return new f(this.f30786a, this.f30787b);
    }
}
