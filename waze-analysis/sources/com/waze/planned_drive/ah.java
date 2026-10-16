package com.waze.planned_drive;

import com.waze.navigate.AddressItem;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ah extends ao {

    /* renamed from: a, reason: collision with root package name */
    private final AddressItem f33190a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ah(AddressItem addressItem) {
        super(null);
        h.g.b.x.f(addressItem, "item");
        this.f33190a = addressItem;
    }

    public final AddressItem a() {
        return this.f33190a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ah) && h.g.b.x.n(this.f33190a, ((ah) obj).f33190a);
    }

    public final int hashCode() {
        return this.f33190a.hashCode();
    }

    public final String toString() {
        return "Address(item=" + this.f33190a + ")";
    }
}
