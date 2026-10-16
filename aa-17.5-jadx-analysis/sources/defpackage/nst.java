package defpackage;

import android.util.ArraySet;
import com.google.android.gms.car.display.CarDisplayId;
import com.google.android.gms.car.display.CarRegionGroup;
import com.google.android.gms.car.display.CarRegionId;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class nst implements nsx {
    final Set a = new ArraySet();

    @Override // defpackage.nsx
    public final yfq a(CarRegionId carRegionId) {
        nso nsoVarA = nsr.c().a(carRegionId.h);
        CarRegionGroup carRegionGroupQ = nsoVarA.q(carRegionId);
        if (carRegionGroupQ == null) {
            int i = yfq.d;
            return yls.a;
        }
        ArrayList arrayList = new ArrayList(((yby) nsoVarA.j).c(carRegionGroupQ));
        arrayList.remove(carRegionId);
        return yfq.o(arrayList);
    }

    @Override // defpackage.nsx
    public final boolean b(CarRegionId carRegionId) {
        CarRegionGroup carRegionGroupQ = nsr.c().a(carRegionId.h).q(carRegionId);
        return carRegionGroupQ == null || carRegionId.equals(carRegionGroupQ.c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.nsx
    public final void c(CarDisplayId carDisplayId) {
        Iterator it;
        Iterator it2 = this.a.iterator();
        while (it2.hasNext()) {
            mpd mpdVar = (mpd) ((wyd) it2.next()).a;
            if (mpdVar.m()) {
                ((ype) mpd.a.l().ai((char) 5154)).y("Layout changed start when inactive, ignoring changed display %s", carDisplayId);
            } else {
                mpc mpcVar = mpdVar.h;
                Map map = (Map) mpcVar.e();
                map.getClass();
                HashMap map2 = new HashMap(map);
                boolean z = false;
                for (Map.Entry entry : new HashMap(mpdVar.e).entrySet()) {
                    CarRegionId carRegionId = (CarRegionId) entry.getKey();
                    mpa mpaVar = (mpa) entry.getValue();
                    if (carRegionId.h.equals(carDisplayId)) {
                        yfq yfqVarA = lxw.E().a(carRegionId);
                        if (!carRegionId.equals(mpaVar.b)) {
                            it = it2;
                            if (!yfqVarA.contains(mpaVar.b)) {
                                ((ype) mpd.a.l().ai(5152)).M("Removing %s from %s due to group change", mpaVar.c, carRegionId);
                                mpaVar.c = null;
                                mpaVar.b = null;
                                z |= map2.remove(carRegionId) != null;
                            }
                            it2 = it;
                        } else if (lxw.E().b(carRegionId)) {
                            mqc mqcVar = (mqc) map2.get(carRegionId);
                            mqcVar.getClass();
                            int size = yfqVarA.size();
                            int i = 0;
                            while (i < size) {
                                CarRegionId carRegionId2 = (CarRegionId) yfqVarA.get(i);
                                mpa mpaVarA = mpdVar.a(carRegionId2);
                                Iterator it3 = it2;
                                if (!Objects.equals(mpaVar.c, mpaVarA.c)) {
                                    ((ype) mpd.a.l().ai(5153)).M("Setting %s to %s due to group change", carRegionId2, mpaVar.c);
                                    mpaVarA.c = mpaVar.c;
                                    mpaVarA.b = carRegionId;
                                    map2.put(carRegionId2, mqcVar);
                                    z = true;
                                }
                                i++;
                                it2 = it3;
                            }
                        }
                    }
                    it = it2;
                    it2 = it;
                }
                Iterator it4 = it2;
                if (z) {
                    mpcVar.m(map2);
                }
                it2 = it4;
            }
        }
    }

    @Override // defpackage.nsx
    public final boolean d(CarRegionId carRegionId) {
        if (carRegionId == null) {
            return false;
        }
        return carRegionId.a() || a(new CarRegionId(0, carRegionId.h)).contains(carRegionId);
    }

    @Override // defpackage.nsx
    public final void e(wyd wydVar) {
        this.a.add(wydVar);
    }

    @Override // defpackage.nsx
    public final void f(wyd wydVar) {
        this.a.remove(wydVar);
    }
}
