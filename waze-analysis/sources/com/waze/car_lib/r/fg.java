package com.waze.car_lib.r;

import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.LiveData;
import com.waze.R;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class fg {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.o.a f21635a;

    /* renamed from: b, reason: collision with root package name */
    private final kotlinx.coroutines.b.bn f21636b;

    public fg(com.waze.shared_infra.o.a aVar) {
        h.g.b.x.f(aVar, "stringProvider");
        this.f21635a = aVar;
        this.f21636b = kotlinx.coroutines.b.ck.b(false);
    }

    public final LiveData a(kotlinx.coroutines.af afVar) {
        h.g.b.x.f(afVar, "scope");
        com.waze.shared_infra.o.a aVar = this.f21635a;
        kotlinx.coroutines.b.bn bnVarB = kotlinx.coroutines.b.ck.b(new fh(new com.waze.car_lib.p.ak(aVar.c(R.string.AAOS_TOLL_POPUP_TITLE, new Object[0]), aVar.c(R.string.AAOS_TOLL_POPUP_MESSAGE, new Object[0]), com.waze.car_lib.p.ah.f20543a, new com.waze.car_lib.p.af(aVar.c(R.string.AAOS_TOLL_POPUP_BUTTON, new Object[0]), true, false), null, Integer.valueOf(R.drawable.icon_outline_routes_30px), 16), false));
        kotlinx.coroutines.aj.z(afVar, null, null, new as(this, bnVarB, (h.c.e) null, 6), 3);
        return FlowLiveDataConversions.asLiveData$default(bnVarB, (h.c.j) null, 0L, 3, (Object) null);
    }

    public final void c(boolean z) {
        this.f21636b.e(Boolean.valueOf(z));
    }
}
