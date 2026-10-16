package com.waze.at;

import android.os.Bundle;
import com.waze.app_nav.l;
import com.waze.at.b.d;
import com.waze.shared_infra.r.p;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class b implements l {

    /* renamed from: a, reason: collision with root package name */
    private p f15656a = p.f37983a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f15657b;

    public final com.waze.app_nav.p a() {
        Bundle bundle = new Bundle();
        bundle.putString("appType", this.f15656a.name());
        bundle.putBoolean("isLoggedInCurrentSession", this.f15657b);
        return new com.waze.app_nav.p(d.class, bundle, 4);
    }

    public final void b(p pVar) {
        x.f(pVar, "<set-?>");
        this.f15656a = pVar;
    }

    public final void c(boolean z) {
        this.f15657b = z;
    }
}
