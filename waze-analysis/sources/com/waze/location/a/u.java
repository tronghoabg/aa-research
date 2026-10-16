package com.waze.location.a;

import android.location.Location;
import j$.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class u implements kotlinx.coroutines.b.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ w f25218a;

    u(w wVar) {
        this.f25218a = wVar;
    }

    @Override // kotlinx.coroutines.b.l
    public final /* bridge */ /* synthetic */ Object emit(Object obj, h.c.e eVar) {
        s sVar = (s) obj;
        w wVar = this.f25218a;
        Instant instantA = wVar.f25222b.a();
        if (sVar instanceof q) {
            com.waze.location.x xVarA = ((q) sVar).a();
            Location location = new Location(xVarA.a());
            String provider = location.getProvider();
            if (provider == null) {
                provider = "";
            }
            w.g(wVar, location, new y(provider, xVarA.b()), instantA);
        } else if (!(sVar instanceof r)) {
            throw new h.i();
        }
        List listE = w.e(wVar, instantA);
        ArrayList arrayList = new ArrayList(h.a.i.q(listE, 10));
        Iterator it = listE.iterator();
        while (it.hasNext()) {
            arrayList.add(w.a(wVar, (a) it.next(), instantA));
        }
        wVar.f25230j = arrayList;
        return h.ab.f48028a;
    }
}
