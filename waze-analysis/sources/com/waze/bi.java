package com.waze;

import com.waze.navigate.AddressItem;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class bi extends cf {

    /* renamed from: a, reason: collision with root package name */
    private final AddressItem f16800a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f16801b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bi(AddressItem addressItem, boolean z) {
        super(null, null);
        h.g.b.x.f(addressItem, "addressItem");
        this.f16800a = addressItem;
        this.f16801b = z;
    }

    public final AddressItem a() {
        return this.f16800a;
    }

    public final boolean b() {
        return this.f16801b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bi)) {
            return false;
        }
        bi biVar = (bi) obj;
        return h.g.b.x.n(this.f16800a, biVar.f16800a) && this.f16801b == biVar.f16801b;
    }

    public final int hashCode() {
        return (this.f16800a.hashCode() * 31) + a.a.a(this.f16801b);
    }

    public final String toString() {
        return "Navigate(addressItem=" + this.f16800a + ", skipTripOverview=" + this.f16801b + ")";
    }
}
