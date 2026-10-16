package com.waze.app_nav.b;

import android.os.Bundle;
import android.support.v4.app.bv;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final bv f15195a;

    /* renamed from: b, reason: collision with root package name */
    private final long f15196b;

    public c(bv bvVar, long j2) {
        x.f(bvVar, "fragmentManager");
        this.f15195a = bvVar;
        this.f15196b = j2;
    }

    private final void c(a aVar, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        b bVar = new b(this.f15196b, aVar, bundle);
        x.f(bundle2, "<this>");
        x.f(bVar, "request");
        bundle2.putLong("app_nav_fragment_destination_id", bVar.a());
        bundle2.putSerializable("app_nav_action", bVar.c());
        bundle2.putBundle("app_nav_result", bVar.b());
        this.f15195a.aD("app_nav_request", bundle2);
    }

    public final void a() {
        c(a.f15189b, null);
    }

    public final void b(Bundle bundle) {
        c(a.f15190c, bundle);
    }
}
