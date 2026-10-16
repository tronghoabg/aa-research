package com.waze.app_nav.a;

import androidx.core.app.NotificationCompat;
import com.waze.trip_overview.bv;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class v extends com.waze.shared_infra.coordinators.s {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(bv bvVar, kotlinx.coroutines.af afVar) {
        super(bvVar, afVar);
        h.g.b.x.f(bvVar, NotificationCompat.CATEGORY_EVENT);
        h.g.b.x.f(afVar, "scope");
    }

    public final void a(String str, String str2, boolean z) {
        h.g.b.x.f(str, "model");
        H(new ac(str, str2, z));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(kotlinx.coroutines.af afVar) {
        super(ab.f15099a, afVar);
        h.g.b.x.f(afVar, "scope");
    }
}
