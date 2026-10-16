package com.waze.reports_v2;

import android.os.Bundle;
import com.waze.app_nav.p;
import com.waze.reports_v2.c.dj;
import com.waze.reports_v2.presentation.bw;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class i implements com.waze.app_nav.l {

    /* renamed from: a, reason: collision with root package name */
    private dj f34600a = dj.f34409a;

    public final p a() {
        Bundle bundle = new Bundle();
        bundle.putSerializable("menu_to_open", this.f34600a);
        return new p(bw.class, bundle, 4);
    }

    public final void b(dj djVar) {
        x.f(djVar, "<set-?>");
        this.f34600a = djVar;
    }
}
