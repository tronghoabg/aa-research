package com.waze.main_screen.q.a;

import com.waze.main.navigate.LocationData;
import com.waze.navigate.AddressItem;
import com.waze.navigate.DriveToNativeManager;
import com.waze.reports.ed;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final LocationData f27375a;

    /* renamed from: b, reason: collision with root package name */
    private final String f27376b;

    /* renamed from: c, reason: collision with root package name */
    private final ed f27377c;

    /* renamed from: d, reason: collision with root package name */
    private final DriveToNativeManager.AddressItemAppData f27378d;

    /* renamed from: e, reason: collision with root package name */
    private final AddressItem f27379e;

    public a(LocationData locationData, String str, ed edVar, DriveToNativeManager.AddressItemAppData addressItemAppData, AddressItem addressItem) {
        this.f27375a = locationData;
        this.f27376b = str;
        this.f27377c = edVar;
        this.f27378d = addressItemAppData;
        this.f27379e = addressItem;
    }

    public static /* synthetic */ a f(a aVar, LocationData locationData, String str, ed edVar, DriveToNativeManager.AddressItemAppData addressItemAppData, AddressItem addressItem, int i2) {
        if ((i2 & 1) != 0) {
            locationData = aVar.f27375a;
        }
        LocationData locationData2 = locationData;
        if ((i2 & 2) != 0) {
            str = aVar.f27376b;
        }
        String str2 = str;
        if ((i2 & 4) != 0) {
            edVar = aVar.f27377c;
        }
        ed edVar2 = edVar;
        if ((i2 & 8) != 0) {
            addressItemAppData = aVar.f27378d;
        }
        DriveToNativeManager.AddressItemAppData addressItemAppData2 = addressItemAppData;
        if ((i2 & 16) != 0) {
            addressItem = aVar.f27379e;
        }
        return new a(locationData2, str2, edVar2, addressItemAppData2, addressItem);
    }

    public final LocationData a() {
        return this.f27375a;
    }

    public final AddressItem b() {
        return this.f27379e;
    }

    public final DriveToNativeManager.AddressItemAppData c() {
        return this.f27378d;
    }

    public final ed d() {
        return this.f27377c;
    }

    public final String e() {
        return this.f27376b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return x.n(this.f27375a, aVar.f27375a) && x.n(this.f27376b, aVar.f27376b) && x.n(this.f27377c, aVar.f27377c) && x.n(this.f27378d, aVar.f27378d) && x.n(this.f27379e, aVar.f27379e);
    }

    public final int hashCode() {
        LocationData locationData = this.f27375a;
        int iHashCode = locationData == null ? 0 : locationData.hashCode();
        String str = this.f27376b;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        int i2 = iHashCode * 31;
        ed edVar = this.f27377c;
        int iHashCode3 = (((i2 + iHashCode2) * 31) + (edVar == null ? 0 : edVar.hashCode())) * 31;
        DriveToNativeManager.AddressItemAppData addressItemAppData = this.f27378d;
        int iHashCode4 = (iHashCode3 + (addressItemAppData == null ? 0 : addressItemAppData.hashCode())) * 31;
        AddressItem addressItem = this.f27379e;
        return iHashCode4 + (addressItem != null ? addressItem.hashCode() : 0);
    }

    public final String toString() {
        return "Data(locationData=" + this.f27375a + ", venueId=" + this.f27376b + ", venueWrapper=" + this.f27377c + ", addressAppData=" + this.f27378d + ", destAddressItem=" + this.f27379e + ")";
    }
}
