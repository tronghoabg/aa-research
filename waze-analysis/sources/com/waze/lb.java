package com.waze;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class lb implements la {

    /* renamed from: a, reason: collision with root package name */
    private final Map f25138a;

    public lb(ky kyVar) {
        h.g.b.x.f(kyVar, "servicesProvider");
        VenueServices venueServicesVenueProviderGetServices = kyVar.venueProviderGetServices();
        String[] strArr = venueServicesVenueProviderGetServices.ids;
        h.g.b.x.e(strArr, "ids");
        String[] strArr2 = venueServicesVenueProviderGetServices.names;
        h.g.b.x.e(strArr2, "names");
        List listAb = h.a.c.ab(strArr, strArr2);
        String[] strArr3 = venueServicesVenueProviderGetServices.icons;
        h.g.b.x.e(strArr3, "icons");
        String[] strArr4 = strArr3;
        h.g.b.x.f(listAb, "<this>");
        h.g.b.x.f(strArr4, "other");
        int length = strArr4.length;
        ArrayList arrayList = new ArrayList(Math.min(h.a.i.q(listAb, 10), length));
        int i2 = 0;
        for (Object obj : listAb) {
            if (i2 >= length) {
                break;
            }
            arrayList.add(new h.k(obj, strArr4[i2]));
            i2++;
        }
        ArrayList<h.k> arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList(h.a.i.q(arrayList2, 10));
        for (h.k kVar : arrayList2) {
            Object objC = ((h.k) kVar.c()).c();
            h.g.b.x.e(objC, "<get-first>(...)");
            Object objD = ((h.k) kVar.c()).d();
            h.g.b.x.e(objD, "<get-second>(...)");
            Object objD2 = kVar.d();
            h.g.b.x.e(objD2, "<get-second>(...)");
            arrayList3.add(new kz((String) objC, (String) objD, (String) objD2));
        }
        ArrayList arrayList4 = arrayList3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(h.k.n.h(h.a.r.a(h.a.i.q(arrayList4, 10)), 16));
        for (Object obj2 : arrayList4) {
            linkedHashMap.put(((kz) obj2).b(), obj2);
        }
        this.f25138a = linkedHashMap;
    }

    @Override // com.waze.la
    public final Map a() {
        return this.f25138a;
    }
}
