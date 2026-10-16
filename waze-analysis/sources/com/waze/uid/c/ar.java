package com.waze.uid.c;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.focus.FocusManager;
import com.waze.jni.protos.VenueData;
import com.waze.navigate.AddressItem;
import com.waze.navigate.cl;
import com.waze.reports.ed;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class ar implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f44224a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f44225b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f44226c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f44227d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f44228e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ int f44229f;

    public /* synthetic */ ar(com.waze.navigate.location_preview.ay ayVar, AddressItem addressItem, cl clVar, com.waze.navigate.location_preview.ai aiVar, kotlinx.coroutines.b.bm bmVar, int i2) {
        this.f44229f = i2;
        this.f44226c = ayVar;
        this.f44227d = addressItem;
        this.f44228e = clVar;
        this.f44225b = aiVar;
        this.f44224a = bmVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.runtime.MutableState, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlinx.coroutines.b.bm] */
    /* JADX WARN: Type inference failed for: r1v0, types: [androidx.compose.runtime.MutableState, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.waze.navigate.cl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [h.g.a.p, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [androidx.compose.ui.focus.FocusManager, java.lang.Object] */
    @Override // h.g.a.a
    public final Object invoke() {
        if (this.f44229f == 0) {
            ?? r0 = this.f44228e;
            ?? r1 = this.f44227d;
            return com.waze.ui.u.g.f((h.n.l) this.f44224a, this.f44225b, this.f44226c, r1, r0);
        }
        String strY = ((com.waze.navigate.location_preview.ay) this.f44226c).y();
        if (strY != null) {
            ?? r02 = this.f44224a;
            Object obj = this.f44225b;
            ?? r12 = this.f44228e;
            AddressItem addressItem = (AddressItem) this.f44227d;
            ed venueData = addressItem.getVenueData();
            com.waze.navigate.location_preview.v vVar = new com.waze.navigate.location_preview.v((com.waze.navigate.location_preview.ai) obj, r02, 1);
            if (venueData != null) {
                VenueData venueDataH = venueData.h();
                h.g.b.x.e(venueDataH, "getProto(...)");
                r12.updateEventVenue(strY, venueDataH, vVar);
            } else {
                long longitudeInt = addressItem.getLongitudeInt();
                long latitudeInt = addressItem.getLatitudeInt();
                String address = addressItem.getAddress();
                h.g.b.x.e(address, "getAddress(...)");
                r12.updateEventPlace(strY, longitudeInt, latitudeInt, address, vVar);
            }
        }
        return h.ab.f48028a;
    }

    public /* synthetic */ ar(h.n.l lVar, FocusManager focusManager, h.g.a.p pVar, MutableState mutableState, MutableState mutableState2, int i2) {
        this.f44229f = i2;
        this.f44224a = lVar;
        this.f44225b = focusManager;
        this.f44226c = pVar;
        this.f44227d = mutableState;
        this.f44228e = mutableState2;
    }
}
