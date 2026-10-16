package com.waze.navigate;

import com.waze.hw;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class bk implements hw {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f31111a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f31112b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f31113c;

    public /* synthetic */ bk(Object obj, boolean z, int i2) {
        this.f31113c = i2;
        this.f31112b = obj;
        this.f31111a = z;
    }

    @Override // com.waze.hw
    public final Object a() {
        int i2 = this.f31113c;
        if (i2 == 0) {
            bt.setSkipConfirmWaypoint$lambda$0((bt) this.f31112b, this.f31111a);
            return null;
        }
        if (i2 == 1) {
            return bt.getRoutingId$lambda$0((bt) this.f31112b, this.f31111a);
        }
        if (i2 == 2) {
            bt.setStopPoint$lambda$0((bt) this.f31112b, this.f31111a);
            return null;
        }
        if (i2 == 3) {
            return bt.getFavorites$lambda$0((bt) this.f31112b, this.f31111a);
        }
        boolean z = this.f31111a;
        if (i2 != 4) {
            return da.getRouteArea$lambda$0((da) this.f31112b, z);
        }
        bt.reroute$lambda$0((bt) this.f31112b, z);
        return null;
    }
}
