package com.waze.navigate;

import com.waze.hw;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class bp implements hw {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31129a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f31130b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f31131c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f31132d;

    public /* synthetic */ bp(Object obj, int i2, int i3, int i4) {
        this.f31132d = i4;
        this.f31131c = obj;
        this.f31129a = i2;
        this.f31130b = i3;
    }

    @Override // com.waze.hw
    public final Object a() {
        int i2 = this.f31132d;
        if (i2 == 0) {
            int i3 = this.f31130b;
            bt.showOnMap$lambda$0((bt) this.f31131c, this.f31129a, i3);
            return null;
        }
        int i4 = this.f31130b;
        if (i2 != 1) {
            eg.setNavigationStartPointLatLon$lambda$0((eg) this.f31131c, this.f31129a, i4);
            return null;
        }
        bt.moveFavoriteAddressItem$lambda$0((bt) this.f31131c, this.f31129a, i4);
        return null;
    }
}
