package com.waze.car_lib.r;

import androidx.lifecycle.MutableLiveData;
import com.waze.R;
import com.waze.car_lib.f.hm;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class cs implements kotlinx.coroutines.b.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ct f21227a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ hm f21228b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ com.waze.car_lib.screens.core.l f21229c;

    cs(ct ctVar, hm hmVar, com.waze.car_lib.screens.core.l lVar) {
        this.f21227a = ctVar;
        this.f21228b = hmVar;
        this.f21229c = lVar;
    }

    @Override // kotlinx.coroutines.b.l
    public final /* bridge */ /* synthetic */ Object emit(Object obj, h.c.e eVar) {
        ct ctVar = this.f21227a;
        MutableLiveData mutableLiveData = ctVar.f21231b;
        String strC = ctVar.f21230a.c(R.string.PRIVACY_SETTINGS_ACTIVITY_RECENT_DESTINATIONS_TITLE, new Object[0]);
        String strC2 = ctVar.f21230a.c(R.string.AAOS_PRIVACY_SETTINGS_RECENT_DESTINATION_MESSAGE, new Object[0]);
        String strC3 = ctVar.f21230a.c(R.string.AAOS_PRIVACY_SETTINGS_RECENT_DESTINATION_EMPTY_MESSAGE, new Object[0]);
        hm hmVar = this.f21228b;
        List<com.waze.av.b.aa> listK = com.waze.av.b.at.k(hmVar.a());
        ArrayList arrayList = new ArrayList();
        for (com.waze.av.b.aa aaVar : listK) {
            String strL = com.waze.nightmode.e.l(aaVar.a(), com.waze.shared_infra.o.b.a());
            com.waze.car_lib.p.di diVar = strL != null ? new com.waze.car_lib.p.di(strL, new com.waze.a.z(this.f21229c, hmVar, aaVar, 17, (int[]) null)) : null;
            if (diVar != null) {
                arrayList.add(diVar);
            }
        }
        mutableLiveData.setValue(new com.waze.car_lib.p.dj(strC, strC2, strC3, arrayList));
        return h.ab.f48028a;
    }
}
