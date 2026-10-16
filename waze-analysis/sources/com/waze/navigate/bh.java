package com.waze.navigate;

import com.waze.hw;
import com.waze.jni.protos.VenueData;
import com.waze.navigate.DriveToNativeManager;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class bh implements hw {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f31101a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f31102b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f31103c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f31104d;

    public /* synthetic */ bh(bt btVar, VenueData venueData, String str, int i2) {
        this.f31104d = i2;
        this.f31103c = btVar;
        this.f31102b = venueData;
        this.f31101a = str;
    }

    @Override // com.waze.hw
    public final Object a() {
        int i2 = this.f31104d;
        if (i2 == 0) {
            return bt.renameFavorite$lambda$0((bt) this.f31102b, (String) this.f31103c, this.f31101a);
        }
        if (i2 == 1) {
            return bt.getProductByVenue$lambda$0((bt) this.f31103c, (VenueData) this.f31102b, this.f31101a);
        }
        Object obj = this.f31102b;
        if (i2 != 2) {
            bt.updateEventVenue$lambda$0((bt) this.f31103c, this.f31101a, (VenueData) obj);
            return null;
        }
        bt.updateAddressItemAppData$lambda$0((bt) this.f31103c, this.f31101a, (DriveToNativeManager.AddressItemAppData) obj);
        return null;
    }

    public /* synthetic */ bh(bt btVar, String str, Object obj, int i2) {
        this.f31104d = i2;
        this.f31103c = btVar;
        this.f31101a = str;
        this.f31102b = obj;
    }

    public /* synthetic */ bh(bt btVar, String str, String str2, int i2) {
        this.f31104d = i2;
        this.f31102b = btVar;
        this.f31103c = str;
        this.f31101a = str2;
    }
}
