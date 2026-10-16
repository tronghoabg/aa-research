package com.waze.menus;

import com.waze.navigate.AddressItem;
import com.waze.navigate.location_preview.ba;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class b implements com.waze.sharedui.g.q {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AddressItem f29694a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ d f29695b;

    b(AddressItem addressItem, d dVar) {
        this.f29694a = addressItem;
        this.f29695b = dVar;
    }

    @Override // com.waze.sharedui.g.q
    public final void a(com.waze.sharedui.g.s sVar) {
        f fVarD = f.d(sVar.f39006a);
        if (fVarD != null) {
            String venueId = this.f29694a.getVenueId();
            int i2 = g.f29712a;
            com.waze.navigate.b.e eVar = com.waze.navigate.b.e.f31052a;
            int iOrdinal = fVarD.ordinal();
            if (iOrdinal == 3) {
                eVar = com.waze.navigate.b.e.f31058g;
            } else if (iOrdinal == 4) {
                eVar = com.waze.navigate.b.e.f31054c;
            } else if (iOrdinal == 5) {
                eVar = com.waze.navigate.b.e.f31057f;
            } else if (iOrdinal == 6) {
                eVar = com.waze.navigate.b.e.f31059h;
            } else if (iOrdinal == 7) {
                eVar = com.waze.navigate.b.e.f31053b;
            } else if (iOrdinal == 11) {
                eVar = com.waze.navigate.b.e.f31055d;
            } else if (iOrdinal == 14) {
                eVar = com.waze.navigate.b.e.f31056e;
            }
            ba.e().e(eVar, venueId);
        }
        this.f29695b.b(this.f29694a, fVarD);
    }
}
