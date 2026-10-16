package com.waze.search.v2;

import com.waze.navigate.AddressItem;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class bw implements h.g.a.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f36205a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f36206b;

    public /* synthetic */ bw(Object obj, int i2) {
        this.f36206b = i2;
        this.f36205a = obj;
    }

    @Override // h.g.a.l
    public final Object invoke(Object obj) {
        int i2 = this.f36206b;
        if (i2 == 0) {
            return ck.r((ck) this.f36205a, (com.waze.map.b.bi) obj);
        }
        if (i2 == 1) {
            return ck.s((ck) this.f36205a, (com.waze.map.b.bg) obj);
        }
        if (i2 != 2) {
            return fi.u((fi) this.f36205a, (String) obj);
        }
        return fi.v((fi) this.f36205a, (AddressItem) obj);
    }
}
