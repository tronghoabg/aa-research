package com.waze.car_lib.r;

import androidx.lifecycle.ViewModel;
import com.waze.R;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class h extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    private final g f21663a;

    public h(com.waze.q.a aVar, com.waze.shared_infra.o.a aVar2) {
        h.g.b.x.f(aVar, "config");
        h.g.b.x.f(aVar2, "stringProvider");
        this.f21663a = new g(aVar2.c(R.string.CONSENT_BUMP_AA_SCAN, new Object[0]), aVar.a());
    }

    public final g a() {
        return this.f21663a;
    }
}
