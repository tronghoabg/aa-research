package com.waze.view.popups.a;

import com.waze.map.gu;
import com.waze.navigate.AddressItem;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class s extends u {

    /* renamed from: a, reason: collision with root package name */
    private final AddressItem f45224a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(AddressItem addressItem) {
        super(gu.f29184d);
        h.g.b.x.f(addressItem, "addressItem");
        this.f45224a = addressItem;
    }

    public final AddressItem b() {
        return this.f45224a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s) && h.g.b.x.n(this.f45224a, ((s) obj).f45224a);
    }

    public final int hashCode() {
        return this.f45224a.hashCode();
    }

    public final String toString() {
        return "ShowOnMapPopup(addressItem=" + this.f45224a + ")";
    }
}
