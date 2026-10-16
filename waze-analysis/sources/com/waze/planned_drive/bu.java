package com.waze.planned_drive;

import com.waze.navigate.AddressItem;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class bu {

    /* renamed from: a, reason: collision with root package name */
    private final AddressItem f33278a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f33279b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f33280c;

    public bu(AddressItem addressItem, boolean z, boolean z2) {
        this.f33278a = addressItem;
        this.f33279b = z;
        this.f33280c = z2;
    }

    public static /* synthetic */ bu d(bu buVar) {
        return new bu(buVar.f33278a, true, buVar.f33280c);
    }

    public final AddressItem a() {
        return this.f33278a;
    }

    public final boolean b() {
        return this.f33279b;
    }

    public final boolean c() {
        return this.f33280c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bu)) {
            return false;
        }
        bu buVar = (bu) obj;
        return h.g.b.x.n(this.f33278a, buVar.f33278a) && this.f33279b == buVar.f33279b && this.f33280c == buVar.f33280c;
    }

    public final int hashCode() {
        AddressItem addressItem = this.f33278a;
        return ((((addressItem == null ? 0 : addressItem.hashCode()) * 31) + a.a.a(this.f33279b)) * 31) + a.a.a(this.f33280c);
    }

    public final String toString() {
        return "OriginData(origin=" + this.f33278a + ", calculatedModelsForThisOrigin=" + this.f33279b + ", isSetManually=" + this.f33280c + ")";
    }
}
